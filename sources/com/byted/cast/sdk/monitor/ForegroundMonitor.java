package com.byted.cast.sdk.monitor;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.byted.cast.sdk.utils.Logger;

/* loaded from: classes29.dex */
public class ForegroundMonitor implements Application.ActivityLifecycleCallbacks {
    public static volatile ForegroundMonitor sInstance;
    public int activeCount;
    public ForegroundListener mListener;

    /* loaded from: classes29.dex */
    public interface ForegroundListener {
        void onIntoBackground();

        void onIntoForeground();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public ForegroundMonitor(ForegroundListener foregroundListener) {
        this.mListener = foregroundListener;
    }

    public static ForegroundMonitor getInstance(ForegroundListener foregroundListener) {
        if (sInstance == null) {
            synchronized (ForegroundMonitor.class) {
                if (sInstance == null) {
                    sInstance = new ForegroundMonitor(foregroundListener);
                }
            }
        }
        return sInstance;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.activeCount == 0) {
            Logger.i("ForegroundMonitor", "Into foreground.");
            ForegroundListener foregroundListener = this.mListener;
            if (foregroundListener != null) {
                foregroundListener.onIntoForeground();
            }
        }
        this.activeCount++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = this.activeCount - 1;
        this.activeCount = i;
        if (i == 0) {
            Logger.i("ForegroundMonitor", "Into background.");
            ForegroundListener foregroundListener = this.mListener;
            if (foregroundListener != null) {
                foregroundListener.onIntoBackground();
            }
        }
    }

    public static void deinit(Application application, ForegroundListener foregroundListener) {
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(getInstance(foregroundListener));
        }
    }

    public static void init(Application application, ForegroundListener foregroundListener) {
        if (application != null) {
            application.registerActivityLifecycleCallbacks(getInstance(foregroundListener));
        }
    }
}
