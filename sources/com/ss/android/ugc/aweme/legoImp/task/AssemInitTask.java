package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C212958Xj;
import X.C212968Xk;
import X.C214368bA;
import X.C214438bH;
import X.C221108m2;
import X.C2Y8;
import X.C2YC;
import X.C2YG;
import X.C34239DcB;
import X.C34613DiD;
import X.C34879DmV;
import X.C34889Dmf;
import X.C35234DsE;
import X.C35809E3p;
import X.C35880E6i;
import X.C36922EeM;
import X.C36925EeP;
import X.C38018Ew2;
import X.C38814FLe;
import X.C38995FSd;
import X.C46383IIh;
import X.C46385IIj;
import X.C46386IIk;
import X.C46387IIl;
import X.C46388IIm;
import X.C46389IIn;
import X.C46390IIo;
import X.C46391IIp;
import X.C48165IvJ;
import X.C52233Kej;
import X.C52329KgH;
import X.C52758KnC;
import X.C52760KnE;
import X.C52762KnG;
import X.C53186Ku6;
import X.C55106Ljy;
import X.C55107Ljz;
import X.C55225Llt;
import X.C55249LmH;
import X.C58096Mr6;
import X.C58424MwO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78693UuX;
import X.C78999UzT;
import X.C84596XIa;
import X.C84597XIb;
import X.C84598XIc;
import X.C84599XId;
import X.C84600XIe;
import X.C84601XIf;
import X.C84602XIg;
import X.C84603XIh;
import X.C84604XIi;
import X.C84605XIj;
import X.C84606XIk;
import X.C84607XIl;
import X.C84609XIn;
import X.C84611XIp;
import X.C84619XIx;
import X.C88494YoE;
import X.C88495YoF;
import X.C88496YoG;
import X.C88497YoH;
import X.C88498YoI;
import X.C88499YoJ;
import X.C88500YoK;
import X.C88501YoL;
import X.C88502YoM;
import X.C88503YoN;
import X.C88504YoO;
import X.C88505YoP;
import X.C88507YoR;
import X.C88508YoS;
import X.C88509YoT;
import X.C88510YoU;
import X.C88511YoV;
import X.C8WC;
import X.C8WD;
import X.C8YI;
import X.C8YT;
import X.DX4;
import X.DX5;
import X.DX6;
import X.DX7;
import X.DX8;
import X.DX9;
import X.DXA;
import X.DY7;
import X.E3F;
import X.EE1;
import X.EE4;
import X.EEZ;
import X.EFK;
import X.EHV;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.ExecutorC36420ERc;
import X.InterfaceC36076EDw;
import X.InterfaceC58433MwX;
import X.RunnableC35806E3m;
import X.SZE;
import X.SZI;
import X.ThreadFactoryC38022Ew6;
import X.XIN;
import X.XIO;
import X.XIP;
import X.XIQ;
import X.XIR;
import X.XIS;
import X.XIT;
import X.XIV;
import X.XIY;
import X.XIZ;
import android.content.Context;
import androidx.lifecycle.SharedViewModelHostInjector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.performanceopt.api.FindTargetScopeFailFasterService;
import com.ss.android.ugc.feed.platform.service.FindTargetScopeFailFasterServiceImpl;
import defpackage.e1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AssemInitTask implements EE1, InterfaceC36076EDw {
    public static final CopyOnWriteArrayList<String> LJLIL = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArraySet<C38814FLe> LJLILLLLZI = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "AssemInitTask";
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

    static {
        C221108m2.LIZIZ(C35880E6i.INSTANCE);
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        if (((Boolean) C34239DcB.LIZ.getValue()).booleanValue()) {
            return 2;
        }
        return 1;
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

    @Override // X.EEY
    public final void run(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        Executor executor;
        FindTargetScopeFailFasterService findTargetScopeFailFasterService;
        o.LJIIIZ(context, "context");
        C214368bA.LIZ = false;
        E3F.LIZIZ("asseminjectDebug", C84609XIn.LJLIL, !C34613DiD.LJIIL);
        C214368bA.LIZLLL = C46383IIh.LIZ;
        C214368bA.LJIIJ = C46390IIo.LIZ;
        C55249LmH.LIZJ = C46391IIp.LIZ;
        C55249LmH.LIZLLL = C52233Kej.LIZ();
        C55249LmH.LJ = e1.LIZ(31744, "enable_assem_as_vscope", true, false);
        C62822Ol8 c62822Ol8 = C35809E3p.LIZ;
        C214368bA.LJJI = (Executor) c62822Ol8.getValue();
        if (((Number) C34889Dmf.LIZ.getValue()).intValue() == 1) {
            ExecutorService LIZLLL = C38995FSd.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getIOExecutor()");
            C214368bA.LJJIFFI = LIZLLL;
        }
        if (!((Boolean) C34879DmV.LIZ.getValue()).booleanValue()) {
            C214368bA.LJJII = new C84619XIx();
        }
        InterfaceC58433MwX interfaceC58433MwX = (InterfaceC58433MwX) C58424MwO.LJFF.getValue();
        if (interfaceC58433MwX != null) {
            C214368bA.LJJIII = interfaceC58433MwX;
        }
        C214368bA.LJIJJ = ((Boolean) C52762KnG.LIZ.getValue()).booleanValue();
        C214368bA.LJIL = ((Boolean) DY7.LIZ.getValue()).booleanValue();
        if (((Number) C35234DsE.LIZ.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        C36922EeM.LJ("sink scope define: " + z);
        C214368bA.LJIIL = z;
        C214368bA.LJ = C46386IIk.LIZ;
        C214368bA.LJI = C46387IIl.LIZ;
        C214368bA.LJIIIIZZ = C46385IIj.LIZ;
        C214368bA.LJFF = ((Boolean) C52329KgH.LIZ.getValue()).booleanValue();
        C214368bA.LJIIJJI = C46388IIm.LIZ;
        C214368bA.LJIIIZ = C46389IIn.LIZ;
        C214368bA.LJIILIIL = DX7.LIZ;
        C214368bA.LJIILJJIL = DX5.LIZ;
        C214368bA.LJIILL = DX4.LIZ;
        C214368bA.LJIILLIIL = DX8.LIZ;
        C214368bA.LJIIZILJ = DX6.LIZ;
        C214368bA.LJIJJLI = e1.LIZ(31744, "unify_assem_holder_viewmodel", true, false);
        if (((Number) C52758KnC.LIZ.getValue()).intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C214368bA.LJIJ = z2;
        if (((Number) C52760KnE.LIZ.getValue()).intValue() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C214368bA.LJIJI = z3;
        SZI.LIZJ = ((Boolean) C53186Ku6.LIZIZ.getValue()).booleanValue();
        SZI.LIZ = new C48165IvJ();
        C55249LmH.LJI = DXA.LIZ;
        if (((Boolean) C53186Ku6.LIZJ.getValue()).booleanValue()) {
            executor = new ExecutorC36420ERc();
        } else {
            C38018Ew2 c38018Ew2 = new C38018Ew2(30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38022Ew6("tracker-serial-t", 0));
            c38018Ew2.allowCoreThreadTimeOut(true);
            executor = c38018Ew2;
        }
        SZI.LIZIZ = executor;
        SZE.LJFF(C65352Pkq.LIZ(C88504YoO.class), C84605XIj.LIZ().getSubscribeAssembleEvent(), XIN.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88502YoM.class), C84605XIj.LIZ().getSubscribeAssemLifecycleEvent(), C8WD.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88501YoL.class), C84605XIj.LIZ().getSubscribeAssemDslEvent(), C8WC.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88510YoU.class), C84605XIj.LIZ().getSubscribeGetAbilityEvent(), C55106Ljy.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88509YoT.class), C84605XIj.LIZ().getSubscribeBindAbilityEvent(), C55107Ljz.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88495YoF.class), C84605XIj.LIZ().getSubscribeAssemCreateEvent(), XIP.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88503YoN.class), C84605XIj.LIZ().getViewModelCreateEvent(), C214438bH.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88508YoS.class), C84605XIj.LIZ().getViewModelSubscribePerformanceEvent(), C8YT.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88498YoI.class), C84605XIj.LIZ().getHierarchyDataPerformanceRate(), XIQ.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88494YoE.class), C84605XIj.LIZ().getAssemAssembleContainerInitEventRate(), XIO.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88505YoP.class), C84605XIj.LIZ().getBindProxyEventRate(), C212968Xk.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88507YoR.class), C84605XIj.LIZ().getOnHostBindEventRate(), C212958Xj.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88496YoG.class), C84605XIj.LIZ().getAssemInitEventRate(), XIR.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88497YoH.class), C84605XIj.LIZ().getAssemInitializeHostEvent(), XIT.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88511YoV.class), C84605XIj.LIZ().getVScopePerformanceEvent(), C55225Llt.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88500YoK.class), C84605XIj.LIZ().getProviderBindEvent(), XIV.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88499YoJ.class), C84605XIj.LIZ().getProviderProvideEvent(), XIS.LJLIL);
        EEZ.LIZ(new XIZ());
        SZE.LJFF(C65352Pkq.LIZ(C88499YoJ.class), C84605XIj.LIZ().getColdStartTrackRate(), C84598XIc.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88511YoV.class), C84605XIj.LIZ().getColdStartTrackRate(), C84604XIi.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88500YoK.class), C84605XIj.LIZ().getColdStartTrackRate(), C84599XId.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88505YoP.class), C84605XIj.LIZ().getColdStartTrackRate(), C84600XIe.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88498YoI.class), C84605XIj.LIZ().getColdStartTrackRate(), C84596XIa.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88508YoS.class), C84605XIj.LIZ().getColdStartTrackRate(), C84601XIf.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88503YoN.class), C84605XIj.LIZ().getColdStartTrackRate(), C84602XIg.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88495YoF.class), C84605XIj.LIZ().getColdStartTrackRate(), C84597XIb.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88501YoL.class), C84605XIj.LIZ().getColdStartTrackRate(), C84603XIh.LJLIL);
        SZE.LJFF(C65352Pkq.LIZ(C88504YoO.class), C84605XIj.LIZ().getColdStartTrackRate(), XIY.LJLIL);
        ((ExecutorService) c62822Ol8.getValue()).execute(RunnableC35806E3m.LJLIL);
        SharedViewModelHostInjector.INSTANCE.setOptimiseLifecycle(DX9.LIZ);
        C214368bA.LJII = new EHV();
        C8YI.LIZ = new C84606XIk();
        C214368bA.LIZIZ = new C36925EeP();
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("vprovider_logger_setting_v2", false)) {
            C55249LmH.LJFF = new C84607XIl();
        }
        if (((Boolean) C2YC.LIZJ.getValue()).booleanValue()) {
            C55249LmH.LIZIZ = new C84611XIp();
        }
        if (((Boolean) C2Y8.LIZJ.getValue()).booleanValue()) {
            C78693UuX.LIZ = new C78999UzT();
        }
        if (((Boolean) C2YG.LIZJ.getValue()).booleanValue()) {
            Object LIZ = C58096Mr6.LIZ(FindTargetScopeFailFasterService.class, false);
            if (LIZ != null) {
                findTargetScopeFailFasterService = (FindTargetScopeFailFasterService) LIZ;
            } else {
                if (C58096Mr6.t8 == null) {
                    synchronized (FindTargetScopeFailFasterService.class) {
                        if (C58096Mr6.t8 == null) {
                            C58096Mr6.t8 = new FindTargetScopeFailFasterServiceImpl();
                        }
                    }
                }
                findTargetScopeFailFasterService = C58096Mr6.t8;
            }
            if (findTargetScopeFailFasterService != null) {
                findTargetScopeFailFasterService.LIZ();
            }
        }
    }
}
