package com.bytedance.common.push;

import X.InterfaceC64410PPq;
import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/* loaded from: classes12.dex */
public class ActivityLifecycleObserver extends Observable implements Application.ActivityLifecycleCallbacks, WeakHandler.IHandler {
    public static ActivityLifecycleObserver ins = null;
    public static boolean sIsBackGround = true;
    public static int sNumStarted;
    public WeakReference<Activity> mActivityRef;
    public boolean mAppActive;
    public InterfaceC64410PPq mLifeCycleListener;
    public Runnable mRunnable = new ARunnableS47S0100000_11(this, 17);
    public WeakHandler sHandler = new WeakHandler(this);
    public final List<Application.ActivityLifecycleCallbacks> mListener = new ArrayList();

    public void setAppStateChangedListener(InterfaceC64410PPq interfaceC64410PPq) {
    }

    private Object[] collectActivityLifecycleCallbacks() {
        Object[] objArr;
        synchronized (this.mListener) {
            if (this.mListener.size() > 0) {
                objArr = this.mListener.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    public static synchronized ActivityLifecycleObserver getIns() {
        ActivityLifecycleObserver activityLifecycleObserver;
        synchronized (ActivityLifecycleObserver.class) {
            if (ins == null) {
                ins = new ActivityLifecycleObserver();
            }
            activityLifecycleObserver = ins;
        }
        return activityLifecycleObserver;
    }

    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.mActivityRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean isApplicationActive() {
        return this.mAppActive;
    }

    public boolean isBackGround() {
        return sIsBackGround;
    }

    public void addActivityLifeCycleListener(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (activityLifecycleCallbacks == null) {
            return;
        }
        synchronized (this.mListener) {
            if (this.mListener.contains(activityLifecycleCallbacks)) {
                return;
            }
            this.mListener.add(activityLifecycleCallbacks);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what != 1 || !sIsBackGround) {
            return;
        }
        setChanged();
        notifyObservers(Boolean.valueOf(sIsBackGround));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.mAppActive) {
            this.sHandler.postDelayed(this.mRunnable, 30000L);
        }
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mActivityRef = new WeakReference<>(activity);
        if (!this.mAppActive) {
            this.mAppActive = true;
        }
        this.sHandler.removeCallbacks(this.mRunnable);
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
            }
        }
        this.sHandler.removeMessages(1);
        int i = sNumStarted;
        if (i == 0) {
            sIsBackGround = false;
        }
        sNumStarted = i + 1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
            }
        }
        int i = sNumStarted - 1;
        sNumStarted = i;
        if (i == 0) {
            sIsBackGround = true;
            this.sHandler.sendEmptyMessageDelayed(1, 30000L);
        }
    }

    public void removeActivityLifeCycleListener(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (activityLifecycleCallbacks == null) {
            return;
        }
        synchronized (this.mListener) {
            this.mListener.remove(activityLifecycleCallbacks);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        sIsBackGround = false;
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }
}
