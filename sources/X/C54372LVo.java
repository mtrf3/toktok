package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.LVo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54372LVo implements InterfaceC86312Xu8 {
    public final SharedPreferences LIZ;

    @Override // X.InterfaceC86312Xu8
    public final String LIZ() {
        return this.LIZ.getString("teenage_mode_setting", "");
    }

    public C54372LVo(Context context) {
        this.LIZ = F9J.LIZIZ(context, 0, "TeenageModeSetting");
    }

    @Override // X.InterfaceC86312Xu8
    public final void LIZIZ(String str) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putString("teenage_mode_setting", str);
        edit.apply();
    }
}
