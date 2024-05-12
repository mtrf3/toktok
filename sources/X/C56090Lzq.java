package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lzq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56090Lzq {
    public static long LIZ;
    public static boolean LIZJ;
    public static Boolean LIZLLL;
    public static Boolean LJ;
    public static Boolean LJFF;
    public static Long LJII;
    public static long LIZIZ = -1;
    public static String LJI = "";

    public static boolean LIZ() {
        Boolean bool;
        if (LIZLLL == null) {
            try {
                bool = C38987FRv.LIZLLL();
            } catch (Exception unused) {
                bool = Boolean.FALSE;
            }
            LIZLLL = bool;
        }
        return o.LJ(LIZLLL, Boolean.TRUE);
    }

    public static boolean LIZIZ() {
        if (LJ == null) {
            LJ = Boolean.valueOf(!C66822jm.LIZ.contains("is_first_show_mall"));
        }
        return o.LJ(LJ, Boolean.TRUE);
    }
}
