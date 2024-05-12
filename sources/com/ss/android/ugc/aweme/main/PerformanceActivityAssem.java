package com.ss.android.ugc.aweme.main;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C16970lZ;
import X.C212428Vi;
import X.C232469Ak;
import X.C33763DMx;
import X.C33842DPy;
import X.C33862DQs;
import X.C34565DhR;
import X.C34710Djm;
import X.C35138Dqg;
import X.C35183DrP;
import X.C35214Dru;
import X.C35230DsA;
import X.C35274Dss;
import X.C36089EEj;
import X.C36093EEn;
import X.C36381bm;
import X.C36496EUa;
import X.C36508EUm;
import X.C37179EiV;
import X.C37684Eqe;
import X.C37685Eqf;
import X.C37688Eqi;
import X.C37691Eql;
import X.C38839FMd;
import X.C38840FMe;
import X.C38841FMf;
import X.C38842FMg;
import X.C38843FMh;
import X.C38847FMl;
import X.C38850FMo;
import X.C38851FMp;
import X.C38862FNa;
import X.C38993FSb;
import X.C38995FSd;
import X.C40438Fty;
import X.C47704Ins;
import X.C55749LuL;
import X.C56662Kg;
import X.C57964Moy;
import X.C58122Pw;
import X.C60762a0;
import X.C64553PVd;
import X.C67012k5;
import X.C84763XOl;
import X.C88087Yhf;
import X.C88099Yhr;
import X.C88109Yi1;
import X.C94I;
import X.DQV;
import X.DVD;
import X.E8M;
import X.EE1;
import X.EEZ;
import X.ENY;
import X.FAJ;
import X.FEN;
import X.FET;
import X.FEU;
import X.FGN;
import X.FKN;
import X.FMW;
import X.FN1;
import X.FN4;
import X.FN9;
import X.FOI;
import X.FON;
import X.HandlerC37686Eqg;
import X.HandlerC37687Eqh;
import X.HandlerC37689Eqj;
import X.InterfaceC195747mE;
import X.InterfaceC37276Ek4;
import X.InterfaceC64977Pen;
import X.J29;
import X.LNZ;
import X.MFE;
import X.PY7;
import X.RunnableC09760Zw;
import X.RunnableC36516EUu;
import X.RunnableC36520EUy;
import X.RunnableC38846FMk;
import X.RunnableC40409FtV;
import Y.ACallableS109S0100000_6;
import Y.ARunnableS42S0100000_6;
import Y.AfS18S0001000_6;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import android.view.ViewParent;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.app.services.LauncherService;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.services.BusinessModuleServiceImpl;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AqS156S0100000_6;

