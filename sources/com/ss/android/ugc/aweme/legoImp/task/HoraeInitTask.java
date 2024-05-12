package com.ss.android.ugc.aweme.legoImp.task;

import X.C06M;
import X.C0RN;
import X.C16880lQ;
import X.C19N;
import X.C36707Eat;
import X.C39227FaR;
import X.C39755Fix;
import X.C39758Fj0;
import X.C39759Fj1;
import X.C39760Fj2;
import X.C39764Fj6;
import X.C39766Fj8;
import X.C39767Fj9;
import X.C39769FjB;
import X.C39770FjC;
import X.C39772FjE;
import X.C73098SmU;
import X.C77119UOl;
import X.C78934UyQ;
import X.C79004UzY;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EWB;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.FFL;
import X.HandlerC39752Fiu;
import X.HandlerC39765Fj7;
import X.InterfaceC39753Fiv;
import X.InterfaceC65349Pkn;
import X.RunnableC39751Fit;
import X.RunnableC39754Fiw;
import X.ViewTreeObserverOnDrawListenerC40738Fyo;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import android.view.View;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.e1;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class HoraeInitTask implements EE1 {
    public static final List<String> LJLIL = Arrays.asList("com.bytedance.android.livesdk", "com.ss.videoarch.strategy", "com.ss.optimizer.live.sdk", "com.ss.android.ugc.aweme.common.net");
    public static List<String> LJLILLLLZI = null;

    /* loaded from: classes7.dex */
    public static class HoraeIgnoreConfigData {

        @InterfaceC65349Pkn("ignore_list")
        public List<String> ignore_list;
    }

    @Override // X.EEY
    public final String key() {
        return "HoraeInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!FCD.LJI(context) || !C19N.LJ("enable_horae_init", false)) {
            return;
        }
        if (C39772FjE.LIZ && FCD.LJI(context) && !C39227FaR.LIZ) {
            C39227FaR.LIZIZ = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.FaS
                /* JADX WARN: Removed duplicated region for block: B:18:0x002a A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:2:0x0000, B:5:0x0008, B:8:0x0014, B:13:0x0019, B:16:0x0022, B:18:0x002a, B:24:0x002e, B:26:0x0032), top: B:1:0x0000, inners: #1 }] */
                @Override // java.lang.Thread.UncaughtExceptionHandler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
                    /*
                        r3 = this;
                        boolean r0 = X.C39227FaR.LIZ(r5)     // Catch: java.lang.Throwable -> L36
                        if (r0 == 0) goto L2e
                        if (r4 == 0) goto L42
                        java.lang.String r1 = r4.getName()     // Catch: java.lang.Throwable -> L36
                        java.lang.String r0 = "main"
                        boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L36
                        if (r0 == 0) goto L42
                    L14:
                        android.os.Looper.loop()     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L36
                        goto L14
                    L18:
                        r2 = move-exception
                        X.C16880lQ.LLLLIIIILLL()     // Catch: java.lang.Throwable -> L36
                        boolean r0 = X.C39227FaR.LIZ(r2)     // Catch: java.lang.Throwable -> L36
                        if (r0 != 0) goto L14
                        java.lang.Thread r1 = X.C16880lQ.LLLLIIIILLL()     // Catch: java.lang.Throwable -> L36
                        java.lang.Thread$UncaughtExceptionHandler r0 = X.C39227FaR.LIZIZ     // Catch: java.lang.Throwable -> L36
                        if (r0 == 0) goto L42
                        r0.uncaughtException(r1, r2)     // Catch: java.lang.Throwable -> L36
                        goto L42
                    L2e:
                        java.lang.Thread$UncaughtExceptionHandler r0 = X.C39227FaR.LIZIZ     // Catch: java.lang.Throwable -> L36
                        if (r0 == 0) goto L42
                        r0.uncaughtException(r4, r5)     // Catch: java.lang.Throwable -> L36
                        goto L42
                    L36:
                        r2 = move-exception
                        java.lang.Thread r1 = X.C16880lQ.LLLLIIIILLL()
                        java.lang.Thread$UncaughtExceptionHandler r0 = X.C39227FaR.LIZIZ
                        if (r0 == 0) goto L42
                        r0.uncaughtException(r1, r2)
                    L42:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C39228FaS.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
                }
            });
            C39227FaR.LIZ = true;
        }
        C39764Fj6 c39764Fj6 = new C39764Fj6();
        c39764Fj6.LIZ = false;
        c39764Fj6.LIZJ = "double_turbo_quicken_engine";
        c39764Fj6.LIZIZ = new C39769FjB();
        c39764Fj6.LIZLLL = true;
        c39764Fj6.LJFF = e1.LIZ(31744, "async_dispatch_broadcast_pkg_removed", true, false);
        try {
            SettingsManager.LIZLLL().getClass();
            HoraeIgnoreConfigData horaeIgnoreConfigData = (HoraeIgnoreConfigData) SettingsManager.LJII("horae_ignore_config", HoraeIgnoreConfigData.class);
            if (horaeIgnoreConfigData != null && !C79004UzY.LJJIFFI(horaeIgnoreConfigData.ignore_list)) {
                c39764Fj6.LJ = new HashSet(horaeIgnoreConfigData.ignore_list);
                LJLILLLLZI = horaeIgnoreConfigData.ignore_list;
            }
        } catch (Throwable unused) {
        }
        C39758Fj0.LJI = new C73098SmU();
        boolean z = c39764Fj6.LIZ;
        InterfaceC39753Fiv interfaceC39753Fiv = c39764Fj6.LIZIZ;
        String str = c39764Fj6.LIZJ;
        Set<String> set = c39764Fj6.LJ;
        boolean z2 = c39764Fj6.LIZLLL;
        boolean z3 = c39764Fj6.LJFF;
        C39767Fj9 c39767Fj9 = new C39767Fj9(z, interfaceC39753Fiv, str, set, z2, z3);
        Application application = (Application) context;
        if (C39770FjC.LIZJ == null) {
            synchronized (C39770FjC.class) {
                if (C39770FjC.LIZJ == null) {
                    C39770FjC.LIZJ = new C39770FjC(application);
                }
            }
        }
        C39770FjC c39770FjC = C39770FjC.LIZJ;
        c39770FjC.getClass();
        if (z3) {
            ((HashSet) C39758Fj0.LIZ).add(133);
            ((HashSet) C39758Fj0.LIZIZ).add(133);
        }
        String str2 = c39767Fj9.LIZ;
        if (!c39770FjC.LIZIZ) {
            if (!TextUtils.isEmpty(str2)) {
                c39770FjC.LIZIZ = true;
                if (z) {
                    RunnableC39751Fit LIZJ = RunnableC39751Fit.LIZJ();
                    Application application2 = c39770FjC.LIZ;
                    if (!LIZJ.LJLJJL) {
                        LIZJ.LJLJJLL = interfaceC39753Fiv;
                        LIZJ.LJLJJL = true;
                        LIZJ.LJLIL = application2;
                        LIZJ.LJLJL = z2;
                        HandlerThread LIZ = C06M.LIZ(str2);
                        C77119UOl c77119UOl = new C77119UOl();
                        Application application3 = LIZJ.LJLIL;
                        C39759Fj1 c39759Fj1 = new C39759Fj1(c77119UOl);
                        c39759Fj1.LJLJI = new HandlerC39765Fj7(c39759Fj1, C16880lQ.LLJJJJ());
                        c39759Fj1.LJII();
                        C39766Fj8 c39766Fj8 = new C39766Fj8(c77119UOl);
                        try {
                            Field LJIIL = C78934UyQ.LJIIL(Looper.class, "mLogging");
                            c39766Fj8.LJLJI = (Printer) LJIIL.get(C16880lQ.LLJJJJ());
                            LJIIL.set(C16880lQ.LLJJJJ(), c39766Fj8);
                        } catch (Throwable unused2) {
                        }
                        ViewTreeObserverOnDrawListenerC40738Fyo viewTreeObserverOnDrawListenerC40738Fyo = new ViewTreeObserverOnDrawListenerC40738Fyo(application3, c77119UOl);
                        try {
                            Field LJIIL2 = C78934UyQ.LJIIL(View.class, "mAttachInfo");
                            viewTreeObserverOnDrawListenerC40738Fyo.LJLJI = LJIIL2;
                            if (LJIIL2 != null) {
                                LJIIL2.setAccessible(true);
                                application3.registerActivityLifecycleCallbacks(viewTreeObserverOnDrawListenerC40738Fyo);
                            }
                        } catch (Throwable unused3) {
                        }
                        C39760Fj2 c39760Fj2 = C39760Fj2.LJLJI;
                        c39760Fj2.getClass();
                        try {
                            Handler handler = (Handler) EWB.LIZJ();
                            Field LJIIL3 = C78934UyQ.LJIIL(Handler.class, "mCallback");
                            c39760Fj2.LJLILLLLZI = (Handler.Callback) LJIIL3.get(handler);
                            LJIIL3.set(handler, c39760Fj2);
                        } catch (Throwable unused4) {
                            if (RunnableC39751Fit.LIZJ().LJLJJLL != null) {
                                RunnableC39751Fit.LIZJ().LJLJJLL.getClass();
                            }
                        }
                        HandlerC39752Fiu handlerC39752Fiu = new HandlerC39752Fiu(LIZ.getLooper());
                        LIZJ.LJLILLLLZI = handlerC39752Fiu;
                        handlerC39752Fiu.postDelayed(LIZJ, 2000L);
                    }
                } else {
                    C39758Fj0.LIZLLL = set;
                    RunnableC39754Fiw.LIZIZ().LIZJ(c39770FjC.LIZ, str2, interfaceC39753Fiv, z2);
                }
            } else {
                throw new IllegalArgumentException("Parameter threadName can not be null!");
            }
        }
        Npth.setAttachUserData(new C36707Eat(c39767Fj9), CrashType.ALL);
        FFL.LJIIIZ().getClass();
        if (!FFL.LJ(31744, "live_horae_close_monitor_ab", true, false)) {
            ((Application) EF7.LIZIZ()).registerActivityLifecycleCallbacks(new C39755Fix());
        }
    }
}
