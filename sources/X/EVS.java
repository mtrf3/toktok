package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;

/* loaded from: classes7.dex */
public final class EVS {
    public static int LIZ;
    public static int LIZIZ;
    public static volatile boolean LIZJ;

    public static synchronized void LIZ(Context context) {
        synchronized (EVS.class) {
            if (context != null) {
                if (!EUT.LIZIZ() && !EUT.LIZJ()) {
                    if (LIZJ) {
                        return;
                    }
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    LIZ = Build.VERSION.SDK_INT;
                    LIZIZ = applicationInfo.targetSdkVersion;
                    LIZJ = true;
                    return;
                }
            }
            LIZJ = false;
        }
    }
}
