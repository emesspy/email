package com.emesspy.email;


import com.emesspy.email.model.ContactFormDTO;
import com.emesspy.email.service.SenderService;
import io.quarkus.mailer.Mailer;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path( "/email" )
public class EmailResource {

    @Inject
    SenderService senderService;

    @Inject
    Mailer mailer;


    @GET
    @Produces( MediaType.TEXT_PLAIN )
    public String hello() {

        return "hello";
    }


    @POST
    @Produces( MediaType.TEXT_PLAIN )
    @Consumes( MediaType.APPLICATION_JSON )
    @Path( "/json" )
    public String json( ContactFormDTO contactForm ) {

        return senderService.echo( contactForm );
    }


    @POST
    @Produces( MediaType.TEXT_PLAIN )
    @Consumes( MediaType.APPLICATION_JSON )
    @Path( "/contact-us" )
    public String contactUs( ContactFormDTO contactForm ) {

        return senderService.echo( contactForm );
    }
}