package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.0l8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16700l8 {
    public static void LIZ(Window window, boolean z) {
        int i;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & (-1793);
        } else {
            i = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i);
    }
}
