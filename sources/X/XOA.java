package X;

import android.os.IBinder;

/* loaded from: classes16.dex */
public final class XOA implements IBinder.DeathRecipient {
    public final /* synthetic */ XO6 LJLIL;

    public XOA(XO6 xo6) {
        this.LJLIL = xo6;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        XO6 xo6 = this.LJLIL;
        BinderC40677Fxp binderC40677Fxp = xo6.LJII;
        if (binderC40677Fxp != null) {
            binderC40677Fxp.unlinkToDeath(xo6.LJFF, 0);
        }
        xo6.LJII = null;
        xo6.LIZ();
    }
}
