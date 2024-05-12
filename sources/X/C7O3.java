package X;

import android.view.View;

/* renamed from: X.7O3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7O3 {
    public static void LIZ(View view, boolean z) {
        float f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        view.animate().alpha(f).setDuration(150L).start();
    }
}
