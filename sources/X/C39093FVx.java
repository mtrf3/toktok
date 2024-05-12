package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.FVx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39093FVx implements InterfaceC39089FVt {
    public final SharedPreferences LIZ;

    @Override // X.InterfaceC39089FVt
    public final void LIZ() {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putInt("languageDialogShowState", 3);
        edit.apply();
    }

    public C39093FVx(Context context) {
        this.LIZ = F9J.LIZIZ(context, 0, "InitialChooseLanguagePreferences");
    }
}
