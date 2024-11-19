// Patient.java
public class Patient {
    private String name;
    private String mobile;

    // 默认构造方法
    public Patient() {
        this.name = "Unknown";
        this.mobile = "0000000000";
    }

    // 参数化构造方法
    public Patient(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    // 打印详情的方法
    public void printDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Mobile: " + mobile);
    }

    // Getters 和 Setters
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
