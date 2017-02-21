package sample;

/**
 * Created by jerieshasmith on 2/20/17.
 */
public class Contact {
    String name;
    String phone;
    String email;



    public Contact(String name, String phone, String email){

        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
