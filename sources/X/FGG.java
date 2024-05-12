package X;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes7.dex */
public final class FGG {
    public static volatile String LIZ;
    public static volatile String LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;

    public static void LIZ(Context context) {
        if (!LIZJ) {
            synchronized (FGG.class) {
                if (!LIZJ) {
                    String packageName = context.getPackageName();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(packageName);
                    LIZ2.append(":push");
                    LIZ = X1D.LIZIZ(LIZ2);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(packageName);
                    LIZ3.append(":pushservice");
                    LIZIZ = X1D.LIZIZ(LIZ3);
                    LIZJ = true;
                }
            }
        }
    }

    public static void LIZIZ(Context context) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) C16880lQ.LLILL(context, "activity")).getRunningAppProcesses();
            LIZ(context);
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && !TextUtils.isEmpty(runningAppProcessInfo.processName) && (TextUtils.equals(runningAppProcessInfo.processName, LIZ) || TextUtils.equals(runningAppProcessInfo.processName, LIZIZ))) {
                        LJ = true;
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean LIZLLL(Context context) {
        if (!LIZLLL && !LJ) {
            synchronized (FGG.class) {
                if (!LIZLLL && !LJ) {
                    LIZIZ(context);
                }
                LIZLLL = true;
            }
        }
        return LJ;
    }

    public static boolean LIZJ(Context context, String str) {
        LIZ(context);
        if (!TextUtils.isEmpty(str) && (TextUtils.equals(LIZ, str) || TextUtils.equals(LIZIZ, str))) {
            return true;
        }
        return false;
    }
}
