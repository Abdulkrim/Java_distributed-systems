
package ServerInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Dictionary extends Remote {
    public String translate(String word) throws RemoteException;
}
