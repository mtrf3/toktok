package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public class ServiceLifecycleDispatcher {
    public final Handler mHandler = new Handler();
    public DispatchRunnable mLastDispatchRunnable;
    public final LifecycleRegistry mRegistry;

    /* loaded from: classes.dex */
    public static class DispatchRunnable implements Runnable {
        public final Lifecycle.Event mEvent;
        public final LifecycleRegistry mRegistry;
        public boolean mWasExecuted;

        @Override // java.lang.Runnable
        public void run() {
            androidx_lifecycle_ServiceLifecycleDispatcher$DispatchRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void androidx_lifecycle_ServiceLifecycleDispatcher$DispatchRunnable__run$___twin___() {
            if (!this.mWasExecuted) {
                this.mRegistry.handleLifecycleEvent(this.mEvent);
                this.mWasExecuted = true;
            }
        }

        public static void androidx_lifecycle_ServiceLifecycleDispatcher$DispatchRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(DispatchRunnable dispatchRunnable) {
            boolean LIZ;
            try {
                dispatchRunnable.androidx_lifecycle_ServiceLifecycleDispatcher$DispatchRunnable__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public DispatchRunnable(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
            this.mRegistry = lifecycleRegistry;
            this.mEvent = event;
        }
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public Lifecycle getLifecycle() {
        return this.mRegistry;
    }

    public ServiceLifecycleDispatcher(LifecycleOwner lifecycleOwner) {
        this.mRegistry = new LifecycleRegistry(lifecycleOwner);
    }

    private void postDispatchRunnable(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.mLastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.mRegistry, event);
        this.mLastDispatchRunnable = dispatchRunnable2;
        this.mHandler.postAtFrontOfQueue(dispatchRunnable2);
    }
}
