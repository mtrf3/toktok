package com.bytedance.apm.core;

import X.InterfaceC64217PIf;
import X.InterfaceC64218PIg;
import X.X1D;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.services.apm.api.IActivityLifeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class ActivityLifeObserver implements Application.ActivityLifecycleCallbacks, IActivityLifeManager {
    public static final ActivityLifeObserver mInstance = new ActivityLifeObserver();
    public boolean mChangingConfigActivity;
    public String mCurActivityHash;
    public int mFrontActivityCount;
    public boolean mIsFrontV2;
    public WeakReference<Activity> mTopActivityRef;
    public ArrayList<InterfaceC64217PIf> mObservers = new ArrayList<>(8);
    public ArrayList<InterfaceC64218PIg> mLifecycleObservers = new ArrayList<>(8);
    public String mTopActivityClassName = null;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private Object[] collectObservers() {
        Object[] objArr;
        synchronized (this.mObservers) {
            if (this.mObservers.size() > 0) {
                objArr = this.mObservers.toArray();
            } else {
                objArr = null;
            }
        }
        if (objArr == null) {
            return new Object[0];
        }
        return objArr;
    }

    public String getTopActivityClassName() {
        WeakReference<Activity> weakReference = this.mTopActivityRef;
        String str = "";
        if (weakReference == null) {
            return "";
        }
        Activity activity = weakReference.get();
        if (activity != null && (str = this.mTopActivityClassName) == null) {
            return activity.getClass().getName();
        }
        return str;
    }

    public static ActivityLifeObserver getInstance() {
        return mInstance;
    }

    public WeakReference<Activity> getTopActivityRef() {
        return this.mTopActivityRef;
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public boolean isForeground() {
        return this.mIsFrontV2;
    }

    public boolean isV2Foreground() {
        return this.mIsFrontV2;
    }

    private String getActivityHash(Activity activity) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(activity.getClass().getName());
        LIZ.append(activity.hashCode());
        return X1D.LIZIZ(LIZ);
    }

    public static void init(Application application) {
        mInstance.initWithApp(application);
    }

    private void initWithApp(Application application) {
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    private void notifyBackground(Activity activity) {
        for (Object obj : collectObservers()) {
            ((InterfaceC64217PIf) obj).LJII(activity);
        }
        Iterator<InterfaceC64218PIg> it = this.mLifecycleObservers.iterator();
        while (it.hasNext()) {
            it.next().onBackground();
        }
    }

    private void notifyFront(Activity activity) {
        for (Object obj : collectObservers()) {
            ((InterfaceC64217PIf) obj).LIZJ(activity);
        }
        Iterator<InterfaceC64218PIg> it = this.mLifecycleObservers.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (getActivityHash(activity).equals(this.mCurActivityHash)) {
            this.mCurActivityHash = null;
        }
        Iterator<InterfaceC64218PIg> it = this.mLifecycleObservers.iterator();
        while (it.hasNext()) {
            it.next().onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        for (Object obj : collectObservers()) {
            ((InterfaceC64217PIf) obj).LIZLLL(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mTopActivityRef = new WeakReference<>(activity);
        this.mTopActivityClassName = null;
        Object[] collectObservers = collectObservers();
        for (Object obj : collectObservers) {
            ((InterfaceC64217PIf) obj).LJI(activity);
        }
        String activityHash = getActivityHash(activity);
        if (!activityHash.equals(this.mCurActivityHash)) {
            for (Object obj2 : collectObservers) {
                ((InterfaceC64217PIf) obj2).LJFF(activity);
            }
            this.mCurActivityHash = activityHash;
        }
        Iterator<InterfaceC64218PIg> it = this.mLifecycleObservers.iterator();
        while (it.hasNext()) {
            it.next().onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        for (Object obj : collectObservers()) {
            ((InterfaceC64217PIf) obj).onActivityStarted(activity);
        }
        if (this.mChangingConfigActivity) {
            this.mChangingConfigActivity = false;
            return;
        }
        int i = this.mFrontActivityCount + 1;
        this.mFrontActivityCount = i;
        if (i == 1) {
            this.mIsFrontV2 = true;
            notifyFront(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.mChangingConfigActivity = true;
            return;
        }
        int i = this.mFrontActivityCount - 1;
        this.mFrontActivityCount = i;
        if (i == 0) {
            this.mIsFrontV2 = false;
            notifyBackground(activity);
        }
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public void register(InterfaceC64217PIf interfaceC64217PIf) {
        ArrayList<InterfaceC64217PIf> arrayList = this.mObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mObservers.add(interfaceC64217PIf);
            }
        }
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public void unregister(InterfaceC64217PIf interfaceC64217PIf) {
        ArrayList<InterfaceC64217PIf> arrayList = this.mObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mObservers.remove(interfaceC64217PIf);
            }
        }
    }

    public void register(InterfaceC64218PIg interfaceC64218PIg) {
        ArrayList<InterfaceC64218PIg> arrayList = this.mLifecycleObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mLifecycleObservers.add(interfaceC64218PIg);
            }
        }
    }

    public void unregister(InterfaceC64218PIg interfaceC64218PIg) {
        ArrayList<InterfaceC64218PIg> arrayList = this.mLifecycleObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mLifecycleObservers.remove(interfaceC64218PIg);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : collectObservers()) {
            ((InterfaceC64217PIf) obj).onActivityCreated(activity, bundle);
        }
        Iterator<InterfaceC64218PIg> it = this.mLifecycleObservers.iterator();
        while (it.hasNext()) {
            it.next().LIZ(activity);
        }
    }
}
