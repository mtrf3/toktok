package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.PPs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64412PPs implements Application.ActivityLifecycleCallbacks {
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
    public final void onActivityDestroyed(Activity activity) {
        PEI.LIZ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (!PEI.LJII || !(activity instanceof ActivityC45651qj)) {
            return;
        }
        ((ActivityC45651qj) activity).getSupportFragmentManager().LJJLIL(new C64413PPt(), true);
    }
}
