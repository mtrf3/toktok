package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.0P2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0P2 {
    public static void LIZ(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }
}
