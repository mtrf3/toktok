package X;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.LSo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54294LSo implements XSO {
    public final SharedPreferences LIZ;

    @Override // X.XSO
    public final long LIZLLL() {
        return this.LIZ.getLong("last_append_video_time", 0L);
    }

    @Override // X.XSO
    public final long LJ() {
        return this.LIZ.getLong("today_video_play_time", 0L);
    }

    public C54294LSo(Context context) {
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "aweme-app");
        o.LJIIIIZZ(LIZIZ, "mContext.getSharedPrefer…p\", Context.MODE_PRIVATE)");
        this.LIZ = LIZIZ;
    }

    @Override // X.XSO
    public final void LIZ(long j) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putLong("last_unlock_time", j);
        edit.apply();
    }

    @Override // X.XSO
    public final void LIZIZ(long j) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putLong("today_video_play_time", j);
        edit.apply();
    }

    @Override // X.XSO
    public final void LIZJ(long j) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putLong("last_append_video_time", j);
        edit.apply();
    }
}
