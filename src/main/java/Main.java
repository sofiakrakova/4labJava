import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        String separator = ";";
        try {
            CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Sofia\\Desktop\\ВГУ\\3 курс\\2 семестр\\Java\\4labJava\\src\\main\\resources\\foreign_names.csv"));
            String[] nextLine;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null)
            {
                if (nextLine != null) {
                        nextLine = nextLine[0].split(separator);
                        if (nextLine.length > 2)
                        {
                            Person temp = new Person(Long.parseLong(nextLine[0]), nextLine[1], nextLine[2],nextLine[3],Double.parseDouble(nextLine[5]), new Department(nextLine[4].charAt(0) - 'A', nextLine[4]));
                            persons.add(temp);
                        }
                }
            }
            for (Person temp: persons)
            {
                System.out.println("id = "+ temp.getId() + ", lastName=" + temp.getLastName() + ", gender=" + temp.getGender() + ", birthday=" + temp.getBirthday() + ", department=" + temp.getDepartment().getName()  + ", salary=" + temp.getSalary());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}