/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cxplonka.feature.service.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author cplonka
 */
@Path("/message")
public class MessageResource {

    @GET
    @Path("/hello")
    public String whatever() {
        return "hello!";
    }
}
