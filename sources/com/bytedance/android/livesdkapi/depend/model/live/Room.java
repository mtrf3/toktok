package com.bytedance.android.livesdkapi.depend.model.live;

import X.BLG;
import X.C32364Cn2;
import X.F9E;
import X.InterfaceC05190Ih;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.liveinteract.multilive.model.RoomHostMultiGuestPermissionInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.GameCategoryInfo;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.LikeEffect;
import com.bytedance.android.livesdk.model.LikeInfo;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.RoomAuthMessage;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdk.model.TopFanTicket;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import webcast.data.EventCard;

/* loaded from: classes6.dex */
public class Room extends F9E implements BLG {

    @InterfaceC65349Pkn("adjust_display_order")
    public long adjustDisplayOrder;

    @InterfaceC65349Pkn("admin_ec_show_permission")
    public Map<Long, Long> adminEcShowPermission;

    @InterfaceC65349Pkn("advanced_poll_info")
    public PollInfo advancedPollInfo;

    @InterfaceC65349Pkn("age_restricted")
    public AgeRestricted ageRestricted;

    @InterfaceC65349Pkn("allow_preview_time")
    public long allowPreviewTime;

    @InterfaceC65349Pkn("anchor_live_pro_info")
    public LiveProInfo anchorLiveProInfo;

    @InterfaceC65349Pkn("anchor_share_text")
    public String anchorShareText;

    @InterfaceC65349Pkn("anchor_tab_type")
    public long anchorTabType;

    @InterfaceC65349Pkn("answering_question_content")
    public String answeringQuestion;

    @InterfaceC65349Pkn("audio_mute")
    public int audioMute;

    @InterfaceC65349Pkn("ba_leads_gen_info")
    public BaLeadsGenInfo baLeadsGenInfo;

    @InterfaceC65349Pkn("ba_link_info")
    public BALinkStruct baLinkStruct;

    @InterfaceC65349Pkn("background")
    public ImageModel background;

    @InterfaceC65349Pkn("bc_toggle_info")
    public BcToggleInfo bcToggleInfo;

    @InterfaceC65349Pkn("blurred_cover")
    public ImageModel blurredCover;

    @InterfaceC65349Pkn("caption_info")
    public CaptionInfo captionInfo;

    @InterfaceC65349Pkn("client_version")
    public String clientVersion;

    @InterfaceC65349Pkn("comment_has_text_emoji_emote")
    public int commentHasTextEmojiEmote;

    @InterfaceC65349Pkn("commerce_info_backup")
    public CommerceStruct commerceInfoBackup;

    @InterfaceC65349Pkn("commerce_info")
    public CommerceStruct commerceStruct;

    @InterfaceC65349Pkn("commercial_content_toggle")
    public CommercialContentToggle commercialContentToggle;

    @InterfaceC65349Pkn("cover")
    public ImageModel cover;

    @InterfaceC65349Pkn("cpp_version")
    public int cppVersion;

    @InterfaceC65349Pkn("create_time")
    public long createTime;

    @InterfaceC65349Pkn("creator")
    public Creator creator;

    @InterfaceC65349Pkn("deco_list")
    public List<RoomDecoration> decorationList;

    @InterfaceC65349Pkn("disable_preview_sub_only")
    public long disablePreviewSubOnly;

    @InterfaceC65349Pkn("drawer_tab_position")
    public String drawerTabPosition;

    @InterfaceC65349Pkn("drop_comment_group")
    public long dropCommentGroup;

    @InterfaceC65349Pkn("dynamic_cover")
    public ImageModel dynamicCover;

    @InterfaceC65349Pkn("dynamic_cover_low")
    public ImageModel dynamicCoverLow;

    @InterfaceC65349Pkn("effect_info")
    public List<EffectInfo> effectInfo;

    @InterfaceC65349Pkn("enable_server_drop")
    public long enableServerDrop;

    @InterfaceC65349Pkn("feed_room_label")
    public ImageModel feedRoomLabel;

    @InterfaceC65349Pkn("feed_room_labels")
    public List<FeedRoomLabel> feedRoomLabelList;

    @InterfaceC65349Pkn("filter_msg_rules")
    public List<LiveFilterMsgRule> filterRule;

