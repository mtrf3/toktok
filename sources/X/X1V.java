package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X1V implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ AccessibilityEventTrackingMonitor LJLIL;

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
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    public X1V(AccessibilityEventTrackingMonitor accessibilityEventTrackingMonitor) {
        this.LJLIL = accessibilityEventTrackingMonitor;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.stopListen(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.startListen(activity);
    }
}
