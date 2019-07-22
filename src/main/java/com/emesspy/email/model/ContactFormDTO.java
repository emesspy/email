package com.emesspy.email.model;


public class ContactFormDTO {

    public String name;

    public String email;

    public String message;


    public ContactFormDTO() {

    }


    @Override
    public String toString() {

        return "ContactFormDTO{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", message='" + message + '\'' + '}';
    }
}
