package hw38;

public class Pet {
  //Создать класс Pet (домашнее животное). В классе должны быть:
  //enum Kind для вида животного (DOG, CAT, OTHER);
  //поля:
  //"вид животного" (тип Kind),
  //"кличка" (тип String),
  //"дата рождения" (тип String),
  //вес (тип double);
  //конструктор, сеттеры, геттеры;
  //статический метод для создания животного при прочтении данных из строки
  // "dog,кличка", "cat,кличка,вес", "turtle,кличка,вес,дата рождения".

  final private static char SEP = ',';

  private EnumKind kind;
  private String name;
  private String birthday = null;
  private double weight = 0;

  public Pet(EnumKind kind, String name, String birthday, double weigth) {
    this.kind = kind;
    this.name = name;
    this.birthday = birthday;
    this.weight = weigth;
  }

  public Pet(EnumKind kind, String name, String birthday) {
    this.kind = kind;
    this.name = name;
    this.birthday = birthday;
  }

  public Pet(EnumKind kind, String name) {
    this.kind = kind;
    this.name = name;
  }

  public void setName(EnumKind kind) {
    this.kind = kind;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBithday(String birthday) {
    this.birthday = birthday;
  }

  public void setWeigth(double weigth) {
    this.weight = weigth;
  }

  public EnumKind getKind() {
    return kind;
  }

  public String getName() {
    return name;
  }

  public String getBirthday() {
    return birthday;
  }

  public double getWeigth() {
    return weight;
  }

  public static Pet parsePet(String line) {

    int sepIndex = line.indexOf(SEP);
    if (sepIndex == -1) {
//      return null;
    }
    int counterSep = 0;
    while (sepIndex != -1 ) {
      String subLine = line.substring(sepIndex + 1);
      sepIndex = subLine.indexOf(SEP);
      ++counterSep;
    }
    sepIndex = line.indexOf(SEP);

    if (counterSep == 1) {
      EnumKind kind = EnumKind.valueOf(line.substring(0, sepIndex).toUpperCase());

      String name = line.substring(sepIndex + 1);
//      String subLine = line.substring(sepIndex + 1);
//      sepIndex = subLine.indexOf(SEP);
//      String name = subLine.substring(0, sepIndex);

      Pet pet = new Pet(kind, name);
      return pet;
    }

    if (counterSep == 2) {
      EnumKind kind = EnumKind.valueOf(line.substring(0, sepIndex).toUpperCase());

      String subLine = line.substring(sepIndex + 1);
      sepIndex = subLine.indexOf(SEP);
      String name = subLine;

      subLine = line.substring(sepIndex + 1);
//      sepIndex = subLine.indexOf(SEP);
      String bithday = subLine.substring(0, sepIndex);

      Pet pet = new Pet(kind, name, bithday, 0);
      return pet;
    }

    if (counterSep == 3) {
      EnumKind kind = EnumKind.valueOf(line.substring(0, sepIndex).toUpperCase());

      String subLine = line.substring(sepIndex + 1);
      sepIndex = subLine.indexOf(SEP);
      String name = subLine.substring(0, sepIndex);

      subLine = line.substring(sepIndex + 1);
      sepIndex = subLine.indexOf(SEP);
      String bithday = subLine.substring(0, sepIndex);

      subLine = line.substring(sepIndex + 1);
//      sepIndex = subLine.indexOf(SEP);
      double weigth = Double.parseDouble(subLine);
      Pet pet = new Pet(kind, name, bithday, weigth);
      return pet;
    }
    return null;


  }

  @Override
  public String toString() {
    return "Pet{" +
        "kind=" + kind +
        ", name='" + name + '\'' +
        ", birthday='" + birthday + '\'' +
        ", weight=" + weight +
        '}';
  }
}

