package X;

import Y.ARunnableS17S0201000_14;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class FAU implements Application.ActivityLifecycleCallbacks {
    public static boolean LJLJJL = true;
    public static boolean LJLJJLL;
    public static final java.util.Map<String, Object> LJLJL = new ConcurrentHashMap();
    public FAS LJLIL;
    public long LJLJI;
    public int LJLILLLLZI = 1;
    public final Handler LJLJJI = new Handler(C16880lQ.LLJJJJ());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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
    public final void onActivityResumed(Activity activity) {
        if (LJLJJLL) {
            this.LJLJJI.post(new ARunnableS17S0201000_14(3, this, activity, 15));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i;
        if (!LJLJJL) {
            return;
        }
        this.LJLJI = System.currentTimeMillis();
        if (LJLJJL) {
            i = 1;
        } else {
            i = 2;
        }
        this.LJLILLLLZI = i;
        LJLJJL = false;
        LJLJJLL = true;
    }
}
