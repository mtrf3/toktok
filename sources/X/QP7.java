package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;

/* loaded from: classes12.dex */
public class QP7 implements ServiceConnection {
    public final /* synthetic */ QP6 LJLIL;

    public QP7(QP6 qp6) {
        this.LJLIL = qp6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLIL.LJLIL = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.LJLIL.LJLIL = new Messenger(iBinder);
        this.LJLIL.LIZIZ();
    }
}
