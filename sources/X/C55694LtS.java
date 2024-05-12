package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.LtS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55694LtS implements InterfaceC55700LtY {
    public final SharedPreferences LIZ;

    @Override // X.InterfaceC55700LtY
    public final void LIZ() {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putString("profile_cache_post_list", "");
        edit.apply();
    }

    public C55694LtS(Context context) {
        this.LIZ = F9J.LIZIZ(context, 0, "ProfilePreferences");
    }
}
