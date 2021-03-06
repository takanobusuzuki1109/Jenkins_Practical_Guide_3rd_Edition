package jp.gihyo.jenkinsbook.dto;

import java.io.Serializable;

/**
 * DTO class for SampleServlet.
 */
public class SampleDTO implements Serializable {
    /**
     * First name of the user.
     */
    private String firstName;
    /**
     * Last name of the user.
     */
    private String lastName;
    /**
     * Greeting message.
     */
    private String message;

    /**
     * Store the user name.
     * @param firstNameLocal first name of the user
     * @param lastNameLocal last name of the user
     */
    public SampleDTO(final String firstNameLocal, final String lastNameLocal) {
        this.setFirstName(firstNameLocal);
        this.setLastName(lastNameLocal);
        this.setMessage("Hello");
    }

    /**
     * Get first name of the user.
     * @return first name of the user
     */
    public final String getFirstName() {
        return this.firstName;
    }

    /**
     * Get last name of the user.
     * @return last name of the user
     */
    public final String getLastName() {
        return this.lastName;
    }

    /**
     * Get greeting message.
     * @return greeting message
     */
    public final String getMessage() {
        return this.message;
    }

    /**
     * Set first name of the user.
     * @param firstNameLocal first name of the user
     */
    public final void setFirstName(final String firstNameLocal) {
        this.firstName = firstNameLocal;
    }

    /**
     * Set last name of the user.
     * @param lastNameLocal last name of the user
     */
    public final void setLastName(final String lastNameLocal) {
        this.lastName = lastNameLocal;
    }

    /**
     * Set greeting message.
     * @param msg greeting message
     */
    public final void setMessage(final String msg) {
        this.message = msg;
    }
}