    @InterfaceC65349Pkn("finish_time")
    public long finishTime;

    @InterfaceC65349Pkn("finish_url_v2")
    public String finishUrlLynx;

    @InterfaceC65349Pkn("finish_url")
    public String finish_url;

    @InterfaceC65349Pkn("fyp_commerce_info")
    public FYPCommerceStruct fypCommerceInfo;

    @InterfaceC65349Pkn("game_category")
    public GameCategoryInfo gameCategoryInfo;

    @InterfaceC65349Pkn("gift_msg_style")
    public int giftMessageStyle;

    @InterfaceC65349Pkn("gift_poll_vote_enabled")
    public boolean giftPollVoteEnabled;

    @InterfaceC65349Pkn("gift_suspension")
    public GiftSuspension giftSuspension;

    @InterfaceC65349Pkn("has_commerce_goods")
    public boolean hasCommerceGoods;

    @InterfaceC65349Pkn("has_used_music")
    public boolean hasUsedMusic;

    @InterfaceC65349Pkn("hashtag")
    public Hashtag hashtag;

    @InterfaceC65349Pkn("have_wishlist")
    public boolean haveWishList;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("interaction_question")
    public InteractionQuestionInfo interactionQuestion;
    public boolean isDouPlusPromotion;
    public boolean isFlare;
    public boolean isFromRecommendCard;
    public transient boolean isOfficialChannel;

    @InterfaceC65349Pkn("live_type_screenshot")
    public boolean isScreenshot;
    public boolean isShow;

    @InterfaceC65349Pkn("live_type_third_party")
    public boolean isThirdParty;

    @InterfaceC65349Pkn("karaoke_info")
    public KaraokeInfo karaokeInfo;

    @InterfaceC65349Pkn("common_label_list")
    public String labels;

    @InterfaceC65349Pkn("layout")
    public long layout;

    @InterfaceC65349Pkn("like_count")
    public long likeCount;

    @InterfaceC65349Pkn("like_effect")
    public LikeEffect likeEffect;

    @InterfaceC65349Pkn("like_info")
    public LikeInfo likeInfo;

    @InterfaceC65349Pkn("link_mic")
    public RoomLinkInfo linkMicInfoGson;

    @InterfaceC65349Pkn("linker_map")
    public Map<String, Long> linkerMap;
    public transient int linkmicLayout;

    @InterfaceC65349Pkn("lite_user_not_visible")
    public boolean liteUserNotVisible;

    @InterfaceC65349Pkn("lite_user_visible")
    public boolean liteUserVisible;

    @InterfaceC65349Pkn("live_event_card")
    public EventCard liveEventCard;

    @InterfaceC65349Pkn("live_event_info")
    public LiveEventInfo liveEventInfo;

    @InterfaceC65349Pkn("live_room_mode")
    public int liveRoomMode;

    @InterfaceC65349Pkn("live_sub_only")
    public long liveSubOnly;

    @InterfaceC65349Pkn("live_sub_only_use_music")
    public long liveSubOnlyUseMusic;

    @InterfaceC65349Pkn("live_type_audio")
    public boolean liveTypeAudio;
    public String logPb;

    @InterfaceC65349Pkn("boost_status")
    public LiveGiftBoostCardRoomStatus mBoostCardRoomStatus;

    @InterfaceC65349Pkn("comment_name_mode")
    public int mNameMode;
    public String mRequestId;

    @InterfaceC65349Pkn("room_auth_message")
    public RoomAuthMessage mRoomAuthMessage;

    @InterfaceC65349Pkn("room_auth")
    public RoomAuthStatus mRoomAuthStatus;
    public long mUserFrom;

    @InterfaceC65349Pkn("mask_layer")
    public MaskLayer maskLayer;

    @InterfaceC65349Pkn("max_preview_time")
    public long maxPreviewTime;

    @InterfaceC65349Pkn("message")
    public String message;

    @InterfaceC65349Pkn("mosaic_status")
    public int mosaicStatus;

    @InterfaceC65349Pkn("social_interaction")
    public MultiLiveUserSettings multiLiveUserSettings;

    @InterfaceC65349Pkn("multi_stream_id")
    public long multiStreamId;

    @InterfaceC65349Pkn("multi_stream_scene")
    public long multiStreamScene;

