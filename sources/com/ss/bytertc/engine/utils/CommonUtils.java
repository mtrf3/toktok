package com.ss.bytertc.engine.utils;

import X.C16880lQ;
import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* loaded from: classes33.dex */
public class CommonUtils {
    public static boolean isInForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }
}
