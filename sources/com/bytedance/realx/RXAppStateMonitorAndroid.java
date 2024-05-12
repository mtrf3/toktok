package com.bytedance.realx;

import X.C16880lQ;
import X.X1D;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes33.dex */
public class RXAppStateMonitorAndroid implements Application.ActivityLifecycleCallbacks {
    public Context mContext;
    public boolean mIsBackground;
    public long nativeMonitor;
    public final String TAG = "ASMonitorAndroid";
    public final Set<Integer> mStartedActivitySet = new HashSet();
    public final Set<Integer> mPausedActivitySet = new HashSet();

    private synchronized boolean getState() {
        return this.mIsBackground;
    }

    private native void nativeOnStateChange(long j, boolean z);

    private synchronized void reset() {
        this.nativeMonitor = 0L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public RXAppStateMonitorAndroid(long j) {
        this.nativeMonitor = 0L;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        if (applicationContext == null) {
            RXLogging.e("ASMonitorAndroid", "context is null.");
            return;
        }
        Context LLLLL = C16880lQ.LLLLL(applicationContext);
        this.mContext = LLLLL;
        this.nativeMonitor = j;
        if (LLLLL instanceof Application) {
            ((Application) LLLLL).registerActivityLifecycleCallbacks(this);
        } else {
            RXLogging.e("ASMonitorAndroid", "context not a Application obj.");
        }
        this.mIsBackground = checkBackground(this.mContext);
    }

    private boolean checkBackground(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
            if (activityManager == null) {
                RXLogging.e("ASMonitorAndroid", "activityManager is null.");
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                RXLogging.e("ASMonitorAndroid", "processInfoList is null.");
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Get App background state failed. ");
            LIZ.append(e);
            RXLogging.e("ASMonitorAndroid", X1D.LIZIZ(LIZ));
            return false;
        }
    }

    private synchronized void onStateChange(boolean z) {
        if (z == this.mIsBackground) {
            return;
        }
        this.mIsBackground = z;
        long j = this.nativeMonitor;
        if (j != 0) {
            nativeOnStateChange(j, z);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.mPausedActivitySet.add(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mStartedActivitySet.add(Integer.valueOf(activity.hashCode()));
        onStateChange(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.mStartedActivitySet.add(Integer.valueOf(activity.hashCode()));
        onStateChange(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r4.mStartedActivitySet.size() == 0) goto L6;
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityStopped(android.app.Activity r5) {
        /*
            r4 = this;
            int r3 = r5.hashCode()
            boolean r2 = r4.mIsBackground
            java.util.Set<java.lang.Integer> r1 = r4.mStartedActivitySet
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L31
            java.util.Set<java.lang.Integer> r1 = r4.mStartedActivitySet
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.remove(r0)
            java.util.Set<java.lang.Integer> r0 = r4.mStartedActivitySet
            int r0 = r0.size()
            if (r0 != 0) goto L5c
        L23:
            r2 = 1
        L24:
            r4.onStateChange(r2)
            java.util.Set<java.lang.Integer> r1 = r4.mPausedActivitySet
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.remove(r0)
            return
        L31:
            java.util.Set<java.lang.Integer> r0 = r4.mStartedActivitySet
            int r0 = r0.size()
            if (r0 != 0) goto L5c
            java.util.Set<java.lang.Integer> r1 = r4.mPausedActivitySet
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L46
            goto L23
        L46:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "started set not contain activity"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "ASMonitorAndroid"
            com.bytedance.realx.base.RXLogging.w(r0, r1)
            goto L24
        L5c:
            r2 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXAppStateMonitorAndroid.onActivityStopped(android.app.Activity):void");
    }
}
