public class Teacher {

  private final String name;
  private final String surname;

  public Teacher(String nameArg, String surnameArg) {
    this.name = nameArg;
    this.surname = surnameArg;
  }

  public String selectName() {
    return this.name;
  }

  public String selectSurname() {
    return this.surname;
  }
}
