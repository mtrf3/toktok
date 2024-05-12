package X;

import Y.ACallableS83S0200000_6;
import Y.AgS123S0100000_6;
import android.text.TextUtils;

/* renamed from: X.EhB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37097EhB implements InterfaceC37096EhA {
    public final /* synthetic */ F5U LIZ;

    public C37097EhB(F5U f5u) {
        this.LIZ = f5u;
    }

    @Override // X.InterfaceC37096EhA
    public final void LIZ(C37100EhE c37100EhE) {
        AbstractC37134Ehm abstractC37134Ehm = this.LIZ.LJII;
        if (abstractC37134Ehm == null || !TextUtils.equals(abstractC37134Ehm.LIZIZ, c37100EhE.LIZ)) {
            return;
        }
        if (c37100EhE.LIZJ == 5 && !abstractC37134Ehm.LIZJ()) {
            c37100EhE.LIZJ = 6;
            c37100EhE.LJI = 2;
        }
        C10K.LIZJ(new ACallableS83S0200000_6(this.LIZ, c37100EhE, 15)).LIZLLL(new AgS123S0100000_6(c37100EhE, 14));
    }
}
