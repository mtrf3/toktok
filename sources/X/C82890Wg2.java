package X;

import android.content.Context;

/* renamed from: X.Wg2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82890Wg2 {
    public static InterfaceC82904WgG LJ;
    public final Context LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public static final TMB LJFF = new TMB();
    public static final C82892Wg4 LIZLLL = new C82892Wg4(C82905WgH.LJLIL);

    public final void LIZ() {
        String str;
        if (this.LIZ == null || (str = this.LIZIZ) == null || str.length() == 0) {
            return;
        }
        TMB tmb = LJFF;
        tmb.getClass();
        InterfaceC82888Wg0 interfaceC82888Wg0 = (InterfaceC82888Wg0) LIZLLL.LIZ(tmb, TMB.LIZ[0]);
        if (interfaceC82888Wg0 == null) {
            interfaceC82888Wg0 = C82873Wfl.LIZ;
        }
        interfaceC82888Wg0.LIZ(this.LIZ, this.LIZJ, this.LIZIZ);
    }

    public C82890Wg2(Context context, String str, int i, int i2) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
