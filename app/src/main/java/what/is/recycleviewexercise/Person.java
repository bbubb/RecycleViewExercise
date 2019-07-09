package what.is.recycleviewexercise;

public class Person {

    private String name, phone, picture;

    public Person() {
    }

    public Person(String name, String phone, String picture) {
        this.name = name;
        this.phone = phone;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
