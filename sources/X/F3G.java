package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import java.util.HashSet;

/* loaded from: classes7.dex */
public class F3G implements Application.ActivityLifecycleCallbacks {
    public final java.util.Set<Integer> LJLIL = new HashSet();

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
    public final void onActivityStopped(Activity activity) {
    }

    public final void LIZ(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            if (!(!((HashSet) this.LJLIL).contains(Integer.valueOf(activity.hashCode())))) {
                return;
            }
            ((HashSet) this.LJLIL).add(Integer.valueOf(activity.hashCode()));
            Window window = activity.getWindow();
            window.setCallback(new Z9R(window.getCallback()));
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ((HashSet) this.LJLIL).remove(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        LIZ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        LIZ(activity);
    }
}
