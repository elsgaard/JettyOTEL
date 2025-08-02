package org.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class StartJettyWebserver {

    public static void main(String[] args) throws Exception {
        var server = new Server(8082);

        var handler = new ServletHandler();
        server.setHandler(handler);

        handler.addServletWithMapping(ExampleServlet.class, "/*");
        server.start();
        server.join();

    }

}