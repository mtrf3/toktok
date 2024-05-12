package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FY9 implements Application.ActivityLifecycleCallbacks {
    public int LJLIL;
    public FYH LJLILLLLZI;
    public boolean LJLJI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        FYA LIZIZ = C39144FXw.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZIZ.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        FYA LIZIZ = C39144FXw.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZIZ.get(Integer.valueOf(activity.hashCode()));
            FYB fyb = LIZIZ.LIZIZ.get(Integer.valueOf(activity.hashCode()));
            if (fyb != null) {
                FYF fyf = fyb.LIZIZ;
                if (fyf != null) {
                    fyf.LIZ(true);
                }
                FYF fyf2 = fyb.LIZLLL;
                if (fyf2 != null) {
                    fyf2.LIZ(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        FYA LIZIZ = C39144FXw.LIZIZ();
        if (LIZIZ != null) {
            FYB fyb = LIZIZ.LIZIZ.get(Integer.valueOf(activity.hashCode()));
            if (fyb != null) {
                FYF fyf = fyb.LIZIZ;
                if (fyf != null) {
                    fyf.LIZ(false);
                }
                FYF fyf2 = fyb.LIZLLL;
                if (fyf2 != null) {
                    fyf2.LIZ(false);
                }
                LIZIZ.LIZJ = fyb;
            }
            LIZIZ.LIZLLL = new WeakReference<>(activity);
            FYH fyh = LIZIZ.LJ;
            if (fyh != null) {
                fyh.LJII();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        int i = this.LJLIL + 1;
        this.LJLIL = i;
        if (i > 0 && this.LJLJI) {
            FYH fyh = this.LJLILLLLZI;
            if (fyh != null) {
                fyh.LIZJ(FYC.STATE_FOREGROUND);
            }
            this.LJLJI = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        int i = this.LJLIL - 1;
        this.LJLIL = i;
        if (i == 0) {
            FYH fyh = this.LJLILLLLZI;
            if (fyh != null) {
                fyh.LIZJ(FYC.STATE_BACKGROUND);
            }
            this.LJLJI = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z;
        o.LJIIIZ(activity, "activity");
        FYA LIZIZ = C39144FXw.LIZIZ();
        if (LIZIZ != null && !LIZIZ.LIZIZ.contains(Integer.valueOf(activity.hashCode()))) {
            ConcurrentHashMap<Integer, FYB> concurrentHashMap = LIZIZ.LIZIZ;
            Integer valueOf = Integer.valueOf(activity.hashCode());
            BPR LIZ = C39144FXw.LIZ();
            if (LIZ != null) {
                z = LIZ.LIZJ;
            } else {
                z = true;
            }
            FYB fyb = new FYB(z);
            String LJLLILLLL = C16880lQ.LJLLILLLL(activity.getClass());
            if (LJLLILLLL == null) {
                LJLLILLLL = "";
            }
            fyb.LIZIZ = new FYF(ujb.o.LJJJJZ(LJLLILLLL, "Activity", "", false), ujb.o.LJJJJZ(C16880lQ.LJLLJ(activity.getClass()), "Activity", "", false));
            concurrentHashMap.put(valueOf, fyb);
        }
    }
}
