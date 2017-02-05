/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cxplonka.feature.service.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author cplonka
 */
@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @GET
    public List<Customer> getAll() {
        return new ArrayList<>();
    }

    @GET
    @Path("{id}")
    public Response get(@PathParam("id") final long id) {
        return Response.ok().entity(new Customer("name", "adress", (int) id)).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") final long id, @Valid final Customer customer) throws Exception {
        return Response.noContent().build();
    }

    @DELETE
    @Path("{id}")
    public Response createCustomer(@PathParam("id") long id) {
        return Response.created(URI.create("/customer/" + id)).build();
    }
}
