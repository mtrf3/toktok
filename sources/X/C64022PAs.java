package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.PAs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64022PAs {
    public final SharedPreferences LIZ;

    public C64022PAs(Context context) {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = F9J.LIZIZ(context, 0, "monitor_downgrade");
                }
            }
        }
    }
}
