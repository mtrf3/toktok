package X;

import android.os.IBinder;

/* renamed from: X.Zrk, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91260Zrk implements IBinder.DeathRecipient {
    public final /* synthetic */ C91437Zub LJLIL;

    public C91260Zrk(C91437Zub c91437Zub) {
        this.LJLIL = c91437Zub;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        C91437Zub c91437Zub = this.LJLIL;
        BinderC91098Zp8 binderC91098Zp8 = c91437Zub.LJIIL;
        if (binderC91098Zp8 != null) {
            binderC91098Zp8.unlinkToDeath(c91437Zub.LJIIJ, 0);
        }
        c91437Zub.LJIIL = null;
        c91437Zub.LIZIZ();
    }
}
