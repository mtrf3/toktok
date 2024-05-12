package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K0N implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        SimRadar.keyScan("Activity", "onPause", C16880lQ.LJLLJ(activity.getClass()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        SimRadar.keyScan("Activity", "onResume", C16880lQ.LJLLJ(activity.getClass()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        String LJLLJ = C16880lQ.LJLLJ(activity.getClass());
        if (o.LJ("MainActivity", LJLLJ)) {
            SimRadar.keyScan("Activity", "onStart", LJLLJ);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        String LJLLJ = C16880lQ.LJLLJ(activity.getClass());
        if (o.LJ("MainActivity", LJLLJ)) {
            SimRadar.keyScan("Activity", "onStop", LJLLJ);
        }
    }
}
