package X;

import Y.AObjectS126S0200000_6;
import Y.AObjectS21S0001000_5;
import Y.ARunnableS10S0101000_6;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS1S0001000_6;
import Y.IDRunnableS6S0101000;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.dex.DexTricksNativeHolder;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.librarian.Librarian;
import com.ss.android.common.applog.AppLog;
import com.ss.android.legoimpl.DecompressTask;
import com.ss.android.ugc.AwemeAppBuildConfig;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.application.AwemeAppTaskProvider;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.wrapper.InitServiceTask;
import com.ss.android.ugc.aweme.legoImp.SPKevaPreloadTaskV3;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.AppAttachUserStoreOptTask;
import com.ss.android.ugc.aweme.legoImp.task.AppFlyerLoadPropertiesTask;
import com.ss.android.ugc.aweme.legoImp.task.AppLogInitTask;
import com.ss.android.ugc.aweme.legoImp.task.AssemInitTask;
import com.ss.android.ugc.aweme.legoImp.task.BPEAPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.BindFrescoTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootPreloadPlayerSoTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootSystemOptTask;
import com.ss.android.ugc.aweme.legoImp.task.CombineDrawTask;
import com.ss.android.ugc.aweme.legoImp.task.FeedRequestParamPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.IoPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.JatoInitTask;
import com.ss.android.ugc.aweme.legoImp.task.MessageControllerTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadI18nManagerTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadKevaKeyTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.ss.android.ugc.aweme.legoImp.task.SplitCompatInstall;
import com.ss.android.ugc.aweme.legoImp.task.StoreRegionInitTask;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.legoImp.task.ZeroVideoViewMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.RejectedExecutionHandler;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitAdServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.MobMainSessionStartTask;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.ABPreloadTask;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.setting.TiktokSkinHelper;
import com.ss.android.ugc.aweme.task.AppStartLogTask;
import com.ss.android.ugc.aweme.task.AppStartTask;
import com.ss.android.ugc.aweme.task.ColdLoggerAttachBaseTask;
import com.ss.android.ugc.aweme.task.ScalpelBackgroundRunnableMonitorTask;
import com.ss.android.ugc.aweme.utils.DeadSystemExceptionTask;
import com.ss.android.ugc.aweme.utils.PreventServerSideCrashes;
import com.ss.android.ugc.aweme.utils.WebViewPreInitTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FEs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38646FEs extends FF6 {
    public final C38668FFo LIZ;
    public final Application LIZJ;
    public final AppBuildConfig LIZLLL;
    public C36089EEj LJ;
    public C36089EEj LJFF;
    public final AwemeAppTaskProvider LIZIZ = new AwemeAppTaskProvider();
    public Boolean LJI = null;
    public long LJII = 0;
    public final Object LJIIIIZZ = new Object();
    public final Object LJIIIZ = new Object();

    public static void LJIIJJI() {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS1S0001000_6(0, 18));
    }

    public final boolean LJIIL() {
        if (FCD.LJI(this.LIZJ)) {
            return false;
        }
        Boolean bool = this.LJI;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).isTTWebViewEnabled(this.LIZJ)) {
            this.LJI = Boolean.valueOf(C36839Ed1.LIZ(this.LIZJ).contains("sandboxed_process"));
        } else {
            this.LJI = Boolean.FALSE;
        }
        return this.LJI.booleanValue();
    }

    public final C36089EEj LJIILIIL() {
        if (this.LJ == null) {
            synchronized (this.LJIIIIZZ) {
                if (this.LJ == null) {
                    FAJ.LIZ("application_preload_before_create_task", false);
                    this.LJ = LJIIIIZZ(this.LIZIZ.LIZ());
                    FAJ.LJFF("application_preload_before_create_task", false);
                }
            }
        }
        return this.LJ;
    }

    @Override // X.FF6, X.FKD
    public final void LIZIZ() {
        InitAllServiceImpl.LJIILLIIL().LJIIJJI();
    }

    @Override // X.FF6, X.FKD
    public final void LIZJ() {
        C36089EEj LJIIIIZZ;
        if (LJIIL()) {
            return;
        }
        if (FCD.LJI(this.LIZJ)) {
            EWU.LIZIZ("cold_boot_application_attach_to_create");
            EWU.LIZ("cold_boot_application_create_duration");
            if (DOI.LIZIZ()) {
                C38995FSd.LIZJ().execute(new ARunnableS13S0000000_6(46));
            }
            EFX.LIZLLL = true;
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZIZ(new MainLooperOptService(), true);
            LJIIIZ.LIZIZ(new MessageControllerTask(), true);
            LJIIIZ.LIZIZ(new CombineDrawTask(), true);
            LJIIIZ.LIZJ();
        }
        FAJ.LIZ("application_beforecreate_part1", false);
        int intValue = ((Number) C34710Djm.LJJJJZ.getValue()).intValue();
        if (intValue == 1 || intValue == 2) {
            BlockHelper.beginBlock();
        }
        if (!((Boolean) C34710Djm.LJJJJI.getValue()).booleanValue() && ((Boolean) C34710Djm.LJFF.getValue()).booleanValue()) {
            C36093EEn c36093EEn = C36093EEn.LIZ;
            DeadSystemExceptionTask deadSystemExceptionTask = DeadSystemExceptionTask.LJLIL;
            c36093EEn.getClass();
            C36093EEn.LJ(deadSystemExceptionTask);
        }
        if (!((Boolean) C34710Djm.LIZIZ.getValue()).booleanValue()) {
            Application application = this.LIZJ;
            FCD.LJI(application);
            C36928EeS.LIZ(application);
            if (((Boolean) C34613DiD.LIZIZ.getValue()).booleanValue()) {
                C38995FSd.LIZLLL().execute(new IDRunnableS6S0101000(3, FR4.LIZ, 13));
            }
        }
        FAJ.LJFF("application_beforecreate_part1", false);
        FAJ.LIZ("application_beforecreate_create_tasks", false);
        if (((Boolean) C34710Djm.LJJJ.getValue()).booleanValue()) {
            LJIIIIZZ = LJIILIIL();
        } else {
            LJIIIIZZ = LJIIIIZZ(this.LIZIZ.LIZ());
        }
        FAJ.LJFF("application_beforecreate_create_tasks", false);
        FAJ.LIZ("application_beforecreate_run_tasks", false);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZJ();
        }
        FAJ.LJFF("application_beforecreate_run_tasks", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.FKD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38646FEs.onCreate():void");
    }

    public static C36089EEj LJIIIIZZ(List list) {
        boolean z;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() > 0) {
            C36093EEn.LIZ.getClass();
            boolean z2 = false;
            if ((C36093EEn.LJIIL & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if ((C36093EEn.LJIILIIL & 2) == 2) {
                z2 = true;
            }
            C36089EEj c36089EEj = new C36089EEj(z, z2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c36089EEj.LIZ((EEY) it.next());
            }
            return c36089EEj;
        }
        return null;
    }

    public static C36089EEj LJIIIZ(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() > 0) {
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LJIIIZ.LIZ((EEY) it.next());
            }
            return LJIIIZ;
        }
        return null;
    }

    public static void LJIIJ(List list) {
        if (C34710Djm.LIZ()) {
            if (((Boolean) C34710Djm.LIZLLL.getValue()).booleanValue() || DPP.LIZIZ()) {
                AVInitializerImpl.LIZ().initAVEnv(FKM.LIZ());
            }
            ((ArrayList) list).add(TasksHolder.LIZIZ());
        }
    }

    @Override // X.FKD
    public final void LIZ(Context context) {
        int intValue;
        boolean z;
        if (LJIIL()) {
            ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).initTTWebViewIfNeeded(context);
            return;
        }
        boolean LJI = FCD.LJI(this.LIZJ);
        int i = 0;
        FAJ.LIZ("application_initbefore", false);
        String LIZ = C36839Ed1.LIZ(this.LIZJ);
        int i2 = 1;
        if (LIZ != null && (LIZ.endsWith(":push") || LIZ.endsWith(":pushservice"))) {
            C56662Kg.LIZ().LIZJ("push_app_start", false);
        }
        FAJ.LIZ("application_initbefore_part1", false);
        FAJ.LIZ("application_init_app", false);
        EF1.LIZ(this.LIZJ, this.LIZLLL);
        this.LIZLLL.LJ();
        F78.LIZ = "disabled";
        EF7.LJIIIZ();
        C38653FEz.LIZ = EF7.LJI.LIZ;
        C38652FEy.LIZ();
        C38668FFo c38668FFo = this.LIZ;
        Application application = this.LIZJ;
        c38668FFo.getClass();
        C38668FFo.LIZ(application);
        AppLog.setSwitchToBdtracker(C35820E4a.LIZIZ(this.LIZJ, "open_switch_to_bdtrakcer", false));
        if (FKN.LIZ(this.LIZJ) != -1) {
            C38993FSb.LIZ = true;
        }
        FAJ.LJFF("application_init_app", false);
        FAJ.LIZ("application_init_verify", false);
        if (FKN.LIZIZ(context) == 0) {
            if (FCD.LJI(context)) {
                C36125EFt.LIZ(context);
                JatoXL.disableClassVerify(new OUR());
            } else {
                C36125EFt.LIZIZ(context);
                JatoXL.disableClassVerify(new C62850Ola());
            }
        }
        FAJ.LJFF("application_init_verify", false);
        FAJ.LIZ("application_init_superthreadpool", false);
        o.LJIIIZ(context, "context");
        if (C35820E4a.LIZIZ(context, "optimize_kevasp", false)) {
            intValue = C35820E4a.LIZ(context, 0, "thread_convergence_init_async");
        } else {
            intValue = ((Number) C35072Dpc.LIZ.getValue()).intValue();
        }
        if (intValue > 0) {
            FLR.LIZ();
        } else {
            C38995FSd.LIZJ().execute(new ARunnableS13S0000000_6(context, 53));
        }
        FAJ.LJFF("application_init_superthreadpool", false);
        FAJ.LIZ("application_preinit_ab", false);
        if (C35820E4a.LIZIZ(context, "optimize_loadabrepo_v2", false)) {
            FF5 ff5 = FF4.LIZ;
            ff5.getClass();
            FF5.LIZ();
            C35871E5z.LIZ();
            if (AwemeConfigCenter.LIZIZ()) {
                C38995FSd.LIZLLL().execute(new Q8V(i2, ff5));
                C38995FSd.LIZLLL().execute(new IDRunnableS6S0101000(1, ff5, 9));
            }
        }
        FAJ.LJFF("application_preinit_ab", false);
        FAJ.LIZ("application_initbefore_init_npth", false);
        if (C35820E4a.LIZIZ(this.LIZJ, "optimize_preinitnpth", false)) {
            FFQ ffq = FFQ.LIZIZ;
            ffq.LJII().run(this.LIZJ);
            ffq.LIZ().run(this.LIZJ);
        }
        FAJ.LJFF("application_initbefore_init_npth", false);
        FAJ.LIZ("application_newinit_ab", false);
        if (!C35820E4a.LIZIZ(context, "optimize_loadabrepo_v2", false) && C2NW.LIZ().LJI()) {
            FF4.LIZ.getClass();
            FF5.LIZ();
            C35871E5z.LIZ();
        }
        FAJ.LJFF("application_newinit_ab", false);
        FAJ.LIZ("application_initbefore_part1_updatelocal", false);
        FQX.LIZJ(context);
        C40906G3q.LIZ(context);
        FAJ.LJFF("application_initbefore_part1_updatelocal", false);
        FAJ.LIZ("application_init_ab", false);
        if (!C35820E4a.LIZIZ(context, "optimize_loadabrepo_v2", false) && !C2NW.LIZ().LJI()) {
            FF4.LIZ.getClass();
            FF5.LIZ();
            C35871E5z.LIZ();
        }
        FAJ.LJFF("application_init_ab", false);
        FAJ.LJFF("application_initbefore_part1", false);
        FAJ.LIZ("application_initbefore_part2", false);
        FAJ.LIZ("application_initbefore_part2_init", false);
        if (!C35820E4a.LIZIZ(this.LIZJ, "optimize_systemtaskopt", false)) {
            ColdBootSystemOptTask.LIZLLL(this.LIZJ);
        }
        FAJ.LJFF("application_initbefore_part2_init", false);
        FAJ.LIZ("application_initbefore_part2_preload", false);
        boolean LIZIZ = C35820E4a.LIZIZ(this.LIZJ, "optimize_asyncpreload", false);
        ExecutorService LIZIZ2 = C38995FSd.LIZIZ();
        FCI fci = new FCI(this, i, LJI);
        if (LIZIZ) {
            LIZIZ2.execute(fci);
        } else {
            fci.run();
        }
        FAJ.LJFF("application_initbefore_part2_preload", false);
        FAJ.LJFF("application_initbefore_part2", false);
        FAJ.LIZ("application_initbefore_part3", false);
        EF1.LIZIZ(this.LIZJ);
        C38995FSd.LIZIZ().execute(new ARunnableS1S0001000_6(0, 17));
        if (((Boolean) C34710Djm.LJJJ.getValue()).booleanValue()) {
            C38995FSd.LIZJ().execute(new C0BU(7, this));
        }
        C62822Ol8 c62822Ol8 = C35274Dss.LJIIZILJ;
        if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
            C38995FSd.LIZJ().execute(new ARunnableS10S0101000_6(3, this, 2));
        }
        FAJ.LJFF("application_initbefore_part3", false);
        FAJ.LJFF("application_initbefore", false);
        if (FCD.LJI(this.LIZJ)) {
            EWU.LIZ("cold_boot_application_attach_duration");
        }
        FAJ.LIZ("application_initbefore_to_handleattachbasecontext", false);
        FAJ.LIZ("application_attachbasecontext_npthcore", false);
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZ(new ScalpelBackgroundRunnableMonitorTask());
        if (!C35820E4a.LIZIZ(this.LIZJ, "optimize_preinitnpth", false)) {
            FFQ ffq2 = FFQ.LIZIZ;
            LJIIIZ.LIZ(ffq2.LJII());
            LJIIIZ.LIZ(ffq2.LIZ());
        }
        if (((Boolean) C34710Djm.LJJJJI.getValue()).booleanValue()) {
            LJIIIZ.LIZ(DeadSystemExceptionTask.LJLIL);
        }
        if (C35820E4a.LIZIZ(this.LIZJ, "optimize_systemtaskopt", false)) {
            LJIIIZ.LIZ(new ColdBootSystemOptTask());
        }
        LJIIIZ.LIZ(new ColdBootInitTask());
        LJIIIZ.LIZJ();
        FAJ.LJFF("application_attachbasecontext_npthcore", false);
        C56672Kh.LIZ().LIZLLL("application_attachbasecontext_part1");
        ArrayList arrayList = new ArrayList();
        if (((Boolean) C35274Dss.LJIJI.getValue()).booleanValue()) {
            if (TasksHolder.LJJIII == null) {
                TasksHolder.LJJIII = new AppLogInitTask();
            }
            arrayList.add(TasksHolder.LJJIII);
        }
        C62822Ol8 c62822Ol82 = C34239DcB.LIZ;
        if (((Boolean) c62822Ol82.getValue()).booleanValue() && ((Boolean) C35274Dss.LJIILLIIL.getValue()).booleanValue()) {
            if (TasksHolder.LJIJJ == null) {
                TasksHolder.LJIJJ = new AssemInitTask();
            }
            arrayList.add(TasksHolder.LJIJJ);
        }
        arrayList.add(TasksHolder.LJ(1));
        C62822Ol8 c62822Ol83 = C35274Dss.LJIILL;
        if (((Boolean) c62822Ol83.getValue()).booleanValue()) {
            LJIIJ(arrayList);
        }
        if (((Boolean) C35274Dss.LJIIL.getValue()).booleanValue()) {
            QM0.LIZ(FKM.LIZ());
            arrayList.add(TasksHolder.LIZLLL());
        }
        if (((Boolean) C35274Dss.LJIILIIL.getValue()).booleanValue()) {
            if (TasksHolder.LJIIJJI == null) {
                TasksHolder.LJIIJJI = new UIInitTask();
            }
            arrayList.add(TasksHolder.LJIIJJI);
        }
        if (!((Boolean) c62822Ol82.getValue()).booleanValue() && ((Boolean) C35274Dss.LJIILLIIL.getValue()).booleanValue()) {
            if (TasksHolder.LJIJJ == null) {
                TasksHolder.LJIJJ = new AssemInitTask();
            }
            arrayList.add(TasksHolder.LJIJJ);
        }
        if (((Boolean) C35274Dss.LJIJ.getValue()).booleanValue()) {
            arrayList.add(new AppAttachUserStoreOptTask());
        }
        C36089EEj LJIIIZ2 = LJIIIZ(arrayList);
        if (LJIIIZ2 != null) {
            LJIIIZ2.LIZJ();
        }
        if (((Boolean) C34710Djm.LJIIZILJ.getValue()).booleanValue()) {
            C36089EEj LJIIIZ3 = C36093EEn.LJIIIZ();
            if (TasksHolder.LJJII == null) {
                TasksHolder.LJJII = new ColdBootPreloadPlayerSoTask();
            }
            LJIIIZ3.LIZ(TasksHolder.LJJII);
            LJIIIZ3.LIZJ();
        }
        FAK LIZ2 = C56672Kh.LIZ();
        LIZ2.getClass();
        LIZ2.LJFF(SystemClock.uptimeMillis(), "application_attachbasecontext_part1");
        FAJ.LIZ("application_attachbasecontext_creare_task", false);
        this.LIZIZ.getClass();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new AppStartTask());
        arrayList2.add(new ColdLoggerAttachBaseTask());
        arrayList2.add(new AppStartLogTask());
        arrayList2.add(new JatoInitTask());
        if (TasksHolder.LJJ == null) {
            TasksHolder.LJJ = new SplitCompatInstall();
        }
        SplitCompatInstall splitCompatInstall = TasksHolder.LJJ;
        o.LJIIIIZZ(splitCompatInstall, "getSplitCompatInstallTask()");
        arrayList2.add(splitCompatInstall);
        if (!((Boolean) C35337Dtt.LIZ.getValue()).booleanValue() && ((Boolean) C34710Djm.LJI.getValue()).booleanValue()) {
            arrayList2.add(new WebViewPreInitTask());
        }
        arrayList2.add(new RejectedExecutionHandler());
        EE1 LIZ3 = TasksHolder.LIZ();
        o.LJIIIIZZ(LIZ3, "getAbTestSdkInitTask()");
        arrayList2.add(LIZ3);
        arrayList2.add(new ABPreloadTask());
        if (((Boolean) C34613DiD.LJ.getValue()).booleanValue() || ((Boolean) C34613DiD.LJFF.getValue()).booleanValue()) {
            arrayList2.add(new SPKevaPreloadTaskV3());
        }
        if (((Boolean) C34613DiD.LJII.getValue()).booleanValue()) {
            arrayList2.add(new IoPreloadTask());
        }
        arrayList2.add(new ZeroVideoViewMonitorTask());
        C36089EEj LJIIIIZZ = LJIIIIZZ(arrayList2);
        FAJ.LJFF("application_attachbasecontext_creare_task", false);
        FAJ.LIZ("application_attachbasecontext_run_task", false);
        LJIIIIZZ.LIZJ();
        FAJ.LJFF("application_attachbasecontext_run_task", false);
        FAJ.LJFF("application_initbefore_to_handleattachbasecontext", false);
        C56672Kh.LIZ().LJJIII = EHX.APPLICATION_ATTACH;
        FAJ.LIZ("application_handleattachbasecontext_duration", false);
        FAJ.LIZ("application_handleattachbasecontext_part1", false);
        if ((C2NW.LIZ().LJIILLIIL(DMQ.LJLIL) || (C36093EEn.LJIILIIL & 1) == 1) && !((Boolean) c62822Ol8.getValue()).booleanValue()) {
            if (TasksHolder.LJIJ == null) {
                TasksHolder.LJIJ = C38663FFj.LIZIZ.LIZIZ();
            }
            TasksHolder.LJIJ.run(EF7.LIZIZ());
            C38995FSd.LIZJ().execute(new RunnableC51616KNo(i, this));
        }
        if (((Boolean) C33949DUb.LJI.getValue()).booleanValue()) {
            EEW eew = EEW.LIZ;
            if (eew.hasMessages(1205)) {
                eew.removeMessages(1205);
            }
        }
        FAJ.LJFF("application_handleattachbasecontext_part1", false);
        FAJ.LIZ("application_handleattachbasecontext_part2", false);
        FAJ.LIZ("application_handleattachbasecontext_create_task1", false);
        ArrayList arrayList3 = new ArrayList();
        if (((Boolean) FRI.LIZLLL.getValue()).booleanValue()) {
            arrayList3.add(new BPEAPreloadTask());
        }
        FAJ.LIZ("application_create_splashad", false);
        if (((Boolean) C34710Djm.LIZIZ.getValue()).booleanValue()) {
            Application application2 = this.LIZJ;
            FCD.LJI(application2);
            C36928EeS.LIZ(application2);
            E3F.LIZIZ("preloadGetNormalSplashFilePath", new AObjectS21S0001000_5(1, 2), ((Boolean) C34613DiD.LIZIZ.getValue()).booleanValue());
            if (TasksHolder.LJIILLIIL == null) {
                TasksHolder.LJIILLIIL = new InitAdServiceTask();
            }
            arrayList3.add(TasksHolder.LJIILLIIL);
            SplashAdManagerPreloadTask LJIJJLI = SplashAdServiceImpl.LJJI().LJIJJLI();
            if (LJIJJLI != null) {
                C36152EGu.LIZ(C38874FNm.LIZIZ(), LJIJJLI, new AObjectS126S0200000_6(arrayList3, LJIJJLI, 1));
            }
        }
        FAJ.LJFF("application_create_splashad", false);
        if (!((Boolean) c62822Ol83.getValue()).booleanValue()) {
            LJIIJ(arrayList3);
        }
        if (((Boolean) C34710Djm.LJ.getValue()).booleanValue()) {
            arrayList3.add(new AppFlyerLoadPropertiesTask());
        }
        arrayList3.add(new BindFrescoTask());
        C36089EEj LJIIIZ4 = LJIIIZ(arrayList3);
        FAJ.LJFF("application_handleattachbasecontext_create_task1", false);
        FAJ.LIZ("application_handleattachbasecontext_run_task1", false);
        LJIIIZ4.LIZJ();
        FAJ.LJFF("application_handleattachbasecontext_run_task1", false);
        FAJ.LJFF("application_handleattachbasecontext_part2", false);
        FAJ.LIZ("application_handleattachbasecontext_part3", false);
        FAJ.LIZ("application_handleattachbasecontext_create_task2", false);
        this.LIZIZ.getClass();
        ArrayList arrayList4 = new ArrayList();
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            try {
                arrayList4.add(new PumbaaTask());
            } catch (Throwable th) {
                PJZ.LIZ(th);
            }
        }
        EE1 initHDTTask = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getInitHDTTask();
        if (initHDTTask != null) {
            arrayList4.add(initHDTTask);
        }
        EE1 initTTWebViewTask = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getInitTTWebViewTask();
        if (initTTWebViewTask != null) {
            arrayList4.add(initTTWebViewTask);
        }
        EE1 initWebviewJsInjectionTask = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getInitWebviewJsInjectionTask();
        if (initWebviewJsInjectionTask != null) {
            arrayList4.add(initWebviewJsInjectionTask);
        }
        if (!((Boolean) C88063YhH.LIZIZ.getValue()).booleanValue()) {
            arrayList4.add(new InitServiceTask(new FFW(), 16777215));
        }
        if (!EU2.LIZ()) {
            arrayList4.add(new FrescoSoLoadSetter());
            arrayList4.add(new PreloadWireFieldNoEnumClassTask());
        }
        arrayList4.add(new InitServiceTask(new FXC(), 16777215));
        if (TasksHolder.LJIJ == null) {
            TasksHolder.LJIJ = C38663FFj.LIZIZ.LIZIZ();
        }
        EE1 ee12 = TasksHolder.LJIJ;
        o.LJIIIIZZ(ee12, "getInitABTask()");
        arrayList4.add(ee12);
        if (TasksHolder.LJIJI == null) {
            TasksHolder.LJIJI = FG9.LIZIZ.LIZ();
        }
        EE1 ee13 = TasksHolder.LJIJI;
        o.LJIIIIZZ(ee13, "getInitAudioSDKABTask()");
        arrayList4.add(ee13);
        if (!C33949DUb.LIZJ()) {
            arrayList4.add(new StoreRegionInitTask());
            arrayList4.add(new PreloadI18nManagerTask());
            if (!((Boolean) C34613DiD.LJ.getValue()).booleanValue() && !((Boolean) C34613DiD.LJFF.getValue()).booleanValue() && !((Boolean) C34613DiD.LJI.getValue()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            E3F.LIZIZ("runOldSpPreloadTask", new AqS156S0100000_6(arrayList4, (List<EEY>) 145), z);
            C62822Ol8 c62822Ol84 = C34274Dck.LIZ;
            if (((Number) c62822Ol84.getValue()).intValue() == 1 || ((Number) c62822Ol84.getValue()).intValue() == 3) {
                arrayList4.add(new PreloadKevaKeyTask());
            }
            if (!((Boolean) C34710Djm.LJJJJI.getValue()).booleanValue()) {
                DeadSystemExceptionTask instance = DeadSystemExceptionTask.LJLIL;
                o.LJIIIIZZ(instance, "instance");
                arrayList4.add(instance);
            }
            arrayList4.add(new FeedRequestParamPreloadTask());
        }
        if (!((Boolean) C33949DUb.LIZJ.getValue()).booleanValue()) {
            if (TasksHolder.LJIILIIL == null) {
                TasksHolder.LJIILIIL = FFV.LIZIZ.LIZLLL();
            }
            EE1 ee14 = TasksHolder.LJIILIIL;
            o.LJIIIIZZ(ee14, "getGodzillaInitTask()");
            arrayList4.add(ee14);
            arrayList4.add(new PreventServerSideCrashes());
        }
        arrayList4.add(new MobMainSessionStartTask());
        arrayList4.add(new DecompressTask());
        C36089EEj LJIIIIZZ2 = LJIIIIZZ(arrayList4);
        FAJ.LJFF("application_handleattachbasecontext_create_task2", false);
        FAJ.LIZ("application_handleattachbasecontext_run_task2", false);
        LJIIIIZZ2.LIZJ();
        FAJ.LJFF("application_handleattachbasecontext_run_task2", false);
        FAJ.LJFF("application_handleattachbasecontext_part3", false);
        FAJ.LIZ("application_handleattachbasecontext_part4", false);
        EEF.LIZ = ((Number) C34917Dn7.LIZ.getValue()).intValue();
        C38664FFk.LIZIZ.LIZIZ();
        if (this.LIZJ != null && C36152EGu.LJ()) {
            C35823E4d.LIZ(this.LIZJ);
        }
        C38995FSd.LIZJ().execute(new ARunnableS12S0101000_8(1, FGN.LIZ, 31));
        FAJ.LJFF("application_handleattachbasecontext_part4", false);
        FAJ.LJFF("application_handleattachbasecontext_duration", false);
        if (FCD.LJI(this.LIZJ)) {
            EWU.LIZIZ("cold_boot_application_attach_duration");
            EWU.LIZ("cold_boot_application_attach_to_create");
        }
    }

    @Override // X.FKD
    public final Resources LJ(Resources resources) {
        TiktokSkinHelper.LIZ(resources);
        return resources;
    }

    @Override // X.FF6, X.FKD
    public final String LJFF(String str) {
        Logger.debug();
        String LIZ = FCD.LIZ(this.LIZJ);
        if (!C38354F3m.LJ(LIZ) && !C38354F3m.LJ(str)) {
            LIZ.endsWith(":ad");
        }
        return str;
    }

    @Override // X.FKD
    public final void LJI(Context context) {
        C56662Kg.LIZ().LIZJ("app_start_to_main_focus", true);
        C56672Kh.LIZ().LIZJ("app_start_to_main_focus");
        C56662Kg.LIZ().LIZJ("feed_total", true);
        C56672Kh.LIZ().LIZJ("feed_total");
        FAJ.LIZ("app_start_v2_to_v1", true);
        C56662Kg.LIZ().LIZJ("cold_boot_start_to_feed_player", false);
        C56662Kg.LIZ().LIZJ("cold_boot_start_to_precreate", false);
        C56662Kg.LIZ().LIZJ("cold_boot_start_to_prerender_end", false);
        C56662Kg.LIZ().LIZJ("cold_boot_start_to_prepared_end", false);
        C56662Kg.LIZ().LIZJ("cold_boot_start_to_tryplay", false);
        FAJ.LIZ("application_before_super_attach", false);
        this.LIZLLL.LJIIIZ();
        Librarian.LIZLLL(context, "31.5.3", new C38649FEv(context));
        if (FKN.LIZIZ(context) == 11) {
            C48693J9d.LJFF();
            EVS.LIZ(context);
            if (EVS.LIZJ) {
                DexTricksNativeHolder.verifyNone(EVS.LIZIZ, EVS.LIZ);
            }
        } else if (FKN.LIZIZ(context) == 22) {
            C38995FSd.LIZLLL().execute(new IDRunnableS6S0101000(2, context, 12));
        }
        FAJ.LIZ("application_init_keva", false);
        C38732FIa.LIZ(context);
        FAJ.LJFF("application_init_keva", false);
        FAJ.LIZ("application_init_flipped", false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || i == 29) {
            C39645FhB.LIZ();
        }
        FAJ.LJFF("application_init_flipped", false);
        FAJ.LIZ("application_init_jatoverify", false);
        if (FKN.LIZIZ(context) == 1) {
            C48693J9d.LJFF();
            EVS.LIZ(context);
            if (EVS.LIZJ) {
                DexTricksNativeHolder.verifyNone(EVS.LIZIZ, EVS.LIZ);
            }
        } else if (FKN.LIZIZ(context) == 2) {
            C38995FSd.LIZLLL().execute(new ARunnableS10S0101000_6(2, context, 14));
        }
        FAJ.LJFF("application_init_jatoverify", false);
        FAJ.LJFF("application_before_super_attach", false);
    }

    public final C36089EEj LJIILJJIL(boolean z) {
        if (this.LJFF == null) {
            synchronized (this.LJIIIZ) {
                if (this.LJFF == null) {
                    FAJ.LIZ("application_preload_create_task", false);
                    List<EEY> LIZIZ = this.LIZIZ.LIZIZ();
                    if (z) {
                        List LIZ = EF0.LIZ.LIZ(EF7.LIZIZ(), this.LIZIZ.LIZIZ());
                        if (!LIZ.isEmpty()) {
                            ((ArrayList) LIZIZ).removeAll(LIZ);
                        }
                    }
                    this.LJFF = LJIIIIZZ(LIZIZ);
                    FAJ.LJFF("application_preload_create_task", false);
                }
            }
        }
        return this.LJFF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (r8 != 80) goto L16;
     */
    @Override // X.FF6, X.FKD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTrimMemory(int r8) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38646FEs.onTrimMemory(int):void");
    }

    public C38646FEs(Application application, AwemeAppBuildConfig awemeAppBuildConfig, C38668FFo c38668FFo) {
        this.LIZJ = application;
        this.LIZLLL = awemeAppBuildConfig;
        this.LIZ = c38668FFo;
    }
}
