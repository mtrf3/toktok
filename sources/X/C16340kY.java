package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.0kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16340kY {
    public static void LIZJ(View view) {
        view.requestApplyInsets();
    }

    public static WindowInsets LIZ(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets LIZIZ(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }
}
