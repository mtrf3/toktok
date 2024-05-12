package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes12.dex */
public final class PSV implements ServiceConnection {
    public boolean LJLIL;
    public final BlockingQueue<IBinder> LJLILLLLZI = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final IBinder LIZ(TimeUnit timeUnit) {
        QH7.LJII("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.LJLIL) {
            this.LJLIL = true;
            IBinder iBinder = (IBinder) ((LinkedBlockingQueue) this.LJLILLLLZI).poll(10000L, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.LJLILLLLZI.add(iBinder);
    }
}
