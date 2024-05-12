package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PII {
    public static String LIZ;

    public static String LIZ() {
        PIF LIZ2;
        try {
            if (LIZ != null) {
                LIZ2 = PIJ.LIZ("test", PIL.BATCH, PIN.PARALLEL_WRAPPER_MODE, false, new C63884P5k(LIZ), null);
            } else {
                LIZ2 = PIJ.LIZ("test", PIL.BATCH, PIN.PARALLEL_WRAPPER_MODE, false, new C63885P5l(C63887P5n.LIZIZ()), null);
            }
            LIZ2.start();
            PID LJFF = LIZ2.LJFF();
            String t = LJFF.LIZJ();
            LJFF.LJII();
            o.LJIIIIZZ(t, "t");
            return t;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String LIZIZ() {
        try {
            PIF LIZ2 = PIJ.LIZ("ec_event_tracking", PIL.BATCH, PIN.PARALLEL_WRAPPER_MODE, false, C63889P5p.LIZ, null);
            LIZ2.start();
            PID LJFF = LIZ2.LJFF();
            String t = LJFF.LIZJ();
            LJFF.LJII();
            o.LJIIIIZZ(t, "t");
            LIZ = t;
            return t;
        } catch (Throwable unused) {
            return "";
        }
    }
}
