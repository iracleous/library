package gr.athtech.library.model;



import java.util.Date;


public class User  {
    private String name;
    private Date birthDate;


    public User(){
       birthDate = new Date();
    }

    public User(String name, Date date){
        this.name = name;
        this.birthDate = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
