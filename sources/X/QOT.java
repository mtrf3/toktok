package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;

/* loaded from: classes12.dex */
public class QOT implements ServiceConnection {
    public final /* synthetic */ QOS LJLIL;

    public QOT(QOS qos) {
        this.LJLIL = qos;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (componentName == null) {
            return;
        }
        Logger.debug();
        try {
            QOS qos = this.LJLIL;
            qos.LIZLLL = null;
            qos.LJ.clear();
            synchronized (this.LJLIL) {
            }
        } catch (Throwable unused) {
        }
        QOS qos2 = this.LJLIL;
        SystemClock.uptimeMillis();
        qos2.getClass();
        WsConstants.getBindWsChannelServiceListener();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (componentName == null || iBinder == null) {
            return;
        }
        Logger.debug();
        try {
            Messenger messenger = new Messenger(iBinder);
            QOS qos = this.LJLIL;
            qos.LIZLLL = messenger;
            qos.LJ(componentName);
        } catch (Throwable unused) {
        }
        this.LJLIL.LIZIZ = SystemClock.uptimeMillis();
        QOS qos2 = this.LJLIL;
        SystemClock.uptimeMillis();
        qos2.getClass();
        WsConstants.getBindWsChannelServiceListener();
    }
}
