package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes16.dex */
public final class XO5 implements ServiceConnection {
    public final /* synthetic */ XO6 LJLIL;

    public XO5(XO6 xo6) {
        this.LJLIL = xo6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        XO6 xo6 = this.LJLIL;
        BinderC40677Fxp binderC40677Fxp = xo6.LJII;
        if (binderC40677Fxp != null) {
            binderC40677Fxp.unlinkToDeath(xo6.LJFF, 0);
        }
        xo6.LJII = null;
        xo6.LIZ();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof BinderC40677Fxp) {
            XO6 xo6 = this.LJLIL;
            BinderC40677Fxp binderC40677Fxp = (BinderC40677Fxp) iBinder;
            xo6.LJII = binderC40677Fxp;
            if (binderC40677Fxp != null) {
                binderC40677Fxp.linkToDeath(xo6.LJFF, 0);
            }
            XO6 xo62 = this.LJLIL;
            C84747XNv c84747XNv = xo62.LJ;
            if (c84747XNv != null) {
                xo62.LJFF(c84747XNv);
            }
        }
    }
}
