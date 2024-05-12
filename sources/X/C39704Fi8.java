package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;

/* renamed from: X.Fi8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39704Fi8 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        InterfaceC39710FiE interfaceC39710FiE = C39707FiB.LJ;
        if (interfaceC39710FiE != null) {
            interfaceC39710FiE.getClass();
            if (C35728E0m.LIZ) {
                if (C35728E0m.LIZLLL) {
                    String LJLLJ = C16880lQ.LJLLJ(activity.getClass());
                    if (!"MainActivity".equals(LJLLJ) && !"DetailActivity".equals(LJLLJ)) {
                        return;
                    }
                }
                Window.Callback callback = activity.getWindow().getCallback();
                if (callback != null) {
                    activity.getWindow().setCallback(new C39705Fi9(callback));
                }
                activity.getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC39706FiA());
            }
        }
    }
}
