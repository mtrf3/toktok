package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.LSt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54299LSt implements OVU {
    public final SharedPreferences LIZ;

    public C54299LSt(Context context) {
        this.LIZ = F9J.LIZIZ(context, 0, "VideoPublishManager");
    }

    @Override // X.OVU
    public final void LIZ(boolean z) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putBoolean("is_aweme_private", z);
        edit.apply();
    }
}
