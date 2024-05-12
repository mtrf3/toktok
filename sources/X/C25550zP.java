package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0zP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25550zP {
    public static SharedPreferences LIZ;

    public static synchronized void LIZ(Context context) {
        synchronized (C25550zP.class) {
            if (LIZ != null) {
                return;
            }
            LIZ = F9J.LIZIZ(context, 0, "evil_method_SPUtils");
        }
    }
}
