package com.ss.android.vesdk;

import X.C16880lQ;
import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes7.dex */
public class TEMemMonitor {
    public ActivityManager mActivityManager;
    public Context mContext;

    private double getAvailMemorybyService() {
        this.mActivityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
        return r1.availMem;
    }

    private double getTotalMemorybyService() {
        this.mActivityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
        return r1.totalMem;
    }

    public double sample() {
        double availMemorybyService = getAvailMemorybyService();
        double totalMemorybyService = getTotalMemorybyService();
        if (totalMemorybyService == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return with2PointDouble(((totalMemorybyService - availMemorybyService) * 100.0d) / totalMemorybyService);
    }

    public TEMemMonitor(Context context) {
        this.mContext = context;
        this.mActivityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
    }

    private double with2PointDouble(double d) {
        return Math.round(d * 100.0d) / 100.0d;
    }
}
