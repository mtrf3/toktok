package X;

import Y.ARunnableS0S0010000_1;
import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.2MZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2MZ {
    public static final void LIZJ() {
        if (C58122Pw.LIZIZ) {
            C37179EiV.LJFF.post(new ARunnableS0S0010000_1(1));
        } else {
            LIZIZ().edit().putBoolean("shouldShowSwipeUpGuide1", false).apply();
        }
    }

    public static final boolean LIZ() {
        return LIZIZ().getBoolean("hasShowedSwipeUpGuideAfterVideoPlay", false);
    }

    public static SharedPreferences LIZIZ() {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "MainTabPreferences");
        o.LJIIIIZZ(LIZIZ, "AppContextManager.getApp…ME, Context.MODE_PRIVATE)");
        return LIZIZ;
    }
}
