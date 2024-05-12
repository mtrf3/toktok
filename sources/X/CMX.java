package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CMX {
    public final Context LIZ;

    public final C42125Gg5 LIZ() {
        Object LLILL = C16880lQ.LLILL(this.LIZ, "activity");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) LLILL;
        C42125Gg5 c42125Gg5 = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.LIZ.getPackageName(), 0, 1);
                o.LJIIIIZZ(historicalProcessExitReasons, "am.getHistoricalProcessE…ontext.packageName, 0, 1)");
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) ORZ.LJLLLL(historicalProcessExitReasons);
                if (applicationExitInfo != null) {
                    String description = applicationExitInfo.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    int reason = applicationExitInfo.getReason();
                    long timestamp = applicationExitInfo.getTimestamp();
                    int importance = applicationExitInfo.getImportance();
                    String processName = applicationExitInfo.getProcessName();
                    o.LJIIIIZZ(processName, "info.processName");
                    String applicationExitInfo2 = applicationExitInfo.toString();
                    o.LJIIIIZZ(applicationExitInfo2, "info.toString()");
                    c42125Gg5 = new C42125Gg5(reason, description, processName, timestamp, applicationExitInfo2, importance);
                }
            } catch (Throwable unused) {
            }
        }
        return c42125Gg5;
    }

    public CMX(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }
}
