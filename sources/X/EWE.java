package X;

import android.os.Build;

/* loaded from: classes7.dex */
public final class EWE {
    public static boolean LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            return true;
        }
        return false;
    }
}
