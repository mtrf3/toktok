package X;

import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.UXm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77354UXm {
    public static String LIZ() {
        return LIZIZ(UXR.LIZ());
    }

    public static String LIZIZ(long j) {
        Object value = C77353UXl.LJ.getValue();
        o.LJIIIIZZ(value, "<get-reusableCalendar>(...)");
        Calendar calendar = (Calendar) value;
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return String.valueOf(calendar.getTimeInMillis());
    }
}
