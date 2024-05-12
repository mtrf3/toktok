package X;

import android.os.Build;

/* loaded from: classes7.dex */
public final class FPS {
    public static boolean LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i == 28 || i == 29 || i == 30) {
            return true;
        }
        return false;
    }
}
