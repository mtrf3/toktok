package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFZ implements InterfaceC53942LFa {
    public static boolean LJLILLLLZI;
    public static final LFZ LJLIL = new LFZ();
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(LFL.LJLIL);

    public static InterfaceC53942LFa LIZ() {
        return (InterfaceC53942LFa) LJLJI.getValue();
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ().onActivityDestroyed(activity);
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ().onActivityPaused(activity);
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ().onActivityResumed(activity);
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ().onActivityStarted(activity);
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ().onActivityStopped(activity);
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C10K.LIZJ(new CallableC60997Nwn(activity));
        LIZ().onActivityCreated(activity, bundle);
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
        LIZ().onActivitySaveInstanceState(activity, outState);
    }

    @Override // X.InterfaceC53942LFa
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
        C10K.LIZJ(new CallableC60997Nwn(activity));
        LIZ().onConfigurationChanged(activity, newConfig);
    }
}
