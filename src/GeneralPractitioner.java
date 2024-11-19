// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    // 额外的实例变量
    private String clinicName;

    // 默认构造方法
    public GeneralPractitioner() {
        super(); // 调用基类的默认构造方法
        this.clinicName = "Unknown Clinic";
    }

    // 参数化构造方法
    public GeneralPractitioner(int id, String name, String specialization, String clinicName) {
        super(id, name, specialization); // 初始化基类的实例变量
        this.clinicName = clinicName;
    }

    // 打印详情的方法
    @Override
    public void printDetails() {
        System.out.println("Health Professional Details:");
        super.printDetails(); // 打印基类的实例变量
        System.out.println("Clinic Name: " + clinicName);
        System.out.println("Specialization Type: General Practitioner");
    }

    // Getter 和 Setter
    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }
}
