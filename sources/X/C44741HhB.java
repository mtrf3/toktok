package X;

import kotlin.jvm.internal.o;

/* renamed from: X.HhB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44741HhB {
    public static final C44741HhB LIZ = new C44741HhB();
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public final void LIZ() {
        int i;
        int i2;
        String str;
        synchronized (this) {
            if (LIZJ && LIZIZ) {
                int[] LJIIIZ = C44739Hh9.LJIIIZ(false);
                if (LJIIIZ != null && LJIIIZ.length >= 2 && LJIIIZ[0] == 720) {
                    i = 1;
                } else {
                    i = 0;
                }
                LIZIZ(i, "resolution", C113554cx.LJJL(new OSZ("resolution_default", C44737Hh7.LIZ()), new OSZ("resolution_category", C44772Hhg.LIZ()), new OSZ("resolution_real", C44739Hh9.LJIIIIZZ())).toString());
                int[] LIZLLL = C44739Hh9.LIZLLL();
                if (LIZLLL != null && LIZLLL.length >= 2 && LIZLLL[0] == 720) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                OSZ[] oszArr = new OSZ[3];
                oszArr[0] = new OSZ("resolution_default", C44737Hh7.LIZ());
                oszArr[1] = new OSZ("resolution_category_upload", C44773Hhh.LIZ());
                int[] LIZLLL2 = C44739Hh9.LIZLLL();
                if (LIZLLL2 != null && LIZLLL2.length >= 2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LIZLLL2[0]);
                    LIZ2.append("*");
                    LIZ2.append(LIZLLL2[1]);
                    str = X1D.LIZIZ(LIZ2);
                } else {
                    str = "";
                }
                oszArr[2] = new OSZ("resolution_real_upload", str);
                LIZIZ(i2, "resolution", C113554cx.LJJL(oszArr).toString());
            }
        }
    }

    public static void LIZIZ(int i, String str, String extra) {
        o.LJIIIZ(extra, "extra");
        C43882HKc.LIZIZ("aweme_android_white_list", C73994T2g.LJJIJLIJ(C113554cx.LJJL(new OSZ("white_list_type", str), new OSZ("white_list_value", String.valueOf(i)), new OSZ("extra", extra))));
    }
}
