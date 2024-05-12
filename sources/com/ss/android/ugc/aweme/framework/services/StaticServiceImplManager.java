package com.ss.android.ugc.aweme.framework.services;

import X.Q4K;
import com.aweme.storage.StorageCleanServiceImpl;
import com.aweme.ttkvstorage.UpdateRegisterKeyImpl;
import com.benchmark.collection_api.BXCollectionImpl;
import com.bytedance.awemelobby.LobbyNonceGenerator;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.init.BDLocationAgentImpl;
import com.bytedance.bmf_mods.AdaptiveGrading;
import com.bytedance.bmf_mods.ColorHist;
import com.bytedance.bmf_mods.ColorShift;
import com.bytedance.bmf_mods.Denoise;
import com.bytedance.bmf_mods.HydraHDR;
import com.bytedance.bmf_mods.NoiseDetect;
import com.bytedance.bmf_mods.NoiseLive;
import com.bytedance.bmf_mods.VideoBright;
import com.bytedance.bmf_mods.VideoOCLSR;
import com.bytedance.bmf_mods.VideoSRLut;
import com.bytedance.bmf_mods.VideoSRLutDsp;
import com.bytedance.bmf_mods.VideoSRRaisr;
import com.bytedance.bmf_mods.VideoSuperResolution;
import com.bytedance.bmf_mods.VqscoreLive;
import com.bytedance.ies.im.core.service.IMCoreProxyService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ConsistentContentAndAdChoiceServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IntelligenceModuleImpl;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankServiceManager;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdModuleImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.GlobalSearchAdModuleImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.PreciseAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.TopVideoAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.RealTimeSplashManagerImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplashnp.RealTimeSplashNPManagerImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.ZstdService;
import com.bytedance.ies.ugc.statisticlogger.btm.BTMTrackerServiceImpl;
import com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl;
import com.bytedance.ies.ugc.ttkvstorageimpl.settings.TTKVStorageSettings;
import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.bytedance.pumbaa.PumbaaServiceImpl;
import com.bytedance.pumbaa.bpea.adapter.BPEAPumbaaService;
import com.bytedance.pumbaa.bpea.adapter.BPEAServiceImp;
import com.bytedance.pumbaa.bpea.adapter.data.collect.DataCollectionModule;
import com.bytedance.pumbaa.hybrid.impl.HybridServiceImpl;
import com.bytedance.pumbaa.hybrid.monitor.HybridMonitorServiceImpl;
import com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl;
import com.bytedance.pumbaa.monitor.adapter.MonitorServiceImpl;
import com.bytedance.pumbaa.network.adapter.NetworkServiceImpl;
import com.bytedance.pumbaa.pdp.PolicyDecisionImp;
import com.bytedance.pumbaa.pdp.adapter.PDPPumbaaService;
import com.bytedance.pumbaa.ruler.adapter.RuleEngineServiceImpl;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NotificationCountViewManager;
import com.bytedance.tiktok.homepage.services.MainFragmentCacheExpServiceImpl;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.touchpoint.core.TouchPointServiceImpl;
import com.bytedance.tpsw.bpea.vk.VKService;
import com.lingo.caption.LingoCaptionImpl;
import com.lingo.caption.LingoCaptionInnerImpl;
import com.ss.android.elearning.lingo.log.ElLogDefault;
import com.ss.android.elearning.lingo.lynx.LingoLynxImpl;
import com.ss.android.elearning.lingo.roma.RomaServiceImpl;
import com.ss.android.elearning.lingo.settings.ElSettingDefault;
import com.ss.android.elearning.lingo.tracker.impl.ElTrackerServiceImpl;
import com.ss.android.experiment.ImageHeaderConfigImpl;
import com.ss.android.experiment.LauncherExperimentsImpl;
import com.ss.android.experiment.PowerExperimentsImpl;
import com.ss.android.legoimpl.ABLegoTaskImpl;
import com.ss.android.newmedia.ad.WebAdUserAgentServiceImpl;
import com.ss.android.ugc.AwemeAppBuildConfig;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ActivityRouterServiceImpl;
import com.ss.android.ugc.aweme.AnoleServiceImpl;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.BuildConfigAllServiceImpl;
import com.ss.android.ugc.aweme.CQrcodeService;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.DubbingServiceImpl;
import com.ss.android.ugc.aweme.InboxRepostFeedServiceImpl;
import com.ss.android.ugc.aweme.MiddleForSearchFromEC;
import com.ss.android.ugc.aweme.NewUserJourneyService;
import com.ss.android.ugc.aweme.NujPerformanceService;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.PreloadApiServiceImpl;
import com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.SettingsMainApiImpl;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.account.AccountInitServiceImpl;
import com.ss.android.ugc.aweme.account.PreLoginHandleService;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.experiment.AccountFeatureFlagService;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.GoogleOneTapLogger;
import com.ss.android.ugc.aweme.account.login.googleonetap.GoogleOneTapService;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.twostep.nonce.AccountNonceUtilImpl;
import com.ss.android.ugc.aweme.account.login.v2.ui.EmailConsentPageImageConfig;
import com.ss.android.ugc.aweme.account.login.v2.ui.PrivateAccountTipsViewDelegate;
import com.ss.android.ugc.aweme.account.main.AccountMainServiceImpl;
import com.ss.android.ugc.aweme.account.passwordcheck.service.KnownWeakPasswordService;
import com.ss.android.ugc.aweme.account.popup.popuphelper.PasskeyPopUpHelper;
import com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.account.prompt.AccountShowConfirmPromptServiceImpl;
import com.ss.android.ugc.aweme.accountxbridge.AccountBDXBridgeService;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.comment.AdCommentService;
import com.ss.android.ugc.aweme.ad.comment.pitaya.PitayaServiceManager;
import com.ss.android.ugc.aweme.ad.feed.CommercializeFeedServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.adexperience.CommerceAdExperienceServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.adexperience.event.AdExperienceEventLogger;
import com.ss.android.ugc.aweme.ad.feed.feinteraction.AdFeInteractionImpl;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.photomode.IAdSlidePreloadImpl;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggService;
import com.ss.android.ugc.aweme.ad.feed.utils.FeedBackDialogManagerService;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.gecko.GeckoPreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.prerender.PreRenderWebViewManager;
import com.ss.android.ugc.aweme.ad.subpage.CommerceLandPageModuleImpl;
import com.ss.android.ugc.aweme.ad.utils.AdAnimationImpl;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.album.ToolsAlbumServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorOperationServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.CustomAnchorViewServicImpl;
import com.ss.android.ugc.aweme.anchor.service.EcommerceAnchorService;
import com.ss.android.ugc.aweme.api.AnchorBusinessApiImpl;
import com.ss.android.ugc.aweme.api.FeedServiceImpl;
import com.ss.android.ugc.aweme.api.LegoBusinessServiceImpl;
import com.ss.android.ugc.aweme.api.component.AdComponentServiceImpl;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.app.accountsdk.AccountInitializer;
import com.ss.android.ugc.aweme.app.launch.MobLaunchImpl;
import com.ss.android.ugc.aweme.app.launch.SystemServiceApiImpl;
import com.ss.android.ugc.aweme.app.launch.TaskServiceImpl;
import com.ss.android.ugc.aweme.app.services.DownloadService;
import com.ss.android.ugc.aweme.app.services.Feed0VVManagerService;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.app.services.LauncherService;
import com.ss.android.ugc.aweme.app.services.NewUserMainModuleService;
import com.ss.android.ugc.aweme.app.services.PushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.app.services.RegionService;
import com.ss.android.ugc.aweme.app.services.WebviewService;
import com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.service.FullEpisodeRouterServiceImpl;
import com.ss.android.ugc.aweme.audiomode.legoimpl.AudioSDKABLegoLauncherTaskImpl;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopBDXBridgeServiceImpl;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopCloneServiceImpl;
import com.ss.android.ugc.aweme.autofill.AdAutofillService;
import com.ss.android.ugc.aweme.avatar.AvatarImageServiceImpl;
import com.ss.android.ugc.aweme.avatar.AvatarInternalServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.service.FeedSkylightServiceImpl;
import com.ss.android.ugc.aweme.base.service.FeedSkylightServiceProviderImpl;
import com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl;
import com.ss.android.ugc.aweme.benchmark.BenchmarkCollectionInitService;
import com.ss.android.ugc.aweme.benchmark.BenchmarkInitService;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bnpl.BNPLServiceImpl;
import com.ss.android.ugc.aweme.brand.TranssonicServiceImpl;
import com.ss.android.ugc.aweme.brdatagift.BemobiGiftServiceImpl;
import com.ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.business.story.service.StorySkylightDetailShareVMServiceImpl;
import com.ss.android.ugc.aweme.casting.CastingServiceImpl;
import com.ss.android.ugc.aweme.cct.AdACTEventLoger;
import com.ss.android.ugc.aweme.cct.OpenCCTUtils;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvider;
import com.ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl;
import com.ss.android.ugc.aweme.childhook.services.ChildHookServiceImpl;
import com.ss.android.ugc.aweme.comment.commentlist.ui.CommentFontConfig;
import com.ss.android.ugc.aweme.comment.record.CommentStickerRecordServiceImpl;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.service.KeyboardServiceImpl;
import com.ss.android.ugc.aweme.comment.service.NoticeCommentHelperServiceImpl;
import com.ss.android.ugc.aweme.commerce.omid.AdOmSdkManagerProvider;
import com.ss.android.ugc.aweme.commerce.omid.AdOmSdkManagerServiceImpl;
import com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService;
import com.ss.android.ugc.aweme.commerce.sdk.service.ShoppingDetailPageOperatorService;
import com.ss.android.ugc.aweme.commerce.tools.challenge.CommerceToolsChallengeService;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsService;
import com.ss.android.ugc.aweme.commerce.tools.common.publish.CommerceToolsPublishService;
import com.ss.android.ugc.aweme.commerce.tools.common.record.CommerceToolsRecordApiComponent;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.commercialize.AwemeContextServiceImpl;
import com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.anchor.service.GetLeadsAnchorService;
import com.ss.android.ugc.aweme.commercialize.assem.AdAssemUtils;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BABusinessSuitePageServiceImp;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BASwitchToPAorBAServiceImpl;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdTrackDependImpl;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.AdAssemServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.AdAssemblerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.AdTagServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.candidate.CandidateRequestImpl;
import com.ss.android.ugc.aweme.commercialize.feed.slide.guide.MainPageSlideImpl;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebJumpInterceptor;
import com.ss.android.ugc.aweme.commercialize.impl.CommerceServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.promote.service.LiveParasiticModuleLaunchServicePromoteImpl;
import com.ss.android.ugc.aweme.commercialize.live.promote.service.PromoteUtilImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.ILiveParasiticModuleLaunchServiceCommercializeImpl;
import com.ss.android.ugc.aweme.commercialize.log.AdLogServiceImpl;
import com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsImpl;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.commercialize.measurement.mrc.MRCManager;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunAsseUtils;
import com.ss.android.ugc.aweme.commercialize.prefetch.AdWebViewPrefetchManager;
import com.ss.android.ugc.aweme.commercialize.preview.service.AdsPreviewServiceImpl;
import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.runtime.DependOutServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.AdLandPageDependOutService;
import com.ss.android.ugc.aweme.commercialize.service.ChallengeDetailProviderOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceChallengeOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceCommonServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.CommerceMediaOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceStickerOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommercializeAdOutService;
import com.ss.android.ugc.aweme.commercialize.service.SplashAdOutService;
import com.ss.android.ugc.aweme.commercialize.service.TcmOutService;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.commercialize.utils.AdOpenHelperImpl;
import com.ss.android.ugc.aweme.commercialize.utils.NoticeChallengePropertyUtilImpl;
import com.ss.android.ugc.aweme.commercialize.utils.video.SearchVideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageOpenUtils;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.compliance.ComplianceDependServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.agecontrol.PNSAgeControlService;
import com.ss.android.ugc.aweme.compliance.business.policy.CompliancePolicyServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeAppealServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceSettingsServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PnSSearchHistoryServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PrivateAccountServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ReportServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TermsConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.share.ShareWarningInfoServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.statemachine.ConsentFrameworkUserStateMachineHandler;
import com.ss.android.ugc.aweme.compliance.business.statemachine.GatekeeperUserStateMachineHandler;
import com.ss.android.ugc.aweme.compliance.business.statemachine.KidsUserStateMachineHandler;
import com.ss.android.ugc.aweme.compliance.business.statemachine.PNSUserStateManager;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceMonitorServiceImpl;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.HydrogenServiceImpl;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.PNSConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.business.DeviceConsentHandlerServiceImpl;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.ConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.AlgoRefreshServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.AntiAddictionServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.FamilyPairingServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl;
import com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl.SandboxServiceImpl;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewTTNetHandlerImp;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.contact.service.IMContactServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.creatorcenter.CreatorCenterPreloadServiceImpl;
import com.ss.android.ugc.aweme.creatortools.creatorplus.service.CreatorToolServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.HybridRegistryProvider;
import com.ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.detail.api.DetailApiProxyImpl;
import com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.detail.operators.ProfileDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.detail.panel.DuetModeCameraServiceImpl;
import com.ss.android.ugc.aweme.di.BulletServiceImpl;
import com.ss.android.ugc.aweme.di.ImEntranceService;
import com.ss.android.ugc.aweme.discover.impl.DiscoveryAsyncInflateImpl;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.download.DownloadAwemeVideoServiceImpl;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl;
import com.ss.android.ugc.aweme.duet.impl.DuetDetailServiceImpl;
import com.ss.android.ugc.aweme.duetmode.impl.DuetDiscoverServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.ECommerceHybridServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.ECommerceThirdPartyHybridServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.ECommerceXBridgeService;
import com.ss.android.ugc.aweme.ecommerce.ab.ECommerceArchServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.DefaultAddressEditDetailStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.common.EcomImageMonitorImpl;
import com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceLiveDegradeExp;
import com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceMonitorService;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHybridBottomSheetDialogFragmentBehaviorImpl;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpPreviewServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.jsb.TransactionEcommerceJSBridgeServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.LowResolutionImageCache;
import com.ss.android.ugc.aweme.ecommerce.core.router.BusinessEComSparkRouterInterceptorsProvider;
import com.ss.android.ugc.aweme.ecommerce.core.router.BusinessEComThirdPartySparkRouterInterceptorsProvider;
import com.ss.android.ugc.aweme.ecommerce.core.router.BusinessEcomSparkMatcherProvider;
import com.ss.android.ugc.aweme.ecommerce.core.router.EComCustomThirdPartyBackRouter;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomSparkSubInterceptorProvider;
import com.ss.android.ugc.aweme.ecommerce.core.router.FallbackDetector;
import com.ss.android.ugc.aweme.ecommerce.core.router.StrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECImageService;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECLayerService;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallService;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallTabIconService;
import com.ss.android.ugc.aweme.ecommerce.global.address.edit.GlobalAddressEditStrategyService;
import com.ss.android.ugc.aweme.ecommerce.global.address.list.GlobalAddressListStrategyService;
import com.ss.android.ugc.aweme.ecommerce.global.logistic.engine.GlobalLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.global.osp.strategy.GlobalOspStrategyService;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.CommonUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.bottombrick.PdpBrickUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.bundledeal.BundleDealUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.buytogether.BuyTogetherUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.header.HeaderImageUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.productinfo.ProductInfoUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.productprop.ProductPropUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.promotion.PromotionUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.review.PdpReviewUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.service.PdpServiceUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.shopprofile.ShopProfileUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.sizeguide.SizeGuideUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module2.sku.SkuUIRegister;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.strategy.GlobalPdpStrategyService;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.strategy.TtfSAPdpStrategyService;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.strategy.TtfUkPdpStrategyService;
import com.ss.android.ugc.aweme.ecommerce.global.sku.strategy.GlobalSkuStrategyService;
import com.ss.android.ugc.aweme.ecommerce.jsb.BaseEcommerceJSBridgeServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.jsb.MallEcommerceJSBridgeServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.mall.operator.MallRacunPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.mall.vm.ShopIconServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaService;
import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.EcommerceStoreBizLogServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.showcase.EcommerceStoreTechLogServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.showcase.settings.RomaSchemaGroupShoppingStoreSettings;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.custom.CustomCheckService;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.custom.DemoOrderCenterChecker;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.monitor.ParamResultHandler;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.monitor.ToastResultHandler;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl;
import com.ss.android.ugc.aweme.ecommerce.ttf.addressedit.sa.TtfSaAddressEditStrategyService;
import com.ss.android.ugc.aweme.ecommerce.ttf.delivery.engine.TtfLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.ttf.delivery.uk.engine.TtfUkLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.engine.TtfOspStrategyService;
import com.ss.android.ugc.aweme.ecommerce.ttf.sku.sa.TtfSaSkuStrategyService;
import com.ss.android.ugc.aweme.ecommerce.ttf.sku.uk.TtfUkSkuStrategyService;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.USAddressEditStrategyService;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.UsAddressListHalfScreenStrategyService;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.UsAddressListStrategyService;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.strategy.UsPdpStrategyService;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.strategy.UsSkuStrategyService;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.EcUgCommonService;
import com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.EcUgDeeplinkService;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.EcUgFeedEcCardService;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.EcUgNewInstallService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgSparkInterceptorsProvider;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.EcUgVSAService;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.engine.USAddressSelectStrategyService;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.engine.USLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.us.osp.strategy.USOspStrategyService;
import com.ss.android.ugc.aweme.ecommerce.us.osp.strategy.USPaymentStrategyService;
import com.ss.android.ugc.aweme.ecommerce.video.ECDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommercelive.business.hybrid.EComHybridLiveLynxBehaviorServiceImpl;
import com.ss.android.ugc.aweme.ecommercelive.business.hybrid.LiveEcommerceJSBridgeServiceImpl;
import com.ss.android.ugc.aweme.ecommercelive.business.sparkinterceptor.AudienceEcomSparkRouterInterceptorsProvider;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ILiveParasiticModuleLaunchServiceECImpl;
import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.aweme.effectcreator.services.InitImpl;
import com.ss.android.ugc.aweme.effectplatform.EffectStorageCleanServiceImpl;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.experiment.DoubleColorBallAnimationViewExperimentServiceImpl;
import com.ss.android.ugc.aweme.experiment.LogInterceptImpl;
import com.ss.android.ugc.aweme.experiment.PagingScrollSettingApiImpl;
import com.ss.android.ugc.aweme.experiment.ViewPagerSlideTransitionServiceImpl;
import com.ss.android.ugc.aweme.experiment.stringhot.StringHotUpdateOfflineSwitchImpl;
import com.ss.android.ugc.aweme.explore.service.ExploreFeedServiceImpl;
import com.ss.android.ugc.aweme.explore.service.ExplorePageOperatorServiceImpl;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionCountAgent;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionStateAgent;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.feed.FeedApiService;
import com.ss.android.ugc.aweme.feed.RecommendFeedDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.feed.api.FeedFragmentClassService;
import com.ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl;
import com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl;
import com.ss.android.ugc.aweme.feed.consumption.impl.ConsumeLoginLoginServiceImpl;
import com.ss.android.ugc.aweme.feed.consumption.impl.RecommendConsumeServiceImpl;
import com.ss.android.ugc.aweme.feed.count.impl.FeedPlayNumServiceImpl;
import com.ss.android.ugc.aweme.feed.favorite.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.helper.FeedSharePlayInfoHelperProvider;
import com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEducatorImpl;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedServiceImpl;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModelGenerator;
import com.ss.android.ugc.aweme.feed.motivatelogin.MotivateLoginPopupManager;
import com.ss.android.ugc.aweme.feed.operator.FollowFeedDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.feed.service.FeedComponentServiceImpl;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.feed.survey.spi.SurveyConfigServiceImpl;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragmentProvider;
import com.ss.android.ugc.aweme.feed.ui.font.FeedUniformFontServiceImpl;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserProgressBarManager;
import com.ss.android.ugc.aweme.feed.utils.MallLogUtilsImpl;
import com.ss.android.ugc.aweme.feed.vm.FollowFeedStorySkylightListServiceImpl;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.ss.android.ugc.aweme.follow.oftenwatch.OftenWatchDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.follow.widget.FollowWidgetServiceImpl;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.framework.service.ILiveParasiticModuleLaunchServiceMonetizationImpl;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.friends.service.SocialFriendsService;
import com.ss.android.ugc.aweme.friends.services.FollowService;
import com.ss.android.ugc.aweme.friendstab.service.FriendsFeedServiceImpl;
import com.ss.android.ugc.aweme.googlemap.AdGoogleMapService;
import com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.homepage.spi.HomePageCommonServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.experiment.EasyNavigationExperimentServiceImpl;
import com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl;
import com.ss.android.ugc.aweme.hybridkit.task.PiaConfigTask;
import com.ss.android.ugc.aweme.hybridkit.web.WebViewInjectServiceImpl;
import com.ss.android.ugc.aweme.hybridkit.web.hooks.WebViewInlineJSInjectServiceImpl;
import com.ss.android.ugc.aweme.i18n.xbridge.worker.BDXBridgeHelper;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.controller.FavoriteVideoChatDetailPageOperatorService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.StoryIMService;
import com.ss.android.ugc.aweme.im.sdk.iescore.IMCoreDependProxyService;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.image.DraweeConfigOutService;
import com.ss.android.ugc.aweme.image.LightenConfigOutService;
import com.ss.android.ugc.aweme.impl.IBootLogImpl;
import com.ss.android.ugc.aweme.impl.JsBridge2ConfigImpl;
import com.ss.android.ugc.aweme.impl.LauncherTaskApiImpl;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import com.ss.android.ugc.aweme.impl.StrategyImpl;
import com.ss.android.ugc.aweme.inbox.InboxEasyNavigationPageNameServiceImpl;
import com.ss.android.ugc.aweme.inbox.service.InboxMobEventServiceImpl;
import com.ss.android.ugc.aweme.inbox.service.InboxServiceImpl;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightListOperatorServiceImpl;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightService;
import com.ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl;
import com.ss.android.ugc.aweme.influencer.ECommerceRNToLynxConfigService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl.EcommerceInfluencerServiceImpl;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.ECommerceLiveSettingsServiceImpl;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.initializer.StorageManagerService;
import com.ss.android.ugc.aweme.innerpush.InnerPushDebugServiceImpl;
import com.ss.android.ugc.aweme.innerpush.InnerPushServiceImpl;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.AVTagServiceImpl;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.internal.ShareServiceImpl;
import com.ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.ss.android.ugc.aweme.journey.feed.notinterested.NotInterestedTutorialService;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import com.ss.android.ugc.aweme.kids.component.music.KidsMusicEntrance;
import com.ss.android.ugc.aweme.kids.discovery.DiscoveryServiceImpl;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsPolicyNoticeServiceImp;
import com.ss.android.ugc.aweme.kids.recommendfeed.RecommendFeedServiceImpl;
import com.ss.android.ugc.aweme.kvstorage.SharedPreferencesProvider;
import com.ss.android.ugc.aweme.lancet.AppLogReaperServiceImpl;
import com.ss.android.ugc.aweme.landpage.AdLandPageServiceImpl;
import com.ss.android.ugc.aweme.landpage.survey.AdLandPageSurveyServiceImpl;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.ss.android.ugc.aweme.launcher.serviceimpl.account.AccountImpl;
import com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl;
import com.ss.android.ugc.aweme.launcher.serviceimpl.godzilla.GodzillaImpl;
import com.ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.legacy.FollowTabBubbleGuideHelperImpl;
import com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.ss.android.ugc.aweme.legacy.select.SocialCardServiceImp;
import com.ss.android.ugc.aweme.legoImp.CrashSdkTaskImpl;
import com.ss.android.ugc.aweme.legoImp.LoginProxyImpl;
import com.ss.android.ugc.aweme.legoImp.NetWorkInjectImpl;
import com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider;
import com.ss.android.ugc.aweme.legoImp.ProviderConfigOutImpl;
import com.ss.android.ugc.aweme.legoImp.SysOptTaskImpl;
import com.ss.android.ugc.aweme.legoImp.TaskManagerConfigImpl;
import com.ss.android.ugc.aweme.legoImp.WatcherImpl;
import com.ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import com.ss.android.ugc.aweme.legoImp.task.TrafficDeteriorationTask;
import com.ss.android.ugc.aweme.legoImp.task.publishtest.PublishDrillServiceImpl;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.TTPSystemAPIInit;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.legoImpl.FrescoLegoTaskImpl;
import com.ss.android.ugc.aweme.legoImpl.task.ExitBackgroundImpl;
import com.ss.android.ugc.aweme.library.impl.LibraryReuseServiceImpl;
import com.ss.android.ugc.aweme.library.operator.LibraryDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.lingo.GeckoService;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.LiveVersionCodeProvider;
import com.ss.android.ugc.aweme.live.SearchCardLiveService;
import com.ss.android.ugc.aweme.live.slot.LiveBusinessParasiticModule;
import com.ss.android.ugc.aweme.livewallpaper.config.WallpaperGuide1Config;
import com.ss.android.ugc.aweme.livewallpaper.config.WallpaperGuide2Config;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.log.AdLynxEventLoger;
import com.ss.android.ugc.aweme.log.AdWebEventLoger;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.ss.android.ugc.aweme.lynx.spark.core.communicate.jsb.SearchEcommerceJSBridgeServiceImpl;
import com.ss.android.ugc.aweme.main.ActivityResourceOptApiImpl;
import com.ss.android.ugc.aweme.main.InterceptHomeBackPressServiceImpl;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.ss.android.ugc.aweme.main.MainPageServiceImpl;
import com.ss.android.ugc.aweme.main.dialogmanager.CleanDialogServiceImpl;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.main.spi.HomePageServiceImpl;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.map.service.PoiMapServiceImpl;
import com.ss.android.ugc.aweme.mention.service.CommentMentionServiceImpl;
import com.ss.android.ugc.aweme.mention.service.MentionDataServiceImpl;
import com.ss.android.ugc.aweme.mention.service.MentionViewServiceImpl;
import com.ss.android.ugc.aweme.miniapp.impl.MiniAppDependServiceImpl;
import com.ss.android.ugc.aweme.mix.services.DetailMixOperatorServiceImpl;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.ml.common.ClientAiInitServiceImpl;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import com.ss.android.ugc.aweme.ml.feature.MLDataCenterServiceImpl;
import com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl;
import com.ss.android.ugc.aweme.ml.feature.pitaya.PitayaFeatureCenterServiceImpl;
import com.ss.android.ugc.aweme.ml.har.SmartHARServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartCDNRankServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadCommentV2ServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadProfileV2ServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifyServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateServiceImpl;
import com.ss.android.ugc.aweme.ml.ohr.SmartOHRServiceImpl;
import com.ss.android.ugc.aweme.music.app.auth.service.MusicAppAuthServiceImpl;
import com.ss.android.ugc.aweme.music.service.MusicDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.music.service.ProfileMusicTabService;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.net.NetworkApiImpl;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.newfollow.statistics.FollowStatisticsServiceImpl;
import com.ss.android.ugc.aweme.newuser.NewUserImpl;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notification.creator.service.NotificationFragmentServiceImpl;
import com.ss.android.ugc.aweme.notification.service.ActivityAdapterServiceImp;
import com.ss.android.ugc.aweme.notification.service.NoticeCountServiceImpl;
import com.ss.android.ugc.aweme.notification.service.NoticeCountTabBadgePresentServiceImpl;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.notification.service.OldNoticeCountServiceImpl;
import com.ss.android.ugc.aweme.notification.service.RedPointServiceImpl;
import com.ss.android.ugc.aweme.nows.external.CreativeNowServiceImpl;
import com.ss.android.ugc.aweme.nows.feed.caption.NowCaptionService;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostDeleteServiceImpl;
import com.ss.android.ugc.aweme.nows.service.NowCommonFeedServiceImpl;
import com.ss.android.ugc.aweme.nows.service.NowDailyPushService;
import com.ss.android.ugc.aweme.nows.service.NowDistributionService;
import com.ss.android.ugc.aweme.nows.service.NowFeedPreLoadServiceImpl;
import com.ss.android.ugc.aweme.nows.service.NowLimitService;
import com.ss.android.ugc.aweme.nows.service.NowUserPublishService;
import com.ss.android.ugc.aweme.nows.service.NowWidgetService;
import com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl;
import com.ss.android.ugc.aweme.nows.service.ProfileNowsServiceImpl;
import com.ss.android.ugc.aweme.offlinemode.service.OfflineModeServiceImpl;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeSharedVMServiceImpl;
import com.ss.android.ugc.aweme.opt.BackendApiCallerOptService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.paid.content.PaidContentAnchorAttachServiceImpl;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorService;
import com.ss.android.ugc.aweme.paidcontent.detail.PaidCollectionDetailOperatorServiceImpl;
import com.ss.android.ugc.aweme.paidcontent.detail.PaidCollectionDetailSharedVMServiceImpl;
import com.ss.android.ugc.aweme.paidcontent.manageseries.notification.SeriesNotificationServiceImpl;
import com.ss.android.ugc.aweme.paidcontent.manageseries.notification.SeriesVideoUploadServiceImpl;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.service.PaidContentCreationServiceImpl;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.pipfeed.PipDebugServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.pipo.PipoService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeGateServiceImpl;
import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperManager;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager2;
import com.ss.android.ugc.aweme.poi.map.service.GoogleMapServiceImpl;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.PoiDetailDiscoveryVideoListOperatorService;
import com.ss.android.ugc.aweme.poi_api.service.PoiVideoListDefaultOperatorService;
import com.ss.android.ugc.aweme.popularfeed.service.PopularFeedServiceImpl;
import com.ss.android.ugc.aweme.portrait.impl.PortraitCenterInitServiceImpl;
import com.ss.android.ugc.aweme.portrait.impl.imclient.IMClientPortraitProducerService;
import com.ss.android.ugc.aweme.power.powersave.PowerModeHandlerProxy;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCServiceImpl;
import com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncServiceImpl;
import com.ss.android.ugc.aweme.profile.effect.EffectDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.profile.mutual.ProfileShowMutualTabServiceImpl;
import com.ss.android.ugc.aweme.profile.popup.AvatarAndNicknamePopupController;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.MafRedPointDismissHelper;
import com.ss.android.ugc.aweme.prop.impl.EffectHintSelectDialogServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.property.EditorProIconServiceImpl;
import com.ss.android.ugc.aweme.property.VEABServiceImpl;
import com.ss.android.ugc.aweme.publish.service.FixedCaptionsExperimentServiceImpl;
import com.ss.android.ugc.aweme.publish.service.PublishConfigExternalService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.qrcode.QRCodeServiceImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.qrcode.view.BridgeScanHandlerImpl;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivityStarter;
import com.ss.android.ugc.aweme.question.QuestionDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.question.impl.QuestionDetailServiceImpl;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentServiceImpl;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.record.ExteriorRecordPageFactoryImpl;
import com.ss.android.ugc.aweme.relation.auth.spi.AuthServiceImpl;
import com.ss.android.ugc.aweme.relation.avatar.FollowAvatarServiceImpl;
import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoDetailServiceImpl;
import com.ss.android.ugc.aweme.relation.label.AvatarUnionServiceImpl;
import com.ss.android.ugc.aweme.relation.label.MutualLabelTextFactory;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextViewServiceImpl;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationServiceImpl;
import com.ss.android.ugc.aweme.relation.recuser.RecUserServiceImpl;
import com.ss.android.ugc.aweme.relation.service.InviteFriendsService;
import com.ss.android.ugc.aweme.relation.storage.RelationStorageServiceImpl;
import com.ss.android.ugc.aweme.relation.usercard.spi.RelationUserCardDetailServiceImpl;
import com.ss.android.ugc.aweme.relation.usercard.spi.RelationUserCardInternalService;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.runnablemonitor.background.BackgroundRunnableMonitorApiImpl;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateServiceImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentServiceImpl;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.common.communicate.SearchUserService;
import com.ss.android.ugc.aweme.search.common.utils.CommercializeSearchMainServiceImpl;
import com.ss.android.ugc.aweme.search.core.communicate.SearchDynamicServiceImpl;
import com.ss.android.ugc.aweme.search.detail.core.viewmodel.SearchDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.search.detail.core.viewmodel.SearchOfficialVideoDetailSharedVMService;
import com.ss.android.ugc.aweme.search.detail.core.viewmodel.SearchVideoDetailSharedVMService;
import com.ss.android.ugc.aweme.search.detail.edm.SearchEDMVideoDetailSharedVMService;
import com.ss.android.ugc.aweme.search.ecommerce.ECommerceGeneralSearchWidgetServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.ecommerce.detail.core.viewmodel.EComSearchDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.SearchBDXBridgeServiceImpl;
import com.ss.android.ugc.aweme.search.widget.core.communicate.SearchWidgetServiceImpl;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.service.AnalyticsDetailService;
import com.ss.android.ugc.aweme.service.AttributionService;
import com.ss.android.ugc.aweme.service.ByteLingoServiceImpl;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import com.ss.android.ugc.aweme.service.CaptionSheetServiceImpl;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.service.DanmakuServiceImpl;
import com.ss.android.ugc.aweme.service.EncourageLoginPopupManager;
import com.ss.android.ugc.aweme.service.FriendsTabDbService;
import com.ss.android.ugc.aweme.service.LingoCaptionServiceImpl;
import com.ss.android.ugc.aweme.service.MentionVideoService;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.aweme.service.PaidContentAwareBannerServiceImpl;
import com.ss.android.ugc.aweme.service.PaidContentBannerServiceImpl;
import com.ss.android.ugc.aweme.service.PaidContentCollectionPlayProgressServiceImpl;
import com.ss.android.ugc.aweme.service.PaidContentPaymentServiceImpl;
import com.ss.android.ugc.aweme.service.PaidContentPreviewTagServiceImpl;
import com.ss.android.ugc.aweme.service.PaidContentSdpTrailerService;
import com.ss.android.ugc.aweme.service.PaidContentServiceImpl;
import com.ss.android.ugc.aweme.service.PaidSeriesReportServiceImpl;
import com.ss.android.ugc.aweme.service.PhotoDownloadServiceImpl;
import com.ss.android.ugc.aweme.service.PhotoViewModelImpl;
import com.ss.android.ugc.aweme.service.PostModeServiceImpl;
import com.ss.android.ugc.aweme.service.SeriesPricingServiceImpl;
import com.ss.android.ugc.aweme.service.SocInteractionAvatarServiceImpl;
import com.ss.android.ugc.aweme.service.SocPubDistributeServiceImpl;
import com.ss.android.ugc.aweme.service.SocPubStatusRepoServiceImpl;
import com.ss.android.ugc.aweme.service.Social2TabRouteService;
import com.ss.android.ugc.aweme.service.Social2TabServiceImpl;
import com.ss.android.ugc.aweme.service.TextModeServiceImpl;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackService;
import com.ss.android.ugc.aweme.service.increaseloginnotify.IncreaseLoginNotifyService;
import com.ss.android.ugc.aweme.service.newusermode.NewUserModeService;
import com.ss.android.ugc.aweme.service.nickname.NicknameSignupExperiment;
import com.ss.android.ugc.aweme.service.perfetservice.ICLAPerfETServiceImpl;
import com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService;
import com.ss.android.ugc.aweme.service.protection.TooltipApplicabilityService;
import com.ss.android.ugc.aweme.service.unlogindigg.UnLoginDiggService;
import com.ss.android.ugc.aweme.services.AccountHelperService;
import com.ss.android.ugc.aweme.services.ApiNetworkServiceForAccount;
import com.ss.android.ugc.aweme.services.ArticleModeServiceImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceImpl;
import com.ss.android.ugc.aweme.services.BusinessGoodsServiceImpl;
import com.ss.android.ugc.aweme.services.BusinessMainServiceImpl;
import com.ss.android.ugc.aweme.services.BusinessModuleServiceImpl;
import com.ss.android.ugc.aweme.services.ClearCacheService;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;
import com.ss.android.ugc.aweme.services.CommerceXBridgetServiceImpl;
import com.ss.android.ugc.aweme.services.ExitBackgroundActivityImpl;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.services.IRessoAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.LinkTypeTagsPriorityManagerImpl;
import com.ss.android.ugc.aweme.services.MainServiceForJsb;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.MainXBridgeServiceImpl;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.services.NetworkContextService;
import com.ss.android.ugc.aweme.services.NetworkLevelService;
import com.ss.android.ugc.aweme.services.NetworkQualityServiceImpl;
import com.ss.android.ugc.aweme.services.NetworkStandardApiImpl;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.services.PerformanceMainServiceImpl;
import com.ss.android.ugc.aweme.services.PowerContextImpl;
import com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.services.SaveInfoDialogService;
import com.ss.android.ugc.aweme.services.SmartLockService;
import com.ss.android.ugc.aweme.services.ToolsBusinessServiceImpl;
import com.ss.android.ugc.aweme.services.ToolsCPUDataServiceImpl;
import com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl;
import com.ss.android.ugc.aweme.services.UserInfoUpdateAdapterService;
import com.ss.android.ugc.aweme.services.WebViewTweakerService;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.function.FunctionSupportServiceImpl;
import com.ss.android.ugc.aweme.services.video.OneMinuteH5PreloadServiceImpl;
import com.ss.android.ugc.aweme.servicimpl.AutoCutServiceImpl;
import com.ss.android.ugc.aweme.servicimpl.AvSearchUserServiceImpl;
import com.ss.android.ugc.aweme.servicimpl.CreativePageService;
import com.ss.android.ugc.aweme.servicimpl.EditRootSceneFactoryDelegate;
import com.ss.android.ugc.aweme.servicimpl.EmojiServiceImplDiff;
import com.ss.android.ugc.aweme.servicimpl.PageFactoryDelegate;
import com.ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.ss.android.ugc.aweme.servicimpl.TTEPPageFactoryDelegate;
import com.ss.android.ugc.aweme.setting.GetPushSettingCallback;
import com.ss.android.ugc.aweme.setting.PromoteEntryCheckServiceImpl;
import com.ss.android.ugc.aweme.setting.UpdateSettingServiceImpl;
import com.ss.android.ugc.aweme.setting.page.datasave.SpeedModeSettingImpl;
import com.ss.android.ugc.aweme.setting.serverpush.service.PushSettingServiceImpl;
import com.ss.android.ugc.aweme.setting.services.AppUpdateService;
import com.ss.android.ugc.aweme.setting.services.CustomActivityOnCrashServiceImpl;
import com.ss.android.ugc.aweme.setting.services.I18nService;
import com.ss.android.ugc.aweme.setting.services.SettingDependServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.setting.services.StorageServiceImpl;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.settingsrequest.AbTestManagerApiImpl;
import com.ss.android.ugc.aweme.settingsrequest.ConfigCenterCenterBridgeImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingsLegacyImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestApiImpl;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.share.OpenPlatformServiceImpl;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl;
import com.ss.android.ugc.aweme.share.ShareH5ServiceImpl;
import com.ss.android.ugc.aweme.share.ShareRespSendServiceImpl;
import com.ss.android.ugc.aweme.share.gif.GifShareService;
import com.ss.android.ugc.aweme.share.qrcode.config.InviteCardBackgroundConfig;
import com.ss.android.ugc.aweme.share.qrcode.config.QRCodeBottomLeftConfig;
import com.ss.android.ugc.aweme.share.qrcode.config.QRCodeBottomRightConfig;
import com.ss.android.ugc.aweme.share.qrcode.config.QRCodeConfig;
import com.ss.android.ugc.aweme.share.qrcode.config.QRCodeTopLeftConfig;
import com.ss.android.ugc.aweme.share.qrcode.config.QRCodeTopRightConfig;
import com.ss.android.ugc.aweme.share.qrcode.config.TTLogoBlackConfig;
import com.ss.android.ugc.aweme.share.viewmodel.FeedStateVMServiceImpl;
import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.AllowVideoThresholdUtils;
import com.ss.android.ugc.aweme.shortvideo.BusinessPublishImpl;
import com.ss.android.ugc.aweme.shortvideo.DuetDownloadService;
import com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory;
import com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl;
import com.ss.android.ugc.aweme.shortvideo.UploadByFileService;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.ss.android.ugc.aweme.shortvideo.experiment.PublishPageImpl;
import com.ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.ss.android.ugc.aweme.shortvideo.jsb.CreativeToolXBridgeService;
import com.ss.android.ugc.aweme.shortvideo.library.service.LibraryCameraServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AlbumServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.question.QuestionFavoriteServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.util.StitchDownloadServiceImpl;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.stemfeed.service.StemFeedServiceImpl;
import com.ss.android.ugc.aweme.sticker.AddYoursModelCheckService;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerFactoryService;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerRecordServiceImpl;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.ss.android.ugc.aweme.storage.MusicStorageCleanServiceImpl;
import com.ss.android.ugc.aweme.story.feed.detail.StoryDefaultOperatorServiceImpl;
import com.ss.android.ugc.aweme.story.feed.detail.StoryOperatorServiceImpl;
import com.ss.android.ugc.aweme.story.feed.guidecard.service.StoryGuideCardDetailVMImpl;
import com.ss.android.ugc.aweme.story.guide.StoryWidgetGuideLottieConfig;
import com.ss.android.ugc.aweme.story.publish.SocialPublishBridgeServiceImpl;
import com.ss.android.ugc.aweme.story.service.StoryDistributionService;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.ss.android.ugc.aweme.sync.ByteSyncApiImpl;
import com.ss.android.ugc.aweme.sync.ByteSyncInitProviderImpl;
import com.ss.android.ugc.aweme.tablet.TabletServiceProxy;
import com.ss.android.ugc.aweme.tag.service.TagServiceImpl;
import com.ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl;
import com.ss.android.ugc.aweme.tools.music.MusicServiceImpl;
import com.ss.android.ugc.aweme.topic.TopicAnchorFactory;
import com.ss.android.ugc.aweme.topic.TopicCommonService;
import com.ss.android.ugc.aweme.topic.book.BookTokServiceImpl;
import com.ss.android.ugc.aweme.topic.book.detail.videos.BookDetailSharedVMServiceImpl;
import com.ss.android.ugc.aweme.topic.movie.MovieTokServiceImpl;
import com.ss.android.ugc.aweme.topic.movie.detail.videos.MovieDetailSharedVMServiceImpl;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicServiceImpl;
import com.ss.android.ugc.aweme.topicfeed.service.TopicFeedServiceImpl;
import com.ss.android.ugc.aweme.trace.AwemeTraceLogAdapter;
import com.ss.android.ugc.aweme.trace.PageTraceApiImpl;
import com.ss.android.ugc.aweme.trace.TraceConfigApiImpl;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import com.ss.android.ugc.aweme.trace.UnsampledTraceLoggerImpl;
import com.ss.android.ugc.aweme.traffic.TrafficMonitorService;
import com.ss.android.ugc.aweme.translation.service.TranslationKevaServiceImpl;
import com.ss.android.ugc.aweme.translation.service.TranslationLangKevaServiceImpl;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.ss.android.ugc.aweme.trending.service.TrendingExperimentServiceImpl;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.ug.brand.BrandServiceImpl;
import com.ss.android.ugc.aweme.ug.praise.PraiseGuideConfig;
import com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostedOperatorServiceImpl;
import com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.ss.android.ugc.aweme.utils.EnterProfileServiceImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import com.ss.android.ugc.aweme.utils.LanguageService;
import com.ss.android.ugc.aweme.utils.NotificationClickHelperImpl;
import com.ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.ss.android.ugc.aweme.utils.WSHelperImpl;
import com.ss.android.ugc.aweme.utils.gecko.GeckoGlobalInitServiceImpl;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLocalServiceImpl;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLowStorageConfigImpl;
import com.ss.android.ugc.aweme.video.SubOnlyVideoOperatorServiceImpl;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryDefaultOperatorServiceImpl;
import com.ss.android.ugc.aweme.watch.history.di.WatchHistoryValueService;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import com.ss.android.ugc.aweme.wavepublish.dm.service.DMPublishServiceImpl;
import com.ss.android.ugc.aweme.web.CrossPlatformJsbProxy;
import com.ss.android.ugc.aweme.web.GeckoXClientManager;
import com.ss.android.ugc.aweme.web.business.preload.AdWebViewInterceptorService;
import com.ss.android.ugc.aweme.web.business.special.AdWebSpecialService;
import com.ss.android.ugc.aweme.web.creation.WebCreationPromoteServiceImpl;
import com.ss.android.ugc.aweme.web.intercept.forest.AdWebViewForestServiceImpl;
import com.ss.android.ugc.aweme.web.permission.AdWebPermissionService;
import com.ss.android.ugc.aweme.web.realtimeres.AdLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.web.ui.AdWebBarEventLogger;
import com.ss.android.ugc.aweme.web.utils.AdWebUtils;
import com.ss.android.ugc.aweme.websocket.bridge.WsManager;
import com.ss.android.ugc.aweme.websocket.bridge.WsMonitor;
import com.ss.android.ugc.aweme.zerorating.ZeroRatingMainServiceImpl;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import com.ss.android.ugc.bytebench.EditorStickerDowngradeServiceImpl;
import com.ss.android.ugc.feed.platform.cardinsert.service.FeedCardInsertService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.ss.android.ugc.feed.platform.service.FindTargetScopeFailFasterServiceImpl;
import com.ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.EditMusicServiceImpl;
import com.ss.android.ugc.gamora.editor.audioservice.service.audioglitch.AudioGlitchService;
import com.ss.android.ugc.gamora.editor.audioservice.service.debugtool.SamiDebugToolServiceImpl;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.DefaultStoryForwardServiceImpl;
import com.ss.android.ugc.gamora.editor.music.stream.MusicStreamServiceImpl;
import com.ss.android.ugc.gamora.editor.sticker.donation.DonationUtils;
import com.ss.android.ugc.gamora.editor.sticker.nature.NatureGuideFragmentServiceImpl;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import com.ss.android.ugc.gamora.editorpro.crop.VideoCropService;
import com.ss.android.ugc.gamora.recorder.vopclone.VopCameraClientService;
import com.ss.android.ugc.gamora.recorder.vopclone.VopPermissionService;
import com.ss.android.ugc.localnotify.CommonLocalNotifyService;
import com.ss.android.ugc.localnotify.NonLoginNotifyService;
import com.ss.android.ugc.musicprovider.MusicProviderConfigProxy;
import com.ss.android.ugc.now.interaction.service.InteractionService;
import com.ss.android.ugc.sdk.ShareSdkServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursDetailPageOperatorServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.InviteFriendsServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.PerformanceServiceImpl;
import com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.LocationPluginServiceImpl;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import com.ss.android.ugc.trill.openauthorize.AuthorizeCommonService;
import com.ss.android.ugc.trill.setting.ICLALanguageServiceImpl;
import dmt.av.services.VEEncodingImpl;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class StaticServiceImplManager {
    public Map<String, Object> serviceImplCache = new ConcurrentHashMap();
    public final Set<String> serviceImplNotExistSet = Q4K.LIZLLL();
    public final Map<String, Integer> optServiceImplNonExistSet = new ConcurrentHashMap(50);
    public Map<String, Set<Object>> serviceImplSetCache = new ConcurrentHashMap();
    public final Set<String> serviceImplSetNotExistSet = Q4K.LIZLLL();
    public final Map<String, Integer> optServiceImplSetNotExistSet = new ConcurrentHashMap(50);

    /* loaded from: classes11.dex */
    public static class SingleInstanceHolder {
        public static final StaticServiceImplManager INSTANCE = new StaticServiceImplManager();
    }

    private Set getStaticServiceImplSetRealStub0(Class cls) {
        HashSet hashSet;
        String str;
        switch (cls.getName().hashCode()) {
            case -2123886532:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ISeriesVideoUploadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SeriesVideoUploadServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ISeriesVideoUploadService";
                break;
            case -2118722668:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IFeedAdService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedAdServiceImpl());
                str = "com.ss.android.ugc.aweme.ad.feed.IFeedAdService";
                break;
            case -2116177744:
                if (!cls.getName().equals("com.bytedance.ies.powerpermissions.IGetInterceptor")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PowerPermissionsTask());
                str = "com.bytedance.ies.powerpermissions.IGetInterceptor";
                break;
            case -2106127476:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.IAwemeContextService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AwemeContextServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.IAwemeContextService";
                break;
            case -2100114539:
                if (!cls.getName().equals("com.bytedance.pumbaa.bpea.adapter.api.IBPEAService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BPEAServiceImp());
                str = "com.bytedance.pumbaa.bpea.adapter.api.IBPEAService";
                break;
            case -2079081456:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageFragment")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MainPageFragmentImpl());
                str = "com.ss.android.ugc.aweme.main.IMainPageFragment";
                break;
            case -2071810625:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LauncherExperimentsImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi";
                break;
            case -2045670388:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PrivateAccountTipsViewDelegate());
                str = "com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView";
                break;
            case -2038108429:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ReplaceMusicDownloadService());
                str = "com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService";
                break;
            case -2033629456:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.utils.MallLogUtilsApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MallLogUtilsImpl());
                str = "com.ss.android.ugc.aweme.feed.utils.MallLogUtilsApi";
                break;
            case -2032290623:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.external.IGetPostVideoThresholdService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AllowVideoThresholdUtils());
                str = "com.ss.android.ugc.aweme.services.external.IGetPostVideoThresholdService";
                break;
            case -2011045625:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.log.IAdWebLogService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdWebLogService());
                str = "com.ss.android.ugc.aweme.log.IAdWebLogService";
                break;
            case -2007242596:
                if (!cls.getName().equals("com.bytedance.bdlocation.init.IBDLocationAgent")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BDLocationAgentImpl());
                str = "com.bytedance.bdlocation.init.IBDLocationAgent";
                break;
            case -1998285850:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.services.IWebViewService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WebviewService());
                str = "com.ss.android.ugc.aweme.app.services.IWebViewService";
                break;
            case -1994319489:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IMainService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MainServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IMainService";
                break;
            case -1986664400:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.bl.EditorStickerDowngradeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EditorStickerDowngradeServiceImpl());
                str = "com.ss.android.ugc.aweme.bl.EditorStickerDowngradeService";
                break;
            case -1947571277:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceService());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IECommerceService";
                break;
            case -1946334763:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ICloudTokenLoginService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CloudTokenLoginService());
                str = "com.ss.android.ugc.aweme.ICloudTokenLoginService";
                break;
            case -1946164846:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new KidsSettingsServiceImpl());
                str = "com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService";
                break;
            case -1916678834:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.internal.ICrossLanguageUserService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CrossLanguageUserExperiment());
                str = "com.ss.android.ugc.aweme.internal.ICrossLanguageUserService";
                break;
            case -1903173849:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPhotoDownloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PhotoDownloadServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPhotoDownloadService";
                break;
            case -1890851076:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessGoodsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BusinessGoodsServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IBusinessGoodsService";
                break;
            case -1884848380:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.structure.api.ICommerceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceServiceImpl());
                str = "com.ss.android.ugc.aweme.structure.api.ICommerceService";
                break;
            case -1870140666:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ScreenShotFeedbackService());
                str = "com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService";
                break;
            case -1863869896:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageExperimentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MainPageExperimentServiceImpl());
                str = "com.ss.android.ugc.aweme.main.IMainPageExperimentService";
                break;
            case -1854880805:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IProfileNowsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProfileNowsServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IProfileNowsService";
                break;
            case -1846980334:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.web.service.IAdWebUtils")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdWebUtils());
                str = "com.ss.android.ugc.aweme.web.service.IAdWebUtils";
                break;
            case -1844327934:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VoiceDetectorService());
                str = "com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService";
                break;
            case -1827092331:
                if (!cls.getName().equals("com.ss.android.ugc.gamora.PageFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PageFactoryDelegate());
                str = "com.ss.android.ugc.gamora.PageFactory";
                break;
            case -1821113378:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EffectStorageCleanServiceImpl());
                str = "com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService";
                break;
            case -1819544622:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FollowAvatarServiceImpl());
                str = "com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService";
                break;
            case -1806946999:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INowsTabService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowsTabServiceImpl());
                str = "com.ss.android.ugc.aweme.service.INowsTabService";
                break;
            case -1806639590:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.service.IFeedComponentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedComponentServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.service.IFeedComponentService";
                break;
            case -1788072522:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ContentLanguageGuideServiceImpl());
                str = "com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService";
                break;
            case -1777254862:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceToolsMusicService());
                str = "com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService";
                break;
            case -1775773808:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SettingRequestExtraInfoImpl());
                str = "com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo";
                break;
            case -1767215914:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RealTimeSplashManagerImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager";
                break;
            case -1764938002:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.search.IPnSSearchHistoryService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PnSSearchHistoryServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.search.IPnSSearchHistoryService";
                break;
            case -1764545303:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LowResolutionImageCache());
                str = "com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache";
                break;
            case -1753842266:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.SmartCDNRankService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartCDNRankServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.SmartCDNRankService";
                break;
            case -1733011232:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ChildModeServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService";
                break;
            case -1718043654:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ComplianceDependServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService";
                break;
            case -1717634817:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ActivityResourceOptApiImpl());
                str = "com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi";
                break;
            case -1707046452:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.topic.ITopicAnchorFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TopicAnchorFactory());
                str = "com.ss.android.ugc.aweme.topic.ITopicAnchorFactory";
                break;
            case -1676993402:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.bnpl.IBNPLService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BNPLServiceImpl());
                str = "com.ss.android.ugc.aweme.bnpl.IBNPLService";
                break;
            case -1667865087:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLCommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MLCommonServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.IMLCommonService";
                break;
            case -1663898489:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INowDistributionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowDistributionService());
                str = "com.ss.android.ugc.aweme.service.INowDistributionService";
                break;
            case -1655087342:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.social.service.IMotivateLoginService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MotivateLoginPopupManager());
                str = "com.ss.android.ugc.aweme.social.service.IMotivateLoginService";
                break;
            case -1643932385:
                if (!cls.getName().equals("com.ss.android.common.util.INetWorkInject")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetWorkInjectImpl());
                str = "com.ss.android.common.util.INetWorkInject";
                break;
            case -1614697299:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IAccountService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountService());
                str = "com.ss.android.ugc.aweme.IAccountService";
                break;
            case -1604273216:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new OldNoticeCountServiceImpl());
                str = "com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService";
                break;
            case -1599970632:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BusinessEComThirdPartySparkRouterInterceptorsProvider());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService";
                break;
            case -1595794447:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WebAdUserAgentServiceImpl());
                str = "com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService";
                break;
            case -1595397874:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IQnaService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new QnaService());
                str = "com.ss.android.ugc.aweme.services.IQnaService";
                break;
            case -1584973634:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.sticker.AddYoursStickerViewFactoryApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AddYoursStickerFactoryService());
                str = "com.ss.android.ugc.aweme.sticker.AddYoursStickerViewFactoryApi";
                break;
            case -1584781073:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.trace.ITraceConfigApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TraceConfigApiImpl());
                str = "com.ss.android.ugc.aweme.trace.ITraceConfigApi";
                break;
            case -1583683359:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FashionMallService());
                str = "com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService";
                break;
            case -1581112369:
                if (!cls.getName().equals("com.benchmark.collection_api.BXCollectionAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BXCollectionImpl());
                str = "com.benchmark.collection_api.BXCollectionAPI";
                break;
            case -1572029873:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IAudioGlitchService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AudioGlitchService());
                str = "com.ss.android.ugc.aweme.services.audio.IAudioGlitchService";
                break;
            case -1569176709:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartHARService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartHARServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.ISmartHARService";
                break;
            case -1544248582:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceLiveBridgeMethodServiceImpl());
                str = "com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService";
                break;
            case -1529915756:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedStateVMServiceImpl());
                str = "com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService";
                break;
            case -1524347501:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.inbox.service.IInboxService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InboxServiceImpl());
                str = "com.ss.android.ugc.aweme.inbox.service.IInboxService";
                break;
            case -1517460377:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.awemeservice.api.IAwemeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AwemeService());
                str = "com.ss.android.ugc.aweme.awemeservice.api.IAwemeService";
                break;
            case -1515311152:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UniversalPopupManager());
                str = "com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService";
                break;
            case -1512127072:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.share.ShareExtService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShareExtServiceImpl());
                str = "com.ss.android.ugc.aweme.share.ShareExtService";
                break;
            case -1507783276:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.intelligence.IIntelligenceModule")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IntelligenceModuleImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.intelligence.IIntelligenceModule";
                break;
            case -1498800717:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.IAbTestManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AbTestManagerImpl());
                str = "com.ss.android.ugc.aweme.setting.IAbTestManager";
                break;
            case -1487274965:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.spark.IAdSparkUtils")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdSparkUtils());
                str = "com.ss.android.ugc.aweme.spark.IAdSparkUtils";
                break;
            case -1487196739:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ISaveInfoDialogService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SaveInfoDialogService());
                str = "com.ss.android.ugc.aweme.ISaveInfoDialogService";
                break;
            case -1441338863:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.RedPointService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RedPointServiceImpl());
                str = "com.ss.android.ugc.aweme.notice.api.count.RedPointService";
                break;
            case -1441224304:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.plugin.IPluginService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PluginService());
                str = "com.ss.android.ugc.aweme.plugin.IPluginService";
                break;
            case -1437674684:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RequestIdService());
                str = "com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService";
                break;
            case -1432243237:
                if (!cls.getName().equals("com.bytedance.lighten.core.config.ILightenConfigOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LightenConfigOutService());
                str = "com.bytedance.lighten.core.config.ILightenConfigOutService";
                break;
            case -1430504740:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.network.spi.INetworkLevelService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkLevelService());
                str = "com.ss.android.ugc.aweme.network.spi.INetworkLevelService";
                break;
            case -1430439832:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.widget.ISearchWidgetService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchWidgetServiceImpl());
                str = "com.ss.android.ugc.aweme.search.widget.ISearchWidgetService";
                break;
            case -1419081718:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.RecommendUserService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RecommendUserServiceImpl());
                str = "com.ss.android.ugc.aweme.recommend.users.RecommendUserService";
                break;
            case -1403714223:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEventCenter")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EventCenter());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEventCenter";
                break;
            case -1398889005:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.newusermode.INewUserModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NewUserModeService());
                str = "com.ss.android.ugc.aweme.service.newusermode.INewUserModeService";
                break;
            case -1396670568:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.service.II18nService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new I18nService());
                str = "com.ss.android.ugc.aweme.main.service.II18nService";
                break;
            case -1394007011:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.INoticeCountService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NoticeCountServiceImpl());
                str = "com.ss.android.ugc.aweme.notice.api.services.INoticeCountService";
                break;
            case -1379566319:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartMLSceneServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService";
                break;
            case -1365640136:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VEEncodingImpl());
                str = "com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting";
                break;
            case -1364971920:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.VideoOCLSRAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoOCLSR());
                str = "com.bytedance.bmf_mods_api.VideoOCLSRAPI";
                break;
            case -1323957599:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ILandscapeFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LandscapeFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.ILandscapeFeedService";
                break;
            case -1323865212:
                if (!cls.getName().equals("dmt.viewpager.servie.ViewPagerSlideTransitionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ViewPagerSlideTransitionServiceImpl());
                str = "dmt.viewpager.servie.ViewPagerSlideTransitionService";
                break;
            case -1288697681:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.autofill.IAdAutofillService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdAutofillService());
                str = "com.ss.android.ugc.aweme.autofill.IAdAutofillService";
                break;
            case -1268753058:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShopIconServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService";
                break;
            case -1263811427:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartFeedLoadMoreServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService";
                break;
            case -1259244187:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.mix.api.IDetailMixOperatorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DetailMixOperatorServiceImpl());
                str = "com.ss.android.ugc.aweme.mix.api.IDetailMixOperatorService";
                break;
            case -1251125540:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommonFeedLaunchServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService";
                break;
            case -1233134364:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TransactionEcommerceJSBridgeServiceImpl());
                hashSet.add(new BaseEcommerceJSBridgeServiceImpl());
                hashSet.add(new MallEcommerceJSBridgeServiceImpl());
                hashSet.add(new LiveEcommerceJSBridgeServiceImpl());
                hashSet.add(new SearchEcommerceJSBridgeServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService";
                break;
            case -1225060392:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IActivityRouterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ActivityRouterServiceImpl());
                str = "com.ss.android.ugc.aweme.IActivityRouterService";
                break;
            case -1217333837:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DmNoticeProxyImpl());
                str = "com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy";
                break;
            case -1197385060:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AnchorStateServiceImpl());
                str = "com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService";
                break;
            case -1190495862:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceChallengeServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService";
                break;
            case -1189818203:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.ISearchDynamicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchDynamicServiceImpl());
                str = "com.ss.android.ugc.aweme.search.ISearchDynamicService";
                break;
            case -1184747351:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IDubbingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DubbingServiceImpl());
                str = "com.ss.android.ugc.aweme.IDubbingService";
                break;
            case -1183360939:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ExitBackgroundImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi";
                break;
            case -1177990237:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcUgCommonService());
                str = "com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService";
                break;
            case -1175770854:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.dsp.service.IMusicDspService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MusicDspServiceImpl());
                str = "com.ss.android.ugc.aweme.dsp.service.IMusicDspService";
                break;
            case -1167883326:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.publish.FixedCaptionsExperimentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FixedCaptionsExperimentServiceImpl());
                str = "com.ss.android.ugc.aweme.services.publish.FixedCaptionsExperimentService";
                break;
            case -1164741669:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IAccountFeatureFlagService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountFeatureFlagService());
                str = "com.ss.android.ugc.aweme.IAccountFeatureFlagService";
                break;
            case -1163456409:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AddYoursStickerRecordServiceImpl());
                str = "com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService";
                break;
            case -1139302695:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.service.ICommerceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceService());
                str = "com.ss.android.ugc.aweme.commerce.service.ICommerceService";
                break;
            case -1135336108:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.log.IAdWebEventLogger")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdACTEventLoger());
                hashSet.add(new AdWebEventLoger());
                hashSet.add(new AdWebBarEventLogger());
                str = "com.ss.android.ugc.aweme.log.IAdWebEventLogger";
                break;
            case -1131414213:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.webview.IWebViewInjectService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WebViewInjectServiceImpl());
                str = "com.ss.android.ugc.aweme.webview.IWebViewInjectService";
                break;
            case -1127430638:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ISocPubDistributeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SocPubDistributeServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ISocPubDistributeService";
                break;
            case -1114069551:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IncreaseLoginNotifyService());
                str = "com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService";
                break;
            case -1069780352:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.trace.IPageTraceApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PageTraceApiImpl());
                str = "com.ss.android.ugc.aweme.trace.IPageTraceApi";
                break;
            case -1034497889:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdRouterHandlerDependImpl());
                str = "com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend";
                break;
            case -1033871119:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.profile.util.IUserProfilePreload")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UserProfilePreloadHelper());
                str = "com.ss.android.ugc.aweme.profile.util.IUserProfilePreload";
                break;
            case -1032744075:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.explore.service.IExploreFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ExploreFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.explore.service.IExploreFeedService";
                break;
            case -1020519893:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PdpPreviewServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService";
                break;
            case -1015551078:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IFollowFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FollowFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IFollowFeedService";
                break;
            case -1005527120:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GatekeeperManager());
                str = "com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService";
                break;
            case -998163196:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IDuetModeCameraService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DuetModeCameraServiceImpl());
                str = "com.ss.android.ugc.aweme.port.in.IDuetModeCameraService";
                break;
            case -981221515:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GoogleMapServiceImpl());
                str = "com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService";
                break;
            case -979389081:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.share.ShareSdkService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShareSdkServiceImpl());
                str = "com.ss.android.ugc.aweme.share.ShareSdkService";
                break;
            case -977842286:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.internal.IShareService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShareServiceImpl());
                str = "com.ss.android.ugc.aweme.internal.IShareService";
                break;
            case -955482181:
                if (!cls.getName().equals("com.ss.android.legoapi.ISysOptTaskApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SysOptTaskImpl());
                str = "com.ss.android.legoapi.ISysOptTaskApi";
                break;
            case -935773963:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommonFeedApiService());
                str = "com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService";
                break;
            case -927795034:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IStorageManagerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StorageManagerService());
                str = "com.ss.android.ugc.aweme.services.IStorageManagerService";
                break;
            case -920387194:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.bullet.api.IBulletService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BulletService());
                hashSet.add(new BulletServiceImpl());
                str = "com.ss.android.ugc.aweme.bullet.api.IBulletService";
                break;
            case -920282637:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RuntimeBehaviorServiceImpl());
                str = "com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService";
                break;
            case -891158064:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceHybridServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService";
                break;
            case -884425869:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MusicService());
                str = "com.ss.android.ugc.aweme.music.service.IMusicService";
                break;
            case -883701379:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.common.publish.ICommerceToolsPublishService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceToolsPublishService());
                str = "com.ss.android.ugc.aweme.commerce.tools.common.publish.ICommerceToolsPublishService";
                break;
            case -881735624:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcomSearchServiceImpl());
                str = "com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService";
                break;
            case -875547947:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IAppWidgetService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AppWidgetServiceImpl());
                str = "com.ss.android.ugc.aweme.IAppWidgetService";
                break;
            case -871982023:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.IFeedSpecActService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SpecActServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.IFeedSpecActService";
                break;
            case -871727766:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.utils.LanguageProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LanguageService());
                str = "com.ss.android.ugc.aweme.utils.LanguageProvider";
                break;
            case -853763001:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommercializeAdOutService());
                str = "com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdOutService";
                break;
            case -847459216:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GodzillaImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi";
                break;
            case -830253574:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchSingleCardTemplateServiceImpl());
                str = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService";
                break;
            case -797912089:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.im.service.IIMService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IMService());
                str = "com.ss.android.ugc.aweme.im.service.IIMService";
                break;
            case -790607001:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ug.IUgCommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UgCommonServiceImpl());
                str = "com.ss.android.ugc.aweme.ug.IUgCommonService";
                break;
            case -767436525:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.VideoBrightAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoBright());
                str = "com.bytedance.bmf_mods_api.VideoBrightAPI";
                break;
            case -761715808:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.avatar.ui.default.IAvatarImageLoadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AvatarImageServiceImpl());
                str = "com.ss.android.ugc.aweme.avatar.ui.default.IAvatarImageLoadService";
                break;
            case -749446408:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PNSAgeGateServiceImpl());
                str = "com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService";
                break;
            case -728326428:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAvSearchUserService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AvSearchUserServiceImpl());
                str = "com.ss.android.ugc.aweme.port.in.IAvSearchUserService";
                break;
            case -726700237:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IVopCameraClientService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VopCameraClientService());
                str = "com.ss.android.ugc.aweme.services.audio.IVopCameraClientService";
                break;
            case -713308800:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.services.IHybridABInfoService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HybridABInfoService());
                str = "com.ss.android.ugc.aweme.app.services.IHybridABInfoService";
                break;
            case -706380519:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAVMixFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IAVMixFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.port.in.IAVMixFeedService";
                break;
            case -703329023:
                if (!cls.getName().equals("com.fackbook.drawee.IDraweeConfigOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DraweeConfigOutService());
                str = "com.fackbook.drawee.IDraweeConfigOutService";
                break;
            case -688908617:
                if (!cls.getName().equals("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DeeplinkPrefetchImpl());
                str = "com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService";
                break;
            case -684482636:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.base.INetworkQualityService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkQualityServiceImpl());
                str = "com.ss.android.ugc.aweme.base.INetworkQualityService";
                break;
            case -676259965:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkConfigProvider());
                str = "com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider";
                break;
            case -674481070:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.detail.api.DetailApiProxy")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DetailApiProxyImpl());
                str = "com.ss.android.ugc.aweme.detail.api.DetailApiProxy";
                break;
            case -656354370:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tablet.api.ITabletService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TabletServiceProxy());
                str = "com.ss.android.ugc.aweme.tablet.api.ITabletService";
                break;
            case -650484961:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SettingsLegacyImpl());
                str = "com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi";
                break;
            case -643691779:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UserInfoUpdateAdapterService());
                str = "com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService";
                break;
            case -642110915:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.function.IFunctionSupportService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FunctionSupportServiceImpl());
                str = "com.ss.android.ugc.aweme.services.function.IFunctionSupportService";
                break;
            case -628620472:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartClassifyServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService";
                break;
            case -627748852:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INearbyFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NearbyFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.service.INearbyFeedService";
                break;
            case -597770654:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoveryAsyncInflateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DiscoveryAsyncInflateImpl());
                str = "com.ss.android.ugc.aweme.discover.IDiscoveryAsyncInflateService";
                break;
            case -595040290:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.power.IPowerModeHandler")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PowerModeHandlerProxy());
                str = "com.ss.android.ugc.aweme.power.IPowerModeHandler";
                break;
            case -576956781:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.experiment.ITrafficDeteriorationApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TrafficDeteriorationTask.TrafficDeteriorationABImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.experiment.ITrafficDeteriorationApi";
                break;
            case -570979083:
                if (!cls.getName().equals("com.bytedance.pia.core.spi.api.IPiaConfigTask")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PiaConfigTask());
                str = "com.bytedance.pia.core.spi.api.IPiaConfigTask";
                break;
            case -559645618:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.ICreativeSAAService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SAAService());
                str = "com.ss.android.ugc.aweme.services.ICreativeSAAService";
                break;
            case -556919374:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.network.INetworkApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkApiImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.network.INetworkApi";
                break;
            case -555197279:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.stemfeed.service.IStemFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StemFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.stemfeed.service.IStemFeedService";
                break;
            case -551721501:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.algorefresh.IAlgoRefreshService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AlgoRefreshServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.algorefresh.IAlgoRefreshService";
                break;
            case -546648250:
                if (!cls.getName().equals("com.bytedance.lobby.internal.IGoogleOnetapLogger")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GoogleOneTapLogger());
                str = "com.bytedance.lobby.internal.IGoogleOnetapLogger";
                break;
            case -522653189:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ICLACaptionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CaptionServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ICLACaptionService";
                break;
            case -514305106:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.mention.service.IMentionViewService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MentionViewServiceImpl());
                str = "com.ss.android.ugc.aweme.mention.service.IMentionViewService";
                break;
            case -504499527:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.serverpush.presenter.IGetPushSettingCallback")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GetPushSettingCallback());
                str = "com.ss.android.ugc.aweme.setting.serverpush.presenter.IGetPushSettingCallback";
                break;
            case -498226579:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BAProfilePageServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService";
                break;
            case -488734248:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.casting.api.ICastingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CastingServiceImpl());
                str = "com.ss.android.ugc.aweme.casting.api.ICastingService";
                break;
            case -476743082:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.promote.IEventCenter")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.commerce.tools.common.EventCenter());
                str = "com.ss.android.ugc.aweme.commerce.tools.promote.IEventCenter";
                break;
            case -474375791:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.IECommerceThirdPartyHybridService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceThirdPartyHybridServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.IECommerceThirdPartyHybridService";
                break;
            case -470712021:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IProfileNaviService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProfileNaviServiceImpl());
                str = "com.ss.android.ugc.aweme.IProfileNaviService";
                break;
            case -469570464:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FollowTabBubbleGuideHelperImpl());
                str = "com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper";
                break;
            case -446200024:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicExternalService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MusicStreamServiceImpl());
                str = "com.ss.android.ugc.aweme.music.service.IMusicExternalService";
                break;
            case -440482732:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.IActivityAdapterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ActivityAdapterServiceImp());
                str = "com.ss.android.ugc.aweme.notice.api.services.IActivityAdapterService";
                break;
            case -408092794:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.pipo.IPipoService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PipoService());
                str = "com.ss.android.ugc.aweme.pipo.IPipoService";
                break;
            case -401450704:
                if (!cls.getName().equals("com.ss.android.legoapi.abtest.IABLegoTaskApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ABLegoTaskImpl());
                str = "com.ss.android.legoapi.abtest.IABLegoTaskApi";
                break;
            case -399721841:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdModule")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchAdModuleImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdModule";
                break;
            case -390604136:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcSchemaService());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService";
                break;
            case -370548335:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IPrevLoginPlatformService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PrevLoginPlatformService());
                str = "com.ss.android.ugc.aweme.IPrevLoginPlatformService";
                break;
            case -344719018:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ICaptionKevaService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CaptionKevaServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ICaptionKevaService";
                break;
            case -343801484:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.service.ISearchUserService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchUserService());
                str = "com.ss.android.ugc.aweme.search.service.ISearchUserService";
                break;
            case -336112860:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ComplianceBusinessServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService";
                break;
            case -335108749:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new OfflineModeServiceImpl());
                str = "com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService";
                break;
            case -317372455:
                if (!cls.getName().equals("com.ss.android.ugc.tiktok.seclink.ISecLinkService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SecLinkServiceImpl());
                str = "com.ss.android.ugc.tiktok.seclink.ISecLinkService";
                break;
            case -307992734:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicDetailService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MusicDetailService());
                str = "com.ss.android.ugc.aweme.music.service.IMusicDetailService";
                break;
            case -287291984:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ConsentServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService";
                break;
            case -277105198:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedRawAdLogUtilsImpl());
                str = "com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsApi";
                break;
            case -269703448:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.api.IBemobiGiftService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BemobiGiftServiceImpl());
                str = "com.ss.android.ugc.aweme.api.IBemobiGiftService";
                break;
            case -265816009:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BulletHostProxy());
                str = "com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy";
                break;
            case -263622518:
                if (!cls.getName().equals("com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AppLogReaperServiceImpl());
                str = "com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService";
                break;
            case -250218208:
                if (!cls.getName().equals("com.ss.android.ugc.awemepushapi.IPushPermissionApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PushPermissionPopupManager());
                str = "com.ss.android.ugc.awemepushapi.IPushPermissionApi";
                break;
            case -249931293:
                if (!cls.getName().equals("com.ss.android.sdk.webview.di.IMainServiceForJsb")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MainServiceForJsb());
                str = "com.ss.android.sdk.webview.di.IMainServiceForJsb";
                break;
            case -219610361:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.sticker.IStickerViewService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StickerViewServiceImpl());
                str = "com.ss.android.ugc.aweme.sticker.IStickerViewService";
                break;
            case -219253809:
                if (!cls.getName().equals("com.bytedance.effectcreatormobile.integrationTiktok.api.IInitCaller")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InitImpl());
                str = "com.bytedance.effectcreatormobile.integrationTiktok.api.IInitCaller";
                break;
            case -206316949:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.share.ShareFlavorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShareFlavorServiceImpl());
                str = "com.ss.android.ugc.aweme.share.ShareFlavorService";
                break;
            case -201169427:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IEncourageLogInService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EncourageLoginPopupManager());
                str = "com.ss.android.ugc.aweme.service.IEncourageLogInService";
                break;
            case -199156479:
                if (!cls.getName().equals("com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InviteFriendsServiceImpl());
                str = "com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService";
                break;
            case -173289775:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcUgFeedEcCardService());
                str = "com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService";
                break;
            case -173191450:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.api.IZeroRatingMainService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ZeroRatingMainServiceImpl());
                str = "com.ss.android.ugc.aweme.api.IZeroRatingMainService";
                break;
            case -164731131:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AwemeTraceLogAdapter());
                str = "com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter";
                break;
            case -163952826:
                if (!cls.getName().equals("com.bytedance.ies.ugc.ttkvstorageapi.IGetTTKVStorageSettings")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TTKVStorageSettings());
                str = "com.bytedance.ies.ugc.ttkvstorageapi.IGetTTKVStorageSettings";
                break;
            case -153981428:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.smartcheck.api.ICustomChecker")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DemoOrderCenterChecker());
                str = "com.ss.android.ugc.aweme.ecommerce.smartcheck.api.ICustomChecker";
                break;
            case -138974023:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.network.IRetrofitFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RetrofitFactory());
                str = "com.bytedance.ies.ugc.aweme.network.IRetrofitFactory";
                break;
            case -136102815:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ComplianceServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService";
                break;
            case -135365047:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.slide.IMainPageSlide")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MainPageSlideImpl());
                str = "com.ss.android.ugc.aweme.feed.slide.IMainPageSlide";
                break;
            case -134222670:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.question.service.IQuestionDetailService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new QuestionDetailServiceImpl());
                str = "com.ss.android.ugc.aweme.question.service.IQuestionDetailService";
                break;
            case -132128589:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ChallengeServiceImpl());
                str = "com.ss.android.ugc.aweme.challenge.service.IChallengeService";
                break;
            case -130657778:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.AVApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AVApiImpl());
                str = "com.ss.android.ugc.aweme.tools.AVApi";
                break;
            case -112246770:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.i18n.xbridge.ISearchBDXBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchBDXBridgeServiceImpl());
                str = "com.ss.android.ugc.aweme.i18n.xbridge.ISearchBDXBridgeService";
                break;
            case -63705348:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.experiment.stringhot.IStringHotUpdateOfflineSwitch")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StringHotUpdateOfflineSwitchImpl());
                str = "com.ss.android.ugc.aweme.experiment.stringhot.IStringHotUpdateOfflineSwitch";
                break;
            case -58960682:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CrashSdkImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi";
                break;
            case -53525263:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.audiomode.fullepisodev2.service.IFullEpisodeRouterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FullEpisodeRouterServiceImpl());
                str = "com.ss.android.ugc.aweme.audiomode.fullepisodev2.service.IFullEpisodeRouterService";
                break;
            case -48878288:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.specact.api.IBDXBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BDXBridgeHelper());
                str = "com.ss.android.ugc.aweme.specact.api.IBDXBridgeService";
                break;
            case -45175540:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ClientAiInitServiceImpl());
                str = "com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService";
                break;
            case -15737757:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.locale.ILocalService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LocalServiceImpl());
                str = "com.ss.android.ugc.aweme.locale.ILocalService";
                break;
            case 2734354:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidSeriesReportService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidSeriesReportServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPaidSeriesReportService";
                break;
            case 8583776:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.social.widget.card.ISocialCardService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SocialCardServiceImp());
                str = "com.ss.android.ugc.aweme.social.widget.card.ISocialCardService";
                break;
            case 18606895:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.experiment.IPaidContentAnchorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentAnchorService());
                str = "com.ss.android.ugc.aweme.experiment.IPaidContentAnchorService";
                break;
            case 23310771:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IFriendsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FriendsServiceImpl());
                str = "com.ss.android.ugc.aweme.friends.service.IFriendsService";
                break;
            case 24289423:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.googlemap.IAdGoogleMapService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdGoogleMapService());
                str = "com.ss.android.ugc.aweme.googlemap.IAdGoogleMapService";
                break;
            case 46092534:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTrace")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EngagementTraceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTrace";
                break;
            case 55668885:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IToolsCPUDataService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ToolsCPUDataServiceImpl());
                str = "com.ss.android.ugc.aweme.port.in.IToolsCPUDataService";
                break;
            case 57780698:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartPreloadProfileV2ServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service";
                break;
            case 58077286:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceMusicLogger());
                str = "com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger";
                break;
            case 63887496:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MutualRelationServiceImpl());
                str = "com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService";
                break;
            case 68846725:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.network.channel.ISpeedModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SpeedModeServiceImpl());
                str = "com.ss.android.ugc.aweme.network.channel.ISpeedModeService";
                break;
            case 71897024:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NoticeCountTabBadgePresentServiceImpl());
                str = "com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService";
                break;
            case 78503464:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IDuetDownloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DuetDownloadService());
                str = "com.ss.android.ugc.aweme.IDuetDownloadService";
                break;
            case 113360460:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AnchorStateServiceImpl());
                str = "com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService";
                break;
            case 118052236:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.internal.IShoutOutApiService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShoutOutServiceImpl());
                str = "com.ss.android.ugc.aweme.internal.IShoutOutApiService";
                break;
            case 120575931:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.service.ICommerceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.di.CommerceServiceImpl());
                str = "com.ss.android.ugc.aweme.main.service.ICommerceService";
                break;
            case 126860504:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.innerpush.api.IInnerPushService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InnerPushServiceImpl());
                str = "com.ss.android.ugc.aweme.innerpush.api.IInnerPushService";
                break;
            case 128063043:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AntiAddictionServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService";
                break;
            case 163017647:
                if (!cls.getName().equals("com.ss.android.ugc.awemepushapi.IPushApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PushService());
                str = "com.ss.android.ugc.awemepushapi.IPushApi";
                break;
            case 180595487:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IPreloadApiService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PreloadApiServiceImpl());
                str = "com.ss.android.ugc.aweme.IPreloadApiService";
                break;
            case 182098267:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EffectPlatformFactory());
                str = "com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory";
                break;
            case 188203150:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.experiment.IPowerExperimentsApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PowerExperimentsImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.experiment.IPowerExperimentsApi";
                break;
            case 197343978:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.mix.services.IMixFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MixFeedService());
                str = "com.ss.android.ugc.aweme.mix.services.IMixFeedService";
                break;
            case 199481663:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DefaultAddressEditStrategyService());
                hashSet.add(new DefaultAddressEditDetailStrategyService());
                hashSet.add(new DefaultAddressListStrategyService());
                hashSet.add(new DefaultLogisticStrategyService());
                hashSet.add(new DefaultAddressSelectStrategyService());
                hashSet.add(new DefaultOspStrategyService());
                hashSet.add(new DefaultPaymentStrategyService());
                hashSet.add(new DefaultPdpStrategyService());
                hashSet.add(new DefaultSkuStrategyService());
                hashSet.add(new GlobalAddressEditStrategyService());
                hashSet.add(new GlobalAddressListStrategyService());
                hashSet.add(new GlobalLogisticStrategyService());
                hashSet.add(new GlobalOspStrategyService());
                hashSet.add(new GlobalPdpStrategyService());
                hashSet.add(new TtfSAPdpStrategyService());
                hashSet.add(new TtfUkPdpStrategyService());
                hashSet.add(new GlobalSkuStrategyService());
                hashSet.add(new TtfSaAddressEditStrategyService());
                hashSet.add(new TtfLogisticStrategyService());
                hashSet.add(new TtfUkLogisticStrategyService());
                hashSet.add(new TtfOspStrategyService());
                hashSet.add(new TtfSaSkuStrategyService());
                hashSet.add(new TtfUkSkuStrategyService());
                hashSet.add(new USAddressEditStrategyService());
                hashSet.add(new UsAddressListHalfScreenStrategyService());
                hashSet.add(new UsAddressListStrategyService());
                hashSet.add(new UsPdpStrategyService());
                hashSet.add(new UsSkuStrategyService());
                hashSet.add(new USAddressSelectStrategyService());
                hashSet.add(new USLogisticStrategyService());
                hashSet.add(new USOspStrategyService());
                hashSet.add(new USPaymentStrategyService());
                str = "com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService";
                break;
            case 204269336:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AgeAppealServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService";
                break;
            case 207468481:
                if (!cls.getName().equals("com.bytedance.ies.powerlist.IPowerContext")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PowerContextImpl());
                str = "com.bytedance.ies.powerlist.IPowerContext";
                break;
            case 208886985:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.ISearchVideoPlayTaskManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchVideoPlayTaskManager());
                str = "com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.ISearchVideoPlayTaskManager";
                break;
            case 242450399:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ExitBackgroundActivityImpl());
                str = "com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi";
                break;
            case 257760762:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceServiceForSa")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceMallService());
                str = "com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceServiceForSa";
                break;
            case 261385584:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UnsampledTraceLoggerImpl());
                str = "com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger";
                break;
            case 269994594:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UniversalPopupManager2());
                str = "com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2";
                break;
            case 292706387:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkCollectionInitService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BenchmarkCollectionInitService());
                str = "com.ss.android.ugc.aweme.bl.IBenchmarkCollectionInitService";
                break;
            case 293382781:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShareWarningInfoServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService";
                break;
            case 297218742:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IFeedSkylightService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedSkylightServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IFeedSkylightService";
                break;
            case 330051722:
                if (!cls.getName().equals("com.ss.android.elearning.lingo.settings.IElSettingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ElSettingDefault());
                str = "com.ss.android.elearning.lingo.settings.IElSettingService";
                break;
            case 342596789:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.aigc.IAIGCAvatarService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AIGCAvatarServiceImpl());
                str = "com.ss.android.ugc.aweme.aigc.IAIGCAvatarService";
                break;
            case 349326855:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.profile.IMafRedPointDismissHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MafRedPointDismissHelper());
                str = "com.ss.android.ugc.aweme.profile.IMafRedPointDismissHelper";
                break;
            case 396547665:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SandboxServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService";
                break;
            case 401026538:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.screenshot.IScreenshotService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ScreenShotService());
                str = "com.ss.android.ugc.aweme.screenshot.IScreenshotService";
                break;
            case 403114353:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchAdServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService";
                break;
            case 415858947:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewForestService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdWebViewForestServiceImpl());
                str = "com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewForestService";
                break;
            case 428046614:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEComHybridLynxBehaviorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EComHybridLiveLynxBehaviorServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEComHybridLynxBehaviorService";
                break;
            case 433186867:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.portrait.api.IIMClientPortraitProducerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IMClientPortraitProducerService());
                str = "com.ss.android.ugc.aweme.portrait.api.IIMClientPortraitProducerService";
                break;
            case 434702730:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InterceptorHolder());
                str = "com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider";
                break;
            case 434710543:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ISocPubStatusRepoService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SocPubStatusRepoServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ISocPubStatusRepoService";
                break;
            case 444334993:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.network.spi.INetworkContextService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkContextService());
                str = "com.ss.android.ugc.aweme.network.spi.INetworkContextService";
                break;
            case 470426976:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PrivacyDisclaimerUtilService());
                str = "com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil";
                break;
            case 495334429:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.promote.IPromoteReplaceMusicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PromoteRepalceMusicServiceImpl());
                str = "com.ss.android.ugc.aweme.commerce.tools.promote.IPromoteReplaceMusicService";
                break;
            case 524459443:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PNSConsentServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentService";
                break;
            case 528772375:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LauncherTaskApiImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi";
                break;
            case 540084577:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IDuetDetailService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DuetDetailServiceImpl());
                str = "com.ss.android.ugc.aweme.tools.detail.IDuetDetailService";
                break;
            case 561594401:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PromoteUtilImpl());
                str = "com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil";
                break;
            case 562723769:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IMusicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.services.MusicService());
                str = "com.ss.android.ugc.aweme.port.in.IMusicService";
                break;
            case 572972021:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IStorageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StorageServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.services.IStorageService";
                break;
            case 574732927:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DiscoveryServiceImpl());
                str = "com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService";
                break;
            case 577466544:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PreciseAdServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService";
                break;
            case 584237458:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplashnp.IRealTimeSplashNPManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RealTimeSplashNPManagerImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplashnp.IRealTimeSplashNPManager";
                break;
            case 587542919:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ChallengeDetailServiceImpl());
                str = "com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService";
                break;
            case 593443641:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INowCaptionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowCaptionService());
                str = "com.ss.android.ugc.aweme.service.INowCaptionService";
                break;
            case 596851023:
                if (!cls.getName().equals("com.bytedance.bdlocation.client.IBDLocationClient")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BDLocationClient());
                str = "com.bytedance.bdlocation.client.IBDLocationClient";
                break;
            case 609285546:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AvatarInternalServiceImpl());
                str = "com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService";
                break;
            case 620814287:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RecommendConsumeServiceImpl());
                str = "com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService";
                break;
            case 628657657:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ITextModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TextModeServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ITextModeService";
                break;
            case 634505157:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.report.IReportService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ReportServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.report.IReportService";
                break;
            case 642811702:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.spi.HomePageCommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HomePageCommonServiceImpl());
                str = "com.ss.android.ugc.aweme.spi.HomePageCommonService";
                break;
            case 647695418:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NoticeCommentHelperServiceImpl());
                str = "com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService";
                break;
            case 669378360:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ApiNetworkServiceForAccount());
                str = "com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount";
                break;
            case 672340145:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ICLAPerfETService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ICLAPerfETServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ICLAPerfETService";
                break;
            case 679787403:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IDanmakuService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DanmakuServiceImpl());
                str = "com.ss.android.ugc.aweme.IDanmakuService";
                break;
            case 685861510:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceProfileService());
                str = "com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService";
                break;
            case 696264772:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IDetailPageShareVMService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StorySkylightDetailShareVMServiceImpl());
                hashSet.add(new FollowFeedStorySkylightListServiceImpl());
                hashSet.add(new SkylightListOperatorServiceImpl());
                hashSet.add(new OfflineModeSharedVMServiceImpl());
                hashSet.add(new PaidCollectionDetailSharedVMServiceImpl());
                hashSet.add(new PoiDetailDiscoveryVideoListOperatorService());
                hashSet.add(new PoiVideoListDefaultOperatorService());
                hashSet.add(new FriendNewVideoDetailServiceImpl());
                hashSet.add(new RelationUserCardDetailServiceImpl());
                hashSet.add(new SearchOfficialVideoDetailSharedVMService());
                hashSet.add(new SearchVideoDetailSharedVMService());
                hashSet.add(new SearchEDMVideoDetailSharedVMService());
                hashSet.add(new StoryOperatorServiceImpl());
                hashSet.add(new StoryGuideCardDetailVMImpl());
                hashSet.add(new BookDetailSharedVMServiceImpl());
                hashSet.add(new MovieDetailSharedVMServiceImpl());
                hashSet.add(new RepostedOperatorServiceImpl());
                hashSet.add(new SubOnlyVideoOperatorServiceImpl());
                hashSet.add(new WatchHistoryDefaultOperatorServiceImpl());
                str = "com.ss.android.ugc.aweme.IDetailPageShareVMService";
                break;
            case 712413375:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IBuildConfigAllService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BuildConfigAllServiceImpl());
                str = "com.ss.android.ugc.aweme.IBuildConfigAllService";
                break;
            case 736344268:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IDetailPageOperatorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ChallengeDetailPageOperatorServiceImpl());
                hashSet.add(new ShoppingDetailPageOperatorService());
                hashSet.add(new DetailPageOperatorServiceImpl());
                hashSet.add(new ProfileDetailPageOperatorServiceImpl());
                hashSet.add(new MallRacunPageOperatorServiceImpl());
                hashSet.add(new ECDetailPageOperatorServiceImpl());
                hashSet.add(new ExplorePageOperatorServiceImpl());
                hashSet.add(new RecommendFeedDetailPageOperatorServiceImpl());
                hashSet.add(new FollowFeedDetailPageOperatorServiceImpl());
                hashSet.add(new OftenWatchDetailPageOperatorServiceImpl());
                hashSet.add(new FavoriteVideoChatDetailPageOperatorService());
                hashSet.add(new LibraryDetailPageOperatorServiceImpl());
                hashSet.add(new MusicDetailPageOperatorServiceImpl());
                hashSet.add(new PaidCollectionDetailOperatorServiceImpl());
                hashSet.add(new EffectDetailPageOperatorServiceImpl());
                hashSet.add(new QuestionDetailPageOperatorServiceImpl());
                hashSet.add(new SearchDetailPageOperatorServiceImpl());
                hashSet.add(new EComSearchDetailPageOperatorServiceImpl());
                hashSet.add(new StoryDefaultOperatorServiceImpl());
                hashSet.add(new TTSVoiceDetailPageOperatorServiceImpl());
                hashSet.add(new VoiceConversionDetailPageOperatorServiceImpl());
                hashSet.add(new AddYoursDetailPageOperatorServiceImpl());
                str = "com.ss.android.ugc.aweme.IDetailPageOperatorService";
                break;
            case 753323261:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.sync.IByteSyncApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ByteSyncApiImpl());
                str = "com.ss.android.ugc.aweme.sync.IByteSyncApi";
                break;
            case 753788208:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ICaptionSheetService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CaptionSheetServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ICaptionSheetService";
                break;
            case 757747585:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.topic.ITopicCommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TopicCommonService());
                str = "com.ss.android.ugc.aweme.topic.ITopicCommonService";
                break;
            case 758021698:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.vision.IPhotoSearchService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EComPhotoSearchServiceImpl());
                str = "com.ss.android.ugc.aweme.vision.IPhotoSearchService";
                break;
            case 763194376:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ConsistentContentAndAdChoiceServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService";
                break;
            case 781329451:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.ui.IFeedUniformFontService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedUniformFontServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.ui.IFeedUniformFontService";
                break;
            case 789849192:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.websocket.api.service.IWsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WsManager());
                str = "com.ss.android.ugc.aweme.websocket.api.service.IWsService";
                break;
            case 816898295:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.contact.service.IIMContactService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IMContactServiceImpl());
                str = "com.ss.android.ugc.aweme.contact.service.IIMContactService";
                break;
            case 840163770:
                if (!cls.getName().equals("com.bytedance.pumbaa.base.ICommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BPEAPumbaaService());
                hashSet.add(new HybridServiceImpl());
                hashSet.add(new MonitorServiceImpl());
                hashSet.add(new NetworkServiceImpl());
                hashSet.add(new PDPPumbaaService());
                hashSet.add(new RuleEngineServiceImpl());
                str = "com.bytedance.pumbaa.base.ICommonService";
                break;
            case 849109598:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InboxMobEventServiceImpl());
                str = "com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService";
                break;
            case 866935518:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.INoticeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NoticeServiceImpl());
                str = "com.ss.android.ugc.aweme.notice.api.services.INoticeService";
                break;
            case 881706831:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AbTestManagerApiImpl());
                str = "com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi";
                break;
            case 885632920:
                if (!cls.getName().equals("com.bytedance.geckox.IGeckoLowStorageConfig")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GeckoLowStorageConfigImpl());
                str = "com.bytedance.geckox.IGeckoLowStorageConfig";
                break;
            case 897816322:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MSAdaptionService());
                str = "com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService";
                break;
            case 898628767:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.innerpush.api.IInnerPushDebugService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InnerPushDebugServiceImpl());
                str = "com.ss.android.ugc.aweme.innerpush.api.IInnerPushDebugService";
                break;
            case 905737872:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdSceneServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService";
                break;
            case 930118730:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceStickerServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerService";
                break;
            case 938216902:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.mapapi.IPoiMapService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PoiMapServiceImpl());
                str = "com.ss.android.ugc.aweme.mapapi.IPoiMapService";
                break;
            case 958565090:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.plugin.service.IPluginService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AabPluginServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.plugin.service.IPluginService";
                break;
            case 959171338:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.openshare.IShareRespSendService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShareRespSendServiceImpl());
                str = "com.ss.android.ugc.aweme.openshare.IShareRespSendService";
                break;
            case 960604610:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentPreviewTagServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService";
                break;
            case 963655847:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IWatchHistoryValue")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WatchHistoryValueService());
                str = "com.ss.android.ugc.aweme.IWatchHistoryValue";
                break;
            case 966494283:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProviderOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ChallengeDetailProviderOutService());
                str = "com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProviderOutService";
                break;
            case 970570381:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TcmOutService());
                str = "com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmOutService";
                break;
            case 973482728:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WsMonitor());
                str = "com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService";
                break;
            case 990307162:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkStandardUIServiceImpl());
                str = "com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService";
                break;
            case 999164242:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GlobalSearchAdModuleImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule";
                break;
            case 1025883566:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService$DebugService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PipDebugServiceImpl());
                str = "com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService$DebugService";
                break;
            case 1029031535:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TalentAdRevenueShareServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService";
                break;
            case 1044049149:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.web.ICrossPlatformJsbProxy")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CrossPlatformJsbProxy());
                str = "com.ss.android.ugc.aweme.web.ICrossPlatformJsbProxy";
                break;
            case 1055080032:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchMiddleForEcService());
                str = "com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService";
                break;
            case 1059333855:
                if (!cls.getName().equals("com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IMCoreDependProxyService());
                str = "com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService";
                break;
            case 1061883399:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IAutoCutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AutoCutServiceImpl());
                str = "com.ss.android.ugc.aweme.IAutoCutService";
                break;
            case 1063139064:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ForwardStatisticsServiceImpl());
                str = "com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService";
                break;
            case 1073258125:
                if (!cls.getName().equals("com.bytedance.pumbaa.pdp.api.IPolicyDecision")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PolicyDecisionImp());
                str = "com.bytedance.pumbaa.pdp.api.IPolicyDecision";
                break;
            case 1091358875:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceToolsStickerServiceImpl());
                str = "com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService";
                break;
            case 1095119298:
                if (!cls.getName().equals("com.ss.android.elearning.lingo.log.ElLogService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ElLogDefault());
                str = "com.ss.android.elearning.lingo.log.ElLogService";
                break;
            case 1098343408:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProfileAIGCServiceImpl());
                str = "com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService";
                break;
            case 1105890211:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceMissionServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService";
                break;
            case 1110345745:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GoogleOneTapService());
                str = "com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService";
                break;
            case 1116160691:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UnLoginDiggService());
                str = "com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService";
                break;
            case 1156506930:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.cct.IOpenCCTUtils")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new OpenCCTUtils());
                str = "com.ss.android.ugc.aweme.cct.IOpenCCTUtils";
                break;
            case 1167985898:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.tag.IAdTagService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdTagServiceImpl());
                str = "com.ss.android.ugc.aweme.ad.feed.tag.IAdTagService";
                break;
            case 1169043239:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.common.record.ICommerceToolsRecordApiComponent")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceToolsRecordApiComponent());
                str = "com.ss.android.ugc.aweme.commerce.tools.common.record.ICommerceToolsRecordApiComponent";
                break;
            case 1175664287:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessMainService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BusinessMainServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IBusinessMainService";
                break;
            case 1179584194:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InviteFriendsService());
                str = "com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService";
                break;
            case 1184636627:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.now.ICreativeNowService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CreativeNowServiceImpl());
                str = "com.ss.android.ugc.aweme.services.now.ICreativeNowService";
                break;
            case 1207362782:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IAdSlidePreloadImpl());
                str = "com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload";
                break;
            case 1215087071:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LinkTypeTagsPriorityManagerImpl());
                str = "com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager";
                break;
            case 1216862361:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IArticleModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ArticleModeServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IArticleModeService";
                break;
            case 1217320995:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAVSettingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IAVSettingServiceImpl());
                str = "com.ss.android.ugc.aweme.port.in.IAVSettingService";
                break;
            case 1222443511:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.publish.IPublishConfigExternalService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PublishConfigExternalService());
                str = "com.ss.android.ugc.aweme.services.publish.IPublishConfigExternalService";
                break;
            case 1222505128:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.agecontrol.IPNSAgeControlService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PNSAgeControlService());
                str = "com.ss.android.ugc.aweme.compliance.api.services.agecontrol.IPNSAgeControlService";
                break;
            case 1226044343:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BusinessEComSparkRouterInterceptorsProvider());
                hashSet.add(new EcUgSparkInterceptorsProvider());
                hashSet.add(new AudienceEcomSparkRouterInterceptorsProvider());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService";
                break;
            case 1226984081:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FriendsTabDbService());
                str = "com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService";
                break;
            case 1257554667:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.LingoCaptionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LingoCaptionServiceImpl());
                str = "com.ss.android.ugc.aweme.service.LingoCaptionService";
                break;
            case 1272240335:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IRecommendUsersDependentServiceImpl());
                str = "com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService";
                break;
            case 1291617390:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.question.IQuestionFavoriteService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new QuestionFavoriteServiceImpl());
                str = "com.ss.android.ugc.aweme.question.IQuestionFavoriteService";
                break;
            case 1306363294:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BABusinessSuitePageServiceImp());
                str = "com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService";
                break;
            case 1315153688:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NotificationCountViewManager.Companion.NotificationCountViewServiceImpl());
                str = "com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService";
                break;
            case 1338635602:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PreRenderWebViewManager());
                str = "com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule";
                break;
            case 1360758845:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IUserService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BaseUserService());
                str = "com.ss.android.ugc.aweme.framework.services.IUserService";
                break;
            case 1373149304:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PipServiceImpl());
                str = "com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService";
                break;
            case 1377589410:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.network.IPowerPreload")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PowerPreloadServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.network.IPowerPreload";
                break;
            case 1383321717:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdTaskDependImpl());
                str = "com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend";
                break;
            case 1422241413:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewInterceptorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdWebViewInterceptorService());
                str = "com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewInterceptorService";
                break;
            case 1423920585:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SplashAdOutService());
                str = "com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService";
                break;
            case 1429224630:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AnchorOperationServiceImpl());
                str = "com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService";
                break;
            case 1438496117:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceLiveDegradeExp")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcommerceLiveDegradeExp());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEcommerceLiveDegradeExp";
                break;
            case 1441553717:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.showcase.service.settings.IRomaSchemaGroupShoppingStoreSettings")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RomaSchemaGroupShoppingStoreSettings());
                str = "com.ss.android.ugc.aweme.ecommerce.showcase.service.settings.IRomaSchemaGroupShoppingStoreSettings";
                break;
            case 1464985435:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InterceptHomeBackPressServiceImpl());
                str = "com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService";
                break;
            case 1466547207:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.feed.assem.IAdAssemUtils")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdAssemUtils());
                str = "com.ss.android.ugc.aweme.commercialize.feed.assem.IAdAssemUtils";
                break;
            case 1469964205:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GeckoLocalServiceImpl());
                str = "com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService";
                break;
            case 1484795975:
                if (!cls.getName().equals("com.ss.android.ugc.now.interaction.api.IInteractionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InteractionService());
                str = "com.ss.android.ugc.now.interaction.api.IInteractionService";
                break;
            case 1513354211:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartDataCenterApiServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService";
                break;
            case 1533934351:
                if (!cls.getName().equals("com.lingo.caption.api.LingoCaptionInnerApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LingoCaptionInnerImpl());
                str = "com.lingo.caption.api.LingoCaptionInnerApi";
                break;
            case 1538373766:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MediaChosenResultProcessFactory());
                str = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory";
                break;
            case 1543209270:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.ILauncherService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LauncherServiceImpl());
                str = "com.ss.android.ugc.aweme.launcher.ILauncherService";
                break;
            case 1545114897:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IFollowService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FollowService());
                str = "com.ss.android.ugc.aweme.friends.service.IFollowService";
                break;
            case 1579750757:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IVideoGiftService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoGiftService());
                str = "com.ss.android.ugc.aweme.setting.services.IVideoGiftService";
                break;
            case 1599780751:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.IFavoriteOptimisticService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FavoriteServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.IFavoriteOptimisticService";
                break;
            case 1603312956:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.auth.IAuthService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AuthServiceImpl());
                str = "com.ss.android.ugc.aweme.relation.auth.IAuthService";
                break;
            case 1629571136:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.friends.service.ISocialFriendsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SocialFriendsService());
                str = "com.ss.android.ugc.aweme.friends.service.ISocialFriendsService";
                break;
            case 1633499538:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcommerceInfluencerServiceImpl());
                str = "com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService";
                break;
            case 1648432028:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IMultiAccountService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MultiAccountService());
                str = "com.ss.android.ugc.aweme.IMultiAccountService";
                break;
            case 1652892170:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.IStitchDownloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StitchDownloadServiceImpl());
                str = "com.ss.android.ugc.aweme.tools.IStitchDownloadService";
                break;
            case 1659198422:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BackendApiCallerOptService());
                str = "com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService";
                break;
            case 1661968864:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartCommonPreloadServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService";
                break;
            case 1663726118:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdLandPagePreloadServiceImpl());
                str = "com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService";
                break;
            case 1675786870:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProfileNameSyncServiceImpl());
                str = "com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService";
                break;
            case 1724321674:
                if (!cls.getName().equals("com.ss.android.ugc.gamora.TTEPPageFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TTEPPageFactoryDelegate());
                str = "com.ss.android.ugc.gamora.TTEPPageFactory";
                break;
            case 1739791517:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IChallengeDetailLegacyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ChallengeDetailLegacyServiceImpl());
                str = "com.ss.android.ugc.aweme.IChallengeDetailLegacyService";
                break;
            case 1745515451:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.network.ITrafficStatistics")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TrafficStatisticsServiceImpl());
                str = "com.ss.android.ugc.aweme.network.ITrafficStatistics";
                break;
            case 1747700592:
                if (!cls.getName().equals("com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DataCollectionModule());
                str = "com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule";
                break;
            case 1748459787:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MiddleForSearchFromEC());
                str = "com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC";
                break;
            case 1758607663:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.network.spi.INetworkStateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkStateServiceImpl());
                str = "com.ss.android.ugc.aweme.network.spi.INetworkStateService";
                break;
            case 1771293041:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NotificationClickHelperImpl());
                str = "com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper";
                break;
            case 1772993265:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveOuterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LiveOuterService());
                str = "com.ss.android.ugc.aweme.live.ILiveOuterService";
                break;
            case 1773843317:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.log.IAdLynxEventLogger")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdLynxEventLoger());
                str = "com.ss.android.ugc.aweme.log.IAdLynxEventLogger";
                break;
            case 1789034512:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentPaymentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentPaymentServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPaidContentPaymentService";
                break;
            case 1795330578:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CreatorCenterPreloadServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService";
                break;
            case 1797968063:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PerfMonitorServiceImpl());
                str = "com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService";
                break;
            case 1810425986:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcommerceStoreBizLogServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService";
                break;
            case 1832868993:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IRessoAnchorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IRessoAnchorServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IRessoAnchorService";
                break;
            case 1834422093:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DeviceConsentHandlerServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService";
                break;
            case 1869503713:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IRegistrationAgeGateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RegistrationAgeGateServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IRegistrationAgeGateService";
                break;
            case 1901324524:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ICreatorToolService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CreatorToolServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.services.ICreatorToolService";
                break;
            case 1910743527:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.count.IFeedPlayNumService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedPlayNumServiceImpl());
                str = "com.ss.android.ugc.aweme.count.IFeedPlayNumService";
                break;
            case 1945553471:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IShopTabIconService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FashionMallTabIconService());
                str = "com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IShopTabIconService";
                break;
            case 1948175614:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ComplianceMonitorServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService";
                break;
            case 1970320629:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MainPageServiceImpl());
                str = "com.ss.android.ugc.aweme.main.IMainPageService";
                break;
            case 1975850393:
                if (!cls.getName().equals("com.bytedance.pumbaa.monitor.adapter.api.IMonitorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MonitorServiceImpl());
                str = "com.bytedance.pumbaa.monitor.adapter.api.IMonitorService";
                break;
            case 1976336276:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchComponentServiceImpl());
                str = "com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService";
                break;
            case 1976378617:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PublishServiceFactoryImpl());
                str = "com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory";
                break;
            case 1993928235:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.log.IAdLogService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdLogServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.log.IAdLogService";
                break;
            case 2001356487:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new OpenOnMuteImpl());
                str = "com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi";
                break;
            case 2020500036:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.WSHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WSHelperImpl());
                str = "com.ss.android.ugc.aweme.notice.api.helper.WSHelper";
                break;
            case 2046591221:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessComponentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BusinessComponentServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IBusinessComponentService";
                break;
            case 2050400656:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IAVInitializer")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AVInitializerImpl());
                str = "com.ss.android.ugc.aweme.services.IAVInitializer";
                break;
            case 2059590346:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FollowStatisticsServiceImpl());
                str = "com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService";
                break;
            case 2070608616:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new QrCodeScanImpl());
                str = "com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService";
                break;
            case 2077041532:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceVideoService());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService";
                break;
            case 2098328820:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HomePageUIFrameServiceImpl());
                str = "com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService";
                break;
            case 2116238537:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.internal.IPrivacyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PrivacyServiceImpl());
                str = "com.ss.android.ugc.aweme.internal.IPrivacyService";
                break;
            case 2121897853:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceArchServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService";
                break;
            case 2124126000:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InboxSkylightService());
                str = "com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge";
                break;
            case 2128592722:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.donation.IDonationService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DonationServiceImpl());
                str = "com.ss.android.ugc.aweme.donation.IDonationService";
                break;
            default:
                return null;
        }
        putStaticServiceImplSetCache(str, hashSet);
        return hashSet;
    }

    private Set getStaticServiceImplSetRealStub1(Class cls) {
        HashSet hashSet;
        String str;
        switch (cls.getName().hashCode()) {
            case -2145984762:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IDeutModeDiscoverService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DuetDiscoverServiceImpl());
                str = "com.ss.android.ugc.aweme.tools.detail.IDeutModeDiscoverService";
                break;
            case -2144203200:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentSdpTrailerService());
                str = "com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService";
                break;
            case -2142042626:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ICrossPlatformLegacyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CrossPlatformLegacyServiceImpl());
                str = "com.ss.android.ugc.aweme.ICrossPlatformLegacyService";
                break;
            case -2129240203:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ParamResultHandler());
                hashSet.add(new ToastResultHandler());
                str = "com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler";
                break;
            case -2128257677:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EarlyFeedbackService());
                str = "com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService";
                break;
            case -2120792575:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.system.ISystemServiceApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SystemServiceApiImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.system.ISystemServiceApi";
                break;
            case -2089789548:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPaidContentService";
                break;
            case -2088649324:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new OpenPlatformServiceImpl());
                str = "com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService";
                break;
            case -2054995116:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IVopPermissionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VopPermissionService());
                str = "com.ss.android.ugc.aweme.services.audio.IVopPermissionService";
                break;
            case -2053076272:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdAssemServiceImpl());
                str = "com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService";
                break;
            case -2050154457:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ISeriesNotificationService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SeriesNotificationServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ISeriesNotificationService";
                break;
            case -2045744714:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.im.INotificationManagerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NotificationManagerServiceImpl());
                str = "com.ss.android.ugc.aweme.im.INotificationManagerService";
                break;
            case -2041007322:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IInternalAVService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AVServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IInternalAVService";
                break;
            case -2034848867:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.publish.IPublishPageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PublishPageImpl());
                str = "com.ss.android.ugc.aweme.publish.IPublishPageService";
                break;
            case -2018037726:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.recuser.IRecUserService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RecUserServiceImpl());
                str = "com.ss.android.ugc.aweme.relation.recuser.IRecUserService";
                break;
            case -2007357452:
                if (!cls.getName().equals("com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BTMTrackerServiceImpl());
                str = "com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService";
                break;
            case -1999823250:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CompliancePolicyServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService";
                break;
            case -1988304200:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProactiveTriggersService());
                str = "com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService";
                break;
            case -1985945847:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.mention.service.IMentionDataService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MentionDataServiceImpl());
                str = "com.ss.android.ugc.aweme.mention.service.IMentionDataService";
                break;
            case -1984854844:
                if (!cls.getName().equals("com.ss.android.ugc.localnotifyapi.ILocalNotifyApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommonLocalNotifyService());
                str = "com.ss.android.ugc.localnotifyapi.ILocalNotifyApi";
                break;
            case -1981582294:
                if (!cls.getName().equals("com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HybridMonitorServiceImpl());
                str = "com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService";
                break;
            case -1937612334:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceStickerOutService());
                str = "com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerOutService";
                break;
            case -1931366336:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.AdOmSdkManagerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdOmSdkManagerServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.service.AdOmSdkManagerService";
                break;
            case -1921709535:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GeckoPreloadServiceImpl());
                str = "com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService";
                break;
            case -1914197419:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.enter.IEnterProfileService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EnterProfileServiceImpl());
                str = "com.ss.android.ugc.aweme.enter.IEnterProfileService";
                break;
            case -1908421675:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CQrcodeService());
                str = "com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService";
                break;
            case -1904146117:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.omsdk.IAdOmSdkManagerProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdOmSdkManagerProvider());
                str = "com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.omsdk.IAdOmSdkManagerProvider";
                break;
            case -1902468907:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommercializeLiveServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService";
                break;
            case -1902050433:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NoticeChallengePropertyUtilImpl());
                str = "com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil";
                break;
            case -1891048851:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.ColorShiftAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ColorShift());
                str = "com.bytedance.bmf_mods_api.ColorShiftAPI";
                break;
            case -1887804577:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.music.service.IProfileMusicTabService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProfileMusicTabService());
                str = "com.ss.android.ugc.aweme.music.service.IProfileMusicTabService";
                break;
            case -1887270731:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentCreationService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentCreationServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPaidContentCreationService";
                break;
            case -1882551236:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.account.IAccountInitService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountInitServiceImpl());
                str = "com.ss.android.ugc.aweme.account.IAccountInitService";
                break;
            case -1863072420:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ILandscapeEducatorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LandscapeEducatorImpl());
                str = "com.ss.android.ugc.aweme.ILandscapeEducatorService";
                break;
            case -1859502304:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.VideoSuperResolutionAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoSuperResolution());
                str = "com.bytedance.bmf_mods_api.VideoSuperResolutionAPI";
                break;
            case -1826578900:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopBDXBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VopBDXBridgeServiceImpl());
                str = "com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopBDXBridgeService";
                break;
            case -1819181795:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceMonitorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcommerceMonitorService());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEcommerceMonitorService";
                break;
            case -1816256684:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.OldRedPointService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RedPointServiceImpl());
                str = "com.ss.android.ugc.aweme.notice.api.count.OldRedPointService";
                break;
            case -1806927191:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.journey.INewUserJourneyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NewUserJourneyService());
                str = "com.ss.android.ugc.aweme.journey.INewUserJourneyService";
                break;
            case -1799242804:
                if (!cls.getName().equals("com.bytedance.ies.watcher.IWatcher")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WatcherImpl());
                str = "com.bytedance.ies.watcher.IWatcher";
                break;
            case -1788325683:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRRaisrAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoSRRaisr());
                str = "com.bytedance.bmf_mods_api.VideoSRRaisrAPI";
                break;
            case -1785235188:
                if (!cls.getName().equals("com.ss.android.legoapi.IAccountInitializerTaskApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountInitializerTaskImpl());
                str = "com.ss.android.legoapi.IAccountInitializerTaskApi";
                break;
            case -1767384676:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.image.IECImageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECImageService());
                str = "com.ss.android.ugc.aweme.ecommerce.image.IECImageService";
                break;
            case -1760828615:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PrivateAccountServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService";
                break;
            case -1750338964:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new KidsAccountServiceImpl());
                str = "com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService";
                break;
            case -1740635045:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.IEcommerceAnchorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcommerceAnchorService());
                str = "com.ss.android.ugc.aweme.anchor.service.IEcommerceAnchorService";
                break;
            case -1727443149:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.api.IFeedRecommendFragmentClass")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedFragmentClassService());
                str = "com.ss.android.ugc.aweme.feed.api.IFeedRecommendFragmentClass";
                break;
            case -1727161271:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartFeedPreloadServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService";
                break;
            case -1690323830:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.deeplink.IDeepLinkService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DeepLinkServiceImpl());
                str = "com.ss.android.ugc.aweme.deeplink.IDeepLinkService";
                break;
            case -1689796830:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.NoiseLiveAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NoiseLive());
                str = "com.bytedance.bmf_mods_api.NoiseLiveAPI";
                break;
            case -1659862780:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GetLeadsAnchorService());
                str = "com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService";
                break;
            case -1648817253:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INowUserPublishService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowUserPublishService());
                str = "com.ss.android.ugc.aweme.service.INowUserPublishService";
                break;
            case -1645858299:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MusicStorageCleanServiceImpl());
                str = "com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService";
                break;
            case -1643547945:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProtectionServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService";
                break;
            case -1633603100:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartPreloadCommentV2ServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service";
                break;
            case -1632619980:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISettingDependService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SettingDependServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.services.ISettingDependService";
                break;
            case -1610244269:
                if (!cls.getName().equals("com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IMCoreProxyService());
                str = "com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService";
                break;
            case -1609011523:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new QAInvitationService());
                str = "com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService";
                break;
            case -1607608657:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SettingsMainApiImpl());
                str = "com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi";
                break;
            case -1591908699:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ISocInteractionAvatarService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SocInteractionAvatarServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ISocInteractionAvatarService";
                break;
            case -1590000450:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceAnchorService());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService";
                break;
            case -1583450904:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.FypAutoScrollService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FypAutoScrollServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.FypAutoScrollService";
                break;
            case -1558198493:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FamilyPairingServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService";
                break;
            case -1543470910:
                if (!cls.getName().equals("com.ss.android.ugc.feed.platform.cardinsert.IFeedCardInsertService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedCardInsertService());
                str = "com.ss.android.ugc.feed.platform.cardinsert.IFeedCardInsertService";
                break;
            case -1535610191:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.journey.INujPerformanceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NujPerformanceService());
                str = "com.ss.android.ugc.aweme.journey.INujPerformanceService";
                break;
            case -1531528866:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.storage.IRelationStorageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RelationStorageServiceImpl());
                str = "com.ss.android.ugc.aweme.relation.storage.IRelationStorageService";
                break;
            case -1527643984:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new Feed0VVManagerService());
                str = "com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService";
                break;
            case -1510438058:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ImEntranceService());
                str = "com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService";
                break;
            case -1509395635:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TermsConsentServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService";
                break;
            case -1494693547:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.download.component_api.service.IDownloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DownloadServiceImpl());
                str = "com.ss.android.ugc.aweme.download.component_api.service.IDownloadService";
                break;
            case -1484563773:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.services.IDownloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DownloadService());
                str = "com.ss.android.ugc.aweme.app.services.IDownloadService";
                break;
            case -1480234421:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notification.creator.service.INotificationFragmentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NotificationFragmentServiceImpl());
                str = "com.ss.android.ugc.aweme.notification.creator.service.INotificationFragmentService";
                break;
            case -1477649403:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new OpenOnMuteImpl());
                str = "com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi";
                break;
            case -1459016104:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SchemaPageHelperImpl());
                str = "com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper";
                break;
            case -1452788604:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoTrendingTopicServiceImpl());
                str = "com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService";
                break;
            case -1443410671:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AwemeConfigCenter.AwemeConfigCenterImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi";
                break;
            case -1436553735:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IEducatePhotoModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EducatePhotoModeServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IEducatePhotoModeService";
                break;
            case -1435759313:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AvatarAndNicknamePopupController());
                str = "com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher";
                break;
            case -1429156681:
                if (!cls.getName().equals("com.ss.android.ugc.tiktok.location_api.service.ILocationService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LocationServiceImpl());
                str = "com.ss.android.ugc.tiktok.location_api.service.ILocationService";
                break;
            case -1417371777:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IMUnder16ProxyImpl());
                str = "com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy";
                break;
            case -1408772159:
                if (!cls.getName().equals("com.fackbook.imagepipeline.IImagePipelineOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ImagePipelineConfigFactory());
                str = "com.fackbook.imagepipeline.IImagePipelineOutService";
                break;
            case -1408415368:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.specact.api.ISpecActService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SpecActServiceImpl());
                str = "com.ss.android.ugc.aweme.specact.api.ISpecActService";
                break;
            case -1379065367:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.share.ShareService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.share.ShareServiceImpl());
                str = "com.ss.android.ugc.aweme.share.ShareService";
                break;
            case -1368655741:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdPlayFunAsseUtils());
                str = "com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils";
                break;
            case -1321926739:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HydrogenServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService";
                break;
            case -1317882728:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRLutDspAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoSRLutDsp());
                str = "com.bytedance.bmf_mods_api.VideoSRLutDspAPI";
                break;
            case -1309436545:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IAnoleService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AnoleServiceImpl());
                str = "com.ss.android.ugc.aweme.IAnoleService";
                break;
            case -1306728476:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.jsb.ICreativeToolXBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CreativeToolXBridgeService());
                str = "com.ss.android.ugc.aweme.shortvideo.jsb.ICreativeToolXBridgeService";
                break;
            case -1289181594:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartPlaytimePredictServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService";
                break;
            case -1273247020:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CandidateRequestImpl());
                str = "com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService";
                break;
            case -1272663583:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SpeedModeSettingImpl());
                str = "com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting";
                break;
            case -1246491968:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECLayerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECLayerService());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IECLayerService";
                break;
            case -1245900765:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new OpenOnMuteImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi";
                break;
            case -1238754624:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ICLALanguageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ICLALanguageServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.services.ICLALanguageService";
                break;
            case -1238030096:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcomSparkSubInterceptorProvider());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService";
                break;
            case -1232436899:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.BusinessModuleService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BusinessModuleServiceImpl());
                str = "com.ss.android.ugc.aweme.services.BusinessModuleService";
                break;
            case -1230251313:
                if (!cls.getName().equals("com.bytedance.ies.android.base.runtime.IDependOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DependOutServiceImpl());
                str = "com.bytedance.ies.android.base.runtime.IDependOutService";
                break;
            case -1217175380:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.adexperience.IAdExperienceEventLogger")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdExperienceEventLogger());
                str = "com.ss.android.ugc.aweme.ad.feed.adexperience.IAdExperienceEventLogger";
                break;
            case -1202985878:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAnotherMusicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MusicServiceImpl());
                str = "com.ss.android.ugc.aweme.port.in.IAnotherMusicService";
                break;
            case -1201939162:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ISmartLockService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartLockService());
                str = "com.ss.android.ugc.aweme.ISmartLockService";
                break;
            case -1195178446:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.net.IReleaseInterceptor")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DevicesNullInterceptor());
                str = "com.ss.android.ugc.aweme.net.IReleaseInterceptor";
                break;
            case -1181313806:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NewUserImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi";
                break;
            case -1164850823:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.prefetch.IAdWebViewPrefetchManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdWebViewPrefetchManager());
                str = "com.ss.android.ugc.aweme.ad.prefetch.IAdWebViewPrefetchManager";
                break;
            case -1154900743:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.service.IAdLandPageDependOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdLandPageDependOutService());
                str = "com.ss.android.ugc.aweme.ad.service.IAdLandPageDependOutService";
                break;
            case -1114068711:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.IAdAnimation")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdAnimationImpl());
                str = "com.ss.android.ugc.aweme.commercialize.service.IAdAnimation";
                break;
            case -1084831671:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.external.IDonationVendorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DonationUtils());
                str = "com.ss.android.ugc.aweme.services.external.IDonationVendorService";
                break;
            case -1077200566:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.AdaptiveGradingAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdaptiveGrading());
                str = "com.bytedance.bmf_mods_api.AdaptiveGradingAPI";
                break;
            case -1075930301:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BASwitchToPAorBAServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService";
                break;
            case -1074357945:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INowWidgetService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowWidgetService());
                str = "com.ss.android.ugc.aweme.service.INowWidgetService";
                break;
            case -1072736913:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TcmServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService";
                break;
            case -1070602758:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.lego.common.LegoBusinessService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LegoBusinessServiceImpl());
                str = "com.ss.android.ugc.aweme.lego.common.LegoBusinessService";
                break;
            case -1067518024:
                if (!cls.getName().equals("com.ss.android.ugc.tiktok.security.IClientSecurityService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ClientSecurityServiceImpl());
                str = "com.ss.android.ugc.tiktok.security.IClientSecurityService";
                break;
            case -1062505434:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PNSUserStateManager());
                str = "com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService";
                break;
            case -1058542172:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ChallengeDetailProvider());
                str = "com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider";
                break;
            case -1056088830:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.mention.service.ICommentMentionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommentMentionServiceImpl());
                str = "com.ss.android.ugc.aweme.mention.service.ICommentMentionService";
                break;
            case -1039515171:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.userservice.api.IUserService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UserService());
                str = "com.ss.android.ugc.aweme.userservice.api.IUserService";
                break;
            case -1037175629:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.comment.services.CommentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommentServiceImpl());
                str = "com.ss.android.ugc.aweme.comment.services.CommentService";
                break;
            case -1016983639:
                if (!cls.getName().equals("com.bytedance.bdlocation.df.ILocationPluginService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LocationPluginServiceImpl());
                str = "com.bytedance.bdlocation.df.ILocationPluginService";
                break;
            case -984217521:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TrafficMonitorService());
                str = "com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi";
                break;
            case -978906707:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartRegressCalculateServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService";
                break;
            case -975945298:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VopCloneServiceImpl());
                str = "com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService";
                break;
            case -954404156:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.clean.ICleanDialogService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CleanDialogServiceImpl());
                str = "com.ss.android.ugc.aweme.clean.ICleanDialogService";
                break;
            case -954311927:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.network.spi.IZstdService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ZstdService());
                str = "com.ss.android.ugc.aweme.network.spi.IZstdService";
                break;
            case -929935463:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.i18n.xbridge.IMainXBridgetService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MainXBridgeServiceImpl());
                str = "com.ss.android.ugc.aweme.i18n.xbridge.IMainXBridgetService";
                break;
            case -923330900:
                if (!cls.getName().equals("com.ss.android.elearning.lingo.lynx.ILynxService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LingoLynxImpl());
                str = "com.ss.android.elearning.lingo.lynx.ILynxService";
                break;
            case -921805160:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.LogHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LogHelperImpl());
                str = "com.ss.android.ugc.aweme.notice.api.helper.LogHelper";
                break;
            case -915558489:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IPropReuseService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PropReuseServiceImpl());
                str = "com.ss.android.ugc.aweme.tools.detail.IPropReuseService";
                break;
            case -907055751:
                if (!cls.getName().equals("com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UserAccountImpl());
                str = "com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount";
                break;
            case -887501574:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.base.ITaskManagerConfig")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TaskManagerConfigImpl());
                str = "com.ss.android.ugc.aweme.base.ITaskManagerConfig";
                break;
            case -884779171:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.web.permission.IAdWebPermissionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdWebPermissionService());
                str = "com.ss.android.ugc.aweme.web.permission.IAdWebPermissionService";
                break;
            case -883042393:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EditVideoInfoServiceImpl());
                str = "com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService";
                break;
            case -880904353:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ConsumeLoginLoginServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService";
                break;
            case -879010222:
                if (!cls.getName().equals("com.bytedance.pumbaa.hybrid.api.IHybridService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HybridServiceImpl());
                str = "com.bytedance.pumbaa.hybrid.api.IHybridService";
                break;
            case -876157664:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.FeedCommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommonFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.FeedCommonService";
                break;
            case -875578063:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.secapi.ISecApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SecApiImpl());
                str = "com.ss.android.ugc.aweme.secapi.ISecApi";
                break;
            case -833034189:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceLiveServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService";
                break;
            case -832100041:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BusinessEcomSparkMatcherProvider());
                str = "com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService";
                break;
            case -826855070:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PitayaFeatureCenterServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService";
                break;
            case -813299095:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.video.IOneMinuteH5PreloadServiceImpl")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new OneMinuteH5PreloadServiceImpl());
                str = "com.ss.android.ugc.aweme.services.video.IOneMinuteH5PreloadServiceImpl";
                break;
            case -809420689:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ImageHeaderConfigImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig";
                break;
            case -780081387:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EasyNavigationExperimentServiceImpl());
                str = "com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService";
                break;
            case -765690135:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceShowcaseService());
                str = "com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService";
                break;
            case -763037313:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.FindTargetScopeFailFasterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FindTargetScopeFailFasterServiceImpl());
                str = "com.ss.android.ugc.aweme.performanceopt.api.FindTargetScopeFailFasterService";
                break;
            case -760523568:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.PerformanceMainService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PerformanceMainServiceImpl());
                str = "com.ss.android.ugc.aweme.PerformanceMainService";
                break;
            case -753764956:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.i18n.xbridge.IECommerceXBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceXBridgeService());
                str = "com.ss.android.ugc.aweme.i18n.xbridge.IECommerceXBridgeService";
                break;
            case -750502703:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkInitService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BenchmarkInitService());
                str = "com.ss.android.ugc.aweme.bl.IBenchmarkInitService";
                break;
            case -742818450:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.check.IAutoSoundCheckService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AutoSoundCheckService());
                str = "com.ss.android.ugc.aweme.check.IAutoSoundCheckService";
                break;
            case -738010642:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IPoiService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PoiServiceImpl());
                str = "com.ss.android.ugc.aweme.poi_api.service.IPoiService";
                break;
            case -733321193:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdWebJumpInterceptor());
                str = "com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor";
                break;
            case -729814797:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IBindService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BindService());
                str = "com.ss.android.ugc.aweme.IBindService";
                break;
            case -727390069:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.cache.IFeedApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedApiService());
                str = "com.ss.android.ugc.aweme.feed.cache.IFeedApi";
                break;
            case -709173037:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.popularfeed.service.IPopularFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PopularFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.popularfeed.service.IPopularFeedService";
                break;
            case -707368300:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IFestivalService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FestivalService());
                str = "com.ss.android.ugc.aweme.port.in.IFestivalService";
                break;
            case -687432460:
                if (!cls.getName().equals("com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EditRootSceneFactoryDelegate());
                str = "com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory";
                break;
            case -686038136:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentBannerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentBannerServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPaidContentBannerService";
                break;
            case -683664386:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.PagingScrollSettingApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PagingScrollSettingApiImpl());
                str = "com.ss.android.ugc.aweme.performanceopt.api.PagingScrollSettingApi";
                break;
            case -679535832:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.IServerPortraitService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ServerPortraitCollections());
                str = "com.ss.android.ugc.aweme.requestcombine.IServerPortraitService";
                break;
            case -668519111:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PushSettingServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService";
                break;
            case -653943499:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LegacyCommercializeServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService";
                break;
            case -639974224:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BaAutoMessageServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService";
                break;
            case -631517313:
                if (!cls.getName().equals("com.ss.android.elearning.lingo.roma.RomaHostService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RomaServiceImpl());
                str = "com.ss.android.elearning.lingo.roma.RomaHostService";
                break;
            case -629545899:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.topic.book.IBookTokService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BookTokServiceImpl());
                str = "com.ss.android.ugc.aweme.topic.book.IBookTokService";
                break;
            case -624802067:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.topic.movie.IMovieTokService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MovieTokServiceImpl());
                str = "com.ss.android.ugc.aweme.topic.movie.IMovieTokService";
                break;
            case -607424883:
                if (!cls.getName().equals("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CustomActivityOnCrashServiceImpl());
                str = "com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService";
                break;
            case -607162983:
                if (!cls.getName().equals("com.bytedance.lobby.ILobbyNonceGenerator")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LobbyNonceGenerator());
                str = "com.bytedance.lobby.ILobbyNonceGenerator";
                break;
            case -591513510:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.audiosdk.IAudioSDKABLegoLaunchTaskApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AudioSDKABLegoLauncherTaskImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.audiosdk.IAudioSDKABLegoLaunchTaskApi";
                break;
            case -587014433:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveVersionCodeProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LiveVersionCodeProvider());
                str = "com.ss.android.ugc.aweme.live.ILiveVersionCodeProvider";
                break;
            case -582786788:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.journey.INewUserMainModuleService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NewUserMainModuleService());
                str = "com.ss.android.ugc.aweme.journey.INewUserMainModuleService";
                break;
            case -572575565:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.edit.IReplaceMusicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ReplaceMusicServiceImpl());
                str = "com.ss.android.ugc.aweme.services.edit.IReplaceMusicService";
                break;
            case -570098893:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.interceptor.IChildHookService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ChildHookServiceImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.interceptor.IChildHookService";
                break;
            case -553887713:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RecommendFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService";
                break;
            case -552914389:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TiktokShortcutManager());
                str = "com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService";
                break;
            case -552826208:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TranslationLangKevaServiceImpl());
                str = "com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService";
                break;
            case -552323009:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new Social2TabServiceImpl());
                str = "com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService";
                break;
            case -550872997:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MainServiceHelperImpl());
                str = "com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper";
                break;
            case -544454424:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MainFragmentCacheExpServiceImpl());
                str = "com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService";
                break;
            case -543803045:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new Social2TabRouteService());
                str = "com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService";
                break;
            case -537976318:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IPreLoginHandleService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PreLoginHandleService());
                str = "com.ss.android.ugc.aweme.IPreLoginHandleService";
                break;
            case -497853080:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MeasurementServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService";
                break;
            case -483848579:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceToolsMissionService());
                str = "com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService";
                break;
            case -463217782:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdComponentServiceImpl());
                str = "com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService";
                break;
            case -451157663:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MixActivityContainerProvider());
                str = "com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider";
                break;
            case -443532771:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RelationUserCardInternalService());
                str = "com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService";
                break;
            case -432557074:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LogInterceptImpl());
                str = "com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi";
                break;
            case -413830924:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SplitVideoServiceImpl());
                str = "com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService";
                break;
            case -413321057:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IToolsBusinessService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ToolsBusinessServiceImpl());
                str = "com.ss.android.ugc.aweme.IToolsBusinessService";
                break;
            case -405727142:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommentStickerRecordServiceImpl());
                str = "com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService";
                break;
            case -405287941:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ug.dynamicresource.INicknameExperiment")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NicknameSignupExperiment());
                str = "com.ss.android.ugc.aweme.ug.dynamicresource.INicknameExperiment";
                break;
            case -401510911:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartFeedAdUIServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService";
                break;
            case -400186202:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPostModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PostModeServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPostModeService";
                break;
            case -381018931:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoveryService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.discover.impl.DiscoveryServiceImpl());
                str = "com.ss.android.ugc.aweme.discover.IDiscoveryService";
                break;
            case -360388275:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MLDataCenterServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.IMLDataCenterService";
                break;
            case -345693070:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.network.spi.INetworkStandardApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkStandardApiImpl());
                str = "com.ss.android.ugc.aweme.network.spi.INetworkStandardApi";
                break;
            case -342788414:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INowCommonFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowCommonFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.service.INowCommonFeedService";
                break;
            case -338797404:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.watermark.IWaterMarkService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WaterMarkServiceImpl());
                str = "com.ss.android.ugc.aweme.services.watermark.IWaterMarkService";
                break;
            case -312331731:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ITopicFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TopicFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.ITopicFeedService";
                break;
            case -297907320:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.trending.service.ITrendingExperimentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TrendingExperimentServiceImpl());
                str = "com.ss.android.ugc.aweme.trending.service.ITrendingExperimentService";
                break;
            case -296051311:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.ISettingManagerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SettingManagerServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.ISettingManagerService";
                break;
            case -292562418:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.share.gif.IGifShareService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GifShareService());
                str = "com.ss.android.ugc.aweme.share.gif.IGifShareService";
                break;
            case -273825195:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PitayaServiceManager());
                str = "com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger";
                break;
            case -254209258:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.music.IEditMusicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EditMusicServiceImpl());
                str = "com.ss.android.ugc.aweme.music.IEditMusicService";
                break;
            case -230404545:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IAccountBindingsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountBindingsService());
                str = "com.ss.android.ugc.aweme.IAccountBindingsService";
                break;
            case -227287719:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.api.IBootLogApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IBootLogImpl());
                str = "com.ss.android.ugc.aweme.api.IBootLogApi";
                break;
            case -195560546:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.sync.IByteSyncInitProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ByteSyncInitProviderImpl());
                str = "com.ss.android.ugc.aweme.sync.IByteSyncInitProvider";
                break;
            case -174647117:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.translation.service.ITranslationService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TranslationServiceImpl());
                str = "com.ss.android.ugc.aweme.translation.service.ITranslationService";
                break;
            case -166706490:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.IPromoteEntryCheckService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PromoteEntryCheckServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.IPromoteEntryCheckService";
                break;
            case -164713608:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchAdMainService());
                str = "com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService";
                break;
            case -154939370:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdHybridContainerManager());
                str = "com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager";
                break;
            case -152874787:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcUgVSAService());
                str = "com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService";
                break;
            case -134854161:
                if (!cls.getName().equals("com.aweme.kvstorage.spi.ISharedPreferencesProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SharedPreferencesProvider());
                str = "com.aweme.kvstorage.spi.ISharedPreferencesProvider";
                break;
            case -123206016:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISettingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SettingServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.services.ISettingService";
                break;
            case -115845173:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IAVServiceProxy")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AVServiceProxyImpl());
                str = "com.ss.android.ugc.aweme.services.IAVServiceProxy";
                break;
            case -99973433:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedSkylightServiceProviderImpl());
                str = "com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider";
                break;
            case -77732678:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TpcConsentServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService";
                break;
            case -66305606:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdLightWebPageOpenUtils());
                str = "com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen";
                break;
            case -56944482:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.service.ILanguageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.setting.services.LanguageService());
                str = "com.ss.android.ugc.aweme.main.service.ILanguageService";
                break;
            case -46995324:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.spi.IHomePageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HomePageServiceImpl());
                str = "com.ss.android.ugc.aweme.spi.IHomePageService";
                break;
            case -34027969:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IAutobackupService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AutobackupService());
                str = "com.ss.android.ugc.aweme.IAutobackupService";
                break;
            case -4982035:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchAdEventLogger());
                str = "com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger";
                break;
            case 19092560:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowPostDeleteServiceImpl());
                str = "com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService";
                break;
            case 19988027:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BridgeScanHandlerImpl());
                str = "com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler";
                break;
            case 21995517:
                if (!cls.getName().equals("com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RuleEngineServiceImpl());
                str = "com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService";
                break;
            case 26004728:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.HydraHDRAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HydraHDR());
                str = "com.bytedance.bmf_mods_api.HydraHDRAPI";
                break;
            case 31921668:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.favorites.service.IFavoriteService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl());
                str = "com.ss.android.ugc.aweme.favorites.service.IFavoriteService";
                break;
            case 42826893:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IWebViewTweaker")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WebViewTweakerService());
                str = "com.ss.android.ugc.aweme.framework.services.IWebViewTweaker";
                break;
            case 67799503:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.ICustomAnchorViewService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CustomAnchorViewServicImpl());
                str = "com.ss.android.ugc.aweme.anchor.service.ICustomAnchorViewService";
                break;
            case 70052694:
                if (!cls.getName().equals("com.ss.android.elearning.lingo.gecko.GeckoAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GeckoService());
                str = "com.ss.android.elearning.lingo.gecko.GeckoAPI";
                break;
            case 87343796:
                if (!cls.getName().equals("com.benchmark.IBTCHConfiguration")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BTCHConfigurationImpl());
                str = "com.benchmark.IBTCHConfiguration";
                break;
            case 96990739:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShakeEggService());
                str = "com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService";
                break;
            case 108785856:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.sticker.InteractStickerContainerGetterApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StickerContainerService());
                str = "com.ss.android.ugc.aweme.sticker.InteractStickerContainerGetterApi";
                break;
            case 121909881:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IEditorProIconService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EditorProIconServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IEditorProIconService";
                break;
            case 122036734:
                if (!cls.getName().equals("com.ss.android.ugc.tiktok.addyours.service.IAddYoursService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AddYoursServiceImpl());
                str = "com.ss.android.ugc.tiktok.addyours.service.IAddYoursService";
                break;
            case 127179552:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new OptimizerHelperServiceImpl());
                str = "com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService";
                break;
            case 129889384:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IVEABService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VEABServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IVEABService";
                break;
            case 154527039:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MobLaunchImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi";
                break;
            case 159071507:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tag.service.ITagService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TagServiceImpl());
                str = "com.ss.android.ugc.aweme.tag.service.ITagService";
                break;
            case 163116135:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoPlayTaskManager());
                str = "com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager";
                break;
            case 168006665:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceHybridBottomSheetDialogFragmentBehaviorImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior";
                break;
            case 168408294:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.live.ISearchCardLiveService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchCardLiveService());
                str = "com.ss.android.ugc.aweme.live.ISearchCardLiveService";
                break;
            case 169477130:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.base.storage.IStorageCleanService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StorageCleanServiceImpl());
                str = "com.ss.android.ugc.aweme.base.storage.IStorageCleanService";
                break;
            case 170335309:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.video.ICreativePageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CreativePageService());
                str = "com.ss.android.ugc.aweme.services.video.ICreativePageService";
                break;
            case 171919810:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TooltipApplicabilityService());
                str = "com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService";
                break;
            case 188444379:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.IFeedSharePlayInfoHelperProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedSharePlayInfoHelperProvider());
                str = "com.ss.android.ugc.aweme.search.IFeedSharePlayInfoHelperProvider";
                break;
            case 189816622:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AuthorizeCommonService());
                str = "com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService";
                break;
            case 193978339:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AgeGateServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService";
                break;
            case 197041894:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.SmartOHRService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartOHRServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.SmartOHRService";
                break;
            case 206207455:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceRNToLynxConfigService());
                str = "com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService";
                break;
            case 220135637:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IRetrofitService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RetrofitService());
                str = "com.ss.android.ugc.aweme.framework.services.IRetrofitService";
                break;
            case 221073588:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IAccountMainService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountMainServiceImpl());
                str = "com.ss.android.ugc.aweme.IAccountMainService";
                break;
            case 249088543:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new KidsMusicEntrance());
                str = "com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance";
                break;
            case 249161876:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TopViewAdEventLogger());
                str = "com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger";
                break;
            case 257802734:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MRCManager());
                str = "com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager";
                break;
            case 263685118:
                if (!cls.getName().equals("com.bytedance.tpsw.api.vk.IVKService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VKService());
                str = "com.bytedance.tpsw.api.vk.IVKService";
                break;
            case 271148800:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IMandatoryLoginService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MandatoryLoginService());
                str = "com.ss.android.ugc.aweme.IMandatoryLoginService";
                break;
            case 294068060:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.share.ShareH5Service")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShareH5ServiceImpl());
                str = "com.ss.android.ugc.aweme.share.ShareH5Service";
                break;
            case 299769180:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ui.IEcomImageMonitor")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcomImageMonitorImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.ui.IEcomImageMonitor";
                break;
            case 311680729:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceToolsTcmServiceImpl());
                str = "com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService";
                break;
            case 315727851:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.inbox.InboxEasyNavigationPageNameService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InboxEasyNavigationPageNameServiceImpl());
                str = "com.ss.android.ugc.aweme.inbox.InboxEasyNavigationPageNameService";
                break;
            case 316475372:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.story.IStoryService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StoryServiceImpl());
                str = "com.ss.android.ugc.aweme.story.IStoryService";
                break;
            case 324478519:
                if (!cls.getName().equals("com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NonLoginNotifyService());
                str = "com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi";
                break;
            case 324722410:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IAnalyticsDetailService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AnalyticsDetailService());
                str = "com.ss.android.ugc.aweme.service.IAnalyticsDetailService";
                break;
            case 326604455:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.external.ICommerceToolsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceToolsService());
                str = "com.ss.android.ugc.aweme.services.external.ICommerceToolsService";
                break;
            case 327622412:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IPasskeyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PasskeyService());
                str = "com.ss.android.ugc.aweme.IPasskeyService";
                break;
            case 355979482:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IAccountInitializer")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountInitializer());
                str = "com.ss.android.ugc.aweme.IAccountInitializer";
                break;
            case 357894987:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ConfigCenterCenterBridgeImpl());
                str = "com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi";
                break;
            case 361159208:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.web.IGeckoXClientManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GeckoXClientManager());
                str = "com.ss.android.ugc.aweme.web.IGeckoXClientManager";
                break;
            case 377237768:
                if (!cls.getName().equals("com.bytedance.pumbaa.hybrid.rasp.api.IRaspService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RaspServiceImpl());
                str = "com.bytedance.pumbaa.hybrid.rasp.api.IRaspService";
                break;
            case 380734020:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INowLimitService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowLimitService());
                str = "com.ss.android.ugc.aweme.service.INowLimitService";
                break;
            case 381707090:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdReRankServiceManager());
                str = "com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService";
                break;
            case 394604807:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.net.INetReleaseInterceptor")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetWorkSpeedInterceptor());
                str = "com.ss.android.ugc.aweme.net.INetReleaseInterceptor";
                break;
            case 402978358:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceToolsChallengeService());
                str = "com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService";
                break;
            case 404162146:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchResultStatisticsImpl());
                str = "com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics";
                break;
            case 414350146:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.comment.services.IKeyboardService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new KeyboardServiceImpl());
                str = "com.ss.android.ugc.aweme.comment.services.IKeyboardService";
                break;
            case 415807143:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorRecordPageFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ExteriorRecordPageFactoryImpl());
                str = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorRecordPageFactory";
                break;
            case 420130094:
                if (!cls.getName().equals("com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DoubleColorBallAnimationViewExperimentServiceImpl());
                str = "com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService";
                break;
            case 434996455:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.IAnchorListService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AnchorListServiceImpl());
                str = "com.ss.android.ugc.aweme.anchor.service.IAnchorListService";
                break;
            case 453717049:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ReportAwemeManager());
                str = "com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager";
                break;
            case 457276431:
                if (!cls.getName().equals("com.lingo.caption.api.LingoCaptionApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LingoCaptionImpl());
                str = "com.lingo.caption.api.LingoCaptionApi";
                break;
            case 477254501:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.VqscoreLiveAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VqscoreLive());
                str = "com.bytedance.bmf_mods_api.VqscoreLiveAPI";
                break;
            case 483183455:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.ui.INewUserProgressBarService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NewUserProgressBarManager());
                str = "com.ss.android.ugc.aweme.feed.ui.INewUserProgressBarService";
                break;
            case 489980098:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AudioWatermarkServiceImpl());
                str = "com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService";
                break;
            case 493767622:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceMediaOutService());
                str = "com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService";
                break;
            case 501025197:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IExternalService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AVExternalServiceImpl());
                str = "com.ss.android.ugc.aweme.services.IExternalService";
                break;
            case 507480096:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedBackDialogManagerService());
                str = "com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager";
                break;
            case 509545079:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoLengthChecker());
                str = "com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker";
                break;
            case 514480344:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ug.brand.IBrandService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BrandServiceImpl());
                str = "com.ss.android.ugc.aweme.ug.brand.IBrandService";
                break;
            case 516119261:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.share.ShareDependService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShareDependServiceImpl());
                str = "com.ss.android.ugc.aweme.share.ShareDependService";
                break;
            case 524921666:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.DetailFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DetailFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.DetailFeedService";
                break;
            case 527997931:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdCommentDependImpl());
                str = "com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend";
                break;
            case 530557379:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.utils.IAdOpenHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdOpenHelperImpl());
                str = "com.ss.android.ugc.aweme.utils.IAdOpenHelper";
                break;
            case 531388658:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AppsflyerImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi";
                break;
            case 532654456:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.sticker.AddYoursModelCheckServiceApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AddYoursModelCheckService());
                str = "com.ss.android.ugc.aweme.sticker.AddYoursModelCheckServiceApi";
                break;
            case 535970203:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.sticker.ICaptionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.shortvideo.subtitle.CaptionServiceImpl());
                str = "com.ss.android.ugc.aweme.services.sticker.ICaptionService";
                break;
            case 548577086:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PNSDeviceConsentServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService";
                break;
            case 574390740:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INowFeedPreLoadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowFeedPreLoadServiceImpl());
                str = "com.ss.android.ugc.aweme.service.INowFeedPreLoadService";
                break;
            case 581633627:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PageNodeMonitorService());
                str = "com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService";
                break;
            case 582757776:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.accountxbridge.IAccountBDXBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountBDXBridgeService());
                str = "com.ss.android.ugc.aweme.accountxbridge.IAccountBDXBridgeService";
                break;
            case 596401653:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommercializeAdServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService";
                break;
            case 596657451:
                if (!cls.getName().equals("com.bytedance.ies.ugc.appcontext.AppBuildConfig")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AwemeAppBuildConfig());
                str = "com.bytedance.ies.ugc.appcontext.AppBuildConfig";
                break;
            case 602001356:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.router.IStrategyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StrategyService());
                str = "com.ss.android.ugc.aweme.ecommerce.router.IStrategyService";
                break;
            case 607980095:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IGuestModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GuestModeServiceImpl());
                str = "com.ss.android.ugc.aweme.IGuestModeService";
                break;
            case 612752120:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ContentLanguageServiceImpl());
                str = "com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService";
                break;
            case 623636593:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UploadByFileService());
                str = "com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload";
                break;
            case 631540268:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.IAdCommentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdCommentService());
                str = "com.ss.android.ugc.aweme.ad.comment.IAdCommentService";
                break;
            case 633152030:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountNonceUtilImpl());
                str = "com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil";
                break;
            case 642369832:
                if (!cls.getName().equals("com.bytedance.ies.web.jsbridge2.IJsBridge2Config")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new JsBridge2ConfigImpl());
                str = "com.bytedance.ies.web.jsbridge2.IJsBridge2Config";
                break;
            case 659583746:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.profile.mutual.IProfileShowMutualTabService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProfileShowMutualTabServiceImpl());
                str = "com.ss.android.ugc.aweme.profile.mutual.IProfileShowMutualTabService";
                break;
            case 663566436:
                if (!cls.getName().equals("com.ss.android.ugc.musicprovider.IMusicProviderConfig")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MusicProviderConfigProxy());
                str = "com.ss.android.ugc.musicprovider.IMusicProviderConfig";
                break;
            case 665909581:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.assem.IAssemblerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdAssemblerServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.assem.IAssemblerService";
                break;
            case 674144051:
                if (!cls.getName().equals("com.ss.android.legoapi.freso.IFrescoLegoTaskApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FrescoLegoTaskImpl());
                str = "com.ss.android.legoapi.freso.IFrescoLegoTaskApi";
                break;
            case 679237247:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.dm.IDMPublishService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DMPublishServiceImpl());
                str = "com.ss.android.ugc.aweme.services.dm.IDMPublishService";
                break;
            case 685835610:
                if (!cls.getName().equals("com.ss.android.elearning.lingo.tracker.ElTrackerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ElTrackerServiceImpl());
                str = "com.ss.android.elearning.lingo.tracker.ElTrackerService";
                break;
            case 698926204:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new IRecommendUsersServiceImpl());
                str = "com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService";
                break;
            case 700448755:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountShowConfirmPromptServiceImpl());
                str = "com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi";
                break;
            case 707572774:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new KidsCommonServiceImpl());
                str = "com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService";
                break;
            case 712436972:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.sticker.IStickerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StickerServiceImpl());
                str = "com.ss.android.ugc.aweme.sticker.IStickerService";
                break;
            case 723787770:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new QRCodePermissionActivityStarter());
                str = "com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter";
                break;
            case 727340201:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.network.INetwork")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkService());
                str = "com.ss.android.ugc.aweme.network.INetwork";
                break;
            case 729554431:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CustomCheckService());
                hashSet.add(new RomaCheckService());
                str = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService";
                break;
            case 730432555:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IUgAllService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UgAllServiceImpl());
                str = "com.ss.android.ugc.aweme.IUgAllService";
                break;
            case 735010773:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HybridRegistryProvider());
                str = "com.ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider";
                break;
            case 741106177:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BenchmarkServiceImpl());
                str = "com.ss.android.ugc.aweme.bl.IBenchmarkService";
                break;
            case 750430875:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.album.IToolsAlbumService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ToolsAlbumServiceImpl());
                str = "com.ss.android.ugc.aweme.album.IToolsAlbumService";
                break;
            case 755445474:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IAttributionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AttributionService());
                str = "com.ss.android.ugc.aweme.service.IAttributionService";
                break;
            case 761913918:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.label.IMutualLabelTextFactory")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MutualLabelTextFactory());
                str = "com.ss.android.ugc.aweme.relation.label.IMutualLabelTextFactory";
                break;
            case 767497026:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.kids.liked.FavoriteServiceImpl());
                str = "com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService";
                break;
            case 772470967:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SocialPublishBridgeServiceImpl());
                str = "com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService";
                break;
            case 797774759:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceCommonServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService";
                break;
            case 814572388:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IKnownWeakPasswordService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new KnownWeakPasswordService());
                str = "com.ss.android.ugc.aweme.IKnownWeakPasswordService";
                break;
            case 831845489:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IPasskeyPopUpHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PasskeyPopUpHelper());
                str = "com.ss.android.ugc.aweme.IPasskeyPopUpHelper";
                break;
            case 834678077:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PushLaunchPageAssistantService());
                str = "com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService";
                break;
            case 835302924:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdLandPageRealtimeResourceModule());
                str = "com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule";
                break;
            case 844437951:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.setting.api.ISettingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.kids.setting.SettingServiceImpl());
                str = "com.ss.android.ugc.aweme.kids.setting.api.ISettingService";
                break;
            case 856538528:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceLiveSettingsServiceImpl());
                str = "com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService";
                break;
            case 864194132:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.IAwemeApplicationService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AwemeApplicationServiceImpl());
                str = "com.ss.android.ugc.aweme.app.IAwemeApplicationService";
                break;
            case 875255812:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.ui.IFeedRecommendFragmentProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedRecommendFragmentProvider());
                str = "com.ss.android.ugc.aweme.feed.ui.IFeedRecommendFragmentProvider";
                break;
            case 892608820:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MallServiceManager());
                str = "com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager";
                break;
            case 895164503:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.services.IRegionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RegionService());
                str = "com.ss.android.ugc.aweme.app.services.IRegionService";
                break;
            case 907081166:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.utils.ICommercializeSearchMainService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommercializeSearchMainServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.utils.ICommercializeSearchMainService";
                break;
            case 913277804:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.profile.IProfileService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProfileServiceImpl());
                str = "com.ss.android.ugc.aweme.profile.IProfileService";
                break;
            case 913381457:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.base.pdp.adapter.IPdpListUIRegisterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommonUIRegister());
                hashSet.add(new PdpBrickUIRegister());
                hashSet.add(new BundleDealUIRegister());
                hashSet.add(new BuyTogetherUIRegister());
                hashSet.add(new HeaderImageUIRegister());
                hashSet.add(new ProductInfoUIRegister());
                hashSet.add(new ProductPropUIRegister());
                hashSet.add(new PromotionUIRegister());
                hashSet.add(new PdpReviewUIRegister());
                hashSet.add(new PdpServiceUIRegister());
                hashSet.add(new ShopProfileUIRegister());
                hashSet.add(new SizeGuideUIRegister());
                hashSet.add(new SkuUIRegister());
                str = "com.ss.android.ugc.aweme.ecommerce.base.pdp.adapter.IPdpListUIRegisterService";
                break;
            case 938138167:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.i18n.xbridge.ICommerceXBridgetService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceXBridgetServiceImpl());
                str = "com.ss.android.ugc.aweme.i18n.xbridge.ICommerceXBridgetService";
                break;
            case 941303398:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.ISearchService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SearchServiceImpl());
                str = "com.ss.android.ugc.aweme.search.ISearchService";
                break;
            case 956329375:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SplashSettingServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService";
                break;
            case 983252254:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPhotoViewModel")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PhotoViewModelImpl());
                str = "com.ss.android.ugc.aweme.service.IPhotoViewModel";
                break;
            case 988528279:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IAccountHelperService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountHelperService());
                str = "com.ss.android.ugc.aweme.services.IAccountHelperService";
                break;
            case 997089185:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.internal.IInternalCommerceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AVCommerceServiceImpl());
                str = "com.ss.android.ugc.aweme.internal.IInternalCommerceService";
                break;
            case 1000535180:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.stitch.IStitchService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StitchServiceImpl());
                str = "com.ss.android.ugc.aweme.services.stitch.IStitchService";
                break;
            case 1002351933:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SettingsRequestApiImpl());
                str = "com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi";
                break;
            case 1018751923:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SplashAdServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService";
                break;
            case 1020813802:
                if (!cls.getName().equals("com.bytedance.pumbaa.api.IPumbaaService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PumbaaServiceImpl());
                str = "com.bytedance.pumbaa.api.IPumbaaService";
                break;
            case 1031729450:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DefaultStoryForwardServiceImpl());
                str = "com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService";
                break;
            case 1038823878:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.api.IFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedServiceImpl());
                str = "com.ss.android.ugc.aweme.api.IFeedService";
                break;
            case 1040233401:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.webview.IWebViewInlineJSInjectService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WebViewInlineJSInjectServiceImpl());
                str = "com.ss.android.ugc.aweme.webview.IWebViewInlineJSInjectService";
                break;
            case 1045451100:
                if (!cls.getName().equals("com.bytedance.touchpoint.api.ITouchPointService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TouchPointServiceImpl());
                str = "com.bytedance.touchpoint.api.ITouchPointService";
                break;
            case 1053771019:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.NoiseDetectAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NoiseDetect());
                str = "com.bytedance.bmf_mods_api.NoiseDetectAPI";
                break;
            case 1077818494:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PdpCardBridgeServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService";
                break;
            case 1087518537:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.strategy.api.IStrategyApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StrategyImpl());
                str = "com.ss.android.ugc.aweme.strategy.api.IStrategyApi";
                break;
            case 1100609238:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceMediaServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService";
                break;
            case 1109873977:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveHostOuterService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LiveHostOuterService());
                str = "com.ss.android.ugc.aweme.live.ILiveHostOuterService";
                break;
            case 1122426817:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HomepageExperimentServiceImpl());
                str = "com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService";
                break;
            case 1141291340:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ComplianceSettingsServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService";
                break;
            case 1153825525:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.trace.ITraceLogWrapApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TraceLogWrapApiImpl());
                str = "com.ss.android.ugc.aweme.trace.ITraceLogWrapApi";
                break;
            case 1159930051:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.ColorHistAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ColorHist());
                str = "com.bytedance.bmf_mods_api.ColorHistAPI";
                break;
            case 1170265621:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentCollectionPlayProgressServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService";
                break;
            case 1181694823:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.IDownloadAwemeVideoService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new DownloadAwemeVideoServiceImpl());
                str = "com.ss.android.ugc.aweme.tools.IDownloadAwemeVideoService";
                break;
            case 1205724034:
                if (!cls.getName().equals("com.bytedance.geckox.IGeckoGlobalInit")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GeckoGlobalInitServiceImpl());
                str = "com.bytedance.geckox.IGeckoGlobalInit";
                break;
            case 1206059085:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.im.service.service.IStoryIMService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StoryIMService());
                str = "com.ss.android.ugc.aweme.im.service.service.IStoryIMService";
                break;
            case 1215758015:
                if (!cls.getName().equals("com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UpdateRegisterKeyImpl());
                str = "com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey";
                break;
            case 1218105312:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.label.IAvatarUnionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AvatarUnionServiceImpl());
                str = "com.ss.android.ugc.aweme.relation.label.IAvatarUnionService";
                break;
            case 1229038214:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IAppUpdateService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AppUpdateService());
                str = "com.ss.android.ugc.aweme.setting.services.IAppUpdateService";
                break;
            case 1245646165:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceLockStickerServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService";
                break;
            case 1246952635:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IClearCacheService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ClearCacheService());
                str = "com.ss.android.ugc.aweme.IClearCacheService";
                break;
            case 1248689867:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdPhotoModeServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService";
                break;
            case 1260913774:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.translation.service.ITranslationKevaService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TranslationKevaServiceImpl());
                str = "com.ss.android.ugc.aweme.translation.service.ITranslationKevaService";
                break;
            case 1271555322:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.live.assem.IFollowWidgetService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FollowWidgetServiceImpl());
                str = "com.ss.android.ugc.aweme.live.assem.IFollowWidgetService";
                break;
            case 1275746819:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IWebCreationPromoteService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WebCreationPromoteServiceImpl());
                str = "com.ss.android.ugc.aweme.IWebCreationPromoteService";
                break;
            case 1278114115:
                if (!cls.getName().equals("com.ss.android.elearning.lingo.context.ByteLingoService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ByteLingoServiceImpl());
                str = "com.ss.android.elearning.lingo.context.ByteLingoService";
                break;
            case 1281149561:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdLandPageSurveyServiceImpl());
                str = "com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService";
                break;
            case 1305629660:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ColdLaunchRequestCombinerImpl());
                str = "com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner";
                break;
            case 1306864219:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidSeriesLiveApiService());
                str = "com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService";
                break;
            case 1309274556:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceAdExperienceServiceImpl());
                str = "com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService";
                break;
            case 1320692621:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new StoryDistributionService());
                str = "com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService";
                break;
            case 1321158748:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.ISurveyConfigService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SurveyConfigServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.ISurveyConfigService";
                break;
            case 1324297503:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.profile.api.IProfileService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.kids.profile.ProfileServiceImpl());
                str = "com.ss.android.ugc.aweme.kids.profile.api.IProfileService";
                break;
            case 1361790301:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcUgPopupService());
                str = "com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService";
                break;
            case 1367264530:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.task.ITaskApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TaskServiceImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.task.ITaskApi";
                break;
            case 1377752390:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartDataTrackerServiceImpl());
                str = "com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService";
                break;
            case 1382041287:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.trending.service.ITrendingFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TrendingDetailServiceImpl());
                str = "com.ss.android.ugc.aweme.trending.service.ITrendingFeedService";
                break;
            case 1385201501:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.utils.GsonProvider")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new GsonHolder());
                str = "com.ss.android.ugc.aweme.utils.GsonProvider";
                break;
            case 1386305900:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.internal.IAVTagService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AVTagServiceImpl());
                str = "com.ss.android.ugc.aweme.internal.IAVTagService";
                break;
            case 1391445989:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.login.ILoginProxy")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LoginProxyImpl());
                str = "com.ss.android.ugc.aweme.login.ILoginProxy";
                break;
            case 1394926633:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentAnchorAttachServiceImpl());
                str = "com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService";
                break;
            case 1418553515:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.services.ILauncherService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LauncherService());
                str = "com.ss.android.ugc.aweme.app.services.ILauncherService";
                break;
            case 1428110088:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FriendsFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService";
                break;
            case 1433002188:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EffectCreatorServiceImpl());
                str = "com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService";
                break;
            case 1439372287:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.landpage.IAdLandPageService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdLandPageServiceImpl());
                str = "com.ss.android.ugc.aweme.landpage.IAdLandPageService";
                break;
            case 1443402605:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.login.ILoginUtilsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LoginUtilsServiceImpl());
                str = "com.ss.android.ugc.aweme.login.ILoginUtilsService";
                break;
            case 1469243816:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.search.ecommerce.IECommerceGeneralSearchWidgetService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceGeneralSearchWidgetServiceImpl());
                str = "com.ss.android.ugc.aweme.search.ecommerce.IECommerceGeneralSearchWidgetService";
                break;
            case 1480432587:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdFeInteractionImpl());
                str = "com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction";
                break;
            case 1487002875:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdsPreviewServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService";
                break;
            case 1510855899:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.share.downloadv2.IDownloadService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.trill.download.DownloadServiceImpl());
                str = "com.ss.android.ugc.aweme.share.downloadv2.IDownloadService";
                break;
            case 1520768300:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.hybridkit.IHybridKitService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new HybridKitTaskImpl());
                str = "com.ss.android.ugc.aweme.hybridkit.IHybridKitService";
                break;
            case 1526593817:
                if (!cls.getName().equals("com.bytedance.pumbaa.network.adapter.api.INetworkService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NetworkServiceImpl());
                str = "com.bytedance.pumbaa.network.adapter.api.INetworkService";
                break;
            case 1542251913:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcommerceStoreTechLogServiceImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService";
                break;
            case 1545384024:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SettingsRequestServiceImpl());
                str = "com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService";
                break;
            case 1568312259:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SmartCheckIntegrateImpl());
                str = "com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate";
                break;
            case 1575532579:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcUgNewInstallService());
                str = "com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService";
                break;
            case 1595185874:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.account.IAccountApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AccountImpl());
                str = "com.ss.android.ugc.aweme.launcher.service.account.IAccountApi";
                break;
            case 1596477600:
                if (!cls.getName().equals("com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PerformanceServiceImpl());
                str = "com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService";
                break;
            case 1601051003:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SyncNicknameAndUsernamePopUpHelper());
                str = "com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper";
                break;
            case 1627479367:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ShoppingAdsServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService";
                break;
            case 1649339714:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.api.IFeedModuleService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FeedModuleServiceImpl());
                str = "com.ss.android.ugc.aweme.feed.api.IFeedModuleService";
                break;
            case 1660655893:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProfileDependentComponentImpl());
                str = "com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService";
                break;
            case 1674227107:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BanAppealServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService";
                break;
            case 1677969788:
                if (!cls.getName().equals("com.bytedance.bpea.core.IBPEALazyInit")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TTPSystemAPIInit());
                str = "com.bytedance.bpea.core.IBPEALazyInit";
                break;
            case 1678604719:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.DenoiseAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new Denoise());
                str = "com.bytedance.bmf_mods_api.DenoiseAPI";
                break;
            case 1696475259:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.web.service.IAdWebSpecialService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdWebSpecialService());
                str = "com.ss.android.ugc.aweme.web.service.IAdWebSpecialService";
                break;
            case 1698007431:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.kids.api.common.IKidsPolicyNoticeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new KidsPolicyNoticeServiceImp());
                str = "com.ss.android.ugc.aweme.kids.api.common.IKidsPolicyNoticeService";
                break;
            case 1701644943:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PortraitCenterInitServiceImpl());
                str = "com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService";
                break;
            case 1708382918:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VoiceConversionRecordService());
                str = "com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService";
                break;
            case 1713060419:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService";
                break;
            case 1713809708:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.INowDailyPushService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NowDailyPushService());
                str = "com.ss.android.ugc.aweme.service.INowDailyPushService";
                break;
            case 1723717660:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.app.IInitAllService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InitAllServiceImpl());
                str = "com.ss.android.ugc.aweme.app.IInitAllService";
                break;
            case 1724423012:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EComCustomThirdPartyBackRouter());
                str = "com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter";
                break;
            case 1727643984:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TTSVoiceRecordService());
                str = "com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService";
                break;
            case 1736159254:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IProfileBadgeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProfileBadgeServiceImpl());
                str = "com.ss.android.ugc.aweme.IProfileBadgeService";
                break;
            case 1736258028:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PaidContentAwareBannerServiceImpl());
                str = "com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService";
                break;
            case 1742963683:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessPublishService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BusinessPublishImpl());
                str = "com.ss.android.ugc.aweme.services.IBusinessPublishService";
                break;
            case 1745934054:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.BackgroundRunnableMonitorApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BackgroundRunnableMonitorApiImpl());
                str = "com.ss.android.ugc.aweme.performanceopt.api.BackgroundRunnableMonitorApi";
                break;
            case 1771368059:
                if (!cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRLutAPI")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoSRLut());
                str = "com.bytedance.bmf_mods_api.VideoSRLutAPI";
                break;
            case 1777438413:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EffectAnchorServiceImpl());
                str = "com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService";
                break;
            case 1784620411:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.router.view.IFallbackDetector")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new FallbackDetector());
                str = "com.ss.android.ugc.aweme.ecommerce.router.view.IFallbackDetector";
                break;
            case 1785165071:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ConsentFrameworkUserStateMachineHandler());
                hashSet.add(new GatekeeperUserStateMachineHandler());
                hashSet.add(new KidsUserStateMachineHandler());
                str = "com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler";
                break;
            case 1787636921:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PolicyNoticeServiceImpl());
                str = "com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService";
                break;
            case 1807554232:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.api.IMentionVideoApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MentionVideoService());
                str = "com.ss.android.ugc.aweme.api.IMentionVideoApi";
                break;
            case 1815079068:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.sticker.INatureGuideFragmentService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NatureGuideFragmentServiceImpl());
                str = "com.ss.android.ugc.aweme.services.sticker.INatureGuideFragmentService";
                break;
            case 1817215028:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new NotInterestedTutorialService());
                str = "com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService";
                break;
            case 1817711182:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IMovieReuseService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MovieReuseServiceImpl());
                str = "com.ss.android.ugc.aweme.tools.detail.IMovieReuseService";
                break;
            case 1839198709:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LiveParasiticModuleLaunchServicePromoteImpl());
                hashSet.add(new ILiveParasiticModuleLaunchServiceCommercializeImpl());
                hashSet.add(new ILiveParasiticModuleLaunchServiceECImpl());
                hashSet.add(new ILiveParasiticModuleLaunchServiceMonetizationImpl());
                hashSet.add(new com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl.ILiveParasiticModuleLaunchServiceECImpl());
                hashSet.add(new LiveBusinessParasiticModule());
                str = "com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService";
                break;
            case 1850722604:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.relation.label.IRelationLabelTextViewService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new RelationLabelTextViewServiceImpl());
                str = "com.ss.android.ugc.aweme.relation.label.IRelationLabelTextViewService";
                break;
            case 1850726550:
                if (!cls.getName().equals("com.ss.ugc.android.editor.components.base.api.IVideoCropService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new VideoCropService());
                str = "com.ss.ugc.android.editor.components.base.api.IVideoCropService";
                break;
            case 1866297976:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.port.in.IEmojiService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EmojiServiceImplDiff());
                str = "com.ss.android.ugc.aweme.port.in.IEmojiService";
                break;
            case 1873789179:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.external.IExternalAlbumService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AlbumServiceImpl());
                str = "com.ss.android.ugc.aweme.external.IExternalAlbumService";
                break;
            case 1874983828:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.api.IAnchorBusinessApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AnchorBusinessApiImpl());
                str = "com.ss.android.ugc.aweme.api.IAnchorBusinessApi";
                break;
            case 1886330729:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IUpdateSettingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UpdateSettingServiceImpl());
                str = "com.ss.android.ugc.aweme.setting.services.IUpdateSettingService";
                break;
            case 1890424291:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.IInboxRepostFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new InboxRepostFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.IInboxRepostFeedService";
                break;
            case 1893478097:
                if (!cls.getName().equals("com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ProviderConfigOutImpl());
                str = "com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut";
                break;
            case 1894760179:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TopVideoAdServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService";
                break;
            case 1896848879:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new PublishDrillServiceImpl());
                str = "com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService";
                break;
            case 1899558288:
                if (!cls.getName().equals("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new BAAnchorServiceImpl());
                str = "com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService";
                break;
            case 1913613454:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicAppAuthService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MusicAppAuthServiceImpl());
                str = "com.ss.android.ugc.aweme.music.service.IMusicAppAuthService";
                break;
            case 1932185006:
                if (!cls.getName().equals("com.ss.android.legoapi.ICrashSdkTaskApi")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CrashSdkTaskImpl());
                str = "com.ss.android.legoapi.ICrashSdkTaskApi";
                break;
            case 1939446823:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ug.brand.ITranssonicService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new TranssonicServiceImpl());
                str = "com.ss.android.ugc.aweme.ug.brand.ITranssonicService";
                break;
            case 1950388661:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ILandscapeViewModeGenerator")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LandscapeFeedViewModelGenerator());
                str = "com.ss.android.ugc.aweme.ILandscapeViewModeGenerator";
                break;
            case 1950599228:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new WebViewTTNetHandlerImp());
                str = "com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler";
                break;
            case 1967964191:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EmailConsentPageImageConfig());
                hashSet.add(new CommentFontConfig());
                hashSet.add(new WallpaperGuide1Config());
                hashSet.add(new WallpaperGuide2Config());
                hashSet.add(new InviteCardBackgroundConfig());
                hashSet.add(new QRCodeBottomLeftConfig());
                hashSet.add(new QRCodeBottomRightConfig());
                hashSet.add(new QRCodeConfig());
                hashSet.add(new QRCodeTopLeftConfig());
                hashSet.add(new QRCodeTopRightConfig());
                hashSet.add(new TTLogoBlackConfig());
                hashSet.add(new StoryWidgetGuideLottieConfig());
                hashSet.add(new PraiseGuideConfig());
                str = "com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig";
                break;
            case 2019274645:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommercializeFeedServiceImpl());
                str = "com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService";
                break;
            case 2023609189:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new MiniAppDependServiceImpl());
                str = "com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService";
                break;
            case 2037829402:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.qrcode.IQRCodeService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new QRCodeServiceImpl());
                str = "com.ss.android.ugc.aweme.qrcode.IQRCodeService";
                break;
            case 2054244205:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EcUgDeeplinkService());
                str = "com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService";
                break;
            case 2063435184:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EarphonePlayerControl());
                str = "com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService";
                break;
            case 2075319920:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.comment.ICommentFavoriteService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommentFavoriteServiceImpl());
                str = "com.ss.android.ugc.aweme.comment.ICommentFavoriteService";
                break;
            case 2078809113:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.ILibraryReuseService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LibraryReuseServiceImpl());
                str = "com.ss.android.ugc.aweme.tools.detail.ILibraryReuseService";
                break;
            case 2091106849:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.subpage.ILandPageFunctionModule")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceLandPageModuleImpl());
                str = "com.ss.android.ugc.aweme.ad.subpage.ILandPageFunctionModule";
                break;
            case 2106665826:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceIBEService());
                str = "com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService";
                break;
            case 2110323641:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SamiDebugToolServiceImpl());
                str = "com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService";
                break;
            default:
                return null;
        }
        putStaticServiceImplSetCache(str, hashSet);
        return hashSet;
    }

    private Set getStaticServiceImplSetRealStub2(Class cls) {
        HashSet hashSet;
        String str;
        switch (cls.getName().hashCode()) {
            case -1553253226:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new AdTrackDependImpl());
                str = "com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend";
                break;
            case -1174329857:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IEffectHintSelectDialog")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new EffectHintSelectDialogServiceImpl());
                str = "com.ss.android.ugc.aweme.tools.detail.IEffectHintSelectDialog";
                break;
            case -420763372:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.library.library.ILibraryCameraService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new LibraryCameraServiceImpl());
                str = "com.ss.android.ugc.aweme.library.library.ILibraryCameraService";
                break;
            case 49063186:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.service.ISeriesPricingService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new SeriesPricingServiceImpl());
                str = "com.ss.android.ugc.aweme.service.ISeriesPricingService";
                break;
            case 53902533:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.upvote.service.IUpvoteService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new UpvoteServiceImpl());
                str = "com.ss.android.ugc.aweme.upvote.service.IUpvoteService";
                break;
            case 1471250505:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new ECommerceMallService());
                str = "com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService";
                break;
            case 1802001554:
                if (!cls.getName().equals("com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeOutService")) {
                    return null;
                }
                hashSet = new HashSet();
                hashSet.add(new CommerceChallengeOutService());
                str = "com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeOutService";
                break;
            default:
                return null;
        }
        putStaticServiceImplSetCache(str, hashSet);
        return hashSet;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    private <T> T getStaticServiceImplReal(Class<T> cls) {
        int hashCode = cls.getName().hashCode();
        switch (hashCode) {
            case -2145984762:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IDeutModeDiscoverService")) {
                    T t = (T) new DuetDiscoverServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.detail.IDeutModeDiscoverService", t);
                    return t;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2144203200:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService")) {
                    T t2 = (T) new PaidContentSdpTrailerService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService", t2);
                    return t2;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2142042626:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ICrossPlatformLegacyService")) {
                    T t3 = (T) new CrossPlatformLegacyServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ICrossPlatformLegacyService", t3);
                    return t3;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2129240203:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler")) {
                    T t4 = (T) new ToastResultHandler();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler", t4);
                    return t4;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2128257677:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService")) {
                    T t5 = (T) new EarlyFeedbackService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService", t5);
                    return t5;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2123886532:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISeriesVideoUploadService")) {
                    T t6 = (T) new SeriesVideoUploadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ISeriesVideoUploadService", t6);
                    return t6;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2120792575:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.system.ISystemServiceApi")) {
                    T t7 = (T) new SystemServiceApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.system.ISystemServiceApi", t7);
                    return t7;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2118722668:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IFeedAdService")) {
                    T t8 = (T) new FeedAdServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.IFeedAdService", t8);
                    return t8;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2116177744:
                if (cls.getName().equals("com.bytedance.ies.powerpermissions.IGetInterceptor")) {
                    T t9 = (T) new PowerPermissionsTask();
                    putStaticServiceImplCache("com.bytedance.ies.powerpermissions.IGetInterceptor", t9);
                    return t9;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2106127476:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.IAwemeContextService")) {
                    T t10 = (T) new AwemeContextServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.IAwemeContextService", t10);
                    return t10;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2100114539:
                if (cls.getName().equals("com.bytedance.pumbaa.bpea.adapter.api.IBPEAService")) {
                    T t11 = (T) new BPEAServiceImp();
                    putStaticServiceImplCache("com.bytedance.pumbaa.bpea.adapter.api.IBPEAService", t11);
                    return t11;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2089789548:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentService")) {
                    T t12 = (T) new PaidContentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IPaidContentService", t12);
                    return t12;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2088649324:
                if (cls.getName().equals("com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService")) {
                    return (T) new OpenPlatformServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2079081456:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageFragment")) {
                    T t13 = (T) new MainPageFragmentImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.main.IMainPageFragment", t13);
                    return t13;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2071810625:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi")) {
                    T t14 = (T) new LauncherExperimentsImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi", t14);
                    return t14;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2054995116:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IVopPermissionService")) {
                    T t15 = (T) new VopPermissionService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.audio.IVopPermissionService", t15);
                    return t15;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2053076272:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService")) {
                    T t16 = (T) new AdAssemServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService", t16);
                    return t16;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2050154457:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISeriesNotificationService")) {
                    T t17 = (T) new SeriesNotificationServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ISeriesNotificationService", t17);
                    return t17;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2045744714:
                if (cls.getName().equals("com.ss.android.ugc.aweme.im.INotificationManagerService")) {
                    T t18 = (T) new NotificationManagerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.im.INotificationManagerService", t18);
                    return t18;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2045670388:
                if (cls.getName().equals("com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView")) {
                    T t19 = (T) new PrivateAccountTipsViewDelegate();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView", t19);
                    return t19;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2041007322:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IInternalAVService")) {
                    T t20 = (T) new AVServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IInternalAVService", t20);
                    return t20;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2038108429:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService")) {
                    T t21 = (T) new ReplaceMusicDownloadService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService", t21);
                    return t21;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2034848867:
                if (cls.getName().equals("com.ss.android.ugc.aweme.publish.IPublishPageService")) {
                    T t22 = (T) new PublishPageImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.publish.IPublishPageService", t22);
                    return t22;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2033629456:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.utils.MallLogUtilsApi")) {
                    T t23 = (T) new MallLogUtilsImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.utils.MallLogUtilsApi", t23);
                    return t23;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2032290623:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.external.IGetPostVideoThresholdService")) {
                    T t24 = (T) new AllowVideoThresholdUtils();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.external.IGetPostVideoThresholdService", t24);
                    return t24;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2018037726:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.recuser.IRecUserService")) {
                    T t25 = (T) new RecUserServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.recuser.IRecUserService", t25);
                    return t25;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2011045625:
                if (cls.getName().equals("com.ss.android.ugc.aweme.log.IAdWebLogService")) {
                    T t26 = (T) new AdWebLogService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.log.IAdWebLogService", t26);
                    return t26;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2007357452:
                if (cls.getName().equals("com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService")) {
                    T t27 = (T) new BTMTrackerServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService", t27);
                    return t27;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -2007242596:
                if (cls.getName().equals("com.bytedance.bdlocation.init.IBDLocationAgent")) {
                    T t28 = (T) new BDLocationAgentImpl();
                    putStaticServiceImplCache("com.bytedance.bdlocation.init.IBDLocationAgent", t28);
                    return t28;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1999823250:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService")) {
                    T t29 = (T) new CompliancePolicyServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService", t29);
                    return t29;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1998285850:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IWebViewService")) {
                    T t30 = (T) new WebviewService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.services.IWebViewService", t30);
                    return t30;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1994319489:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IMainService")) {
                    return (T) new MainServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1988304200:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService")) {
                    T t31 = (T) new ProactiveTriggersService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService", t31);
                    return t31;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1986664400:
                if (cls.getName().equals("com.ss.android.ugc.aweme.bl.EditorStickerDowngradeService")) {
                    T t32 = (T) new EditorStickerDowngradeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.bl.EditorStickerDowngradeService", t32);
                    return t32;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1985945847:
                if (cls.getName().equals("com.ss.android.ugc.aweme.mention.service.IMentionDataService")) {
                    T t33 = (T) new MentionDataServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.mention.service.IMentionDataService", t33);
                    return t33;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1984854844:
                if (cls.getName().equals("com.ss.android.ugc.localnotifyapi.ILocalNotifyApi")) {
                    T t34 = (T) new CommonLocalNotifyService();
                    putStaticServiceImplCache("com.ss.android.ugc.localnotifyapi.ILocalNotifyApi", t34);
                    return t34;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1981582294:
                if (cls.getName().equals("com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService")) {
                    T t35 = (T) new HybridMonitorServiceImpl();
                    putStaticServiceImplCache("com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService", t35);
                    return t35;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1947571277:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceService")) {
                    T t36 = (T) new ECommerceService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceService", t36);
                    return t36;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1946334763:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ICloudTokenLoginService")) {
                    T t37 = (T) new CloudTokenLoginService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ICloudTokenLoginService", t37);
                    return t37;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1946164846:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService")) {
                    T t38 = (T) new KidsSettingsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService", t38);
                    return t38;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1937612334:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerOutService")) {
                    return (T) new CommerceStickerOutService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1931366336:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.AdOmSdkManagerService")) {
                    return (T) new AdOmSdkManagerServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1921709535:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService")) {
                    T t39 = (T) new GeckoPreloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService", t39);
                    return t39;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1916678834:
                if (cls.getName().equals("com.ss.android.ugc.aweme.internal.ICrossLanguageUserService")) {
                    T t40 = (T) new CrossLanguageUserExperiment();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.internal.ICrossLanguageUserService", t40);
                    return t40;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1914197419:
                if (cls.getName().equals("com.ss.android.ugc.aweme.enter.IEnterProfileService")) {
                    T t41 = (T) new EnterProfileServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.enter.IEnterProfileService", t41);
                    return t41;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1908421675:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService")) {
                    T t42 = (T) new CQrcodeService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService", t42);
                    return t42;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1904146117:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.omsdk.IAdOmSdkManagerProvider")) {
                    return (T) new AdOmSdkManagerProvider();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1903173849:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPhotoDownloadService")) {
                    T t43 = (T) new PhotoDownloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IPhotoDownloadService", t43);
                    return t43;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1902468907:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService")) {
                    T t44 = (T) new CommercializeLiveServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService", t44);
                    return t44;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1902050433:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil")) {
                    T t45 = (T) new NoticeChallengePropertyUtilImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil", t45);
                    return t45;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1891048851:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.ColorShiftAPI")) {
                    T t46 = (T) new ColorShift();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.ColorShiftAPI", t46);
                    return t46;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1890851076:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessGoodsService")) {
                    T t47 = (T) new BusinessGoodsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IBusinessGoodsService", t47);
                    return t47;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1887804577:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IProfileMusicTabService")) {
                    T t48 = (T) new ProfileMusicTabService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.music.service.IProfileMusicTabService", t48);
                    return t48;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1887270731:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentCreationService")) {
                    return (T) new PaidContentCreationServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1884848380:
                if (cls.getName().equals("com.ss.android.ugc.aweme.structure.api.ICommerceService")) {
                    T t49 = (T) new CommerceServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.structure.api.ICommerceService", t49);
                    return t49;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1882551236:
                if (cls.getName().equals("com.ss.android.ugc.aweme.account.IAccountInitService")) {
                    T t50 = (T) new AccountInitServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.account.IAccountInitService", t50);
                    return t50;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1870140666:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService")) {
                    T t51 = (T) new ScreenShotFeedbackService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService", t51);
                    return t51;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1863869896:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageExperimentService")) {
                    T t52 = (T) new MainPageExperimentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.main.IMainPageExperimentService", t52);
                    return t52;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1863072420:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ILandscapeEducatorService")) {
                    T t53 = (T) new LandscapeEducatorImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ILandscapeEducatorService", t53);
                    return t53;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1859502304:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSuperResolutionAPI")) {
                    T t54 = (T) new VideoSuperResolution();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.VideoSuperResolutionAPI", t54);
                    return t54;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1854880805:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IProfileNowsService")) {
                    T t55 = (T) new ProfileNowsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IProfileNowsService", t55);
                    return t55;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1846980334:
                if (cls.getName().equals("com.ss.android.ugc.aweme.web.service.IAdWebUtils")) {
                    T t56 = (T) new AdWebUtils();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.web.service.IAdWebUtils", t56);
                    return t56;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1844327934:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService")) {
                    T t57 = (T) new VoiceDetectorService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService", t57);
                    return t57;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1827092331:
                if (cls.getName().equals("com.ss.android.ugc.gamora.PageFactory")) {
                    T t58 = (T) new PageFactoryDelegate();
                    putStaticServiceImplCache("com.ss.android.ugc.gamora.PageFactory", t58);
                    return t58;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1826578900:
                if (cls.getName().equals("com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopBDXBridgeService")) {
                    T t59 = (T) new VopBDXBridgeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopBDXBridgeService", t59);
                    return t59;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1821113378:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService")) {
                    T t60 = (T) new EffectStorageCleanServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService", t60);
                    return t60;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1819544622:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService")) {
                    T t61 = (T) new FollowAvatarServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.spi.IFollowAvatarService", t61);
                    return t61;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1819181795:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceMonitorService")) {
                    T t62 = (T) new EcommerceMonitorService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceMonitorService", t62);
                    return t62;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1816256684:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.OldRedPointService")) {
                    T t63 = (T) new RedPointServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.count.OldRedPointService", t63);
                    return t63;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1806946999:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowsTabService")) {
                    T t64 = (T) new NowsTabServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INowsTabService", t64);
                    return t64;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1806927191:
                if (cls.getName().equals("com.ss.android.ugc.aweme.journey.INewUserJourneyService")) {
                    T t65 = (T) new NewUserJourneyService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.journey.INewUserJourneyService", t65);
                    return t65;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1806639590:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.service.IFeedComponentService")) {
                    T t66 = (T) new FeedComponentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.service.IFeedComponentService", t66);
                    return t66;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1799242804:
                if (cls.getName().equals("com.bytedance.ies.watcher.IWatcher")) {
                    T t67 = (T) new WatcherImpl();
                    putStaticServiceImplCache("com.bytedance.ies.watcher.IWatcher", t67);
                    return t67;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1788325683:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRRaisrAPI")) {
                    T t68 = (T) new VideoSRRaisr();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.VideoSRRaisrAPI", t68);
                    return t68;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1788072522:
                if (cls.getName().equals("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService")) {
                    T t69 = (T) new ContentLanguageGuideServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageGuideService", t69);
                    return t69;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1785235188:
                if (cls.getName().equals("com.ss.android.legoapi.IAccountInitializerTaskApi")) {
                    T t70 = (T) new AccountInitializerTaskImpl();
                    putStaticServiceImplCache("com.ss.android.legoapi.IAccountInitializerTaskApi", t70);
                    return t70;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1777254862:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService")) {
                    T t71 = (T) new CommerceToolsMusicService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService", t71);
                    return t71;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1775773808:
                if (cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo")) {
                    T t72 = (T) new SettingRequestExtraInfoImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo", t72);
                    return t72;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1767384676:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.image.IECImageService")) {
                    T t73 = (T) new ECImageService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.image.IECImageService", t73);
                    return t73;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1767215914:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager")) {
                    T t74 = (T) new RealTimeSplashManagerImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager", t74);
                    return t74;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1764938002:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.search.IPnSSearchHistoryService")) {
                    T t75 = (T) new PnSSearchHistoryServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.search.IPnSSearchHistoryService", t75);
                    return t75;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1764545303:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache")) {
                    T t76 = (T) new LowResolutionImageCache();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache", t76);
                    return t76;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1760828615:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService")) {
                    T t77 = (T) new PrivateAccountServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService", t77);
                    return t77;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1753842266:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.SmartCDNRankService")) {
                    T t78 = (T) new SmartCDNRankServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.SmartCDNRankService", t78);
                    return t78;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1750338964:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService")) {
                    T t79 = (T) new KidsAccountServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService", t79);
                    return t79;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1740635045:
                if (cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.IEcommerceAnchorService")) {
                    T t80 = (T) new EcommerceAnchorService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.anchor.service.IEcommerceAnchorService", t80);
                    return t80;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1733011232:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService")) {
                    T t81 = (T) new ChildModeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService", t81);
                    return t81;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1727443149:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.api.IFeedRecommendFragmentClass")) {
                    T t82 = (T) new FeedFragmentClassService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.api.IFeedRecommendFragmentClass", t82);
                    return t82;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1727161271:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService")) {
                    T t83 = (T) new SmartFeedPreloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService", t83);
                    return t83;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1718043654:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService")) {
                    T t84 = (T) new ComplianceDependServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService", t84);
                    return t84;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1717634817:
                if (cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi")) {
                    T t85 = (T) new ActivityResourceOptApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi", t85);
                    return t85;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1707046452:
                if (cls.getName().equals("com.ss.android.ugc.aweme.topic.ITopicAnchorFactory")) {
                    T t86 = (T) new TopicAnchorFactory();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.topic.ITopicAnchorFactory", t86);
                    return t86;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1690323830:
                if (cls.getName().equals("com.ss.android.ugc.aweme.deeplink.IDeepLinkService")) {
                    T t87 = (T) new DeepLinkServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.deeplink.IDeepLinkService", t87);
                    return t87;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1689796830:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.NoiseLiveAPI")) {
                    T t88 = (T) new NoiseLive();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.NoiseLiveAPI", t88);
                    return t88;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1676993402:
                if (cls.getName().equals("com.ss.android.ugc.aweme.bnpl.IBNPLService")) {
                    T t89 = (T) new BNPLServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.bnpl.IBNPLService", t89);
                    return t89;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1667865087:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLCommonService")) {
                    T t90 = (T) new MLCommonServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.IMLCommonService", t90);
                    return t90;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1663898489:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowDistributionService")) {
                    T t91 = (T) new NowDistributionService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INowDistributionService", t91);
                    return t91;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1659862780:
                if (cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService")) {
                    T t92 = (T) new GetLeadsAnchorService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService", t92);
                    return t92;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1655087342:
                if (cls.getName().equals("com.ss.android.ugc.aweme.social.service.IMotivateLoginService")) {
                    T t93 = (T) new MotivateLoginPopupManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.social.service.IMotivateLoginService", t93);
                    return t93;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1648817253:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowUserPublishService")) {
                    T t94 = (T) new NowUserPublishService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INowUserPublishService", t94);
                    return t94;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1645858299:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService")) {
                    T t95 = (T) new MusicStorageCleanServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService", t95);
                    return t95;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1643932385:
                if (cls.getName().equals("com.ss.android.common.util.INetWorkInject")) {
                    T t96 = (T) new NetWorkInjectImpl();
                    putStaticServiceImplCache("com.ss.android.common.util.INetWorkInject", t96);
                    return t96;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1643547945:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService")) {
                    T t97 = (T) new ProtectionServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService", t97);
                    return t97;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1633603100:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service")) {
                    T t98 = (T) new SmartPreloadCommentV2ServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service", t98);
                    return t98;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1632619980:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISettingDependService")) {
                    T t99 = (T) new SettingDependServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.ISettingDependService", t99);
                    return t99;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1614697299:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountService")) {
                    T t100 = (T) new AccountService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IAccountService", t100);
                    return t100;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1610244269:
                if (cls.getName().equals("com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService")) {
                    T t101 = (T) new IMCoreProxyService();
                    putStaticServiceImplCache("com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService", t101);
                    return t101;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1609011523:
                if (cls.getName().equals("com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService")) {
                    T t102 = (T) new QAInvitationService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService", t102);
                    return t102;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1607608657:
                if (cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi")) {
                    T t103 = (T) new SettingsMainApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi", t103);
                    return t103;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1604273216:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService")) {
                    T t104 = (T) new OldNoticeCountServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService", t104);
                    return t104;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1599970632:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService")) {
                    T t105 = (T) new BusinessEComThirdPartySparkRouterInterceptorsProvider();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService", t105);
                    return t105;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1595794447:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService")) {
                    T t106 = (T) new WebAdUserAgentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService", t106);
                    return t106;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1595397874:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IQnaService")) {
                    return (T) new QnaService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1591908699:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISocInteractionAvatarService")) {
                    T t107 = (T) new SocInteractionAvatarServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ISocInteractionAvatarService", t107);
                    return t107;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1590000450:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService")) {
                    return (T) new ECommerceAnchorService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1584973634:
                if (cls.getName().equals("com.ss.android.ugc.aweme.sticker.AddYoursStickerViewFactoryApi")) {
                    T t108 = (T) new AddYoursStickerFactoryService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.sticker.AddYoursStickerViewFactoryApi", t108);
                    return t108;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1584781073:
                if (cls.getName().equals("com.ss.android.ugc.aweme.trace.ITraceConfigApi")) {
                    T t109 = (T) new TraceConfigApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.trace.ITraceConfigApi", t109);
                    return t109;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1583683359:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService")) {
                    T t110 = (T) new FashionMallService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService", t110);
                    return t110;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1583450904:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.FypAutoScrollService")) {
                    T t111 = (T) new FypAutoScrollServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.FypAutoScrollService", t111);
                    return t111;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1581112369:
                if (cls.getName().equals("com.benchmark.collection_api.BXCollectionAPI")) {
                    return (T) new BXCollectionImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1572029873:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IAudioGlitchService")) {
                    T t112 = (T) new AudioGlitchService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.audio.IAudioGlitchService", t112);
                    return t112;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1569176709:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartHARService")) {
                    T t113 = (T) new SmartHARServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.ISmartHARService", t113);
                    return t113;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1558198493:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService")) {
                    T t114 = (T) new FamilyPairingServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService", t114);
                    return t114;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1553253226:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend")) {
                    T t115 = (T) new AdTrackDependImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend", t115);
                    return t115;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1544248582:
                if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService")) {
                    T t116 = (T) new ECommerceLiveBridgeMethodServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService", t116);
                    return t116;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1543470910:
                if (cls.getName().equals("com.ss.android.ugc.feed.platform.cardinsert.IFeedCardInsertService")) {
                    T t117 = (T) new FeedCardInsertService();
                    putStaticServiceImplCache("com.ss.android.ugc.feed.platform.cardinsert.IFeedCardInsertService", t117);
                    return t117;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1535610191:
                if (cls.getName().equals("com.ss.android.ugc.aweme.journey.INujPerformanceService")) {
                    T t118 = (T) new NujPerformanceService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.journey.INujPerformanceService", t118);
                    return t118;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1531528866:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.storage.IRelationStorageService")) {
                    T t119 = (T) new RelationStorageServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.storage.IRelationStorageService", t119);
                    return t119;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1529915756:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService")) {
                    T t120 = (T) new FeedStateVMServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService", t120);
                    return t120;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1527643984:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService")) {
                    T t121 = (T) new Feed0VVManagerService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService", t121);
                    return t121;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1524347501:
                if (cls.getName().equals("com.ss.android.ugc.aweme.inbox.service.IInboxService")) {
                    T t122 = (T) new InboxServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.inbox.service.IInboxService", t122);
                    return t122;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1517460377:
                if (cls.getName().equals("com.ss.android.ugc.aweme.awemeservice.api.IAwemeService")) {
                    T t123 = (T) new AwemeService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.awemeservice.api.IAwemeService", t123);
                    return t123;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1515311152:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService")) {
                    T t124 = (T) new UniversalPopupManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService", t124);
                    return t124;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1512127072:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareExtService")) {
                    T t125 = (T) new ShareExtServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.share.ShareExtService", t125);
                    return t125;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1510438058:
                if (cls.getName().equals("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService")) {
                    T t126 = (T) new ImEntranceService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService", t126);
                    return t126;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1509395635:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService")) {
                    T t127 = (T) new TermsConsentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService", t127);
                    return t127;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1507783276:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.intelligence.IIntelligenceModule")) {
                    T t128 = (T) new IntelligenceModuleImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.intelligence.IIntelligenceModule", t128);
                    return t128;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1498800717:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.IAbTestManager")) {
                    T t129 = (T) new AbTestManagerImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.IAbTestManager", t129);
                    return t129;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1494693547:
                if (cls.getName().equals("com.ss.android.ugc.aweme.download.component_api.service.IDownloadService")) {
                    T t130 = (T) new DownloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.download.component_api.service.IDownloadService", t130);
                    return t130;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1487274965:
                if (cls.getName().equals("com.ss.android.ugc.aweme.spark.IAdSparkUtils")) {
                    T t131 = (T) new AdSparkUtils();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.spark.IAdSparkUtils", t131);
                    return t131;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1487196739:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ISaveInfoDialogService")) {
                    T t132 = (T) new SaveInfoDialogService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ISaveInfoDialogService", t132);
                    return t132;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1484563773:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IDownloadService")) {
                    T t133 = (T) new DownloadService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.services.IDownloadService", t133);
                    return t133;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1480234421:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notification.creator.service.INotificationFragmentService")) {
                    T t134 = (T) new NotificationFragmentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notification.creator.service.INotificationFragmentService", t134);
                    return t134;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1477649403:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi")) {
                    T t135 = (T) new OpenOnMuteImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi", t135);
                    return t135;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1459016104:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper")) {
                    T t136 = (T) new SchemaPageHelperImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper", t136);
                    return t136;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1452788604:
                if (cls.getName().equals("com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService")) {
                    T t137 = (T) new VideoTrendingTopicServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService", t137);
                    return t137;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1443410671:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi")) {
                    T t138 = (T) new AwemeConfigCenter.AwemeConfigCenterImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi", t138);
                    return t138;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1441338863:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.RedPointService")) {
                    T t139 = (T) new RedPointServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.count.RedPointService", t139);
                    return t139;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1441224304:
                if (cls.getName().equals("com.ss.android.ugc.aweme.plugin.IPluginService")) {
                    T t140 = (T) new PluginService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.plugin.IPluginService", t140);
                    return t140;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1437674684:
                if (cls.getName().equals("com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService")) {
                    T t141 = (T) new RequestIdService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService", t141);
                    return t141;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1436553735:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IEducatePhotoModeService")) {
                    T t142 = (T) new EducatePhotoModeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IEducatePhotoModeService", t142);
                    return t142;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1435759313:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher")) {
                    T t143 = (T) new AvatarAndNicknamePopupController();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher", t143);
                    return t143;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1432243237:
                if (cls.getName().equals("com.bytedance.lighten.core.config.ILightenConfigOutService")) {
                    T t144 = (T) new LightenConfigOutService();
                    putStaticServiceImplCache("com.bytedance.lighten.core.config.ILightenConfigOutService", t144);
                    return t144;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1430504740:
                if (cls.getName().equals("com.ss.android.ugc.aweme.network.spi.INetworkLevelService")) {
                    T t145 = (T) new NetworkLevelService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.network.spi.INetworkLevelService", t145);
                    return t145;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1430439832:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.widget.ISearchWidgetService")) {
                    T t146 = (T) new SearchWidgetServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.search.widget.ISearchWidgetService", t146);
                    return t146;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1429156681:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.location_api.service.ILocationService")) {
                    T t147 = (T) new LocationServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.tiktok.location_api.service.ILocationService", t147);
                    return t147;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1419081718:
                if (cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.RecommendUserService")) {
                    T t148 = (T) new RecommendUserServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.recommend.users.RecommendUserService", t148);
                    return t148;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1417371777:
                if (cls.getName().equals("com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy")) {
                    T t149 = (T) new IMUnder16ProxyImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy", t149);
                    return t149;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1408772159:
                if (cls.getName().equals("com.fackbook.imagepipeline.IImagePipelineOutService")) {
                    T t150 = (T) new ImagePipelineConfigFactory();
                    putStaticServiceImplCache("com.fackbook.imagepipeline.IImagePipelineOutService", t150);
                    return t150;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1408415368:
                if (cls.getName().equals("com.ss.android.ugc.aweme.specact.api.ISpecActService")) {
                    T t151 = (T) new SpecActServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.specact.api.ISpecActService", t151);
                    return t151;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1403714223:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEventCenter")) {
                    T t152 = (T) new EventCenter();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEventCenter", t152);
                    return t152;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1398889005:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.newusermode.INewUserModeService")) {
                    T t153 = (T) new NewUserModeService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.newusermode.INewUserModeService", t153);
                    return t153;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1396670568:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.II18nService")) {
                    T t154 = (T) new I18nService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.main.service.II18nService", t154);
                    return t154;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1394007011:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.INoticeCountService")) {
                    T t155 = (T) new NoticeCountServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.services.INoticeCountService", t155);
                    return t155;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1379566319:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService")) {
                    T t156 = (T) new SmartMLSceneServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService", t156);
                    return t156;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1379065367:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareService")) {
                    T t157 = (T) new com.ss.android.ugc.aweme.share.ShareServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.share.ShareService", t157);
                    return t157;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1368655741:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils")) {
                    T t158 = (T) new AdPlayFunAsseUtils();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.playfun.IAdPlayFunAsseUtils", t158);
                    return t158;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1365640136:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting")) {
                    T t159 = (T) new VEEncodingImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting", t159);
                    return t159;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1364971920:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoOCLSRAPI")) {
                    T t160 = (T) new VideoOCLSR();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.VideoOCLSRAPI", t160);
                    return t160;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1323957599:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ILandscapeFeedService")) {
                    T t161 = (T) new LandscapeFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ILandscapeFeedService", t161);
                    return t161;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1323865212:
                if (cls.getName().equals("dmt.viewpager.servie.ViewPagerSlideTransitionService")) {
                    T t162 = (T) new ViewPagerSlideTransitionServiceImpl();
                    putStaticServiceImplCache("dmt.viewpager.servie.ViewPagerSlideTransitionService", t162);
                    return t162;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1321926739:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService")) {
                    T t163 = (T) new HydrogenServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService", t163);
                    return t163;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1317882728:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRLutDspAPI")) {
                    T t164 = (T) new VideoSRLutDsp();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.VideoSRLutDspAPI", t164);
                    return t164;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1309436545:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAnoleService")) {
                    T t165 = (T) new AnoleServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IAnoleService", t165);
                    return t165;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1306728476:
                if (cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.jsb.ICreativeToolXBridgeService")) {
                    T t166 = (T) new CreativeToolXBridgeService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.shortvideo.jsb.ICreativeToolXBridgeService", t166);
                    return t166;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1289181594:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService")) {
                    T t167 = (T) new SmartPlaytimePredictServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService", t167);
                    return t167;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1288697681:
                if (cls.getName().equals("com.ss.android.ugc.aweme.autofill.IAdAutofillService")) {
                    T t168 = (T) new AdAutofillService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.autofill.IAdAutofillService", t168);
                    return t168;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1273247020:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService")) {
                    T t169 = (T) new CandidateRequestImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.candidate.ICandidateRequestService", t169);
                    return t169;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1272663583:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting")) {
                    T t170 = (T) new SpeedModeSettingImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting", t170);
                    return t170;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1268753058:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService")) {
                    T t171 = (T) new ShopIconServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService", t171);
                    return t171;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1263811427:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService")) {
                    T t172 = (T) new SmartFeedLoadMoreServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService", t172);
                    return t172;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1259244187:
                if (cls.getName().equals("com.ss.android.ugc.aweme.mix.api.IDetailMixOperatorService")) {
                    T t173 = (T) new DetailMixOperatorServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.mix.api.IDetailMixOperatorService", t173);
                    return t173;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1251125540:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService")) {
                    return (T) new CommonFeedLaunchServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1246491968:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECLayerService")) {
                    return (T) new ECLayerService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1245900765:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi")) {
                    T t174 = (T) new OpenOnMuteImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi", t174);
                    return t174;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1238754624:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ICLALanguageService")) {
                    T t175 = (T) new ICLALanguageServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.ICLALanguageService", t175);
                    return t175;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1238030096:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService")) {
                    T t176 = (T) new EcomSparkSubInterceptorProvider();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcomSparkChannelInterceptorService", t176);
                    return t176;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1233134364:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService")) {
                    T t177 = (T) new SearchEcommerceJSBridgeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService", t177);
                    return t177;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1232436899:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.BusinessModuleService")) {
                    T t178 = (T) new BusinessModuleServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.BusinessModuleService", t178);
                    return t178;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1230251313:
                if (cls.getName().equals("com.bytedance.ies.android.base.runtime.IDependOutService")) {
                    return (T) new DependOutServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1225060392:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IActivityRouterService")) {
                    T t179 = (T) new ActivityRouterServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IActivityRouterService", t179);
                    return t179;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1217333837:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy")) {
                    T t180 = (T) new DmNoticeProxyImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy", t180);
                    return t180;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1217175380:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.adexperience.IAdExperienceEventLogger")) {
                    return (T) new AdExperienceEventLogger();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1202985878:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAnotherMusicService")) {
                    T t181 = (T) new MusicServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IAnotherMusicService", t181);
                    return t181;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1201939162:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ISmartLockService")) {
                    T t182 = (T) new SmartLockService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ISmartLockService", t182);
                    return t182;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1197385060:
                if (cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService")) {
                    T t183 = (T) new AnchorStateServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService", t183);
                    return t183;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1195178446:
                if (cls.getName().equals("com.ss.android.ugc.aweme.net.IReleaseInterceptor")) {
                    T t184 = (T) new DevicesNullInterceptor();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.net.IReleaseInterceptor", t184);
                    return t184;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1190495862:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService")) {
                    T t185 = (T) new CommerceChallengeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService", t185);
                    return t185;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1189818203:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ISearchDynamicService")) {
                    T t186 = (T) new SearchDynamicServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.search.ISearchDynamicService", t186);
                    return t186;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1184747351:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IDubbingService")) {
                    T t187 = (T) new DubbingServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IDubbingService", t187);
                    return t187;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1183360939:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi")) {
                    T t188 = (T) new ExitBackgroundImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi", t188);
                    return t188;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1181313806:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi")) {
                    T t189 = (T) new NewUserImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi", t189);
                    return t189;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1177990237:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService")) {
                    T t190 = (T) new EcUgCommonService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService", t190);
                    return t190;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1175770854:
                if (cls.getName().equals("com.ss.android.ugc.aweme.dsp.service.IMusicDspService")) {
                    T t191 = (T) new MusicDspServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.dsp.service.IMusicDspService", t191);
                    return t191;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1174329857:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IEffectHintSelectDialog")) {
                    T t192 = (T) new EffectHintSelectDialogServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.detail.IEffectHintSelectDialog", t192);
                    return t192;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1167883326:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.publish.FixedCaptionsExperimentService")) {
                    T t193 = (T) new FixedCaptionsExperimentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.publish.FixedCaptionsExperimentService", t193);
                    return t193;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1164850823:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.prefetch.IAdWebViewPrefetchManager")) {
                    T t194 = (T) new AdWebViewPrefetchManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.prefetch.IAdWebViewPrefetchManager", t194);
                    return t194;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1164741669:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountFeatureFlagService")) {
                    T t195 = (T) new AccountFeatureFlagService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IAccountFeatureFlagService", t195);
                    return t195;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1163456409:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService")) {
                    T t196 = (T) new AddYoursStickerRecordServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService", t196);
                    return t196;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1154900743:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.service.IAdLandPageDependOutService")) {
                    return (T) new AdLandPageDependOutService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1139302695:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.service.ICommerceService")) {
                    T t197 = (T) new CommerceService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commerce.service.ICommerceService", t197);
                    return t197;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1135336108:
                if (cls.getName().equals("com.ss.android.ugc.aweme.log.IAdWebEventLogger")) {
                    return (T) new AdWebBarEventLogger();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1131414213:
                if (cls.getName().equals("com.ss.android.ugc.aweme.webview.IWebViewInjectService")) {
                    T t198 = (T) new WebViewInjectServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.webview.IWebViewInjectService", t198);
                    return t198;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1127430638:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISocPubDistributeService")) {
                    T t199 = (T) new SocPubDistributeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ISocPubDistributeService", t199);
                    return t199;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1114069551:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService")) {
                    T t200 = (T) new IncreaseLoginNotifyService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IIncreaseLoginNotifyService", t200);
                    return t200;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1114068711:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.IAdAnimation")) {
                    return (T) new AdAnimationImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1084831671:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.external.IDonationVendorService")) {
                    T t201 = (T) new DonationUtils();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.external.IDonationVendorService", t201);
                    return t201;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1077200566:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.AdaptiveGradingAPI")) {
                    return (T) new AdaptiveGrading();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1075930301:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService")) {
                    T t202 = (T) new BASwitchToPAorBAServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService", t202);
                    return t202;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1074357945:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowWidgetService")) {
                    T t203 = (T) new NowWidgetService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INowWidgetService", t203);
                    return t203;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1072736913:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService")) {
                    return (T) new TcmServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1070602758:
                if (cls.getName().equals("com.ss.android.ugc.aweme.lego.common.LegoBusinessService")) {
                    T t204 = (T) new LegoBusinessServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.lego.common.LegoBusinessService", t204);
                    return t204;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1069780352:
                if (cls.getName().equals("com.ss.android.ugc.aweme.trace.IPageTraceApi")) {
                    T t205 = (T) new PageTraceApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.trace.IPageTraceApi", t205);
                    return t205;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1067518024:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.security.IClientSecurityService")) {
                    T t206 = (T) new ClientSecurityServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.tiktok.security.IClientSecurityService", t206);
                    return t206;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1062505434:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService")) {
                    T t207 = (T) new PNSUserStateManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService", t207);
                    return t207;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1058542172:
                if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider")) {
                    T t208 = (T) new ChallengeDetailProvider();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider", t208);
                    return t208;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1056088830:
                if (cls.getName().equals("com.ss.android.ugc.aweme.mention.service.ICommentMentionService")) {
                    T t209 = (T) new CommentMentionServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.mention.service.ICommentMentionService", t209);
                    return t209;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1039515171:
                if (cls.getName().equals("com.ss.android.ugc.aweme.userservice.api.IUserService")) {
                    T t210 = (T) new UserService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.userservice.api.IUserService", t210);
                    return t210;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1037175629:
                if (cls.getName().equals("com.ss.android.ugc.aweme.comment.services.CommentService")) {
                    T t211 = (T) new CommentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.comment.services.CommentService", t211);
                    return t211;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1034497889:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend")) {
                    T t212 = (T) new AdRouterHandlerDependImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend", t212);
                    return t212;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1033871119:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.util.IUserProfilePreload")) {
                    T t213 = (T) new UserProfilePreloadHelper();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.profile.util.IUserProfilePreload", t213);
                    return t213;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1032744075:
                if (cls.getName().equals("com.ss.android.ugc.aweme.explore.service.IExploreFeedService")) {
                    T t214 = (T) new ExploreFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.explore.service.IExploreFeedService", t214);
                    return t214;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1020519893:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService")) {
                    T t215 = (T) new PdpPreviewServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService", t215);
                    return t215;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1016983639:
                if (cls.getName().equals("com.bytedance.bdlocation.df.ILocationPluginService")) {
                    T t216 = (T) new LocationPluginServiceImpl();
                    putStaticServiceImplCache("com.bytedance.bdlocation.df.ILocationPluginService", t216);
                    return t216;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1015551078:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFollowFeedService")) {
                    T t217 = (T) new FollowFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IFollowFeedService", t217);
                    return t217;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -1005527120:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService")) {
                    T t218 = (T) new GatekeeperManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService", t218);
                    return t218;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -998163196:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IDuetModeCameraService")) {
                    T t219 = (T) new DuetModeCameraServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IDuetModeCameraService", t219);
                    return t219;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -984217521:
                if (cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi")) {
                    T t220 = (T) new TrafficMonitorService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi", t220);
                    return t220;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -981221515:
                if (cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService")) {
                    T t221 = (T) new GoogleMapServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService", t221);
                    return t221;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -979389081:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareSdkService")) {
                    T t222 = (T) new ShareSdkServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.share.ShareSdkService", t222);
                    return t222;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -978906707:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService")) {
                    T t223 = (T) new SmartRegressCalculateServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService", t223);
                    return t223;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -977842286:
                if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IShareService")) {
                    T t224 = (T) new ShareServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.internal.IShareService", t224);
                    return t224;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -975945298:
                if (cls.getName().equals("com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService")) {
                    T t225 = (T) new VopCloneServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService", t225);
                    return t225;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -955482181:
                if (cls.getName().equals("com.ss.android.legoapi.ISysOptTaskApi")) {
                    T t226 = (T) new SysOptTaskImpl();
                    putStaticServiceImplCache("com.ss.android.legoapi.ISysOptTaskApi", t226);
                    return t226;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -954404156:
                if (cls.getName().equals("com.ss.android.ugc.aweme.clean.ICleanDialogService")) {
                    T t227 = (T) new CleanDialogServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.clean.ICleanDialogService", t227);
                    return t227;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -954311927:
                if (cls.getName().equals("com.ss.android.ugc.aweme.network.spi.IZstdService")) {
                    return (T) new ZstdService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -935773963:
                if (cls.getName().equals("com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService")) {
                    T t228 = (T) new CommonFeedApiService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService", t228);
                    return t228;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -929935463:
                if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.xbridge.IMainXBridgetService")) {
                    T t229 = (T) new MainXBridgeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.i18n.xbridge.IMainXBridgetService", t229);
                    return t229;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -927795034:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IStorageManagerService")) {
                    return (T) new StorageManagerService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -923330900:
                if (cls.getName().equals("com.ss.android.elearning.lingo.lynx.ILynxService")) {
                    T t230 = (T) new LingoLynxImpl();
                    putStaticServiceImplCache("com.ss.android.elearning.lingo.lynx.ILynxService", t230);
                    return t230;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -921805160:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.LogHelper")) {
                    T t231 = (T) new LogHelperImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.helper.LogHelper", t231);
                    return t231;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -920387194:
                if (cls.getName().equals("com.ss.android.ugc.aweme.bullet.api.IBulletService")) {
                    T t232 = (T) new BulletService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.bullet.api.IBulletService", t232);
                    return t232;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -920282637:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService")) {
                    T t233 = (T) new RuntimeBehaviorServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService", t233);
                    return t233;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -915558489:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IPropReuseService")) {
                    T t234 = (T) new PropReuseServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.detail.IPropReuseService", t234);
                    return t234;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -907055751:
                if (cls.getName().equals("com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount")) {
                    T t235 = (T) new UserAccountImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount", t235);
                    return t235;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -891158064:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService")) {
                    T t236 = (T) new ECommerceHybridServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService", t236);
                    return t236;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -887501574:
                if (cls.getName().equals("com.ss.android.ugc.aweme.base.ITaskManagerConfig")) {
                    T t237 = (T) new TaskManagerConfigImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.base.ITaskManagerConfig", t237);
                    return t237;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -884779171:
                if (cls.getName().equals("com.ss.android.ugc.aweme.web.permission.IAdWebPermissionService")) {
                    T t238 = (T) new AdWebPermissionService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.web.permission.IAdWebPermissionService", t238);
                    return t238;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -884425869:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicService")) {
                    T t239 = (T) new MusicService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.music.service.IMusicService", t239);
                    return t239;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -883701379:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.common.publish.ICommerceToolsPublishService")) {
                    T t240 = (T) new CommerceToolsPublishService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commerce.tools.common.publish.ICommerceToolsPublishService", t240);
                    return t240;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -883042393:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService")) {
                    T t241 = (T) new EditVideoInfoServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService", t241);
                    return t241;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -881735624:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService")) {
                    T t242 = (T) new EcomSearchServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService", t242);
                    return t242;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -880904353:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService")) {
                    T t243 = (T) new ConsumeLoginLoginServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService", t243);
                    return t243;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -879010222:
                if (cls.getName().equals("com.bytedance.pumbaa.hybrid.api.IHybridService")) {
                    T t244 = (T) new HybridServiceImpl();
                    putStaticServiceImplCache("com.bytedance.pumbaa.hybrid.api.IHybridService", t244);
                    return t244;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -876157664:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.FeedCommonService")) {
                    T t245 = (T) new CommonFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.FeedCommonService", t245);
                    return t245;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -875578063:
                if (cls.getName().equals("com.ss.android.ugc.aweme.secapi.ISecApi")) {
                    T t246 = (T) new SecApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.secapi.ISecApi", t246);
                    return t246;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -875547947:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAppWidgetService")) {
                    T t247 = (T) new AppWidgetServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IAppWidgetService", t247);
                    return t247;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -871982023:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.IFeedSpecActService")) {
                    T t248 = (T) new SpecActServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.IFeedSpecActService", t248);
                    return t248;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -871727766:
                if (cls.getName().equals("com.ss.android.ugc.aweme.utils.LanguageProvider")) {
                    T t249 = (T) new LanguageService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.utils.LanguageProvider", t249);
                    return t249;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -853763001:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdOutService")) {
                    return (T) new CommercializeAdOutService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -847459216:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi")) {
                    T t250 = (T) new GodzillaImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi", t250);
                    return t250;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -833034189:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService")) {
                    T t251 = (T) new ECommerceLiveServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService", t251);
                    return t251;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -832100041:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService")) {
                    T t252 = (T) new BusinessEcomSparkMatcherProvider();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService", t252);
                    return t252;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -830253574:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService")) {
                    T t253 = (T) new SearchSingleCardTemplateServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService", t253);
                    return t253;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -826855070:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService")) {
                    T t254 = (T) new PitayaFeatureCenterServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService", t254);
                    return t254;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -813299095:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.video.IOneMinuteH5PreloadServiceImpl")) {
                    T t255 = (T) new OneMinuteH5PreloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.video.IOneMinuteH5PreloadServiceImpl", t255);
                    return t255;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -809420689:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig")) {
                    T t256 = (T) new ImageHeaderConfigImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig", t256);
                    return t256;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -797912089:
                if (cls.getName().equals("com.ss.android.ugc.aweme.im.service.IIMService")) {
                    T t257 = (T) new IMService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.im.service.IIMService", t257);
                    return t257;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -790607001:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ug.IUgCommonService")) {
                    T t258 = (T) new UgCommonServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ug.IUgCommonService", t258);
                    return t258;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -780081387:
                if (cls.getName().equals("com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService")) {
                    T t259 = (T) new EasyNavigationExperimentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService", t259);
                    return t259;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -767436525:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoBrightAPI")) {
                    T t260 = (T) new VideoBright();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.VideoBrightAPI", t260);
                    return t260;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -765690135:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService")) {
                    T t261 = (T) new ECommerceShowcaseService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService", t261);
                    return t261;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -763037313:
                if (cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.FindTargetScopeFailFasterService")) {
                    T t262 = (T) new FindTargetScopeFailFasterServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.performanceopt.api.FindTargetScopeFailFasterService", t262);
                    return t262;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -761715808:
                if (cls.getName().equals("com.ss.android.ugc.aweme.avatar.ui.default.IAvatarImageLoadService")) {
                    T t263 = (T) new AvatarImageServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.avatar.ui.default.IAvatarImageLoadService", t263);
                    return t263;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -760523568:
                if (cls.getName().equals("com.ss.android.ugc.aweme.PerformanceMainService")) {
                    T t264 = (T) new PerformanceMainServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.PerformanceMainService", t264);
                    return t264;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -753764956:
                if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.xbridge.IECommerceXBridgeService")) {
                    T t265 = (T) new ECommerceXBridgeService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.i18n.xbridge.IECommerceXBridgeService", t265);
                    return t265;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -750502703:
                if (cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkInitService")) {
                    T t266 = (T) new BenchmarkInitService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.bl.IBenchmarkInitService", t266);
                    return t266;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -749446408:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService")) {
                    T t267 = (T) new PNSAgeGateServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService", t267);
                    return t267;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -742818450:
                if (cls.getName().equals("com.ss.android.ugc.aweme.check.IAutoSoundCheckService")) {
                    T t268 = (T) new AutoSoundCheckService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.check.IAutoSoundCheckService", t268);
                    return t268;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -738010642:
                if (cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IPoiService")) {
                    T t269 = (T) new PoiServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.poi_api.service.IPoiService", t269);
                    return t269;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -733321193:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor")) {
                    T t270 = (T) new AdWebJumpInterceptor();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.hybrid.api.web.IAdWebJumpInterceptor", t270);
                    return t270;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -729814797:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IBindService")) {
                    T t271 = (T) new BindService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IBindService", t271);
                    return t271;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -728326428:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAvSearchUserService")) {
                    T t272 = (T) new AvSearchUserServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IAvSearchUserService", t272);
                    return t272;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -727390069:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.cache.IFeedApi")) {
                    return (T) new FeedApiService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -726700237:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IVopCameraClientService")) {
                    T t273 = (T) new VopCameraClientService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.audio.IVopCameraClientService", t273);
                    return t273;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -713308800:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IHybridABInfoService")) {
                    T t274 = (T) new HybridABInfoService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.services.IHybridABInfoService", t274);
                    return t274;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -709173037:
                if (cls.getName().equals("com.ss.android.ugc.aweme.popularfeed.service.IPopularFeedService")) {
                    T t275 = (T) new PopularFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.popularfeed.service.IPopularFeedService", t275);
                    return t275;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -707368300:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IFestivalService")) {
                    return (T) new FestivalService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -706380519:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAVMixFeedService")) {
                    T t276 = (T) new IAVMixFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IAVMixFeedService", t276);
                    return t276;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -703329023:
                if (cls.getName().equals("com.fackbook.drawee.IDraweeConfigOutService")) {
                    T t277 = (T) new DraweeConfigOutService();
                    putStaticServiceImplCache("com.fackbook.drawee.IDraweeConfigOutService", t277);
                    return t277;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -688908617:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService")) {
                    T t278 = (T) new DeeplinkPrefetchImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService", t278);
                    return t278;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -687432460:
                if (cls.getName().equals("com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory")) {
                    T t279 = (T) new EditRootSceneFactoryDelegate();
                    putStaticServiceImplCache("com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory", t279);
                    return t279;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -686038136:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentBannerService")) {
                    T t280 = (T) new PaidContentBannerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IPaidContentBannerService", t280);
                    return t280;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -684482636:
                if (cls.getName().equals("com.ss.android.ugc.aweme.base.INetworkQualityService")) {
                    T t281 = (T) new NetworkQualityServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.base.INetworkQualityService", t281);
                    return t281;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -683664386:
                if (cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.PagingScrollSettingApi")) {
                    T t282 = (T) new PagingScrollSettingApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.performanceopt.api.PagingScrollSettingApi", t282);
                    return t282;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -679535832:
                if (cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.IServerPortraitService")) {
                    T t283 = (T) new ServerPortraitCollections();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.requestcombine.IServerPortraitService", t283);
                    return t283;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -676259965:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider")) {
                    T t284 = (T) new NetworkConfigProvider();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider", t284);
                    return t284;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -674481070:
                if (cls.getName().equals("com.ss.android.ugc.aweme.detail.api.DetailApiProxy")) {
                    T t285 = (T) new DetailApiProxyImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.detail.api.DetailApiProxy", t285);
                    return t285;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -668519111:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService")) {
                    T t286 = (T) new PushSettingServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService", t286);
                    return t286;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -656354370:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tablet.api.ITabletService")) {
                    T t287 = (T) new TabletServiceProxy();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tablet.api.ITabletService", t287);
                    return t287;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -653943499:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService")) {
                    T t288 = (T) new LegacyCommercializeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService", t288);
                    return t288;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -650484961:
                if (cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi")) {
                    T t289 = (T) new SettingsLegacyImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi", t289);
                    return t289;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -643691779:
                if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService")) {
                    T t290 = (T) new UserInfoUpdateAdapterService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService", t290);
                    return t290;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -642110915:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.function.IFunctionSupportService")) {
                    T t291 = (T) new FunctionSupportServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.function.IFunctionSupportService", t291);
                    return t291;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -639974224:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService")) {
                    T t292 = (T) new BaAutoMessageServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService", t292);
                    return t292;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -631517313:
                if (cls.getName().equals("com.ss.android.elearning.lingo.roma.RomaHostService")) {
                    T t293 = (T) new RomaServiceImpl();
                    putStaticServiceImplCache("com.ss.android.elearning.lingo.roma.RomaHostService", t293);
                    return t293;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -629545899:
                if (cls.getName().equals("com.ss.android.ugc.aweme.topic.book.IBookTokService")) {
                    T t294 = (T) new BookTokServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.topic.book.IBookTokService", t294);
                    return t294;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -628620472:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService")) {
                    T t295 = (T) new SmartClassifyServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService", t295);
                    return t295;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -627748852:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INearbyFeedService")) {
                    T t296 = (T) new NearbyFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INearbyFeedService", t296);
                    return t296;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -624802067:
                if (cls.getName().equals("com.ss.android.ugc.aweme.topic.movie.IMovieTokService")) {
                    T t297 = (T) new MovieTokServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.topic.movie.IMovieTokService", t297);
                    return t297;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -607424883:
                if (cls.getName().equals("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService")) {
                    T t298 = (T) new CustomActivityOnCrashServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService", t298);
                    return t298;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -607162983:
                if (cls.getName().equals("com.bytedance.lobby.ILobbyNonceGenerator")) {
                    T t299 = (T) new LobbyNonceGenerator();
                    putStaticServiceImplCache("com.bytedance.lobby.ILobbyNonceGenerator", t299);
                    return t299;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -597770654:
                if (cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoveryAsyncInflateService")) {
                    T t300 = (T) new DiscoveryAsyncInflateImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.discover.IDiscoveryAsyncInflateService", t300);
                    return t300;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -595040290:
                if (cls.getName().equals("com.ss.android.ugc.aweme.power.IPowerModeHandler")) {
                    T t301 = (T) new PowerModeHandlerProxy();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.power.IPowerModeHandler", t301);
                    return t301;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -591513510:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.audiosdk.IAudioSDKABLegoLaunchTaskApi")) {
                    T t302 = (T) new AudioSDKABLegoLauncherTaskImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.audiosdk.IAudioSDKABLegoLaunchTaskApi", t302);
                    return t302;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -587014433:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveVersionCodeProvider")) {
                    T t303 = (T) new LiveVersionCodeProvider();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.live.ILiveVersionCodeProvider", t303);
                    return t303;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -582786788:
                if (cls.getName().equals("com.ss.android.ugc.aweme.journey.INewUserMainModuleService")) {
                    T t304 = (T) new NewUserMainModuleService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.journey.INewUserMainModuleService", t304);
                    return t304;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -576956781:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.experiment.ITrafficDeteriorationApi")) {
                    T t305 = (T) new TrafficDeteriorationTask.TrafficDeteriorationABImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.experiment.ITrafficDeteriorationApi", t305);
                    return t305;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -572575565:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.edit.IReplaceMusicService")) {
                    T t306 = (T) new ReplaceMusicServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.edit.IReplaceMusicService", t306);
                    return t306;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -570979083:
                if (cls.getName().equals("com.bytedance.pia.core.spi.api.IPiaConfigTask")) {
                    T t307 = (T) new PiaConfigTask();
                    putStaticServiceImplCache("com.bytedance.pia.core.spi.api.IPiaConfigTask", t307);
                    return t307;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -570098893:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.interceptor.IChildHookService")) {
                    T t308 = (T) new ChildHookServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.interceptor.IChildHookService", t308);
                    return t308;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -559645618:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.ICreativeSAAService")) {
                    T t309 = (T) new SAAService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.ICreativeSAAService", t309);
                    return t309;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -556919374:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.network.INetworkApi")) {
                    T t310 = (T) new NetworkApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.network.INetworkApi", t310);
                    return t310;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -555197279:
                if (cls.getName().equals("com.ss.android.ugc.aweme.stemfeed.service.IStemFeedService")) {
                    T t311 = (T) new StemFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.stemfeed.service.IStemFeedService", t311);
                    return t311;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -553887713:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService")) {
                    T t312 = (T) new RecommendFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService", t312);
                    return t312;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -552914389:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService")) {
                    T t313 = (T) new TiktokShortcutManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService", t313);
                    return t313;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -552826208:
                if (cls.getName().equals("com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService")) {
                    T t314 = (T) new TranslationLangKevaServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService", t314);
                    return t314;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -552323009:
                if (cls.getName().equals("com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService")) {
                    T t315 = (T) new Social2TabServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService", t315);
                    return t315;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -551721501:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.algorefresh.IAlgoRefreshService")) {
                    T t316 = (T) new AlgoRefreshServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.algorefresh.IAlgoRefreshService", t316);
                    return t316;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -550872997:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper")) {
                    T t317 = (T) new MainServiceHelperImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper", t317);
                    return t317;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -546648250:
                if (cls.getName().equals("com.bytedance.lobby.internal.IGoogleOnetapLogger")) {
                    T t318 = (T) new GoogleOneTapLogger();
                    putStaticServiceImplCache("com.bytedance.lobby.internal.IGoogleOnetapLogger", t318);
                    return t318;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -544454424:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService")) {
                    return (T) new MainFragmentCacheExpServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -543803045:
                if (cls.getName().equals("com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService")) {
                    T t319 = (T) new Social2TabRouteService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService", t319);
                    return t319;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -537976318:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IPreLoginHandleService")) {
                    T t320 = (T) new PreLoginHandleService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IPreLoginHandleService", t320);
                    return t320;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -522653189:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ICLACaptionService")) {
                    T t321 = (T) new CaptionServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ICLACaptionService", t321);
                    return t321;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -514305106:
                if (cls.getName().equals("com.ss.android.ugc.aweme.mention.service.IMentionViewService")) {
                    T t322 = (T) new MentionViewServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.mention.service.IMentionViewService", t322);
                    return t322;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -504499527:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.serverpush.presenter.IGetPushSettingCallback")) {
                    T t323 = (T) new GetPushSettingCallback();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.serverpush.presenter.IGetPushSettingCallback", t323);
                    return t323;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -498226579:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService")) {
                    T t324 = (T) new BAProfilePageServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService", t324);
                    return t324;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -497853080:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService")) {
                    T t325 = (T) new MeasurementServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService", t325);
                    return t325;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -488734248:
                if (cls.getName().equals("com.ss.android.ugc.aweme.casting.api.ICastingService")) {
                    T t326 = (T) new CastingServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.casting.api.ICastingService", t326);
                    return t326;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -483848579:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService")) {
                    T t327 = (T) new CommerceToolsMissionService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService", t327);
                    return t327;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -476743082:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.promote.IEventCenter")) {
                    T t328 = (T) new com.ss.android.ugc.aweme.commerce.tools.common.EventCenter();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commerce.tools.promote.IEventCenter", t328);
                    return t328;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -474375791:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.IECommerceThirdPartyHybridService")) {
                    T t329 = (T) new ECommerceThirdPartyHybridServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.IECommerceThirdPartyHybridService", t329);
                    return t329;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -470712021:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IProfileNaviService")) {
                    T t330 = (T) new ProfileNaviServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IProfileNaviService", t330);
                    return t330;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -469570464:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper")) {
                    T t331 = (T) new FollowTabBubbleGuideHelperImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper", t331);
                    return t331;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -463217782:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService")) {
                    T t332 = (T) new AdComponentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService", t332);
                    return t332;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -451157663:
                if (cls.getName().equals("com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider")) {
                    T t333 = (T) new MixActivityContainerProvider();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider", t333);
                    return t333;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -446200024:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicExternalService")) {
                    T t334 = (T) new MusicStreamServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.music.service.IMusicExternalService", t334);
                    return t334;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -443532771:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService")) {
                    T t335 = (T) new RelationUserCardInternalService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService", t335);
                    return t335;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -440482732:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.IActivityAdapterService")) {
                    T t336 = (T) new ActivityAdapterServiceImp();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.services.IActivityAdapterService", t336);
                    return t336;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -432557074:
                if (cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi")) {
                    T t337 = (T) new LogInterceptImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi", t337);
                    return t337;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -420763372:
                if (cls.getName().equals("com.ss.android.ugc.aweme.library.library.ILibraryCameraService")) {
                    T t338 = (T) new LibraryCameraServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.library.library.ILibraryCameraService", t338);
                    return t338;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -413830924:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService")) {
                    T t339 = (T) new SplitVideoServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService", t339);
                    return t339;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -413321057:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IToolsBusinessService")) {
                    T t340 = (T) new ToolsBusinessServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IToolsBusinessService", t340);
                    return t340;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -408092794:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pipo.IPipoService")) {
                    T t341 = (T) new PipoService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.pipo.IPipoService", t341);
                    return t341;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -405727142:
                if (cls.getName().equals("com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService")) {
                    T t342 = (T) new CommentStickerRecordServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService", t342);
                    return t342;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -405287941:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ug.dynamicresource.INicknameExperiment")) {
                    T t343 = (T) new NicknameSignupExperiment();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ug.dynamicresource.INicknameExperiment", t343);
                    return t343;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -401510911:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService")) {
                    T t344 = (T) new SmartFeedAdUIServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService", t344);
                    return t344;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -401450704:
                if (cls.getName().equals("com.ss.android.legoapi.abtest.IABLegoTaskApi")) {
                    T t345 = (T) new ABLegoTaskImpl();
                    putStaticServiceImplCache("com.ss.android.legoapi.abtest.IABLegoTaskApi", t345);
                    return t345;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -400186202:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPostModeService")) {
                    T t346 = (T) new PostModeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IPostModeService", t346);
                    return t346;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -399721841:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdModule")) {
                    T t347 = (T) new SearchAdModuleImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdModule", t347);
                    return t347;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -390604136:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService")) {
                    T t348 = (T) new EcSchemaService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService", t348);
                    return t348;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -381018931:
                if (cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoveryService")) {
                    T t349 = (T) new com.ss.android.ugc.aweme.discover.impl.DiscoveryServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.discover.IDiscoveryService", t349);
                    return t349;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -370548335:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IPrevLoginPlatformService")) {
                    T t350 = (T) new PrevLoginPlatformService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IPrevLoginPlatformService", t350);
                    return t350;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -360388275:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService")) {
                    T t351 = (T) new MLDataCenterServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService", t351);
                    return t351;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -345693070:
                if (cls.getName().equals("com.ss.android.ugc.aweme.network.spi.INetworkStandardApi")) {
                    T t352 = (T) new NetworkStandardApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.network.spi.INetworkStandardApi", t352);
                    return t352;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -344719018:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ICaptionKevaService")) {
                    T t353 = (T) new CaptionKevaServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ICaptionKevaService", t353);
                    return t353;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -343801484:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.service.ISearchUserService")) {
                    T t354 = (T) new SearchUserService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.search.service.ISearchUserService", t354);
                    return t354;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -342788414:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowCommonFeedService")) {
                    T t355 = (T) new NowCommonFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INowCommonFeedService", t355);
                    return t355;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -338797404:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.watermark.IWaterMarkService")) {
                    T t356 = (T) new WaterMarkServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.watermark.IWaterMarkService", t356);
                    return t356;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -336112860:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService")) {
                    T t357 = (T) new ComplianceBusinessServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService", t357);
                    return t357;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -335108749:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService")) {
                    T t358 = (T) new OfflineModeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService", t358);
                    return t358;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -317372455:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.seclink.ISecLinkService")) {
                    T t359 = (T) new SecLinkServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.tiktok.seclink.ISecLinkService", t359);
                    return t359;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -312331731:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ITopicFeedService")) {
                    T t360 = (T) new TopicFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ITopicFeedService", t360);
                    return t360;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -307992734:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicDetailService")) {
                    T t361 = (T) new MusicDetailService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.music.service.IMusicDetailService", t361);
                    return t361;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -297907320:
                if (cls.getName().equals("com.ss.android.ugc.aweme.trending.service.ITrendingExperimentService")) {
                    T t362 = (T) new TrendingExperimentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.trending.service.ITrendingExperimentService", t362);
                    return t362;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -296051311:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.ISettingManagerService")) {
                    T t363 = (T) new SettingManagerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.ISettingManagerService", t363);
                    return t363;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -292562418:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.gif.IGifShareService")) {
                    T t364 = (T) new GifShareService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.share.gif.IGifShareService", t364);
                    return t364;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -287291984:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService")) {
                    T t365 = (T) new ConsentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService", t365);
                    return t365;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -277105198:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsApi")) {
                    T t366 = (T) new FeedRawAdLogUtilsImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsApi", t366);
                    return t366;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -273825195:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger")) {
                    return (T) new PitayaServiceManager();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -269703448:
                if (cls.getName().equals("com.ss.android.ugc.aweme.api.IBemobiGiftService")) {
                    T t367 = (T) new BemobiGiftServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.api.IBemobiGiftService", t367);
                    return t367;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -265816009:
                if (cls.getName().equals("com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy")) {
                    T t368 = (T) new BulletHostProxy();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy", t368);
                    return t368;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -263622518:
                if (cls.getName().equals("com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService")) {
                    T t369 = (T) new AppLogReaperServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.statisticloggerapi.IAppLogReaperService", t369);
                    return t369;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -254209258:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.IEditMusicService")) {
                    T t370 = (T) new EditMusicServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.music.IEditMusicService", t370);
                    return t370;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -250218208:
                if (cls.getName().equals("com.ss.android.ugc.awemepushapi.IPushPermissionApi")) {
                    T t371 = (T) new PushPermissionPopupManager();
                    putStaticServiceImplCache("com.ss.android.ugc.awemepushapi.IPushPermissionApi", t371);
                    return t371;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -249931293:
                if (cls.getName().equals("com.ss.android.sdk.webview.di.IMainServiceForJsb")) {
                    T t372 = (T) new MainServiceForJsb();
                    putStaticServiceImplCache("com.ss.android.sdk.webview.di.IMainServiceForJsb", t372);
                    return t372;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -230404545:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountBindingsService")) {
                    T t373 = (T) new AccountBindingsService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IAccountBindingsService", t373);
                    return t373;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -227287719:
                if (cls.getName().equals("com.ss.android.ugc.aweme.api.IBootLogApi")) {
                    T t374 = (T) new IBootLogImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.api.IBootLogApi", t374);
                    return t374;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -219610361:
                if (cls.getName().equals("com.ss.android.ugc.aweme.sticker.IStickerViewService")) {
                    T t375 = (T) new StickerViewServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.sticker.IStickerViewService", t375);
                    return t375;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -219253809:
                if (cls.getName().equals("com.bytedance.effectcreatormobile.integrationTiktok.api.IInitCaller")) {
                    T t376 = (T) new InitImpl();
                    putStaticServiceImplCache("com.bytedance.effectcreatormobile.integrationTiktok.api.IInitCaller", t376);
                    return t376;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -206316949:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareFlavorService")) {
                    T t377 = (T) new ShareFlavorServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.share.ShareFlavorService", t377);
                    return t377;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -201169427:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IEncourageLogInService")) {
                    T t378 = (T) new EncourageLoginPopupManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IEncourageLogInService", t378);
                    return t378;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -199156479:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService")) {
                    T t379 = (T) new InviteFriendsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService", t379);
                    return t379;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -195560546:
                if (cls.getName().equals("com.ss.android.ugc.aweme.sync.IByteSyncInitProvider")) {
                    T t380 = (T) new ByteSyncInitProviderImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.sync.IByteSyncInitProvider", t380);
                    return t380;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -174647117:
                if (cls.getName().equals("com.ss.android.ugc.aweme.translation.service.ITranslationService")) {
                    T t381 = (T) new TranslationServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.translation.service.ITranslationService", t381);
                    return t381;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -173289775:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService")) {
                    T t382 = (T) new EcUgFeedEcCardService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService", t382);
                    return t382;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -173191450:
                if (cls.getName().equals("com.ss.android.ugc.aweme.api.IZeroRatingMainService")) {
                    T t383 = (T) new ZeroRatingMainServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.api.IZeroRatingMainService", t383);
                    return t383;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -166706490:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.IPromoteEntryCheckService")) {
                    T t384 = (T) new PromoteEntryCheckServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.IPromoteEntryCheckService", t384);
                    return t384;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -164731131:
                if (cls.getName().equals("com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter")) {
                    T t385 = (T) new AwemeTraceLogAdapter();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter", t385);
                    return t385;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -164713608:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService")) {
                    return (T) new SearchAdMainService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -163952826:
                if (cls.getName().equals("com.bytedance.ies.ugc.ttkvstorageapi.IGetTTKVStorageSettings")) {
                    T t386 = (T) new TTKVStorageSettings();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.ttkvstorageapi.IGetTTKVStorageSettings", t386);
                    return t386;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -154939370:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager")) {
                    T t387 = (T) new AdHybridContainerManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager", t387);
                    return t387;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -153981428:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.smartcheck.api.ICustomChecker")) {
                    T t388 = (T) new DemoOrderCenterChecker();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.smartcheck.api.ICustomChecker", t388);
                    return t388;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -152874787:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService")) {
                    T t389 = (T) new EcUgVSAService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService", t389);
                    return t389;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -138974023:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.IRetrofitFactory")) {
                    T t390 = (T) new RetrofitFactory();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.network.IRetrofitFactory", t390);
                    return t390;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -136102815:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService")) {
                    T t391 = (T) new ComplianceServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService", t391);
                    return t391;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -135365047:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.slide.IMainPageSlide")) {
                    T t392 = (T) new MainPageSlideImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.slide.IMainPageSlide", t392);
                    return t392;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -134854161:
                if (cls.getName().equals("com.aweme.kvstorage.spi.ISharedPreferencesProvider")) {
                    T t393 = (T) new SharedPreferencesProvider();
                    putStaticServiceImplCache("com.aweme.kvstorage.spi.ISharedPreferencesProvider", t393);
                    return t393;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -134222670:
                if (cls.getName().equals("com.ss.android.ugc.aweme.question.service.IQuestionDetailService")) {
                    T t394 = (T) new QuestionDetailServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.question.service.IQuestionDetailService", t394);
                    return t394;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -132128589:
                if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeService")) {
                    T t395 = (T) new ChallengeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.challenge.service.IChallengeService", t395);
                    return t395;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -130657778:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.AVApi")) {
                    return (T) new AVApiImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -123206016:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISettingService")) {
                    T t396 = (T) new SettingServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.ISettingService", t396);
                    return t396;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -115845173:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAVServiceProxy")) {
                    T t397 = (T) new AVServiceProxyImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IAVServiceProxy", t397);
                    return t397;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -112246770:
                if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.xbridge.ISearchBDXBridgeService")) {
                    T t398 = (T) new SearchBDXBridgeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.i18n.xbridge.ISearchBDXBridgeService", t398);
                    return t398;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -99973433:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider")) {
                    T t399 = (T) new FeedSkylightServiceProviderImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider", t399);
                    return t399;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -77732678:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService")) {
                    T t400 = (T) new TpcConsentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService", t400);
                    return t400;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -66305606:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen")) {
                    T t401 = (T) new AdLightWebPageOpenUtils();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen", t401);
                    return t401;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -63705348:
                if (cls.getName().equals("com.ss.android.ugc.aweme.experiment.stringhot.IStringHotUpdateOfflineSwitch")) {
                    T t402 = (T) new StringHotUpdateOfflineSwitchImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.experiment.stringhot.IStringHotUpdateOfflineSwitch", t402);
                    return t402;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -58960682:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi")) {
                    T t403 = (T) new CrashSdkImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi", t403);
                    return t403;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -56944482:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.ILanguageService")) {
                    T t404 = (T) new com.ss.android.ugc.aweme.setting.services.LanguageService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.main.service.ILanguageService", t404);
                    return t404;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -53525263:
                if (cls.getName().equals("com.ss.android.ugc.aweme.audiomode.fullepisodev2.service.IFullEpisodeRouterService")) {
                    T t405 = (T) new FullEpisodeRouterServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.audiomode.fullepisodev2.service.IFullEpisodeRouterService", t405);
                    return t405;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -48878288:
                if (cls.getName().equals("com.ss.android.ugc.aweme.specact.api.IBDXBridgeService")) {
                    T t406 = (T) new BDXBridgeHelper();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.specact.api.IBDXBridgeService", t406);
                    return t406;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -46995324:
                if (cls.getName().equals("com.ss.android.ugc.aweme.spi.IHomePageService")) {
                    T t407 = (T) new HomePageServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.spi.IHomePageService", t407);
                    return t407;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -45175540:
                if (cls.getName().equals("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService")) {
                    T t408 = (T) new ClientAiInitServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService", t408);
                    return t408;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -34027969:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAutobackupService")) {
                    T t409 = (T) new AutobackupService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IAutobackupService", t409);
                    return t409;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -15737757:
                if (cls.getName().equals("com.ss.android.ugc.aweme.locale.ILocalService")) {
                    T t410 = (T) new LocalServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.locale.ILocalService", t410);
                    return t410;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case -4982035:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger")) {
                    return (T) new SearchAdEventLogger();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2734354:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidSeriesReportService")) {
                    return (T) new PaidSeriesReportServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 8583776:
                if (cls.getName().equals("com.ss.android.ugc.aweme.social.widget.card.ISocialCardService")) {
                    T t411 = (T) new SocialCardServiceImp();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.social.widget.card.ISocialCardService", t411);
                    return t411;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 18606895:
                if (cls.getName().equals("com.ss.android.ugc.aweme.experiment.IPaidContentAnchorService")) {
                    return (T) new PaidContentAnchorService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 19092560:
                if (cls.getName().equals("com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService")) {
                    return (T) new NowPostDeleteServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 19988027:
                if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler")) {
                    T t412 = (T) new BridgeScanHandlerImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler", t412);
                    return t412;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 21995517:
                if (cls.getName().equals("com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService")) {
                    T t413 = (T) new RuleEngineServiceImpl();
                    putStaticServiceImplCache("com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService", t413);
                    return t413;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 23310771:
                if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IFriendsService")) {
                    T t414 = (T) new FriendsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.friends.service.IFriendsService", t414);
                    return t414;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 24289423:
                if (cls.getName().equals("com.ss.android.ugc.aweme.googlemap.IAdGoogleMapService")) {
                    T t415 = (T) new AdGoogleMapService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.googlemap.IAdGoogleMapService", t415);
                    return t415;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 26004728:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.HydraHDRAPI")) {
                    T t416 = (T) new HydraHDR();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.HydraHDRAPI", t416);
                    return t416;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 31921668:
                if (cls.getName().equals("com.ss.android.ugc.aweme.favorites.service.IFavoriteService")) {
                    T t417 = (T) new com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.favorites.service.IFavoriteService", t417);
                    return t417;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 42826893:
                if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IWebViewTweaker")) {
                    T t418 = (T) new WebViewTweakerService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.framework.services.IWebViewTweaker", t418);
                    return t418;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 46092534:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTrace")) {
                    T t419 = (T) new EngagementTraceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTrace", t419);
                    return t419;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 49063186:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISeriesPricingService")) {
                    T t420 = (T) new SeriesPricingServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ISeriesPricingService", t420);
                    return t420;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 53902533:
                if (cls.getName().equals("com.ss.android.ugc.aweme.upvote.service.IUpvoteService")) {
                    T t421 = (T) new UpvoteServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.upvote.service.IUpvoteService", t421);
                    return t421;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 55668885:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IToolsCPUDataService")) {
                    T t422 = (T) new ToolsCPUDataServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IToolsCPUDataService", t422);
                    return t422;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 57780698:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service")) {
                    T t423 = (T) new SmartPreloadProfileV2ServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service", t423);
                    return t423;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 58077286:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger")) {
                    return (T) new CommerceMusicLogger();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 63887496:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService")) {
                    T t424 = (T) new MutualRelationServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService", t424);
                    return t424;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 67799503:
                if (cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.ICustomAnchorViewService")) {
                    T t425 = (T) new CustomAnchorViewServicImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.anchor.service.ICustomAnchorViewService", t425);
                    return t425;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 68846725:
                if (cls.getName().equals("com.ss.android.ugc.aweme.network.channel.ISpeedModeService")) {
                    T t426 = (T) new SpeedModeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.network.channel.ISpeedModeService", t426);
                    return t426;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 70052694:
                if (cls.getName().equals("com.ss.android.elearning.lingo.gecko.GeckoAPI")) {
                    T t427 = (T) new GeckoService();
                    putStaticServiceImplCache("com.ss.android.elearning.lingo.gecko.GeckoAPI", t427);
                    return t427;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 71897024:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService")) {
                    T t428 = (T) new NoticeCountTabBadgePresentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService", t428);
                    return t428;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 78503464:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IDuetDownloadService")) {
                    T t429 = (T) new DuetDownloadService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IDuetDownloadService", t429);
                    return t429;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 87343796:
                if (cls.getName().equals("com.benchmark.IBTCHConfiguration")) {
                    T t430 = (T) new BTCHConfigurationImpl();
                    putStaticServiceImplCache("com.benchmark.IBTCHConfiguration", t430);
                    return t430;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 96990739:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService")) {
                    T t431 = (T) new ShakeEggService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService", t431);
                    return t431;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 108785856:
                if (cls.getName().equals("com.ss.android.ugc.aweme.sticker.InteractStickerContainerGetterApi")) {
                    T t432 = (T) new StickerContainerService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.sticker.InteractStickerContainerGetterApi", t432);
                    return t432;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 113360460:
                if (cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService")) {
                    T t433 = (T) new AnchorStateServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService", t433);
                    return t433;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 118052236:
                if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IShoutOutApiService")) {
                    T t434 = (T) new ShoutOutServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.internal.IShoutOutApiService", t434);
                    return t434;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 120575931:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.ICommerceService")) {
                    T t435 = (T) new com.ss.android.ugc.aweme.di.CommerceServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.main.service.ICommerceService", t435);
                    return t435;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 121909881:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IEditorProIconService")) {
                    T t436 = (T) new EditorProIconServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IEditorProIconService", t436);
                    return t436;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 122036734:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.addyours.service.IAddYoursService")) {
                    T t437 = (T) new AddYoursServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.tiktok.addyours.service.IAddYoursService", t437);
                    return t437;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 126860504:
                if (cls.getName().equals("com.ss.android.ugc.aweme.innerpush.api.IInnerPushService")) {
                    T t438 = (T) new InnerPushServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.innerpush.api.IInnerPushService", t438);
                    return t438;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 127179552:
                if (cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService")) {
                    T t439 = (T) new OptimizerHelperServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService", t439);
                    return t439;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 128063043:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService")) {
                    T t440 = (T) new AntiAddictionServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService", t440);
                    return t440;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 129889384:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IVEABService")) {
                    T t441 = (T) new VEABServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IVEABService", t441);
                    return t441;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 154527039:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi")) {
                    return (T) new MobLaunchImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 159071507:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tag.service.ITagService")) {
                    T t442 = (T) new TagServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tag.service.ITagService", t442);
                    return t442;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 163017647:
                if (cls.getName().equals("com.ss.android.ugc.awemepushapi.IPushApi")) {
                    return (T) new PushService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 163116135:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager")) {
                    return (T) new VideoPlayTaskManager();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 168006665:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior")) {
                    T t443 = (T) new CommerceHybridBottomSheetDialogFragmentBehaviorImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior", t443);
                    return t443;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 168408294:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.ISearchCardLiveService")) {
                    T t444 = (T) new SearchCardLiveService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.live.ISearchCardLiveService", t444);
                    return t444;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 169477130:
                if (cls.getName().equals("com.ss.android.ugc.aweme.base.storage.IStorageCleanService")) {
                    T t445 = (T) new StorageCleanServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.base.storage.IStorageCleanService", t445);
                    return t445;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 170335309:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.video.ICreativePageService")) {
                    T t446 = (T) new CreativePageService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.video.ICreativePageService", t446);
                    return t446;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 171919810:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService")) {
                    T t447 = (T) new TooltipApplicabilityService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService", t447);
                    return t447;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 180595487:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IPreloadApiService")) {
                    T t448 = (T) new PreloadApiServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IPreloadApiService", t448);
                    return t448;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 182098267:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory")) {
                    T t449 = (T) new EffectPlatformFactory();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory", t449);
                    return t449;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 188203150:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.experiment.IPowerExperimentsApi")) {
                    T t450 = (T) new PowerExperimentsImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.experiment.IPowerExperimentsApi", t450);
                    return t450;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 188444379:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.IFeedSharePlayInfoHelperProvider")) {
                    T t451 = (T) new FeedSharePlayInfoHelperProvider();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.search.IFeedSharePlayInfoHelperProvider", t451);
                    return t451;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 189816622:
                if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService")) {
                    T t452 = (T) new AuthorizeCommonService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService", t452);
                    return t452;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 193978339:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService")) {
                    T t453 = (T) new AgeGateServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService", t453);
                    return t453;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 197041894:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.SmartOHRService")) {
                    T t454 = (T) new SmartOHRServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.SmartOHRService", t454);
                    return t454;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 197343978:
                if (cls.getName().equals("com.ss.android.ugc.aweme.mix.services.IMixFeedService")) {
                    T t455 = (T) new MixFeedService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.mix.services.IMixFeedService", t455);
                    return t455;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 199481663:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService")) {
                    T t456 = (T) new DefaultLogisticStrategyService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService", t456);
                    return t456;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 204269336:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService")) {
                    T t457 = (T) new AgeAppealServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService", t457);
                    return t457;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 206207455:
                if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService")) {
                    T t458 = (T) new ECommerceRNToLynxConfigService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService", t458);
                    return t458;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 207468481:
                if (cls.getName().equals("com.bytedance.ies.powerlist.IPowerContext")) {
                    T t459 = (T) new PowerContextImpl();
                    putStaticServiceImplCache("com.bytedance.ies.powerlist.IPowerContext", t459);
                    return t459;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 208886985:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.ISearchVideoPlayTaskManager")) {
                    return (T) new SearchVideoPlayTaskManager();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 220135637:
                if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IRetrofitService")) {
                    T t460 = (T) new RetrofitService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.framework.services.IRetrofitService", t460);
                    return t460;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 221073588:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountMainService")) {
                    T t461 = (T) new AccountMainServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IAccountMainService", t461);
                    return t461;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 242450399:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi")) {
                    T t462 = (T) new ExitBackgroundActivityImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.ExitBackgroundActivityApi", t462);
                    return t462;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 249088543:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance")) {
                    T t463 = (T) new KidsMusicEntrance();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance", t463);
                    return t463;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 249161876:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger")) {
                    return (T) new TopViewAdEventLogger();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 257760762:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceServiceForSa")) {
                    T t464 = (T) new ECommerceMallService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceServiceForSa", t464);
                    return t464;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 257802734:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager")) {
                    T t465 = (T) new MRCManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager", t465);
                    return t465;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 261385584:
                if (cls.getName().equals("com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger")) {
                    T t466 = (T) new UnsampledTraceLoggerImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger", t466);
                    return t466;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 263685118:
                if (cls.getName().equals("com.bytedance.tpsw.api.vk.IVKService")) {
                    T t467 = (T) new VKService();
                    putStaticServiceImplCache("com.bytedance.tpsw.api.vk.IVKService", t467);
                    return t467;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 269994594:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2")) {
                    T t468 = (T) new UniversalPopupManager2();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2", t468);
                    return t468;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 271148800:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IMandatoryLoginService")) {
                    T t469 = (T) new MandatoryLoginService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IMandatoryLoginService", t469);
                    return t469;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 292706387:
                if (cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkCollectionInitService")) {
                    T t470 = (T) new BenchmarkCollectionInitService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.bl.IBenchmarkCollectionInitService", t470);
                    return t470;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 293382781:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService")) {
                    T t471 = (T) new ShareWarningInfoServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService", t471);
                    return t471;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 294068060:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareH5Service")) {
                    T t472 = (T) new ShareH5ServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.share.ShareH5Service", t472);
                    return t472;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 297218742:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFeedSkylightService")) {
                    T t473 = (T) new FeedSkylightServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IFeedSkylightService", t473);
                    return t473;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 299769180:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ui.IEcomImageMonitor")) {
                    T t474 = (T) new EcomImageMonitorImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.ui.IEcomImageMonitor", t474);
                    return t474;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 311680729:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService")) {
                    T t475 = (T) new CommerceToolsTcmServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService", t475);
                    return t475;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 315727851:
                if (cls.getName().equals("com.ss.android.ugc.aweme.inbox.InboxEasyNavigationPageNameService")) {
                    T t476 = (T) new InboxEasyNavigationPageNameServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.inbox.InboxEasyNavigationPageNameService", t476);
                    return t476;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 316475372:
                if (cls.getName().equals("com.ss.android.ugc.aweme.story.IStoryService")) {
                    T t477 = (T) new StoryServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.story.IStoryService", t477);
                    return t477;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 324478519:
                if (cls.getName().equals("com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi")) {
                    T t478 = (T) new NonLoginNotifyService();
                    putStaticServiceImplCache("com.ss.android.ugc.localnotifyapi.INonLoginNotifyApi", t478);
                    return t478;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 324722410:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IAnalyticsDetailService")) {
                    return (T) new AnalyticsDetailService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 326604455:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.external.ICommerceToolsService")) {
                    T t479 = (T) new CommerceToolsService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.external.ICommerceToolsService", t479);
                    return t479;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 327622412:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IPasskeyService")) {
                    T t480 = (T) new PasskeyService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IPasskeyService", t480);
                    return t480;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 330051722:
                if (cls.getName().equals("com.ss.android.elearning.lingo.settings.IElSettingService")) {
                    T t481 = (T) new ElSettingDefault();
                    putStaticServiceImplCache("com.ss.android.elearning.lingo.settings.IElSettingService", t481);
                    return t481;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 342596789:
                if (cls.getName().equals("com.ss.android.ugc.aweme.aigc.IAIGCAvatarService")) {
                    T t482 = (T) new AIGCAvatarServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.aigc.IAIGCAvatarService", t482);
                    return t482;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 349326855:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.IMafRedPointDismissHelper")) {
                    T t483 = (T) new MafRedPointDismissHelper();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.profile.IMafRedPointDismissHelper", t483);
                    return t483;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 355979482:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountInitializer")) {
                    T t484 = (T) new AccountInitializer();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IAccountInitializer", t484);
                    return t484;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 357894987:
                if (cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi")) {
                    T t485 = (T) new ConfigCenterCenterBridgeImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi", t485);
                    return t485;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 361159208:
                if (cls.getName().equals("com.ss.android.ugc.aweme.web.IGeckoXClientManager")) {
                    T t486 = (T) new GeckoXClientManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.web.IGeckoXClientManager", t486);
                    return t486;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 377237768:
                if (cls.getName().equals("com.bytedance.pumbaa.hybrid.rasp.api.IRaspService")) {
                    T t487 = (T) new RaspServiceImpl();
                    putStaticServiceImplCache("com.bytedance.pumbaa.hybrid.rasp.api.IRaspService", t487);
                    return t487;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 380734020:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowLimitService")) {
                    T t488 = (T) new NowLimitService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INowLimitService", t488);
                    return t488;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 381707090:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService")) {
                    T t489 = (T) new AdReRankServiceManager();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService", t489);
                    return t489;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 394604807:
                if (cls.getName().equals("com.ss.android.ugc.aweme.net.INetReleaseInterceptor")) {
                    return (T) new NetWorkSpeedInterceptor();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 396547665:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService")) {
                    T t490 = (T) new SandboxServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService", t490);
                    return t490;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 401026538:
                if (cls.getName().equals("com.ss.android.ugc.aweme.screenshot.IScreenshotService")) {
                    T t491 = (T) new ScreenShotService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.screenshot.IScreenshotService", t491);
                    return t491;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 402978358:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService")) {
                    T t492 = (T) new CommerceToolsChallengeService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService", t492);
                    return t492;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 403114353:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService")) {
                    return (T) new SearchAdServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 404162146:
                if (cls.getName().equals("com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics")) {
                    T t493 = (T) new SearchResultStatisticsImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics", t493);
                    return t493;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 414350146:
                if (cls.getName().equals("com.ss.android.ugc.aweme.comment.services.IKeyboardService")) {
                    T t494 = (T) new KeyboardServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.comment.services.IKeyboardService", t494);
                    return t494;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 415807143:
                if (cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorRecordPageFactory")) {
                    T t495 = (T) new ExteriorRecordPageFactoryImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorRecordPageFactory", t495);
                    return t495;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 415858947:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewForestService")) {
                    T t496 = (T) new AdWebViewForestServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewForestService", t496);
                    return t496;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 420130094:
                if (cls.getName().equals("com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService")) {
                    T t497 = (T) new DoubleColorBallAnimationViewExperimentServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService", t497);
                    return t497;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 428046614:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEComHybridLynxBehaviorService")) {
                    T t498 = (T) new EComHybridLiveLynxBehaviorServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEComHybridLynxBehaviorService", t498);
                    return t498;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 433186867:
                if (cls.getName().equals("com.ss.android.ugc.aweme.portrait.api.IIMClientPortraitProducerService")) {
                    T t499 = (T) new IMClientPortraitProducerService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.portrait.api.IIMClientPortraitProducerService", t499);
                    return t499;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 434702730:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider")) {
                    T t500 = (T) new InterceptorHolder();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider", t500);
                    return t500;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 434710543:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISocPubStatusRepoService")) {
                    T t501 = (T) new SocPubStatusRepoServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ISocPubStatusRepoService", t501);
                    return t501;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 434996455:
                if (cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.IAnchorListService")) {
                    T t502 = (T) new AnchorListServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.anchor.service.IAnchorListService", t502);
                    return t502;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 444334993:
                if (cls.getName().equals("com.ss.android.ugc.aweme.network.spi.INetworkContextService")) {
                    T t503 = (T) new NetworkContextService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.network.spi.INetworkContextService", t503);
                    return t503;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 453717049:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager")) {
                    T t504 = (T) new ReportAwemeManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager", t504);
                    return t504;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 457276431:
                if (cls.getName().equals("com.lingo.caption.api.LingoCaptionApi")) {
                    T t505 = (T) new LingoCaptionImpl();
                    putStaticServiceImplCache("com.lingo.caption.api.LingoCaptionApi", t505);
                    return t505;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 470426976:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil")) {
                    T t506 = (T) new PrivacyDisclaimerUtilService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil", t506);
                    return t506;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 477254501:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VqscoreLiveAPI")) {
                    T t507 = (T) new VqscoreLive();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.VqscoreLiveAPI", t507);
                    return t507;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 483183455:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.ui.INewUserProgressBarService")) {
                    T t508 = (T) new NewUserProgressBarManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.ui.INewUserProgressBarService", t508);
                    return t508;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 489980098:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService")) {
                    T t509 = (T) new AudioWatermarkServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService", t509);
                    return t509;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 493767622:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService")) {
                    return (T) new CommerceMediaOutService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 495334429:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.promote.IPromoteReplaceMusicService")) {
                    T t510 = (T) new PromoteRepalceMusicServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commerce.tools.promote.IPromoteReplaceMusicService", t510);
                    return t510;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 501025197:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IExternalService")) {
                    T t511 = (T) new AVExternalServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IExternalService", t511);
                    return t511;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 507480096:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager")) {
                    T t512 = (T) new FeedBackDialogManagerService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager", t512);
                    return t512;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 509545079:
                if (cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker")) {
                    T t513 = (T) new VideoLengthChecker();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker", t513);
                    return t513;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 514480344:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ug.brand.IBrandService")) {
                    T t514 = (T) new BrandServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ug.brand.IBrandService", t514);
                    return t514;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 516119261:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareDependService")) {
                    T t515 = (T) new ShareDependServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.share.ShareDependService", t515);
                    return t515;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 524459443:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentService")) {
                    T t516 = (T) new PNSConsentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentService", t516);
                    return t516;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 524921666:
                if (cls.getName().equals("com.ss.android.ugc.aweme.DetailFeedService")) {
                    T t517 = (T) new DetailFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.DetailFeedService", t517);
                    return t517;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 527997931:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend")) {
                    T t518 = (T) new AdCommentDependImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend", t518);
                    return t518;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 528772375:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi")) {
                    T t519 = (T) new LauncherTaskApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi", t519);
                    return t519;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 530557379:
                if (cls.getName().equals("com.ss.android.ugc.aweme.utils.IAdOpenHelper")) {
                    T t520 = (T) new AdOpenHelperImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.utils.IAdOpenHelper", t520);
                    return t520;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 531388658:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi")) {
                    T t521 = (T) new AppsflyerImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi", t521);
                    return t521;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 532654456:
                if (cls.getName().equals("com.ss.android.ugc.aweme.sticker.AddYoursModelCheckServiceApi")) {
                    T t522 = (T) new AddYoursModelCheckService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.sticker.AddYoursModelCheckServiceApi", t522);
                    return t522;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 535970203:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.sticker.ICaptionService")) {
                    T t523 = (T) new com.ss.android.ugc.aweme.shortvideo.subtitle.CaptionServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.sticker.ICaptionService", t523);
                    return t523;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 540084577:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IDuetDetailService")) {
                    T t524 = (T) new DuetDetailServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.detail.IDuetDetailService", t524);
                    return t524;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 548577086:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService")) {
                    T t525 = (T) new PNSDeviceConsentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService", t525);
                    return t525;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 561594401:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil")) {
                    T t526 = (T) new PromoteUtilImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil", t526);
                    return t526;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 562723769:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IMusicService")) {
                    T t527 = (T) new com.ss.android.ugc.aweme.services.MusicService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IMusicService", t527);
                    return t527;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 572972021:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IStorageService")) {
                    T t528 = (T) new StorageServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.IStorageService", t528);
                    return t528;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 574390740:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowFeedPreLoadService")) {
                    T t529 = (T) new NowFeedPreLoadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INowFeedPreLoadService", t529);
                    return t529;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 574732927:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService")) {
                    T t530 = (T) new DiscoveryServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService", t530);
                    return t530;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 577466544:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService")) {
                    return (T) new PreciseAdServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 581633627:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService")) {
                    T t531 = (T) new PageNodeMonitorService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService", t531);
                    return t531;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 582757776:
                if (cls.getName().equals("com.ss.android.ugc.aweme.accountxbridge.IAccountBDXBridgeService")) {
                    T t532 = (T) new AccountBDXBridgeService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.accountxbridge.IAccountBDXBridgeService", t532);
                    return t532;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 584237458:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplashnp.IRealTimeSplashNPManager")) {
                    T t533 = (T) new RealTimeSplashNPManagerImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplashnp.IRealTimeSplashNPManager", t533);
                    return t533;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 587542919:
                if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService")) {
                    T t534 = (T) new ChallengeDetailServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService", t534);
                    return t534;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 593443641:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowCaptionService")) {
                    T t535 = (T) new NowCaptionService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INowCaptionService", t535);
                    return t535;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 596401653:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService")) {
                    T t536 = (T) new CommercializeAdServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService", t536);
                    return t536;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 596657451:
                if (cls.getName().equals("com.bytedance.ies.ugc.appcontext.AppBuildConfig")) {
                    T t537 = (T) new AwemeAppBuildConfig();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.appcontext.AppBuildConfig", t537);
                    return t537;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 596851023:
                if (cls.getName().equals("com.bytedance.bdlocation.client.IBDLocationClient")) {
                    return (T) new BDLocationClient();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 602001356:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.router.IStrategyService")) {
                    T t538 = (T) new StrategyService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.router.IStrategyService", t538);
                    return t538;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 607980095:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IGuestModeService")) {
                    T t539 = (T) new GuestModeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IGuestModeService", t539);
                    return t539;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 609285546:
                if (cls.getName().equals("com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService")) {
                    T t540 = (T) new AvatarInternalServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.avatar.internalonly.IAvatarInternalService", t540);
                    return t540;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 612752120:
                if (cls.getName().equals("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService")) {
                    T t541 = (T) new ContentLanguageServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService", t541);
                    return t541;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 620814287:
                if (cls.getName().equals("com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService")) {
                    T t542 = (T) new RecommendConsumeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.utils.IFeedRecommendConsumeService", t542);
                    return t542;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 623636593:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.audio.IAudioExtractUpload")) {
                    return (T) new UploadByFileService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 628657657:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ITextModeService")) {
                    T t543 = (T) new TextModeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ITextModeService", t543);
                    return t543;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 631540268:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.IAdCommentService")) {
                    T t544 = (T) new AdCommentService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.comment.IAdCommentService", t544);
                    return t544;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 633152030:
                if (cls.getName().equals("com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil")) {
                    T t545 = (T) new AccountNonceUtilImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil", t545);
                    return t545;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 634505157:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.report.IReportService")) {
                    T t546 = (T) new ReportServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.report.IReportService", t546);
                    return t546;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 642369832:
                if (cls.getName().equals("com.bytedance.ies.web.jsbridge2.IJsBridge2Config")) {
                    return (T) new JsBridge2ConfigImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 642811702:
                if (cls.getName().equals("com.ss.android.ugc.aweme.spi.HomePageCommonService")) {
                    T t547 = (T) new HomePageCommonServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.spi.HomePageCommonService", t547);
                    return t547;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 647695418:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService")) {
                    T t548 = (T) new NoticeCommentHelperServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService", t548);
                    return t548;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 659583746:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.mutual.IProfileShowMutualTabService")) {
                    T t549 = (T) new ProfileShowMutualTabServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.profile.mutual.IProfileShowMutualTabService", t549);
                    return t549;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 663566436:
                if (cls.getName().equals("com.ss.android.ugc.musicprovider.IMusicProviderConfig")) {
                    T t550 = (T) new MusicProviderConfigProxy();
                    putStaticServiceImplCache("com.ss.android.ugc.musicprovider.IMusicProviderConfig", t550);
                    return t550;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 665909581:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.assem.IAssemblerService")) {
                    T t551 = (T) new AdAssemblerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.assem.IAssemblerService", t551);
                    return t551;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 669378360:
                if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount")) {
                    T t552 = (T) new ApiNetworkServiceForAccount();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount", t552);
                    return t552;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 672340145:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ICLAPerfETService")) {
                    T t553 = (T) new ICLAPerfETServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ICLAPerfETService", t553);
                    return t553;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 674144051:
                if (cls.getName().equals("com.ss.android.legoapi.freso.IFrescoLegoTaskApi")) {
                    T t554 = (T) new FrescoLegoTaskImpl();
                    putStaticServiceImplCache("com.ss.android.legoapi.freso.IFrescoLegoTaskApi", t554);
                    return t554;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 679237247:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.dm.IDMPublishService")) {
                    T t555 = (T) new DMPublishServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.dm.IDMPublishService", t555);
                    return t555;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 679787403:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IDanmakuService")) {
                    T t556 = (T) new DanmakuServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IDanmakuService", t556);
                    return t556;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 685835610:
                if (cls.getName().equals("com.ss.android.elearning.lingo.tracker.ElTrackerService")) {
                    T t557 = (T) new ElTrackerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.elearning.lingo.tracker.ElTrackerService", t557);
                    return t557;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 685861510:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService")) {
                    T t558 = (T) new CommerceProfileService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService", t558);
                    return t558;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 696264772:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IDetailPageShareVMService")) {
                    T t559 = (T) new SearchOfficialVideoDetailSharedVMService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IDetailPageShareVMService", t559);
                    return t559;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 698926204:
                if (cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService")) {
                    return (T) new IRecommendUsersServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 700448755:
                if (cls.getName().equals("com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi")) {
                    T t560 = (T) new AccountShowConfirmPromptServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi", t560);
                    return t560;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 707572774:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService")) {
                    T t561 = (T) new KidsCommonServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService", t561);
                    return t561;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 712413375:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IBuildConfigAllService")) {
                    T t562 = (T) new BuildConfigAllServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IBuildConfigAllService", t562);
                    return t562;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 712436972:
                if (cls.getName().equals("com.ss.android.ugc.aweme.sticker.IStickerService")) {
                    T t563 = (T) new StickerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.sticker.IStickerService", t563);
                    return t563;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 723787770:
                if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter")) {
                    T t564 = (T) new QRCodePermissionActivityStarter();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter", t564);
                    return t564;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 727340201:
                if (cls.getName().equals("com.ss.android.ugc.aweme.network.INetwork")) {
                    return (T) new NetworkService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 729554431:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService")) {
                    T t565 = (T) new RomaCheckService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService", t565);
                    return t565;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 730432555:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IUgAllService")) {
                    T t566 = (T) new UgAllServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IUgAllService", t566);
                    return t566;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 735010773:
                if (cls.getName().equals("com.ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider")) {
                    return (T) new HybridRegistryProvider();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 736344268:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IDetailPageOperatorService")) {
                    T t567 = (T) new ChallengeDetailPageOperatorServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IDetailPageOperatorService", t567);
                    return t567;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 741106177:
                if (cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkService")) {
                    T t568 = (T) new BenchmarkServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.bl.IBenchmarkService", t568);
                    return t568;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 750430875:
                if (cls.getName().equals("com.ss.android.ugc.aweme.album.IToolsAlbumService")) {
                    T t569 = (T) new ToolsAlbumServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.album.IToolsAlbumService", t569);
                    return t569;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 753323261:
                if (cls.getName().equals("com.ss.android.ugc.aweme.sync.IByteSyncApi")) {
                    T t570 = (T) new ByteSyncApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.sync.IByteSyncApi", t570);
                    return t570;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 753788208:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ICaptionSheetService")) {
                    T t571 = (T) new CaptionSheetServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.ICaptionSheetService", t571);
                    return t571;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 755445474:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IAttributionService")) {
                    T t572 = (T) new AttributionService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IAttributionService", t572);
                    return t572;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 757747585:
                if (cls.getName().equals("com.ss.android.ugc.aweme.topic.ITopicCommonService")) {
                    T t573 = (T) new TopicCommonService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.topic.ITopicCommonService", t573);
                    return t573;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 758021698:
                if (cls.getName().equals("com.ss.android.ugc.aweme.vision.IPhotoSearchService")) {
                    return (T) new EComPhotoSearchServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 761913918:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.label.IMutualLabelTextFactory")) {
                    T t574 = (T) new MutualLabelTextFactory();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.label.IMutualLabelTextFactory", t574);
                    return t574;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 763194376:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService")) {
                    T t575 = (T) new ConsistentContentAndAdChoiceServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService", t575);
                    return t575;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 767497026:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService")) {
                    T t576 = (T) new com.ss.android.ugc.aweme.kids.liked.FavoriteServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService", t576);
                    return t576;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 772470967:
                if (cls.getName().equals("com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService")) {
                    T t577 = (T) new SocialPublishBridgeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService", t577);
                    return t577;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 781329451:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.ui.IFeedUniformFontService")) {
                    T t578 = (T) new FeedUniformFontServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.ui.IFeedUniformFontService", t578);
                    return t578;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 789849192:
                if (cls.getName().equals("com.ss.android.ugc.aweme.websocket.api.service.IWsService")) {
                    T t579 = (T) new WsManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.websocket.api.service.IWsService", t579);
                    return t579;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 797774759:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService")) {
                    T t580 = (T) new CommerceCommonServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService", t580);
                    return t580;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 814572388:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IKnownWeakPasswordService")) {
                    T t581 = (T) new KnownWeakPasswordService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IKnownWeakPasswordService", t581);
                    return t581;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 816898295:
                if (cls.getName().equals("com.ss.android.ugc.aweme.contact.service.IIMContactService")) {
                    T t582 = (T) new IMContactServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.contact.service.IIMContactService", t582);
                    return t582;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 831845489:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IPasskeyPopUpHelper")) {
                    T t583 = (T) new PasskeyPopUpHelper();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IPasskeyPopUpHelper", t583);
                    return t583;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 834678077:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService")) {
                    T t584 = (T) new PushLaunchPageAssistantService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService", t584);
                    return t584;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 835302924:
                if (cls.getName().equals("com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule")) {
                    T t585 = (T) new AdLandPageRealtimeResourceModule();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule", t585);
                    return t585;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 840163770:
                if (cls.getName().equals("com.bytedance.pumbaa.base.ICommonService")) {
                    T t586 = (T) new BPEAPumbaaService();
                    putStaticServiceImplCache("com.bytedance.pumbaa.base.ICommonService", t586);
                    return t586;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 844437951:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.setting.api.ISettingService")) {
                    T t587 = (T) new com.ss.android.ugc.aweme.kids.setting.SettingServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.setting.api.ISettingService", t587);
                    return t587;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 849109598:
                if (cls.getName().equals("com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService")) {
                    T t588 = (T) new InboxMobEventServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService", t588);
                    return t588;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 856538528:
                if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService")) {
                    T t589 = (T) new ECommerceLiveSettingsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService", t589);
                    return t589;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 864194132:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.IAwemeApplicationService")) {
                    T t590 = (T) new AwemeApplicationServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.IAwemeApplicationService", t590);
                    return t590;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 866935518:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.INoticeService")) {
                    T t591 = (T) new NoticeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.services.INoticeService", t591);
                    return t591;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 875255812:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.ui.IFeedRecommendFragmentProvider")) {
                    T t592 = (T) new FeedRecommendFragmentProvider();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.ui.IFeedRecommendFragmentProvider", t592);
                    return t592;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 881706831:
                if (cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi")) {
                    T t593 = (T) new AbTestManagerApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi", t593);
                    return t593;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 885632920:
                if (cls.getName().equals("com.bytedance.geckox.IGeckoLowStorageConfig")) {
                    T t594 = (T) new GeckoLowStorageConfigImpl();
                    putStaticServiceImplCache("com.bytedance.geckox.IGeckoLowStorageConfig", t594);
                    return t594;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 892608820:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager")) {
                    T t595 = (T) new MallServiceManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager", t595);
                    return t595;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 895164503:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IRegionService")) {
                    T t596 = (T) new RegionService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.services.IRegionService", t596);
                    return t596;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 897816322:
                if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService")) {
                    T t597 = (T) new MSAdaptionService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService", t597);
                    return t597;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 898628767:
                if (cls.getName().equals("com.ss.android.ugc.aweme.innerpush.api.IInnerPushDebugService")) {
                    T t598 = (T) new InnerPushDebugServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.innerpush.api.IInnerPushDebugService", t598);
                    return t598;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 905737872:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService")) {
                    T t599 = (T) new AdSceneServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService", t599);
                    return t599;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 907081166:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.utils.ICommercializeSearchMainService")) {
                    return (T) new CommercializeSearchMainServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 913277804:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.IProfileService")) {
                    return (T) new ProfileServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 913381457:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.base.pdp.adapter.IPdpListUIRegisterService")) {
                    T t600 = (T) new BuyTogetherUIRegister();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.base.pdp.adapter.IPdpListUIRegisterService", t600);
                    return t600;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 930118730:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerService")) {
                    return (T) new CommerceStickerServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 938138167:
                if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.xbridge.ICommerceXBridgetService")) {
                    T t601 = (T) new CommerceXBridgetServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.i18n.xbridge.ICommerceXBridgetService", t601);
                    return t601;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 938216902:
                if (cls.getName().equals("com.ss.android.ugc.aweme.mapapi.IPoiMapService")) {
                    T t602 = (T) new PoiMapServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.mapapi.IPoiMapService", t602);
                    return t602;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 941303398:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ISearchService")) {
                    return (T) new SearchServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 956329375:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService")) {
                    T t603 = (T) new SplashSettingServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService", t603);
                    return t603;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 958565090:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.plugin.service.IPluginService")) {
                    T t604 = (T) new AabPluginServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.plugin.service.IPluginService", t604);
                    return t604;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 959171338:
                if (cls.getName().equals("com.ss.android.ugc.aweme.openshare.IShareRespSendService")) {
                    T t605 = (T) new ShareRespSendServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.openshare.IShareRespSendService", t605);
                    return t605;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 960604610:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService")) {
                    T t606 = (T) new PaidContentPreviewTagServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IPaidContentPreviewTagService", t606);
                    return t606;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 963655847:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IWatchHistoryValue")) {
                    T t607 = (T) new WatchHistoryValueService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IWatchHistoryValue", t607);
                    return t607;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 966494283:
                if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProviderOutService")) {
                    return (T) new ChallengeDetailProviderOutService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 970570381:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmOutService")) {
                    return (T) new TcmOutService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 973482728:
                if (cls.getName().equals("com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService")) {
                    T t608 = (T) new WsMonitor();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService", t608);
                    return t608;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 983252254:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPhotoViewModel")) {
                    T t609 = (T) new PhotoViewModelImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IPhotoViewModel", t609);
                    return t609;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 988528279:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAccountHelperService")) {
                    T t610 = (T) new AccountHelperService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IAccountHelperService", t610);
                    return t610;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 990307162:
                if (cls.getName().equals("com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService")) {
                    T t611 = (T) new NetworkStandardUIServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService", t611);
                    return t611;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 997089185:
                if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IInternalCommerceService")) {
                    T t612 = (T) new AVCommerceServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.internal.IInternalCommerceService", t612);
                    return t612;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 999164242:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule")) {
                    T t613 = (T) new GlobalSearchAdModuleImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.IGlobalSearchAdModule", t613);
                    return t613;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1000535180:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.stitch.IStitchService")) {
                    T t614 = (T) new StitchServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.stitch.IStitchService", t614);
                    return t614;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1002351933:
                if (cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi")) {
                    T t615 = (T) new SettingsRequestApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi", t615);
                    return t615;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1018751923:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService")) {
                    T t616 = (T) new SplashAdServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService", t616);
                    return t616;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1020813802:
                if (cls.getName().equals("com.bytedance.pumbaa.api.IPumbaaService")) {
                    T t617 = (T) new PumbaaServiceImpl();
                    putStaticServiceImplCache("com.bytedance.pumbaa.api.IPumbaaService", t617);
                    return t617;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1025883566:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService$DebugService")) {
                    T t618 = (T) new PipDebugServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService$DebugService", t618);
                    return t618;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1029031535:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService")) {
                    T t619 = (T) new TalentAdRevenueShareServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService", t619);
                    return t619;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1031729450:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService")) {
                    T t620 = (T) new DefaultStoryForwardServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.story.forward.IStoryForwardService", t620);
                    return t620;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1038823878:
                if (cls.getName().equals("com.ss.android.ugc.aweme.api.IFeedService")) {
                    T t621 = (T) new FeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.api.IFeedService", t621);
                    return t621;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1040233401:
                if (cls.getName().equals("com.ss.android.ugc.aweme.webview.IWebViewInlineJSInjectService")) {
                    T t622 = (T) new WebViewInlineJSInjectServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.webview.IWebViewInlineJSInjectService", t622);
                    return t622;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1044049149:
                if (cls.getName().equals("com.ss.android.ugc.aweme.web.ICrossPlatformJsbProxy")) {
                    T t623 = (T) new CrossPlatformJsbProxy();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.web.ICrossPlatformJsbProxy", t623);
                    return t623;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1045451100:
                if (cls.getName().equals("com.bytedance.touchpoint.api.ITouchPointService")) {
                    T t624 = (T) new TouchPointServiceImpl();
                    putStaticServiceImplCache("com.bytedance.touchpoint.api.ITouchPointService", t624);
                    return t624;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1053771019:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.NoiseDetectAPI")) {
                    T t625 = (T) new NoiseDetect();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.NoiseDetectAPI", t625);
                    return t625;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1055080032:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService")) {
                    T t626 = (T) new SearchMiddleForEcService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService", t626);
                    return t626;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1059333855:
                if (cls.getName().equals("com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService")) {
                    T t627 = (T) new IMCoreDependProxyService();
                    putStaticServiceImplCache("com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService", t627);
                    return t627;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1061883399:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAutoCutService")) {
                    T t628 = (T) new AutoCutServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IAutoCutService", t628);
                    return t628;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1063139064:
                if (cls.getName().equals("com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService")) {
                    T t629 = (T) new ForwardStatisticsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService", t629);
                    return t629;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1073258125:
                if (cls.getName().equals("com.bytedance.pumbaa.pdp.api.IPolicyDecision")) {
                    T t630 = (T) new PolicyDecisionImp();
                    putStaticServiceImplCache("com.bytedance.pumbaa.pdp.api.IPolicyDecision", t630);
                    return t630;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1077818494:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService")) {
                    T t631 = (T) new PdpCardBridgeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService", t631);
                    return t631;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1087518537:
                if (cls.getName().equals("com.ss.android.ugc.aweme.strategy.api.IStrategyApi")) {
                    T t632 = (T) new StrategyImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.strategy.api.IStrategyApi", t632);
                    return t632;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1091358875:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService")) {
                    T t633 = (T) new CommerceToolsStickerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService", t633);
                    return t633;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1095119298:
                if (cls.getName().equals("com.ss.android.elearning.lingo.log.ElLogService")) {
                    T t634 = (T) new ElLogDefault();
                    putStaticServiceImplCache("com.ss.android.elearning.lingo.log.ElLogService", t634);
                    return t634;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1098343408:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService")) {
                    return (T) new ProfileAIGCServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1100609238:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService")) {
                    T t635 = (T) new CommerceMediaServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService", t635);
                    return t635;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1105890211:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService")) {
                    T t636 = (T) new CommerceMissionServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService", t636);
                    return t636;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1109873977:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveHostOuterService")) {
                    T t637 = (T) new LiveHostOuterService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.live.ILiveHostOuterService", t637);
                    return t637;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1110345745:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService")) {
                    T t638 = (T) new GoogleOneTapService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService", t638);
                    return t638;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1116160691:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService")) {
                    T t639 = (T) new UnLoginDiggService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService", t639);
                    return t639;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1122426817:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService")) {
                    return (T) new HomepageExperimentServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1141291340:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService")) {
                    T t640 = (T) new ComplianceSettingsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService", t640);
                    return t640;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1153825525:
                if (cls.getName().equals("com.ss.android.ugc.aweme.trace.ITraceLogWrapApi")) {
                    T t641 = (T) new TraceLogWrapApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.trace.ITraceLogWrapApi", t641);
                    return t641;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1156506930:
                if (cls.getName().equals("com.ss.android.ugc.aweme.cct.IOpenCCTUtils")) {
                    T t642 = (T) new OpenCCTUtils();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.cct.IOpenCCTUtils", t642);
                    return t642;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1159930051:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.ColorHistAPI")) {
                    return (T) new ColorHist();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1167985898:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.tag.IAdTagService")) {
                    T t643 = (T) new AdTagServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.tag.IAdTagService", t643);
                    return t643;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1169043239:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.tools.common.record.ICommerceToolsRecordApiComponent")) {
                    return (T) new CommerceToolsRecordApiComponent();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1170265621:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService")) {
                    T t644 = (T) new PaidContentCollectionPlayProgressServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService", t644);
                    return t644;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1175664287:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessMainService")) {
                    T t645 = (T) new BusinessMainServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IBusinessMainService", t645);
                    return t645;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1179584194:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService")) {
                    T t646 = (T) new InviteFriendsService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService", t646);
                    return t646;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1181694823:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.IDownloadAwemeVideoService")) {
                    T t647 = (T) new DownloadAwemeVideoServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.IDownloadAwemeVideoService", t647);
                    return t647;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1184636627:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.now.ICreativeNowService")) {
                    T t648 = (T) new CreativeNowServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.now.ICreativeNowService", t648);
                    return t648;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1205724034:
                if (cls.getName().equals("com.bytedance.geckox.IGeckoGlobalInit")) {
                    T t649 = (T) new GeckoGlobalInitServiceImpl();
                    putStaticServiceImplCache("com.bytedance.geckox.IGeckoGlobalInit", t649);
                    return t649;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1206059085:
                if (cls.getName().equals("com.ss.android.ugc.aweme.im.service.service.IStoryIMService")) {
                    T t650 = (T) new StoryIMService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.im.service.service.IStoryIMService", t650);
                    return t650;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1207362782:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload")) {
                    T t651 = (T) new IAdSlidePreloadImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload", t651);
                    return t651;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1215087071:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager")) {
                    return (T) new LinkTypeTagsPriorityManagerImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1215758015:
                if (cls.getName().equals("com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey")) {
                    T t652 = (T) new UpdateRegisterKeyImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey", t652);
                    return t652;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1216862361:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IArticleModeService")) {
                    T t653 = (T) new ArticleModeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IArticleModeService", t653);
                    return t653;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1217320995:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAVSettingService")) {
                    T t654 = (T) new IAVSettingServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IAVSettingService", t654);
                    return t654;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1218105312:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.label.IAvatarUnionService")) {
                    T t655 = (T) new AvatarUnionServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.label.IAvatarUnionService", t655);
                    return t655;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1222443511:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.publish.IPublishConfigExternalService")) {
                    T t656 = (T) new PublishConfigExternalService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.publish.IPublishConfigExternalService", t656);
                    return t656;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1222505128:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.agecontrol.IPNSAgeControlService")) {
                    T t657 = (T) new PNSAgeControlService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.agecontrol.IPNSAgeControlService", t657);
                    return t657;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1226044343:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService")) {
                    T t658 = (T) new EcUgSparkInterceptorsProvider();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService", t658);
                    return t658;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1226984081:
                if (cls.getName().equals("com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService")) {
                    T t659 = (T) new FriendsTabDbService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService", t659);
                    return t659;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1229038214:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IAppUpdateService")) {
                    T t660 = (T) new AppUpdateService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.IAppUpdateService", t660);
                    return t660;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1245646165:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService")) {
                    T t661 = (T) new CommerceLockStickerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService", t661);
                    return t661;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1246952635:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IClearCacheService")) {
                    T t662 = (T) new ClearCacheService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IClearCacheService", t662);
                    return t662;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1248689867:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService")) {
                    T t663 = (T) new AdPhotoModeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService", t663);
                    return t663;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1257554667:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.LingoCaptionService")) {
                    T t664 = (T) new LingoCaptionServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.LingoCaptionService", t664);
                    return t664;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1260913774:
                if (cls.getName().equals("com.ss.android.ugc.aweme.translation.service.ITranslationKevaService")) {
                    T t665 = (T) new TranslationKevaServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.translation.service.ITranslationKevaService", t665);
                    return t665;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1271555322:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.assem.IFollowWidgetService")) {
                    T t666 = (T) new FollowWidgetServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.live.assem.IFollowWidgetService", t666);
                    return t666;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1272240335:
                if (cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService")) {
                    return (T) new IRecommendUsersDependentServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1275746819:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IWebCreationPromoteService")) {
                    T t667 = (T) new WebCreationPromoteServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IWebCreationPromoteService", t667);
                    return t667;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1278114115:
                if (cls.getName().equals("com.ss.android.elearning.lingo.context.ByteLingoService")) {
                    T t668 = (T) new ByteLingoServiceImpl();
                    putStaticServiceImplCache("com.ss.android.elearning.lingo.context.ByteLingoService", t668);
                    return t668;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1281149561:
                if (cls.getName().equals("com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService")) {
                    T t669 = (T) new AdLandPageSurveyServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService", t669);
                    return t669;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1291617390:
                if (cls.getName().equals("com.ss.android.ugc.aweme.question.IQuestionFavoriteService")) {
                    T t670 = (T) new QuestionFavoriteServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.question.IQuestionFavoriteService", t670);
                    return t670;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1305629660:
                if (cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner")) {
                    T t671 = (T) new ColdLaunchRequestCombinerImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner", t671);
                    return t671;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1306363294:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService")) {
                    T t672 = (T) new BABusinessSuitePageServiceImp();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService", t672);
                    return t672;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1306864219:
                if (cls.getName().equals("com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService")) {
                    T t673 = (T) new PaidSeriesLiveApiService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService", t673);
                    return t673;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1309274556:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService")) {
                    T t674 = (T) new CommerceAdExperienceServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService", t674);
                    return t674;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1315153688:
                if (cls.getName().equals("com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService")) {
                    T t675 = (T) new NotificationCountViewManager.Companion.NotificationCountViewServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService", t675);
                    return t675;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1320692621:
                if (cls.getName().equals("com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService")) {
                    T t676 = (T) new StoryDistributionService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService", t676);
                    return t676;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1321158748:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.ISurveyConfigService")) {
                    T t677 = (T) new SurveyConfigServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.ISurveyConfigService", t677);
                    return t677;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1324297503:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.profile.api.IProfileService")) {
                    T t678 = (T) new com.ss.android.ugc.aweme.kids.profile.ProfileServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.profile.api.IProfileService", t678);
                    return t678;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1338635602:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule")) {
                    T t679 = (T) new PreRenderWebViewManager();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule", t679);
                    return t679;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1360758845:
                if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IUserService")) {
                    T t680 = (T) new BaseUserService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.framework.services.IUserService", t680);
                    return t680;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1361790301:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService")) {
                    T t681 = (T) new EcUgPopupService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService", t681);
                    return t681;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1367264530:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.task.ITaskApi")) {
                    T t682 = (T) new TaskServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.task.ITaskApi", t682);
                    return t682;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1373149304:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService")) {
                    T t683 = (T) new PipServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService", t683);
                    return t683;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1377589410:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.IPowerPreload")) {
                    T t684 = (T) new PowerPreloadServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.network.IPowerPreload", t684);
                    return t684;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1377752390:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService")) {
                    T t685 = (T) new SmartDataTrackerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService", t685);
                    return t685;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1382041287:
                if (cls.getName().equals("com.ss.android.ugc.aweme.trending.service.ITrendingFeedService")) {
                    T t686 = (T) new TrendingDetailServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.trending.service.ITrendingFeedService", t686);
                    return t686;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1383321717:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend")) {
                    T t687 = (T) new AdTaskDependImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend", t687);
                    return t687;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1385201501:
                if (cls.getName().equals("com.ss.android.ugc.aweme.utils.GsonProvider")) {
                    T t688 = (T) new GsonHolder();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.utils.GsonProvider", t688);
                    return t688;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1386305900:
                if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IAVTagService")) {
                    T t689 = (T) new AVTagServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.internal.IAVTagService", t689);
                    return t689;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1391445989:
                if (cls.getName().equals("com.ss.android.ugc.aweme.login.ILoginProxy")) {
                    T t690 = (T) new LoginProxyImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.login.ILoginProxy", t690);
                    return t690;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1394926633:
                if (cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService")) {
                    T t691 = (T) new PaidContentAnchorAttachServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService", t691);
                    return t691;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1418553515:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.ILauncherService")) {
                    T t692 = (T) new LauncherService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.services.ILauncherService", t692);
                    return t692;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1422241413:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewInterceptorService")) {
                    T t693 = (T) new AdWebViewInterceptorService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewInterceptorService", t693);
                    return t693;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1423920585:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService")) {
                    return (T) new SplashAdOutService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1428110088:
                if (cls.getName().equals("com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService")) {
                    T t694 = (T) new FriendsFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService", t694);
                    return t694;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1429224630:
                if (cls.getName().equals("com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService")) {
                    T t695 = (T) new AnchorOperationServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService", t695);
                    return t695;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1433002188:
                if (cls.getName().equals("com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService")) {
                    T t696 = (T) new EffectCreatorServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService", t696);
                    return t696;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1438496117:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceLiveDegradeExp")) {
                    T t697 = (T) new EcommerceLiveDegradeExp();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceLiveDegradeExp", t697);
                    return t697;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1439372287:
                if (cls.getName().equals("com.ss.android.ugc.aweme.landpage.IAdLandPageService")) {
                    T t698 = (T) new AdLandPageServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.landpage.IAdLandPageService", t698);
                    return t698;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1441553717:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.showcase.service.settings.IRomaSchemaGroupShoppingStoreSettings")) {
                    T t699 = (T) new RomaSchemaGroupShoppingStoreSettings();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.showcase.service.settings.IRomaSchemaGroupShoppingStoreSettings", t699);
                    return t699;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1443402605:
                if (cls.getName().equals("com.ss.android.ugc.aweme.login.ILoginUtilsService")) {
                    T t700 = (T) new LoginUtilsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.login.ILoginUtilsService", t700);
                    return t700;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1464985435:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService")) {
                    T t701 = (T) new InterceptHomeBackPressServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService", t701);
                    return t701;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1466547207:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.feed.assem.IAdAssemUtils")) {
                    T t702 = (T) new AdAssemUtils();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.feed.assem.IAdAssemUtils", t702);
                    return t702;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1469243816:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ecommerce.IECommerceGeneralSearchWidgetService")) {
                    T t703 = (T) new ECommerceGeneralSearchWidgetServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.search.ecommerce.IECommerceGeneralSearchWidgetService", t703);
                    return t703;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1469964205:
                if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService")) {
                    T t704 = (T) new GeckoLocalServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService", t704);
                    return t704;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1471250505:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService")) {
                    T t705 = (T) new ECommerceMallService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService", t705);
                    return t705;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1480432587:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction")) {
                    T t706 = (T) new AdFeInteractionImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction", t706);
                    return t706;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1484795975:
                if (cls.getName().equals("com.ss.android.ugc.now.interaction.api.IInteractionService")) {
                    T t707 = (T) new InteractionService();
                    putStaticServiceImplCache("com.ss.android.ugc.now.interaction.api.IInteractionService", t707);
                    return t707;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1487002875:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService")) {
                    T t708 = (T) new AdsPreviewServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService", t708);
                    return t708;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1510855899:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.downloadv2.IDownloadService")) {
                    T t709 = (T) new com.ss.android.ugc.trill.download.DownloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.share.downloadv2.IDownloadService", t709);
                    return t709;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1513354211:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService")) {
                    T t710 = (T) new SmartDataCenterApiServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService", t710);
                    return t710;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1520768300:
                if (cls.getName().equals("com.ss.android.ugc.aweme.hybridkit.IHybridKitService")) {
                    T t711 = (T) new HybridKitTaskImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.hybridkit.IHybridKitService", t711);
                    return t711;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1526593817:
                if (cls.getName().equals("com.bytedance.pumbaa.network.adapter.api.INetworkService")) {
                    T t712 = (T) new NetworkServiceImpl();
                    putStaticServiceImplCache("com.bytedance.pumbaa.network.adapter.api.INetworkService", t712);
                    return t712;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1533934351:
                if (cls.getName().equals("com.lingo.caption.api.LingoCaptionInnerApi")) {
                    T t713 = (T) new LingoCaptionInnerImpl();
                    putStaticServiceImplCache("com.lingo.caption.api.LingoCaptionInnerApi", t713);
                    return t713;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1538373766:
                if (cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory")) {
                    T t714 = (T) new MediaChosenResultProcessFactory();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory", t714);
                    return t714;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1542251913:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService")) {
                    T t715 = (T) new EcommerceStoreTechLogServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService", t715);
                    return t715;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1543209270:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.ILauncherService")) {
                    T t716 = (T) new LauncherServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.ILauncherService", t716);
                    return t716;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1545114897:
                if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IFollowService")) {
                    T t717 = (T) new FollowService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.friends.service.IFollowService", t717);
                    return t717;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1545384024:
                if (cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService")) {
                    T t718 = (T) new SettingsRequestServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService", t718);
                    return t718;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1568312259:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate")) {
                    T t719 = (T) new SmartCheckIntegrateImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate", t719);
                    return t719;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1575532579:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService")) {
                    T t720 = (T) new EcUgNewInstallService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService", t720);
                    return t720;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1579750757:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IVideoGiftService")) {
                    T t721 = (T) new VideoGiftService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.IVideoGiftService", t721);
                    return t721;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1595185874:
                if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.account.IAccountApi")) {
                    T t722 = (T) new AccountImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.launcher.service.account.IAccountApi", t722);
                    return t722;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1596477600:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService")) {
                    T t723 = (T) new PerformanceServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService", t723);
                    return t723;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1599780751:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.IFavoriteOptimisticService")) {
                    T t724 = (T) new FavoriteServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.IFavoriteOptimisticService", t724);
                    return t724;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1601051003:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper")) {
                    T t725 = (T) new SyncNicknameAndUsernamePopUpHelper();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper", t725);
                    return t725;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1603312956:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.auth.IAuthService")) {
                    T t726 = (T) new AuthServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.auth.IAuthService", t726);
                    return t726;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1627479367:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService")) {
                    T t727 = (T) new ShoppingAdsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService", t727);
                    return t727;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1629571136:
                if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.ISocialFriendsService")) {
                    T t728 = (T) new SocialFriendsService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.friends.service.ISocialFriendsService", t728);
                    return t728;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1633499538:
                if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService")) {
                    T t729 = (T) new EcommerceInfluencerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService", t729);
                    return t729;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1648432028:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IMultiAccountService")) {
                    T t730 = (T) new MultiAccountService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IMultiAccountService", t730);
                    return t730;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1649339714:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.api.IFeedModuleService")) {
                    T t731 = (T) new FeedModuleServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.api.IFeedModuleService", t731);
                    return t731;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1652892170:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.IStitchDownloadService")) {
                    T t732 = (T) new StitchDownloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.IStitchDownloadService", t732);
                    return t732;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1659198422:
                if (cls.getName().equals("com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService")) {
                    T t733 = (T) new BackendApiCallerOptService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService", t733);
                    return t733;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1660655893:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService")) {
                    return (T) new ProfileDependentComponentImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1661968864:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService")) {
                    T t734 = (T) new SmartCommonPreloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService", t734);
                    return t734;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1663726118:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService")) {
                    T t735 = (T) new AdLandPagePreloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService", t735);
                    return t735;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1674227107:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService")) {
                    T t736 = (T) new BanAppealServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService", t736);
                    return t736;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1675786870:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncService")) {
                    return (T) new ProfileNameSyncServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1677969788:
                if (cls.getName().equals("com.bytedance.bpea.core.IBPEALazyInit")) {
                    T t737 = (T) new TTPSystemAPIInit();
                    putStaticServiceImplCache("com.bytedance.bpea.core.IBPEALazyInit", t737);
                    return t737;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1678604719:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.DenoiseAPI")) {
                    return (T) new Denoise();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1696475259:
                if (cls.getName().equals("com.ss.android.ugc.aweme.web.service.IAdWebSpecialService")) {
                    T t738 = (T) new AdWebSpecialService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.web.service.IAdWebSpecialService", t738);
                    return t738;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1698007431:
                if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.common.IKidsPolicyNoticeService")) {
                    T t739 = (T) new KidsPolicyNoticeServiceImp();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.kids.api.common.IKidsPolicyNoticeService", t739);
                    return t739;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1701644943:
                if (cls.getName().equals("com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService")) {
                    T t740 = (T) new PortraitCenterInitServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService", t740);
                    return t740;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1708382918:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IVoiceConversionReuseService")) {
                    return (T) new VoiceConversionRecordService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1713060419:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService")) {
                    T t741 = (T) new com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService", t741);
                    return t741;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1713809708:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowDailyPushService")) {
                    T t742 = (T) new NowDailyPushService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.INowDailyPushService", t742);
                    return t742;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1723717660:
                if (cls.getName().equals("com.ss.android.ugc.aweme.app.IInitAllService")) {
                    T t743 = (T) new InitAllServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.app.IInitAllService", t743);
                    return t743;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1724321674:
                if (cls.getName().equals("com.ss.android.ugc.gamora.TTEPPageFactory")) {
                    T t744 = (T) new TTEPPageFactoryDelegate();
                    putStaticServiceImplCache("com.ss.android.ugc.gamora.TTEPPageFactory", t744);
                    return t744;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1724423012:
                if (cls.getName().equals("com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter")) {
                    T t745 = (T) new EComCustomThirdPartyBackRouter();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter", t745);
                    return t745;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1727643984:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService")) {
                    return (T) new TTSVoiceRecordService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1736159254:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IProfileBadgeService")) {
                    T t746 = (T) new ProfileBadgeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IProfileBadgeService", t746);
                    return t746;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1736258028:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService")) {
                    return (T) new PaidContentAwareBannerServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1739791517:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IChallengeDetailLegacyService")) {
                    T t747 = (T) new ChallengeDetailLegacyServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IChallengeDetailLegacyService", t747);
                    return t747;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1742963683:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessPublishService")) {
                    T t748 = (T) new BusinessPublishImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IBusinessPublishService", t748);
                    return t748;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1745515451:
                if (cls.getName().equals("com.ss.android.ugc.aweme.network.ITrafficStatistics")) {
                    T t749 = (T) new TrafficStatisticsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.network.ITrafficStatistics", t749);
                    return t749;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1745934054:
                if (cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.BackgroundRunnableMonitorApi")) {
                    T t750 = (T) new BackgroundRunnableMonitorApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.performanceopt.api.BackgroundRunnableMonitorApi", t750);
                    return t750;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1747700592:
                if (cls.getName().equals("com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule")) {
                    T t751 = (T) new DataCollectionModule();
                    putStaticServiceImplCache("com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule", t751);
                    return t751;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1748459787:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC")) {
                    return (T) new MiddleForSearchFromEC();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1758607663:
                if (cls.getName().equals("com.ss.android.ugc.aweme.network.spi.INetworkStateService")) {
                    T t752 = (T) new NetworkStateServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.network.spi.INetworkStateService", t752);
                    return t752;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1771293041:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper")) {
                    T t753 = (T) new NotificationClickHelperImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper", t753);
                    return t753;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1771368059:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRLutAPI")) {
                    T t754 = (T) new VideoSRLut();
                    putStaticServiceImplCache("com.bytedance.bmf_mods_api.VideoSRLutAPI", t754);
                    return t754;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1772993265:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveOuterService")) {
                    T t755 = (T) new LiveOuterService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.live.ILiveOuterService", t755);
                    return t755;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1773843317:
                if (cls.getName().equals("com.ss.android.ugc.aweme.log.IAdLynxEventLogger")) {
                    return (T) new AdLynxEventLoger();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1777438413:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService")) {
                    T t756 = (T) new EffectAnchorServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService", t756);
                    return t756;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1784620411:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.router.view.IFallbackDetector")) {
                    T t757 = (T) new FallbackDetector();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.router.view.IFallbackDetector", t757);
                    return t757;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1785165071:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler")) {
                    T t758 = (T) new KidsUserStateMachineHandler();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler", t758);
                    return t758;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1787636921:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService")) {
                    T t759 = (T) new PolicyNoticeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService", t759);
                    return t759;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1789034512:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPaidContentPaymentService")) {
                    T t760 = (T) new PaidContentPaymentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.service.IPaidContentPaymentService", t760);
                    return t760;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1795330578:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService")) {
                    T t761 = (T) new CreatorCenterPreloadServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService", t761);
                    return t761;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1797968063:
                if (cls.getName().equals("com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService")) {
                    T t762 = (T) new PerfMonitorServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService", t762);
                    return t762;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1802001554:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeOutService")) {
                    return (T) new CommerceChallengeOutService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1807554232:
                if (cls.getName().equals("com.ss.android.ugc.aweme.api.IMentionVideoApi")) {
                    T t763 = (T) new MentionVideoService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.api.IMentionVideoApi", t763);
                    return t763;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1810425986:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService")) {
                    T t764 = (T) new EcommerceStoreBizLogServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService", t764);
                    return t764;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1815079068:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.sticker.INatureGuideFragmentService")) {
                    T t765 = (T) new NatureGuideFragmentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.sticker.INatureGuideFragmentService", t765);
                    return t765;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1817215028:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService")) {
                    T t766 = (T) new NotInterestedTutorialService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService", t766);
                    return t766;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1817711182:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IMovieReuseService")) {
                    T t767 = (T) new MovieReuseServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.detail.IMovieReuseService", t767);
                    return t767;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1832868993:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IRessoAnchorService")) {
                    return (T) new IRessoAnchorServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1834422093:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService")) {
                    T t768 = (T) new DeviceConsentHandlerServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService", t768);
                    return t768;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1839198709:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService")) {
                    T t769 = (T) new LiveBusinessParasiticModule();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService", t769);
                    return t769;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1850722604:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.label.IRelationLabelTextViewService")) {
                    T t770 = (T) new RelationLabelTextViewServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.relation.label.IRelationLabelTextViewService", t770);
                    return t770;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1850726550:
                if (cls.getName().equals("com.ss.ugc.android.editor.components.base.api.IVideoCropService")) {
                    T t771 = (T) new VideoCropService();
                    putStaticServiceImplCache("com.ss.ugc.android.editor.components.base.api.IVideoCropService", t771);
                    return t771;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1866297976:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IEmojiService")) {
                    T t772 = (T) new EmojiServiceImplDiff();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IEmojiService", t772);
                    return t772;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1869503713:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IRegistrationAgeGateService")) {
                    T t773 = (T) new RegistrationAgeGateServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IRegistrationAgeGateService", t773);
                    return t773;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1873789179:
                if (cls.getName().equals("com.ss.android.ugc.aweme.external.IExternalAlbumService")) {
                    T t774 = (T) new AlbumServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.external.IExternalAlbumService", t774);
                    return t774;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1874983828:
                if (cls.getName().equals("com.ss.android.ugc.aweme.api.IAnchorBusinessApi")) {
                    T t775 = (T) new AnchorBusinessApiImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.api.IAnchorBusinessApi", t775);
                    return t775;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1886330729:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IUpdateSettingService")) {
                    T t776 = (T) new UpdateSettingServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.IUpdateSettingService", t776);
                    return t776;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1890424291:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IInboxRepostFeedService")) {
                    T t777 = (T) new InboxRepostFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.IInboxRepostFeedService", t777);
                    return t777;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1893478097:
                if (cls.getName().equals("com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut")) {
                    T t778 = (T) new ProviderConfigOutImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut", t778);
                    return t778;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1894760179:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService")) {
                    return (T) new TopVideoAdServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1896848879:
                if (cls.getName().equals("com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService")) {
                    return (T) new PublishDrillServiceImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1899558288:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService")) {
                    T t779 = (T) new BAAnchorServiceImpl();
                    putStaticServiceImplCache("com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService", t779);
                    return t779;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1901324524:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ICreatorToolService")) {
                    T t780 = (T) new CreatorToolServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.setting.services.ICreatorToolService", t780);
                    return t780;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1910743527:
                if (cls.getName().equals("com.ss.android.ugc.aweme.count.IFeedPlayNumService")) {
                    T t781 = (T) new FeedPlayNumServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.count.IFeedPlayNumService", t781);
                    return t781;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1913613454:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicAppAuthService")) {
                    T t782 = (T) new MusicAppAuthServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.music.service.IMusicAppAuthService", t782);
                    return t782;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1932185006:
                if (cls.getName().equals("com.ss.android.legoapi.ICrashSdkTaskApi")) {
                    T t783 = (T) new CrashSdkTaskImpl();
                    putStaticServiceImplCache("com.ss.android.legoapi.ICrashSdkTaskApi", t783);
                    return t783;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1939446823:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ug.brand.ITranssonicService")) {
                    T t784 = (T) new TranssonicServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ug.brand.ITranssonicService", t784);
                    return t784;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1945553471:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IShopTabIconService")) {
                    T t785 = (T) new FashionMallTabIconService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IShopTabIconService", t785);
                    return t785;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1948175614:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService")) {
                    T t786 = (T) new ComplianceMonitorServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService", t786);
                    return t786;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1950388661:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ILandscapeViewModeGenerator")) {
                    T t787 = (T) new LandscapeFeedViewModelGenerator();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ILandscapeViewModeGenerator", t787);
                    return t787;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1950599228:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler")) {
                    T t788 = (T) new WebViewTTNetHandlerImp();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler", t788);
                    return t788;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1967964191:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig")) {
                    T t789 = (T) new TTLogoBlackConfig();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig", t789);
                    return t789;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1970320629:
                if (cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageService")) {
                    T t790 = (T) new MainPageServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.main.IMainPageService", t790);
                    return t790;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1975850393:
                if (cls.getName().equals("com.bytedance.pumbaa.monitor.adapter.api.IMonitorService")) {
                    T t791 = (T) new MonitorServiceImpl();
                    putStaticServiceImplCache("com.bytedance.pumbaa.monitor.adapter.api.IMonitorService", t791);
                    return t791;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1976336276:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService")) {
                    T t792 = (T) new SearchComponentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService", t792);
                    return t792;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1976378617:
                if (cls.getName().equals("com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory")) {
                    T t793 = (T) new PublishServiceFactoryImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory", t793);
                    return t793;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 1993928235:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.log.IAdLogService")) {
                    T t794 = (T) new AdLogServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.log.IAdLogService", t794);
                    return t794;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2001356487:
                if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi")) {
                    T t795 = (T) new OpenOnMuteImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi", t795);
                    return t795;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2019274645:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService")) {
                    T t796 = (T) new CommercializeFeedServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService", t796);
                    return t796;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2020500036:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.WSHelper")) {
                    T t797 = (T) new WSHelperImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.notice.api.helper.WSHelper", t797);
                    return t797;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2023609189:
                if (cls.getName().equals("com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService")) {
                    T t798 = (T) new MiniAppDependServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService", t798);
                    return t798;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2037829402:
                if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.IQRCodeService")) {
                    T t799 = (T) new QRCodeServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.qrcode.IQRCodeService", t799);
                    return t799;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2046591221:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessComponentService")) {
                    T t800 = (T) new BusinessComponentServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IBusinessComponentService", t800);
                    return t800;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2050400656:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAVInitializer")) {
                    T t801 = (T) new AVInitializerImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.IAVInitializer", t801);
                    return t801;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2054244205:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService")) {
                    T t802 = (T) new EcUgDeeplinkService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService", t802);
                    return t802;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2059590346:
                if (cls.getName().equals("com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService")) {
                    T t803 = (T) new FollowStatisticsServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService", t803);
                    return t803;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2063435184:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService")) {
                    T t804 = (T) new EarphonePlayerControl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService", t804);
                    return t804;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2070608616:
                if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService")) {
                    return (T) new QrCodeScanImpl();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2075319920:
                if (cls.getName().equals("com.ss.android.ugc.aweme.comment.ICommentFavoriteService")) {
                    T t805 = (T) new CommentFavoriteServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.comment.ICommentFavoriteService", t805);
                    return t805;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2077041532:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService")) {
                    return (T) new ECommerceVideoService();
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2078809113:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.ILibraryReuseService")) {
                    T t806 = (T) new LibraryReuseServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.tools.detail.ILibraryReuseService", t806);
                    return t806;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2091106849:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.subpage.ILandPageFunctionModule")) {
                    T t807 = (T) new CommerceLandPageModuleImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.subpage.ILandPageFunctionModule", t807);
                    return t807;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2098328820:
                if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService")) {
                    T t808 = (T) new HomePageUIFrameServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService", t808);
                    return t808;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2106665826:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService")) {
                    T t809 = (T) new CommerceIBEService();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService", t809);
                    return t809;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2110323641:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService")) {
                    T t810 = (T) new SamiDebugToolServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService", t810);
                    return t810;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2116238537:
                if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IPrivacyService")) {
                    T t811 = (T) new PrivacyServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.internal.IPrivacyService", t811);
                    return t811;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            case 2121897853:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService")) {
                    T t812 = (T) new ECommerceArchServiceImpl();
                    putStaticServiceImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService", t812);
                    return t812;
                }
                this.optServiceImplNonExistSet.put(cls.getName(), 1);
                return null;
            default:
                switch (hashCode) {
                    case -1613281211:
                    case -1413334784:
                    case 1893355787:
                        T t813 = (T) new PlaylistCollectionStateAgent();
                        putStaticServiceImplCache("com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionStateNotifier", t813);
                        putStaticServiceImplCache("com.ss.android.ugc.aweme.favorites.business.playlist.ability.ICollectPlaylist", t813);
                        putStaticServiceImplCache("com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionState", t813);
                        return t813;
                    case -1212367843:
                    case -254352041:
                    case 767476040:
                        T t814 = (T) new AwemeCollectionAgent();
                        putStaticServiceImplCache("com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState", t814);
                        putStaticServiceImplCache("com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier", t814);
                        putStaticServiceImplCache("com.ss.android.ugc.aweme.favorites.business.aweme.ability.ICollectAweme", t814);
                        return t814;
                    case 1405829052:
                    case 1958142338:
                        T t815 = (T) new AwemeCollectionCountAgent();
                        putStaticServiceImplCache("com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionCountStateNotifier", t815);
                        putStaticServiceImplCache("com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionCountState", t815);
                        return t815;
                    case 2124126000:
                        if (cls.getName().equals("com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge")) {
                            T t816 = (T) new InboxSkylightService();
                            putStaticServiceImplCache("com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge", t816);
                            return t816;
                        }
                        this.optServiceImplNonExistSet.put(cls.getName(), 1);
                        return null;
                    case 2128592722:
                        if (cls.getName().equals("com.ss.android.ugc.aweme.donation.IDonationService")) {
                            T t817 = (T) new DonationServiceImpl();
                            putStaticServiceImplCache("com.ss.android.ugc.aweme.donation.IDonationService", t817);
                            return t817;
                        }
                        this.optServiceImplNonExistSet.put(cls.getName(), 1);
                        return null;
                    default:
                        this.optServiceImplNonExistSet.put(cls.getName(), 1);
                        return null;
                }
        }
    }

    public static StaticServiceImplManager getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    private <T> Set<T> getStaticServiceImplSetReal(Class<T> cls) {
        Set<T> staticServiceImplSetRealStub0 = getStaticServiceImplSetRealStub0(cls);
        if (staticServiceImplSetRealStub0 == null && (staticServiceImplSetRealStub0 = getStaticServiceImplSetRealStub1(cls)) == null && (staticServiceImplSetRealStub0 = getStaticServiceImplSetRealStub2(cls)) == null) {
            this.optServiceImplSetNotExistSet.put(cls.getName(), 1);
            return null;
        }
        return staticServiceImplSetRealStub0;
    }

    public <T> T getStaticServiceImpl(Class<T> cls) {
        String name = cls.getName();
        T t = (T) this.serviceImplCache.get(name);
        if (t == null && !this.optServiceImplNonExistSet.containsKey(name)) {
            return (T) getStaticServiceImplReal(cls);
        }
        return t;
    }

    public <T> Set<T> getStaticServiceImplSet(Class<T> cls) {
        String name = cls.getName();
        Set<T> set = (Set) this.serviceImplSetCache.get(name);
        if (set == null && !this.optServiceImplSetNotExistSet.containsKey(name)) {
            return getStaticServiceImplSetReal(cls);
        }
        return set;
    }

    private void putStaticServiceImplCache(String str, Object obj) {
        this.serviceImplCache.put(str, obj);
    }

    private void putStaticServiceImplSetCache(String str, Set<Object> set) {
        this.serviceImplSetCache.put(str, set);
    }
}
