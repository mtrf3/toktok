package com.ss.android.ugc.aweme.framework.services;

import X.Q4K;
import android.text.TextUtils;
import com.benchmark.BHApplogDowngrade;
import com.benchmark.BHNetTagDowngrade;
import com.benchmark.BHSlardarDowngrade;
import com.benchmark.BTCHConfigDowngrade;
import com.benchmark.collection_api.ByteBenchCollectionDowngrade;
import com.bytedance.bmf_mods_api.AdaptiveGradingAPIDefault;
import com.bytedance.bmf_mods_api.ColorHistAPIDefault;
import com.bytedance.bmf_mods_api.ColorShiftAPIDefault;
import com.bytedance.bmf_mods_api.DenoiseAPIDefault;
import com.bytedance.bmf_mods_api.HydraHDRAPIDefault;
import com.bytedance.bmf_mods_api.NoiseDetectAPIDefault;
import com.bytedance.bmf_mods_api.NoiseDetectCallbackAPIDefault;
import com.bytedance.bmf_mods_api.NoiseLiveAPIDefault;
import com.bytedance.bmf_mods_api.NoiseLiveCallbackAPIDefault;
import com.bytedance.bmf_mods_api.VideoBrightAPIDefault;
import com.bytedance.bmf_mods_api.VideoBrightCallBackAPIDefault;
import com.bytedance.bmf_mods_api.VideoOCLSRAPIDefault;
import com.bytedance.bmf_mods_api.VideoSRLutAPIDefault;
import com.bytedance.bmf_mods_api.VideoSRLutDspAPIDefault;
import com.bytedance.bmf_mods_api.VideoSRRaisrAPIDefault;
import com.bytedance.bmf_mods_api.VideoSuperResolutionAPIDefault;
import com.bytedance.bmf_mods_api.VqscoreLiveAPIDefault;
import com.bytedance.bmf_mods_api.VqscoreLiveCallbackAPIDefault;
import com.bytedance.bmf_mods_api.VqscoreProcessCallbackAPIDefault;
import com.bytedance.ies.android.base.runtime.DependOutServiceDowngrade;
import com.bytedance.ies.web.jsbridge2.JsBridge2ConfigDefault;
import com.bytedance.pia.core.spi.ConfigTask;
import com.bytedance.pumbaa.api.PumbaaServiceEmptyImpl;
import com.bytedance.pumbaa.bpea.adapter.api.BPEAServiceEmptyImp;
import com.bytedance.pumbaa.common.impl.applog.AppLogImpl;
import com.bytedance.pumbaa.common.impl.event.monitor.EventMonitorImpl;
import com.bytedance.pumbaa.common.impl.exception.monitor.ExceptionMonitorImpl;
import com.bytedance.pumbaa.common.impl.logger.AlogLoggerImpl;
import com.bytedance.pumbaa.common.impl.store.KevaStoreImpl;
import com.bytedance.pumbaa.monitor.adapter.api.MonitorServiceEmptyImpl;
import com.bytedance.pumbaa.network.adapter.api.NetworkServiceEmptyImpl;
import com.bytedance.pumbaa.pdp.adapter.api.PDPPumbaaServiceEmpty;
import com.bytedance.pumbaa.pdp.api.PolicyDecisionEmptyImp;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineServiceEmptyImpl;
import com.bytedance.touchpoint.api.downgrade.DowngradeTouchPointServiceImpl;
import com.fackbook.drawee.DraweeConfigOutServiceDowngrade;
import com.ss.android.elearning.lingo.gecko.GeckoAPIDefault;
import com.ss.android.elearning.lingo.roma.RomaHostServiceDefault;
import com.ss.android.elearning.lingo.tracker.ElTrackerDefault;
import com.ss.android.ugc.aweme.LandscapeFeedDowngradeService;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.SandboxServiceEmptyImpl;
import com.ss.android.ugc.aweme.deeplink.DeepLinkDowngradeService;
import com.ss.android.ugc.aweme.discover.DiscoveryAsyncInflateDownImpl;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceEmptyImpl;
import com.ss.android.ugc.aweme.homepage.HomePageServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.experiment.InboxGuideWatchFollowingLiveServiceImpl;
import com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineServiceDefault;
import com.ss.android.ugc.aweme.main.homepageImpl.LiveBubblePopServiceImpl;
import com.ss.android.ugc.aweme.mapapi.service.PoiMapServiceEmptylmpl;
import com.ss.android.ugc.aweme.ml.api.MLCommonServiceDefault;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterServiceDefault;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartCDNRankServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartOHRServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2ServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2ServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifyServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateServiceDefault;
import com.ss.android.ugc.aweme.modeo.ModeoImitDefaultImpl;
import com.ss.android.ugc.aweme.music.service.MusicAppAuthServiceEmptyImpl;
import com.ss.android.ugc.aweme.offline.anydoor.entry.DefaultAnydoorEntryServiceImpl;
import com.ss.android.ugc.aweme.offline.compose.debugtool.DefaultComposeDebugtoolServiceImpl;
import com.ss.android.ugc.aweme.offline.koopa.auto.DefaultKoopaAutoServiceImpl;
import com.ss.android.ugc.aweme.offline.networklog.DefaultNetworkLogEasyServiceImpl;
import com.ss.android.ugc.aweme.offline.screenshot.test.kit.DefaultScreenshotTestKitServiceImpl;
import com.ss.android.ugc.aweme.offline.testcase.DefaultTestcaseServiceImpl;
import com.ss.android.ugc.aweme.offline.ttmock.DefaultTtmockServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.api.PipFeedDefaultImpl;
import com.ss.android.ugc.aweme.poi_api.service.GoogleMapServiceEmptyImpl;
import com.ss.android.ugc.aweme.poi_api.service.PoiServiceEmptyImpl;
import com.ss.android.ugc.aweme.popularfeed.service.PopularFeedEmptyService;
import com.ss.android.ugc.aweme.portrait.api.PortraitCenterInitServiceDefault;
import com.ss.android.ugc.aweme.preinstall.PreInstallFakeService;
import com.ss.android.ugc.aweme.profile.ProfileDowngradeService;
import com.ss.android.ugc.aweme.qrcode.QRCodeDowngradeService;
import com.ss.android.ugc.aweme.search.voice.core.service.SearchDynamicServiceDefaultImpl;
import com.ss.android.ugc.aweme.service.EmptyNUJDebugServiceImpl;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceEmptyImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefalutDanmakuDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultComplianceOfflineServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultCreativeToolsDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultEtDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFeedDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFileLancetServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFilterBotServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFrameCheckServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFriendsTabDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocalEfficiencyServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocalTestImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocationMockServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocationOfflineServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultMatrixPluginServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultOfflineFeedbackServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultOnBoardManager;
import com.ss.android.ugc.aweme.service.downgrade.DefaultPopupDebugToolsServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultPopupRecordServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultRegionMockServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultSearchDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultSecuidLarkServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultSparrowServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultSurveyDebuggerServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultToolsCameraAudioSecurityCheckServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultToolsCaptureToSDServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultToolsOfflineServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultToolsVQEvaluationServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultTouchPointDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.OfflineGroupchatServiceEmptyImpl;
import com.ss.android.ugc.aweme.story.StoryServiceDowngradeImpl;
import com.ss.android.ugc.aweme.ug.brand.TranssonicFakeService;
import com.ss.android.ugc.aweme.upvote.service.UpvoteServiceDowngradeImpl;
import com.ss.android.ugc.aweme.utils.FollowJumpFromInboxServiceImpl;
import com.ss.android.ugc.aweme.utils.gecko.GeckoGlobalInitServiceDefault;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLocalServiceDefault;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLowStorageConfigDefault;
import com.ss.android.ugc.customactivityoncrash_base.DefaultCustomActivityOnCrashService;
import com.ss.android.ugc.tiktok.deeplink.DeeplinkPrefetchDefault;
import com.ss.android.ugc.tiktok.location_api.service.LocationServiceEmptyImpl;
import com.ss.android.ugc.tiktok.location_api.service.LocationServiceForM;
import com.ss.android.ugc.tiktok.seclink.ISecLinkServiceDefault;
import com.ss.android.ugc.tiktok.security.IClientSecurityServiceDefault;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class DowngradeImplManager {
    public Map<String, ServiceProvider> downgradeImplMap = new ConcurrentHashMap();
    public Map<String, Object> staticDowngradeImplCache = new ConcurrentHashMap();
    public final Map<String, String> componentsMap = new ConcurrentHashMap();
    public final Set<String> downgradeComponents = Q4K.LIZLLL();
    public final Set<String> staticDowngradeNotExistSet = Q4K.LIZLLL();

    /* loaded from: classes11.dex */
    public static class SingleInstanceHolder {
        public static final DowngradeImplManager INSTANCE = new DowngradeImplManager();
    }

    public static DowngradeImplManager getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private <T> T getStaticDowngradeImpl(Class<T> cls) {
        switch (cls.getName().hashCode()) {
            case -2108395710:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ICreativeToolsDebugService")) {
                    T t = (T) new DefaultCreativeToolsDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ICreativeToolsDebugService", t);
                    return t;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -2100114539:
                if (cls.getName().equals("com.bytedance.pumbaa.bpea.adapter.api.IBPEAService")) {
                    T t2 = (T) new BPEAServiceEmptyImp();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.bpea.adapter.api.IBPEAService", t2);
                    return t2;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1971258211:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.c")) {
                    T t3 = (T) new NoiseLiveCallbackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.NoiseLiveCallbackAPI", t3);
                    return t3;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1891048851:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.ColorShiftAPI")) {
                    T t4 = (T) new ColorShiftAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.ColorShiftAPI", t4);
                    return t4;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1859502304:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSuperResolutionAPI")) {
                    T t5 = (T) new VideoSuperResolutionAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoSuperResolutionAPI", t5);
                    return t5;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1846150268:
                if (cls.getName().equals("com.ss.android.ugc.aweme.inbox.FollowJumpFromInboxService")) {
                    T t6 = (T) new FollowJumpFromInboxServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.inbox.FollowJumpFromInboxService", t6);
                    return t6;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1788325683:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRRaisrAPI")) {
                    T t7 = (T) new VideoSRRaisrAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoSRRaisrAPI", t7);
                    return t7;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1788202922:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISearchDebugService")) {
                    T t8 = (T) new DefaultSearchDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ISearchDebugService", t8);
                    return t8;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1762099470:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IToolsCaptureToSDService")) {
                    T t9 = (T) new DefaultToolsCaptureToSDServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IToolsCaptureToSDService", t9);
                    return t9;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1753842266:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.SmartCDNRankService")) {
                    T t10 = (T) new SmartCDNRankServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.SmartCDNRankService", t10);
                    return t10;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1746126115:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IEtDebugService")) {
                    T t11 = (T) new DefaultEtDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IEtDebugService", t11);
                    return t11;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1727161271:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService")) {
                    T t12 = (T) new SmartFeedPreloadServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService", t12);
                    return t12;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1707827715:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.networklog.INetworkLogEasyService")) {
                    T t13 = (T) new DefaultNetworkLogEasyServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.networklog.INetworkLogEasyService", t13);
                    return t13;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1690323830:
                if (cls.getName().equals("com.ss.android.ugc.aweme.deeplink.IDeepLinkService")) {
                    T t14 = (T) new DeepLinkDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.deeplink.IDeepLinkService", t14);
                    return t14;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1689796830:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.NoiseLiveAPI")) {
                    T t15 = (T) new NoiseLiveAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.NoiseLiveAPI", t15);
                    return t15;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1667865087:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLCommonService")) {
                    T t16 = (T) new MLCommonServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.IMLCommonService", t16);
                    return t16;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1633603100:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service")) {
                    T t17 = (T) new SmartPreloadCommentV2ServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service", t17);
                    return t17;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1614766624:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.e")) {
                    T t18 = (T) new VqscoreLiveCallbackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VqscoreLiveCallbackAPI", t18);
                    return t18;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1581112369:
                if (cls.getName().equals("com.benchmark.collection_api.BXCollectionAPI")) {
                    return (T) new ByteBenchCollectionDowngrade();
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1568697773:
                if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService")) {
                    T t19 = (T) new LiveBubblePopServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService", t19);
                    return t19;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1506853545:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ttmock.ITtmockService")) {
                    T t20 = (T) new DefaultTtmockServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ttmock.ITtmockService", t20);
                    return t20;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1472699734:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ILocationMockService")) {
                    T t21 = (T) new DefaultLocationMockServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ILocationMockService", t21);
                    return t21;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1466836780:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.IEventMonitor")) {
                    T t22 = (T) new EventMonitorImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.IEventMonitor", t22);
                    return t22;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1429156681:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.location_api.service.ILocationService")) {
                    T t23 = (T) new LocationServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.location_api.service.ILocationService", t23);
                    return t23;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1379566319:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService")) {
                    T t24 = (T) new SmartMLSceneServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService", t24);
                    return t24;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1364971920:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoOCLSRAPI")) {
                    T t25 = (T) new VideoOCLSRAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoOCLSRAPI", t25);
                    return t25;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1323957599:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ILandscapeFeedService")) {
                    T t26 = (T) new LandscapeFeedDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ILandscapeFeedService", t26);
                    return t26;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1317882728:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRLutDspAPI")) {
                    T t27 = (T) new VideoSRLutDspAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoSRLutDspAPI", t27);
                    return t27;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1303276871:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IOfflineFeedbackService")) {
                    T t28 = (T) new DefaultOfflineFeedbackServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IOfflineFeedbackService", t28);
                    return t28;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1289181594:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService")) {
                    T t29 = (T) new SmartPlaytimePredictServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService", t29);
                    return t29;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1282200045:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ILocationOfflineService")) {
                    T t30 = (T) new DefaultLocationOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ILocationOfflineService", t30);
                    return t30;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1263811427:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService")) {
                    T t31 = (T) new SmartFeedLoadMoreServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService", t31);
                    return t31;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1230251313:
                if (cls.getName().equals("com.bytedance.ies.android.base.runtime.IDependOutService")) {
                    return (T) new DependOutServiceDowngrade();
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1189818203:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ISearchDynamicService")) {
                    T t32 = (T) new SearchDynamicServiceDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.ISearchDynamicService", t32);
                    return t32;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1178352011:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.koopa.auto.IKoopaAutoService")) {
                    T t33 = (T) new DefaultKoopaAutoServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.koopa.auto.IKoopaAutoService", t33);
                    return t33;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1175770854:
                if (cls.getName().equals("com.ss.android.ugc.aweme.dsp.service.IMusicDspService")) {
                    T t34 = (T) new MusicDspServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.dsp.service.IMusicDspService", t34);
                    return t34;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1077200566:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.AdaptiveGradingAPI")) {
                    T t35 = (T) new AdaptiveGradingAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.AdaptiveGradingAPI", t35);
                    return t35;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1067518024:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.security.IClientSecurityService")) {
                    T t36 = (T) new IClientSecurityServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.security.IClientSecurityService", t36);
                    return t36;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -1015971974:
                if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.business.IInboxGuideWatchFollowingLiveService")) {
                    T t37 = (T) new InboxGuideWatchFollowingLiveServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.homepage.business.IInboxGuideWatchFollowingLiveService", t37);
                    return t37;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -981221515:
                if (cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService")) {
                    T t38 = (T) new GoogleMapServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService", t38);
                    return t38;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -978906707:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService")) {
                    T t39 = (T) new SmartRegressCalculateServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService", t39);
                    return t39;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -913921537:
                if (cls.getName().equals("com.bytedance.pumbaa.pdp.adapter.api.IPDPPumbaaService")) {
                    T t40 = (T) new PDPPumbaaServiceEmpty();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.pdp.adapter.api.IPDPPumbaaService", t40);
                    return t40;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -897514835:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPopupDebugToolsService")) {
                    T t41 = (T) new DefaultPopupDebugToolsServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IPopupDebugToolsService", t41);
                    return t41;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -892718263:
                if (cls.getName().equals("com.benchmark.IBTCHSlardar")) {
                    T t42 = (T) new BHSlardarDowngrade();
                    putStaticDowngradeImplCache("com.benchmark.IBTCHSlardar", t42);
                    return t42;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -857828971:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IMatrixPluginService")) {
                    T t43 = (T) new DefaultMatrixPluginServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IMatrixPluginService", t43);
                    return t43;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -851129746:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFriendsTabDebugService")) {
                    T t44 = (T) new DefaultFriendsTabDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFriendsTabDebugService", t44);
                    return t44;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -826855070:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService")) {
                    T t45 = (T) new PitayaFeatureCenterServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService", t45);
                    return t45;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -801115505:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService")) {
                    T t46 = (T) new DefaultToolsCameraAudioSecurityCheckServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService", t46);
                    return t46;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -767436525:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoBrightAPI")) {
                    T t47 = (T) new VideoBrightAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoBrightAPI", t47);
                    return t47;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -738010642:
                if (cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IPoiService")) {
                    T t48 = (T) new PoiServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.poi_api.service.IPoiService", t48);
                    return t48;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -710867495:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INUJDebugService")) {
                    T t49 = (T) new EmptyNUJDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.INUJDebugService", t49);
                    return t49;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -709173037:
                if (cls.getName().equals("com.ss.android.ugc.aweme.popularfeed.service.IPopularFeedService")) {
                    T t50 = (T) new PopularFeedEmptyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.popularfeed.service.IPopularFeedService", t50);
                    return t50;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -706028711:
                if (cls.getName().equals("com.ss.android.ugc.aweme.modeo.IModeoInit")) {
                    T t51 = (T) new ModeoImitDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.modeo.IModeoInit", t51);
                    return t51;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -703329023:
                if (cls.getName().equals("com.fackbook.drawee.IDraweeConfigOutService")) {
                    return (T) new DraweeConfigOutServiceDowngrade();
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -688908617:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService")) {
                    T t52 = (T) new DeeplinkPrefetchDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService", t52);
                    return t52;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -673596545:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.IExceptionMonitor")) {
                    T t53 = (T) new ExceptionMonitorImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.IExceptionMonitor", t53);
                    return t53;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -659757515:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IOfflineGroupchatService")) {
                    T t54 = (T) new OfflineGroupchatServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IOfflineGroupchatService", t54);
                    return t54;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -631517313:
                if (cls.getName().equals("com.ss.android.elearning.lingo.roma.RomaHostService")) {
                    T t55 = (T) new RomaHostServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.elearning.lingo.roma.RomaHostService", t55);
                    return t55;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -628620472:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService")) {
                    T t56 = (T) new SmartClassifyServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService", t56);
                    return t56;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -627748852:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INearbyFeedService")) {
                    T t57 = (T) new NearbyFeedServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.INearbyFeedService", t57);
                    return t57;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -607424883:
                if (cls.getName().equals("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService")) {
                    T t58 = (T) new DefaultCustomActivityOnCrashService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService", t58);
                    return t58;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -597770654:
                if (cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoveryAsyncInflateService")) {
                    return (T) new DiscoveryAsyncInflateDownImpl();
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -570979083:
                if (cls.getName().equals("com.bytedance.pia.core.spi.api.IPiaConfigTask")) {
                    T t59 = (T) new ConfigTask();
                    putStaticDowngradeImplCache("com.bytedance.pia.core.spi.api.IPiaConfigTask", t59);
                    return t59;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -539986555:
                if (cls.getName().equals("com.benchmark.IBTCHApplog")) {
                    T t60 = (T) new BHApplogDowngrade();
                    putStaticDowngradeImplCache("com.benchmark.IBTCHApplog", t60);
                    return t60;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -519441132:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFileLancetService")) {
                    T t61 = (T) new DefaultFileLancetServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFileLancetService", t61);
                    return t61;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -505491999:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IToolsOfflineService")) {
                    T t62 = (T) new DefaultToolsOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IToolsOfflineService", t62);
                    return t62;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -401510911:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService")) {
                    T t63 = (T) new SmartFeedAdUIServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService", t63);
                    return t63;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -360388275:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService")) {
                    T t64 = (T) new MLDataCenterServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService", t64);
                    return t64;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -317372455:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.seclink.ISecLinkService")) {
                    T t65 = (T) new ISecLinkServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.seclink.ISecLinkService", t65);
                    return t65;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -273788969:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.IAppLog")) {
                    T t66 = (T) new AppLogImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.IAppLog", t66);
                    return t66;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -271762187:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISparrowService")) {
                    T t67 = (T) new DefaultSparrowServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ISparrowService", t67);
                    return t67;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -203622012:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPopupRecordService")) {
                    T t68 = (T) new DefaultPopupRecordServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IPopupRecordService", t68);
                    return t68;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -177870657:
                if (cls.getName().equals("com.benchmark.IBTCHNetTag")) {
                    T t69 = (T) new BHNetTagDowngrade();
                    putStaticDowngradeImplCache("com.benchmark.IBTCHNetTag", t69);
                    return t69;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case -45175540:
                if (cls.getName().equals("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService")) {
                    T t70 = (T) new IInferenceEngineServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService", t70);
                    return t70;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 21995517:
                if (cls.getName().equals("com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService")) {
                    T t71 = (T) new RuleEngineServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService", t71);
                    return t71;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 23658350:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFrameCheckService")) {
                    T t72 = (T) new DefaultFrameCheckServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFrameCheckService", t72);
                    return t72;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 26004728:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.HydraHDRAPI")) {
                    T t73 = (T) new HydraHDRAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.HydraHDRAPI", t73);
                    return t73;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 39965700:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.ILogger")) {
                    T t74 = (T) new AlogLoggerImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.ILogger", t74);
                    return t74;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 53015589:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.screenshot.test.kit.IScreenshotTestKitService")) {
                    T t75 = (T) new DefaultScreenshotTestKitServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.screenshot.test.kit.IScreenshotTestKitService", t75);
                    return t75;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 53902533:
                if (cls.getName().equals("com.ss.android.ugc.aweme.upvote.service.IUpvoteService")) {
                    T t76 = (T) new UpvoteServiceDowngradeImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.upvote.service.IUpvoteService", t76);
                    return t76;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 57780698:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service")) {
                    T t77 = (T) new SmartPreloadProfileV2ServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service", t77);
                    return t77;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 70052694:
                if (cls.getName().equals("com.ss.android.elearning.lingo.gecko.GeckoAPI")) {
                    T t78 = (T) new GeckoAPIDefault();
                    putStaticDowngradeImplCache("com.ss.android.elearning.lingo.gecko.GeckoAPI", t78);
                    return t78;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 87343796:
                if (cls.getName().equals("com.benchmark.IBTCHConfiguration")) {
                    T t79 = (T) new BTCHConfigDowngrade();
                    putStaticDowngradeImplCache("com.benchmark.IBTCHConfiguration", t79);
                    return t79;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 197041894:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.SmartOHRService")) {
                    T t80 = (T) new SmartOHRServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.SmartOHRService", t80);
                    return t80;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 316475372:
                if (cls.getName().equals("com.ss.android.ugc.aweme.story.IStoryService")) {
                    T t81 = (T) new StoryServiceDowngradeImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.story.IStoryService", t81);
                    return t81;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 389028902:
                if (cls.getName().equals("com.ss.android.ugc.aweme.preinstall.IPreInstallService")) {
                    T t82 = (T) new PreInstallFakeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.preinstall.IPreInstallService", t82);
                    return t82;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 396547665:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService")) {
                    T t83 = (T) new SandboxServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService", t83);
                    return t83;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 477254501:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VqscoreLiveAPI")) {
                    T t84 = (T) new VqscoreLiveAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VqscoreLiveAPI", t84);
                    return t84;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 478472780:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFeedDebugService")) {
                    T t85 = (T) new DefaultFeedDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFeedDebugService", t85);
                    return t85;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 534010062:
                if (cls.getName().equals("n59.m0")) {
                    T t86 = (T) new DefaultOnBoardManager();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IOnBoardingService", t86);
                    return t86;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 560897171:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.anydoor.entry.IAnydoorEntryService")) {
                    T t87 = (T) new DefaultAnydoorEntryServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.anydoor.entry.IAnydoorEntryService", t87);
                    return t87;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 642369832:
                if (cls.getName().equals("com.bytedance.ies.web.jsbridge2.IJsBridge2Config")) {
                    T t88 = (T) new JsBridge2ConfigDefault();
                    putStaticDowngradeImplCache("com.bytedance.ies.web.jsbridge2.IJsBridge2Config", t88);
                    return t88;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 671886221:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ILocalEfficiencyService")) {
                    T t89 = (T) new DefaultLocalEfficiencyServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ILocalEfficiencyService", t89);
                    return t89;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 682082159:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.f")) {
                    T t90 = (T) new VqscoreProcessCallbackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VqscoreProcessCallbackAPI", t90);
                    return t90;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 685835610:
                if (cls.getName().equals("com.ss.android.elearning.lingo.tracker.ElTrackerService")) {
                    T t91 = (T) new ElTrackerDefault();
                    putStaticDowngradeImplCache("com.ss.android.elearning.lingo.tracker.ElTrackerService", t91);
                    return t91;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 787868839:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.testcase.ITestcaseService")) {
                    T t92 = (T) new DefaultTestcaseServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.testcase.ITestcaseService", t92);
                    return t92;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 885632920:
                if (cls.getName().equals("com.bytedance.geckox.IGeckoLowStorageConfig")) {
                    T t93 = (T) new GeckoLowStorageConfigDefault();
                    putStaticDowngradeImplCache("com.bytedance.geckox.IGeckoLowStorageConfig", t93);
                    return t93;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 894687086:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISurveyDebuggerService")) {
                    T t94 = (T) new DefaultSurveyDebuggerServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ISurveyDebuggerService", t94);
                    return t94;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 913277804:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.IProfileService")) {
                    T t95 = (T) new ProfileDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.profile.IProfileService", t95);
                    return t95;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 922519942:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.b")) {
                    T t96 = (T) new NoiseDetectCallbackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.NoiseDetectCallbackAPI", t96);
                    return t96;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 938216902:
                if (cls.getName().equals("com.ss.android.ugc.aweme.mapapi.IPoiMapService")) {
                    T t97 = (T) new PoiMapServiceEmptylmpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.mapapi.IPoiMapService", t97);
                    return t97;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1020813802:
                if (cls.getName().equals("com.bytedance.pumbaa.api.IPumbaaService")) {
                    T t98 = (T) new PumbaaServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.api.IPumbaaService", t98);
                    return t98;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1045451100:
                if (cls.getName().equals("com.bytedance.touchpoint.api.ITouchPointService")) {
                    T t99 = (T) new DowngradeTouchPointServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.touchpoint.api.ITouchPointService", t99);
                    return t99;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1053771019:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.NoiseDetectAPI")) {
                    T t100 = (T) new NoiseDetectAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.NoiseDetectAPI", t100);
                    return t100;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1073258125:
                if (cls.getName().equals("com.bytedance.pumbaa.pdp.api.IPolicyDecision")) {
                    T t101 = (T) new PolicyDecisionEmptyImp();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.pdp.api.IPolicyDecision", t101);
                    return t101;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1127805601:
                if (cls.getName().equals("com.ss.android.ugc.aweme.local_test.LocalTestApi")) {
                    T t102 = (T) new DefaultLocalTestImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.local_test.LocalTestApi", t102);
                    return t102;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1159930051:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.ColorHistAPI")) {
                    T t103 = (T) new ColorHistAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.ColorHistAPI", t103);
                    return t103;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1205724034:
                if (cls.getName().equals("com.bytedance.geckox.IGeckoGlobalInit")) {
                    T t104 = (T) new GeckoGlobalInitServiceDefault();
                    putStaticDowngradeImplCache("com.bytedance.geckox.IGeckoGlobalInit", t104);
                    return t104;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1282325349:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDanmakuDebugService")) {
                    T t105 = (T) new DefalutDanmakuDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDanmakuDebugService", t105);
                    return t105;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1333329962:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT")) {
                    T t106 = (T) new LocationServiceForM();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT", t106);
                    return t106;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1373149304:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService")) {
                    T t107 = (T) new PipFeedDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService", t107);
                    return t107;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1377752390:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService")) {
                    T t108 = (T) new SmartDataTrackerServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService", t108);
                    return t108;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1397119225:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IComplianceOfflineService")) {
                    T t109 = (T) new DefaultComplianceOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IComplianceOfflineService", t109);
                    return t109;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1439578746:
                if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.IHomePageService")) {
                    T t110 = (T) new HomePageServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.homepage.IHomePageService", t110);
                    return t110;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1469964205:
                if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService")) {
                    T t111 = (T) new GeckoLocalServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService", t111);
                    return t111;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1513354211:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService")) {
                    T t112 = (T) new SmartDataCenterApiServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService", t112);
                    return t112;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1526593817:
                if (cls.getName().equals("com.bytedance.pumbaa.network.adapter.api.INetworkService")) {
                    T t113 = (T) new NetworkServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.network.adapter.api.INetworkService", t113);
                    return t113;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1532564235:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IRegionMockService")) {
                    T t114 = (T) new DefaultRegionMockServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IRegionMockService", t114);
                    return t114;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1661968864:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService")) {
                    T t115 = (T) new SmartCommonPreloadServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService", t115);
                    return t115;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1670478829:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.IStore")) {
                    T t116 = (T) new KevaStoreImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.IStore", t116);
                    return t116;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1678604719:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.DenoiseAPI")) {
                    T t117 = (T) new DenoiseAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.DenoiseAPI", t117);
                    return t117;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1701644943:
                if (cls.getName().equals("com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService")) {
                    T t118 = (T) new PortraitCenterInitServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService", t118);
                    return t118;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1770833231:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IToolsVQEvaluationService")) {
                    T t119 = (T) new DefaultToolsVQEvaluationServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IToolsVQEvaluationService", t119);
                    return t119;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1771368059:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRLutAPI")) {
                    T t120 = (T) new VideoSRLutAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoSRLutAPI", t120);
                    return t120;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1784507698:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFilterBotService")) {
                    T t121 = (T) new DefaultFilterBotServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFilterBotService", t121);
                    return t121;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1790875022:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.d")) {
                    T t122 = (T) new VideoBrightCallBackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoBrightCallbackAPI", t122);
                    return t122;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1888269503:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ITouchPointDebugService")) {
                    T t123 = (T) new DefaultTouchPointDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ITouchPointDebugService", t123);
                    return t123;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1913613454:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicAppAuthService")) {
                    T t124 = (T) new MusicAppAuthServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.music.service.IMusicAppAuthService", t124);
                    return t124;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1939446823:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ug.brand.ITranssonicService")) {
                    T t125 = (T) new TranssonicFakeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ug.brand.ITranssonicService", t125);
                    return t125;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1959495426:
                if (cls.getName().equals("com.ss.android.ugc.aweme.utils.ISecUidDependService")) {
                    T t126 = (T) new DefaultSecuidLarkServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.utils.ISecUidDependService", t126);
                    return t126;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 1975850393:
                if (cls.getName().equals("com.bytedance.pumbaa.monitor.adapter.api.IMonitorService")) {
                    T t127 = (T) new MonitorServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.monitor.adapter.api.IMonitorService", t127);
                    return t127;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 2031266849:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.compose.debugtool.IComposeDebugtoolService")) {
                    T t128 = (T) new DefaultComposeDebugtoolServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.compose.debugtool.IComposeDebugtoolService", t128);
                    return t128;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            case 2037829402:
                if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.IQRCodeService")) {
                    T t129 = (T) new QRCodeDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.qrcode.IQRCodeService", t129);
                    return t129;
                }
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
            default:
                this.staticDowngradeNotExistSet.add(cls.getName());
                return null;
        }
    }

    public void downgradeComponent(String str) {
        if (!TextUtils.isEmpty(str) && !this.downgradeComponents.contains(str)) {
            this.downgradeComponents.add(str);
        }
    }

    public <T> T getDowngradeImpl(Class<T> cls) {
        String name = cls.getName();
        ServiceProvider serviceProvider = this.downgradeImplMap.get(name);
        if (serviceProvider != null) {
            return (T) serviceProvider.get();
        }
        T t = (T) this.staticDowngradeImplCache.get(name);
        if (t == null && !this.staticDowngradeNotExistSet.contains(name)) {
            return (T) getStaticDowngradeImpl(cls);
        }
        return t;
    }

    public boolean isServiceForceDowngrade(Class cls) {
        String str = this.componentsMap.get(cls.getName());
        if (!TextUtils.isEmpty(str)) {
            return this.downgradeComponents.contains(str);
        }
        return false;
    }

    private void addServiceComponent(String str, String str2) {
        this.componentsMap.put(str, str2);
    }

    private void putStaticDowngradeImplCache(String str, Object obj) {
        this.staticDowngradeImplCache.put(str, obj);
    }

    public <T> void bindDowngradeImpl(Class<T> cls, ServiceProvider<T> serviceProvider) {
        this.downgradeImplMap.put(cls.getName(), serviceProvider);
    }
}
