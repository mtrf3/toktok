package com.bytedance.android.live.settings.collector;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting_SourceParam_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeAccompany;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeAccompany_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeVocal;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeVocal_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.QualcommGpuHintSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.QualcommGpuHintSettings_GpuHintSettings_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.ThreadPoolConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.ThreadPoolConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.VBoostGoLiveSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.VBoostGoLiveSetting_VBoostSettings_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.comment.Config;
import com.bytedance.android.livesdk.livesetting.comment.Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.partnership.GamePartnershipRefactoringSwitch;
import com.bytedance.android.livesdk.livesetting.game.partnership.GamePartnershipRefactoringSwitch_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipRefactoringSwitchAnchorGuide;
import com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipRefactoringSwitchAnchorGuide_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipRefactoringSwitchAudienceRoom;
import com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipRefactoringSwitchAudienceRoom_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.FindGiftBlackList;
import com.bytedance.android.livesdk.livesetting.gift.FindGiftBlackList_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.GiftConfig;
import com.bytedance.android.livesdk.livesetting.gift.GiftConfigParams;
import com.bytedance.android.livesdk.livesetting.gift.GiftConfigParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.GiftConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageConfig;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.MsgEnqueueConfig;
import com.bytedance.android.livesdk.livesetting.gift.MsgEnqueueConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.MsgStair;
import com.bytedance.android.livesdk.livesetting.gift.MsgStair_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.ReceiveMsgConfig;
import com.bytedance.android.livesdk.livesetting.gift.ReceiveMsgConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.ScoreWeights;
import com.bytedance.android.livesdk.livesetting.gift.ScoreWeights_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.SendGiftRetrySetting;
import com.bytedance.android.livesdk.livesetting.gift.SendGiftRetrySetting_SettingParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.TrayComboConfig;
import com.bytedance.android.livesdk.livesetting.gift.TrayComboConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.TrayDismissConfig;
import com.bytedance.android.livesdk.livesetting.gift.TrayDismissConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.TrayShowConfig;
import com.bytedance.android.livesdk.livesetting.gift.TrayShowConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.TrayStayAfterComboConfig;
import com.bytedance.android.livesdk.livesetting.gift.TrayStayAfterComboConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagUrls;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagUrls_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDynamicPbDefinitionSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDynamicPbDefinitionSetting_PbDefinitionItem_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.AudioChatWatermarkResolution;
import com.bytedance.android.livesdk.livesetting.linkmic.AudioChatWatermarkResolution_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostSequentialEventReportConf;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostSequentialEventReportConf_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPageFirstFrameLogConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPageFirstFrameLogConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadALogConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadALogConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSettingData;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSettingData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicALogToAppLogRegularBean;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicALogToAppLogRegularBean_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSdkMicCountToLayoutIdMap;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSdkMicCountToLayoutIdMap_MicCountToLayoutIdMapping_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.GeckoSetting;
import com.bytedance.android.livesdk.livesetting.model.GeckoSetting_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.GeckoSplit;
import com.bytedance.android.livesdk.livesetting.model.GeckoSplit_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.PerformanceOpt;
import com.bytedance.android.livesdk.livesetting.model.PerformanceOpt_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.PerformanceSample;
import com.bytedance.android.livesdk.livesetting.model.PerformanceSample_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.TrackerEventDeprecated;
import com.bytedance.android.livesdk.livesetting.model.TrackerEventDeprecated_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.ToolbarHitboxExpansionSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolbarHitboxExpansionSetting_ToolbarHitboxConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeModel_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSample;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSample_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings_ThreadConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveStreamABThreadPrioritSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveStreamABThreadPrioritSettings_ThreadConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSDataReportSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSDataReportSettings_TTLSDataReportSetting_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLayoutPreloadLogOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLayoutPreloadLogOpt_LayoutPreloadConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveHotDegradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveHotDegradeSetting_HotDegradeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegrade;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegrade_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings_Item_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting_LiveGiftTrayPublicScreenTranslateConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSyncSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSyncSetting_LivePublicScreenMessageSyncConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.roomfunction.NickNameOptConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.NickNameOptConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt_LandscapeScrollConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSettingCacheExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSettingCacheExp_LivePlayerSettingCacheConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePullPureAudioSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePullPureAudioSetting_PullPureAudioConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveTimeNtpOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveTimeNtpOpt_TimeNormal_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.SeiParseConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.SeiParseConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt_WatchMemoryLeakOptConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.SlardarTagData;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.SlardarTagData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.MultiPlayerScoreLimit;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.MultiPlayerScoreLimit_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.SurfaceViewScene;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.SurfaceViewScene_OptTypeAdapter;
import com.bytedance.android.livesdk.model.CpuMemoryOptList;
import com.bytedance.android.livesdk.model.CpuMemoryOptList_OptTypeAdapter;
import com.bytedance.android.livesdk.model.LiveLogSampleData;
import com.bytedance.android.livesdk.model.LiveLogSampleData_OptTypeAdapter;
import com.bytedance.android.livesdk.model.LiveRecommendAtEnd;
import com.bytedance.android.livesdk.model.LiveRecommendAtEnd_OptTypeAdapter;
import com.bytedance.android.livesdk.model.LiveRepetitionTtlConfig;
import com.bytedance.android.livesdk.model.LiveRepetitionTtlConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.model.LoginGuideConfig;
import com.bytedance.android.livesdk.model.LoginGuideConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.model.PerformanceSetting;
import com.bytedance.android.livesdk.model.PerformanceSetting_OptTypeAdapter;
import com.bytedance.android.livesdk.performance.config.PerfItemConfig;
import com.bytedance.android.livesdk.performance.config.PerfItemConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.performance.config.RealtimePerfScoreConfig;
import com.bytedance.android.livesdk.performance.config.RealtimePerfScoreConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.performance.config.ScorePiecewise;
import com.bytedance.android.livesdk.performance.config.ScorePiecewise_OptTypeAdapter;
import com.bytedance.ies.sdk.widgets.LayeredElementConfig;
import com.bytedance.ies.sdk.widgets.LayeredElementConfig_OptTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTypeAdapterFactory_livebase implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        Class<? super T> rawType = type.getRawType();
        if (o.LJ(rawType, ThreadPoolConfig.class)) {
            return new ThreadPoolConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGameDualDeviceSourceSetting.SourceParam.class)) {
            return new LiveGameDualDeviceSourceSetting_SourceParam_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveKaraokeAccompany.class)) {
            return new LiveKaraokeAccompany_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveKaraokeVocal.class)) {
            return new LiveKaraokeVocal_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, QualcommGpuHintSettings.GpuHintSettings.class)) {
            return new QualcommGpuHintSettings_GpuHintSettings_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, VBoostGoLiveSetting.VBoostSettings.class)) {
            return new VBoostGoLiveSetting_VBoostSettings_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, Config.class)) {
            return new Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GamePartnershipRefactoringSwitch.class)) {
            return new GamePartnershipRefactoringSwitch_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PartnershipRefactoringSwitchAnchorGuide.class)) {
            return new PartnershipRefactoringSwitchAnchorGuide_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PartnershipRefactoringSwitchAudienceRoom.class)) {
            return new PartnershipRefactoringSwitchAudienceRoom_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GiftHighTrafficDropMessageConfig.class)) {
            return new GiftHighTrafficDropMessageConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GiftConfigParams.class)) {
            return new GiftConfigParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GiftConfig.class)) {
            return new GiftConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ReceiveMsgConfig.class)) {
            return new ReceiveMsgConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MsgEnqueueConfig.class)) {
            return new MsgEnqueueConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, TrayShowConfig.class)) {
            return new TrayShowConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, TrayComboConfig.class)) {
            return new TrayComboConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, TrayStayAfterComboConfig.class)) {
            return new TrayStayAfterComboConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, TrayDismissConfig.class)) {
            return new TrayDismissConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MsgStair.class)) {
            return new MsgStair_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FindGiftBlackList.class)) {
            return new FindGiftBlackList_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ScoreWeights.class)) {
            return new ScoreWeights_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SendGiftRetrySetting.SettingParams.class)) {
            return new SendGiftRetrySetting_SettingParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GoodyBagUrls.class)) {
            return new GoodyBagUrls_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveDynamicPbDefinitionSetting.PbDefinitionItem.class)) {
            return new LiveDynamicPbDefinitionSetting_PbDefinitionItem_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, CoHostSequentialEventReportConf.class)) {
            return new CoHostSequentialEventReportConf_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicMultiGuestPageFirstFrameLogConfig.class)) {
            return new LinkMicMultiGuestPageFirstFrameLogConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicUploadConfig.class)) {
            return new LinkMicUploadConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicUploadALogConfig.class)) {
            return new LinkMicUploadALogConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, AudioChatWatermarkResolution.class)) {
            return new AudioChatWatermarkResolution_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveTwoMatchLinkOptSettingData.class)) {
            return new LiveTwoMatchLinkOptSettingData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, com.bytedance.android.livesdk.livesetting.linkmic.match.Config.class)) {
            return new com.bytedance.android.livesdk.livesetting.linkmic.match.Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicALogToAppLogRegularBean.class)) {
            return new LinkMicALogToAppLogRegularBean_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping.class)) {
            return new LiveSdkMicCountToLayoutIdMap_MicCountToLayoutIdMapping_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GeckoSetting.class)) {
            return new GeckoSetting_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GeckoSplit.class)) {
            return new GeckoSplit_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PerformanceOpt.class)) {
            return new PerformanceOpt_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PerformanceSample.class)) {
            return new PerformanceSample_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, TrackerEventDeprecated.class)) {
            return new TrackerEventDeprecated_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ToolbarHitboxExpansionSetting.ToolbarHitboxConfig.class)) {
            return new ToolbarHitboxExpansionSetting_ToolbarHitboxConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveALogAndMonitorDegradeModel.class)) {
            return new LiveALogAndMonitorDegradeModel_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveFluencySupportSample.class)) {
            return new LiveFluencySupportSample_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePlayThreadPrioritySettings.ThreadConfig.class)) {
            return new LivePlayThreadPrioritySettings_ThreadConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveStreamABThreadPrioritSettings.ThreadConfig.class)) {
            return new LiveStreamABThreadPrioritSettings_ThreadConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveTTLSDataReportSettings.TTLSDataReportSetting.class)) {
            return new LiveTTLSDataReportSettings_TTLSDataReportSetting_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig.class)) {
            return new LiveWatchLayoutPreloadLogOpt_LayoutPreloadConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveHotDegradeSetting.HotDegradeConfig.class)) {
            return new LiveHotDegradeSetting_HotDegradeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveLikeDegrade.class)) {
            return new LiveLikeDegrade_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveLikePerformanceOptimizeConfig.class)) {
            return new LiveLikePerformanceOptimizeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveWatchPreloadSettings.Item.class)) {
            return new LiveWatchPreloadSettings_Item_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ScalableDowngradeConfig.class)) {
            return new ScalableDowngradeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGiftTrayPublicScreenTranslateSetting.LiveGiftTrayPublicScreenTranslateConfig.class)) {
            return new LiveGiftTrayPublicScreenTranslateSetting_LiveGiftTrayPublicScreenTranslateConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, com.bytedance.android.livesdk.livesetting.publicscreen.Config.class)) {
            return new com.bytedance.android.livesdk.livesetting.publicscreen.Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig.class)) {
            return new LivePublicScreenMessageSyncSetting_LivePublicScreenMessageSyncConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, NickNameOptConfig.class)) {
            return new NickNameOptConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LandscapeWatchLiveGestureOpt.LandscapeScrollConfig.class)) {
            return new LandscapeWatchLiveGestureOpt_LandscapeScrollConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SeiParseConfig.class)) {
            return new SeiParseConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig.class)) {
            return new LivePlayerSettingCacheExp_LivePlayerSettingCacheConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePullPureAudioSetting.PullPureAudioConfig.class)) {
            return new LivePullPureAudioSetting_PullPureAudioConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveTimeNtpOpt.TimeNormal.class)) {
            return new LiveTimeNtpOpt_TimeNormal_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, WatchMemoryLeakOpt.WatchMemoryLeakOptConfig.class)) {
            return new WatchMemoryLeakOpt_WatchMemoryLeakOptConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SlardarTagData.class)) {
            return new SlardarTagData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiPlayerScoreLimit.class)) {
            return new MultiPlayerScoreLimit_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SurfaceViewScene.class)) {
            return new SurfaceViewScene_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, CpuMemoryOptList.class)) {
            return new CpuMemoryOptList_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveLogSampleData.class)) {
            return new LiveLogSampleData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveRecommendAtEnd.class)) {
            return new LiveRecommendAtEnd_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveRepetitionTtlConfig.class)) {
            return new LiveRepetitionTtlConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ScorePiecewise.class)) {
            return new ScorePiecewise_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PerfItemConfig.class)) {
            return new PerfItemConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RealtimePerfScoreConfig.class)) {
            return new RealtimePerfScoreConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LoginGuideConfig.class)) {
            return new LoginGuideConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PerformanceSetting.class)) {
            return new PerformanceSetting_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LayeredElementConfig.class)) {
            return new LayeredElementConfig_OptTypeAdapter(gson);
        }
        return null;
    }
}
