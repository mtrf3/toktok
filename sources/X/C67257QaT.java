package X;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.QaT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67257QaT {
    public static final Integer[] LIZ = {21, 0, 8, 0};
    public static final Integer[] LIZIZ = {21, 0, 8, 0};
    public static final SimpleDateFormat LIZJ;

    static {
        new SimpleDateFormat("yyyy-MM-dd");
        LIZJ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static long LIZJ(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        calendar.set(14, 0);
        return (i * 86400000) + calendar.getTimeInMillis();
    }

    public static String LIZLLL(long j) {
        try {
            String format = LIZJ.format(new Date(j));
            o.LJIIIIZZ(format, "{\n            yMdHmsDate…(Date(millSec))\n        }");
            return format;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getyMdHmsStringFromMillSec() - error = ");
            LIZ2.append(e.getMessage());
            String message = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(message, "message");
            return "";
        }
    }

    public static long LIZ(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(12, i2);
        calendar.set(11, i);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long LIZIZ(long j, EnumC68477Qu9 interval) {
        o.LJIIIZ(interval, "interval");
        return (interval.getStartHour() * ((float) 3600000)) + ((float) j);
    }
}
