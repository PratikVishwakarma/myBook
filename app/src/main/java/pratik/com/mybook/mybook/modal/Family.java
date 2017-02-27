package pratik.com.mybook.mybook.modal;

/**
 * Created by prati on 26-Feb-17.
 */

public class Family {

private String name, address;
private int age, image;
    public Family(String name, int age, String address, int image) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.image = image;
    }

    public Family() {
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
