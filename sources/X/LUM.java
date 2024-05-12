package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes10.dex */
public final class LUM implements LVS {
    public final SharedPreferences LIZ;

    @Override // X.LVS
    public final int LIZ() {
        return this.LIZ.getInt("notice_count_latency", 0);
    }

    @Override // X.LVS
    public final void LIZIZ() {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putBoolean("si_show_user_feed_back_point", true);
        edit.apply();
    }

    public LUM(Context context) {
        this.LIZ = F9J.LIZIZ(context, 0, "aweme-app");
    }
}
