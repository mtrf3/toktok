package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JOt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49099JOt {
    public static final boolean LIZ;
    public static final boolean LIZIZ;

    static {
        boolean z;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C49101JOv.LJLIL);
        boolean z2 = false;
        if (((Number) LIZIZ2.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
        if (((Number) LIZIZ2.getValue()).intValue() != 0) {
            z2 = true;
        }
        LIZIZ = z2;
    }

    public static boolean LIZ(Aweme aweme, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        if (!LIZIZ || C53326KwM.LIZ() || !aweme.getVideoSkipEnableSkipButton() || z || aweme.isAd() || C46442IKo.LIZIZ()) {
            return false;
        }
        return true;
    }
}
