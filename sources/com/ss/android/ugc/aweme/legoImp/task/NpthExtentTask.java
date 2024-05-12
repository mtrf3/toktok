package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C33949DUb;
import X.C36922EeM;
import X.C38816FLg;
import X.C39681Fhl;
import X.C40328FsC;
import X.C82544WaS;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EK7;
import X.EPM;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F80;
import X.F83;
import X.F84;
import X.F86;
import X.F89;
import X.FCD;
import X.InterfaceC36076EDw;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public class NpthExtentTask implements EE1, InterfaceC36076EDw {
    @Override // X.EEY
    public final String key() {
        return "NpthExtentTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.InterfaceC36076EDw
    public final String[] deps() {
        return new String[]{"AccountInitializerTask"};
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public static void LIZLLL(final Context context) {
        if (!C33949DUb.LIZJ()) {
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.F7x
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType, String str, Thread thread) {
                    Context context2 = context;
                    if (str != null) {
                        SplashAdServiceImpl.LJJI().LIZLLL(context2, str);
                    }
                }
            }, CrashType.ALL);
        }
        ICrashCallback iCrashCallback = new ICrashCallback() { // from class: X.EPX
            @Override // com.bytedance.crash.ICrashCallback
            public final void onCrash(CrashType crashType, String str, Thread thread) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("type", crashType.getName());
                FMX.LJIIL("app_crash", c188727au.LIZ);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("app_crash ");
                LIZ.append(crashType.getName());
                C36922EeM.LJ(X1D.LIZIZ(LIZ));
            }
        };
        CrashType crashType = CrashType.ALL;
        Npth.registerCrashCallback(iCrashCallback, crashType);
        C36922EeM.LJ("NpthTask");
        Thread.setDefaultUncaughtExceptionHandler(new EK7(Thread.getDefaultUncaughtExceptionHandler()));
        ConfigManager configManager = Npth.getConfigManager();
        LauncherServiceImpl.LIZLLL().isDebug();
        configManager.setDebugMode(false);
        Npth.setAttachUserData(new C39681Fhl(context, new EPM()), crashType);
        if (!C33949DUb.LIZJ()) {
            final ICrashReportService provideErrorReporter = AVExternalServiceImpl.LIZ().provideErrorReporter();
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.F82
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType2, String str, Thread thread) {
                    ICrashReportService.this.report(2);
                }
            }, CrashType.NATIVE);
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.F7z
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType2, String str, Thread thread) {
                    ICrashReportService iCrashReportService = ICrashReportService.this;
                    if (str != null && str.contains("OutOfMemoryError")) {
                        iCrashReportService.report(1);
                    } else {
                        iCrashReportService.report(3);
                    }
                }
            }, CrashType.JAVA);
            new AddInstalledModulesInfoTask().run(context);
            C82544WaS.LIZ(new ARunnableS42S0100000_6(new F80(), 77));
            AVExternalServiceImpl.LIZ().provideErrorReporter().addCrashCustomTagListener(new ICrashCustomTagListener() { // from class: X.F7y
                @Override // com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener
                public final void setCustomTag(String str, String str2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(str, str2);
                    Npth.addTags(hashMap);
                }
            });
        }
        if (((Boolean) F89.LIZIZ.getValue()).booleanValue()) {
            C38816FLg.LIZLLL(new ARunnableS13S0000000_6(18), 200);
        }
        F86.LIZIZ.LIZ();
        Npth.customActivityName(new C40328FsC());
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (FCD.LIZ(context).contains("miniapp")) {
            return;
        }
        F84.LIZ.getClass();
        ReentrantLock reentrantLock = F83.LIZ;
        reentrantLock.lock();
        if (((Boolean) F89.LIZIZ.getValue()).booleanValue()) {
            new NpthCoreInitTask().run(context);
            new NpthSecondInitTask().run(context);
        }
        try {
            LIZLLL(context);
            reentrantLock.unlock();
        } catch (Throwable th) {
            F84.LIZ.getClass();
            F83.LIZ.unlock();
            throw th;
        }
    }
}
