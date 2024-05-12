package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.AFy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25938AFy implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (C25937AFx.LIZIZ(activity.getComponentName().getClassName())) {
            synchronized (C25937AFx.LIZIZ) {
                if (C25937AFx.LIZ) {
                    C9QH.LIZIZ = Boolean.TRUE;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (C25937AFx.LIZIZ(activity.getComponentName().getClassName())) {
            synchronized (C25937AFx.LIZIZ) {
                if (C25937AFx.LIZ) {
                    C9QH.LIZIZ = Boolean.FALSE;
                }
            }
        }
    }
}
