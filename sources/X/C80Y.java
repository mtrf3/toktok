package X;

import android.app.Activity;

/* renamed from: X.80Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80Y {
    public static boolean LIZ(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return true;
        }
        return false;
    }
}
