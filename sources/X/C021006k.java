package X;

import Y.IDRunnableS29S0200000;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.06k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C021006k implements Application.ActivityLifecycleCallbacks {
    public Object LJLIL;
    public Activity LJLILLLLZI;
    public final int LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
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

    public C021006k(Activity activity) {
        this.LJLILLLLZI = activity;
        this.LJLJI = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.LJLILLLLZI == activity) {
            this.LJLILLLLZI = null;
            this.LJLJJL = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.LJLJJL && !this.LJLJJLL && !this.LJLJJI) {
            Object obj = this.LJLIL;
            int i = this.LJLJI;
            try {
                Object obj2 = C021106l.LIZJ.get(activity);
                if (obj2 == obj && activity.hashCode() == i) {
                    C021106l.LJI.postAtFrontOfQueue(new IDRunnableS29S0200000(C021106l.LIZIZ.get(activity), obj2, 3));
                    this.LJLJJLL = true;
                    this.LJLIL = null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.LJLILLLLZI == activity) {
            this.LJLJJI = true;
        }
    }
}
