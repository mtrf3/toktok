package X;

import java.util.Calendar;

/* renamed from: X.Bie, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29544Bie {
    public static long LIZ() {
        long j = 0;
        long j2 = (j * 1000) + j;
        long j3 = j * 60;
        return (1 * 24 * 60 * 60 * 1000) + (j3 * 60 * 1000) + (j3 * 1000) + j2;
    }

    public static C29545Bif LIZIZ() {
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
        C29545Bif c29545Bif = new C29545Bif();
        c29545Bif.LIZ = time;
        c29545Bif.LIZIZ = time2;
        return c29545Bif;
    }
}
