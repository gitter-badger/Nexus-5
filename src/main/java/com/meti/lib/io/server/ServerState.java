package com.meti.lib.io.server;

import com.meti.lib.util.Console;

import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 12/18/2017
 */
public class ServerState {
    private final ExecutorService service = Executors.newCachedThreadPool();
    private final ServerSocket serverSocket;
    private final Console console;

    public ServerState(ServerSocket serverSocket, Console console) {
        this.serverSocket = serverSocket;
        this.console = console;
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public ExecutorService getService() {
        return service;
    }

    public Console getConsole() {
        return console;
    }
}