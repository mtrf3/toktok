package X;

import android.os.IBinder;

/* loaded from: classes16.dex */
public final class XO4 implements IBinder.DeathRecipient {
    public final /* synthetic */ XO0 LJLIL;

    public XO4(XO0 xo0) {
        this.LJLIL = xo0;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        XO0 xo0 = this.LJLIL;
        XOC xoc = xo0.LJIIJJI;
        if (xoc != null) {
            xoc.unlinkToDeath(xo0.LJIIL, 0);
        }
        xo0.LJIIJJI = null;
        xo0.LIZ();
    }
}
