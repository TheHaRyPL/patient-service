package pl.wsiiz.patientservice.dto;

import java.util.List;

public class Patient extends Person {
    private int ID;
    private Person familyDoctor;
    private List<Prescription> prescriptions;
    private List<Drug> drugs;
    private List<Examination> examinations;
    private List<Referral> referrals;

    public Patient(String pesel) {
        super(pesel);
    }

    public Patient(String name, String lastName, String pesel) {
        super(name, lastName, pesel);
    }
}