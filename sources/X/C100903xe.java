package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.3xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100903xe implements Application.ActivityLifecycleCallbacks {
    public final HashSet<Integer> LJLIL = new HashSet<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    public final void LIZ(Activity activity) {
        if (activity == null || this.LJLIL.contains(Integer.valueOf(activity.hashCode()))) {
            return;
        }
        this.LJLIL.add(Integer.valueOf(activity.hashCode()));
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        o.LJIIIIZZ(callback, "callback");
        window.setCallback(new Z9P(callback));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attach window callback ");
        LIZ.append(activity.getComponentName());
        C34B.LIZIZ("IMChatPerfLogger", X1D.LIZIZ(LIZ));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.remove(Integer.valueOf(activity.hashCode()));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("remove window callback ");
        LIZ.append(activity.getComponentName());
        C34B.LIZIZ("IMChatPerfLogger", X1D.LIZIZ(LIZ));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LIZ(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        LIZ(activity);
    }
}
