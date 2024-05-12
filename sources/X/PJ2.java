package X;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes12.dex */
public final class PJ2 {
    public static final java.util.Set<String> LIZ;

    static {
        HashSet hashSet = new HashSet();
        LIZ = hashSet;
        C012403c.LJFF(hashSet, "HeapTaskDaemon", "ThreadPlus", "ApiDispatcher", "ApiLocalDispatcher");
        C012403c.LJFF(hashSet, "AsyncLoader", "AsyncTask", "Binder", "PackageProcessor");
        C012403c.LJFF(hashSet, "SettingsObserver", "WifiManager", "JavaBridge", "Compiler");
        C012403c.LJFF(hashSet, "Signal Catcher", "GC", "ReferenceQueueDaemon", "FinalizerDaemon");
        C012403c.LJFF(hashSet, "FinalizerWatchdogDaemon", "CookieSyncManager", "RefQueueWorker", "CleanupReference");
        C012403c.LJFF(hashSet, "VideoManager", "DBHelper-AsyncOp", "InstalledAppTracker2", "AppData-AsyncOp");
        C012403c.LJFF(hashSet, "IdleConnectionMonitor", "LogReaper", "ActionReaper", "Okio Watchdog");
        C012403c.LJFF(hashSet, "CheckWaitingQueue", "NPTH-CrashTimer", "NPTH-JavaCallback", "NPTH-LocalParser");
        hashSet.add("ANR_FILE_MODIFY");
    }

    public static boolean LIZ(Throwable th) {
        if (th == null) {
            return true;
        }
        try {
            if ((th instanceof ConnectTimeoutException) || (th instanceof SocketTimeoutException) || (th instanceof BindException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof PortUnreachableException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof ProtocolException)) {
                return true;
            }
            if (th instanceof SSLException) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
