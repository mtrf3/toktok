package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class NR1 {
    public static boolean LIZ(View view) {
        if (!view.isAttachedToWindow() || view.getVisibility() != 0 || view.getAlpha() == 0.0f) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(C59349NQz c59349NQz) {
        if (c59349NQz.LIZLLL && !c59349NQz.LJ) {
        } else {
            throw new IllegalStateException("Viewability session should be active");
        }
    }
}
