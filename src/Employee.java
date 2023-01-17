import java.util.ArrayList;

public class Employee {
 static boolean logged = false;
 private String name;
 private String surname;
 private int age;
 private int id;
 private static int idCounter = 1;
 private String gender;
 private String userName;
 private String password;

 public Employee(){
  id = idCounter++;
 }

 public Employee(String name, String surname, int age, String gender ,String userName, String password) {
 this();
  setName(name);
  setSurname(surname);
 setUserName(userName);
 setPassword(password);
setAge(age);
setGender(gender);
 }
 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }


public String getSurname(){
  return surname;
}

public void setSurname(String surname){
  this.surname= surname;
}

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public String getGender() {
  return gender;
 }

 public void setGender(String gender) {
  this.gender = gender;
 }

 public String getUserName(){
  return userName;
}
public void setUserName(String userName){
  this.userName=userName;
}

 public String getPassword() {
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }


@Override
public String toString() {
 return "Employee [name=" + name + ", surname=" + surname + ", userName=" + userName + "]";
}

 public static boolean login(ArrayList<Employee> employees, String userName, String password) {

  for (Employee e : employees) {
   if (e.getUserName().equals(userName) && e.getPassword().equals(password)) {
    System.out.println("Accessed!");
    logged = true;
    return true;
   }
  }
  System.out.println("Access denied!");
  return false;
 }

}
