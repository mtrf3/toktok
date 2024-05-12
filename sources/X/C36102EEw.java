package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EEw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36102EEw implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C36098EEs LJLIL;

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
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    public C36102EEw(C36098EEs c36098EEs) {
        this.LJLIL = c36098EEs;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        ((HashMap) this.LJLIL.LIZLLL).remove(activity.getClass());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        ((HashMap) this.LJLIL.LIZLLL).put(activity.getClass(), new WeakReference(activity));
    }
}
