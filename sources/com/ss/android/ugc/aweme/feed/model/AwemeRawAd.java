package com.ss.android.ugc.aweme.feed.model;

import X.C16880lQ;
import X.C78540Us4;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.O1A;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.feed.preload.PreloadData;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.commercialize.model.Ad4adModel;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeModel;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import com.ss.android.ugc.aweme.commercialize.model.AdHintData;
import com.ss.android.ugc.aweme.commercialize.model.AdLynxEntryData;
import com.ss.android.ugc.aweme.commercialize.model.AdNodeTrackUrl;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.commercialize.model.AdQuestionnaire;
import com.ss.android.ugc.aweme.commercialize.model.AdSlideBackInfoModel;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.commercialize.model.AdTagStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.model.FollowButtonData;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeCardInfo;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PlaybackSecondsTrack;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageNetworkOptimization;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AwemeRawAd extends CommonAdData {

    @InterfaceC65349Pkn("ace_scene")
    public int aceSceneType;

    @InterfaceC65349Pkn("action_extra")
    public String actionExtra;

    @InterfaceC65349Pkn("ad4ad")
    public Ad4adModel ad4adModel;

    @InterfaceC65349Pkn("descriptive_cta")
    public AdDescriptiveCTAStruct adDescriptiveCTA;

    @InterfaceC65349Pkn("dislike")
    public AdDislikeModel adDislikeModel;

    @InterfaceC65349Pkn("interaction_form")
    public AdFeInteractionModel adFeInteractionModel;

    @InterfaceC65349Pkn("hint_data")
    public AdHintData adHintData;

    @InterfaceC65349Pkn("ad_id")
    public Long adId;

    @InterfaceC65349Pkn("interaction_data")
    public AdInteractionData adInteractionData;

    @InterfaceC65349Pkn("live")
    public AdLive adLive;

    @InterfaceC65349Pkn("ad_more_textual")
    public String adMoreTextual;

    @InterfaceC65349Pkn("play_node_track_url")
    public List<AdNodeTrackUrl> adNodeTrackUrlList;

    @InterfaceC65349Pkn("ad_questionnaire")
    public AdQuestionnaire adQuestionnaire;

    @InterfaceC65349Pkn("ad_source_type")
    public int adSourceType;

    @InterfaceC65349Pkn("ad_tag_position")
    public int adTagPosition;

    @InterfaceC65349Pkn("recommendation_tags")
    public List<AdTagStruct> adTags;

    @InterfaceC65349Pkn("top_icon_list")
    public UrlModel adTopIcon;

    @InterfaceC65349Pkn("ad_type")
    public int adType;
    public AdWebUrlDataFromJsb adWebUrlDataFromJsb;

    @InterfaceC65349Pkn("advertiser_id")
    public String advId;

    @InterfaceC65349Pkn("aggregation_sdk")
    public AggregationSdk aggregationSdk;

    @InterfaceC65349Pkn("allow_dsp_autojump")
    public boolean allowDspAutoJump;

    @InterfaceC65349Pkn("anchor_click_type")
    public int anchorClickType;

    @InterfaceC65349Pkn("animation_type")
    public int animationType;

    @InterfaceC65349Pkn("style_template")
    public AnoleModel anoleModel;

    @InterfaceC65349Pkn("app_category")
    public String appCategory;

    @InterfaceC65349Pkn("app_data")
    public String appData;

    @InterfaceC65349Pkn("app_like")
    public String appLike;

    @InterfaceC65349Pkn("author_supports_auto_message")
    public boolean authorSupportsAutoMessage;

    @InterfaceC65349Pkn("author_url")
    public String authorUrl;

    @InterfaceC65349Pkn("autofill")
    public AutofillModel autofillModel;

    @InterfaceC65349Pkn("avatar_icon")
    public UrlModel avatarIcon;

    @InterfaceC65349Pkn("background_color")
    public String backgroundColor;

    @InterfaceC65349Pkn("live_icon_url")
    public UrlModel bottomIcon;

    @InterfaceC65349Pkn("browser_config")
    public BrowserConfig browserConfig;

    @InterfaceC65349Pkn("button_icon_url")
    public String buttonIcon;

    @InterfaceC65349Pkn("button_style")
    public int buttonStyle;

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("button_type")
    public int buttonType;

    @InterfaceC65349Pkn("call_to_action_bar")
    public CallToActionBarInfo callToActionBarInfo;

    @InterfaceC65349Pkn("card_infos")
    public Map<String, CardStruct> cardInfos;

    @InterfaceC65349Pkn("card_interaction_seconds")
    public int cardInteractionSeconds;

    @InterfaceC65349Pkn("card_interaction_type")
    public int cardInteractionType;

    @O1A(deserialize = false, serialize = false)
    public boolean cardOnceClick;

    @InterfaceC65349Pkn("web_channel_name")
    public String channelName;

    @InterfaceC65349Pkn("click_id")
    public String clickId;

    @InterfaceC65349Pkn("click_track_url_list")
    public UrlModel clickTrackUrlList;

    @InterfaceC65349Pkn("comment_area")
    public CommentStruct commentArea;

    @InterfaceC65349Pkn("comment_area_switch")
    public boolean commentAreaSwitch;

    @InterfaceC65349Pkn("comment_extra")
    @InterfaceC65404Plg(JsonToStringAdapter.class)
    public String commentExtra;

    @InterfaceC65349Pkn("ace_layer")
    public CommerceAceSurveyInfo commerceAceSurveyInfo;

    @InterfaceC65349Pkn("component_type")
    public int componentType;

    @InterfaceC65349Pkn("consult_url")
    public String consultUrl;

    @InterfaceC65349Pkn("context_track_url_list")
    public UrlModel contextTrack;
    public transient boolean contextTrackSent;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("disable_show_ad_link")
    public boolean disableAdLink;

    @InterfaceC65349Pkn("disable_ad_show_filter")
    public boolean disableAdShowFilter;

    @InterfaceC65349Pkn("disable_auto_track_click")
    public boolean disableAutoTrackClick;

    @InterfaceC65349Pkn("disable_follow_to_click")
    public int disableFollowToClick;

    @InterfaceC65349Pkn("disable_left_slide_follow")
    public boolean disableLeftSlideFollow;

    @InterfaceC65349Pkn("disable_like_type")
    public boolean disableLikeType;

    @InterfaceC65349Pkn("disable_authorpage_button")
    public boolean disableUserprofileAdLabel;

    @InterfaceC65349Pkn("disclaimer")
    public AdDisclaimer disclaimer;

    @InterfaceC65349Pkn("dislike_info")
    public AdDislikeInfo dislikeInfo;

    @InterfaceC65349Pkn("display_type")
    public Long displayType;

    @InterfaceC65349Pkn("link_data")
    public DouPlusLinkData douPlusLinkData;

    @InterfaceC65349Pkn("download_url")
    public String downloadUrl;

    @InterfaceC65349Pkn("dynamic_video")
    public DynamicVideo dynamicVideo;

    @InterfaceC65349Pkn("e_ad_info")
    public String eAdInfo;

    @InterfaceC65349Pkn("vsa_for_tt_mall")
    public EcUgVSAData ecUgVSAData;

    @InterfaceC65349Pkn("ecommerce_info")
    public EcommerceInfo ecommerceInfo;

    @InterfaceC65349Pkn("effective_play_time")
    public Float effectivePlayTime;

    @InterfaceC65349Pkn("effective_play_track_url_list")
    public UrlModel effectivePlayTrackUrlList;

    @InterfaceC65349Pkn("enable_title_click")
    public int enableDescClick;

    @InterfaceC65349Pkn("enable_icon_under_avatar")
    public boolean enableIconUnderAvatar;

    @InterfaceC65349Pkn("enable_left_slide_guide")
    public boolean enableLeftSlideGuide;

    @InterfaceC65349Pkn("enable_soft_ad_anchor_click")
    public Boolean enableSoftAdAnchorClick;

    @InterfaceC65349Pkn("enable_video_resume")
    public boolean enableVideoResume;

    @InterfaceC65349Pkn("enable_web_google_login")
    public boolean enableWebGoogleLogin;

    @InterfaceC65349Pkn("enable_web_report")
    public boolean enableWebReport;

    @InterfaceC65349Pkn("enter_from_merge")
    public String enterFromMerge;

    @InterfaceC65349Pkn("expire_seconds")
    public Long expireSeconds;

    @InterfaceC65349Pkn("extra_effective_play_action")
    public int extraEffectivePlayAction;

    @InterfaceC65349Pkn("fake_author")
    public FakeAuthor fakeAuthor;

    @InterfaceC65349Pkn("feature_label")
    public String featureLabel;

    @InterfaceC65349Pkn("featured_label")
    public List<AwemeTextLabelModel> featuredLabel;

    @InterfaceC65349Pkn("follower_label")
    public AwemeTextLabelModel followerLabel;

    @InterfaceC65349Pkn("form_height")
    public int formHeight;

    @InterfaceC65349Pkn("form_url")
    public String formUrl;

    @InterfaceC65349Pkn("form_width")
    public int formWidth;

    @InterfaceC65349Pkn("frontend_data")
    public Object frontendData;

    @InterfaceC65349Pkn("gecko_channel")
    public List<String> geckoChannel;

    @InterfaceC65349Pkn("get_ad_status")
    public int getAdStatus;

    @InterfaceC65349Pkn("get_ad_time")
    public int getAdTime;

    @InterfaceC65349Pkn("hide_if_exists")
    public int hideIfExists;

    @InterfaceC65349Pkn("hide_web_button")
    public boolean hideWebButton;

    @InterfaceC65349Pkn("high_light_color")
    public String highLightColor;

    @InterfaceC65349Pkn("high_light_position")
    public List<Position> highLightPosition;

    @InterfaceC65349Pkn("homepage_bottom_textual")
    public String homepageBottomTextual;

    @InterfaceC65349Pkn("iab_auto_jump_allow_list")
    public List<String> iabAutoJumpAllowList;

    @InterfaceC65349Pkn("icon_image_list")
    public List<UrlModel> iconImageList;

    @InterfaceC65349Pkn("image_list")
    public List<UrlModel> imageList;

    @InterfaceC65349Pkn("image_url")
    public UrlModel imageUrl;

    @InterfaceC65349Pkn("indicator_data")
    public IndicatorData indicatorData;

    @InterfaceC65349Pkn("insert_ad")
    public boolean insertAd;

    @InterfaceC65349Pkn("instance_phone_id")
    public long instancePhoneId;

    @InterfaceC65349Pkn("interaction_seconds")
    public int interactionSeconds;

    @InterfaceC65349Pkn("interesting_play")
    public AwemePlayFunModel interestingPlay;

    @InterfaceC65349Pkn("is_ad4ad")
    public boolean isAd4ad;

    @O1A(deserialize = false, serialize = false)
    public transient boolean isCTAFirstShown;

    @InterfaceC65349Pkn("is_dsp")
    public boolean isDsp;

    @InterfaceC65349Pkn("hide_music_disc")
    public boolean isHideMusicDisk;

    @InterfaceC65349Pkn("is_open_url_support_pull_up")
    public boolean isOpenUrlSupportPullUp;

    @InterfaceC65349Pkn("is_preview")
    public boolean isPreview;

    @InterfaceC65349Pkn("is_promote_page")
    public boolean isPromotePage;

    @InterfaceC65349Pkn("js_actlog_url")
    public String jsActLogUrl;

    @InterfaceC65349Pkn("label")
    public AwemeTextLabelModel label;

    @InterfaceC65349Pkn("landing_page_info")
    public String landingPageInfo;

    @InterfaceC65349Pkn("landingpage_network_optimization")
    public LandingPageNetworkOptimization landingPageNetworkOptimization;

    @InterfaceC65349Pkn("landing_page_survey")
    public LandingPageSurveyModel landingPageSurvey;

    @InterfaceC65349Pkn("learn_more_bg_color")
    public String learnMoreBgColor;

    @InterfaceC65349Pkn("left_slide_click_time")
    public int leftSlideClickDuration;

    @InterfaceC65349Pkn("left_slide_click_type")
    public int leftSlideClickType;

    @InterfaceC65349Pkn("light_web_url")
    public String lightWebUrl;

    @InterfaceC65349Pkn("link_label")
    public AwemeLinkLabel linkLabel;
    public LiveAdCardModel liveAdCardModel;

    @InterfaceC65349Pkn("live_ad_type")
    public int liveAdType;

    @InterfaceC65349Pkn("live_room")
    public int liveRoom;

    @InterfaceC65349Pkn("lynx_button_position")
    public int lynxButtonPosition;

    @InterfaceC65349Pkn("template_url")
    public String lynxButtonUrl;

    @InterfaceC65349Pkn("lynx_entry_data")
    public AdLynxEntryData lynxEntryData;

    @InterfaceC65349Pkn("lynx_raw_data")
    @InterfaceC65404Plg(JsonToStringAdapter.class)
    public String lynxRawData;

    @InterfaceC65349Pkn("download_mode")
    public int mDownloadMode;

    @InterfaceC65349Pkn("auto_open")
    public int mLinkMode;

    @InterfaceC65349Pkn("support_multiple")
    public int mSupportMultiple;

    @InterfaceC65349Pkn("mask_form_style")
    public int maskFormStyle;

    @InterfaceC65349Pkn("mp_url")
    public String microAppUrl;

    @InterfaceC65349Pkn("music")
    public Music music;

    @InterfaceC65349Pkn("native_author")
    public NativeAuthorInfo nativeAuthor;

    @InterfaceC65349Pkn("native_card_info")
    public NativeCardInfo nativeCardInfo;

    @InterfaceC65349Pkn("native_card_type")
    public int nativeCardType;

    @InterfaceC65349Pkn("native_site_ad_info")
    public String nativeSiteAdInfo;

    @InterfaceC65349Pkn("native_site_config")
    public NativeSiteConfig nativeSiteConfig;

    @InterfaceC65349Pkn("native_site_custom_data")
    public String nativeSiteCustomData;

    @InterfaceC65349Pkn("non_native_click")
    public int nonNativeClick;

    @InterfaceC65349Pkn("notification_config")
    public int notificationConfig;

    @InterfaceC65349Pkn("vast")
    public OmVast omVast;

    @InterfaceC65349Pkn("open_system_browser")
    public boolean openSystemBrowser;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("origin_price")
    public String originPrice;

    @InterfaceC65349Pkn("outflow_button_style")
    public int outFlowButtonStyle;

    @InterfaceC65349Pkn("package")
    public String packageName;

    @InterfaceC65349Pkn("page_id")
    public String pageId;

    @InterfaceC65349Pkn("phone_key")
    public String phoneKey;

    @InterfaceC65349Pkn("phone_number")
    public String phoneNumber;

    @InterfaceC65349Pkn("photo_carousel_info")
    public PhotoCarouselInfoStruct photoCarouselInfo;

    @InterfaceC65349Pkn("playover_track_url_list")
    public UrlModel playOverTrackUrlList;

    @InterfaceC65349Pkn("play_track_url_list")
    public UrlModel playTrackUrlList;

    @InterfaceC65349Pkn("pop_ups")
    public boolean popUps;

    @InterfaceC65349Pkn("position")
    public int position;

    @InterfaceC65349Pkn("preload_data")
    public PreloadData preloadData;

    @InterfaceC65349Pkn("preload_extra_web")
    public int preloadExtraWeb;

    @InterfaceC65349Pkn("preload_h5_type")
    public int preloadH5Type;

    @InterfaceC65349Pkn("preload_web")
    public int preloadWeb;

    @InterfaceC65349Pkn("preload_web_new")
    public int preloadWebNew;

    @InterfaceC65349Pkn("preload_web_second_page")
    public int preloadWebSecondPage;

    @InterfaceC65349Pkn("price")
    public String price;

    @InterfaceC65349Pkn("product_tile")
    public AdProductTile productTile;

    @InterfaceC65349Pkn("profile_with_webview")
    public int profileWithWebview;

    @InterfaceC65349Pkn("promote_page")
    public PromotePageModel promotePageModel;

    @InterfaceC65349Pkn("promotion_label")
    public String promotionLabel;

    @InterfaceC65349Pkn("quick_app_url")
    public String quickAppUrl;

    @InterfaceC65349Pkn("recommend_extra")
    public String recommendExtra;

    @InterfaceC65349Pkn("recommend_title")
    public String recommendTitle;

    @InterfaceC65349Pkn("red_mp_url")
    public String redMpUrl;

    @InterfaceC65349Pkn("red_open_url")
    public String redOpenUrl;

    @InterfaceC65349Pkn("red_url")
    public String redUrl;

    @InterfaceC65349Pkn("report_ad_type")
    public int reportAdType;

    @InterfaceC65349Pkn("report_enable")
    public boolean reportEnable;

    @O1A(deserialize = false, serialize = false)
    public transient boolean reshowAd;

    @O1A(deserialize = false, serialize = false)
    public transient boolean reshowCTA;

    @InterfaceC65349Pkn("roll_type")
    public int rollType;

    @InterfaceC65349Pkn("schema_name")
    public String schemaName;

    @InterfaceC65349Pkn("search")
    public AwemeSearchAdModel searchAdInfo;

    @InterfaceC65349Pkn("shake")
    public ShakeModel shakeModel;

    @InterfaceC65349Pkn("shop_ad_data")
    public String shopAdData;

    @InterfaceC65349Pkn("show_ad_after_interaction")
    public boolean showAdAfterInteraction;

    @InterfaceC65349Pkn("show_button_color_seconds")
    public int showButtonColorSeconds;

    @InterfaceC65349Pkn("show_button_seconds")
    public int showButtonSeconds;

    @InterfaceC65349Pkn("show_label_rows")
    public int showLabelRows;

    @InterfaceC65349Pkn("show_label_seconds")
    public int showLabelSeconds;

    @InterfaceC65349Pkn("show_lynx_card")
    public int showLynxCard;

    @InterfaceC65349Pkn("show_mask_recycle")
    public boolean showMaskRecycle;

    @InterfaceC65349Pkn("show_mask_times")
    public int showMaskTimes;

    @InterfaceC65349Pkn("show_outflow_mask_times")
    public int showOutflowMaskTimes;

    @InterfaceC65349Pkn("show_type")
    public int showType;

    @InterfaceC65349Pkn("skip_time")
    public int skipTime;

    @InterfaceC65349Pkn("slide_action")
    public int slideAction;

    @InterfaceC65349Pkn("slide_back_info")
    public AdSlideBackInfoModel slideBackInfoModel;

    @InterfaceC65349Pkn("source")
    public String source;

    @InterfaceC65349Pkn("splash_info")
    public AwemeSplashInfo splashInfo;

    @InterfaceC65349Pkn("sticker_data")
    public AdStickerData stickerData;

    @InterfaceC65349Pkn("tips_type")
    public int tipsType;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("top_title")
    public String topTitle;

    @InterfaceC65349Pkn("track_url_list")
    public UrlModel trackUrlList;

    @InterfaceC65349Pkn("type")
    public String type;

    @InterfaceC65349Pkn("use_default_color")
    public boolean useDefaultColor;

    @InterfaceC65349Pkn("use_ordinary_web")
    public Boolean useOrdinaryWeb;

    @InterfaceC65349Pkn("video")
    public List<Video> videoList;

    @InterfaceC65349Pkn("video_transpose")
    public Long videoTranspose;

    @InterfaceC65349Pkn("web_apply_camera")
    public boolean webApplyCamera;

    @InterfaceC65349Pkn("web_title")
    public String webTitle;

    @InterfaceC65349Pkn("web_type")
    public int webType;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    @InterfaceC65349Pkn("webview_pannel_style")
    public int webviewPannelStyle;

    @InterfaceC65349Pkn("webview_progress_bar")
    public int webviewProgressBar;

    @InterfaceC65349Pkn("webview_type")
    public int webviewType;

    @InterfaceC65349Pkn("white_high_light_color")
    public String whiteHighLightColor;

    @InterfaceC65349Pkn("app_name")
    public String appName = "";

    @InterfaceC65349Pkn("app_install")
    public String appInstall = "";

    @InterfaceC65349Pkn("disable_download_dialog")
    public int disableDownloadDialog = 1;

    @InterfaceC65349Pkn("enable_filter_same_video")
    public boolean enableFilterSameVideo = true;
    public String pageFrom = "";

    @InterfaceC65349Pkn("playback_seconds_track_url")
    public List<PlaybackSecondsTrack> playbackSecondsTrackList = new ArrayList();

    @InterfaceC65349Pkn("carousel_left_guide")
    public int photoModeSlideHint = 2;

    @InterfaceC65349Pkn("skip_ad_time")
    public int skipAdTime = -1;

    @InterfaceC65349Pkn("show_special_avatar_style")
    public int adAvatarLinkTagStyle = 0;

    @InterfaceC65349Pkn("is_ack_action")
    public int isAckAction = 0;

    @InterfaceC65349Pkn("disable_show_link_label")
    public boolean disableShowLinkLabel = false;

    @InterfaceC65349Pkn("similar_animation")
    public int similarAnimation = 0;

    @InterfaceC65349Pkn("piv_opt")
    public int pivOpt = 0;

    @InterfaceC65349Pkn("button_icon_animation_repeat_times")
    public int buttonIconAnimationRepeatTimes = 0;

    @InterfaceC65349Pkn("about_this_ad_info")
    public AboutAdInfo aboutThisAdInfo = null;

    @InterfaceC65349Pkn("follow_button")
    public FollowButtonData followButton = null;
    public Map<String, String> searchAdExtraParams = null;

    @O1A(deserialize = false, serialize = false)
    public transient ConcurrentHashMap<String, Object> reusableExtraParams = new ConcurrentHashMap<>();

    @InterfaceC65349Pkn("brand_safety_type")
    public int brandSafetyType = 0;

    private void vastFromXml() {
    }

    public boolean allowJumpToPlayStore() {
        if (this.slideAction == 1) {
            return true;
        }
        return false;
    }

    public boolean canShowLynxBtn2CardAnim() {
        if (this.showLynxCard == 1) {
            return true;
        }
        return false;
    }

    public String[] getAppCategory() {
        if (TextUtils.isEmpty(this.appCategory)) {
            return new String[0];
        }
        return this.appCategory.split(" ");
    }

    public float getAppLike() {
        if (TextUtils.isEmpty(this.appLike)) {
            return 0.0f;
        }
        return CastFloatProtector.parseFloat(this.appLike);
    }

    public CardStruct getDefaultCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map != null && map.containsKey("3")) {
            return this.cardInfos.get("3");
        }
        return null;
    }

    public Float getEffectivePlayTime() {
        Float f = this.effectivePlayTime;
        if (f == null || f.floatValue() <= 0.001f) {
            return Float.valueOf(3.0f);
        }
        return this.effectivePlayTime;
    }

    public boolean getEnableDescClick() {
        if (this.enableDescClick != 0) {
            return true;
        }
        return false;
    }

    public CardStruct getFollowCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map != null && map.containsKey("7")) {
            return this.cardInfos.get("7");
        }
        return null;
    }

    public JSONObject getFrontendData() {
        try {
            return new JSONObject(new Gson().LJIILL(this.frontendData));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public CardStruct getLiveCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map != null && map.containsKey("live_card")) {
            return this.cardInfos.get("live_card");
        }
        return null;
    }

    public UrlModel getRedImageUrl() {
        if (C78540Us4.LJIILLIIL(this.iconImageList)) {
            return null;
        }
        return (UrlModel) ListProtector.get(this.iconImageList, 0);
    }

    public boolean isAckAction() {
        if (this.isAckAction == 1) {
            return true;
        }
        return false;
    }

    public boolean isClickTrackUrlListValid() {
        UrlModel urlModel = this.clickTrackUrlList;
        if (urlModel != null && urlModel.getUrlList() != null && !this.clickTrackUrlList.getUrlList().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isDisableDownloadDialog() {
        if (this.disableDownloadDialog == 1) {
            return true;
        }
        return false;
    }

    public boolean isHardAd() {
        if (this.adSourceType == 1) {
            return true;
        }
        return false;
    }

    public boolean isHideIfExists() {
        if (this.hideIfExists == 1) {
            return true;
        }
        return false;
    }

    public boolean isImageValid() {
        List<UrlModel> list = this.imageList;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isNewStyleAd() {
        if (this.showType == 1) {
            return true;
        }
        return false;
    }

    public boolean isPreloadExtraWeb() {
        if (this.preloadExtraWeb == 1) {
            return true;
        }
        return false;
    }

    public boolean isSearchPreciseAd() {
        AwemeSearchAdModel awemeSearchAdModel = this.searchAdInfo;
        if (awemeSearchAdModel != null && awemeSearchAdModel.isPreciseAd() != null && this.searchAdInfo.isPreciseAd().booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean isShowPhotoModeSlideHint() {
        if (this.photoModeSlideHint == 1) {
            return true;
        }
        return false;
    }

    public boolean isShowWebViewBottomLynxButton() {
        if ((this.lynxButtonPosition & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportMultiple() {
        if (this.mSupportMultiple > 0) {
            return true;
        }
        return false;
    }

    public boolean isVisibleSearchAdsToggle() {
        AwemeSearchAdModel awemeSearchAdModel = this.searchAdInfo;
        if (awemeSearchAdModel != null && awemeSearchAdModel.getSearchDeliveryType() != null && this.searchAdInfo.getSearchDeliveryType().intValue() == 3) {
            return true;
        }
        return false;
    }

    public Map<String, Object> removeReusableExtraParams() {
        ConcurrentHashMap<String, Object> concurrentHashMap = this.reusableExtraParams;
        this.reusableExtraParams = new ConcurrentHashMap<>(this.reusableExtraParams);
        return concurrentHashMap;
    }

    public boolean useEffectivePlayAction() {
        if (this.extraEffectivePlayAction == 1) {
            return true;
        }
        return false;
    }

    public boolean isRightStyle() {
        AwemeTextLabelModel awemeTextLabelModel;
        if (getAdTagPosition() == 2 && (awemeTextLabelModel = this.label) != null && !TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            return true;
        }
        return false;
    }

    public AboutAdInfo getAboutThisAd() {
        return this.aboutThisAdInfo;
    }

    public int getAceSceneType() {
        return this.aceSceneType;
    }

    public Ad4adModel getAd4adModel() {
        return this.ad4adModel;
    }

    public int getAdAvatarLinkTagStyle() {
        return this.adAvatarLinkTagStyle;
    }

    public AdDescriptiveCTAStruct getAdDescriptiveCTA() {
        return this.adDescriptiveCTA;
    }

    public AdDislikeModel getAdDislikeModel() {
        return this.adDislikeModel;
    }

    public AdHintData getAdHintData() {
        return this.adHintData;
    }

    public Long getAdId() {
        return this.adId;
    }

    public AdInteractionData getAdInteractionData() {
        return this.adInteractionData;
    }

    public AdLive getAdLive() {
        return this.adLive;
    }

    public String getAdMoreTextual() {
        return this.adMoreTextual;
    }

    public List<AdNodeTrackUrl> getAdNodeTrackUrlList() {
        return this.adNodeTrackUrlList;
    }

    public AdQuestionnaire getAdQuestionnaire() {
        return this.adQuestionnaire;
    }

    public int getAdSourceType() {
        return this.adSourceType;
    }

    public int getAdTagPosition() {
        return this.adTagPosition;
    }

    public List<AdTagStruct> getAdTags() {
        return this.adTags;
    }

    public UrlModel getAdTopIcon() {
        return this.adTopIcon;
    }

    public int getAdType() {
        return this.adType;
    }

    public AdWebUrlDataFromJsb getAdWebUrlDataFromJsb() {
        return this.adWebUrlDataFromJsb;
    }

    public String getAdvId() {
        return this.advId;
    }

    public AggregationSdk getAggregationSdk() {
        return this.aggregationSdk;
    }

    public int getAnchorClickType() {
        return this.anchorClickType;
    }

    public int getAnimationType() {
        return this.animationType;
    }

    public AnoleModel getAnoleModel() {
        return this.anoleModel;
    }

    public String getAppData() {
        return this.appData;
    }

    public String getAppInstall() {
        return this.appInstall;
    }

    public String getAppName() {
        return this.appName;
    }

    public boolean getAuthorSupportsAutoMessage() {
        return this.authorSupportsAutoMessage;
    }

    public String getAuthorUrl() {
        return this.authorUrl;
    }

    public AutofillModel getAutofillModel() {
        return this.autofillModel;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getBrandSafetyType() {
        return this.brandSafetyType;
    }

    public BrowserConfig getBrowserConfig() {
        return this.browserConfig;
    }

    public String getButtonIcon() {
        return this.buttonIcon;
    }

    public int getButtonIconAnimationRepeatTimes() {
        return this.buttonIconAnimationRepeatTimes;
    }

    public int getButtonStyle() {
        return this.buttonStyle;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public int getButtonType() {
        return this.buttonType;
    }

    public CallToActionBarInfo getCallToActionBarInfo() {
        return this.callToActionBarInfo;
    }

    public Map<String, CardStruct> getCardInfos() {
        return this.cardInfos;
    }

    public int getCardInteractionSeconds() {
        return this.cardInteractionSeconds;
    }

    public int getCardInteractionType() {
        return this.cardInteractionType;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public String getClickId() {
        return this.clickId;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public CommentStruct getCommentArea() {
        return this.commentArea;
    }

    public String getCommentExtra() {
        return this.commentExtra;
    }

    public CommerceAceSurveyInfo getCommerceAceSurveyInfo() {
        return this.commerceAceSurveyInfo;
    }

    public int getComponentType() {
        return this.componentType;
    }

    public String getConsultUrl() {
        return this.consultUrl;
    }

    public UrlModel getContextTrack() {
        return this.contextTrack;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getDisableAutoTrackClick() {
        return this.disableAutoTrackClick;
    }

    public int getDisableFollowToClick() {
        return this.disableFollowToClick;
    }

    public AdDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    public AdDislikeInfo getDislikeInfo() {
        return this.dislikeInfo;
    }

    public Long getDisplayType() {
        return this.displayType;
    }

    public DouPlusLinkData getDouPlusLinkData() {
        return this.douPlusLinkData;
    }

    public int getDownloadMode() {
        return this.mDownloadMode;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DynamicVideo getDynamicVideo() {
        return this.dynamicVideo;
    }

    public String getEAdInfo() {
        return this.eAdInfo;
    }

    public EcUgVSAData getEcUgVSAData() {
        return this.ecUgVSAData;
    }

    public EcommerceInfo getEcommerceInfo() {
        return this.ecommerceInfo;
    }

    public UrlModel getEffectivePlayTrackUrlList() {
        return this.effectivePlayTrackUrlList;
    }

    public boolean getEnableIconUnderAvatar() {
        return this.enableIconUnderAvatar;
    }

    public Boolean getEnableSoftAdAnchorClick() {
        return this.enableSoftAdAnchorClick;
    }

    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public FakeAuthor getFakeAuthor() {
        return this.fakeAuthor;
    }

    public String getFeatureLabel() {
        return this.featureLabel;
    }

    public List<AwemeTextLabelModel> getFeaturedLabel() {
        return this.featuredLabel;
    }

    public FollowButtonData getFollowButtonData() {
        return this.followButton;
    }

    public AwemeTextLabelModel getFollowerLabel() {
        return this.followerLabel;
    }

    public int getFormHeight() {
        return this.formHeight;
    }

    public String getFormUrl() {
        return this.formUrl;
    }

    public int getFormWidth() {
        return this.formWidth;
    }

    public List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public int getGetAdStatus() {
        return this.getAdStatus;
    }

    public int getGetAdTime() {
        return this.getAdTime;
    }

    public String getHomepageBottomTextual() {
        return this.homepageBottomTextual;
    }

    public List<String> getIabAutoJumpAllowList() {
        return this.iabAutoJumpAllowList;
    }

    public List<UrlModel> getIconImageList() {
        return this.iconImageList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public IndicatorData getIndicatorData() {
        return this.indicatorData;
    }

    public long getInstancePhoneId() {
        return this.instancePhoneId;
    }

    public AdFeInteractionModel getInteractionFormModel() {
        return this.adFeInteractionModel;
    }

    public int getInteractionSeconds() {
        return this.interactionSeconds;
    }

    public String getJsActLogUrl() {
        return this.jsActLogUrl;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public String getLandingPageInfo() {
        return this.landingPageInfo;
    }

    public LandingPageNetworkOptimization getLandingPageNetworkOptimization() {
        return this.landingPageNetworkOptimization;
    }

    public LandingPageSurveyModel getLandingPageSurvey() {
        return this.landingPageSurvey;
    }

    public String getLearnMoreBgColor() {
        return this.learnMoreBgColor;
    }

    public int getLeftSlideClickDuration() {
        return this.leftSlideClickDuration;
    }

    public int getLeftSlideClickType() {
        return this.leftSlideClickType;
    }

    public String getLightWebUrl() {
        return this.lightWebUrl;
    }

    public AwemeLinkLabel getLinkLabel() {
        return this.linkLabel;
    }

    public int getLinkMode() {
        return this.mLinkMode;
    }

    public LiveAdCardModel getLiveAdCardModel() {
        return this.liveAdCardModel;
    }

    public int getLiveAdType() {
        return this.liveAdType;
    }

    public String getLiveEnterFromMerge() {
        return this.enterFromMerge;
    }

    public String getLynxButtonUrl() {
        return this.lynxButtonUrl;
    }

    public AdLynxEntryData getLynxEntryData() {
        return this.lynxEntryData;
    }

    public String getLynxRawData() {
        return this.lynxRawData;
    }

    public int getMaskFormStyle() {
        return this.maskFormStyle;
    }

    public String getMicroAppUrl() {
        return this.microAppUrl;
    }

    public Music getMusic() {
        return this.music;
    }

    public NativeAuthorInfo getNativeAuthorInfo() {
        return this.nativeAuthor;
    }

    public NativeCardInfo getNativeCardInfo() {
        return this.nativeCardInfo;
    }

    public int getNativeCardType() {
        return this.nativeCardType;
    }

    public String getNativeSiteAdInfo() {
        return this.nativeSiteAdInfo;
    }

    public NativeSiteConfig getNativeSiteConfig() {
        return this.nativeSiteConfig;
    }

    public String getNativeSiteCustomData() {
        return this.nativeSiteCustomData;
    }

    public int getNonNativeClick() {
        return this.nonNativeClick;
    }

    public int getNotificationConfig() {
        return this.notificationConfig;
    }

    public OmVast getOmVast() {
        return this.omVast;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getOriginPrice() {
        return this.originPrice;
    }

    public int getOutFlowButtonStyle() {
        return this.outFlowButtonStyle;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPageFrom() {
        return this.pageFrom;
    }

    public String getPageId() {
        return this.pageId;
    }

    public String getPhoneKey() {
        return this.phoneKey;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PhotoCarouselInfoStruct getPhotoCarouselInfo() {
        return this.photoCarouselInfo;
    }

    public int getPivOption() {
        return this.pivOpt;
    }

    public AwemePlayFunModel getPlayFunModel() {
        return this.interestingPlay;
    }

    public UrlModel getPlayOverTrackUrlList() {
        return this.playOverTrackUrlList;
    }

    public UrlModel getPlayTrackUrlList() {
        return this.playTrackUrlList;
    }

    public List<PlaybackSecondsTrack> getPlaybackSecondsTrackList() {
        return this.playbackSecondsTrackList;
    }

    public int getPosition() {
        return this.position;
    }

    public PreloadData getPreloadData() {
        return this.preloadData;
    }

    public int getPreloadH5Type() {
        return this.preloadH5Type;
    }

    public int getPreloadWeb() {
        return this.preloadWeb;
    }

    public int getPreloadWebNew() {
        return this.preloadWebNew;
    }

    public int getPreloadWebSecondPage() {
        return this.preloadWebSecondPage;
    }

    public String getPrice() {
        return this.price;
    }

    public AdProductTile getProductTile() {
        return this.productTile;
    }

    public int getProfileWithWebview() {
        return this.profileWithWebview;
    }

    public PromotePageModel getPromotePageModel() {
        return this.promotePageModel;
    }

    public String getPromotionLabel() {
        return this.promotionLabel;
    }

    public String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public String getRecommendExtra() {
        return this.recommendExtra;
    }

    public String getRedMpUrl() {
        return this.redMpUrl;
    }

    public String getRedOpenUrl() {
        return this.redOpenUrl;
    }

    public String getRedUrl() {
        return this.redUrl;
    }

    public int getReportAdType() {
        return this.reportAdType;
    }

    public Map<String, Object> getReusableExtraParams() {
        return this.reusableExtraParams;
    }

    public int getRollType() {
        return this.rollType;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public Map<String, String> getSearchAdExtraParams() {
        return this.searchAdExtraParams;
    }

    public AwemeSearchAdModel getSearchAdInfo() {
        return this.searchAdInfo;
    }

    public ShakeModel getShakeModel() {
        return this.shakeModel;
    }

    public String getShopAdData() {
        return this.shopAdData;
    }

    public int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public int getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public int getShowLabelRows() {
        return this.showLabelRows;
    }

    public int getShowLabelSeconds() {
        return this.showLabelSeconds;
    }

    public int getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public int getShowOutflowMaskTimes() {
        return this.showOutflowMaskTimes;
    }

    public int getSimilarAnimation() {
        return this.similarAnimation;
    }

    public int getSkipAdTime() {
        return this.skipAdTime;
    }

    public int getSkipTime() {
        return this.skipTime;
    }

    public int getSlideAction() {
        return this.slideAction;
    }

    public AdSlideBackInfoModel getSlideBackInfoModel() {
        return this.slideBackInfoModel;
    }

    public String getSource() {
        return this.source;
    }

    public AwemeSplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    public AdStickerData getStickerData() {
        return this.stickerData;
    }

    public int getTipsType() {
        return this.tipsType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTopTitle() {
        return this.topTitle;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public String getType() {
        return this.type;
    }

    public Boolean getUseOrdinaryWeb_() {
        return this.useOrdinaryWeb;
    }

    public List<Video> getVideoList() {
        return this.videoList;
    }

    public Long getVideoTranspose() {
        return this.videoTranspose;
    }

    public boolean getWebApplyCamera() {
        return this.webApplyCamera;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public int getWebType() {
        return this.webType;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public int getWebviewPannelStyle() {
        return this.webviewPannelStyle;
    }

    public int getWebviewProgressBar() {
        return this.webviewProgressBar;
    }

    public int getWebviewType() {
        return this.webviewType;
    }

    public boolean isAd4ad() {
        return this.isAd4ad;
    }

    public boolean isAllowDspAutoJump() {
        return this.allowDspAutoJump;
    }

    public boolean isCTAFirstShown() {
        return this.isCTAFirstShown;
    }

    public boolean isCardOnceClick() {
        return this.cardOnceClick;
    }

    public boolean isCommentAreaSwitch() {
        return this.commentAreaSwitch;
    }

    public boolean isContextTrackSent() {
        return this.contextTrackSent;
    }

    public boolean isDiableAdShowFilter() {
        return this.disableAdShowFilter;
    }

    public boolean isDisableAdLink() {
        return this.disableAdLink;
    }

    public boolean isDisableLeftSlideFollow() {
        return this.disableLeftSlideFollow;
    }

    public boolean isDisableLikeType() {
        return this.disableLikeType;
    }

    public boolean isDisableUserprofileAdLabel() {
        return this.disableUserprofileAdLabel;
    }

    public boolean isDsp() {
        return this.isDsp;
    }

    public boolean isEnableFilterSameVideo() {
        return this.enableFilterSameVideo;
    }

    public boolean isEnableLeftSlideGuide() {
        return this.enableLeftSlideGuide;
    }

    public boolean isEnableVideoResume() {
        return this.enableVideoResume;
    }

    public boolean isEnableWebGoogleLogin() {
        return this.enableWebGoogleLogin;
    }

    public boolean isEnableWebReport() {
        return this.enableWebReport;
    }

    public boolean isHideMusicDisk() {
        return this.isHideMusicDisk;
    }

    public boolean isHideWebButton() {
        return this.hideWebButton;
    }

    public boolean isInsertAd() {
        return this.insertAd;
    }

    public boolean isOpenSystemBrowser() {
        return this.openSystemBrowser;
    }

    public boolean isOpenUrlSupportPullUp() {
        return this.isOpenUrlSupportPullUp;
    }

    public boolean isPopUps() {
        return this.popUps;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isPromotePage() {
        return this.isPromotePage;
    }

    public boolean isReportEnable() {
        return this.reportEnable;
    }

    public boolean isReshowAd() {
        return this.reshowAd;
    }

    public boolean isReshowCTA() {
        return this.reshowCTA;
    }

    public boolean isShowAdAfterInteraction() {
        return this.showAdAfterInteraction;
    }

    public boolean isUseDefaultColor() {
        return this.useDefaultColor;
    }

    public boolean isTypeOf(String str) {
        return TextUtils.equals(this.type, str);
    }

    public void setAdDescriptiveCTA(AdDescriptiveCTAStruct adDescriptiveCTAStruct) {
        this.adDescriptiveCTA = adDescriptiveCTAStruct;
    }

    public void setAdHintData(AdHintData adHintData) {
        this.adHintData = adHintData;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setAdLive(AdLive adLive) {
        this.adLive = adLive;
    }

    public void setAdMoreTextual(String str) {
        this.adMoreTextual = str;
    }

    public void setAdTagPosition(int i) {
        this.adTagPosition = i;
    }

    public void setAdTags(List<AdTagStruct> list) {
        this.adTags = list;
    }

    public void setAdTopIcon(UrlModel urlModel) {
        this.adTopIcon = urlModel;
    }

    public void setAdWebUrlDataFromJsb(AdWebUrlDataFromJsb adWebUrlDataFromJsb) {
        this.adWebUrlDataFromJsb = adWebUrlDataFromJsb;
    }

    public void setAdvId(String str) {
        this.advId = str;
    }

    public void setAllowDspAutoJump(boolean z) {
        this.allowDspAutoJump = z;
    }

    public void setAnimationType(int i) {
        this.animationType = i;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAutofillModel(AutofillModel autofillModel) {
        this.autofillModel = autofillModel;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setBrandSafetyType(int i) {
        this.brandSafetyType = i;
    }

    public void setBrowserConfig(BrowserConfig browserConfig) {
        this.browserConfig = browserConfig;
    }

    public void setButtonStyle(int i) {
        this.buttonStyle = i;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCallToActionBarInfo(CallToActionBarInfo callToActionBarInfo) {
        this.callToActionBarInfo = callToActionBarInfo;
    }

    public void setCardOnceClick(boolean z) {
        this.cardOnceClick = z;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCommentArea(CommentStruct commentStruct) {
        this.commentArea = commentStruct;
    }

    public void setCommentAreaSwitch(boolean z) {
        this.commentAreaSwitch = z;
    }

    public void setContextTrack(UrlModel urlModel) {
        this.contextTrack = urlModel;
    }

    public void setContextTrackSent(boolean z) {
        this.contextTrackSent = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDiableAdShowFilter(boolean z) {
        this.disableAdShowFilter = z;
    }

    public void setDisableAdLink(boolean z) {
        this.disableAdLink = z;
    }

    public void setDisableDownloadDialog(int i) {
        this.disableDownloadDialog = i;
    }

    public void setDisableFollowToClick(int i) {
        this.disableFollowToClick = i;
    }

    public void setDisableLeftSlideFollow(boolean z) {
        this.disableLeftSlideFollow = z;
    }

    public void setDisableUserprofileAdLabel(boolean z) {
        this.disableUserprofileAdLabel = z;
    }

    public void setDisplayType(Long l) {
        this.displayType = l;
    }

    public void setDownloadMode(int i) {
        this.mDownloadMode = i;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setDsp(boolean z) {
        this.isDsp = z;
    }

    public void setDynamicVideo(DynamicVideo dynamicVideo) {
        this.dynamicVideo = dynamicVideo;
    }

    public void setEcUgVSAData(EcUgVSAData ecUgVSAData) {
        this.ecUgVSAData = ecUgVSAData;
    }

    public void setEcommerceInfo(EcommerceInfo ecommerceInfo) {
        this.ecommerceInfo = ecommerceInfo;
    }

    public void setEffectivePlayTrackUrlList(UrlModel urlModel) {
        this.effectivePlayTrackUrlList = urlModel;
    }

    public void setEnableFilterSameVideo(boolean z) {
        this.enableFilterSameVideo = z;
    }

    public void setEnableLeftSlideGuide(boolean z) {
        this.enableLeftSlideGuide = z;
    }

    public void setExpireSeconds(Long l) {
        this.expireSeconds = l;
    }

    public void setFakeAuthor(FakeAuthor fakeAuthor) {
        this.fakeAuthor = fakeAuthor;
    }

    public void setFeatureLabel(String str) {
        this.featureLabel = str;
    }

    public void setFollowerLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.followerLabel = awemeTextLabelModel;
    }

    public void setFormHeight(int i) {
        this.formHeight = i;
    }

    public void setFormUrl(String str) {
        this.formUrl = str;
    }

    public void setFormWidth(int i) {
        this.formWidth = i;
    }

    public void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public void setGetAdStatus(int i) {
        this.getAdStatus = i;
    }

    public void setGetAdTime(int i) {
        this.getAdTime = i;
    }

    public void setHideIfExists(boolean z) {
        this.hideIfExists = z ? 1 : 0;
    }

    public void setHomepageBottomTextual(String str) {
        this.homepageBottomTextual = str;
    }

    public void setIconImageList(List<UrlModel> list) {
        this.iconImageList = list;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setIndicatorData(IndicatorData indicatorData) {
        this.indicatorData = indicatorData;
    }

    public void setIsCTAFirstShown(boolean z) {
        this.isCTAFirstShown = z;
    }

    public void setJsActLogUrl(String str) {
        this.jsActLogUrl = str;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLearnMoreBgColor(String str) {
        this.learnMoreBgColor = str;
    }

    public void setLightWebUrl(String str) {
        this.lightWebUrl = str;
    }

    public void setLinkMode(int i) {
        this.mLinkMode = i;
    }

    public void setLiveAdCardModel(LiveAdCardModel liveAdCardModel) {
        this.liveAdCardModel = liveAdCardModel;
    }

    public void setLiveCardInfo(CardStruct cardStruct) {
        if (cardStruct == null) {
            Map<String, CardStruct> map = this.cardInfos;
            if (map != null && map.containsKey("live_card")) {
                this.cardInfos.remove("live_card");
                return;
            }
            return;
        }
        if (this.cardInfos == null) {
            this.cardInfos = new HashMap();
        }
        this.cardInfos.put("live_card", cardStruct);
    }

    public void setMaskFormStyle(int i) {
        this.maskFormStyle = i;
    }

    public void setMicroAppUrl(String str) {
        this.microAppUrl = str;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setNativeSiteConfig(NativeSiteConfig nativeSiteConfig) {
        this.nativeSiteConfig = nativeSiteConfig;
    }

    public void setOmVast(OmVast omVast) {
        this.omVast = omVast;
    }

    public void setOpenSystemBrowser(boolean z) {
        this.openSystemBrowser = z;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setOriginPrice(String str) {
        this.originPrice = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPageFrom(String str) {
        this.pageFrom = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPhotoCarouselInfo(PhotoCarouselInfoStruct photoCarouselInfoStruct) {
        this.photoCarouselInfo = photoCarouselInfoStruct;
    }

    public void setPlayOverTrackUrlList(UrlModel urlModel) {
        this.playOverTrackUrlList = urlModel;
    }

    public void setPlayTrackUrlList(UrlModel urlModel) {
        this.playTrackUrlList = urlModel;
    }

    public void setPopUps(boolean z) {
        this.popUps = z;
    }

    public void setPreloadData(PreloadData preloadData) {
        this.preloadData = preloadData;
    }

    public void setPreloadWeb(int i) {
        this.preloadWeb = i;
    }

    public void setPreloadWebNew(int i) {
        this.preloadWebNew = i;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProductTile(AdProductTile adProductTile) {
        this.productTile = adProductTile;
    }

    public void setProfileWithWebview(int i) {
        this.profileWithWebview = i;
    }

    public void setRecommendExtra(String str) {
        this.recommendExtra = str;
    }

    public void setRedMpUrl(String str) {
        this.redMpUrl = str;
    }

    public void setRedUrl(String str) {
        this.redUrl = str;
    }

    public void setReportAdType(int i) {
        this.reportAdType = i;
    }

    public void setReshowAd(boolean z) {
        this.reshowAd = z;
    }

    public void setReshowCTA(boolean z) {
        this.reshowCTA = z;
    }

    public void setSearchAdInfo(AwemeSearchAdModel awemeSearchAdModel) {
        this.searchAdInfo = awemeSearchAdModel;
    }

    public void setShopAdData(String str) {
        this.shopAdData = str;
    }

    public void setShowAdAfterInteraction(boolean z) {
        this.showAdAfterInteraction = z;
    }

    public void setShowButtonColorSeconds(int i) {
        this.showButtonColorSeconds = i;
    }

    public void setShowButtonSeconds(int i) {
        this.showButtonSeconds = i;
    }

    public void setShowMaskTimes(int i) {
        this.showMaskTimes = i;
    }

    public void setShowOutflowMaskTimes(int i) {
        this.showOutflowMaskTimes = i;
    }

    public void setSimilarAnimation(int i) {
        this.similarAnimation = i;
    }

    public void setSkipTime(int i) {
        this.skipTime = i;
    }

    public void setSlideAction(int i) {
        this.slideAction = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSplashInfo(AwemeSplashInfo awemeSplashInfo) {
        this.splashInfo = awemeSplashInfo;
    }

    public void setSupportMultiple(int i) {
        this.mSupportMultiple = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVideoTranspose(Long l) {
        this.videoTranspose = l;
    }

    public void setWebApplyCamera(boolean z) {
        this.webApplyCamera = z;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebType(int i) {
        this.webType = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebviewProgressBar(int i) {
        this.webviewProgressBar = i;
    }

    public void setWebviewType(int i) {
        this.webviewType = i;
    }

    public void addReusableExtraParam(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.reusableExtraParams.put(str, obj);
    }

    public void appendExtraParamInCommercializeSearch(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        if (this.searchAdExtraParams == null) {
            this.searchAdExtraParams = new HashMap();
        }
        this.searchAdExtraParams.put(str, str2);
    }
}
