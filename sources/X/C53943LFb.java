package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask;

/* renamed from: X.LFb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53943LFb implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ SysOptimizerTask LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

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
    public final void onActivityStopped(Activity activity) {
    }

    public C53943LFb(SysOptimizerTask sysOptimizerTask) {
        this.LJLIL = sysOptimizerTask;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.LJLIL.getClass();
        SysOptimizerTask.LJIIJJI(activity);
    }
}
