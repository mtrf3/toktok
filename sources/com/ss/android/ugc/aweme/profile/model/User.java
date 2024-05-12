package com.ss.android.ugc.aweme.profile.model;

import X.C16880lQ;
import X.C221038lv;
import X.C53632L3c;
import X.C78540Us4;
import X.EnumC53631L3b;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.X1D;
import X.YXG;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.commerce.EnterpriseUserInfo;
import com.ss.android.ugc.aweme.commerce.PotentialBizAccountInfo;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.live.LiveAuthenticationInfo;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.music.OriginalMusician;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public class User implements Serializable, Cloneable {

    @InterfaceC65349Pkn("accept_private_policy")
    public boolean acceptPrivatePolicy;

    @InterfaceC65349Pkn("account_labels")
    public List<AccountLabelInfo> accountLabelInfos;

    @InterfaceC65349Pkn("account_region")
    public String accountRegion;

    @InterfaceC65349Pkn("account_type")
    public int accountType;

    @InterfaceC65349Pkn("description")
    public String adAuthorDesc;

    @InterfaceC65349Pkn("ad_cover_title")
    public AdCoverTitle adCoverTitle;

    @InterfaceC65349Pkn("ad_cover_url")
    public List<UrlModel> adCoverUrl;

    @InterfaceC65349Pkn("ad_order_id")
    public String adOrderId;

    @InterfaceC65349Pkn("add_yours_invited")
    public Boolean addYoursInvited;

    @InterfaceC65349Pkn("advanced_feature_info")
    public AdvancedFeatureInfo[] advancedFeatureInfo;

    @InterfaceC65349Pkn("age_gate_action")
    public int ageGateAction;

    @InterfaceC65349Pkn("age_gate_info")
    public AgeGateInfo ageGateInfo;

    @InterfaceC65349Pkn("age_gate_post_action")
    public int ageGatePostAction;

    @InterfaceC65349Pkn("age_gate_time")
    public long ageGateTime;

    @InterfaceC65349Pkn("ags_warning")
    public AGSWarning agsWarning;

    @InterfaceC65349Pkn("allowStatus")
    public int allowStatus;

    @InterfaceC65349Pkn("anchor_schedule_guide_txt")
    public String anchorScheduleGuideTxt;

    @InterfaceC65349Pkn("authentication_info")
    public LiveAuthenticationInfo authenticationInfo;

    @InterfaceC65349Pkn("authority_status")
    public long authorityStatus;

    @InterfaceC65349Pkn("avatar_decoration")
    public AvatarDecoration avatarDecoration;

    @InterfaceC65349Pkn("avatar_larger")
    public UrlModel avatarLarger;

    @InterfaceC65349Pkn("avatar_medium")
    public UrlModel avatarMedium;

    @InterfaceC65349Pkn("avatar_meta_info")
    public AvatarMetaInfo avatarMeta;

    @InterfaceC65349Pkn("avatar_pendant_larger")
    public UrlModel avatarPendantLarger;

    @InterfaceC65349Pkn("avatar_pendant_medium")
    public UrlModel avatarPendantMedium;

    @InterfaceC65349Pkn("avatar_pendant_thumb")
    public UrlModel avatarPendantThumb;

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("avatar_update_reminder")
    public boolean avatarUpdateReminder;

    @InterfaceC65349Pkn("video_icon")
    public UrlModel avatarVideoUri;

    @InterfaceC65349Pkn("aweme_count")
    public int awemeCount;

    @InterfaceC65349Pkn("aweme_cover")
    public UserAwemeCover awemeCover;

    @InterfaceC65349Pkn("creator_fund_info_struct")
    public CreatorFundBannerSetting bannerSetting;

    @InterfaceC65349Pkn("bind_phone")
    public String bindPhone;

    @InterfaceC65349Pkn("bio_email")
    public String bioEmail;

    @InterfaceC65349Pkn("bio_location")
    public String bioLocation;

    @InterfaceC65349Pkn("bio_permission")
    public UserBioPermission bioPermission;

    @InterfaceC65349Pkn("bio_phone")
    public String bioPhone;

    @InterfaceC65349Pkn("bio_secure_url")
    public String bioSecureUrl;

    @InterfaceC65349Pkn("bio_url")
    public String bioUrl;

    @InterfaceC65349Pkn("birthday")
    public String birthday;

    @InterfaceC65349Pkn("biz_account_info")
    public BizAccountInfo bizAccountInfo;

    @InterfaceC65349Pkn("block_status")
    public int blockStatus;

    @InterfaceC65349Pkn("bold_fields")
    public List<String> boldFields;

    @InterfaceC65349Pkn("brand_info")
    public BlueVBrandInfo brandInfo;

    @InterfaceC65349Pkn("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;

    @InterfaceC65349Pkn("can_modify_school_info")
    public boolean canModifySchoolInfo;

    @InterfaceC65349Pkn("can_set_geofencing")
    public boolean canSetGeoFencing;

    @InterfaceC65349Pkn("cancel_type")
    public int cancelType;

    @InterfaceC65349Pkn("category")
    public String category;

    @InterfaceC65349Pkn("cha_list")
    public List<Challenge> challengeList;

    @InterfaceC65349Pkn("city")
    public String cityName;

    @InterfaceC65349Pkn("collect_count")
    public int collectCount;

    @InterfaceC65349Pkn("comment_filter_status")
    public int commentFilterStatus;

    @InterfaceC65349Pkn("comment_setting")
    public int commentSetting;

    @InterfaceC65349Pkn("commerce_info")
    public CommerceInfo commerceInfo;

    @InterfaceC65349Pkn("commerce_permissions")
    public CommercePermissionStruct commercePermission;

    @InterfaceC65349Pkn("commerce_user_info")
    public CommerceUserInfo commerceUserInfo;

    @InterfaceC65349Pkn("commerce_user_level")
    public int commerceUserLevel;

    @InterfaceC65349Pkn("complete_profile_guide_strategy")
    public int completeProfileGuideStrategy;

    @InterfaceC65349Pkn("constellation")
    public int constellation;

    @InterfaceC65349Pkn("contact_name")
    public String contactName;

    @InterfaceC65349Pkn("contacts_sync_status")
    public boolean contactsSyncStatus;

    @InterfaceC65349Pkn("country")
    public String country;

    @InterfaceC65349Pkn("cover_url")
    public List<UrlModel> coverUrls;

    @InterfaceC65349Pkn("create_time")
    public Long createTime;

    @InterfaceC65349Pkn("custom_verify")
    public String customVerify;

    @InterfaceC65349Pkn("display_addyours_on_profile")
    public int displayAddYoursOnProfile;

    @InterfaceC65349Pkn("display_qna_on_profile")
    public Integer displayQnaOnProfile;

    @InterfaceC65349Pkn("display_wvalantine_activity_entry")
    public boolean displayWvalantineActivityEntry;

    @InterfaceC65349Pkn("district")
    public String district;

    @InterfaceC65349Pkn("download_setting")
    public int downloadSetting;

    @InterfaceC65349Pkn("dsp_profile")
    public DspProfile dspProfile;

    @InterfaceC65349Pkn("duet_setting")
    public int duetSetting;

    @InterfaceC65349Pkn("education")
    public int education;

    @InterfaceC65349Pkn("effect_detail")
    public EffectArtistDetail effectArtistDetail;

    @InterfaceC65349Pkn("email")
    public String email;

    @InterfaceC65349Pkn("enable_direct_message")
    public boolean enableDirectMessage;

    @InterfaceC65349Pkn("enable_subscription")
    public boolean enableSubscription;

    @InterfaceC65349Pkn("enterprise_user_info")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public EnterpriseUserInfo enterpriseUserInfo;

    @InterfaceC65349Pkn("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @InterfaceC65349Pkn("external_recommend_reason")
    public ExternalRecommendReasonStruct externalRecommendReasonStruct;

    @InterfaceC65349Pkn("mplatform_followers_count")
    public int fansCount;

    @InterfaceC65349Pkn("favoriting_count")
    public int favoritingCount;

    @InterfaceC65349Pkn("fb_expire_time")
    public long fbExpireTime;

    @InterfaceC65349Pkn("follow_from")
    public int followFrom;

    @InterfaceC65349Pkn("follow_from_msg")
    public String followFromMsg;

    @InterfaceC65349Pkn("follow_status")
    public int followStatus;

    @InterfaceC65349Pkn("follower_count")
    public int followerCount;

    @InterfaceC65349Pkn("followers_detail")
    public List<FollowerDetail> followerDetailList;

    @InterfaceC65349Pkn("follower_status")
    public int followerStatus;

    @InterfaceC65349Pkn("following_count")
    public int followingCount;

    @InterfaceC65349Pkn("force_private_account")
    public boolean forcePrivateAccount;

    @InterfaceC65349Pkn("friend_count")
    public int friendCount;

    @InterfaceC65349Pkn("friend_type_str")
    public String friendTypeStr;

    @InterfaceC65349Pkn("friends_status")
    public int friendsStatus;

    @InterfaceC65349Pkn("friend_tab_related_user_info")
    public FriendsTabRelatedUserInfo friendsTabInfo;

    @InterfaceC65349Pkn("gift_bag_status")
    public int giftBagStatus;

    @InterfaceC65349Pkn("analytics_status")
    public boolean hasAnalyticsMetrics;

    @InterfaceC65349Pkn("has_email")
    public boolean hasEmail;

    @InterfaceC65349Pkn("has_facebook_token")
    public boolean hasFacebookToken;

    @InterfaceC65349Pkn("has_open_favorite")
    public boolean hasOpenFavorite;

    @InterfaceC65349Pkn("has_orders")
    public boolean hasOrders;

    @InterfaceC65349Pkn("has_twitter_token")
    public boolean hasTwitterToken;

    @InterfaceC65349Pkn("has_youtube_token")
    public boolean hasYoutubeToken;

    @InterfaceC65349Pkn("hide_following_follower_list")
    public int hideFollowingFollowerList;

    @InterfaceC65349Pkn("hide_search")
    public boolean hideSearch;

    @InterfaceC65349Pkn("hide_shoot_button")
    public boolean hideShootButton;

    @InterfaceC65349Pkn("history_max_follower_count")
    public int historyMaxFollowerCount;

    @InterfaceC65349Pkn("homepage_bottom_toast")
    public List<HomePageBottomToast> homepageBottomToast;

    @InterfaceC65349Pkn("honor_info")
    public HonorStruct honorStruct;

    @InterfaceC65349Pkn("ins_id")
    public String insId;

    @InterfaceC65349Pkn("is_acquaintance")
    public boolean isAcquaintance;

    @InterfaceC65349Pkn("is_activity_user")
    public boolean isActivityUser;

    @InterfaceC65349Pkn("is_ad_fake")
    public boolean isAdFake;

    @InterfaceC65349Pkn("ad_virtual")
    public boolean isAdVirtual;

    @InterfaceC65349Pkn("is_block")
    public boolean isBlock;

    @InterfaceC65349Pkn("is_blocked")
    public boolean isBlocked;

    @InterfaceC65349Pkn("content_language_already_popup")
    public boolean isContentLanguageDialogShown;

    @InterfaceC65349Pkn("has_insights")
    public boolean isCreater;

    @InterfaceC65349Pkn("is_discipline_member")
    public boolean isDisciplineMember;

    @InterfaceC65349Pkn("is_effect_artist")
    public boolean isEffectArtist;

    @InterfaceC65349Pkn("is_email_verified")
    public boolean isEmailVerified;

    @InterfaceC65349Pkn("is_geo_blocked_profile")
    public boolean isGeoBlocked;
    public boolean isNewRecommend;

    @InterfaceC65349Pkn("douplus_old_user")
    public boolean isOldDouplusUser;

    @InterfaceC65349Pkn("is_phone_binded")
    public boolean isPhoneBinded;

    @InterfaceC65349Pkn("is_private_account")
    public boolean isPrivateAccount;

    @InterfaceC65349Pkn("is_pro_account")
    public boolean isProAccount;

    @InterfaceC65349Pkn("is_star")
    public boolean isStar;

    @InterfaceC65349Pkn("is_translator")
    public boolean isTranslator;

    @InterfaceC65349Pkn("iso_country_code")
    public String isoCountryCode;

    @InterfaceC65349Pkn("language")
    public String language;

    @InterfaceC65349Pkn("latest_order_time")
    public Long latestOrderTime;

    @InterfaceC65349Pkn("latest_unread_video_info")
    public LatestUnreadVideoInfo latestUnreadVideoInfo;

    @InterfaceC65349Pkn("live_agreement")
    public int liveAgreement;

    @InterfaceC65349Pkn("anchor_info")
    public LiveAnchorInfo liveAnchorInfo;

    @InterfaceC65349Pkn("live_commerce")
    public boolean liveCommerce;

    @InterfaceC65349Pkn("login_platform")
    public int loginPlatform;
    public int mAtType;

    @InterfaceC65349Pkn("general_permission")
    public GeneralPermission mGeneralPermission;

    @InterfaceC65349Pkn("search_highlight")
    public List<HighlightInfo> mHighlightInfoList;

    @InterfaceC65349Pkn("hot_list")
    public HotListStruct mHotListStruct;

    @InterfaceC65349Pkn("events")
    public List<LiveEventStruct> mLiveEventStructList;
    public boolean mMentionEnabled;

    @InterfaceC65349Pkn("mutual_relation")
    public MutualStruct mMutualStruct;

    @InterfaceC65349Pkn("badge_info")
    public ProfileBadgeStruct mProfileBadgeStruct;

    @InterfaceC65349Pkn("supporting_ngo")
    public ProfileNgoStruct mProfileNgoStruct;

    @InterfaceC65349Pkn("pronouns_info")
    public UserPronounsInfo mPronounsInfo;

    @InterfaceC65349Pkn("maf_count")
    public int mafRedCount;

    @InterfaceC65349Pkn("tt_mall_tab_related_user_info")
    public TTMallTabRelatedUserInfo mallTabUserInfo;

    @InterfaceC65349Pkn("matched_friend_available")
    public boolean matchedFriendAvailable;

    @InterfaceC65349Pkn("matched_friend")
    public MatchedFriendStruct matchedFriendStruct;

    @InterfaceC65349Pkn("message_config")
    public int messageConfig;
    public int mixListNum;

    @InterfaceC65349Pkn("playlist_status")
    public int mixListStatus;

    @InterfaceC65349Pkn("music_compliance_account")
    public int musicComplianceAccount;

    @InterfaceC65349Pkn("music_tab_info")
    public MusicTabInfo musicTabInfo;

    @InterfaceC65349Pkn("mutual_relation_avatars")
    public List<UrlModel> mutualRelationAvatars;

    @InterfaceC65349Pkn("mutual_relation_num")
    public int mutualRelationNumber;

    @InterfaceC65349Pkn("mutual_relation_tag")
    public String mutualRelationTag;

    @InterfaceC65349Pkn("name_field")
    public String nameField;

    @InterfaceC65349Pkn("navi_id")
    public String naviId;

    @InterfaceC65349Pkn("need_addr_card")
    public boolean needAddrCard;

    @InterfaceC65349Pkn("need_points")
    public List<NeedPointStruct> needPoints;

    @InterfaceC65349Pkn("need_recommend")
    public boolean needRecommend;

    @InterfaceC65349Pkn("new_follower_count")
    public int newFollowerCount;

    @InterfaceC65349Pkn("nickname_modify_time")
    public int nickNameModifyTs;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("nickname_update_reminder")
    public boolean nicknameUpdateReminder;

    @InterfaceC65349Pkn("normal_top_comment_permission")
    public int normalTopCommentPermission;

    @InterfaceC65349Pkn("notify_private_account")
    public int notifyPrivateAccount;

    @InterfaceC65349Pkn("notify_minor_private_policy")
    public boolean notifyPrivatePolicy;

    @InterfaceC65349Pkn("nudge_guide_info")
    public NudgeGuideInfo nudgeGuideInfo;

    @InterfaceC65349Pkn("original_musician")
    public OriginalMusician originalMusician;

    @InterfaceC65349Pkn("paid_content_awareness_banner_info")
    public PaidContentAwareBannerSetting paidContentAwareBannerSetting;

    @InterfaceC65349Pkn("paid_content_banner_info_struct")
    public PaidContentBannerSetting paidContentBannerSetting;

    @InterfaceC65349Pkn("platform_sync_info")
    public PlatformInfo[] platformInfos;

    @InterfaceC65349Pkn("post_default_download_setting")
    public boolean postDefaultDownloadSetting;

    @InterfaceC65349Pkn("potential_biz_account_info")
    public PotentialBizAccountInfo potentialBizAccountInfo;

    @InterfaceC65349Pkn("prevent_download")
    public boolean preventDownload;

    @InterfaceC65349Pkn("privacy_setting")
    public PrivacySetting privacySetting;

    @InterfaceC65349Pkn("private_aweme_count")
    public int privateAwemeCount;

    @InterfaceC65349Pkn("pro_account_tcm_red_dot")
    public boolean proAccountTcmRedDot;

    @InterfaceC65349Pkn("proaccount_update_notification_status")
    public int proAccountUpdateNotificationStatus;

    @InterfaceC65349Pkn("profile_completion")
    public float profileCompletion;

    @InterfaceC65349Pkn("profile_pv")
    public long profilePv;

    @InterfaceC65349Pkn("user_experiments")
    public ProfileUserExperiments profileUserExperiments;

    @InterfaceC65349Pkn("province")
    public String province;

    @InterfaceC65349Pkn("qa_status")
    public int qnaStatus;

    @InterfaceC65349Pkn("quick_shop_info")
    public QuickShopInfo quickShopInfo;

    @InterfaceC65349Pkn("r_fans_group_info")
    public RocketFansGroupInfo rFansGroupInfo;

    @InterfaceC65349Pkn("rec_type")
    public String recType;

    @InterfaceC65349Pkn("item_list")
    public List<RecommendAwemeItem> recommendAwemeItems;

    @InterfaceC65349Pkn("recommend_reason")
    public String recommendReason;

    @InterfaceC65349Pkn("recommend_reason_relation")
    public String recommendReasonRelation;

    @InterfaceC65349Pkn("recommend_score")
    public double recommendScore;

    @InterfaceC65349Pkn("region")
    public String region;

    @InterfaceC65349Pkn("register_from")
    public String registerFrom;

    @InterfaceC65349Pkn("registerStatus")
    public int registerStatus;

    @InterfaceC65349Pkn("register_time")
    public long registerTime;

    @InterfaceC65349Pkn("relation_label")
    public String relationLabel;

    @InterfaceC65349Pkn("relation_ship")
    public String relationShip;

    @InterfaceC65349Pkn("relative_users")
    public List<RelativeUserInfo> relativeUserInfos;

    @InterfaceC65349Pkn("remark_name")
    public String remarkName;

    @InterfaceC65349Pkn("forward_count")
    public int repostCount;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    @InterfaceC65349Pkn("room_cover")
    public UrlModel roomCover;

    @InterfaceC65349Pkn("room_data")
    public String roomData;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("room_id_str")
    public String roomIdStr;

    @InterfaceC65349Pkn("room_title")
    public String roomTitle;

    @InterfaceC65349Pkn("room_type_tag")
    public String roomTypeTag;

    @InterfaceC65349Pkn("school_visible")
    public int schoolInfoShowRange;

    @InterfaceC65349Pkn("search_user_desc")
    public String searchUserDesc;

    @InterfaceC65349Pkn("search_user_name")
    public String searchUserName;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("secret")
    public boolean secret;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    @InterfaceC65349Pkn("shield_comment_notice")
    public int shieldCommentNotice;

    @InterfaceC65349Pkn("shield_digg_notice")
    public int shieldDiggNotice;

    @InterfaceC65349Pkn("shield_edit_field_info")
    public List<ShieldEditFieldInfo> shieldEditFieldInfoList;

    @InterfaceC65349Pkn("shield_follow_notice")
    public int shieldFollowNotice;

    @InterfaceC65349Pkn("shop_entrance")
    public ShopEntranceInfo shopEntrance;

    @InterfaceC65349Pkn("shop_micro_app")
    public String shopMicroApp;

    @InterfaceC65349Pkn("short_id")
    public String shortId;

    @InterfaceC65349Pkn("should_write_impr")
    public boolean shouldWriteImpr;

    @InterfaceC65349Pkn("shoutouts_status")
    public int shoutoutsStatus;

    @InterfaceC65349Pkn("show_artist_playlist")
    public int showArtistPlaylist;

    @InterfaceC65349Pkn("show_effect_list")
    public boolean showEffectList;

    @InterfaceC65349Pkn("show_favorite_list")
    public boolean showFavoriteList;

    @InterfaceC65349Pkn("show_image_bubble")
    public boolean showImageBubble;

    @InterfaceC65349Pkn("show_tip_entry")
    public boolean showTipEntry;

    @InterfaceC65349Pkn("show_user_ban_dialog")
    public boolean showUserBanDialog;

    @InterfaceC65349Pkn("signature")
    public String signature;

    @InterfaceC65349Pkn("signature_language")
    public String signatureLanguage;

    @InterfaceC65349Pkn("signature_modify_time")
    public int signatureModifyTime;

    @InterfaceC65349Pkn("social_data")
    public SocialDataStruct socialData;

    @InterfaceC65349Pkn("social_info")
    public String socialInfo;

    @InterfaceC65349Pkn("special_account")
    public SpecialAccount specialAccount;

    @InterfaceC65349Pkn("sprint_support_user_info")
    public HotSearchSprintStruct sprintSupportUserInfo;

    @InterfaceC65349Pkn("star_billboard_rank")
    public int starBillboardRank;

    @InterfaceC65349Pkn("stitch_setting")
    public int stitchSetting;

    @InterfaceC65349Pkn("life_story_block")
    public StoryBlockInfo storyBlockInfo;

    @InterfaceC65349Pkn("tab_settings")
    public TabSetting tabSetting;

    @InterfaceC65349Pkn("profile_tab_type")
    public int tabType;
    public int taggedBAInvitationStatus;
    public boolean taggedIsBA;

    @InterfaceC65349Pkn("third_name")
    public String thirdName;

    @InterfaceC65349Pkn("total_favorited")
    public long totalFavorited;

    @InterfaceC65349Pkn("tw_expire_time")
    public long twExpireTime;

    @InterfaceC65349Pkn("twitter_id")
    public String twitterId;

    @InterfaceC65349Pkn("twitter_name")
    public String twitterName;

    @InterfaceC65349Pkn("type_label")
    public long[] typeLabels;

    @InterfaceC65349Pkn("uid")
    public String uid;

    @InterfaceC65349Pkn("video_unread_info")
    public UnReadVideoInfo unReadVideoInfo;

    @InterfaceC65349Pkn("unique_id")
    public String uniqueId;

    @InterfaceC65349Pkn("unique_id_modify_time")
    public long uniqueIdModifyTime;

    @InterfaceC65349Pkn("urge_detail")
    public UrgeStruct urgeDetail;

    @InterfaceC65349Pkn("advance_feature_item_order")
    public List<Integer> userAdvancedFeaturesOrder;

    @InterfaceC65349Pkn("user_canceled")
    public boolean userCancelled;

    @InterfaceC65349Pkn("pay_grade")
    public UserHonor userHonor;

    @InterfaceC65349Pkn("user_inactive")
    public boolean userInactive;

    @InterfaceC65349Pkn("user_period")
    public int userPeriod;

    @InterfaceC65349Pkn("user_profile_guide")
    public List<UserProfileGuide> userProfileGuide;

    @InterfaceC65349Pkn("user_rate")
    public int userRate;

    @InterfaceC65349Pkn("user_rate_remind_info")
    public UserRateRemindInfo userRateRemindInfo;

    @InterfaceC65349Pkn("vcd_schema_url")
    public String vcdSchemaUrl;

    @InterfaceC65349Pkn("verification_badge_type")
    public int verificationBadgeType;

    @InterfaceC65349Pkn("verification_type")
    public int verificationType;

    @InterfaceC65349Pkn("verify_info")
    public String verifyInfo;

    @InterfaceC65349Pkn("video_cover")
    public VideoCover videoCover;

    @InterfaceC65349Pkn("video_gift_status")
    public int videoGiftStatus;

    @InterfaceC65349Pkn("video_view_is_auth")
    public boolean videoViewIsAuth;

    @InterfaceC65349Pkn("viewer_entrance_info")
    public ViewerEntranceInfo viewerEntranceInfo;

    @InterfaceC65349Pkn("video_view_type")
    public int viewerType;

    @InterfaceC65349Pkn("visible_videos_count")
    public int visibleVideosCount;

    @InterfaceC65349Pkn("watch_status")
    public int watchStatus;

    @InterfaceC65349Pkn("white_cover_url")
    public List<UrlModel> whiteCoverUrl;

    @InterfaceC65349Pkn("with_commerce_enterprise_tab_entry")
    public boolean withCommerceEnterpriseTabEntry;

    @InterfaceC65349Pkn("with_commerce_entry")
    public boolean withCommerceEntry;

    @InterfaceC65349Pkn("with_commerce_newbie_task")
    public boolean withCommerceNewbieTask;

    @InterfaceC65349Pkn("with_douplus_entry")
    public boolean withDouplusEntry;

    @InterfaceC65349Pkn("with_item_commerce_entry")
    public boolean withItemCommerceEntry;

    @InterfaceC65349Pkn("with_new_goods")
    public boolean withNewGoods;

    @InterfaceC65349Pkn("with_shop_entry")
    public boolean withShopEntry;

    @InterfaceC65349Pkn("with_star_atlas_entry")
    public boolean withStarAtlasEntry;

    @InterfaceC65349Pkn("xmas_unlock_count")
    public int xmasUnlockCount;

    @InterfaceC65349Pkn("youtube_last_refresh_time")
    public long youTubeLastRefreshTime;

    @InterfaceC65349Pkn("youtube_refresh_token")
    public String youTubeRefreshToken;

    @InterfaceC65349Pkn("youtube_channel_id")
    public String youtubeChannelId;

    @InterfaceC65349Pkn("youtube_channel_title")
    public String youtubeChannelTitle;

    @InterfaceC65349Pkn("youtube_expire_time")
    public long youtubeExpireTime;

    @InterfaceC65349Pkn("yt_raw_token")
    public String youtubeRawRefreshToken;

    @InterfaceC65349Pkn("message_chat_entry")
    public boolean showMessageButton = true;

    @InterfaceC65349Pkn("predicted_age_group")
    public String predictedAgeGroup = "";

    @InterfaceC65349Pkn("last_active_time")
    public Long lastActiveTime = 0L;

    @InterfaceC65349Pkn("user_mode")
    public int userMode = -1;
    public transient String userDisplayName = "";

    @InterfaceC65349Pkn("live_push_notification_status")
    public int livePushNotificationStatus = 2;

    @InterfaceC65349Pkn("story_status")
    public int storyStatus = -1;
    public transient boolean checkDMPermission = false;

    @InterfaceC65349Pkn("user_now_info")
    public UserNowInfo userNowInfo = null;

    @InterfaceC65349Pkn("user_now_pack_info")
    public UserNowPackStruct userNowPackStruct = null;

    @InterfaceC65349Pkn("show_messaging_entrance_on_profile")
    public boolean isShowMessageEntrance = false;

    @InterfaceC65349Pkn("is_user_data_miss")
    public boolean isUserDataMiss = false;

    @InterfaceC65349Pkn("aweme_unread_info")
    public AwemeUnreadInfo awemeUnreadInfo = null;
    public boolean isFeatureVideoChanged = false;

    /* loaded from: classes17.dex */
    public interface AccountType {
    }

    /* loaded from: classes17.dex */
    public interface LivePushNotificationStatus {
    }

    /* loaded from: classes17.dex */
    public interface ProfileTabType {
    }

    /* loaded from: classes17.dex */
    public interface ShowArtistListType {
    }

    /* loaded from: classes17.dex */
    public interface ShowPrivateTabType {
    }

    /* loaded from: classes17.dex */
    public interface VerificationType {
        public static final int DEFAULT = 1;
    }

    /* loaded from: classes17.dex */
    public interface VerifyStatus {
    }

    public boolean canMessageByConfig() {
        int i = this.messageConfig;
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 4) {
                return false;
            }
            if (this.followStatus == 2 || this.isAcquaintance) {
                return true;
            }
            return false;
        }
        if (this.followStatus == 2) {
            return true;
        }
        return false;
    }

    public String getAccurateRecType() {
        String str = this.recType;
        if (str != null) {
            return str;
        }
        MatchedFriendStruct matchedFriendStruct = this.matchedFriendStruct;
        if (matchedFriendStruct != null) {
            return matchedFriendStruct.getRecType();
        }
        return null;
    }

    public boolean getAdAuthorization() {
        CommerceUserInfo commerceUserInfo = this.commerceUserInfo;
        if (commerceUserInfo != null && commerceUserInfo.adAuthorization) {
            return true;
        }
        return false;
    }

    public long getCreateTime() {
        Long l = this.createTime;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public int getCreatorFundBannerVersion() {
        CreatorFundBannerSetting creatorFundBannerSetting = this.bannerSetting;
        if (creatorFundBannerSetting != null) {
            return creatorFundBannerSetting.getBannerVersion();
        }
        return 0;
    }

    public UrlModel getDefaultAdCoverUrl() {
        if (C78540Us4.LJIILLIIL(this.adCoverUrl)) {
            return null;
        }
        return (UrlModel) ListProtector.get(this.adCoverUrl, 0);
    }

    public Boolean getIsFeatureVideoChanged() {
        return Boolean.valueOf(this.isFeatureVideoChanged);
    }

    public long getLatestOrderTime() {
        Long l = this.latestOrderTime;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public SocialDataStruct getSocialData() {
        SocialDataStruct socialDataStruct = this.socialData;
        if (socialDataStruct == null || socialDataStruct.getSocialPlatformSettings() == null || this.socialData.getSocialPlatformSettings().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SocialPlatformSetting(1, false, 0, true, new SocialPlatformAccessInfo(), false));
            arrayList.add(new SocialPlatformSetting(2, false, 0, true, new SocialPlatformAccessInfo(), false));
            arrayList.add(new SocialPlatformSetting(6, false, 0, true, new SocialPlatformAccessInfo(), false));
            SocialDataStruct socialDataStruct2 = this.socialData;
            if (socialDataStruct2 != null) {
                this.socialData = new SocialDataStruct(arrayList, true, socialDataStruct2.isNewFollower());
            } else {
                this.socialData = new SocialDataStruct(arrayList, true, false);
            }
        }
        return this.socialData;
    }

    public Long getUnReadLastTime() {
        UnReadVideoInfo unReadVideoInfo = this.unReadVideoInfo;
        if (unReadVideoInfo == null) {
            return 0L;
        }
        return Long.valueOf(unReadVideoInfo.getLatestUnreadVideoCreatedTime());
    }

    public int getUnReadVideoCount() {
        UnReadVideoInfo unReadVideoInfo = this.unReadVideoInfo;
        if (unReadVideoInfo == null) {
            return 0;
        }
        return unReadVideoInfo.getUnReadCount();
    }

    public boolean hasAdEntry() {
        CommerceUserInfo commerceUserInfo = this.commerceUserInfo;
        if (commerceUserInfo != null && commerceUserInfo.hasAdEntry) {
            return true;
        }
        return false;
    }

    public boolean hasSignLiveAgreement() {
        if (this.liveAgreement == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str = this.uid;
        int i20 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i21 = i * 31;
        String str2 = this.shortId;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i22 = (i21 + i2) * 31;
        String str3 = this.nickname;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i23 = (i22 + i3) * 31;
        String str4 = this.remarkName;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i24 = (i23 + i4) * 31;
        String str5 = this.signature;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i25 = (i24 + i5) * 31;
        String str6 = this.birthday;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i26 = (i25 + i6) * 31;
        UrlModel urlModel = this.avatarLarger;
        if (urlModel != null) {
            i7 = urlModel.hashCode();
        } else {
            i7 = 0;
        }
        int i27 = (i26 + i7) * 31;
        UrlModel urlModel2 = this.avatarThumb;
        if (urlModel2 != null) {
            i8 = urlModel2.hashCode();
        } else {
            i8 = 0;
        }
        int i28 = (i27 + i8) * 31;
        UrlModel urlModel3 = this.avatarMedium;
        if (urlModel3 != null) {
            i9 = urlModel3.hashCode();
        } else {
            i9 = 0;
        }
        int i29 = (i28 + i9) * 31;
        UrlModel urlModel4 = this.avatarVideoUri;
        if (urlModel4 != null) {
            i10 = urlModel4.hashCode();
        } else {
            i10 = 0;
        }
        int i30 = (i29 + i10) * 31;
        AvatarMetaInfo avatarMetaInfo = this.avatarMeta;
        if (avatarMetaInfo != null) {
            i11 = avatarMetaInfo.hashCode();
        } else {
            i11 = 0;
        }
        int i31 = (((((((((((((((((((((((((((((((((i30 + i11) * 31) + this.allowStatus) * 31) + this.followStatus) * 31) + this.followerStatus) * 31) + this.friendsStatus) * 31) + this.watchStatus) * 31) + this.awemeCount) * 31) + this.followingCount) * 31) + this.followerCount) * 31) + this.newFollowerCount) * 31) + this.collectCount) * 31) + this.friendCount) * 31) + this.favoritingCount) * 31) + this.registerStatus) * 31) + (this.hideSearch ? 1 : 0)) * 31) + this.mAtType) * 31) + this.constellation) * 31;
        String str7 = this.customVerify;
        if (str7 != null) {
            i12 = str7.hashCode();
        } else {
            i12 = 0;
        }
        int i32 = (i31 + i12) * 31;
        String str8 = this.uniqueId;
        if (str8 != null) {
            i13 = str8.hashCode();
        } else {
            i13 = 0;
        }
        int i33 = (i32 + i13) * 31;
        ShareInfo shareInfo = this.shareInfo;
        if (shareInfo != null) {
            i14 = shareInfo.hashCode();
        } else {
            i14 = 0;
        }
        int i34 = (i33 + i14) * 31;
        String str9 = this.bindPhone;
        if (str9 != null) {
            i15 = str9.hashCode();
        } else {
            i15 = 0;
        }
        int i35 = (((i34 + i15) * 31) + (this.hasEmail ? 1 : 0)) * 31;
        Long l = this.createTime;
        if (l != null) {
            i16 = l.hashCode();
        } else {
            i16 = 0;
        }
        int i36 = (((((((((((((((((i35 + i16) * 31) + (this.needRecommend ? 1 : 0)) * 31) + (this.secret ? 1 : 0)) * 31) + (this.isPrivateAccount ? 1 : 0)) * 31) + (this.preventDownload ? 1 : 0)) * 31) + (this.showImageBubble ? 1 : 0)) * 31) + this.commentSetting) * 31) + this.duetSetting) * 31) + this.downloadSetting) * 31;
        String str10 = this.region;
        if (str10 != null) {
            i17 = str10.hashCode();
        } else {
            i17 = 0;
        }
        int i37 = (i36 + i17) * 31;
        String str11 = this.language;
        if (str11 != null) {
            i18 = str11.hashCode();
        } else {
            i18 = 0;
        }
        int i38 = (i37 + i18) * 31;
        String str12 = this.roomTypeTag;
        if (str12 != null) {
            i19 = str12.hashCode();
        } else {
            i19 = 0;
        }
        int i39 = (i38 + i19) * 31;
        Long l2 = this.latestOrderTime;
        if (l2 != null) {
            i20 = l2.hashCode();
        }
        return ((i39 + i20) * 31) + (this.isTranslator ? 1 : 0);
    }

    public boolean isAccuratePrivateAccount() {
        if (this.isPrivateAccount || this.secret) {
            return true;
        }
        return false;
    }

    public boolean isFacebookExpire() {
        return checkExpire(this.fbExpireTime);
    }

    public boolean isLive() {
        if (this.roomId != 0) {
            return true;
        }
        return false;
    }

    public boolean isNormalTopCommentPermissionGranted() {
        if (this.normalTopCommentPermission == 1) {
            return true;
        }
        return false;
    }

    public boolean isTwitterExpire() {
        return checkExpire(this.twExpireTime);
    }

    public boolean isYoutubeExpire() {
        return checkExpire(this.youtubeExpireTime);
    }

    public boolean showBAPendingTag() {
        if (this.taggedIsBA && this.taggedBAInvitationStatus != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public User m150clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public int getFollowStatusRelation() {
        EnumC53631L3b enumC53631L3b;
        int followStatus = getFollowStatus();
        if (followStatus != 0) {
            if (followStatus != 1) {
                if (followStatus != 2) {
                    enumC53631L3b = EnumC53631L3b.UNFOLLOW;
                } else {
                    enumC53631L3b = EnumC53631L3b.MUTUAL_FOLLOW;
                }
            } else {
                enumC53631L3b = EnumC53631L3b.SINGLE_FOLLOW;
            }
        } else if (getFollowerStatus() == 1) {
            enumC53631L3b = EnumC53631L3b.SINGLE_FOLLOWED;
        } else {
            enumC53631L3b = EnumC53631L3b.UNFOLLOW;
        }
        int i = C53632L3c.LIZ[enumC53631L3b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return YXG.ELSE.getValue();
                    }
                    if (C221038lv.LIZ(this)) {
                        return YXG.UNFOLLOW_FRIEND.getValue();
                    }
                    return YXG.UNFOLLOW_NOT_FRIEND.getValue();
                }
                if (C221038lv.LIZ(this)) {
                    return YXG.SINGLE_FOLLOWED_FRIEND.getValue();
                }
                return YXG.SINGLE_FOLLOWED_NOT_FRIEND.getValue();
            }
            if (C221038lv.LIZ(this)) {
                return YXG.SINGLE_FOLLOWING_FRIEND.getValue();
            }
            return YXG.SINGLE_FOLLOWING_NO_FRIEND.getValue();
        }
        return YXG.MUTUAL.getValue();
    }

    public String getLiveUid() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("live");
        LIZ.append(this.uid);
        return X1D.LIZIZ(LIZ);
    }

    public boolean avatarUpdateReminder() {
        return this.avatarUpdateReminder;
    }

    public List<AccountLabelInfo> getAccountLabelInfos() {
        return this.accountLabelInfos;
    }

    public String getAccountRegion() {
        return this.accountRegion;
    }

    public int getAccountType() {
        return this.accountType;
    }

    public String getAdAuthorDesc() {
        return this.adAuthorDesc;
    }

    public AdCoverTitle getAdCoverTitle() {
        return this.adCoverTitle;
    }

    public List<UrlModel> getAdCoverUrl() {
        return this.adCoverUrl;
    }

    public String getAdOrderId() {
        return this.adOrderId;
    }

    public Boolean getAddYoursInvited() {
        return this.addYoursInvited;
    }

    public int getAgeGateAction() {
        return this.ageGateAction;
    }

    public AgeGateInfo getAgeGateInfo() {
        return this.ageGateInfo;
    }

    public int getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public long getAgeGateTime() {
        return this.ageGateTime;
    }

    public AGSWarning getAgsWarning() {
        return this.agsWarning;
    }

    public int getAllowStatus() {
        return this.allowStatus;
    }

    public String getAnchorScheduleGuideTxt() {
        return this.anchorScheduleGuideTxt;
    }

    public int getAtType() {
        return this.mAtType;
    }

    public long getAuthorityStatus() {
        return this.authorityStatus;
    }

    public AvatarDecoration getAvatarDecoration() {
        return this.avatarDecoration;
    }

    public UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public AvatarMetaInfo getAvatarMeta() {
        return this.avatarMeta;
    }

    public UrlModel getAvatarPendantLarger() {
        return this.avatarPendantLarger;
    }

    public UrlModel getAvatarPendantMedium() {
        return this.avatarPendantMedium;
    }

    public UrlModel getAvatarPendantThumb() {
        return this.avatarPendantThumb;
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public UrlModel getAvatarVideoUri() {
        return this.avatarVideoUri;
    }

    public int getAwemeCount() {
        return this.awemeCount;
    }

    public UserAwemeCover getAwemeCover() {
        return this.awemeCover;
    }

    public AwemeUnreadInfo getAwemeUnreadInfo() {
        return this.awemeUnreadInfo;
    }

    public CreatorFundBannerSetting getBannerSetting() {
        return this.bannerSetting;
    }

    public String getBindPhone() {
        return this.bindPhone;
    }

    public String getBioEmail() {
        return this.bioEmail;
    }

    public String getBioLocation() {
        return this.bioLocation;
    }

    public UserBioPermission getBioPermission() {
        return this.bioPermission;
    }

    public String getBioPhone() {
        return this.bioPhone;
    }

    public String getBioSecureUrl() {
        return this.bioSecureUrl;
    }

    public String getBioUrl() {
        return this.bioUrl;
    }

    public BizAccountInfo getBizAccountInfo() {
        return this.bizAccountInfo;
    }

    public int getBlockStatus() {
        return this.blockStatus;
    }

    public List<String> getBoldFields() {
        return this.boldFields;
    }

    public BlueVBrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    public List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public int getCancelType() {
        return this.cancelType;
    }

    public String getCategory() {
        return this.category;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public String getCityName() {
        return this.cityName;
    }

    public int getCollectCount() {
        return this.collectCount;
    }

    public int getCommentFilterStatus() {
        return this.commentFilterStatus;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public CommerceInfo getCommerceInfo() {
        return this.commerceInfo;
    }

    public CommercePermissionStruct getCommercePermission() {
        return this.commercePermission;
    }

    public CommerceUserInfo getCommerceUserInfo() {
        return this.commerceUserInfo;
    }

    public int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public int getCompleteProfileGuideStrategy() {
        return this.completeProfileGuideStrategy;
    }

    public int getConstellation() {
        return this.constellation;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getCountry() {
        return this.country;
    }

    public List<UrlModel> getCoverUrls() {
        return this.coverUrls;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public int getDisplayAddYoursOnProfile() {
        return this.displayAddYoursOnProfile;
    }

    public Integer getDisplayQnaOnProfile() {
        return this.displayQnaOnProfile;
    }

    public String getDistrict() {
        return this.district;
    }

    public int getDownloadSetting() {
        return this.downloadSetting;
    }

    public DspProfile getDspProfile() {
        return this.dspProfile;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public int getEducation() {
        return this.education;
    }

    public EffectArtistDetail getEffectArtistDetail() {
        return this.effectArtistDetail;
    }

    public String getEmail() {
        return this.email;
    }

    public EnterpriseUserInfo getEnterpriseUserInfo() {
        return this.enterpriseUserInfo;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public ExternalRecommendReasonStruct getExternalRecommendReasonStruct() {
        return this.externalRecommendReasonStruct;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public int getFavoritingCount() {
        return this.favoritingCount;
    }

    public long getFbExpireTime() {
        return this.fbExpireTime;
    }

    public int getFollowFrom() {
        return this.followFrom;
    }

    public String getFollowFromMsg() {
        return this.followFromMsg;
    }

    public int getFollowStatus() {
        return this.followStatus;
    }

    public int getFollowerCount() {
        return this.followerCount;
    }

    public List<FollowerDetail> getFollowerDetailList() {
        return this.followerDetailList;
    }

    public int getFollowerStatus() {
        return this.followerStatus;
    }

    public int getFollowingCount() {
        return this.followingCount;
    }

    public int getFriendCount() {
        return this.friendCount;
    }

    public String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public int getFriendsStatus() {
        return this.friendsStatus;
    }

    public FriendsTabRelatedUserInfo getFriendsTabInfo() {
        return this.friendsTabInfo;
    }

    public GeneralPermission getGeneralPermission() {
        return this.mGeneralPermission;
    }

    public int getGiftBagStatus() {
        return this.giftBagStatus;
    }

    public long getHandleModified() {
        return this.uniqueIdModifyTime;
    }

    public boolean getHasAnalyticsMetrics() {
        return this.hasAnalyticsMetrics;
    }

    public int getHideFollowingFollowerList() {
        return this.hideFollowingFollowerList;
    }

    public List<HighlightInfo> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public List<HomePageBottomToast> getHomepageBottomToast() {
        return this.homepageBottomToast;
    }

    public HonorStruct getHonorStruct() {
        return this.honorStruct;
    }

    public String getInsId() {
        return this.insId;
    }

    public boolean getIsCreater() {
        return this.isCreater;
    }

    public boolean getIsOldDouPlusUser() {
        return this.isOldDouplusUser;
    }

    public boolean getIsUserDataMiss() {
        return this.isUserDataMiss;
    }

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    public String getLanguage() {
        return this.language;
    }

    public Long getLastActiveTime() {
        return this.lastActiveTime;
    }

    public LatestUnreadVideoInfo getLatestUnreadVideoInfo() {
        return this.latestUnreadVideoInfo;
    }

    public int getLiveAgreement() {
        return this.liveAgreement;
    }

    public LiveAnchorInfo getLiveAnchorInfo() {
        return this.liveAnchorInfo;
    }

    public List<LiveEventStruct> getLiveEventStructList() {
        return this.mLiveEventStructList;
    }

    public int getLivePushNotificationStatus() {
        return this.livePushNotificationStatus;
    }

    public int getLoginPlatform() {
        return this.loginPlatform;
    }

    public TTMallTabRelatedUserInfo getMallTabUserInfo() {
        return this.mallTabUserInfo;
    }

    public MatchedFriendStruct getMatchedFriendStruct() {
        return this.matchedFriendStruct;
    }

    public int getMixListNum() {
        return this.mixListNum;
    }

    public int getMixListStatus() {
        return this.mixListStatus;
    }

    public int getMusicComplianceAccount() {
        return this.musicComplianceAccount;
    }

    public MusicTabInfo getMusicTabInfo() {
        return this.musicTabInfo;
    }

    public List<UrlModel> getMutualRelationAvatars() {
        return this.mutualRelationAvatars;
    }

    public int getMutualRelationNumber() {
        return this.mutualRelationNumber;
    }

    public String getMutualRelationTag() {
        return this.mutualRelationTag;
    }

    public MutualStruct getMutualStruct() {
        return this.mMutualStruct;
    }

    public String getNameField() {
        return this.nameField;
    }

    public List<NeedPointStruct> getNeedPoints() {
        return this.needPoints;
    }

    public int getNewFollowerCount() {
        return this.newFollowerCount;
    }

    public int getNickNameModifyTs() {
        return this.nickNameModifyTs;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getNotifyPrivateAccount() {
        return this.notifyPrivateAccount;
    }

    public OriginalMusician getOriginalMusician() {
        return this.originalMusician;
    }

    public PaidContentAwareBannerSetting getPaidContentAwareBannerSetting() {
        return this.paidContentAwareBannerSetting;
    }

    public PaidContentBannerSetting getPaidContentBannerSetting() {
        return this.paidContentBannerSetting;
    }

    public PlatformInfo[] getPlatformInfos() {
        return this.platformInfos;
    }

    public PotentialBizAccountInfo getPotentialBizAccountInfo() {
        return this.potentialBizAccountInfo;
    }

    public String getPredictedAgeGroup() {
        return this.predictedAgeGroup;
    }

    public PrivacySetting getPrivacySetting() {
        return this.privacySetting;
    }

    public int getPrivateAwemeCount() {
        return this.privateAwemeCount;
    }

    public int getProAccountUpdateNotificationStatus() {
        return this.proAccountUpdateNotificationStatus;
    }

    public ProfileBadgeStruct getProfileBadge() {
        return this.mProfileBadgeStruct;
    }

    public float getProfileCompletion() {
        return this.profileCompletion;
    }

    public ProfileNgoStruct getProfileNgoStruct() {
        return this.mProfileNgoStruct;
    }

    public long getProfilePv() {
        return this.profilePv;
    }

    public UserPronounsInfo getPronounsInfo() {
        return this.mPronounsInfo;
    }

    public String getProvince() {
        return this.province;
    }

    public int getQnaStatus() {
        return this.qnaStatus;
    }

    public QuickShopInfo getQuickShopInfo() {
        return this.quickShopInfo;
    }

    public String getRecType() {
        return this.recType;
    }

    public List<RecommendAwemeItem> getRecommendAwemeItems() {
        return this.recommendAwemeItems;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRecommendReasonRelation() {
        return this.recommendReasonRelation;
    }

    public double getRecommendScore() {
        return this.recommendScore;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegisterFrom() {
        return this.registerFrom;
    }

    public int getRegisterStatus() {
        return this.registerStatus;
    }

    public long getRegisterTime() {
        return this.registerTime;
    }

    public String getRelationLabel() {
        return this.relationLabel;
    }

    public String getRelationShip() {
        return this.relationShip;
    }

    public List<RelativeUserInfo> getRelativeUserInfos() {
        return this.relativeUserInfos;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public int getRepostCount() {
        return this.repostCount;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getRoomTitle() {
        return this.roomTitle;
    }

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public String getRooomData() {
        return this.roomData;
    }

    public int getSchoolInfoShowRange() {
        return this.schoolInfoShowRange;
    }

    public String getSearchUserDesc() {
        return this.searchUserDesc;
    }

    public String getSearchUserName() {
        return this.searchUserName;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShieldCommentNotice() {
        return this.shieldCommentNotice;
    }

    public int getShieldDiggNotice() {
        return this.shieldDiggNotice;
    }

    public List<ShieldEditFieldInfo> getShieldEditFieldInfoList() {
        return this.shieldEditFieldInfoList;
    }

    public int getShieldFollowNotice() {
        return this.shieldFollowNotice;
    }

    public ShopEntranceInfo getShopEntrance() {
        return this.shopEntrance;
    }

    public String getShopMicroApp() {
        return this.shopMicroApp;
    }

    public String getShortId() {
        return this.shortId;
    }

    public int getShowArtistPlaylist() {
        return this.showArtistPlaylist;
    }

    public boolean getShowTipEntry() {
        return this.showTipEntry;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSignatureLanguage() {
        return this.signatureLanguage;
    }

    public int getSignatureModifyTime() {
        return this.signatureModifyTime;
    }

    public String getSocialInfo() {
        return this.socialInfo;
    }

    public HotSearchSprintStruct getSprintSupportUserInfo() {
        return this.sprintSupportUserInfo;
    }

    public int getStarBillboardRank() {
        return this.starBillboardRank;
    }

    public int getStitchSetting() {
        return this.stitchSetting;
    }

    public StoryBlockInfo getStoryBlockInfo() {
        return this.storyBlockInfo;
    }

    public int getStoryStatus() {
        return this.storyStatus;
    }

    public TabSetting getTabSetting() {
        return this.tabSetting;
    }

    public int getTabType() {
        return this.tabType;
    }

    public int getTaggedBAInvitationStatus() {
        return this.taggedBAInvitationStatus;
    }

    public boolean getTaggedIsBA() {
        return this.taggedIsBA;
    }

    public long getTotalFavorited() {
        return this.totalFavorited;
    }

    public long getTwExpireTime() {
        return this.twExpireTime;
    }

    public String getTwitterId() {
        return this.twitterId;
    }

    public String getTwitterName() {
        return this.twitterName;
    }

    public long[] getTypeLabels() {
        return this.typeLabels;
    }

    public String getUid() {
        return this.uid;
    }

    public UnReadVideoInfo getUnReadVideoInfo() {
        return this.unReadVideoInfo;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public UrgeStruct getUrgeDetail() {
        return this.urgeDetail;
    }

    public List<Integer> getUserAdvancedFeaturesOrder() {
        return this.userAdvancedFeaturesOrder;
    }

    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public UserHonor getUserHonor() {
        return this.userHonor;
    }

    public int getUserMode() {
        return this.userMode;
    }

    public UserNowPackStruct getUserNowPackStruct() {
        return this.userNowPackStruct;
    }

    public int getUserPeriod() {
        return this.userPeriod;
    }

    public List<UserProfileGuide> getUserProfileGuide() {
        return this.userProfileGuide;
    }

    public int getUserRate() {
        return this.userRate;
    }

    public UserRateRemindInfo getUserRateRemindInfo() {
        return this.userRateRemindInfo;
    }

    public int getVerificationBadgeType() {
        return this.verificationBadgeType;
    }

    public int getVerificationType() {
        return this.verificationType;
    }

    public String getVerifyInfo() {
        return this.verifyInfo;
    }

    public VideoCover getVideoCover() {
        return this.videoCover;
    }

    public int getVideoGiftStatus() {
        return this.videoGiftStatus;
    }

    public int getViewerType() {
        return this.viewerType;
    }

    public int getWatchwStatus() {
        return this.watchStatus;
    }

    public List<UrlModel> getWhiteCoverUrl() {
        return this.whiteCoverUrl;
    }

    public int getXmasUnlockCount() {
        return this.xmasUnlockCount;
    }

    public long getYouTubeLastRefreshTime() {
        return this.youTubeLastRefreshTime;
    }

    public String getYouTubeRefreshToken() {
        return this.youTubeRefreshToken;
    }

    public String getYoutubeChannelId() {
        return this.youtubeChannelId;
    }

    public String getYoutubeChannelTitle() {
        return this.youtubeChannelTitle;
    }

    public long getYoutubeExpireTime() {
        return this.youtubeExpireTime;
    }

    public String getYoutubeRawRefreshToken() {
        return this.youtubeRawRefreshToken;
    }

    public HotListStruct getmHotListStruct() {
        return this.mHotListStruct;
    }

    public RocketFansGroupInfo getrFansGroupInfo() {
        return this.rFansGroupInfo;
    }

    public boolean isAcceptPrivatePolicy() {
        return this.acceptPrivatePolicy;
    }

    public boolean isActivityUser() {
        return this.isActivityUser;
    }

    public boolean isAdFake() {
        return this.isAdFake;
    }

    public boolean isAdVirtual() {
        return this.isAdVirtual;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public boolean isCanModifySchoolInfo() {
        return this.canModifySchoolInfo;
    }

    public boolean isCanSetGeoFencing() {
        return this.canSetGeoFencing;
    }

    public boolean isCheckDMPermission() {
        return this.checkDMPermission;
    }

    public boolean isContactsSyncStatus() {
        return this.contactsSyncStatus;
    }

    public boolean isContentLanguageDialogShown() {
        return this.isContentLanguageDialogShown;
    }

    public boolean isDisciplineMember() {
        return this.isDisciplineMember;
    }

    public boolean isDisplayWvalantineActivityEntry() {
        return this.displayWvalantineActivityEntry;
    }

    public boolean isEffectArtist() {
        return this.isEffectArtist;
    }

    public boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public boolean isEnableDirectMessage() {
        return this.enableDirectMessage;
    }

    public boolean isEnableSubscription() {
        return this.enableSubscription;
    }

    public boolean isForcePrivateAccount() {
        return this.forcePrivateAccount;
    }

    public boolean isGeoBlocked() {
        return this.isGeoBlocked;
    }

    public boolean isHasEmail() {
        return this.hasEmail;
    }

    public boolean isHasFacebookToken() {
        return this.hasFacebookToken;
    }

    public boolean isHasOrders() {
        return this.hasOrders;
    }

    public boolean isHasTwitterToken() {
        return this.hasTwitterToken;
    }

    public boolean isHasYoutubeToken() {
        return this.hasYoutubeToken;
    }

    public boolean isHideSearch() {
        return this.hideSearch;
    }

    public boolean isHideShootButton() {
        return this.hideShootButton;
    }

    public boolean isLiveCommerce() {
        return this.liveCommerce;
    }

    public boolean isMatchedFriendAvailable() {
        return this.matchedFriendAvailable;
    }

    public boolean isMentionEnabled() {
        return this.mMentionEnabled;
    }

    public boolean isNeedAddrCard() {
        return this.needAddrCard;
    }

    public boolean isNeedRecommend() {
        return this.needRecommend;
    }

    public boolean isNewRecommend() {
        return this.isNewRecommend;
    }

    public boolean isPhoneBinded() {
        return this.isPhoneBinded;
    }

    public boolean isPostDefaultDownloadSetting() {
        return this.postDefaultDownloadSetting;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public boolean isProAccount() {
        return this.isProAccount;
    }

    public boolean isSecret() {
        return this.secret;
    }

    public boolean isShould_write_impr() {
        return this.shouldWriteImpr;
    }

    public boolean isShowEffectList() {
        return this.showEffectList;
    }

    public boolean isShowFavoriteList() {
        return this.showFavoriteList;
    }

    public boolean isShowImageBubble() {
        return this.showImageBubble;
    }

    public boolean isShowMessageButton() {
        return this.showMessageButton;
    }

    public boolean isStar() {
        return this.isStar;
    }

    public boolean isTranslator() {
        return this.isTranslator;
    }

    public boolean isUserCancelled() {
        return this.userCancelled;
    }

    public boolean isUserInactive() {
        return this.userInactive;
    }

    public boolean isVideoViewIsAuth() {
        return this.videoViewIsAuth;
    }

    public boolean isWithCommerceEnterpriseTabEntry() {
        return this.withCommerceEnterpriseTabEntry;
    }

    public boolean isWithCommerceEntry() {
        return this.withCommerceEntry;
    }

    public boolean isWithCommerceNewbieTask() {
        return this.withCommerceNewbieTask;
    }

    public boolean isWithDouplusEntry() {
        return this.withDouplusEntry;
    }

    public boolean isWithItemCommerceEntry() {
        return this.withItemCommerceEntry;
    }

    public boolean isWithNewGoods() {
        return this.withNewGoods;
    }

    public boolean isWithShopEntry() {
        return this.withShopEntry;
    }

    public boolean isWithStarAtlasEntry() {
        return this.withStarAtlasEntry;
    }

    public boolean nicknameUpdateReminder() {
        return this.nicknameUpdateReminder;
    }

    private boolean checkExpire(long j) {
        if ((System.currentTimeMillis() / 1000) - j > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        if (this.allowStatus != user.allowStatus || this.followStatus != user.followStatus || this.followerStatus != user.followerStatus || this.friendsStatus != user.friendsStatus || this.watchStatus != user.watchStatus || this.awemeCount != user.awemeCount || this.followingCount != user.followingCount || this.followerCount != user.followerCount || this.newFollowerCount != user.newFollowerCount || this.collectCount != user.collectCount || this.friendCount != user.friendCount || this.totalFavorited != user.totalFavorited || this.favoritingCount != user.favoritingCount || this.registerStatus != user.registerStatus || this.hideSearch != user.hideSearch || this.mAtType != user.mAtType || this.constellation != user.constellation || this.needRecommend != user.needRecommend || this.secret != user.secret || this.isPrivateAccount != user.isPrivateAccount || this.isBlocked != user.isBlocked || this.isBlock != user.isBlock || this.livePushNotificationStatus != user.livePushNotificationStatus) {
            return false;
        }
        String str = this.uid;
        if (str == null ? user.uid != null : !str.equals(user.uid)) {
            return false;
        }
        String str2 = this.shortId;
        if (str2 == null ? user.shortId != null : !str2.equals(user.shortId)) {
            return false;
        }
        String str3 = this.nickname;
        if (str3 == null ? user.nickname != null : !str3.equals(user.nickname)) {
            return false;
        }
        String str4 = this.remarkName;
        if (str4 == null ? user.remarkName != null : !str4.equals(user.remarkName)) {
            return false;
        }
        String str5 = this.signature;
        if (str5 == null ? user.signature != null : !str5.equals(user.signature)) {
            return false;
        }
        String str6 = this.birthday;
        if (str6 == null ? user.birthday != null : !str6.equals(user.birthday)) {
            return false;
        }
        UrlModel urlModel = this.avatarLarger;
        if (urlModel == null ? user.avatarLarger != null : !urlModel.equals(user.avatarLarger)) {
            return false;
        }
        UrlModel urlModel2 = this.avatarThumb;
        if (urlModel2 == null ? user.avatarThumb != null : !urlModel2.equals(user.avatarThumb)) {
            return false;
        }
        UrlModel urlModel3 = this.avatarMedium;
        if (urlModel3 == null ? user.avatarMedium != null : !urlModel3.equals(user.avatarMedium)) {
            return false;
        }
        UrlModel urlModel4 = this.avatarVideoUri;
        if (urlModel4 == null ? user.avatarVideoUri != null : !urlModel4.equals(user.avatarVideoUri)) {
            return false;
        }
        AvatarMetaInfo avatarMetaInfo = this.avatarMeta;
        if (avatarMetaInfo == null ? user.avatarMeta != null : !avatarMetaInfo.equals(user.avatarMeta)) {
            return false;
        }
        String str7 = this.thirdName;
        if (str7 == null ? user.thirdName != null : !str7.equals(user.thirdName)) {
            return false;
        }
        String str8 = this.customVerify;
        if (str8 == null ? user.customVerify != null : !str8.equals(user.customVerify)) {
            return false;
        }
        String str9 = this.uniqueId;
        if (str9 == null ? user.uniqueId != null : !str9.equals(user.uniqueId)) {
            return false;
        }
        ShareInfo shareInfo = this.shareInfo;
        if (shareInfo == null ? user.shareInfo != null : !shareInfo.equals(user.shareInfo)) {
            return false;
        }
        Long l = this.createTime;
        if (l == null ? user.createTime != null : !l.equals(user.createTime)) {
            return false;
        }
        if (this.preventDownload != user.preventDownload || this.showImageBubble != user.showImageBubble || this.acceptPrivatePolicy != user.acceptPrivatePolicy || this.commentSetting != user.commentSetting || this.duetSetting != user.duetSetting || this.stitchSetting != user.stitchSetting || this.hasEmail != user.hasEmail || this.downloadSetting != user.downloadSetting) {
            return false;
        }
        String str10 = this.region;
        if (str10 == null ? user.region != null : !str10.equals(user.region)) {
            return false;
        }
        String str11 = this.language;
        if (str11 == null ? user.language != null : !str11.equals(user.language)) {
            return false;
        }
        String str12 = this.roomTypeTag;
        if (str12 == null ? user.roomTypeTag != null : !str12.equals(user.roomTypeTag)) {
            return false;
        }
        Long l2 = this.latestOrderTime;
        if (l2 == null ? user.latestOrderTime != null : !l2.equals(user.latestOrderTime)) {
            return false;
        }
        if (this.isTranslator != user.isTranslator) {
            return false;
        }
        String str13 = this.bindPhone;
        String str14 = user.bindPhone;
        if (str13 != null) {
            return str13.equals(str14);
        }
        if (str14 == null) {
            return true;
        }
        return false;
    }

    public UrlModel getCoverUrlWithMode(boolean z) {
        if (z) {
            return (UrlModel) ListProtector.get(getCoverUrls(), 0);
        }
        return (UrlModel) ListProtector.get(getWhiteCoverUrl(), 0);
    }

    public PlatformInfo getPlatformInfo(String str) {
        PlatformInfo[] platformInfoArr;
        if (!TextUtils.isEmpty(str) && (platformInfoArr = this.platformInfos) != null) {
            for (PlatformInfo platformInfo : platformInfoArr) {
                if (str.equals(platformInfo.getPatformName())) {
                    return platformInfo;
                }
            }
            return null;
        }
        return null;
    }

    public void setAcceptPrivatePolicy(boolean z) {
        this.acceptPrivatePolicy = z;
    }

    public void setAccountLabelInfos(List<AccountLabelInfo> list) {
        this.accountLabelInfos = list;
    }

    public void setAccountRegion(String str) {
        this.accountRegion = str;
    }

    public void setAccountType(int i) {
        this.accountType = i;
    }

    public void setActivityUser(boolean z) {
        this.isActivityUser = z;
    }

    public void setAdAuthorDesc(String str) {
        this.adAuthorDesc = str;
    }

    public void setAdAuthorization(boolean z) {
        if (this.commerceUserInfo == null) {
            this.commerceUserInfo = new CommerceUserInfo();
        }
        this.commerceUserInfo.adAuthorization = z;
    }

    public void setAdCoverTitle(AdCoverTitle adCoverTitle) {
        this.adCoverTitle = adCoverTitle;
    }

    public void setAdCoverUrl(List<UrlModel> list) {
        this.adCoverUrl = list;
    }

    public void setAdFake(boolean z) {
        this.isAdFake = z;
    }

    public void setAdOrderId(String str) {
        this.adOrderId = str;
    }

    public void setAdVirtual(boolean z) {
        this.isAdVirtual = z;
    }

    public void setAddYoursInvited(Boolean bool) {
        this.addYoursInvited = bool;
    }

    public void setAgeGateAction(int i) {
        this.ageGateAction = i;
    }

    public void setAgeGateInfo(AgeGateInfo ageGateInfo) {
        this.ageGateInfo = ageGateInfo;
    }

    public void setAgeGatePostAction(int i) {
        this.ageGatePostAction = i;
    }

    public void setAgeGateTime(int i) {
        this.ageGateTime = i;
    }

    public void setAllowStatus(int i) {
        this.allowStatus = i;
    }

    public void setAnchorScheduleGuideTxt(String str) {
        this.anchorScheduleGuideTxt = str;
    }

    public void setAtType(int i) {
        this.mAtType = i;
    }

    public void setAuthorityStatus(long j) {
        this.authorityStatus = j;
    }

    public void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
    }

    public void setAvatarMeta(AvatarMetaInfo avatarMetaInfo) {
        this.avatarMeta = avatarMetaInfo;
    }

    public void setAvatarPendantLarger(UrlModel urlModel) {
        this.avatarPendantLarger = urlModel;
    }

    public void setAvatarPendantMedium(UrlModel urlModel) {
        this.avatarPendantMedium = urlModel;
    }

    public void setAvatarPendantThumb(UrlModel urlModel) {
        this.avatarPendantThumb = urlModel;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setAvatarUpdateReminder(boolean z) {
        this.avatarUpdateReminder = z;
    }

    public void setAvatarVideoUri(UrlModel urlModel) {
        this.avatarVideoUri = urlModel;
    }

    public void setAwemeCount(int i) {
        this.awemeCount = i;
    }

    public void setAwemeCover(UserAwemeCover userAwemeCover) {
        this.awemeCover = userAwemeCover;
    }

    public void setAwemeUnreadInfo(AwemeUnreadInfo awemeUnreadInfo) {
        this.awemeUnreadInfo = awemeUnreadInfo;
    }

    public void setBannerSetting(CreatorFundBannerSetting creatorFundBannerSetting) {
        this.bannerSetting = creatorFundBannerSetting;
    }

    public void setBindPhone(String str) {
        this.bindPhone = str;
    }

    public void setBioEmail(String str) {
        this.bioEmail = str;
    }

    public void setBioLocation(String str) {
        this.bioLocation = str;
    }

    public void setBioPermission(UserBioPermission userBioPermission) {
        this.bioPermission = userBioPermission;
    }

    public void setBioPhone(String str) {
        this.bioPhone = str;
    }

    public void setBioSecureUrl(String str) {
        this.bioSecureUrl = str;
    }

    public void setBioUrl(String str) {
        this.bioUrl = str;
    }

    public void setBizAccountInfo(BizAccountInfo bizAccountInfo) {
        this.bizAccountInfo = bizAccountInfo;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlockStatus(int i) {
        this.blockStatus = i;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public void setBoldFields(List<String> list) {
        this.boldFields = list;
    }

    public void setBrandInfo(BlueVBrandInfo blueVBrandInfo) {
        this.brandInfo = blueVBrandInfo;
    }

    public void setBroadcasterRoomId(long j) {
        this.roomId = j;
    }

    public void setCanMessageFollowStatusList(List<Integer> list) {
        this.canMessageFollowStatusList = list;
    }

    public void setCanModifySchoolInfo(boolean z) {
        this.canModifySchoolInfo = z;
    }

    public void setCancelType(int i) {
        this.cancelType = i;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setCheckDMPermission(boolean z) {
        this.checkDMPermission = z;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setCollectCount(int i) {
        this.collectCount = i;
    }

    public void setCommentFilterStatus(int i) {
        this.commentFilterStatus = i;
    }

    public void setCommentSetting(int i) {
        this.commentSetting = i;
    }

    public void setCommerceInfo(CommerceInfo commerceInfo) {
        this.commerceInfo = commerceInfo;
    }

    public void setCommerceUserLevel(int i) {
        this.commerceUserLevel = i;
    }

    public void setCompleteProfileGuideStrategy(int i) {
        this.completeProfileGuideStrategy = i;
    }

    public void setConstellation(int i) {
        this.constellation = i;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContactsSyncStatus(boolean z) {
        this.contactsSyncStatus = z;
    }

    public void setContentLanguageDialogShown(boolean z) {
        this.isContentLanguageDialogShown = z;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCoverUrls(List<UrlModel> list) {
        this.coverUrls = list;
    }

    public void setCreateTime(Long l) {
        this.createTime = l;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setDisciplineMember(boolean z) {
        this.isDisciplineMember = z;
    }

    public void setDisplayAddYoursOnProfile(int i) {
        this.displayAddYoursOnProfile = i;
    }

    public void setDisplayQnaOnProfile(Integer num) {
        this.displayQnaOnProfile = num;
    }

    public void setDisplayWvalantineActivityEntry(boolean z) {
        this.displayWvalantineActivityEntry = z;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setDownloadSetting(int i) {
        this.downloadSetting = i;
    }

    public void setDspProfile(DspProfile dspProfile) {
        this.dspProfile = dspProfile;
    }

    public void setDuetSetting(int i) {
        this.duetSetting = i;
    }

    public void setEducation(int i) {
        this.education = i;
    }

    public void setEffectArtist(boolean z) {
        this.isEffectArtist = z;
    }

    public void setEffectArtistDetail(EffectArtistDetail effectArtistDetail) {
        this.effectArtistDetail = effectArtistDetail;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEmailVerified(boolean z) {
        this.isEmailVerified = z;
    }

    public void setEnableDirectMessage(boolean z) {
        this.enableDirectMessage = z;
    }

    public void setEnableSubscription(boolean z) {
        this.enableSubscription = z;
    }

    public void setEnterpriseUserInfo(EnterpriseUserInfo enterpriseUserInfo) {
        this.enterpriseUserInfo = enterpriseUserInfo;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public void setExternalRecommendReasonStruct(ExternalRecommendReasonStruct externalRecommendReasonStruct) {
        this.externalRecommendReasonStruct = externalRecommendReasonStruct;
    }

    public void setFansCount(int i) {
        this.fansCount = i;
    }

    public void setFavoritingCount(int i) {
        this.favoritingCount = i;
    }

    public void setFbExpireTime(long j) {
        this.fbExpireTime = j;
    }

    public void setFollowFrom(int i) {
        this.followFrom = i;
    }

    public void setFollowFromMsg(String str) {
        this.followFromMsg = str;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setFollowerCount(int i) {
        this.followerCount = i;
    }

    public void setFollowerDetailList(List<FollowerDetail> list) {
        this.followerDetailList = list;
    }

    public void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public void setFollowingCount(int i) {
        this.followingCount = i;
    }

    public void setForcePrivateAccount(boolean z) {
        this.forcePrivateAccount = z;
    }

    public void setFriendCount(int i) {
        this.friendCount = i;
    }

    public void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public void setFriendsStatus(int i) {
        this.friendsStatus = i;
    }

    public void setFriendsTabInfo(FriendsTabRelatedUserInfo friendsTabRelatedUserInfo) {
        this.friendsTabInfo = friendsTabRelatedUserInfo;
    }

    public void setGeneralPermission(GeneralPermission generalPermission) {
        this.mGeneralPermission = generalPermission;
    }

    public void setGeoBlocked(boolean z) {
        this.isGeoBlocked = z;
    }

    public void setGiftBagStatus(int i) {
        this.giftBagStatus = i;
    }

    public void setHandleModified(long j) {
        this.uniqueIdModifyTime = j;
    }

    public void setHasEmail(boolean z) {
        this.hasEmail = z;
    }

    public void setHasFacebookToken(boolean z) {
        this.hasFacebookToken = z;
    }

    public void setHasOrders(boolean z) {
        this.hasOrders = z;
    }

    public void setHasTwitterToken(boolean z) {
        this.hasTwitterToken = z;
    }

    public void setHasYoutubeToken(boolean z) {
        this.hasYoutubeToken = z;
    }

    public void setHideFollowingFollowerList(int i) {
        this.hideFollowingFollowerList = i;
    }

    public void setHideSearch(boolean z) {
        this.hideSearch = z;
    }

    public void setHideShootButton(boolean z) {
        this.hideShootButton = z;
    }

    public void setHighlightInfoList(List<HighlightInfo> list) {
        this.mHighlightInfoList = list;
    }

    public void setHonorStruct(HonorStruct honorStruct) {
        this.honorStruct = honorStruct;
    }

    public void setInsId(String str) {
        this.insId = str;
    }

    public void setIsCreater(boolean z) {
        this.isCreater = z;
    }

    public void setIsFeatureVideoChanged(Boolean bool) {
        this.isFeatureVideoChanged = bool.booleanValue();
    }

    public void setIsOldDouplusUser(boolean z) {
        this.isOldDouplusUser = z;
    }

    public void setIsPotentialBA(PotentialBizAccountInfo potentialBizAccountInfo) {
        this.potentialBizAccountInfo = potentialBizAccountInfo;
    }

    public void setIsTranslator(boolean z) {
        this.isTranslator = z;
    }

    public void setIsoCountryCode(String str) {
        this.isoCountryCode = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLatestOrderTime(Long l) {
        this.latestOrderTime = l;
    }

    public void setLiveAgreement(int i) {
        this.liveAgreement = i;
    }

    public void setLiveAnchorInfo(LiveAnchorInfo liveAnchorInfo) {
        this.liveAnchorInfo = liveAnchorInfo;
    }

    public void setLiveEventStructList(List<LiveEventStruct> list) {
        this.mLiveEventStructList = list;
    }

    public void setLivePushNotificationStatus(int i) {
        this.livePushNotificationStatus = i;
    }

    public void setLoginPlatform(int i) {
        this.loginPlatform = i;
    }

    public void setMallTabUserInfo(TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo) {
        this.mallTabUserInfo = tTMallTabRelatedUserInfo;
    }

    public void setMatchedFriendAvailable(boolean z) {
        this.matchedFriendAvailable = z;
    }

    public void setMatchedFriendStruct(MatchedFriendStruct matchedFriendStruct) {
        this.matchedFriendStruct = matchedFriendStruct;
    }

    public void setMentionEnabled(boolean z) {
        this.mMentionEnabled = z;
    }

    public void setMixListNum(int i) {
        this.mixListNum = i;
    }

    public void setMusicComplianceAccount(int i) {
        this.musicComplianceAccount = i;
    }

    public void setMusicTabInfo(MusicTabInfo musicTabInfo) {
        this.musicTabInfo = musicTabInfo;
    }

    public void setMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public void setNameField(String str) {
        this.nameField = str;
    }

    public void setNeedAddrCard(boolean z) {
        this.needAddrCard = z;
    }

    public void setNeedPoints(List<NeedPointStruct> list) {
        this.needPoints = list;
    }

    public void setNeedRecommend(boolean z) {
        this.needRecommend = z;
    }

    public void setNewFollowerCount(int i) {
        this.newFollowerCount = i;
    }

    public void setNewRecommend(boolean z) {
        this.isNewRecommend = z;
    }

    public void setNickNameModifyTs(int i) {
        this.nickNameModifyTs = i;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setNicknameUpdateReminder(boolean z) {
        this.nicknameUpdateReminder = z;
    }

    public void setNormalTopCommentPermission(int i) {
        this.normalTopCommentPermission = i;
    }

    public void setNotifyPrivateAccount(int i) {
        this.notifyPrivateAccount = i;
    }

    public void setOriginalMusician(OriginalMusician originalMusician) {
        this.originalMusician = originalMusician;
    }

    public void setPaidContentAwareBannerSetting(PaidContentAwareBannerSetting paidContentAwareBannerSetting) {
        this.paidContentAwareBannerSetting = paidContentAwareBannerSetting;
    }

    public void setPaidContentBannerSetting(PaidContentBannerSetting paidContentBannerSetting) {
        this.paidContentBannerSetting = paidContentBannerSetting;
    }

    public void setPhoneBinded(boolean z) {
        this.isPhoneBinded = z;
    }

    public void setPlatformInfos(PlatformInfo[] platformInfoArr) {
        this.platformInfos = platformInfoArr;
    }

    public void setPostDefaultDownloadSetting(boolean z) {
        this.postDefaultDownloadSetting = z;
    }

    public void setPredictedAgeGroup(String str) {
        this.predictedAgeGroup = str;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPrivacySetting(PrivacySetting privacySetting) {
        this.privacySetting = privacySetting;
    }

    public void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public void setPrivateAwemeCount(int i) {
        this.privateAwemeCount = i;
    }

    public void setProAccountUpdateNotificationStatus(int i) {
        this.proAccountUpdateNotificationStatus = i;
    }

    public void setProfileBadgeStruct(ProfileBadgeStruct profileBadgeStruct) {
        this.mProfileBadgeStruct = profileBadgeStruct;
    }

    public void setProfileNgoStruct(ProfileNgoStruct profileNgoStruct) {
        this.mProfileNgoStruct = profileNgoStruct;
    }

    public void setPronouns(UserPronounsInfo userPronounsInfo) {
        this.mPronounsInfo = userPronounsInfo;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setQnaStatus(int i) {
        this.qnaStatus = i;
    }

    public void setQuickShopInfo(QuickShopInfo quickShopInfo) {
        this.quickShopInfo = quickShopInfo;
    }

    public void setRecType(String str) {
        this.recType = str;
    }

    public void setRecommendAwemeItems(List<RecommendAwemeItem> list) {
        this.recommendAwemeItems = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendReasonRelation(String str) {
        this.recommendReasonRelation = str;
    }

    public void setRecommendScore(double d) {
        this.recommendScore = d;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRegisterFrom(String str) {
        this.registerFrom = str;
    }

    public void setRegisterStatus(int i) {
        this.registerStatus = i;
    }

    public void setRegisterTime(long j) {
        this.registerTime = j;
    }

    public void setRelationLabel(String str) {
        this.relationLabel = str;
    }

    public void setRelativeUserInfos(List<RelativeUserInfo> list) {
        this.relativeUserInfos = list;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setRepostCount(int i) {
        this.repostCount = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRoomData(String str) {
        this.roomData = str;
    }

    public void setSchoolInfoShowRange(int i) {
        this.schoolInfoShowRange = i;
    }

    public void setSearchUserDesc(String str) {
        this.searchUserDesc = str;
    }

    public void setSearchUserName(String str) {
        this.searchUserName = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(boolean z) {
        this.secret = z;
    }

    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void setShieldCommentNotice(int i) {
        this.shieldCommentNotice = i;
    }

    public void setShieldDiggNotice(int i) {
        this.shieldDiggNotice = i;
    }

    public void setShieldEditFieldInfoList(List<ShieldEditFieldInfo> list) {
        this.shieldEditFieldInfoList = list;
    }

    public void setShieldFollowNotice(int i) {
        this.shieldFollowNotice = i;
    }

    public void setShopEntrance(ShopEntranceInfo shopEntranceInfo) {
        this.shopEntrance = shopEntranceInfo;
    }

    public void setShortId(String str) {
        this.shortId = str;
    }

    public void setShould_write_impr(boolean z) {
        this.shouldWriteImpr = z;
    }

    public void setShowArtistPlaylist(int i) {
        this.showArtistPlaylist = i;
    }

    public void setShowEffectList(boolean z) {
        this.showEffectList = z;
    }

    public void setShowFavoriteList(boolean z) {
        this.showFavoriteList = z;
    }

    public void setShowImageBubble(boolean z) {
        this.showImageBubble = z;
    }

    public void setShowMessageButton(boolean z) {
        this.showMessageButton = z;
    }

    public void setShowTipEntry(boolean z) {
        this.showTipEntry = z;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSignatureLanguage(String str) {
        this.signatureLanguage = str;
    }

    public void setSignatureModifyTime(int i) {
        this.signatureModifyTime = i;
    }

    public void setSocialData(SocialDataStruct socialDataStruct) {
        this.socialData = socialDataStruct;
    }

    public void setSocialInfo(String str) {
        this.socialInfo = str;
    }

    public void setSprintSupportUserInfo(HotSearchSprintStruct hotSearchSprintStruct) {
        this.sprintSupportUserInfo = hotSearchSprintStruct;
    }

    public void setStar(boolean z) {
        this.isStar = z;
    }

    public void setStarBillboardRank(int i) {
        this.starBillboardRank = i;
    }

    public void setStitchSetting(int i) {
        this.stitchSetting = i;
    }

    public void setStoryBlockInfo(StoryBlockInfo storyBlockInfo) {
        this.storyBlockInfo = storyBlockInfo;
    }

    public void setStoryStatus(int i) {
        this.storyStatus = i;
    }

    public void setTabSetting(TabSetting tabSetting) {
        this.tabSetting = tabSetting;
    }

    public void setTabType(int i) {
        this.tabType = i;
    }

    public void setTaggedBAInvitationStatus(int i) {
        this.taggedBAInvitationStatus = i;
    }

    public void setTaggedIsBA(boolean z) {
        this.taggedIsBA = z;
    }

    public void setTotalFavorited(long j) {
        this.totalFavorited = j;
    }

    public void setTwExpireTime(long j) {
        this.twExpireTime = j;
    }

    public void setTwitterId(String str) {
        this.twitterId = str;
    }

    public void setTwitterName(String str) {
        this.twitterName = str;
    }

    public void setTypeLabels(long[] jArr) {
        this.typeLabels = jArr;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUnReadVideoCount(int i) {
        UnReadVideoInfo unReadVideoInfo = this.unReadVideoInfo;
        if (unReadVideoInfo != null) {
            unReadVideoInfo.setUnReadCount(i);
        }
    }

    public void setUnReadVideoInfo(UnReadVideoInfo unReadVideoInfo) {
        this.unReadVideoInfo = unReadVideoInfo;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setUrgeDetail(UrgeStruct urgeStruct) {
        this.urgeDetail = urgeStruct;
    }

    public void setUserAdvancedFeaturesOrder(List<Integer> list) {
        this.userAdvancedFeaturesOrder = list;
    }

    public void setUserCancelled(boolean z) {
        this.userCancelled = z;
    }

    public void setUserDisplayName(String str) {
        this.userDisplayName = str;
    }

    public void setUserHonor(UserHonor userHonor) {
        this.userHonor = userHonor;
    }

    public void setUserInactive(boolean z) {
        this.userInactive = z;
    }

    public void setUserMode(int i) {
        this.userMode = i;
    }

    public void setUserNowPackStruct(UserNowPackStruct userNowPackStruct) {
        this.userNowPackStruct = userNowPackStruct;
    }

    public void setUserPeriod(int i) {
        this.userPeriod = i;
    }

    public void setUserProfileGuide(List<UserProfileGuide> list) {
        this.userProfileGuide = list;
    }

    public void setUserRate(int i) {
        this.userRate = i;
    }

    public void setUserRateRemindInfo(UserRateRemindInfo userRateRemindInfo) {
        this.userRateRemindInfo = userRateRemindInfo;
    }

    public void setVerificationType(int i) {
        this.verificationType = i;
    }

    public void setVerifyInfo(String str) {
        this.verifyInfo = str;
    }

    public void setVideoCover(VideoCover videoCover) {
        this.videoCover = videoCover;
    }

    public void setVideoGiftStatus(int i) {
        this.videoGiftStatus = i;
    }

    public void setWatchStatus(int i) {
        this.watchStatus = i;
    }

    public void setWhiteCoverUrl(List<UrlModel> list) {
        this.whiteCoverUrl = list;
    }

    public void setWithCommerceEnterpriseTabEntry(boolean z) {
        this.withCommerceEnterpriseTabEntry = z;
    }

    public void setWithCommerceEntry(boolean z) {
        this.withCommerceEntry = z;
    }

    public void setWithCommerceNewbieTask(boolean z) {
        this.withCommerceNewbieTask = z;
    }

    public void setWithDouplusEntry(boolean z) {
        this.withDouplusEntry = z;
    }

    public void setWithItemCommerceEntry(boolean z) {
        this.withItemCommerceEntry = z;
    }

    public void setWithNewGoods(boolean z) {
        this.withNewGoods = z;
    }

    public void setWithShopEntry(boolean z) {
        this.withShopEntry = z;
    }

    public void setXmasUnlockCount(int i) {
        this.xmasUnlockCount = i;
    }

    public void setYouTubeLastRefreshTime(long j) {
        this.youTubeLastRefreshTime = j;
    }

    public void setYouTubeRefreshToken(String str) {
        this.youTubeRefreshToken = str;
    }

    public void setYoutubeChannelId(String str) {
        this.youtubeChannelId = str;
    }

    public void setYoutubeChannelTitle(String str) {
        this.youtubeChannelTitle = str;
    }

    public void setYoutubeExpireTime(long j) {
        this.youtubeExpireTime = j;
    }

    public void setYoutubeRawRefreshToken(String str) {
        this.youtubeRawRefreshToken = str;
    }

    public void setmHotListStruct(HotListStruct hotListStruct) {
        this.mHotListStruct = hotListStruct;
    }

    public void setrFansGroupInfo(RocketFansGroupInfo rocketFansGroupInfo) {
        this.rFansGroupInfo = rocketFansGroupInfo;
    }
}
