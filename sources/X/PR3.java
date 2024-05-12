package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PR3 {
    public static long LIZ;
    public static float LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static boolean LJ;
    public static boolean LJFF = true;

    public static void LIZIZ() {
        LJFF = !C64433PQn.LIZ().LIZLLL;
        LIZIZ = C64433PQn.LIZ().LIZJ;
        LIZ = System.currentTimeMillis();
        if (C40010Fn4.LIZJ().LJ()) {
            LIZJ = System.currentTimeMillis();
            LIZLLL = 0L;
        }
    }

    public static void LIZ(InterfaceC46627IRr interfaceC46627IRr) {
        if (!LJFF) {
            return;
        }
        float f = C64433PQn.LIZ().LIZJ;
        float f2 = LIZIZ;
        if (f >= f2) {
            return;
        }
        float f3 = f2 - f;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - LIZ)) / 60000.0f;
        String LIZIZ2 = Q8U.LIZIZ(new Object[]{Float.valueOf(f3 / currentTimeMillis)}, 1, "%.4f", "format(format, *args)");
        if (o.LJ("0.0000", LIZIZ2)) {
            return;
        }
        if (LIZLLL == 0 && LIZJ > 0) {
            LIZLLL = System.currentTimeMillis() - LIZJ;
        }
        float currentTimeMillis2 = (((float) LIZLLL) * 1.0f) / ((float) (System.currentTimeMillis() - LIZ));
        boolean LJ2 = C40010Fn4.LIZJ().LJ();
        C76W c76w = new C76W();
        c76w.LIZ("is_low_power_mode", String.valueOf(LJ2 ? 1 : 0));
        String LLLZ = C16880lQ.LLLZ("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(currentTimeMillis2)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        c76w.LIZ("low_power_mode_pct", LLLZ);
        c76w.LIZ("battery_level", String.valueOf(f));
        C46628IRs c46628IRs = ((C46625IRp) interfaceC46627IRr).LIZ;
        c46628IRs.LJI();
        c76w.LIZ("battery_temperature", String.valueOf(c46628IRs.LJLJL));
        String LLLZ2 = C16880lQ.LLLZ("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(currentTimeMillis)}, 1));
        o.LJIIIIZZ(LLLZ2, "format(format, *args)");
        c76w.LIZ("session_time", LLLZ2);
        c76w.LIZ("session_usage", String.valueOf(f3));
        c76w.LIZ("per_min_avg_usage", LIZIZ2);
        FMX.LJIILJJIL("prf_battery_usage", c76w.LIZIZ());
    }
}