/* loaded from: classes7.dex */
public final class PerformanceActivityAssem extends BaseMainContainerAssem {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI = true;
    public final C55749LuL LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, C38839FMd.class, null), checkSupervisorPrepared());

    /* loaded from: classes7.dex */
    public interface FileApi {
        @ENY
        @E8M
        InterfaceC37276Ek4<String> upload(@InterfaceC195747mE String str, @InterfaceC64977Pen List<C64553PVd> list);
    }

    @Override // X.C8W0
    public final void onCreate() {
        int i = 2;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(PerformanceActivityAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        if (C35274Dss.LIZ() != -1 && FAJ.LJ == null) {
            FAJ.LJ = Boolean.TRUE;
        }
        C56662Kg.LIZ().LIZJ("main_act_performance_observe", false);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C36093EEn.LIZ.getClass();
            if (EEZ.LIZJ() && ((Boolean) C33763DMx.LIZJ.getValue()).booleanValue()) {
                FMW.LIZJ(new AqS156S0100000_6((Context) LIZ, 149));
                C37179EiV.LJFF.postDelayed(RunnableC38846FMk.LJLIL, 10000L);
            }
            if (!((Boolean) C35230DsA.LIZ.getValue()).booleanValue()) {
                Hox LIZ2 = Hox.LJLLI.LIZ(LIZ);
                C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                LJIIIZ.LIZ(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getPreloadActicityTask());
                LJIIIZ.LIZ(((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).getMainTaskHolder().LIZ(LIZ2));
                LJIIIZ.LIZJ();
            }
            J29 j29 = J29.LJLIL;
            FGN fgn = FGN.LIZ;
            fgn.LIZIZ(j29, "simbaRunnable", ((Boolean) C88109Yi1.LIZLLL.getValue()).booleanValue());
            C57964Moy.LJLJJLL = true;
            fgn.LIZIZ(FN4.LJLIL, "choreographerOptServiceRunnable", ((Boolean) C88109Yi1.LJ.getValue()).booleanValue());
            if (((Boolean) C88099Yhr.LIZIZ.getValue()).booleanValue()) {
                ((ArrayList) C38850FMo.LIZ).add(new ARunnableS42S0100000_6(this, LIZ, 38));
            } else {
                PY7.LIZJ = C58122Pw.LIZ;
                LocationServiceImpl.LJIJJ().LJIIZILJ();
            }
            try {
                fgn.LIZIZ(RunnableC36516EUu.LJLIL, "doFrameControllerRunnable", ((Boolean) C88109Yi1.LJFF.getValue()).booleanValue());
            } catch (Throwable unused) {
            }
            C37179EiV.LJFF.post(FOI.LJLIL);
            if (FN1.LIZ) {
                C38840FMe LIZLLL = C38840FMe.LIZLLL();
                if (!LIZLLL.LIZIZ && Looper.myLooper() == C16880lQ.LLJJJJ()) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 == 28) {
                            LIZLLL.LIZ = (long[]) C36508EUm.LIZJ(C36508EUm.LIZJ(C16880lQ.LLIIIJ(), "mFrameInfo"), "mFrameInfo");
                        } else if (i2 > 28) {
                            LIZLLL.LIZ = (long[]) C36508EUm.LIZJ(C36508EUm.LIZJ(C16880lQ.LLIIIJ(), "mFrameInfo"), "frameInfo");
                        } else if (i2 > 22) {
                            LIZLLL.LIZ = (long[]) C36508EUm.LIZJ(C36508EUm.LIZJ(C16880lQ.LLIIIJ(), "mFrameInfo"), "mFrameInfo");
                        }
                    } catch (Exception unused2) {
                    }
                    if (LIZLLL.LIZ != null) {
                        C36381bm c36381bm = C36381bm.LJIL;
                        c36381bm.LJIIIIZZ();
                        c36381bm.LIZLLL(new C38841FMf(LIZLLL));
                        try {
                            Object[] objArr = (Object[]) C36508EUm.LIZJ(C16880lQ.LLIIIJ(), "mCallbackQueues");
                            LIZLLL.LJ = objArr;
                            LIZLLL.LIZLLL = C36508EUm.LIZIZ(objArr[0].getClass(), "addCallbackLocked", Long.TYPE, Object.class, Object.class);
                            LIZLLL.LJFF = LIZLLL.LJ.length - 1;
                            LIZLLL.LIZ();
                        } catch (Exception unused3) {
                        }
                        LIZLLL.LIZIZ = true;
                    }
                }
            }
            if (((Boolean) C88087Yhf.LJII.getValue()).booleanValue()) {
                C38995FSd.LIZJ().execute(RunnableC40409FtV.LJLIL);
            }
            if (C35183DrP.LIZ()) {
                C38843FMh c38843FMh = C38851FMp.LIZ;
                c38843FMh.LIZ.submit(new RunnableC09760Zw(i, c38843FMh, new ACallableS109S0100000_6(this, 3), "optimize_feedbackground"));
            }
            C56662Kg.LIZ().LJFF("main_act_performance_observe", false);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onResume() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(PerformanceActivityAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        FGN.LIZ("simbaRunnable");
        FGN.LIZ("choreographerOptServiceRunnable");
        FGN.LIZ("doFrameControllerRunnable");
        if (C38862FNa.LIZ()) {
            BusinessModuleServiceImpl.createBusinessModuleServicebyMonsterPlugin(false).resetWatchState();
        }
        if (this.LJLJI && ((Boolean) DVD.LIZIZ.getValue()).booleanValue()) {
            DoFrameController.LIZIZ = 2;
            this.LJLJI = false;
        } else {
            BusinessModuleServiceImpl.createBusinessModuleServicebyMonsterPlugin(false).getMainLooperOptServiceAndUpdateWatchMainFrame();
        }
        if (C33842DPy.LIZ()) {
            CommonFeedServiceImpl.LJJIJLIJ().LJIIJ();
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void S5() {
        Resources.Theme theme;
        C38839FMd c38839FMd = (C38839FMd) this.LJLJJI.getValue();
        c38839FMd.getClass();
        if (C34710Djm.LJII()) {
            C38842FMg c38842FMg = new C38842FMg();
            Activity activity = c38839FMd.LJLIL;
            Application application = activity.getApplication();
            if (application != null && application.getBaseContext() != null) {
                try {
                    c38842FMg.LIZ = ((Integer) C38842FMg.LIZ(application.getBaseContext(), C36496EUa.LIZIZ(Context.class, "getThemeResId", new Class[0]), new Object[0])).intValue();
                    application.setTheme(R.style.ul);
                    int i = Build.VERSION.SDK_INT;
                    if ((i == 21 || i == 22) && (theme = (Resources.Theme) C36496EUa.LIZ(Class.forName("android.app.ContextImpl"), "mTheme").get(application.getBaseContext())) != null) {
                        theme.applyStyle(R.style.ul, true);
                    }
                    Configuration configuration = application.getResources().getConfiguration();
                    c38842FMg.LIZIZ = new Configuration(configuration);
                    configuration.setTo(activity.getResources().getConfiguration());
                    activity.unregisterComponentCallbacks(c38842FMg.LIZLLL);
                    activity.registerComponentCallbacks(c38842FMg.LIZLLL);
                    c38842FMg.LIZJ = true;
                } catch (Throwable unused) {
                }
            }
            c38839FMd.LJLILLLLZI = c38842FMg;
        }
    }

    public PerformanceActivityAssem() {
        LauncherService.LIZLLL().LIZIZ();
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        if (((Boolean) C34565DhR.LIZ.getValue()).booleanValue()) {
            C67012k5.LJ.LIZLLL();
        }
        C38847FMl.LIZIZ.clear();
        C38847FMl.LIZ.clear();
        FET.LIZ();
        C16970lZ.LJIIIIZZ("profile_fragment_user_mt");
        C16970lZ.LJIIIIZZ("profile_fragment_aweme_list_mus");
        C16970lZ.LJIIIIZZ("aweme_comment_fragment_comment_list");
        C16970lZ.LJIIIIZZ("detail_feed_activity_video_detail");
        C16970lZ.LJIIIIZZ("detail_feed_fragment_detail_page");
        C16970lZ.LJIIIIZZ("detail_feed_insights_bottom");
        C16970lZ.LJIIIIZZ("detail_feed_video_seek_bar");
        C16970lZ.LJIIIIZZ("aweme_comment_fragment_input_detail");
        C16970lZ.LJIIIIZZ("awemenotice_fragment_navigation_container");
        C16970lZ.LJIIIIZZ("awemenotice_fragment_inbox_layout");
        C16970lZ.LJIIIIZZ("awemenotice_inbox_activity_notice");
        LNZ.LIZIZ.clearDrawableCache();
        MFE.LIZJ = true;
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        C38839FMd c38839FMd = (C38839FMd) this.LJLJJI.getValue();
        C38842FMg c38842FMg = c38839FMd.LJLILLLLZI;
        if (c38842FMg != null && c38842FMg.LIZJ && C34710Djm.LJII()) {
            Application LIZ = c38839FMd.LIZ();
            if (c38842FMg.LIZJ) {
                LIZ.setTheme(c38842FMg.LIZ);
                LIZ.getResources().getConfiguration().setTo(c38842FMg.LIZIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        int i;
        if (z) {
            if (C35274Dss.LIZ() != -1) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(FAJ.LJ)) {
                    FAJ.LJ = Boolean.FALSE;
                    FAJ.LJFF = bool;
                    Iterator it = ((ConcurrentHashMap) FAJ.LIZLLL).entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        synchronized (entry.getValue()) {
                            entry.getValue().notifyAll();
                        }
                        it.remove();
                    }
                }
            }
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            createIMainServicebyMonsterPlugin.startupTestColdBootEnd();
            C36093EEn.LIZ.getClass();
            if (EEZ.LIZJ()) {
                C40438Fty.LIZLLL("system_launch");
                if (((Boolean) DQV.LIZLLL.getValue()).booleanValue()) {
                    C232469Ak.LIZ.LJ("SystemLaunch", new C94I(((Number) DQV.LIZJ.getValue()).longValue()));
                }
                C40438Fty.LIZLLL("system_launch_startup_end_to_feed");
                C40438Fty.LIZLLL("system_launch_isolate_startup_to_first_frame");
                C40438Fty.LIZLLL("system_launch_1_minute");
                C40438Fty.LIZLLL("system_launch_1_minute_feed");
                if (((Boolean) C33862DQs.LJ.getValue()).booleanValue()) {
                    C232469Ak c232469Ak = C232469Ak.LIZ;
                    C33862DQs.LIZ.getClass();
                    c232469Ak.LJ("SystemLaunch1Minute", new C94I(((Number) C33862DQs.LIZLLL.getValue()).longValue()));
                }
                C40438Fty.LIZLLL("three_vv");
                C84763XOl.LJI().LJJJJZI(new AfS18S0001000_6(2, 1));
                if (((Boolean) C60762a0.LIZIZ.getValue()).booleanValue() && FEN.LIZLLL.nextFloat() <= 0.05d) {
                    ReentrantReadWriteLock reentrantReadWriteLock = FEN.LIZJ;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock.getReadHoldCount();
                        for (int i2 = 0; i2 < i; i2++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        HashMap<String, FON> hashMap = FEN.LIZIZ;
                        FON fon = hashMap.get("system_launch");
                        if (fon == null) {
                            fon = new FON();
                            fon.LIZIZ = System.currentTimeMillis();
                            hashMap.put("system_launch", fon);
                        }
                        FON fon2 = fon;
                        int i3 = 0;
                    } finally {
                        for (int i4 = 0; i4 < i; i4++) {
                            readLock.lock();
                        }
                        writeLock.unlock();
                    }
                }
                if (((Boolean) C34565DhR.LIZIZ.getValue()).booleanValue() || ((Boolean) C34565DhR.LIZJ.getValue()).booleanValue()) {
                    C67012k5.LJ.LIZLLL();
                }
                if (!this.LJLIL) {
                    this.LJLIL = true;
                    EE1 likoInitTask = createIMainServicebyMonsterPlugin.getLikoInitTask();
                    if (likoInitTask != null) {
                        C36093EEn.LIZ.getClass();
                        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                        LJIIIZ.LIZIZ(likoInitTask, true);
                        LJIIIZ.LIZJ();
                    }
                    if (!((Boolean) C35138Dqg.LJ.getValue()).booleanValue()) {
                        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                        C16970lZ.LJ(R.layout.bom, LIZ);
                        C16970lZ.LJ(R.layout.tr, LIZ);
                        C16970lZ.LJ(R.layout.c7s, LIZ);
                    }
                }
                C37179EiV.LJFF.postDelayed(new ARunnableS42S0100000_6(this, 39), 50000L);
            }
            if (!this.LJLILLLLZI) {
                this.LJLILLLLZI = true;
                C37179EiV.LJFF.postDelayed(FEU.LJLIL, 10000L);
            }
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).setOptSmartAvatarBorderView(FN9.LIZ);
            if (C35214Dru.LIZIZ) {
                C37179EiV.LJFF.postDelayed(RunnableC36520EUy.LJLIL, 1000L);
            }
            C37179EiV.LJFF.post(new ARunnableS42S0100000_6(this, 40));
            if (((Boolean) C35274Dss.LJ.getValue()).booleanValue()) {
                C37688Eqi c37688Eqi = C37691Eql.LIZ;
                if (c37688Eqi.LIZ) {
                    c37688Eqi.LIZ = false;
                    HandlerC37689Eqj handlerC37689Eqj = c37688Eqi.LIZJ;
                    if (handlerC37689Eqj != null) {
                        try {
                            handlerC37689Eqj.LJLILLLLZI = false;
                            if (C37684Eqe.LJ() == handlerC37689Eqj) {
                                C37684Eqe.LIZ(handlerC37689Eqj.LJLIL);
                                C37684Eqe.LIZIZ(handlerC37689Eqj, handlerC37689Eqj.LJLIL);
                            }
                        } catch (Throwable th) {
                            Log.getStackTraceString(th);
                        }
                    }
                    HandlerC37686Eqg handlerC37686Eqg = c37688Eqi.LIZLLL;
                    if (handlerC37686Eqg != null) {
                        try {
                            try {
                                if (((Handler) C36508EUm.LIZJ(handlerC37686Eqg.LJLJI, "mHandler")) == handlerC37686Eqg) {
                                    Choreographer choreographer = handlerC37686Eqg.LJLJI;
                                    try {
                                        C37685Eqf.LIZIZ(C37685Eqf.LIZ(C36508EUm.LIZ(choreographer.getClass(), "mHandler")), choreographer, handlerC37686Eqg.LJLIL);
                                    } catch (Throwable th2) {
                                        Log.getStackTraceString(th2);
                                    }
                                    C37684Eqe.LIZIZ(handlerC37686Eqg, handlerC37686Eqg.LJLIL);
                                }
                            } catch (Throwable th3) {
                                Log.getStackTraceString(th3);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    HandlerC37687Eqh handlerC37687Eqh = c37688Eqi.LJ;
                    if (handlerC37687Eqh != null) {
                        try {
                            ViewParent viewParent = handlerC37687Eqh.LJLILLLLZI.get();
                            if (viewParent != null && C37684Eqe.LJFF(viewParent) == handlerC37687Eqh) {
                                C37684Eqe.LIZJ(handlerC37687Eqh.LJLIL, viewParent);
                                C37684Eqe.LIZIZ(handlerC37687Eqh, handlerC37687Eqh.LJLIL);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            if (FKN.LIZ(C212428Vi.LIZ(this)) == 2) {
                C38993FSb.LIZ = false;
            }
        }
    }
}
