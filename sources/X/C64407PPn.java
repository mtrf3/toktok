package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.PPn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64407PPn extends AbstractC64406PPm {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            C64409PPp.LIZIZ(activity);
        }
    }

    @Override // X.AbstractC64406PPm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            C64409PPp.LIZJ(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64409PPp.LIZIZ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64409PPp.LIZJ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64409PPp.LJFF(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64409PPp.LIZLLL(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64409PPp.LJ(activity);
    }

    @Override // X.AbstractC64406PPm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64409PPp.LIZLLL(activity);
    }

    @Override // X.AbstractC64406PPm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64409PPp.LJ(activity);
    }

    @Override // X.AbstractC64406PPm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            C64409PPp.LJFF(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C64409PPp.LIZ(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C64409PPp.LIZ(activity, bundle);
    }
}
