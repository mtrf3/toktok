package X;

import Y.ACallableS24S0001000_6;
import Y.ARunnableS1S0001000_6;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.librarian.Librarian;
import com.ss.android.common.applog.AppLog;
import com.ss.android.legoimpl.DecompressTask;
import com.ss.android.legoimpl.ExperienceKitInitTask;
import com.ss.android.legoimpl.ProcessMonitorTask;
import com.ss.android.legoimpl.StorageTask;
import com.ss.android.ugc.AwemeAppBuildConfig;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.device.DeviceInfoReportTask;
import com.ss.android.ugc.aweme.dynamicfeature.AabPluginServiceInitTask;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.ss.android.ugc.aweme.legoImp.task.BulletAssemblerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.BulletOptimizationTask;
import com.ss.android.ugc.aweme.legoImp.task.BulletPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.EnterMusicGuideColdStartTask;
import com.ss.android.ugc.aweme.legoImp.task.FontTask;
import com.ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.ss.android.ugc.aweme.legoImp.task.InitStringHotUpdateTask;
import com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.ss.android.ugc.aweme.legoImp.task.InitTaskManager;
import com.ss.android.ugc.aweme.legoImp.task.InitWebViewHookTask;
import com.ss.android.ugc.aweme.legoImp.task.JacocoTask;
import com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;
import com.ss.android.ugc.aweme.legoImp.task.PlayerKitCommonWidgetInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PlayerKitInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PopupConfigTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask;
import com.ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask;
import com.ss.android.ugc.aweme.legoImp.task.SetAppTrackTask;
import com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask;
import com.ss.android.ugc.aweme.legoImp.task.StoreRegionInitTask;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.legoImp.task.ThreadPoolInjectTask;
import com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAnywhereService;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitDownloadComponentTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWebViewClientHookCallback;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.NetworkUtilsTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeFetchKidsSettingTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeInitRouterTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeInitRuntimeTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeLegacyTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModePolicyNoticeTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeQueryUserInfoTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.PNSKidStateMachineInitTask;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.KidsPumbaaTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.TuxInitTask;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.legoImpl.task.SecShareSdkTask;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoGlobalInitTask;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoLocalRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoStringPatchTask;
import com.ss.android.ugc.aweme.search.core.viewmodel.task.SearchWidgetTask;
import com.ss.android.ugc.aweme.story.SocialWidgetLegoTask;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FFP implements FKD {
    public final Application LIZ;
    public final AppBuildConfig LIZIZ;
    public final C38668FFo LIZJ;
    public boolean LIZLLL;

    @Override // X.FKD
    public final void LIZIZ() {
    }

    @Override // X.FKD
    public final void LIZLLL() {
    }

    @Override // X.FKD
    public final Resources LJ(Resources resources) {
        return resources;
    }

    @Override // X.FKD
    public final String LJFF(String str) {
        return null;
    }

    @Override // X.FKD
    public final void LJII() {
    }

    @Override // X.FKD
    public final void LIZJ() {
        C36928EeS.LIZ(this.LIZ);
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        FFV ffv = FFV.LIZIZ;
        LJIIIZ.LIZ(ffv.LIZ());
        LJIIIZ.LIZ(C38663FFj.LIZIZ.LIZIZ());
        if (TasksHolder.LJIJI == null) {
            TasksHolder.LJIJI = FG9.LIZIZ.LIZ();
        }
        LJIIIZ.LIZ(TasksHolder.LJIJI);
        LJIIIZ.LIZJ();
        if (!EF7.LJIILIIL.equals("local_test")) {
            C36089EEj LJIIIZ2 = C36093EEn.LJIIIZ();
            LJIIIZ2.LIZIZ(new KidsPumbaaTask(), true);
            LJIIIZ2.LIZJ();
        }
        C56662Kg.LIZ().LIZJ("method_init_ttnet_duration", false);
        C36089EEj LJIIIZ3 = C36093EEn.LJIIIZ();
        LJIIIZ3.LIZIZ(new ResetTTNetworkStateIndexTask(), true);
        LJIIIZ3.LIZIZ(new InitTTNetTask(), true);
        LJIIIZ3.LIZJ();
        C56662Kg.LIZ().LJFF("method_init_ttnet_duration", false);
        if (this.LIZLLL) {
            C36089EEj LJIIIZ4 = C36093EEn.LJIIIZ();
            if (TasksHolder.LIZIZ == null) {
                TasksHolder.LIZIZ = C38664FFk.LIZIZ.LIZ();
            }
            LJIIIZ4.LIZ(TasksHolder.LIZIZ);
            LJIIIZ4.LIZIZ(new KidsModeInitRouterTask(), true);
            LJIIIZ4.LIZIZ(new FontTask(), true);
            LJIIIZ4.LIZJ();
        }
        C36089EEj LJIIIZ5 = C36093EEn.LJIIIZ();
        FFQ ffq = FFQ.LIZIZ;
        LJIIIZ5.LIZ(ffq.LJII());
        LJIIIZ5.LIZ(ffq.LIZ());
        LJIIIZ5.LIZ(ffq.LJ());
        LJIIIZ5.LIZ(ffv.LJ());
        LJIIIZ5.LIZ(TasksHolder.LIZJ());
        LJIIIZ5.LIZJ();
        if (FKR.LIZ()) {
            C36089EEj LJIIIZ6 = C36093EEn.LJIIIZ();
            if (TasksHolder.LJIIJ == null) {
                TasksHolder.LJIIJ = new InitStringHotUpdateTask();
            }
            LJIIIZ6.LIZ(TasksHolder.LJIIJ);
            LJIIIZ6.LIZIZ(new GeckoStringPatchTask(), true);
            LJIIIZ6.LIZJ();
        }
        C37091Eh5 c37091Eh5 = C37090Eh4.LIZ;
        EE1 initBoeTask = c37091Eh5.LIZ.getInitBoeTask();
        if (initBoeTask != null) {
            C36089EEj LJIIIZ7 = C36093EEn.LJIIIZ();
            LJIIIZ7.LIZIZ(initBoeTask, true);
            LJIIIZ7.LIZJ();
        }
        EE1 initEcMockTask = c37091Eh5.LIZ.getInitEcMockTask();
        if (initEcMockTask != null) {
            C36089EEj LJIIIZ8 = C36093EEn.LJIIIZ();
            LJIIIZ8.LIZIZ(initEcMockTask, true);
            LJIIIZ8.LIZJ();
        }
        if (this.LIZLLL) {
            C36089EEj LJIIIZ9 = C36093EEn.LJIIIZ();
            if (TasksHolder.LIZLLL == null) {
                TasksHolder.LIZLLL = new InitModules();
            }
            LJIIIZ9.LIZ(TasksHolder.LIZLLL);
            LJIIIZ9.LIZJ();
        }
        if (this.LIZLLL) {
            C36089EEj LJIIIZ10 = C36093EEn.LJIIIZ();
            LJIIIZ10.LIZIZ(new AabPluginServiceInitTask(), true);
            LJIIIZ10.LIZJ();
        }
        C56662Kg.LIZ().LIZJ("method_thread_pool_inject_duration", false);
        C36089EEj LJIIIZ11 = C36093EEn.LJIIIZ();
        LJIIIZ11.LIZIZ(new ThreadPoolInjectTask(), true);
        LJIIIZ11.LIZJ();
        C56662Kg.LIZ().LJFF("method_thread_pool_inject_duration", false);
        FGH.LIZ = new ACallableS24S0001000_6(0, 5);
        if (this.LIZLLL) {
            C36089EEj LJIIIZ12 = C36093EEn.LJIIIZ();
            LJIIIZ12.LIZIZ(new TuxInitTask(), true);
            LJIIIZ12.LIZ(C40144FpE.LIZIZ.LJIIJ());
            LJIIIZ12.LIZJ();
        }
        if (this.LIZLLL) {
            C36089EEj LJIIIZ13 = C36093EEn.LJIIIZ();
            LJIIIZ13.LIZIZ(new GeckoCustomRequest(), true);
            LJIIIZ13.LIZIZ(new GeckoGlobalInitTask(), true);
            LJIIIZ13.LIZIZ(new GeckoLocalRequest(), true);
            LJIIIZ13.LIZJ();
        }
    }

    @Override // X.FKD
    public final void onCreate() {
        if (this.LIZLLL) {
            KidsCommonServiceImpl.LJFF().LIZ();
        }
        AVExternalServiceImpl.LIZ().attachApplication(this.LIZ);
        if (this.LIZLLL) {
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZ(TasksHolder.LIZ());
            LJIIIZ.LIZJ();
        }
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ2 = C36093EEn.LJIIIZ();
        LJIIIZ2.LIZIZ(new NetworkUtilsTask(), true);
        LJIIIZ2.LIZJ();
        if (this.LIZLLL) {
            C36089EEj LJIIIZ3 = C36093EEn.LJIIIZ();
            LJIIIZ3.LIZIZ(new DecompressTask.InitTask(), true);
            LJIIIZ3.LIZJ();
        }
        if (this.LIZLLL) {
            EI0 ei0 = new EI0();
            ei0.LIZIZ(new JsBridge2InitTask(EFK.BACKGROUND), true);
            ei0.LIZIZ(new JsBridge2InitTask(EFK.BOOT_FINISH), true);
            ei0.LIZIZ(new KidsModeInitRuntimeTask(this.LIZ), true);
            ei0.LIZJ();
        }
        C36089EEj LJIIIZ4 = C36093EEn.LJIIIZ();
        LJIIIZ4.LIZIZ(new KidsModeLegacyTask(), true);
        if (TasksHolder.LJIILJJIL == null) {
            TasksHolder.LJIILJJIL = new PlayerKitInitTask();
        }
        LJIIIZ4.LIZ(TasksHolder.LJIILJJIL);
        if (TasksHolder.LJIILL == null) {
            TasksHolder.LJIILL = new PlayerKitCommonWidgetInitTask();
        }
        LJIIIZ4.LIZ(TasksHolder.LJIILL);
        LJIIIZ4.LIZIZ(new InitFramework(), true);
        LJIIIZ4.LIZIZ(new AdjustMusicVolume(), true);
        LJIIIZ4.LIZ(TasksHolder.LIZIZ());
        LJIIIZ4.LIZIZ(new InitReportSignature(), true);
        LJIIIZ4.LIZIZ(new InitTaskManager(), true);
        LJIIIZ4.LIZ(AccountInitializerTaskImpl.LJ().LIZJ());
        LJIIIZ4.LIZIZ(new PopupConfigTask(), true);
        LJIIIZ4.LIZIZ(new InitMusicManager(), true);
        LJIIIZ4.LIZJ();
        C36089EEj LJIIIZ5 = C36093EEn.LJIIIZ();
        if (FCO.LIZLLL) {
            LJIIIZ5.LIZ(new GetGoogleAIdTask(EFK.BOOT_FINISH));
        } else {
            LJIIIZ5.LIZ(new GetGoogleAIdTask(EFK.BACKGROUND));
        }
        FFQ ffq = FFQ.LIZIZ;
        LJIIIZ5.LIZ(ffq.LJIIIZ());
        LJIIIZ5.LIZIZ(new BulletPreloadTask(), true);
        LJIIIZ5.LIZIZ(new BulletOptimizationTask(), true);
        LJIIIZ5.LIZIZ(new BulletAssemblerInitTask(), true);
        LJIIIZ5.LIZJ();
        if (this.LIZLLL) {
            C36089EEj LJIIIZ6 = C36093EEn.LJIIIZ();
            C40144FpE c40144FpE = C40144FpE.LIZIZ;
            LJIIIZ6.LIZ(c40144FpE.LJFF());
            LJIIIZ6.LIZ(c40144FpE.LJIIIIZZ());
            LJIIIZ6.LIZJ();
        }
        C36089EEj LJIIIZ7 = C36093EEn.LJIIIZ();
        LJIIIZ7.LIZIZ(new SetAppTrackTask(), true);
        LJIIIZ7.LIZ(AVExternalServiceImpl.LIZ().initService().initTask(1));
        LJIIIZ7.LIZIZ(new DeviceInfoReportTask(), true);
        LJIIIZ7.LIZIZ(new StorageTask(), true);
        LJIIIZ7.LIZIZ(new JacocoTask(), true);
        if (!TextUtils.equals(EF7.LJIILIIL, "local_test")) {
            LJIIIZ7.LIZ(ffq.LIZJ());
        } else {
            LJIIIZ7.LIZ(ffq.LIZLLL());
        }
        if (Build.VERSION.SDK_INT < 28) {
            LJIIIZ7.LIZ(new PreloadResCleanerTask());
        }
        LJIIIZ7.LIZJ();
        C36089EEj LJIIIZ8 = C36093EEn.LJIIIZ();
        LJIIIZ8.LIZIZ(new EnterMusicGuideColdStartTask(), true);
        LJIIIZ8.LIZIZ(new InitMusicServiceTask(), true);
        LJIIIZ8.LIZIZ(new InitAnywhereService(), true);
        LJIIIZ8.LIZJ();
        C36089EEj LJIIIZ9 = C36093EEn.LJIIIZ();
        if (TasksHolder.LJJIIZ == null) {
            TasksHolder.LJJIIZ = new ApmInit();
        }
        LJIIIZ9.LIZ(TasksHolder.LJJIIZ);
        LJIIIZ9.LIZJ();
        C36089EEj LJIIIZ10 = C36093EEn.LJIIIZ();
        LJIIIZ10.LIZIZ(new InitDownloadComponentTask(), true);
        LJIIIZ10.LIZIZ(new InitWebViewClientHookCallback(), true);
        LJIIIZ10.LIZIZ(new ProcessMonitorTask(), true);
        LJIIIZ10.LIZIZ(new ExperienceKitInitTask(), true);
        LJIIIZ10.LIZIZ(new InitWebViewHookTask(), true);
        LJIIIZ10.LIZJ();
        if (C34710Djm.LIZ()) {
            InitAVModule initAVModule = (InitAVModule) TasksHolder.LIZIZ();
            C36093EEn.LJ(initAVModule);
            initAVModule.LJIIJ();
        }
        if (this.LIZLLL) {
            C36089EEj LJIIIZ11 = C36093EEn.LJIIIZ();
            LJIIIZ11.LIZIZ(new KidsModePolicyNoticeTask(), true);
            LJIIIZ11.LIZIZ(new KidsModeFetchKidsSettingTask(), true);
            LJIIIZ11.LIZIZ(new KidsModeQueryUserInfoTask(), true);
            LJIIIZ11.LIZJ();
        }
        if (this.LIZLLL) {
            SocialWidgetLegoTask LJIIIIZZ = AppWidgetServiceImpl.LJIJI().LJIIIIZZ();
            if (LJIIIIZZ != null) {
                C36089EEj LJIIIZ12 = C36093EEn.LJIIIZ();
                LJIIIZ12.LIZIZ(LJIIIIZZ, true);
                LJIIIZ12.LIZJ();
            }
            C36089EEj LJIIIZ13 = C36093EEn.LJIIIZ();
            LJIIIZ13.LIZIZ(new SecShareSdkTask(), true);
            LJIIIZ13.LIZJ();
            SearchWidgetTask LJIILJJIL = AppWidgetServiceImpl.LJIJI().LJIILJJIL();
            C36089EEj LJIIIZ14 = C36093EEn.LJIIIZ();
            LJIIIZ14.LIZ(LJIILJJIL);
            LJIIIZ14.LIZJ();
        }
        C36089EEj LJIIIZ15 = C36093EEn.LJIIIZ();
        LJIIIZ15.LIZIZ(new PNSKidStateMachineInitTask(), true);
        LJIIIZ15.LIZJ();
    }

    @Override // X.FKD
    public final void LIZ(Context context) {
        this.LIZLLL = FCD.LJI(this.LIZ);
        FNK.LIZ(this.LIZ, FCD.LJI(this.LIZ));
        EF1.LIZ(this.LIZ, this.LIZIZ);
        C56662Kg.LIZ().LIZJ("cold_boot_application_attach_before_base_duration", false);
        PFG.LIZ();
        AwemeConfigCenter.LIZ();
        AppLog.setSwitchToBdtracker(C35820E4a.LIZIZ(this.LIZ, "open_switch_to_bdtrakcer", false));
        if (C35820E4a.LIZIZ(context, "optimize_loadabrepo_v2", false)) {
            C38995FSd.LIZLLL().execute(new ARunnableS1S0001000_6(1, 4));
            C38995FSd.LIZLLL().execute(new ARunnableS1S0001000_6(1, 25));
        }
        EF1.LIZIZ(this.LIZ);
        C56662Kg.LIZ().LJFF("cold_boot_application_attach_before_base_duration", false);
        C38668FFo c38668FFo = this.LIZJ;
        Application application = this.LIZ;
        c38668FFo.getClass();
        C38668FFo.LIZ(application);
        C36945Eej.LIZ(context);
        C36585EXl.LIZIZ();
        EXD.LIZ();
        if (((Boolean) C35044DpA.LIZJ.getValue()).booleanValue()) {
            PCE.LIZ = true;
            C09900aA.LIZ = true;
            C64094PDm.LIZ.LJLJJI = true;
            C64089PDh.LJIIJ().LJLJJI = true;
        }
        if (EF7.LJIILIIL.equals("local_test")) {
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZIZ(new KidsPumbaaTask(), true);
            LJIIIZ.LIZJ();
        }
        FQX.LIZJ(context);
        C40906G3q.LIZ(context);
        C38672FFs.LIZ = OptimizePushProcessImpl.LIZ;
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ2 = C36093EEn.LJIIIZ();
        LJIIIZ2.LIZIZ(new FrescoSoLoadSetter(), true);
        LJIIIZ2.LIZJ();
        Application application2 = this.LIZ;
        application2.getClass();
        C39579Fg7.LJLIL = application2;
        C36089EEj LJIIIZ3 = C36093EEn.LJIIIZ();
        LJIIIZ3.LIZIZ(new SharePreferencePreloadForAllProcessTask(), true);
        if (TasksHolder.LJIILIIL == null) {
            TasksHolder.LJIILIIL = FFV.LIZIZ.LIZLLL();
        }
        LJIIIZ3.LIZ(TasksHolder.LJIILIIL);
        LJIIIZ3.LIZJ();
        C38416F5w.LIZIZ();
        if (this.LIZLLL) {
            C56662Kg.LIZ().LJFF("cold_boot_application_attach_duration", true);
            C56662Kg.LIZ().LIZJ("cold_boot_application_attach_to_create", true);
        }
        C36089EEj LJIIIZ4 = C36093EEn.LJIIIZ();
        LJIIIZ4.LIZIZ(new StoreRegionInitTask(), true);
        LJIIIZ4.LIZJ();
        C36089EEj LJIIIZ5 = C36093EEn.LJIIIZ();
        LJIIIZ5.LIZIZ(new DecompressTask(), true);
        LJIIIZ5.LIZJ();
    }

    @Override // X.FKD
    public final void LJI(Context context) {
        this.LIZIZ.LJIIIZ();
        Librarian.LIZLLL(context, "31.5.3", new FFU(context));
        C38732FIa.LIZ(context);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || (i == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            C39645FhB.LIZ();
        }
        C38891fp.LJLILLLLZI = this.LIZ;
        try {
            C38891fp.LJLJI = C35820E4a.LIZIZ(context, "optimize_cold_boot_hook_app_context", true);
        } catch (Throwable unused) {
        }
        this.LIZIZ.LJ();
        F78.LIZ = "disabled";
        EF7.LJIIIZ();
        FX1 fx1 = FX1.LIZIZ;
        fx1.LJI(EF7.LJI.LIZ, EF7.LJI.LIZIZ, EF7.LJI.LIZJ);
        fx1.LIZJ();
        C38652FEy.LIZ();
        C38805FKv c38805FKv = C38805FKv.LIZ;
        Handler handler = C37179EiV.LJFF;
        c38805FKv.getClass();
        o.LJIIIZ(handler, "handler");
        C38805FKv.LIZLLL = handler;
        C38995FSd.LIZIZ().execute(FGK.LJLIL);
    }

    @Override // X.FKD
    public final void onTrimMemory(int i) {
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(new TrimMemoryTask(i), true);
        LJIIIZ.LIZJ();
    }

    public FFP(Application application, AwemeAppBuildConfig awemeAppBuildConfig, C38668FFo c38668FFo) {
        this.LIZ = application;
        this.LIZIZ = awemeAppBuildConfig;
        this.LIZJ = c38668FFo;
    }
}
