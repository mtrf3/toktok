package X;

import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.J6i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48620J6i {
    public static int LIZ;
    public static long LIZIZ;
    public static int LIZJ;
    public static long LIZLLL;
    public static int LJ;
    public static int LJFF;

    public static void LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - LIZIZ > 900000) {
            LIZIZ = currentTimeMillis;
            Calendar calendar = C48630J6s.LIZ;
            o.LJIIIIZZ(calendar, "CalenderHolder.calendar");
            synchronized (calendar) {
                calendar.setTimeInMillis(currentTimeMillis);
                LIZ = calendar.get(11);
                LJ = calendar.get(7);
                LJFF = calendar.get(5);
            }
        }
    }
}
