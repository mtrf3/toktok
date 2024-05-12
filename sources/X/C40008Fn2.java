package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;

/* renamed from: X.Fn2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40008Fn2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ RegisterLifecycle LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C40008Fn2(RegisterLifecycle registerLifecycle) {
        this.LJLIL = registerLifecycle;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(activity);
        LIZ.append(" onDestroyed");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", X1D.LIZIZ(LIZ));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        StringBuilder LIZ = X1D.LIZ();
        this.LJLIL.getClass();
        LIZ.append(RegisterLifecycle.LIZLLL(activity));
        LIZ.append(" onPaused");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", X1D.LIZIZ(LIZ));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        StringBuilder LIZ = X1D.LIZ();
        this.LJLIL.getClass();
        LIZ.append(RegisterLifecycle.LIZLLL(activity));
        LIZ.append(" onResumed");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", X1D.LIZIZ(LIZ));
        if (C35044DpA.LIZ()) {
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        StringBuilder LIZ = X1D.LIZ();
        this.LJLIL.getClass();
        LIZ.append(RegisterLifecycle.LIZLLL(activity));
        LIZ.append(" onStarted");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", X1D.LIZIZ(LIZ));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        StringBuilder LIZ = X1D.LIZ();
        this.LJLIL.getClass();
        LIZ.append(RegisterLifecycle.LIZLLL(activity));
        LIZ.append(" onStopped");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", X1D.LIZIZ(LIZ));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        StringBuilder LIZ = X1D.LIZ();
        this.LJLIL.getClass();
        LIZ.append(RegisterLifecycle.LIZLLL(activity));
        LIZ.append(" onCreated");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", X1D.LIZIZ(LIZ));
    }
}