    @InterfaceC65349Pkn("multi_stream_url")
    public StreamUrl multiStreamUrl;

    @InterfaceC65349Pkn("net_mode")
    public long netMode;
    public long nowTime;

    @InterfaceC65349Pkn("official_channel")
    public OfficialChannelInfo officialChannelInfo;

    @InterfaceC65349Pkn("orientation")
    public int orientation;

    @InterfaceC65349Pkn("owner")
    public User owner;

    @InterfaceC65349Pkn("owner_user_id")
    public long ownerUserId;

    @InterfaceC65349Pkn("paid_content_info")
    public PaidContentInfo paidContentInfo;

    @InterfaceC65349Pkn("paid_event")
    public PaidEvent paidEvent;

    @InterfaceC65349Pkn("pico_live_type")
    public int picoLiveType;

    @InterfaceC65349Pkn("pictionary_info")
    public PictionaryFullInfo pictionaryFullInfo;

    @InterfaceC65349Pkn("pin_info")
    public PinInfo pinInfo;

    @InterfaceC65349Pkn("os_type")
    public int platform;

    @InterfaceC65349Pkn("polling_star_comment")
    public boolean pollingStarComment;

    @InterfaceC65349Pkn("prompts")
    public String prompts;

    @InterfaceC65349Pkn("interaction_question_version")
    public int questionVersion;

    @InterfaceC65349Pkn("rank_comment_groups")
    public List<String> rankCommentGroups;

    @InterfaceC65349Pkn("rectangle_cover_img")
    public ImageModel rectangleCoverImg;

    @InterfaceC65349Pkn("regional_restricted")
    public RegionalRestricted regionalRestricted;

    @InterfaceC65349Pkn("room_layout")
    public int roomLayout;
    public String roomOrientation;

    @InterfaceC65349Pkn("room_pcu")
    public long roomPcu;

    @InterfaceC65349Pkn("room_sticker_list")
    public List<RoomSticker> roomStickerList;

    @InterfaceC65349Pkn("share_url")
    public String shareUrl;

    @InterfaceC65349Pkn("short_touch_items")
    public List<ShortTouchItem> shortTouchItems;

    @InterfaceC65349Pkn("show_star_comment_entrance")
    public boolean showStarCommentEntrance;

    @InterfaceC65349Pkn("skin")
    public Skin skin;

    @InterfaceC65349Pkn("source_type")
    public String sourceType;

    @InterfaceC65349Pkn("square_cover_img")
    public ImageModel squareCoverImg;

    @InterfaceC65349Pkn("star_comment_config")
    public StarCommentConfig starCommentConfig;

    @InterfaceC65349Pkn("stats")
    public RoomStats stats;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("stream_cover")
    public ImageModel streamCover;

    @InterfaceC65349Pkn("stream_id")
    public long streamId;

    @InterfaceC65349Pkn("stream_status")
    public int streamStatus;

    @InterfaceC65349Pkn("stream_url")
    public StreamUrl streamUrl;

    @InterfaceC65349Pkn("sub_pin_card")
    public SubPinCard subPinCard;

    @InterfaceC65349Pkn("support_quiz")
    public long supportQuiz;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("top_fans")
    public List<TopFanTicket> topFanTickets;

    @InterfaceC65349Pkn("top_frame_summary")
    public TopFrameSummary topFrameSummary;

    @InterfaceC65349Pkn("use_filter")
    public boolean unusedEffect;

    @InterfaceC65349Pkn("user_count")
    public int userCount;

    @InterfaceC65349Pkn("user_share_text")
    public String userShareText;

    @InterfaceC65349Pkn("warning_tag")
    public WarningTag warningTag;

    @InterfaceC65349Pkn("webcast_sdk_version")
    public long webcastSdkVersion;

    @InterfaceC65349Pkn("with_linkmic")
    public boolean withLinkMic;

    @InterfaceC65349Pkn("rtc_app_id")
    public String rtcAppId = "";

    @InterfaceC65349Pkn("idc_region")
    public String idcRegion = "";

    @InterfaceC65349Pkn("multi_stream_id_str")
    public String multiStreamIdStr = "";
    public String authenticationValue = "";

    @InterfaceC65349Pkn("room_create_ab_param")
    public String roomCreateAbParam = "";

