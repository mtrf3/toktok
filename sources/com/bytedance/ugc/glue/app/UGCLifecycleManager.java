package com.bytedance.ugc.glue.app;

import X.X1Q;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ugc.glue.UGCViewUtils;
import com.bytedance.ugc.ugcwidget.UGCServiceManager;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes16.dex */
public class UGCLifecycleManager {
    public final HashMap<Activity, CopyOnWriteArrayList<UGCLifecycle>> map;

    /* loaded from: classes16.dex */
    public static abstract class CallbacksStub implements Application.ActivityLifecycleCallbacks {
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

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class UGCForegroundListener {
        public abstract void onChanged(boolean z);
    }

    /* loaded from: classes16.dex */
    public static abstract class UGCLifecycle4ViewHolder extends UGCLifecycle implements View.OnAttachStateChangeListener {
        public Activity activity;
        public boolean hasRegister;
        public View view;

        public Activity getActivity() {
            if (this.activity == null) {
                this.activity = UGCViewUtils.getActivity(this.view);
            }
            return this.activity;
        }

        public void register() {
            if (this.hasRegister) {
                return;
            }
            this.hasRegister = true;
            UGCLifecycleManager.addLifecycle(getActivity(), this);
        }

        public UGCLifecycle4ViewHolder(View view) {
            this.view = view;
            view.addOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            register();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            UGCLifecycleManager.removeLifecycle(this.activity, this);
            this.hasRegister = false;
        }
    }

    public static boolean isBackground() {
        UGCServiceManager.getService(X1Q.class).getClass();
        return false;
    }

    public UGCLifecycleManager() {
        this.map = new HashMap<>();
        throw null;
    }

    /* loaded from: classes16.dex */
    public static abstract class UGCLifecycle extends CallbacksStub {
        public static final UGCLifecycleManager singleton = new UGCLifecycleManager();

        @Override // com.bytedance.ugc.glue.app.UGCLifecycleManager.CallbacksStub, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            UGCLifecycleManager.removeLifecycle(activity, this);
        }
    }

    public static void addForegroundListener(UGCForegroundListener uGCForegroundListener) {
        UGCServiceManager.getService(X1Q.class).getClass();
    }

    public static void removeForegroundListener(UGCForegroundListener uGCForegroundListener) {
        UGCServiceManager.getService(X1Q.class).getClass();
    }

    public static void addLifecycle(Activity activity, UGCLifecycle uGCLifecycle) {
        if (activity == null || uGCLifecycle == null || activity.isFinishing()) {
            return;
        }
        UGCLifecycleManager uGCLifecycleManager = UGCLifecycle.singleton;
        CopyOnWriteArrayList<UGCLifecycle> copyOnWriteArrayList = uGCLifecycleManager.map.get(activity);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            uGCLifecycleManager.map.put(activity, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(uGCLifecycle);
    }

    public static void removeLifecycle(Activity activity, UGCLifecycle uGCLifecycle) {
        if (activity != null && uGCLifecycle != null) {
            UGCLifecycleManager uGCLifecycleManager = UGCLifecycle.singleton;
            CopyOnWriteArrayList<UGCLifecycle> copyOnWriteArrayList = uGCLifecycleManager.map.get(activity);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(uGCLifecycle);
                if (copyOnWriteArrayList.size() == 0) {
                    uGCLifecycleManager.map.remove(activity);
                }
            }
        }
    }
}
