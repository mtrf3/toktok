package X;

import android.os.IBinder;

/* loaded from: classes16.dex */
public final class XOB implements IBinder.DeathRecipient {
    public final /* synthetic */ C84751XNz LJLIL;

    public XOB(C84751XNz c84751XNz) {
        this.LJLIL = c84751XNz;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        C84751XNz c84751XNz = this.LJLIL;
        XOD xod = c84751XNz.LJIIL;
        if (xod != null) {
            xod.unlinkToDeath(c84751XNz.LJIIJ, 0);
        }
        c84751XNz.LJIIL = null;
        c84751XNz.LIZ();
    }
}
