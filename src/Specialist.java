// Specialist.java
public class Specialist extends HealthProfessional {
    // 额外的实例变量
    private String fieldOfSpecialization;

    // 默认构造方法
    public Specialist() {
        super(); // 调用基类的默认构造方法
        this.fieldOfSpecialization = "General";
    }

    // 参数化构造方法
    public Specialist(int id, String name, String specialization, String fieldOfSpecialization) {
        super(id, name, specialization); // 初始化基类的实例变量
        this.fieldOfSpecialization = fieldOfSpecialization;
    }

    // 打印详情的方法
    @Override
    public void printDetails() {
        System.out.println("Health Professional Details:");
        super.printDetails(); // 打印基类的实例变量
        System.out.println("Field of Specialization: " + fieldOfSpecialization);
        System.out.println("Specialization Type: Specialist");
    }

    // Getter 和 Setter
    public String getFieldOfSpecialization() {
        return fieldOfSpecialization;
    }

    public void setFieldOfSpecialization(String fieldOfSpecialization) {
        this.fieldOfSpecialization = fieldOfSpecialization;
    }
}
