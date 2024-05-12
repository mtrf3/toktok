package X;

import Y.ACallableS109S0100000_6;
import Y.ACallableS81S0101000_10;
import Y.ARunnableS42S0100000_6;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Fn3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40009Fn3 implements Application.ActivityLifecycleCallbacks {
    public Context LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
    public final void onActivityPaused(Activity activity) {
        C10K.LIZIZ(new ACallableS109S0100000_6((Object) activity, 18), FMX.LIZIZ(), null);
        this.LJLJI = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C10K.LIZIZ(new ACallableS81S0101000_10(2, activity, 0), FMX.LIZIZ(), null);
        this.LJLJI = true;
        Context LLLLJ = C16880lQ.LLLLJ(activity);
        if (this.LJLIL == null && LLLLJ != null) {
            this.LJLIL = LLLLJ;
            C38995FSd.LJ().scheduleAtFixedRate(new ARunnableS42S0100000_6(this, 132), 300L, 300L, TimeUnit.SECONDS);
        }
        LUX LIZIZ = LUX.LIZIZ();
        String name = activity.getClass().getName();
        if (TextUtils.equals(name, LIZIZ.LIZLLL)) {
            return;
        }
        LIZIZ.LJ = LIZIZ.LIZLLL;
        LIZIZ.LIZLLL = name;
        LIZIZ.LIZLLL();
    }
}
