package Y;

import X.B4U;
import X.C10K;
import X.C16880lQ;
import X.C1DH;
import X.C2322399n;
import X.C232649Bc;
import X.C234369Hs;
import X.C2NW;
import X.C2U8;
import X.C33780DNo;
import X.C33884DRo;
import X.C34508DgW;
import X.C34510DgY;
import X.C34565DhR;
import X.C34597Dhx;
import X.C34847Dlz;
import X.C35478DwA;
import X.C35801E3h;
import X.C35808E3o;
import X.C35810E3q;
import X.C35816E3w;
import X.C35818E3y;
import X.C36093EEn;
import X.C36211EJb;
import X.C36425ERh;
import X.C36527EVf;
import X.C36531EVj;
import X.C36811EcZ;
import X.C36922EeM;
import X.C37179EiV;
import X.C38018Ew2;
import X.C38019Ew3;
import X.C38799FKp;
import X.C38816FLg;
import X.C38914FPa;
import X.C38987FRv;
import X.C38995FSd;
import X.C39054FUk;
import X.C39106FWk;
import X.C39726FiU;
import X.C39729FiX;
import X.C39734Fic;
import X.C39739Fih;
import X.C40438Fty;
import X.C40443Fu3;
import X.C48236IwS;
import X.C56662Kg;
import X.C57738MlK;
import X.C58195Msh;
import X.C64009PAf;
import X.C64401PPh;
import X.C64471PRz;
import X.C64962gm;
import X.C66059PwF;
import X.C67012k5;
import X.C69B;
import X.C69F;
import X.C6WB;
import X.C6WC;
import X.C78926UyI;
import X.C78929UyL;
import X.C78934UyQ;
import X.C79146V4k;
import X.C84763XOl;
import X.DS8;
import X.DSC;
import X.DSG;
import X.DSR;
import X.EEE;
import X.EEF;
import X.EIH;
import X.EJW;
import X.EJZ;
import X.EVM;
import X.EnumC2322499o;
import X.EnumC2322699q;
import X.EnumC36092EEm;
import X.FAB;
import X.FGR;
import X.FHB;
import X.FHE;
import X.FJ4;
import X.FKM;
import X.FMR;
import X.FMX;
import X.FT5;
import X.FW5;
import X.FYL;
import X.GGS;
import X.HandlerC39071FVb;
import X.IWF;
import X.IZA;
import X.InterfaceC57062Lu;
import X.R41;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.content.ComponentName;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.view.LayoutInflater;
import com.bytedance.android.livesdk.init.BadPhonesCommonOptTask;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.bytedance.common.jato.jit.JitBlock;
import com.bytedance.common.jato.lock.LockMaxSpinsOpt;
import com.bytedance.common.jato.threads.ThreadSuspendTimeout;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.keva.Keva;
import com.bytedance.libcore.network.IExploreApi;
import com.bytedance.pitaya.cep_engine.timer.Timer;
import com.bytedance.platform.godzilla.memopt.MemSpongeHelper;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.internal.AqS106S0101000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS1S0001000_6 implements Runnable {
    public final int $t;
    public int i0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
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
                run$22(this);
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C36527EVf c36527EVf;
        synchronized (C36527EVf.class) {
            if (C36527EVf.LIZIZ == null) {
                C36527EVf.LIZIZ = new C36527EVf();
            }
            c36527EVf = C36527EVf.LIZIZ;
        }
        c36527EVf.LIZ(this.i0, JatoXL.sConfig.mContext);
    }

    public final void LIZ$2() {
        if (C35810E3q.LIZIZ < 2) {
            BlockHelper.endBlock();
            C35810E3q.LIZ();
            if (((Boolean) EIH.LIZLLL.getValue()).booleanValue()) {
                EEE.LIZ = false;
            }
            EEF.LIZIZ = false;
            C35810E3q.LIZIZ();
            if (DSG.LIZIZ()) {
                C35801E3h.LJIIL(this.i0);
            }
            if (!C35818E3y.LIZ() && (DS8.LIZIZ() || C2NW.LIZ().LJIILLIIL(DSC.LJLIL))) {
                C35801E3h.LIZLLL();
            }
            if (((Boolean) C34565DhR.LJII.getValue()).booleanValue()) {
                C67012k5.LJ.LIZLLL();
            }
            C38018Ew2 c38018Ew2 = C38019Ew3.LIZ;
            c38018Ew2.LJLILLLLZI = false;
            c38018Ew2.LJLJI = 0L;
            C64471PRz.LIZ();
            if (((Boolean) C35816E3w.LIZ.getValue()).booleanValue()) {
                C79146V4k.LIZ = false;
                C79146V4k.LIZIZ = 0L;
            }
        }
        C35810E3q.LIZIZ--;
    }

    public final void LIZ$1() {
        int i;
        C35808E3o c35808E3o;
        BlockHelper.beginBlock();
        if (((Boolean) EIH.LIZLLL.getValue()).booleanValue()) {
            EEE.LIZ = true;
        }
        EEF.LIZIZ = true;
        if (((Boolean) C34597Dhx.LIZLLL.getValue()).booleanValue() && (c35808E3o = (C35808E3o) ((LinkedHashMap) C35801E3h.LIZ).get("assem-serial-t")) != null) {
            C35801E3h.LIZ(c35808E3o.LJLILLLLZI, -5);
        }
        if (DSG.LIZIZ()) {
            int i2 = this.i0;
            if ((C33780DNo.LIZ() & 16) == 16) {
                JatoXL.tryCpuBoost(1500L);
                JatoXL.tryGpuBoost(1500L);
            }
            if (DSR.LJ()) {
                EVM.LIZ(i2, -20);
            } else {
                Thread thread = (Thread) ((LinkedHashMap) C35801E3h.LJFF).get("main");
                if (thread != null) {
                    thread.setPriority(7);
                }
            }
            if (DSR.LJFF()) {
                JatoXL.boostRenderThread(C2NW.LIZ().getApplication(), -20);
            } else {
                Thread thread2 = (Thread) ((LinkedHashMap) C35801E3h.LJFF).get("RenderThread");
                if (thread2 != null) {
                    thread2.setPriority(10);
                }
            }
            if (!DSR.LIZIZ()) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) C35801E3h.LJFF;
                Thread thread3 = (Thread) linkedHashMap.get("play_thread_0");
                if (thread3 != null) {
                    thread3.setPriority(7);
                }
                Thread thread4 = (Thread) linkedHashMap.get("play_thread_1");
                if (thread4 != null) {
                    thread4.setPriority(7);
                }
                Thread thread5 = (Thread) linkedHashMap.get("explay_thread_1");
                if (thread5 != null) {
                    thread5.setPriority(7);
                }
            }
        }
        if (!C35818E3y.LIZ() && (DS8.LIZIZ() || C2NW.LIZ().LJIILLIIL(DSC.LJLIL))) {
            if (DS8.LIZIZ()) {
                i = 1;
            } else {
                i = 6;
            }
            C35801E3h.LJIILIIL(i);
        }
        if (((Boolean) C34565DhR.LJII.getValue()).booleanValue() && C84763XOl.LJIIIIZZ() != null) {
            C67012k5 c67012k5 = C67012k5.LJ;
            final Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            Objects.requireNonNull(LJIIIIZZ);
            c67012k5.LIZJ(new InterfaceC57062Lu() { // from class: X.E3n
                @Override // X.InterfaceC57062Lu
                public final LayoutInflater LIZ() {
                    return LJIIIIZZ.getLayoutInflater();
                }
            }, 0);
        }
        C38019Ew3.LIZ.LJLILLLLZI = true;
        if (((Boolean) C34847Dlz.LIZJ.getValue()).booleanValue()) {
            C64471PRz.LIZ = true;
        }
        if (((Boolean) C35816E3w.LIZ.getValue()).booleanValue()) {
            C79146V4k.LIZ = true;
            C79146V4k.LIZIZ = 0L;
        }
        C35810E3q.LIZIZ++;
    }

    public final void LIZ$3() {
        BlockHelper.endBlock();
        C35810E3q.LIZ();
        if (((Boolean) EIH.LIZLLL.getValue()).booleanValue()) {
            EEE.LIZ = false;
        }
        EEF.LIZIZ = false;
        C35810E3q.LIZIZ();
        if (DSG.LIZIZ()) {
            C35801E3h.LJIIL(this.i0);
        }
        if (((Boolean) C34565DhR.LJII.getValue()).booleanValue()) {
            C67012k5.LJ.LIZLLL();
        }
        C64471PRz.LIZ();
    }

    public static final void run$0(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                C56662Kg.LIZ().LJIIJJI();
                return;
            default:
                C40438Fty.LIZLLL = false;
                C40443Fu3.LIZ("video_play").LIZ("is_pause", "false");
                C40443Fu3.LIZ("video_play").stop();
                return;
        }
    }

    public static final void run$1(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        boolean LIZ;
        try {
            LockMaxSpinsOpt.nativeSetMaxSpins(aRunnableS1S0001000_6.i0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        boolean LIZ;
        try {
            aRunnableS1S0001000_6.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        File[] listFiles;
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                if (C39054FUk.LIZ.LIZIZ.equals("defaultmd5")) {
                    C39734Fic.LIZJ().getClass();
                } else {
                    try {
                        File parentFile = C78929UyL.LJLIL.getFilesDir().getParentFile();
                        File[] fileArr = new File[0];
                        if ((parentFile == null || (fileArr = parentFile.listFiles()) != null) && fileArr.length > 0) {
                            for (File file : fileArr) {
                                if (file.getName().startsWith("app_zoin")) {
                                    C39734Fic LIZJ = C39734Fic.LIZJ();
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("clean old ");
                                    LIZ.append(file);
                                    X1D.LIZIZ(LIZ);
                                    LIZJ.getClass();
                                    C78926UyI.LJIIIIZZ(file);
                                }
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                C39729FiX c39729FiX = C39054FUk.LIZ;
                if (c39729FiX.LIZIZ.equals("defaultmd5")) {
                    C39734Fic.LIZJ().getClass();
                    return;
                }
                try {
                    File LIZIZ = c39729FiX.LIZIZ();
                    File parentFile2 = LIZIZ.getParentFile();
                    if (parentFile2 == null || !parentFile2.exists() || (listFiles = parentFile2.listFiles()) == null || listFiles.length <= 0) {
                        return;
                    }
                    for (File file2 : listFiles) {
                        if (!file2.getName().equals(LIZIZ.getName())) {
                            C39734Fic LIZJ2 = C39734Fic.LIZJ();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("clean last old ");
                            LIZ2.append(file2);
                            X1D.LIZIZ(LIZ2);
                            LIZJ2.getClass();
                            C78926UyI.LJIIIIZZ(file2);
                        }
                    }
                    return;
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                    return;
                }
            default:
                if (C48236IwS.LJIJJ()) {
                    C39739Fih c39739Fih = C39726FiU.LIZ;
                    AwemeHostApplication LIZ3 = FKM.LIZ();
                    synchronized (c39739Fih) {
                        if (LIZ3 != null) {
                            if (!c39739Fih.LIZIZ) {
                                LIZ3.registerActivityLifecycleCallbacks(c39739Fih.LIZ);
                                c39739Fih.LIZIZ = true;
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
        }
    }

    public static final void run$12(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        C64009PAf LIZIZ;
        int i = aRunnableS1S0001000_6.i0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("commit_result", i);
            JSONObject jSONObject2 = new JSONObject();
            synchronized (C38914FPa.class) {
                LIZIZ = SDKMonitorUtils.LIZIZ("12468");
            }
            if (LIZIZ != null) {
                LIZIZ.LJIIJ("profile_commit", jSONObject, jSONObject2, null);
            }
        } catch (Exception unused) {
        }
    }

    public static final void run$13(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                C36425ERh c36425ERh = IExploreApi.LIZ;
                c36425ERh.getClass();
                AqS106S0101000_6 aqS106S0101000_6 = new AqS106S0101000_6(c36425ERh, 1);
                if (FYL.LIZIZ.invoke().booleanValue()) {
                    aqS106S0101000_6.invoke();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static final void run$14(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        boolean LIZ;
        try {
            C10K.LIZIZ(new ACallableS24S0001000_6(aRunnableS1S0001000_6.i0, 3), FMX.LIZIZ(), null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                C38816FLg.LIZ = C38995FSd.LIZJ();
                return;
            default:
                new PthreadThread(IZA.LJ, "cbof-thread").start();
                return;
        }
    }

    public static final void run$16(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                WeakReference<Activity> weakReference = FJ4.LIZIZ;
                if (weakReference != null) {
                    Activity activity = weakReference.get();
                    if (activity != null && FMR.LIZ.LIZIZ.get()) {
                        AppLog.onResume(activity);
                    }
                    FJ4.LIZIZ = null;
                    return;
                }
                return;
            case 1:
                C38799FKp.LIZ();
                return;
            case 2:
                MainLooperOptService.LJIIJ(FAB.WATCH_WINDOW_FOCUS_CHANGE);
                return;
            case 3:
                return;
            default:
                if ((C34508DgW.LIZ & 1) == 1) {
                    C35810E3q.LJIILIIL();
                }
                int i = C34510DgY.LIZ;
                if ((i & 8) == 8) {
                    C36093EEn.LIZ.getClass();
                    C36093EEn.LIZJ();
                }
                if ((i & 1) == 1) {
                    JatoXL.resetPriority(Process.myTid());
                    JatoXL.resetPriority();
                    return;
                }
                return;
        }
    }

    public static final void run$17(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                HashSet<String> LIZ = C234369Hs.LIZ();
                if (LIZ != null) {
                    C36211EJb.LJIIIIZZ = new C232649Bc(EnumC2322699q.SCHEDULE_MODE, C36811EcZ.LIZIZ().getAbsolutePath());
                    PThreadExecutorsUtils.pThreadPoolExecutorInject = new FT5();
                    PThreadExecutorsUtils.runnableMonitor = new C78934UyQ();
                    C36211EJb.LJIIIZ.set(true);
                    Iterator<String> it = LIZ.iterator();
                    while (it.hasNext()) {
                        String blood = it.next();
                        EnumC2322499o level = EnumC2322499o.LEVEL_ALL;
                        o.LJIIIZ(blood, "blood");
                        o.LJIIIZ(level, "level");
                        C36211EJb.LIZJ.put(blood, new C2322399n(level));
                    }
                    return;
                }
                return;
            default:
                LivePerformanceManager LIZ2 = B4U.LIZ();
                if (LIZ2.LJLZ.enable) {
                    LIZ2.release();
                }
                B4U.LIZ().LJJIIZ(false);
                B4U.LIZ().LJIJJLI();
                return;
        }
    }

    public static final void run$18(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                C16880lQ.LJLI(Looper.myQueue(), new MessageQueue.IdleHandler() { // from class: X.FVd
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                            Iterator<InterfaceC74235TBn<C76800UCe>> it = C39074FVe.LIZ.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC65784Pro) it.next()).invoke();
                            }
                            return true;
                        }
                        return true;
                    }
                });
                return;
            default:
                if (C38987FRv.LIZLLL().booleanValue()) {
                    FW5.LIZLLL = true;
                    if (FW5.LIZ == null) {
                        FW5.LJIIIIZZ("no_request");
                        FW5.LIZ("no_request", "");
                        return;
                    } else if (FW5.LJI()) {
                        FW5.LJIIIIZZ("no_repsonse");
                        FGR.LIZIZ().LIZ(new HandlerC39071FVb(), new ACallableS41S0000000_6(9), 0);
                        return;
                    } else if (!FW5.LIZ.booleanValue()) {
                        FW5.LJIIIIZZ("valid_response");
                        return;
                    } else {
                        FW5.LJIIIIZZ("exception");
                        return;
                    }
                }
                return;
        }
    }

    public static final void run$19(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                C40438Fty.LJI("login", null);
                return;
            default:
                if (C48236IwS.LJIJJ()) {
                    C39106FWk.LIZ().LIZJ();
                    return;
                }
                return;
        }
    }

    public static final void run$2(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        boolean LIZ;
        try {
            ThreadSuspendTimeout.setSuspendTimeoutInSeconds(aRunnableS1S0001000_6.i0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                C38799FKp.LIZ();
                return;
            case 1:
                IWF.LJJLIIIIJ().LJIILJJIL();
                return;
            case 2:
                C36093EEn c36093EEn = C36093EEn.LIZ;
                EnumC36092EEm enumC36092EEm = EnumC36092EEm.FIRST_WINDOW_FOCUS;
                c36093EEn.getClass();
                C36093EEn.LJIIIIZZ(enumC36092EEm);
                return;
            default:
                Keva keva = C69B.LJ;
                if (keva.getLong("last_download_publish_cover_effect_resources_time", 0L) + 86400000 > System.currentTimeMillis()) {
                    return;
                }
                keva.storeLong("last_download_publish_cover_effect_resources_time", System.currentTimeMillis());
                C69B.LIZJ();
                C69F c69f = C69B.LIZJ;
                c69f.LJLIL = 0;
                C64962gm c64962gm = C69B.LIZLLL;
                XKX.LIZLLL(c64962gm, null, null, new C6WB(null), 3);
                c69f.LJLIL = 0;
                XKX.LIZLLL(c64962gm, null, null, new C6WC(null), 3);
                return;
        }
    }

    public static final void run$21(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                return;
            default:
                if (C35810E3q.LJ < 2) {
                    JitBlock.LIZLLL();
                }
                C35810E3q.LJ = Math.max(C35810E3q.LJ - 1, 0);
                return;
        }
    }

    public static final void run$22(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                if (!R41.LJI()) {
                    R41.LJIIL(1, 3, "");
                    R41.LJIIIZ();
                    return;
                }
                return;
            default:
                if (C40438Fty.LJI("system_launch_1_to_2_minute", null)) {
                    C1DH.LIZJ(C40438Fty.LJIIJ);
                    return;
                }
                return;
        }
    }

    public static final void run$23(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                C2U8.LIZ(new IEvent() { // from class: X.2JH
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C2U8.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C2U8.LIZIZ(this);
                        return this;
                    }
                });
                return;
            case 1:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("is_success", -2);
                    jSONObject.put("errorCode", -101);
                    AppLogNewUtils.onEventV3("cache_feed_request_response", jSONObject);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    long longValue = ((Number) EJW.LIZ.getValue()).longValue();
                    if (longValue >= 0) {
                        EJZ.LIZ = longValue;
                    }
                    MemSpongeHelper.start(Build.VERSION.SDK_INT, EJZ.LIZ);
                    return;
                } catch (Exception unused2) {
                    C36922EeM.LIZLLL(6, "mSponge", "mSponge start init error");
                    return;
                }
        }
    }

    public static final void run$24(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                Timer.m82timer$lambda5$lambda3();
                return;
            default:
                Iterator<Runnable> it = IZA.LIZ.iterator();
                while (it.hasNext()) {
                    Runnable next = it.next();
                    if (next != null) {
                        next.run();
                    }
                }
                IZA.LIZ.clear();
                return;
        }
    }

    public static final void run$25(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                BadPhonesCommonOptTask.lambda$preloadRetrofitApi$4();
                return;
            default:
                FHE.LIZLLL.LJIIIZ().load();
                return;
        }
    }

    public static final void run$26(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                BadPhonesCommonOptTask.lambda$preCacheWebView$6();
                return;
            default:
                AVExternalServiceImpl.LIZ().initService().initTask(3, null);
                return;
        }
    }

    public static final void run$3(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        boolean LIZ;
        try {
            aRunnableS1S0001000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                ApmEvent apmEvent = new ApmEvent("tt_launch_from_user");
                apmEvent.LIZ(Boolean.valueOf(C64401PPh.LIZLLL), "launch_from_user");
                apmEvent.LIZ(Integer.valueOf(C64401PPh.LJ), "init_importance_reason_code");
                ComponentName componentName = C64401PPh.LJFF;
                if (componentName != null) {
                    apmEvent.LIZ(componentName.flattenToString(), "init_importance_reason_component");
                }
                C66059PwF.LIZIZ(apmEvent);
                return;
            default:
                FHB.LJ.LJIIIZ().load();
                return;
        }
    }

    public static final void run$5(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                GGS.LIZ.getClass();
                MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin(false);
                return;
            case 1:
                C57738MlK.LIZIZ.LIZIZ().LIZ();
                return;
            default:
                if (C40438Fty.LJI("system_launch_1_to_2_minute_feed", null)) {
                    C1DH.LIZJ(C40438Fty.LJIIJJI);
                    return;
                }
                return;
        }
    }

    public static final void run$6(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        long j;
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                try {
                    MemSpongeHelper.startWhenOOM(Build.VERSION.SDK_INT, ((Number) EJW.LIZ.getValue()).longValue());
                    return;
                } catch (Exception unused) {
                    C36922EeM.LIZLLL(6, "mSponge", "mSponge startWhenOOM init error");
                    return;
                }
            default:
                if (C33884DRo.LIZ()) {
                    if (C36531EVj.LJ) {
                        C35810E3q.LJ(5000L);
                    }
                    C35810E3q.LJFF(5000L);
                    return;
                } else {
                    if (!C33884DRo.LIZIZ()) {
                        return;
                    }
                    if (C35478DwA.LIZIZ()) {
                        j = 6000;
                    } else {
                        j = 3000;
                    }
                    DoFrameController.LIZIZ = 3;
                    C37179EiV.LJFF.postDelayed(new Runnable() { // from class: X.92Y
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                DoFrameController.LIZIZ = 0;
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    }, j);
                    return;
                }
        }
    }

    public static final void run$7(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        switch (aRunnableS1S0001000_6.i0) {
            case 0:
                C58195Msh.LIZIZ.LIZIZ();
                return;
            default:
                B4U.LIZ().LJJIIZ(false);
                B4U.LIZ().LJIJJLI();
                return;
        }
    }

    public static final void run$8(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        boolean LIZ;
        try {
            aRunnableS1S0001000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS1S0001000_6 aRunnableS1S0001000_6) {
        boolean LIZ;
        try {
            aRunnableS1S0001000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0001000_6(int i, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                this.i0 = i;
                return;
            case 12:
            default:
                this.i0 = i;
                return;
        }
    }
}
