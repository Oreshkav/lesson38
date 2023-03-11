package hw38;

public class Pet {
  //Создать класс Pet (домашнее животное). В классе должны быть:
  //enum Kind для вида животного (DOG, CAT, OTHER);
  //поля:
  //"вид животного" (тип Kind),
  //"кличка" (тип String),
  //"дата рождения" (тип String),
  //вес (тип double);
  private EnumKind kind;
  String name;
  String birthday;
  double weight;

  //конструктор, сеттеры, геттеры;
  public Pet(EnumKind kind, String name, String bithday, double wegth) {
    this.kind = kind;
    this.name = name;
    this.birthday = bithday;
    this.weight = weight;
  }

  //статический метод для создания животного при прочтении данных из строки
  // "dog,кличка", "cat,кличка,вес", "turtle,кличка,вес,дата рождения".

public static void addAnimal(){

}


}
