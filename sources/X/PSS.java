package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PSS implements ServiceConnection {
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);
    public final BlockingQueue<IBinder> LJLILLLLZI = new LinkedBlockingDeque();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final IBinder LIZ() {
        if (!this.LJLIL.compareAndSet(true, true)) {
            Object take = ((LinkedBlockingDeque) this.LJLILLLLZI).take();
            o.LJIIIIZZ(take, "queue.take()");
            return (IBinder) take;
        }
        "Binder already consumed".toString();
        throw new IllegalStateException("Binder already consumed");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                ((LinkedBlockingDeque) this.LJLILLLLZI).put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }
}
