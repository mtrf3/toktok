package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes16.dex */
public final class XO1 implements ServiceConnection {
    public final /* synthetic */ XO0 LJLIL;

    public XO1(XO0 xo0) {
        this.LJLIL = xo0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        XO0 xo0 = this.LJLIL;
        XOC xoc = xo0.LJIIJJI;
        if (xoc != null) {
            xoc.unlinkToDeath(xo0.LJIIL, 0);
        }
        xo0.LJIIJJI = null;
        xo0.LIZ();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof XOC) {
            XO0 xo0 = this.LJLIL;
            XOC xoc = (XOC) iBinder;
            xo0.LJIIJJI = xoc;
            if (xoc != null) {
                xoc.linkToDeath(xo0.LJIIL, 0);
            }
            XO0 xo02 = this.LJLIL;
            xo02.LJ(xo02.LJIIIZ);
        }
    }
}
