package serverwofacade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tleku
 */
public class FacadeScheduleServer {
    public void startServer() {
        ScheduleServer startObj = new ScheduleServer();
        startObj.startBooting();
	startObj.readSystemConfigFile();
	startObj.init();
	startObj.initializeContext();
	startObj.initializeListeners();
	startObj.createSystemObjects();
	System.out.println("Start working......");
    }
    
    public void shutDownServer() {
        ScheduleServer shutDownObj = new ScheduleServer();
        System.out.println("After work done.........");
	shutDownObj.releaseProcesses();
	shutDownObj.destory();
	shutDownObj.destroySystemObjects();
	shutDownObj.destoryListeners();
	shutDownObj.destoryContext();
	shutDownObj.shutdown();
    }
}
