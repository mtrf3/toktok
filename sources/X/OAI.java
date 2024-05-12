package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes11.dex */
public final class OAI {
    public SharedPreferences LIZ;

    public final void LIZ(Context context, String str, String str2) {
        if (this.LIZ == null) {
            this.LIZ = F9J.LIZIZ(context, 0, "sp_gecko");
        }
        this.LIZ.edit().putString(str, str2).apply();
    }
}
