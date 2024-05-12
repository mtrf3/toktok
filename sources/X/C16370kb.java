package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.0kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16370kb {
    public static C16800lI LIZ(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C16800lI LJIIJ = C16800lI.LJIIJ(null, rootWindowInsets);
        LJIIJ.LIZ.LJIJ(LJIIJ);
        LJIIJ.LIZ.LIZLLL(view.getRootView());
        return LJIIJ;
    }

    public static int LIZIZ(View view) {
        return view.getScrollIndicators();
    }

    public static void LIZJ(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void LIZLLL(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
