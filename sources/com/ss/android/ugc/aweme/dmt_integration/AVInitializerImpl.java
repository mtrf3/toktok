package com.ss.android.ugc.aweme.dmt_integration;

import X.C139895eL;
import X.C16880lQ;
import X.C33768DNc;
import X.C34686DjO;
import X.C41389GMf;
import X.C41877Gc5;
import X.C42130GgA;
import X.C42383GkF;
import X.C42384GkG;
import X.C42470Gle;
import X.C42471Glf;
import X.C43150Gwc;
import X.C43553H7l;
import X.C43571H8d;
import X.C43793HGr;
import X.C44380HbM;
import X.C44694HgQ;
import X.C45697Hwb;
import X.C45795HyB;
import X.C45796HyC;
import X.C45797HyD;
import X.C52509KjB;
import X.C58020Mps;
import X.C58096Mr6;
import X.C58665N0r;
import X.C5NP;
import X.C60903NvH;
import X.C61S;
import X.C6YE;
import X.C74177T9h;
import X.C74216TAu;
import X.C76800UCe;
import X.C78565UsT;
import X.C78598Ut0;
import X.C78882Uxa;
import X.C78934UyQ;
import X.C82087WJn;
import X.C82646Wc6;
import X.C82851WfP;
import X.C82852WfQ;
import X.C82884Wfw;
import X.C82886Wfy;
import X.C82889Wg1;
import X.C82890Wg2;
import X.C82891Wg3;
import X.C82893Wg5;
import X.C82896Wg8;
import X.C82899WgB;
import X.C82901WgD;
import X.C82902WgE;
import X.C82908WgK;
import X.C82910WgM;
import X.C82911WgN;
import X.C82915WgR;
import X.C82916WgS;
import X.C84499XEh;
import X.C88034Ygo;
import X.C88074YhS;
import X.DN4;
import X.EF7;
import X.EJR;
import X.FFL;
import X.H8X;
import X.HBV;
import X.HZU;
import X.HZV;
import X.I9H;
import X.IDM;
import X.IGG;
import X.InterfaceC173646rg;
import X.InterfaceC41390GMg;
import X.InterfaceC43728HEe;
import X.InterfaceC44948HkW;
import X.InterfaceC65784Pro;
import X.InterfaceC82888Wg0;
import X.InterfaceC88472Yns;
import X.N1B;
import X.N1C;
import X.T2J;
import X.TMB;
import X.TMC;
import X.WPZ;
import android.app.Application;
import android.graphics.Typeface;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.modeo.IModeoInit;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.services.IAVInitializer;
import com.ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class AVInitializerImpl implements IAVInitializer {
    public static boolean LIZIZ;
    public boolean LIZ;

    public static IAVInitializer LIZ() {
        Object LIZ = C58096Mr6.LIZ(IAVInitializer.class, false);
        if (LIZ != null) {
            return (IAVInitializer) LIZ;
        }
        if (C58096Mr6.x == null) {
            synchronized (IAVInitializer.class) {
                if (C58096Mr6.x == null) {
                    C58096Mr6.x = new AVInitializerImpl();
                }
            }
        }
        return C58096Mr6.x;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void updateAB() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        FFL.LJIIIZ().getClass();
        repo.storeInt("creative_tools_album_opti_2021_10", FFL.LJIIJ(31744, 0, "creative_tools_album_opti_2021_10", true));
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void initAVEnv(Application application) {
        o.LJIIIZ(application, "application");
        if (!this.LIZ) {
            C60903NvH.LJ = application;
            C82908WgK.LIZ = new AqS157S0100000_7(application, 111);
            C78934UyQ.LJLIL = new C43793HGr();
            this.LIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void initMonitor(Application application) {
        o.LJIIIZ(application, "application");
        C42383GkF c42383GkF = C42130GgA.LIZ;
        c42383GkF.getClass();
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            if (!c42383GkF.LJ) {
                application.registerActivityLifecycleCallbacks(new C42384GkG(c42383GkF));
                c42383GkF.LJ = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("CreativeActivityMonitor: init must call in main thread!");
    }

    @Override // com.ss.android.ugc.aweme.services.IAVInitializer
    public final void initialize(Application application) {
        int openAlbumOptiGroup;
        boolean z;
        o.LJIIIZ(application, "application");
        initAVEnv(application);
        if (((Boolean) DN4.LIZIZ.getValue()).booleanValue()) {
            openAlbumOptiGroup = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("creative_tools_album_opti_2021_10", 0);
        } else {
            openAlbumOptiGroup = InterfaceC44948HkW.LJI.getOpenAlbumOptiGroup();
        }
        if (openAlbumOptiGroup != 0) {
            z = true;
        } else {
            z = false;
        }
        C45697Hwb.LIZ = z;
        C44694HgQ.LIZLLL = new C45796HyC();
        C44694HgQ.LIZJ = new C45797HyD();
        HZV.LIZ = new C78565UsT();
        IDM.LIZ = new C78598Ut0();
        HZU.LIZ = new TMC();
        if (!((Boolean) C88074YhS.LIZIZ.getValue()).booleanValue()) {
            C60903NvH.LJIIJJI().LJJIJL().LIZ(new AVStorageManagerImpl());
        }
        LIZIZ = true;
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14((InterfaceC43728HEe) C82908WgK.LIZIZ.getValue(), 315);
        C82889Wg1 c82889Wg1 = C82893Wg5.LIZIZ;
        c82889Wg1.getClass();
        c82889Wg1.LJI = aqS180S0100000_14;
        C82884Wfw block = C82884Wfw.LJLIL;
        o.LJIIIZ(block, "block");
        C82886Wfy c82886Wfy = C82893Wg5.LIZJ;
        c82886Wfy.getClass();
        c82886Wfy.LIZLLL = block;
        C82911WgN block2 = C82911WgN.LJLIL;
        o.LJIIIZ(block2, "block");
        C82896Wg8 c82896Wg8 = C82893Wg5.LIZLLL;
        c82896Wg8.getClass();
        c82896Wg8.LIZIZ = block2;
        C82910WgM block3 = C82910WgM.LJLIL;
        o.LJIIIZ(block3, "block");
        C82899WgB c82899WgB = C82893Wg5.LJ;
        c82899WgB.getClass();
        c82899WgB.LIZIZ = block3;
        boolean booleanValue = ((Boolean) C34686DjO.LIZ.getValue()).booleanValue();
        if (C82893Wg5.LIZ.compareAndSet(false, true)) {
            C82891Wg3 c82891Wg3 = C82891Wg3.LJIIIZ;
            c82891Wg3.getClass();
            C82891Wg3.LJII = c82889Wg1;
            C44694HgQ.LJI = T2J.LJLJI;
            if (!booleanValue) {
                c82889Wg1.LJIIJ();
                Application application2 = c82889Wg1.LIZ;
                if (application2 != null) {
                    C82891Wg3.LIZIZ.LIZIZ(C82891Wg3.LIZ[0], c82891Wg3, application2);
                    C44694HgQ c44694HgQ = C44694HgQ.LJIILIIL;
                    c44694HgQ.getClass();
                    C44694HgQ.LIZIZ.LIZIZ(C44694HgQ.LIZ[0], c44694HgQ, application2);
                }
                c82889Wg1.LJIIJ();
                Boolean bool = c82889Wg1.LIZIZ;
                if (bool != null) {
                    C82891Wg3.LIZJ.LIZIZ(C82891Wg3.LIZ[1], c82891Wg3, Boolean.valueOf(bool.booleanValue()));
                }
                c82889Wg1.LJIIJ();
                Gson gson = c82889Wg1.LIZLLL;
                if (gson != null) {
                    C82891Wg3.LIZLLL.LIZIZ(C82891Wg3.LIZ[2], c82891Wg3, gson);
                }
                c82889Wg1.LJIIJ();
                C6YE c6ye = c82889Wg1.LJ;
                if (c6ye != null) {
                    C82891Wg3.LJ.LIZIZ(C82891Wg3.LIZ[3], c82891Wg3, c6ye);
                }
                c82889Wg1.LJIIJ();
                I9H i9h = c82889Wg1.LJFF;
                if (i9h != null) {
                    C82891Wg3.LJFF.LIZIZ(C82891Wg3.LIZ[4], c82891Wg3, i9h);
                }
            }
            TMB tmb = C82890Wg2.LJFF;
            tmb.getClass();
            C82890Wg2.LJ = c82889Wg1;
            if (!booleanValue) {
                c82889Wg1.LJIIJ();
                InterfaceC82888Wg0 interfaceC82888Wg0 = c82889Wg1.LIZJ;
                if (interfaceC82888Wg0 != null) {
                    C82890Wg2.LIZLLL.LIZIZ(TMB.LIZ[0], tmb, interfaceC82888Wg0);
                }
            }
            C78882Uxa c78882Uxa = C78882Uxa.LJ;
            c78882Uxa.getClass();
            C78882Uxa.LIZLLL = c82886Wfy;
            if (!booleanValue) {
                c82886Wfy.LJI();
                InterfaceC65784Pro<? extends Typeface> interfaceC65784Pro = c82886Wfy.LIZIZ;
                if (interfaceC65784Pro != null) {
                    C78882Uxa.LIZJ.LIZIZ(C78882Uxa.LIZ[1], c78882Uxa, interfaceC65784Pro);
                }
                c82886Wfy.LJI();
                InterfaceC173646rg interfaceC173646rg = c82886Wfy.LIZ;
                if (interfaceC173646rg != null) {
                    C78882Uxa.LIZIZ.LIZIZ(C78882Uxa.LIZ[0], c78882Uxa, interfaceC173646rg);
                }
            }
            C82851WfP.LJIIL = c82886Wfy;
            if (!booleanValue && C82851WfP.LJIILIIL.compareAndSet(false, true)) {
                c82886Wfy.LJI();
                InterfaceC88472Yns<? super C82851WfP, C76800UCe> interfaceC88472Yns = c82886Wfy.LIZJ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(C82852WfQ.LIZ());
                }
            }
            C82891Wg3.LJIIIIZZ = c82896Wg8;
            if (!booleanValue) {
                C5NP logger = c82896Wg8.getLogger();
                if (logger != null) {
                    C82891Wg3.LJI.LIZIZ(C82891Wg3.LIZ[5], c82891Wg3, logger);
                }
                c82899WgB.LIZIZ();
                InterfaceC88472Yns<? super HBV, C76800UCe> interfaceC88472Yns2 = c82899WgB.LIZ;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(N1C.LIZ);
                }
                c82899WgB.LIZIZ();
            } else {
                C58665N0r c58665N0r = N1C.LIZ;
                C82901WgD c82901WgD = new C82901WgD(c82899WgB);
                c58665N0r.getClass();
                c58665N0r.LIZJ = c82901WgD;
                C58665N0r c58665N0r2 = N1B.LIZ;
                C82902WgE c82902WgE = new C82902WgE(c82899WgB);
                c58665N0r2.getClass();
                c58665N0r2.LIZJ = c82902WgE;
            }
            c82899WgB.LIZIZ();
        }
        C43150Gwc.LIZLLL = new IGG();
        C42470Gle c42470Gle = C41877Gc5.LIZ;
        if (!c42470Gle.LIZIZ) {
            ((Application) C16880lQ.LLLLL(application)).registerActivityLifecycleCallbacks(new C42471Glf(c42470Gle));
            c42470Gle.LIZIZ = true;
        }
        c42470Gle.LIZLLL(new C43571H8d());
        C139895eL.LIZ = new C45795HyB();
        if (C82646Wc6.LIZ() || C82646Wc6.LIZIZ()) {
            C82087WJn.LIZ(application).LIZ(1);
        } else {
            C82087WJn.LIZ(application).LIZ(0);
        }
        C84499XEh.LIZ = ((Boolean) C33768DNc.LIZIZ.getValue()).booleanValue();
        C84499XEh.LIZIZ = ((Boolean) C33768DNc.LIZJ.getValue()).booleanValue();
        ((IModeoInit) ServiceManager.get().getService(IModeoInit.class)).initModeoEnv(application);
        C74216TAu.LIZ = C74177T9h.LIZ;
        WPZ.LIZ = C44380HbM.LIZ;
        C82915WgR.LIZ = C52509KjB.LIZ;
        C82916WgS.LJLIL = new C61S();
        C58020Mps.LIZ = EJR.LJLIL;
        C43553H7l c43553H7l = new C43553H7l();
        List<InterfaceC41390GMg> list = C41389GMf.LIZ;
        ArrayList arrayList = (ArrayList) list;
        arrayList.remove(c43553H7l);
        arrayList.add(c43553H7l);
        H8X h8x = new H8X();
        ArrayList arrayList2 = (ArrayList) list;
        arrayList2.remove(h8x);
        arrayList2.add(h8x);
        if (((Boolean) C88034Ygo.LIZIZ.getValue()).booleanValue()) {
            AVExternalServiceImpl.LIZ().specialPlusService().isNeedShowSpecialPlusDirect();
        }
        if (ujb.o.LJJJLIIL(EF7.LJIILIIL, "koopa_fastbot_", false) && e1.LIZ(31744, "enable_camera_audio_checker", true, false)) {
            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJI(application);
        }
    }
}
