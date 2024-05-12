package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0Zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09710Zr {
    public static boolean LIZ(Context context) {
        SharedPreferences LIZIZ;
        if (context != null && (LIZIZ = F9J.LIZIZ(context, 4, "ttlive_sdk_shared_pref_cache")) != null) {
            if (((int) ((System.currentTimeMillis() - LIZIZ.getLong("key_ttlive_sdk_flow_remind", 0L)) / 86400000)) <= 30) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZIZ(Context context) {
        SharedPreferences LIZIZ;
        if (context != null && (LIZIZ = F9J.LIZIZ(context, 4, "ttlive_sdk_shared_pref_cache")) != null) {
            LIZIZ.edit().putLong("key_ttlive_sdk_flow_remind", System.currentTimeMillis()).apply();
        }
    }
}