    @InterfaceC65349Pkn("partnership_info")
    public PartnershipInfo partnershipInfo = new PartnershipInfo();

    @InterfaceC65349Pkn("indicators")
    public List<String> mIndicators = new ArrayList();

    public List<Object> getDislikeReason() {
        return null;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.idStr, this.mRoomAuthStatus};
    }

    public String getVideoUrl() {
        return "";
    }

    public String subtitle() {
        return "";
    }

    public String buildExtraSreamPullUrl() {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        String str = streamUrl.qualityMap.get(streamUrl.LIZJ);
        if (str == null) {
            return null;
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(str);
        c32364Cn2.LIZ(this.platform, "anchor_device_platform");
        c32364Cn2.LIZJ("anchor_version", this.clientVersion);
        c32364Cn2.LIZIZ(this.id, "room_id");
        c32364Cn2.LIZIZ(this.ownerUserId, "anchor_id");
        return c32364Cn2.LIZLLL();
    }

    public String buildPullUrl() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return buildPullUrl(streamUrl.LIZJ);
    }

    public CommerceStruct getCommerceStruct() {
        CommerceStruct commerceStruct = this.commerceStruct;
        if (commerceStruct != null && commerceStruct.commercePermission == 1) {
            return commerceStruct;
        }
        CommerceStruct commerceStruct2 = this.commerceInfoBackup;
        if (commerceStruct2 != null && commerceStruct2.commercePermission == 1) {
            return commerceStruct2;
        }
        return commerceStruct;
    }

    public String getExtraSdkParams() {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        return getExtraSdkParams(streamUrl.LIZJ);
    }

    public String getExtraStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getExtraStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public StreamUrlExtra getExtraStreamUrlExtra() {
        StreamUrlExtra streamUrlExtra;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (streamUrlExtra = streamUrl.extra) == null) {
            return new StreamUrlExtra();
        }
        return streamUrlExtra;
    }

    public String getMixId() {
        return String.valueOf(this.id);
    }

    public String getMultiStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public LiveCoreSDKData.Options getOptions() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null || this.streamUrl.liveCoreSDKData.getPullData().getOptions() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getPullData().getOptions();
    }

    public String getSdkParams() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return getSdkParams(streamUrl.LIZJ);
    }

    public LiveMode getStreamType() {
        if (this.layout == 1) {
            return LiveMode.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return LiveMode.SCREEN_RECORD;
        }
        int i = this.liveRoomMode;
        if (i == 6) {
            return LiveMode.LIVE_STUDIO;
        }
        if (this.isThirdParty) {
            return LiveMode.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return LiveMode.AUDIO;
        }
        if (i == 7) {
            return LiveMode.LIVE_VOICE;
        }
        return LiveMode.VIDEO;
    }

    public StreamUrlExtra getStreamUrlExtra() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.extra;
    }

    public boolean hasMultiLivePermissionAnchorSide() {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiLiveUserSettings multiLiveUserSettings = this.multiLiveUserSettings;
        if (multiLiveUserSettings == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (roomHostMultiGuestPermissionInfo = multiLiveUserApplySettings.roomHostMultiGuestPermissionInfo) == null || !roomHostMultiGuestPermissionInfo.roomPackSuccessFlag || (multiGuestPermissionInfo = roomHostMultiGuestPermissionInfo.permissionInfo) == null || !multiGuestPermissionInfo.flag || multiGuestPermissionInfo.errCode != 0) {
            return false;
        }
        return true;
    }

    public void init() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl != null) {
            streamUrl.LIZJ();
            StreamUrl streamUrl2 = this.streamUrl;
            if (streamUrl2.liveCoreSDKData != null) {
                streamUrl2.LIZIZ();
            }
        }
        StreamUrl streamUrl3 = this.multiStreamUrl;
        if (streamUrl3 != null) {
            streamUrl3.LIZJ();
            StreamUrl streamUrl4 = this.multiStreamUrl;
            if (streamUrl4.liveCoreSDKData != null) {
                streamUrl4.LIZIZ();
            }
        }
    }

    public boolean isKoiRoom() {
        if (this.layout == 3) {
            return true;
        }
        return false;
    }

    public boolean isMediaRoom() {
        if (this.roomLayout == 1) {
            return true;
        }
        return false;
    }

    public boolean isMultiLiveAutoStart() {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserSettings multiLiveUserSettings = this.multiLiveUserSettings;
        if (multiLiveUserSettings == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || !multiLiveUserApplySettings.tryOpenMultiGuest) {
            return false;
        }
        return true;
    }

    public boolean isMultiPullDataValid() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || streamUrl.liveCoreSDKData == null) {
            return false;
        }
        streamUrl.LIZIZ();
        if (!(!streamUrl.qualityList.isEmpty())) {
            return false;
        }
        return true;
    }

    public boolean isOfficial() {
        if (this.layout == 1) {
            return true;
        }
        return false;
    }

    public boolean isPullUrlValid() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl != null) {
            streamUrl.LIZJ();
            if (!streamUrl.qualityMap.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean isQuizRoom() {
        if (1 == this.supportQuiz) {
            return true;
        }
        return false;
    }

    public boolean isStar() {
        if (this.layout == 2) {
            return true;
        }
        return false;
    }

    public StreamUrlExtra.SrConfig getStreamSrConfig() {
        StreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return null;
        }
        return streamUrlExtra.srConfig;
    }

    public StreamUrlExtra getStreamUrlExtraSafely() {
        StreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new StreamUrlExtra();
        }
        return streamUrlExtra;
    }

    public boolean isGameLiveStreamType() {
        LiveMode streamType = getStreamType();
        if (streamType != null && (streamType == LiveMode.SCREEN_RECORD || streamType == LiveMode.LIVE_STUDIO || streamType == LiveMode.THIRD_PARTY)) {
            return true;
        }
        return false;
    }

    public InterfaceC05190Ih author() {
        return this.owner;
    }

    @Override // X.BLG
    public ImageModel cover() {
        return this.cover;
    }

    public String getAnchorShareText() {
        return this.anchorShareText;
    }

    public long getAnchorTabType() {
        return this.anchorTabType;
    }

    public BALinkStruct getBALinkStruct() {
        return this.baLinkStruct;
    }

    public BcToggleInfo getBcToggleInfo() {
        return this.bcToggleInfo;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public ImageModel getCover() {
        return this.cover;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public List<RoomDecoration> getDecorationList() {
        return this.decorationList;
    }

    public ImageModel getDynamicCover() {
        return this.dynamicCover;
    }

    public ImageModel getDynamicCoverLow() {
        return this.dynamicCoverLow;
    }

    public ImageModel getFeedRoomLabel() {
        return this.feedRoomLabel;
    }

    public List<FeedRoomLabel> getFeedRoomLabelList() {
        return this.feedRoomLabelList;
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public Hashtag getHashtag() {
        return this.hashtag;
    }

    public long getHostWebcastSdkVersion() {
        return this.webcastSdkVersion;
    }

    @Override // X.BLG
    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLikeCount() {
        return this.likeCount;
    }

    public RoomLinkInfo getLinkMicInfo() {
        return this.linkMicInfoGson;
    }

    public int getLinkmicLayout() {
        return this.linkmicLayout;
    }

    public String getLog_pb() {
        return this.logPb;
    }

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public int getNameMode() {
        return this.mNameMode;
    }

    public OfficialChannelInfo getOfficialChannelInfo() {
        return this.officialChannelInfo;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public User getOwner() {
        return this.owner;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public PictionaryFullInfo getPictionaryFullInfo() {
        return this.pictionaryFullInfo;
    }

    public PinInfo getPinInfo() {
        return this.pinInfo;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public RoomAuthStatus getRoomAuthStatus() {
        return this.mRoomAuthStatus;
    }

    public int getRoomLayout() {
        return this.roomLayout;
    }

    public String getRoomOrientation() {
        return this.roomOrientation;
    }

    public List<RoomSticker> getRoomStickerList() {
        return this.roomStickerList;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public ImageModel getSquareCoverImg() {
        return this.squareCoverImg;
    }

    public RoomStats getStats() {
        return this.stats;
    }

    public int getStatus() {
        return this.status;
    }

    public ImageModel getStreamCover() {
        return this.streamCover;
    }

    public long getStreamId() {
        return this.streamId;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public List<TopFanTicket> getTopFanTickets() {
        return this.topFanTickets;
    }

    public TopFrameSummary getTopFrameSummary() {
        return this.topFrameSummary;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public String getUserShareText() {
        return this.userShareText;
    }

    public boolean hasCommerceGoods() {
        return this.hasCommerceGoods;
    }

    public boolean isLiveTypeAudio() {
        return this.liveTypeAudio;
    }

    public boolean isOfficialChannel() {
        return this.isOfficialChannel;
    }

    public boolean isUnusedEffect() {
        return this.unusedEffect;
    }

    public boolean isWithLinkMic() {
        return this.withLinkMic;
    }

    public String title() {
        return this.title;
    }

    public static boolean isValid(Room room) {
        if (room != null && room.getId() > 0 && room.getOwner() != null) {
            return true;
        }
        return false;
    }

    public String buildPullUrl(String str) {
        String str2;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (str2 = streamUrl.qualityMap.get(str)) == null) {
            return null;
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(str2);
        c32364Cn2.LIZ(this.platform, "anchor_device_platform");
        c32364Cn2.LIZJ("anchor_version", this.clientVersion);
        c32364Cn2.LIZIZ(this.id, "room_id");
        c32364Cn2.LIZIZ(this.ownerUserId, "anchor_id");
        return c32364Cn2.LIZLLL();
    }

    public String getExtraSdkParams(String str) {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.sdkParamsMap.get(str);
    }

    public String getSdkParams(String str) {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.sdkParamsMap.get(str);
    }

    public void setAnchorShareText(String str) {
        this.anchorShareText = str;
    }

    public void setAnchorTabType(long j) {
        this.anchorTabType = j;
    }

    public void setBALinkStruct(BALinkStruct bALinkStruct) {
        this.baLinkStruct = bALinkStruct;
    }

    public void setBcToggleInfo(BcToggleInfo bcToggleInfo) {
        this.bcToggleInfo = bcToggleInfo;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setCommerceStruct(CommerceStruct commerceStruct) {
        this.commerceStruct = commerceStruct;
    }

    @InterfaceC65349Pkn("cover")
    public void setCover(ImageModel imageModel) {
        this.cover = imageModel;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDecorationList(List<RoomDecoration> list) {
        this.decorationList = list;
    }

    public void setDynamicCover(ImageModel imageModel) {
        this.dynamicCover = imageModel;
    }

    public void setDynamicCoverLow(ImageModel imageModel) {
        this.dynamicCoverLow = imageModel;
    }

    public void setFeedRoomLabel(ImageModel imageModel) {
        this.feedRoomLabel = imageModel;
    }

    public void setFinishTime(long j) {
        this.finishTime = j;
    }

    public void setHashtag(Hashtag hashtag) {
        this.hashtag = hashtag;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setLinkMicInfo(RoomLinkInfo roomLinkInfo) {
        this.linkMicInfoGson = roomLinkInfo;
    }

    public void setLiveTypeAudio(boolean z) {
        this.liveTypeAudio = z;
    }

    public void setLog_pb(String str) {
        this.logPb = str;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setOfficialChannel(boolean z) {
        this.isOfficialChannel = z;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwner(User user) {
        this.owner = user;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setRoomAuthStatus(RoomAuthStatus roomAuthStatus) {
        this.mRoomAuthStatus = roomAuthStatus;
    }

    public void setRoomOrientation(String str) {
        this.roomOrientation = str;
    }

    public void setRoomStickerList(List<RoomSticker> list) {
        this.roomStickerList = list;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setStats(RoomStats roomStats) {
        this.stats = roomStats;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStreamCover(ImageModel imageModel) {
        this.streamCover = imageModel;
    }

    public void setStreamId(long j) {
        this.streamId = j;
    }

    @InterfaceC65349Pkn("stream_url")
    public void setStreamUrl(StreamUrl streamUrl) {
        this.streamUrl = streamUrl;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopFanTickets(List<TopFanTicket> list) {
        this.topFanTickets = list;
    }

    public void setUnusedEffect(boolean z) {
        this.unusedEffect = z;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public void setUserShareText(String str) {
        this.userShareText = str;
    }

    public void setWithLinkMic(boolean z) {
        this.withLinkMic = z;
    }
}
