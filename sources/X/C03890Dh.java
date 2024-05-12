package X;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: X.0Dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03890Dh {
    public static boolean LIZ = true;

    public static void LIZ(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            if (!LIZ) {
                return;
            }
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                LIZ = false;
            }
        }
    }
}
