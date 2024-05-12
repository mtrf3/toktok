package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes16.dex */
public final class XO2 implements ServiceConnection {
    public final /* synthetic */ C84751XNz LJLIL;

    public XO2(C84751XNz c84751XNz) {
        this.LJLIL = c84751XNz;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C84751XNz c84751XNz = this.LJLIL;
        XOD xod = c84751XNz.LJIIL;
        if (xod != null) {
            xod.unlinkToDeath(c84751XNz.LJIIJ, 0);
        }
        c84751XNz.LJIIL = null;
        c84751XNz.LIZ();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof XOD) {
            C84751XNz c84751XNz = this.LJLIL;
            XOD xod = (XOD) iBinder;
            c84751XNz.LJIIL = xod;
            if (xod != null) {
                xod.linkToDeath(c84751XNz.LJIIJ, 0);
            }
            C84751XNz c84751XNz2 = this.LJLIL;
            c84751XNz2.LJFF(c84751XNz2.LJIIIZ);
        }
    }
}
