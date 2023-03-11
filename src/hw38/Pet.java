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

  private EnumKind kind;
  String name;
  String birthday = null;
  double weight = 0;

  //статический метод для создания животного при прочтении данных из строки
  // "dog,кличка", "cat,кличка,вес", "turtle,кличка,вес,дата рождения".

  public Pet(EnumKind kind, String name, String birthday, double wegth) {
    this.kind = kind;
    this.name = name;
    this.birthday = birthday;
    this.weight = weight;
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

  public void getWeigth() {
    return weight;
  }
}

