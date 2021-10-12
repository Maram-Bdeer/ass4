package edu.najah.it.capp.asd;
import edu.najah.it.capp.asd.impl.Ssh;
import edu.najah.it.capp.asd.intf.Protocol;

public class ProtocoleFactory {
    private static Object ConnectionType;

    // Connection m=new Connection();
    public static Protocol getProtocoleFactory() {
        if (ConnectionType == "ssh") {
            Ssh obj = null;
            obj.getInsatnce("Ssh");

        }
        if (ConnectionType == "ftp") {
            Ssh obj = null;
            obj.getInsatnce("ftp");
        }
        if (ConnectionType == "scp") {
            Ssh obj = null;
            obj.getInsatnce("scp");
        }
        if (ConnectionType == "Telnet") {
            Ssh obj = null;
            obj.getInsatnce("Telnet");
        }
        if (ConnectionType == "TFTP") {
            Ssh obj = null;
            obj.getInsatnce("TFTP");
        }
        return null;


    /*
    public static Protocol getInstance(String connectionType) {
        if(connections.containsKey(connectionType)) {
            System.out.println("Connection is already created!.");
            return (Protocol) connections.get(connectionType);
        } else {
            if(connectionType.equals(ConnectionType.FTP)) {
                Protocol ftp = new Ftp();
                connections.put(connectionType, ftp);
                return ftp;//Create a new instance
            }
            if(connectionType.equals(ConnectionType.SSH)) {
                connections.put(connectionType, Ssh.getInsatnce());
                return Ssh.getInsatnce();
            }
            if(connectionType.equals(ConnectionType.TELNET)) {
                connections.put(connectionType, Telnet.getInsatnce());
                return Telnet.getInsatnce();
            }
            if(connectionType.equals(ConnectionType.SCP)) {
                connections.put(connectionType, Scp.getInsatnce());
                return Scp.getInsatnce();
            }
        }
        return null;

    }*/
    }
}
