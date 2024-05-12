package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.Zrj, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class ServiceConnectionC91259Zrj implements ServiceConnection {
    public final /* synthetic */ C91437Zub LJLIL;

    public ServiceConnectionC91259Zrj(C91437Zub c91437Zub) {
        this.LJLIL = c91437Zub;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C91437Zub c91437Zub = this.LJLIL;
        BinderC91098Zp8 binderC91098Zp8 = c91437Zub.LJIIL;
        if (binderC91098Zp8 != null) {
            binderC91098Zp8.unlinkToDeath(c91437Zub.LJIIJ, 0);
        }
        c91437Zub.LJIIL = null;
        c91437Zub.LIZIZ();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof BinderC91098Zp8) {
            C91437Zub c91437Zub = this.LJLIL;
            BinderC91098Zp8 binderC91098Zp8 = (BinderC91098Zp8) iBinder;
            c91437Zub.LJIIL = binderC91098Zp8;
            if (binderC91098Zp8 != null) {
                binderC91098Zp8.linkToDeath(c91437Zub.LJIIJ, 0);
            }
            this.LJLIL.LJFF(true);
        }
    }
}
