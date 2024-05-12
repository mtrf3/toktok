package X;

import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.PId, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64215PId implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C64272PKi.LIZLLL(activity, 5);
        C64222PIk LIZ = C64222PIk.LIZ();
        LIZ.getClass();
        C64214PIc.LIZ().LIZ(new ARunnableS47S0100000_11(LIZ, 97));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C64272PKi.LIZLLL(activity, 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C64272PKi.LIZLLL(activity, 2);
        C64222PIk LIZ = C64222PIk.LIZ();
        LIZ.getClass();
        C64214PIc.LIZ().LIZ(new ARunnableS47S0100000_11(LIZ, 97));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C64272PKi.LIZLLL(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C64272PKi.LIZLLL(activity, 4);
        C64222PIk LIZ = C64222PIk.LIZ();
        LIZ.getClass();
        C64214PIc.LIZ().LIZ(new ARunnableS47S0100000_11(LIZ, 97));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C64272PKi.LIZLLL(activity, 0);
    }
}
