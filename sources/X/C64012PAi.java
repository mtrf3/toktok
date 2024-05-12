package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.PAi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64012PAi {
    public final SharedPreferences LIZ;

    public C64012PAi(Context context) {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    String LJJZ = V1B.LJJZ(context);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("monitor_downgrade");
                    LIZ.append(LJJZ);
                    this.LIZ = F9J.LIZIZ(context, 0, X1D.LIZIZ(LIZ));
                }
            }
        }
    }
}
