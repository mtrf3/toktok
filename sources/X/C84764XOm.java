package X;

import Y.ARunnableS51S0100000_15;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.o;

/* renamed from: X.XOm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84764XOm implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ Application LJLIL;

    public C84764XOm(Application application) {
        this.LJLIL = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        String str;
        o.LJIIIZ(activity, "activity");
        StringBuilder LIZ = X1D.LIZ();
        ComponentName componentName = activity.getComponentName();
        String str2 = null;
        if (componentName != null) {
            str = componentName.getClassName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" destroyed.");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        ComponentName componentName2 = activity.getComponentName();
        if (componentName2 != null) {
            str2 = componentName2.getClassName();
        }
        C0MT.LJ(LIZ2, str2, " destroyed.", LIZ2);
        if (activity instanceof InterfaceC40262Fr8) {
            C84763XOl.LJIIL = false;
        }
        C84763XOl.LJI.onNext(activity);
        if (C84763XOl.LJIILIIL == 0) {
            C84763XOl.LJIIIZ.onNext(this.LJLIL);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String str;
        String str2;
        o.LJIIIZ(activity, "activity");
        StringBuilder LIZ = X1D.LIZ();
        ComponentName componentName = activity.getComponentName();
        if (componentName != null) {
            str = componentName.getClassName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" paused.");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        ComponentName componentName2 = activity.getComponentName();
        if (componentName2 != null) {
            str2 = componentName2.getClassName();
        } else {
            str2 = null;
        }
        C0MT.LJ(LIZ2, str2, " paused.", LIZ2);
        EFU efu = C84763XOl.LJIIZILJ;
        if (efu != null && efu.LIZ(activity)) {
            C84763XOl.LJIIJ(null);
        }
        C84763XOl.LJ.onNext(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String str;
        o.LJIIIZ(activity, "activity");
        StringBuilder LIZ = X1D.LIZ();
        ComponentName componentName = activity.getComponentName();
        String str2 = null;
        if (componentName != null) {
            str = componentName.getClassName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" resumed.");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        ComponentName componentName2 = activity.getComponentName();
        if (componentName2 != null) {
            str2 = componentName2.getClassName();
        }
        C0MT.LJ(LIZ2, str2, " resumed.", LIZ2);
        EFU efu = C84763XOl.LJIIZILJ;
        if (efu != null && efu.LIZ(activity)) {
            C84763XOl.LJIIJ(activity);
        }
        C84763XOl.LIZLLL.onNext(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        String str;
        o.LJIIIZ(activity, "activity");
        StringBuilder LIZ = X1D.LIZ();
        ComponentName componentName = activity.getComponentName();
        if (componentName != null) {
            str = componentName.getClassName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" started.");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", X1D.LIZIZ(LIZ));
        int i = C84763XOl.LJIILIIL + 1;
        C84763XOl.LJIILIIL = i;
        if (i == 1) {
            C84763XOl.LJIILL = System.currentTimeMillis();
            if (EF7.LJIILL > 0 && C84763XOl.LJIILLIIL > 2) {
                if (C84763XOl.LJIIJJI) {
                    C84763XOl.LJIIJJI = false;
                    C84763XOl.LJIIIIZZ.onNext(Boolean.valueOf(C84763XOl.LJIIJJI));
                    C84763XOl.LJIIJ.onNext(new C78495UrL(activity, C84763XOl.LJIIJJI));
                }
            } else {
                C84763XOl.LJIIJJI = false;
                C84763XOl.LJIIIIZZ.onNext(Boolean.valueOf(C84763XOl.LJIIJJI));
                C84763XOl.LJIIJ.onNext(new C78495UrL(activity, C84763XOl.LJIIJJI));
            }
        }
        C84763XOl.LIZJ.onNext(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        String str;
        o.LJIIIZ(activity, "activity");
        StringBuilder LIZ = X1D.LIZ();
        ComponentName componentName = activity.getComponentName();
        String str2 = null;
        if (componentName != null) {
            str = componentName.getClassName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" stopped.");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        ComponentName componentName2 = activity.getComponentName();
        if (componentName2 != null) {
            str2 = componentName2.getClassName();
        }
        C0MT.LJ(LIZ2, str2, " stopped.", LIZ2);
        int i = C84763XOl.LJIILIIL - 1;
        C84763XOl.LJIILIIL = i;
        if (i == 0) {
            C84763XOl.LJIILJJIL = System.currentTimeMillis();
            if (EF7.LJIILL > 0) {
                int i2 = C84763XOl.LJIILLIIL + 1;
                C84763XOl.LJIILLIIL = i2;
                if (i2 > 2) {
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS51S0100000_15(activity, 79), EF7.LJIILL);
                }
            }
            C84763XOl.LJIIJJI = true;
            C84763XOl.LJIIIIZZ.onNext(Boolean.valueOf(C84763XOl.LJIIJJI));
            C84763XOl.LJIIJ.onNext(new C78495UrL(activity, C84763XOl.LJIIJJI));
        }
        C84763XOl.LJFF.onNext(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        o.LJIIIZ(activity, "activity");
        StringBuilder LIZ = X1D.LIZ();
        ComponentName componentName = activity.getComponentName();
        String str2 = null;
        if (componentName != null) {
            str = componentName.getClassName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" created.");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("@ActivityMonitor", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        ComponentName componentName2 = activity.getComponentName();
        if (componentName2 != null) {
            str2 = componentName2.getClassName();
        }
        C0MT.LJ(LIZ2, str2, " created.", LIZ2);
        if (activity instanceof InterfaceC40262Fr8) {
            C84763XOl.LJIIL = true;
        }
        C84763XOl.LIZIZ.onNext(new BPL(activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C84763XOl.LIZ.onNext(new BPL(activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        C84763XOl.LJII.onNext(new BPL(activity, bundle));
    }
}
