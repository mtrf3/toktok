package Y;

import X.AbstractC40526FvO;
import X.C03880Dg;
import X.C09970aH;
import X.C16880lQ;
import X.C1E4;
import X.C1PH;
import X.C33957DUj;
import X.C34016DWq;
import X.C34710Djm;
import X.C35150Dqs;
import X.C35810E3q;
import X.C36093EEn;
import X.C36152EGu;
import X.C36505EUj;
import X.C36546EVy;
import X.C36582EXi;
import X.C36833Ecv;
import X.C37179EiV;
import X.C37684Eqe;
import X.C38686FGg;
import X.C38696FGq;
import X.C38698FGs;
import X.C38699FGt;
import X.C38795FKl;
import X.C38891fp;
import X.C38947FQh;
import X.C38995FSd;
import X.C39101FWf;
import X.C39223FaN;
import X.C39523FfD;
import X.C39716FiK;
import X.C40053Fnl;
import X.C40197Fq5;
import X.C40438Fty;
import X.C40517FvF;
import X.C48236IwS;
import X.C61447O9r;
import X.C65300Pk0;
import X.C70657RoD;
import X.C78842Uww;
import X.C84382X9u;
import X.C84384X9w;
import X.C84763XOl;
import X.C9QH;
import X.DPN;
import X.EBB;
import X.EBC;
import X.EF7;
import X.EJU;
import X.EVM;
import X.EVS;
import X.EYD;
import X.EYS;
import X.F68;
import X.FFL;
import X.FK7;
import X.FKM;
import X.FLR;
import X.FMX;
import X.FUA;
import X.HandlerC39100FWe;
import X.IZA;
import X.LV0;
import X.PLS;
import X.QRA;
import X.V0Q;
import X.VS0;
import X.W5U;
import X.W8E;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.boost.TextureOpt;
import com.bytedance.common.jato.dex.DexTricksNativeHolder;
import com.bytedance.common.jato.jit.JitBlock;
import com.bytedance.common.jato.jit.JitCodeCacheGc;
import com.bytedance.common.jato.memory.WeakRefUnblockOpt;
import com.bytedance.common.jato.shrinker.MemTrim;
import com.bytedance.pitaya.cep_package.util.AndroidUtility;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.internal.i;
import com.lynx.jsbridge.CallbackImpl;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.tasm.behavior.XElementBehavior;
import com.lynx.tasm.behavior.utils.PropsHolderAutoRegister;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.common.net.NetworkReceiver;
import com.ss.android.ugc.aweme.legoImp.task.appkiller.RestartApplicationService;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.requesttask.idle.experment.GeckoHighGroupBackgroundSettings;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS13S0000000_6 implements Runnable {
    public final int $t;

    public static void LIZIZ$6(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "838222471858713699")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public static final void run$48(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
    }

    public static final void run$50(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
    }

    public final synchronized void LIZ$9() {
        synchronized (FUA.LIZIZ) {
            C39716FiK.LIZIZ();
            Iterator<Runnable> it = FUA.LIZ.iterator();
            while (it.hasNext()) {
                Runnable next = it.next();
                String valueOf = String.valueOf(next.hashCode());
                C84382X9u c84382X9u = C39716FiK.LIZ;
                if (c84382X9u != null) {
                    ObjectOutputStream objectOutputStream = null;
                    try {
                        C84384X9w LIZLLL = c84382X9u.LIZLLL(valueOf);
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(LIZLLL.LIZJ());
                        try {
                            objectOutputStream2.writeObject(next);
                            LIZLLL.LIZIZ();
                            C38891fp.LJIIJJI(objectOutputStream2);
                        } catch (Exception unused) {
                            objectOutputStream = objectOutputStream2;
                            C38891fp.LJIIJJI(objectOutputStream);
                            ((ArrayList) FUA.LIZIZ).add(valueOf);
                        } catch (Throwable th) {
                            th = th;
                            objectOutputStream = objectOutputStream2;
                            C38891fp.LJIIJJI(objectOutputStream);
                            throw th;
                        }
                    } catch (Exception unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                ((ArrayList) FUA.LIZIZ).add(valueOf);
            }
            FUA.LIZ.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                AndroidUtility.m89runByOrder$lambda3$lambda1();
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                AppLog.flush();
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            case 38:
                run$38(this);
                return;
            case 39:
                run$39(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                run$40(this);
                return;
            case 41:
                run$41(this);
                return;
            case 42:
                run$42(this);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                run$43(this);
                return;
            case 44:
                run$44(this);
                return;
            case 45:
                run$45(this);
                return;
            case 46:
                run$46(this);
                return;
            case 47:
                C40438Fty.LJFF();
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                run$48(this);
                return;
            case C61447O9r.LJIIJ:
                run$49(this);
                return;
            case 50:
                run$50(this);
                return;
            case 51:
                run$51(this);
                return;
            case 52:
                run$52(this);
                return;
            case 53:
                run$53(this);
                return;
            case 54:
                run$54(this);
                return;
            case 55:
                run$55(this);
                return;
            case 56:
                run$56(this);
                return;
            case 57:
                run$57(this);
                return;
            case 58:
                run$58(this);
                return;
            case 59:
                run$59(this);
                return;
            case 60:
                run$60(this);
                return;
            default:
                return;
        }
    }

    public static final void LIZ$0() {
        try {
            C38696FGq.LIZ(new ARunnableS13S0000000_6(41));
            for (int i = 0; i < 100; i++) {
                int i2 = (i * 2) + 71066620;
                EYS eys = new EYS("ab_sdk_abtest_verify_layer", i / 100, "ab_sdk_abtest", null, new EJU(String.valueOf(i2), 0.005d, 0), new EJU(String.valueOf(i2 + 1), 0.005d, 1));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ab_sdk_abtest_verify");
                LIZ.append(i);
                C38686FGg.LIZIZ(X1D.LIZIZ(LIZ), Integer.TYPE, 2, true, eys);
            }
        } catch (Throwable unused) {
        }
    }

    public static void LIZ$1() {
        synchronized (EVM.class) {
            if (EVM.LIZJ && EVM.LIZ != -1) {
                CpusetManager.resetCoreBind(EVM.LIZ);
                JatoXL.resetPriority(EVM.LIZ);
                EVM.LIZJ = false;
            }
        }
    }

    public static void LIZ$10() {
        ObjectInputStream objectInputStream;
        List<String> list = FUA.LIZIZ;
        synchronized (list) {
            if (((ArrayList) list).size() != 0) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    C84382X9u c84382X9u = C39716FiK.LIZ;
                    Runnable runnable = null;
                    runnable = null;
                    ObjectInputStream objectInputStream2 = null;
                    if (c84382X9u != null) {
                        try {
                            objectInputStream = new ObjectInputStream(c84382X9u.LJ(str).LJLIL[0]);
                            try {
                                try {
                                    Runnable runnable2 = (Runnable) objectInputStream.readObject();
                                    C38891fp.LJIIJJI(objectInputStream);
                                    runnable = runnable2;
                                } catch (Throwable th) {
                                    th = th;
                                    objectInputStream2 = objectInputStream;
                                    C38891fp.LJIIJJI(objectInputStream2);
                                    throw th;
                                }
                            } catch (Exception e) {
                                e = e;
                                C16880lQ.LLLLIIL(e);
                                C38891fp.LJIIJJI(objectInputStream);
                                FUA.LIZJ.submit(runnable);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            objectInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    FUA.LIZJ.submit(runnable);
                }
                ((ArrayList) FUA.LIZIZ).clear();
                try {
                    C84382X9u c84382X9u2 = C39716FiK.LIZ;
                    c84382X9u2.close();
                    C84382X9u.LIZIZ(c84382X9u2.LJLIL);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void LIZ$4() {
        int LJIJ;
        int i = EBB.LIZLLL;
        if (i >= 15) {
            return;
        }
        EBB.LIZLLL = i + 1;
        if (((Number) C33957DUj.LIZ.getValue()).intValue() == 1) {
            LJIJ = 5000;
        } else {
            LJIJ = C78842Uww.LJIJ(V0Q.Default, new C40517FvF(5, 10)) * 1000;
        }
        long j = LJIJ;
        EBB.LIZ(j);
        C37179EiV.LJFF.postDelayed(EBB.LJ, j + 5000);
    }

    public static void LIZ$5() {
        if (W5U.LIZLLL) {
            W5U.LIZ.trimMemory(80);
        }
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Method method = (Method) declaredMethod.invoke(cls, "trimMemory", new Class[]{Integer.TYPE});
            if (invoke != null && method != null) {
                LIZIZ$6(invoke, method, new Object[]{40});
            }
        } catch (Throwable unused) {
        }
        C38795FKl.LIZJ = true;
    }

    public static void LIZ$7() {
        C38699FGt c38699FGt = C38698FGs.LIZ;
        if (c38699FGt != null) {
            if (c38699FGt.LIZ == null) {
                try {
                    c38699FGt.LIZ = Class.forName("com.ss.android.common.lib.AppLogNewUtils").getDeclaredMethod("onEventV3", String.class, JSONObject.class);
                } catch (Throwable unused) {
                }
            }
            if (c38699FGt.LIZ == null) {
                try {
                    c38699FGt.LIZ = Class.forName("com.bytedance.applog.AppLog").getDeclaredMethod("onEventV3", String.class, JSONObject.class);
                } catch (Throwable unused2) {
                }
            }
            if (c38699FGt.LIZ == null) {
                return;
            }
            for (Map.Entry entry : ((HashMap) c38699FGt.LIZIZ).entrySet()) {
                try {
                    C38699FGt.LIZ(c38699FGt.LIZ, new Object[]{entry.getKey(), entry.getValue()});
                } catch (Throwable unused3) {
                }
            }
            ((HashMap) c38699FGt.LIZIZ).clear();
        }
    }

    public final void LIZ$8() {
        if (C9QH.LIZIZ.booleanValue()) {
            if (C36505EUj.LJ) {
                Runnable runnable = C36546EVy.LJI;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            try {
                C36546EVy.LJII.invoke(C16880lQ.LLIIIJ(), 1, this, null, 0);
                return;
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
                return;
            } catch (InvocationTargetException e2) {
                C16880lQ.LLLLIIL(e2);
                return;
            }
        }
        Runnable runnable2 = C36546EVy.LJI;
        if (runnable2 == null) {
            return;
        }
        runnable2.run();
    }

    public static void LIZ$2() {
        SystemClock.uptimeMillis();
        try {
            Class.forName(AbstractC40526FvO.class.getName());
            Class.forName(PropsHolderAutoRegister.class.getName());
            Class.forName(VS0.class.getName());
            Class.forName(C40197Fq5.class.getName());
            Class.forName(LynxModuleManager.class.getName());
            Class.forName(CallbackImpl.class.getName());
            Class.forName(C38947FQh.class.getName());
            Class.forName(C40053Fnl.class.getName());
            Class.forName(C39523FfD.class.getName());
            Class.forName(XElementBehavior.class.getName());
            Iterator<String> it = XElementBehavior.GENERATOR_FILE_NAME_SETS.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(next);
                    LIZ.append(".BehaviorGenerator");
                    Class.forName(X1D.LIZIZ(LIZ));
                } catch (Throwable unused) {
                }
            }
            SystemClock.uptimeMillis();
        } catch (Throwable unused2) {
        }
    }

    public static void LIZ$3() {
        try {
            if (C36833Ecv.LIZ(FKM.LIZ())) {
                return;
            }
            Activity[] activityStack = ActivityStack.getActivityStack();
            for (int length = activityStack.length - 1; length > -1; length--) {
                activityStack[length].finish();
            }
            Intent intent = new Intent(FKM.LIZ(), (Class<?>) RestartApplicationService.class);
            intent.putExtra("s_FLAG_RESTART_MAIN_PROCESS", Process.myPid());
            FKM.LIZ().bindService(intent, new FK7(), 1);
        } catch (Throwable unused) {
        }
    }

    public ARunnableS13S0000000_6(int i) {
        this.$t = i;
    }

    public static final void run$1(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        try {
            C16880lQ.LLJJJIL("ttmverify");
        } catch (Throwable unused) {
        }
        C48236IwS.LJIILJJIL = true;
    }

    public static final void run$10(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            JitCodeCacheGc.disable();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            WeakRefUnblockOpt.init();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            ALog.syncFlush();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        try {
            SystemClock.elapsedRealtime();
            try {
                Class.forName("com.lynx.devtool.LynxInspectorOwner");
            } catch (ClassNotFoundException unused) {
                C16880lQ.LLJJJIL("lynx");
            }
        } catch (Throwable unused2) {
        }
    }

    public static final void run$16(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            FFL.LJIIIZ().getClass();
            FFL.LJIIJ(31744, -1, "optimize_holdupapplog", true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            FMX.onEventV3("af_start_init");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            new PLS().run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean z;
        if (C39101FWf.LIZIZ == null) {
            synchronized (C39101FWf.class) {
                if (C39101FWf.LIZIZ == null) {
                    C39101FWf.LIZIZ = new C39101FWf();
                }
            }
        }
        C39101FWf c39101FWf = C39101FWf.LIZIZ;
        c39101FWf.getClass();
        if (C34710Djm.LIZJ()) {
            if (c39101FWf.LIZ == null) {
                c39101FWf.LIZ = new HandlerC39100FWe(C37684Eqe.LJ());
            }
            HandlerC39100FWe handlerC39100FWe = c39101FWf.LIZ;
            handlerC39100FWe.getClass();
            if (C37684Eqe.LIZ(handlerC39100FWe) && C37684Eqe.LIZIZ(handlerC39100FWe.LIZ, handlerC39100FWe)) {
                z = true;
            } else {
                z = false;
            }
            handlerC39100FWe.LIZJ = z;
        }
    }

    public static final void run$21(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS1S0001000_6(2, 20));
        } catch (Throwable unused) {
        }
    }

    public static final void run$23(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            F68 f68 = new F68();
            Context LIZIZ = EF7.LIZIZ();
            if (Build.VERSION.SDK_INT >= 26) {
                NetworkReceiver networkReceiver = new NetworkReceiver();
                ((ArrayList) f68.LIZ).add(networkReceiver);
                IntentFilter intentFilter = new IntentFilter();
                for (String str : new String[]{"android.net.conn.CONNECTIVITY_CHANGE"}) {
                    intentFilter.addAction(str);
                }
                C16880lQ.LJJLIIIJILLIZJL(networkReceiver, LIZIZ, intentFilter);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            JatoXL.resetRenderThread();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            SettingsRequestServiceImpl.LJIILLIIL().LIZ(EF7.LIZIZ());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        LV0.LJII.LJII();
    }

    public static final void run$27(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        com.bytedance.applog.AppLog.LIZ.LJJII = false;
    }

    public static final void run$28(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            if ((C36152EGu.LJ() && DPN.LIZ()) || C35150Dqs.LIZ()) {
                C37179EiV.LJFF.post(new ARunnableS13S0000000_6(38));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        C36093EEn.LIZ.getClass();
        C36093EEn.LIZJ();
    }

    public static final void run$3(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            try {
                Class<?> cls = Class.forName("com.bytedance.webx.monitor.weboffline.WebOfflineMonitor");
                C1E4.LJIJJ(cls, "beginMonitor", C1E4.LJIJJ(cls, "getInstance", new Object[0]));
            } catch (Exception unused) {
                C70657RoD.LJIILL();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        if (C35810E3q.LJ < 2) {
            JitBlock.LIZLLL();
        }
        C35810E3q.LJ = Math.max(C35810E3q.LJ - 1, 0);
    }

    public static final void run$31(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            JatoXL.startBlockGc("beginBlockGC");
            C35810E3q.LIZ++;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            if (C35810E3q.LIZ < 2) {
                JatoXL.stopBlockGc("endBlockGC");
            }
            C35810E3q.LIZ--;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            JatoXL.stopBlockGc("endBlockGC");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            JitBlock.LIZJ();
            C35810E3q.LJ++;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            EBB.LIZ = true;
            EBC.LIZ.LJIIIIZZ(new long[0]);
            EBB.LIZIZ++;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            if (EBB.LIZIZ < 2) {
                EBB.LIZ = false;
                EBC.LIZ.LJIIJJI();
            }
            EBB.LIZIZ--;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            EBB.LIZ = false;
            EBC.LIZ.LJIIJJI();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$39(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            try {
                Class<?> cls = Class.forName("com.bytedance.webx.monitor.falconx.FalconXMonitor");
                C1E4.LJIJJ(cls, "beginMonitor", C1E4.LJIJJ(cls, "getInstance", new Object[0]));
            } catch (Exception unused) {
                C70657RoD.LJIILL();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        try {
            W8E.LJII().LJI().LIZ();
        } catch (Throwable unused) {
        }
    }

    public static final void run$41(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$42(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            aRunnableS13S0000000_6.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final synchronized void run$43(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        synchronized (aRunnableS13S0000000_6) {
            try {
                aRunnableS13S0000000_6.LIZ$9();
            } catch (Throwable th) {
                if (!C39223FaN.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public static final void run$44(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$45(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        LiveOuterService.LJJJLL().LJJIJIL().B7();
    }

    public static final void run$46(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            InitLegoInflate.LJLIL.LIZ(EF7.LIZIZ());
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0026 -> B:7:0x0031). Please report as a decompilation issue!!! */
    public static final void run$49(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            try {
                if (((Boolean) C34016DWq.LJ.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 23) {
                    C16880lQ.LJLI(Looper.myQueue(), new MessageQueue.IdleHandler() { // from class: X.E1N
                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            AppLog.flush();
                            return false;
                        }
                    });
                } else {
                    AppLog.flush();
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            if (EVS.LIZJ) {
                DexTricksNativeHolder.verifyEnable();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$51(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            if (!C84763XOl.LJIIJJI && GeckoHighGroupBackgroundSettings.LIZ().triggerForegroundDownload) {
                EBC.LIZ.LJIILIIL("occasion_high_priority");
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$52(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        new PthreadThread(IZA.LJ, "cbof-thread").start();
    }

    public static final void run$53(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            FLR.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$54(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        try {
            Intent intent = new Intent("com.apm.setting.update.action");
            intent.putExtra("PROCESS_NAME", C1PH.LJIILIIL());
            C09970aH.LIZ.sendBroadcast(intent);
            if (C09970aH.LJII()) {
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$55(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        JatoXL.resetPriority(Process.myTid());
    }

    public static final void run$56(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            if (!EYD.LIZ) {
                synchronized (QRA.class) {
                    if (!EYD.LIZ) {
                        EYD.LIZIZ();
                        EYD.LIZ = true;
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$57(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            if (!EYD.LIZ) {
                synchronized (QRA.class) {
                    if (!EYD.LIZ) {
                        EYD.LIZIZ();
                        EYD.LIZ = true;
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$58(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            C36582EXi.LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$59(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            i.LIZJ(new ARunnableS13S0000000_6(58));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            MemTrim.trimVdex();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$60(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            C36582EXi.LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            TextureOpt.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            JitCodeCacheGc.enable();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS13S0000000_6 aRunnableS13S0000000_6) {
        boolean LIZ;
        try {
            CpusetManager.init();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS13S0000000_6(Context context, int i) {
        this.$t = i;
    }
}
