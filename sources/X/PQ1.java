package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes12.dex */
public class PQ1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ PQ0 LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public PQ1(PQ0 pq0) {
        this.LJLIL = pq0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.LJLIL.LIZ.remove(activity);
        this.LJLIL.LIZIZ(activity, "onActivityDestroy");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.LJLIL.LIZ.add(activity, Lifecycle.Event.ON_PAUSE);
        this.LJLIL.LIZIZ(activity, "onActivityPause");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.LJLIL.LIZ.add(activity, Lifecycle.Event.ON_RESUME);
        this.LJLIL.LIZIZ(activity, "onActivityResume");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.LJLIL.LIZ.add(activity, Lifecycle.Event.ON_START);
        this.LJLIL.LIZIZ(activity, "onActivityStart");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.LJLIL.LIZ.add(activity, Lifecycle.Event.ON_STOP);
        this.LJLIL.LIZIZ(activity, "onActivityStop");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.LJLIL.LIZ.add(activity, Lifecycle.Event.ON_CREATE);
        this.LJLIL.LIZIZ(activity, "onActivityCreate");
    }
}
