package X;

import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._HashtagResponse_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_Content_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.banner.RankRoundBanner;
import com.bytedance.android.live.base.model.banner._RankRoundBanner_ProtoDecoder;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.emoji._EmoteConfig_ProtoDecoder;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import com.bytedance.android.live.base.model.emoji._EmoteWithIndex_ProtoDecoder;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.feed._FeedExtra_LogPb_ProtoDecoder;
import com.bytedance.android.live.base.model.feed._FeedExtra_ProtoDecoder;
import com.bytedance.android.live.base.model.live.RankUser;
import com.bytedance.android.live.base.model.live.Ranking;
import com.bytedance.android.live.base.model.live._RankUser_ProtoDecoder;
import com.bytedance.android.live.base.model.live._Ranking_ProtoDecoder;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankConfig;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.live.base.model.roomcomponents.RoomComponentsResponse;
import com.bytedance.android.live.base.model.roomcomponents._OnlineRankConfig_ProtoDecoder;
import com.bytedance.android.live.base.model.roomcomponents._OnlineRankListResponse_ProtoDecoder;
import com.bytedance.android.live.base.model.roomcomponents._RoomComponentsResponse_ProtoDecoder;
import com.bytedance.android.live.base.model.user.ArrowConfig;
import com.bytedance.android.live.base.model.user.AvatarFrame;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.BadgeText;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.EntranceEffect;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.FontStyle;
import com.bytedance.android.live.base.model.user.IconConfig;
import com.bytedance.android.live.base.model.user.ImageBadge;
import com.bytedance.android.live.base.model.user.NumberConfig;
import com.bytedance.android.live.base.model.user.PaddingInfo;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.ProfileCardPanel;
import com.bytedance.android.live.base.model.user.ProfileContent;
import com.bytedance.android.live.base.model.user.ProjectionConfig;
import com.bytedance.android.live.base.model.user.SeparatorConfig;
import com.bytedance.android.live.base.model.user.StringBadge;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.TextBadge;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._ArrowConfig_ProtoDecoder;
import com.bytedance.android.live.base.model.user._AvatarFrame_ProtoDecoder;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.live.base.model.user._BadgeText_ProtoDecoder;
import com.bytedance.android.live.base.model.user._CombineBadgeBackground_ProtoDecoder;
import com.bytedance.android.live.base.model.user._CombineBadgeStruct_ProtoDecoder;
import com.bytedance.android.live.base.model.user._EntranceEffect_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FollowInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FontStyle_ProtoDecoder;
import com.bytedance.android.live.base.model.user._IconConfig_ProtoDecoder;
import com.bytedance.android.live.base.model.user._ImageBadge_ProtoDecoder;
import com.bytedance.android.live.base.model.user._NumberConfig_ProtoDecoder;
import com.bytedance.android.live.base.model.user._PaddingInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import com.bytedance.android.live.base.model.user._ProfileCardPanel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._ProfileContent_ProtoDecoder;
import com.bytedance.android.live.base.model.user._ProjectionConfig_ProtoDecoder;
import com.bytedance.android.live.base.model.user._SeparatorConfig_ProtoDecoder;
import com.bytedance.android.live.base.model.user._StringBadge_ProtoDecoder;
import com.bytedance.android.live.base.model.user._SubscribeBadge_ProtoDecoder;
import com.bytedance.android.live.base.model.user._SubscribeInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._TextBadge_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ComboBadgeInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_FansClubInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_OwnRoom_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.match.model.BattleFinishRequest;
import com.bytedance.android.live.liveinteract.match.model.BattleFinishResult;
import com.bytedance.android.live.liveinteract.match.model.BattleInviteRequestParams;
import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;
import com.bytedance.android.live.liveinteract.match.model.PrepareBattleRequest;
import com.bytedance.android.live.liveinteract.match.model.PrepareBattleResponse;
import com.bytedance.android.live.liveinteract.match.model._BattleFinishRequest_ProtoDecoder;
import com.bytedance.android.live.liveinteract.match.model._BattleFinishResult_ProtoDecoder;
import com.bytedance.android.live.liveinteract.match.model._BattleFinishResult_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.match.model._BattleInviteRequestParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.match.model._BattleInviteResult_ProtoDecoder;
import com.bytedance.android.live.liveinteract.match.model._BattleInviteResult_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.match.model._PrepareBattleRequest_ProtoDecoder;
import com.bytedance.android.live.liveinteract.match.model._PrepareBattleResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.match.model._PrepareBattleResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.ActivityBannerParams;
import com.bytedance.android.live.liveinteract.multilive.model.ActivityBannerResponse;
import com.bytedance.android.live.liveinteract.multilive.model.AnchorClientList;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionParams;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.BannerAction;
import com.bytedance.android.live.liveinteract.multilive.model.BannerContentMultiGuest;
import com.bytedance.android.live.liveinteract.multilive.model.ChannelMessage;
import com.bytedance.android.live.liveinteract.multilive.model.CheckActivityRoomParams;
import com.bytedance.android.live.liveinteract.multilive.model.CheckActivityRoomResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistParams;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetLeaveLinkmicPanelParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetLeaveLinkmicPanelResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetLinkMicAdParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetLinkMicAdResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestBonusParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestBonusResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestClientList;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionParams;
import com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse;
import com.bytedance.android.live.liveinteract.multilive.model.HostMultiGuestPermissionParams;
import com.bytedance.android.live.liveinteract.multilive.model.InRoomMultiGuestBanner;
import com.bytedance.android.live.liveinteract.multilive.model.LeaveLinkmicPanelSuggestUser;
import com.bytedance.android.live.liveinteract.multilive.model.LinkedUser;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeParams;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveReqParams;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.multilive.model.ReplyInvitationPanelInfo;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import com.bytedance.android.live.liveinteract.multilive.model.RoomHostMultiGuestPermissionInfo;
import com.bytedance.android.live.liveinteract.multilive.model.SharedInvitationCallbackParams;
import com.bytedance.android.live.liveinteract.multilive.model.SharedInvitationCallbackResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.WaitUser;
import com.bytedance.android.live.liveinteract.multilive.model._ActivityBannerParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ActivityBannerResponse_BannerInfo_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ActivityBannerResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ActivityBannerResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._AnchorClientList_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._AudienceMultiGuestPermissionParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._AudienceMultiGuestPermissionResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._BannerAction_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._BannerContentMultiGuest_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ChannelMessage_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._CheckActivityRoomParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._CheckActivityRoomResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._CheckActivityRoomResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._CreateShowParams_ListUser_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._CreateShowParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._CreateShowResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._CreateShowResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._EndShowParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._EndShowResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._EndShowResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._EnlargeScreenManageParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._EnlargeScreenManageResponse_Extra_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._EnlargeScreenManageResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._EnlargeScreenManageResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._FanTicketRanklistParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._FanTicketRanklistResponse_Extra_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._FanTicketRanklistResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._FanTicketRanklistResponse_RanklistUser_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._FanTicketRanklistResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._FinishShowingGuestParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._FinishShowingGuestResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._FinishShowingGuestResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetGuestSettingParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetGuestSettingResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetGuestSettingResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetLeaveLinkmicPanelParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetLeaveLinkmicPanelResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetLeaveLinkmicPanelResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetLinkMicAdParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetLinkMicAdResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetLinkMicAdResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetMultiGuestBonusParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetMultiGuestBonusResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetMultiGuestBonusResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetSharedInviteePanelParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetSharedInviteePanelResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetSharedInviteePanelResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowContentParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowContentResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowContentResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowRankParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowRankResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowRankResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowRankResponse_ShowRankUser_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowSettingsParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowSettingsResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GetShowSettingsResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GuestClientList_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GuestMicCameraManageParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GuestMicCameraManageResponse_Extra_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GuestMicCameraManageResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._GuestMicCameraManageResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._HostCheckOtherAudienceMultiGuestPermissionParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._HostCheckOtherAudienceMultiGuestPermissionResponse_Extra_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._HostCheckOtherAudienceMultiGuestPermissionResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._HostCheckOtherAudienceMultiGuestPermissionResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._HostMultiGuestPermissionParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._InRoomMultiGuestBanner_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._LeaveLinkmicPanelSuggestUser_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._LinkedUser_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ListByTypeParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ListByTypeResponse_Extra_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ListByTypeResponse_GiftScoreAppliedUser_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ListByTypeResponse_MultiGuestBonus_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ListByTypeResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ListByTypeResponse_ReservedUser_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._MultiGuestPermissionInfo_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._MultiGuestReserveReqParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._MultiGuestReserveResponse_Extra_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._MultiGuestReserveResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._MultiGuestReserveResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._MultiLiveGuestInfoList_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ReplyInvitationPanelInfo_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ReportLinkMessageReq_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ReportLinkMessageResp_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._RoomHostMultiGuestPermissionInfo_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._SharedInvitationCallbackParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._SharedInvitationCallbackResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._SharedInvitationCallbackResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ShowAgainGuestParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ShowAgainGuestResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._ShowAgainGuestResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._UpdateGuestSettingParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._UpdateGuestSettingResponse_Extra_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._UpdateGuestSettingResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._UpdateGuestSettingResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._UpdateShowContentParams_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._UpdateShowContentResponse_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._UpdateShowContentResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._WaitUser_ProtoDecoder;
import com.bytedance.android.live.wallet.base.subscribe.CreateContractRequest;
import com.bytedance.android.live.wallet.base.subscribe.CreateContractResponse;
import com.bytedance.android.live.wallet.base.subscribe.CreateContractResult;
import com.bytedance.android.live.wallet.base.subscribe.CreateGiftSubContractRequest;
import com.bytedance.android.live.wallet.base.subscribe.CreateGiftSubContractResponse;
import com.bytedance.android.live.wallet.base.subscribe.CreateGiftSubContractResult;
import com.bytedance.android.live.wallet.base.subscribe._CreateContractRequest_ProtoDecoder;
import com.bytedance.android.live.wallet.base.subscribe._CreateContractResponse_ProtoDecoder;
import com.bytedance.android.live.wallet.base.subscribe._CreateContractResponse_ResponseExtra_ProtoDecoder;
import com.bytedance.android.live.wallet.base.subscribe._CreateContractResult_ProtoDecoder;
import com.bytedance.android.live.wallet.base.subscribe._CreateGiftSubContractRequest_ProtoDecoder;
import com.bytedance.android.live.wallet.base.subscribe._CreateGiftSubContractResponse_ProtoDecoder;
import com.bytedance.android.live.wallet.base.subscribe._CreateGiftSubContractResponse_ResponseExtra_ProtoDecoder;
import com.bytedance.android.live.wallet.base.subscribe._CreateGiftSubContractResult_ProtoDecoder;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import com.bytedance.android.live.wallet.model.CustomizedDiamond;
import com.bytedance.android.live.wallet.model.FirstChargeRequestParams;
import com.bytedance.android.live.wallet.model._CurrencyPriceItem_ProtoDecoder;
import com.bytedance.android.live.wallet.model._CustomizedDiamond_ProtoDecoder;
import com.bytedance.android.live.wallet.model._FirstChargeRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model.QuizAnchorInfo;
import com.bytedance.android.livesdk.activity.quiz.model.QuizAnswerInfo;
import com.bytedance.android.livesdk.activity.quiz.model.QuizCallUpWebview;
import com.bytedance.android.livesdk.activity.quiz.model.QuizFinalResult;
import com.bytedance.android.livesdk.activity.quiz.model.QuizImage;
import com.bytedance.android.livesdk.activity.quiz.model.QuizNextQuiz;
import com.bytedance.android.livesdk.activity.quiz.model.QuizQuestionInfo;
import com.bytedance.android.livesdk.activity.quiz.model.QuizQuestionOption;
import com.bytedance.android.livesdk.activity.quiz.model.QuizRewardRule;
import com.bytedance.android.livesdk.activity.quiz.model.QuizRulesIntroduction;
import com.bytedance.android.livesdk.activity.quiz.model.QuizStatistics;
import com.bytedance.android.livesdk.activity.quiz.model.QuizUserIdentityInfo;
import com.bytedance.android.livesdk.activity.quiz.model.QuizUserQuestionResult;
import com.bytedance.android.livesdk.activity.quiz.model.UserLiveEventInfo;
import com.bytedance.android.livesdk.activity.quiz.model._QuizAnchorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizAnswerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizCallUpWebview_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizFinalResult_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizImage_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizNextQuiz_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizQuestionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizQuestionOption_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizRewardRule_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizRewardRule_RewardItem_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizRulesIntroduction_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizStatistics_OptionCountItem_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizStatistics_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizUserIdentityInfo_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._QuizUserQuestionResult_ProtoDecoder;
import com.bytedance.android.livesdk.activity.quiz.model._UserLiveEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.battle.model.BattleRecentContribRequest;
import com.bytedance.android.livesdk.battle.model.BattleRecentContribResponse;
import com.bytedance.android.livesdk.battle.model.BattleTriggerGuideRequest;
import com.bytedance.android.livesdk.battle.model.BattleTriggerGuideResponse;
import com.bytedance.android.livesdk.battle.model._BattleRecentContribRequest_ProtoDecoder;
import com.bytedance.android.livesdk.battle.model._BattleRecentContribResponse_ProtoDecoder;
import com.bytedance.android.livesdk.battle.model._BattleRecentContribResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.battle.model._BattleTriggerGuideRequest_ProtoDecoder;
import com.bytedance.android.livesdk.battle.model._BattleTriggerGuideResponse_ProtoDecoder;
import com.bytedance.android.livesdk.battle.model._BattleTriggerGuideResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.boostcard.BoostedUsersPoint;
import com.bytedance.android.livesdk.boostcard.LiveGiftBoostCardAckResponse;
import com.bytedance.android.livesdk.boostcard.LiveGiftBoostCardUserStatusResponse;
import com.bytedance.android.livesdk.boostcard._BoostedUsersPoint_ProtoDecoder;
import com.bytedance.android.livesdk.boostcard._LiveGiftBoostCardAckResponse_ProtoDecoder;
import com.bytedance.android.livesdk.boostcard._LiveGiftBoostCardUserStatusResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api.AboutMeInfo;
import com.bytedance.android.livesdk.chatroom.api.AnchorEmailInfo;
import com.bytedance.android.livesdk.chatroom.api.AnchorSubWaveChallengeSettings;
import com.bytedance.android.livesdk.chatroom.api.AnchorSubWaveCurrentSettings;
import com.bytedance.android.livesdk.chatroom.api.AnchorSubWaveSettingsConfig;
import com.bytedance.android.livesdk.chatroom.api.AnchorSubWaveTriggerSettings;
import com.bytedance.android.livesdk.chatroom.api.Badge;
import com.bytedance.android.livesdk.chatroom.api.BadgeConfig;
import com.bytedance.android.livesdk.chatroom.api.BadgeDetail;
import com.bytedance.android.livesdk.chatroom.api.BadgeInfo;
import com.bytedance.android.livesdk.chatroom.api.BadgeLimit;
import com.bytedance.android.livesdk.chatroom.api.BadgePreview;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.bytedance.android.livesdk.chatroom.api.C2CTransformationPageInfo;
import com.bytedance.android.livesdk.chatroom.api.CommunityContent;
import com.bytedance.android.livesdk.chatroom.api.CommunityDetail;
import com.bytedance.android.livesdk.chatroom.api.CommunityIDInfo;
import com.bytedance.android.livesdk.chatroom.api.EmoteInfo;
import com.bytedance.android.livesdk.chatroom.api.GraceInfo;
import com.bytedance.android.livesdk.chatroom.api.LevelBadge;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.chatroom.api.NoteContent;
import com.bytedance.android.livesdk.chatroom.api.NoteDetail;
import com.bytedance.android.livesdk.chatroom.api.NoteInfo;
import com.bytedance.android.livesdk.chatroom.api.OriginBadgeInfo;
import com.bytedance.android.livesdk.chatroom.api.Perk;
import com.bytedance.android.livesdk.chatroom.api.PriceChangeInfo;
import com.bytedance.android.livesdk.chatroom.api.PriceTier;
import com.bytedance.android.livesdk.chatroom.api.PriceTierInfo;
import com.bytedance.android.livesdk.chatroom.api.PrivateEmoteDetail;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SOVMaskInfo;
import com.bytedance.android.livesdk.chatroom.api.ShareInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import com.bytedance.android.livesdk.chatroom.api.SubAdminPermission;
import com.bytedance.android.livesdk.chatroom.api.SubBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefitMedia;
import com.bytedance.android.livesdk.chatroom.api.SubGoalPinCard;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.chatroom.api.SubPinCardText;
import com.bytedance.android.livesdk.chatroom.api.SubTaskInfo;
import com.bytedance.android.livesdk.chatroom.api.SubTimerSticker;
import com.bytedance.android.livesdk.chatroom.api.SubWaveImMsg;
import com.bytedance.android.livesdk.chatroom.api.SubWaveInfo;
import com.bytedance.android.livesdk.chatroom.api.SubWaveInfoCommon;
import com.bytedance.android.livesdk.chatroom.api.SubWaveSubscriberInfo;
import com.bytedance.android.livesdk.chatroom.api.TimerConfig;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.api.ToolsInfo;
import com.bytedance.android.livesdk.chatroom.api.WaveReward;
import com.bytedance.android.livesdk.chatroom.api._AboutMeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._AnchorEmailInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._AnchorSubWaveChallengeSettings_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._AnchorSubWaveCurrentSettings_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._AnchorSubWaveSettingsConfig_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._AnchorSubWaveTriggerSettings_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BadgeConfig_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BadgeDetail_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BadgeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BadgeLimit_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BadgePreview_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._Badge_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._BenefitView_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._C2CTransformationPageInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._CommunityContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._CommunityDetail_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._CommunityIDInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._EmoteInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._GraceInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._LevelBadge_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._LiveSubOnlyConfig_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._NoteContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._NoteDetail_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._NoteInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._OriginBadgeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._Perk_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._PriceChangeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._PriceTierInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._PriceTier_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._PrivateEmoteDetail_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SOVBriefInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SOVMaskInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._ShareInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SpotlightInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SpotlightItem_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubAdminPermission_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubBenefit_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubCustomizedBenefitMedia_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubCustomizedBenefit_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubGoalPinCard_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubLevel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubOnlyVideosBriefInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubPinCardText_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubPinCard_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubPinCard_Text_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubTaskInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubTimerSticker_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubWaveImMsg_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubWaveInfoCommon_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubWaveInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubWaveSubscriberInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._TimerConfig_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._TimerDetail_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._ToolsInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._WaveReward_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.AnchorLinkmicUserSettings;
import com.bytedance.android.livesdk.chatroom.interact.model.ApplyParams;
import com.bytedance.android.livesdk.chatroom.interact.model.ApplyResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchBanner;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchReq;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostListParams;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.GetSettingsParams;
import com.bytedance.android.livesdk.chatroom.interact.model.GetSettingsResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.GuidePopupBanner;
import com.bytedance.android.livesdk.chatroom.interact.model.InitParams;
import com.bytedance.android.livesdk.chatroom.interact.model.InitResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.InviteExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.InviteParams;
import com.bytedance.android.livesdk.chatroom.interact.model.InviteResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.JoinChannelParams;
import com.bytedance.android.livesdk.chatroom.interact.model.JoinChannelResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkGetSettingResult;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInRoomInviteResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInRoomReplyResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusParams;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.MgetPullStreamInfosParams;
import com.bytedance.android.livesdk.chatroom.interact.model.MgetPullStreamInfosResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.PermitParams;
import com.bytedance.android.livesdk.chatroom.interact.model.PermitResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ReplyParams;
import com.bytedance.android.livesdk.chatroom.interact.model.ReplyReserveParams;
import com.bytedance.android.livesdk.chatroom.interact.model.ReplyReserveResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ReplyResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveParams;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeParams;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsParams;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.SearchBar;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicLikeParams;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicLikeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicListParams;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairParams;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicSetParams;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicSetResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerLivingNoticeParams;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerLivingNoticeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerReserveNoticeParams;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerReserveNoticeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerResumeNoticeParams;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerResumeNoticeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import com.bytedance.android.livesdk.chatroom.interact.model._AnchorLinkmicUserSettings_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ApplyParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ApplyResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._AutoMatchBanner_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._AutoMatchReq_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._AutoMatchResp_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._AutoMatchResp_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._CohostListParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._CohostListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._CohostListResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._GetSettingsParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._GetSettingsResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._GuidePopupBanner_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._InitParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._InitResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._InviteExtra_LogPb_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._InviteExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._InviteParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._InviteResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._JoinChannelParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._JoinChannelResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._JoinChannelResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._LinkGetSettingResult_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._LinkInRoomInviteResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._LinkInRoomReplyResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._LinkInviteResult_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._LinkerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._LinkmicListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._MGetUserLinkmicStatusParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._MGetUserLinkmicStatusResponse_Extra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._MGetUserLinkmicStatusResponse_LinkmicStatus_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._MGetUserLinkmicStatusResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._MGetUserLinkmicStatusResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._MgetPullStreamInfosParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._MgetPullStreamInfosResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._MgetPullStreamInfosResponse_PullStreamInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._MgetPullStreamInfosResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._PermitParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._PermitResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._PermitResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReplyParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReplyReserveParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReplyReserveResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReplyReserveResponse_ReplyReserveExtra_LogPb_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReplyReserveResponse_ReplyReserveExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReplyReserveResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReplyResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReserveParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReserveResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReserveResponse_ReserveExtra_LogPb_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReserveResponse_ReserveExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ReserveResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ResumeParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ResumeResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._ResumeResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalExtraInfo_ReserveInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalExtraInfo_Tag_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalsListExtra_LogPbBean_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalsListExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalsListsData_BannerText_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalsListsData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalsListsData_TopHostInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalsParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalsResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._SearchBar_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicLikeParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicLikeResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicLikeResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicListParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicListResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicPairParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicPairResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicPairResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicPairResponse_ResponseData_Setting_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicSetParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicSetResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TopicSetResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TriggerLivingNoticeParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TriggerLivingNoticeResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TriggerLivingNoticeResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TriggerReserveNoticeParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TriggerReserveNoticeResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TriggerReserveNoticeResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TriggerResumeNoticeParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TriggerResumeNoticeResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._TriggerResumeNoticeResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model._UserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishRequest;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayDeleteRequest;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayDeleteResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoRequest;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoResponse;
import com.bytedance.android.livesdk.chatroom.model.ApplyResult;
import com.bytedance.android.livesdk.chatroom.model.AudiencePingExtra;
import com.bytedance.android.livesdk.chatroom.model.ChatEmojiListData;
import com.bytedance.android.livesdk.chatroom.model.ChatEmojiListRequest;
import com.bytedance.android.livesdk.chatroom.model.ChatEmojiListResponse;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.FragmentTypeCount;
import com.bytedance.android.livesdk.chatroom.model.HashtagListResponse;
import com.bytedance.android.livesdk.chatroom.model.KickUserResponse;
import com.bytedance.android.livesdk.chatroom.model.LikeRequest;
import com.bytedance.android.livesdk.chatroom.model.LikeResponse;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelBannerStatsRequest;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelBannerStatsResponse;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelBannerStatusExtra;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelStage;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelTaskAllExtra;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelTaskAllRequest;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelTaskAllResponse;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelTaskFinishExtra;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelTaskFinishRequest;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelTaskFinishResponse;
import com.bytedance.android.livesdk.chatroom.model.QueryCommercialContentToggleRequest;
import com.bytedance.android.livesdk.chatroom.model.QueryCommercialContentToggleResponse;
import com.bytedance.android.livesdk.chatroom.model.RoomDonationInfo;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.android.livesdk.chatroom.model.RoomReplayMoment;
import com.bytedance.android.livesdk.chatroom.model.RoomReplayReason;
import com.bytedance.android.livesdk.chatroom.model.StarCommentUpdateRequest;
import com.bytedance.android.livesdk.chatroom.model.StarCommentUpdateResponse;
import com.bytedance.android.livesdk.chatroom.model.UpdateStatusRequest;
import com.bytedance.android.livesdk.chatroom.model.UpdateStatusResponse;
import com.bytedance.android.livesdk.chatroom.model.VideoInfo;
import com.bytedance.android.livesdk.chatroom.model.WaveRequest;
import com.bytedance.android.livesdk.chatroom.model.WaveResponse;
import com.bytedance.android.livesdk.chatroom.model._AnchorPreFinishData_ConfirmBox_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._AnchorPreFinishData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._AnchorPreFinishRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._AnchorPreFinishResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._AnchorReplayDeleteRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._AnchorReplayDeleteResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._AnchorReplayInfoData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._AnchorReplayInfoRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._AnchorReplayInfoResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._ApplyResult_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._AudiencePingExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._ChatEmojiListData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._ChatEmojiListRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._ChatEmojiListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._EnterRoomExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._FragmentTypeCount_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._HashtagListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._KickUserResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._LikeRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._LikeResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._LikeResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._MGetTranslationRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._MGetTranslationRequest_Text_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._MGetTranslationResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._MGetTranslationResponse_Data_Translation_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._MGetTranslationResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelBannerStatsRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelBannerStatsResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelBannerStatsResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelBannerStatusExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelStage_PermissionLevelTask_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelStage_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelTaskAllExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelTaskAllRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelTaskAllResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelTaskAllResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelTaskFinishExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelTaskFinishRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelTaskFinishResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._PermissionLevelTaskFinishResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._QueryCommercialContentToggleRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._QueryCommercialContentToggleResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._QueryCommercialContentToggleResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._RoomDonationInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._RoomReplayMoment_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._RoomReplayReason_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._RoomReplay_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._StarCommentUpdateRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._StarCommentUpdateResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._UpdateStatusRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._UpdateStatusResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._UpdateStatusResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._VideoInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._WaveRequest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model._WaveResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleUserSettings;
import com.bytedance.android.livesdk.chatroom.model.interact.CancelResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTest;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestList;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestSetting;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.LastLayoutSetting;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkInitResult;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import com.bytedance.android.livesdk.chatroom.model.interact.ListParams;
import com.bytedance.android.livesdk.chatroom.model.interact.ListReachEnhancementUser;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiCancelResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.ReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.chatroom.model.interact.TopHostInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicSessionStatus;
import com.bytedance.android.livesdk.chatroom.model.interact._BattleUserSettings_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CancelResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CheckPermissionResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABTestList_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABTestSetting_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostABTest_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostListUser_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._LastLayoutSetting_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._LinkInitResult_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._LinkPlayerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._LinkReplyResult_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._ListParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._ListReachEnhancementUser_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._MultiCancelResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._ReplyResponse_ReplyExtra_LogPb_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._ReplyResponse_ReplyExtra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TagV2_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TagV2_SecondDegreeRelationContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TagV2_SecondDegreeRelationContent_UserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopHostInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopicExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopicSessionStatus_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.Extra;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.LinkmicAudienceEmoji;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.LinkmicSettingResult;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.LinkmicSettingmodel;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.PermitResult;
import com.bytedance.android.livesdk.chatroom.model.interact.audience._Extra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.audience._LinkmicAudienceEmoji_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.audience._LinkmicSettingResult_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.audience._LinkmicSettingmodel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.audience._PermitResult_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.ApplyBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.InviteBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.JoinDirectBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.PermitBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.ReplyBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._ApplyBizContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizApplyParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizApplyResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizApplyResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCancelApplyParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCreateChannelParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCreateChannelParams_UserSetting_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCreateChannelResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCreateChannelResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinChannelParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinChannelResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinChannelResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinDirectParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinDirectResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinDirectResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizLeaveParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizPermitParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizReplyParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizReplyResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizReplyResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BusinessContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._InviteBizContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._JoinDirectBizContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._MultiLiveContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._PermitBizContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._ReplyBizContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveLayoutInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.Setting;
import com.bytedance.android.livesdk.chatroom.model.multilive.SettingABTestInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.TurnOffInvitationParams;
import com.bytedance.android.livesdk.chatroom.model.multilive.TurnOffInvitationResponse;
import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateRoomLayoutSettings;
import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateSettingParams;
import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateSettingResponse;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveLayoutInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._SettingABTestInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._Setting_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._TurnOffInvitationParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._TurnOffInvitationResponse_Extra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._TurnOffInvitationResponse_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._TurnOffInvitationResponse_ResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._UpdateRoomLayoutSettings_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._UpdateSettingParams_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._UpdateSettingResponse_Extra_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._UpdateSettingResponse_ProtoDecoder;
import com.bytedance.android.livesdk.envelope.model.EnvelopeListResponse;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;
import com.bytedance.android.livesdk.envelope.model._EnvelopeListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.envelope.model._RedEnvelopInfo_ProtoDecoder;
import com.bytedance.android.livesdk.envelope.model._RedEnvelopeListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.feed.feed.ItemTabExtra;
import com.bytedance.android.livesdk.feed.feed._ItemTabExtra_ProtoDecoder;
import com.bytedance.android.livesdk.firstrecharge.FirstChargeData;
import com.bytedance.android.livesdk.firstrecharge.FirstChargeGuideEffectRule;
import com.bytedance.android.livesdk.firstrecharge.FirstRechargeResponse;
import com.bytedance.android.livesdk.firstrecharge._FirstChargeData_ProtoDecoder;
import com.bytedance.android.livesdk.firstrecharge._FirstChargeGuideEffectRule_ProtoDecoder;
import com.bytedance.android.livesdk.firstrecharge._FirstRechargeResponse_ProtoDecoder;
import com.bytedance.android.livesdk.game.model.AccessRecallMessage;
import com.bytedance.android.livesdk.game.model.AnchorPartnershipInfoResponse;
import com.bytedance.android.livesdk.game.model.AnchorTasksResponse;
import com.bytedance.android.livesdk.game.model.AudienceRoomTasksResponse;
import com.bytedance.android.livesdk.game.model.AuthParam;
import com.bytedance.android.livesdk.game.model.BenefitDetail;
import com.bytedance.android.livesdk.game.model.BenefitRecord;
import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.android.livesdk.game.model.BriefGame;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.BriefGiftInfo;
import com.bytedance.android.livesdk.game.model.CreateHighLightResult;
import com.bytedance.android.livesdk.game.model.CreatorInfo;
import com.bytedance.android.livesdk.game.model.EsportsMatchInfo;
import com.bytedance.android.livesdk.game.model.EsportsParticipant;
import com.bytedance.android.livesdk.game.model.EsportsParticipantMatchScore;
import com.bytedance.android.livesdk.game.model.EsportsPointRaceScore;
import com.bytedance.android.livesdk.game.model.EsportsTournamentInfo;
import com.bytedance.android.livesdk.game.model.FeedItemInfo;
import com.bytedance.android.livesdk.game.model.GameActivity;
import com.bytedance.android.livesdk.game.model.GameAttributionInfo;
import com.bytedance.android.livesdk.game.model.GameInfo;
import com.bytedance.android.livesdk.game.model.GameInvite;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.game.model.GameLiveMark;
import com.bytedance.android.livesdk.game.model.GameStationAttributionInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.game.model.GameStationOuterActivityInfo;
import com.bytedance.android.livesdk.game.model.GameTagData;
import com.bytedance.android.livesdk.game.model.GameTask;
import com.bytedance.android.livesdk.game.model.GiftItem;
import com.bytedance.android.livesdk.game.model.InvitationSwitch;
import com.bytedance.android.livesdk.game.model.ItemInfo;
import com.bytedance.android.livesdk.game.model.ItemStatisticsInfo;
import com.bytedance.android.livesdk.game.model.LiveFragmentShowInfo;
import com.bytedance.android.livesdk.game.model.MonthlyProfit;
import com.bytedance.android.livesdk.game.model.OuterActivityGroup;
import com.bytedance.android.livesdk.game.model.OuterActivityInfo;
import com.bytedance.android.livesdk.game.model.PartnershipBriefDrops;
import com.bytedance.android.livesdk.game.model.PartnershipDrops;
import com.bytedance.android.livesdk.game.model.PartnershipDropsAnchorReward;
import com.bytedance.android.livesdk.game.model.PartnershipDropsGift;
import com.bytedance.android.livesdk.game.model.PartnershipDropsRankItem;
import com.bytedance.android.livesdk.game.model.PartnershipDropsReward;
import com.bytedance.android.livesdk.game.model.PartnershipDropsRewardV1;
import com.bytedance.android.livesdk.game.model.PartnershipDropsTask;
import com.bytedance.android.livesdk.game.model.PartnershipDropsTaskConfig;
import com.bytedance.android.livesdk.game.model.PartnershipDropsV1;
import com.bytedance.android.livesdk.game.model.PartnershipGame;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.game.model.PartnershipGiftInfo;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.ProfitInfo;
import com.bytedance.android.livesdk.game.model.Sprite;
import com.bytedance.android.livesdk.game.model.SwitchExtraBase;
import com.bytedance.android.livesdk.game.model.SwitchExtraForOpen;
import com.bytedance.android.livesdk.game.model.TaskAttributionInfo;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.android.livesdk.game.model.UrlInfo;
import com.bytedance.android.livesdk.game.model._AccessRecallMessage_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._AnchorPartnershipInfoResponse_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._AnchorTasksResponse_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._AudienceRoomTasksResponse_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._AuthParam_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._BenefitDetail_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._BenefitRecord_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._BriefBenefitInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._BriefGameTask_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._BriefGame_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._BriefGiftInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._CreateHighLightResult_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._CreatorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._EsportsMatchInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._EsportsParticipantMatchScore_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._EsportsParticipant_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._EsportsPointRaceScore_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._EsportsTournamentInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._FeedItemInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameActivity_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameAttributionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameInvite_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameLiveFragment_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameLiveMark_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameStationAttributionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameStationGameInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameStationGameInfo_Video_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameStationOuterActivityInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameTagData_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameTask_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GiftItem_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._InvitationSwitch_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._ItemInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._ItemStatisticsInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._LiveFragmentShowInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._MonthlyProfit_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._OuterActivityGroup_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._OuterActivityInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipBriefDrops_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsAnchorReward_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsGift_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsRankItem_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsRewardV1_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsReward_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsTaskConfig_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsTask_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsV1_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsV1_ReasonParams_ExcellentCreatorParams_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsV1_ReasonParams_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDropsV1_ReasonParams_TopRewardsParams_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipDrops_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipGameEvent_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipGame_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipGame_Video_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipGiftInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PartnershipTask_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._ProfitInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._Sprite_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._SwitchExtraBase_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._SwitchExtraForOpen_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._TaskAttributionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._TaskProfitInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._UrlInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.assets.AssetsListResult;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.android.livesdk.gift.assets.VideoResource;
import com.bytedance.android.livesdk.gift.assets._AssetsListResult_ProtoDecoder;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.assets._FaceRecognitionMeta_ProtoDecoder;
import com.bytedance.android.livesdk.gift.assets._ResourceModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.assets._VideoResource_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.BEFViewRenderSize;
import com.bytedance.android.livesdk.gift.model.CalmDownInfo;
import com.bytedance.android.livesdk.gift.model.CollectionDescription;
import com.bytedance.android.livesdk.gift.model.CollectionEffect;
import com.bytedance.android.livesdk.gift.model.CollectionUser;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.gift.model.DoodleTemplate;
import com.bytedance.android.livesdk.gift.model.DriveBagItem;
import com.bytedance.android.livesdk.gift.model.DriveItem;
import com.bytedance.android.livesdk.gift.model.DynamicGiftListResponse;
import com.bytedance.android.livesdk.gift.model.ExchangeGiftResultData;
import com.bytedance.android.livesdk.gift.model.FlyingMicResources;
import com.bytedance.android.livesdk.gift.model.ForceInsertMetricsItem;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftInfo;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.gift.model.GetWishlistRequestParams;
import com.bytedance.android.livesdk.gift.model.GetWishlistResponse;
import com.bytedance.android.livesdk.gift.model.GiftAckInfo;
import com.bytedance.android.livesdk.gift.model.GiftCollectionDetailRequestParams;
import com.bytedance.android.livesdk.gift.model.GiftCollectionDetailResponse;
import com.bytedance.android.livesdk.gift.model.GiftCollectionHistoryRequestParams;
import com.bytedance.android.livesdk.gift.model.GiftCollectionHistoryResponse;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftComboInfo;
import com.bytedance.android.livesdk.gift.model.GiftGroupCount;
import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import com.bytedance.android.livesdk.gift.model.GiftHintRequest;
import com.bytedance.android.livesdk.gift.model.GiftHintResponse;
import com.bytedance.android.livesdk.gift.model.GiftIconInfo;
import com.bytedance.android.livesdk.gift.model.GiftLimitGetResponse;
import com.bytedance.android.livesdk.gift.model.GiftListAckRequestParams;
import com.bytedance.android.livesdk.gift.model.GiftListAckResponse;
import com.bytedance.android.livesdk.gift.model.GiftListResponse;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftNotice;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftPollInfo;
import com.bytedance.android.livesdk.gift.model.GiftPollOption;
import com.bytedance.android.livesdk.gift.model.GiftResultData;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.HotfixGiftDataForProp;
import com.bytedance.android.livesdk.gift.model.LiveLimitedTimeDiscountGiftInfo;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributor;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalIndicator;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoalGift;
import com.bytedance.android.livesdk.gift.model.LokiExtraContent;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.gift.model.PageSchemaListRequest;
import com.bytedance.android.livesdk.gift.model.PageSchemaListResponse;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.gift.model.StaticGiftListResponse;
import com.bytedance.android.livesdk.gift.model.ToUser;
import com.bytedance.android.livesdk.gift.model.ToUserInfo;
import com.bytedance.android.livesdk.gift.model.WishListResponse;
import com.bytedance.android.livesdk.gift.model.WishListUpdateMessage;
import com.bytedance.android.livesdk.gift.model._BEFViewRenderSize_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._CalmDownInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._CollectionDescription_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._CollectionEffect_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._CollectionUser_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._CpcPromptResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._DoodleTemplate_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._DriveBagItem_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._DriveItem_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._DynamicGiftListResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._DynamicGiftListResponse_Extra_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._DynamicGiftListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._ExchangeGiftResultData_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._FlyingMicResources_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._ForceInsertMetricsItem_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._FreqLimitGiftInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._FreqLimitGiftOption_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GetWishlistRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GetWishlistResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftAckInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftCollectionDetailRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftCollectionDetailResponse_CollectionProcess_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftCollectionDetailResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftCollectionDetailResponse_Gift_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftCollectionDetailResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftCollectionHistoryRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftCollectionHistoryResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftCollectionHistoryResponse_EffectList_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftCollectionHistoryResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftColorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftComboInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftGroupCount_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftHintInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftHintRequest_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftHintResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftHintResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftIconInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftLimitGetResponse_Data_GiftPromptStall_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftLimitGetResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftLimitGetResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftListAckRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftListAckResponse_Extra_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftListAckResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftListResult_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftNotice_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftPage_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftPollInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftPollOption_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftResultData_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftSendResponse_GiftExtra_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftSendResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftsInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._HotfixGiftDataForProp_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LiveLimitedTimeDiscountGiftInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoalContributor_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoalIndicator_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoalServerMessage_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoal_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LiveStreamSubGoalGift_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LiveStreamSubGoal_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LokiExtraContent_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LynxGiftExtra_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._MatchInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._PageSchemaListRequest_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._PageSchemaListResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._PageSchemaListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._Prop_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._RiskCtl_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._SendGiftResult_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._StaticGiftListResponse_Metadata_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._StaticGiftListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._ToUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._ToUser_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._WishListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._WishListResponse_WishContributor_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._WishListResponse_WishList_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._WishListResponse_Wish_GiftWishExtra_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._WishListResponse_Wish_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._WishListUpdateMessage_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.AnchorOnBoardPermit;
import com.bytedance.android.livesdk.goal.model.CommitSubGoalRequest;
import com.bytedance.android.livesdk.goal.model.CommitSubGoalResponse;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.android.livesdk.goal.model.GetSubGoalContributorsRequest;
import com.bytedance.android.livesdk.goal.model.GetSubGoalContributorsResponse;
import com.bytedance.android.livesdk.goal.model.GetSubGoalHistoryRequest;
import com.bytedance.android.livesdk.goal.model.GetSubGoalHistoryResponse;
import com.bytedance.android.livesdk.goal.model.GoalComparison;
import com.bytedance.android.livesdk.goal.model.GoalOwner;
import com.bytedance.android.livesdk.goal.model.GoalPinInfo;
import com.bytedance.android.livesdk.goal.model.GoalStats;
import com.bytedance.android.livesdk.goal.model.OwnerSettingRequestParams;
import com.bytedance.android.livesdk.goal.model.OwnerSettingResponse;
import com.bytedance.android.livesdk.goal.model.PinRequestParams;
import com.bytedance.android.livesdk.goal.model.PinResponse;
import com.bytedance.android.livesdk.goal.model.ReasonableGoalRec;
import com.bytedance.android.livesdk.goal.model.StreamGoalRecExtra;
import com.bytedance.android.livesdk.goal.model.SubGoalRecommendInfo;
import com.bytedance.android.livesdk.goal.model.SubscriptionGoalRecExtra;
import com.bytedance.android.livesdk.goal.model.UnPinRequestParams;
import com.bytedance.android.livesdk.goal.model.UnPinResponse;
import com.bytedance.android.livesdk.goal.model._AnchorOnBoardPermit_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._CommitSubGoalRequest_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._CommitSubGoalResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._CommitSubGoalResponse_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GetResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GetResponse_Pin_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GetResponse_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GetSubGoalContributorsRequest_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GetSubGoalContributorsResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GetSubGoalContributorsResponse_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GetSubGoalHistoryRequest_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GetSubGoalHistoryResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GetSubGoalHistoryResponse_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GoalComparison_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GoalOwner_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GoalPinInfo_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GoalStats_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._OwnerSettingRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._OwnerSettingResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._OwnerSettingResponse_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._PinRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._PinResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._PinResponse_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._ReasonableGoalRec_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._StreamGoalRecExtra_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._SubGoalRecommendInfo_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._SubscriptionGoalRecExtra_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._UnPinRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._UnPinResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._UnPinResponse_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCoinDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonSelected;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagUserInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagWinnerInfo;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagBaseInfo_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagCoinDetail_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagCommonDetail_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagCommonSelected_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagWinnerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model.GiftGuideTriggerReqParams;
import com.bytedance.android.livesdk.guide.model.GiftGuideTriggerResponse;
import com.bytedance.android.livesdk.guide.model.GiftKeywords;
import com.bytedance.android.livesdk.guide.model.GuideInfoRequest;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsReportRequest;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsReportResponse;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsRequest;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;
import com.bytedance.android.livesdk.guide.model.GuideReportRequest;
import com.bytedance.android.livesdk.guide.model.GuideReportResponse;
import com.bytedance.android.livesdk.guide.model.KeywordsLibrary;
import com.bytedance.android.livesdk.guide.model._GiftGuideTriggerReqParams_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GiftGuideTriggerResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GiftGuideTriggerResponse_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GiftKeywords_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideInfoRequest_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideInfoResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideInfoResponse_GuideEntry_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideInfoResponse_GuidePageResource_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideInfoResponse_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideInfoResponse_UserStats_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideKeywordsReportRequest_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideKeywordsReportResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideKeywordsReportResponse_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideKeywordsRequest_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideKeywordsResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideKeywordsResponse_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideKeywordsResponse_UserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideReportRequest_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideReportResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._GuideReportResponse_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model._KeywordsLibrary_ProtoDecoder;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import com.bytedance.android.livesdk.live.model._FilterInfoData_ProtoDecoder;
import com.bytedance.android.livesdk.live.model._RoomStatsModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdk.message.proto.CppTaskInfo;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.message.proto.PerceptionFeedbackOption;
import com.bytedance.android.livesdk.message.proto.RankUser;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.message.proto.ToolBarManagement;
import com.bytedance.android.livesdk.message.proto.WebcastLSAccessStatus;
import com.bytedance.android.livesdk.message.proto._CppAgeVerificationInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._CppTaskInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ShopEntranceInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ShowcaseEntranceInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._LiveProInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._PerceptionFeedbackOption_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._RankUser_Border_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._RankUser_FollowInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._StarCommentConfig_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._ToolBarManagement_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._WebcastLSAccessStatus_ProtoDecoder;
import com.bytedance.android.livesdk.model.AccompanimentStruct;
import com.bytedance.android.livesdk.model.ActivityRewardInfo;
import com.bytedance.android.livesdk.model.AdEventTracking;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.android.livesdk.model.AnchorLevel;
import com.bytedance.android.livesdk.model.AttrRequestParams;
import com.bytedance.android.livesdk.model.AttrResponseParams;
import com.bytedance.android.livesdk.model.AttrUpdateRequestParams;
import com.bytedance.android.livesdk.model.AttrUpdateResponseParams;
import com.bytedance.android.livesdk.model.AudioStruct;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.Author;
import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.DonationSticker;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.GameTagCategory;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftBoxInfo;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.GiftOperation;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.GradeIcon;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdk.model.LikeEffect;
import com.bytedance.android.livesdk.model.LikeInfo;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.LyricStruct;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.Portal;
import com.bytedance.android.livesdk.model.PromoteOtherMessage;
import com.bytedance.android.livesdk.model.RandomGiftBubble;
import com.bytedance.android.livesdk.model.RandomGiftPanelBanner;
import com.bytedance.android.livesdk.model.Reservation;
import com.bytedance.android.livesdk.model.RoomAuthMessage;
import com.bytedance.android.livesdk.model.RoomAuthMessageGoldenEnvelope;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import com.bytedance.android.livesdk.model.StickerCheckResponse;
import com.bytedance.android.livesdk.model.StickersSetResponse;
import com.bytedance.android.livesdk.model.TestDemo;
import com.bytedance.android.livesdk.model.TopFanTicket;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.UserAttrResponse;
import com.bytedance.android.livesdk.model.UserHonor;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.android.livesdk.model.VoteUser;
import com.bytedance.android.livesdk.model.WalletPackage;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model._AccompanimentStruct_ProtoDecoder;
import com.bytedance.android.livesdk.model._ActivityRewardInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._AdEventTracking_ProtoDecoder;
import com.bytedance.android.livesdk.model._AnchorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._AnchorLevel_ProtoDecoder;
import com.bytedance.android.livesdk.model._AttrRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.model._AttrResponseParams_Extra_ProtoDecoder;
import com.bytedance.android.livesdk.model._AttrResponseParams_ProtoDecoder;
import com.bytedance.android.livesdk.model._AttrUpdateRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.model._AttrUpdateResponseParams_ProtoDecoder;
import com.bytedance.android.livesdk.model._AudioStruct_ProtoDecoder;
import com.bytedance.android.livesdk.model._AuthenticationInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Author_ProtoDecoder;
import com.bytedance.android.livesdk.model._BaLeadsGenInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._BannerInRoom_BannerContentDynamic_ProtoDecoder;
import com.bytedance.android.livesdk.model._BannerInRoom_ProtoDecoder;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Creator_ProtoDecoder;
import com.bytedance.android.livesdk.model._DonationSticker_ProtoDecoder;
import com.bytedance.android.livesdk.model._EnvelopePortalMessage_PortalInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._EnvelopePortalMessage_PortalTransTarget_ProtoDecoder;
import com.bytedance.android.livesdk.model._EnvelopePortalMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model._FansClubData_ProtoDecoder;
import com.bytedance.android.livesdk.model._FansClubData_UserBadge_ProtoDecoder;
import com.bytedance.android.livesdk.model._FansClubMember_ProtoDecoder;
import com.bytedance.android.livesdk.model._FeedBannerContainer_ProtoDecoder;
import com.bytedance.android.livesdk.model._FeedBanner_ProtoDecoder;
import com.bytedance.android.livesdk.model._FeedItem_ProtoDecoder;
import com.bytedance.android.livesdk.model._FlareInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._GameTagCategory_ProtoDecoder;
import com.bytedance.android.livesdk.model._GameTag_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftBoxInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftInfoInBox_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftLockInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftOperation_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftRandomEffectInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftTrayInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftsBoxInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._GradeIcon_ProtoDecoder;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.bytedance.android.livesdk.model._InteractionQuestionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;
import com.bytedance.android.livesdk.model._LikeEffect_ProtoDecoder;
import com.bytedance.android.livesdk.model._LikeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._LyricStruct_ProtoDecoder;
import com.bytedance.android.livesdk.model._MaskLayer_ProtoDecoder;
import com.bytedance.android.livesdk.model._OfficialChannelInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._OrganizationModel_ProtoDecoder;
import com.bytedance.android.livesdk.model._PollData_ProtoDecoder;
import com.bytedance.android.livesdk.model._PollInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Portal_ProtoDecoder;
import com.bytedance.android.livesdk.model._PromoteOtherMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model._RandomGiftBubble_ProtoDecoder;
import com.bytedance.android.livesdk.model._RandomGiftPanelBanner_ProtoDecoder;
import com.bytedance.android.livesdk.model._Reservation_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomAuthMessageGoldenEnvelope_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomAuthMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomAuthOffReasons_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomAuthStatus_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomDecoration_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomStats_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomSticker_ProtoDecoder;
import com.bytedance.android.livesdk.model._ShortTouchItem_ProtoDecoder;
import com.bytedance.android.livesdk.model._ShortTouchPreviewSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model._StickerCheckResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model._StickersSetResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model._TestDemo_ProtoDecoder;
import com.bytedance.android.livesdk.model._TopFanTicket_ProtoDecoder;
import com.bytedance.android.livesdk.model._TopFrameSummary_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserAttrResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserAttr_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserHonor_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserVoteInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._VoteResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.model._VoteUser_ProtoDecoder;
import com.bytedance.android.livesdk.model._WalletPackage_ProtoDecoder;
import com.bytedance.android.livesdk.model._WarningTag_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting.CoHost;
import com.bytedance.android.livesdk.model.linksetting.LinkmicUser;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUpdateUserSettingContent;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.linksetting.RoomAudienceMultiGuestPermissionInfo;
import com.bytedance.android.livesdk.model.linksetting._CoHost_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting._LinkmicUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting._MultiLiveUpdateUserSettingContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting._MultiLiveUserApplyPermission_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting._MultiLiveUserApplySettings_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting._MultiLiveUserSettings_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting._RoomAudienceMultiGuestPermissionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.AccessControlCaptcha;
import com.bytedance.android.livesdk.model.message.AccessControlMessage;
import com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage;
import com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage;
import com.bytedance.android.livesdk.model.message.AddToCartButton;
import com.bytedance.android.livesdk.model.message.AlertAudio;
import com.bytedance.android.livesdk.model.message.AnchorToolModification;
import com.bytedance.android.livesdk.model.message.AnchorToolModificationMessage;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.AudienceCancelContent;
import com.bytedance.android.livesdk.model.message.AudienceReplyContent;
import com.bytedance.android.livesdk.model.message.AudienceReserveContent;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserStateMessage;
import com.bytedance.android.livesdk.model.message.AuthorizationNotifyMessage;
import com.bytedance.android.livesdk.model.message.AwardCardNotice;
import com.bytedance.android.livesdk.model.message.BALeadGenMessage;
import com.bytedance.android.livesdk.model.message.BannerCollapseInfo;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.BannerUpdateMessage;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeFansLevelParam;
import com.bytedance.android.livesdk.model.message.BarrageTypeSubscribeGiftParam;
import com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam;
import com.bytedance.android.livesdk.model.message.BattleInviteeGiftPermission;
import com.bytedance.android.livesdk.model.message.BattleNoticeCommonGuide;
import com.bytedance.android.livesdk.model.message.BattleSettings;
import com.bytedance.android.livesdk.model.message.BoostCard;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCommentFlaggedPrompt;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsNewAnchorEffect;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsRandomGift;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.CaptionContent;
import com.bytedance.android.livesdk.model.message.CaptionMessage;
import com.bytedance.android.livesdk.model.message.CardObtainGuide;
import com.bytedance.android.livesdk.model.message.CeremonyEffect;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.CohostListChangeContent;
import com.bytedance.android.livesdk.model.message.CohostReserveMessage;
import com.bytedance.android.livesdk.model.message.CohostTopicMessage;
import com.bytedance.android.livesdk.model.message.CommentQualityScore;
import com.bytedance.android.livesdk.model.message.CommentTrayMessage;
import com.bytedance.android.livesdk.model.message.CommentsMessage;
import com.bytedance.android.livesdk.model.message.CommonPopupMessage;
import com.bytedance.android.livesdk.model.message.CommonToastMessage;
import com.bytedance.android.livesdk.model.message.Contributor;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.DecorationModifyMessage;
import com.bytedance.android.livesdk.model.message.DiggMessage;
import com.bytedance.android.livesdk.model.message.DonationInfoMessage;
import com.bytedance.android.livesdk.model.message.DonationMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessEndMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessExitMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessStartMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessUpdateMessage;
import com.bytedance.android.livesdk.model.message.EcBarrageMessage;
import com.bytedance.android.livesdk.model.message.EffectPreloadingMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.ExtraInfo;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.model.message.FansEventMessage;
import com.bytedance.android.livesdk.model.message.FlexImageModel;
import com.bytedance.android.livesdk.model.message.FollowCardMessage;
import com.bytedance.android.livesdk.model.message.GameOCRPingMessage;
import com.bytedance.android.livesdk.model.message.GameRankNotifyMessage;
import com.bytedance.android.livesdk.model.message.GiftBoostCardMessage;
import com.bytedance.android.livesdk.model.message.GiftCollection;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.android.livesdk.model.message.GiftGlobalMessage;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GiftIMPriority;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdk.model.message.GiftNoticeMessage;
import com.bytedance.android.livesdk.model.message.GiftPromptMessage;
import com.bytedance.android.livesdk.model.message.GiftUnlockMessage;
import com.bytedance.android.livesdk.model.message.GiftUpdateMessage;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.android.livesdk.model.message.GreetingMessage;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdk.model.message.GuidePageResource;
import com.bytedance.android.livesdk.model.message.HashtagMessage;
import com.bytedance.android.livesdk.model.message.HeatUpdateContent;
import com.bytedance.android.livesdk.model.message.HighlightFragmentReadyMessage;
import com.bytedance.android.livesdk.model.message.HourlyRankRewardInfo;
import com.bytedance.android.livesdk.model.message.HourlyRankRewardMessage;
import com.bytedance.android.livesdk.model.message.ImDeleteMessage;
import com.bytedance.android.livesdk.model.message.InRoomBannerMessage;
import com.bytedance.android.livesdk.model.message.InRoomBannerRefreshMessage;
import com.bytedance.android.livesdk.model.message.InviteTopHostInfo;
import com.bytedance.android.livesdk.model.message.KaraokeQueueMessage;
import com.bytedance.android.livesdk.model.message.KaraokeReqMessage;
import com.bytedance.android.livesdk.model.message.KaraokeSwitchMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAdMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleTaskMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.android.livesdk.model.message.LinkMicMessage;
import com.bytedance.android.livesdk.model.message.LinkMicSignalMessage;
import com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage;
import com.bytedance.android.livesdk.model.message.LinkerCloseContent;
import com.bytedance.android.livesdk.model.message.LinkerCreateContent;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdk.model.message.LinkerGuestCancelEnlargeContent;
import com.bytedance.android.livesdk.model.message.LinkerMediaChangeContent;
import com.bytedance.android.livesdk.model.message.LinkerSysKickOutContent;
import com.bytedance.android.livesdk.model.message.LinkerUpdateUserContent;
import com.bytedance.android.livesdk.model.message.LinkerWaitingListChangeContent;
import com.bytedance.android.livesdk.model.message.LinkmicUserInfo;
import com.bytedance.android.livesdk.model.message.LinkmicUserToastContent;
import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import com.bytedance.android.livesdk.model.message.LivePermissionInfo;
import com.bytedance.android.livesdk.model.message.LiveTrayMessage;
import com.bytedance.android.livesdk.model.message.MarqueeAnnouncementMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.ModeratorSpeakerMessage;
import com.bytedance.android.livesdk.model.message.MsgDetectMessage;
import com.bytedance.android.livesdk.model.message.NewAnchorEffectParams;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideConfig;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideMsgInfo;
import com.bytedance.android.livesdk.model.message.NotificationConfirmResponse;
import com.bytedance.android.livesdk.model.message.NotifyHighlightContent;
import com.bytedance.android.livesdk.model.message.NotifyHighlightInfo;
import com.bytedance.android.livesdk.model.message.OfficialChannelAnchorMessage;
import com.bytedance.android.livesdk.model.message.OfficialChannelModifyMessage;
import com.bytedance.android.livesdk.model.message.OfficialChannelUserMessage;
import com.bytedance.android.livesdk.model.message.OperateToastMessage;
import com.bytedance.android.livesdk.model.message.OptPairInfo;
import com.bytedance.android.livesdk.model.message.PaidContentLiveShoppingMessage;
import com.bytedance.android.livesdk.model.message.PartnershipCardChangeMessage;
import com.bytedance.android.livesdk.model.message.PartnershipDownloadCountMessage;
import com.bytedance.android.livesdk.model.message.PartnershipDropsUpdateMessage;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdk.model.message.PartnershipPunishMessage;
import com.bytedance.android.livesdk.model.message.PartnershipTaskShowMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdk.model.message.PollUpdateVotesContent;
import com.bytedance.android.livesdk.model.message.PollingRequest;
import com.bytedance.android.livesdk.model.message.PollingResponse;
import com.bytedance.android.livesdk.model.message.PopSeries;
import com.bytedance.android.livesdk.model.message.PopularCardMessage;
import com.bytedance.android.livesdk.model.message.PortalMessage;
import com.bytedance.android.livesdk.model.message.ProductAtmosphereTag;
import com.bytedance.android.livesdk.model.message.ProductSnapShot;
import com.bytedance.android.livesdk.model.message.ProjectDModifyH5Message;
import com.bytedance.android.livesdk.model.message.PublicAreaCommon;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message.QuestionDeleteMessage;
import com.bytedance.android.livesdk.model.message.QuestionMessage;
import com.bytedance.android.livesdk.model.message.QuestionSelectMessage;
import com.bytedance.android.livesdk.model.message.QuestionSlideDownMessage;
import com.bytedance.android.livesdk.model.message.QuestionSwitchMessage;
import com.bytedance.android.livesdk.model.message.QuickChatContent;
import com.bytedance.android.livesdk.model.message.QuickChatListMessage;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.model.message.RankTextMessage;
import com.bytedance.android.livesdk.model.message.RankToastMessage;
import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.RankUpdateMessage;
import com.bytedance.android.livesdk.model.message.RealtimeLiveCenterMethod;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.model.message.ReplyContent;
import com.bytedance.android.livesdk.model.message.ReserveContent;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdk.model.message.RichChatMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessageExtra;
import com.bytedance.android.livesdk.model.message.RoomPushMessage;
import com.bytedance.android.livesdk.model.message.RoomStickerMessage;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdk.model.message.ScreenMessage;
import com.bytedance.android.livesdk.model.message.ShareGuideMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.SpecifiedDisplayText;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.android.livesdk.model.message.StarCommentNotificationMessage;
import com.bytedance.android.livesdk.model.message.StarCommentPushMessage;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.model.message.SubPinEventMessage;
import com.bytedance.android.livesdk.model.message.SubTimerStickerMessage;
import com.bytedance.android.livesdk.model.message.SubWaveMessage;
import com.bytedance.android.livesdk.model.message.SubscriptionGuideMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.TextEffect;
import com.bytedance.android.livesdk.model.message.TimeTag;
import com.bytedance.android.livesdk.model.message.TopicSetContent;
import com.bytedance.android.livesdk.model.message.UnauthorizedMemberMessage;
import com.bytedance.android.livesdk.model.message.UpgradeMessage;
import com.bytedance.android.livesdk.model.message.UseCriticalStrikeCard;
import com.bytedance.android.livesdk.model.message.UseSmokeCard;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.UserStatsMessage;
import com.bytedance.android.livesdk.model.message.VideoLiveCouponRcmdMessage;
import com.bytedance.android.livesdk.model.message.VideoLiveGoodsRcmdMessage;
import com.bytedance.android.livesdk.model.message.WeeklyRankRewardMessage;
import com.bytedance.android.livesdk.model.message.XGGoodsOrderMessage;
import com.bytedance.android.livesdk.model.message._AccessControlCaptcha_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AccessControlMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ActivityQuizCardMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ActivityQuizUserIdentityMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AddToCartButton_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AlertAudio_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AnchorToolModificationMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AnchorToolModification_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AssetMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AtmosphereTagInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AudienceCancelContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AudienceReplyContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AudienceReserveContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AudienceReserveUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AudienceReserveUserStateMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AuthorizationNotifyMessage_ContentBlock_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AuthorizationNotifyMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AuthorizationNotifyMessage_RelationBlock_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._AwardCardNotice_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BALeadGenMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BannerCollapseInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BannerInRoomCollection_BannerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BannerInRoomCollection_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BannerUpdateMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BarrageMessage_BarrageEvent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BarrageMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BarrageTypeFansLevelParam_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BarrageTypeSubscribeGiftParam_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BarrageTypeUserGradeParam_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BattleInviteeGiftPermission_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BattleNoticeCommonGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BattleSettings_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BoostCard_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._BottomMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CapsuleBizParamsCohost_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CapsuleBizParamsCommentFlaggedPrompt_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CapsuleBizParamsNewAnchorEffect_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CapsuleBizParamsRandomGift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CapsuleBizParams_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CapsuleMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CaptionContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CaptionMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CardObtainGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CeremonyEffect_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ChatMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CohostListChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CohostReserveMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CohostTopicMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CommentQualityScore_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CommentTrayMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CommentsMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CommonPopupMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._CommonToastMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._Contributor_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ControlMessage_Extra_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ControlMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._DecorationModifyMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._DiggMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._DonationInfoMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._DonationMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._DrawGuessEndMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._DrawGuessExitMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._DrawGuessStartMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._DrawGuessUpdateMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._EcBarrageMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._EffectPreloadingMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._EmoteChatMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._FanTicketRoomNoticeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._FansEventData_NewFansData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._FansEventData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._FansEventData_TaskCompleteData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._FansEventMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._FlexImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._FollowCardMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GameOCRPingMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GameRankNotifyMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftBoostCardMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftCollectionUpdateMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftCollection_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftGlobalMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftGuideMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftIMPriority_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftMonitorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftNoticeMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftPromptMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftUnlockMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GiftUpdateMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GoodyBagMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GreetingMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GuideMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GuidePageResource_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._HashtagMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._HeatUpdateContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._HighlightFragmentReadyMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._HourlyRankRewardInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._HourlyRankRewardMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ImDeleteMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._Img_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._InRoomBannerMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._InRoomBannerRefreshMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._InviteTopHostInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._KaraokeQueueMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._KaraokeReqMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._KaraokeSwitchMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LikeMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicAdMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicAnchorGuideMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicAudienceNoticeMessage_LinkMicAudienceInviteGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicAudienceNoticeMessage_LinkMicAudienceTurnOnGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicAudienceNoticeMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicBattleArmiesMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicBattleItemCard_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicBattleMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicBattleNoticeMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicBattlePunishFinishMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicBattleTaskMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicBattleVictoryLapMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicFanTicketMethod_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicSignalMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkScreenChangeMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkerCloseContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkerCreateContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkerEnlargeStatusSynContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkerGuestCancelEnlargeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkerMediaChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkerSysKickOutContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkerUpdateUserContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkerWaitingListChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkmicUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkmicUserToastContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LiveEventMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LiveIntroMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LivePermissionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LiveTrayMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._MarqueeAnnouncementMessage_MessageEntity_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._MarqueeAnnouncementMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._MemberMessage_EffectConfigBean_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._MemberMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ModeratorSpeakerMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._MsgDetectMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._MsgDetectMessage_TimeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._MsgDetectMessage_TriggerCondition_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._NewAnchorEffectParams_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._NewAnchorGuideConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._NewAnchorGuideMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._NewAnchorGuideMsgInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._NotificationConfirmResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._NotifyHighlightContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._NotifyHighlightInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._OfficialChannelAnchorMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._OfficialChannelModifyMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._OfficialChannelUserMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._OperateToastMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._OptPairInfo_OptPairUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PaidContentLiveShoppingMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PartnershipCardChangeMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PartnershipDownloadCountMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PartnershipDropsUpdateMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PartnershipGameOfflineMessage_OfflineGameInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PartnershipGameOfflineMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PartnershipPunishMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PartnershipTaskShowMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PerceptionDialogInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PictionaryInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PinMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PollEndContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PollMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PollOptionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PollStartContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PollUpdateVotesContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PollingRequest_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PollingResponse_Extra_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PollingResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PopSeries_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PopularCardMessage_PopularCardInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PopularCardMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PortalMessage_PortalBuy_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PortalMessage_PortalFinish_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PortalMessage_PortalInvite_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PortalMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ProductAtmosphereTag_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ProductSnapShot_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ProjectDModifyH5Message_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PublicAreaCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._QuestionDeleteMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._QuestionMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._QuestionSelectMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._QuestionSlideDownMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._QuestionSwitchMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._Question_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._QuickChatContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._QuickChatListMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RankAnimationInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RankTextMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RankToastMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RankToastMessage_RankToast_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RankUpdateMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RankUpdate_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RealtimeLiveCenterMethod_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RemindMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ReplyContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ReserveContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ReserveInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ReserveInfo_ReserveUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RichChatMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomNotifyMessageExtra_Background_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomNotifyMessageExtra_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomNotifyMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomPushMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomStickerMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomUserSeqMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomVerifyMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ScreenMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._ShareGuideMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._SocialMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._SpecifiedDisplayText_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._StarCommentMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._StarCommentNotificationMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._StarCommentPushMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._SubNotifyMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._SubPinEventMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._SubTimerStickerMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._SubWaveMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._SubscriptionGuideMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._TeamUsersInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._TextEffect_Detail_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._TextEffect_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._TimeTag_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._TopicSetContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._UnauthorizedMemberMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._UpgradeMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._UseCriticalStrikeCard_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._UseSmokeCard_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._UserFanTicket_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._UserStatsMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._VideoLiveCouponRcmdMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._VideoLiveGoodsRcmdMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._WeeklyRankRewardMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._XGGoodsOrderMessage_GoodsOrder_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._XGGoodsOrderMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeBubbleGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeRuleGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeText;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeToast;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleRewardSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskStart;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskUpdate;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareOptOutNotice;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTips;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.android.livesdk.model.message.battle.ExemptStrategy;
import com.bytedance.android.livesdk.model.message.battle.SupportedActionsWrapper;
import com.bytedance.android.livesdk.model.message.battle.TruthOrDareTip;
import com.bytedance.android.livesdk.model.message.battle.UserArmiesWrapper;
import com.bytedance.android.livesdk.model.message.battle._BattleDisplayConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeAnchorGiftGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeAnchorGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeBubbleGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeRuleGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeText_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeToast_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleRewardSettle_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTaskSettle_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTaskStart_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTaskUpdate_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareOptOutNotice_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTips_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTriggerGuideV2_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTriggerGuideV2_TruthOrDareTip_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleTruthOrDareTriggerGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmy_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserInfoWrapper_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._ExemptStrategy_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._SupportedActionsWrapper_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._TruthOrDareTip_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._UserArmiesWrapper_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.PatternRef;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceGift;
import com.bytedance.android.livesdk.model.message.common.TextPieceHeart;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdk.model.message.common.TextPiecePatternRef;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.model.message.common._PatternRef_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._TextFormat_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._TextPieceGift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._TextPieceHeart_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._TextPieceImage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._TextPiecePatternRef_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._TextPieceUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._TextPiece_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext.BusinessLinksLiveMessage;
import com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage;
import com.bytedance.android.livesdk.model.message.ext.ECTaskRegisterMessage;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.EcDrawEntity;
import com.bytedance.android.livesdk.model.message.ext.EcDrawMessage;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRefreshCouponListEntity;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRefreshCouponListMessage;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRegisterMessageEntity;
import com.bytedance.android.livesdk.model.message.ext.HotTag;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.bytedance.android.livesdk.model.message.ext.ShortItemRefreshEntity;
import com.bytedance.android.livesdk.model.message.ext.TraceInfo;
import com.bytedance.android.livesdk.model.message.ext._BusinessLinksLiveMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._ECShortItemRefreshMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._ECTaskRegisterMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._ECommerceMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._EcDrawEntity_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._EcDrawMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._EcTaskRefreshCouponListEntity_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._EcTaskRefreshCouponListMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._EcTaskRegisterMessageEntity_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._HotTag_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._PopProduct_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._ShortItemRefreshEntity_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ext._TraceInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyContent;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.ByteRTCExtInfo;
import com.bytedance.android.livesdk.model.message.linkcore.CancelApplyContent;
import com.bytedance.android.livesdk.model.message.linkcore.CancelApplyResponse;
import com.bytedance.android.livesdk.model.message.linkcore.CancelInviteContent;
import com.bytedance.android.livesdk.model.message.linkcore.CancelInviteResponse;
import com.bytedance.android.livesdk.model.message.linkcore.ChangeLayoutResp;
import com.bytedance.android.livesdk.model.message.linkcore.ChangePositionResp;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelContent;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.DestroyRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.FinishChannelContent;
import com.bytedance.android.livesdk.model.message.linkcore.InviteContent;
import com.bytedance.android.livesdk.model.message.linkcore.JoinChannelResp;
import com.bytedance.android.livesdk.model.message.linkcore.JoinDirectContent;
import com.bytedance.android.livesdk.model.message.linkcore.JoinDirectResp;
import com.bytedance.android.livesdk.model.message.linkcore.KickOutContent;
import com.bytedance.android.livesdk.model.message.linkcore.KickOutResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LeaveContent;
import com.bytedance.android.livesdk.model.message.linkcore.LeaveRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkListChangeContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.LinkPosition;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.PermitApplyContent;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linkcore.RTCBitRateMap;
import com.bytedance.android.livesdk.model.message.linkcore.RTCDualStreamParam;
import com.bytedance.android.livesdk.model.message.linkcore.RTCEngineConfig;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore.RTCInfoExtra;
import com.bytedance.android.livesdk.model.message.linkcore.RTCLiveVideoParam;
import com.bytedance.android.livesdk.model.message.linkcore.RTCMixBase;
import com.bytedance.android.livesdk.model.message.linkcore.RTCMixParam;
import com.bytedance.android.livesdk.model.message.linkcore.RTCOther;
import com.bytedance.android.livesdk.model.message.linkcore.RTCVideoParam;
import com.bytedance.android.livesdk.model.message.linkcore.ReplyInviteContent;
import com.bytedance.android.livesdk.model.message.linkcore.UserPosition;
import com.bytedance.android.livesdk.model.message.linkcore._AllListUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._ApplyContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._ApplyRequestResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._ByteRTCExtInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._CancelApplyContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._CancelApplyResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._CancelInviteContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._CancelInviteResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._ChangeLayoutResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._ChangePositionResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._CreateChannelContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._CreateChannelResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._DSLConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._DestroyRequestResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._FinishChannelContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._InviteContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._JoinChannelResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._JoinDirectContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._JoinDirectResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._KickOutContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._KickOutResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LeaveContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LeaveRequestResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkLayerListUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkLayerMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkListChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkPosition_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._MicPositionData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._PermitApplyContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCBitRateMap_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCDualStreamParam_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCEngineConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCInfoExtra_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCLiveVideoParam_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCMixBase_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCMixParam_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCOther_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCVideoParam_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._ReplyInviteContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._UserPosition_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.accpet_notice_message.LinkerAcceptNoticeContent;
import com.bytedance.android.livesdk.model.message.linker.accpet_notice_message._LinkerAcceptNoticeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.cancel_message.LinkerCancelContent;
import com.bytedance.android.livesdk.model.message.linker.cancel_message._LinkerCancelContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.enter_message.LinkerEnterContent;
import com.bytedance.android.livesdk.model.message.linker.enter_message._LinkerEnterContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import com.bytedance.android.livesdk.model.message.linker.invite_message._InviterRivalExtra_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.invite_message._LinkerInviteContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.invite_message._LinkerInviteMessageExtra_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.kick_out_message.LinkerKickOutContent;
import com.bytedance.android.livesdk.model.message.linker.kick_out_message._LinkerKickOutContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.leave_message.LinkerLeaveContent;
import com.bytedance.android.livesdk.model.message.linker.leave_message._LinkerLeaveContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.LinkedListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.ListUser;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message._LinkedListChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message._ListUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkerListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage._LinkListUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage._LinkerListChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.mic_update.LinkerMicIdxUpdateContent;
import com.bytedance.android.livesdk.model.message.linker.mic_update.LinkerMicIdxUpdateInfo;
import com.bytedance.android.livesdk.model.message.linker.mic_update._LinkerMicIdxUpdateContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.mic_update._LinkerMicIdxUpdateInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.mute_message.LinkerMuteContent;
import com.bytedance.android.livesdk.model.message.linker.mute_message._LinkerMuteContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message._LinkerRandomMatchContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerSetting;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkmicInfo;
import com.bytedance.android.livesdk.model.message.linker.reply_message._LinkerReplyContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.reply_message._LinkerSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.reply_message._LinkmicInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.android.livesdk.model.message.redenvelope._MessageRedEnvelopInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.redenvelope._RedEnvelopMessage_ProtoDecoder;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.android.livesdk.rank.api.model.RankItem;
import com.bytedance.android.livesdk.rank.api.model._RankItem_ProtoDecoder;
import com.bytedance.android.livesdk.rank.api.model._Rank_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model.RankListV2RequestParams;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.list.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdk.rank.list.model._RankListV2RequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_BriefDescription_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_BulletinLoop_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_Bulletin_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_CutOffLine_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_DailyAndRookieExtra_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_Data_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_Gap_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_HistoryEntrance_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_LeagueTabInfo_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_LynxRankData_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_PathToOtherList_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_RankInfo_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_RankLeagueBase_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_RankLeagueExtra_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_RankLeagueHeader_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_RankLeagueTab_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_RankView_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_WeeklyRankExtra_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_WeeklyRookieRankExtra_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._WeeklyRankRegionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model.RankEntrance;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3RequestParams;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.rank.model.RollCfg;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.android.livesdk.rank.model._RankEntranceV3RequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._RankEntranceV3Response_EntranceGroup_Data_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._RankEntranceV3Response_EntranceGroup_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._RankEntranceV3Response_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._RankEntrance_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._RankTabInfo_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._RollCfg_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._SubRankTabInfo_ProtoDecoder;
import com.bytedance.android.livesdk.replay.proto.SpriteImageItem;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.android.livesdk.replay.proto._SpriteImageItem_ProtoDecoder;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import com.bytedance.android.livesdk.service.model.GiftListExtra;
import com.bytedance.android.livesdk.service.model._GiftListExtra_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.BubbleInfo;
import com.bytedance.android.livesdk.subscribe.model.CustomBenefitEntrance;
import com.bytedance.android.livesdk.subscribe.model.GetSubEmoteDetailResponse;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.GetSubTimerDetailRequest;
import com.bytedance.android.livesdk.subscribe.model.GetSubTimerDetailResponse;
import com.bytedance.android.livesdk.subscribe.model.PayPalBindInfo;
import com.bytedance.android.livesdk.subscribe.model.SubDataItemView;
import com.bytedance.android.livesdk.subscribe.model.SubDataOverview;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import com.bytedance.android.livesdk.subscribe.model.SubOnlyLiveInfo;
import com.bytedance.android.livesdk.subscribe.model.SubSettingStatus;
import com.bytedance.android.livesdk.subscribe.model.SubscribeBubbleList;
import com.bytedance.android.livesdk.subscribe.model.SubscriberInfo;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;
import com.bytedance.android.livesdk.subscribe.model.UpdateTimerRequest;
import com.bytedance.android.livesdk.subscribe.model.UpdateTimerResponse;
import com.bytedance.android.livesdk.subscribe.model.WebappSubInfo;
import com.bytedance.android.livesdk.subscribe.model._BubbleInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._CustomBenefitEntrance_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._GetSubEmoteDetailResponse_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._GetSubInfoResponse_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._GetSubTimerDetailRequest_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._GetSubTimerDetailResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._GetSubTimerDetailResponse_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._GetSubTimerDetailResponse_ResponseExtra_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._PayPalBindInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubDataItemView_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubDataOverview_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubLiveBanner_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubOnlyLiveInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubSettingStatus_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubscribeBubbleList_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubscriberInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._SubscribingInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._UpdateTimerRequest_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._UpdateTimerResponse_Data_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._UpdateTimerResponse_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model._WebappSubInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import com.bytedance.android.livesdk.subscribe.model.gift._SubGifInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.goal.SubGoalInfo;
import com.bytedance.android.livesdk.subscribe.model.goal._SubGoalInfo_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite.GetInvitationStatusResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.SubAvailable;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEnable;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEnableCondition;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEntrance;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationCode;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationEntrance;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationEntrancePrompt;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationFunctionSwitcher;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationInviteeStatus;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationListData;
import com.bytedance.android.livesdk.subscribe.model.invite.SubOptInStatus;
import com.bytedance.android.livesdk.subscribe.model.invite.SubSwitcher;
import com.bytedance.android.livesdk.subscribe.model.invite._GetInvitationStatusResponse_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubAvailable_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubEnableCondition_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubEnable_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubEntrance_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubInvitationCode_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubInvitationEntrancePrompt_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubInvitationEntrance_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubInvitationFunctionSwitcher_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubInvitationInviteeStatus_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubInvitationListData_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubOptInStatus_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.invite._SubSwitcher_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.paypal.PaypalBindingUrl;
import com.bytedance.android.livesdk.subscribe.model.paypal._PaypalBindingUrl_ProtoDecoder;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.GetPIPOUrlResult;
import com.bytedance.android.livesdk.wallet.GetPipoUrlParams;
import com.bytedance.android.livesdk.wallet.NoticesRequestParams;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.android.livesdk.wallet._Diamond_ProtoDecoder;
import com.bytedance.android.livesdk.wallet._GetPIPOUrlResult_ProtoDecoder;
import com.bytedance.android.livesdk.wallet._GetPIPOUrlResult_UrlData_ProtoDecoder;
import com.bytedance.android.livesdk.wallet._GetPipoUrlParams_ProtoDecoder;
import com.bytedance.android.livesdk.wallet._NoticesRequestParams_ProtoDecoder;
import com.bytedance.android.livesdk.wallet._NoticesResult_Data_ProtoDecoder;
import com.bytedance.android.livesdk.wallet._NoticesResult_Notice_ProtoDecoder;
import com.bytedance.android.livesdk.wallet._NoticesResult_ProtoDecoder;
import com.bytedance.android.livesdk.wallet._NoticesResult_Style_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.AgeRestricted;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.BcToggleInfo;
import com.bytedance.android.livesdkapi.depend.model.live.BurstInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.ChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.ContinueRoomResponse;
import com.bytedance.android.livesdkapi.depend.model.live.CoverInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CoverQuality;
import com.bytedance.android.livesdkapi.depend.model.live.DeprecatedStruct5;
import com.bytedance.android.livesdkapi.depend.model.live.DeprecatedStruct6;
import com.bytedance.android.livesdkapi.depend.model.live.EffectInfo;
import com.bytedance.android.livesdkapi.depend.model.live.EnterRegionMatch;
import com.bytedance.android.livesdkapi.depend.model.live.FYPCommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.FYPRoomTagItem;
import com.bytedance.android.livesdkapi.depend.model.live.FeedRoomLabel;
import com.bytedance.android.livesdkapi.depend.model.live.FilterMsgRuleParamRandom;
import com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension;
import com.bytedance.android.livesdkapi.depend.model.live.KaraokeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LineupRoomInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveFilterMsgRule;
import com.bytedance.android.livesdkapi.depend.model.live.LiveGiftBoostCardRoomStatus;
import com.bytedance.android.livesdkapi.depend.model.live.OfficialRoomInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PaidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import com.bytedance.android.livesdkapi.depend.model.live.PinInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PreviewProductCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.RegionalRestricted;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomExtra;
import com.bytedance.android.livesdkapi.depend.model.live.RoomHealthScoreInfo;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.RoomPrivateInfo;
import com.bytedance.android.livesdkapi.depend.model.live.RoomShortTouchAreaConfig;
import com.bytedance.android.livesdkapi.depend.model.live.RoomTab;
import com.bytedance.android.livesdkapi.depend.model.live.RoomUserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.ShortTouchArea;
import com.bytedance.android.livesdkapi.depend.model.live.ShortTouchIconSkin;
import com.bytedance.android.livesdkapi.depend.model.live.ShortTouchInfo;
import com.bytedance.android.livesdkapi.depend.model.live.ShowInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Skin;
import com.bytedance.android.livesdkapi.depend.model.live.SkinDrawerEntrance;
import com.bytedance.android.livesdkapi.depend.model.live.SkinHostAccount;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.depend.model.live._AgeRestricted_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._AnchorLevelPermission_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BALinkStruct_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BcToggleInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BurstInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._CaptionInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ChannelInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._CommerceStruct_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._CommercialContentToggle_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ContinueRoomResponse_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._CoverInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._CoverQuality_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._DeprecatedStruct5_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._DeprecatedStruct6_DeprecatedStruct7_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._DeprecatedStruct6_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._EffectInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._EnterRegionMatch_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._FYPCommerceStruct_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._FYPRoomTagItem_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._FeedRoomLabel_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._FilterMsgRuleParamRandom_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._GiftSuspension_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._KaraokeInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LineupRoomInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_Options_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_PullData_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_Quality_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveFilterMsgRule_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveGiftBoostCardRoomStatus_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._OfficialRoomInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._PaidContentInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._PaidEvent_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._PartnershipInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._PictionaryFullInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._PictionaryStatistics_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._PinInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._PreviewProductCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RegionalRestricted_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomExtra_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomHealthScoreInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomLinkInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomPrivateInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomShortTouchAreaConfig_Element_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomShortTouchAreaConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomTab_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomUserAttr_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ShortTouchArea_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ShortTouchIconSkin_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ShortTouchInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ShowInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._SkinDrawerEntrance_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._SkinHostAccount_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._Skin_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrlExtra_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrlExtra_SrConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrl_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTest;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleArmy;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleGameConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleLinkerInviteMessageExtra;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePromptElem;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleRival;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleRivalTag;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleScore;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleStatsMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTruthOrDare;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation;
import com.bytedance.android.livesdkapi.depend.model.live.match.ChijiHistory;
import com.bytedance.android.livesdkapi.depend.model.live.match.ChijiResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.EffectingCard;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.IssueCategory;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiBattleFinishResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import com.bytedance.android.livesdkapi.depend.model.live.match.RewardPeriodConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.ScheduleItem;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.TaskPeriodConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamMatchCampaign;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleABTestList_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleABTestSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleABTest_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleArmy_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleArmy_RankUser_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleBaseUserInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleBonusConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleBonusStatus_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleComboInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleGameConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleInfoResponse_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleLinkerInviteMessageExtra_InviterRivalExtra_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleLinkerInviteMessageExtra_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleMode_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleMode_StealTowerData_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattlePromptElem_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattlePrompt_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleRivalTag_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleRival_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleScore_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleStatsMeta_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTaskGiftAmountGuide_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTaskInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTask_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamResult_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTeamUser_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTruthOrDare_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BestTeammateRelation_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._ChijiHistory_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._ChijiResult_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._CriticalStrikeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._EffectingCard_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._GiftModeMeta_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._GiftMode_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._IssueCategory_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._MultiBattleFinishResponse_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._MultiInviteResponse_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._MultiMatchPrepareResponse_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._PreviewPeriod_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._RewardPeriodConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._ScheduleItem_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._SmokeCardInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._TaskPeriodConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._TeamMatchCampaign_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._TeamUser_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.android.livesdkapi.depend.model.report._ReportCommitData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.HeartBeat;
import com.bytedance.android.livesdkapi.message.ImEnterRoom;
import com.bytedance.android.livesdkapi.message.LiveMessageID;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._HeartBeat_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._ImEnterRoom_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._LiveMessageID_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._LiveMessageSEI_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._ProtoMessageFetchResult_ProtoDecoder;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.android.livesdkapi.ping._PingResult_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import compliance.FieldAnnotation;
import compliance.MethodAnnotation;
import compliance.MsgAnnotation;
import compliance.ServiceAnnotation;
import compliance._FieldAnnotation_ProtoDecoder;
import compliance._MethodAnnotation_ProtoDecoder;
import compliance._MsgAnnotation_ProtoDecoder;
import compliance._ServiceAnnotation_ProtoDecoder;
import emotes.model.EmoteListResult;
import emotes.model.SubEmoteDetailResult;
import emotes.model._EmoteListResult_ProtoDecoder;
import emotes.model._SubEmoteDetailResult_ProtoDecoder;
import tikcast.api.anchor.AboutMe;
import tikcast.api.anchor.AboutMeInputBox;
import tikcast.api.anchor.AboutMeRequest;
import tikcast.api.anchor.AboutMeResponse;
import tikcast.api.anchor.AboutMeTemplate;
import tikcast.api.anchor.AboutMeUpdateRequest;
import tikcast.api.anchor.AboutMeUpdateResponse;
import tikcast.api.anchor.ActionRequest;
import tikcast.api.anchor.ActionResponse;
import tikcast.api.anchor.AdminHostListRequest;
import tikcast.api.anchor.AdminHostListResponse;
import tikcast.api.anchor.AnchorFragmentListResult;
import tikcast.api.anchor.AnchorLiveFragmentEditRequest;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;
import tikcast.api.anchor.AnchorLiveFragmentInfoRequest;
import tikcast.api.anchor.AnchorLiveFragmentInfoResponse;
import tikcast.api.anchor.AnchorLiveFragmentListRequest;
import tikcast.api.anchor.AnchorLiveFragmentListResponse;
import tikcast.api.anchor.AnchorLiveFragmentPostDetail;
import tikcast.api.anchor.AnchorLiveReplayFrameRequest;
import tikcast.api.anchor.AnchorLiveReplayFrameResponse;
import tikcast.api.anchor.BenefitsInfo;
import tikcast.api.anchor.CancelAutoDownloadExtra;
import tikcast.api.anchor.CancelAutoDownloadRequest;
import tikcast.api.anchor.CancelAutoDownloadResponse;
import tikcast.api.anchor.CreatorHubAnchorArticleDetail;
import tikcast.api.anchor.CreatorHubAnchorArticleReadReport;
import tikcast.api.anchor.CreatorHubAnchorReportRequest;
import tikcast.api.anchor.CreatorHubAnchorReportResponse;
import tikcast.api.anchor.CreatorHubGetAnchorArticleDetailRequest;
import tikcast.api.anchor.CreatorHubGetAnchorArticleDetailResponse;
import tikcast.api.anchor.DelHostRelationRequest;
import tikcast.api.anchor.DelHostRelationResponse;
import tikcast.api.anchor.FavouritesAddRequest;
import tikcast.api.anchor.FavouritesAddResponse;
import tikcast.api.anchor.FavouritesDeleteRequest;
import tikcast.api.anchor.FavouritesDeleteResponse;
import tikcast.api.anchor.FavouritesSongsRequest;
import tikcast.api.anchor.FavouritesSongsResponse;
import tikcast.api.anchor.FrameInfo;
import tikcast.api.anchor.GetAnchorFriendListRequest;
import tikcast.api.anchor.GetAnchorFriendListResponse;
import tikcast.api.anchor.GetNewAnchorGuideFeedbackConfigRequest;
import tikcast.api.anchor.GetNewAnchorGuideFeedbackConfigResponse;
import tikcast.api.anchor.GuideFeedbackReportRequest;
import tikcast.api.anchor.GuideFeedbackReportResponse;
import tikcast.api.anchor.HostInfo;
import tikcast.api.anchor.IntroConflictInfo;
import tikcast.api.anchor.KaraokeFavoriteUpdateRequest;
import tikcast.api.anchor.KaraokeFavoriteUpdateResponse;
import tikcast.api.anchor.KaraokeQueueListRequest;
import tikcast.api.anchor.KaraokeQueueListResponse;
import tikcast.api.anchor.KaraokeQueueUpdateRequest;
import tikcast.api.anchor.KaraokeQueueUpdateResponse;
import tikcast.api.anchor.KaraokeReqListRequest;
import tikcast.api.anchor.KaraokeReqListResponse;
import tikcast.api.anchor.KaraokeReqUpdateRequest;
import tikcast.api.anchor.KaraokeReqUpdateResponse;
import tikcast.api.anchor.KaraokeSearchRequest;
import tikcast.api.anchor.KaraokeSearchResponse;
import tikcast.api.anchor.KaraokeTab;
import tikcast.api.anchor.KaraokeTabListRequest;
import tikcast.api.anchor.KaraokeTabListResponse;
import tikcast.api.anchor.KaraokeTabsListRequest;
import tikcast.api.anchor.KaraokeTabsListResponse;
import tikcast.api.anchor.KaraokeUpdateStatusRequest;
import tikcast.api.anchor.KaraokeUpdateStatusResponse;
import tikcast.api.anchor.LiveFragmentDetail;
import tikcast.api.anchor.PinSoundEffectRequest;
import tikcast.api.anchor.PinSoundEffectResponse;
import tikcast.api.anchor.PlaylistAddReq;
import tikcast.api.anchor.PlaylistAddResponse;
import tikcast.api.anchor.PlaylistDeleteRequest;
import tikcast.api.anchor.PlaylistDeleteResponse;
import tikcast.api.anchor.PlaylistSongsRequest;
import tikcast.api.anchor.PlaylistSongsResponse;
import tikcast.api.anchor.ScheduleAutoDownloadData;
import tikcast.api.anchor.ScheduleAutoDownloadExtra;
import tikcast.api.anchor.ScheduleAutoDownloadRequest;
import tikcast.api.anchor.ScheduleAutoDownloadResponse;
import tikcast.api.anchor.SearchUserRequest;
import tikcast.api.anchor.SearchUserResponse;
import tikcast.api.anchor.UpdateDualCamStatusExtra;
import tikcast.api.anchor.UpdateDualCamStatusRequest;
import tikcast.api.anchor.UpdateDualCamStatusResponse;
import tikcast.api.anchor._AboutMeInputBox_ProtoDecoder;
import tikcast.api.anchor._AboutMeRequest_ProtoDecoder;
import tikcast.api.anchor._AboutMeResponse_ProtoDecoder;
import tikcast.api.anchor._AboutMeResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._AboutMeTemplate_ProtoDecoder;
import tikcast.api.anchor._AboutMeUpdateRequest_ProtoDecoder;
import tikcast.api.anchor._AboutMeUpdateResponse_ProtoDecoder;
import tikcast.api.anchor._AboutMeUpdateResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._AboutMe_ProtoDecoder;
import tikcast.api.anchor._ActionRequest_ProtoDecoder;
import tikcast.api.anchor._ActionResponse_ProtoDecoder;
import tikcast.api.anchor._AdminHostListRequest_ProtoDecoder;
import tikcast.api.anchor._AdminHostListResponse_Data_ProtoDecoder;
import tikcast.api.anchor._AdminHostListResponse_ProtoDecoder;
import tikcast.api.anchor._AnchorFragmentListResult_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentEditRequest_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentEditResponse_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentEditResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentInfoRequest_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentInfoResponse_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentInfoResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentListRequest_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentListResponse_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentListResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveFragmentPostDetail_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveReplayFrameRequest_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveReplayFrameResponse_ProtoDecoder;
import tikcast.api.anchor._AnchorLiveReplayFrameResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._BenefitsInfo_ProtoDecoder;
import tikcast.api.anchor._CancelAutoDownloadExtra_ProtoDecoder;
import tikcast.api.anchor._CancelAutoDownloadRequest_ProtoDecoder;
import tikcast.api.anchor._CancelAutoDownloadResponse_ProtoDecoder;
import tikcast.api.anchor._CreatorHubAnchorArticleDetail_ProtoDecoder;
import tikcast.api.anchor._CreatorHubAnchorArticleReadReport_ProtoDecoder;
import tikcast.api.anchor._CreatorHubAnchorReportRequest_ProtoDecoder;
import tikcast.api.anchor._CreatorHubAnchorReportResponse_ProtoDecoder;
import tikcast.api.anchor._CreatorHubAnchorReportResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._CreatorHubGetAnchorArticleDetailRequest_ProtoDecoder;
import tikcast.api.anchor._CreatorHubGetAnchorArticleDetailResponse_ProtoDecoder;
import tikcast.api.anchor._CreatorHubGetAnchorArticleDetailResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._DelHostRelationRequest_ProtoDecoder;
import tikcast.api.anchor._DelHostRelationResponse_ProtoDecoder;
import tikcast.api.anchor._FavouritesAddRequest_ProtoDecoder;
import tikcast.api.anchor._FavouritesAddResponse_ProtoDecoder;
import tikcast.api.anchor._FavouritesDeleteRequest_ProtoDecoder;
import tikcast.api.anchor._FavouritesDeleteResponse_ProtoDecoder;
import tikcast.api.anchor._FavouritesSongsRequest_ProtoDecoder;
import tikcast.api.anchor._FavouritesSongsResponse_ProtoDecoder;
import tikcast.api.anchor._FavouritesSongsResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._FrameInfo_ProtoDecoder;
import tikcast.api.anchor._GetAnchorFriendListRequest_ProtoDecoder;
import tikcast.api.anchor._GetAnchorFriendListResponse_Data_ProtoDecoder;
import tikcast.api.anchor._GetAnchorFriendListResponse_ProtoDecoder;
import tikcast.api.anchor._GetNewAnchorGuideFeedbackConfigRequest_ProtoDecoder;
import tikcast.api.anchor._GetNewAnchorGuideFeedbackConfigResponse_Data_ProtoDecoder;
import tikcast.api.anchor._GetNewAnchorGuideFeedbackConfigResponse_ProtoDecoder;
import tikcast.api.anchor._GuideFeedbackReportRequest_ProtoDecoder;
import tikcast.api.anchor._GuideFeedbackReportResponse_Data_ProtoDecoder;
import tikcast.api.anchor._GuideFeedbackReportResponse_ProtoDecoder;
import tikcast.api.anchor._HostInfo_ProtoDecoder;
import tikcast.api.anchor._IntroConflictInfo_ProtoDecoder;
import tikcast.api.anchor._KaraokeFavoriteUpdateRequest_ProtoDecoder;
import tikcast.api.anchor._KaraokeFavoriteUpdateResponse_ProtoDecoder;
import tikcast.api.anchor._KaraokeQueueListRequest_ProtoDecoder;
import tikcast.api.anchor._KaraokeQueueListResponse_Data_ProtoDecoder;
import tikcast.api.anchor._KaraokeQueueListResponse_ProtoDecoder;
import tikcast.api.anchor._KaraokeQueueUpdateRequest_ProtoDecoder;
import tikcast.api.anchor._KaraokeQueueUpdateResponse_Data_ProtoDecoder;
import tikcast.api.anchor._KaraokeQueueUpdateResponse_ProtoDecoder;
import tikcast.api.anchor._KaraokeReqListRequest_ProtoDecoder;
import tikcast.api.anchor._KaraokeReqListResponse_Data_ProtoDecoder;
import tikcast.api.anchor._KaraokeReqListResponse_ProtoDecoder;
import tikcast.api.anchor._KaraokeReqUpdateRequest_ProtoDecoder;
import tikcast.api.anchor._KaraokeReqUpdateResponse_ProtoDecoder;
import tikcast.api.anchor._KaraokeSearchRequest_ProtoDecoder;
import tikcast.api.anchor._KaraokeSearchResponse_Data_ProtoDecoder;
import tikcast.api.anchor._KaraokeSearchResponse_ProtoDecoder;
import tikcast.api.anchor._KaraokeTabListRequest_ProtoDecoder;
import tikcast.api.anchor._KaraokeTabListResponse_Data_ProtoDecoder;
import tikcast.api.anchor._KaraokeTabListResponse_ProtoDecoder;
import tikcast.api.anchor._KaraokeTab_ProtoDecoder;
import tikcast.api.anchor._KaraokeTabsListRequest_ProtoDecoder;
import tikcast.api.anchor._KaraokeTabsListResponse_Data_ProtoDecoder;
import tikcast.api.anchor._KaraokeTabsListResponse_ProtoDecoder;
import tikcast.api.anchor._KaraokeUpdateStatusRequest_ProtoDecoder;
import tikcast.api.anchor._KaraokeUpdateStatusResponse_ProtoDecoder;
import tikcast.api.anchor._LiveFragmentDetail_ProtoDecoder;
import tikcast.api.anchor._PinSoundEffectRequest_ProtoDecoder;
import tikcast.api.anchor._PinSoundEffectResponse_ProtoDecoder;
import tikcast.api.anchor._PlaylistAddReq_ProtoDecoder;
import tikcast.api.anchor._PlaylistAddResponse_ProtoDecoder;
import tikcast.api.anchor._PlaylistAddResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._PlaylistDeleteRequest_ProtoDecoder;
import tikcast.api.anchor._PlaylistDeleteResponse_ProtoDecoder;
import tikcast.api.anchor._PlaylistDeleteResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._PlaylistSongsRequest_ProtoDecoder;
import tikcast.api.anchor._PlaylistSongsResponse_ProtoDecoder;
import tikcast.api.anchor._PlaylistSongsResponse_ResponseData_ProtoDecoder;
import tikcast.api.anchor._ScheduleAutoDownloadData_ProtoDecoder;
import tikcast.api.anchor._ScheduleAutoDownloadExtra_ProtoDecoder;
import tikcast.api.anchor._ScheduleAutoDownloadRequest_ProtoDecoder;
import tikcast.api.anchor._ScheduleAutoDownloadResponse_ProtoDecoder;
import tikcast.api.anchor._SearchUserRequest_ProtoDecoder;
import tikcast.api.anchor._SearchUserResponse_Data_ProtoDecoder;
import tikcast.api.anchor._SearchUserResponse_ProtoDecoder;
import tikcast.api.anchor._UpdateDualCamStatusExtra_ProtoDecoder;
import tikcast.api.anchor._UpdateDualCamStatusRequest_ProtoDecoder;
import tikcast.api.anchor._UpdateDualCamStatusResponse_ProtoDecoder;
import tikcast.api.anchor_data.GetRealtimeLiveCenterOverviewContainer;
import tikcast.api.anchor_data.GetRealtimeLiveCenterOverviewRequest;
import tikcast.api.anchor_data.GetRealtimeLiveCenterOverviewResponse;
import tikcast.api.anchor_data.OperateRealtimeLiveCenterRequest;
import tikcast.api.anchor_data.OperateRealtimeLiveCenterResponse;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutData;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab;
import tikcast.api.anchor_data._GetRealtimeLiveCenterOverviewContainer_ProtoDecoder;
import tikcast.api.anchor_data._GetRealtimeLiveCenterOverviewRequest_ProtoDecoder;
import tikcast.api.anchor_data._GetRealtimeLiveCenterOverviewResponse_ProtoDecoder;
import tikcast.api.anchor_data._OperateRealtimeLiveCenterRequest_ProtoDecoder;
import tikcast.api.anchor_data._OperateRealtimeLiveCenterResponse_ProtoDecoder;
import tikcast.api.anchor_data._RealtimeLiveCenterDetailData_ProtoDecoder;
import tikcast.api.anchor_data._RealtimeLiveCenterLayoutData_ProtoDecoder;
import tikcast.api.anchor_data._RealtimeLiveCenterLayoutTab_ProtoDecoder;
import tikcast.api.eco.Answer;
import tikcast.api.eco.AppealDetail;
import tikcast.api.eco.AppealDetailRequest;
import tikcast.api.eco.AppealDetailResponse;
import tikcast.api.eco.AppealRequest;
import tikcast.api.eco.AppealResponse;
import tikcast.api.eco.CaptchaCheckRequest;
import tikcast.api.eco.CaptchaCheckResponse;
import tikcast.api.eco.CheckAppealRequest;
import tikcast.api.eco.CheckAppealResponse;
import tikcast.api.eco.CheckBubble;
import tikcast.api.eco.CheckDetectPermissionRequest;
import tikcast.api.eco.CheckDetectPermissionResponse;
import tikcast.api.eco.EventDetail;
import tikcast.api.eco.EventRequest;
import tikcast.api.eco.EventResponse;
import tikcast.api.eco.FeatureCheckRequest;
import tikcast.api.eco.FeatureCheckResponse;
import tikcast.api.eco.FeatureCheckResult;
import tikcast.api.eco.GetQuestionnaireContentRequest;
import tikcast.api.eco.GetQuestionnaireContentResponse;
import tikcast.api.eco.GetViolationListRequest;
import tikcast.api.eco.GetViolationListResponse;
import tikcast.api.eco.GuideDetail;
import tikcast.api.eco.RankDetail;
import tikcast.api.eco.ReportRequest;
import tikcast.api.eco.ReportResponse;
import tikcast.api.eco.RulesAndGuidanceBanner;
import tikcast.api.eco.RulesAndGuidanceBannerArea;
import tikcast.api.eco.RulesAndGuidanceConfig;
import tikcast.api.eco.RulesAndGuidanceContentArea;
import tikcast.api.eco.RulesAndGuidanceContentDetail;
import tikcast.api.eco.RulesAndGuidanceContentSubArea;
import tikcast.api.eco.RulesAndGuidanceFunction;
import tikcast.api.eco.RulesAndGuidanceFunctionArea;
import tikcast.api.eco.RulesAndGuidanceRequest;
import tikcast.api.eco.RulesAndGuidanceResponse;
import tikcast.api.eco.SubmitFeedbackRequest;
import tikcast.api.eco.SubmitFeedbackResponse;
import tikcast.api.eco.SubmitRequest;
import tikcast.api.eco.SubmitResponse;
import tikcast.api.eco.ViolationFeedback;
import tikcast.api.eco.ViolationFeedbackDetail;
import tikcast.api.eco.ViolationRecord;
import tikcast.api.eco.ViolationRecordLiveInfo;
import tikcast.api.eco.ViolationRecordPunishInfo;
import tikcast.api.eco._Answer_ProtoDecoder;
import tikcast.api.eco._AppealDetailRequest_ProtoDecoder;
import tikcast.api.eco._AppealDetailResponse_ProtoDecoder;
import tikcast.api.eco._AppealDetail_ProtoDecoder;
import tikcast.api.eco._AppealRequest_ProtoDecoder;
import tikcast.api.eco._AppealResponse_ProtoDecoder;
import tikcast.api.eco._AppealResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._CaptchaCheckRequest_ProtoDecoder;
import tikcast.api.eco._CaptchaCheckResponse_ProtoDecoder;
import tikcast.api.eco._CaptchaCheckResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._CaptchaCheckResponse_ResponseExtra_ProtoDecoder;
import tikcast.api.eco._CheckAppealRequest_ProtoDecoder;
import tikcast.api.eco._CheckAppealResponse_ProtoDecoder;
import tikcast.api.eco._CheckAppealResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._CheckBubble_ProtoDecoder;
import tikcast.api.eco._CheckDetectPermissionRequest_ProtoDecoder;
import tikcast.api.eco._CheckDetectPermissionResponse_ProtoDecoder;
import tikcast.api.eco._CheckDetectPermissionResponse_ResponseData_DetectorInfo_ProtoDecoder;
import tikcast.api.eco._CheckDetectPermissionResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._EventDetail_ProtoDecoder;
import tikcast.api.eco._EventRequest_ProtoDecoder;
import tikcast.api.eco._EventResponse_ProtoDecoder;
import tikcast.api.eco._EventResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._EventResponse_ResponseExtra_ProtoDecoder;
import tikcast.api.eco._FeatureCheckRequest_ProtoDecoder;
import tikcast.api.eco._FeatureCheckResponse_ProtoDecoder;
import tikcast.api.eco._FeatureCheckResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._FeatureCheckResponse_ResponseExtra_ProtoDecoder;
import tikcast.api.eco._FeatureCheckResult_ProtoDecoder;
import tikcast.api.eco._GetQuestionnaireContentRequest_ProtoDecoder;
import tikcast.api.eco._GetQuestionnaireContentResponse_ProtoDecoder;
import tikcast.api.eco._GetQuestionnaireContentResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._GetQuestionnaireContentResponse_ResponseData_Question_ProtoDecoder;
import tikcast.api.eco._GetViolationListRequest_ProtoDecoder;
import tikcast.api.eco._GetViolationListResponse_ProtoDecoder;
import tikcast.api.eco._GetViolationListResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._GetViolationListResponse_ResponseExtra_ProtoDecoder;
import tikcast.api.eco._GuideDetail_ProtoDecoder;
import tikcast.api.eco._RankDetail_ProtoDecoder;
import tikcast.api.eco._ReportRequest_ProtoDecoder;
import tikcast.api.eco._ReportResponse_ProtoDecoder;
import tikcast.api.eco._ReportResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceBannerArea_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceBanner_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceConfig_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceContentArea_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceContentDetail_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceContentSubArea_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceFunctionArea_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceFunction_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceRequest_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceResponse_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._RulesAndGuidanceResponse_ResponseExtra_ProtoDecoder;
import tikcast.api.eco._SubmitFeedbackRequest_ProtoDecoder;
import tikcast.api.eco._SubmitFeedbackResponse_ProtoDecoder;
import tikcast.api.eco._SubmitFeedbackResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._SubmitFeedbackResponse_ResponseExtra_ProtoDecoder;
import tikcast.api.eco._SubmitRequest_ProtoDecoder;
import tikcast.api.eco._SubmitResponse_ProtoDecoder;
import tikcast.api.eco._SubmitResponse_ResponseData_ProtoDecoder;
import tikcast.api.eco._ViolationFeedbackDetail_ProtoDecoder;
import tikcast.api.eco._ViolationFeedback_ProtoDecoder;
import tikcast.api.eco._ViolationRecordLiveInfo_ProtoDecoder;
import tikcast.api.eco._ViolationRecordPunishInfo_ProtoDecoder;
import tikcast.api.eco._ViolationRecord_ProtoDecoder;
import tikcast.api.perception.MultiViolationStatusReq;
import tikcast.api.perception.MultiViolationStatusResponse;
import tikcast.api.perception.ViolationStatusReq;
import tikcast.api.perception.ViolationStatusResponse;
import tikcast.api.perception._MultiViolationStatusReq_ProtoDecoder;
import tikcast.api.perception._MultiViolationStatusResponse_ProtoDecoder;
import tikcast.api.perception._MultiViolationStatusResponse_ResponseExtra_ProtoDecoder;
import tikcast.api.perception._MultiViolationStatusResponse_ViolationData_ProtoDecoder;
import tikcast.api.perception._ViolationStatusReq_ProtoDecoder;
import tikcast.api.perception._ViolationStatusResponse_ProtoDecoder;
import tikcast.api.perception._ViolationStatusResponse_ResponseData_ProtoDecoder;
import tikcast.api.perception._ViolationStatusResponse_ResponseExtra_ProtoDecoder;
import tikcast.api.privilege.AdminParam;
import tikcast.api.privilege.Background;
import tikcast.api.privilege.FansConfigRequest;
import tikcast.api.privilege.FansConfigResponse;
import tikcast.api.privilege.FansDiscordOauthCallbackRequest;
import tikcast.api.privilege.FansDiscordOauthCallbackResponse;
import tikcast.api.privilege.FansGetAnchorPageRequest;
import tikcast.api.privilege.FansGetAnchorPageResponse;
import tikcast.api.privilege.FansGetTaskInfoRequest;
import tikcast.api.privilege.FansGetTaskInfoResponse;
import tikcast.api.privilege.FansGetUserDataRequest;
import tikcast.api.privilege.FansGetUserDataResponse;
import tikcast.api.privilege.FansList;
import tikcast.api.privilege.FansParam;
import tikcast.api.privilege.FansPrivilegeDetailRequest;
import tikcast.api.privilege.FansPrivilegeDetailResponse;
import tikcast.api.privilege.FansRankListRequest;
import tikcast.api.privilege.FansRankListResponse;
import tikcast.api.privilege.FirstRechargeParam;
import tikcast.api.privilege.GetDiscordSettingsRequest;
import tikcast.api.privilege.GetDiscordSettingsResponse;
import tikcast.api.privilege.GetFansDataRequest;
import tikcast.api.privilege.GetFansDataResponse;
import tikcast.api.privilege.GradeConfig;
import tikcast.api.privilege.GradeInfoRequest;
import tikcast.api.privilege.GradeInfoResponse;
import tikcast.api.privilege.GradePrivilegeDetail;
import tikcast.api.privilege.GradePrivilegesRequest;
import tikcast.api.privilege.GradePrivilegesResponse;
import tikcast.api.privilege.GradeScoreRule;
import tikcast.api.privilege.GradeShowConfig;
import tikcast.api.privilege.GradeTab;
import tikcast.api.privilege.GradeTabRule;
import tikcast.api.privilege.JoinedFansClubRequest;
import tikcast.api.privilege.JoinedFansClubResponse;
import tikcast.api.privilege.PayGradeInfo;
import tikcast.api.privilege.PrivilegeFAQ;
import tikcast.api.privilege.QueryBadgeStyleRequest;
import tikcast.api.privilege.QueryBadgeStyleResponse;
import tikcast.api.privilege.QueryUserPrivilegesRequest;
import tikcast.api.privilege.QueryUserPrivilegesResponse;
import tikcast.api.privilege.QuitFansClubRequest;
import tikcast.api.privilege.QuitFansClubResponse;
import tikcast.api.privilege.RankListParam;
import tikcast.api.privilege.RichText;
import tikcast.api.privilege.SelectPrivilegeRequest;
import tikcast.api.privilege.SelectPrivilegeResponse;
import tikcast.api.privilege.StarCommentDeleteRequest;
import tikcast.api.privilege.StarCommentDeleteResponse;
import tikcast.api.privilege.StarCommentGetQueueRequest;
import tikcast.api.privilege.StarCommentGetQueueResponse;
import tikcast.api.privilege.StarCommentHistory;
import tikcast.api.privilege.StarCommentItem;
import tikcast.api.privilege.StarCommentPurchaseHistoryRequest;
import tikcast.api.privilege.StarCommentPurchaseHistoryResponse;
import tikcast.api.privilege.StarCommentPurchasePageRequest;
import tikcast.api.privilege.StarCommentPurchasePageResponse;
import tikcast.api.privilege.StarCommentPurchaseRequest;
import tikcast.api.privilege.StarCommentPurchaseResponse;
import tikcast.api.privilege.StarCommentQueue;
import tikcast.api.privilege.SubscriberParam;
import tikcast.api.privilege.UpdateDiscordSettingsRequest;
import tikcast.api.privilege.UpdateDiscordSettingsResponse;
import tikcast.api.privilege.UpdateDiscordSwitchRequest;
import tikcast.api.privilege.UpdateDiscordSwitchResponse;
import tikcast.api.privilege.UpgradeBarrageEffectConfig;
import tikcast.api.privilege.UpgradeEffectConfig;
import tikcast.api.privilege.UpgradeInfo;
import tikcast.api.privilege.UpgradePrivilege;
import tikcast.api.privilege.UserGrade;
import tikcast.api.privilege.UserGradeParam;
import tikcast.api.privilege.UserPrivilege;
import tikcast.api.privilege._AdminParam_ProtoDecoder;
import tikcast.api.privilege._Background_ProtoDecoder;
import tikcast.api.privilege._FansConfigRequest_ProtoDecoder;
import tikcast.api.privilege._FansConfigResponse_Data_ProtoDecoder;
import tikcast.api.privilege._FansConfigResponse_ProtoDecoder;
import tikcast.api.privilege._FansDiscordOauthCallbackRequest_ProtoDecoder;
import tikcast.api.privilege._FansDiscordOauthCallbackResponse_Data_ProtoDecoder;
import tikcast.api.privilege._FansDiscordOauthCallbackResponse_ProtoDecoder;
import tikcast.api.privilege._FansGetAnchorPageRequest_ProtoDecoder;
import tikcast.api.privilege._FansGetAnchorPageResponse_Data_ProtoDecoder;
import tikcast.api.privilege._FansGetAnchorPageResponse_ProtoDecoder;
import tikcast.api.privilege._FansGetTaskInfoRequest_ProtoDecoder;
import tikcast.api.privilege._FansGetTaskInfoResponse_Data_ProtoDecoder;
import tikcast.api.privilege._FansGetTaskInfoResponse_ProtoDecoder;
import tikcast.api.privilege._FansGetUserDataRequest_ProtoDecoder;
import tikcast.api.privilege._FansGetUserDataResponse_Data_ProtoDecoder;
import tikcast.api.privilege._FansGetUserDataResponse_ProtoDecoder;
import tikcast.api.privilege._FansList_ProtoDecoder;
import tikcast.api.privilege._FansParam_ProtoDecoder;
import tikcast.api.privilege._FansPrivilegeDetailRequest_ProtoDecoder;
import tikcast.api.privilege._FansPrivilegeDetailResponse_Data_ProtoDecoder;
import tikcast.api.privilege._FansPrivilegeDetailResponse_ProtoDecoder;
import tikcast.api.privilege._FansRankListRequest_ProtoDecoder;
import tikcast.api.privilege._FansRankListResponse_ProtoDecoder;
import tikcast.api.privilege._FansRankListResponse_Rank_ProtoDecoder;
import tikcast.api.privilege._FansRankListResponse_ResponseData_ProtoDecoder;
import tikcast.api.privilege._FirstRechargeParam_ProtoDecoder;
import tikcast.api.privilege._GetDiscordSettingsRequest_ProtoDecoder;
import tikcast.api.privilege._GetDiscordSettingsResponse_Data_ProtoDecoder;
import tikcast.api.privilege._GetDiscordSettingsResponse_ProtoDecoder;
import tikcast.api.privilege._GetFansDataRequest_ProtoDecoder;
import tikcast.api.privilege._GetFansDataResponse_ProtoDecoder;
import tikcast.api.privilege._GetFansDataResponse_ResponseData_ProtoDecoder;
import tikcast.api.privilege._GradeConfig_ProtoDecoder;
import tikcast.api.privilege._GradeInfoRequest_ProtoDecoder;
import tikcast.api.privilege._GradeInfoResponse_Data_ProtoDecoder;
import tikcast.api.privilege._GradeInfoResponse_ProtoDecoder;
import tikcast.api.privilege._GradePrivilegeDetail_ProtoDecoder;
import tikcast.api.privilege._GradePrivilegesRequest_ProtoDecoder;
import tikcast.api.privilege._GradePrivilegesResponse_Data_ProtoDecoder;
import tikcast.api.privilege._GradePrivilegesResponse_ProtoDecoder;
import tikcast.api.privilege._GradeScoreRule_ProtoDecoder;
import tikcast.api.privilege._GradeShowConfig_ProtoDecoder;
import tikcast.api.privilege._GradeTabRule_ProtoDecoder;
import tikcast.api.privilege._GradeTab_ProtoDecoder;
import tikcast.api.privilege._JoinedFansClubRequest_ProtoDecoder;
import tikcast.api.privilege._JoinedFansClubResponse_FansClub_ProtoDecoder;
import tikcast.api.privilege._JoinedFansClubResponse_ProtoDecoder;
import tikcast.api.privilege._JoinedFansClubResponse_ResponseData_ProtoDecoder;
import tikcast.api.privilege._PayGradeInfo_ProtoDecoder;
import tikcast.api.privilege._PrivilegeFAQ_ProtoDecoder;
import tikcast.api.privilege._QueryBadgeStyleRequest_Data_ProtoDecoder;
import tikcast.api.privilege._QueryBadgeStyleRequest_ProtoDecoder;
import tikcast.api.privilege._QueryBadgeStyleResponse_Data_ProtoDecoder;
import tikcast.api.privilege._QueryBadgeStyleResponse_ProtoDecoder;
import tikcast.api.privilege._QueryUserPrivilegesRequest_ProtoDecoder;
import tikcast.api.privilege._QueryUserPrivilegesResponse_Data_ProtoDecoder;
import tikcast.api.privilege._QueryUserPrivilegesResponse_PrivilegeTab_ProtoDecoder;
import tikcast.api.privilege._QueryUserPrivilegesResponse_ProtoDecoder;
import tikcast.api.privilege._QuitFansClubRequest_ProtoDecoder;
import tikcast.api.privilege._QuitFansClubResponse_ProtoDecoder;
import tikcast.api.privilege._QuitFansClubResponse_QuitResp_ProtoDecoder;
import tikcast.api.privilege._RankListParam_ProtoDecoder;
import tikcast.api.privilege._RichText_ProtoDecoder;
import tikcast.api.privilege._SelectPrivilegeRequest_ProtoDecoder;
import tikcast.api.privilege._SelectPrivilegeResponse_ProtoDecoder;
import tikcast.api.privilege._StarCommentDeleteRequest_ProtoDecoder;
import tikcast.api.privilege._StarCommentDeleteResponse_Data_ProtoDecoder;
import tikcast.api.privilege._StarCommentDeleteResponse_ProtoDecoder;
import tikcast.api.privilege._StarCommentGetQueueRequest_ProtoDecoder;
import tikcast.api.privilege._StarCommentGetQueueResponse_Data_ProtoDecoder;
import tikcast.api.privilege._StarCommentGetQueueResponse_ProtoDecoder;
import tikcast.api.privilege._StarCommentHistory_ProtoDecoder;
import tikcast.api.privilege._StarCommentItem_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchaseHistoryRequest_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchaseHistoryResponse_Data_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchaseHistoryResponse_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchasePageRequest_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchasePageResponse_Data_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchasePageResponse_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchaseRequest_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchaseResponse_Data_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchaseResponse_Extra_ProtoDecoder;
import tikcast.api.privilege._StarCommentPurchaseResponse_ProtoDecoder;
import tikcast.api.privilege._StarCommentQueue_ProtoDecoder;
import tikcast.api.privilege._SubscriberParam_ProtoDecoder;
import tikcast.api.privilege._UpdateDiscordSettingsRequest_ProtoDecoder;
import tikcast.api.privilege._UpdateDiscordSettingsResponse_ProtoDecoder;
import tikcast.api.privilege._UpdateDiscordSwitchRequest_ProtoDecoder;
import tikcast.api.privilege._UpdateDiscordSwitchResponse_ProtoDecoder;
import tikcast.api.privilege._UpdateDiscordSwitchResponse_SwitchResp_ProtoDecoder;
import tikcast.api.privilege._UpgradeBarrageEffectConfig_ProtoDecoder;
import tikcast.api.privilege._UpgradeEffectConfig_ProtoDecoder;
import tikcast.api.privilege._UpgradeInfo_ProtoDecoder;
import tikcast.api.privilege._UpgradePrivilege_ProtoDecoder;
import tikcast.api.privilege._UserGradeParam_ProtoDecoder;
import tikcast.api.privilege._UserGrade_ProtoDecoder;
import tikcast.api.privilege._UserPrivilege_ProtoDecoder;
import tikcast.api.wallet.tiktok.BehaviorData;
import tikcast.api.wallet.tiktok.BehaviorTrackParams;
import tikcast.api.wallet.tiktok.BehaviorTrackResult;
import tikcast.api.wallet.tiktok.CouponDetailData;
import tikcast.api.wallet.tiktok.DiamondBuyRequestParams;
import tikcast.api.wallet.tiktok.DiamondBuyResult;
import tikcast.api.wallet.tiktok.Exchange;
import tikcast.api.wallet.tiktok.ExchangeInfoRequestParams;
import tikcast.api.wallet.tiktok.ExchangeInfoResponse;
import tikcast.api.wallet.tiktok.GetABSStatusRequestParams;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;
import tikcast.api.wallet.tiktok.GetExchangeKYCRequestParams;
import tikcast.api.wallet.tiktok.GetExchangeKYCResult;
import tikcast.api.wallet.tiktok.GetTotalBalanceRequest;
import tikcast.api.wallet.tiktok.GetTotalBalanceResponse;
import tikcast.api.wallet.tiktok.InfoRequestParams;
import tikcast.api.wallet.tiktok.InfoResult;
import tikcast.api.wallet.tiktok.PIPODetails;
import tikcast.api.wallet.tiktok.PayoutOnboardingDetailParams;
import tikcast.api.wallet.tiktok.PayoutOnboardingDetailResult;
import tikcast.api.wallet.tiktok.QueryOrderRequestParams;
import tikcast.api.wallet.tiktok.QueryOrderResult;
import tikcast.api.wallet.tiktok.UnlockVoucherParams;
import tikcast.api.wallet.tiktok.UnlockVoucherResult;
import tikcast.api.wallet.tiktok.UpdateABSStatusRequestParams;
import tikcast.api.wallet.tiktok.UpdateABSStatusResponse;
import tikcast.api.wallet.tiktok._BehaviorData_ProtoDecoder;
import tikcast.api.wallet.tiktok._BehaviorTrackParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._BehaviorTrackResult_ProtoDecoder;
import tikcast.api.wallet.tiktok._BehaviorTrackResult_Response_ProtoDecoder;
import tikcast.api.wallet.tiktok._CouponDetailData_ProtoDecoder;
import tikcast.api.wallet.tiktok._DiamondBuyRequestParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._DiamondBuyResult_ABSPIPOInfo_ProtoDecoder;
import tikcast.api.wallet.tiktok._DiamondBuyResult_APPartnerAPIInAppRequest_ProtoDecoder;
import tikcast.api.wallet.tiktok._DiamondBuyResult_DiamondBuyData_ProtoDecoder;
import tikcast.api.wallet.tiktok._DiamondBuyResult_DiamondBuyExtra_ProtoDecoder;
import tikcast.api.wallet.tiktok._DiamondBuyResult_IapFailExtraData_ProtoDecoder;
import tikcast.api.wallet.tiktok._DiamondBuyResult_ProtoDecoder;
import tikcast.api.wallet.tiktok._ExchangeInfoRequestParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._ExchangeInfoResponse_ExchangeInfoData_ProtoDecoder;
import tikcast.api.wallet.tiktok._ExchangeInfoResponse_ProtoDecoder;
import tikcast.api.wallet.tiktok._Exchange_ProtoDecoder;
import tikcast.api.wallet.tiktok._GetABSStatusRequestParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._GetABSStatusResponse_ABSData_ProtoDecoder;
import tikcast.api.wallet.tiktok._GetABSStatusResponse_ProtoDecoder;
import tikcast.api.wallet.tiktok._GetExchangeKYCRequestParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._GetExchangeKYCResult_ProtoDecoder;
import tikcast.api.wallet.tiktok._GetTotalBalanceRequest_ProtoDecoder;
import tikcast.api.wallet.tiktok._GetTotalBalanceResponse_BalanceInfo_ProtoDecoder;
import tikcast.api.wallet.tiktok._GetTotalBalanceResponse_GetTotalBalanceData_ProtoDecoder;
import tikcast.api.wallet.tiktok._GetTotalBalanceResponse_ProtoDecoder;
import tikcast.api.wallet.tiktok._InfoRequestParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._InfoResult_InfoData_ProtoDecoder;
import tikcast.api.wallet.tiktok._InfoResult_InfoExtra_ProtoDecoder;
import tikcast.api.wallet.tiktok._InfoResult_ProtoDecoder;
import tikcast.api.wallet.tiktok._PIPODetails_APPartnerAPIInAppRequest_ProtoDecoder;
import tikcast.api.wallet.tiktok._PIPODetails_ProtoDecoder;
import tikcast.api.wallet.tiktok._PayoutOnboardingDetailParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._PayoutOnboardingDetailResult_Data_ProtoDecoder;
import tikcast.api.wallet.tiktok._PayoutOnboardingDetailResult_ProtoDecoder;
import tikcast.api.wallet.tiktok._QueryOrderRequestParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._QueryOrderResult_ChargeOrderData_ProtoDecoder;
import tikcast.api.wallet.tiktok._QueryOrderResult_ChargeOrderExtra_ProtoDecoder;
import tikcast.api.wallet.tiktok._QueryOrderResult_CouponDetailData_ProtoDecoder;
import tikcast.api.wallet.tiktok._QueryOrderResult_KYCIncentive_ProtoDecoder;
import tikcast.api.wallet.tiktok._QueryOrderResult_ProtoDecoder;
import tikcast.api.wallet.tiktok._UnlockVoucherParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._UnlockVoucherResult_ProtoDecoder;
import tikcast.api.wallet.tiktok._UnlockVoucherResult_Response_ProtoDecoder;
import tikcast.api.wallet.tiktok._UpdateABSStatusRequestParams_ProtoDecoder;
import tikcast.api.wallet.tiktok._UpdateABSStatusResponse_ABSData_ProtoDecoder;
import tikcast.api.wallet.tiktok._UpdateABSStatusResponse_ProtoDecoder;
import tikcast.linkmic.common.BackGroundImageState;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupChannelUser;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.LinkMicAdContent;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.PositionConfig;
import tikcast.linkmic.common.StateReqCommon;
import tikcast.linkmic.common._BackGroundImageState_ProtoDecoder;
import tikcast.linkmic.common._CohostUserInfo_ProtoDecoder;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import tikcast.linkmic.common._GroupChannelUser_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._LinkMicAdContent_ProtoDecoder;
import tikcast.linkmic.common._LinkUserState_ProtoDecoder;
import tikcast.linkmic.common._PositionConfig_ProtoDecoder;
import tikcast.linkmic.common._StateReqCommon_ProtoDecoder;
import tikcast.linkmic.controller.ABInfos;
import tikcast.linkmic.controller.AckStateReq;
import tikcast.linkmic.controller.AckStateResp;
import tikcast.linkmic.controller.AnchorMessage;
import tikcast.linkmic.controller.CancelJoinGroupReq;
import tikcast.linkmic.controller.CancelJoinGroupResp;
import tikcast.linkmic.controller.ChangeLayoutReq;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;
import tikcast.linkmic.controller.CreateChannelReq;
import tikcast.linkmic.controller.GetStateReq;
import tikcast.linkmic.controller.GetStateResp;
import tikcast.linkmic.controller.InitConfig;
import tikcast.linkmic.controller.JoinGroupReq;
import tikcast.linkmic.controller.JoinGroupResp;
import tikcast.linkmic.controller.KickOutAllGuestsParam;
import tikcast.linkmic.controller.KickOutAllGuestsResp;
import tikcast.linkmic.controller.LeaveJoinGroupReq;
import tikcast.linkmic.controller.LeaveJoinGroupResp;
import tikcast.linkmic.controller.LinkedUserInfo;
import tikcast.linkmic.controller.MGetABInfosReq;
import tikcast.linkmic.controller.MGetABInfosResp;
import tikcast.linkmic.controller.PermitJoinGroupReq;
import tikcast.linkmic.controller.PermitJoinGroupResp;
import tikcast.linkmic.controller.RechargeReq;
import tikcast.linkmic.controller.RechargeResp;
import tikcast.linkmic.controller.ResumeReq;
import tikcast.linkmic.controller.ResumeResp;
import tikcast.linkmic.controller._ABInfos_ProtoDecoder;
import tikcast.linkmic.controller._AckStateReq_ProtoDecoder;
import tikcast.linkmic.controller._AckStateResp_ProtoDecoder;
import tikcast.linkmic.controller._AnchorMessage_ProtoDecoder;
import tikcast.linkmic.controller._CancelJoinGroupReq_ProtoDecoder;
import tikcast.linkmic.controller._CancelJoinGroupResp_ProtoDecoder;
import tikcast.linkmic.controller._ChangeLayoutReq_ProtoDecoder;
import tikcast.linkmic.controller._ChangeStateReq_ProtoDecoder;
import tikcast.linkmic.controller._ChangeStateResp_ProtoDecoder;
import tikcast.linkmic.controller._CreateChannelReq_ProtoDecoder;
import tikcast.linkmic.controller._GetStateReq_ProtoDecoder;
import tikcast.linkmic.controller._GetStateResp_ProtoDecoder;
import tikcast.linkmic.controller._InitConfig_ProtoDecoder;
import tikcast.linkmic.controller._JoinGroupReq_ProtoDecoder;
import tikcast.linkmic.controller._JoinGroupResp_ProtoDecoder;
import tikcast.linkmic.controller._KickOutAllGuestsParam_ProtoDecoder;
import tikcast.linkmic.controller._KickOutAllGuestsResp_ProtoDecoder;
import tikcast.linkmic.controller._LeaveJoinGroupReq_ProtoDecoder;
import tikcast.linkmic.controller._LeaveJoinGroupResp_ProtoDecoder;
import tikcast.linkmic.controller._LinkedUserInfo_ProtoDecoder;
import tikcast.linkmic.controller._MGetABInfosReq_ProtoDecoder;
import tikcast.linkmic.controller._MGetABInfosResp_ProtoDecoder;
import tikcast.linkmic.controller._PermitJoinGroupReq_ProtoDecoder;
import tikcast.linkmic.controller._PermitJoinGroupResp_ProtoDecoder;
import tikcast.linkmic.controller._RechargeReq_ProtoDecoder;
import tikcast.linkmic.controller._RechargeResp_ProtoDecoder;
import tikcast.linkmic.controller._ResumeReq_ProtoDecoder;
import tikcast.linkmic.controller._ResumeResp_ProtoDecoder;
import webcast.api.activity_quiz.QueryUserIdentityParams;
import webcast.api.activity_quiz.QueryUserIdentityResponse;
import webcast.api.activity_quiz._QueryUserIdentityParams_ProtoDecoder;
import webcast.api.activity_quiz._QueryUserIdentityResponse_ProtoDecoder;
import webcast.api.bag.BagItemConsumeRequestParams;
import webcast.api.bag.BagItemConsumeResponse;
import webcast.api.bag.BagItemListRequestParams;
import webcast.api.bag.BagItemListResponse;
import webcast.api.bag.BagItemObtainRequestParams;
import webcast.api.bag.BagItemObtainResponse;
import webcast.api.bag._BagItemConsumeRequestParams_ProtoDecoder;
import webcast.api.bag._BagItemConsumeResponse_Data_ProtoDecoder;
import webcast.api.bag._BagItemConsumeResponse_Extra_ProtoDecoder;
import webcast.api.bag._BagItemConsumeResponse_ProtoDecoder;
import webcast.api.bag._BagItemListRequestParams_ProtoDecoder;
import webcast.api.bag._BagItemListResponse_Data_ProtoDecoder;
import webcast.api.bag._BagItemListResponse_Extra_ProtoDecoder;
import webcast.api.bag._BagItemListResponse_ProtoDecoder;
import webcast.api.bag._BagItemObtainRequestParams_ProtoDecoder;
import webcast.api.bag._BagItemObtainResponse_Data_ProtoDecoder;
import webcast.api.bag._BagItemObtainResponse_Extra_ProtoDecoder;
import webcast.api.bag._BagItemObtainResponse_ProtoDecoder;
import webcast.api.battle.BattleAcceptRequest;
import webcast.api.battle.BattleAcceptResponse;
import webcast.api.battle.BattleAwardItemCardRequest;
import webcast.api.battle.BattleAwardItemCardResponse;
import webcast.api.battle._BattleAcceptRequest_ProtoDecoder;
import webcast.api.battle._BattleAcceptResponse_ProtoDecoder;
import webcast.api.battle._BattleAcceptResponse_ResponseData_ProtoDecoder;
import webcast.api.battle._BattleAwardItemCardRequest_ProtoDecoder;
import webcast.api.battle._BattleAwardItemCardResponse_ProtoDecoder;
import webcast.api.battle._BattleAwardItemCardResponse_ResponseData_ProtoDecoder;
import webcast.api.creator.PreScheduleStream;
import webcast.api.creator.PreScheduleStreamExtra;
import webcast.api.creator.PreScheduleStreamRequest;
import webcast.api.creator.PreScheduleStreamResponse;
import webcast.api.creator.PushStreamInfo;
import webcast.api.creator.PushStreamInfoExtra;
import webcast.api.creator.PushStreamInfoRequest;
import webcast.api.creator.PushStreamInfoResponse;
import webcast.api.creator.StreamResolution;
import webcast.api.creator._PreScheduleStreamExtra_ProtoDecoder;
import webcast.api.creator._PreScheduleStreamRequest_ProtoDecoder;
import webcast.api.creator._PreScheduleStreamResponse_ProtoDecoder;
import webcast.api.creator._PreScheduleStream_ProtoDecoder;
import webcast.api.creator._PushStreamInfoExtra_ProtoDecoder;
import webcast.api.creator._PushStreamInfoRequest_ProtoDecoder;
import webcast.api.creator._PushStreamInfoResponse_ProtoDecoder;
import webcast.api.creator._PushStreamInfo_ProtoDecoder;
import webcast.api.creator._StreamResolution_ProtoDecoder;
import webcast.api.envelope.EnvelopeTemplateRequest;
import webcast.api.envelope.EnvelopeTemplateResponse;
import webcast.api.envelope.PortalListRequest;
import webcast.api.envelope.PortalListResponse;
import webcast.api.envelope.RevenuePermissionRequest;
import webcast.api.envelope.RevenuePermissionResponse;
import webcast.api.envelope._EnvelopeTemplateRequest_ProtoDecoder;
import webcast.api.envelope._EnvelopeTemplateResponse_AnchorOnBoardPermit_ProtoDecoder;
import webcast.api.envelope._EnvelopeTemplateResponse_CustomRule_ProtoDecoder;
import webcast.api.envelope._EnvelopeTemplateResponse_EnvelopeTemplate_ProtoDecoder;
import webcast.api.envelope._EnvelopeTemplateResponse_PortalCustomRule_ProtoDecoder;
import webcast.api.envelope._EnvelopeTemplateResponse_PortalTemplate_ProtoDecoder;
import webcast.api.envelope._EnvelopeTemplateResponse_ProtoDecoder;
import webcast.api.envelope._EnvelopeTemplateResponse_ResponseData_ProtoDecoder;
import webcast.api.envelope._PortalListRequest_ProtoDecoder;
import webcast.api.envelope._PortalListResponse_PortalInfo_ProtoDecoder;
import webcast.api.envelope._PortalListResponse_ProtoDecoder;
import webcast.api.envelope._PortalListResponse_ResponseData_ProtoDecoder;
import webcast.api.envelope._RevenuePermissionRequest_ProtoDecoder;
import webcast.api.envelope._RevenuePermissionResponse_ProtoDecoder;
import webcast.api.envelope._RevenuePermissionResponse_ResponseData_ProtoDecoder;
import webcast.api.feed.AwemeCommerceStructV2;
import webcast.api.feed.AwemeStructV2;
import webcast.api.feed.BlockRecommendUserExtra;
import webcast.api.feed.BlockRecommendUserRequestParams;
import webcast.api.feed.BlockRecommendUserResponse;
import webcast.api.feed.ExtraStructV2;
import webcast.api.feed.FeedV2RequestParams;
import webcast.api.feed.FeedV2Response;
import webcast.api.feed.FollowRecommendItem;
import webcast.api.feed.FollowRecommendListExtra;
import webcast.api.feed.FollowRecommendListRequestParams;
import webcast.api.feed.FollowRecommendListResponse;
import webcast.api.feed.LogPbStructV2;
import webcast.api.feed.PseudoAdData;
import webcast.api.feed.WebcastRoomFeedCellStructV2;
import webcast.api.feed._AwemeCommerceStructV2_ProtoDecoder;
import webcast.api.feed._AwemeStructV2_ProtoDecoder;
import webcast.api.feed._BlockRecommendUserExtra_ProtoDecoder;
import webcast.api.feed._BlockRecommendUserRequestParams_ProtoDecoder;
import webcast.api.feed._BlockRecommendUserResponse_ProtoDecoder;
import webcast.api.feed._ExtraStructV2_ProtoDecoder;
import webcast.api.feed._FeedV2RequestParams_ProtoDecoder;
import webcast.api.feed._FeedV2Response_ProtoDecoder;
import webcast.api.feed._FollowRecommendItem_ProtoDecoder;
import webcast.api.feed._FollowRecommendListExtra_ProtoDecoder;
import webcast.api.feed._FollowRecommendListRequestParams_ProtoDecoder;
import webcast.api.feed._FollowRecommendListResponse_ProtoDecoder;
import webcast.api.feed._LogPbStructV2_ProtoDecoder;
import webcast.api.feed._PseudoAdData_ProtoDecoder;
import webcast.api.feed._WebcastRoomFeedCellStructV2_ProtoDecoder;
import webcast.api.first_recharge.CampaignOperateParams;
import webcast.api.first_recharge.CampaignOperateResp;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Params;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;
import webcast.api.first_recharge._CampaignOperateParams_ProtoDecoder;
import webcast.api.first_recharge._CampaignOperateResp_Data_ProtoDecoder;
import webcast.api.first_recharge._CampaignOperateResp_ProtoDecoder;
import webcast.api.first_recharge._GetFirstRechargeInfoV2Params_ProtoDecoder;
import webcast.api.first_recharge._GetFirstRechargeInfoV2Resp_Data_ProtoDecoder;
import webcast.api.first_recharge._GetFirstRechargeInfoV2Resp_FirstChargeGuideEffectRule_ProtoDecoder;
import webcast.api.first_recharge._GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV1_ProtoDecoder;
import webcast.api.first_recharge._GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV2_ProtoDecoder;
import webcast.api.first_recharge._GetFirstRechargeInfoV2Resp_ProtoDecoder;
import webcast.api.game.AnchorRank;
import webcast.api.game.AnchorSearchRequest;
import webcast.api.game.AnchorSearchResponse;
import webcast.api.game.AnchorTagListResult;
import webcast.api.game.Audience;
import webcast.api.game.AudienceInfo;
import webcast.api.game.BrowserInfo;
import webcast.api.game.ChangeNotifyRequest;
import webcast.api.game.ChangeNotifyResponse;
import webcast.api.game.CreateInfoRequest;
import webcast.api.game.CreateInfoResponse;
import webcast.api.game.DualDeviceUpdateRequest;
import webcast.api.game.DualDeviceUpdateResponse;
import webcast.api.game.FeedExtra;
import webcast.api.game.GameAnchorCategory;
import webcast.api.game.GameCategory;
import webcast.api.game.GameSubActANewAudienceListRequest;
import webcast.api.game.GameSubActAnchorRankRequest;
import webcast.api.game.GameSubActAnchorRankResponse;
import webcast.api.game.GameSubActApplyRequest;
import webcast.api.game.GameSubActApplyResponse;
import webcast.api.game.GameSubActGetAnchorClaimNumRequest;
import webcast.api.game.GameSubActGetAnchorClaimNumResponse;
import webcast.api.game.GameSubActGetRandUnfinishedAnchorRequest;
import webcast.api.game.GameSubActGetRandUnfinishedAnchorResponse;
import webcast.api.game.GameSubActNewAudienceListResponse;
import webcast.api.game.GameTagSearchResult;
import webcast.api.game.GetEmailCntRequest;
import webcast.api.game.GetEmailCntResponse;
import webcast.api.game.GetGameVideoListRequest;
import webcast.api.game.GetGameVideoListResponse;
import webcast.api.game.ListSugPollRequest;
import webcast.api.game.ListSugPollResponse;
import webcast.api.game.LiveFragmentClipEditRequest;
import webcast.api.game.LiveFragmentClipEditResponse;
import webcast.api.game.LiveFragmentMontageRequest;
import webcast.api.game.LiveFragmentMontageResponse;
import webcast.api.game.OpenLsNotifyInfo;
import webcast.api.game.RegionCheckRequest;
import webcast.api.game.RegionCheckResponse;
import webcast.api.game.Reward;
import webcast.api.game.SearchTagRequest;
import webcast.api.game.SearchTagResponse;
import webcast.api.game.SingleBrowserInfo;
import webcast.api.game.SubActAnchorActInfoRequest;
import webcast.api.game.SubActAnchorActInfoResponse;
import webcast.api.game.SubActClaimRequest;
import webcast.api.game.SubActClaimResponse;
import webcast.api.game.SubActGetMlbbBindInfoRequest;
import webcast.api.game.SubActGetMlbbBindInfoResponse;
import webcast.api.game.SubActGetRewardRequest;
import webcast.api.game.SubActGetRewardResponse;
import webcast.api.game.SubActQuotaLockRequest;
import webcast.api.game.SubActQuotaLockResponse;
import webcast.api.game.SubActRewardAudienceInfoRequest;
import webcast.api.game.SubActRewardAudienceInfoResponse;
import webcast.api.game.TnsPiracyDetail;
import webcast.api.game.TnsPiracyInfoRequest;
import webcast.api.game.TnsPiracyInfoResponse;
import webcast.api.game.VcloudVideoEditParamVideoExtra;
import webcast.api.game.VcloudVideoEditParamVideoTrack;
import webcast.api.game.VideoCopyRequest;
import webcast.api.game.VideoCopyResponse;
import webcast.api.game.VideoCutsInfo;
import webcast.api.game.VideoCutsInfoCropParam;
import webcast.api.game.VideoTrack;
import webcast.api.game._AnchorRank_ProtoDecoder;
import webcast.api.game._AnchorSearchRequest_ProtoDecoder;
import webcast.api.game._AnchorSearchResponse_ProtoDecoder;
import webcast.api.game._AnchorSearchResponse_ResponseData_ProtoDecoder;
import webcast.api.game._AnchorTagListResult_ProtoDecoder;
import webcast.api.game._AudienceInfo_ProtoDecoder;
import webcast.api.game._Audience_ProtoDecoder;
import webcast.api.game._BrowserInfo_ProtoDecoder;
import webcast.api.game._ChangeNotifyRequest_ProtoDecoder;
import webcast.api.game._ChangeNotifyResponse_ProtoDecoder;
import webcast.api.game._ChangeNotifyResponse_ResponseData_ProtoDecoder;
import webcast.api.game._CreateInfoRequest_ProtoDecoder;
import webcast.api.game._CreateInfoResponse_ProtoDecoder;
import webcast.api.game._CreateInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.game._DualDeviceUpdateRequest_ProtoDecoder;
import webcast.api.game._DualDeviceUpdateResponse_ProtoDecoder;
import webcast.api.game._DualDeviceUpdateResponse_ResponseData_ProtoDecoder;
import webcast.api.game._GameAnchorCategory_ProtoDecoder;
import webcast.api.game._GameCategory_ProtoDecoder;
import webcast.api.game._GameSubActANewAudienceListRequest_ProtoDecoder;
import webcast.api.game._GameSubActAnchorRankRequest_ProtoDecoder;
import webcast.api.game._GameSubActAnchorRankResponse_ProtoDecoder;
import webcast.api.game._GameSubActAnchorRankResponse_ResponseData_ProtoDecoder;
import webcast.api.game._GameSubActApplyRequest_ProtoDecoder;
import webcast.api.game._GameSubActApplyResponse_ProtoDecoder;
import webcast.api.game._GameSubActApplyResponse_ResponseData_ProtoDecoder;
import webcast.api.game._GameSubActGetAnchorClaimNumRequest_ProtoDecoder;
import webcast.api.game._GameSubActGetAnchorClaimNumResponse_ProtoDecoder;
import webcast.api.game._GameSubActGetAnchorClaimNumResponse_ResponseData_ProtoDecoder;
import webcast.api.game._GameSubActGetRandUnfinishedAnchorRequest_ProtoDecoder;
import webcast.api.game._GameSubActGetRandUnfinishedAnchorResponse_ProtoDecoder;
import webcast.api.game._GameSubActGetRandUnfinishedAnchorResponse_ResponseData_ProtoDecoder;
import webcast.api.game._GameSubActNewAudienceListResponse_ProtoDecoder;
import webcast.api.game._GameSubActNewAudienceListResponse_ResponseData_ProtoDecoder;
import webcast.api.game._GameTagSearchResult_ProtoDecoder;
import webcast.api.game._GetEmailCntRequest_ProtoDecoder;
import webcast.api.game._GetEmailCntResponse_ProtoDecoder;
import webcast.api.game._GetEmailCntResponse_ResponseData_ProtoDecoder;
import webcast.api.game._GetGameVideoListRequest_ProtoDecoder;
import webcast.api.game._GetGameVideoListResponse_ProtoDecoder;
import webcast.api.game._GetGameVideoListResponse_ResponseData_ProtoDecoder;
import webcast.api.game._ListSugPollRequest_ProtoDecoder;
import webcast.api.game._ListSugPollResponse_ProtoDecoder;
import webcast.api.game._ListSugPollResponse_ResponseData_ProtoDecoder;
import webcast.api.game._LiveFragmentClipEditRequest_ProtoDecoder;
import webcast.api.game._LiveFragmentClipEditResponse_ProtoDecoder;
import webcast.api.game._LiveFragmentClipEditResponse_ResponseData_ProtoDecoder;
import webcast.api.game._LiveFragmentMontageRequest_ProtoDecoder;
import webcast.api.game._LiveFragmentMontageResponse_ProtoDecoder;
import webcast.api.game._LiveFragmentMontageResponse_ResponseData_ProtoDecoder;
import webcast.api.game._OpenLsNotifyInfo_ProtoDecoder;
import webcast.api.game._RegionCheckRequest_ProtoDecoder;
import webcast.api.game._RegionCheckResponse_ProtoDecoder;
import webcast.api.game._RegionCheckResponse_ResponseData_ProtoDecoder;
import webcast.api.game._Reward_ProtoDecoder;
import webcast.api.game._SearchTagRequest_ProtoDecoder;
import webcast.api.game._SearchTagResponse_ProtoDecoder;
import webcast.api.game._SearchTagResponse_ResponseData_ProtoDecoder;
import webcast.api.game._SingleBrowserInfo_ProtoDecoder;
import webcast.api.game._SubActAnchorActInfoRequest_ProtoDecoder;
import webcast.api.game._SubActAnchorActInfoResponse_ProtoDecoder;
import webcast.api.game._SubActAnchorActInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.game._SubActClaimRequest_ProtoDecoder;
import webcast.api.game._SubActClaimResponse_ProtoDecoder;
import webcast.api.game._SubActClaimResponse_ResponseData_ProtoDecoder;
import webcast.api.game._SubActGetMlbbBindInfoRequest_ProtoDecoder;
import webcast.api.game._SubActGetMlbbBindInfoResponse_ProtoDecoder;
import webcast.api.game._SubActGetMlbbBindInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.game._SubActGetRewardRequest_ProtoDecoder;
import webcast.api.game._SubActGetRewardResponse_ProtoDecoder;
import webcast.api.game._SubActGetRewardResponse_ResponseData_ProtoDecoder;
import webcast.api.game._SubActQuotaLockRequest_ProtoDecoder;
import webcast.api.game._SubActQuotaLockResponse_ProtoDecoder;
import webcast.api.game._SubActQuotaLockResponse_ResponseData_ProtoDecoder;
import webcast.api.game._SubActRewardAudienceInfoRequest_ProtoDecoder;
import webcast.api.game._SubActRewardAudienceInfoResponse_ProtoDecoder;
import webcast.api.game._SubActRewardAudienceInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.game._TnsPiracyDetail_ProtoDecoder;
import webcast.api.game._TnsPiracyInfoRequest_ProtoDecoder;
import webcast.api.game._TnsPiracyInfoResponse_ProtoDecoder;
import webcast.api.game._TnsPiracyInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.game._VcloudVideoEditParamVideoExtra_ProtoDecoder;
import webcast.api.game._VcloudVideoEditParamVideoTrack_ProtoDecoder;
import webcast.api.game._VideoCopyRequest_ProtoDecoder;
import webcast.api.game._VideoCopyResponse_ProtoDecoder;
import webcast.api.game._VideoCopyResponse_ResponseData_ProtoDecoder;
import webcast.api.game._VideoCutsInfoCropParam_ProtoDecoder;
import webcast.api.game._VideoCutsInfo_ProtoDecoder;
import webcast.api.game._VideoTrack_ProtoDecoder;
import webcast.api.game_station.DownloadRequest;
import webcast.api.game_station.DownloadResponse;
import webcast.api.game_station.GameDetailBaseRequest;
import webcast.api.game_station.GameDetailBaseResponse;
import webcast.api.game_station.GameDetailExtraRequest;
import webcast.api.game_station.GameDetailExtraResponse;
import webcast.api.game_station.GameDetailPreviewRequest;
import webcast.api.game_station.GameDetailPreviewResponse;
import webcast.api.game_station._DownloadRequest_ProtoDecoder;
import webcast.api.game_station._DownloadResponse_ProtoDecoder;
import webcast.api.game_station._DownloadResponse_ResponseData_ProtoDecoder;
import webcast.api.game_station._GameDetailBaseRequest_ProtoDecoder;
import webcast.api.game_station._GameDetailBaseResponse_ProtoDecoder;
import webcast.api.game_station._GameDetailBaseResponse_ResponseData_ProtoDecoder;
import webcast.api.game_station._GameDetailExtraRequest_ProtoDecoder;
import webcast.api.game_station._GameDetailExtraResponse_ProtoDecoder;
import webcast.api.game_station._GameDetailExtraResponse_ResponseData_ProtoDecoder;
import webcast.api.game_station._GameDetailPreviewRequest_ProtoDecoder;
import webcast.api.game_station._GameDetailPreviewResponse_ProtoDecoder;
import webcast.api.game_station._GameDetailPreviewResponse_ResponseData_ProtoDecoder;
import webcast.api.goody_bag.GetGoodyBagDetailRequest;
import webcast.api.goody_bag.GetGoodyBagDetailResponse;
import webcast.api.goody_bag.GetGoodyBagHistoryRequest;
import webcast.api.goody_bag.GetGoodyBagHistoryResponse;
import webcast.api.goody_bag.GetGoodyBagLotteryRequest;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;
import webcast.api.goody_bag.GetGoodyBagTemplateRequest;
import webcast.api.goody_bag.GetGoodyBagTemplateResponse;
import webcast.api.goody_bag.GetGoodyBagWinnerListRequest;
import webcast.api.goody_bag.GetGoodyBagWinnerListResponse;
import webcast.api.goody_bag.GetRoomGoodyBagRequest;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;
import webcast.api.goody_bag.GoodyBagSignupRequest;
import webcast.api.goody_bag.GoodyBagSignupResponse;
import webcast.api.goody_bag.SendGoodyBagRequest;
import webcast.api.goody_bag.SendGoodyBagResponse;
import webcast.api.goody_bag.TextReviewRequest;
import webcast.api.goody_bag.TextReviewResponse;
import webcast.api.goody_bag._GetGoodyBagDetailRequest_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagDetailResponse_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagDetailResponse_ResponseData_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagHistoryRequest_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagHistoryResponse_CoinHistoryItem_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagHistoryResponse_HistoryItem_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagHistoryResponse_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagHistoryResponse_ResponseData_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagLotteryRequest_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagLotteryResponse_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagLotteryResponse_ResponseData_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagTemplateRequest_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagTemplateResponse_CoinTemplate_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagTemplateResponse_CommonTemplate_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagTemplateResponse_PreCheckResult_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagTemplateResponse_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagTemplateResponse_ResponseData_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagWinnerListRequest_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagWinnerListResponse_ProtoDecoder;
import webcast.api.goody_bag._GetGoodyBagWinnerListResponse_ResponseData_ProtoDecoder;
import webcast.api.goody_bag._GetRoomGoodyBagRequest_ProtoDecoder;
import webcast.api.goody_bag._GetRoomGoodyBagResponse_ProtoDecoder;
import webcast.api.goody_bag._GetRoomGoodyBagResponse_ResponseData_ProtoDecoder;
import webcast.api.goody_bag._GoodyBagSignupRequest_ProtoDecoder;
import webcast.api.goody_bag._GoodyBagSignupResponse_ProtoDecoder;
import webcast.api.goody_bag._GoodyBagSignupResponse_ResponseData_ProtoDecoder;
import webcast.api.goody_bag._SendGoodyBagRequest_CoinGoodyBagParam_ProtoDecoder;
import webcast.api.goody_bag._SendGoodyBagRequest_ProtoDecoder;
import webcast.api.goody_bag._SendGoodyBagResponse_ProtoDecoder;
import webcast.api.goody_bag._SendGoodyBagResponse_ResponseData_ProtoDecoder;
import webcast.api.goody_bag._TextReviewRequest_ProtoDecoder;
import webcast.api.goody_bag._TextReviewResponse_ProtoDecoder;
import webcast.api.goody_bag._TextReviewResponse_ResponseData_ProtoDecoder;
import webcast.api.interaction.PinRequest;
import webcast.api.interaction.PinResponse;
import webcast.api.interaction.QueryPollRequest;
import webcast.api.interaction.QueryPollResponse;
import webcast.api.interaction.QueryVoteUserRequest;
import webcast.api.interaction.QueryVoteUserResponse;
import webcast.api.interaction._PinRequest_ProtoDecoder;
import webcast.api.interaction._PinResponse_ResponseData_ProtoDecoder;
import webcast.api.interaction._QueryPollRequest_ProtoDecoder;
import webcast.api.interaction._QueryPollResponse_Data_ProtoDecoder;
import webcast.api.interaction._QueryPollResponse_ProtoDecoder;
import webcast.api.interaction._QueryVoteUserRequest_ProtoDecoder;
import webcast.api.interaction._QueryVoteUserResponse_Data_ProtoDecoder;
import webcast.api.interaction._QueryVoteUserResponse_ProtoDecoder;
import webcast.api.interaction.pictionary.ChangeWordRequest;
import webcast.api.interaction.pictionary.ChangeWordResponse;
import webcast.api.interaction.pictionary.PictionaryRankRequest;
import webcast.api.interaction.pictionary.PictionaryRankResponse;
import webcast.api.interaction.pictionary.RankEntry;
import webcast.api.interaction.pictionary.ReviewWordRequest;
import webcast.api.interaction.pictionary.ReviewWordResponse;
import webcast.api.interaction.pictionary._ChangeWordRequest_ProtoDecoder;
import webcast.api.interaction.pictionary._ChangeWordResponse_ProtoDecoder;
import webcast.api.interaction.pictionary._PictionaryRankRequest_ProtoDecoder;
import webcast.api.interaction.pictionary._PictionaryRankResponse_ProtoDecoder;
import webcast.api.interaction.pictionary._PictionaryRankResponse_ResponseData_ProtoDecoder;
import webcast.api.interaction.pictionary._RankEntry_ProtoDecoder;
import webcast.api.interaction.pictionary._ReviewWordRequest_ProtoDecoder;
import webcast.api.interaction.pictionary._ReviewWordResponse_ProtoDecoder;
import webcast.api.interaction.pictionary._ReviewWordResponse_ResponseData_ProtoDecoder;
import webcast.api.interaction.pictionary._ReviewWordResponse_ReviewWordExtra_ProtoDecoder;
import webcast.api.linkmic.ApplyResponse;
import webcast.api.linkmic.GetUserLinkmicStatusResponse;
import webcast.api.linkmic.KickOutResponse;
import webcast.api.linkmic.LeaveParams;
import webcast.api.linkmic.LeaveResponse;
import webcast.api.linkmic._ApplyResponse_ApplyExtra_LogPb_ProtoDecoder;
import webcast.api.linkmic._ApplyResponse_ApplyExtra_ProtoDecoder;
import webcast.api.linkmic._ApplyResponse_ResponseData_ProtoDecoder;
import webcast.api.linkmic._GetUserLinkmicStatusResponse_ProtoDecoder;
import webcast.api.linkmic._GetUserLinkmicStatusResponse_ResponseData_ProtoDecoder;
import webcast.api.linkmic._KickOutResponse_ResponseData_ProtoDecoder;
import webcast.api.linkmic._LeaveParams_ProtoDecoder;
import webcast.api.linkmic._LeaveResponse_ProtoDecoder;
import webcast.api.linkmic._LeaveResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership.AnchorCheckAndJoinEventRequest;
import webcast.api.partnership.AnchorCheckAndJoinEventResponse;
import webcast.api.partnership.AnchorEventJoinRequest;
import webcast.api.partnership.AnchorEventJoinResponse;
import webcast.api.partnership.AnchorEventsRequest;
import webcast.api.partnership.AnchorEventsResponse;
import webcast.api.partnership.AnchorInfoRequest;
import webcast.api.partnership.AnchorInfoResponse;
import webcast.api.partnership.AnchorRoomInfoRequest;
import webcast.api.partnership.AnchorRoomInfoResponse;
import webcast.api.partnership.AnchorToggleInfoRequest;
import webcast.api.partnership.AnchorToggleInfoResponse;
import webcast.api.partnership.AudienceRoomInfoRequest;
import webcast.api.partnership.AudienceRoomInfoResponse;
import webcast.api.partnership.BenefitClaimRequest;
import webcast.api.partnership.BenefitClaimResponse;
import webcast.api.partnership.BenefitDetailRequest;
import webcast.api.partnership.BenefitDetailResponse;
import webcast.api.partnership.BenefitRecordsRequest;
import webcast.api.partnership.BenefitRecordsResponse;
import webcast.api.partnership.CancelReserveMatchScheduleRequest;
import webcast.api.partnership.CancelReserveMatchScheduleResponse;
import webcast.api.partnership.ChangeBusinessStatusRequest;
import webcast.api.partnership.ChangeBusinessStatusResponse;
import webcast.api.partnership.CommentCheckRequest;
import webcast.api.partnership.CommentCheckResponse;
import webcast.api.partnership.DisplayingTasksRequest;
import webcast.api.partnership.DisplayingTasksResponse;
import webcast.api.partnership.DropsClaimRequest;
import webcast.api.partnership.DropsClaimResponse;
import webcast.api.partnership.DropsDetailRequest;
import webcast.api.partnership.DropsDetailResponse;
import webcast.api.partnership.DropsListRequest;
import webcast.api.partnership.DropsListResponse;
import webcast.api.partnership.DropsRankListRequest;
import webcast.api.partnership.DropsRankListResponse;
import webcast.api.partnership.DropsReportRequest;
import webcast.api.partnership.DropsReportResponse;
import webcast.api.partnership.DropsRewardsRequest;
import webcast.api.partnership.DropsRewardsResponse;
import webcast.api.partnership.DropsSignRequest;
import webcast.api.partnership.DropsSignResponse;
import webcast.api.partnership.DropsStartRequest;
import webcast.api.partnership.DropsStartResponse;
import webcast.api.partnership.DropsTaskEditRequest;
import webcast.api.partnership.DropsTaskEditResponse;
import webcast.api.partnership.FeedbackTagRequest;
import webcast.api.partnership.FeedbackTagResponse;
import webcast.api.partnership.GameDetailRequest;
import webcast.api.partnership.GameDetailResponse;
import webcast.api.partnership.GetDropsStatusRequest;
import webcast.api.partnership.GetDropsStatusResponse;
import webcast.api.partnership.HideTaskRequest;
import webcast.api.partnership.HideTaskResponse;
import webcast.api.partnership.LabelFilterInfo;
import webcast.api.partnership.MatchScheduleRequest;
import webcast.api.partnership.MatchScheduleResponse;
import webcast.api.partnership.OpenAuthCheckRequest;
import webcast.api.partnership.OpenAuthCheckResponse;
import webcast.api.partnership.PunishInfo;
import webcast.api.partnership.ReserveMatchScheduleRequest;
import webcast.api.partnership.ReserveMatchScheduleResponse;
import webcast.api.partnership.ShowTaskRequest;
import webcast.api.partnership.ShowTaskResponse;
import webcast.api.partnership.SubmitCPFeedbackRequest;
import webcast.api.partnership.SubmitCPFeedbackResponse;
import webcast.api.partnership.TaskPriceUpdate;
import webcast.api.partnership.UserInfoRequest;
import webcast.api.partnership.UserInfoResponse;
import webcast.api.partnership._AnchorCheckAndJoinEventRequest_ProtoDecoder;
import webcast.api.partnership._AnchorCheckAndJoinEventResponse_ProtoDecoder;
import webcast.api.partnership._AnchorCheckAndJoinEventResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._AnchorEventJoinRequest_ProtoDecoder;
import webcast.api.partnership._AnchorEventJoinResponse_ProtoDecoder;
import webcast.api.partnership._AnchorEventJoinResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._AnchorEventsRequest_ProtoDecoder;
import webcast.api.partnership._AnchorEventsResponse_ProtoDecoder;
import webcast.api.partnership._AnchorEventsResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._AnchorInfoRequest_ProtoDecoder;
import webcast.api.partnership._AnchorInfoResponse_DropsEntrance_ProtoDecoder;
import webcast.api.partnership._AnchorInfoResponse_LabelFilterInfo_ProtoDecoder;
import webcast.api.partnership._AnchorInfoResponse_PartnershipInfo_ProtoDecoder;
import webcast.api.partnership._AnchorInfoResponse_ProtoDecoder;
import webcast.api.partnership._AnchorInfoResponse_PunishInfo_ProtoDecoder;
import webcast.api.partnership._AnchorInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._AnchorInfoResponse_TaskPriceUpdate_ProtoDecoder;
import webcast.api.partnership._AnchorInfoResponse_ToggleInfo_ProtoDecoder;
import webcast.api.partnership._AnchorRoomInfoRequest_ProtoDecoder;
import webcast.api.partnership._AnchorRoomInfoResponse_DropsInfo_ProtoDecoder;
import webcast.api.partnership._AnchorRoomInfoResponse_PartnershipInfo_ProtoDecoder;
import webcast.api.partnership._AnchorRoomInfoResponse_ProtoDecoder;
import webcast.api.partnership._AnchorRoomInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._AnchorToggleInfoRequest_ProtoDecoder;
import webcast.api.partnership._AnchorToggleInfoResponse_ProtoDecoder;
import webcast.api.partnership._AnchorToggleInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._AudienceRoomInfoRequest_ProtoDecoder;
import webcast.api.partnership._AudienceRoomInfoResponse_DropsInfo_ProtoDecoder;
import webcast.api.partnership._AudienceRoomInfoResponse_EsportsBriefMatchInfo_ProtoDecoder;
import webcast.api.partnership._AudienceRoomInfoResponse_EsportsBriefTournamentInfo_ProtoDecoder;
import webcast.api.partnership._AudienceRoomInfoResponse_PartnershipInfo_ProtoDecoder;
import webcast.api.partnership._AudienceRoomInfoResponse_ProtoDecoder;
import webcast.api.partnership._AudienceRoomInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._BenefitClaimRequest_ProtoDecoder;
import webcast.api.partnership._BenefitClaimResponse_ProtoDecoder;
import webcast.api.partnership._BenefitClaimResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._BenefitDetailRequest_ProtoDecoder;
import webcast.api.partnership._BenefitDetailResponse_ProtoDecoder;
import webcast.api.partnership._BenefitDetailResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._BenefitRecordsRequest_ProtoDecoder;
import webcast.api.partnership._BenefitRecordsResponse_ProtoDecoder;
import webcast.api.partnership._BenefitRecordsResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._CancelReserveMatchScheduleRequest_ProtoDecoder;
import webcast.api.partnership._CancelReserveMatchScheduleResponse_ProtoDecoder;
import webcast.api.partnership._CancelReserveMatchScheduleResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._ChangeBusinessStatusRequest_ProtoDecoder;
import webcast.api.partnership._ChangeBusinessStatusResponse_ProtoDecoder;
import webcast.api.partnership._CommentCheckRequest_ProtoDecoder;
import webcast.api.partnership._CommentCheckResponse_ProtoDecoder;
import webcast.api.partnership._DisplayingTasksRequest_ProtoDecoder;
import webcast.api.partnership._DisplayingTasksResponse_ProtoDecoder;
import webcast.api.partnership._DisplayingTasksResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._DropsClaimRequest_ProtoDecoder;
import webcast.api.partnership._DropsClaimResponse_ProtoDecoder;
import webcast.api.partnership._DropsClaimResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._DropsDetailRequest_ProtoDecoder;
import webcast.api.partnership._DropsDetailResponse_ProtoDecoder;
import webcast.api.partnership._DropsDetailResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._DropsListRequest_ProtoDecoder;
import webcast.api.partnership._DropsListResponse_ProtoDecoder;
import webcast.api.partnership._DropsListResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._DropsRankListRequest_ProtoDecoder;
import webcast.api.partnership._DropsRankListResponse_ProtoDecoder;
import webcast.api.partnership._DropsRankListResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._DropsReportRequest_ProtoDecoder;
import webcast.api.partnership._DropsReportResponse_ProtoDecoder;
import webcast.api.partnership._DropsRewardsRequest_ProtoDecoder;
import webcast.api.partnership._DropsRewardsResponse_ProtoDecoder;
import webcast.api.partnership._DropsRewardsResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._DropsSignRequest_ProtoDecoder;
import webcast.api.partnership._DropsSignResponse_ProtoDecoder;
import webcast.api.partnership._DropsStartRequest_ProtoDecoder;
import webcast.api.partnership._DropsStartResponse_ProtoDecoder;
import webcast.api.partnership._DropsStartResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._DropsTaskEditRequest_EditData_ProtoDecoder;
import webcast.api.partnership._DropsTaskEditRequest_ProtoDecoder;
import webcast.api.partnership._DropsTaskEditResponse_ProtoDecoder;
import webcast.api.partnership._DropsTaskEditResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._DropsTaskEditResponse_TaskResult_ProtoDecoder;
import webcast.api.partnership._FeedbackTagRequest_ProtoDecoder;
import webcast.api.partnership._FeedbackTagResponse_ProtoDecoder;
import webcast.api.partnership._FeedbackTagResponse_ResponseData_FeedbackTag_FeedbackSubTag_ProtoDecoder;
import webcast.api.partnership._FeedbackTagResponse_ResponseData_FeedbackTag_ProtoDecoder;
import webcast.api.partnership._FeedbackTagResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._GameDetailRequest_ProtoDecoder;
import webcast.api.partnership._GameDetailResponse_ProtoDecoder;
import webcast.api.partnership._GameDetailResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._GetDropsStatusRequest_ProtoDecoder;
import webcast.api.partnership._GetDropsStatusResponse_ProtoDecoder;
import webcast.api.partnership._GetDropsStatusResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._HideTaskRequest_ProtoDecoder;
import webcast.api.partnership._HideTaskResponse_ProtoDecoder;
import webcast.api.partnership._LabelFilterInfo_ProtoDecoder;
import webcast.api.partnership._MatchScheduleRequest_ProtoDecoder;
import webcast.api.partnership._MatchScheduleResponse_ProtoDecoder;
import webcast.api.partnership._MatchScheduleResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._OpenAuthCheckRequest_DropsParam_ProtoDecoder;
import webcast.api.partnership._OpenAuthCheckRequest_ProtoDecoder;
import webcast.api.partnership._OpenAuthCheckResponse_ProtoDecoder;
import webcast.api.partnership._OpenAuthCheckResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._PunishInfo_ProtoDecoder;
import webcast.api.partnership._ReserveMatchScheduleRequest_ProtoDecoder;
import webcast.api.partnership._ReserveMatchScheduleResponse_ProtoDecoder;
import webcast.api.partnership._ReserveMatchScheduleResponse_ResponseData_ProtoDecoder;
import webcast.api.partnership._ShowTaskRequest_ProtoDecoder;
import webcast.api.partnership._ShowTaskResponse_ProtoDecoder;
import webcast.api.partnership._SubmitCPFeedbackRequest_ProtoDecoder;
import webcast.api.partnership._SubmitCPFeedbackResponse_ProtoDecoder;
import webcast.api.partnership._TaskPriceUpdate_ProtoDecoder;
import webcast.api.partnership._UserInfoRequest_ProtoDecoder;
import webcast.api.partnership._UserInfoResponse_ProtoDecoder;
import webcast.api.partnership._UserInfoResponse_ResponseData_ProtoDecoder;
import webcast.api.profit.ListRequestParams;
import webcast.api.profit.ListResult;
import webcast.api.profit._ListRequestParams_ProtoDecoder;
import webcast.api.profit._ListResult_ActivityDetail_ProtoDecoder;
import webcast.api.profit._ListResult_ActivityInfo_ProtoDecoder;
import webcast.api.profit._ListResult_ExtraDiamondItem_ProtoDecoder;
import webcast.api.profit._ListResult_IapCustomData_ProtoDecoder;
import webcast.api.profit._ListResult_IapUnitPrice_ProtoDecoder;
import webcast.api.profit._ListResult_ListResultExtra_ProtoDecoder;
import webcast.api.profit._ListResult_ProtoDecoder;
import webcast.api.profit._ListResult_VoucherItem_CashbackInfo_CashbackPercentage_ProtoDecoder;
import webcast.api.profit._ListResult_VoucherItem_CashbackInfo_ProtoDecoder;
import webcast.api.profit._ListResult_VoucherItem_CashbackInfo_USDConversionRate_ProtoDecoder;
import webcast.api.profit._ListResult_VoucherItem_ProtoDecoder;
import webcast.api.profit._ListResult_VoucherItem_VoucherStarlingContent_ProtoDecoder;
import webcast.api.profit._ListResult_WebDisplayData_ProtoDecoder;
import webcast.api.ranklist.HallOfFameRankExtra;
import webcast.api.ranklist.LynxRankView;
import webcast.api.ranklist.RankExtraInfo;
import webcast.api.ranklist._HallOfFameRankExtra_ProtoDecoder;
import webcast.api.ranklist._LynxRankView_ProtoDecoder;
import webcast.api.ranklist._RankExtraInfo_ProtoDecoder;
import webcast.api.referral.ActivityInfo;
import webcast.api.referral.ComponentInfo;
import webcast.api.referral.ComponentTask;
import webcast.api.referral.ComponentTaskProcess;
import webcast.api.referral.LevelTask;
import webcast.api.referral.LevelTaskProcess;
import webcast.api.referral.LiveInfo;
import webcast.api.referral.ReferralMentorRankListReq;
import webcast.api.referral.ReferralMentorRankListResp;
import webcast.api.referral.ReferralOptOutRequest;
import webcast.api.referral.ReferralOptOutResponse;
import webcast.api.referral.ReferralSubmitEmailRequest;
import webcast.api.referral.ReferralSubmitEmailResponse;
import webcast.api.referral.Task;
import webcast.api.referral.UserInfoMeta;
import webcast.api.referral._ActivityInfo_ProtoDecoder;
import webcast.api.referral._ComponentInfo_ProtoDecoder;
import webcast.api.referral._ComponentTaskProcess_ProtoDecoder;
import webcast.api.referral._ComponentTask_ProtoDecoder;
import webcast.api.referral._LevelTaskProcess_ProtoDecoder;
import webcast.api.referral._LevelTask_ProtoDecoder;
import webcast.api.referral._LiveInfo_ProtoDecoder;
import webcast.api.referral._ReferralMentorRankListReq_ProtoDecoder;
import webcast.api.referral._ReferralMentorRankListResp_Data_ProtoDecoder;
import webcast.api.referral._ReferralMentorRankListResp_MentorRankItem_ProtoDecoder;
import webcast.api.referral._ReferralMentorRankListResp_ProtoDecoder;
import webcast.api.referral._ReferralOptOutRequest_ProtoDecoder;
import webcast.api.referral._ReferralOptOutResponse_Data_ProtoDecoder;
import webcast.api.referral._ReferralOptOutResponse_ProtoDecoder;
import webcast.api.referral._ReferralSubmitEmailRequest_ProtoDecoder;
import webcast.api.referral._ReferralSubmitEmailResponse_Data_ProtoDecoder;
import webcast.api.referral._ReferralSubmitEmailResponse_ProtoDecoder;
import webcast.api.referral._Task_ProtoDecoder;
import webcast.api.referral._Task_Reward_ProtoDecoder;
import webcast.api.referral._UserInfoMeta_ProtoDecoder;
import webcast.api.room.CollectionSongsRequest;
import webcast.api.room.CollectionSongsResponse;
import webcast.api.room.CommentFlaggedPrompt;
import webcast.api.room.CppAgeVerifyRequest;
import webcast.api.room.CppAgeVerifyResponse;
import webcast.api.room.CppSafetyEducationRequest;
import webcast.api.room.CppSafetyEducationResponse;
import webcast.api.room.CppTaskInfoRequest;
import webcast.api.room.CppTaskInfoResponse;
import webcast.api.room.EventCollectData;
import webcast.api.room.EventCollectRequest;
import webcast.api.room.EventCollectResponse;
import webcast.api.room.FavouritesPack;
import webcast.api.room.FirstScreenRequest;
import webcast.api.room.FirstScreenResponse;
import webcast.api.room.FirstScreenRoom;
import webcast.api.room.FrequencyControlData;
import webcast.api.room.FrequencyControlExtra;
import webcast.api.room.FrequencyControlParams;
import webcast.api.room.FrequencyControlResponse;
import webcast.api.room.GetOnlineRoomPCURequest;
import webcast.api.room.GetOnlineRoomPCUResponse;
import webcast.api.room.GetSandBoxRoomListRequest;
import webcast.api.room.GetSandBoxRoomListResponse;
import webcast.api.room.LivePermissionApply;
import webcast.api.room.LivePodcastRequest;
import webcast.api.room.LivePodcastResponse;
import webcast.api.room.LiveScenario;
import webcast.api.room.MockRequest;
import webcast.api.room.MockResponse;
import webcast.api.room.MusicRequest;
import webcast.api.room.MusicResponse;
import webcast.api.room.PlaylistPack;
import webcast.api.room.PreloadRoomExtra;
import webcast.api.room.PreloadRoomParams;
import webcast.api.room.PreloadRoomResponse;
import webcast.api.room.PreviewTimeReportRequest;
import webcast.api.room.PreviewTimeReportResponse;
import webcast.api.room.RecommendSensitiveWordReq;
import webcast.api.room.RecommendSensitiveWordResp;
import webcast.api.room.RoomComponentsV2Request;
import webcast.api.room.RoomComponentsV2Response;
import webcast.api.room.RoomGoalsRequest;
import webcast.api.room.RoomGoalsResponse;
import webcast.api.room.SwipingGuidanceRequest;
import webcast.api.room.SwipingGuidanceResponse;
import webcast.api.room.TryMode;
import webcast.api.room.UpdateFrequencyControlData;
import webcast.api.room.UpdateFrequencyControlExtra;
import webcast.api.room.UpdateFrequencyControlParams;
import webcast.api.room.UpdateFrequencyControlResponse;
import webcast.api.room._CollectionSongsRequest_ProtoDecoder;
import webcast.api.room._CollectionSongsResponse_PageSongs_ProtoDecoder;
import webcast.api.room._CollectionSongsResponse_ProtoDecoder;
import webcast.api.room._CommentFlaggedPrompt_ProtoDecoder;
import webcast.api.room._CppAgeVerifyRequest_ProtoDecoder;
import webcast.api.room._CppAgeVerifyResponse_Data_ProtoDecoder;
import webcast.api.room._CppAgeVerifyResponse_Extra_ProtoDecoder;
import webcast.api.room._CppAgeVerifyResponse_ProtoDecoder;
import webcast.api.room._CppSafetyEducationRequest_ProtoDecoder;
import webcast.api.room._CppSafetyEducationResponse_Data_ProtoDecoder;
import webcast.api.room._CppSafetyEducationResponse_Extra_ProtoDecoder;
import webcast.api.room._CppSafetyEducationResponse_ProtoDecoder;
import webcast.api.room._CppTaskInfoRequest_ProtoDecoder;
import webcast.api.room._CppTaskInfoResponse_Data_BanStatus_ProtoDecoder;
import webcast.api.room._CppTaskInfoResponse_Data_ProtoDecoder;
import webcast.api.room._CppTaskInfoResponse_Extra_ProtoDecoder;
import webcast.api.room._CppTaskInfoResponse_ProtoDecoder;
import webcast.api.room._EventCollectData_ProtoDecoder;
import webcast.api.room._EventCollectRequest_ProtoDecoder;
import webcast.api.room._EventCollectResponse_EventCollectExtra_ProtoDecoder;
import webcast.api.room._EventCollectResponse_ProtoDecoder;
import webcast.api.room._FavouritesPack_ProtoDecoder;
import webcast.api.room._FirstScreenRequest_ProtoDecoder;
import webcast.api.room._FirstScreenResponse_ProtoDecoder;
import webcast.api.room._FirstScreenResponse_ResponseData_ProtoDecoder;
import webcast.api.room._FirstScreenRoom_ProtoDecoder;
import webcast.api.room._FrequencyControlData_ProtoDecoder;
import webcast.api.room._FrequencyControlExtra_ProtoDecoder;
import webcast.api.room._FrequencyControlParams_ProtoDecoder;
import webcast.api.room._FrequencyControlResponse_ProtoDecoder;
import webcast.api.room._GetOnlineRoomPCURequest_ProtoDecoder;
import webcast.api.room._GetOnlineRoomPCUResponse_ProtoDecoder;
import webcast.api.room._GetOnlineRoomPCUResponse_ResponseData_ProtoDecoder;
import webcast.api.room._GetSandBoxRoomListRequest_ProtoDecoder;
import webcast.api.room._GetSandBoxRoomListResponse_ProtoDecoder;
import webcast.api.room._GetSandBoxRoomListResponse_ResponseData_ProtoDecoder;
import webcast.api.room._GetSandBoxRoomListResponse_SandBoxRoom_ProtoDecoder;
import webcast.api.room._LivePermissionApply_ProtoDecoder;
import webcast.api.room._LivePodcastRequest_ProtoDecoder;
import webcast.api.room._LivePodcastResponse_ProtoDecoder;
import webcast.api.room._LivePodcastResponse_ResponseData_ProtoDecoder;
import webcast.api.room._LiveScenario_ProtoDecoder;
import webcast.api.room._MockRequest_ProtoDecoder;
import webcast.api.room._MockResponse_Data_ProtoDecoder;
import webcast.api.room._MockResponse_GuideVideoURL_ProtoDecoder;
import webcast.api.room._MockResponse_ProtoDecoder;
import webcast.api.room._MusicRequest_ProtoDecoder;
import webcast.api.room._MusicResponse_Pack_ProtoDecoder;
import webcast.api.room._MusicResponse_Packs_ProtoDecoder;
import webcast.api.room._MusicResponse_ProtoDecoder;
import webcast.api.room._PlaylistPack_ProtoDecoder;
import webcast.api.room._PreloadRoomExtra_ProtoDecoder;
import webcast.api.room._PreloadRoomParams_ProtoDecoder;
import webcast.api.room._PreloadRoomResponse_ProtoDecoder;
import webcast.api.room._PreviewTimeReportRequest_ProtoDecoder;
import webcast.api.room._PreviewTimeReportResponse_ProtoDecoder;
import webcast.api.room._PreviewTimeReportResponse_ResponseData_ProtoDecoder;
import webcast.api.room._RecommendSensitiveWordReq_ProtoDecoder;
import webcast.api.room._RecommendSensitiveWordResp_ProtoDecoder;
import webcast.api.room._RecommendSensitiveWordResp_ResponseData_ProtoDecoder;
import webcast.api.room._RoomComponentsV2Request_ProtoDecoder;
import webcast.api.room._RoomComponentsV2Response_ProtoDecoder;
import webcast.api.room._RoomGoalsRequest_ProtoDecoder;
import webcast.api.room._RoomGoalsResponse_ProtoDecoder;
import webcast.api.room._SwipingGuidanceRequest_ProtoDecoder;
import webcast.api.room._SwipingGuidanceResponse_ProtoDecoder;
import webcast.api.room._SwipingGuidanceResponse_ResponseData_ProtoDecoder;
import webcast.api.room._TryMode_ProtoDecoder;
import webcast.api.room._UpdateFrequencyControlData_ProtoDecoder;
import webcast.api.room._UpdateFrequencyControlExtra_ProtoDecoder;
import webcast.api.room._UpdateFrequencyControlParams_ProtoDecoder;
import webcast.api.room._UpdateFrequencyControlResponse_ProtoDecoder;
import webcast.api.sub.CreateTimerRequest;
import webcast.api.sub.CreateTimerResponse;
import webcast.api.sub.GetAnchorSubscriberListResponse;
import webcast.api.sub.GetAnchorSubscriptionResponse;
import webcast.api.sub.GetSubGoalRequest;
import webcast.api.sub.GetSubGoalResponse;
import webcast.api.sub.GetSubH5SharePageRequest;
import webcast.api.sub.GetSubH5SharePageResponse;
import webcast.api.sub.GetSubPrivilegeDetailRequest;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.GetTimerSubscriberListRequest;
import webcast.api.sub.GetTimerSubscriberListResponse;
import webcast.api.sub.GetUserSubInfoRequest;
import webcast.api.sub.GetUserSubInfoResponse;
import webcast.api.sub.GiftSubInfoData;
import webcast.api.sub.GiftSubInfoRequest;
import webcast.api.sub.GiftSubInfoResponse;
import webcast.api.sub.GiftSubTemplateInfo;
import webcast.api.sub.GiftSubTemplateListData;
import webcast.api.sub.GiftSubTemplateListRequest;
import webcast.api.sub.GiftSubTemplateListResponse;
import webcast.api.sub.ImageConvertRequest;
import webcast.api.sub.ImageConvertResponse;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.PerksPinPanel;
import webcast.api.sub.SpotlightRequest;
import webcast.api.sub.SpotlightResponse;
import webcast.api.sub.SpotlightUpdateItem;
import webcast.api.sub.SpotlightUpdateRequest;
import webcast.api.sub.SpotlightUpdateResponse;
import webcast.api.sub.SubGoal;
import webcast.api.sub.SubManagementRequest;
import webcast.api.sub.SubManagementResponse;
import webcast.api.sub.SubPinRequest;
import webcast.api.sub.SubPinResponse;
import webcast.api.sub.SubUnPinRequest;
import webcast.api.sub.SubUnPinResponse;
import webcast.api.sub.SubscriberCountInfo;
import webcast.api.sub.SubscriberMsg;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;
import webcast.api.sub.TemplateListRequest;
import webcast.api.sub.TemplateListResponse;
import webcast.api.sub._CreateTimerRequest_ProtoDecoder;
import webcast.api.sub._CreateTimerResponse_Data_ProtoDecoder;
import webcast.api.sub._CreateTimerResponse_ProtoDecoder;
import webcast.api.sub._GetAnchorSubscriberListResponse_Data_ProtoDecoder;
import webcast.api.sub._GetAnchorSubscriberListResponse_ProtoDecoder;
import webcast.api.sub._GetAnchorSubscriptionResponse_Data_ProtoDecoder;
import webcast.api.sub._GetAnchorSubscriptionResponse_ProtoDecoder;
import webcast.api.sub._GetSubGoalRequest_ProtoDecoder;
import webcast.api.sub._GetSubGoalResponse_Data_ProtoDecoder;
import webcast.api.sub._GetSubGoalResponse_ProtoDecoder;
import webcast.api.sub._GetSubGoalResponse_SubGoalHistoryInfo_ProtoDecoder;
import webcast.api.sub._GetSubGoalResponse_SubPin_ProtoDecoder;
import webcast.api.sub._GetSubH5SharePageRequest_ProtoDecoder;
import webcast.api.sub._GetSubH5SharePageResponse_Data_ProtoDecoder;
import webcast.api.sub._GetSubH5SharePageResponse_Data_SubNoteInfo_ProtoDecoder;
import webcast.api.sub._GetSubH5SharePageResponse_Data_SubscribePermission_ProtoDecoder;
import webcast.api.sub._GetSubH5SharePageResponse_ProtoDecoder;
import webcast.api.sub._GetSubPrivilegeDetailRequest_ProtoDecoder;
import webcast.api.sub._GetSubPrivilegeDetailResponse_Data_ProtoDecoder;
import webcast.api.sub._GetSubPrivilegeDetailResponse_Data_SubNoteInfo_ProtoDecoder;
import webcast.api.sub._GetSubPrivilegeDetailResponse_Data_SubscribePermission_ProtoDecoder;
import webcast.api.sub._GetSubPrivilegeDetailResponse_ProtoDecoder;
import webcast.api.sub._GetTimerSubscriberListRequest_ProtoDecoder;
import webcast.api.sub._GetTimerSubscriberListResponse_Data_ProtoDecoder;
import webcast.api.sub._GetTimerSubscriberListResponse_ProtoDecoder;
import webcast.api.sub._GetUserSubInfoRequest_ProtoDecoder;
import webcast.api.sub._GetUserSubInfoResponse_Data_ProtoDecoder;
import webcast.api.sub._GetUserSubInfoResponse_ProtoDecoder;
import webcast.api.sub._GiftSubInfoData_ProtoDecoder;
import webcast.api.sub._GiftSubInfoRequest_ProtoDecoder;
import webcast.api.sub._GiftSubInfoResponse_Data_ProtoDecoder;
import webcast.api.sub._GiftSubInfoResponse_ProtoDecoder;
import webcast.api.sub._GiftSubTemplateInfo_ProtoDecoder;
import webcast.api.sub._GiftSubTemplateListData_ProtoDecoder;
import webcast.api.sub._GiftSubTemplateListRequest_ProtoDecoder;
import webcast.api.sub._GiftSubTemplateListResponse_ProtoDecoder;
import webcast.api.sub._ImageConvertRequest_ProtoDecoder;
import webcast.api.sub._ImageConvertResponse_Data_ProtoDecoder;
import webcast.api.sub._ImageConvertResponse_Images_ProtoDecoder;
import webcast.api.sub._ImageConvertResponse_ProtoDecoder;
import webcast.api.sub._OfferInfo_ProtoDecoder;
import webcast.api.sub._PerksPinPanel_ProtoDecoder;
import webcast.api.sub._SpotlightRequest_ProtoDecoder;
import webcast.api.sub._SpotlightResponse_ProtoDecoder;
import webcast.api.sub._SpotlightResponse_ResponseData_ProtoDecoder;
import webcast.api.sub._SpotlightUpdateItem_ProtoDecoder;
import webcast.api.sub._SpotlightUpdateRequest_ProtoDecoder;
import webcast.api.sub._SpotlightUpdateResponse_ProtoDecoder;
import webcast.api.sub._SpotlightUpdateResponse_ResponseData_ProtoDecoder;
import webcast.api.sub._SubGoal_ProtoDecoder;
import webcast.api.sub._SubManagementRequest_ProtoDecoder;
import webcast.api.sub._SubManagementResponse_Data_ProtoDecoder;
import webcast.api.sub._SubManagementResponse_ProtoDecoder;
import webcast.api.sub._SubPinRequest_ProtoDecoder;
import webcast.api.sub._SubPinResponse_ProtoDecoder;
import webcast.api.sub._SubUnPinRequest_ProtoDecoder;
import webcast.api.sub._SubUnPinResponse_ProtoDecoder;
import webcast.api.sub._SubscriberCountInfo_ProtoDecoder;
import webcast.api.sub._SubscriberMsg_ProtoDecoder;
import webcast.api.sub._TagInfo_ProtoDecoder;
import webcast.api.sub._TemplateInfo_ProtoDecoder;
import webcast.api.sub._TemplateListData_ProtoDecoder;
import webcast.api.sub._TemplateListRequest_ProtoDecoder;
import webcast.api.sub._TemplateListResponse_ProtoDecoder;
import webcast.api.sub._Tip_ProtoDecoder;
import webcast.api.user.MultiUserRequestParams;
import webcast.api.user.MultiUserResponse;
import webcast.api.user.RelationData;
import webcast.api.user.RelationExtra;
import webcast.api.user.RelationRequestParams;
import webcast.api.user.RelationResponse;
import webcast.api.user.UpdateBlockStatusRequestParams;
import webcast.api.user.UpdateBlockStatusResponse;
import webcast.api.user.UserExtra;
import webcast.api.user.UserInfoMeResponse;
import webcast.api.user.UserInfoRequestParams;
import webcast.api.user.UserRequestParams;
import webcast.api.user.UserResponse;
import webcast.api.user._MultiUserRequestParams_ProtoDecoder;
import webcast.api.user._MultiUserResponse_ProtoDecoder;
import webcast.api.user._RelationData_ProtoDecoder;
import webcast.api.user._RelationExtra_ProtoDecoder;
import webcast.api.user._RelationRequestParams_ProtoDecoder;
import webcast.api.user._RelationResponse_ProtoDecoder;
import webcast.api.user._UpdateBlockStatusRequestParams_ProtoDecoder;
import webcast.api.user._UpdateBlockStatusResponse_ProtoDecoder;
import webcast.api.user._UserExtra_ProtoDecoder;
import webcast.api.user._UserInfoMeResponse_ProtoDecoder;
import webcast.api.user._UserInfoRequestParams_ProtoDecoder;
import webcast.api.user._UserRequestParams_ProtoDecoder;
import webcast.api.user._UserResponse_ProtoDecoder;
import webcast.data.AnchorUser;
import webcast.data.AppealInfo;
import webcast.data.BagItem;
import webcast.data.BagItemPreUpdateInfo;
import webcast.data.DiscordEntrance;
import webcast.data.EventCard;
import webcast.data.FansBannerConfig;
import webcast.data.FansConfig;
import webcast.data.FansDiscordGuildInfo;
import webcast.data.FansDiscordRoleInfo;
import webcast.data.FansLevelInfo;
import webcast.data.FansLevelShowConfig;
import webcast.data.FansPrivilege;
import webcast.data.FansPrivilegeBackground;
import webcast.data.FansPrivilegeDetail;
import webcast.data.FansPrivilegeRichText;
import webcast.data.FansScoreRule;
import webcast.data.FansTask;
import webcast.data.FansTaskAverageRewardConfig;
import webcast.data.FansTaskConfig;
import webcast.data.FansTaskLevelRewardConfig;
import webcast.data.FansUpgradeBarrageEffectConfig;
import webcast.data.FansUpgradeDynamicEffectConfig;
import webcast.data.FansUpgradePrivilege;
import webcast.data.Hello;
import webcast.data.InteractionConflict;
import webcast.data.InteractionConflictItem;
import webcast.data.MsgFilter;
import webcast.data.MultiGuestLinkmicInfo;
import webcast.data.MusicCollection;
import webcast.data.MusicSong;
import webcast.data.RankUser;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeLiveCenterShopData;
import webcast.data.RealtimeLiveCenterTips;
import webcast.data.RealtimeViolationRecord;
import webcast.data.RechargeCustomError;
import webcast.data.RechargePopUpContentReplace;
import webcast.data.ReqSong;
import webcast.data.RoomMultiGuestLinkmicInfo;
import webcast.data.SlotFansRecord;
import webcast.data.StandardMoney;
import webcast.data.TimeStruct;
import webcast.data.UserIdentity;
import webcast.data._AnchorUser_ProtoDecoder;
import webcast.data._AppealInfo_ProtoDecoder;
import webcast.data._BagItemPreUpdateInfo_ProtoDecoder;
import webcast.data._BagItem_ProtoDecoder;
import webcast.data._DiscordEntrance_ProtoDecoder;
import webcast.data._EventCard_ProtoDecoder;
import webcast.data._FansBannerConfig_ProtoDecoder;
import webcast.data._FansConfig_ProtoDecoder;
import webcast.data._FansDiscordGuildInfo_ProtoDecoder;
import webcast.data._FansDiscordRoleInfo_ProtoDecoder;
import webcast.data._FansLevelInfo_ProtoDecoder;
import webcast.data._FansLevelShowConfig_ProtoDecoder;
import webcast.data._FansPrivilegeBackground_ProtoDecoder;
import webcast.data._FansPrivilegeDetail_ProtoDecoder;
import webcast.data._FansPrivilegeRichText_ProtoDecoder;
import webcast.data._FansPrivilege_ProtoDecoder;
import webcast.data._FansScoreRule_ProtoDecoder;
import webcast.data._FansTaskAverageRewardConfig_ProtoDecoder;
import webcast.data._FansTaskConfig_ProtoDecoder;
import webcast.data._FansTaskLevelRewardConfig_ProtoDecoder;
import webcast.data._FansTask_ProtoDecoder;
import webcast.data._FansUpgradeBarrageEffectConfig_ProtoDecoder;
import webcast.data._FansUpgradeDynamicEffectConfig_ProtoDecoder;
import webcast.data._FansUpgradePrivilege_ProtoDecoder;
import webcast.data._Hello_ProtoDecoder;
import webcast.data._InteractionConflictItem_ProtoDecoder;
import webcast.data._InteractionConflict_ProtoDecoder;
import webcast.data._MsgFilter_ProtoDecoder;
import webcast.data._MultiGuestLinkmicInfo_ListUser_ProtoDecoder;
import webcast.data._MultiGuestLinkmicInfo_ProtoDecoder;
import webcast.data._MusicCollection_ProtoDecoder;
import webcast.data._MusicSong_ProtoDecoder;
import webcast.data._RealtimeLiveCenterBaseData_ProtoDecoder;
import webcast.data._RealtimeLiveCenterShopData_ProtoDecoder;
import webcast.data._RealtimeLiveCenterTips_ProtoDecoder;
import webcast.data._RealtimeViolationRecord_ProtoDecoder;
import webcast.data._RechargeCustomError_ProtoDecoder;
import webcast.data._RechargePopUpContentReplace_ProtoDecoder;
import webcast.data._ReqSong_ProtoDecoder;
import webcast.data._RoomMultiGuestLinkmicInfo_ProtoDecoder;
import webcast.data._SlotFansRecord_ProtoDecoder;
import webcast.data._StandardMoney_ProtoDecoder;
import webcast.data._TimeStruct_ProtoDecoder;
import webcast.data._UserIdentity_ProtoDecoder;
import webcast.data.cohost_biz.BizJoinGroupParams;
import webcast.data.cohost_biz.BizJoinGroupResponse;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;
import webcast.data.cohost_biz.BizLeaveJoinGroupResponse;
import webcast.data.cohost_biz.BizPermitJoinGroupParams;
import webcast.data.cohost_biz.BizPermitJoinGroupResponse;
import webcast.data.cohost_biz.BizRechargeResponse;
import webcast.data.cohost_biz._BizJoinGroupParams_ProtoDecoder;
import webcast.data.cohost_biz._BizJoinGroupResponse_ProtoDecoder;
import webcast.data.cohost_biz._BizJoinGroupResponse_ResponseData_ProtoDecoder;
import webcast.data.cohost_biz._BizLeaveJoinGroupParams_ProtoDecoder;
import webcast.data.cohost_biz._BizLeaveJoinGroupResponse_ProtoDecoder;
import webcast.data.cohost_biz._BizPermitJoinGroupParams_ProtoDecoder;
import webcast.data.cohost_biz._BizPermitJoinGroupResponse_ProtoDecoder;
import webcast.data.cohost_biz._BizPermitJoinGroupResponse_ResponseData_ProtoDecoder;
import webcast.data.cohost_biz._BizRechargeResponse_ProtoDecoder;
import webcast.data.cohost_biz._BizRechargeResponse_ResponseData_ProtoDecoder;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_play._ShowConfig_ProtoDecoder;
import webcast.data.multi_guest_play._ShowContent_ProtoDecoder;
import webcast.data.multi_guest_play._ShowListUser_ProtoDecoder;
import webcast.data.multilive_biz.BizChangeLayoutParams;
import webcast.data.multilive_biz.BizInviteParams;
import webcast.data.multilive_biz.BizResumeParams;
import webcast.data.multilive_biz.BizResumeResponse;
import webcast.data.multilive_biz._BizChangeLayoutParams_ProtoDecoder;
import webcast.data.multilive_biz._BizInviteParams_ProtoDecoder;
import webcast.data.multilive_biz._BizResumeParams_ProtoDecoder;
import webcast.data.multilive_biz._BizResumeResponse_ProtoDecoder;
import webcast.data.multilive_biz._BizResumeResponse_ResponseData_ProtoDecoder;
import webcast.im.CancelJoinGroupContent;
import webcast.im.CohostContent;
import webcast.im.DECCDataAnnotation;
import webcast.im.DECCSchemaAnnotation;
import webcast.im.GroupChangeContent;
import webcast.im.JoinGroupBizContent;
import webcast.im.JoinGroupContent;
import webcast.im.JoinGroupMessageExtra;
import webcast.im.KickOutBizContent;
import webcast.im.LeaveJoinGroupContent;
import webcast.im.LinkStateMessage;
import webcast.im.ListChangeBizContent;
import webcast.im.LiveShowMessage;
import webcast.im.P2PGroupChangeContent;
import webcast.im.PermitJoinGroupBizContent;
import webcast.im.PermitJoinGroupContent;
import webcast.im.PreviewRoom;
import webcast.im._CancelJoinGroupContent_ProtoDecoder;
import webcast.im._CohostContent_ProtoDecoder;
import webcast.im._DECCDataAnnotation_ProtoDecoder;
import webcast.im._DECCSchemaAnnotation_ProtoDecoder;
import webcast.im._GroupChangeContent_ProtoDecoder;
import webcast.im._JoinGroupBizContent_ProtoDecoder;
import webcast.im._JoinGroupContent_ProtoDecoder;
import webcast.im._JoinGroupMessageExtra_ProtoDecoder;
import webcast.im._JoinGroupMessageExtra_RivalExtra_AuthenticationInfo_ProtoDecoder;
import webcast.im._JoinGroupMessageExtra_RivalExtra_ProtoDecoder;
import webcast.im._KickOutBizContent_ProtoDecoder;
import webcast.im._LeaveJoinGroupContent_ProtoDecoder;
import webcast.im._LinkStateMessage_ProtoDecoder;
import webcast.im._ListChangeBizContent_ProtoDecoder;
import webcast.im._LiveShowMessage_ProtoDecoder;
import webcast.im._P2PGroupChangeContent_ProtoDecoder;
import webcast.im._PermitJoinGroupBizContent_ProtoDecoder;
import webcast.im._PermitJoinGroupContent_ProtoDecoder;
import webcast.im._PreviewRoom_ProtoDecoder;

/* renamed from: X.0Vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08710Vv {
    public static final Class[] LIZ = new Class[2339];

    static {
        LIZJ();
    }

    public static void LIZJ() {
        Class[] clsArr = LIZ;
        clsArr[0] = HashtagResponse.class;
        clsArr[1] = ImageModel.class;
        clsArr[2] = ImageModel.Content.class;
        clsArr[3] = RankRoundBanner.class;
        clsArr[4] = EmoteConfig.class;
        clsArr[5] = EmoteModel.class;
        clsArr[6] = EmoteWithIndex.class;
        clsArr[7] = FeedExtra.class;
        clsArr[8] = FeedExtra.LogPb.class;
        clsArr[9] = RankUser.class;
        clsArr[10] = Ranking.class;
        clsArr[11] = OnlineRankConfig.class;
        clsArr[12] = OnlineRankListResponse.class;
        clsArr[13] = RoomComponentsResponse.class;
        clsArr[14] = ArrowConfig.class;
        clsArr[15] = AvatarFrame.class;
        clsArr[16] = BadgeStruct.class;
        clsArr[17] = BadgeText.class;
        clsArr[18] = CombineBadgeBackground.class;
        clsArr[19] = CombineBadgeStruct.class;
        clsArr[20] = EntranceEffect.class;
        clsArr[21] = FollowInfo.class;
        clsArr[22] = FontStyle.class;
        clsArr[23] = IconConfig.class;
        clsArr[24] = ImageBadge.class;
        clsArr[25] = NumberConfig.class;
        clsArr[26] = PaddingInfo.class;
        clsArr[27] = PrivilegeLogExtra.class;
        clsArr[28] = ProfileCardPanel.class;
        clsArr[29] = ProfileContent.class;
        clsArr[30] = ProjectionConfig.class;
        clsArr[31] = SeparatorConfig.class;
        clsArr[32] = StringBadge.class;
        clsArr[33] = SubscribeBadge.class;
        clsArr[34] = SubscribeInfo.class;
        clsArr[35] = TextBadge.class;
        clsArr[36] = User.class;
        clsArr[37] = User.ComboBadgeInfo.class;
        clsArr[38] = User.FansClubInfo.class;
        clsArr[39] = User.OwnRoom.class;
        clsArr[40] = BattleFinishRequest.class;
        clsArr[41] = BattleFinishResult.class;
        clsArr[42] = BattleFinishResult.ResponseData.class;
        clsArr[43] = BattleInviteRequestParams.class;
        clsArr[44] = BattleInviteResult.class;
        clsArr[45] = BattleInviteResult.ResponseData.class;
        clsArr[46] = PrepareBattleRequest.class;
        clsArr[47] = PrepareBattleResponse.class;
        clsArr[48] = PrepareBattleResponse.ResponseData.class;
        clsArr[49] = ActivityBannerParams.class;
        clsArr[50] = ActivityBannerResponse.class;
        clsArr[51] = ActivityBannerResponse.BannerInfo.class;
        clsArr[52] = ActivityBannerResponse.ResponseData.class;
        clsArr[53] = AnchorClientList.class;
        clsArr[54] = AudienceMultiGuestPermissionParams.class;
        clsArr[55] = AudienceMultiGuestPermissionResponseData.class;
        clsArr[56] = BannerAction.class;
        clsArr[57] = BannerContentMultiGuest.class;
        clsArr[58] = ChannelMessage.class;
        clsArr[59] = CheckActivityRoomParams.class;
        clsArr[60] = CheckActivityRoomResponse.class;
        clsArr[61] = CheckActivityRoomResponse.ResponseData.class;
        clsArr[62] = CreateShowParams.class;
        clsArr[63] = CreateShowParams.ListUser.class;
        clsArr[64] = CreateShowResponse.class;
        clsArr[65] = CreateShowResponse.ResponseData.class;
        clsArr[66] = EndShowParams.class;
        clsArr[67] = EndShowResponse.class;
        clsArr[68] = EndShowResponse.ResponseData.class;
        clsArr[69] = EnlargeScreenManageParams.class;
        clsArr[70] = EnlargeScreenManageResponse.class;
        clsArr[71] = EnlargeScreenManageResponse.Extra.class;
        clsArr[72] = EnlargeScreenManageResponse.ResponseData.class;
        clsArr[73] = FanTicketRanklistParams.class;
        clsArr[74] = FanTicketRanklistResponse.class;
        clsArr[75] = FanTicketRanklistResponse.Extra.class;
        clsArr[76] = FanTicketRanklistResponse.RanklistUser.class;
        clsArr[77] = FanTicketRanklistResponse.ResponseData.class;
        clsArr[78] = FinishShowingGuestParams.class;
        clsArr[79] = FinishShowingGuestResponse.class;
        clsArr[80] = FinishShowingGuestResponse.ResponseData.class;
        clsArr[81] = GetGuestSettingParams.class;
        clsArr[82] = GetGuestSettingResponse.class;
        clsArr[83] = GetGuestSettingResponse.ResponseData.class;
        clsArr[84] = GetLeaveLinkmicPanelParams.class;
        clsArr[85] = GetLeaveLinkmicPanelResponse.class;
        clsArr[86] = GetLeaveLinkmicPanelResponse.ResponseData.class;
        clsArr[87] = GetLinkMicAdParams.class;
        clsArr[88] = GetLinkMicAdResponse.class;
        clsArr[89] = GetLinkMicAdResponse.ResponseData.class;
        clsArr[90] = GetMultiGuestBonusParams.class;
        clsArr[91] = GetMultiGuestBonusResponse.class;
        clsArr[92] = GetMultiGuestBonusResponse.ResponseData.class;
        clsArr[93] = GetSharedInviteePanelParams.class;
        clsArr[94] = GetSharedInviteePanelResponse.class;
        clsArr[95] = GetSharedInviteePanelResponse.ResponseData.class;
        clsArr[96] = GetShowContentParams.class;
        clsArr[97] = GetShowContentResponse.class;
        clsArr[98] = GetShowContentResponse.ResponseData.class;
        clsArr[99] = GetShowRankParams.class;
        clsArr[100] = GetShowRankResponse.class;
        clsArr[101] = GetShowRankResponse.ResponseData.class;
        clsArr[102] = GetShowRankResponse.ShowRankUser.class;
        clsArr[103] = GetShowSettingsParams.class;
        clsArr[104] = GetShowSettingsResponse.class;
        clsArr[105] = GetShowSettingsResponse.ResponseData.class;
        clsArr[106] = GuestClientList.class;
        clsArr[107] = GuestMicCameraManageParams.class;
        clsArr[108] = GuestMicCameraManageResponse.class;
        clsArr[109] = GuestMicCameraManageResponse.Extra.class;
        clsArr[110] = GuestMicCameraManageResponse.ResponseData.class;
        clsArr[111] = HostCheckOtherAudienceMultiGuestPermissionParams.class;
        clsArr[112] = HostCheckOtherAudienceMultiGuestPermissionResponse.class;
        clsArr[113] = HostCheckOtherAudienceMultiGuestPermissionResponse.Extra.class;
        clsArr[114] = HostCheckOtherAudienceMultiGuestPermissionResponse.ResponseData.class;
        clsArr[115] = HostMultiGuestPermissionParams.class;
        clsArr[116] = InRoomMultiGuestBanner.class;
        clsArr[117] = LeaveLinkmicPanelSuggestUser.class;
        clsArr[118] = LinkedUser.class;
        clsArr[119] = ListByTypeParams.class;
        clsArr[120] = ListByTypeResponse.class;
        clsArr[121] = ListByTypeResponse.Extra.class;
        clsArr[122] = ListByTypeResponse.GiftScoreAppliedUser.class;
        clsArr[123] = ListByTypeResponse.MultiGuestBonus.class;
        clsArr[124] = ListByTypeResponse.ReservedUser.class;
        clsArr[125] = MultiGuestPermissionInfo.class;
        clsArr[126] = MultiGuestReserveReqParams.class;
        clsArr[127] = MultiGuestReserveResponse.class;
        clsArr[128] = MultiGuestReserveResponse.Extra.class;
        clsArr[129] = MultiGuestReserveResponse.ResponseData.class;
        clsArr[130] = MultiLiveGuestInfoList.class;
        clsArr[131] = ReplyInvitationPanelInfo.class;
        clsArr[132] = ReportLinkMessageReq.class;
        clsArr[133] = ReportLinkMessageResp.class;
        clsArr[134] = RoomHostMultiGuestPermissionInfo.class;
        clsArr[135] = SharedInvitationCallbackParams.class;
        clsArr[136] = SharedInvitationCallbackResponse.class;
        clsArr[137] = SharedInvitationCallbackResponse.ResponseData.class;
        clsArr[138] = ShowAgainGuestParams.class;
        clsArr[139] = ShowAgainGuestResponse.class;
        clsArr[140] = ShowAgainGuestResponse.ResponseData.class;
        clsArr[141] = UpdateGuestSettingParams.class;
        clsArr[142] = UpdateGuestSettingResponse.class;
        clsArr[143] = UpdateGuestSettingResponse.Extra.class;
        clsArr[144] = UpdateGuestSettingResponse.ResponseData.class;
        clsArr[145] = UpdateShowContentParams.class;
        clsArr[146] = UpdateShowContentResponse.class;
        clsArr[147] = UpdateShowContentResponse.ResponseData.class;
        clsArr[148] = WaitUser.class;
        clsArr[149] = CreateContractRequest.class;
        clsArr[150] = CreateContractResponse.class;
        clsArr[151] = CreateContractResponse.ResponseExtra.class;
        clsArr[152] = CreateContractResult.class;
        clsArr[153] = CreateGiftSubContractRequest.class;
        clsArr[154] = CreateGiftSubContractResponse.class;
        clsArr[155] = CreateGiftSubContractResponse.ResponseExtra.class;
        clsArr[156] = CreateGiftSubContractResult.class;
        clsArr[157] = CurrencyPriceItem.class;
        clsArr[158] = CustomizedDiamond.class;
        clsArr[159] = FirstChargeRequestParams.class;
        clsArr[160] = QuizAnchorInfo.class;
        clsArr[161] = QuizAnswerInfo.class;
        clsArr[162] = QuizCallUpWebview.class;
        clsArr[163] = QuizFinalResult.class;
        clsArr[164] = QuizImage.class;
        clsArr[165] = QuizNextQuiz.class;
        clsArr[166] = QuizQuestionInfo.class;
        clsArr[167] = QuizQuestionOption.class;
        clsArr[168] = QuizRewardRule.class;
        clsArr[169] = QuizRewardRule.RewardItem.class;
        clsArr[170] = QuizRulesIntroduction.class;
        clsArr[171] = QuizStatistics.class;
        clsArr[172] = QuizStatistics.OptionCountItem.class;
        clsArr[173] = QuizUserIdentityInfo.class;
        clsArr[174] = QuizUserQuestionResult.class;
        clsArr[175] = UserLiveEventInfo.class;
        clsArr[176] = BattleRecentContribRequest.class;
        clsArr[177] = BattleRecentContribResponse.class;
        clsArr[178] = BattleRecentContribResponse.ResponseData.class;
        clsArr[179] = BattleTriggerGuideRequest.class;
        clsArr[180] = BattleTriggerGuideResponse.class;
        clsArr[181] = BattleTriggerGuideResponse.ResponseData.class;
        clsArr[182] = BoostedUsersPoint.class;
        clsArr[183] = LiveGiftBoostCardAckResponse.class;
        clsArr[184] = LiveGiftBoostCardUserStatusResponse.class;
        clsArr[185] = AboutMeInfo.class;
        clsArr[186] = AnchorEmailInfo.class;
        clsArr[187] = AnchorSubWaveChallengeSettings.class;
        clsArr[188] = AnchorSubWaveCurrentSettings.class;
        clsArr[189] = AnchorSubWaveSettingsConfig.class;
        clsArr[190] = AnchorSubWaveTriggerSettings.class;
        clsArr[191] = Badge.class;
        clsArr[192] = BadgeConfig.class;
        clsArr[193] = BadgeDetail.class;
        clsArr[194] = BadgeInfo.class;
        clsArr[195] = BadgeLimit.class;
        clsArr[196] = BadgePreview.class;
        clsArr[197] = BenefitView.class;
        clsArr[198] = C2CTransformationPageInfo.class;
        clsArr[199] = CommunityContent.class;
        clsArr[200] = CommunityDetail.class;
        clsArr[201] = CommunityIDInfo.class;
        clsArr[202] = EmoteInfo.class;
        clsArr[203] = GraceInfo.class;
        clsArr[204] = LevelBadge.class;
        clsArr[205] = LiveSubOnlyConfig.class;
        clsArr[206] = NoteContent.class;
        clsArr[207] = NoteDetail.class;
        clsArr[208] = NoteInfo.class;
        clsArr[209] = OriginBadgeInfo.class;
        clsArr[210] = Perk.class;
        clsArr[211] = PriceChangeInfo.class;
        clsArr[212] = PriceTier.class;
        clsArr[213] = PriceTierInfo.class;
        clsArr[214] = PrivateEmoteDetail.class;
        clsArr[215] = SOVBriefInfo.class;
        clsArr[216] = SOVMaskInfo.class;
        clsArr[217] = ShareInfo.class;
        clsArr[218] = SpotlightInfo.class;
        clsArr[219] = SpotlightItem.class;
        clsArr[220] = SubAdminPermission.class;
        clsArr[221] = SubBenefit.class;
        clsArr[222] = SubCustomizedBenefit.class;
        clsArr[223] = SubCustomizedBenefitMedia.class;
        clsArr[224] = SubGoalPinCard.class;
        clsArr[225] = SubInfo.class;
        clsArr[226] = SubLevel.class;
        clsArr[227] = SubOnlyVideosBriefInfo.class;
        clsArr[228] = SubPinCard.class;
        clsArr[229] = SubPinCard.Text.class;
        clsArr[230] = SubPinCardText.class;
        clsArr[231] = SubTaskInfo.class;
        clsArr[232] = SubTimerSticker.class;
        clsArr[233] = SubWaveImMsg.class;
        clsArr[234] = SubWaveInfo.class;
        clsArr[235] = SubWaveInfoCommon.class;
        clsArr[236] = SubWaveSubscriberInfo.class;
        clsArr[237] = TimerConfig.class;
        clsArr[238] = TimerDetail.class;
        clsArr[239] = ToolsInfo.class;
        clsArr[240] = WaveReward.class;
        clsArr[241] = AnchorLinkmicUserSettings.class;
        clsArr[242] = ApplyParams.class;
        clsArr[243] = ApplyResponse.class;
        clsArr[244] = AutoMatchBanner.class;
        clsArr[245] = AutoMatchReq.class;
        clsArr[246] = AutoMatchResp.class;
        clsArr[247] = AutoMatchResp.ResponseData.class;
        clsArr[248] = CohostListParams.class;
        clsArr[249] = CohostListResponse.class;
        clsArr[250] = CohostListResponse.ResponseData.class;
        clsArr[251] = GetSettingsParams.class;
        clsArr[252] = GetSettingsResponse.class;
        clsArr[253] = GuidePopupBanner.class;
        clsArr[254] = InitParams.class;
        clsArr[255] = InitResponse.class;
        clsArr[256] = InviteExtra.class;
        clsArr[257] = InviteExtra.LogPb.class;
        clsArr[258] = InviteParams.class;
        clsArr[259] = InviteResponse.class;
        clsArr[260] = JoinChannelParams.class;
        clsArr[261] = JoinChannelResponse.class;
        clsArr[262] = JoinChannelResponse.ResponseData.class;
        clsArr[263] = LinkGetSettingResult.class;
        clsArr[264] = LinkInRoomInviteResponse.class;
        clsArr[265] = LinkInRoomReplyResponse.class;
        clsArr[266] = LinkInviteResult.class;
        clsArr[267] = LinkerInfo.class;
        clsArr[268] = LinkmicListResponse.class;
        clsArr[269] = MGetUserLinkmicStatusParams.class;
        clsArr[270] = MGetUserLinkmicStatusResponse.class;
        clsArr[271] = MGetUserLinkmicStatusResponse.Extra.class;
        clsArr[272] = MGetUserLinkmicStatusResponse.LinkmicStatus.class;
        clsArr[273] = MGetUserLinkmicStatusResponse.ResponseData.class;
        clsArr[274] = MgetPullStreamInfosParams.class;
        clsArr[275] = MgetPullStreamInfosResponse.class;
        clsArr[276] = MgetPullStreamInfosResponse.PullStreamInfo.class;
        clsArr[277] = MgetPullStreamInfosResponse.ResponseData.class;
        clsArr[278] = PermitParams.class;
        clsArr[279] = PermitResponse.class;
        clsArr[280] = PermitResponse.ResponseData.class;
        clsArr[281] = ReplyParams.class;
        clsArr[282] = ReplyReserveParams.class;
        clsArr[283] = ReplyReserveResponse.class;
        clsArr[284] = ReplyReserveResponse.ReplyReserveExtra.class;
        clsArr[285] = ReplyReserveResponse.ReplyReserveExtra.LogPb.class;
        clsArr[286] = ReplyReserveResponse.ResponseData.class;
        clsArr[287] = ReplyResponse.class;
        clsArr[288] = ReserveParams.class;
        clsArr[289] = ReserveResponse.class;
        clsArr[290] = ReserveResponse.ReserveExtra.class;
        clsArr[291] = ReserveResponse.ReserveExtra.LogPb.class;
        clsArr[292] = ReserveResponse.ResponseData.class;
        clsArr[293] = ResumeParams.class;
        clsArr[294] = ResumeResponse.class;
        clsArr[295] = ResumeResponse.ResponseData.class;
        clsArr[296] = RivalExtraInfo.class;
        clsArr[297] = RivalExtraInfo.ReserveInfo.class;
        clsArr[298] = RivalExtraInfo.Tag.class;
        clsArr[299] = RivalsListExtra.class;
        clsArr[300] = RivalsListExtra.LogPbBean.class;
        clsArr[301] = RivalsListsData.class;
        clsArr[302] = RivalsListsData.BannerText.class;
        clsArr[303] = RivalsListsData.TopHostInfo.class;
        clsArr[304] = RivalsParams.class;
        clsArr[305] = RivalsResponse.class;
        clsArr[306] = SearchBar.class;
        clsArr[307] = TopicLikeParams.class;
        clsArr[308] = TopicLikeResponse.class;
        clsArr[309] = TopicLikeResponse.ResponseData.class;
        clsArr[310] = TopicListParams.class;
        clsArr[311] = TopicListResponse.class;
        clsArr[312] = TopicListResponse.ResponseData.class;
        clsArr[313] = TopicPairParams.class;
        clsArr[314] = TopicPairResponse.class;
        clsArr[315] = TopicPairResponse.ResponseData.class;
        clsArr[316] = TopicPairResponse.ResponseData.Setting.class;
        clsArr[317] = TopicSetParams.class;
        clsArr[318] = TopicSetResponse.class;
        clsArr[319] = TopicSetResponse.ResponseData.class;
        clsArr[320] = TriggerLivingNoticeParams.class;
        clsArr[321] = TriggerLivingNoticeResponse.class;
        clsArr[322] = TriggerLivingNoticeResponse.ResponseData.class;
        clsArr[323] = TriggerReserveNoticeParams.class;
        clsArr[324] = TriggerReserveNoticeResponse.class;
        clsArr[325] = TriggerReserveNoticeResponse.ResponseData.class;
        clsArr[326] = TriggerResumeNoticeParams.class;
        clsArr[327] = TriggerResumeNoticeResponse.class;
        clsArr[328] = TriggerResumeNoticeResponse.ResponseData.class;
        clsArr[329] = UserInfo.class;
        clsArr[330] = AnchorPreFinishData.class;
        clsArr[331] = AnchorPreFinishData.ConfirmBox.class;
        clsArr[332] = AnchorPreFinishRequest.class;
        clsArr[333] = AnchorPreFinishResponse.class;
        clsArr[334] = AnchorReplayDeleteRequest.class;
        clsArr[335] = AnchorReplayDeleteResponse.class;
        clsArr[336] = AnchorReplayInfoData.class;
        clsArr[337] = AnchorReplayInfoRequest.class;
        clsArr[338] = AnchorReplayInfoResponse.class;
        clsArr[339] = ApplyResult.class;
        clsArr[340] = AudiencePingExtra.class;
        clsArr[341] = ChatEmojiListData.class;
        clsArr[342] = ChatEmojiListRequest.class;
        clsArr[343] = ChatEmojiListResponse.class;
        clsArr[344] = EnterRoomExtra.class;
        clsArr[345] = FragmentTypeCount.class;
        clsArr[346] = HashtagListResponse.class;
        clsArr[347] = KickUserResponse.class;
        clsArr[348] = LikeRequest.class;
        clsArr[349] = LikeResponse.class;
        clsArr[350] = LikeResponse.Data.class;
        clsArr[351] = MGetTranslationRequest.class;
        clsArr[352] = MGetTranslationRequest.Text.class;
        clsArr[353] = MGetTranslationResponse.class;
        clsArr[354] = MGetTranslationResponse.Data.class;
        clsArr[355] = MGetTranslationResponse.Data.Translation.class;
        clsArr[356] = PermissionLevelBannerStatsRequest.class;
        clsArr[357] = PermissionLevelBannerStatsResponse.class;
        clsArr[358] = PermissionLevelBannerStatsResponse.ResponseData.class;
        clsArr[359] = PermissionLevelBannerStatusExtra.class;
        clsArr[360] = PermissionLevelStage.class;
        clsArr[361] = PermissionLevelStage.PermissionLevelTask.class;
        clsArr[362] = PermissionLevelTaskAllExtra.class;
        clsArr[363] = PermissionLevelTaskAllRequest.class;
        clsArr[364] = PermissionLevelTaskAllResponse.class;
        clsArr[365] = PermissionLevelTaskAllResponse.ResponseData.class;
        clsArr[366] = PermissionLevelTaskFinishExtra.class;
        clsArr[367] = PermissionLevelTaskFinishRequest.class;
        clsArr[368] = PermissionLevelTaskFinishResponse.class;
        clsArr[369] = PermissionLevelTaskFinishResponse.ResponseData.class;
        clsArr[370] = QueryCommercialContentToggleRequest.class;
        clsArr[371] = QueryCommercialContentToggleResponse.class;
        clsArr[372] = QueryCommercialContentToggleResponse.Data.class;
        clsArr[373] = RoomDonationInfo.class;
        clsArr[374] = RoomReplay.class;
        clsArr[375] = RoomReplayMoment.class;
        clsArr[376] = RoomReplayReason.class;
        clsArr[377] = StarCommentUpdateRequest.class;
        clsArr[378] = StarCommentUpdateResponse.class;
        clsArr[379] = UpdateStatusRequest.class;
        clsArr[380] = UpdateStatusResponse.class;
        clsArr[381] = UpdateStatusResponse.Data.class;
        clsArr[382] = VideoInfo.class;
        clsArr[383] = WaveRequest.class;
        clsArr[384] = WaveResponse.class;
        clsArr[385] = BattleUserSettings.class;
        clsArr[386] = CancelResponse.class;
        clsArr[387] = CheckPermissionResponse.class;
        clsArr[388] = CohostABTest.class;
        clsArr[389] = CohostABTestList.class;
        clsArr[390] = CohostABTestSetting.class;
        clsArr[391] = CohostListUser.class;
        clsArr[392] = CohostTopic.class;
        clsArr[393] = LastLayoutSetting.class;
        clsArr[394] = LinkInitResult.class;
        clsArr[395] = LinkPlayerInfo.class;
        clsArr[396] = LinkReplyResult.class;
        clsArr[397] = ListParams.class;
        clsArr[398] = ListReachEnhancementUser.class;
        clsArr[399] = MultiCancelResponse.class;
        clsArr[400] = OptPairInfo.class;
        clsArr[401] = com.bytedance.android.livesdk.chatroom.model.interact.ReplyParams.class;
        clsArr[402] = com.bytedance.android.livesdk.chatroom.model.interact.ReplyResponse.class;
        clsArr[403] = ReplyResponse.ReplyExtra.class;
        clsArr[404] = ReplyResponse.ReplyExtra.LogPb.class;
        clsArr[405] = TagV2.class;
        clsArr[406] = TagV2.SecondDegreeRelationContent.class;
        clsArr[407] = TagV2.SecondDegreeRelationContent.UserInfo.class;
        clsArr[408] = TopHostInfo.class;
        clsArr[409] = TopicExtraInfo.class;
        clsArr[410] = TopicSessionStatus.class;
        clsArr[411] = Extra.class;
        clsArr[412] = com.bytedance.android.livesdk.chatroom.model.interact.audience.GetSettingsParams.class;
        clsArr[413] = com.bytedance.android.livesdk.chatroom.model.interact.audience.GetSettingsResponse.class;
        clsArr[414] = LinkmicAudienceEmoji.class;
        clsArr[415] = LinkmicSettingResult.class;
        clsArr[416] = LinkmicSettingmodel.class;
        clsArr[417] = com.bytedance.android.livesdk.chatroom.model.interact.audience.PermitParams.class;
        clsArr[418] = com.bytedance.android.livesdk.chatroom.model.interact.audience.PermitResponse.class;
        clsArr[419] = PermitResult.class;
        clsArr[420] = ApplyBizContent.class;
        clsArr[421] = BizApplyParams.class;
        clsArr[422] = BizApplyResponse.class;
        clsArr[423] = BizApplyResponseData.class;
        clsArr[424] = BizCancelApplyParams.class;
        clsArr[425] = BizCreateChannelParams.class;
        clsArr[426] = BizCreateChannelParams.UserSetting.class;
        clsArr[427] = BizCreateChannelResponse.class;
        clsArr[428] = BizCreateChannelResponseData.class;
        clsArr[429] = BizJoinChannelParams.class;
        clsArr[430] = BizJoinChannelResponse.class;
        clsArr[431] = BizJoinChannelResponseData.class;
        clsArr[432] = BizJoinDirectParams.class;
        clsArr[433] = BizJoinDirectResponse.class;
        clsArr[434] = BizJoinDirectResponseData.class;
        clsArr[435] = BizLeaveParams.class;
        clsArr[436] = BizPermitParams.class;
        clsArr[437] = BizReplyParams.class;
        clsArr[438] = BizReplyResponse.class;
        clsArr[439] = BizReplyResponseData.class;
        clsArr[440] = BusinessContent.class;
        clsArr[441] = InviteBizContent.class;
        clsArr[442] = JoinDirectBizContent.class;
        clsArr[443] = MultiLiveContent.class;
        clsArr[444] = PermitBizContent.class;
        clsArr[445] = ReplyBizContent.class;
        clsArr[446] = com.bytedance.android.livesdk.chatroom.model.multilive.JoinChannelParams.class;
        clsArr[447] = com.bytedance.android.livesdk.chatroom.model.multilive.JoinChannelResponse.class;
        clsArr[448] = MultiLiveAnchorPanelSettings.class;
        clsArr[449] = MultiLiveLayoutInfo.class;
        clsArr[450] = Setting.class;
        clsArr[451] = SettingABTestInfo.class;
        clsArr[452] = TurnOffInvitationParams.class;
        clsArr[453] = TurnOffInvitationResponse.class;
        clsArr[454] = TurnOffInvitationResponse.Extra.class;
        clsArr[455] = TurnOffInvitationResponse.ResponseData.class;
        clsArr[456] = UpdateRoomLayoutSettings.class;
        clsArr[457] = UpdateSettingParams.class;
        clsArr[458] = UpdateSettingResponse.class;
        clsArr[459] = UpdateSettingResponse.Extra.class;
        clsArr[460] = EnvelopeListResponse.class;
        clsArr[461] = RedEnvelopInfo.class;
        clsArr[462] = RedEnvelopeListResponse.class;
        clsArr[463] = ItemTabExtra.class;
        clsArr[464] = FirstChargeData.class;
        clsArr[465] = FirstChargeGuideEffectRule.class;
        clsArr[466] = FirstRechargeResponse.class;
        clsArr[467] = AccessRecallMessage.class;
        clsArr[468] = AnchorPartnershipInfoResponse.class;
        clsArr[469] = AnchorTasksResponse.class;
        clsArr[470] = AudienceRoomTasksResponse.class;
        clsArr[471] = AuthParam.class;
        clsArr[472] = BenefitDetail.class;
        clsArr[473] = BenefitRecord.class;
        clsArr[474] = BriefBenefitInfo.class;
        clsArr[475] = BriefGame.class;
        clsArr[476] = BriefGameTask.class;
        clsArr[477] = BriefGiftInfo.class;
        clsArr[478] = CreateHighLightResult.class;
        clsArr[479] = CreatorInfo.class;
        clsArr[480] = EsportsMatchInfo.class;
        clsArr[481] = EsportsParticipant.class;
        clsArr[482] = EsportsParticipantMatchScore.class;
        clsArr[483] = EsportsPointRaceScore.class;
        clsArr[484] = EsportsTournamentInfo.class;
        clsArr[485] = FeedItemInfo.class;
        clsArr[486] = GameActivity.class;
        clsArr[487] = GameAttributionInfo.class;
        clsArr[488] = GameInfo.class;
        clsArr[489] = GameInvite.class;
        clsArr[490] = GameLiveFragment.class;
        clsArr[491] = GameLiveMark.class;
        clsArr[492] = GameStationAttributionInfo.class;
        clsArr[493] = GameStationGameInfo.class;
        clsArr[494] = GameStationGameInfo.Video.class;
        clsArr[495] = GameStationOuterActivityInfo.class;
        clsArr[496] = GameTagData.class;
        clsArr[497] = GameTask.class;
        clsArr[498] = GiftItem.class;
        clsArr[499] = InvitationSwitch.class;
        clsArr[500] = ItemInfo.class;
        clsArr[501] = ItemStatisticsInfo.class;
        clsArr[502] = LiveFragmentShowInfo.class;
        clsArr[503] = MonthlyProfit.class;
        clsArr[504] = OuterActivityGroup.class;
        clsArr[505] = OuterActivityInfo.class;
        clsArr[506] = PartnershipBriefDrops.class;
        clsArr[507] = PartnershipDrops.class;
        clsArr[508] = PartnershipDropsAnchorReward.class;
        clsArr[509] = PartnershipDropsGift.class;
        clsArr[510] = PartnershipDropsRankItem.class;
        clsArr[511] = PartnershipDropsReward.class;
        clsArr[512] = PartnershipDropsRewardV1.class;
        clsArr[513] = PartnershipDropsTask.class;
        clsArr[514] = PartnershipDropsTaskConfig.class;
        clsArr[515] = PartnershipDropsV1.class;
        clsArr[516] = PartnershipDropsV1.ReasonParams.class;
        clsArr[517] = PartnershipDropsV1.ReasonParams.ExcellentCreatorParams.class;
        clsArr[518] = PartnershipDropsV1.ReasonParams.TopRewardsParams.class;
        clsArr[519] = PartnershipGame.class;
        clsArr[520] = PartnershipGame.Video.class;
        clsArr[521] = PartnershipGameEvent.class;
        clsArr[522] = PartnershipGiftInfo.class;
        clsArr[523] = PartnershipTask.class;
        clsArr[524] = ProfitInfo.class;
        clsArr[525] = Sprite.class;
        clsArr[526] = SwitchExtraBase.class;
        clsArr[527] = SwitchExtraForOpen.class;
        clsArr[528] = TaskAttributionInfo.class;
        clsArr[529] = TaskProfitInfo.class;
        clsArr[530] = UrlInfo.class;
        clsArr[531] = com.bytedance.android.livesdk.game.model.UserInfo.class;
        clsArr[532] = com.bytedance.android.livesdk.game.model.VideoInfo.class;
        clsArr[533] = AssetsListResult.class;
        clsArr[534] = AssetsModel.class;
        clsArr[535] = FaceRecognitionMeta.class;
        clsArr[536] = ResourceModel.class;
        clsArr[537] = VideoResource.class;
        clsArr[538] = BEFViewRenderSize.class;
        clsArr[539] = CalmDownInfo.class;
        clsArr[540] = CollectionDescription.class;
        clsArr[541] = CollectionEffect.class;
        clsArr[542] = CollectionUser.class;
        clsArr[543] = CpcPromptResponse.class;
        clsArr[544] = DoodleTemplate.class;
        clsArr[545] = DriveBagItem.class;
        clsArr[546] = DriveItem.class;
        clsArr[547] = DynamicGiftListResponse.class;
        clsArr[548] = DynamicGiftListResponse.Data.class;
        clsArr[549] = DynamicGiftListResponse.Extra.class;
        clsArr[550] = ExchangeGiftResultData.class;
        clsArr[551] = FlyingMicResources.class;
        clsArr[552] = ForceInsertMetricsItem.class;
        clsArr[553] = FreqLimitGiftInfo.class;
        clsArr[554] = FreqLimitGiftOption.class;
        clsArr[555] = GetWishlistRequestParams.class;
        clsArr[556] = GetWishlistResponse.class;
        clsArr[557] = GiftAckInfo.class;
        clsArr[558] = GiftCollectionDetailRequestParams.class;
        clsArr[559] = GiftCollectionDetailResponse.class;
        clsArr[560] = GiftCollectionDetailResponse.CollectionProcess.class;
        clsArr[561] = GiftCollectionDetailResponse.Data.class;
        clsArr[562] = GiftCollectionDetailResponse.Gift.class;
        clsArr[563] = GiftCollectionHistoryRequestParams.class;
        clsArr[564] = GiftCollectionHistoryResponse.class;
        clsArr[565] = GiftCollectionHistoryResponse.Data.class;
        clsArr[566] = GiftCollectionHistoryResponse.EffectList.class;
        clsArr[567] = GiftColorInfo.class;
        clsArr[568] = GiftComboInfo.class;
        clsArr[569] = GiftGroupCount.class;
        clsArr[570] = GiftHintInfo.class;
        clsArr[571] = GiftHintRequest.class;
        clsArr[572] = GiftHintResponse.class;
        clsArr[573] = GiftHintResponse.Data.class;
        clsArr[574] = GiftIconInfo.class;
        clsArr[575] = GiftLimitGetResponse.class;
        clsArr[576] = GiftLimitGetResponse.Data.class;
        clsArr[577] = GiftLimitGetResponse.Data.GiftPromptStall.class;
        clsArr[578] = GiftListAckRequestParams.class;
        clsArr[579] = GiftListAckResponse.class;
        clsArr[580] = GiftListAckResponse.Extra.class;
        clsArr[581] = GiftListResponse.class;
        clsArr[582] = GiftListResult.class;
        clsArr[583] = GiftNotice.class;
        clsArr[584] = GiftPage.class;
        clsArr[585] = GiftPollInfo.class;
        clsArr[586] = GiftPollOption.class;
        clsArr[587] = GiftResultData.class;
        clsArr[588] = GiftSendResponse.class;
        clsArr[589] = GiftSendResponse.GiftExtra.class;
        clsArr[590] = GiftsInfo.class;
        clsArr[591] = HotfixGiftDataForProp.class;
        clsArr[592] = LiveLimitedTimeDiscountGiftInfo.class;
        clsArr[593] = LiveStreamGoal.class;
        clsArr[594] = LiveStreamGoalContributor.class;
        clsArr[595] = LiveStreamGoalIndicator.class;
        clsArr[596] = LiveStreamGoalServerMessage.class;
        clsArr[597] = LiveStreamSubGoal.class;
        clsArr[598] = LiveStreamSubGoalGift.class;
        clsArr[599] = LokiExtraContent.class;
        clsArr[600] = LynxGiftExtra.class;
        clsArr[601] = MatchInfo.class;
        clsArr[602] = PageSchemaListRequest.class;
        clsArr[603] = PageSchemaListResponse.class;
        clsArr[604] = PageSchemaListResponse.Data.class;
        clsArr[605] = Prop.class;
        clsArr[606] = RiskCtl.class;
        clsArr[607] = SendGiftResult.class;
        clsArr[608] = StaticGiftListResponse.class;
        clsArr[609] = StaticGiftListResponse.Metadata.class;
        clsArr[610] = ToUser.class;
        clsArr[611] = ToUserInfo.class;
        clsArr[612] = WishListResponse.class;
        clsArr[613] = WishListResponse.Wish.class;
        clsArr[614] = WishListResponse.Wish.GiftWishExtra.class;
        clsArr[615] = WishListResponse.WishContributor.class;
        clsArr[616] = WishListResponse.WishList.class;
        clsArr[617] = WishListUpdateMessage.class;
        clsArr[618] = AnchorOnBoardPermit.class;
        clsArr[619] = CommitSubGoalRequest.class;
        clsArr[620] = CommitSubGoalResponse.class;
        clsArr[621] = CommitSubGoalResponse.Data.class;
        clsArr[622] = GetResponse.class;
        clsArr[623] = GetResponse.Data.class;
        clsArr[624] = GetResponse.Pin.class;
        clsArr[625] = GetSubGoalContributorsRequest.class;
        clsArr[626] = GetSubGoalContributorsResponse.class;
        clsArr[627] = GetSubGoalContributorsResponse.Data.class;
        clsArr[628] = GetSubGoalHistoryRequest.class;
        clsArr[629] = GetSubGoalHistoryResponse.class;
        clsArr[630] = GetSubGoalHistoryResponse.Data.class;
        clsArr[631] = GoalComparison.class;
        clsArr[632] = GoalOwner.class;
        clsArr[633] = GoalPinInfo.class;
        clsArr[634] = GoalStats.class;
        clsArr[635] = OwnerSettingRequestParams.class;
        clsArr[636] = OwnerSettingResponse.class;
        clsArr[637] = OwnerSettingResponse.Data.class;
        clsArr[638] = PinRequestParams.class;
        clsArr[639] = PinResponse.class;
        clsArr[640] = PinResponse.Data.class;
        clsArr[641] = ReasonableGoalRec.class;
        clsArr[642] = StreamGoalRecExtra.class;
        clsArr[643] = SubGoalRecommendInfo.class;
        clsArr[644] = SubscriptionGoalRecExtra.class;
        clsArr[645] = UnPinRequestParams.class;
        clsArr[646] = UnPinResponse.class;
        clsArr[647] = UnPinResponse.Data.class;
        clsArr[648] = GoodyBagBaseInfo.class;
        clsArr[649] = GoodyBagCoinDetail.class;
        clsArr[650] = GoodyBagCommonDetail.class;
        clsArr[651] = GoodyBagCommonSelected.class;
        clsArr[652] = GoodyBagUserInfo.class;
        clsArr[653] = GoodyBagWinnerInfo.class;
        clsArr[654] = GiftGuideTriggerReqParams.class;
        clsArr[655] = GiftGuideTriggerResponse.class;
        clsArr[656] = GiftGuideTriggerResponse.Data.class;
        clsArr[657] = GiftKeywords.class;
        clsArr[658] = GuideInfoRequest.class;
        clsArr[659] = GuideInfoResponse.class;
        clsArr[660] = GuideInfoResponse.Data.class;
        clsArr[661] = GuideInfoResponse.GuideEntry.class;
        clsArr[662] = GuideInfoResponse.GuidePageResource.class;
        clsArr[663] = GuideInfoResponse.UserStats.class;
        clsArr[664] = GuideKeywordsReportRequest.class;
        clsArr[665] = GuideKeywordsReportResponse.class;
        clsArr[666] = GuideKeywordsReportResponse.Data.class;
        clsArr[667] = GuideKeywordsRequest.class;
        clsArr[668] = GuideKeywordsResponse.class;
        clsArr[669] = GuideKeywordsResponse.Data.class;
        clsArr[670] = GuideKeywordsResponse.UserInfo.class;
        clsArr[671] = GuideReportRequest.class;
        clsArr[672] = GuideReportResponse.class;
        clsArr[673] = GuideReportResponse.Data.class;
        clsArr[674] = KeywordsLibrary.class;
        clsArr[675] = FilterInfoData.class;
        clsArr[676] = RoomStatsModel.class;
        clsArr[677] = CppAgeVerificationInfo.class;
        clsArr[678] = CppTaskInfo.class;
        clsArr[679] = EcommerceEntrance.class;
        clsArr[680] = EcommerceEntrance.ShopEntranceInfo.class;
        clsArr[681] = EcommerceEntrance.ShopEntranceInfo.StoreLabel.class;
        clsArr[682] = EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.class;
        clsArr[683] = EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage.class;
        clsArr[684] = EcommerceEntrance.ShowcaseEntranceInfo.class;
        clsArr[685] = LiveProInfo.class;
        clsArr[686] = PerceptionFeedbackOption.class;
        clsArr[687] = com.bytedance.android.livesdk.message.proto.RankUser.class;
        clsArr[688] = RankUser.Border.class;
        clsArr[689] = RankUser.FollowInfo.class;
        clsArr[690] = StarCommentConfig.class;
        clsArr[691] = ToolBarManagement.class;
        clsArr[692] = WebcastLSAccessStatus.class;
        clsArr[693] = AccompanimentStruct.class;
        clsArr[694] = ActivityRewardInfo.class;
        clsArr[695] = AdEventTracking.class;
        clsArr[696] = AnchorInfo.class;
        clsArr[697] = AnchorLevel.class;
        clsArr[698] = AttrRequestParams.class;
        clsArr[699] = AttrResponseParams.class;
        clsArr[700] = AttrResponseParams.Extra.class;
        clsArr[701] = AttrUpdateRequestParams.class;
        clsArr[702] = AttrUpdateResponseParams.class;
        clsArr[703] = AudioStruct.class;
        clsArr[704] = AuthenticationInfo.class;
        clsArr[705] = Author.class;
        clsArr[706] = BaLeadsGenInfo.class;
        clsArr[707] = BannerInRoom.class;
        clsArr[708] = BannerInRoom.BannerContentDynamic.class;
        clsArr[709] = BorderInfo.class;
        clsArr[710] = Creator.class;
        clsArr[711] = DonationSticker.class;
        clsArr[712] = EnvelopePortalMessage.class;
        clsArr[713] = EnvelopePortalMessage.PortalInfo.class;
        clsArr[714] = EnvelopePortalMessage.PortalTransTarget.class;
        clsArr[715] = FansClubData.class;
        clsArr[716] = FansClubData.UserBadge.class;
        clsArr[717] = FansClubMember.class;
        clsArr[718] = FeedBanner.class;
        clsArr[719] = FeedBannerContainer.class;
        clsArr[720] = FeedItem.class;
        clsArr[721] = FlareInfo.class;
        clsArr[722] = GameTag.class;
        clsArr[723] = GameTagCategory.class;
        clsArr[724] = Gift.class;
        clsArr[725] = GiftBoxInfo.class;
        clsArr[726] = GiftInfoInBox.class;
        clsArr[727] = GiftLockInfo.class;
        clsArr[728] = GiftOperation.class;
        clsArr[729] = GiftPanelBanner.class;
        clsArr[730] = GiftRandomEffectInfo.class;
        clsArr[731] = GiftTrayInfo.class;
        clsArr[732] = GiftsBoxInfo.class;
        clsArr[733] = GradeIcon.class;
        clsArr[734] = Hashtag.class;
        clsArr[735] = InteractionQuestionInfo.class;
        clsArr[736] = KaraokeSong.class;
        clsArr[737] = LikeEffect.class;
        clsArr[738] = LikeInfo.class;
        clsArr[739] = LiveEventInfo.class;
        clsArr[740] = LyricStruct.class;
        clsArr[741] = MaskLayer.class;
        clsArr[742] = OfficialChannelInfo.class;
        clsArr[743] = OrganizationModel.class;
        clsArr[744] = PollData.class;
        clsArr[745] = PollInfo.class;
        clsArr[746] = Portal.class;
        clsArr[747] = PromoteOtherMessage.class;
        clsArr[748] = RandomGiftBubble.class;
        clsArr[749] = RandomGiftPanelBanner.class;
        clsArr[750] = Reservation.class;
        clsArr[751] = RoomAuthMessage.class;
        clsArr[752] = RoomAuthMessageGoldenEnvelope.class;
        clsArr[753] = RoomAuthOffReasons.class;
        clsArr[754] = RoomAuthStatus.class;
        clsArr[755] = RoomDecoration.class;
        clsArr[756] = RoomStats.class;
        clsArr[757] = RoomSticker.class;
        clsArr[758] = ShortTouchItem.class;
        clsArr[759] = ShortTouchPreviewSetting.class;
        clsArr[760] = StickerCheckResponse.class;
        clsArr[761] = StickersSetResponse.class;
        clsArr[762] = TestDemo.class;
        clsArr[763] = TopFanTicket.class;
        clsArr[764] = TopFrameSummary.class;
        clsArr[765] = UserAttr.class;
        clsArr[766] = UserAttrResponse.class;
        clsArr[767] = UserHonor.class;
        clsArr[768] = UserVoteInfo.class;
        clsArr[769] = VoteResponseData.class;
        clsArr[770] = VoteUser.class;
        clsArr[771] = WalletPackage.class;
        clsArr[772] = WarningTag.class;
        clsArr[773] = CoHost.class;
        clsArr[774] = LinkmicUser.class;
        clsArr[775] = MultiLiveUpdateUserSettingContent.class;
        clsArr[776] = MultiLiveUserApplyPermission.class;
        clsArr[777] = MultiLiveUserApplySettings.class;
        clsArr[778] = MultiLiveUserSettings.class;
        clsArr[779] = RoomAudienceMultiGuestPermissionInfo.class;
        clsArr[780] = AccessControlCaptcha.class;
        clsArr[781] = AccessControlMessage.class;
        clsArr[782] = ActivityQuizCardMessage.class;
        clsArr[783] = ActivityQuizUserIdentityMessage.class;
        clsArr[784] = AddToCartButton.class;
        clsArr[785] = AlertAudio.class;
        clsArr[786] = AnchorToolModification.class;
        clsArr[787] = AnchorToolModificationMessage.class;
        clsArr[788] = AssetMessage.class;
        clsArr[789] = AtmosphereTagInfo.class;
        clsArr[790] = AudienceCancelContent.class;
        clsArr[791] = AudienceReplyContent.class;
        clsArr[792] = AudienceReserveContent.class;
        clsArr[793] = AudienceReserveUserInfo.class;
        clsArr[794] = AudienceReserveUserStateMessage.class;
        clsArr[795] = AuthorizationNotifyMessage.class;
        clsArr[796] = AuthorizationNotifyMessage.ContentBlock.class;
        clsArr[797] = AuthorizationNotifyMessage.RelationBlock.class;
        clsArr[798] = AwardCardNotice.class;
        clsArr[799] = BALeadGenMessage.class;
        clsArr[800] = BannerCollapseInfo.class;
        clsArr[801] = BannerInRoomCollection.class;
        clsArr[802] = BannerInRoomCollection.BannerInfo.class;
        clsArr[803] = BannerUpdateMessage.class;
        clsArr[804] = BarrageMessage.class;
        clsArr[805] = BarrageMessage.BarrageEvent.class;
        clsArr[806] = BarrageTypeFansLevelParam.class;
        clsArr[807] = BarrageTypeSubscribeGiftParam.class;
        clsArr[808] = BarrageTypeUserGradeParam.class;
        clsArr[809] = BattleInviteeGiftPermission.class;
        clsArr[810] = BattleNoticeCommonGuide.class;
        clsArr[811] = BattleSettings.class;
        clsArr[812] = BoostCard.class;
        clsArr[813] = BottomMessage.class;
        clsArr[814] = CapsuleBizParams.class;
        clsArr[815] = CapsuleBizParamsCohost.class;
        clsArr[816] = CapsuleBizParamsCommentFlaggedPrompt.class;
        clsArr[817] = CapsuleBizParamsNewAnchorEffect.class;
        clsArr[818] = CapsuleBizParamsRandomGift.class;
        clsArr[819] = CapsuleMessage.class;
        clsArr[820] = CaptionContent.class;
        clsArr[821] = CaptionMessage.class;
        clsArr[822] = CardObtainGuide.class;
        clsArr[823] = CeremonyEffect.class;
        clsArr[824] = ChatMessage.class;
        clsArr[825] = CohostListChangeContent.class;
        clsArr[826] = CohostReserveMessage.class;
        clsArr[827] = CohostTopicMessage.class;
        clsArr[828] = CommentQualityScore.class;
        clsArr[829] = CommentTrayMessage.class;
        clsArr[830] = CommentsMessage.class;
        clsArr[831] = CommonPopupMessage.class;
        clsArr[832] = CommonToastMessage.class;
        clsArr[833] = Contributor.class;
        clsArr[834] = ControlMessage.class;
        clsArr[835] = ControlMessage.Extra.class;
        clsArr[836] = DecorationModifyMessage.class;
        clsArr[837] = DiggMessage.class;
        clsArr[838] = DonationInfoMessage.class;
        clsArr[839] = DonationMessage.class;
        clsArr[840] = DrawGuessEndMessage.class;
        clsArr[841] = DrawGuessExitMessage.class;
        clsArr[842] = DrawGuessStartMessage.class;
        clsArr[843] = DrawGuessUpdateMessage.class;
        clsArr[844] = EcBarrageMessage.class;
        clsArr[845] = EffectPreloadingMessage.class;
        clsArr[846] = EmoteChatMessage.class;
        clsArr[847] = ExtraInfo.class;
        clsArr[848] = FanTicketRoomNoticeContent.class;
        clsArr[849] = FansEventData.class;
        clsArr[850] = FansEventData.NewFansData.class;
        clsArr[851] = FansEventData.TaskCompleteData.class;
        clsArr[852] = FansEventMessage.class;
        clsArr[853] = FlexImageModel.class;
        clsArr[854] = FollowCardMessage.class;
        clsArr[855] = GameOCRPingMessage.class;
        clsArr[856] = GameRankNotifyMessage.class;
        clsArr[857] = GiftBoostCardMessage.class;
        clsArr[858] = GiftCollection.class;
        clsArr[859] = GiftCollectionUpdateMessage.class;
        clsArr[860] = GiftGlobalMessage.class;
        clsArr[861] = GiftGuideMessage.class;
        clsArr[862] = GiftIMPriority.class;
        clsArr[863] = GiftMessage.class;
        clsArr[864] = GiftMonitorInfo.class;
        clsArr[865] = GiftNoticeMessage.class;
        clsArr[866] = GiftPromptMessage.class;
        clsArr[867] = GiftUnlockMessage.class;
        clsArr[868] = GiftUpdateMessage.class;
        clsArr[869] = GoodyBagMessage.class;
        clsArr[870] = GreetingMessage.class;
        clsArr[871] = GuideMessage.class;
        clsArr[872] = GuidePageResource.class;
        clsArr[873] = HashtagMessage.class;
        clsArr[874] = HeatUpdateContent.class;
        clsArr[875] = HighlightFragmentReadyMessage.class;
        clsArr[876] = HourlyRankRewardInfo.class;
        clsArr[877] = HourlyRankRewardMessage.class;
        clsArr[878] = ImDeleteMessage.class;
        clsArr[879] = com.bytedance.android.livesdk.model.message.Img.class;
        clsArr[880] = InRoomBannerMessage.class;
        clsArr[881] = InRoomBannerRefreshMessage.class;
        clsArr[882] = InviteTopHostInfo.class;
        clsArr[883] = KaraokeQueueMessage.class;
        clsArr[884] = KaraokeReqMessage.class;
        clsArr[885] = KaraokeSwitchMessage.class;
        clsArr[886] = LikeMessage.class;
        clsArr[887] = LinkMessage.class;
        clsArr[888] = LinkMicAdMessage.class;
        clsArr[889] = LinkMicAnchorGuideMessage.class;
        clsArr[890] = LinkMicAudienceNoticeMessage.class;
        clsArr[891] = LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide.class;
        clsArr[892] = LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText.class;
        clsArr[893] = LinkMicAudienceNoticeMessage.LinkMicAudienceTurnOnGuide.class;
        clsArr[894] = LinkMicBattleArmiesMessage.class;
        clsArr[895] = LinkMicBattleItemCard.class;
        clsArr[896] = LinkMicBattleMessage.class;
        clsArr[897] = LinkMicBattleNoticeMessage.class;
        clsArr[898] = LinkMicBattlePunishFinishMessage.class;
        clsArr[899] = LinkMicBattleTaskMessage.class;
        clsArr[900] = LinkMicBattleVictoryLapMessage.class;
        clsArr[901] = LinkMicFanTicketMethod.class;
        clsArr[902] = LinkMicMessage.class;
        clsArr[903] = LinkMicSignalMessage.class;
        clsArr[904] = LinkScreenChangeMessage.class;
        clsArr[905] = LinkerCloseContent.class;
        clsArr[906] = LinkerCreateContent.class;
        clsArr[907] = LinkerEnlargeStatusSynContent.class;
        clsArr[908] = LinkerGuestCancelEnlargeContent.class;
        clsArr[909] = LinkerMediaChangeContent.class;
        clsArr[910] = LinkerSysKickOutContent.class;
        clsArr[911] = LinkerUpdateUserContent.class;
        clsArr[912] = LinkerWaitingListChangeContent.class;
        clsArr[913] = LinkmicUserInfo.class;
        clsArr[914] = LinkmicUserToastContent.class;
        clsArr[915] = LiveEventMessage.class;
        clsArr[916] = LiveIntroMessage.class;
        clsArr[917] = LivePermissionInfo.class;
        clsArr[918] = LiveTrayMessage.class;
        clsArr[919] = MarqueeAnnouncementMessage.class;
        clsArr[920] = MarqueeAnnouncementMessage.MessageEntity.class;
        clsArr[921] = MemberMessage.class;
        clsArr[922] = MemberMessage.EffectConfigBean.class;
        clsArr[923] = ModeratorSpeakerMessage.class;
        clsArr[924] = MsgDetectMessage.class;
        clsArr[925] = MsgDetectMessage.TimeInfo.class;
        clsArr[926] = MsgDetectMessage.TriggerCondition.class;
        clsArr[927] = NewAnchorEffectParams.class;
        clsArr[928] = NewAnchorGuideConfig.class;
        clsArr[929] = NewAnchorGuideMessage.class;
        clsArr[930] = NewAnchorGuideMsgInfo.class;
        clsArr[931] = NotificationConfirmResponse.class;
        clsArr[932] = NotifyHighlightContent.class;
        clsArr[933] = NotifyHighlightInfo.class;
        clsArr[934] = OfficialChannelAnchorMessage.class;
        clsArr[935] = OfficialChannelModifyMessage.class;
        clsArr[936] = OfficialChannelUserMessage.class;
        clsArr[937] = OperateToastMessage.class;
        clsArr[938] = com.bytedance.android.livesdk.model.message.OptPairInfo.class;
        clsArr[939] = OptPairInfo.OptPairUser.class;
        clsArr[940] = PaidContentLiveShoppingMessage.class;
        clsArr[941] = PartnershipCardChangeMessage.class;
        clsArr[942] = PartnershipDownloadCountMessage.class;
        clsArr[943] = PartnershipDropsUpdateMessage.class;
        clsArr[944] = PartnershipGameOfflineMessage.class;
        clsArr[945] = PartnershipGameOfflineMessage.OfflineGameInfo.class;
        clsArr[946] = PartnershipPunishMessage.class;
        clsArr[947] = PartnershipTaskShowMessage.class;
        clsArr[948] = PerceptionDialogInfo.class;
        clsArr[949] = PerceptionMessage.class;
        clsArr[950] = PictionaryInfo.class;
        clsArr[951] = PinMessage.class;
        clsArr[952] = PollEndContent.class;
        clsArr[953] = PollMessage.class;
        clsArr[954] = PollOptionInfo.class;
        clsArr[955] = PollStartContent.class;
        clsArr[956] = PollUpdateVotesContent.class;
        clsArr[957] = PollingRequest.class;
        clsArr[958] = PollingResponse.class;
        clsArr[959] = PollingResponse.Extra.class;
        clsArr[960] = PopSeries.class;
        clsArr[961] = PopularCardMessage.class;
        clsArr[962] = PopularCardMessage.PopularCardInfo.class;
        clsArr[963] = PortalMessage.class;
        clsArr[964] = PortalMessage.PortalBuy.class;
        clsArr[965] = PortalMessage.PortalFinish.class;
        clsArr[966] = PortalMessage.PortalInvite.class;
        clsArr[967] = ProductAtmosphereTag.class;
        clsArr[968] = ProductSnapShot.class;
        clsArr[969] = ProjectDModifyH5Message.class;
        clsArr[970] = PublicAreaCommon.class;
        clsArr[971] = PunishEventInfo.class;
        clsArr[972] = Question.class;
        clsArr[973] = QuestionDeleteMessage.class;
        clsArr[974] = QuestionMessage.class;
        clsArr[975] = QuestionSelectMessage.class;
        clsArr[976] = QuestionSlideDownMessage.class;
        clsArr[977] = QuestionSwitchMessage.class;
        clsArr[978] = QuickChatContent.class;
        clsArr[979] = QuickChatListMessage.class;
        clsArr[980] = RankAnimationInfo.class;
        clsArr[981] = RankTextMessage.class;
        clsArr[982] = RankToastMessage.class;
        clsArr[983] = RankToastMessage.RankToast.class;
        clsArr[984] = RankUpdate.class;
        clsArr[985] = RankUpdateMessage.class;
        clsArr[986] = RealtimeLiveCenterMethod.class;
        clsArr[987] = RemindMessage.class;
        clsArr[988] = ReplyContent.class;
        clsArr[989] = ReserveContent.class;
        clsArr[990] = ReserveInfo.class;
        clsArr[991] = ReserveInfo.ReserveUser.class;
        clsArr[992] = RichChatMessage.class;
        clsArr[993] = RoomMessage.class;
        clsArr[994] = RoomNotifyMessage.class;
        clsArr[995] = RoomNotifyMessageExtra.class;
        clsArr[996] = RoomNotifyMessageExtra.Background.class;
        clsArr[997] = RoomPushMessage.class;
        clsArr[998] = RoomStickerMessage.class;
        clsArr[999] = RoomUserSeqMessage.class;
        clsArr[1000] = RoomVerifyMessage.class;
        clsArr[1001] = ScreenMessage.class;
        clsArr[1002] = ShareGuideMessage.class;
        clsArr[1003] = SocialMessage.class;
        clsArr[1004] = SpecifiedDisplayText.class;
        clsArr[1005] = StarCommentMessage.class;
        clsArr[1006] = StarCommentNotificationMessage.class;
        clsArr[1007] = StarCommentPushMessage.class;
        clsArr[1008] = SubNotifyMessage.class;
        clsArr[1009] = SubPinEventMessage.class;
        clsArr[1010] = SubTimerStickerMessage.class;
        clsArr[1011] = SubWaveMessage.class;
        clsArr[1012] = SubscriptionGuideMessage.class;
        clsArr[1013] = TeamUsersInfo.class;
        clsArr[1014] = TextEffect.class;
        clsArr[1015] = TextEffect.Detail.class;
        clsArr[1016] = TimeTag.class;
        clsArr[1017] = TopicSetContent.class;
        clsArr[1018] = UnauthorizedMemberMessage.class;
        clsArr[1019] = UpgradeMessage.class;
        clsArr[1020] = UseCriticalStrikeCard.class;
        clsArr[1021] = UseSmokeCard.class;
        clsArr[1022] = UserFanTicket.class;
        clsArr[1023] = UserStatsMessage.class;
        clsArr[1024] = VideoLiveCouponRcmdMessage.class;
        clsArr[1025] = VideoLiveGoodsRcmdMessage.class;
        clsArr[1026] = WeeklyRankRewardMessage.class;
        clsArr[1027] = XGGoodsOrderMessage.class;
        clsArr[1028] = XGGoodsOrderMessage.GoodsOrder.class;
        clsArr[1029] = BattleDisplayConfig.class;
        clsArr[1030] = BattleNoticeAnchorGiftGuide.class;
        clsArr[1031] = BattleNoticeAnchorGuide.class;
        clsArr[1032] = BattleNoticeBubbleGuide.class;
        clsArr[1033] = BattleNoticeRuleGuide.class;
        clsArr[1034] = BattleNoticeText.class;
        clsArr[1035] = BattleNoticeToast.class;
        clsArr[1036] = BattleResult.class;
        clsArr[1037] = BattleRewardSettle.class;
        clsArr[1038] = BattleSetting.class;
        clsArr[1039] = BattleTaskSettle.class;
        clsArr[1040] = BattleTaskStart.class;
        clsArr[1041] = BattleTaskUpdate.class;
        clsArr[1042] = BattleTruthOrDareOptOutNotice.class;
        clsArr[1043] = BattleTruthOrDareTips.class;
        clsArr[1044] = BattleTruthOrDareTriggerGuide.class;
        clsArr[1045] = BattleTruthOrDareTriggerGuideV2.class;
        clsArr[1046] = BattleTruthOrDareTriggerGuideV2.TruthOrDareTip.class;
        clsArr[1047] = BattleUserArmies.class;
        clsArr[1048] = BattleUserArmy.class;
        clsArr[1049] = BattleUserInfoWrapper.class;
        clsArr[1050] = ExemptStrategy.class;
        clsArr[1051] = SupportedActionsWrapper.class;
        clsArr[1052] = TruthOrDareTip.class;
        clsArr[1053] = UserArmiesWrapper.class;
        clsArr[1054] = PatternRef.class;
        clsArr[1055] = Text.class;
        clsArr[1056] = TextFormat.class;
        clsArr[1057] = TextPiece.class;
        clsArr[1058] = TextPieceGift.class;
        clsArr[1059] = TextPieceHeart.class;
        clsArr[1060] = TextPieceImage.class;
        clsArr[1061] = TextPiecePatternRef.class;
        clsArr[1062] = TextPieceUser.class;
        clsArr[1063] = BusinessLinksLiveMessage.class;
        clsArr[1064] = ECShortItemRefreshMessage.class;
        clsArr[1065] = ECTaskRegisterMessage.class;
        clsArr[1066] = ECommerceMessage.class;
        clsArr[1067] = EcDrawEntity.class;
        clsArr[1068] = EcDrawMessage.class;
        clsArr[1069] = EcTaskRefreshCouponListEntity.class;
        clsArr[1070] = EcTaskRefreshCouponListMessage.class;
        clsArr[1071] = EcTaskRegisterMessageEntity.class;
        clsArr[1072] = HotTag.class;
        clsArr[1073] = PopProduct.class;
        clsArr[1074] = ShortItemRefreshEntity.class;
        clsArr[1075] = TraceInfo.class;
        clsArr[1076] = AllListUser.class;
        clsArr[1077] = ApplyContent.class;
        clsArr[1078] = ApplyRequestResponse.class;
        clsArr[1079] = ByteRTCExtInfo.class;
        clsArr[1080] = CancelApplyContent.class;
        clsArr[1081] = CancelApplyResponse.class;
        clsArr[1082] = CancelInviteContent.class;
        clsArr[1083] = CancelInviteResponse.class;
        clsArr[1084] = ChangeLayoutResp.class;
        clsArr[1085] = ChangePositionResp.class;
        clsArr[1086] = CreateChannelContent.class;
        clsArr[1087] = CreateChannelResponse.class;
        clsArr[1088] = DSLConfig.class;
        clsArr[1089] = DestroyRequestResponse.class;
        clsArr[1090] = FinishChannelContent.class;
        clsArr[1091] = InviteContent.class;
        clsArr[1092] = com.bytedance.android.livesdk.model.message.linkcore.InviteResponse.class;
        clsArr[1093] = JoinChannelResp.class;
        clsArr[1094] = JoinDirectContent.class;
        clsArr[1095] = JoinDirectResp.class;
        clsArr[1096] = KickOutContent.class;
        clsArr[1097] = KickOutResponse.class;
        clsArr[1098] = LeaveContent.class;
        clsArr[1099] = LeaveRequestResponse.class;
        clsArr[1100] = LinkCommon.class;
        clsArr[1101] = LinkLayerListUser.class;
        clsArr[1102] = LinkLayerMessage.class;
        clsArr[1103] = LinkListChangeContent.class;
        clsArr[1104] = LinkMicCommonResp.class;
        clsArr[1105] = LinkPosition.class;
        clsArr[1106] = MicPositionData.class;
        clsArr[1107] = PermitApplyContent.class;
        clsArr[1108] = com.bytedance.android.livesdk.model.message.linkcore.PermitResponse.class;
        clsArr[1109] = Player.class;
        clsArr[1110] = RTCBitRateMap.class;
        clsArr[1111] = RTCDualStreamParam.class;
        clsArr[1112] = RTCEngineConfig.class;
        clsArr[1113] = RTCExtraInfo.class;
        clsArr[1114] = RTCInfoExtra.class;
        clsArr[1115] = RTCLiveVideoParam.class;
        clsArr[1116] = RTCMixBase.class;
        clsArr[1117] = RTCMixParam.class;
        clsArr[1118] = RTCOther.class;
        clsArr[1119] = RTCVideoParam.class;
        clsArr[1120] = ReplyInviteContent.class;
        clsArr[1121] = com.bytedance.android.livesdk.model.message.linkcore.ReplyResponse.class;
        clsArr[1122] = UserPosition.class;
        clsArr[1123] = LinkerAcceptNoticeContent.class;
        clsArr[1124] = LinkerCancelContent.class;
        clsArr[1125] = LinkerEnterContent.class;
        clsArr[1126] = com.bytedance.android.livesdk.model.message.linker.invite_message.AuthenticationInfo.class;
        clsArr[1127] = InviterRivalExtra.class;
        clsArr[1128] = LinkerInviteContent.class;
        clsArr[1129] = LinkerInviteMessageExtra.class;
        clsArr[1130] = LinkerKickOutContent.class;
        clsArr[1131] = LinkerLeaveContent.class;
        clsArr[1132] = LinkedListChangeContent.class;
        clsArr[1133] = ListUser.class;
        clsArr[1134] = LinkListUser.class;
        clsArr[1135] = LinkerListChangeContent.class;
        clsArr[1136] = LinkerMicIdxUpdateContent.class;
        clsArr[1137] = LinkerMicIdxUpdateInfo.class;
        clsArr[1138] = LinkerMuteContent.class;
        clsArr[1139] = LinkerRandomMatchContent.class;
        clsArr[1140] = LinkerReplyContent.class;
        clsArr[1141] = LinkerSetting.class;
        clsArr[1142] = LinkmicInfo.class;
        clsArr[1143] = MessageRedEnvelopInfo.class;
        clsArr[1144] = RedEnvelopMessage.class;
        clsArr[1145] = Rank.class;
        clsArr[1146] = RankItem.class;
        clsArr[1147] = RankListV2RequestParams.class;
        clsArr[1148] = RankListV2Response.class;
        clsArr[1149] = RankListV2Response.BriefDescription.class;
        clsArr[1150] = RankListV2Response.Bulletin.class;
        clsArr[1151] = RankListV2Response.BulletinLoop.class;
        clsArr[1152] = RankListV2Response.CutOffLine.class;
        clsArr[1153] = RankListV2Response.DailyAndRookieExtra.class;
        clsArr[1154] = RankListV2Response.Data.class;
        clsArr[1155] = RankListV2Response.Gap.class;
        clsArr[1156] = RankListV2Response.HistoryEntrance.class;
        clsArr[1157] = RankListV2Response.LeagueTabInfo.class;
        clsArr[1158] = RankListV2Response.LynxRankData.class;
        clsArr[1159] = RankListV2Response.PathToOtherList.class;
        clsArr[1160] = RankListV2Response.RankInfo.class;
        clsArr[1161] = RankListV2Response.RankLeagueBase.class;
        clsArr[1162] = RankListV2Response.RankLeagueExtra.class;
        clsArr[1163] = RankListV2Response.RankLeagueHeader.class;
        clsArr[1164] = RankListV2Response.RankLeagueTab.class;
        clsArr[1165] = RankListV2Response.RankView.class;
        clsArr[1166] = RankListV2Response.WeeklyRankExtra.class;
        clsArr[1167] = RankListV2Response.WeeklyRookieRankExtra.class;
        clsArr[1168] = WeeklyRankRegionInfo.class;
        clsArr[1169] = RankEntrance.class;
        clsArr[1170] = RankEntranceV3RequestParams.class;
        clsArr[1171] = RankEntranceV3Response.class;
        clsArr[1172] = RankEntranceV3Response.EntranceGroup.class;
        clsArr[1173] = RankEntranceV3Response.EntranceGroup.Data.class;
        clsArr[1174] = RankTabInfo.class;
        clsArr[1175] = RollCfg.class;
        clsArr[1176] = SubRankTabInfo.class;
        clsArr[1177] = SpriteImageItem.class;
        clsArr[1178] = VideoMetaInfo.class;
        clsArr[1179] = GiftListExtra.class;
        clsArr[1180] = BubbleInfo.class;
        clsArr[1181] = CustomBenefitEntrance.class;
        clsArr[1182] = GetSubEmoteDetailResponse.class;
        clsArr[1183] = GetSubInfoResponse.class;
        clsArr[1184] = GetSubTimerDetailRequest.class;
        clsArr[1185] = GetSubTimerDetailResponse.class;
        clsArr[1186] = GetSubTimerDetailResponse.Data.class;
        clsArr[1187] = GetSubTimerDetailResponse.ResponseExtra.class;
        clsArr[1188] = PayPalBindInfo.class;
        clsArr[1189] = SubDataItemView.class;
        clsArr[1190] = SubDataOverview.class;
        clsArr[1191] = SubLiveBanner.class;
        clsArr[1192] = SubOnlyLiveInfo.class;
        clsArr[1193] = SubSettingStatus.class;
        clsArr[1194] = SubscribeBubbleList.class;
        clsArr[1195] = SubscriberInfo.class;
        clsArr[1196] = SubscribingInfo.class;
        clsArr[1197] = UpdateTimerRequest.class;
        clsArr[1198] = UpdateTimerResponse.class;
        clsArr[1199] = UpdateTimerResponse.Data.class;
        clsArr[1200] = WebappSubInfo.class;
        clsArr[1201] = SubGifInfo.class;
        clsArr[1202] = SubGoalInfo.class;
        clsArr[1203] = GetInvitationStatusResponse.class;
        clsArr[1204] = SubAvailable.class;
        clsArr[1205] = SubEnable.class;
        clsArr[1206] = SubEnableCondition.class;
        clsArr[1207] = SubEntrance.class;
        clsArr[1208] = SubInvitationCode.class;
        clsArr[1209] = SubInvitationEntrance.class;
        clsArr[1210] = SubInvitationEntrancePrompt.class;
        clsArr[1211] = SubInvitationFunctionSwitcher.class;
        clsArr[1212] = SubInvitationInviteeStatus.class;
        clsArr[1213] = SubInvitationListData.class;
        clsArr[1214] = SubOptInStatus.class;
        clsArr[1215] = SubSwitcher.class;
        clsArr[1216] = PaypalBindingUrl.class;
        clsArr[1217] = Diamond.class;
        clsArr[1218] = GetPIPOUrlResult.class;
        clsArr[1219] = GetPIPOUrlResult.UrlData.class;
        clsArr[1220] = GetPipoUrlParams.class;
        clsArr[1221] = NoticesRequestParams.class;
        clsArr[1222] = NoticesResult.class;
        clsArr[1223] = NoticesResult.Data.class;
        clsArr[1224] = NoticesResult.Notice.class;
        clsArr[1225] = NoticesResult.Style.class;
        clsArr[1226] = AgeRestricted.class;
        clsArr[1227] = AnchorLevelPermission.class;
        clsArr[1228] = BALinkStruct.class;
        clsArr[1229] = BcToggleInfo.class;
        clsArr[1230] = BurstInfo.class;
        clsArr[1231] = CaptionInfo.class;
        clsArr[1232] = ChannelInfo.class;
        clsArr[1233] = CommerceStruct.class;
        clsArr[1234] = CommercialContentToggle.class;
        clsArr[1235] = ContinueRoomResponse.class;
        clsArr[1236] = CoverInfo.class;
        clsArr[1237] = CoverQuality.class;
        clsArr[1238] = DeprecatedStruct5.class;
        clsArr[1239] = DeprecatedStruct6.class;
        clsArr[1240] = DeprecatedStruct6.DeprecatedStruct7.class;
        clsArr[1241] = EffectInfo.class;
        clsArr[1242] = EnterRegionMatch.class;
        clsArr[1243] = FYPCommerceStruct.class;
        clsArr[1244] = FYPRoomTagItem.class;
        clsArr[1245] = FeedRoomLabel.class;
        clsArr[1246] = FilterMsgRuleParamRandom.class;
        clsArr[1247] = GiftSuspension.class;
        clsArr[1248] = KaraokeInfo.class;
        clsArr[1249] = LineupRoomInfo.class;
        clsArr[1250] = LiveCoreSDKData.class;
        clsArr[1251] = LiveCoreSDKData.Options.class;
        clsArr[1252] = LiveCoreSDKData.PullData.class;
        clsArr[1253] = LiveCoreSDKData.Quality.class;
        clsArr[1254] = LiveFilterMsgRule.class;
        clsArr[1255] = LiveGiftBoostCardRoomStatus.class;
        clsArr[1256] = OfficialRoomInfo.class;
        clsArr[1257] = PaidContentInfo.class;
        clsArr[1258] = PaidEvent.class;
        clsArr[1259] = PartnershipInfo.class;
        clsArr[1260] = PictionaryFullInfo.class;
        clsArr[1261] = PictionaryStatistics.class;
        clsArr[1262] = PinInfo.class;
        clsArr[1263] = PreviewProductCardInfo.class;
        clsArr[1264] = RegionalRestricted.class;
        clsArr[1265] = Room.class;
        clsArr[1266] = RoomExtra.class;
        clsArr[1267] = RoomHealthScoreInfo.class;
        clsArr[1268] = RoomLinkInfo.class;
        clsArr[1269] = RoomPrivateInfo.class;
        clsArr[1270] = RoomShortTouchAreaConfig.class;
        clsArr[1271] = RoomShortTouchAreaConfig.Element.class;
        clsArr[1272] = RoomTab.class;
        clsArr[1273] = RoomUserAttr.class;
        clsArr[1274] = ShortTouchArea.class;
        clsArr[1275] = ShortTouchIconSkin.class;
        clsArr[1276] = ShortTouchInfo.class;
        clsArr[1277] = ShowInfo.class;
        clsArr[1278] = Skin.class;
        clsArr[1279] = SkinDrawerEntrance.class;
        clsArr[1280] = SkinHostAccount.class;
        clsArr[1281] = StreamUrl.class;
        clsArr[1282] = StreamUrlExtra.class;
        clsArr[1283] = StreamUrlExtra.SrConfig.class;
        clsArr[1284] = BattleABTest.class;
        clsArr[1285] = BattleABTestList.class;
        clsArr[1286] = BattleABTestSetting.class;
        clsArr[1287] = BattleArmy.class;
        clsArr[1288] = BattleArmy.RankUser.class;
        clsArr[1289] = BattleBaseUserInfo.class;
        clsArr[1290] = BattleBonusConfig.class;
        clsArr[1291] = BattleBonusStatus.class;
        clsArr[1292] = BattleComboInfo.class;
        clsArr[1293] = BattleGameConfig.class;
        clsArr[1294] = BattleInfoResponse.class;
        clsArr[1295] = BattleLinkerInviteMessageExtra.class;
        clsArr[1296] = BattleLinkerInviteMessageExtra.InviterRivalExtra.class;
        clsArr[1297] = BattleMode.class;
        clsArr[1298] = BattleMode.StealTowerData.class;
        clsArr[1299] = BattlePrompt.class;
        clsArr[1300] = BattlePromptElem.class;
        clsArr[1301] = BattleRival.class;
        clsArr[1302] = BattleRivalTag.class;
        clsArr[1303] = BattleScore.class;
        clsArr[1304] = BattleStatsMeta.class;
        clsArr[1305] = BattleTask.class;
        clsArr[1306] = BattleTaskGiftAmountGuide.class;
        clsArr[1307] = BattleTaskInfo.class;
        clsArr[1308] = BattleTeamResult.class;
        clsArr[1309] = BattleTeamUser.class;
        clsArr[1310] = BattleTeamUserArmies.class;
        clsArr[1311] = BattleTruthOrDare.class;
        clsArr[1312] = BattleUserInfo.class;
        clsArr[1313] = BestTeammateRelation.class;
        clsArr[1314] = com.bytedance.android.livesdkapi.depend.model.live.match.ChannelInfo.class;
        clsArr[1315] = ChijiHistory.class;
        clsArr[1316] = ChijiResult.class;
        clsArr[1317] = CriticalStrikeCardInfo.class;
        clsArr[1318] = EffectingCard.class;
        clsArr[1319] = GiftMode.class;
        clsArr[1320] = GiftModeMeta.class;
        clsArr[1321] = IssueCategory.class;
        clsArr[1322] = MultiBattleFinishResponse.class;
        clsArr[1323] = MultiInviteResponse.class;
        clsArr[1324] = MultiMatchPrepareResponse.class;
        clsArr[1325] = PreviewPeriod.class;
        clsArr[1326] = RewardPeriodConfig.class;
        clsArr[1327] = ScheduleItem.class;
        clsArr[1328] = SmokeCardInfo.class;
        clsArr[1329] = TaskPeriodConfig.class;
        clsArr[1330] = TeamMatchCampaign.class;
        clsArr[1331] = TeamUser.class;
        clsArr[1332] = ReportCommitData.class;
        clsArr[1333] = CommonMessageData.class;
        clsArr[1334] = HeartBeat.class;
        clsArr[1335] = ImEnterRoom.class;
        clsArr[1336] = LiveMessageID.class;
        clsArr[1337] = LiveMessageSEI.class;
        clsArr[1338] = ProtoMessageFetchResult.class;
        clsArr[1339] = ProtoMessageFetchResult.BaseProtoMessage.class;
        clsArr[1340] = PingResult.class;
        clsArr[1341] = FieldAnnotation.class;
        clsArr[1342] = MethodAnnotation.class;
        clsArr[1343] = MsgAnnotation.class;
        clsArr[1344] = ServiceAnnotation.class;
        clsArr[1345] = EmoteListResult.class;
        clsArr[1346] = SubEmoteDetailResult.class;
        clsArr[1347] = AboutMe.class;
        clsArr[1348] = AboutMeInputBox.class;
        clsArr[1349] = AboutMeRequest.class;
        clsArr[1350] = AboutMeResponse.class;
        clsArr[1351] = AboutMeResponse.ResponseData.class;
        clsArr[1352] = AboutMeTemplate.class;
        clsArr[1353] = AboutMeUpdateRequest.class;
        clsArr[1354] = AboutMeUpdateResponse.class;
        clsArr[1355] = AboutMeUpdateResponse.ResponseData.class;
        clsArr[1356] = ActionRequest.class;
        clsArr[1357] = ActionResponse.class;
        clsArr[1358] = AdminHostListRequest.class;
        clsArr[1359] = AdminHostListResponse.class;
        clsArr[1360] = AdminHostListResponse.Data.class;
        clsArr[1361] = AnchorFragmentListResult.class;
        clsArr[1362] = AnchorLiveFragmentEditRequest.class;
        clsArr[1363] = AnchorLiveFragmentEditResponse.class;
        clsArr[1364] = AnchorLiveFragmentEditResponse.ResponseData.class;
        clsArr[1365] = AnchorLiveFragmentInfoRequest.class;
        clsArr[1366] = AnchorLiveFragmentInfoResponse.class;
        clsArr[1367] = AnchorLiveFragmentInfoResponse.ResponseData.class;
        clsArr[1368] = AnchorLiveFragmentListRequest.class;
        clsArr[1369] = AnchorLiveFragmentListResponse.class;
        clsArr[1370] = AnchorLiveFragmentListResponse.ResponseData.class;
        clsArr[1371] = AnchorLiveFragmentPostDetail.class;
        clsArr[1372] = AnchorLiveReplayFrameRequest.class;
        clsArr[1373] = AnchorLiveReplayFrameResponse.class;
        clsArr[1374] = AnchorLiveReplayFrameResponse.ResponseData.class;
        clsArr[1375] = BenefitsInfo.class;
        clsArr[1376] = CancelAutoDownloadExtra.class;
        clsArr[1377] = CancelAutoDownloadRequest.class;
        clsArr[1378] = CancelAutoDownloadResponse.class;
        clsArr[1379] = CreatorHubAnchorArticleDetail.class;
        clsArr[1380] = CreatorHubAnchorArticleReadReport.class;
        clsArr[1381] = CreatorHubAnchorReportRequest.class;
        clsArr[1382] = CreatorHubAnchorReportResponse.class;
        clsArr[1383] = CreatorHubAnchorReportResponse.ResponseData.class;
        clsArr[1384] = CreatorHubGetAnchorArticleDetailRequest.class;
        clsArr[1385] = CreatorHubGetAnchorArticleDetailResponse.class;
        clsArr[1386] = CreatorHubGetAnchorArticleDetailResponse.ResponseData.class;
        clsArr[1387] = DelHostRelationRequest.class;
        clsArr[1388] = DelHostRelationResponse.class;
        clsArr[1389] = FavouritesAddRequest.class;
        clsArr[1390] = FavouritesAddResponse.class;
        clsArr[1391] = FavouritesDeleteRequest.class;
        clsArr[1392] = FavouritesDeleteResponse.class;
        clsArr[1393] = FavouritesSongsRequest.class;
        clsArr[1394] = FavouritesSongsResponse.class;
        clsArr[1395] = FavouritesSongsResponse.ResponseData.class;
        clsArr[1396] = FrameInfo.class;
        clsArr[1397] = GetAnchorFriendListRequest.class;
        clsArr[1398] = GetAnchorFriendListResponse.class;
        clsArr[1399] = GetAnchorFriendListResponse.Data.class;
        clsArr[1400] = GetNewAnchorGuideFeedbackConfigRequest.class;
        clsArr[1401] = GetNewAnchorGuideFeedbackConfigResponse.class;
        clsArr[1402] = GetNewAnchorGuideFeedbackConfigResponse.Data.class;
        clsArr[1403] = GuideFeedbackReportRequest.class;
        clsArr[1404] = GuideFeedbackReportResponse.class;
        clsArr[1405] = GuideFeedbackReportResponse.Data.class;
        clsArr[1406] = HostInfo.class;
        clsArr[1407] = IntroConflictInfo.class;
        clsArr[1408] = KaraokeFavoriteUpdateRequest.class;
        clsArr[1409] = KaraokeFavoriteUpdateResponse.class;
        clsArr[1410] = KaraokeQueueListRequest.class;
        clsArr[1411] = KaraokeQueueListResponse.class;
        clsArr[1412] = KaraokeQueueListResponse.Data.class;
        clsArr[1413] = KaraokeQueueUpdateRequest.class;
        clsArr[1414] = KaraokeQueueUpdateResponse.class;
        clsArr[1415] = KaraokeQueueUpdateResponse.Data.class;
        clsArr[1416] = KaraokeReqListRequest.class;
        clsArr[1417] = KaraokeReqListResponse.class;
        clsArr[1418] = KaraokeReqListResponse.Data.class;
        clsArr[1419] = KaraokeReqUpdateRequest.class;
        clsArr[1420] = KaraokeReqUpdateResponse.class;
        clsArr[1421] = KaraokeSearchRequest.class;
        clsArr[1422] = KaraokeSearchResponse.class;
        clsArr[1423] = KaraokeSearchResponse.Data.class;
        clsArr[1424] = KaraokeTab.class;
        clsArr[1425] = KaraokeTabListRequest.class;
        clsArr[1426] = KaraokeTabListResponse.class;
        clsArr[1427] = KaraokeTabListResponse.Data.class;
        clsArr[1428] = KaraokeTabsListRequest.class;
        clsArr[1429] = KaraokeTabsListResponse.class;
        clsArr[1430] = KaraokeTabsListResponse.Data.class;
        clsArr[1431] = KaraokeUpdateStatusRequest.class;
        clsArr[1432] = KaraokeUpdateStatusResponse.class;
        clsArr[1433] = LiveFragmentDetail.class;
        clsArr[1434] = tikcast.api.anchor.LiveFragmentShowInfo.class;
        clsArr[1435] = PinSoundEffectRequest.class;
        clsArr[1436] = PinSoundEffectResponse.class;
        clsArr[1437] = PlaylistAddReq.class;
        clsArr[1438] = PlaylistAddResponse.class;
        clsArr[1439] = PlaylistAddResponse.ResponseData.class;
        clsArr[1440] = PlaylistDeleteRequest.class;
        clsArr[1441] = PlaylistDeleteResponse.class;
        clsArr[1442] = PlaylistDeleteResponse.ResponseData.class;
        clsArr[1443] = PlaylistSongsRequest.class;
        clsArr[1444] = PlaylistSongsResponse.class;
        clsArr[1445] = PlaylistSongsResponse.ResponseData.class;
        clsArr[1446] = ScheduleAutoDownloadData.class;
        clsArr[1447] = ScheduleAutoDownloadExtra.class;
        clsArr[1448] = ScheduleAutoDownloadRequest.class;
        clsArr[1449] = ScheduleAutoDownloadResponse.class;
        clsArr[1450] = SearchUserRequest.class;
        clsArr[1451] = SearchUserResponse.class;
        clsArr[1452] = SearchUserResponse.Data.class;
        clsArr[1453] = UpdateDualCamStatusExtra.class;
        clsArr[1454] = UpdateDualCamStatusRequest.class;
        clsArr[1455] = UpdateDualCamStatusResponse.class;
        clsArr[1456] = GetRealtimeLiveCenterOverviewContainer.class;
        clsArr[1457] = GetRealtimeLiveCenterOverviewRequest.class;
        clsArr[1458] = GetRealtimeLiveCenterOverviewResponse.class;
        clsArr[1459] = OperateRealtimeLiveCenterRequest.class;
        clsArr[1460] = OperateRealtimeLiveCenterResponse.class;
        clsArr[1461] = RealtimeLiveCenterDetailData.class;
        clsArr[1462] = RealtimeLiveCenterLayoutData.class;
        clsArr[1463] = RealtimeLiveCenterLayoutTab.class;
        clsArr[1464] = Answer.class;
        clsArr[1465] = AppealDetail.class;
        clsArr[1466] = AppealDetailRequest.class;
        clsArr[1467] = AppealDetailResponse.class;
        clsArr[1468] = AppealRequest.class;
        clsArr[1469] = AppealResponse.class;
        clsArr[1470] = AppealResponse.ResponseData.class;
        clsArr[1471] = CaptchaCheckRequest.class;
        clsArr[1472] = CaptchaCheckResponse.class;
        clsArr[1473] = CaptchaCheckResponse.ResponseData.class;
        clsArr[1474] = CaptchaCheckResponse.ResponseExtra.class;
        clsArr[1475] = CheckAppealRequest.class;
        clsArr[1476] = CheckAppealResponse.class;
        clsArr[1477] = CheckAppealResponse.ResponseData.class;
        clsArr[1478] = CheckBubble.class;
        clsArr[1479] = CheckDetectPermissionRequest.class;
        clsArr[1480] = CheckDetectPermissionResponse.class;
        clsArr[1481] = CheckDetectPermissionResponse.ResponseData.class;
        clsArr[1482] = CheckDetectPermissionResponse.ResponseData.DetectorInfo.class;
        clsArr[1483] = EventDetail.class;
        clsArr[1484] = EventRequest.class;
        clsArr[1485] = EventResponse.class;
        clsArr[1486] = EventResponse.ResponseData.class;
        clsArr[1487] = EventResponse.ResponseExtra.class;
        clsArr[1488] = FeatureCheckRequest.class;
        clsArr[1489] = FeatureCheckResponse.class;
        clsArr[1490] = FeatureCheckResponse.ResponseData.class;
        clsArr[1491] = FeatureCheckResponse.ResponseExtra.class;
        clsArr[1492] = FeatureCheckResult.class;
        clsArr[1493] = GetQuestionnaireContentRequest.class;
        clsArr[1494] = GetQuestionnaireContentResponse.class;
        clsArr[1495] = GetQuestionnaireContentResponse.ResponseData.class;
        clsArr[1496] = GetQuestionnaireContentResponse.ResponseData.Question.class;
        clsArr[1497] = GetViolationListRequest.class;
        clsArr[1498] = GetViolationListResponse.class;
        clsArr[1499] = GetViolationListResponse.ResponseData.class;
        clsArr[1500] = GetViolationListResponse.ResponseExtra.class;
        clsArr[1501] = GuideDetail.class;
        clsArr[1502] = RankDetail.class;
        clsArr[1503] = ReportRequest.class;
        clsArr[1504] = ReportResponse.class;
        clsArr[1505] = ReportResponse.ResponseData.class;
        clsArr[1506] = RulesAndGuidanceBanner.class;
        clsArr[1507] = RulesAndGuidanceBannerArea.class;
        clsArr[1508] = RulesAndGuidanceConfig.class;
        clsArr[1509] = RulesAndGuidanceContentArea.class;
        clsArr[1510] = RulesAndGuidanceContentDetail.class;
        clsArr[1511] = RulesAndGuidanceContentSubArea.class;
        clsArr[1512] = RulesAndGuidanceFunction.class;
        clsArr[1513] = RulesAndGuidanceFunctionArea.class;
        clsArr[1514] = RulesAndGuidanceRequest.class;
        clsArr[1515] = RulesAndGuidanceResponse.class;
        clsArr[1516] = RulesAndGuidanceResponse.ResponseData.class;
        clsArr[1517] = RulesAndGuidanceResponse.ResponseExtra.class;
        clsArr[1518] = SubmitFeedbackRequest.class;
        clsArr[1519] = SubmitFeedbackResponse.class;
        clsArr[1520] = SubmitFeedbackResponse.ResponseData.class;
        clsArr[1521] = SubmitFeedbackResponse.ResponseExtra.class;
        clsArr[1522] = SubmitRequest.class;
        clsArr[1523] = SubmitResponse.class;
        clsArr[1524] = SubmitResponse.ResponseData.class;
        clsArr[1525] = ViolationFeedback.class;
        clsArr[1526] = ViolationFeedbackDetail.class;
        clsArr[1527] = ViolationRecord.class;
        clsArr[1528] = ViolationRecordLiveInfo.class;
        clsArr[1529] = ViolationRecordPunishInfo.class;
        clsArr[1530] = MultiViolationStatusReq.class;
        clsArr[1531] = MultiViolationStatusResponse.class;
        clsArr[1532] = MultiViolationStatusResponse.ResponseExtra.class;
        clsArr[1533] = MultiViolationStatusResponse.ViolationData.class;
        clsArr[1534] = ViolationStatusReq.class;
        clsArr[1535] = ViolationStatusResponse.class;
        clsArr[1536] = ViolationStatusResponse.ResponseData.class;
        clsArr[1537] = ViolationStatusResponse.ResponseExtra.class;
        clsArr[1538] = AdminParam.class;
        clsArr[1539] = Background.class;
        clsArr[1540] = FansConfigRequest.class;
        clsArr[1541] = FansConfigResponse.class;
        clsArr[1542] = FansConfigResponse.Data.class;
        clsArr[1543] = FansDiscordOauthCallbackRequest.class;
        clsArr[1544] = FansDiscordOauthCallbackResponse.class;
        clsArr[1545] = FansDiscordOauthCallbackResponse.Data.class;
        clsArr[1546] = FansGetAnchorPageRequest.class;
        clsArr[1547] = FansGetAnchorPageResponse.class;
        clsArr[1548] = FansGetAnchorPageResponse.Data.class;
        clsArr[1549] = FansGetTaskInfoRequest.class;
        clsArr[1550] = FansGetTaskInfoResponse.class;
        clsArr[1551] = FansGetTaskInfoResponse.Data.class;
        clsArr[1552] = FansGetUserDataRequest.class;
        clsArr[1553] = FansGetUserDataResponse.class;
        clsArr[1554] = FansGetUserDataResponse.Data.class;
        clsArr[1555] = FansList.class;
        clsArr[1556] = FansParam.class;
        clsArr[1557] = FansPrivilegeDetailRequest.class;
        clsArr[1558] = FansPrivilegeDetailResponse.class;
        clsArr[1559] = FansPrivilegeDetailResponse.Data.class;
        clsArr[1560] = FansRankListRequest.class;
        clsArr[1561] = FansRankListResponse.class;
        clsArr[1562] = FansRankListResponse.Rank.class;
        clsArr[1563] = FansRankListResponse.ResponseData.class;
        clsArr[1564] = FirstRechargeParam.class;
        clsArr[1565] = GetDiscordSettingsRequest.class;
        clsArr[1566] = GetDiscordSettingsResponse.class;
        clsArr[1567] = GetDiscordSettingsResponse.Data.class;
        clsArr[1568] = GetFansDataRequest.class;
        clsArr[1569] = GetFansDataResponse.class;
        clsArr[1570] = GetFansDataResponse.ResponseData.class;
        clsArr[1571] = GradeConfig.class;
        clsArr[1572] = GradeInfoRequest.class;
        clsArr[1573] = GradeInfoResponse.class;
        clsArr[1574] = GradeInfoResponse.Data.class;
        clsArr[1575] = GradePrivilegeDetail.class;
        clsArr[1576] = GradePrivilegesRequest.class;
        clsArr[1577] = GradePrivilegesResponse.class;
        clsArr[1578] = GradePrivilegesResponse.Data.class;
        clsArr[1579] = GradeScoreRule.class;
        clsArr[1580] = GradeShowConfig.class;
        clsArr[1581] = GradeTab.class;
        clsArr[1582] = GradeTabRule.class;
        clsArr[1583] = JoinedFansClubRequest.class;
        clsArr[1584] = JoinedFansClubResponse.class;
        clsArr[1585] = JoinedFansClubResponse.FansClub.class;
        clsArr[1586] = JoinedFansClubResponse.ResponseData.class;
        clsArr[1587] = PayGradeInfo.class;
        clsArr[1588] = PrivilegeFAQ.class;
        clsArr[1589] = QueryBadgeStyleRequest.class;
        clsArr[1590] = QueryBadgeStyleRequest.Data.class;
        clsArr[1591] = QueryBadgeStyleResponse.class;
        clsArr[1592] = QueryBadgeStyleResponse.Data.class;
        clsArr[1593] = QueryUserPrivilegesRequest.class;
        clsArr[1594] = QueryUserPrivilegesResponse.class;
        clsArr[1595] = QueryUserPrivilegesResponse.Data.class;
        clsArr[1596] = QueryUserPrivilegesResponse.PrivilegeTab.class;
        clsArr[1597] = QuitFansClubRequest.class;
        clsArr[1598] = QuitFansClubResponse.class;
        clsArr[1599] = QuitFansClubResponse.QuitResp.class;
        clsArr[1600] = RankListParam.class;
        clsArr[1601] = RichText.class;
        clsArr[1602] = SelectPrivilegeRequest.class;
        clsArr[1603] = SelectPrivilegeResponse.class;
        clsArr[1604] = StarCommentDeleteRequest.class;
        clsArr[1605] = StarCommentDeleteResponse.class;
        clsArr[1606] = StarCommentDeleteResponse.Data.class;
        clsArr[1607] = StarCommentGetQueueRequest.class;
        clsArr[1608] = StarCommentGetQueueResponse.class;
        clsArr[1609] = StarCommentGetQueueResponse.Data.class;
        clsArr[1610] = StarCommentHistory.class;
        clsArr[1611] = StarCommentItem.class;
        clsArr[1612] = StarCommentPurchaseHistoryRequest.class;
        clsArr[1613] = StarCommentPurchaseHistoryResponse.class;
        clsArr[1614] = StarCommentPurchaseHistoryResponse.Data.class;
        clsArr[1615] = StarCommentPurchasePageRequest.class;
        clsArr[1616] = StarCommentPurchasePageResponse.class;
        clsArr[1617] = StarCommentPurchasePageResponse.Data.class;
        clsArr[1618] = StarCommentPurchaseRequest.class;
        clsArr[1619] = StarCommentPurchaseResponse.class;
        clsArr[1620] = StarCommentPurchaseResponse.Data.class;
        clsArr[1621] = StarCommentPurchaseResponse.Extra.class;
        clsArr[1622] = StarCommentQueue.class;
        clsArr[1623] = SubscriberParam.class;
        clsArr[1624] = UpdateDiscordSettingsRequest.class;
        clsArr[1625] = UpdateDiscordSettingsResponse.class;
        clsArr[1626] = UpdateDiscordSwitchRequest.class;
        clsArr[1627] = UpdateDiscordSwitchResponse.class;
        clsArr[1628] = UpdateDiscordSwitchResponse.SwitchResp.class;
        clsArr[1629] = UpgradeBarrageEffectConfig.class;
        clsArr[1630] = UpgradeEffectConfig.class;
        clsArr[1631] = UpgradeInfo.class;
        clsArr[1632] = UpgradePrivilege.class;
        clsArr[1633] = UserGrade.class;
        clsArr[1634] = UserGradeParam.class;
        clsArr[1635] = UserPrivilege.class;
        clsArr[1636] = BehaviorData.class;
        clsArr[1637] = BehaviorTrackParams.class;
        clsArr[1638] = BehaviorTrackResult.class;
        clsArr[1639] = BehaviorTrackResult.Response.class;
        clsArr[1640] = CouponDetailData.class;
        clsArr[1641] = DiamondBuyRequestParams.class;
        clsArr[1642] = DiamondBuyResult.class;
        clsArr[1643] = DiamondBuyResult.ABSPIPOInfo.class;
        clsArr[1644] = DiamondBuyResult.APPartnerAPIInAppRequest.class;
        clsArr[1645] = DiamondBuyResult.DiamondBuyData.class;
        clsArr[1646] = DiamondBuyResult.DiamondBuyExtra.class;
        clsArr[1647] = DiamondBuyResult.IapFailExtraData.class;
        clsArr[1648] = Exchange.class;
        clsArr[1649] = ExchangeInfoRequestParams.class;
        clsArr[1650] = ExchangeInfoResponse.class;
        clsArr[1651] = ExchangeInfoResponse.ExchangeInfoData.class;
        clsArr[1652] = GetABSStatusRequestParams.class;
        clsArr[1653] = GetABSStatusResponse.class;
        clsArr[1654] = GetABSStatusResponse.ABSData.class;
        clsArr[1655] = GetExchangeKYCRequestParams.class;
        clsArr[1656] = GetExchangeKYCResult.class;
        clsArr[1657] = GetTotalBalanceRequest.class;
        clsArr[1658] = GetTotalBalanceResponse.class;
        clsArr[1659] = GetTotalBalanceResponse.BalanceInfo.class;
        clsArr[1660] = GetTotalBalanceResponse.GetTotalBalanceData.class;
        clsArr[1661] = InfoRequestParams.class;
        clsArr[1662] = InfoResult.class;
        clsArr[1663] = InfoResult.InfoData.class;
        clsArr[1664] = InfoResult.InfoExtra.class;
        clsArr[1665] = PIPODetails.class;
        clsArr[1666] = PIPODetails.APPartnerAPIInAppRequest.class;
        clsArr[1667] = PayoutOnboardingDetailParams.class;
        clsArr[1668] = PayoutOnboardingDetailResult.class;
        clsArr[1669] = PayoutOnboardingDetailResult.Data.class;
        clsArr[1670] = QueryOrderRequestParams.class;
        clsArr[1671] = QueryOrderResult.class;
        clsArr[1672] = QueryOrderResult.ChargeOrderData.class;
        clsArr[1673] = QueryOrderResult.ChargeOrderExtra.class;
        clsArr[1674] = QueryOrderResult.CouponDetailData.class;
        clsArr[1675] = QueryOrderResult.KYCIncentive.class;
        clsArr[1676] = UnlockVoucherParams.class;
        clsArr[1677] = UnlockVoucherResult.class;
        clsArr[1678] = UnlockVoucherResult.Response.class;
        clsArr[1679] = UpdateABSStatusRequestParams.class;
        clsArr[1680] = UpdateABSStatusResponse.class;
        clsArr[1681] = UpdateABSStatusResponse.ABSData.class;
        clsArr[1682] = BackGroundImageState.class;
        clsArr[1683] = CohostUserInfo.class;
        clsArr[1684] = GroupChannelAllUser.class;
        clsArr[1685] = GroupChannelUser.class;
        clsArr[1686] = GroupPlayer.class;
        clsArr[1687] = LayoutState.class;
        clsArr[1688] = LinkMicAdContent.class;
        clsArr[1689] = LinkUserState.class;
        clsArr[1690] = PositionConfig.class;
        clsArr[1691] = StateReqCommon.class;
        clsArr[1692] = ABInfos.class;
        clsArr[1693] = AckStateReq.class;
        clsArr[1694] = AckStateResp.class;
        clsArr[1695] = AnchorMessage.class;
        clsArr[1696] = CancelJoinGroupReq.class;
        clsArr[1697] = CancelJoinGroupResp.class;
        clsArr[1698] = ChangeLayoutReq.class;
        clsArr[1699] = ChangeStateReq.class;
        clsArr[1700] = ChangeStateResp.class;
        clsArr[1701] = CreateChannelReq.class;
        clsArr[1702] = GetStateReq.class;
        clsArr[1703] = GetStateResp.class;
        clsArr[1704] = InitConfig.class;
        clsArr[1705] = JoinGroupReq.class;
        clsArr[1706] = JoinGroupResp.class;
        clsArr[1707] = KickOutAllGuestsParam.class;
        clsArr[1708] = KickOutAllGuestsResp.class;
        clsArr[1709] = LeaveJoinGroupReq.class;
        clsArr[1710] = LeaveJoinGroupResp.class;
        clsArr[1711] = LinkedUserInfo.class;
        clsArr[1712] = MGetABInfosReq.class;
        clsArr[1713] = MGetABInfosResp.class;
        clsArr[1714] = PermitJoinGroupReq.class;
        clsArr[1715] = PermitJoinGroupResp.class;
        clsArr[1716] = RechargeReq.class;
        clsArr[1717] = RechargeResp.class;
        clsArr[1718] = ResumeReq.class;
        clsArr[1719] = ResumeResp.class;
        clsArr[1720] = QueryUserIdentityParams.class;
        clsArr[1721] = QueryUserIdentityResponse.class;
        clsArr[1722] = BagItemConsumeRequestParams.class;
        clsArr[1723] = BagItemConsumeResponse.class;
        clsArr[1724] = BagItemConsumeResponse.Data.class;
        clsArr[1725] = BagItemConsumeResponse.Extra.class;
        clsArr[1726] = BagItemListRequestParams.class;
        clsArr[1727] = BagItemListResponse.class;
        clsArr[1728] = BagItemListResponse.Data.class;
        clsArr[1729] = BagItemListResponse.Extra.class;
        clsArr[1730] = BagItemObtainRequestParams.class;
        clsArr[1731] = BagItemObtainResponse.class;
        clsArr[1732] = BagItemObtainResponse.Data.class;
        clsArr[1733] = BagItemObtainResponse.Extra.class;
        clsArr[1734] = BattleAcceptRequest.class;
        clsArr[1735] = BattleAcceptResponse.class;
        clsArr[1736] = BattleAcceptResponse.ResponseData.class;
        clsArr[1737] = BattleAwardItemCardRequest.class;
        clsArr[1738] = BattleAwardItemCardResponse.class;
        clsArr[1739] = BattleAwardItemCardResponse.ResponseData.class;
        clsArr[1740] = PreScheduleStream.class;
        clsArr[1741] = PreScheduleStreamExtra.class;
        clsArr[1742] = PreScheduleStreamRequest.class;
        clsArr[1743] = PreScheduleStreamResponse.class;
        clsArr[1744] = PushStreamInfo.class;
        clsArr[1745] = PushStreamInfoExtra.class;
        clsArr[1746] = PushStreamInfoRequest.class;
        clsArr[1747] = PushStreamInfoResponse.class;
        clsArr[1748] = StreamResolution.class;
        clsArr[1749] = EnvelopeTemplateRequest.class;
        clsArr[1750] = EnvelopeTemplateResponse.class;
        clsArr[1751] = EnvelopeTemplateResponse.AnchorOnBoardPermit.class;
        clsArr[1752] = EnvelopeTemplateResponse.CustomRule.class;
        clsArr[1753] = EnvelopeTemplateResponse.EnvelopeTemplate.class;
        clsArr[1754] = EnvelopeTemplateResponse.PortalCustomRule.class;
        clsArr[1755] = EnvelopeTemplateResponse.PortalTemplate.class;
        clsArr[1756] = EnvelopeTemplateResponse.ResponseData.class;
        clsArr[1757] = PortalListRequest.class;
        clsArr[1758] = PortalListResponse.class;
        clsArr[1759] = PortalListResponse.PortalInfo.class;
        clsArr[1760] = PortalListResponse.ResponseData.class;
        clsArr[1761] = RevenuePermissionRequest.class;
        clsArr[1762] = RevenuePermissionResponse.class;
        clsArr[1763] = RevenuePermissionResponse.ResponseData.class;
        clsArr[1764] = AwemeCommerceStructV2.class;
        clsArr[1765] = AwemeStructV2.class;
        clsArr[1766] = BlockRecommendUserExtra.class;
        clsArr[1767] = BlockRecommendUserRequestParams.class;
        clsArr[1768] = BlockRecommendUserResponse.class;
        clsArr[1769] = ExtraStructV2.class;
        clsArr[1770] = FeedV2RequestParams.class;
        clsArr[1771] = FeedV2Response.class;
        clsArr[1772] = FollowRecommendItem.class;
        clsArr[1773] = FollowRecommendListExtra.class;
        clsArr[1774] = FollowRecommendListRequestParams.class;
        clsArr[1775] = FollowRecommendListResponse.class;
        clsArr[1776] = LogPbStructV2.class;
        clsArr[1777] = PseudoAdData.class;
        clsArr[1778] = WebcastRoomFeedCellStructV2.class;
        clsArr[1779] = CampaignOperateParams.class;
        clsArr[1780] = CampaignOperateResp.class;
        clsArr[1781] = CampaignOperateResp.Data.class;
        clsArr[1782] = GetFirstRechargeInfoV2Params.class;
        clsArr[1783] = GetFirstRechargeInfoV2Resp.class;
        clsArr[1784] = GetFirstRechargeInfoV2Resp.Data.class;
        clsArr[1785] = GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule.class;
        clsArr[1786] = GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1.class;
        clsArr[1787] = GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2.class;
        clsArr[1788] = AnchorRank.class;
        clsArr[1789] = AnchorSearchRequest.class;
        clsArr[1790] = AnchorSearchResponse.class;
        clsArr[1791] = AnchorSearchResponse.ResponseData.class;
        clsArr[1792] = AnchorTagListResult.class;
        clsArr[1793] = Audience.class;
        clsArr[1794] = AudienceInfo.class;
        clsArr[1795] = BrowserInfo.class;
        clsArr[1796] = ChangeNotifyRequest.class;
        clsArr[1797] = ChangeNotifyResponse.class;
        clsArr[1798] = ChangeNotifyResponse.ResponseData.class;
        clsArr[1799] = CreateInfoRequest.class;
        clsArr[1800] = CreateInfoResponse.class;
        clsArr[1801] = CreateInfoResponse.ResponseData.class;
        clsArr[1802] = DualDeviceUpdateRequest.class;
        clsArr[1803] = DualDeviceUpdateResponse.class;
        clsArr[1804] = DualDeviceUpdateResponse.ResponseData.class;
        clsArr[1805] = webcast.api.game.FeedExtra.class;
        clsArr[1806] = FeedExtra.LogPb.class;
        clsArr[1807] = GameAnchorCategory.class;
        clsArr[1808] = GameCategory.class;
        clsArr[1809] = GameSubActANewAudienceListRequest.class;
        clsArr[1810] = GameSubActAnchorRankRequest.class;
        clsArr[1811] = GameSubActAnchorRankResponse.class;
        clsArr[1812] = GameSubActAnchorRankResponse.ResponseData.class;
        clsArr[1813] = GameSubActApplyRequest.class;
        clsArr[1814] = GameSubActApplyResponse.class;
        clsArr[1815] = GameSubActApplyResponse.ResponseData.class;
        clsArr[1816] = GameSubActGetAnchorClaimNumRequest.class;
        clsArr[1817] = GameSubActGetAnchorClaimNumResponse.class;
        clsArr[1818] = GameSubActGetAnchorClaimNumResponse.ResponseData.class;
        clsArr[1819] = GameSubActGetRandUnfinishedAnchorRequest.class;
        clsArr[1820] = GameSubActGetRandUnfinishedAnchorResponse.class;
        clsArr[1821] = GameSubActGetRandUnfinishedAnchorResponse.ResponseData.class;
        clsArr[1822] = GameSubActNewAudienceListResponse.class;
        clsArr[1823] = GameSubActNewAudienceListResponse.ResponseData.class;
        clsArr[1824] = GameTagSearchResult.class;
        clsArr[1825] = GetEmailCntRequest.class;
        clsArr[1826] = GetEmailCntResponse.class;
        clsArr[1827] = GetEmailCntResponse.ResponseData.class;
        clsArr[1828] = GetGameVideoListRequest.class;
        clsArr[1829] = GetGameVideoListResponse.class;
        clsArr[1830] = GetGameVideoListResponse.ResponseData.class;
        clsArr[1831] = ListSugPollRequest.class;
        clsArr[1832] = ListSugPollResponse.class;
        clsArr[1833] = ListSugPollResponse.ResponseData.class;
        clsArr[1834] = LiveFragmentClipEditRequest.class;
        clsArr[1835] = LiveFragmentClipEditResponse.class;
        clsArr[1836] = LiveFragmentClipEditResponse.ResponseData.class;
        clsArr[1837] = LiveFragmentMontageRequest.class;
        clsArr[1838] = LiveFragmentMontageResponse.class;
        clsArr[1839] = LiveFragmentMontageResponse.ResponseData.class;
        clsArr[1840] = OpenLsNotifyInfo.class;
        clsArr[1841] = RegionCheckRequest.class;
        clsArr[1842] = RegionCheckResponse.class;
        clsArr[1843] = RegionCheckResponse.ResponseData.class;
        clsArr[1844] = Reward.class;
        clsArr[1845] = SearchTagRequest.class;
        clsArr[1846] = SearchTagResponse.class;
        clsArr[1847] = SearchTagResponse.ResponseData.class;
        clsArr[1848] = SingleBrowserInfo.class;
        clsArr[1849] = SubActAnchorActInfoRequest.class;
        clsArr[1850] = SubActAnchorActInfoResponse.class;
        clsArr[1851] = SubActAnchorActInfoResponse.ResponseData.class;
        clsArr[1852] = SubActClaimRequest.class;
        clsArr[1853] = SubActClaimResponse.class;
        clsArr[1854] = SubActClaimResponse.ResponseData.class;
        clsArr[1855] = SubActGetMlbbBindInfoRequest.class;
        clsArr[1856] = SubActGetMlbbBindInfoResponse.class;
        clsArr[1857] = SubActGetMlbbBindInfoResponse.ResponseData.class;
        clsArr[1858] = SubActGetRewardRequest.class;
        clsArr[1859] = SubActGetRewardResponse.class;
        clsArr[1860] = SubActGetRewardResponse.ResponseData.class;
        clsArr[1861] = SubActQuotaLockRequest.class;
        clsArr[1862] = SubActQuotaLockResponse.class;
        clsArr[1863] = SubActQuotaLockResponse.ResponseData.class;
        clsArr[1864] = SubActRewardAudienceInfoRequest.class;
        clsArr[1865] = SubActRewardAudienceInfoResponse.class;
        clsArr[1866] = SubActRewardAudienceInfoResponse.ResponseData.class;
        clsArr[1867] = TnsPiracyDetail.class;
        clsArr[1868] = TnsPiracyInfoRequest.class;
        clsArr[1869] = TnsPiracyInfoResponse.class;
        clsArr[1870] = TnsPiracyInfoResponse.ResponseData.class;
        clsArr[1871] = VcloudVideoEditParamVideoExtra.class;
        clsArr[1872] = VcloudVideoEditParamVideoTrack.class;
        clsArr[1873] = VideoCopyRequest.class;
        clsArr[1874] = VideoCopyResponse.class;
        clsArr[1875] = VideoCopyResponse.ResponseData.class;
        clsArr[1876] = VideoCutsInfo.class;
        clsArr[1877] = VideoCutsInfoCropParam.class;
        clsArr[1878] = VideoTrack.class;
        clsArr[1879] = DownloadRequest.class;
        clsArr[1880] = DownloadResponse.class;
        clsArr[1881] = DownloadResponse.ResponseData.class;
        clsArr[1882] = GameDetailBaseRequest.class;
        clsArr[1883] = GameDetailBaseResponse.class;
        clsArr[1884] = GameDetailBaseResponse.ResponseData.class;
        clsArr[1885] = GameDetailExtraRequest.class;
        clsArr[1886] = GameDetailExtraResponse.class;
        clsArr[1887] = GameDetailExtraResponse.ResponseData.class;
        clsArr[1888] = GameDetailPreviewRequest.class;
        clsArr[1889] = GameDetailPreviewResponse.class;
        clsArr[1890] = GameDetailPreviewResponse.ResponseData.class;
        clsArr[1891] = GetGoodyBagDetailRequest.class;
        clsArr[1892] = GetGoodyBagDetailResponse.class;
        clsArr[1893] = GetGoodyBagDetailResponse.ResponseData.class;
        clsArr[1894] = GetGoodyBagHistoryRequest.class;
        clsArr[1895] = GetGoodyBagHistoryResponse.class;
        clsArr[1896] = GetGoodyBagHistoryResponse.CoinHistoryItem.class;
        clsArr[1897] = GetGoodyBagHistoryResponse.HistoryItem.class;
        clsArr[1898] = GetGoodyBagHistoryResponse.ResponseData.class;
        clsArr[1899] = GetGoodyBagLotteryRequest.class;
        clsArr[1900] = GetGoodyBagLotteryResponse.class;
        clsArr[1901] = GetGoodyBagLotteryResponse.ResponseData.class;
        clsArr[1902] = GetGoodyBagTemplateRequest.class;
        clsArr[1903] = GetGoodyBagTemplateResponse.class;
        clsArr[1904] = GetGoodyBagTemplateResponse.CoinTemplate.class;
        clsArr[1905] = GetGoodyBagTemplateResponse.CommonTemplate.class;
        clsArr[1906] = GetGoodyBagTemplateResponse.PreCheckResult.class;
        clsArr[1907] = GetGoodyBagTemplateResponse.ResponseData.class;
        clsArr[1908] = GetGoodyBagWinnerListRequest.class;
        clsArr[1909] = GetGoodyBagWinnerListResponse.class;
        clsArr[1910] = GetGoodyBagWinnerListResponse.ResponseData.class;
        clsArr[1911] = GetRoomGoodyBagRequest.class;
        clsArr[1912] = GetRoomGoodyBagResponse.class;
        clsArr[1913] = GetRoomGoodyBagResponse.ResponseData.class;
        clsArr[1914] = GoodyBagSignupRequest.class;
        clsArr[1915] = GoodyBagSignupResponse.class;
        clsArr[1916] = GoodyBagSignupResponse.ResponseData.class;
        clsArr[1917] = SendGoodyBagRequest.class;
        clsArr[1918] = SendGoodyBagRequest.CoinGoodyBagParam.class;
        clsArr[1919] = SendGoodyBagResponse.class;
        clsArr[1920] = SendGoodyBagResponse.ResponseData.class;
        clsArr[1921] = TextReviewRequest.class;
        clsArr[1922] = TextReviewResponse.class;
        clsArr[1923] = TextReviewResponse.ResponseData.class;
        clsArr[1924] = PinRequest.class;
        clsArr[1925] = webcast.api.interaction.PinResponse.class;
        clsArr[1926] = PinResponse.ResponseData.class;
        clsArr[1927] = QueryPollRequest.class;
        clsArr[1928] = QueryPollResponse.class;
        clsArr[1929] = QueryPollResponse.Data.class;
        clsArr[1930] = QueryVoteUserRequest.class;
        clsArr[1931] = QueryVoteUserResponse.class;
        clsArr[1932] = QueryVoteUserResponse.Data.class;
        clsArr[1933] = ChangeWordRequest.class;
        clsArr[1934] = ChangeWordResponse.class;
        clsArr[1935] = PictionaryRankRequest.class;
        clsArr[1936] = PictionaryRankResponse.class;
        clsArr[1937] = PictionaryRankResponse.ResponseData.class;
        clsArr[1938] = RankEntry.class;
        clsArr[1939] = ReviewWordRequest.class;
        clsArr[1940] = ReviewWordResponse.class;
        clsArr[1941] = ReviewWordResponse.ResponseData.class;
        clsArr[1942] = ReviewWordResponse.ReviewWordExtra.class;
        clsArr[1943] = webcast.api.linkmic.ApplyParams.class;
        clsArr[1944] = webcast.api.linkmic.ApplyResponse.class;
        clsArr[1945] = ApplyResponse.ApplyExtra.class;
        clsArr[1946] = ApplyResponse.ApplyExtra.LogPb.class;
        clsArr[1947] = ApplyResponse.ResponseData.class;
        clsArr[1948] = GetUserLinkmicStatusResponse.class;
        clsArr[1949] = GetUserLinkmicStatusResponse.ResponseData.class;
        clsArr[1950] = webcast.api.linkmic.KickOutResponse.class;
        clsArr[1951] = KickOutResponse.ResponseData.class;
        clsArr[1952] = LeaveParams.class;
        clsArr[1953] = LeaveResponse.class;
        clsArr[1954] = LeaveResponse.ResponseData.class;
        clsArr[1955] = AnchorCheckAndJoinEventRequest.class;
        clsArr[1956] = AnchorCheckAndJoinEventResponse.class;
        clsArr[1957] = AnchorCheckAndJoinEventResponse.ResponseData.class;
        clsArr[1958] = AnchorEventJoinRequest.class;
        clsArr[1959] = AnchorEventJoinResponse.class;
        clsArr[1960] = AnchorEventJoinResponse.ResponseData.class;
        clsArr[1961] = AnchorEventsRequest.class;
        clsArr[1962] = AnchorEventsResponse.class;
        clsArr[1963] = AnchorEventsResponse.ResponseData.class;
        clsArr[1964] = AnchorInfoRequest.class;
        clsArr[1965] = AnchorInfoResponse.class;
        clsArr[1966] = AnchorInfoResponse.DropsEntrance.class;
        clsArr[1967] = AnchorInfoResponse.LabelFilterInfo.class;
        clsArr[1968] = AnchorInfoResponse.PartnershipInfo.class;
        clsArr[1969] = AnchorInfoResponse.PunishInfo.class;
        clsArr[1970] = AnchorInfoResponse.ResponseData.class;
        clsArr[1971] = AnchorInfoResponse.TaskPriceUpdate.class;
        clsArr[1972] = AnchorInfoResponse.ToggleInfo.class;
        clsArr[1973] = AnchorRoomInfoRequest.class;
        clsArr[1974] = AnchorRoomInfoResponse.class;
        clsArr[1975] = AnchorRoomInfoResponse.DropsInfo.class;
        clsArr[1976] = AnchorRoomInfoResponse.PartnershipInfo.class;
        clsArr[1977] = AnchorRoomInfoResponse.ResponseData.class;
        clsArr[1978] = AnchorToggleInfoRequest.class;
        clsArr[1979] = AnchorToggleInfoResponse.class;
        clsArr[1980] = AnchorToggleInfoResponse.ResponseData.class;
        clsArr[1981] = AudienceRoomInfoRequest.class;
        clsArr[1982] = AudienceRoomInfoResponse.class;
        clsArr[1983] = AudienceRoomInfoResponse.DropsInfo.class;
        clsArr[1984] = AudienceRoomInfoResponse.EsportsBriefMatchInfo.class;
        clsArr[1985] = AudienceRoomInfoResponse.EsportsBriefTournamentInfo.class;
        clsArr[1986] = AudienceRoomInfoResponse.PartnershipInfo.class;
        clsArr[1987] = AudienceRoomInfoResponse.ResponseData.class;
        clsArr[1988] = BenefitClaimRequest.class;
        clsArr[1989] = BenefitClaimResponse.class;
        clsArr[1990] = BenefitClaimResponse.ResponseData.class;
        clsArr[1991] = BenefitDetailRequest.class;
        clsArr[1992] = BenefitDetailResponse.class;
        clsArr[1993] = BenefitDetailResponse.ResponseData.class;
        clsArr[1994] = BenefitRecordsRequest.class;
        clsArr[1995] = BenefitRecordsResponse.class;
        clsArr[1996] = BenefitRecordsResponse.ResponseData.class;
        clsArr[1997] = CancelReserveMatchScheduleRequest.class;
        clsArr[1998] = CancelReserveMatchScheduleResponse.class;
        clsArr[1999] = CancelReserveMatchScheduleResponse.ResponseData.class;
        clsArr[2000] = ChangeBusinessStatusRequest.class;
        clsArr[2001] = ChangeBusinessStatusResponse.class;
        clsArr[2002] = CommentCheckRequest.class;
        clsArr[2003] = CommentCheckResponse.class;
        clsArr[2004] = DisplayingTasksRequest.class;
        clsArr[2005] = DisplayingTasksResponse.class;
        clsArr[2006] = DisplayingTasksResponse.ResponseData.class;
        clsArr[2007] = DropsClaimRequest.class;
        clsArr[2008] = DropsClaimResponse.class;
        clsArr[2009] = DropsClaimResponse.ResponseData.class;
        clsArr[2010] = DropsDetailRequest.class;
        clsArr[2011] = DropsDetailResponse.class;
        clsArr[2012] = DropsDetailResponse.ResponseData.class;
        clsArr[2013] = DropsListRequest.class;
        clsArr[2014] = DropsListResponse.class;
        clsArr[2015] = DropsListResponse.ResponseData.class;
        clsArr[2016] = DropsRankListRequest.class;
        clsArr[2017] = DropsRankListResponse.class;
        clsArr[2018] = DropsRankListResponse.ResponseData.class;
        clsArr[2019] = DropsReportRequest.class;
        clsArr[2020] = DropsReportResponse.class;
        clsArr[2021] = DropsRewardsRequest.class;
        clsArr[2022] = DropsRewardsResponse.class;
        clsArr[2023] = DropsRewardsResponse.ResponseData.class;
        clsArr[2024] = DropsSignRequest.class;
        clsArr[2025] = DropsSignResponse.class;
        clsArr[2026] = DropsStartRequest.class;
        clsArr[2027] = DropsStartResponse.class;
        clsArr[2028] = DropsStartResponse.ResponseData.class;
        clsArr[2029] = DropsTaskEditRequest.class;
        clsArr[2030] = DropsTaskEditRequest.EditData.class;
        clsArr[2031] = DropsTaskEditResponse.class;
        clsArr[2032] = DropsTaskEditResponse.ResponseData.class;
        clsArr[2033] = DropsTaskEditResponse.TaskResult.class;
        clsArr[2034] = FeedbackTagRequest.class;
        clsArr[2035] = FeedbackTagResponse.class;
        clsArr[2036] = FeedbackTagResponse.ResponseData.class;
        clsArr[2037] = FeedbackTagResponse.ResponseData.FeedbackTag.class;
        clsArr[2038] = FeedbackTagResponse.ResponseData.FeedbackTag.FeedbackSubTag.class;
        clsArr[2039] = GameDetailRequest.class;
        clsArr[2040] = GameDetailResponse.class;
        clsArr[2041] = GameDetailResponse.ResponseData.class;
        clsArr[2042] = GetDropsStatusRequest.class;
        clsArr[2043] = GetDropsStatusResponse.class;
        clsArr[2044] = GetDropsStatusResponse.ResponseData.class;
        clsArr[2045] = HideTaskRequest.class;
        clsArr[2046] = HideTaskResponse.class;
        clsArr[2047] = LabelFilterInfo.class;
        clsArr[2048] = MatchScheduleRequest.class;
        clsArr[2049] = MatchScheduleResponse.class;
        clsArr[2050] = MatchScheduleResponse.ResponseData.class;
        clsArr[2051] = OpenAuthCheckRequest.class;
        clsArr[2052] = OpenAuthCheckRequest.DropsParam.class;
        clsArr[2053] = OpenAuthCheckResponse.class;
        clsArr[2054] = OpenAuthCheckResponse.ResponseData.class;
        clsArr[2055] = PunishInfo.class;
        clsArr[2056] = ReserveMatchScheduleRequest.class;
        clsArr[2057] = ReserveMatchScheduleResponse.class;
        clsArr[2058] = ReserveMatchScheduleResponse.ResponseData.class;
        clsArr[2059] = ShowTaskRequest.class;
        clsArr[2060] = ShowTaskResponse.class;
        clsArr[2061] = SubmitCPFeedbackRequest.class;
        clsArr[2062] = SubmitCPFeedbackResponse.class;
        clsArr[2063] = TaskPriceUpdate.class;
        clsArr[2064] = UserInfoRequest.class;
        clsArr[2065] = UserInfoResponse.class;
        clsArr[2066] = UserInfoResponse.ResponseData.class;
        clsArr[2067] = ListRequestParams.class;
        clsArr[2068] = ListResult.class;
        clsArr[2069] = ListResult.ActivityDetail.class;
        clsArr[2070] = ListResult.ActivityInfo.class;
        clsArr[2071] = ListResult.ExtraDiamondItem.class;
        clsArr[2072] = ListResult.IapCustomData.class;
        clsArr[2073] = ListResult.IapUnitPrice.class;
        clsArr[2074] = ListResult.ListResultExtra.class;
        clsArr[2075] = ListResult.VoucherItem.class;
        clsArr[2076] = ListResult.VoucherItem.CashbackInfo.class;
        clsArr[2077] = ListResult.VoucherItem.CashbackInfo.CashbackPercentage.class;
        clsArr[2078] = ListResult.VoucherItem.CashbackInfo.USDConversionRate.class;
        clsArr[2079] = ListResult.VoucherItem.VoucherStarlingContent.class;
        clsArr[2080] = ListResult.WebDisplayData.class;
        clsArr[2081] = HallOfFameRankExtra.class;
        clsArr[2082] = LynxRankView.class;
        clsArr[2083] = RankExtraInfo.class;
        clsArr[2084] = ActivityInfo.class;
        clsArr[2085] = ComponentInfo.class;
        clsArr[2086] = ComponentTask.class;
        clsArr[2087] = ComponentTaskProcess.class;
        clsArr[2088] = LevelTask.class;
        clsArr[2089] = LevelTaskProcess.class;
        clsArr[2090] = LiveInfo.class;
        clsArr[2091] = ReferralMentorRankListReq.class;
        clsArr[2092] = ReferralMentorRankListResp.class;
        clsArr[2093] = ReferralMentorRankListResp.Data.class;
        clsArr[2094] = ReferralMentorRankListResp.MentorRankItem.class;
        clsArr[2095] = ReferralOptOutRequest.class;
        clsArr[2096] = ReferralOptOutResponse.class;
        clsArr[2097] = ReferralOptOutResponse.Data.class;
        clsArr[2098] = ReferralSubmitEmailRequest.class;
        clsArr[2099] = ReferralSubmitEmailResponse.class;
        clsArr[2100] = ReferralSubmitEmailResponse.Data.class;
        clsArr[2101] = Task.class;
        clsArr[2102] = Task.Reward.class;
        clsArr[2103] = UserInfoMeta.class;
        clsArr[2104] = webcast.api.room.AnchorLevelPermission.class;
        clsArr[2105] = CollectionSongsRequest.class;
        clsArr[2106] = CollectionSongsResponse.class;
        clsArr[2107] = CollectionSongsResponse.PageSongs.class;
        clsArr[2108] = CommentFlaggedPrompt.class;
        clsArr[2109] = CppAgeVerifyRequest.class;
        clsArr[2110] = CppAgeVerifyResponse.class;
        clsArr[2111] = CppAgeVerifyResponse.Data.class;
        clsArr[2112] = CppAgeVerifyResponse.Extra.class;
        clsArr[2113] = CppSafetyEducationRequest.class;
        clsArr[2114] = CppSafetyEducationResponse.class;
        clsArr[2115] = CppSafetyEducationResponse.Data.class;
        clsArr[2116] = CppSafetyEducationResponse.Extra.class;
        clsArr[2117] = CppTaskInfoRequest.class;
        clsArr[2118] = CppTaskInfoResponse.class;
        clsArr[2119] = CppTaskInfoResponse.Data.class;
        clsArr[2120] = CppTaskInfoResponse.Data.BanStatus.class;
        clsArr[2121] = CppTaskInfoResponse.Extra.class;
        clsArr[2122] = EventCollectData.class;
        clsArr[2123] = EventCollectRequest.class;
        clsArr[2124] = EventCollectResponse.class;
        clsArr[2125] = EventCollectResponse.EventCollectExtra.class;
        clsArr[2126] = FavouritesPack.class;
        clsArr[2127] = FirstScreenRequest.class;
        clsArr[2128] = FirstScreenResponse.class;
        clsArr[2129] = FirstScreenResponse.ResponseData.class;
        clsArr[2130] = FirstScreenRoom.class;
        clsArr[2131] = FrequencyControlData.class;
        clsArr[2132] = FrequencyControlExtra.class;
        clsArr[2133] = FrequencyControlParams.class;
        clsArr[2134] = FrequencyControlResponse.class;
        clsArr[2135] = GetOnlineRoomPCURequest.class;
        clsArr[2136] = GetOnlineRoomPCUResponse.class;
        clsArr[2137] = GetOnlineRoomPCUResponse.ResponseData.class;
        clsArr[2138] = GetSandBoxRoomListRequest.class;
        clsArr[2139] = GetSandBoxRoomListResponse.class;
        clsArr[2140] = GetSandBoxRoomListResponse.ResponseData.class;
        clsArr[2141] = GetSandBoxRoomListResponse.SandBoxRoom.class;
        clsArr[2142] = LivePermissionApply.class;
        clsArr[2143] = LivePodcastRequest.class;
        clsArr[2144] = LivePodcastResponse.class;
        clsArr[2145] = LivePodcastResponse.ResponseData.class;
        clsArr[2146] = LiveScenario.class;
        clsArr[2147] = MockRequest.class;
        clsArr[2148] = MockResponse.class;
        clsArr[2149] = MockResponse.Data.class;
        clsArr[2150] = MockResponse.GuideVideoURL.class;
        clsArr[2151] = MusicRequest.class;
        clsArr[2152] = MusicResponse.class;
        clsArr[2153] = MusicResponse.Pack.class;
        clsArr[2154] = MusicResponse.Packs.class;
        clsArr[2155] = PlaylistPack.class;
        clsArr[2156] = PreloadRoomExtra.class;
        clsArr[2157] = PreloadRoomParams.class;
        clsArr[2158] = PreloadRoomResponse.class;
        clsArr[2159] = PreviewTimeReportRequest.class;
        clsArr[2160] = PreviewTimeReportResponse.class;
        clsArr[2161] = PreviewTimeReportResponse.ResponseData.class;
        clsArr[2162] = RecommendSensitiveWordReq.class;
        clsArr[2163] = RecommendSensitiveWordResp.class;
        clsArr[2164] = RecommendSensitiveWordResp.ResponseData.class;
        clsArr[2165] = RoomComponentsV2Request.class;
        clsArr[2166] = RoomComponentsV2Response.class;
        clsArr[2167] = RoomGoalsRequest.class;
        clsArr[2168] = RoomGoalsResponse.class;
        clsArr[2169] = SwipingGuidanceRequest.class;
        clsArr[2170] = SwipingGuidanceResponse.class;
        clsArr[2171] = SwipingGuidanceResponse.ResponseData.class;
        clsArr[2172] = TryMode.class;
        clsArr[2173] = UpdateFrequencyControlData.class;
        clsArr[2174] = UpdateFrequencyControlExtra.class;
        clsArr[2175] = UpdateFrequencyControlParams.class;
        clsArr[2176] = UpdateFrequencyControlResponse.class;
        clsArr[2177] = CreateTimerRequest.class;
        clsArr[2178] = CreateTimerResponse.class;
        clsArr[2179] = CreateTimerResponse.Data.class;
        clsArr[2180] = GetAnchorSubscriberListResponse.class;
        clsArr[2181] = GetAnchorSubscriberListResponse.Data.class;
        clsArr[2182] = GetAnchorSubscriptionResponse.class;
        clsArr[2183] = GetAnchorSubscriptionResponse.Data.class;
        clsArr[2184] = GetSubGoalRequest.class;
        clsArr[2185] = GetSubGoalResponse.class;
        clsArr[2186] = GetSubGoalResponse.Data.class;
        clsArr[2187] = GetSubGoalResponse.SubGoalHistoryInfo.class;
        clsArr[2188] = GetSubGoalResponse.SubPin.class;
        clsArr[2189] = GetSubH5SharePageRequest.class;
        clsArr[2190] = GetSubH5SharePageResponse.class;
        clsArr[2191] = GetSubH5SharePageResponse.Data.class;
        clsArr[2192] = GetSubH5SharePageResponse.Data.SubNoteInfo.class;
        clsArr[2193] = GetSubH5SharePageResponse.Data.SubscribePermission.class;
        clsArr[2194] = GetSubPrivilegeDetailRequest.class;
        clsArr[2195] = GetSubPrivilegeDetailResponse.class;
        clsArr[2196] = GetSubPrivilegeDetailResponse.Data.class;
        clsArr[2197] = GetSubPrivilegeDetailResponse.Data.SubNoteInfo.class;
        clsArr[2198] = GetSubPrivilegeDetailResponse.Data.SubscribePermission.class;
        clsArr[2199] = GetTimerSubscriberListRequest.class;
        clsArr[2200] = GetTimerSubscriberListResponse.class;
        clsArr[2201] = GetTimerSubscriberListResponse.Data.class;
        clsArr[2202] = GetUserSubInfoRequest.class;
        clsArr[2203] = GetUserSubInfoResponse.class;
        clsArr[2204] = GetUserSubInfoResponse.Data.class;
        clsArr[2205] = GiftSubInfoData.class;
        clsArr[2206] = GiftSubInfoRequest.class;
        clsArr[2207] = GiftSubInfoResponse.class;
        clsArr[2208] = GiftSubInfoResponse.Data.class;
        clsArr[2209] = GiftSubTemplateInfo.class;
        clsArr[2210] = GiftSubTemplateListData.class;
        clsArr[2211] = GiftSubTemplateListRequest.class;
        clsArr[2212] = GiftSubTemplateListResponse.class;
        clsArr[2213] = ImageConvertRequest.class;
        clsArr[2214] = ImageConvertResponse.class;
        clsArr[2215] = ImageConvertResponse.Data.class;
        clsArr[2216] = ImageConvertResponse.Images.class;
        clsArr[2217] = OfferInfo.class;
        clsArr[2218] = PerksPinPanel.class;
        clsArr[2219] = SpotlightRequest.class;
        clsArr[2220] = SpotlightResponse.class;
        clsArr[2221] = SpotlightResponse.ResponseData.class;
        clsArr[2222] = SpotlightUpdateItem.class;
        clsArr[2223] = SpotlightUpdateRequest.class;
        clsArr[2224] = SpotlightUpdateResponse.class;
        clsArr[2225] = SpotlightUpdateResponse.ResponseData.class;
        clsArr[2226] = SubGoal.class;
        clsArr[2227] = SubManagementRequest.class;
        clsArr[2228] = SubManagementResponse.class;
        clsArr[2229] = SubManagementResponse.Data.class;
        clsArr[2230] = SubPinRequest.class;
        clsArr[2231] = SubPinResponse.class;
        clsArr[2232] = SubUnPinRequest.class;
        clsArr[2233] = SubUnPinResponse.class;
        clsArr[2234] = SubscriberCountInfo.class;
        clsArr[2235] = SubscriberMsg.class;
        clsArr[2236] = TagInfo.class;
        clsArr[2237] = TemplateInfo.class;
        clsArr[2238] = TemplateListData.class;
        clsArr[2239] = TemplateListRequest.class;
        clsArr[2240] = TemplateListResponse.class;
        clsArr[2241] = webcast.api.sub.Tip.class;
        clsArr[2242] = MultiUserRequestParams.class;
        clsArr[2243] = MultiUserResponse.class;
        clsArr[2244] = RelationData.class;
        clsArr[2245] = RelationExtra.class;
        clsArr[2246] = RelationRequestParams.class;
        clsArr[2247] = RelationResponse.class;
        clsArr[2248] = UpdateBlockStatusRequestParams.class;
        clsArr[2249] = UpdateBlockStatusResponse.class;
        clsArr[2250] = UserExtra.class;
        clsArr[2251] = UserInfoMeResponse.class;
        clsArr[2252] = UserInfoRequestParams.class;
        clsArr[2253] = UserRequestParams.class;
        clsArr[2254] = UserResponse.class;
        clsArr[2255] = AnchorUser.class;
        clsArr[2256] = AppealInfo.class;
        clsArr[2257] = BagItem.class;
        clsArr[2258] = BagItemPreUpdateInfo.class;
        clsArr[2259] = DiscordEntrance.class;
        clsArr[2260] = EventCard.class;
        clsArr[2261] = FansBannerConfig.class;
        clsArr[2262] = FansConfig.class;
        clsArr[2263] = FansDiscordGuildInfo.class;
        clsArr[2264] = FansDiscordRoleInfo.class;
        clsArr[2265] = FansLevelInfo.class;
        clsArr[2266] = FansLevelShowConfig.class;
        clsArr[2267] = FansPrivilege.class;
        clsArr[2268] = FansPrivilegeBackground.class;
        clsArr[2269] = FansPrivilegeDetail.class;
        clsArr[2270] = FansPrivilegeRichText.class;
        clsArr[2271] = FansScoreRule.class;
        clsArr[2272] = FansTask.class;
        clsArr[2273] = FansTaskAverageRewardConfig.class;
        clsArr[2274] = FansTaskConfig.class;
        clsArr[2275] = FansTaskLevelRewardConfig.class;
        clsArr[2276] = FansUpgradeBarrageEffectConfig.class;
        clsArr[2277] = FansUpgradeDynamicEffectConfig.class;
        clsArr[2278] = FansUpgradePrivilege.class;
        clsArr[2279] = Hello.class;
        clsArr[2280] = InteractionConflict.class;
        clsArr[2281] = InteractionConflictItem.class;
        clsArr[2282] = MsgFilter.class;
        clsArr[2283] = MultiGuestLinkmicInfo.class;
        clsArr[2284] = MultiGuestLinkmicInfo.ListUser.class;
        clsArr[2285] = MusicCollection.class;
        clsArr[2286] = MusicSong.class;
        clsArr[2287] = webcast.data.RankUser.class;
        clsArr[2288] = RankUser.Border.class;
        clsArr[2289] = RankUser.FollowInfo.class;
        clsArr[2290] = RealtimeLiveCenterBaseData.class;
        clsArr[2291] = RealtimeLiveCenterShopData.class;
        clsArr[2292] = RealtimeLiveCenterTips.class;
        clsArr[2293] = RealtimeViolationRecord.class;
        clsArr[2294] = RechargeCustomError.class;
        clsArr[2295] = RechargePopUpContentReplace.class;
        clsArr[2296] = ReqSong.class;
        clsArr[2297] = RoomMultiGuestLinkmicInfo.class;
        clsArr[2298] = SlotFansRecord.class;
        clsArr[2299] = StandardMoney.class;
        clsArr[2300] = TimeStruct.class;
        clsArr[2301] = UserIdentity.class;
        clsArr[2302] = BizJoinGroupParams.class;
        clsArr[2303] = BizJoinGroupResponse.class;
        clsArr[2304] = BizJoinGroupResponse.ResponseData.class;
        clsArr[2305] = BizLeaveJoinGroupParams.class;
        clsArr[2306] = BizLeaveJoinGroupResponse.class;
        clsArr[2307] = BizPermitJoinGroupParams.class;
        clsArr[2308] = BizPermitJoinGroupResponse.class;
        clsArr[2309] = BizPermitJoinGroupResponse.ResponseData.class;
        clsArr[2310] = BizRechargeResponse.class;
        clsArr[2311] = BizRechargeResponse.ResponseData.class;
        clsArr[2312] = ShowConfig.class;
        clsArr[2313] = ShowContent.class;
        clsArr[2314] = ShowListUser.class;
        clsArr[2315] = BizChangeLayoutParams.class;
        clsArr[2316] = BizInviteParams.class;
        clsArr[2317] = BizResumeParams.class;
        clsArr[2318] = BizResumeResponse.class;
        clsArr[2319] = BizResumeResponse.ResponseData.class;
        clsArr[2320] = CancelJoinGroupContent.class;
        clsArr[2321] = CohostContent.class;
        clsArr[2322] = DECCDataAnnotation.class;
        clsArr[2323] = DECCSchemaAnnotation.class;
        clsArr[2324] = GroupChangeContent.class;
        clsArr[2325] = JoinGroupBizContent.class;
        clsArr[2326] = JoinGroupContent.class;
        clsArr[2327] = JoinGroupMessageExtra.class;
        clsArr[2328] = JoinGroupMessageExtra.RivalExtra.class;
        clsArr[2329] = JoinGroupMessageExtra.RivalExtra.AuthenticationInfo.class;
        clsArr[2330] = KickOutBizContent.class;
        clsArr[2331] = LeaveJoinGroupContent.class;
        clsArr[2332] = LinkStateMessage.class;
        clsArr[2333] = ListChangeBizContent.class;
        clsArr[2334] = LiveShowMessage.class;
        clsArr[2335] = P2PGroupChangeContent.class;
        clsArr[2336] = PermitJoinGroupBizContent.class;
        clsArr[2337] = PermitJoinGroupContent.class;
        clsArr[2338] = PreviewRoom.class;
    }

    public static final InterfaceC31105CIr<?> LIZ(Class<?> cls) {
        switch (LIZIZ(cls)) {
            case 0:
                return new _HashtagResponse_ProtoDecoder();
            case 1:
                return new _ImageModel_ProtoDecoder();
            case 2:
                return new _ImageModel_Content_ProtoDecoder();
            case 3:
                return new _RankRoundBanner_ProtoDecoder();
            case 4:
                return new _EmoteConfig_ProtoDecoder();
            case 5:
                return new _EmoteModel_ProtoDecoder();
            case 6:
                return new _EmoteWithIndex_ProtoDecoder();
            case 7:
                return new _FeedExtra_ProtoDecoder();
            case 8:
                return new _FeedExtra_LogPb_ProtoDecoder();
            case 9:
                return new _RankUser_ProtoDecoder();
            case 10:
                return new _Ranking_ProtoDecoder();
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return new _OnlineRankConfig_ProtoDecoder();
            case 12:
                return new _OnlineRankListResponse_ProtoDecoder();
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return new _RoomComponentsResponse_ProtoDecoder();
            case 14:
                return new _ArrowConfig_ProtoDecoder();
            case 15:
                return new _AvatarFrame_ProtoDecoder();
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return new _BadgeStruct_ProtoDecoder();
            case 17:
                return new _BadgeText_ProtoDecoder();
            case 18:
                return new _CombineBadgeBackground_ProtoDecoder();
            case 19:
                return new _CombineBadgeStruct_ProtoDecoder();
            case 20:
                return new _EntranceEffect_ProtoDecoder();
            case 21:
                return new _FollowInfo_ProtoDecoder();
            case 22:
                return new _FontStyle_ProtoDecoder();
            case 23:
                return new _IconConfig_ProtoDecoder();
            case 24:
                return new _ImageBadge_ProtoDecoder();
            case 25:
                return new _NumberConfig_ProtoDecoder();
            case 26:
                return new _PaddingInfo_ProtoDecoder();
            case 27:
                return new _PrivilegeLogExtra_ProtoDecoder();
            case 28:
                return new _ProfileCardPanel_ProtoDecoder();
            case 29:
                return new _ProfileContent_ProtoDecoder();
            case 30:
                return new _ProjectionConfig_ProtoDecoder();
            case 31:
                return new _SeparatorConfig_ProtoDecoder();
            case 32:
                return new _StringBadge_ProtoDecoder();
            case 33:
                return new _SubscribeBadge_ProtoDecoder();
            case 34:
                return new _SubscribeInfo_ProtoDecoder();
            case 35:
                return new _TextBadge_ProtoDecoder();
            case 36:
                return new _User_ProtoDecoder();
            case 37:
                return new _User_ComboBadgeInfo_ProtoDecoder();
            case 38:
                return new _User_FansClubInfo_ProtoDecoder();
            case 39:
                return new _User_OwnRoom_ProtoDecoder();
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return new _BattleFinishRequest_ProtoDecoder();
            case 41:
                return new _BattleFinishResult_ProtoDecoder();
            case 42:
                return new _BattleFinishResult_ResponseData_ProtoDecoder();
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return new _BattleInviteRequestParams_ProtoDecoder();
            case 44:
                return new _BattleInviteResult_ProtoDecoder();
            case 45:
                return new _BattleInviteResult_ResponseData_ProtoDecoder();
            case 46:
                return new _PrepareBattleRequest_ProtoDecoder();
            case 47:
                return new _PrepareBattleResponse_ProtoDecoder();
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return new _PrepareBattleResponse_ResponseData_ProtoDecoder();
            case C61447O9r.LJIIJ:
                return new _ActivityBannerParams_ProtoDecoder();
            case 50:
                return new _ActivityBannerResponse_ProtoDecoder();
            case 51:
                return new _ActivityBannerResponse_BannerInfo_ProtoDecoder();
            case 52:
                return new _ActivityBannerResponse_ResponseData_ProtoDecoder();
            case 53:
                return new _AnchorClientList_ProtoDecoder();
            case 54:
                return new _AudienceMultiGuestPermissionParams_ProtoDecoder();
            case 55:
                return new _AudienceMultiGuestPermissionResponseData_ProtoDecoder();
            case 56:
                return new _BannerAction_ProtoDecoder();
            case 57:
                return new _BannerContentMultiGuest_ProtoDecoder();
            case 58:
                return new _ChannelMessage_ProtoDecoder();
            case 59:
                return new _CheckActivityRoomParams_ProtoDecoder();
            case 60:
                return new _CheckActivityRoomResponse_ProtoDecoder();
            case 61:
                return new _CheckActivityRoomResponse_ResponseData_ProtoDecoder();
            case BaseNotice.CREATOR /* 62 */:
                return new _CreateShowParams_ProtoDecoder();
            case 63:
                return new _CreateShowParams_ListUser_ProtoDecoder();
            case 64:
                return new _CreateShowResponse_ProtoDecoder();
            case 65:
                return new _CreateShowResponse_ResponseData_ProtoDecoder();
            case 66:
                return new _EndShowParams_ProtoDecoder();
            case 67:
                return new _EndShowResponse_ProtoDecoder();
            case 68:
                return new _EndShowResponse_ResponseData_ProtoDecoder();
            case 69:
                return new _EnlargeScreenManageParams_ProtoDecoder();
            case 70:
                return new _EnlargeScreenManageResponse_ProtoDecoder();
            case 71:
                return new _EnlargeScreenManageResponse_Extra_ProtoDecoder();
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return new _EnlargeScreenManageResponse_ResponseData_ProtoDecoder();
            case 73:
                return new _FanTicketRanklistParams_ProtoDecoder();
            case 74:
                return new _FanTicketRanklistResponse_ProtoDecoder();
            case 75:
                return new _FanTicketRanklistResponse_Extra_ProtoDecoder();
            case 76:
                return new _FanTicketRanklistResponse_RanklistUser_ProtoDecoder();
            case 77:
                return new _FanTicketRanklistResponse_ResponseData_ProtoDecoder();
            case 78:
                return new _FinishShowingGuestParams_ProtoDecoder();
            case 79:
                return new _FinishShowingGuestResponse_ProtoDecoder();
            case 80:
                return new _FinishShowingGuestResponse_ResponseData_ProtoDecoder();
            case 81:
                return new _GetGuestSettingParams_ProtoDecoder();
            case 82:
                return new _GetGuestSettingResponse_ProtoDecoder();
            case 83:
                return new _GetGuestSettingResponse_ResponseData_ProtoDecoder();
            case 84:
                return new _GetLeaveLinkmicPanelParams_ProtoDecoder();
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                return new _GetLeaveLinkmicPanelResponse_ProtoDecoder();
            case 86:
                return new _GetLeaveLinkmicPanelResponse_ResponseData_ProtoDecoder();
            case 87:
                return new _GetLinkMicAdParams_ProtoDecoder();
            case 88:
                return new _GetLinkMicAdResponse_ProtoDecoder();
            case 89:
                return new _GetLinkMicAdResponse_ResponseData_ProtoDecoder();
            case 90:
                return new _GetMultiGuestBonusParams_ProtoDecoder();
            case 91:
                return new _GetMultiGuestBonusResponse_ProtoDecoder();
            case 92:
                return new _GetMultiGuestBonusResponse_ResponseData_ProtoDecoder();
            case 93:
                return new _GetSharedInviteePanelParams_ProtoDecoder();
            case 94:
                return new _GetSharedInviteePanelResponse_ProtoDecoder();
            case 95:
                return new _GetSharedInviteePanelResponse_ResponseData_ProtoDecoder();
            case 96:
                return new _GetShowContentParams_ProtoDecoder();
            case 97:
                return new _GetShowContentResponse_ProtoDecoder();
            case 98:
                return new _GetShowContentResponse_ResponseData_ProtoDecoder();
            case 99:
                return new _GetShowRankParams_ProtoDecoder();
            case 100:
                return new _GetShowRankResponse_ProtoDecoder();
            case 101:
                return new _GetShowRankResponse_ResponseData_ProtoDecoder();
            case 102:
                return new _GetShowRankResponse_ShowRankUser_ProtoDecoder();
            case 103:
                return new _GetShowSettingsParams_ProtoDecoder();
            case 104:
                return new _GetShowSettingsResponse_ProtoDecoder();
            case 105:
                return new _GetShowSettingsResponse_ResponseData_ProtoDecoder();
            case 106:
                return new _GuestClientList_ProtoDecoder();
            case 107:
                return new _GuestMicCameraManageParams_ProtoDecoder();
            case 108:
                return new _GuestMicCameraManageResponse_ProtoDecoder();
            case 109:
                return new _GuestMicCameraManageResponse_Extra_ProtoDecoder();
            case 110:
                return new _GuestMicCameraManageResponse_ResponseData_ProtoDecoder();
            case 111:
                return new _HostCheckOtherAudienceMultiGuestPermissionParams_ProtoDecoder();
            case 112:
                return new _HostCheckOtherAudienceMultiGuestPermissionResponse_ProtoDecoder();
            case 113:
                return new _HostCheckOtherAudienceMultiGuestPermissionResponse_Extra_ProtoDecoder();
            case 114:
                return new _HostCheckOtherAudienceMultiGuestPermissionResponse_ResponseData_ProtoDecoder();
            case 115:
                return new _HostMultiGuestPermissionParams_ProtoDecoder();
            case 116:
                return new _InRoomMultiGuestBanner_ProtoDecoder();
            case 117:
                return new _LeaveLinkmicPanelSuggestUser_ProtoDecoder();
            case 118:
                return new _LinkedUser_ProtoDecoder();
            case 119:
                return new _ListByTypeParams_ProtoDecoder();
            case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                return new _ListByTypeResponse_ProtoDecoder();
            case 121:
                return new _ListByTypeResponse_Extra_ProtoDecoder();
            case 122:
                return new _ListByTypeResponse_GiftScoreAppliedUser_ProtoDecoder();
            case 123:
                return new _ListByTypeResponse_MultiGuestBonus_ProtoDecoder();
            case 124:
                return new _ListByTypeResponse_ReservedUser_ProtoDecoder();
            case 125:
                return new _MultiGuestPermissionInfo_ProtoDecoder();
            case 126:
                return new _MultiGuestReserveReqParams_ProtoDecoder();
            case 127:
                return new _MultiGuestReserveResponse_ProtoDecoder();
            case 128:
                return new _MultiGuestReserveResponse_Extra_ProtoDecoder();
            case 129:
                return new _MultiGuestReserveResponse_ResponseData_ProtoDecoder();
            case 130:
                return new _MultiLiveGuestInfoList_ProtoDecoder();
            case 131:
                return new _ReplyInvitationPanelInfo_ProtoDecoder();
            case 132:
                return new _ReportLinkMessageReq_ProtoDecoder();
            case 133:
                return new _ReportLinkMessageResp_ProtoDecoder();
            case 134:
                return new _RoomHostMultiGuestPermissionInfo_ProtoDecoder();
            case 135:
                return new _SharedInvitationCallbackParams_ProtoDecoder();
            case 136:
                return new _SharedInvitationCallbackResponse_ProtoDecoder();
            case 137:
                return new _SharedInvitationCallbackResponse_ResponseData_ProtoDecoder();
            case 138:
                return new _ShowAgainGuestParams_ProtoDecoder();
            case 139:
                return new _ShowAgainGuestResponse_ProtoDecoder();
            case UserLevelGeckoUpdateSetting.DEFAULT /* 140 */:
                return new _ShowAgainGuestResponse_ResponseData_ProtoDecoder();
            case 141:
                return new _UpdateGuestSettingParams_ProtoDecoder();
            case 142:
                return new _UpdateGuestSettingResponse_ProtoDecoder();
            case 143:
                return new _UpdateGuestSettingResponse_Extra_ProtoDecoder();
            case 144:
                return new _UpdateGuestSettingResponse_ResponseData_ProtoDecoder();
            case 145:
                return new _UpdateShowContentParams_ProtoDecoder();
            case 146:
                return new _UpdateShowContentResponse_ProtoDecoder();
            case 147:
                return new _UpdateShowContentResponse_ResponseData_ProtoDecoder();
            case 148:
                return new _WaitUser_ProtoDecoder();
            case 149:
                return new _CreateContractRequest_ProtoDecoder();
            case 150:
                return new _CreateContractResponse_ProtoDecoder();
            case 151:
                return new _CreateContractResponse_ResponseExtra_ProtoDecoder();
            case 152:
                return new _CreateContractResult_ProtoDecoder();
            case 153:
                return new _CreateGiftSubContractRequest_ProtoDecoder();
            case 154:
                return new _CreateGiftSubContractResponse_ProtoDecoder();
            case 155:
                return new _CreateGiftSubContractResponse_ResponseExtra_ProtoDecoder();
            case 156:
                return new _CreateGiftSubContractResult_ProtoDecoder();
            case 157:
                return new _CurrencyPriceItem_ProtoDecoder();
            case 158:
                return new _CustomizedDiamond_ProtoDecoder();
            case 159:
                return new _FirstChargeRequestParams_ProtoDecoder();
            case 160:
                return new _QuizAnchorInfo_ProtoDecoder();
            case 161:
                return new _QuizAnswerInfo_ProtoDecoder();
            case 162:
                return new _QuizCallUpWebview_ProtoDecoder();
            case 163:
                return new _QuizFinalResult_ProtoDecoder();
            case 164:
                return new _QuizImage_ProtoDecoder();
            case 165:
                return new _QuizNextQuiz_ProtoDecoder();
            case 166:
                return new _QuizQuestionInfo_ProtoDecoder();
            case 167:
                return new _QuizQuestionOption_ProtoDecoder();
            case 168:
                return new _QuizRewardRule_ProtoDecoder();
            case 169:
                return new _QuizRewardRule_RewardItem_ProtoDecoder();
            case 170:
                return new _QuizRulesIntroduction_ProtoDecoder();
            case 171:
                return new _QuizStatistics_ProtoDecoder();
            case 172:
                return new _QuizStatistics_OptionCountItem_ProtoDecoder();
            case 173:
                return new _QuizUserIdentityInfo_ProtoDecoder();
            case 174:
                return new _QuizUserQuestionResult_ProtoDecoder();
            case 175:
                return new _UserLiveEventInfo_ProtoDecoder();
            case 176:
                return new _BattleRecentContribRequest_ProtoDecoder();
            case 177:
                return new _BattleRecentContribResponse_ProtoDecoder();
            case 178:
                return new _BattleRecentContribResponse_ResponseData_ProtoDecoder();
            case 179:
                return new _BattleTriggerGuideRequest_ProtoDecoder();
            case 180:
                return new _BattleTriggerGuideResponse_ProtoDecoder();
            case 181:
                return new _BattleTriggerGuideResponse_ResponseData_ProtoDecoder();
            case 182:
                return new _BoostedUsersPoint_ProtoDecoder();
            case 183:
                return new _LiveGiftBoostCardAckResponse_ProtoDecoder();
            case 184:
                return new _LiveGiftBoostCardUserStatusResponse_ProtoDecoder();
            case 185:
                return new _AboutMeInfo_ProtoDecoder();
            case 186:
                return new _AnchorEmailInfo_ProtoDecoder();
            case 187:
                return new _AnchorSubWaveChallengeSettings_ProtoDecoder();
            case 188:
                return new _AnchorSubWaveCurrentSettings_ProtoDecoder();
            case 189:
                return new _AnchorSubWaveSettingsConfig_ProtoDecoder();
            case 190:
                return new _AnchorSubWaveTriggerSettings_ProtoDecoder();
            case 191:
                return new _Badge_ProtoDecoder();
            case 192:
                return new _BadgeConfig_ProtoDecoder();
            case 193:
                return new _BadgeDetail_ProtoDecoder();
            case 194:
                return new _BadgeInfo_ProtoDecoder();
            case 195:
                return new _BadgeLimit_ProtoDecoder();
            case 196:
                return new _BadgePreview_ProtoDecoder();
            case 197:
                return new _BenefitView_ProtoDecoder();
            case 198:
                return new _C2CTransformationPageInfo_ProtoDecoder();
            case 199:
                return new _CommunityContent_ProtoDecoder();
            case 200:
                return new _CommunityDetail_ProtoDecoder();
            case 201:
                return new _CommunityIDInfo_ProtoDecoder();
            case 202:
                return new _EmoteInfo_ProtoDecoder();
            case 203:
                return new _GraceInfo_ProtoDecoder();
            case 204:
                return new _LevelBadge_ProtoDecoder();
            case 205:
                return new _LiveSubOnlyConfig_ProtoDecoder();
            case 206:
                return new _NoteContent_ProtoDecoder();
            case 207:
                return new _NoteDetail_ProtoDecoder();
            case 208:
                return new _NoteInfo_ProtoDecoder();
            case 209:
                return new _OriginBadgeInfo_ProtoDecoder();
            case 210:
                return new _Perk_ProtoDecoder();
            case 211:
                return new _PriceChangeInfo_ProtoDecoder();
            case 212:
                return new _PriceTier_ProtoDecoder();
            case 213:
                return new _PriceTierInfo_ProtoDecoder();
            case 214:
                return new _PrivateEmoteDetail_ProtoDecoder();
            case 215:
                return new _SOVBriefInfo_ProtoDecoder();
            case 216:
                return new _SOVMaskInfo_ProtoDecoder();
            case 217:
                return new _ShareInfo_ProtoDecoder();
            case 218:
                return new _SpotlightInfo_ProtoDecoder();
            case 219:
                return new _SpotlightItem_ProtoDecoder();
            case 220:
                return new _SubAdminPermission_ProtoDecoder();
            case 221:
                return new _SubBenefit_ProtoDecoder();
            case 222:
                return new _SubCustomizedBenefit_ProtoDecoder();
            case 223:
                return new _SubCustomizedBenefitMedia_ProtoDecoder();
            case 224:
                return new _SubGoalPinCard_ProtoDecoder();
            case 225:
                return new _SubInfo_ProtoDecoder();
            case 226:
                return new _SubLevel_ProtoDecoder();
            case 227:
                return new _SubOnlyVideosBriefInfo_ProtoDecoder();
            case 228:
                return new _SubPinCard_ProtoDecoder();
            case 229:
                return new _SubPinCard_Text_ProtoDecoder();
            case 230:
                return new _SubPinCardText_ProtoDecoder();
            case 231:
                return new _SubTaskInfo_ProtoDecoder();
            case 232:
                return new _SubTimerSticker_ProtoDecoder();
            case 233:
                return new _SubWaveImMsg_ProtoDecoder();
            case 234:
                return new _SubWaveInfo_ProtoDecoder();
            case 235:
                return new _SubWaveInfoCommon_ProtoDecoder();
            case 236:
                return new _SubWaveSubscriberInfo_ProtoDecoder();
            case 237:
                return new _TimerConfig_ProtoDecoder();
            case 238:
                return new _TimerDetail_ProtoDecoder();
            case 239:
                return new _ToolsInfo_ProtoDecoder();
            case 240:
                return new _WaveReward_ProtoDecoder();
            case 241:
                return new _AnchorLinkmicUserSettings_ProtoDecoder();
            case 242:
                return new _ApplyParams_ProtoDecoder();
            case 243:
                return new _ApplyResponse_ProtoDecoder();
            case 244:
                return new _AutoMatchBanner_ProtoDecoder();
            case 245:
                return new _AutoMatchReq_ProtoDecoder();
            case 246:
                return new _AutoMatchResp_ProtoDecoder();
            case 247:
                return new _AutoMatchResp_ResponseData_ProtoDecoder();
            case 248:
                return new _CohostListParams_ProtoDecoder();
            case 249:
                return new _CohostListResponse_ProtoDecoder();
            case LiveCoverMinSizeSetting.DEFAULT /* 250 */:
                return new _CohostListResponse_ResponseData_ProtoDecoder();
            case 251:
                return new _GetSettingsParams_ProtoDecoder();
            case 252:
                return new _GetSettingsResponse_ProtoDecoder();
            case 253:
                return new _GuidePopupBanner_ProtoDecoder();
            case 254:
                return new _InitParams_ProtoDecoder();
            case 255:
                return new _InitResponse_ProtoDecoder();
            case 256:
                return new _InviteExtra_ProtoDecoder();
            case 257:
                return new _InviteExtra_LogPb_ProtoDecoder();
            case 258:
                return new _InviteParams_ProtoDecoder();
            case 259:
                return new _InviteResponse_ProtoDecoder();
            case 260:
                return new _JoinChannelParams_ProtoDecoder();
            case 261:
                return new _JoinChannelResponse_ProtoDecoder();
            case 262:
                return new _JoinChannelResponse_ResponseData_ProtoDecoder();
            case 263:
                return new _LinkGetSettingResult_ProtoDecoder();
            case 264:
                return new _LinkInRoomInviteResponse_ProtoDecoder();
            case 265:
                return new _LinkInRoomReplyResponse_ProtoDecoder();
            case 266:
                return new _LinkInviteResult_ProtoDecoder();
            case 267:
                return new _LinkerInfo_ProtoDecoder();
            case 268:
                return new _LinkmicListResponse_ProtoDecoder();
            case 269:
                return new _MGetUserLinkmicStatusParams_ProtoDecoder();
            case 270:
                return new _MGetUserLinkmicStatusResponse_ProtoDecoder();
            case 271:
                return new _MGetUserLinkmicStatusResponse_Extra_ProtoDecoder();
            case 272:
                return new _MGetUserLinkmicStatusResponse_LinkmicStatus_ProtoDecoder();
            case 273:
                return new _MGetUserLinkmicStatusResponse_ResponseData_ProtoDecoder();
            case 274:
                return new _MgetPullStreamInfosParams_ProtoDecoder();
            case 275:
                return new _MgetPullStreamInfosResponse_ProtoDecoder();
            case 276:
                return new _MgetPullStreamInfosResponse_PullStreamInfo_ProtoDecoder();
            case 277:
                return new _MgetPullStreamInfosResponse_ResponseData_ProtoDecoder();
            case 278:
                return new _PermitParams_ProtoDecoder();
            case 279:
                return new _PermitResponse_ProtoDecoder();
            case 280:
                return new _PermitResponse_ResponseData_ProtoDecoder();
            case 281:
                return new _ReplyParams_ProtoDecoder();
            case 282:
                return new _ReplyReserveParams_ProtoDecoder();
            case 283:
                return new _ReplyReserveResponse_ProtoDecoder();
            case 284:
                return new _ReplyReserveResponse_ReplyReserveExtra_ProtoDecoder();
            case 285:
                return new _ReplyReserveResponse_ReplyReserveExtra_LogPb_ProtoDecoder();
            case 286:
                return new _ReplyReserveResponse_ResponseData_ProtoDecoder();
            case 287:
                return new _ReplyResponse_ProtoDecoder();
            case 288:
                return new _ReserveParams_ProtoDecoder();
            case 289:
                return new _ReserveResponse_ProtoDecoder();
            case BuildConfig.VERSION_CODE /* 290 */:
                return new _ReserveResponse_ReserveExtra_ProtoDecoder();
            case 291:
                return new _ReserveResponse_ReserveExtra_LogPb_ProtoDecoder();
            case 292:
                return new _ReserveResponse_ResponseData_ProtoDecoder();
            case 293:
                return new _ResumeParams_ProtoDecoder();
            case 294:
                return new _ResumeResponse_ProtoDecoder();
            case 295:
                return new _ResumeResponse_ResponseData_ProtoDecoder();
            case 296:
                return new _RivalExtraInfo_ProtoDecoder();
            case 297:
                return new _RivalExtraInfo_ReserveInfo_ProtoDecoder();
            case 298:
                return new _RivalExtraInfo_Tag_ProtoDecoder();
            case 299:
                return new _RivalsListExtra_ProtoDecoder();
            case 300:
                return new _RivalsListExtra_LogPbBean_ProtoDecoder();
            case 301:
                return new _RivalsListsData_ProtoDecoder();
            case 302:
                return new _RivalsListsData_BannerText_ProtoDecoder();
            case 303:
                return new _RivalsListsData_TopHostInfo_ProtoDecoder();
            case 304:
                return new _RivalsParams_ProtoDecoder();
            case 305:
                return new _RivalsResponse_ProtoDecoder();
            case 306:
                return new _SearchBar_ProtoDecoder();
            case 307:
                return new _TopicLikeParams_ProtoDecoder();
            case 308:
                return new _TopicLikeResponse_ProtoDecoder();
            case 309:
                return new _TopicLikeResponse_ResponseData_ProtoDecoder();
            case 310:
                return new _TopicListParams_ProtoDecoder();
            case 311:
                return new _TopicListResponse_ProtoDecoder();
            case 312:
                return new _TopicListResponse_ResponseData_ProtoDecoder();
            case 313:
                return new _TopicPairParams_ProtoDecoder();
            case 314:
                return new _TopicPairResponse_ProtoDecoder();
            case 315:
                return new _TopicPairResponse_ResponseData_ProtoDecoder();
            case 316:
                return new _TopicPairResponse_ResponseData_Setting_ProtoDecoder();
            case 317:
                return new _TopicSetParams_ProtoDecoder();
            case 318:
                return new _TopicSetResponse_ProtoDecoder();
            case 319:
                return new _TopicSetResponse_ResponseData_ProtoDecoder();
            case 320:
                return new _TriggerLivingNoticeParams_ProtoDecoder();
            case 321:
                return new _TriggerLivingNoticeResponse_ProtoDecoder();
            case 322:
                return new _TriggerLivingNoticeResponse_ResponseData_ProtoDecoder();
            case 323:
                return new _TriggerReserveNoticeParams_ProtoDecoder();
            case 324:
                return new _TriggerReserveNoticeResponse_ProtoDecoder();
            case 325:
                return new _TriggerReserveNoticeResponse_ResponseData_ProtoDecoder();
            case 326:
                return new _TriggerResumeNoticeParams_ProtoDecoder();
            case 327:
                return new _TriggerResumeNoticeResponse_ProtoDecoder();
            case 328:
                return new _TriggerResumeNoticeResponse_ResponseData_ProtoDecoder();
            case 329:
                return new _UserInfo_ProtoDecoder();
            case 330:
                return new _AnchorPreFinishData_ProtoDecoder();
            case 331:
                return new _AnchorPreFinishData_ConfirmBox_ProtoDecoder();
            case 332:
                return new _AnchorPreFinishRequest_ProtoDecoder();
            case 333:
                return new _AnchorPreFinishResponse_ProtoDecoder();
            case 334:
                return new _AnchorReplayDeleteRequest_ProtoDecoder();
            case 335:
                return new _AnchorReplayDeleteResponse_ProtoDecoder();
            case 336:
                return new _AnchorReplayInfoData_ProtoDecoder();
            case 337:
                return new _AnchorReplayInfoRequest_ProtoDecoder();
            case 338:
                return new _AnchorReplayInfoResponse_ProtoDecoder();
            case 339:
                return new _ApplyResult_ProtoDecoder();
            case 340:
                return new _AudiencePingExtra_ProtoDecoder();
            case 341:
                return new _ChatEmojiListData_ProtoDecoder();
            case 342:
                return new _ChatEmojiListRequest_ProtoDecoder();
            case 343:
                return new _ChatEmojiListResponse_ProtoDecoder();
            case 344:
                return new _EnterRoomExtra_ProtoDecoder();
            case 345:
                return new _FragmentTypeCount_ProtoDecoder();
            case 346:
                return new _HashtagListResponse_ProtoDecoder();
            case 347:
                return new _KickUserResponse_ProtoDecoder();
            case 348:
                return new _LikeRequest_ProtoDecoder();
            case 349:
                return new _LikeResponse_ProtoDecoder();
            case 350:
                return new _LikeResponse_Data_ProtoDecoder();
            case 351:
                return new _MGetTranslationRequest_ProtoDecoder();
            case 352:
                return new _MGetTranslationRequest_Text_ProtoDecoder();
            case 353:
                return new _MGetTranslationResponse_ProtoDecoder();
            case 354:
                return new _MGetTranslationResponse_Data_ProtoDecoder();
            case 355:
                return new _MGetTranslationResponse_Data_Translation_ProtoDecoder();
            case 356:
                return new _PermissionLevelBannerStatsRequest_ProtoDecoder();
            case 357:
                return new _PermissionLevelBannerStatsResponse_ProtoDecoder();
            case 358:
                return new _PermissionLevelBannerStatsResponse_ResponseData_ProtoDecoder();
            case 359:
                return new _PermissionLevelBannerStatusExtra_ProtoDecoder();
            case 360:
                return new _PermissionLevelStage_ProtoDecoder();
            case 361:
                return new _PermissionLevelStage_PermissionLevelTask_ProtoDecoder();
            case 362:
                return new _PermissionLevelTaskAllExtra_ProtoDecoder();
            case 363:
                return new _PermissionLevelTaskAllRequest_ProtoDecoder();
            case 364:
                return new _PermissionLevelTaskAllResponse_ProtoDecoder();
            case 365:
                return new _PermissionLevelTaskAllResponse_ResponseData_ProtoDecoder();
            case 366:
                return new _PermissionLevelTaskFinishExtra_ProtoDecoder();
            case 367:
                return new _PermissionLevelTaskFinishRequest_ProtoDecoder();
            case 368:
                return new _PermissionLevelTaskFinishResponse_ProtoDecoder();
            case 369:
                return new _PermissionLevelTaskFinishResponse_ResponseData_ProtoDecoder();
            case 370:
                return new _QueryCommercialContentToggleRequest_ProtoDecoder();
            case 371:
                return new _QueryCommercialContentToggleResponse_ProtoDecoder();
            case 372:
                return new _QueryCommercialContentToggleResponse_Data_ProtoDecoder();
            case 373:
                return new _RoomDonationInfo_ProtoDecoder();
            case 374:
                return new _RoomReplay_ProtoDecoder();
            case 375:
                return new _RoomReplayMoment_ProtoDecoder();
            case 376:
                return new _RoomReplayReason_ProtoDecoder();
            case 377:
                return new _StarCommentUpdateRequest_ProtoDecoder();
            case 378:
                return new _StarCommentUpdateResponse_ProtoDecoder();
            case 379:
                return new _UpdateStatusRequest_ProtoDecoder();
            case 380:
                return new _UpdateStatusResponse_ProtoDecoder();
            case 381:
                return new _UpdateStatusResponse_Data_ProtoDecoder();
            case 382:
                return new _VideoInfo_ProtoDecoder();
            case 383:
                return new _WaveRequest_ProtoDecoder();
            case 384:
                return new _WaveResponse_ProtoDecoder();
            case 385:
                return new _BattleUserSettings_ProtoDecoder();
            case 386:
                return new _CancelResponse_ProtoDecoder();
            case 387:
                return new _CheckPermissionResponse_ProtoDecoder();
            case 388:
                return new _CohostABTest_ProtoDecoder();
            case 389:
                return new _CohostABTestList_ProtoDecoder();
            case SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT /* 390 */:
                return new _CohostABTestSetting_ProtoDecoder();
            case 391:
                return new _CohostListUser_ProtoDecoder();
            case 392:
                return new _CohostTopic_ProtoDecoder();
            case 393:
                return new _LastLayoutSetting_ProtoDecoder();
            case 394:
                return new _LinkInitResult_ProtoDecoder();
            case 395:
                return new _LinkPlayerInfo_ProtoDecoder();
            case 396:
                return new _LinkReplyResult_ProtoDecoder();
            case 397:
                return new _ListParams_ProtoDecoder();
            case 398:
                return new _ListReachEnhancementUser_ProtoDecoder();
            case 399:
                return new _MultiCancelResponse_ProtoDecoder();
            case LiveChatShowDelayForHotLiveSetting.DEFAULT /* 400 */:
                return new _OptPairInfo_ProtoDecoder();
            case 401:
                return new com.bytedance.android.livesdk.chatroom.model.interact._ReplyParams_ProtoDecoder();
            case 402:
                return new com.bytedance.android.livesdk.chatroom.model.interact._ReplyResponse_ProtoDecoder();
            case 403:
                return new _ReplyResponse_ReplyExtra_ProtoDecoder();
            case 404:
                return new _ReplyResponse_ReplyExtra_LogPb_ProtoDecoder();
            case 405:
                return new _TagV2_ProtoDecoder();
            case 406:
                return new _TagV2_SecondDegreeRelationContent_ProtoDecoder();
            case 407:
                return new _TagV2_SecondDegreeRelationContent_UserInfo_ProtoDecoder();
            case 408:
                return new _TopHostInfo_ProtoDecoder();
            case 409:
                return new _TopicExtraInfo_ProtoDecoder();
            case 410:
                return new _TopicSessionStatus_ProtoDecoder();
            case 411:
                return new _Extra_ProtoDecoder();
            case 412:
                return new com.bytedance.android.livesdk.chatroom.model.interact.audience._GetSettingsParams_ProtoDecoder();
            case 413:
                return new com.bytedance.android.livesdk.chatroom.model.interact.audience._GetSettingsResponse_ProtoDecoder();
            case 414:
                return new _LinkmicAudienceEmoji_ProtoDecoder();
            case 415:
                return new _LinkmicSettingResult_ProtoDecoder();
            case 416:
                return new _LinkmicSettingmodel_ProtoDecoder();
            case 417:
                return new com.bytedance.android.livesdk.chatroom.model.interact.audience._PermitParams_ProtoDecoder();
            case 418:
                return new com.bytedance.android.livesdk.chatroom.model.interact.audience._PermitResponse_ProtoDecoder();
            case 419:
                return new _PermitResult_ProtoDecoder();
            case 420:
                return new _ApplyBizContent_ProtoDecoder();
            case 421:
                return new _BizApplyParams_ProtoDecoder();
            case 422:
                return new _BizApplyResponse_ProtoDecoder();
            case 423:
                return new _BizApplyResponseData_ProtoDecoder();
            case 424:
                return new _BizCancelApplyParams_ProtoDecoder();
            case 425:
                return new _BizCreateChannelParams_ProtoDecoder();
            case 426:
                return new _BizCreateChannelParams_UserSetting_ProtoDecoder();
            case 427:
                return new _BizCreateChannelResponse_ProtoDecoder();
            case 428:
                return new _BizCreateChannelResponseData_ProtoDecoder();
            case 429:
                return new _BizJoinChannelParams_ProtoDecoder();
            case 430:
                return new _BizJoinChannelResponse_ProtoDecoder();
            case 431:
                return new _BizJoinChannelResponseData_ProtoDecoder();
            case 432:
                return new _BizJoinDirectParams_ProtoDecoder();
            case 433:
                return new _BizJoinDirectResponse_ProtoDecoder();
            case 434:
                return new _BizJoinDirectResponseData_ProtoDecoder();
            case 435:
                return new _BizLeaveParams_ProtoDecoder();
            case 436:
                return new _BizPermitParams_ProtoDecoder();
            case 437:
                return new _BizReplyParams_ProtoDecoder();
            case 438:
                return new _BizReplyResponse_ProtoDecoder();
            case 439:
                return new _BizReplyResponseData_ProtoDecoder();
            case 440:
                return new _BusinessContent_ProtoDecoder();
            case 441:
                return new _InviteBizContent_ProtoDecoder();
            case 442:
                return new _JoinDirectBizContent_ProtoDecoder();
            case 443:
                return new _MultiLiveContent_ProtoDecoder();
            case 444:
                return new _PermitBizContent_ProtoDecoder();
            case 445:
                return new _ReplyBizContent_ProtoDecoder();
            case 446:
                return new com.bytedance.android.livesdk.chatroom.model.multilive._JoinChannelParams_ProtoDecoder();
            case 447:
                return new com.bytedance.android.livesdk.chatroom.model.multilive._JoinChannelResponse_ProtoDecoder();
            case 448:
                return new _MultiLiveAnchorPanelSettings_ProtoDecoder();
            case 449:
                return new _MultiLiveLayoutInfo_ProtoDecoder();
            case 450:
                return new _Setting_ProtoDecoder();
            case 451:
                return new _SettingABTestInfo_ProtoDecoder();
            case 452:
                return new _TurnOffInvitationParams_ProtoDecoder();
            case 453:
                return new _TurnOffInvitationResponse_ProtoDecoder();
            case 454:
                return new _TurnOffInvitationResponse_Extra_ProtoDecoder();
            case 455:
                return new _TurnOffInvitationResponse_ResponseData_ProtoDecoder();
            case 456:
                return new _UpdateRoomLayoutSettings_ProtoDecoder();
            case 457:
                return new _UpdateSettingParams_ProtoDecoder();
            case 458:
                return new _UpdateSettingResponse_ProtoDecoder();
            case 459:
                return new _UpdateSettingResponse_Extra_ProtoDecoder();
            case 460:
                return new _EnvelopeListResponse_ProtoDecoder();
            case 461:
                return new _RedEnvelopInfo_ProtoDecoder();
            case 462:
                return new _RedEnvelopeListResponse_ProtoDecoder();
            case 463:
                return new _ItemTabExtra_ProtoDecoder();
            case 464:
                return new _FirstChargeData_ProtoDecoder();
            case 465:
                return new _FirstChargeGuideEffectRule_ProtoDecoder();
            case 466:
                return new _FirstRechargeResponse_ProtoDecoder();
            case 467:
                return new _AccessRecallMessage_ProtoDecoder();
            case 468:
                return new _AnchorPartnershipInfoResponse_ProtoDecoder();
            case 469:
                return new _AnchorTasksResponse_ProtoDecoder();
            case 470:
                return new _AudienceRoomTasksResponse_ProtoDecoder();
            case 471:
                return new _AuthParam_ProtoDecoder();
            case 472:
                return new _BenefitDetail_ProtoDecoder();
            case 473:
                return new _BenefitRecord_ProtoDecoder();
            case 474:
                return new _BriefBenefitInfo_ProtoDecoder();
            case 475:
                return new _BriefGame_ProtoDecoder();
            case 476:
                return new _BriefGameTask_ProtoDecoder();
            case 477:
                return new _BriefGiftInfo_ProtoDecoder();
            case 478:
                return new _CreateHighLightResult_ProtoDecoder();
            case 479:
                return new _CreatorInfo_ProtoDecoder();
            case 480:
                return new _EsportsMatchInfo_ProtoDecoder();
            case 481:
                return new _EsportsParticipant_ProtoDecoder();
            case 482:
                return new _EsportsParticipantMatchScore_ProtoDecoder();
            case 483:
                return new _EsportsPointRaceScore_ProtoDecoder();
            case 484:
                return new _EsportsTournamentInfo_ProtoDecoder();
            case 485:
                return new _FeedItemInfo_ProtoDecoder();
            case 486:
                return new _GameActivity_ProtoDecoder();
            case 487:
                return new _GameAttributionInfo_ProtoDecoder();
            case 488:
                return new _GameInfo_ProtoDecoder();
            case 489:
                return new _GameInvite_ProtoDecoder();
            case 490:
                return new _GameLiveFragment_ProtoDecoder();
            case 491:
                return new _GameLiveMark_ProtoDecoder();
            case 492:
                return new _GameStationAttributionInfo_ProtoDecoder();
            case 493:
                return new _GameStationGameInfo_ProtoDecoder();
            case 494:
                return new _GameStationGameInfo_Video_ProtoDecoder();
            case 495:
                return new _GameStationOuterActivityInfo_ProtoDecoder();
            case 496:
                return new _GameTagData_ProtoDecoder();
            case 497:
                return new _GameTask_ProtoDecoder();
            case 498:
                return new _GiftItem_ProtoDecoder();
            case 499:
                return new _InvitationSwitch_ProtoDecoder();
            case LiveMaxRetainAlogMessageSizeSetting.DEFAULT /* 500 */:
                return new _ItemInfo_ProtoDecoder();
            case 501:
                return new _ItemStatisticsInfo_ProtoDecoder();
            case 502:
                return new _LiveFragmentShowInfo_ProtoDecoder();
            case 503:
                return new _MonthlyProfit_ProtoDecoder();
            case 504:
                return new _OuterActivityGroup_ProtoDecoder();
            case 505:
                return new _OuterActivityInfo_ProtoDecoder();
            case 506:
                return new _PartnershipBriefDrops_ProtoDecoder();
            case 507:
                return new _PartnershipDrops_ProtoDecoder();
            case 508:
                return new _PartnershipDropsAnchorReward_ProtoDecoder();
            case 509:
                return new _PartnershipDropsGift_ProtoDecoder();
            case 510:
                return new _PartnershipDropsRankItem_ProtoDecoder();
            case 511:
                return new _PartnershipDropsReward_ProtoDecoder();
            case 512:
                return new _PartnershipDropsRewardV1_ProtoDecoder();
            case 513:
                return new _PartnershipDropsTask_ProtoDecoder();
            case 514:
                return new _PartnershipDropsTaskConfig_ProtoDecoder();
            case 515:
                return new _PartnershipDropsV1_ProtoDecoder();
            case 516:
                return new _PartnershipDropsV1_ReasonParams_ProtoDecoder();
            case 517:
                return new _PartnershipDropsV1_ReasonParams_ExcellentCreatorParams_ProtoDecoder();
            case 518:
                return new _PartnershipDropsV1_ReasonParams_TopRewardsParams_ProtoDecoder();
            case 519:
                return new _PartnershipGame_ProtoDecoder();
            case 520:
                return new _PartnershipGame_Video_ProtoDecoder();
            case 521:
                return new _PartnershipGameEvent_ProtoDecoder();
            case 522:
                return new _PartnershipGiftInfo_ProtoDecoder();
            case 523:
                return new _PartnershipTask_ProtoDecoder();
            case 524:
                return new _ProfitInfo_ProtoDecoder();
            case 525:
                return new _Sprite_ProtoDecoder();
            case 526:
                return new _SwitchExtraBase_ProtoDecoder();
            case 527:
                return new _SwitchExtraForOpen_ProtoDecoder();
            case 528:
                return new _TaskAttributionInfo_ProtoDecoder();
            case 529:
                return new _TaskProfitInfo_ProtoDecoder();
            case 530:
                return new _UrlInfo_ProtoDecoder();
            case 531:
                return new com.bytedance.android.livesdk.game.model._UserInfo_ProtoDecoder();
            case 532:
                return new com.bytedance.android.livesdk.game.model._VideoInfo_ProtoDecoder();
            case 533:
                return new _AssetsListResult_ProtoDecoder();
            case 534:
                return new _AssetsModel_ProtoDecoder();
            case 535:
                return new _FaceRecognitionMeta_ProtoDecoder();
            case 536:
                return new _ResourceModel_ProtoDecoder();
            case 537:
                return new _VideoResource_ProtoDecoder();
            case 538:
                return new _BEFViewRenderSize_ProtoDecoder();
            case 539:
                return new _CalmDownInfo_ProtoDecoder();
            case 540:
                return new _CollectionDescription_ProtoDecoder();
            case 541:
                return new _CollectionEffect_ProtoDecoder();
            case 542:
                return new _CollectionUser_ProtoDecoder();
            case 543:
                return new _CpcPromptResponse_ProtoDecoder();
            case 544:
                return new _DoodleTemplate_ProtoDecoder();
            case 545:
                return new _DriveBagItem_ProtoDecoder();
            case 546:
                return new _DriveItem_ProtoDecoder();
            case 547:
                return new _DynamicGiftListResponse_ProtoDecoder();
            case 548:
                return new _DynamicGiftListResponse_Data_ProtoDecoder();
            case 549:
                return new _DynamicGiftListResponse_Extra_ProtoDecoder();
            case 550:
                return new _ExchangeGiftResultData_ProtoDecoder();
            case 551:
                return new _FlyingMicResources_ProtoDecoder();
            case 552:
                return new _ForceInsertMetricsItem_ProtoDecoder();
            case 553:
                return new _FreqLimitGiftInfo_ProtoDecoder();
            case 554:
                return new _FreqLimitGiftOption_ProtoDecoder();
            case 555:
                return new _GetWishlistRequestParams_ProtoDecoder();
            case 556:
                return new _GetWishlistResponse_ProtoDecoder();
            case 557:
                return new _GiftAckInfo_ProtoDecoder();
            case 558:
                return new _GiftCollectionDetailRequestParams_ProtoDecoder();
            case 559:
                return new _GiftCollectionDetailResponse_ProtoDecoder();
            case 560:
                return new _GiftCollectionDetailResponse_CollectionProcess_ProtoDecoder();
            case 561:
                return new _GiftCollectionDetailResponse_Data_ProtoDecoder();
            case 562:
                return new _GiftCollectionDetailResponse_Gift_ProtoDecoder();
            case 563:
                return new _GiftCollectionHistoryRequestParams_ProtoDecoder();
            case 564:
                return new _GiftCollectionHistoryResponse_ProtoDecoder();
            case 565:
                return new _GiftCollectionHistoryResponse_Data_ProtoDecoder();
            case 566:
                return new _GiftCollectionHistoryResponse_EffectList_ProtoDecoder();
            case 567:
                return new _GiftColorInfo_ProtoDecoder();
            case 568:
                return new _GiftComboInfo_ProtoDecoder();
            case 569:
                return new _GiftGroupCount_ProtoDecoder();
            case 570:
                return new _GiftHintInfo_ProtoDecoder();
            case 571:
                return new _GiftHintRequest_ProtoDecoder();
            case 572:
                return new _GiftHintResponse_ProtoDecoder();
            case 573:
                return new _GiftHintResponse_Data_ProtoDecoder();
            case 574:
                return new _GiftIconInfo_ProtoDecoder();
            case 575:
                return new _GiftLimitGetResponse_ProtoDecoder();
            case 576:
                return new _GiftLimitGetResponse_Data_ProtoDecoder();
            case 577:
                return new _GiftLimitGetResponse_Data_GiftPromptStall_ProtoDecoder();
            case 578:
                return new _GiftListAckRequestParams_ProtoDecoder();
            case 579:
                return new _GiftListAckResponse_ProtoDecoder();
            case 580:
                return new _GiftListAckResponse_Extra_ProtoDecoder();
            case 581:
                return new _GiftListResponse_ProtoDecoder();
            case 582:
                return new _GiftListResult_ProtoDecoder();
            case 583:
                return new _GiftNotice_ProtoDecoder();
            case 584:
                return new _GiftPage_ProtoDecoder();
            case 585:
                return new _GiftPollInfo_ProtoDecoder();
            case 586:
                return new _GiftPollOption_ProtoDecoder();
            case 587:
                return new _GiftResultData_ProtoDecoder();
            case 588:
                return new _GiftSendResponse_ProtoDecoder();
            case 589:
                return new _GiftSendResponse_GiftExtra_ProtoDecoder();
            case 590:
                return new _GiftsInfo_ProtoDecoder();
            case 591:
                return new _HotfixGiftDataForProp_ProtoDecoder();
            case 592:
                return new _LiveLimitedTimeDiscountGiftInfo_ProtoDecoder();
            case 593:
                return new _LiveStreamGoal_ProtoDecoder();
            case 594:
                return new _LiveStreamGoalContributor_ProtoDecoder();
            case 595:
                return new _LiveStreamGoalIndicator_ProtoDecoder();
            case 596:
                return new _LiveStreamGoalServerMessage_ProtoDecoder();
            case 597:
                return new _LiveStreamSubGoal_ProtoDecoder();
            case 598:
                return new _LiveStreamSubGoalGift_ProtoDecoder();
            case 599:
                return new _LokiExtraContent_ProtoDecoder();
            case 600:
                return new _LynxGiftExtra_ProtoDecoder();
            case 601:
                return new _MatchInfo_ProtoDecoder();
            case 602:
                return new _PageSchemaListRequest_ProtoDecoder();
            case 603:
                return new _PageSchemaListResponse_ProtoDecoder();
            case 604:
                return new _PageSchemaListResponse_Data_ProtoDecoder();
            case 605:
                return new _Prop_ProtoDecoder();
            case 606:
                return new _RiskCtl_ProtoDecoder();
            case 607:
                return new _SendGiftResult_ProtoDecoder();
            case 608:
                return new _StaticGiftListResponse_ProtoDecoder();
            case 609:
                return new _StaticGiftListResponse_Metadata_ProtoDecoder();
            case 610:
                return new _ToUser_ProtoDecoder();
            case 611:
                return new _ToUserInfo_ProtoDecoder();
            case 612:
                return new _WishListResponse_ProtoDecoder();
            case 613:
                return new _WishListResponse_Wish_ProtoDecoder();
            case 614:
                return new _WishListResponse_Wish_GiftWishExtra_ProtoDecoder();
            case 615:
                return new _WishListResponse_WishContributor_ProtoDecoder();
            case 616:
                return new _WishListResponse_WishList_ProtoDecoder();
            case 617:
                return new _WishListUpdateMessage_ProtoDecoder();
            case 618:
                return new _AnchorOnBoardPermit_ProtoDecoder();
            case 619:
                return new _CommitSubGoalRequest_ProtoDecoder();
            case 620:
                return new _CommitSubGoalResponse_ProtoDecoder();
            case 621:
                return new _CommitSubGoalResponse_Data_ProtoDecoder();
            case 622:
                return new _GetResponse_ProtoDecoder();
            case 623:
                return new _GetResponse_Data_ProtoDecoder();
            case 624:
                return new _GetResponse_Pin_ProtoDecoder();
            case 625:
                return new _GetSubGoalContributorsRequest_ProtoDecoder();
            case 626:
                return new _GetSubGoalContributorsResponse_ProtoDecoder();
            case 627:
                return new _GetSubGoalContributorsResponse_Data_ProtoDecoder();
            case 628:
                return new _GetSubGoalHistoryRequest_ProtoDecoder();
            case 629:
                return new _GetSubGoalHistoryResponse_ProtoDecoder();
            case 630:
                return new _GetSubGoalHistoryResponse_Data_ProtoDecoder();
            case 631:
                return new _GoalComparison_ProtoDecoder();
            case 632:
                return new _GoalOwner_ProtoDecoder();
            case 633:
                return new _GoalPinInfo_ProtoDecoder();
            case 634:
                return new _GoalStats_ProtoDecoder();
            case 635:
                return new _OwnerSettingRequestParams_ProtoDecoder();
            case 636:
                return new _OwnerSettingResponse_ProtoDecoder();
            case 637:
                return new _OwnerSettingResponse_Data_ProtoDecoder();
            case 638:
                return new _PinRequestParams_ProtoDecoder();
            case 639:
                return new _PinResponse_ProtoDecoder();
            case LiveBroadcastUploadVideoImageHeightSetting.DEFAULT /* 640 */:
                return new _PinResponse_Data_ProtoDecoder();
            case 641:
                return new _ReasonableGoalRec_ProtoDecoder();
            case 642:
                return new _StreamGoalRecExtra_ProtoDecoder();
            case 643:
                return new _SubGoalRecommendInfo_ProtoDecoder();
            case 644:
                return new _SubscriptionGoalRecExtra_ProtoDecoder();
            case 645:
                return new _UnPinRequestParams_ProtoDecoder();
            case 646:
                return new _UnPinResponse_ProtoDecoder();
            case 647:
                return new _UnPinResponse_Data_ProtoDecoder();
            case 648:
                return new _GoodyBagBaseInfo_ProtoDecoder();
            case 649:
                return new _GoodyBagCoinDetail_ProtoDecoder();
            case 650:
                return new _GoodyBagCommonDetail_ProtoDecoder();
            case 651:
                return new _GoodyBagCommonSelected_ProtoDecoder();
            case 652:
                return new _GoodyBagUserInfo_ProtoDecoder();
            case 653:
                return new _GoodyBagWinnerInfo_ProtoDecoder();
            case 654:
                return new _GiftGuideTriggerReqParams_ProtoDecoder();
            case 655:
                return new _GiftGuideTriggerResponse_ProtoDecoder();
            case 656:
                return new _GiftGuideTriggerResponse_Data_ProtoDecoder();
            case 657:
                return new _GiftKeywords_ProtoDecoder();
            case 658:
                return new _GuideInfoRequest_ProtoDecoder();
            case 659:
                return new _GuideInfoResponse_ProtoDecoder();
            case 660:
                return new _GuideInfoResponse_Data_ProtoDecoder();
            case 661:
                return new _GuideInfoResponse_GuideEntry_ProtoDecoder();
            case 662:
                return new _GuideInfoResponse_GuidePageResource_ProtoDecoder();
            case 663:
                return new _GuideInfoResponse_UserStats_ProtoDecoder();
            case 664:
                return new _GuideKeywordsReportRequest_ProtoDecoder();
            case 665:
                return new _GuideKeywordsReportResponse_ProtoDecoder();
            case 666:
                return new _GuideKeywordsReportResponse_Data_ProtoDecoder();
            case 667:
                return new _GuideKeywordsRequest_ProtoDecoder();
            case 668:
                return new _GuideKeywordsResponse_ProtoDecoder();
            case 669:
                return new _GuideKeywordsResponse_Data_ProtoDecoder();
            case 670:
                return new _GuideKeywordsResponse_UserInfo_ProtoDecoder();
            case 671:
                return new _GuideReportRequest_ProtoDecoder();
            case 672:
                return new _GuideReportResponse_ProtoDecoder();
            case 673:
                return new _GuideReportResponse_Data_ProtoDecoder();
            case 674:
                return new _KeywordsLibrary_ProtoDecoder();
            case 675:
                return new _FilterInfoData_ProtoDecoder();
            case 676:
                return new _RoomStatsModel_ProtoDecoder();
            case 677:
                return new _CppAgeVerificationInfo_ProtoDecoder();
            case 678:
                return new _CppTaskInfo_ProtoDecoder();
            case 679:
                return new _EcommerceEntrance_ProtoDecoder();
            case 680:
                return new _EcommerceEntrance_ShopEntranceInfo_ProtoDecoder();
            case 681:
                return new _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoDecoder();
            case 682:
                return new _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ProtoDecoder();
            case 683:
                return new _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder();
            case 684:
                return new _EcommerceEntrance_ShowcaseEntranceInfo_ProtoDecoder();
            case 685:
                return new _LiveProInfo_ProtoDecoder();
            case 686:
                return new _PerceptionFeedbackOption_ProtoDecoder();
            case 687:
                return new com.bytedance.android.livesdk.message.proto._RankUser_ProtoDecoder();
            case 688:
                return new _RankUser_Border_ProtoDecoder();
            case 689:
                return new _RankUser_FollowInfo_ProtoDecoder();
            case 690:
                return new _StarCommentConfig_ProtoDecoder();
            case 691:
                return new _ToolBarManagement_ProtoDecoder();
            case 692:
                return new _WebcastLSAccessStatus_ProtoDecoder();
            case 693:
                return new _AccompanimentStruct_ProtoDecoder();
            case 694:
                return new _ActivityRewardInfo_ProtoDecoder();
            case 695:
                return new _AdEventTracking_ProtoDecoder();
            case 696:
                return new _AnchorInfo_ProtoDecoder();
            case 697:
                return new _AnchorLevel_ProtoDecoder();
            case 698:
                return new _AttrRequestParams_ProtoDecoder();
            case 699:
                return new _AttrResponseParams_ProtoDecoder();
            case 700:
                return new _AttrResponseParams_Extra_ProtoDecoder();
            case 701:
                return new _AttrUpdateRequestParams_ProtoDecoder();
            case 702:
                return new _AttrUpdateResponseParams_ProtoDecoder();
            case 703:
                return new _AudioStruct_ProtoDecoder();
            case 704:
                return new _AuthenticationInfo_ProtoDecoder();
            case 705:
                return new _Author_ProtoDecoder();
            case 706:
                return new _BaLeadsGenInfo_ProtoDecoder();
            case 707:
                return new _BannerInRoom_ProtoDecoder();
            case 708:
                return new _BannerInRoom_BannerContentDynamic_ProtoDecoder();
            case 709:
                return new _BorderInfo_ProtoDecoder();
            case 710:
                return new _Creator_ProtoDecoder();
            case 711:
                return new _DonationSticker_ProtoDecoder();
            case 712:
                return new _EnvelopePortalMessage_ProtoDecoder();
            case 713:
                return new _EnvelopePortalMessage_PortalInfo_ProtoDecoder();
            case 714:
                return new _EnvelopePortalMessage_PortalTransTarget_ProtoDecoder();
            case 715:
                return new _FansClubData_ProtoDecoder();
            case 716:
                return new _FansClubData_UserBadge_ProtoDecoder();
            case 717:
                return new _FansClubMember_ProtoDecoder();
            case 718:
                return new _FeedBanner_ProtoDecoder();
            case 719:
                return new _FeedBannerContainer_ProtoDecoder();
            case 720:
                return new _FeedItem_ProtoDecoder();
            case 721:
                return new _FlareInfo_ProtoDecoder();
            case 722:
                return new _GameTag_ProtoDecoder();
            case 723:
                return new _GameTagCategory_ProtoDecoder();
            case 724:
                return new _Gift_ProtoDecoder();
            case 725:
                return new _GiftBoxInfo_ProtoDecoder();
            case 726:
                return new _GiftInfoInBox_ProtoDecoder();
            case 727:
                return new _GiftLockInfo_ProtoDecoder();
            case 728:
                return new _GiftOperation_ProtoDecoder();
            case 729:
                return new _GiftPanelBanner_ProtoDecoder();
            case 730:
                return new _GiftRandomEffectInfo_ProtoDecoder();
            case 731:
                return new _GiftTrayInfo_ProtoDecoder();
            case 732:
                return new _GiftsBoxInfo_ProtoDecoder();
            case 733:
                return new _GradeIcon_ProtoDecoder();
            case 734:
                return new _Hashtag_ProtoDecoder();
            case 735:
                return new _InteractionQuestionInfo_ProtoDecoder();
            case 736:
                return new _KaraokeSong_ProtoDecoder();
            case 737:
                return new _LikeEffect_ProtoDecoder();
            case 738:
                return new _LikeInfo_ProtoDecoder();
            case 739:
                return new _LiveEventInfo_ProtoDecoder();
            case 740:
                return new _LyricStruct_ProtoDecoder();
            case 741:
                return new _MaskLayer_ProtoDecoder();
            case 742:
                return new _OfficialChannelInfo_ProtoDecoder();
            case 743:
                return new _OrganizationModel_ProtoDecoder();
            case 744:
                return new _PollData_ProtoDecoder();
            case 745:
                return new _PollInfo_ProtoDecoder();
            case 746:
                return new _Portal_ProtoDecoder();
            case 747:
                return new _PromoteOtherMessage_ProtoDecoder();
            case 748:
                return new _RandomGiftBubble_ProtoDecoder();
            case 749:
                return new _RandomGiftPanelBanner_ProtoDecoder();
            case 750:
                return new _Reservation_ProtoDecoder();
            case 751:
                return new _RoomAuthMessage_ProtoDecoder();
            case 752:
                return new _RoomAuthMessageGoldenEnvelope_ProtoDecoder();
            case 753:
                return new _RoomAuthOffReasons_ProtoDecoder();
            case 754:
                return new _RoomAuthStatus_ProtoDecoder();
            case 755:
                return new _RoomDecoration_ProtoDecoder();
            case 756:
                return new _RoomStats_ProtoDecoder();
            case 757:
                return new _RoomSticker_ProtoDecoder();
            case 758:
                return new _ShortTouchItem_ProtoDecoder();
            case 759:
                return new _ShortTouchPreviewSetting_ProtoDecoder();
            case 760:
                return new _StickerCheckResponse_ProtoDecoder();
            case 761:
                return new _StickersSetResponse_ProtoDecoder();
            case 762:
                return new _TestDemo_ProtoDecoder();
            case 763:
                return new _TopFanTicket_ProtoDecoder();
            case 764:
                return new _TopFrameSummary_ProtoDecoder();
            case 765:
                return new _UserAttr_ProtoDecoder();
            case 766:
                return new _UserAttrResponse_ProtoDecoder();
            case 767:
                return new _UserHonor_ProtoDecoder();
            case 768:
                return new _UserVoteInfo_ProtoDecoder();
            case 769:
                return new _VoteResponseData_ProtoDecoder();
            case 770:
                return new _VoteUser_ProtoDecoder();
            case 771:
                return new _WalletPackage_ProtoDecoder();
            case 772:
                return new _WarningTag_ProtoDecoder();
            case 773:
                return new _CoHost_ProtoDecoder();
            case 774:
                return new _LinkmicUser_ProtoDecoder();
            case 775:
                return new _MultiLiveUpdateUserSettingContent_ProtoDecoder();
            case 776:
                return new _MultiLiveUserApplyPermission_ProtoDecoder();
            case 777:
                return new _MultiLiveUserApplySettings_ProtoDecoder();
            case 778:
                return new _MultiLiveUserSettings_ProtoDecoder();
            case 779:
                return new _RoomAudienceMultiGuestPermissionInfo_ProtoDecoder();
            case 780:
                return new _AccessControlCaptcha_ProtoDecoder();
            case 781:
                return new _AccessControlMessage_ProtoDecoder();
            case 782:
                return new _ActivityQuizCardMessage_ProtoDecoder();
            case 783:
                return new _ActivityQuizUserIdentityMessage_ProtoDecoder();
            case 784:
                return new _AddToCartButton_ProtoDecoder();
            case 785:
                return new _AlertAudio_ProtoDecoder();
            case 786:
                return new _AnchorToolModification_ProtoDecoder();
            case 787:
                return new _AnchorToolModificationMessage_ProtoDecoder();
            case 788:
                return new _AssetMessage_ProtoDecoder();
            case 789:
                return new _AtmosphereTagInfo_ProtoDecoder();
            case 790:
                return new _AudienceCancelContent_ProtoDecoder();
            case 791:
                return new _AudienceReplyContent_ProtoDecoder();
            case 792:
                return new _AudienceReserveContent_ProtoDecoder();
            case 793:
                return new _AudienceReserveUserInfo_ProtoDecoder();
            case 794:
                return new _AudienceReserveUserStateMessage_ProtoDecoder();
            case 795:
                return new _AuthorizationNotifyMessage_ProtoDecoder();
            case 796:
                return new _AuthorizationNotifyMessage_ContentBlock_ProtoDecoder();
            case 797:
                return new _AuthorizationNotifyMessage_RelationBlock_ProtoDecoder();
            case 798:
                return new _AwardCardNotice_ProtoDecoder();
            case 799:
                return new _BALeadGenMessage_ProtoDecoder();
            case 800:
                return new _BannerCollapseInfo_ProtoDecoder();
            case 801:
                return new _BannerInRoomCollection_ProtoDecoder();
            case 802:
                return new _BannerInRoomCollection_BannerInfo_ProtoDecoder();
            case 803:
                return new _BannerUpdateMessage_ProtoDecoder();
            case 804:
                return new _BarrageMessage_ProtoDecoder();
            case 805:
                return new _BarrageMessage_BarrageEvent_ProtoDecoder();
            case 806:
                return new _BarrageTypeFansLevelParam_ProtoDecoder();
            case 807:
                return new _BarrageTypeSubscribeGiftParam_ProtoDecoder();
            case 808:
                return new _BarrageTypeUserGradeParam_ProtoDecoder();
            case 809:
                return new _BattleInviteeGiftPermission_ProtoDecoder();
            case 810:
                return new _BattleNoticeCommonGuide_ProtoDecoder();
            case 811:
                return new _BattleSettings_ProtoDecoder();
            case 812:
                return new _BoostCard_ProtoDecoder();
            case 813:
                return new _BottomMessage_ProtoDecoder();
            case 814:
                return new _CapsuleBizParams_ProtoDecoder();
            case 815:
                return new _CapsuleBizParamsCohost_ProtoDecoder();
            case 816:
                return new _CapsuleBizParamsCommentFlaggedPrompt_ProtoDecoder();
            case 817:
                return new _CapsuleBizParamsNewAnchorEffect_ProtoDecoder();
            case 818:
                return new _CapsuleBizParamsRandomGift_ProtoDecoder();
            case 819:
                return new _CapsuleMessage_ProtoDecoder();
            case 820:
                return new _CaptionContent_ProtoDecoder();
            case 821:
                return new _CaptionMessage_ProtoDecoder();
            case 822:
                return new _CardObtainGuide_ProtoDecoder();
            case 823:
                return new _CeremonyEffect_ProtoDecoder();
            case 824:
                return new _ChatMessage_ProtoDecoder();
            case 825:
                return new _CohostListChangeContent_ProtoDecoder();
            case 826:
                return new _CohostReserveMessage_ProtoDecoder();
            case 827:
                return new _CohostTopicMessage_ProtoDecoder();
            case 828:
                return new _CommentQualityScore_ProtoDecoder();
            case 829:
                return new _CommentTrayMessage_ProtoDecoder();
            case 830:
                return new _CommentsMessage_ProtoDecoder();
            case 831:
                return new _CommonPopupMessage_ProtoDecoder();
            case 832:
                return new _CommonToastMessage_ProtoDecoder();
            case 833:
                return new _Contributor_ProtoDecoder();
            case 834:
                return new _ControlMessage_ProtoDecoder();
            case 835:
                return new _ControlMessage_Extra_ProtoDecoder();
            case 836:
                return new _DecorationModifyMessage_ProtoDecoder();
            case 837:
                return new _DiggMessage_ProtoDecoder();
            case 838:
                return new _DonationInfoMessage_ProtoDecoder();
            case 839:
                return new _DonationMessage_ProtoDecoder();
            case 840:
                return new _DrawGuessEndMessage_ProtoDecoder();
            case 841:
                return new _DrawGuessExitMessage_ProtoDecoder();
            case 842:
                return new _DrawGuessStartMessage_ProtoDecoder();
            case 843:
                return new _DrawGuessUpdateMessage_ProtoDecoder();
            case 844:
                return new _EcBarrageMessage_ProtoDecoder();
            case 845:
                return new _EffectPreloadingMessage_ProtoDecoder();
            case 846:
                return new _EmoteChatMessage_ProtoDecoder();
            case 847:
                return new _ExtraInfo_ProtoDecoder();
            case 848:
                return new _FanTicketRoomNoticeContent_ProtoDecoder();
            case 849:
                return new _FansEventData_ProtoDecoder();
            case 850:
                return new _FansEventData_NewFansData_ProtoDecoder();
            case 851:
                return new _FansEventData_TaskCompleteData_ProtoDecoder();
            case 852:
                return new _FansEventMessage_ProtoDecoder();
            case 853:
                return new _FlexImageModel_ProtoDecoder();
            case 854:
                return new _FollowCardMessage_ProtoDecoder();
            case 855:
                return new _GameOCRPingMessage_ProtoDecoder();
            case 856:
                return new _GameRankNotifyMessage_ProtoDecoder();
            case 857:
                return new _GiftBoostCardMessage_ProtoDecoder();
            case 858:
                return new _GiftCollection_ProtoDecoder();
            case 859:
                return new _GiftCollectionUpdateMessage_ProtoDecoder();
            case 860:
                return new _GiftGlobalMessage_ProtoDecoder();
            case 861:
                return new _GiftGuideMessage_ProtoDecoder();
            case 862:
                return new _GiftIMPriority_ProtoDecoder();
            case 863:
                return new _GiftMessage_ProtoDecoder();
            case 864:
                return new _GiftMonitorInfo_ProtoDecoder();
            case 865:
                return new _GiftNoticeMessage_ProtoDecoder();
            case 866:
                return new _GiftPromptMessage_ProtoDecoder();
            case 867:
                return new _GiftUnlockMessage_ProtoDecoder();
            case 868:
                return new _GiftUpdateMessage_ProtoDecoder();
            case 869:
                return new _GoodyBagMessage_ProtoDecoder();
            case 870:
                return new _GreetingMessage_ProtoDecoder();
            case 871:
                return new _GuideMessage_ProtoDecoder();
            case 872:
                return new _GuidePageResource_ProtoDecoder();
            case 873:
                return new _HashtagMessage_ProtoDecoder();
            case 874:
                return new _HeatUpdateContent_ProtoDecoder();
            case 875:
                return new _HighlightFragmentReadyMessage_ProtoDecoder();
            case 876:
                return new _HourlyRankRewardInfo_ProtoDecoder();
            case 877:
                return new _HourlyRankRewardMessage_ProtoDecoder();
            case 878:
                return new _ImDeleteMessage_ProtoDecoder();
            case 879:
                return new _Img_ProtoDecoder();
            case 880:
                return new _InRoomBannerMessage_ProtoDecoder();
            case 881:
                return new _InRoomBannerRefreshMessage_ProtoDecoder();
            case 882:
                return new _InviteTopHostInfo_ProtoDecoder();
            case 883:
                return new _KaraokeQueueMessage_ProtoDecoder();
            case 884:
                return new _KaraokeReqMessage_ProtoDecoder();
            case 885:
                return new _KaraokeSwitchMessage_ProtoDecoder();
            case 886:
                return new _LikeMessage_ProtoDecoder();
            case 887:
                return new _LinkMessage_ProtoDecoder();
            case 888:
                return new _LinkMicAdMessage_ProtoDecoder();
            case 889:
                return new _LinkMicAnchorGuideMessage_ProtoDecoder();
            case 890:
                return new _LinkMicAudienceNoticeMessage_ProtoDecoder();
            case 891:
                return new _LinkMicAudienceNoticeMessage_LinkMicAudienceInviteGuide_ProtoDecoder();
            case 892:
                return new _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder();
            case 893:
                return new _LinkMicAudienceNoticeMessage_LinkMicAudienceTurnOnGuide_ProtoDecoder();
            case 894:
                return new _LinkMicBattleArmiesMessage_ProtoDecoder();
            case 895:
                return new _LinkMicBattleItemCard_ProtoDecoder();
            case 896:
                return new _LinkMicBattleMessage_ProtoDecoder();
            case 897:
                return new _LinkMicBattleNoticeMessage_ProtoDecoder();
            case 898:
                return new _LinkMicBattlePunishFinishMessage_ProtoDecoder();
            case 899:
                return new _LinkMicBattleTaskMessage_ProtoDecoder();
            case 900:
                return new _LinkMicBattleVictoryLapMessage_ProtoDecoder();
            case 901:
                return new _LinkMicFanTicketMethod_ProtoDecoder();
            case 902:
                return new _LinkMicMessage_ProtoDecoder();
            case 903:
                return new _LinkMicSignalMessage_ProtoDecoder();
            case 904:
                return new _LinkScreenChangeMessage_ProtoDecoder();
            case 905:
                return new _LinkerCloseContent_ProtoDecoder();
            case 906:
                return new _LinkerCreateContent_ProtoDecoder();
            case 907:
                return new _LinkerEnlargeStatusSynContent_ProtoDecoder();
            case 908:
                return new _LinkerGuestCancelEnlargeContent_ProtoDecoder();
            case 909:
                return new _LinkerMediaChangeContent_ProtoDecoder();
            case 910:
                return new _LinkerSysKickOutContent_ProtoDecoder();
            case 911:
                return new _LinkerUpdateUserContent_ProtoDecoder();
            case 912:
                return new _LinkerWaitingListChangeContent_ProtoDecoder();
            case 913:
                return new _LinkmicUserInfo_ProtoDecoder();
            case 914:
                return new _LinkmicUserToastContent_ProtoDecoder();
            case 915:
                return new _LiveEventMessage_ProtoDecoder();
            case 916:
                return new _LiveIntroMessage_ProtoDecoder();
            case 917:
                return new _LivePermissionInfo_ProtoDecoder();
            case 918:
                return new _LiveTrayMessage_ProtoDecoder();
            case 919:
                return new _MarqueeAnnouncementMessage_ProtoDecoder();
            case 920:
                return new _MarqueeAnnouncementMessage_MessageEntity_ProtoDecoder();
            case 921:
                return new _MemberMessage_ProtoDecoder();
            case 922:
                return new _MemberMessage_EffectConfigBean_ProtoDecoder();
            case 923:
                return new _ModeratorSpeakerMessage_ProtoDecoder();
            case 924:
                return new _MsgDetectMessage_ProtoDecoder();
            case 925:
                return new _MsgDetectMessage_TimeInfo_ProtoDecoder();
            case 926:
                return new _MsgDetectMessage_TriggerCondition_ProtoDecoder();
            case 927:
                return new _NewAnchorEffectParams_ProtoDecoder();
            case 928:
                return new _NewAnchorGuideConfig_ProtoDecoder();
            case 929:
                return new _NewAnchorGuideMessage_ProtoDecoder();
            case 930:
                return new _NewAnchorGuideMsgInfo_ProtoDecoder();
            case 931:
                return new _NotificationConfirmResponse_ProtoDecoder();
            case 932:
                return new _NotifyHighlightContent_ProtoDecoder();
            case 933:
                return new _NotifyHighlightInfo_ProtoDecoder();
            case 934:
                return new _OfficialChannelAnchorMessage_ProtoDecoder();
            case 935:
                return new _OfficialChannelModifyMessage_ProtoDecoder();
            case 936:
                return new _OfficialChannelUserMessage_ProtoDecoder();
            case 937:
                return new _OperateToastMessage_ProtoDecoder();
            case 938:
                return new com.bytedance.android.livesdk.model.message._OptPairInfo_ProtoDecoder();
            case 939:
                return new _OptPairInfo_OptPairUser_ProtoDecoder();
            case 940:
                return new _PaidContentLiveShoppingMessage_ProtoDecoder();
            case 941:
                return new _PartnershipCardChangeMessage_ProtoDecoder();
            case 942:
                return new _PartnershipDownloadCountMessage_ProtoDecoder();
            case 943:
                return new _PartnershipDropsUpdateMessage_ProtoDecoder();
            case 944:
                return new _PartnershipGameOfflineMessage_ProtoDecoder();
            case 945:
                return new _PartnershipGameOfflineMessage_OfflineGameInfo_ProtoDecoder();
            case 946:
                return new _PartnershipPunishMessage_ProtoDecoder();
            case 947:
                return new _PartnershipTaskShowMessage_ProtoDecoder();
            case 948:
                return new _PerceptionDialogInfo_ProtoDecoder();
            case 949:
                return new _PerceptionMessage_ProtoDecoder();
            case 950:
                return new _PictionaryInfo_ProtoDecoder();
            case 951:
                return new _PinMessage_ProtoDecoder();
            case 952:
                return new _PollEndContent_ProtoDecoder();
            case 953:
                return new _PollMessage_ProtoDecoder();
            case 954:
                return new _PollOptionInfo_ProtoDecoder();
            case 955:
                return new _PollStartContent_ProtoDecoder();
            case 956:
                return new _PollUpdateVotesContent_ProtoDecoder();
            case 957:
                return new _PollingRequest_ProtoDecoder();
            case 958:
                return new _PollingResponse_ProtoDecoder();
            case 959:
                return new _PollingResponse_Extra_ProtoDecoder();
            case 960:
                return new _PopSeries_ProtoDecoder();
            case 961:
                return new _PopularCardMessage_ProtoDecoder();
            case 962:
                return new _PopularCardMessage_PopularCardInfo_ProtoDecoder();
            case 963:
                return new _PortalMessage_ProtoDecoder();
            case 964:
                return new _PortalMessage_PortalBuy_ProtoDecoder();
            case 965:
                return new _PortalMessage_PortalFinish_ProtoDecoder();
            case 966:
                return new _PortalMessage_PortalInvite_ProtoDecoder();
            case 967:
                return new _ProductAtmosphereTag_ProtoDecoder();
            case 968:
                return new _ProductSnapShot_ProtoDecoder();
            case 969:
                return new _ProjectDModifyH5Message_ProtoDecoder();
            case 970:
                return new _PublicAreaCommon_ProtoDecoder();
            case 971:
                return new _PunishEventInfo_ProtoDecoder();
            case 972:
                return new _Question_ProtoDecoder();
            case 973:
                return new _QuestionDeleteMessage_ProtoDecoder();
            case 974:
                return new _QuestionMessage_ProtoDecoder();
            case 975:
                return new _QuestionSelectMessage_ProtoDecoder();
            case 976:
                return new _QuestionSlideDownMessage_ProtoDecoder();
            case 977:
                return new _QuestionSwitchMessage_ProtoDecoder();
            case 978:
                return new _QuickChatContent_ProtoDecoder();
            case 979:
                return new _QuickChatListMessage_ProtoDecoder();
            case 980:
                return new _RankAnimationInfo_ProtoDecoder();
            case 981:
                return new _RankTextMessage_ProtoDecoder();
            case 982:
                return new _RankToastMessage_ProtoDecoder();
            case 983:
                return new _RankToastMessage_RankToast_ProtoDecoder();
            case 984:
                return new _RankUpdate_ProtoDecoder();
            case 985:
                return new _RankUpdateMessage_ProtoDecoder();
            case 986:
                return new _RealtimeLiveCenterMethod_ProtoDecoder();
            case 987:
                return new _RemindMessage_ProtoDecoder();
            case 988:
                return new _ReplyContent_ProtoDecoder();
            case 989:
                return new _ReserveContent_ProtoDecoder();
            case 990:
                return new _ReserveInfo_ProtoDecoder();
            case 991:
                return new _ReserveInfo_ReserveUser_ProtoDecoder();
            case 992:
                return new _RichChatMessage_ProtoDecoder();
            case 993:
                return new _RoomMessage_ProtoDecoder();
            case 994:
                return new _RoomNotifyMessage_ProtoDecoder();
            case 995:
                return new _RoomNotifyMessageExtra_ProtoDecoder();
            case 996:
                return new _RoomNotifyMessageExtra_Background_ProtoDecoder();
            case 997:
                return new _RoomPushMessage_ProtoDecoder();
            case 998:
                return new _RoomStickerMessage_ProtoDecoder();
            case 999:
                return new _RoomUserSeqMessage_ProtoDecoder();
            case 1000:
                return new _RoomVerifyMessage_ProtoDecoder();
            case 1001:
                return new _ScreenMessage_ProtoDecoder();
            case 1002:
                return new _ShareGuideMessage_ProtoDecoder();
            case 1003:
                return new _SocialMessage_ProtoDecoder();
            case 1004:
                return new _SpecifiedDisplayText_ProtoDecoder();
            case 1005:
                return new _StarCommentMessage_ProtoDecoder();
            case 1006:
                return new _StarCommentNotificationMessage_ProtoDecoder();
            case 1007:
                return new _StarCommentPushMessage_ProtoDecoder();
            case 1008:
                return new _SubNotifyMessage_ProtoDecoder();
            case 1009:
                return new _SubPinEventMessage_ProtoDecoder();
            case 1010:
                return new _SubTimerStickerMessage_ProtoDecoder();
            case 1011:
                return new _SubWaveMessage_ProtoDecoder();
            case 1012:
                return new _SubscriptionGuideMessage_ProtoDecoder();
            case 1013:
                return new _TeamUsersInfo_ProtoDecoder();
            case 1014:
                return new _TextEffect_ProtoDecoder();
            case 1015:
                return new _TextEffect_Detail_ProtoDecoder();
            case 1016:
                return new _TimeTag_ProtoDecoder();
            case 1017:
                return new _TopicSetContent_ProtoDecoder();
            case 1018:
                return new _UnauthorizedMemberMessage_ProtoDecoder();
            case 1019:
                return new _UpgradeMessage_ProtoDecoder();
            case 1020:
                return new _UseCriticalStrikeCard_ProtoDecoder();
            case 1021:
                return new _UseSmokeCard_ProtoDecoder();
            case 1022:
                return new _UserFanTicket_ProtoDecoder();
            case 1023:
                return new _UserStatsMessage_ProtoDecoder();
            case 1024:
                return new _VideoLiveCouponRcmdMessage_ProtoDecoder();
            case 1025:
                return new _VideoLiveGoodsRcmdMessage_ProtoDecoder();
            case 1026:
                return new _WeeklyRankRewardMessage_ProtoDecoder();
            case 1027:
                return new _XGGoodsOrderMessage_ProtoDecoder();
            case 1028:
                return new _XGGoodsOrderMessage_GoodsOrder_ProtoDecoder();
            case 1029:
                return new _BattleDisplayConfig_ProtoDecoder();
            case 1030:
                return new _BattleNoticeAnchorGiftGuide_ProtoDecoder();
            case 1031:
                return new _BattleNoticeAnchorGuide_ProtoDecoder();
            case 1032:
                return new _BattleNoticeBubbleGuide_ProtoDecoder();
            case 1033:
                return new _BattleNoticeRuleGuide_ProtoDecoder();
            case 1034:
                return new _BattleNoticeText_ProtoDecoder();
            case 1035:
                return new _BattleNoticeToast_ProtoDecoder();
            case 1036:
                return new _BattleResult_ProtoDecoder();
            case 1037:
                return new _BattleRewardSettle_ProtoDecoder();
            case 1038:
                return new _BattleSetting_ProtoDecoder();
            case 1039:
                return new _BattleTaskSettle_ProtoDecoder();
            case 1040:
                return new _BattleTaskStart_ProtoDecoder();
            case 1041:
                return new _BattleTaskUpdate_ProtoDecoder();
            case 1042:
                return new _BattleTruthOrDareOptOutNotice_ProtoDecoder();
            case 1043:
                return new _BattleTruthOrDareTips_ProtoDecoder();
            case 1044:
                return new _BattleTruthOrDareTriggerGuide_ProtoDecoder();
            case 1045:
                return new _BattleTruthOrDareTriggerGuideV2_ProtoDecoder();
            case 1046:
                return new _BattleTruthOrDareTriggerGuideV2_TruthOrDareTip_ProtoDecoder();
            case 1047:
                return new _BattleUserArmies_ProtoDecoder();
            case 1048:
                return new _BattleUserArmy_ProtoDecoder();
            case 1049:
                return new _BattleUserInfoWrapper_ProtoDecoder();
            case 1050:
                return new _ExemptStrategy_ProtoDecoder();
            case 1051:
                return new _SupportedActionsWrapper_ProtoDecoder();
            case 1052:
                return new _TruthOrDareTip_ProtoDecoder();
            case 1053:
                return new _UserArmiesWrapper_ProtoDecoder();
            case 1054:
                return new _PatternRef_ProtoDecoder();
            case 1055:
                return new _Text_ProtoDecoder();
            case 1056:
                return new _TextFormat_ProtoDecoder();
            case 1057:
                return new _TextPiece_ProtoDecoder();
            case 1058:
                return new _TextPieceGift_ProtoDecoder();
            case 1059:
                return new _TextPieceHeart_ProtoDecoder();
            case 1060:
                return new _TextPieceImage_ProtoDecoder();
            case 1061:
                return new _TextPiecePatternRef_ProtoDecoder();
            case 1062:
                return new _TextPieceUser_ProtoDecoder();
            case 1063:
                return new _BusinessLinksLiveMessage_ProtoDecoder();
            case 1064:
                return new _ECShortItemRefreshMessage_ProtoDecoder();
            case 1065:
                return new _ECTaskRegisterMessage_ProtoDecoder();
            case 1066:
                return new _ECommerceMessage_ProtoDecoder();
            case 1067:
                return new _EcDrawEntity_ProtoDecoder();
            case 1068:
                return new _EcDrawMessage_ProtoDecoder();
            case 1069:
                return new _EcTaskRefreshCouponListEntity_ProtoDecoder();
            case 1070:
                return new _EcTaskRefreshCouponListMessage_ProtoDecoder();
            case 1071:
                return new _EcTaskRegisterMessageEntity_ProtoDecoder();
            case 1072:
                return new _HotTag_ProtoDecoder();
            case 1073:
                return new _PopProduct_ProtoDecoder();
            case 1074:
                return new _ShortItemRefreshEntity_ProtoDecoder();
            case 1075:
                return new _TraceInfo_ProtoDecoder();
            case 1076:
                return new _AllListUser_ProtoDecoder();
            case 1077:
                return new _ApplyContent_ProtoDecoder();
            case 1078:
                return new _ApplyRequestResponse_ProtoDecoder();
            case 1079:
                return new _ByteRTCExtInfo_ProtoDecoder();
            case 1080:
                return new _CancelApplyContent_ProtoDecoder();
            case 1081:
                return new _CancelApplyResponse_ProtoDecoder();
            case 1082:
                return new _CancelInviteContent_ProtoDecoder();
            case 1083:
                return new _CancelInviteResponse_ProtoDecoder();
            case 1084:
                return new _ChangeLayoutResp_ProtoDecoder();
            case 1085:
                return new _ChangePositionResp_ProtoDecoder();
            case 1086:
                return new _CreateChannelContent_ProtoDecoder();
            case 1087:
                return new _CreateChannelResponse_ProtoDecoder();
            case 1088:
                return new _DSLConfig_ProtoDecoder();
            case 1089:
                return new _DestroyRequestResponse_ProtoDecoder();
            case 1090:
                return new _FinishChannelContent_ProtoDecoder();
            case 1091:
                return new _InviteContent_ProtoDecoder();
            case 1092:
                return new com.bytedance.android.livesdk.model.message.linkcore._InviteResponse_ProtoDecoder();
            case 1093:
                return new _JoinChannelResp_ProtoDecoder();
            case 1094:
                return new _JoinDirectContent_ProtoDecoder();
            case 1095:
                return new _JoinDirectResp_ProtoDecoder();
            case 1096:
                return new _KickOutContent_ProtoDecoder();
            case 1097:
                return new _KickOutResponse_ProtoDecoder();
            case 1098:
                return new _LeaveContent_ProtoDecoder();
            case 1099:
                return new _LeaveRequestResponse_ProtoDecoder();
            case 1100:
                return new _LinkCommon_ProtoDecoder();
            case 1101:
                return new _LinkLayerListUser_ProtoDecoder();
            case 1102:
                return new _LinkLayerMessage_ProtoDecoder();
            case 1103:
                return new _LinkListChangeContent_ProtoDecoder();
            case 1104:
                return new _LinkMicCommonResp_ProtoDecoder();
            case 1105:
                return new _LinkPosition_ProtoDecoder();
            case 1106:
                return new _MicPositionData_ProtoDecoder();
            case 1107:
                return new _PermitApplyContent_ProtoDecoder();
            case 1108:
                return new com.bytedance.android.livesdk.model.message.linkcore._PermitResponse_ProtoDecoder();
            case 1109:
                return new _Player_ProtoDecoder();
            case 1110:
                return new _RTCBitRateMap_ProtoDecoder();
            case 1111:
                return new _RTCDualStreamParam_ProtoDecoder();
            case 1112:
                return new _RTCEngineConfig_ProtoDecoder();
            case 1113:
                return new _RTCExtraInfo_ProtoDecoder();
            case 1114:
                return new _RTCInfoExtra_ProtoDecoder();
            case 1115:
                return new _RTCLiveVideoParam_ProtoDecoder();
            case 1116:
                return new _RTCMixBase_ProtoDecoder();
            case 1117:
                return new _RTCMixParam_ProtoDecoder();
            case 1118:
                return new _RTCOther_ProtoDecoder();
            case 1119:
                return new _RTCVideoParam_ProtoDecoder();
            case 1120:
                return new _ReplyInviteContent_ProtoDecoder();
            case 1121:
                return new com.bytedance.android.livesdk.model.message.linkcore._ReplyResponse_ProtoDecoder();
            case 1122:
                return new _UserPosition_ProtoDecoder();
            case 1123:
                return new _LinkerAcceptNoticeContent_ProtoDecoder();
            case 1124:
                return new _LinkerCancelContent_ProtoDecoder();
            case 1125:
                return new _LinkerEnterContent_ProtoDecoder();
            case 1126:
                return new com.bytedance.android.livesdk.model.message.linker.invite_message._AuthenticationInfo_ProtoDecoder();
            case 1127:
                return new _InviterRivalExtra_ProtoDecoder();
            case 1128:
                return new _LinkerInviteContent_ProtoDecoder();
            case 1129:
                return new _LinkerInviteMessageExtra_ProtoDecoder();
            case 1130:
                return new _LinkerKickOutContent_ProtoDecoder();
            case 1131:
                return new _LinkerLeaveContent_ProtoDecoder();
            case 1132:
                return new _LinkedListChangeContent_ProtoDecoder();
            case 1133:
                return new _ListUser_ProtoDecoder();
            case 1134:
                return new _LinkListUser_ProtoDecoder();
            case 1135:
                return new _LinkerListChangeContent_ProtoDecoder();
            case 1136:
                return new _LinkerMicIdxUpdateContent_ProtoDecoder();
            case 1137:
                return new _LinkerMicIdxUpdateInfo_ProtoDecoder();
            case 1138:
                return new _LinkerMuteContent_ProtoDecoder();
            case 1139:
                return new _LinkerRandomMatchContent_ProtoDecoder();
            case 1140:
                return new _LinkerReplyContent_ProtoDecoder();
            case 1141:
                return new _LinkerSetting_ProtoDecoder();
            case 1142:
                return new _LinkmicInfo_ProtoDecoder();
            case 1143:
                return new _MessageRedEnvelopInfo_ProtoDecoder();
            case 1144:
                return new _RedEnvelopMessage_ProtoDecoder();
            case 1145:
                return new _Rank_ProtoDecoder();
            case 1146:
                return new _RankItem_ProtoDecoder();
            case 1147:
                return new _RankListV2RequestParams_ProtoDecoder();
            case 1148:
                return new _RankListV2Response_ProtoDecoder();
            case 1149:
                return new _RankListV2Response_BriefDescription_ProtoDecoder();
            case 1150:
                return new _RankListV2Response_Bulletin_ProtoDecoder();
            case 1151:
                return new _RankListV2Response_BulletinLoop_ProtoDecoder();
            case 1152:
                return new _RankListV2Response_CutOffLine_ProtoDecoder();
            case 1153:
                return new _RankListV2Response_DailyAndRookieExtra_ProtoDecoder();
            case 1154:
                return new _RankListV2Response_Data_ProtoDecoder();
            case 1155:
                return new _RankListV2Response_Gap_ProtoDecoder();
            case 1156:
                return new _RankListV2Response_HistoryEntrance_ProtoDecoder();
            case 1157:
                return new _RankListV2Response_LeagueTabInfo_ProtoDecoder();
            case 1158:
                return new _RankListV2Response_LynxRankData_ProtoDecoder();
            case 1159:
                return new _RankListV2Response_PathToOtherList_ProtoDecoder();
            case 1160:
                return new _RankListV2Response_RankInfo_ProtoDecoder();
            case 1161:
                return new _RankListV2Response_RankLeagueBase_ProtoDecoder();
            case 1162:
                return new _RankListV2Response_RankLeagueExtra_ProtoDecoder();
            case 1163:
                return new _RankListV2Response_RankLeagueHeader_ProtoDecoder();
            case 1164:
                return new _RankListV2Response_RankLeagueTab_ProtoDecoder();
            case 1165:
                return new _RankListV2Response_RankView_ProtoDecoder();
            case 1166:
                return new _RankListV2Response_WeeklyRankExtra_ProtoDecoder();
            case 1167:
                return new _RankListV2Response_WeeklyRookieRankExtra_ProtoDecoder();
            case 1168:
                return new _WeeklyRankRegionInfo_ProtoDecoder();
            case 1169:
                return new _RankEntrance_ProtoDecoder();
            case 1170:
                return new _RankEntranceV3RequestParams_ProtoDecoder();
            case 1171:
                return new _RankEntranceV3Response_ProtoDecoder();
            case 1172:
                return new _RankEntranceV3Response_EntranceGroup_ProtoDecoder();
            case 1173:
                return new _RankEntranceV3Response_EntranceGroup_Data_ProtoDecoder();
            case 1174:
                return new _RankTabInfo_ProtoDecoder();
            case 1175:
                return new _RollCfg_ProtoDecoder();
            case 1176:
                return new _SubRankTabInfo_ProtoDecoder();
            case 1177:
                return new _SpriteImageItem_ProtoDecoder();
            case 1178:
                return new _VideoMetaInfo_ProtoDecoder();
            case 1179:
                return new _GiftListExtra_ProtoDecoder();
            case 1180:
                return new _BubbleInfo_ProtoDecoder();
            case 1181:
                return new _CustomBenefitEntrance_ProtoDecoder();
            case 1182:
                return new _GetSubEmoteDetailResponse_ProtoDecoder();
            case 1183:
                return new _GetSubInfoResponse_ProtoDecoder();
            case 1184:
                return new _GetSubTimerDetailRequest_ProtoDecoder();
            case 1185:
                return new _GetSubTimerDetailResponse_ProtoDecoder();
            case 1186:
                return new _GetSubTimerDetailResponse_Data_ProtoDecoder();
            case 1187:
                return new _GetSubTimerDetailResponse_ResponseExtra_ProtoDecoder();
            case 1188:
                return new _PayPalBindInfo_ProtoDecoder();
            case 1189:
                return new _SubDataItemView_ProtoDecoder();
            case 1190:
                return new _SubDataOverview_ProtoDecoder();
            case 1191:
                return new _SubLiveBanner_ProtoDecoder();
            case 1192:
                return new _SubOnlyLiveInfo_ProtoDecoder();
            case 1193:
                return new _SubSettingStatus_ProtoDecoder();
            case 1194:
                return new _SubscribeBubbleList_ProtoDecoder();
            case 1195:
                return new _SubscriberInfo_ProtoDecoder();
            case 1196:
                return new _SubscribingInfo_ProtoDecoder();
            case 1197:
                return new _UpdateTimerRequest_ProtoDecoder();
            case 1198:
                return new _UpdateTimerResponse_ProtoDecoder();
            case 1199:
                return new _UpdateTimerResponse_Data_ProtoDecoder();
            case LinkMicRtcMixBitrateSetting.DEFAULT /* 1200 */:
                return new _WebappSubInfo_ProtoDecoder();
            case 1201:
                return new _SubGifInfo_ProtoDecoder();
            case 1202:
                return new _SubGoalInfo_ProtoDecoder();
            case 1203:
                return new _GetInvitationStatusResponse_ProtoDecoder();
            case 1204:
                return new _SubAvailable_ProtoDecoder();
            case 1205:
                return new _SubEnable_ProtoDecoder();
            case 1206:
                return new _SubEnableCondition_ProtoDecoder();
            case 1207:
                return new _SubEntrance_ProtoDecoder();
            case 1208:
                return new _SubInvitationCode_ProtoDecoder();
            case 1209:
                return new _SubInvitationEntrance_ProtoDecoder();
            case 1210:
                return new _SubInvitationEntrancePrompt_ProtoDecoder();
            case 1211:
                return new _SubInvitationFunctionSwitcher_ProtoDecoder();
            case 1212:
                return new _SubInvitationInviteeStatus_ProtoDecoder();
            case 1213:
                return new _SubInvitationListData_ProtoDecoder();
            case 1214:
                return new _SubOptInStatus_ProtoDecoder();
            case 1215:
                return new _SubSwitcher_ProtoDecoder();
            case 1216:
                return new _PaypalBindingUrl_ProtoDecoder();
            case 1217:
                return new _Diamond_ProtoDecoder();
            case 1218:
                return new _GetPIPOUrlResult_ProtoDecoder();
            case 1219:
                return new _GetPIPOUrlResult_UrlData_ProtoDecoder();
            case 1220:
                return new _GetPipoUrlParams_ProtoDecoder();
            case 1221:
                return new _NoticesRequestParams_ProtoDecoder();
            case 1222:
                return new _NoticesResult_ProtoDecoder();
            case 1223:
                return new _NoticesResult_Data_ProtoDecoder();
            case 1224:
                return new _NoticesResult_Notice_ProtoDecoder();
            case 1225:
                return new _NoticesResult_Style_ProtoDecoder();
            case 1226:
                return new _AgeRestricted_ProtoDecoder();
            case 1227:
                return new _AnchorLevelPermission_ProtoDecoder();
            case 1228:
                return new _BALinkStruct_ProtoDecoder();
            case 1229:
                return new _BcToggleInfo_ProtoDecoder();
            case 1230:
                return new _BurstInfo_ProtoDecoder();
            case 1231:
                return new _CaptionInfo_ProtoDecoder();
            case 1232:
                return new _ChannelInfo_ProtoDecoder();
            case 1233:
                return new _CommerceStruct_ProtoDecoder();
            case 1234:
                return new _CommercialContentToggle_ProtoDecoder();
            case 1235:
                return new _ContinueRoomResponse_ProtoDecoder();
            case 1236:
                return new _CoverInfo_ProtoDecoder();
            case 1237:
                return new _CoverQuality_ProtoDecoder();
            case 1238:
                return new _DeprecatedStruct5_ProtoDecoder();
            case 1239:
                return new _DeprecatedStruct6_ProtoDecoder();
            case 1240:
                return new _DeprecatedStruct6_DeprecatedStruct7_ProtoDecoder();
            case 1241:
                return new _EffectInfo_ProtoDecoder();
            case 1242:
                return new _EnterRegionMatch_ProtoDecoder();
            case 1243:
                return new _FYPCommerceStruct_ProtoDecoder();
            case 1244:
                return new _FYPRoomTagItem_ProtoDecoder();
            case 1245:
                return new _FeedRoomLabel_ProtoDecoder();
            case 1246:
                return new _FilterMsgRuleParamRandom_ProtoDecoder();
            case 1247:
                return new _GiftSuspension_ProtoDecoder();
            case 1248:
                return new _KaraokeInfo_ProtoDecoder();
            case 1249:
                return new _LineupRoomInfo_ProtoDecoder();
            case 1250:
                return new _LiveCoreSDKData_ProtoDecoder();
            case 1251:
                return new _LiveCoreSDKData_Options_ProtoDecoder();
            case 1252:
                return new _LiveCoreSDKData_PullData_ProtoDecoder();
            case 1253:
                return new _LiveCoreSDKData_Quality_ProtoDecoder();
            case 1254:
                return new _LiveFilterMsgRule_ProtoDecoder();
            case 1255:
                return new _LiveGiftBoostCardRoomStatus_ProtoDecoder();
            case 1256:
                return new _OfficialRoomInfo_ProtoDecoder();
            case 1257:
                return new _PaidContentInfo_ProtoDecoder();
            case 1258:
                return new _PaidEvent_ProtoDecoder();
            case 1259:
                return new _PartnershipInfo_ProtoDecoder();
            case 1260:
                return new _PictionaryFullInfo_ProtoDecoder();
            case 1261:
                return new _PictionaryStatistics_ProtoDecoder();
            case 1262:
                return new _PinInfo_ProtoDecoder();
            case 1263:
                return new _PreviewProductCardInfo_ProtoDecoder();
            case 1264:
                return new _RegionalRestricted_ProtoDecoder();
            case 1265:
                return new _Room_ProtoDecoder();
            case 1266:
                return new _RoomExtra_ProtoDecoder();
            case 1267:
                return new _RoomHealthScoreInfo_ProtoDecoder();
            case 1268:
                return new _RoomLinkInfo_ProtoDecoder();
            case 1269:
                return new _RoomPrivateInfo_ProtoDecoder();
            case 1270:
                return new _RoomShortTouchAreaConfig_ProtoDecoder();
            case 1271:
                return new _RoomShortTouchAreaConfig_Element_ProtoDecoder();
            case 1272:
                return new _RoomTab_ProtoDecoder();
            case 1273:
                return new _RoomUserAttr_ProtoDecoder();
            case 1274:
                return new _ShortTouchArea_ProtoDecoder();
            case 1275:
                return new _ShortTouchIconSkin_ProtoDecoder();
            case 1276:
                return new _ShortTouchInfo_ProtoDecoder();
            case 1277:
                return new _ShowInfo_ProtoDecoder();
            case 1278:
                return new _Skin_ProtoDecoder();
            case 1279:
                return new _SkinDrawerEntrance_ProtoDecoder();
            case 1280:
                return new _SkinHostAccount_ProtoDecoder();
            case 1281:
                return new _StreamUrl_ProtoDecoder();
            case 1282:
                return new _StreamUrlExtra_ProtoDecoder();
            case 1283:
                return new _StreamUrlExtra_SrConfig_ProtoDecoder();
            case 1284:
                return new _BattleABTest_ProtoDecoder();
            case 1285:
                return new _BattleABTestList_ProtoDecoder();
            case 1286:
                return new _BattleABTestSetting_ProtoDecoder();
            case 1287:
                return new _BattleArmy_ProtoDecoder();
            case 1288:
                return new _BattleArmy_RankUser_ProtoDecoder();
            case 1289:
                return new _BattleBaseUserInfo_ProtoDecoder();
            case 1290:
                return new _BattleBonusConfig_ProtoDecoder();
            case 1291:
                return new _BattleBonusStatus_ProtoDecoder();
            case 1292:
                return new _BattleComboInfo_ProtoDecoder();
            case 1293:
                return new _BattleGameConfig_ProtoDecoder();
            case 1294:
                return new _BattleInfoResponse_ProtoDecoder();
            case 1295:
                return new _BattleLinkerInviteMessageExtra_ProtoDecoder();
            case 1296:
                return new _BattleLinkerInviteMessageExtra_InviterRivalExtra_ProtoDecoder();
            case 1297:
                return new _BattleMode_ProtoDecoder();
            case 1298:
                return new _BattleMode_StealTowerData_ProtoDecoder();
            case 1299:
                return new _BattlePrompt_ProtoDecoder();
            case 1300:
                return new _BattlePromptElem_ProtoDecoder();
            case 1301:
                return new _BattleRival_ProtoDecoder();
            case 1302:
                return new _BattleRivalTag_ProtoDecoder();
            case 1303:
                return new _BattleScore_ProtoDecoder();
            case 1304:
                return new _BattleStatsMeta_ProtoDecoder();
            case 1305:
                return new _BattleTask_ProtoDecoder();
            case 1306:
                return new _BattleTaskGiftAmountGuide_ProtoDecoder();
            case 1307:
                return new _BattleTaskInfo_ProtoDecoder();
            case 1308:
                return new _BattleTeamResult_ProtoDecoder();
            case 1309:
                return new _BattleTeamUser_ProtoDecoder();
            case 1310:
                return new _BattleTeamUserArmies_ProtoDecoder();
            case 1311:
                return new _BattleTruthOrDare_ProtoDecoder();
            case 1312:
                return new _BattleUserInfo_ProtoDecoder();
            case 1313:
                return new _BestTeammateRelation_ProtoDecoder();
            case 1314:
                return new com.bytedance.android.livesdkapi.depend.model.live.match._ChannelInfo_ProtoDecoder();
            case 1315:
                return new _ChijiHistory_ProtoDecoder();
            case 1316:
                return new _ChijiResult_ProtoDecoder();
            case 1317:
                return new _CriticalStrikeCardInfo_ProtoDecoder();
            case 1318:
                return new _EffectingCard_ProtoDecoder();
            case 1319:
                return new _GiftMode_ProtoDecoder();
            case 1320:
                return new _GiftModeMeta_ProtoDecoder();
            case 1321:
                return new _IssueCategory_ProtoDecoder();
            case 1322:
                return new _MultiBattleFinishResponse_ProtoDecoder();
            case 1323:
                return new _MultiInviteResponse_ProtoDecoder();
            case 1324:
                return new _MultiMatchPrepareResponse_ProtoDecoder();
            case 1325:
                return new _PreviewPeriod_ProtoDecoder();
            case 1326:
                return new _RewardPeriodConfig_ProtoDecoder();
            case 1327:
                return new _ScheduleItem_ProtoDecoder();
            case 1328:
                return new _SmokeCardInfo_ProtoDecoder();
            case 1329:
                return new _TaskPeriodConfig_ProtoDecoder();
            case 1330:
                return new _TeamMatchCampaign_ProtoDecoder();
            case 1331:
                return new _TeamUser_ProtoDecoder();
            case 1332:
                return new _ReportCommitData_ProtoDecoder();
            case 1333:
                return new _CommonMessageData_ProtoDecoder();
            case 1334:
                return new _HeartBeat_ProtoDecoder();
            case 1335:
                return new _ImEnterRoom_ProtoDecoder();
            case 1336:
                return new _LiveMessageID_ProtoDecoder();
            case 1337:
                return new _LiveMessageSEI_ProtoDecoder();
            case 1338:
                return new _ProtoMessageFetchResult_ProtoDecoder();
            case 1339:
                return new _ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder();
            case 1340:
                return new _PingResult_ProtoDecoder();
            case 1341:
                return new _FieldAnnotation_ProtoDecoder();
            case 1342:
                return new _MethodAnnotation_ProtoDecoder();
            case 1343:
                return new _MsgAnnotation_ProtoDecoder();
            case 1344:
                return new _ServiceAnnotation_ProtoDecoder();
            case 1345:
                return new _EmoteListResult_ProtoDecoder();
            case 1346:
                return new _SubEmoteDetailResult_ProtoDecoder();
            case 1347:
                return new _AboutMe_ProtoDecoder();
            case 1348:
                return new _AboutMeInputBox_ProtoDecoder();
            case 1349:
                return new _AboutMeRequest_ProtoDecoder();
            case 1350:
                return new _AboutMeResponse_ProtoDecoder();
            case 1351:
                return new _AboutMeResponse_ResponseData_ProtoDecoder();
            case 1352:
                return new _AboutMeTemplate_ProtoDecoder();
            case 1353:
                return new _AboutMeUpdateRequest_ProtoDecoder();
            case 1354:
                return new _AboutMeUpdateResponse_ProtoDecoder();
            case 1355:
                return new _AboutMeUpdateResponse_ResponseData_ProtoDecoder();
            case 1356:
                return new _ActionRequest_ProtoDecoder();
            case 1357:
                return new _ActionResponse_ProtoDecoder();
            case 1358:
                return new _AdminHostListRequest_ProtoDecoder();
            case 1359:
                return new _AdminHostListResponse_ProtoDecoder();
            case 1360:
                return new _AdminHostListResponse_Data_ProtoDecoder();
            case 1361:
                return new _AnchorFragmentListResult_ProtoDecoder();
            case 1362:
                return new _AnchorLiveFragmentEditRequest_ProtoDecoder();
            case 1363:
                return new _AnchorLiveFragmentEditResponse_ProtoDecoder();
            case 1364:
                return new _AnchorLiveFragmentEditResponse_ResponseData_ProtoDecoder();
            case 1365:
                return new _AnchorLiveFragmentInfoRequest_ProtoDecoder();
            case 1366:
                return new _AnchorLiveFragmentInfoResponse_ProtoDecoder();
            case 1367:
                return new _AnchorLiveFragmentInfoResponse_ResponseData_ProtoDecoder();
            case 1368:
                return new _AnchorLiveFragmentListRequest_ProtoDecoder();
            case 1369:
                return new _AnchorLiveFragmentListResponse_ProtoDecoder();
            case 1370:
                return new _AnchorLiveFragmentListResponse_ResponseData_ProtoDecoder();
            case 1371:
                return new _AnchorLiveFragmentPostDetail_ProtoDecoder();
            case 1372:
                return new _AnchorLiveReplayFrameRequest_ProtoDecoder();
            case 1373:
                return new _AnchorLiveReplayFrameResponse_ProtoDecoder();
            case 1374:
                return new _AnchorLiveReplayFrameResponse_ResponseData_ProtoDecoder();
            case 1375:
                return new _BenefitsInfo_ProtoDecoder();
            case 1376:
                return new _CancelAutoDownloadExtra_ProtoDecoder();
            case 1377:
                return new _CancelAutoDownloadRequest_ProtoDecoder();
            case 1378:
                return new _CancelAutoDownloadResponse_ProtoDecoder();
            case 1379:
                return new _CreatorHubAnchorArticleDetail_ProtoDecoder();
            case 1380:
                return new _CreatorHubAnchorArticleReadReport_ProtoDecoder();
            case 1381:
                return new _CreatorHubAnchorReportRequest_ProtoDecoder();
            case 1382:
                return new _CreatorHubAnchorReportResponse_ProtoDecoder();
            case 1383:
                return new _CreatorHubAnchorReportResponse_ResponseData_ProtoDecoder();
            case 1384:
                return new _CreatorHubGetAnchorArticleDetailRequest_ProtoDecoder();
            case 1385:
                return new _CreatorHubGetAnchorArticleDetailResponse_ProtoDecoder();
            case 1386:
                return new _CreatorHubGetAnchorArticleDetailResponse_ResponseData_ProtoDecoder();
            case 1387:
                return new _DelHostRelationRequest_ProtoDecoder();
            case 1388:
                return new _DelHostRelationResponse_ProtoDecoder();
            case 1389:
                return new _FavouritesAddRequest_ProtoDecoder();
            case 1390:
                return new _FavouritesAddResponse_ProtoDecoder();
            case 1391:
                return new _FavouritesDeleteRequest_ProtoDecoder();
            case 1392:
                return new _FavouritesDeleteResponse_ProtoDecoder();
            case 1393:
                return new _FavouritesSongsRequest_ProtoDecoder();
            case 1394:
                return new _FavouritesSongsResponse_ProtoDecoder();
            case 1395:
                return new _FavouritesSongsResponse_ResponseData_ProtoDecoder();
            case 1396:
                return new _FrameInfo_ProtoDecoder();
            case 1397:
                return new _GetAnchorFriendListRequest_ProtoDecoder();
            case 1398:
                return new _GetAnchorFriendListResponse_ProtoDecoder();
            case 1399:
                return new _GetAnchorFriendListResponse_Data_ProtoDecoder();
            case 1400:
                return new _GetNewAnchorGuideFeedbackConfigRequest_ProtoDecoder();
            case 1401:
                return new _GetNewAnchorGuideFeedbackConfigResponse_ProtoDecoder();
            case 1402:
                return new _GetNewAnchorGuideFeedbackConfigResponse_Data_ProtoDecoder();
            case 1403:
                return new _GuideFeedbackReportRequest_ProtoDecoder();
            case 1404:
                return new _GuideFeedbackReportResponse_ProtoDecoder();
            case 1405:
                return new _GuideFeedbackReportResponse_Data_ProtoDecoder();
            case 1406:
                return new _HostInfo_ProtoDecoder();
            case 1407:
                return new _IntroConflictInfo_ProtoDecoder();
            case 1408:
                return new _KaraokeFavoriteUpdateRequest_ProtoDecoder();
            case 1409:
                return new _KaraokeFavoriteUpdateResponse_ProtoDecoder();
            case 1410:
                return new _KaraokeQueueListRequest_ProtoDecoder();
            case 1411:
                return new _KaraokeQueueListResponse_ProtoDecoder();
            case 1412:
                return new _KaraokeQueueListResponse_Data_ProtoDecoder();
            case 1413:
                return new _KaraokeQueueUpdateRequest_ProtoDecoder();
            case 1414:
                return new _KaraokeQueueUpdateResponse_ProtoDecoder();
            case 1415:
                return new _KaraokeQueueUpdateResponse_Data_ProtoDecoder();
            case 1416:
                return new _KaraokeReqListRequest_ProtoDecoder();
            case 1417:
                return new _KaraokeReqListResponse_ProtoDecoder();
            case 1418:
                return new _KaraokeReqListResponse_Data_ProtoDecoder();
            case 1419:
                return new _KaraokeReqUpdateRequest_ProtoDecoder();
            case 1420:
                return new _KaraokeReqUpdateResponse_ProtoDecoder();
            case 1421:
                return new _KaraokeSearchRequest_ProtoDecoder();
            case 1422:
                return new _KaraokeSearchResponse_ProtoDecoder();
            case 1423:
                return new _KaraokeSearchResponse_Data_ProtoDecoder();
            case 1424:
                return new _KaraokeTab_ProtoDecoder();
            case 1425:
                return new _KaraokeTabListRequest_ProtoDecoder();
            case 1426:
                return new _KaraokeTabListResponse_ProtoDecoder();
            case 1427:
                return new _KaraokeTabListResponse_Data_ProtoDecoder();
            case 1428:
                return new _KaraokeTabsListRequest_ProtoDecoder();
            case 1429:
                return new _KaraokeTabsListResponse_ProtoDecoder();
            case 1430:
                return new _KaraokeTabsListResponse_Data_ProtoDecoder();
            case 1431:
                return new _KaraokeUpdateStatusRequest_ProtoDecoder();
            case 1432:
                return new _KaraokeUpdateStatusResponse_ProtoDecoder();
            case 1433:
                return new _LiveFragmentDetail_ProtoDecoder();
            case 1434:
                return new tikcast.api.anchor._LiveFragmentShowInfo_ProtoDecoder();
            case 1435:
                return new _PinSoundEffectRequest_ProtoDecoder();
            case 1436:
                return new _PinSoundEffectResponse_ProtoDecoder();
            case 1437:
                return new _PlaylistAddReq_ProtoDecoder();
            case 1438:
                return new _PlaylistAddResponse_ProtoDecoder();
            case 1439:
                return new _PlaylistAddResponse_ResponseData_ProtoDecoder();
            case 1440:
                return new _PlaylistDeleteRequest_ProtoDecoder();
            case 1441:
                return new _PlaylistDeleteResponse_ProtoDecoder();
            case 1442:
                return new _PlaylistDeleteResponse_ResponseData_ProtoDecoder();
            case 1443:
                return new _PlaylistSongsRequest_ProtoDecoder();
            case 1444:
                return new _PlaylistSongsResponse_ProtoDecoder();
            case 1445:
                return new _PlaylistSongsResponse_ResponseData_ProtoDecoder();
            case 1446:
                return new _ScheduleAutoDownloadData_ProtoDecoder();
            case 1447:
                return new _ScheduleAutoDownloadExtra_ProtoDecoder();
            case 1448:
                return new _ScheduleAutoDownloadRequest_ProtoDecoder();
            case 1449:
                return new _ScheduleAutoDownloadResponse_ProtoDecoder();
            case 1450:
                return new _SearchUserRequest_ProtoDecoder();
            case 1451:
                return new _SearchUserResponse_ProtoDecoder();
            case 1452:
                return new _SearchUserResponse_Data_ProtoDecoder();
            case 1453:
                return new _UpdateDualCamStatusExtra_ProtoDecoder();
            case 1454:
                return new _UpdateDualCamStatusRequest_ProtoDecoder();
            case 1455:
                return new _UpdateDualCamStatusResponse_ProtoDecoder();
            case 1456:
                return new _GetRealtimeLiveCenterOverviewContainer_ProtoDecoder();
            case 1457:
                return new _GetRealtimeLiveCenterOverviewRequest_ProtoDecoder();
            case 1458:
                return new _GetRealtimeLiveCenterOverviewResponse_ProtoDecoder();
            case 1459:
                return new _OperateRealtimeLiveCenterRequest_ProtoDecoder();
            case 1460:
                return new _OperateRealtimeLiveCenterResponse_ProtoDecoder();
            case 1461:
                return new _RealtimeLiveCenterDetailData_ProtoDecoder();
            case 1462:
                return new _RealtimeLiveCenterLayoutData_ProtoDecoder();
            case 1463:
                return new _RealtimeLiveCenterLayoutTab_ProtoDecoder();
            case 1464:
                return new _Answer_ProtoDecoder();
            case 1465:
                return new _AppealDetail_ProtoDecoder();
            case 1466:
                return new _AppealDetailRequest_ProtoDecoder();
            case 1467:
                return new _AppealDetailResponse_ProtoDecoder();
            case 1468:
                return new _AppealRequest_ProtoDecoder();
            case 1469:
                return new _AppealResponse_ProtoDecoder();
            case 1470:
                return new _AppealResponse_ResponseData_ProtoDecoder();
            case 1471:
                return new _CaptchaCheckRequest_ProtoDecoder();
            case 1472:
                return new _CaptchaCheckResponse_ProtoDecoder();
            case 1473:
                return new _CaptchaCheckResponse_ResponseData_ProtoDecoder();
            case 1474:
                return new _CaptchaCheckResponse_ResponseExtra_ProtoDecoder();
            case 1475:
                return new _CheckAppealRequest_ProtoDecoder();
            case 1476:
                return new _CheckAppealResponse_ProtoDecoder();
            case 1477:
                return new _CheckAppealResponse_ResponseData_ProtoDecoder();
            case 1478:
                return new _CheckBubble_ProtoDecoder();
            case 1479:
                return new _CheckDetectPermissionRequest_ProtoDecoder();
            case 1480:
                return new _CheckDetectPermissionResponse_ProtoDecoder();
            case 1481:
                return new _CheckDetectPermissionResponse_ResponseData_ProtoDecoder();
            case 1482:
                return new _CheckDetectPermissionResponse_ResponseData_DetectorInfo_ProtoDecoder();
            case 1483:
                return new _EventDetail_ProtoDecoder();
            case 1484:
                return new _EventRequest_ProtoDecoder();
            case 1485:
                return new _EventResponse_ProtoDecoder();
            case 1486:
                return new _EventResponse_ResponseData_ProtoDecoder();
            case 1487:
                return new _EventResponse_ResponseExtra_ProtoDecoder();
            case 1488:
                return new _FeatureCheckRequest_ProtoDecoder();
            case 1489:
                return new _FeatureCheckResponse_ProtoDecoder();
            case 1490:
                return new _FeatureCheckResponse_ResponseData_ProtoDecoder();
            case 1491:
                return new _FeatureCheckResponse_ResponseExtra_ProtoDecoder();
            case 1492:
                return new _FeatureCheckResult_ProtoDecoder();
            case 1493:
                return new _GetQuestionnaireContentRequest_ProtoDecoder();
            case 1494:
                return new _GetQuestionnaireContentResponse_ProtoDecoder();
            case 1495:
                return new _GetQuestionnaireContentResponse_ResponseData_ProtoDecoder();
            case 1496:
                return new _GetQuestionnaireContentResponse_ResponseData_Question_ProtoDecoder();
            case 1497:
                return new _GetViolationListRequest_ProtoDecoder();
            case 1498:
                return new _GetViolationListResponse_ProtoDecoder();
            case 1499:
                return new _GetViolationListResponse_ResponseData_ProtoDecoder();
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                return new _GetViolationListResponse_ResponseExtra_ProtoDecoder();
            case 1501:
                return new _GuideDetail_ProtoDecoder();
            case 1502:
                return new _RankDetail_ProtoDecoder();
            case 1503:
                return new _ReportRequest_ProtoDecoder();
            case 1504:
                return new _ReportResponse_ProtoDecoder();
            case 1505:
                return new _ReportResponse_ResponseData_ProtoDecoder();
            case 1506:
                return new _RulesAndGuidanceBanner_ProtoDecoder();
            case 1507:
                return new _RulesAndGuidanceBannerArea_ProtoDecoder();
            case 1508:
                return new _RulesAndGuidanceConfig_ProtoDecoder();
            case 1509:
                return new _RulesAndGuidanceContentArea_ProtoDecoder();
            case 1510:
                return new _RulesAndGuidanceContentDetail_ProtoDecoder();
            case 1511:
                return new _RulesAndGuidanceContentSubArea_ProtoDecoder();
            case 1512:
                return new _RulesAndGuidanceFunction_ProtoDecoder();
            case 1513:
                return new _RulesAndGuidanceFunctionArea_ProtoDecoder();
            case 1514:
                return new _RulesAndGuidanceRequest_ProtoDecoder();
            case 1515:
                return new _RulesAndGuidanceResponse_ProtoDecoder();
            case 1516:
                return new _RulesAndGuidanceResponse_ResponseData_ProtoDecoder();
            case 1517:
                return new _RulesAndGuidanceResponse_ResponseExtra_ProtoDecoder();
            case 1518:
                return new _SubmitFeedbackRequest_ProtoDecoder();
            case 1519:
                return new _SubmitFeedbackResponse_ProtoDecoder();
            case 1520:
                return new _SubmitFeedbackResponse_ResponseData_ProtoDecoder();
            case 1521:
                return new _SubmitFeedbackResponse_ResponseExtra_ProtoDecoder();
            case 1522:
                return new _SubmitRequest_ProtoDecoder();
            case 1523:
                return new _SubmitResponse_ProtoDecoder();
            case 1524:
                return new _SubmitResponse_ResponseData_ProtoDecoder();
            case 1525:
                return new _ViolationFeedback_ProtoDecoder();
            case 1526:
                return new _ViolationFeedbackDetail_ProtoDecoder();
            case 1527:
                return new _ViolationRecord_ProtoDecoder();
            case 1528:
                return new _ViolationRecordLiveInfo_ProtoDecoder();
            case 1529:
                return new _ViolationRecordPunishInfo_ProtoDecoder();
            case 1530:
                return new _MultiViolationStatusReq_ProtoDecoder();
            case 1531:
                return new _MultiViolationStatusResponse_ProtoDecoder();
            case 1532:
                return new _MultiViolationStatusResponse_ResponseExtra_ProtoDecoder();
            case 1533:
                return new _MultiViolationStatusResponse_ViolationData_ProtoDecoder();
            case 1534:
                return new _ViolationStatusReq_ProtoDecoder();
            case 1535:
                return new _ViolationStatusResponse_ProtoDecoder();
            case 1536:
                return new _ViolationStatusResponse_ResponseData_ProtoDecoder();
            case 1537:
                return new _ViolationStatusResponse_ResponseExtra_ProtoDecoder();
            case 1538:
                return new _AdminParam_ProtoDecoder();
            case 1539:
                return new _Background_ProtoDecoder();
            case 1540:
                return new _FansConfigRequest_ProtoDecoder();
            case 1541:
                return new _FansConfigResponse_ProtoDecoder();
            case 1542:
                return new _FansConfigResponse_Data_ProtoDecoder();
            case 1543:
                return new _FansDiscordOauthCallbackRequest_ProtoDecoder();
            case 1544:
                return new _FansDiscordOauthCallbackResponse_ProtoDecoder();
            case 1545:
                return new _FansDiscordOauthCallbackResponse_Data_ProtoDecoder();
            case 1546:
                return new _FansGetAnchorPageRequest_ProtoDecoder();
            case 1547:
                return new _FansGetAnchorPageResponse_ProtoDecoder();
            case 1548:
                return new _FansGetAnchorPageResponse_Data_ProtoDecoder();
            case 1549:
                return new _FansGetTaskInfoRequest_ProtoDecoder();
            case 1550:
                return new _FansGetTaskInfoResponse_ProtoDecoder();
            case 1551:
                return new _FansGetTaskInfoResponse_Data_ProtoDecoder();
            case 1552:
                return new _FansGetUserDataRequest_ProtoDecoder();
            case 1553:
                return new _FansGetUserDataResponse_ProtoDecoder();
            case 1554:
                return new _FansGetUserDataResponse_Data_ProtoDecoder();
            case 1555:
                return new _FansList_ProtoDecoder();
            case 1556:
                return new _FansParam_ProtoDecoder();
            case 1557:
                return new _FansPrivilegeDetailRequest_ProtoDecoder();
            case 1558:
                return new _FansPrivilegeDetailResponse_ProtoDecoder();
            case 1559:
                return new _FansPrivilegeDetailResponse_Data_ProtoDecoder();
            case 1560:
                return new _FansRankListRequest_ProtoDecoder();
            case 1561:
                return new _FansRankListResponse_ProtoDecoder();
            case 1562:
                return new _FansRankListResponse_Rank_ProtoDecoder();
            case 1563:
                return new _FansRankListResponse_ResponseData_ProtoDecoder();
            case 1564:
                return new _FirstRechargeParam_ProtoDecoder();
            case 1565:
                return new _GetDiscordSettingsRequest_ProtoDecoder();
            case 1566:
                return new _GetDiscordSettingsResponse_ProtoDecoder();
            case 1567:
                return new _GetDiscordSettingsResponse_Data_ProtoDecoder();
            case 1568:
                return new _GetFansDataRequest_ProtoDecoder();
            case 1569:
                return new _GetFansDataResponse_ProtoDecoder();
            case 1570:
                return new _GetFansDataResponse_ResponseData_ProtoDecoder();
            case 1571:
                return new _GradeConfig_ProtoDecoder();
            case 1572:
                return new _GradeInfoRequest_ProtoDecoder();
            case 1573:
                return new _GradeInfoResponse_ProtoDecoder();
            case 1574:
                return new _GradeInfoResponse_Data_ProtoDecoder();
            case 1575:
                return new _GradePrivilegeDetail_ProtoDecoder();
            case 1576:
                return new _GradePrivilegesRequest_ProtoDecoder();
            case 1577:
                return new _GradePrivilegesResponse_ProtoDecoder();
            case 1578:
                return new _GradePrivilegesResponse_Data_ProtoDecoder();
            case 1579:
                return new _GradeScoreRule_ProtoDecoder();
            case 1580:
                return new _GradeShowConfig_ProtoDecoder();
            case 1581:
                return new _GradeTab_ProtoDecoder();
            case 1582:
                return new _GradeTabRule_ProtoDecoder();
            case 1583:
                return new _JoinedFansClubRequest_ProtoDecoder();
            case 1584:
                return new _JoinedFansClubResponse_ProtoDecoder();
            case 1585:
                return new _JoinedFansClubResponse_FansClub_ProtoDecoder();
            case 1586:
                return new _JoinedFansClubResponse_ResponseData_ProtoDecoder();
            case 1587:
                return new _PayGradeInfo_ProtoDecoder();
            case 1588:
                return new _PrivilegeFAQ_ProtoDecoder();
            case 1589:
                return new _QueryBadgeStyleRequest_ProtoDecoder();
            case 1590:
                return new _QueryBadgeStyleRequest_Data_ProtoDecoder();
            case 1591:
                return new _QueryBadgeStyleResponse_ProtoDecoder();
            case 1592:
                return new _QueryBadgeStyleResponse_Data_ProtoDecoder();
            case 1593:
                return new _QueryUserPrivilegesRequest_ProtoDecoder();
            case 1594:
                return new _QueryUserPrivilegesResponse_ProtoDecoder();
            case 1595:
                return new _QueryUserPrivilegesResponse_Data_ProtoDecoder();
            case 1596:
                return new _QueryUserPrivilegesResponse_PrivilegeTab_ProtoDecoder();
            case 1597:
                return new _QuitFansClubRequest_ProtoDecoder();
            case 1598:
                return new _QuitFansClubResponse_ProtoDecoder();
            case 1599:
                return new _QuitFansClubResponse_QuitResp_ProtoDecoder();
            case 1600:
                return new _RankListParam_ProtoDecoder();
            case 1601:
                return new _RichText_ProtoDecoder();
            case 1602:
                return new _SelectPrivilegeRequest_ProtoDecoder();
            case 1603:
                return new _SelectPrivilegeResponse_ProtoDecoder();
            case 1604:
                return new _StarCommentDeleteRequest_ProtoDecoder();
            case 1605:
                return new _StarCommentDeleteResponse_ProtoDecoder();
            case 1606:
                return new _StarCommentDeleteResponse_Data_ProtoDecoder();
            case 1607:
                return new _StarCommentGetQueueRequest_ProtoDecoder();
            case 1608:
                return new _StarCommentGetQueueResponse_ProtoDecoder();
            case 1609:
                return new _StarCommentGetQueueResponse_Data_ProtoDecoder();
            case 1610:
                return new _StarCommentHistory_ProtoDecoder();
            case 1611:
                return new _StarCommentItem_ProtoDecoder();
            case 1612:
                return new _StarCommentPurchaseHistoryRequest_ProtoDecoder();
            case 1613:
                return new _StarCommentPurchaseHistoryResponse_ProtoDecoder();
            case 1614:
                return new _StarCommentPurchaseHistoryResponse_Data_ProtoDecoder();
            case 1615:
                return new _StarCommentPurchasePageRequest_ProtoDecoder();
            case 1616:
                return new _StarCommentPurchasePageResponse_ProtoDecoder();
            case 1617:
                return new _StarCommentPurchasePageResponse_Data_ProtoDecoder();
            case 1618:
                return new _StarCommentPurchaseRequest_ProtoDecoder();
            case 1619:
                return new _StarCommentPurchaseResponse_ProtoDecoder();
            case 1620:
                return new _StarCommentPurchaseResponse_Data_ProtoDecoder();
            case 1621:
                return new _StarCommentPurchaseResponse_Extra_ProtoDecoder();
            case 1622:
                return new _StarCommentQueue_ProtoDecoder();
            case 1623:
                return new _SubscriberParam_ProtoDecoder();
            case 1624:
                return new _UpdateDiscordSettingsRequest_ProtoDecoder();
            case 1625:
                return new _UpdateDiscordSettingsResponse_ProtoDecoder();
            case 1626:
                return new _UpdateDiscordSwitchRequest_ProtoDecoder();
            case 1627:
                return new _UpdateDiscordSwitchResponse_ProtoDecoder();
            case 1628:
                return new _UpdateDiscordSwitchResponse_SwitchResp_ProtoDecoder();
            case 1629:
                return new _UpgradeBarrageEffectConfig_ProtoDecoder();
            case 1630:
                return new _UpgradeEffectConfig_ProtoDecoder();
            case 1631:
                return new _UpgradeInfo_ProtoDecoder();
            case 1632:
                return new _UpgradePrivilege_ProtoDecoder();
            case 1633:
                return new _UserGrade_ProtoDecoder();
            case 1634:
                return new _UserGradeParam_ProtoDecoder();
            case 1635:
                return new _UserPrivilege_ProtoDecoder();
            case 1636:
                return new _BehaviorData_ProtoDecoder();
            case 1637:
                return new _BehaviorTrackParams_ProtoDecoder();
            case 1638:
                return new _BehaviorTrackResult_ProtoDecoder();
            case 1639:
                return new _BehaviorTrackResult_Response_ProtoDecoder();
            case 1640:
                return new _CouponDetailData_ProtoDecoder();
            case 1641:
                return new _DiamondBuyRequestParams_ProtoDecoder();
            case 1642:
                return new _DiamondBuyResult_ProtoDecoder();
            case 1643:
                return new _DiamondBuyResult_ABSPIPOInfo_ProtoDecoder();
            case 1644:
                return new _DiamondBuyResult_APPartnerAPIInAppRequest_ProtoDecoder();
            case 1645:
                return new _DiamondBuyResult_DiamondBuyData_ProtoDecoder();
            case 1646:
                return new _DiamondBuyResult_DiamondBuyExtra_ProtoDecoder();
            case 1647:
                return new _DiamondBuyResult_IapFailExtraData_ProtoDecoder();
            case 1648:
                return new _Exchange_ProtoDecoder();
            case 1649:
                return new _ExchangeInfoRequestParams_ProtoDecoder();
            case 1650:
                return new _ExchangeInfoResponse_ProtoDecoder();
            case 1651:
                return new _ExchangeInfoResponse_ExchangeInfoData_ProtoDecoder();
            case 1652:
                return new _GetABSStatusRequestParams_ProtoDecoder();
            case 1653:
                return new _GetABSStatusResponse_ProtoDecoder();
            case 1654:
                return new _GetABSStatusResponse_ABSData_ProtoDecoder();
            case 1655:
                return new _GetExchangeKYCRequestParams_ProtoDecoder();
            case 1656:
                return new _GetExchangeKYCResult_ProtoDecoder();
            case 1657:
                return new _GetTotalBalanceRequest_ProtoDecoder();
            case 1658:
                return new _GetTotalBalanceResponse_ProtoDecoder();
            case 1659:
                return new _GetTotalBalanceResponse_BalanceInfo_ProtoDecoder();
            case 1660:
                return new _GetTotalBalanceResponse_GetTotalBalanceData_ProtoDecoder();
            case 1661:
                return new _InfoRequestParams_ProtoDecoder();
            case 1662:
                return new _InfoResult_ProtoDecoder();
            case 1663:
                return new _InfoResult_InfoData_ProtoDecoder();
            case 1664:
                return new _InfoResult_InfoExtra_ProtoDecoder();
            case 1665:
                return new _PIPODetails_ProtoDecoder();
            case 1666:
                return new _PIPODetails_APPartnerAPIInAppRequest_ProtoDecoder();
            case 1667:
                return new _PayoutOnboardingDetailParams_ProtoDecoder();
            case 1668:
                return new _PayoutOnboardingDetailResult_ProtoDecoder();
            case 1669:
                return new _PayoutOnboardingDetailResult_Data_ProtoDecoder();
            case 1670:
                return new _QueryOrderRequestParams_ProtoDecoder();
            case 1671:
                return new _QueryOrderResult_ProtoDecoder();
            case 1672:
                return new _QueryOrderResult_ChargeOrderData_ProtoDecoder();
            case 1673:
                return new _QueryOrderResult_ChargeOrderExtra_ProtoDecoder();
            case 1674:
                return new _QueryOrderResult_CouponDetailData_ProtoDecoder();
            case 1675:
                return new _QueryOrderResult_KYCIncentive_ProtoDecoder();
            case 1676:
                return new _UnlockVoucherParams_ProtoDecoder();
            case 1677:
                return new _UnlockVoucherResult_ProtoDecoder();
            case 1678:
                return new _UnlockVoucherResult_Response_ProtoDecoder();
            case 1679:
                return new _UpdateABSStatusRequestParams_ProtoDecoder();
            case 1680:
                return new _UpdateABSStatusResponse_ProtoDecoder();
            case 1681:
                return new _UpdateABSStatusResponse_ABSData_ProtoDecoder();
            case 1682:
                return new _BackGroundImageState_ProtoDecoder();
            case 1683:
                return new _CohostUserInfo_ProtoDecoder();
            case 1684:
                return new _GroupChannelAllUser_ProtoDecoder();
            case 1685:
                return new _GroupChannelUser_ProtoDecoder();
            case 1686:
                return new _GroupPlayer_ProtoDecoder();
            case 1687:
                return new _LayoutState_ProtoDecoder();
            case 1688:
                return new _LinkMicAdContent_ProtoDecoder();
            case 1689:
                return new _LinkUserState_ProtoDecoder();
            case 1690:
                return new _PositionConfig_ProtoDecoder();
            case 1691:
                return new _StateReqCommon_ProtoDecoder();
            case 1692:
                return new _ABInfos_ProtoDecoder();
            case 1693:
                return new _AckStateReq_ProtoDecoder();
            case 1694:
                return new _AckStateResp_ProtoDecoder();
            case 1695:
                return new _AnchorMessage_ProtoDecoder();
            case 1696:
                return new _CancelJoinGroupReq_ProtoDecoder();
            case 1697:
                return new _CancelJoinGroupResp_ProtoDecoder();
            case 1698:
                return new _ChangeLayoutReq_ProtoDecoder();
            case 1699:
                return new _ChangeStateReq_ProtoDecoder();
            case 1700:
                return new _ChangeStateResp_ProtoDecoder();
            case 1701:
                return new _CreateChannelReq_ProtoDecoder();
            case 1702:
                return new _GetStateReq_ProtoDecoder();
            case 1703:
                return new _GetStateResp_ProtoDecoder();
            case 1704:
                return new _InitConfig_ProtoDecoder();
            case 1705:
                return new _JoinGroupReq_ProtoDecoder();
            case 1706:
                return new _JoinGroupResp_ProtoDecoder();
            case 1707:
                return new _KickOutAllGuestsParam_ProtoDecoder();
            case 1708:
                return new _KickOutAllGuestsResp_ProtoDecoder();
            case 1709:
                return new _LeaveJoinGroupReq_ProtoDecoder();
            case 1710:
                return new _LeaveJoinGroupResp_ProtoDecoder();
            case 1711:
                return new _LinkedUserInfo_ProtoDecoder();
            case 1712:
                return new _MGetABInfosReq_ProtoDecoder();
            case 1713:
                return new _MGetABInfosResp_ProtoDecoder();
            case 1714:
                return new _PermitJoinGroupReq_ProtoDecoder();
            case 1715:
                return new _PermitJoinGroupResp_ProtoDecoder();
            case 1716:
                return new _RechargeReq_ProtoDecoder();
            case 1717:
                return new _RechargeResp_ProtoDecoder();
            case 1718:
                return new _ResumeReq_ProtoDecoder();
            case 1719:
                return new _ResumeResp_ProtoDecoder();
            case 1720:
                return new _QueryUserIdentityParams_ProtoDecoder();
            case 1721:
                return new _QueryUserIdentityResponse_ProtoDecoder();
            case 1722:
                return new _BagItemConsumeRequestParams_ProtoDecoder();
            case 1723:
                return new _BagItemConsumeResponse_ProtoDecoder();
            case 1724:
                return new _BagItemConsumeResponse_Data_ProtoDecoder();
            case 1725:
                return new _BagItemConsumeResponse_Extra_ProtoDecoder();
            case 1726:
                return new _BagItemListRequestParams_ProtoDecoder();
            case 1727:
                return new _BagItemListResponse_ProtoDecoder();
            case 1728:
                return new _BagItemListResponse_Data_ProtoDecoder();
            case 1729:
                return new _BagItemListResponse_Extra_ProtoDecoder();
            case 1730:
                return new _BagItemObtainRequestParams_ProtoDecoder();
            case 1731:
                return new _BagItemObtainResponse_ProtoDecoder();
            case 1732:
                return new _BagItemObtainResponse_Data_ProtoDecoder();
            case 1733:
                return new _BagItemObtainResponse_Extra_ProtoDecoder();
            case 1734:
                return new _BattleAcceptRequest_ProtoDecoder();
            case 1735:
                return new _BattleAcceptResponse_ProtoDecoder();
            case 1736:
                return new _BattleAcceptResponse_ResponseData_ProtoDecoder();
            case 1737:
                return new _BattleAwardItemCardRequest_ProtoDecoder();
            case 1738:
                return new _BattleAwardItemCardResponse_ProtoDecoder();
            case 1739:
                return new _BattleAwardItemCardResponse_ResponseData_ProtoDecoder();
            case 1740:
                return new _PreScheduleStream_ProtoDecoder();
            case 1741:
                return new _PreScheduleStreamExtra_ProtoDecoder();
            case 1742:
                return new _PreScheduleStreamRequest_ProtoDecoder();
            case 1743:
                return new _PreScheduleStreamResponse_ProtoDecoder();
            case 1744:
                return new _PushStreamInfo_ProtoDecoder();
            case 1745:
                return new _PushStreamInfoExtra_ProtoDecoder();
            case 1746:
                return new _PushStreamInfoRequest_ProtoDecoder();
            case 1747:
                return new _PushStreamInfoResponse_ProtoDecoder();
            case 1748:
                return new _StreamResolution_ProtoDecoder();
            case 1749:
                return new _EnvelopeTemplateRequest_ProtoDecoder();
            case 1750:
                return new _EnvelopeTemplateResponse_ProtoDecoder();
            case 1751:
                return new _EnvelopeTemplateResponse_AnchorOnBoardPermit_ProtoDecoder();
            case 1752:
                return new _EnvelopeTemplateResponse_CustomRule_ProtoDecoder();
            case 1753:
                return new _EnvelopeTemplateResponse_EnvelopeTemplate_ProtoDecoder();
            case 1754:
                return new _EnvelopeTemplateResponse_PortalCustomRule_ProtoDecoder();
            case 1755:
                return new _EnvelopeTemplateResponse_PortalTemplate_ProtoDecoder();
            case 1756:
                return new _EnvelopeTemplateResponse_ResponseData_ProtoDecoder();
            case 1757:
                return new _PortalListRequest_ProtoDecoder();
            case 1758:
                return new _PortalListResponse_ProtoDecoder();
            case 1759:
                return new _PortalListResponse_PortalInfo_ProtoDecoder();
            case 1760:
                return new _PortalListResponse_ResponseData_ProtoDecoder();
            case 1761:
                return new _RevenuePermissionRequest_ProtoDecoder();
            case 1762:
                return new _RevenuePermissionResponse_ProtoDecoder();
            case 1763:
                return new _RevenuePermissionResponse_ResponseData_ProtoDecoder();
            case 1764:
                return new _AwemeCommerceStructV2_ProtoDecoder();
            case 1765:
                return new _AwemeStructV2_ProtoDecoder();
            case 1766:
                return new _BlockRecommendUserExtra_ProtoDecoder();
            case 1767:
                return new _BlockRecommendUserRequestParams_ProtoDecoder();
            case 1768:
                return new _BlockRecommendUserResponse_ProtoDecoder();
            case 1769:
                return new _ExtraStructV2_ProtoDecoder();
            case 1770:
                return new _FeedV2RequestParams_ProtoDecoder();
            case 1771:
                return new _FeedV2Response_ProtoDecoder();
            case 1772:
                return new _FollowRecommendItem_ProtoDecoder();
            case 1773:
                return new _FollowRecommendListExtra_ProtoDecoder();
            case 1774:
                return new _FollowRecommendListRequestParams_ProtoDecoder();
            case 1775:
                return new _FollowRecommendListResponse_ProtoDecoder();
            case 1776:
                return new _LogPbStructV2_ProtoDecoder();
            case 1777:
                return new _PseudoAdData_ProtoDecoder();
            case 1778:
                return new _WebcastRoomFeedCellStructV2_ProtoDecoder();
            case 1779:
                return new _CampaignOperateParams_ProtoDecoder();
            case 1780:
                return new _CampaignOperateResp_ProtoDecoder();
            case 1781:
                return new _CampaignOperateResp_Data_ProtoDecoder();
            case 1782:
                return new _GetFirstRechargeInfoV2Params_ProtoDecoder();
            case 1783:
                return new _GetFirstRechargeInfoV2Resp_ProtoDecoder();
            case 1784:
                return new _GetFirstRechargeInfoV2Resp_Data_ProtoDecoder();
            case 1785:
                return new _GetFirstRechargeInfoV2Resp_FirstChargeGuideEffectRule_ProtoDecoder();
            case 1786:
                return new _GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV1_ProtoDecoder();
            case 1787:
                return new _GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV2_ProtoDecoder();
            case 1788:
                return new _AnchorRank_ProtoDecoder();
            case 1789:
                return new _AnchorSearchRequest_ProtoDecoder();
            case 1790:
                return new _AnchorSearchResponse_ProtoDecoder();
            case 1791:
                return new _AnchorSearchResponse_ResponseData_ProtoDecoder();
            case 1792:
                return new _AnchorTagListResult_ProtoDecoder();
            case 1793:
                return new _Audience_ProtoDecoder();
            case 1794:
                return new _AudienceInfo_ProtoDecoder();
            case 1795:
                return new _BrowserInfo_ProtoDecoder();
            case 1796:
                return new _ChangeNotifyRequest_ProtoDecoder();
            case 1797:
                return new _ChangeNotifyResponse_ProtoDecoder();
            case 1798:
                return new _ChangeNotifyResponse_ResponseData_ProtoDecoder();
            case 1799:
                return new _CreateInfoRequest_ProtoDecoder();
            case 1800:
                return new _CreateInfoResponse_ProtoDecoder();
            case 1801:
                return new _CreateInfoResponse_ResponseData_ProtoDecoder();
            case 1802:
                return new _DualDeviceUpdateRequest_ProtoDecoder();
            case 1803:
                return new _DualDeviceUpdateResponse_ProtoDecoder();
            case 1804:
                return new _DualDeviceUpdateResponse_ResponseData_ProtoDecoder();
            case 1805:
                return new webcast.api.game._FeedExtra_ProtoDecoder();
            case 1806:
                return new webcast.api.game._FeedExtra_LogPb_ProtoDecoder();
            case 1807:
                return new _GameAnchorCategory_ProtoDecoder();
            case 1808:
                return new _GameCategory_ProtoDecoder();
            case 1809:
                return new _GameSubActANewAudienceListRequest_ProtoDecoder();
            case 1810:
                return new _GameSubActAnchorRankRequest_ProtoDecoder();
            case 1811:
                return new _GameSubActAnchorRankResponse_ProtoDecoder();
            case 1812:
                return new _GameSubActAnchorRankResponse_ResponseData_ProtoDecoder();
            case 1813:
                return new _GameSubActApplyRequest_ProtoDecoder();
            case 1814:
                return new _GameSubActApplyResponse_ProtoDecoder();
            case 1815:
                return new _GameSubActApplyResponse_ResponseData_ProtoDecoder();
            case 1816:
                return new _GameSubActGetAnchorClaimNumRequest_ProtoDecoder();
            case 1817:
                return new _GameSubActGetAnchorClaimNumResponse_ProtoDecoder();
            case 1818:
                return new _GameSubActGetAnchorClaimNumResponse_ResponseData_ProtoDecoder();
            case 1819:
                return new _GameSubActGetRandUnfinishedAnchorRequest_ProtoDecoder();
            case 1820:
                return new _GameSubActGetRandUnfinishedAnchorResponse_ProtoDecoder();
            case 1821:
                return new _GameSubActGetRandUnfinishedAnchorResponse_ResponseData_ProtoDecoder();
            case 1822:
                return new _GameSubActNewAudienceListResponse_ProtoDecoder();
            case 1823:
                return new _GameSubActNewAudienceListResponse_ResponseData_ProtoDecoder();
            case 1824:
                return new _GameTagSearchResult_ProtoDecoder();
            case 1825:
                return new _GetEmailCntRequest_ProtoDecoder();
            case 1826:
                return new _GetEmailCntResponse_ProtoDecoder();
            case 1827:
                return new _GetEmailCntResponse_ResponseData_ProtoDecoder();
            case 1828:
                return new _GetGameVideoListRequest_ProtoDecoder();
            case 1829:
                return new _GetGameVideoListResponse_ProtoDecoder();
            case 1830:
                return new _GetGameVideoListResponse_ResponseData_ProtoDecoder();
            case 1831:
                return new _ListSugPollRequest_ProtoDecoder();
            case 1832:
                return new _ListSugPollResponse_ProtoDecoder();
            case 1833:
                return new _ListSugPollResponse_ResponseData_ProtoDecoder();
            case 1834:
                return new _LiveFragmentClipEditRequest_ProtoDecoder();
            case 1835:
                return new _LiveFragmentClipEditResponse_ProtoDecoder();
            case 1836:
                return new _LiveFragmentClipEditResponse_ResponseData_ProtoDecoder();
            case 1837:
                return new _LiveFragmentMontageRequest_ProtoDecoder();
            case 1838:
                return new _LiveFragmentMontageResponse_ProtoDecoder();
            case 1839:
                return new _LiveFragmentMontageResponse_ResponseData_ProtoDecoder();
            case 1840:
                return new _OpenLsNotifyInfo_ProtoDecoder();
            case 1841:
                return new _RegionCheckRequest_ProtoDecoder();
            case 1842:
                return new _RegionCheckResponse_ProtoDecoder();
            case 1843:
                return new _RegionCheckResponse_ResponseData_ProtoDecoder();
            case 1844:
                return new _Reward_ProtoDecoder();
            case 1845:
                return new _SearchTagRequest_ProtoDecoder();
            case 1846:
                return new _SearchTagResponse_ProtoDecoder();
            case 1847:
                return new _SearchTagResponse_ResponseData_ProtoDecoder();
            case 1848:
                return new _SingleBrowserInfo_ProtoDecoder();
            case 1849:
                return new _SubActAnchorActInfoRequest_ProtoDecoder();
            case 1850:
                return new _SubActAnchorActInfoResponse_ProtoDecoder();
            case 1851:
                return new _SubActAnchorActInfoResponse_ResponseData_ProtoDecoder();
            case 1852:
                return new _SubActClaimRequest_ProtoDecoder();
            case 1853:
                return new _SubActClaimResponse_ProtoDecoder();
            case 1854:
                return new _SubActClaimResponse_ResponseData_ProtoDecoder();
            case 1855:
                return new _SubActGetMlbbBindInfoRequest_ProtoDecoder();
            case 1856:
                return new _SubActGetMlbbBindInfoResponse_ProtoDecoder();
            case 1857:
                return new _SubActGetMlbbBindInfoResponse_ResponseData_ProtoDecoder();
            case 1858:
                return new _SubActGetRewardRequest_ProtoDecoder();
            case 1859:
                return new _SubActGetRewardResponse_ProtoDecoder();
            case 1860:
                return new _SubActGetRewardResponse_ResponseData_ProtoDecoder();
            case 1861:
                return new _SubActQuotaLockRequest_ProtoDecoder();
            case 1862:
                return new _SubActQuotaLockResponse_ProtoDecoder();
            case 1863:
                return new _SubActQuotaLockResponse_ResponseData_ProtoDecoder();
            case 1864:
                return new _SubActRewardAudienceInfoRequest_ProtoDecoder();
            case 1865:
                return new _SubActRewardAudienceInfoResponse_ProtoDecoder();
            case 1866:
                return new _SubActRewardAudienceInfoResponse_ResponseData_ProtoDecoder();
            case 1867:
                return new _TnsPiracyDetail_ProtoDecoder();
            case 1868:
                return new _TnsPiracyInfoRequest_ProtoDecoder();
            case 1869:
                return new _TnsPiracyInfoResponse_ProtoDecoder();
            case 1870:
                return new _TnsPiracyInfoResponse_ResponseData_ProtoDecoder();
            case 1871:
                return new _VcloudVideoEditParamVideoExtra_ProtoDecoder();
            case 1872:
                return new _VcloudVideoEditParamVideoTrack_ProtoDecoder();
            case 1873:
                return new _VideoCopyRequest_ProtoDecoder();
            case 1874:
                return new _VideoCopyResponse_ProtoDecoder();
            case 1875:
                return new _VideoCopyResponse_ResponseData_ProtoDecoder();
            case 1876:
                return new _VideoCutsInfo_ProtoDecoder();
            case 1877:
                return new _VideoCutsInfoCropParam_ProtoDecoder();
            case 1878:
                return new _VideoTrack_ProtoDecoder();
            case 1879:
                return new _DownloadRequest_ProtoDecoder();
            case 1880:
                return new _DownloadResponse_ProtoDecoder();
            case 1881:
                return new _DownloadResponse_ResponseData_ProtoDecoder();
            case 1882:
                return new _GameDetailBaseRequest_ProtoDecoder();
            case 1883:
                return new _GameDetailBaseResponse_ProtoDecoder();
            case 1884:
                return new _GameDetailBaseResponse_ResponseData_ProtoDecoder();
            case 1885:
                return new _GameDetailExtraRequest_ProtoDecoder();
            case 1886:
                return new _GameDetailExtraResponse_ProtoDecoder();
            case 1887:
                return new _GameDetailExtraResponse_ResponseData_ProtoDecoder();
            case 1888:
                return new _GameDetailPreviewRequest_ProtoDecoder();
            case 1889:
                return new _GameDetailPreviewResponse_ProtoDecoder();
            case 1890:
                return new _GameDetailPreviewResponse_ResponseData_ProtoDecoder();
            case 1891:
                return new _GetGoodyBagDetailRequest_ProtoDecoder();
            case 1892:
                return new _GetGoodyBagDetailResponse_ProtoDecoder();
            case 1893:
                return new _GetGoodyBagDetailResponse_ResponseData_ProtoDecoder();
            case 1894:
                return new _GetGoodyBagHistoryRequest_ProtoDecoder();
            case 1895:
                return new _GetGoodyBagHistoryResponse_ProtoDecoder();
            case 1896:
                return new _GetGoodyBagHistoryResponse_CoinHistoryItem_ProtoDecoder();
            case 1897:
                return new _GetGoodyBagHistoryResponse_HistoryItem_ProtoDecoder();
            case 1898:
                return new _GetGoodyBagHistoryResponse_ResponseData_ProtoDecoder();
            case 1899:
                return new _GetGoodyBagLotteryRequest_ProtoDecoder();
            case 1900:
                return new _GetGoodyBagLotteryResponse_ProtoDecoder();
            case 1901:
                return new _GetGoodyBagLotteryResponse_ResponseData_ProtoDecoder();
            case 1902:
                return new _GetGoodyBagTemplateRequest_ProtoDecoder();
            case 1903:
                return new _GetGoodyBagTemplateResponse_ProtoDecoder();
            case 1904:
                return new _GetGoodyBagTemplateResponse_CoinTemplate_ProtoDecoder();
            case 1905:
                return new _GetGoodyBagTemplateResponse_CommonTemplate_ProtoDecoder();
            case 1906:
                return new _GetGoodyBagTemplateResponse_PreCheckResult_ProtoDecoder();
            case 1907:
                return new _GetGoodyBagTemplateResponse_ResponseData_ProtoDecoder();
            case 1908:
                return new _GetGoodyBagWinnerListRequest_ProtoDecoder();
            case 1909:
                return new _GetGoodyBagWinnerListResponse_ProtoDecoder();
            case 1910:
                return new _GetGoodyBagWinnerListResponse_ResponseData_ProtoDecoder();
            case 1911:
                return new _GetRoomGoodyBagRequest_ProtoDecoder();
            case 1912:
                return new _GetRoomGoodyBagResponse_ProtoDecoder();
            case 1913:
                return new _GetRoomGoodyBagResponse_ResponseData_ProtoDecoder();
            case 1914:
                return new _GoodyBagSignupRequest_ProtoDecoder();
            case 1915:
                return new _GoodyBagSignupResponse_ProtoDecoder();
            case 1916:
                return new _GoodyBagSignupResponse_ResponseData_ProtoDecoder();
            case 1917:
                return new _SendGoodyBagRequest_ProtoDecoder();
            case 1918:
                return new _SendGoodyBagRequest_CoinGoodyBagParam_ProtoDecoder();
            case 1919:
                return new _SendGoodyBagResponse_ProtoDecoder();
            case 1920:
                return new _SendGoodyBagResponse_ResponseData_ProtoDecoder();
            case 1921:
                return new _TextReviewRequest_ProtoDecoder();
            case 1922:
                return new _TextReviewResponse_ProtoDecoder();
            case 1923:
                return new _TextReviewResponse_ResponseData_ProtoDecoder();
            case 1924:
                return new _PinRequest_ProtoDecoder();
            case 1925:
                return new webcast.api.interaction._PinResponse_ProtoDecoder();
            case 1926:
                return new _PinResponse_ResponseData_ProtoDecoder();
            case 1927:
                return new _QueryPollRequest_ProtoDecoder();
            case 1928:
                return new _QueryPollResponse_ProtoDecoder();
            case 1929:
                return new _QueryPollResponse_Data_ProtoDecoder();
            case 1930:
                return new _QueryVoteUserRequest_ProtoDecoder();
            case 1931:
                return new _QueryVoteUserResponse_ProtoDecoder();
            case 1932:
                return new _QueryVoteUserResponse_Data_ProtoDecoder();
            case 1933:
                return new _ChangeWordRequest_ProtoDecoder();
            case 1934:
                return new _ChangeWordResponse_ProtoDecoder();
            case 1935:
                return new _PictionaryRankRequest_ProtoDecoder();
            case 1936:
                return new _PictionaryRankResponse_ProtoDecoder();
            case 1937:
                return new _PictionaryRankResponse_ResponseData_ProtoDecoder();
            case 1938:
                return new _RankEntry_ProtoDecoder();
            case 1939:
                return new _ReviewWordRequest_ProtoDecoder();
            case 1940:
                return new _ReviewWordResponse_ProtoDecoder();
            case 1941:
                return new _ReviewWordResponse_ResponseData_ProtoDecoder();
            case 1942:
                return new _ReviewWordResponse_ReviewWordExtra_ProtoDecoder();
            case 1943:
                return new webcast.api.linkmic._ApplyParams_ProtoDecoder();
            case 1944:
                return new webcast.api.linkmic._ApplyResponse_ProtoDecoder();
            case 1945:
                return new _ApplyResponse_ApplyExtra_ProtoDecoder();
            case 1946:
                return new _ApplyResponse_ApplyExtra_LogPb_ProtoDecoder();
            case 1947:
                return new _ApplyResponse_ResponseData_ProtoDecoder();
            case 1948:
                return new _GetUserLinkmicStatusResponse_ProtoDecoder();
            case 1949:
                return new _GetUserLinkmicStatusResponse_ResponseData_ProtoDecoder();
            case 1950:
                return new webcast.api.linkmic._KickOutResponse_ProtoDecoder();
            case 1951:
                return new _KickOutResponse_ResponseData_ProtoDecoder();
            case 1952:
                return new _LeaveParams_ProtoDecoder();
            case 1953:
                return new _LeaveResponse_ProtoDecoder();
            case 1954:
                return new _LeaveResponse_ResponseData_ProtoDecoder();
            case 1955:
                return new _AnchorCheckAndJoinEventRequest_ProtoDecoder();
            case 1956:
                return new _AnchorCheckAndJoinEventResponse_ProtoDecoder();
            case 1957:
                return new _AnchorCheckAndJoinEventResponse_ResponseData_ProtoDecoder();
            case 1958:
                return new _AnchorEventJoinRequest_ProtoDecoder();
            case 1959:
                return new _AnchorEventJoinResponse_ProtoDecoder();
            case 1960:
                return new _AnchorEventJoinResponse_ResponseData_ProtoDecoder();
            case 1961:
                return new _AnchorEventsRequest_ProtoDecoder();
            case 1962:
                return new _AnchorEventsResponse_ProtoDecoder();
            case 1963:
                return new _AnchorEventsResponse_ResponseData_ProtoDecoder();
            case 1964:
                return new _AnchorInfoRequest_ProtoDecoder();
            case 1965:
                return new _AnchorInfoResponse_ProtoDecoder();
            case 1966:
                return new _AnchorInfoResponse_DropsEntrance_ProtoDecoder();
            case 1967:
                return new _AnchorInfoResponse_LabelFilterInfo_ProtoDecoder();
            case 1968:
                return new _AnchorInfoResponse_PartnershipInfo_ProtoDecoder();
            case 1969:
                return new _AnchorInfoResponse_PunishInfo_ProtoDecoder();
            case 1970:
                return new _AnchorInfoResponse_ResponseData_ProtoDecoder();
            case 1971:
                return new _AnchorInfoResponse_TaskPriceUpdate_ProtoDecoder();
            case 1972:
                return new _AnchorInfoResponse_ToggleInfo_ProtoDecoder();
            case 1973:
                return new _AnchorRoomInfoRequest_ProtoDecoder();
            case 1974:
                return new _AnchorRoomInfoResponse_ProtoDecoder();
            case 1975:
                return new _AnchorRoomInfoResponse_DropsInfo_ProtoDecoder();
            case 1976:
                return new _AnchorRoomInfoResponse_PartnershipInfo_ProtoDecoder();
            case 1977:
                return new _AnchorRoomInfoResponse_ResponseData_ProtoDecoder();
            case 1978:
                return new _AnchorToggleInfoRequest_ProtoDecoder();
            case 1979:
                return new _AnchorToggleInfoResponse_ProtoDecoder();
            case 1980:
                return new _AnchorToggleInfoResponse_ResponseData_ProtoDecoder();
            case 1981:
                return new _AudienceRoomInfoRequest_ProtoDecoder();
            case 1982:
                return new _AudienceRoomInfoResponse_ProtoDecoder();
            case 1983:
                return new _AudienceRoomInfoResponse_DropsInfo_ProtoDecoder();
            case 1984:
                return new _AudienceRoomInfoResponse_EsportsBriefMatchInfo_ProtoDecoder();
            case 1985:
                return new _AudienceRoomInfoResponse_EsportsBriefTournamentInfo_ProtoDecoder();
            case 1986:
                return new _AudienceRoomInfoResponse_PartnershipInfo_ProtoDecoder();
            case 1987:
                return new _AudienceRoomInfoResponse_ResponseData_ProtoDecoder();
            case 1988:
                return new _BenefitClaimRequest_ProtoDecoder();
            case 1989:
                return new _BenefitClaimResponse_ProtoDecoder();
            case 1990:
                return new _BenefitClaimResponse_ResponseData_ProtoDecoder();
            case 1991:
                return new _BenefitDetailRequest_ProtoDecoder();
            case 1992:
                return new _BenefitDetailResponse_ProtoDecoder();
            case 1993:
                return new _BenefitDetailResponse_ResponseData_ProtoDecoder();
            case 1994:
                return new _BenefitRecordsRequest_ProtoDecoder();
            case 1995:
                return new _BenefitRecordsResponse_ProtoDecoder();
            case 1996:
                return new _BenefitRecordsResponse_ResponseData_ProtoDecoder();
            case 1997:
                return new _CancelReserveMatchScheduleRequest_ProtoDecoder();
            case 1998:
                return new _CancelReserveMatchScheduleResponse_ProtoDecoder();
            case 1999:
                return new _CancelReserveMatchScheduleResponse_ResponseData_ProtoDecoder();
            case LiveNetAdaptiveHurryTimeSetting.DEFAULT /* 2000 */:
                return new _ChangeBusinessStatusRequest_ProtoDecoder();
            case 2001:
                return new _ChangeBusinessStatusResponse_ProtoDecoder();
            case 2002:
                return new _CommentCheckRequest_ProtoDecoder();
            case 2003:
                return new _CommentCheckResponse_ProtoDecoder();
            case 2004:
                return new _DisplayingTasksRequest_ProtoDecoder();
            case 2005:
                return new _DisplayingTasksResponse_ProtoDecoder();
            case 2006:
                return new _DisplayingTasksResponse_ResponseData_ProtoDecoder();
            case 2007:
                return new _DropsClaimRequest_ProtoDecoder();
            case 2008:
                return new _DropsClaimResponse_ProtoDecoder();
            case 2009:
                return new _DropsClaimResponse_ResponseData_ProtoDecoder();
            case 2010:
                return new _DropsDetailRequest_ProtoDecoder();
            case 2011:
                return new _DropsDetailResponse_ProtoDecoder();
            case 2012:
                return new _DropsDetailResponse_ResponseData_ProtoDecoder();
            case 2013:
                return new _DropsListRequest_ProtoDecoder();
            case 2014:
                return new _DropsListResponse_ProtoDecoder();
            case 2015:
                return new _DropsListResponse_ResponseData_ProtoDecoder();
            case 2016:
                return new _DropsRankListRequest_ProtoDecoder();
            case 2017:
                return new _DropsRankListResponse_ProtoDecoder();
            case 2018:
                return new _DropsRankListResponse_ResponseData_ProtoDecoder();
            case 2019:
                return new _DropsReportRequest_ProtoDecoder();
            case 2020:
                return new _DropsReportResponse_ProtoDecoder();
            case 2021:
                return new _DropsRewardsRequest_ProtoDecoder();
            case 2022:
                return new _DropsRewardsResponse_ProtoDecoder();
            case 2023:
                return new _DropsRewardsResponse_ResponseData_ProtoDecoder();
            case 2024:
                return new _DropsSignRequest_ProtoDecoder();
            case 2025:
                return new _DropsSignResponse_ProtoDecoder();
            case 2026:
                return new _DropsStartRequest_ProtoDecoder();
            case 2027:
                return new _DropsStartResponse_ProtoDecoder();
            case 2028:
                return new _DropsStartResponse_ResponseData_ProtoDecoder();
            case 2029:
                return new _DropsTaskEditRequest_ProtoDecoder();
            case 2030:
                return new _DropsTaskEditRequest_EditData_ProtoDecoder();
            case 2031:
                return new _DropsTaskEditResponse_ProtoDecoder();
            case 2032:
                return new _DropsTaskEditResponse_ResponseData_ProtoDecoder();
            case 2033:
                return new _DropsTaskEditResponse_TaskResult_ProtoDecoder();
            case 2034:
                return new _FeedbackTagRequest_ProtoDecoder();
            case 2035:
                return new _FeedbackTagResponse_ProtoDecoder();
            case 2036:
                return new _FeedbackTagResponse_ResponseData_ProtoDecoder();
            case 2037:
                return new _FeedbackTagResponse_ResponseData_FeedbackTag_ProtoDecoder();
            case 2038:
                return new _FeedbackTagResponse_ResponseData_FeedbackTag_FeedbackSubTag_ProtoDecoder();
            case 2039:
                return new _GameDetailRequest_ProtoDecoder();
            case 2040:
                return new _GameDetailResponse_ProtoDecoder();
            case 2041:
                return new _GameDetailResponse_ResponseData_ProtoDecoder();
            case 2042:
                return new _GetDropsStatusRequest_ProtoDecoder();
            case 2043:
                return new _GetDropsStatusResponse_ProtoDecoder();
            case 2044:
                return new _GetDropsStatusResponse_ResponseData_ProtoDecoder();
            case 2045:
                return new _HideTaskRequest_ProtoDecoder();
            case 2046:
                return new _HideTaskResponse_ProtoDecoder();
            case 2047:
                return new _LabelFilterInfo_ProtoDecoder();
            case 2048:
                return new _MatchScheduleRequest_ProtoDecoder();
            case 2049:
                return new _MatchScheduleResponse_ProtoDecoder();
            case 2050:
                return new _MatchScheduleResponse_ResponseData_ProtoDecoder();
            case 2051:
                return new _OpenAuthCheckRequest_ProtoDecoder();
            case 2052:
                return new _OpenAuthCheckRequest_DropsParam_ProtoDecoder();
            case 2053:
                return new _OpenAuthCheckResponse_ProtoDecoder();
            case 2054:
                return new _OpenAuthCheckResponse_ResponseData_ProtoDecoder();
            case 2055:
                return new _PunishInfo_ProtoDecoder();
            case 2056:
                return new _ReserveMatchScheduleRequest_ProtoDecoder();
            case 2057:
                return new _ReserveMatchScheduleResponse_ProtoDecoder();
            case 2058:
                return new _ReserveMatchScheduleResponse_ResponseData_ProtoDecoder();
            case 2059:
                return new _ShowTaskRequest_ProtoDecoder();
            case 2060:
                return new _ShowTaskResponse_ProtoDecoder();
            case 2061:
                return new _SubmitCPFeedbackRequest_ProtoDecoder();
            case 2062:
                return new _SubmitCPFeedbackResponse_ProtoDecoder();
            case 2063:
                return new _TaskPriceUpdate_ProtoDecoder();
            case 2064:
                return new _UserInfoRequest_ProtoDecoder();
            case 2065:
                return new _UserInfoResponse_ProtoDecoder();
            case 2066:
                return new _UserInfoResponse_ResponseData_ProtoDecoder();
            case 2067:
                return new _ListRequestParams_ProtoDecoder();
            case 2068:
                return new _ListResult_ProtoDecoder();
            case 2069:
                return new _ListResult_ActivityDetail_ProtoDecoder();
            case 2070:
                return new _ListResult_ActivityInfo_ProtoDecoder();
            case 2071:
                return new _ListResult_ExtraDiamondItem_ProtoDecoder();
            case 2072:
                return new _ListResult_IapCustomData_ProtoDecoder();
            case 2073:
                return new _ListResult_IapUnitPrice_ProtoDecoder();
            case 2074:
                return new _ListResult_ListResultExtra_ProtoDecoder();
            case 2075:
                return new _ListResult_VoucherItem_ProtoDecoder();
            case 2076:
                return new _ListResult_VoucherItem_CashbackInfo_ProtoDecoder();
            case 2077:
                return new _ListResult_VoucherItem_CashbackInfo_CashbackPercentage_ProtoDecoder();
            case 2078:
                return new _ListResult_VoucherItem_CashbackInfo_USDConversionRate_ProtoDecoder();
            case 2079:
                return new _ListResult_VoucherItem_VoucherStarlingContent_ProtoDecoder();
            case 2080:
                return new _ListResult_WebDisplayData_ProtoDecoder();
            case 2081:
                return new _HallOfFameRankExtra_ProtoDecoder();
            case 2082:
                return new _LynxRankView_ProtoDecoder();
            case 2083:
                return new _RankExtraInfo_ProtoDecoder();
            case 2084:
                return new _ActivityInfo_ProtoDecoder();
            case 2085:
                return new _ComponentInfo_ProtoDecoder();
            case 2086:
                return new _ComponentTask_ProtoDecoder();
            case 2087:
                return new _ComponentTaskProcess_ProtoDecoder();
            case 2088:
                return new _LevelTask_ProtoDecoder();
            case 2089:
                return new _LevelTaskProcess_ProtoDecoder();
            case 2090:
                return new _LiveInfo_ProtoDecoder();
            case 2091:
                return new _ReferralMentorRankListReq_ProtoDecoder();
            case 2092:
                return new _ReferralMentorRankListResp_ProtoDecoder();
            case 2093:
                return new _ReferralMentorRankListResp_Data_ProtoDecoder();
            case 2094:
                return new _ReferralMentorRankListResp_MentorRankItem_ProtoDecoder();
            case 2095:
                return new _ReferralOptOutRequest_ProtoDecoder();
            case 2096:
                return new _ReferralOptOutResponse_ProtoDecoder();
            case 2097:
                return new _ReferralOptOutResponse_Data_ProtoDecoder();
            case 2098:
                return new _ReferralSubmitEmailRequest_ProtoDecoder();
            case 2099:
                return new _ReferralSubmitEmailResponse_ProtoDecoder();
            case 2100:
                return new _ReferralSubmitEmailResponse_Data_ProtoDecoder();
            case 2101:
                return new _Task_ProtoDecoder();
            case 2102:
                return new _Task_Reward_ProtoDecoder();
            case 2103:
                return new _UserInfoMeta_ProtoDecoder();
            case 2104:
                return new webcast.api.room._AnchorLevelPermission_ProtoDecoder();
            case 2105:
                return new _CollectionSongsRequest_ProtoDecoder();
            case 2106:
                return new _CollectionSongsResponse_ProtoDecoder();
            case 2107:
                return new _CollectionSongsResponse_PageSongs_ProtoDecoder();
            case 2108:
                return new _CommentFlaggedPrompt_ProtoDecoder();
            case 2109:
                return new _CppAgeVerifyRequest_ProtoDecoder();
            case 2110:
                return new _CppAgeVerifyResponse_ProtoDecoder();
            case 2111:
                return new _CppAgeVerifyResponse_Data_ProtoDecoder();
            case 2112:
                return new _CppAgeVerifyResponse_Extra_ProtoDecoder();
            case 2113:
                return new _CppSafetyEducationRequest_ProtoDecoder();
            case 2114:
                return new _CppSafetyEducationResponse_ProtoDecoder();
            case 2115:
                return new _CppSafetyEducationResponse_Data_ProtoDecoder();
            case 2116:
                return new _CppSafetyEducationResponse_Extra_ProtoDecoder();
            case 2117:
                return new _CppTaskInfoRequest_ProtoDecoder();
            case 2118:
                return new _CppTaskInfoResponse_ProtoDecoder();
            case 2119:
                return new _CppTaskInfoResponse_Data_ProtoDecoder();
            case 2120:
                return new _CppTaskInfoResponse_Data_BanStatus_ProtoDecoder();
            case 2121:
                return new _CppTaskInfoResponse_Extra_ProtoDecoder();
            case 2122:
                return new _EventCollectData_ProtoDecoder();
            case 2123:
                return new _EventCollectRequest_ProtoDecoder();
            case 2124:
                return new _EventCollectResponse_ProtoDecoder();
            case 2125:
                return new _EventCollectResponse_EventCollectExtra_ProtoDecoder();
            case 2126:
                return new _FavouritesPack_ProtoDecoder();
            case 2127:
                return new _FirstScreenRequest_ProtoDecoder();
            case 2128:
                return new _FirstScreenResponse_ProtoDecoder();
            case 2129:
                return new _FirstScreenResponse_ResponseData_ProtoDecoder();
            case 2130:
                return new _FirstScreenRoom_ProtoDecoder();
            case 2131:
                return new _FrequencyControlData_ProtoDecoder();
            case 2132:
                return new _FrequencyControlExtra_ProtoDecoder();
            case 2133:
                return new _FrequencyControlParams_ProtoDecoder();
            case 2134:
                return new _FrequencyControlResponse_ProtoDecoder();
            case 2135:
                return new _GetOnlineRoomPCURequest_ProtoDecoder();
            case 2136:
                return new _GetOnlineRoomPCUResponse_ProtoDecoder();
            case 2137:
                return new _GetOnlineRoomPCUResponse_ResponseData_ProtoDecoder();
            case 2138:
                return new _GetSandBoxRoomListRequest_ProtoDecoder();
            case 2139:
                return new _GetSandBoxRoomListResponse_ProtoDecoder();
            case 2140:
                return new _GetSandBoxRoomListResponse_ResponseData_ProtoDecoder();
            case 2141:
                return new _GetSandBoxRoomListResponse_SandBoxRoom_ProtoDecoder();
            case 2142:
                return new _LivePermissionApply_ProtoDecoder();
            case 2143:
                return new _LivePodcastRequest_ProtoDecoder();
            case 2144:
                return new _LivePodcastResponse_ProtoDecoder();
            case 2145:
                return new _LivePodcastResponse_ResponseData_ProtoDecoder();
            case 2146:
                return new _LiveScenario_ProtoDecoder();
            case 2147:
                return new _MockRequest_ProtoDecoder();
            case 2148:
                return new _MockResponse_ProtoDecoder();
            case 2149:
                return new _MockResponse_Data_ProtoDecoder();
            case 2150:
                return new _MockResponse_GuideVideoURL_ProtoDecoder();
            case 2151:
                return new _MusicRequest_ProtoDecoder();
            case 2152:
                return new _MusicResponse_ProtoDecoder();
            case 2153:
                return new _MusicResponse_Pack_ProtoDecoder();
            case 2154:
                return new _MusicResponse_Packs_ProtoDecoder();
            case 2155:
                return new _PlaylistPack_ProtoDecoder();
            case 2156:
                return new _PreloadRoomExtra_ProtoDecoder();
            case 2157:
                return new _PreloadRoomParams_ProtoDecoder();
            case 2158:
                return new _PreloadRoomResponse_ProtoDecoder();
            case 2159:
                return new _PreviewTimeReportRequest_ProtoDecoder();
            case 2160:
                return new _PreviewTimeReportResponse_ProtoDecoder();
            case 2161:
                return new _PreviewTimeReportResponse_ResponseData_ProtoDecoder();
            case 2162:
                return new _RecommendSensitiveWordReq_ProtoDecoder();
            case 2163:
                return new _RecommendSensitiveWordResp_ProtoDecoder();
            case 2164:
                return new _RecommendSensitiveWordResp_ResponseData_ProtoDecoder();
            case 2165:
                return new _RoomComponentsV2Request_ProtoDecoder();
            case 2166:
                return new _RoomComponentsV2Response_ProtoDecoder();
            case 2167:
                return new _RoomGoalsRequest_ProtoDecoder();
            case 2168:
                return new _RoomGoalsResponse_ProtoDecoder();
            case 2169:
                return new _SwipingGuidanceRequest_ProtoDecoder();
            case 2170:
                return new _SwipingGuidanceResponse_ProtoDecoder();
            case 2171:
                return new _SwipingGuidanceResponse_ResponseData_ProtoDecoder();
            case 2172:
                return new _TryMode_ProtoDecoder();
            case 2173:
                return new _UpdateFrequencyControlData_ProtoDecoder();
            case 2174:
                return new _UpdateFrequencyControlExtra_ProtoDecoder();
            case 2175:
                return new _UpdateFrequencyControlParams_ProtoDecoder();
            case 2176:
                return new _UpdateFrequencyControlResponse_ProtoDecoder();
            case 2177:
                return new _CreateTimerRequest_ProtoDecoder();
            case 2178:
                return new _CreateTimerResponse_ProtoDecoder();
            case 2179:
                return new _CreateTimerResponse_Data_ProtoDecoder();
            case 2180:
                return new _GetAnchorSubscriberListResponse_ProtoDecoder();
            case 2181:
                return new _GetAnchorSubscriberListResponse_Data_ProtoDecoder();
            case 2182:
                return new _GetAnchorSubscriptionResponse_ProtoDecoder();
            case 2183:
                return new _GetAnchorSubscriptionResponse_Data_ProtoDecoder();
            case 2184:
                return new _GetSubGoalRequest_ProtoDecoder();
            case 2185:
                return new _GetSubGoalResponse_ProtoDecoder();
            case 2186:
                return new _GetSubGoalResponse_Data_ProtoDecoder();
            case 2187:
                return new _GetSubGoalResponse_SubGoalHistoryInfo_ProtoDecoder();
            case 2188:
                return new _GetSubGoalResponse_SubPin_ProtoDecoder();
            case 2189:
                return new _GetSubH5SharePageRequest_ProtoDecoder();
            case 2190:
                return new _GetSubH5SharePageResponse_ProtoDecoder();
            case 2191:
                return new _GetSubH5SharePageResponse_Data_ProtoDecoder();
            case 2192:
                return new _GetSubH5SharePageResponse_Data_SubNoteInfo_ProtoDecoder();
            case 2193:
                return new _GetSubH5SharePageResponse_Data_SubscribePermission_ProtoDecoder();
            case 2194:
                return new _GetSubPrivilegeDetailRequest_ProtoDecoder();
            case 2195:
                return new _GetSubPrivilegeDetailResponse_ProtoDecoder();
            case 2196:
                return new _GetSubPrivilegeDetailResponse_Data_ProtoDecoder();
            case 2197:
                return new _GetSubPrivilegeDetailResponse_Data_SubNoteInfo_ProtoDecoder();
            case 2198:
                return new _GetSubPrivilegeDetailResponse_Data_SubscribePermission_ProtoDecoder();
            case 2199:
                return new _GetTimerSubscriberListRequest_ProtoDecoder();
            case 2200:
                return new _GetTimerSubscriberListResponse_ProtoDecoder();
            case 2201:
                return new _GetTimerSubscriberListResponse_Data_ProtoDecoder();
            case 2202:
                return new _GetUserSubInfoRequest_ProtoDecoder();
            case 2203:
                return new _GetUserSubInfoResponse_ProtoDecoder();
            case 2204:
                return new _GetUserSubInfoResponse_Data_ProtoDecoder();
            case 2205:
                return new _GiftSubInfoData_ProtoDecoder();
            case 2206:
                return new _GiftSubInfoRequest_ProtoDecoder();
            case 2207:
                return new _GiftSubInfoResponse_ProtoDecoder();
            case 2208:
                return new _GiftSubInfoResponse_Data_ProtoDecoder();
            case 2209:
                return new _GiftSubTemplateInfo_ProtoDecoder();
            case 2210:
                return new _GiftSubTemplateListData_ProtoDecoder();
            case 2211:
                return new _GiftSubTemplateListRequest_ProtoDecoder();
            case 2212:
                return new _GiftSubTemplateListResponse_ProtoDecoder();
            case 2213:
                return new _ImageConvertRequest_ProtoDecoder();
            case 2214:
                return new _ImageConvertResponse_ProtoDecoder();
            case 2215:
                return new _ImageConvertResponse_Data_ProtoDecoder();
            case 2216:
                return new _ImageConvertResponse_Images_ProtoDecoder();
            case 2217:
                return new _OfferInfo_ProtoDecoder();
            case 2218:
                return new _PerksPinPanel_ProtoDecoder();
            case 2219:
                return new _SpotlightRequest_ProtoDecoder();
            case 2220:
                return new _SpotlightResponse_ProtoDecoder();
            case 2221:
                return new _SpotlightResponse_ResponseData_ProtoDecoder();
            case 2222:
                return new _SpotlightUpdateItem_ProtoDecoder();
            case 2223:
                return new _SpotlightUpdateRequest_ProtoDecoder();
            case 2224:
                return new _SpotlightUpdateResponse_ProtoDecoder();
            case 2225:
                return new _SpotlightUpdateResponse_ResponseData_ProtoDecoder();
            case 2226:
                return new _SubGoal_ProtoDecoder();
            case 2227:
                return new _SubManagementRequest_ProtoDecoder();
            case 2228:
                return new _SubManagementResponse_ProtoDecoder();
            case 2229:
                return new _SubManagementResponse_Data_ProtoDecoder();
            case 2230:
                return new _SubPinRequest_ProtoDecoder();
            case 2231:
                return new _SubPinResponse_ProtoDecoder();
            case 2232:
                return new _SubUnPinRequest_ProtoDecoder();
            case 2233:
                return new _SubUnPinResponse_ProtoDecoder();
            case 2234:
                return new _SubscriberCountInfo_ProtoDecoder();
            case 2235:
                return new _SubscriberMsg_ProtoDecoder();
            case 2236:
                return new _TagInfo_ProtoDecoder();
            case 2237:
                return new _TemplateInfo_ProtoDecoder();
            case 2238:
                return new _TemplateListData_ProtoDecoder();
            case 2239:
                return new _TemplateListRequest_ProtoDecoder();
            case 2240:
                return new _TemplateListResponse_ProtoDecoder();
            case 2241:
                return new _Tip_ProtoDecoder();
            case 2242:
                return new _MultiUserRequestParams_ProtoDecoder();
            case 2243:
                return new _MultiUserResponse_ProtoDecoder();
            case 2244:
                return new _RelationData_ProtoDecoder();
            case 2245:
                return new _RelationExtra_ProtoDecoder();
            case 2246:
                return new _RelationRequestParams_ProtoDecoder();
            case 2247:
                return new _RelationResponse_ProtoDecoder();
            case 2248:
                return new _UpdateBlockStatusRequestParams_ProtoDecoder();
            case 2249:
                return new _UpdateBlockStatusResponse_ProtoDecoder();
            case 2250:
                return new _UserExtra_ProtoDecoder();
            case 2251:
                return new _UserInfoMeResponse_ProtoDecoder();
            case 2252:
                return new _UserInfoRequestParams_ProtoDecoder();
            case 2253:
                return new _UserRequestParams_ProtoDecoder();
            case 2254:
                return new _UserResponse_ProtoDecoder();
            case 2255:
                return new _AnchorUser_ProtoDecoder();
            case 2256:
                return new _AppealInfo_ProtoDecoder();
            case 2257:
                return new _BagItem_ProtoDecoder();
            case 2258:
                return new _BagItemPreUpdateInfo_ProtoDecoder();
            case 2259:
                return new _DiscordEntrance_ProtoDecoder();
            case 2260:
                return new _EventCard_ProtoDecoder();
            case 2261:
                return new _FansBannerConfig_ProtoDecoder();
            case 2262:
                return new _FansConfig_ProtoDecoder();
            case 2263:
                return new _FansDiscordGuildInfo_ProtoDecoder();
            case 2264:
                return new _FansDiscordRoleInfo_ProtoDecoder();
            case 2265:
                return new _FansLevelInfo_ProtoDecoder();
            case 2266:
                return new _FansLevelShowConfig_ProtoDecoder();
            case 2267:
                return new _FansPrivilege_ProtoDecoder();
            case 2268:
                return new _FansPrivilegeBackground_ProtoDecoder();
            case 2269:
                return new _FansPrivilegeDetail_ProtoDecoder();
            case 2270:
                return new _FansPrivilegeRichText_ProtoDecoder();
            case 2271:
                return new _FansScoreRule_ProtoDecoder();
            case 2272:
                return new _FansTask_ProtoDecoder();
            case 2273:
                return new _FansTaskAverageRewardConfig_ProtoDecoder();
            case 2274:
                return new _FansTaskConfig_ProtoDecoder();
            case 2275:
                return new _FansTaskLevelRewardConfig_ProtoDecoder();
            case 2276:
                return new _FansUpgradeBarrageEffectConfig_ProtoDecoder();
            case 2277:
                return new _FansUpgradeDynamicEffectConfig_ProtoDecoder();
            case 2278:
                return new _FansUpgradePrivilege_ProtoDecoder();
            case 2279:
                return new _Hello_ProtoDecoder();
            case 2280:
                return new _InteractionConflict_ProtoDecoder();
            case 2281:
                return new _InteractionConflictItem_ProtoDecoder();
            case 2282:
                return new _MsgFilter_ProtoDecoder();
            case 2283:
                return new _MultiGuestLinkmicInfo_ProtoDecoder();
            case 2284:
                return new _MultiGuestLinkmicInfo_ListUser_ProtoDecoder();
            case 2285:
                return new _MusicCollection_ProtoDecoder();
            case 2286:
                return new _MusicSong_ProtoDecoder();
            case 2287:
                return new webcast.data._RankUser_ProtoDecoder();
            case 2288:
                return new webcast.data._RankUser_Border_ProtoDecoder();
            case 2289:
                return new webcast.data._RankUser_FollowInfo_ProtoDecoder();
            case 2290:
                return new _RealtimeLiveCenterBaseData_ProtoDecoder();
            case 2291:
                return new _RealtimeLiveCenterShopData_ProtoDecoder();
            case 2292:
                return new _RealtimeLiveCenterTips_ProtoDecoder();
            case 2293:
                return new _RealtimeViolationRecord_ProtoDecoder();
            case 2294:
                return new _RechargeCustomError_ProtoDecoder();
            case 2295:
                return new _RechargePopUpContentReplace_ProtoDecoder();
            case 2296:
                return new _ReqSong_ProtoDecoder();
            case 2297:
                return new _RoomMultiGuestLinkmicInfo_ProtoDecoder();
            case 2298:
                return new _SlotFansRecord_ProtoDecoder();
            case 2299:
                return new _StandardMoney_ProtoDecoder();
            case 2300:
                return new _TimeStruct_ProtoDecoder();
            case 2301:
                return new _UserIdentity_ProtoDecoder();
            case 2302:
                return new _BizJoinGroupParams_ProtoDecoder();
            case 2303:
                return new _BizJoinGroupResponse_ProtoDecoder();
            case 2304:
                return new _BizJoinGroupResponse_ResponseData_ProtoDecoder();
            case 2305:
                return new _BizLeaveJoinGroupParams_ProtoDecoder();
            case 2306:
                return new _BizLeaveJoinGroupResponse_ProtoDecoder();
            case 2307:
                return new _BizPermitJoinGroupParams_ProtoDecoder();
            case 2308:
                return new _BizPermitJoinGroupResponse_ProtoDecoder();
            case 2309:
                return new _BizPermitJoinGroupResponse_ResponseData_ProtoDecoder();
            case 2310:
                return new _BizRechargeResponse_ProtoDecoder();
            case 2311:
                return new _BizRechargeResponse_ResponseData_ProtoDecoder();
            case 2312:
                return new _ShowConfig_ProtoDecoder();
            case 2313:
                return new _ShowContent_ProtoDecoder();
            case 2314:
                return new _ShowListUser_ProtoDecoder();
            case 2315:
                return new _BizChangeLayoutParams_ProtoDecoder();
            case 2316:
                return new _BizInviteParams_ProtoDecoder();
            case 2317:
                return new _BizResumeParams_ProtoDecoder();
            case 2318:
                return new _BizResumeResponse_ProtoDecoder();
            case 2319:
                return new _BizResumeResponse_ResponseData_ProtoDecoder();
            case 2320:
                return new _CancelJoinGroupContent_ProtoDecoder();
            case 2321:
                return new _CohostContent_ProtoDecoder();
            case 2322:
                return new _DECCDataAnnotation_ProtoDecoder();
            case 2323:
                return new _DECCSchemaAnnotation_ProtoDecoder();
            case 2324:
                return new _GroupChangeContent_ProtoDecoder();
            case 2325:
                return new _JoinGroupBizContent_ProtoDecoder();
            case 2326:
                return new _JoinGroupContent_ProtoDecoder();
            case 2327:
                return new _JoinGroupMessageExtra_ProtoDecoder();
            case 2328:
                return new _JoinGroupMessageExtra_RivalExtra_ProtoDecoder();
            case 2329:
                return new _JoinGroupMessageExtra_RivalExtra_AuthenticationInfo_ProtoDecoder();
            case 2330:
                return new _KickOutBizContent_ProtoDecoder();
            case 2331:
                return new _LeaveJoinGroupContent_ProtoDecoder();
            case 2332:
                return new _LinkStateMessage_ProtoDecoder();
            case 2333:
                return new _ListChangeBizContent_ProtoDecoder();
            case 2334:
                return new _LiveShowMessage_ProtoDecoder();
            case 2335:
                return new _P2PGroupChangeContent_ProtoDecoder();
            case 2336:
                return new _PermitJoinGroupBizContent_ProtoDecoder();
            case 2337:
                return new _PermitJoinGroupContent_ProtoDecoder();
            case 2338:
                return new _PreviewRoom_ProtoDecoder();
            default:
                return null;
        }
    }

    public static int LIZIZ(Class<?> cls) {
        int i = 0;
        while (cls != LIZ[i]) {
            i++;
            if (i >= 2339) {
                return -1;
            }
        }
        return i;
    }
}
