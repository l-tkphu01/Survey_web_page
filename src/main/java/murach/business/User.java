package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String heardFrom;
    private boolean wantsUpdates;
    private boolean emailOK;
    private String contactVia;

    public User() {}

    public User(String firstName, String lastName, String email,
                String dob, String heardFrom, boolean wantsUpdates,
                boolean emailOK, String contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.emailOK = emailOK;
        this.contactVia = contactVia;
    }

    // Getter & Setter
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getHeardFrom() { return heardFrom; }
    public void setHeardFrom(String heardFrom) { this.heardFrom = heardFrom; }

    public boolean isWantsUpdates() { return wantsUpdates; }
    public void setWantsUpdates(boolean wantsUpdates) { this.wantsUpdates = wantsUpdates; }

    public boolean isEmailOK() { return emailOK; }
    public void setEmailOK(boolean emailOK) { this.emailOK = emailOK; }

    public String getContactVia() { return contactVia; }
    public void setContactVia(String contactVia) { this.contactVia = contactVia; }
}
