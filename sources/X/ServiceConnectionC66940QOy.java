package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;

/* renamed from: X.QOy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class ServiceConnectionC66940QOy implements ServiceConnection {
    public final /* synthetic */ C66939QOx LJLIL;

    public ServiceConnectionC66940QOy(C66939QOx c66939QOx) {
        this.LJLIL = c66939QOx;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Logger.debug();
        synchronized (this.LJLIL.LJFF) {
            if (componentName == null) {
                return;
            }
            C66939QOx c66939QOx = this.LJLIL;
            c66939QOx.LIZIZ = null;
            c66939QOx.LIZLLL = null;
            c66939QOx.LJ = false;
            c66939QOx.LJFF();
            this.LJLIL.LJ();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Logger.debug();
        synchronized (this.LJLIL.LJFF) {
            this.LJLIL.LJ();
            if (componentName != null && iBinder != null) {
                try {
                    this.LJLIL.LIZIZ = new Messenger(iBinder);
                    this.LJLIL.LIZLLL();
                } catch (Throwable unused) {
                }
                this.LJLIL.LJ = false;
            }
        }
    }
}
