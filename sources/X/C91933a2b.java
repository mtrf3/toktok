package X;

import com.bytedance.bddatefmt.BDDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.a2b, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91933a2b {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C92835aH9.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C92836aHA.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C92832aH6.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C92833aH7.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C92834aH8.LJLIL);

    public static String LIZ(long j) {
        if (j == 0) {
            return "";
        }
        BDDateFormat bDDateFormat = (BDDateFormat) LIZ.getValue();
        Locale LIZIZ2 = C39386Fd0.LIZIZ(EF7.LIZIZ());
        o.LJIIIIZZ(LIZIZ2, "getFrom(AppContextManager.getApplicationContext())");
        return bDDateFormat.LIZIZ(j, LIZIZ2);
    }

    public static String LIZIZ(Long l) {
        if (l == null) {
            return "";
        }
        BDDateFormat bDDateFormat = (BDDateFormat) LIZJ.getValue();
        long longValue = l.longValue();
        Locale LIZIZ2 = C39386Fd0.LIZIZ(EF7.LIZIZ());
        o.LJIIIIZZ(LIZIZ2, "getFrom(AppContextManager.getApplicationContext())");
        return bDDateFormat.LIZIZ(longValue, LIZIZ2);
    }

    public static String LIZJ(long j) {
        if (j == 0) {
            return "";
        }
        BDDateFormat bDDateFormat = (BDDateFormat) LIZLLL.getValue();
        Locale LIZIZ2 = C39386Fd0.LIZIZ(EF7.LIZIZ());
        o.LJIIIIZZ(LIZIZ2, "getFrom(AppContextManager.getApplicationContext())");
        return bDDateFormat.LIZIZ(j, LIZIZ2);
    }
}
