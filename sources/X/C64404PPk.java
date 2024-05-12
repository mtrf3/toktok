package X;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.PPk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64404PPk extends AbstractC64406PPm {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64403PPj.LIZ(activity);
    }

    @Override // X.AbstractC64406PPm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64403PPj.LIZIZ(activity);
    }

    @Override // X.AbstractC64406PPm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64403PPj.LIZIZ(activity);
    }

    @Override // X.AbstractC64406PPm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C64403PPj.LIZ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C64403PPj.LIZIZ(activity);
    }
}
