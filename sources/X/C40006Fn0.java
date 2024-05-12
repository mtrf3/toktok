package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.splash.SplashActivity;

/* renamed from: X.Fn0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40006Fn0 implements Application.ActivityLifecycleCallbacks {
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
        if (C38987FRv.LIZLLL().booleanValue()) {
            return;
        }
        C118554l1.LIZ().getClass();
        C78694UuY.LIZ().onActivityResumed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C36531EVj.LIZ && !(activity instanceof MainActivity) && !(activity instanceof SplashActivity)) {
            C35810E3q.LJ(C36531EVj.LJIIIZ * 1000);
        }
        boolean z = activity instanceof MainActivity;
        if (!z && !(activity instanceof SplashActivity)) {
            int i = C92J.LIZ.LIZJ;
            if (i == 1) {
                if (C96J.LIZJ) {
                    C35810E3q.LJIIIZ(5000, C25645A4r.LIZ);
                }
            } else if (i == 2) {
                if (C96I.LIZJ) {
                    C35810E3q.LJIIIZ(5000, C25644A4q.LIZ);
                }
            } else if (i == 3 && C96H.LIZJ) {
                C35810E3q.LJIIIZ(5000, null);
            }
        }
        if (C34937DnR.LIZ && !z && !(activity instanceof SplashActivity)) {
            C35810E3q.LJFF(5000L);
        }
        if (C35214Dru.LIZJ && !z && !(activity instanceof SplashActivity)) {
            C35810E3q.LJIIJJI(5000L);
        }
        if (activity instanceof ActivityC86117Xqz) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
            activityC45651qj.getLifecycle().addObserver(new AnalysisActivityComponent(activityC45651qj));
            IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
            if (publishService.isParallelPublishContinue()) {
                if (!publishService.isCreativeToolsActivity(activityC45651qj)) {
                    activityC45651qj.getLifecycle().addObserver(new EventActivityComponent(activityC45651qj));
                }
            } else {
                activityC45651qj.getLifecycle().addObserver(new EventActivityComponent(activityC45651qj));
            }
        }
        if (activity instanceof ActivityC45651qj) {
            ((ActivityC45651qj) activity).getSupportFragmentManager().LJJLIL(new C64415PPv(), true);
        }
        C38985FRt.LIZIZ.LIZ();
    }
}
