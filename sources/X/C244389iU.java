package X;

import android.app.Activity;
import android.os.Build;

/* renamed from: X.9iU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244389iU {
    public static long LIZ;

    public static void LIZ(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1024);
        }
    }
}
