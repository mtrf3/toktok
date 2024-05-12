package com.ss.android.ugc.aweme.application;

import X.C0RN;
import X.C33949DUb;
import X.C34710Djm;
import X.C35050DpG;
import X.C35116DqK;
import X.C35226Ds6;
import X.C35232DsC;
import X.C35274Dss;
import X.C35401Duv;
import X.C36093EEn;
import X.C36152EGu;
import X.C38874FNm;
import X.C38995FSd;
import X.C40144FpE;
import X.C48236IwS;
import X.C87656Yai;
import X.C88087Yhf;
import X.DPP;
import X.DUE;
import X.EB7;
import X.EE1;
import X.EEY;
import X.EF7;
import X.EFK;
import X.EU2;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F7A;
import X.FCJ;
import X.FCK;
import X.FCO;
import X.FFT;
import X.FFV;
import X.FFX;
import X.FKM;
import X.FLX;
import X.FV5;
import X.FVR;
import X.RunnableC38981FRp;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate;
import com.bytedance.ies.ugc.statisticlogger.page.PageTask;
import com.ss.android.legoapi.IAccountInitializerTaskApi;
import com.ss.android.legoimpl.ExperienceKitInitTask;
import com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingTask;
import com.ss.android.ugc.aweme.ab.WebSocketInitExperiment;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.app.application.task.CheckUpdateChangeDeviceIDTask;
import com.ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.ss.android.ugc.aweme.compliance.consent.deviceconsent.PNSDeviceConsentLegoTask;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.aweme.feed.component.InitFeedPlatformTask;
import com.ss.android.ugc.aweme.feed.component.InitFeedTabSlideTask;
import com.ss.android.ugc.aweme.feed.pip.PipInitTask;
import com.ss.android.ugc.aweme.feed.preload.PreloadMediaCodecListTask;
import com.ss.android.ugc.aweme.feed.sound.AutoAdjustVolumeTask;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.innerpush.api.InitInnerPushTask;
import com.ss.android.ugc.aweme.lego.kita.InitKitaTask;
import com.ss.android.ugc.aweme.lego.wrapper.InitServiceGroupTask;
import com.ss.android.ugc.aweme.lego.wrapper.InitServiceTask;
import com.ss.android.ugc.aweme.legoImp.CustomAnchorInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ABCacheOptInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ABClientIDTask;
import com.ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.ss.android.ugc.aweme.legoImp.task.AssemInitTask;
import com.ss.android.ugc.aweme.legoImp.task.BnplInitTask;
import com.ss.android.ugc.aweme.legoImp.task.BulletAssemblerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.DeeplinkPrefetchTask;
import com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask;
import com.ss.android.ugc.aweme.legoImp.task.FirebaseConfigCheckTask;
import com.ss.android.ugc.aweme.legoImp.task.FixFocusedViewLeak;
import com.ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.ss.android.ugc.aweme.legoImp.task.GoogleColdStartServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.IOThreadBoostTask;
import com.ss.android.ugc.aweme.legoImp.task.InferenceEngineTask;
import com.ss.android.ugc.aweme.legoImp.task.InitAbTest;
import com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;
import com.ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.ss.android.ugc.aweme.legoImp.task.InitLottieOptTask;
import com.ss.android.ugc.aweme.legoImp.task.InitMobShare;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.ss.android.ugc.aweme.legoImp.task.InitPageMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.ss.android.ugc.aweme.legoImp.task.InitShareSdkTask;
import com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.ss.android.ugc.aweme.legoImp.task.InitTaskManager;
import com.ss.android.ugc.aweme.legoImp.task.InitWebViewHookTask;
import com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;
import com.ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.ss.android.ugc.aweme.legoImp.task.LiveGiftAssetStatisticTask;
import com.ss.android.ugc.aweme.legoImp.task.LiveInjectContextTask;
import com.ss.android.ugc.aweme.legoImp.task.MemoryDegradationTask;
import com.ss.android.ugc.aweme.legoImp.task.MotaInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NewUserJourneyDialogCleanTask;
import com.ss.android.ugc.aweme.legoImp.task.NewUserPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister;
import com.ss.android.ugc.aweme.legoImp.task.PerformanceHelperTask;
import com.ss.android.ugc.aweme.legoImp.task.PopupConfigTask;
import com.ss.android.ugc.aweme.legoImp.task.PowerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;
import com.ss.android.ugc.aweme.legoImp.task.RegisterScreenBroadcastReceiverTask;
import com.ss.android.ugc.aweme.legoImp.task.RxSchedulerPurgeOptTask;
import com.ss.android.ugc.aweme.legoImp.task.SetMainThreadPriorityTask;
import com.ss.android.ugc.aweme.legoImp.task.SetupMainServiceForJsb;
import com.ss.android.ugc.aweme.legoImp.task.TTMockTask;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.legoImp.task.TrackComputedTask;
import com.ss.android.ugc.aweme.legoImp.task.TrafficPerfMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.WebSocketTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAnywhereService;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAwemeRuntime;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWebViewClientHookCallback;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWeekEndRecorder;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.NetworkUtilsTask;
import com.ss.android.ugc.aweme.legoImp.task.api.PreloadFeedRequestTask;
import com.ss.android.ugc.aweme.legoImp.task.observer_task.EventTrackingConsentListenerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ug.CleanMemoryShortcutTask;
import com.ss.android.ugc.aweme.legoImp.task.ug.ObservationInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ug.PreviousLoginPlatformSaveTask;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.legoImpl.task.AccountExperimentExposeTask;
import com.ss.android.ugc.aweme.legoImpl.task.AdColdStartTask;
import com.ss.android.ugc.aweme.legoImpl.task.AppLifecycleMetricsTask;
import com.ss.android.ugc.aweme.legoImpl.task.ColdBootLivePreParseDNSTask;
import com.ss.android.ugc.aweme.legoImpl.task.InitRouter;
import com.ss.android.ugc.aweme.legoImpl.task.LobbyInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.OpenOnMuteTask;
import com.ss.android.ugc.aweme.legoImpl.task.ScreenShotFeedbackTask;
import com.ss.android.ugc.aweme.legoImpl.task.ScreenShotTask;
import com.ss.android.ugc.aweme.legoImpl.task.SecShareSdkTask;
import com.ss.android.ugc.aweme.legoImpl.task.UGFeatureInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin.DelayedPluginInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin.PrioritizedPluginInitTask;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.music.MusicCollectTask;
import com.ss.android.ugc.aweme.notice.api.lego.InitNoticeTask;
import com.ss.android.ugc.aweme.request_combine.task.FetchABCommonTask;
import com.ss.android.ugc.aweme.request_combine.task.FetchCombineSettingsTask;
import com.ss.android.ugc.aweme.shortcut.ShortcutInitTask;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import defpackage.s1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AwemeAppTaskProvider {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.EEY> LIZ() {
        /*
            Method dump skipped, instructions count: 1579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.application.AwemeAppTaskProvider.LIZ():java.util.List");
    }

    public final List<EEY> LIZIZ() {
        SplashBgInflate LIZIZ;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) EB7.LIZJ.getValue()).booleanValue()) {
            arrayList.add(new TrafficPerfMonitorTask());
        }
        if (((Boolean) WebSocketInitExperiment.LJFF.getValue()).booleanValue()) {
            arrayList.add(new WebSocketTask());
        }
        arrayList.add(new NewUserPreloadTask());
        if (TasksHolder.LJIIIIZZ == null) {
            TasksHolder.LJIIIIZZ = new InitRouter();
        }
        InitRouter initRouter = TasksHolder.LJIIIIZZ;
        o.LJIIIIZZ(initRouter, "getInitRouterTask()");
        arrayList.add(initRouter);
        arrayList.add(new SetMainThreadPriorityTask());
        arrayList.add(new IOThreadBoostTask());
        arrayList.add(new CommonParamsInitTask());
        if (!((Boolean) C33949DUb.LJ.getValue()).booleanValue()) {
            C36093EEn c36093EEn = C36093EEn.LIZ;
            FV5 fv5 = FV5.LIZIZ;
            c36093EEn.LIZ(fv5.LIZIZ().getClass(), fv5.LIZIZ());
            c36093EEn.LIZ(fv5.LIZ().getClass(), fv5.LIZ());
            if (!((Boolean) C87656Yai.LIZJ.getValue()).booleanValue() && (LIZIZ = SplashAdServiceImpl.LJJI().LIZIZ()) != null) {
                arrayList.add(LIZIZ);
            }
            if (!((Boolean) C35274Dss.LJIILLIIL.getValue()).booleanValue()) {
                if (TasksHolder.LJIJJ == null) {
                    TasksHolder.LJIJJ = new AssemInitTask();
                }
                AssemInitTask assemInitTask = TasksHolder.LJIJJ;
                o.LJIIIIZZ(assemInitTask, "getAssemInitTask()");
                arrayList.add(assemInitTask);
            }
            if (TasksHolder.LJIJJLI == null) {
                TasksHolder.LJIJJLI = new PageTask();
            }
            PageTask pageTask = TasksHolder.LJIJJLI;
            o.LJIIIIZZ(pageTask, "getBtmPagerInitTask()");
            arrayList.add(pageTask);
            if (TasksHolder.LJIL == null) {
                TasksHolder.LJIL = new MotaInitTask();
            }
            MotaInitTask motaInitTask = TasksHolder.LJIL;
            o.LJIIIIZZ(motaInitTask, "getMotaInitTask()");
            arrayList.add(motaInitTask);
            if (TasksHolder.LJJI == null) {
                TasksHolder.LJJI = new ScreenShotTask();
            }
            ScreenShotTask screenShotTask = TasksHolder.LJJI;
            o.LJIIIIZZ(screenShotTask, "getScreenShotTask()");
            arrayList.add(screenShotTask);
            if (TasksHolder.LJJIFFI == null) {
                TasksHolder.LJJIFFI = new ScreenShotFeedbackTask();
            }
            ScreenShotFeedbackTask screenShotFeedbackTask = TasksHolder.LJJIFFI;
            o.LJIIIIZZ(screenShotFeedbackTask, "getScreenShotFeedbackTask()");
            arrayList.add(screenShotFeedbackTask);
            arrayList.add(new MemoryDegradationTask());
            C36152EGu.LIZ(C38874FNm.LIZIZ(), new PreDrawableInflate(), new AqS156S0100000_6(arrayList, (List<EEY>) 24));
        }
        if (((Number) C34710Djm.LJIILJJIL.getValue()).intValue() == 2) {
            if (TasksHolder.LJJIIJZLJL == null) {
                TasksHolder.LJJIIJZLJL = new ColdBootLivePreParseDNSTask();
            }
            ColdBootLivePreParseDNSTask coldBootLivePreParseDNSTask = TasksHolder.LJJIIJZLJL;
            o.LJIIIIZZ(coldBootLivePreParseDNSTask, "getLivePreParseDNSTask()");
            arrayList.add(coldBootLivePreParseDNSTask);
        }
        arrayList.add(new LegacyTask());
        ArrayList arrayList2 = new ArrayList();
        if (s1.LIZLLL("isFirstInstallAndFirstLaunch()")) {
            arrayList2.add(new AdColdStartTask());
        }
        arrayList2.add(new InitAnywhereService());
        arrayList2.add(new AppLifecycleMetricsTask());
        C36152EGu.LIZ(DPP.LIZIZ(), new AutoAdjustVolumeTask(), new AqS156S0100000_6(arrayList2, (List<EEY>) 146));
        arrayList2.add(new OpenOnMuteTask());
        arrayList2.add(new CustomAnchorInitTask());
        if (!((Boolean) C88087Yhf.LIZLLL.getValue()).booleanValue()) {
            arrayList2.add(new NetworkUtilsTask());
        }
        if (!EU2.LIZ()) {
            arrayList2.add(new InitServiceTask(new FCJ(), 16777215));
            arrayList2.add(new InitServiceTask(new FCK(), 16777215));
        }
        arrayList2.add(new SecShareSdkTask());
        arrayList2.add(new JsBridge2InitTask(EFK.MAIN));
        arrayList2.add(new InitAwemeRuntime());
        arrayList2.add(new TTMockTask());
        arrayList2.add(new InferenceEngineTask());
        RegisterLifecycle LJIIL = InitAllServiceImpl.LJIILLIIL().LJIIL();
        o.LJIIIIZZ(LJIIL, "initService.registerLifecycleI18n");
        arrayList2.add(LJIIL);
        arrayList2.add(new InitFramework());
        if (((Boolean) C34710Djm.LJJJI.getValue()).booleanValue()) {
            arrayList2.add(new PreloadMediaCodecListTask());
        }
        arrayList2.add(new AdjustMusicVolume());
        IAccountInitializerTaskApi LJ = AccountInitializerTaskImpl.LJ();
        o.LJI(LJ);
        arrayList2.add(LJ.LIZIZ());
        if (!((Boolean) C88087Yhf.LJ.getValue()).booleanValue()) {
            arrayList2.add(new InitMusicManager());
        }
        arrayList2.add(new PowerInitTask());
        if (!EU2.LIZ()) {
            arrayList2.add(new InitReportSignature());
            arrayList2.add(new SetupMainServiceForJsb());
            arrayList2.add(new InitMobShare());
            arrayList2.add(new InitServiceTask(new F7A(), 16777215));
        }
        if (!((Boolean) C35116DqK.LIZJ.getValue()).booleanValue()) {
            arrayList2.add(new InitTaskManager());
        }
        IAccountInitializerTaskApi LJ2 = AccountInitializerTaskImpl.LJ();
        o.LJI(LJ2);
        arrayList2.add(LJ2.LIZJ());
        arrayList2.add(new FixFocusedViewLeak());
        if (!FCO.LIZIZ) {
            arrayList2.add(new InitAbTest());
        }
        arrayList2.add(new PopupConfigTask());
        arrayList2.add(new ObserveDeviceRegister());
        arrayList2.add(new ObservationInitTask());
        arrayList2.add(new PreviousLoginPlatformSaveTask());
        arrayList2.add(new CleanMemoryShortcutTask());
        arrayList2.add(new PrioritizedPluginInitTask());
        arrayList2.add(new DelayedPluginInitTask());
        arrayList2.add(new UGFeatureInitTask());
        arrayList2.add(new ABClientIDTask());
        arrayList2.add(new ABCacheOptInitTask());
        arrayList2.add(new LobbyInitTask());
        arrayList2.add(new RegisterScreenBroadcastReceiverTask());
        arrayList2.add(new CheckUpdateChangeDeviceIDTask());
        C40144FpE c40144FpE = C40144FpE.LIZIZ;
        arrayList2.add(c40144FpE.LJFF());
        arrayList2.add(c40144FpE.LJIIIIZZ());
        arrayList2.add(new BulletAssemblerInitTask());
        IAccountInitializerTaskApi LJ3 = AccountInitializerTaskImpl.LJ();
        o.LJI(LJ3);
        arrayList2.add(LJ3.LIZ());
        arrayList2.add(new AccountExperimentExposeTask());
        C36152EGu.LIZ(C38874FNm.LIZIZ(), new PerformanceHelperTask(), new AqS156S0100000_6(arrayList2, (List<EEY>) 147));
        arrayList2.add(new TrackComputedTask());
        arrayList2.add(new InitNoticeTask());
        arrayList2.add(new InitServiceGroupTask(new Runnable[]{new FFT()}));
        arrayList2.add(new InitWebViewClientHookCallback());
        arrayList2.add(new InitServiceGroupTask(new Runnable[]{new RunnableC38981FRp()}));
        if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
            arrayList2.add(new InitWeekEndRecorder());
        }
        arrayList2.add(new FetchUltimateComplianceSettingsTask());
        arrayList2.add(new GoogleColdStartServiceTask());
        arrayList2.add(new InitKitaTask());
        arrayList2.add(new LiveInjectContextTask());
        arrayList2.add(new InitFeedPlatformTask());
        arrayList2.add(new InitFeedTabSlideTask());
        arrayList2.add(new EventTrackingConsentListenerInitTask());
        if (TasksHolder.LJJIIZI == null) {
            TasksHolder.LJJIIZI = new InitShareSdkTask();
        }
        InitShareSdkTask initShareSdkTask = TasksHolder.LJJIIZI;
        o.LJIIIIZZ(initShareSdkTask, "getInitShareSdkTask()");
        arrayList2.add(initShareSdkTask);
        arrayList2.add(new MusicCollectTask());
        arrayList2.add(new BnplInitTask());
        arrayList.addAll(arrayList2);
        arrayList.add(new InitInnerPushTask());
        if (!C34710Djm.LIZ()) {
            if (((Boolean) C34710Djm.LIZLLL.getValue()).booleanValue()) {
                AVInitializerImpl.LIZ().initAVEnv(FKM.LIZ());
            }
            EE1 LIZIZ2 = TasksHolder.LIZIZ();
            o.LJIIIIZZ(LIZIZ2, "getInitAVModuleTask()");
            arrayList.add(LIZIZ2);
        }
        if (TasksHolder.LJIIZILJ == null) {
            TasksHolder.LJIIZILJ = new InitAppsFlyer();
        }
        InitAppsFlyer initAppsFlyer = TasksHolder.LJIIZILJ;
        o.LJIIIIZZ(initAppsFlyer, "getInitAppfler()");
        arrayList.add(initAppsFlyer);
        if (FCO.LIZLLL) {
            arrayList.add(new GetGoogleAIdTask(EFK.BOOT_FINISH));
        } else {
            arrayList.add(new GetGoogleAIdTask(EFK.BACKGROUND));
        }
        arrayList.add(FFV.LIZIZ.LIZIZ());
        EE1 LJIIIZ = LocationServiceImpl.LJIJJ().LJIIIZ();
        if (LJIIIZ != null) {
            arrayList.add(LJIIIZ);
        }
        if (!EU2.LIZ()) {
            arrayList.add(new PowerPermissionsTask());
        }
        if (TasksHolder.LJJIIZ == null) {
            TasksHolder.LJJIIZ = new ApmInit();
        }
        ApmInit apmInit = TasksHolder.LJJIIZ;
        o.LJIIIIZZ(apmInit, "getApmInitTask()");
        arrayList.add(apmInit);
        arrayList.add(new InitLottieOptTask());
        arrayList.add(new ExperienceKitInitTask());
        C36152EGu.LIZ(DPP.LIZIZ(), new DeeplinkPrefetchTask(), new AqS156S0100000_6(arrayList, (List<EEY>) 25));
        if (!((Boolean) C35401Duv.LIZLLL.getValue()).booleanValue() && C48236IwS.LJIIJ() && ((Boolean) FLX.LIZJ.getValue()).booleanValue()) {
            arrayList.add(new InitTTNetTask());
        }
        if (DUE.LIZ()) {
            FVR.LIZJ();
            arrayList.add(new PreloadFeedRequestTask());
            FFX.LIZ("preload_application", "data_preload_type");
        }
        arrayList.add(new InitPageMonitorTask());
        if (!((Boolean) C34710Djm.LJIL.getValue()).booleanValue()) {
            arrayList.add(new InitWebViewHookTask());
        }
        if (!((Boolean) C35226Ds6.LIZ.getValue()).booleanValue()) {
            arrayList.add(new FetchCombineSettingsTask());
            if (C35232DsC.LIZ()) {
                arrayList.add(new FetchABCommonTask());
            }
        }
        arrayList.add(new RxSchedulerPurgeOptTask());
        arrayList.add(new LiveGiftAssetStatisticTask());
        arrayList.add(new ShortcutInitTask());
        arrayList.add(new FirebaseConfigCheckTask());
        arrayList.add(new NewUserJourneyDialogCleanTask());
        arrayList.add(new PipInitTask());
        EE1 dlpTask = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getDlpTask();
        if (dlpTask != null) {
            arrayList.add(dlpTask);
        }
        PNSDeviceConsentLegoTask LIZJ = PNSDeviceConsentServiceImpl.LJI().LIZJ();
        if (LIZJ != null) {
            arrayList.add(LIZJ);
        }
        if (((Boolean) C35050DpG.LIZ.getValue()).booleanValue()) {
            arrayList.add(new AccessibilityEventTrackingTask());
        }
        return arrayList;
    }

    /* loaded from: classes7.dex */
    public static final class BootfinishTasksContainter implements EE1 {
        public final AwemeAppTaskProvider LJLIL;

        @Override // X.EEY
        public final String key() {
            return "AwemeAppTaskProvider$BootfinishTasksContainter";
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

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        public BootfinishTasksContainter(AwemeAppTaskProvider awemeAppTaskProvider) {
            this.LJLIL = awemeAppTaskProvider;
        }

        @Override // X.EEY
        public final void run(Context context) {
            C38995FSd.LJ().schedule(new ARunnableS42S0100000_6(this, 29), 1L, TimeUnit.SECONDS);
        }
    }
}
