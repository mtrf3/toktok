package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class EUA implements EUC {
    public final SharedPreferences LIZ;

    public EUA(Context context) {
        this.LIZ = F9J.LIZIZ(context, 0, "VerifyActionManager");
    }

    @Override // X.EUC
    public final void LIZ(String str) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putString("verify_action", str);
        edit.apply();
    }
}
