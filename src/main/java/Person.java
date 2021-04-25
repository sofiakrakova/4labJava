import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private long id;
    private String lastName;
    private String gender;
    private Date birthday;
    private double salary;
    private Department department;
    public Person(long id, String lastName, String gender, String birthday, double salary, Department department) throws ParseException {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = new SimpleDateFormat("dd.MM.yyyy").parse(birthday);
        this.salary = salary;
        this.department = department;
    }
    long getId(){
        return id;
    }
    String getLastName(){
        return lastName;
    }
    String getGender(){
        return gender;
    }
    Department getDepartment(){
        return department;
    }
    double getSalary(){
        return salary;
    }
    Date getBirthday(){
        return birthday;
    }
}
