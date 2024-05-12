package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.ies.safemode.SmartProtected.utils.logger.LLog;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FIJ {
    public static int LIZ(Context context) {
        try {
            Object LLILL = C16880lQ.LLILL(context, "activity");
            if (LLILL != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) LLILL).getRunningAppProcesses();
                o.LJFF(runningAppProcesses, "am.runningAppProcesses");
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (o.LJ("com.ss.android.ugc.aweme", runningAppProcessInfo.processName) || o.LJ("com.ss.android.ugc.aweme.lite", runningAppProcessInfo.processName)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("main process pid is ");
                        LIZ.append(runningAppProcessInfo.pid);
                        String msg = X1D.LIZIZ(LIZ);
                        o.LJIIJ(msg, "msg");
                        return runningAppProcessInfo.pid;
                    }
                }
                return -1;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.app.ActivityManager");
        } catch (Throwable th) {
            LLog.LIZIZ("FastBoot_ProcessUtils", th, "getMainProcessPid failed ", new Object[0]);
            return -1;
        }
    }
}
