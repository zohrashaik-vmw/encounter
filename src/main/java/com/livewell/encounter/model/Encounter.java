package com.livewell.encounter.model;

import javax.persistence.*;

@Entity
public class Encounter {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String patientId;
    private String practitionerId;

    public Encounter() {
    }

    public Encounter(String patientId, String practitionerId) {
        this.patientId = patientId;
        this.practitionerId = practitionerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPractitionerId() {
        return practitionerId;
    }

    public void setPractitionerId(String practitionerId) {
        this.practitionerId = practitionerId;
    }

    @Override
    public String toString() {
        return "Encounter{" +
                "id=" + id +
                ", patientId='" + patientId + '\'' +
                ", practitionerId='" + practitionerId + '\'' +
                '}';
    }
}

