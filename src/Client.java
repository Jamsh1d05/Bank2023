import java.util.ArrayList;
public class Client{
    private int cash;
    static boolean logged = false;
    private String name;
    private String surname;
    private int id;
    private int age;
    private static int idCounter = 1;
    private String gender;
    private String userName;
    private String password;

    public Client(){
        id = idCounter++;
    }

    public Client(String name, String surname, int age, String gender ,String userName, String password, int money ) {
        this();
        setName(name);
        setSurname(surname);
        setUserName(userName);
        setPassword(password);
        setAge(age);
        setGender(gender);
        setMoney(money);
    }

    public int getMoney() {
        return cash;
    }

    public void setMoney(int money) {
        this.cash = money;
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
        return id+". Client " + name + " " + surname + ". Cash: " + cash;
    }

    public static boolean login(ArrayList<Client> clients, String userName, String password) {

        for (Client e : clients) {
            if (e.getUserName().equals(userName) && e.getPassword().equals(password)) {
                System.out.println("You logged in!");
                logged = true;
                return true;
            }
        }
        System.out.println("Username or password is incorrect!");
        return false;
    }

    public void makeTransaction(Client client, int transfer){
        if(transfer < cash){
            this.cash -= transfer;
            client.cash += transfer;
        }
        else{
            System.out.println("You don't have enough money");
        }
    }


}