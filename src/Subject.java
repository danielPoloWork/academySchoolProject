import java.util.Map;

public class Subject {

  private final SubjectTypeEnum type;
  private final Teacher teacher;
  private final Map<String, Student> studentMap;

  public Subject(SubjectTypeEnum typeArg, Teacher teacherArg, Map<String, Student> studentMapArg) {
    this.type = typeArg;
    this.teacher = teacherArg;
    this.studentMap = studentMapArg;
  }

  public SubjectTypeEnum getType() {
    return this.type;
  }

  public Teacher getTeacher() {
    return this.teacher;
  }

  public Map<String, Student> getStudentMap() {
    return this.studentMap;
  }
}