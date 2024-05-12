package X;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes13.dex */
public final class SU4 {
    public static long LIZIZ() {
        long j = 0;
        long j2 = (j * 1000) + j;
        long j3 = j * 60;
        return (1 * 24 * 60 * 60 * 1000) + (j3 * 60 * 1000) + (j3 * 1000) + j2;
    }

    public static C44435HcF LIZJ() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long time = calendar.getTime().getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        calendar2.set(14, 999);
        long time2 = calendar2.getTime().getTime();
        C44435HcF c44435HcF = new C44435HcF();
        c44435HcF.LIZ = time;
        c44435HcF.LIZIZ = time2;
        return c44435HcF;
    }

    public static int LIZ(long j) {
        return (int) ((j + TimeZone.getDefault().getRawOffset()) / 86400000);
    }

    public static boolean LIZLLL(long j) {
        C44435HcF LIZJ = LIZJ();
        if (j >= LIZJ.LIZ && j <= LIZJ.LIZIZ) {
            return true;
        }
        return false;
    }

    public static boolean LJ(long j) {
        long LIZIZ = LIZIZ();
        C44435HcF LIZJ = LIZJ();
        long j2 = LIZJ.LIZ - LIZIZ;
        LIZJ.LIZ = j2;
        long j3 = LIZJ.LIZIZ - LIZIZ;
        if (j > j2 && j < j3) {
            return true;
        }
        return false;
    }
}
