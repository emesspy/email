package com.emesspy.email.service;


import com.emesspy.email.model.ContactFormDTO;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class SenderService {

    public String echo(ContactFormDTO contactForm ) {

        return contactForm.toString();
    }
}
