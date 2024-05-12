package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class EKP implements InterfaceC68532Qv2 {
    public final SharedPreferences LIZ;

    @Override // X.InterfaceC68532Qv2
    public final String LIZJ() {
        return this.LIZ.getString("latest_login_info", "[]");
    }

    public EKP(Context context) {
        this.LIZ = F9J.LIZIZ(context, 0, "LoginSharePreferences");
    }

    @Override // X.InterfaceC68532Qv2
    public final void LIZ(String str) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putString("latest_login_info", str);
        edit.apply();
    }

    @Override // X.InterfaceC68532Qv2
    public final boolean LIZIZ(boolean z) {
        return this.LIZ.getBoolean("save_login_info", z);
    }

    @Override // X.InterfaceC68532Qv2
    public final void LIZLLL(boolean z) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putBoolean("save_login_info", z);
        edit.apply();
    }
}
