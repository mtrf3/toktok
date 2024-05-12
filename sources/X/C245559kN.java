package X;

import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.9kN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245559kN {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZIZ() {
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null) {
            return abstractC247499nV.LJIIL();
        }
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static long LIZ() {
        Calendar cal = Calendar.getInstance();
        Date date = new Date((LIZIZ() * 1000) + 0);
        o.LJIIIIZZ(cal, "cal");
        cal.setTime(date);
        cal.set(11, 0);
        cal.set(13, 0);
        cal.set(12, 0);
        cal.set(14, 0);
        return cal.getTimeInMillis() / 1000;
    }
}
