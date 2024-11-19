// AssignmentOne.java
import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<HealthProfessional> healthProfessionals = new ArrayList<>();

        healthProfessionals.add(new GeneralPractitioner(1, "Dr. Zhang Wei", "Family Medicine", "Nangang Clinic"));
        healthProfessionals.add(new GeneralPractitioner(2, "Dr. Li Na", "Pediatrics", "Seaside Clinic"));
        healthProfessionals.add(new GeneralPractitioner(3, "Dr. Wang Qiang", "Internal Medicine", "City Center Clinic"));

        healthProfessionals.add(new Specialist(4, "Dr. Zhao Min", "Cardiology", "Cardiology Department"));
        healthProfessionals.add(new Specialist(5, "Dr. Liu Yang", "Dermatology", "Dermatology Department"));

        for (HealthProfessional hp : healthProfessionals) {
            hp.printDetails();
            System.out.println();
        }

        System.out.println("------------------------------");

        createAppointment("Li Hua", "1234567890", "08:00", healthProfessionals.get(0));
        createAppointment("Wang Fang", "0987654321", "09:30", healthProfessionals.get(1));

        createAppointment("Zhao Qiang", "1122334455", "10:00", healthProfessionals.get(3));
        createAppointment("Liu Li", "2233445566", "11:30", healthProfessionals.get(4));

        printExistingAppointments();

        cancelBooking("0987654321");

        printExistingAppointments();

        System.out.println("------------------------------");
    }

    public static void createAppointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        if (patientName == null || patientName.isEmpty()) {
            System.out.println("Appointment creation failed: Patient name not provided.");
            return;
        }
        if (patientMobile == null || patientMobile.isEmpty()) {
            System.out.println("Appointment creation failed: Patient mobile number not provided.");
            return;
        }
        if (preferredTimeSlot == null || preferredTimeSlot.isEmpty()) {
            System.out.println("Appointment creation failed: Preferred time slot not provided.");
            return;
        }
        if (selectedDoctor == null) {
            System.out.println("Appointment creation failed: No doctor selected.");
            return;
        }

        Appointment newAppointment = new Appointment(patientName, patientMobile, preferredTimeSlot, selectedDoctor);
        appointments.add(newAppointment);
        System.out.println("Appointment successfully created:");
        newAppointment.printDetails();
        System.out.println();
    }

    public static void printExistingAppointments() {
        System.out.println("Existing Appointment List:");
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appt : appointments) {
                appt.printDetails();
                System.out.println();
            }
        }
    }

    public static void cancelBooking(String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                appointments.remove(i);
                System.out.println("Appointment canceled, patient mobile number: " + patientMobile);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Cancellation failed: No appointment found for mobile number " + patientMobile + ".");
        }
        System.out.println();
    }
}
