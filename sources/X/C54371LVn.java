package X;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.LVn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54371LVn implements XSI {
    public final SharedPreferences LIZ;

    @Override // X.XSI
    public final String LIZIZ() {
        return this.LIZ.getString("teenage_mode_setting", "");
    }

    public C54371LVn(Context context) {
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "TeenageModeSetting");
        o.LJIIIIZZ(LIZIZ, "mContext.getSharedPrefer…g\", Context.MODE_PRIVATE)");
        this.LIZ = LIZIZ;
    }

    @Override // X.XSI
    public final void LIZ(String str) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putString("teenage_mode_setting", str);
        edit.apply();
    }
}
