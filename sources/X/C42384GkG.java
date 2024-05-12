package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.GkG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42384GkG implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C42383GkF LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C42384GkG(C42383GkF c42383GkF) {
        this.LJLIL = c42383GkF;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C42383GkF c42383GkF = this.LJLIL;
        c42383GkF.getClass();
        c42383GkF.LIZJ(new C42381GkD(activity, (byte) 2));
        this.LJLIL.LIZ.remove(activity);
        this.LJLIL.getClass();
        if (C42383GkF.LIZIZ(activity)) {
            this.LJLIL.getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.LJLIL.LIZJ(new C42381GkD(activity, (byte) 5));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C42383GkF c42383GkF = this.LJLIL;
        int i = c42383GkF.LIZLLL + 1;
        c42383GkF.LIZLLL = i;
        if (i == 1) {
            c42383GkF.LIZLLL(1);
        }
        this.LJLIL.LIZJ(new C42381GkD(activity, (byte) 3));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C42383GkF c42383GkF = this.LJLIL;
        int i = c42383GkF.LIZLLL - 1;
        c42383GkF.LIZLLL = i;
        if (i == 0) {
            c42383GkF.LIZLLL(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C42383GkF c42383GkF = this.LJLIL;
        c42383GkF.getClass();
        c42383GkF.LIZJ(new C42381GkD(activity, (byte) 1));
        this.LJLIL.LIZ.add(activity);
        this.LJLIL.getClass();
        if (C42383GkF.LIZIZ(activity)) {
            this.LJLIL.getClass();
        }
    }
}
