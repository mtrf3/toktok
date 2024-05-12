package com.bytedance.android.live.settings.collector;

import com.bytedance.android.live.network.model.RequestPb;
import com.bytedance.android.live.network.model.RequestPb_OptTypeAdapter;
import com.bytedance.android.livesdk.chatroom.model.LikeConfig;
import com.bytedance.android.livesdk.chatroom.model.LikeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.chatroom.model.LiveAnchorContactConfig;
import com.bytedance.android.livesdk.chatroom.model.LiveAnchorContactConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.chatroom.model.LiveCommentTranslationConfig;
import com.bytedance.android.livesdk.chatroom.model.LiveCommentTranslationConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenConfig;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenMsgPriorityConfig;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenMsgPriorityConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.chatroom.model.ShareEffectIntervalConfig;
import com.bytedance.android.livesdk.chatroom.model.ShareEffectIntervalConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.chatroom.model.backroom.BackRoomListSettingConfig;
import com.bytedance.android.livesdk.chatroom.model.backroom.BackRoomListSettingConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.commerce.LiveGoodsBanner;
import com.bytedance.android.livesdk.commerce.LiveGoodsBanner_OptTypeAdapter;
import com.bytedance.android.livesdk.config.LiveGameFloatMsgPanelConfig;
import com.bytedance.android.livesdk.config.LiveGameFloatMsgPanelConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.game.GameLinkMicGiftDialogConfig;
import com.bytedance.android.livesdk.game.GameLinkMicGiftDialogConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.Camera2AB;
import com.bytedance.android.livesdk.live.model.Camera2AB_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.DefaultDonationStickerPosition;
import com.bytedance.android.livesdk.live.model.DefaultDonationStickerPosition_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.LiveFeedSettings;
import com.bytedance.android.livesdk.live.model.LiveFeedSettings_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.LiveFollowFeedDrawLoop;
import com.bytedance.android.livesdk.live.model.LiveFollowFeedDrawLoop_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.LivePreviewCardMaskConfig;
import com.bytedance.android.livesdk.live.model.LivePreviewCardMaskConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.LiveScrollConfig;
import com.bytedance.android.livesdk.live.model.LiveScrollConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.RoomSlideUpGuide;
import com.bytedance.android.livesdk.live.model.RoomSlideUpGuide_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.SpeakingVoiceConfig;
import com.bytedance.android.livesdk.live.model.SpeakingVoiceConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.live.model.VolumeDetectConfig;
import com.bytedance.android.livesdk.live.model.VolumeDetectConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerConfigSetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerConfigSetting_BannerConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmNsConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmNsConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorMockVideoSizeConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorMockVideoSizeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSmoothGoLiveConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSmoothGoLiveConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.FluencyNegativeTestSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.FluencyNegativeTestSettings_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAboutMeMergeConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAboutMeMergeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOPSchemaData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOPSchemaData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSheetDemoLynxUrlConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSheetDemoLynxUrlConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.NegativeTestSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.NegativeTestSettings_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.SubsPayoutOnboardingUrlConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.SubsPayoutOnboardingUrlConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.clientai.Config;
import com.bytedance.android.livesdk.livesetting.clientai.Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.comment.EomjiConfig;
import com.bytedance.android.livesdk.livesetting.comment.EomjiConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.comment.InputDialogFixSettingModel;
import com.bytedance.android.livesdk.livesetting.comment.InputDialogFixSettingModel_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.effect.ReportFeedbackUrls;
import com.bytedance.android.livesdk.livesetting.effect.ReportFeedbackUrls_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.ExceptionInfo;
import com.bytedance.android.livesdk.livesetting.game.ExceptionInfo_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.GameBroadcastExceptionConfig;
import com.bytedance.android.livesdk.livesetting.game.GameBroadcastExceptionConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.GameLiveFeedbackLabelIds;
import com.bytedance.android.livesdk.livesetting.game.GameLiveFeedbackLabelIds_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideData;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.ProcessExitGuideData;
import com.bytedance.android.livesdk.livesetting.game.ProcessExitGuideData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.UploadSpeedDetectionMapping;
import com.bytedance.android.livesdk.livesetting.game.UploadSpeedDetectionMapping_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.partnership.DropsPageSchemaData;
import com.bytedance.android.livesdk.livesetting.game.partnership.DropsPageSchemaData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameCardShownConfig;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameCardShownConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsConfig;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipSchemaConfig;
import com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipSchemaConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.AutoTriggerConfig;
import com.bytedance.android.livesdk.livesetting.gift.AutoTriggerConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.DowngradeSettings;
import com.bytedance.android.livesdk.livesetting.gift.DowngradeSettings_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.EffectPreloadParams;
import com.bytedance.android.livesdk.livesetting.gift.EffectPreloadParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.GiftGuideClientAI;
import com.bytedance.android.livesdk.livesetting.gift.GiftGuideClientAI_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.GiftRenderSparkOptimize;
import com.bytedance.android.livesdk.livesetting.gift.GiftRenderSparkOptimize_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct_FrequencyControl_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.LiveFlymicGiftDowngradeStrategy;
import com.bytedance.android.livesdk.livesetting.gift.LiveFlymicGiftDowngradeStrategy_SettingParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelLoadingOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelLoadingOptimizationSetting_GiftPanelOptimizationConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelOpenIntentionParams;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelOpenIntentionParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerConfig;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting_GiftTrayMatchPointsConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.LiveUserRiskVerify;
import com.bytedance.android.livesdk.livesetting.gift.LiveUserRiskVerify_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.NativeTriggerConfig;
import com.bytedance.android.livesdk.livesetting.gift.NativeTriggerConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.PostRechargeRetentionParams;
import com.bytedance.android.livesdk.livesetting.gift.PostRechargeRetentionParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.SettingParams;
import com.bytedance.android.livesdk.livesetting.gift.SettingParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.gift.VipFeedbackStruct;
import com.bytedance.android.livesdk.livesetting.gift.VipFeedbackStruct_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.hybrid.SparkDynamicParam;
import com.bytedance.android.livesdk.livesetting.hybrid.SparkDynamicParam_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.hybrid.SparkReuseConfig;
import com.bytedance.android.livesdk.livesetting.hybrid.SparkReuseConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.BarrageEnterRoomResConfig;
import com.bytedance.android.livesdk.livesetting.level.BarrageEnterRoomResConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.BarrageGradeResConfig;
import com.bytedance.android.livesdk.livesetting.level.BarrageGradeResConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.FansClubConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.FansClubDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubDynamicConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.FansClubLottieConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubLottieConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.FeResourceChannelConfig;
import com.bytedance.android.livesdk.livesetting.level.FeResourceChannelConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.GeckoResourceDownloadConfig;
import com.bytedance.android.livesdk.livesetting.level.GeckoResourceDownloadConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.GiftPanelAnimatorConfig;
import com.bytedance.android.livesdk.livesetting.level.GiftPanelAnimatorConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.LevelSystemGeckoOnDemandConfig;
import com.bytedance.android.livesdk.livesetting.level.LevelSystemGeckoOnDemandConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.LevelSystemResourceConfig;
import com.bytedance.android.livesdk.livesetting.level.LevelSystemResourceConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.UserLevelConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.level.UserLevelDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelDynamicConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.AddNotReceiveFirstFrameExpConf;
import com.bytedance.android.livesdk.livesetting.linkmic.AddNotReceiveFirstFrameExpConf_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostSeiTalkSettingConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostSeiTalkSettingConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.CohostMatchResumeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.CohostMatchResumeSetting_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAudioModeSettingConf;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAudioModeSettingConf_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLoggerReportConf;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLoggerReportConf_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamAudioParams;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamAudioParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamVideoParams;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamVideoParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerfSladarEventReportConf;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerfSladarEventReportConf_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKForwardStreamProtectConf;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKForwardStreamProtectConf_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSequentialEventReportConf;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSequentialEventReportConf_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostFriendNoticeOptMock;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostFriendNoticeOptMock_MockParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptPanelFixLayoutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptPanelFixLayoutConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOutViewerFriendConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOutViewerFriendConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRtcEnterRoomExitRoomOptConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRtcEnterRoomExitRoomOptConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestThresholdConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestThresholdConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostDividerSettingsConf;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostDividerSettingsConf_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinChannelConf;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinChannelConf_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.PanelStyle;
import com.bytedance.android.livesdk.livesetting.linkmic.PanelStyle_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.SettingsParams;
import com.bytedance.android.livesdk.livesetting.linkmic.SettingsParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.StateConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.StateConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.match.AnimationConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.match.AnimationConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.match.CheckBattleInfoConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.match.CheckBattleInfoConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.match.CompensationConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.match.CompensationConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceIdentifyOptSettingsData;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceIdentifyOptSettingsData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTimeOutData;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTimeOutData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchXData;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchXData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.InviteFriendFreCtrlConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.InviteFriendFreCtrlConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSettingConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSettingConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSeiAbnormalDetectorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSeiAbnormalDetectorSetting_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.RoomWindow;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.RoomWindow_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.VideoSeiEndSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.VideoSeiEndSetting_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.AllMessageFrequency;
import com.bytedance.android.livesdk.livesetting.message.AllMessageFrequency_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveIMMessageTrackConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveIMMessageTrackConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageDispatchConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageDispatchConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageFrequency;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageFrequencyConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageFrequencyConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageFrequency_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessagePreloadConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessagePreloadConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessagePreviewConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessagePreviewConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageReceiveTrackConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageReceiveTrackConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageSampleRatio;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageSampleRatio_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageSampleType;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageSampleType_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageWsTimeSyncConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageWsTimeSyncConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.message.MessageMonitorSamplingConfig;
import com.bytedance.android.livesdk.livesetting.message.MessageMonitorSamplingConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.LiveSlotSettings;
import com.bytedance.android.livesdk.livesetting.model.LiveSlotSettings_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.RecentlyLogIdSettings;
import com.bytedance.android.livesdk.livesetting.model.RecentlyLogIdSettings_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.RedEnvelopeUrls;
import com.bytedance.android.livesdk.livesetting.model.RedEnvelopeUrls_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.GiftGuideOpenPredictService;
import com.bytedance.android.livesdk.livesetting.other.GiftGuideOpenPredictService_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.GiftPanelOpenPredictService;
import com.bytedance.android.livesdk.livesetting.other.GiftPanelOpenPredictService_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LiveAIServices;
import com.bytedance.android.livesdk.livesetting.other.LiveAIServices_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LiveAvatarAnimationOptimizeV2Config;
import com.bytedance.android.livesdk.livesetting.other.LiveAvatarAnimationOptimizeV2Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomRightLikeBehaviorSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomRightLikeBehaviorSetting_LikeBehaviorConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LiveEventAndSubscribeConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveEventAndSubscribeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LiveHarConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveHarConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LiveOhrConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveOhrConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LivePitayaSettingsParams;
import com.bytedance.android.livesdk.livesetting.other.LivePitayaSettingsParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LivePitayaTaskFrequentControlManager;
import com.bytedance.android.livesdk.livesetting.other.LivePitayaTaskFrequentControlManager_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LivePitayaTaskSettingsParams;
import com.bytedance.android.livesdk.livesetting.other.LivePitayaTaskSettingsParams_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LiveRevenueFeatureCollectService;
import com.bytedance.android.livesdk.livesetting.other.LiveRevenueFeatureCollectService_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfLinkedLikeBehaviorSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfLinkedLikeBehaviorSetting_LikeBehaviorConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionConfig;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.FacialGiftTrackingModel;
import com.bytedance.android.livesdk.livesetting.performance.FacialGiftTrackingModel_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LikeAnimationOptModel;
import com.bytedance.android.livesdk.livesetting.performance.LikeAnimationOptModel_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LikeOptModel;
import com.bytedance.android.livesdk.livesetting.performance.LikeOptModel_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterEducationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterEducationSetting_NewGifterConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.degrade.DelayWidgetLoadConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.DelayWidgetLoadConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveAnimationDegrade;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveAnimationDegrade_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegrade;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegrade_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.CommentComboTrayConfig;
import com.bytedance.android.livesdk.livesetting.publicscreen.CommentComboTrayConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateBufferConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateBufferConfigSetting_LiveTranslateBufferConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting_LiveBeingAtConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleFallBackSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleFallBackSetting_CapsuleTypeScene_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedPublicScreenMaxMessageConfig;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedPublicScreenMaxMessageConfig_BufferConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDirectDispatchSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDirectDispatchSetting_LivePublicScreenDistributeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSdkPublicScreenMessageScheduleStrategySetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSdkPublicScreenMessageScheduleStrategySetting_LivePublicScreenAsyncConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.rank.AutoRefreshRankInterval;
import com.bytedance.android.livesdk.livesetting.rank.AutoRefreshRankInterval_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting_Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGeckoSetting;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGeckoSetting_Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGiftGuideSetting;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGiftGuideSetting_Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval_Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftAnnouncementFrequencySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftAnnouncementFrequencySetting_AnnouncementFrequencyConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileCardV3Config;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileCardV3Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileOptimizeConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileOptimizeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.roomfunction.ShortTouchWidgetRecycleConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.ShortTouchWidgetRecycleConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.slot.GeckoContent;
import com.bytedance.android.livesdk.livesetting.slot.GeckoContent_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentPurchaseConfig;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentPurchaseConfig_Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig_Config_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubOnlyChatSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubOnlyChatSetting_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubathonConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubathonConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionAnchorSubathonUrlConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionAnchorSubathonUrlConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceBalanceShownSetting;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceBalanceShownSetting_WalletEntranceConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMessageSEITimeoutConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMessageSEITimeoutConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizContainerOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizContainerOpt_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubsPrivilegeDetailOptConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubsPrivilegeDetailOptConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.PushStreamUrlConfigData;
import com.bytedance.android.livesdk.livesetting.watchlive.PushStreamUrlConfigData_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveDnsOptimizeConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveDnsOptimizeConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.SmoothEnterConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.SmoothEnterConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.model.FeedPreloadConfig;
import com.bytedance.android.livesdk.model.FeedPreloadConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.model.GiftPlayerAutoReleaseSwitch;
import com.bytedance.android.livesdk.model.GiftPlayerAutoReleaseSwitch_OptTypeAdapter;
import com.bytedance.android.livesdk.model.LiveBeautyParam;
import com.bytedance.android.livesdk.model.LiveBeautyParam_OptTypeAdapter;
import com.bytedance.android.livesdk.model.LiveBeautyParam_Param_OptTypeAdapter;
import com.bytedance.android.livesdk.model.LiveMessageTimeoutConfig;
import com.bytedance.android.livesdk.model.LiveMessageTimeoutConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.model.LiveNewAudienceEndModel;
import com.bytedance.android.livesdk.model.LiveNewAudienceEndModel_OptTypeAdapter;
import com.bytedance.android.livesdk.model.LiveUplinkConfig;
import com.bytedance.android.livesdk.model.LiveUplinkConfig_OptTypeAdapter;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting_DisconnectJudge_OptTypeAdapter;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting_OptTypeAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData_OptTypeAdapter;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig_AgreementForRegion_OptTypeAdapter;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig_OptTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveTypeAdapterFactory_livesetting implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        o.LJIIIZ(gson, "gson");
        o.LJIIIZ(type, "type");
        Class<? super T> rawType = type.getRawType();
        if (o.LJ(rawType, LivePublicScreenMsgPriorityConfig.class)) {
            return new LivePublicScreenMsgPriorityConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, BackRoomListSettingConfig.class)) {
            return new BackRoomListSettingConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGoodsBanner.class)) {
            return new LiveGoodsBanner_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGameFloatMsgPanelConfig.class)) {
            return new LiveGameFloatMsgPanelConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GameLinkMicGiftDialogConfig.class)) {
            return new GameLinkMicGiftDialogConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, DefaultDonationStickerPosition.class)) {
            return new DefaultDonationStickerPosition_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveFeedDraw.class)) {
            return new LiveFeedDraw_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveFeedSettings.class)) {
            return new LiveFeedSettings_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePreviewCardMaskConfig.class)) {
            return new LivePreviewCardMaskConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveScrollConfig.class)) {
            return new LiveScrollConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SpeakingVoiceConfig.class)) {
            return new SpeakingVoiceConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, VolumeDetectConfig.class)) {
            return new VolumeDetectConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveBannerConfigSetting.BannerConfig.class)) {
            return new LiveBannerConfigSetting_BannerConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, BroadcastSmoothGoLiveConfig.class)) {
            return new BroadcastSmoothGoLiveConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FluencyNegativeTestSettings.class)) {
            return new FluencyNegativeTestSettings_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveAboutMeMergeConfig.class)) {
            return new LiveAboutMeMergeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, AdmNsConfig.class)) {
            return new AdmNsConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, AnchorMockVideoSizeConfig.class)) {
            return new AnchorMockVideoSizeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, BeautyConfig.class)) {
            return new BeautyConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveLOPSchemaData.class)) {
            return new LiveLOPSchemaData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSheetDemoLynxUrlConfig.class)) {
            return new LiveSheetDemoLynxUrlConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SubsPayoutOnboardingUrlConfig.class)) {
            return new SubsPayoutOnboardingUrlConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSubscriptionAnchorUrlConfig.class)) {
            return new LiveSubscriptionAnchorUrlConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, NegativeTestSettings.class)) {
            return new NegativeTestSettings_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePitayaSettingsParams.class)) {
            return new LivePitayaSettingsParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePitayaTaskFrequentControlManager.class)) {
            return new LivePitayaTaskFrequentControlManager_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePitayaTaskSettingsParams.class)) {
            return new LivePitayaTaskSettingsParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveAIServices.class)) {
            return new LiveAIServices_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GiftPanelOpenPredictService.class)) {
            return new GiftPanelOpenPredictService_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveRevenueFeatureCollectService.class)) {
            return new LiveRevenueFeatureCollectService_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GiftGuideOpenPredictService.class)) {
            return new GiftGuideOpenPredictService_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveHarConfig.class)) {
            return new LiveHarConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveOhrConfig.class)) {
            return new LiveOhrConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, Config.class)) {
            return new Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, InputDialogFixSettingModel.class)) {
            return new InputDialogFixSettingModel_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, EomjiConfig.class)) {
            return new EomjiConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ReportFeedbackUrls.class)) {
            return new ReportFeedbackUrls_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, DefaultHighLightCutConfig.class)) {
            return new DefaultHighLightCutConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GameBroadcastExceptionConfig.class)) {
            return new GameBroadcastExceptionConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ExceptionInfo.class)) {
            return new ExceptionInfo_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GameLiveFeedbackLabelIds.class)) {
            return new GameLiveFeedbackLabelIds_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiDeviceInterruptGuideData.class)) {
            return new MultiDeviceInterruptGuideData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ProcessExitGuideData.class)) {
            return new ProcessExitGuideData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, UploadSpeedDetectionMapping.class)) {
            return new UploadSpeedDetectionMapping_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, DropsPageSchemaData.class)) {
            return new DropsPageSchemaData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GameLivePartnershipDropsConfig.class)) {
            return new GameLivePartnershipDropsConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GameCardShownConfig.class)) {
            return new GameCardShownConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PartnershipSchemaConfig.class)) {
            return new PartnershipSchemaConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GiftRenderSparkOptimize.class)) {
            return new GiftRenderSparkOptimize_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, HotWordGiftStruct.class)) {
            return new HotWordGiftStruct_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, HotWordGiftStruct.FrequencyControl.class)) {
            return new HotWordGiftStruct_FrequencyControl_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveFlymicGiftDowngradeStrategy.SettingParams.class)) {
            return new LiveFlymicGiftDowngradeStrategy_SettingParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, EffectPreloadParams.class)) {
            return new EffectPreloadParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GiftGuideClientAI.class)) {
            return new GiftGuideClientAI_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, AutoTriggerConfig.class)) {
            return new AutoTriggerConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, NativeTriggerConfig.class)) {
            return new NativeTriggerConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SettingParams.class)) {
            return new SettingParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig.class)) {
            return new LiveGiftPanelLoadingOptimizationSetting_GiftPanelOptimizationConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGiftPanelOpenIntentionParams.class)) {
            return new LiveGiftPanelOpenIntentionParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PostRechargeRetentionParams.class)) {
            return new PostRechargeRetentionParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGiftResourceManagerConfig.class)) {
            return new LiveGiftResourceManagerConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGiftTrayMatchPointsSetting.GiftTrayMatchPointsConfig.class)) {
            return new LiveGiftTrayMatchPointsSetting_GiftTrayMatchPointsConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveUserRiskVerify.class)) {
            return new LiveUserRiskVerify_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, DowngradeSettings.class)) {
            return new DowngradeSettings_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, VipFeedbackStruct.class)) {
            return new VipFeedbackStruct_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SparkReuseConfig.class)) {
            return new SparkReuseConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SparkDynamicParam.class)) {
            return new SparkDynamicParam_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FansClubConfig.class)) {
            return new FansClubConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FansClubDynamicConfig.class)) {
            return new FansClubDynamicConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FansEntranceResConfig.class)) {
            return new FansEntranceResConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GeckoResourceDownloadConfig.class)) {
            return new GeckoResourceDownloadConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FansClubLottieConfig.class)) {
            return new FansClubLottieConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LevelSystemResourceConfig.class)) {
            return new LevelSystemResourceConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LevelSystemGeckoOnDemandConfig.class)) {
            return new LevelSystemGeckoOnDemandConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, UserLevelConfig.class)) {
            return new UserLevelConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GiftPanelAnimatorConfig.class)) {
            return new GiftPanelAnimatorConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, BarrageGradeResConfig.class)) {
            return new BarrageGradeResConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, BarrageEnterRoomResConfig.class)) {
            return new BarrageEnterRoomResConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, UserLevelDynamicConfig.class)) {
            return new UserLevelDynamicConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FeResourceChannelConfig.class)) {
            return new FeResourceChannelConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, CoHostSeiTalkSettingConfig.class)) {
            return new CoHostSeiTalkSettingConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicAudioModeSettingConf.class)) {
            return new LinkMicAudioModeSettingConf_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicLoggerReportConf.class)) {
            return new LinkMicLoggerReportConf_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicMixStreamAudioParams.class)) {
            return new LinkMicMixStreamAudioParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicMixStreamVideoParams.class)) {
            return new LinkMicMixStreamVideoParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, AddNotReceiveFirstFrameExpConf.class)) {
            return new AddNotReceiveFirstFrameExpConf_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicPerfSladarEventReportConf.class)) {
            return new LinkMicPerfSladarEventReportConf_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkMicSDKForwardStreamProtectConf.class)) {
            return new LinkMicSDKForwardStreamProtectConf_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, StateConfig.class)) {
            return new StateConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LinkmicSequentialEventReportConf.class)) {
            return new LinkmicSequentialEventReportConf_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SettingsParams.class)) {
            return new SettingsParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveCoHostFriendNoticeOptMock.MockParams.class)) {
            return new LiveCoHostFriendNoticeOptMock_MockParams_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, CohostMatchResumeSetting.class)) {
            return new CohostMatchResumeSetting_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSdkMultiGuestMonitorConfig.class)) {
            return new LiveSdkMultiGuestMonitorConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiHostPreJoinChannelConf.class)) {
            return new MultiHostPreJoinChannelConf_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PanelStyle.class)) {
            return new PanelStyle_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiGuestThresholdConfig.class)) {
            return new MultiGuestThresholdConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiGuestFeSchemaConfig.class)) {
            return new MultiGuestFeSchemaConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiGuestLiveShowConfig.class)) {
            return new MultiGuestLiveShowConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiGuestOptPanelFixLayoutConfig.class)) {
            return new MultiGuestOptPanelFixLayoutConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiGuestOutViewerFriendConfig.class)) {
            return new MultiGuestOutViewerFriendConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiGuestRtcEnterRoomExitRoomOptConfig.class)) {
            return new MultiGuestRtcEnterRoomExitRoomOptConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiHostDividerSettingsConf.class)) {
            return new MultiHostDividerSettingsConf_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, AnimationConfig.class)) {
            return new AnimationConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, CheckBattleInfoConfig.class)) {
            return new CheckBattleInfoConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMatchAudienceIdentifyOptSettingsData.class)) {
            return new LiveMatchAudienceIdentifyOptSettingsData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, CompensationConfig.class)) {
            return new CompensationConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMatchTimeOutData.class)) {
            return new LiveMatchTimeOutData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MatchXData.class)) {
            return new MatchXData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSeiConfig.class)) {
            return new LiveSeiConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSeiTalkSettingConfig.class)) {
            return new LiveSeiTalkSettingConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MultiGuestSeiAbnormalDetectorSetting.class)) {
            return new MultiGuestSeiAbnormalDetectorSetting_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, VideoSeiEndSetting.class)) {
            return new VideoSeiEndSetting_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, InviteFriendFreCtrlConfig.class)) {
            return new InviteFriendFreCtrlConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RoomWindow.class)) {
            return new RoomWindow_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveIMMessageTrackConfig.class)) {
            return new LiveIMMessageTrackConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageSampleType.class)) {
            return new LiveMessageSampleType_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageSampleRatio.class)) {
            return new LiveMessageSampleRatio_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageDispatchConfig.class)) {
            return new LiveMessageDispatchConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageFrequencyConfig.class)) {
            return new LiveMessageFrequencyConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, AllMessageFrequency.class)) {
            return new AllMessageFrequency_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageFrequency.class)) {
            return new LiveMessageFrequency_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, MessageMonitorSamplingConfig.class)) {
            return new MessageMonitorSamplingConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessagePreloadConfig.class)) {
            return new LiveMessagePreloadConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessagePreviewConfig.class)) {
            return new LiveMessagePreviewConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageReceiveTrackConfig.class)) {
            return new LiveMessageReceiveTrackConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageConfig.class)) {
            return new LiveMessageConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageWsTimeSyncConfig.class)) {
            return new LiveMessageWsTimeSyncConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSlotSettings.class)) {
            return new LiveSlotSettings_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SlotBizTypeDisallow.class)) {
            return new SlotBizTypeDisallow_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RecentlyLogIdSettings.class)) {
            return new RecentlyLogIdSettings_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RedEnvelopeUrls.class)) {
            return new RedEnvelopeUrls_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FollowLiveBubbleConfig.class)) {
            return new FollowLiveBubbleConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveAvatarAnimationOptimizeV2Config.class)) {
            return new LiveAvatarAnimationOptimizeV2Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveBottomRightLikeBehaviorSetting.LikeBehaviorConfig.class)) {
            return new LiveBottomRightLikeBehaviorSetting_LikeBehaviorConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveEventAndSubscribeConfig.class)) {
            return new LiveEventAndSubscribeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSelfLinkedLikeBehaviorSetting.LikeBehaviorConfig.class)) {
            return new LiveSelfLinkedLikeBehaviorSetting_LikeBehaviorConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SubscriptionConfig.class)) {
            return new SubscriptionConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FacialGiftTrackingModel.class)) {
            return new FacialGiftTrackingModel_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGiftNewGifterEducationSetting.NewGifterConfig.class)) {
            return new LiveGiftNewGifterEducationSetting_NewGifterConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LikeAnimationOptModel.class)) {
            return new LikeAnimationOptModel_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LikeOptModel.class)) {
            return new LikeOptModel_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, BadPhonesWatchLiveCommonUIConfig.class)) {
            return new BadPhonesWatchLiveCommonUIConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, DelayWidgetLoadConfig.class)) {
            return new DelayWidgetLoadConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveAnimationDegrade.class)) {
            return new LiveAnimationDegrade_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveBannerDegrade.class)) {
            return new LiveBannerDegrade_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig.class)) {
            return new LiveAutoTranslateBufferConfigSetting_LiveTranslateBufferConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveBeingAtConfigSetting.LiveBeingAtConfig.class)) {
            return new LiveBeingAtConfigSetting_LiveBeingAtConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveCapsuleFallBackSetting.CapsuleTypeScene.class)) {
            return new LiveCapsuleFallBackSetting_CapsuleTypeScene_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, CommentComboTrayConfig.class)) {
            return new CommentComboTrayConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveExtendedPublicScreenMaxMessageConfig.BufferConfig.class)) {
            return new LiveExtendedPublicScreenMaxMessageConfig_BufferConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePublicScreenDirectDispatchSetting.LivePublicScreenDistributeConfig.class)) {
            return new LivePublicScreenDirectDispatchSetting_LivePublicScreenDistributeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSdkPublicScreenMessageScheduleStrategySetting.LivePublicScreenAsyncConfig.class)) {
            return new LiveSdkPublicScreenMessageScheduleStrategySetting_LivePublicScreenAsyncConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, AutoRefreshRankInterval.class)) {
            return new AutoRefreshRankInterval_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, OnlineAudienceDisplayStrategySetting.Config.class)) {
            return new OnlineAudienceDisplayStrategySetting_Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, OnlineAudienceGeckoSetting.Config.class)) {
            return new OnlineAudienceGeckoSetting_Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, OnlineAudienceGiftGuideSetting.Config.class)) {
            return new OnlineAudienceGiftGuideSetting_Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RankEntranceLoopInterval.Config.class)) {
            return new RankEntranceLoopInterval_Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig.class)) {
            return new LiveGiftAnnouncementFrequencySetting_AnnouncementFrequencyConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveProfileOptimizeConfig.class)) {
            return new LiveProfileOptimizeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveProfileCardV3Config.class)) {
            return new LiveProfileCardV3Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ShortTouchWidgetRecycleConfig.class)) {
            return new ShortTouchWidgetRecycleConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GeckoContent.class)) {
            return new GeckoContent_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveStarCommentPurchaseConfig.Config.class)) {
            return new LiveStarCommentPurchaseConfig_Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveStarCommentSchemaConfig.Config.class)) {
            return new LiveStarCommentSchemaConfig_Config_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSubOnlyChatSetting.class)) {
            return new LiveSubOnlyChatSetting_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSubathonConfig.class)) {
            return new LiveSubathonConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSubscriptionAnchorSubathonUrlConfig.class)) {
            return new LiveSubscriptionAnchorSubathonUrlConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, WalletEntranceBalanceShownSetting.WalletEntranceConfig.class)) {
            return new WalletEntranceBalanceShownSetting_WalletEntranceConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageSEITimeoutConfig.class)) {
            return new LiveMessageSEITimeoutConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveQuizContainerOpt.class)) {
            return new LiveQuizContainerOpt_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveSubsPrivilegeDetailOptConfig.class)) {
            return new LiveSubsPrivilegeDetailOptConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, PushStreamUrlConfigData.class)) {
            return new PushStreamUrlConfigData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveDnsOptimizeConfig.class)) {
            return new LiveDnsOptimizeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, SmoothEnterConfig.class)) {
            return new SmoothEnterConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveMessageTimeoutConfig.class)) {
            return new LiveMessageTimeoutConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveUplinkConfig.class)) {
            return new LiveUplinkConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, BubbleSettingData.class)) {
            return new BubbleSettingData_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RequestPb.class)) {
            return new RequestPb_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LikeConfig.class)) {
            return new LikeConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveAnchorContactConfig.class)) {
            return new LiveAnchorContactConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveCommentTranslationConfig.class)) {
            return new LiveCommentTranslationConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LivePublicScreenConfig.class)) {
            return new LivePublicScreenConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, ShareEffectIntervalConfig.class)) {
            return new ShareEffectIntervalConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, Camera2AB.class)) {
            return new Camera2AB_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveFollowFeedDrawLoop.class)) {
            return new LiveFollowFeedDrawLoop_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RoomSlideUpGuide.class)) {
            return new RoomSlideUpGuide_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, FeedPreloadConfig.class)) {
            return new FeedPreloadConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, GiftPlayerAutoReleaseSwitch.class)) {
            return new GiftPlayerAutoReleaseSwitch_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveBeautyParam.class)) {
            return new LiveBeautyParam_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveBeautyParam.Param.class)) {
            return new LiveBeautyParam_Param_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveNewAudienceEndModel.class)) {
            return new LiveNewAudienceEndModel_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RandomLinkMicSetting.class)) {
            return new RandomLinkMicSetting_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, RandomLinkMicSetting.DisconnectJudge.class)) {
            return new RandomLinkMicSetting_DisconnectJudge_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveRechargeAgreementConfig.class)) {
            return new LiveRechargeAgreementConfig_OptTypeAdapter(gson);
        }
        if (o.LJ(rawType, LiveRechargeAgreementConfig.AgreementForRegion.class)) {
            return new LiveRechargeAgreementConfig_AgreementForRegion_OptTypeAdapter(gson);
        }
        return null;
    }
}
