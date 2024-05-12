package X;

import android.app.Application;
import android.content.Context;

/* loaded from: classes7.dex */
public final class FPI {
    public static volatile boolean LIZ;

    public static void LIZ(Context context, boolean z) {
        if (FPH.LIZ == null) {
            if (context instanceof Application) {
                FPH.LIZ = context;
            } else if (C16880lQ.LLLLL(context) != null) {
                FPH.LIZ = C16880lQ.LLLLL(context);
            } else {
                FPH.LIZ = context;
            }
        }
        LIZ = true;
    }
}
