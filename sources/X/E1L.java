package X;

import android.os.Build;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class E1L {
    public static final java.util.Set<String> LIZ;

    static {
        C221108m2.LIZIZ(C34576Dhc.LJLIL);
        LIZ = C77275UUl.LJIIIIZZ("GH", "GE", "QA", "KH", "CZ", "CI", "UG", "HN", "ET", "KG", "JP");
        C221108m2.LIZIZ(C34575Dhb.LJLIL);
    }

    public static boolean LIZ() {
        if (!DPI.LIZ() || Build.VERSION.SDK_INT <= 28 || !StrategyImpl.LIZIZ().LJJIJ()) {
            return false;
        }
        if (C2NW.LIZ().LJIILL()) {
            return true;
        }
        return DQG.LIZJ();
    }
}
