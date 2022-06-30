import java.util.Map;

public class Student {

  private final String taxCode;
  private final String name;
  private final String surname;
  private final String birthDate;

  private Map<Subject, Grade> subjectGradeMap;

  public Student(String taxCodeArg, String nameArg, String surnameArg, String birthDateArg,
      Map<Subject, Grade> subjectGradeMapArg) {
    this.taxCode = taxCodeArg;
    this.name = nameArg;
    this.surname = surnameArg;
    this.birthDate = birthDateArg;
    this.subjectGradeMap = subjectGradeMapArg;
  }


  public String getTaxCode() {
    return this.taxCode;
  }

  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return this.surname;
  }

  public String getBirthDate() {
    return this.birthDate;
  }

  public Map<Subject, Grade> getSubjectGradeMap() {
    return this.subjectGradeMap;
  }

  public void setSubjectGradeMap(Map<Subject, Grade> subjectGradeMap) {
    this.subjectGradeMap = subjectGradeMap;
  }
}
