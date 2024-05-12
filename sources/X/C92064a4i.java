package X;

import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.a4i, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92064a4i {
    public static final void LIZ(int i, InterfaceC24520xk interfaceC24520xk, String subTitle) {
        int i2;
        int i3;
        o.LJIIIZ(subTitle, "subTitle");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1810708502);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(subTitle)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (((i2 & 11) ^ 2) != 0 || !LJIL.LIZ()) {
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            if (LJJJZ == C24500xi.LIZIZ) {
                LJJJZ = s.LJLJJL(subTitle, new String[]{"\n"}, 0, 6);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            List list = (List) LJJJZ;
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C21430sl.LIZIZ((String) obj, null, C91671ZyN.LIZ(LJIL).LIZLLL, C79043V0l.LJIIIIZZ(14), null, null, null, 0L, null, new C22060tm(3), 0L, 0, false, 0, null, null, LJIL, 3072, 0, 65010);
                    if (i4 != C47261Igj.LJJI(list)) {
                        C79057V0z.LJ(C09290Yb.LJIIIIZZ(InterfaceC07790Sh.LJJJI, 7), LJIL, 6);
                    }
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C93001aJp(subTitle, i);
    }
}
