package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class E91 implements M8Z {
    public final SharedPreferences LIZ;

    @Override // X.M8Z
    public final long LIZIZ() {
        return this.LIZ.getLong("shotLastShowTime", 0L);
    }

    public E91(Context context) {
        this.LIZ = F9J.LIZIZ(context, 0, "ShowXmaxTreeCache");
    }

    @Override // X.M8Z
    public final void LIZ(long j) {
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.putLong("shotLastShowTime", j);
        edit.apply();
    }
}
