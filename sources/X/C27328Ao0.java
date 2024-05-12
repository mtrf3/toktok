package X;

import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.Ao0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27328Ao0 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(long j) {
        String valueOf;
        Calendar cal = Calendar.getInstance();
        o.LJIIIIZZ(cal, "cal");
        cal.setTimeInMillis(j);
        int i = cal.get(15) / 3600000;
        if (i >= 0) {
            valueOf = C169696lJ.LIZIZ('+', i);
        } else {
            valueOf = String.valueOf(i);
        }
        return Q8U.LIZIZ(new Object[]{Integer.valueOf(cal.get(1)), Integer.valueOf(cal.get(2) + 1), Integer.valueOf(cal.get(5)), Integer.valueOf(cal.get(11)), Integer.valueOf(cal.get(12)), Integer.valueOf(cal.get(13)), Integer.valueOf(cal.get(14)), valueOf}, 8, "%d-%02d-%02d %02d:%02d:%02d.%03d GMT%s", "java.lang.String.format(format, *args)");
    }
}
