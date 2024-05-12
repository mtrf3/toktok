package X;

import v82.IDdS500S0100000_1;

/* renamed from: X.3h5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90633h5 {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(int i, int i2, String str, M0Z m0z) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(m0z));
        xks.LJIIL();
        try {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJIIIZ = i;
            LJIIIIZZ.LJIIJ = i2;
            LJIIIIZZ.LJIIIZ(new IDdS500S0100000_1(xks, 1));
        } catch (Throwable th) {
            C3C4 LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
            xks.resumeWith(LIZ2);
        }
        return xks.LJIIJJI();
    }
}
