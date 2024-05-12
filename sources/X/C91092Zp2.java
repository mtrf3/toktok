package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.aweme.dsp.playerservice.NewDspPlayerService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Zp2, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91092Zp2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ NewDspPlayerService LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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

    public C91092Zp2(NewDspPlayerService newDspPlayerService) {
        this.LJLIL = newDspPlayerService;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Activity activity2;
        o.LJIIIZ(activity, "activity");
        WeakReference<Activity> weakReference = this.LJLIL.lastResumeRef;
        if (weakReference != null && (activity2 = weakReference.get()) != null && o.LJ(activity2, activity)) {
            this.LJLIL.lastResumeRef = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Activity activity2;
        o.LJIIIZ(activity, "activity");
        WeakReference<Activity> weakReference = this.LJLIL.lastResumeRef;
        if (weakReference != null && (activity2 = weakReference.get()) != null && !o.LJ(activity2, activity)) {
            return;
        }
        this.LJLIL.lastResumeRef = new WeakReference<>(activity);
        this.LJLIL.isActivityVisible = C91257Zrh.LIZIZ(activity);
        if (C91257Zrh.LIZIZ(activity)) {
            NewDspPlayerService newDspPlayerService = this.LJLIL;
            if (newDspPlayerService.isDspNodeVisible) {
                newDspPlayerService.play(new C91299ZsN("RESUME_FROM_CHANGE_TAB"), true);
                return;
            }
        }
        this.LJLIL.pause(new C91299ZsN("PAUSE_FROM_CHANGE_TAB"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.isActivityVisible = C91257Zrh.LIZIZ(activity);
        if (C91257Zrh.LIZIZ(activity)) {
            NewDspPlayerService newDspPlayerService = this.LJLIL;
            if (newDspPlayerService.isDspNodeVisible) {
                newDspPlayerService.play(new C91299ZsN("RESUME_FROM_ON_RESUME"), true);
                return;
            }
        }
        this.LJLIL.pause(new C91299ZsN("PAUSE_FROM_ON_PAUSE"));
    }
}
