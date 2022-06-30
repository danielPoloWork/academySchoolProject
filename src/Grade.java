public class Grade {

  private final GradeValueEnum value;
  private final Student student;
  private final Subject subject;

  public Grade(GradeValueEnum valueArg, Student studentArg, Subject subjectArg) {
    this.value = valueArg;
    this.student = studentArg;
    this.subject = subjectArg;
  }

  public GradeValueEnum getValue() {
    return this.value;
  }

  public Student getStudent() {
    return this.student;
  }

  public Subject getSubject() {
    return this.subject;
  }
}
