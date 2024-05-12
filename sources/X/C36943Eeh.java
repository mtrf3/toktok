package X;

import Y.ARunnableS42S0100000_6;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Eeh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36943Eeh implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ Application LJLIL;
    public final /* synthetic */ ExecutorService LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

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
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.LJLIL.unregisterActivityLifecycleCallbacks(this);
        this.LJLILLLLZI.execute(new ARunnableS42S0100000_6(this, 106));
    }

    public C36943Eeh(Application application, int i, ExecutorService executorService) {
        this.LJLIL = application;
        this.LJLILLLLZI = executorService;
        this.LJLJI = i;
    }
}
