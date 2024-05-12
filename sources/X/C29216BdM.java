package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.BdM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29216BdM {
    public static boolean LIZ(Context context, long j, String str) {
        if (j != F9J.LIZIZ(context, 0, "low_age_storage").getLong(str, 0L)) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Context context, long j, String str) {
        SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, "low_age_storage").edit();
        edit.putLong(str, j);
        edit.commit();
    }
}
