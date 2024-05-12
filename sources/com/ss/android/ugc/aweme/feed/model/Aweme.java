package com.ss.android.ugc.aweme.feed.model;

import X.C16880lQ;
import X.C69432nz;
import X.C70657RoD;
import X.C78540Us4;
import X.FG6;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.UPJ;
import X.V0N;
import X.X1D;
import X.YE1;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbles;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.ss.android.ugc.aweme.commerce.model.PromotionOtherInfo;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.ss.android.ugc.aweme.commercialize.model.AdNodeTrackUrl;
import com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.commercialize.model.CommerceStickerInfo;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceRerankInfo;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SearchExtraStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.im.service.model.MediaSafetyModel;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TTMInfo;
import com.ss.android.ugc.aweme.music.model.TTMMusicInfo;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.QuestionInfo;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.search.caption.LinkMatch;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Aweme implements Serializable, InterfaceC65316PkG, Cloneable {
    public Integer SearchTabRank;

    @InterfaceC65349Pkn("activity")
    public AwemeActivity activity;

    @InterfaceC65349Pkn("activity_id")
    public String activityId;

    @InterfaceC65349Pkn("activity_pendant")
    public CommerceActivityStruct activityPendant;

    @InterfaceC65349Pkn("ad_aweme_source")
    public int adAwemeSource;

    @InterfaceC65349Pkn("ad_link_type")
    public int adLinkType;

    @InterfaceC65349Pkn("ad_schedule")
    public String adSchedule;

    @InterfaceC65349Pkn("add_yours_recommendation")
    public AddYoursRecommendation addYoursRecommendation;

    @InterfaceC65349Pkn("added_sound_music_info")
    public Music addedSoundMusicInfo;

    @InterfaceC65349Pkn("aweme_id")
    public String aid;

    @InterfaceC65349Pkn("allow_gift")
    public boolean allowGift;

    @InterfaceC65349Pkn("allow_reuse_original_sound")
    public Boolean allowReuseOriginalSound;

    @InterfaceC65349Pkn("anchor")
    public Anchor anchor;
    public AnchorCustomData anchorCustomData;

    @InterfaceC65349Pkn("anchor_info")
    public AnchorInfo anchorInfo;
    public int anchorType;

    @InterfaceC65349Pkn("anchors")
    public List<AnchorCommonStruct> anchors;

    @InterfaceC65349Pkn("anchors_extras")
    public String anchorsExtras;

    @InterfaceC65349Pkn("animated_btn")
    public AnimatedBtnStruct animatedBtnStruct;

    @InterfaceC65349Pkn("audio")
    public Audio audio;

    @InterfaceC65349Pkn("author")
    public User author;

    @InterfaceC65349Pkn("aweme_acl")
    public AwemeACLShare awemeACLShareInfo;

    @InterfaceC65349Pkn("aweme_control")
    public AwemeControl awemeControl;
    public int awemePosition;

    @InterfaceC65349Pkn("raw_ad_data")
    public AwemeRawAd awemeRawAd;

    @InterfaceC65349Pkn("risk_infos")
    public AwemeRiskModel awemeRiskModel;

    @InterfaceC65349Pkn("aweme_type")
    public int awemeType;

    @InterfaceC65349Pkn("banner_tip")
    public BannerTip bannerTip;

    @InterfaceC65349Pkn("batch_id")
    public String batchId;

    @InterfaceC65349Pkn("batch_index")
    public int batchIndex;

    @InterfaceC65349Pkn("behind_the_song_video_music_ids")
    public List<String> behindTheSongMusicIds;

    @InterfaceC65349Pkn("boost_tag_info")
    public Boost boost;

    @InterfaceC65349Pkn("bottom_bar")
    public BottomBarModel bottomBarModel;

    @InterfaceC65349Pkn("branded_content_accounts")
    public List<BrandedContentAccount> brandContentAccounts;

    @InterfaceC65349Pkn("bubble_info")
    public AwemeBubbleInfo bubbleInfo;
    public transient AVUploadMiscInfoStruct cacheAvUploadMiscInfoStruct;
    public int captionLength;
    public int captionReturnCount;

    @InterfaceC65349Pkn("card")
    public CardInsertInfo cardInsertInfo;

    @InterfaceC65349Pkn("cc_template_info")
    public CCTemplateInfo ccTemplateInfo;
    public String challengeId;

    @InterfaceC65349Pkn("cha_list")
    public List<Challenge> challengeList;

    @InterfaceC65349Pkn("cmt_swt")
    public boolean cmtSwt;

    @InterfaceC65349Pkn("collect_stat")
    public int collectStatus;

    @InterfaceC65349Pkn("comment_config")
    public AwemeCommentConfig commentConfig;

    @InterfaceC65349Pkn("item_comment_settings")
    public int commentSetting;

    @InterfaceC65349Pkn("suggest_words")
    public CommentSuggestWordList commentSuggestWordList;

    @InterfaceC65349Pkn("commerce_config_data")
    public List<CommerceConfigData> commerceConfigDataList;

    @InterfaceC65349Pkn("commerce_rerank_info")
    public CommerceRerankInfo commerceRerankInfo;

    @InterfaceC65349Pkn("commerce_sticker_info")
    public CommerceStickerInfo commerceStickerInfo;

    @InterfaceC65349Pkn("commercial_video_info")
    public String commercialVideoInfo;

    @InterfaceC65349Pkn("content_desc")
    public String contentDesc;

    @InterfaceC65349Pkn("content_desc_extra")
    public List<TextExtraStruct> contentDescExtra;

    @InterfaceC65349Pkn("content_original_type")
    public int contentOriginalType;

    @InterfaceC65349Pkn("content_size_type")
    public int contentSizeType;

    @InterfaceC65349Pkn("content_type")
    public String contentType;

    @InterfaceC65349Pkn("create_time")
    public long createTime;
    public long date;

    @InterfaceC65349Pkn("deduplication_type")
    public int deduplicationType;

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("desc_language")
    public String descLanguage;

    @InterfaceC65349Pkn("descendants")
    public DescendantsModel descendantsModel;

    @InterfaceC65349Pkn("disable_search_trending_bar")
    public boolean disableSearchTrendingBar;

    @InterfaceC65349Pkn("distance")
    public String distance;

    @InterfaceC65349Pkn("distribute_type")
    public int distributeType;

    @InterfaceC65349Pkn("dou_discount_label")
    public String douDiscountLabel;

    @InterfaceC65349Pkn("dou_discount_mix_info")
    public HotSearchInfo douDiscountMixInfo;

    @InterfaceC65349Pkn("without_watermark")
    public boolean downloadWithoutWatermark;

    @InterfaceC65349Pkn("music_dsp_info")
    public Dsp dsp;

    @InterfaceC65349Pkn("item_duet")
    public int duetSetting;

    @InterfaceC65349Pkn("duetted_count")
    public long duettedCount;

    @InterfaceC65349Pkn("duet_info")
    public DuetInfo duettedInfo;

    @InterfaceC65349Pkn("ttec_suggest_words")
    public EcFeedSuggestWordList ecFeedSuggestWordList;

    @InterfaceC65349Pkn("edit_post_permission")
    public EditPostPermission editPostPermission;
    public transient WeakReference<CharSequence> ellipsizeDesc;
    public transient ExploreClientExtra exploreClientExtra;

    @InterfaceC65349Pkn("external_video_type")
    public int externalType;

    @InterfaceC65349Pkn("extra")
    public String extra;
    public String fakeAid;
    public List<User> familiarRecommendUser;
    public long feedCount;

    @InterfaceC65349Pkn("feed_relation_label")
    public RelationLabelNew feedRelationLabel;
    public int feedSource;
    public long filterDuplicateTime;

    @InterfaceC65349Pkn("filter_stranger_comments")
    public boolean filterStrangerComments;

    @InterfaceC65349Pkn("filter_unfriendly_user_comments")
    public boolean filterUnfriendlyUserComments;

    @InterfaceC65349Pkn("floating_card_content")
    public FloatingCardInfo floatingCardInfo;
    public transient CharSequence foldedHashTagDesc;
    public transient List<TextExtraStruct> foldedTextExtra;

    @InterfaceC65349Pkn("follow_up_first_item_id")
    public String followUpFirstItemId;

    @InterfaceC65349Pkn("follow_up_item_id_groups")
    public String followUpItemIdGroups;

    @InterfaceC65349Pkn("follow_up_publish_from_id")
    public long followUpPublishFromId;
    public Boolean forceUseUniqueId;

    @InterfaceC65349Pkn("forward_comment_id")
    public String forwardCommentId;

    @InterfaceC65349Pkn("forward_item")
    public Aweme forwardItem;

    @InterfaceC65349Pkn("forward_item_id")
    public String forwardItemId;
    public Challenge fromRawChallenge;

    @InterfaceC65349Pkn("game_info")
    public GameInfo gameInfo;

    @InterfaceC65349Pkn("geofencing_regions")
    public List<String> geofencingRegions;

    @InterfaceC65349Pkn("green_screen_materials")
    public List<GreenScreenMaterial> greenScreenMaterialList;

    @InterfaceC65349Pkn("group_id")
    public String groupId;

    @InterfaceC65349Pkn("GroupIdList")
    public GroupIdListStruct groupIdList;
    public boolean hasCreationIntention;

    @InterfaceC65349Pkn("has_promote_entry")
    public int hasPromoteEntry;
    public boolean hasSeeMoreBeenShown;

    @InterfaceC65349Pkn("has_vs_entry")
    public boolean hasVisionSearchEntry;

    @InterfaceC65349Pkn("hot_list")
    public HotListStruct hotListStruct;

    @InterfaceC65349Pkn("hot_info")
    public HotSearchInfo hotSearchInfo;

    @InterfaceC65349Pkn("hotsearch_info")
    public HotSearchInfoStruct hotSearchInfoStruct;
    public String hotSpot;

    @InterfaceC65349Pkn("hybrid_label")
    public List<AwemeHybridLabelModel> hybridLabels;
    public UrlModel icon;
    public transient String imItemId;

    @InterfaceC65349Pkn("image_infos")
    public List<ImageInfo> imageInfos;

    @InterfaceC65349Pkn("insert_aweme")
    public Aweme insertAweme;

    @InterfaceC65349Pkn("video_insight_status")
    public int insightsEligibilityStatus;

    @InterfaceC65349Pkn("interact_permission")
    public InteractPermission interactPermission;

    @InterfaceC65349Pkn("interaction_stickers")
    public List<InteractStickerStruct> interactStickerStructs;

    @InterfaceC65349Pkn("interaction_tag_info")
    public InteractionTagInfo interactionTagInfo;

    @InterfaceC65349Pkn("is_ads")
    public boolean isAd;
    public boolean isAttrUpdated;
    public Boolean isBehindTheSongVideoType;

    @InterfaceC65349Pkn("is_client_cache")
    public boolean isClientCache;

    @InterfaceC65349Pkn("is_description_translatable")
    public boolean isDescTranslatable;

    @InterfaceC65349Pkn("is_effect_designer")
    public boolean isEffectDesigner;
    public boolean isEnableVideoSkip;
    public boolean isFakeResponse;

    @InterfaceC65349Pkn("is_fantasy")
    public boolean isFantasy;

    @InterfaceC65349Pkn("is_feature_video")
    public VideoType isFeatureVideo;
    public Boolean isFeatureVideoItem;
    public Boolean isFeatureVideoSelected;
    public boolean isFollowerVideoPresent;
    public boolean isForMusicDetailLoading;
    public boolean isFriendVideoPresent;
    public boolean isFriendsTabFakeAweme;
    public boolean isFriendsVideoUnread;
    public boolean isFromSplitData;

    @InterfaceC65349Pkn("is_hash_tag")
    public int isHashTag;
    public boolean isHighlighted;

    @InterfaceC65349Pkn("is_intext_occlude_desc")
    public String isIntextOccludeDesc;

    @InterfaceC65349Pkn("is_intext_occlude_interaction")
    public String isIntextOccludeInteraction;

    @InterfaceC65349Pkn("is_intext_occlude_tab")
    public String isIntextOccludeTab;

    @InterfaceC65349Pkn("is_intext_out")
    public String isIntextOut;

    @InterfaceC65349Pkn("is_live_has_products")
    public boolean isLiveHasProduct;

    @InterfaceC65349Pkn("is_nff_or_nr")
    public boolean isNrNff;

    @InterfaceC65349Pkn("is_on_this_day")
    public int isOnThisDay;

    @InterfaceC65349Pkn("is_paid_content")
    public boolean isPaidContent;

    @InterfaceC65349Pkn("is_pgcshow")
    public boolean isPgcShow;

    @InterfaceC65349Pkn("is_pinned_by_artist")
    public boolean isPinnedByArtist;
    public boolean isPreloadScroll;

    @InterfaceC65349Pkn("is_preview")
    public int isPreview;

    @InterfaceC65349Pkn("is_prohibited")
    public boolean isProhibited;
    public boolean isRecBigCardFakeAweme;
    public boolean isReferralFakeAweme;

    @InterfaceC65349Pkn("is_relieve")
    public boolean isRelieve;
    public transient boolean isReversionForwardAweme;
    public boolean isStoryFakeAweme;
    public boolean isStoryPacked;

    @InterfaceC65349Pkn("is_story_to_normal")
    public boolean isStoryToNormal;
    public boolean isSubAweme;

    @InterfaceC65349Pkn("is_sub_only_video")
    public boolean isSubOnlyVideo;

    @InterfaceC65349Pkn("is_text_sticker_translatable")
    public boolean isTextStickerTranslatable;

    @InterfaceC65349Pkn("is_tiktok_story")
    public boolean isTikTokStory;

    @InterfaceC65349Pkn("is_top")
    public int isTop;

    @InterfaceC65349Pkn("is_vr")
    public boolean isVr;

    @InterfaceC65349Pkn("label_large")
    public UrlModel labelLarge;

    @InterfaceC65349Pkn("label_private")
    public UrlModel labelPrivate;

    @InterfaceC65349Pkn("label_thumb")
    public UrlModel labelThumb;

    @InterfaceC65349Pkn("label_top")
    public UrlModel labelTop;

    @InterfaceC65349Pkn("landing_page")
    public String landingPage;

    @InterfaceC65349Pkn("law_critical_country")
    public boolean lawCriticalCountry;

    @InterfaceC65349Pkn("link_ad_data")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public LinkData linkAdData;

    @InterfaceC65349Pkn("link_match")
    public LinkMatch linkMatch;

    @InterfaceC65349Pkn("live_id")
    public long liveId;
    public boolean livePreviewLongPressDisabled;
    public Integer[] livePreviewSize;

    @InterfaceC65349Pkn("live_reason")
    public String liveReaSon;

    @InterfaceC65349Pkn("live_type")
    public String liveType;

    @InterfaceC65349Pkn("live_window_show_time")
    public long liveWindowShowTime;
    public LogPbBean logPb;

    @InterfaceC65349Pkn("long_video")
    public List<LongVideo> longVideos;

    @InterfaceC65349Pkn("commerce_info")
    public AwemeCommerceStruct mCommerceVideoAuthInfo;
    public int mConcatAndUploadState;

    @InterfaceC65349Pkn("search_highlight")
    public List<HighlightInfo> mHighlightInfoList;

    @InterfaceC65349Pkn("item_distribute_source")
    public String mItemDistributeSource;

    @InterfaceC65349Pkn("item_source_category")
    public int mItemSourceCategory;

    @InterfaceC65349Pkn("label_music_starter_text")
    public String mLabelMusicStarterText;

    @InterfaceC65349Pkn("label_origin_author_text")
    public String mLabelOriginAuthorText;

    @InterfaceC65349Pkn("cny_info")
    public LiveAwesomeSplashInfo mLiveAwesomeSplashInfo;
    public HashMap<String, String> mMobParams;

    @InterfaceC65349Pkn("new_relation_label")
    public List<RelationLabelNew> mNewRelationLabel;

    @InterfaceC65349Pkn("paid_content_info")
    public PaidContentInfo mPaidContentInfo;

    @InterfaceC65349Pkn("cell_room")
    public RoomFeedCellStruct mRoomFeedCellStruct;

    @InterfaceC65349Pkn("main_arch_common")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public MainArchCommon mainArchCommon;

    @InterfaceC65349Pkn("match_text")
    public String matchText;

    @InterfaceC65349Pkn("match_type")
    public int matchType;
    public MediaSafetyModel mediaSafetyModel;

    @InterfaceC65349Pkn("micro_app_info")
    public MicroAppInfo microAppInfo;
    public MixFlowParam mixFlowParam;

    @InterfaceC65349Pkn("mix_info")
    public MixStruct mixInfo;

    @InterfaceC65349Pkn("music")
    public Music music;

    @InterfaceC65349Pkn("music_begin_time_in_ms")
    public int musicBeginTime;

    @InterfaceC65349Pkn("music_end_time_in_ms")
    public int musicEndTime;

    @InterfaceC65349Pkn("music_selected_from")
    public String musicSelectedFrom;

    @InterfaceC65349Pkn("label_music_starter")
    public UrlModel musicStarter;

    @InterfaceC65349Pkn("music_title_style")
    public int musicTitleStyle;

    @InterfaceC65349Pkn("music_volume")
    public String musicVolume;

    @InterfaceC65349Pkn("mutual_relation")
    public MutualStruct mutualRelation;

    @InterfaceC65349Pkn("nearby_fresh_label")
    public String nearbyHotLabel;

    @InterfaceC65349Pkn("nearby_info")
    public NearbyInfo nearbyInfo;

    @InterfaceC65349Pkn("should_add_creator_tts_watermark_when_downloading")
    public boolean needTTSWatermarkWhenDownload;

    @InterfaceC65349Pkn("need_vs_entry")
    public boolean needVisionSearchEntry;

    @InterfaceC65349Pkn("rawdata")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public NewLiveRoomStruct newLiveRoomData;

    @InterfaceC65349Pkn("new_source_id")
    public String newSourceId;

    @InterfaceC65349Pkn("new_source_type")
    public String newSourceType;
    public int newTranslateY;

    @InterfaceC65349Pkn("nickname_position")
    public List<Position> nicknamePosition;

    @InterfaceC65349Pkn("now_posts")
    public NowPostInfo nowPostInfo;

    @InterfaceC65349Pkn("operator_boost_info")
    public List<OperatorBoost> operatorBoosts;

    @InterfaceC65349Pkn("label_origin_author")
    public UrlModel originAuthor;

    @InterfaceC65349Pkn("origin_comment_ids")
    public List<String> originCommentIds;

    @InterfaceC65349Pkn("origin_volume")
    public String originVolume;

    @InterfaceC65349Pkn("original_audio")
    public OriginalAudioStruct originalAudio;

    @InterfaceC65349Pkn("original_client_text")
    public ClientText originalClientText;
    public int originalPos;
    public String parentHotSpot;

    @InterfaceC65349Pkn("part_n")
    public String partN;
    public transient String photoContentType;

    @InterfaceC65349Pkn("image_post_info")
    public PhotoModeImageInfo photoModeImageInfo;
    public transient CharSequence photoModeTitleLine;

    @InterfaceC65349Pkn("playlist_blocked")
    public boolean playlistBlocked;

    @InterfaceC65349Pkn("playlist_info")
    public PlayListInfo playlist_info;

    @InterfaceC65349Pkn("podcast_info")
    public PodcastInfo podcastInfo;

    @InterfaceC65349Pkn("poi_data")
    public PoiDataStruct poiDataStruct;

    @InterfaceC65349Pkn("poi_re_tag_signal")
    public int poiReTagSignal;

    @InterfaceC65349Pkn("poi_re_tag_text")
    public String poiReTagText;

    @InterfaceC65349Pkn("position")
    public List<Position> position;

    @InterfaceC65349Pkn("pre_forward_id")
    public String preForwardId;

    @InterfaceC65349Pkn("preload")
    public Preload preload;

    @InterfaceC65349Pkn("prevent_download")
    public boolean preventDownload;
    public PublishPreviewInfo previewData;
    public transient WeakReference<CharSequence> processedDesc;

    @InterfaceC65349Pkn("ttt_product_recall_type")
    public int productRecallType;

    @InterfaceC65349Pkn("products_count")
    public int productsCount;

    @InterfaceC65349Pkn("products_info")
    public List<Product> productsInfo;

    @InterfaceC65349Pkn("promote")
    public PromoteModel promoteModel;

    @InterfaceC65349Pkn("promote_toast")
    public String promoteToast;

    @InterfaceC65349Pkn("promote_toast_key")
    public String promoteToastKey;

    @InterfaceC65349Pkn("promotion_other_info")
    public PromotionOtherInfo promotionOtherInfo;

    @InterfaceC65349Pkn("question_list")
    public List<QuestionInfo> questionInfo;
    public String rateScore;

    @InterfaceC65349Pkn("react_from")
    public String reactFrom;

    @InterfaceC65349Pkn("react_origin")
    public String reactOrigin;

    @InterfaceC65349Pkn("item_react")
    public int reactSetting;

    @InterfaceC65349Pkn("react_view")
    public String reactView;

    @InterfaceC65349Pkn("rec_reason")
    public RecReasonsStruct recReasonsStruct;

    @InterfaceC65349Pkn("recommend_card_type")
    public int recommendCardType;

    @InterfaceC65349Pkn("region")
    public String region;

    @InterfaceC65349Pkn("related_live")
    public RelatedLiveTagStruct relatedLiveTagStruct;

    @InterfaceC65349Pkn("relation_label")
    public RelationDynamicLabel relationLabel;

    @InterfaceC65349Pkn("relation_recommend_info")
    public AwemeRelationRecommendModel relationRecommendInfo;
    public List<Float> relevantTime;
    public boolean replaceRecTagByRepost;
    public String repostFromGroupId;
    public String repostFromUserId;
    public String requestId;

    @InterfaceC65349Pkn("retry_type")
    public int retryType;
    public String rid;

    @InterfaceC65349Pkn("room")
    public RoomStruct room;

    @InterfaceC65349Pkn("scenario")
    public int scenario;
    public String scheduleId;

    @InterfaceC65349Pkn("schedule_time")
    public long scheduleTime;

    @InterfaceC65349Pkn("search_desc")
    public String searchDesc;
    public Map<String, String> searchExtraParams;

    @InterfaceC65349Pkn("search_extra")
    public SearchExtraStruct searchExtraStruct;
    public String searchFeedType;
    public String searchTabName;

    @InterfaceC65349Pkn("share_to_story_info")
    public ShareToStoryStruct share2StoryStruct;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    @InterfaceC65349Pkn("share_url")
    public String shareUrl;
    public User sharer;

    @InterfaceC65349Pkn("shoot_tab_name")
    public String shootTabName;

    @InterfaceC65349Pkn("shop_ad_struct")
    public ShopAdStruct shopAdStruct;
    public List<SimplePromotion> simplePromotions;

    @InterfaceC65349Pkn("sound_exemption")
    public int soundExemption;

    @InterfaceC65349Pkn("sp_sticker")
    public SpecialSticker specialSticker;

    @InterfaceC65349Pkn("star_atlas_order_id")
    public long starAtlasOrderId;

    @InterfaceC65349Pkn("statistics")
    public AwemeStatistics statistics;

    @InterfaceC65349Pkn("status")
    public AwemeStatus status;

    @InterfaceC65349Pkn("sticker_detail")
    public NewFaceStickerBean stickerEntranceInfo;

    @InterfaceC65349Pkn("stickers")
    public String stickerIDs;

    @InterfaceC65349Pkn("item_stitch")
    public int stitchSetting;

    @InterfaceC65349Pkn("story_metadata")
    public Story story;

    @InterfaceC65349Pkn("ad_story_video")
    public StoryVideo storyModel;

    @InterfaceC65349Pkn("story_type")
    public int storyType;

    @InterfaceC65349Pkn("stream_url")
    public StreamUrlModel streamUrlModel;
    public Aweme subAweme;
    public UrlModel subAwemeCover;

    @InterfaceC65349Pkn("real_survey_info")
    public com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo surveyInfo;

    @InterfaceC65349Pkn("survey_info")
    public List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> surveyInfos;

    @InterfaceC65349Pkn("survey_key")
    public String surveyKey;

    @InterfaceC65349Pkn("take_down_desc")
    public String takeDownDesc;

    @InterfaceC65349Pkn("take_down_reason")
    public int takeDownReason;

    @InterfaceC65349Pkn("tcm_info")
    public TCMInfo tcmInfo;

    @InterfaceC65349Pkn("text_extra")
    public List<TextExtraStruct> textExtra;

    @InterfaceC65349Pkn("text_sticker_major_lang")
    public String textStickerMajorityLang;

    @InterfaceC65349Pkn("label_top_text")
    public List<AwemeTextLabelModel> textTopLabels;

    @InterfaceC65349Pkn("video_text")
    public List<AwemeTextLabelModel> textVideoLabels;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("trans_params")
    public String transParams;

    @InterfaceC65349Pkn("trending_bar")
    public AwemeTrendingBar trendingBar;

    @InterfaceC65349Pkn("trending_bar_fyp")
    public AwemeTrendingBar trendingBarFYP;

    @InterfaceC65349Pkn("ttm_info")
    public TTMInfo ttmInfo;

    @InterfaceC65349Pkn("tts_voice_ids")
    public List<String> ttsVoiceIDs;

    @InterfaceC65349Pkn("reference_tts_voice_ids")
    public List<String> ttsVoiceRefIDs;

    @InterfaceC65349Pkn("uniqid_position")
    public List<Position> uniqidPosition;
    public String uniqueId;

    @InterfaceC65349Pkn("misc_info")
    public String uploadMiscInfoStructStr;

    @InterfaceC65349Pkn("upvote_preload")
    public UpvotePreloadStruct upvotePreload;

    @InterfaceC65349Pkn("upvote_reason")
    public UpvoteReason upvoteReason;

    @InterfaceC65349Pkn("user_digged")
    public int userDigg;

    @InterfaceC65349Pkn("user_now_post")
    public UserNowPost userNowPost;

    @InterfaceC65349Pkn("user_profile_init_info")
    public UserProfileInitInfo userProfileInitInfo;

    @InterfaceC65349Pkn("user_story")
    public UserStory userStory;

    @InterfaceC65349Pkn("voice_filter_ids")
    public List<String> vcVoiceIDs;

    @InterfaceC65349Pkn("reference_voice_filter_ids")
    public List<String> vcVoiceRefIDs;

    @InterfaceC65349Pkn("video")
    public Video video;

    @InterfaceC65349Pkn("video_control")
    public VideoControl videoControl;

    @InterfaceC65349Pkn("video_feed_tag")
    public String videoFeedTag;

    @InterfaceC65349Pkn("video_labels")
    public List<AwemeLabelModel> videoLabels;

    @InterfaceC65349Pkn("mask_info")
    public VideoMaskInfo videoMaskInfo;

    @InterfaceC65349Pkn("video_reply_info")
    public VideoReplyStruct videoReplyStruct;
    public boolean withSearchSurvey;

    @InterfaceC65349Pkn("with_survey")
    public boolean withSurvey;

    @InterfaceC65349Pkn("rate")
    public int rate = -1;

    @InterfaceC65349Pkn("can_play")
    public boolean canPlay = true;
    public InteractionBubbles interactionBubbles = new InteractionBubbles();

    @InterfaceC65349Pkn("is_familiar")
    public boolean isFamiliar = false;
    public boolean isLastInSpot = false;
    public boolean isFirstInSpot = false;
    public boolean isFromDouPlusGuideAnimate = false;

    @InterfaceC65349Pkn("mask_infos")
    public List<VideoMaskInfo> videoMaskInfos = new ArrayList();
    public VideoMaskInfo reportMaskInfo = null;
    public VideoMaskInfo generalMaskInfo = null;
    public VideoMaskInfo photosensitiveMaskInfo = null;
    public VideoMaskInfo contentClassificationMaskInfo = null;
    public boolean isCanCache = true;
    public int hasAd = 0;
    public boolean isCommentClicked = false;
    public boolean isForwardClicked = false;
    public int adDescMaxLines = 4;
    public boolean adDescHandle = true;

    @InterfaceC65349Pkn("with_promotional_music")
    public boolean withPromotionalMusic = false;
    public String anchorWikiOfflineText = "";
    public String searchDocOriginLanguage = null;
    public String searchDocTranslate = null;

    @InterfaceC65349Pkn("have_dashboard")
    public boolean haveDashboard = false;

    @InterfaceC65349Pkn("is_live_replay")
    public boolean isLiveReplay = false;
    public transient int totalProductAnchors = 0;

    @InterfaceC65349Pkn("new_label")
    public int newLabel = 0;

    @InterfaceC65349Pkn("detail_page_video_tag")
    public int detailPageVideoTag = VideoTag.DEFAULT.videoTag;

    @InterfaceC65349Pkn("support_danmaku")
    public boolean isSupportDanmaku = false;

    @InterfaceC65349Pkn("has_danmaku")
    public boolean hasDanmaku = false;

    @InterfaceC65349Pkn("parameterized_speed")
    public float parameterizedSpeed = -1.0f;
    public String isFromTrendingCard = "";
    public int mRank = -1;
    public String trendingId = "";
    public String trendingName = "";

    @InterfaceC65349Pkn("aigc_info")
    public AIGCInfo aigcInfo = new AIGCInfo();

    /* loaded from: classes13.dex */
    public interface ConcatAndUploadState {
    }

    public static boolean containsGreenScreenGiphyAnchor(List<AnchorCommonStruct> list) {
        return false;
    }

    private boolean commerceVideoTypeAllowDuetReact() {
        int i = this.awemeType;
        if (i == 1 || i == 29 || i == 30 || i == 32 || i == 33 || i == 201) {
            return true;
        }
        return false;
    }

    private boolean isMultiForwardAweme() {
        if (C78540Us4.LJIILLIIL(this.textExtra)) {
            return false;
        }
        Iterator<TextExtraStruct> it = this.textExtra.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == 2) {
                return true;
            }
        }
        return false;
    }

    public void buildUniqueId() {
        if (!TextUtils.isEmpty(this.requestId)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.requestId);
            LIZ.append("|");
            LIZ.append(this.aid);
            this.uniqueId = X1D.LIZIZ(LIZ);
        }
    }

    public boolean canDuetVideoType() {
        int i = this.awemeType;
        if (i == 0 || i == 51 || i == 52 || i == 58 || i == 54 || i == 53 || i == 61 || i == 55 || i == 56 || i == 150 || i == 160 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public boolean canReactVideoType() {
        int i = this.awemeType;
        if (i == 52 || i == 0 || i == 51 || i == 58 || i == 54 || i == 53 || i == 61 || i == 55 || i == 56 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public boolean canShare() {
        return this.status.allowShare;
    }

    public boolean canStitchVideoType() {
        int i = this.awemeType;
        if (i == 0 || i == 51 || i == 52 || i == 54 || i == 53 || i == 61 || i == 55 || i == 56 || i == 150 || i == 160 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Aweme m114clone() {
        AwemeStatistics m115clone;
        AwemeStatus m116clone;
        Aweme aweme = new Aweme();
        aweme.aid = this.aid;
        aweme.commerceConfigDataList = this.commerceConfigDataList;
        aweme.starAtlasOrderId = this.starAtlasOrderId;
        aweme.tcmInfo = this.tcmInfo;
        aweme.desc = this.desc;
        aweme.createTime = this.createTime;
        aweme.author = this.author;
        aweme.music = this.music;
        aweme.addedSoundMusicInfo = this.addedSoundMusicInfo;
        aweme.musicVolume = this.musicVolume;
        aweme.originVolume = this.originVolume;
        aweme.challengeList = this.challengeList;
        aweme.originalAudio = this.originalAudio;
        aweme.greenScreenMaterialList = this.greenScreenMaterialList;
        aweme.video = this.video;
        aweme.audio = this.audio;
        aweme.longVideos = this.longVideos;
        aweme.shareUrl = this.shareUrl;
        aweme.userDigg = this.userDigg;
        AwemeStatistics awemeStatistics = this.statistics;
        AwemeCommerceStruct awemeCommerceStruct = null;
        if (awemeStatistics == null) {
            m115clone = null;
        } else {
            m115clone = awemeStatistics.m115clone();
        }
        aweme.statistics = m115clone;
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null) {
            m116clone = null;
        } else {
            m116clone = awemeStatus.m116clone();
        }
        aweme.status = m116clone;
        aweme.isSubOnlyVideo = this.isSubOnlyVideo;
        aweme.filterStrangerComments = this.filterStrangerComments;
        aweme.filterUnfriendlyUserComments = this.filterUnfriendlyUserComments;
        aweme.reactFrom = this.reactFrom;
        aweme.reactOrigin = this.reactOrigin;
        aweme.reactView = this.reactView;
        aweme.commerceStickerInfo = this.commerceStickerInfo;
        aweme.videoControl = this.videoControl;
        aweme.distributeType = this.distributeType;
        aweme.insightsEligibilityStatus = this.insightsEligibilityStatus;
        aweme.extra = this.extra;
        aweme.photoModeImageInfo = this.photoModeImageInfo;
        aweme.rate = this.rate;
        aweme.shareInfo = this.shareInfo;
        aweme.textVideoLabels = this.textVideoLabels;
        aweme.textTopLabels = this.textTopLabels;
        aweme.videoLabels = this.videoLabels;
        aweme.isHashTag = this.isHashTag;
        aweme.awemeType = this.awemeType;
        aweme.adAwemeSource = this.adAwemeSource;
        aweme.awemeRawAd = this.awemeRawAd;
        aweme.specialSticker = this.specialSticker;
        aweme.relationLabel = this.relationLabel;
        aweme.cmtSwt = this.cmtSwt;
        aweme.streamUrlModel = this.streamUrlModel;
        aweme.title = this.title;
        aweme.isPgcShow = this.isPgcShow;
        aweme.imageInfos = this.imageInfos;
        aweme.awemeRiskModel = this.awemeRiskModel;
        aweme.bottomBarModel = this.bottomBarModel;
        aweme.descendantsModel = this.descendantsModel;
        aweme.collectStatus = this.collectStatus;
        aweme.scenario = this.scenario;
        aweme.lawCriticalCountry = this.lawCriticalCountry;
        aweme.canPlay = this.canPlay;
        aweme.commentSetting = this.commentSetting;
        aweme.commentConfig = this.commentConfig;
        aweme.reactSetting = this.reactSetting;
        aweme.duetSetting = this.duetSetting;
        aweme.stitchSetting = this.stitchSetting;
        aweme.simplePromotions = this.simplePromotions;
        aweme.activityPendant = this.activityPendant;
        aweme.interactPermission = this.interactPermission;
        aweme.promotionOtherInfo = this.promotionOtherInfo;
        aweme.position = this.position;
        aweme.uniqidPosition = this.uniqidPosition;
        aweme.nicknamePosition = this.nicknamePosition;
        aweme.room = this.room;
        aweme.deduplicationType = this.deduplicationType;
        aweme.stickerIDs = this.stickerIDs;
        aweme.uploadMiscInfoStructStr = this.uploadMiscInfoStructStr;
        aweme.takeDownReason = this.takeDownReason;
        aweme.takeDownDesc = this.takeDownDesc;
        aweme.forwardItem = this.forwardItem;
        aweme.forwardItemId = this.forwardItemId;
        aweme.forwardCommentId = this.forwardCommentId;
        aweme.preForwardId = this.preForwardId;
        aweme.preventDownload = this.preventDownload;
        aweme.region = this.region;
        aweme.microAppInfo = this.microAppInfo;
        aweme.gameInfo = this.gameInfo;
        aweme.isProhibited = this.isProhibited;
        aweme.hotSearchInfo = this.hotSearchInfo;
        aweme.hotListStruct = this.hotListStruct;
        aweme.downloadWithoutWatermark = this.downloadWithoutWatermark;
        aweme.linkAdData = this.linkAdData;
        aweme.adLinkType = this.adLinkType;
        aweme.allowReuseOriginalSound = this.allowReuseOriginalSound;
        aweme.isCanCache = this.isCanCache;
        aweme.hasAd = this.hasAd;
        aweme.isPreloadScroll = this.isPreloadScroll;
        aweme.isFakeResponse = this.isFakeResponse;
        aweme.repostFromGroupId = this.repostFromGroupId;
        aweme.repostFromUserId = this.repostFromUserId;
        aweme.date = this.date;
        aweme.filterDuplicateTime = this.filterDuplicateTime;
        aweme.labelLarge = this.labelLarge;
        aweme.labelPrivate = this.labelPrivate;
        aweme.labelThumb = this.labelThumb;
        aweme.textExtra = this.textExtra;
        aweme.isTop = this.isTop;
        aweme.labelTop = this.labelTop;
        aweme.originAuthor = this.originAuthor;
        aweme.musicStarter = this.musicStarter;
        aweme.mLabelOriginAuthorText = this.mLabelOriginAuthorText;
        aweme.mLabelMusicStarterText = this.mLabelMusicStarterText;
        aweme.originalPos = this.originalPos;
        aweme.distance = this.distance;
        aweme.landingPage = this.landingPage;
        aweme.isAd = this.isAd;
        aweme.isVr = this.isVr;
        aweme.isRelieve = this.isRelieve;
        aweme.adSchedule = this.adSchedule;
        aweme.preload = this.preload;
        aweme.feedCount = this.feedCount;
        aweme.isEffectDesigner = this.isEffectDesigner;
        aweme.withPromotionalMusic = this.withPromotionalMusic;
        aweme.stickerEntranceInfo = this.stickerEntranceInfo;
        aweme.anchors = this.anchors;
        aweme.interactStickerStructs = this.interactStickerStructs;
        aweme.descLanguage = this.descLanguage;
        aweme.floatingCardInfo = this.floatingCardInfo;
        aweme.originCommentIds = this.originCommentIds;
        aweme.requestId = this.requestId;
        aweme.uniqueId = this.uniqueId;
        aweme.awemePosition = this.awemePosition;
        aweme.mConcatAndUploadState = this.mConcatAndUploadState;
        aweme.awemeControl = this.awemeControl;
        aweme.hasVisionSearchEntry = this.hasVisionSearchEntry;
        aweme.anchor = this.anchor;
        aweme.anchorsExtras = this.anchorsExtras;
        AwemeCommerceStruct awemeCommerceStruct2 = this.mCommerceVideoAuthInfo;
        if (awemeCommerceStruct2 != null) {
            awemeCommerceStruct = awemeCommerceStruct2.m104clone();
        }
        aweme.mCommerceVideoAuthInfo = awemeCommerceStruct;
        aweme.isPreview = this.isPreview;
        aweme.isClientCache = this.isClientCache;
        aweme.nearbyHotLabel = this.nearbyHotLabel;
        aweme.videoReplyStruct = this.videoReplyStruct;
        aweme.linkMatch = this.linkMatch;
        aweme.liveWindowShowTime = this.liveWindowShowTime;
        aweme.hybridLabels = this.hybridLabels;
        aweme.mutualRelation = this.mutualRelation;
        aweme.newLiveRoomData = this.newLiveRoomData;
        aweme.relationRecommendInfo = this.relationRecommendInfo;
        aweme.recommendCardType = this.recommendCardType;
        aweme.withSurvey = this.withSurvey;
        aweme.withSearchSurvey = this.withSearchSurvey;
        aweme.surveyKey = this.surveyKey;
        aweme.isLiveReplay = this.isLiveReplay;
        aweme.geofencingRegions = this.geofencingRegions;
        aweme.haveDashboard = this.haveDashboard;
        aweme.groupId = this.groupId;
        aweme.hasPromoteEntry = this.hasPromoteEntry;
        aweme.promoteToastKey = this.promoteToastKey;
        aweme.promoteToast = this.promoteToast;
        aweme.videoMaskInfo = this.videoMaskInfo;
        aweme.videoMaskInfos = this.videoMaskInfos;
        aweme.generalMaskInfo = this.generalMaskInfo;
        aweme.reportMaskInfo = this.reportMaskInfo;
        aweme.photosensitiveMaskInfo = this.photosensitiveMaskInfo;
        aweme.contentClassificationMaskInfo = this.contentClassificationMaskInfo;
        aweme.anchorWikiOfflineText = this.anchorWikiOfflineText;
        aweme.bubbleInfo = this.bubbleInfo;
        aweme.allowGift = this.allowGift;
        aweme.userStory = UserStoryKt.copyUserStory(this.userStory);
        aweme.story = StoryKt.copyStory(this.story);
        aweme.batchId = this.batchId;
        aweme.batchIndex = this.batchIndex;
        aweme.scheduleId = this.scheduleId;
        aweme.isStoryFakeAweme = this.isStoryFakeAweme;
        aweme.isFriendsTabFakeAweme = this.isFriendsTabFakeAweme;
        aweme.isDescTranslatable = this.isDescTranslatable;
        aweme.isTextStickerTranslatable = this.isTextStickerTranslatable;
        aweme.textStickerMajorityLang = this.textStickerMajorityLang;
        aweme.contentDesc = this.contentDesc;
        aweme.contentDescExtra = this.contentDescExtra;
        aweme.productsInfo = this.productsInfo;
        aweme.productsCount = this.productsCount;
        aweme.sharer = this.sharer;
        aweme.foldedTextExtra = this.foldedTextExtra;
        aweme.foldedHashTagDesc = this.foldedHashTagDesc;
        aweme.isStoryPacked = this.isStoryPacked;
        aweme.nearbyInfo = this.nearbyInfo;
        aweme.share2StoryStruct = this.share2StoryStruct;
        aweme.isCommentClicked = this.isCommentClicked;
        aweme.isForwardClicked = this.isForwardClicked;
        aweme.poiReTagSignal = this.poiReTagSignal;
        aweme.poiReTagText = this.poiReTagText;
        aweme.poiDataStruct = this.poiDataStruct;
        aweme.ccTemplateInfo = this.ccTemplateInfo;
        aweme.musicSelectedFrom = this.musicSelectedFrom;
        aweme.musicTitleStyle = this.musicTitleStyle;
        aweme.ttsVoiceIDs = this.ttsVoiceIDs;
        aweme.ttsVoiceRefIDs = this.ttsVoiceRefIDs;
        aweme.vcVoiceIDs = this.vcVoiceIDs;
        aweme.vcVoiceRefIDs = this.vcVoiceRefIDs;
        aweme.isPinnedByArtist = this.isPinnedByArtist;
        aweme.transParams = this.transParams;
        aweme.isIntextOccludeTab = this.isIntextOccludeTab;
        aweme.isIntextOccludeInteraction = this.isIntextOccludeInteraction;
        aweme.isIntextOut = this.isIntextOut;
        aweme.isIntextOccludeDesc = this.isIntextOccludeDesc;
        aweme.newTranslateY = this.newTranslateY;
        aweme.awemeACLShareInfo = this.awemeACLShareInfo;
        aweme.photoModeImageInfo = this.photoModeImageInfo;
        aweme.surveyInfo = this.surveyInfo;
        aweme.surveyInfos = this.surveyInfos;
        aweme.mediaSafetyModel = this.mediaSafetyModel;
        aweme.hasCreationIntention = this.hasCreationIntention;
        aweme.behindTheSongMusicIds = this.behindTheSongMusicIds;
        aweme.detailPageVideoTag = this.detailPageVideoTag;
        aweme.mainArchCommon = this.mainArchCommon;
        aweme.feedSource = this.feedSource;
        aweme.isTikTokStory = this.isTikTokStory;
        aweme.isStoryToNormal = this.isStoryToNormal;
        aweme.playlist_info = this.playlist_info;
        aweme.aigcInfo = this.aigcInfo;
        aweme.addYoursRecommendation = this.addYoursRecommendation;
        return aweme;
    }

    public AIGCInfo getAigcInfo() {
        if (this.aigcInfo == null) {
            this.aigcInfo = new AIGCInfo();
        }
        return this.aigcInfo;
    }

    public String getAuthorUid() {
        User user = this.author;
        if (user == null || user.getUid() == null) {
            return "";
        }
        return this.author.getUid();
    }

    public AwemeControl getAwemeControl() {
        if (this.awemeControl == null) {
            this.awemeControl = new AwemeControl();
        }
        return this.awemeControl;
    }

    public String getAwemeRawAdIdStr() {
        AwemeRawAd awemeRawAd = this.awemeRawAd;
        if (awemeRawAd != null) {
            return awemeRawAd.getCreativeIdStr();
        }
        return "";
    }

    public ItemCommentEggGroup getCommentEggGroup() {
        List<CommerceConfigData> list = this.commerceConfigDataList;
        if (list != null && !list.isEmpty()) {
            for (CommerceConfigData commerceConfigData : this.commerceConfigDataList) {
                if (commerceConfigData.type == 4) {
                    return commerceConfigData.itemCommentEggGroup;
                }
            }
            return null;
        }
        return null;
    }

    public ItemLikeEggData getCommerceAdLikeDigg() {
        ItemLikeEggData itemLikeEggData;
        List<CommerceConfigData> list = this.commerceConfigDataList;
        if (list != null && !list.isEmpty()) {
            for (CommerceConfigData commerceConfigData : this.commerceConfigDataList) {
                if (commerceConfigData.type == 1 && (itemLikeEggData = commerceConfigData.itemLikeEggData) != null) {
                    return itemLikeEggData;
                }
            }
            return null;
        }
        return null;
    }

    public VideoMaskInfo getContentClassificationMaskInfo() {
        if (this.contentClassificationMaskInfo == null) {
            this.contentClassificationMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 5);
        }
        return this.contentClassificationMaskInfo;
    }

    public String getCoverNotice() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.getReviewResult() != null) {
            return this.status.getReviewResult().getCoverNotice();
        }
        return "";
    }

    public VideoTag getDetailPageVideoTag() {
        return VideoTag.getTag(this.detailPageVideoTag);
    }

    public int getDownloadStatus() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null) {
            return 0;
        }
        return awemeStatus.getDownloadStatus();
    }

    public UrlModel getDynamicPreferredCover() {
        Video video = this.video;
        if (video == null) {
            List<ImageInfo> list = this.imageInfos;
            if (list == null || list.isEmpty()) {
                return null;
            }
            return ((ImageInfo) ListProtector.get(this.imageInfos, 0)).labelThumb;
        }
        UrlModel urlModel = video.dynamicCover;
        if (urlModel != null) {
            return urlModel;
        }
        UrlModel urlModel2 = video.cover;
        if (urlModel2 == null) {
            return null;
        }
        return urlModel2;
    }

    public CharSequence getEllipsizeDesc() {
        WeakReference<CharSequence> weakReference = this.ellipsizeDesc;
        if (weakReference == null || TextUtils.isEmpty(weakReference.get())) {
            return getDesc();
        }
        return this.ellipsizeDesc.get();
    }

    public int getEnterpriseType() {
        User user = this.author;
        if (user == null) {
            return 0;
        }
        return user.getCommerceUserLevel();
    }

    public String getFirstPlayAddr() {
        VideoUrlModel properPlayAddr;
        Video video = this.video;
        if (video != null && (properPlayAddr = video.getProperPlayAddr()) != null && !C78540Us4.LJIILLIIL(properPlayAddr.getUrlList())) {
            return (String) ListProtector.get(properPlayAddr.getUrlList(), 0);
        }
        return null;
    }

    public CharSequence getFoldedHashTagDesc() {
        CharSequence charSequence = this.foldedHashTagDesc;
        if (charSequence == null || TextUtils.isEmpty(charSequence)) {
            return getDesc();
        }
        return this.foldedHashTagDesc;
    }

    public List<TextExtraStruct> getFoldedTextExtra() {
        List<TextExtraStruct> list = this.foldedTextExtra;
        if (list == null || list.size() == 0) {
            return getTextExtra();
        }
        return this.foldedTextExtra;
    }

    public int getFollowStatus() {
        User user = this.author;
        if (user != null) {
            return user.getFollowStatus();
        }
        return -1;
    }

    public String getForwardUserId() {
        if (C78540Us4.LJIILLIIL(this.textExtra)) {
            return "";
        }
        for (TextExtraStruct textExtraStruct : this.textExtra) {
            if (textExtraStruct.getType() == 2) {
                return textExtraStruct.getUserId();
            }
        }
        return "";
    }

    public VideoMaskInfo getGeneralMaskInfo() {
        if (this.generalMaskInfo == null) {
            this.generalMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 3);
        }
        return this.generalMaskInfo;
    }

    public InsightsEligibilityStatus getInsightsEligibilityStatus() {
        int i = this.insightsEligibilityStatus;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return InsightsEligibilityStatus.CONTROL;
                }
                return InsightsEligibilityStatus.NOT_AVAILABLE_NEW;
            }
            return InsightsEligibilityStatus.NOT_AVAILABLE_TTL;
        }
        return InsightsEligibilityStatus.AVAILABLE;
    }

    public String getItemDistributeSource() {
        if (!TextUtils.isEmpty(this.mItemDistributeSource)) {
            return this.mItemDistributeSource;
        }
        return "";
    }

    public String getLogPbString() {
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            return "";
        }
        return logPbBean.toJsonString();
    }

    public String getMainSurveyKey() {
        com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo surveyInfo = this.surveyInfo;
        if (surveyInfo != null) {
            return surveyInfo.getSurveyKey();
        }
        List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> list = this.surveyInfos;
        if (list == null || list.size() == 0 || ListProtector.get(this.surveyInfos, 0) == null || ListProtector.get(this.surveyInfos, 0) == null) {
            return "";
        }
        return ((com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo) ListProtector.get(this.surveyInfos, 0)).getSurveyKey();
    }

    public String getMixId() {
        MixStruct mixStruct = this.mixInfo;
        if (mixStruct != null) {
            return mixStruct.mixId;
        }
        return "";
    }

    public LiveRoomStruct getNewLiveRoomData() {
        try {
            RoomFeedCellStruct roomFeedCellStruct = this.mRoomFeedCellStruct;
            if (roomFeedCellStruct != null && roomFeedCellStruct.getNewLiveRoomData() != null) {
                return this.mRoomFeedCellStruct.getNewLiveRoomData();
            }
            NewLiveRoomStruct newLiveRoomStruct = this.newLiveRoomData;
            if (newLiveRoomStruct != null) {
                newLiveRoomStruct.init();
                return this.newLiveRoomData.roomStructConstructor();
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public VideoMaskInfo getPhotosensitiveMaskInfo() {
        if (this.photosensitiveMaskInfo == null) {
            this.photosensitiveMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 4);
        }
        return this.photosensitiveMaskInfo;
    }

    public CharSequence getProcessedDesc() {
        WeakReference<CharSequence> weakReference = this.processedDesc;
        if (weakReference == null || TextUtils.isEmpty(weakReference.get())) {
            return getDesc();
        }
        return this.processedDesc.get();
    }

    public List<SimplePromotion> getPromotions() {
        ArrayList arrayList;
        List<SimplePromotion> list = this.simplePromotions;
        if (list != null) {
            return list;
        }
        AnchorInfo anchorInfo = this.anchorInfo;
        if (anchorInfo == null || anchorInfo.getType() == null || this.anchorInfo.getType().intValue() != 3 || TextUtils.isEmpty(this.anchorInfo.getExtra())) {
            this.simplePromotions = new ArrayList();
        } else {
            try {
                SimplePromotion[] simplePromotionArr = (SimplePromotion[]) new Gson().LJI(this.anchorInfo.getExtra(), SimplePromotion[].class);
                if (simplePromotionArr == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(Arrays.asList(simplePromotionArr));
                }
                this.simplePromotions = arrayList;
            } catch (Exception unused) {
                this.simplePromotions = new ArrayList();
            }
        }
        return this.simplePromotions;
    }

    public List<RecReasonEntry> getRecReasonsEntry() {
        RecReasonsStruct recReasonsStruct = this.recReasonsStruct;
        if (recReasonsStruct != null) {
            return recReasonsStruct.getReasons();
        }
        return null;
    }

    public String getRecallType() {
        PromotionOtherInfo promotionOtherInfo = this.promotionOtherInfo;
        if (promotionOtherInfo == null) {
            return "";
        }
        return promotionOtherInfo.getRecallReason();
    }

    public VideoMaskInfo getReportMaskInfo() {
        if (this.reportMaskInfo == null) {
            this.reportMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 1);
        }
        return this.reportMaskInfo;
    }

    public String getRepostFromGroupId() {
        Aweme aweme;
        if (!TextUtils.isEmpty(this.repostFromGroupId)) {
            return this.repostFromGroupId;
        }
        if (isForwardAweme() && (aweme = this.forwardItem) != null) {
            return aweme.getAid();
        }
        return null;
    }

    public String getRepostFromUserId() {
        Aweme aweme;
        User user;
        if (!TextUtils.isEmpty(this.repostFromUserId)) {
            return this.repostFromUserId;
        }
        if (isForwardAweme() && (aweme = this.forwardItem) != null && (user = aweme.author) != null) {
            return user.getUid();
        }
        return null;
    }

    public String getReviewDetailUrl() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null) {
            return "";
        }
        return awemeStatus.getReviewDetailUrl();
    }

    public String getSecAuthorUid() {
        User user = this.author;
        if (user != null) {
            return user.getSecUid();
        }
        return "";
    }

    public TVStationRoomStruct getTvRoomStruct() {
        RoomStruct roomStruct = this.room;
        if (roomStruct != null) {
            return roomStruct.tvStationRoomStruct;
        }
        return null;
    }

    public String getUniqueId() {
        if (TextUtils.isEmpty(this.uniqueId)) {
            return this.aid;
        }
        return this.uniqueId;
    }

    public AVUploadMiscInfoStruct getUploadMiscInfoStruct() {
        if (this.cacheAvUploadMiscInfoStruct == null) {
            this.cacheAvUploadMiscInfoStruct = AVUploadMiscInfoStruct.createStruct(this.uploadMiscInfoStructStr);
        }
        return this.cacheAvUploadMiscInfoStruct;
    }

    public String getVideoDetailNotice() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.getReviewResult() != null) {
            return this.status.getReviewResult().getVideoDetailNotice();
        }
        return "";
    }

    public String getVideoDetailNoticeBottom() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.getReviewResult() != null) {
            return this.status.getReviewResult().getVideoDetailNoticeBottom();
        }
        return "";
    }

    public List<VideoMaskInfo> getVideoMaskInfos() {
        if (this.videoMaskInfos == null) {
            this.videoMaskInfos = new ArrayList();
        }
        return this.videoMaskInfos;
    }

    public boolean hasStickerID() {
        if (this.stickerIDs != null) {
            return true;
        }
        return false;
    }

    public boolean hasTrendingBar() {
        if (this.trendingBar != null) {
            return true;
        }
        return false;
    }

    public boolean hasTrendingBarFYP() {
        if (this.trendingBarFYP != null) {
            return true;
        }
        return false;
    }

    public boolean isAd() {
        if (this.isAd && this.awemeRawAd != null) {
            return true;
        }
        return false;
    }

    public boolean isAllowMusic() {
        VideoControl videoControl = this.videoControl;
        if (videoControl != null) {
            return videoControl.isAllowMusic;
        }
        return true;
    }

    public boolean isAwemeFromDongCheDi() {
        if (this.externalType == 2) {
            return true;
        }
        return false;
    }

    public boolean isAwemeFromXiGua() {
        if (this.externalType == 1) {
            return true;
        }
        return false;
    }

    public boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isConcating() {
        if (this.mConcatAndUploadState == 1) {
            return true;
        }
        return false;
    }

    public boolean isDelete() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.isDelete()) {
            return true;
        }
        return false;
    }

    public boolean isDouDiscountAweme() {
        HotSearchInfo hotSearchInfo = this.douDiscountMixInfo;
        if (hotSearchInfo != null && hotSearchInfo.getValue() > 0 && !TextUtils.isEmpty(this.douDiscountMixInfo.getSentence()) && !TextUtils.isEmpty(this.douDiscountMixInfo.getId())) {
            return true;
        }
        return false;
    }

    public boolean isForwardAweme() {
        if (this.awemeType == 13) {
            return true;
        }
        return false;
    }

    public boolean isHashTag() {
        if (this.isHashTag == 1) {
            return true;
        }
        return false;
    }

    public boolean isHotListAweme() {
        HotListStruct hotListStruct = this.hotListStruct;
        if (hotListStruct != null && hotListStruct.getType() != 0) {
            return true;
        }
        return false;
    }

    public boolean isHotSearchAweme() {
        HotSearchInfo hotSearchInfo = this.hotSearchInfo;
        if (hotSearchInfo != null && !TextUtils.isEmpty(hotSearchInfo.getSentence())) {
            return true;
        }
        return false;
    }

    public boolean isHotVideoAweme() {
        HotSearchInfo hotSearchInfo = this.hotSearchInfo;
        if (hotSearchInfo != null && hotSearchInfo.getVideoRank() > 0 && this.hotSearchInfo.getVideoRankVV() > 0) {
            return true;
        }
        return false;
    }

    public boolean isImage() {
        if (this.awemeType == 2) {
            return true;
        }
        return false;
    }

    public boolean isInReviewing() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.isInReviewing()) {
            return true;
        }
        return false;
    }

    public boolean isLike() {
        if (this.userDigg == 1) {
            return true;
        }
        return false;
    }

    public boolean isLive() {
        if (this.awemeType == 101) {
            return true;
        }
        return false;
    }

    public boolean isLiveNoDeduplicate() {
        if (this.awemeType == 101 && 1 == this.deduplicationType) {
            return true;
        }
        return false;
    }

    public boolean isMixAweme() {
        MixStruct mixStruct = this.mixInfo;
        if (mixStruct != null && !TextUtils.isEmpty(mixStruct.mixId)) {
            return true;
        }
        return false;
    }

    public Boolean isOnThisDayVideo() {
        boolean z = true;
        if (this.isOnThisDay != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean isOrderShareRecommend() {
        PromotionOtherInfo promotionOtherInfo = this.promotionOtherInfo;
        if (promotionOtherInfo == null) {
            return false;
        }
        return promotionOtherInfo.isOrderShareRecommend();
    }

    public boolean isPhotoMode() {
        if (this.awemeType == 150) {
            return true;
        }
        return false;
    }

    public boolean isPreview() {
        if (this.isPreview == 1) {
            return true;
        }
        return false;
    }

    public boolean isPrivate() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.getPrivateStatus() == 1) {
            return true;
        }
        return false;
    }

    public boolean isPrivateV2() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && (awemeStatus.getPrivateStatus() == 1 || this.status.getPrivateStatus() == 2)) {
            return true;
        }
        return false;
    }

    public boolean isProhibited() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.isProhibited()) {
            return true;
        }
        return false;
    }

    public boolean isProhibitedAndShouldTell() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.isProhibitedAndShouldTell()) {
            return true;
        }
        return false;
    }

    public boolean isPublic() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.getPrivateStatus() == 0) {
            return true;
        }
        return false;
    }

    public boolean isQnaResponseAweme() {
        List<InteractStickerStruct> list = this.interactStickerStructs;
        if (list != null && list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                InteractStickerStruct interactStickerStruct = (InteractStickerStruct) ListProtector.get(list, i);
                if (interactStickerStruct != null && interactStickerStruct.getQaStruct() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isReviewed() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.isReviewed()) {
            return true;
        }
        return false;
    }

    public boolean isScheduleVideo() {
        if (this.scheduleTime > 0) {
            return true;
        }
        return false;
    }

    public boolean isSearchPreciseAd() {
        AwemeRawAd awemeRawAd = this.awemeRawAd;
        if (awemeRawAd != null && awemeRawAd.isSearchPreciseAd()) {
            return true;
        }
        return false;
    }

    public boolean isSelfSee() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.isSelfSee()) {
            return true;
        }
        return false;
    }

    public boolean isSelfSeeAndShouldTell() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.isSelfSeeAndShouldTell()) {
            return true;
        }
        return false;
    }

    public boolean isSharedStoryVisible() {
        ShareToStoryStruct shareToStoryStruct = this.share2StoryStruct;
        if (shareToStoryStruct == null || shareToStoryStruct.isVisible() == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportGameChallenge() {
        if (this.gameInfo != null) {
            return true;
        }
        return false;
    }

    public boolean isTop() {
        if (this.isTop == 1) {
            return true;
        }
        return false;
    }

    public boolean isUploadFailure() {
        if (this.mConcatAndUploadState == 3) {
            return true;
        }
        return false;
    }

    public boolean isUploading() {
        if (this.mConcatAndUploadState == 2) {
            return true;
        }
        return false;
    }

    public boolean isUserPost() {
        if (this.awemeType == 33 || this.adAwemeSource == 1) {
            return true;
        }
        return false;
    }

    public boolean isVisibleSearchAdsToggle() {
        AwemeRawAd awemeRawAd = this.awemeRawAd;
        if (awemeRawAd != null && awemeRawAd.isVisibleSearchAdsToggle()) {
            return true;
        }
        return false;
    }

    public boolean isWithSurvey() {
        List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> list = this.surveyInfos;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean needPreloadAdLink() {
        if (this.adLinkType == 1) {
            return true;
        }
        return false;
    }

    public boolean shouldShowReviewStatus() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus != null && awemeStatus.shouldShowReviewStatus()) {
            return true;
        }
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(this.challengeList);
        String valueOf2 = String.valueOf(this.greenScreenMaterialList);
        String valueOf3 = String.valueOf(this.textExtra);
        String valueOf4 = String.valueOf(this.videoLabels);
        String valueOf5 = String.valueOf(this.simplePromotions);
        StringBuilder sb = new StringBuilder(FG6.LIZ);
        sb.append("Aweme{aid='");
        sb.append(this.aid);
        sb.append("', desc='");
        sb.append(this.desc);
        sb.append("', createTime=");
        sb.append(this.createTime);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", addedSoundMusicInfo=");
        sb.append(this.addedSoundMusicInfo);
        sb.append(", musicVolume=");
        sb.append(this.musicVolume);
        sb.append(", originVolume=");
        YE1.LIZLLL(sb, this.originVolume, ", challengeList=", valueOf, ", greenScreenMaterialList=");
        sb.append(valueOf2);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", audio=");
        sb.append(this.audio);
        sb.append(", shareUrl='");
        sb.append(this.shareUrl);
        sb.append("', userDigg=");
        sb.append(this.userDigg);
        sb.append(", statistics=");
        sb.append(this.statistics);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", extra='");
        sb.append(this.extra);
        sb.append("', rate=");
        sb.append(this.rate);
        sb.append(", shareInfo=");
        sb.append(this.shareInfo);
        sb.append(", labelLarge=");
        sb.append(this.labelLarge);
        sb.append(", labelThumb=");
        sb.append(this.labelThumb);
        sb.append(", textExtra=");
        sb.append(valueOf3);
        sb.append(", isTop=");
        sb.append(this.isTop);
        sb.append(", labelTop=");
        sb.append(this.labelTop);
        sb.append(", originalPos=");
        sb.append(this.originalPos);
        sb.append(", isAd=");
        sb.append(this.isAd);
        sb.append(", awemeType=");
        sb.append(this.awemeType);
        sb.append(", awemeRawAd=");
        sb.append(this.awemeRawAd);
        sb.append(", specialSticker=");
        sb.append(this.specialSticker);
        sb.append(", videoLabels=");
        sb.append(valueOf4);
        sb.append(", cmtSwt=");
        sb.append(this.cmtSwt);
        sb.append(", adSchedule=");
        YE1.LIZLLL(sb, this.adSchedule, ", simplePromotions=", valueOf5, ", region=");
        sb.append(this.region);
        sb.append(", recommendCardType=");
        sb.append(this.recommendCardType);
        sb.append(", detailPageVideoTag=");
        sb.append(this.detailPageVideoTag);
        sb.append(",feedSource=");
        sb.append(this.feedSource);
        sb.append(", isTikTokStory=");
        sb.append(this.isTikTokStory);
        sb.append(", isStoryToNormal=");
        sb.append(this.isStoryToNormal);
        sb.append(", addYoursRecommendation=");
        sb.append(this.addYoursRecommendation);
        sb.append(", batchId=");
        sb.append(this.batchId);
        sb.append(", batchIndex=");
        return UPJ.LIZLLL(sb, this.batchIndex, '}');
    }

    public boolean withFakeUser() {
        User user = this.author;
        if (user == null || user.isAdFake()) {
            return true;
        }
        return false;
    }

    public Aweme() {
        Boolean bool = Boolean.FALSE;
        this.forceUseUniqueId = bool;
        this.awemePosition = -1;
        this.isStoryPacked = false;
        this.awemeControl = new AwemeControl();
        this.isReversionForwardAweme = true;
        this.anchorType = -1;
        this.allowGift = false;
        this.soundExemption = 0;
        this.mixFlowParam = null;
        this.searchExtraParams = null;
        this.musicBeginTime = 0;
        this.musicEndTime = 0;
        this.mItemSourceCategory = 0;
        this.hasSeeMoreBeenShown = false;
        this.duettedCount = 0L;
        this.duettedInfo = null;
        this.retryType = 0;
        this.isPaidContent = false;
        this.mPaidContentInfo = null;
        this.nearbyInfo = null;
        this.share2StoryStruct = null;
        this.isOnThisDay = 0;
        this.isTikTokStory = false;
        this.isStoryToNormal = false;
        this.recReasonsStruct = null;
        this.poiDataStruct = null;
        this.isFeatureVideo = VideoType.DEFAULT;
        this.poiReTagSignal = 0;
        this.isPinnedByArtist = false;
        this.isBehindTheSongVideoType = bool;
        this.isFeatureVideoItem = bool;
        this.isFeatureVideoSelected = bool;
        this.icon = null;
        this.hasCreationIntention = false;
        this.replaceRecTagByRepost = false;
        this.contentOriginalType = 0;
        this.shootTabName = null;
        this.contentType = null;
        this.contentSizeType = 0;
        this.isAttrUpdated = false;
        this.feedSource = 0;
        this.previewData = null;
        this.isFriendVideoPresent = false;
        this.isFollowerVideoPresent = false;
    }

    private boolean canUseUniqueId() {
        if (isLive() || this.forceUseUniqueId.booleanValue()) {
            return true;
        }
        return false;
    }

    public void convertChallengeToHashTag() {
        Challenge challenge;
        String desc;
        List<Challenge> challengeList = getChallengeList();
        if (challengeList != null && !challengeList.isEmpty() && (challenge = (Challenge) ListProtector.get(challengeList, 0)) != null && !TextUtils.isEmpty(challenge.getChallengeName())) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(challenge.getChallengeName());
            sb.append(" ");
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(1);
            textExtraStruct.setHashTagName(challenge.getChallengeName());
            textExtraStruct.setStart(0);
            textExtraStruct.setCid(challenge.getCid());
            textExtraStruct.setEnd(sb.length());
            if (getDesc() == null) {
                desc = "";
            } else {
                desc = getDesc();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("#");
            LIZ.append(challenge.getChallengeName());
            if (!desc.contains(X1D.LIZIZ(LIZ))) {
                sb.append(getDesc());
                setDesc(sb.toString());
                int end = textExtraStruct.getEnd() - textExtraStruct.getStart();
                List<TextExtraStruct> textExtra = getTextExtra();
                if (textExtra != null) {
                    for (TextExtraStruct textExtraStruct2 : getTextExtra()) {
                        textExtraStruct2.setStart(textExtraStruct2.getStart() + end);
                        textExtraStruct2.setEnd(textExtraStruct2.getEnd() + end);
                    }
                } else {
                    textExtra = new ArrayList<>();
                    setTextExtra(textExtra);
                }
                textExtra.add(textExtraStruct);
            }
        }
    }

    public CommentStruct getAdCommentStruct() {
        if (getAwemeRawAd() != null) {
            return getAwemeRawAd().getCommentArea();
        }
        return null;
    }

    public String getForwardGroupId() {
        if (isMultiForwardAweme()) {
            return this.preForwardId;
        }
        return "";
    }

    public String getFromGroupId() {
        if (getAwemeType() == 13) {
            if (getForwardItem() != null) {
                return getForwardItem().getAid();
            }
            return getForwardItemId();
        }
        return getAid();
    }

    public String getFromRequestId() {
        if (getAwemeType() == 13) {
            if (getForwardItem() != null) {
                return getForwardItem().getRequestId();
            }
            return "";
        }
        return getRequestId();
    }

    public String getFromUserId() {
        if (getAwemeType() == 13) {
            if (getForwardItem() != null) {
                return getForwardItem().getAuthorUid();
            }
            return "";
        }
        return getAuthorUid();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getMusicDspStartAndEndTime() {
        /*
            r11 = this;
            int r1 = r11.getAwemeType()
            r0 = 151(0x97, float:2.12E-43)
            if (r1 != r0) goto L8c
            com.ss.android.ugc.aweme.music.model.Music r0 = r11.getMusic()
            if (r0 == 0) goto L8c
            com.ss.android.ugc.aweme.music.model.Music r0 = r11.getMusic()
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r0.getMatchedSongInfo()
            if (r0 == 0) goto L8c
            com.ss.android.ugc.aweme.music.model.Music r0 = r11.getMusic()
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r0.getMatchedSongInfo()
            com.ss.android.ugc.aweme.music.model.MusicChorusInfo r0 = r0.getChorusInfo()
            if (r0 == 0) goto L8c
            com.ss.android.ugc.aweme.music.model.Music r0 = r11.getMusic()
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r0.getMatchedSongInfo()
            com.ss.android.ugc.aweme.music.model.MusicChorusInfo r10 = r0.getChorusInfo()
        L32:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r11.getVideo()
            r5 = 0
            if (r0 == 0) goto L8a
            com.ss.android.ugc.aweme.feed.model.Video r0 = r11.getVideo()
            int r4 = r0.getDuration()
        L41:
            r8 = 0
            if (r10 == 0) goto L87
            long r1 = r10.getStartTime()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L5b
            long r6 = r10.getStartTime()
            long r1 = (long) r4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5b
            long r0 = r10.getStartTime()
            int r5 = (int) r0
        L5b:
            long r1 = r10.getDuration()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L87
            long r2 = r10.getDuration()
            int r1 = (int) r2
            r0 = 60000(0xea60, float:8.4078E-41)
            if (r1 <= r0) goto L80
            int r0 = r0 + r5
        L6e:
            if (r0 <= r4) goto L7e
        L70:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.<init>(r1, r0)
            return r2
        L7e:
            r4 = r0
            goto L70
        L80:
            long r1 = r10.getDuration()
            int r0 = (int) r1
            int r0 = r0 + r5
            goto L6e
        L87:
            int r0 = r5 + 30000
            goto L6e
        L8a:
            r4 = 0
            goto L41
        L8c:
            r10 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.Aweme.getMusicDspStartAndEndTime():android.util.Pair");
    }

    public OcrLocation getOcrLocation() {
        return getUploadMiscInfoStruct().getOcrLocation();
    }

    public SimplePromotion getPromotion() {
        if (getPromotions().isEmpty()) {
            return null;
        }
        return (SimplePromotion) ListProtector.get(getPromotions(), 0);
    }

    public List<String> getRawAdClickTrackUrlList() {
        UrlModel clickTrackUrlList;
        if (getAwemeRawAd() == null || (clickTrackUrlList = getAwemeRawAd().getClickTrackUrlList()) == null) {
            return null;
        }
        return clickTrackUrlList.getUrlList();
    }

    public List<String> getRawAdEffectivePlayTrackUrlList() {
        UrlModel effectivePlayTrackUrlList;
        if (getAwemeRawAd() == null || (effectivePlayTrackUrlList = getAwemeRawAd().getEffectivePlayTrackUrlList()) == null) {
            return null;
        }
        return effectivePlayTrackUrlList.getUrlList();
    }

    public List<String> getRawAdPlayOverTrackUrlList() {
        UrlModel playOverTrackUrlList;
        if (getAwemeRawAd() == null || (playOverTrackUrlList = getAwemeRawAd().getPlayOverTrackUrlList()) == null) {
            return null;
        }
        return playOverTrackUrlList.getUrlList();
    }

    public List<String> getRawAdPlayTrackUrlList() {
        UrlModel playTrackUrlList;
        if (getAwemeRawAd() == null || (playTrackUrlList = getAwemeRawAd().getPlayTrackUrlList()) == null) {
            return null;
        }
        return playTrackUrlList.getUrlList();
    }

    public List<String> getRawAdShowTrackUrlList() {
        UrlModel trackUrlList;
        if (getAwemeRawAd() == null || (trackUrlList = getAwemeRawAd().getTrackUrlList()) == null) {
            return null;
        }
        return trackUrlList.getUrlList();
    }

    public AwemeStatus getStatus() {
        if (isScheduleVideo() && this.status == null) {
            this.status = new AwemeStatus();
        }
        return this.status;
    }

    public boolean hasPromotion() {
        if (getPromotion() != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str;
        if (canUseUniqueId()) {
            str = getUniqueId();
        } else {
            str = this.aid;
        }
        return str.hashCode();
    }

    public boolean isGreenScreenSticker() {
        if (getUploadMiscInfoStruct().greenScreen == 1) {
            return true;
        }
        return false;
    }

    public String getActivityId() {
        return this.activityId;
    }

    public CommerceActivityStruct getActivityPendant() {
        return this.activityPendant;
    }

    public int getAdAwemeSource() {
        return this.adAwemeSource;
    }

    public int getAdDescMaxLines() {
        return this.adDescMaxLines;
    }

    public String getAdSchedule() {
        return this.adSchedule;
    }

    public AddYoursRecommendation getAddYoursRecommendation() {
        return this.addYoursRecommendation;
    }

    public Music getAddedSoundMusicInfo() {
        return this.addedSoundMusicInfo;
    }

    public String getAid() {
        return this.aid;
    }

    public boolean getAllowGift() {
        return this.allowGift;
    }

    public Boolean getAllowReuseOriginalSound() {
        return this.allowReuseOriginalSound;
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public AnchorCustomData getAnchorCustomData() {
        return this.anchorCustomData;
    }

    public AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    public int getAnchorType() {
        return this.anchorType;
    }

    public String getAnchorWikiOfflineText() {
        return this.anchorWikiOfflineText;
    }

    public List<AnchorCommonStruct> getAnchors() {
        return this.anchors;
    }

    public String getAnchorsExtras() {
        return this.anchorsExtras;
    }

    public Audio getAudio() {
        return this.audio;
    }

    public User getAuthor() {
        return this.author;
    }

    public AwemeACLShare getAwemeACLShareInfo() {
        return this.awemeACLShareInfo;
    }

    public AwemeActivity getAwemeActivity() {
        return this.activity;
    }

    public int getAwemePosition() {
        return this.awemePosition;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public AwemeRiskModel getAwemeRiskModel() {
        return this.awemeRiskModel;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public BannerTip getBannerTip() {
        return this.bannerTip;
    }

    public String getBatchId() {
        return this.batchId;
    }

    public int getBatchIndex() {
        return this.batchIndex;
    }

    public List<String> getBehindTheSongMusicIds() {
        return this.behindTheSongMusicIds;
    }

    public Boost getBoost() {
        return this.boost;
    }

    public BottomBarModel getBottomBarModel() {
        return this.bottomBarModel;
    }

    public List<BrandedContentAccount> getBrandContentAccounts() {
        return this.brandContentAccounts;
    }

    public AwemeBubbleInfo getBubbleInfo() {
        return this.bubbleInfo;
    }

    public boolean getCanCache() {
        return this.isCanCache;
    }

    public int getCaptionLength() {
        return this.captionLength;
    }

    public int getCaptionReturnCount() {
        return this.captionReturnCount;
    }

    public CardInsertInfo getCardInsertInfo() {
        return this.cardInsertInfo;
    }

    public CCTemplateInfo getCcTemplateInfo() {
        return this.ccTemplateInfo;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public AwemeCommentConfig getCommentConfig() {
        return this.commentConfig;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public CommentSuggestWordList getCommentSuggestWordList() {
        return this.commentSuggestWordList;
    }

    public List<CommerceConfigData> getCommerceConfigDataList() {
        return this.commerceConfigDataList;
    }

    public CommerceRerankInfo getCommerceRerankInfo() {
        return this.commerceRerankInfo;
    }

    public CommerceStickerInfo getCommerceStickerInfo() {
        return this.commerceStickerInfo;
    }

    public AwemeCommerceStruct getCommerceVideoAuthInfo() {
        return this.mCommerceVideoAuthInfo;
    }

    public String getCommercialVideoInfo() {
        return this.commercialVideoInfo;
    }

    public String getContentDesc() {
        return this.contentDesc;
    }

    public List<TextExtraStruct> getContentDescExtra() {
        return this.contentDescExtra;
    }

    public int getContentOriginalType() {
        return this.contentOriginalType;
    }

    public int getContentSizeType() {
        return this.contentSizeType;
    }

    public String getContentType() {
        return this.contentType;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public MediaSafetyModel getDMMediaSafetyModel() {
        return this.mediaSafetyModel;
    }

    public long getDate() {
        return this.date;
    }

    public int getDeduplicationType() {
        return this.deduplicationType;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDescLanguage() {
        return this.descLanguage;
    }

    public DescendantsModel getDescendantsModel() {
        return this.descendantsModel;
    }

    public String getDistance() {
        return this.distance;
    }

    public int getDistributeType() {
        return this.distributeType;
    }

    public String getDouDiscountLabel() {
        return this.douDiscountLabel;
    }

    public HotSearchInfo getDouDiscountMixInfo() {
        return this.douDiscountMixInfo;
    }

    public Dsp getDsp() {
        return this.dsp;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public long getDuettedCount() {
        return this.duettedCount;
    }

    public DuetInfo getDuettedInfo() {
        return this.duettedInfo;
    }

    public EcFeedSuggestWordList getEcFeedSuggestWordList() {
        return this.ecFeedSuggestWordList;
    }

    public EditPostPermission getEditPostPermission() {
        return this.editPostPermission;
    }

    public ExploreClientExtra getExploreClientExtra() {
        return this.exploreClientExtra;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getFakeAid() {
        return this.fakeAid;
    }

    public List<User> getFamiliarRecommendUser() {
        return this.familiarRecommendUser;
    }

    public VideoType getFeatureVideo() {
        return this.isFeatureVideo;
    }

    public long getFeedCount() {
        return this.feedCount;
    }

    public RelationLabelNew getFeedRelationLabel() {
        return this.feedRelationLabel;
    }

    public int getFeedSource() {
        return this.feedSource;
    }

    public long getFilterDuplicateTime() {
        return this.filterDuplicateTime;
    }

    public FloatingCardInfo getFloatingCardInfo() {
        return this.floatingCardInfo;
    }

    public String getFollowUpFirstItemId() {
        return this.followUpFirstItemId;
    }

    public String getFollowUpItemIdGroups() {
        return this.followUpItemIdGroups;
    }

    public long getFollowUpPublishFromId() {
        return this.followUpPublishFromId;
    }

    public String getForwardCommentId() {
        return this.forwardCommentId;
    }

    public Aweme getForwardItem() {
        return this.forwardItem;
    }

    public String getForwardItemId() {
        return this.forwardItemId;
    }

    public Challenge getFromRawChallenge() {
        return this.fromRawChallenge;
    }

    public GameInfo getGameInfo() {
        return this.gameInfo;
    }

    public List<String> getGeofencingRegions() {
        return this.geofencingRegions;
    }

    public String getGiphyGifIds() {
        return "";
    }

    public List<GreenScreenMaterial> getGreenScreenMaterials() {
        return this.greenScreenMaterialList;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public GroupIdListStruct getGroupIdList() {
        return this.groupIdList;
    }

    public int getHasAd() {
        return this.hasAd;
    }

    public int getHasPromoteEntry() {
        return this.hasPromoteEntry;
    }

    public List<HighlightInfo> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public HotListStruct getHotListStruct() {
        return this.hotListStruct;
    }

    public HotSearchInfo getHotSearchInfo() {
        return this.hotSearchInfo;
    }

    public HotSearchInfoStruct getHotSearchInfoStruct() {
        return this.hotSearchInfoStruct;
    }

    public String getHotSpot() {
        return this.hotSpot;
    }

    public List<AwemeHybridLabelModel> getHybridLabels() {
        return this.hybridLabels;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getImItemId() {
        return this.imItemId;
    }

    public List<ImageInfo> getImageInfos() {
        return this.imageInfos;
    }

    public Aweme getInsertAweme() {
        return this.insertAweme;
    }

    public InteractPermission getInteractPermission() {
        return this.interactPermission;
    }

    public List<InteractStickerStruct> getInteractStickerStructs() {
        return this.interactStickerStructs;
    }

    public InteractionBubbles getInteractionBubbles() {
        return this.interactionBubbles;
    }

    public InteractionTagInfo getInteractionTagInfo() {
        return this.interactionTagInfo;
    }

    public Boolean getIsBehindTheSongVideoType() {
        return this.isBehindTheSongVideoType;
    }

    public Boolean getIsFeatureVideoItem() {
        return this.isFeatureVideoItem;
    }

    public Boolean getIsFeatureVideoSelected() {
        return this.isFeatureVideoSelected;
    }

    public boolean getIsFromDouPlusGuideAnimate() {
        return this.isFromDouPlusGuideAnimate;
    }

    public boolean getIsLiveHasProduct() {
        return this.isLiveHasProduct;
    }

    public boolean getIsPreloadScroll() {
        return this.isPreloadScroll;
    }

    public boolean getIsStoryToNormal() {
        return this.isStoryToNormal;
    }

    public boolean getIsSubAweme() {
        return this.isSubAweme;
    }

    public boolean getIsTikTokStory() {
        return this.isTikTokStory;
    }

    public int getIsTop() {
        return this.isTop;
    }

    public int getItemSourceCategory() {
        return this.mItemSourceCategory;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public String getLabelMusicStarterText() {
        return this.mLabelMusicStarterText;
    }

    public String getLabelOriginAuthorText() {
        return this.mLabelOriginAuthorText;
    }

    public UrlModel getLabelPrivate() {
        return this.labelPrivate;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public UrlModel getLabelTop() {
        return this.labelTop;
    }

    public String getLandingPage() {
        return this.landingPage;
    }

    public LinkData getLinkAdData() {
        return this.linkAdData;
    }

    public LinkMatch getLinkMatch() {
        return this.linkMatch;
    }

    public LiveAwesomeSplashInfo getLiveAwesomeSplashInfo() {
        return this.mLiveAwesomeSplashInfo;
    }

    public long getLiveId() {
        return this.liveId;
    }

    public Integer[] getLivePreviewSize() {
        return this.livePreviewSize;
    }

    public String getLiveReaSon() {
        return this.liveReaSon;
    }

    public String getLiveType() {
        return this.liveType;
    }

    public long getLiveWindowShowTime() {
        return this.liveWindowShowTime;
    }

    public LogPbBean getLogPbBean() {
        return this.logPb;
    }

    public List<LongVideo> getLongVideos() {
        return this.longVideos;
    }

    public String getMatchText() {
        return this.matchText;
    }

    public int getMatchType() {
        return this.matchType;
    }

    public MicroAppInfo getMicroAppInfo() {
        return this.microAppInfo;
    }

    public MixStruct getMixInfo() {
        return this.mixInfo;
    }

    public HashMap<String, String> getMobParams() {
        return this.mMobParams;
    }

    public Music getMusic() {
        return this.music;
    }

    public int getMusicBeginTime() {
        return this.musicBeginTime;
    }

    public int getMusicEndTime() {
        return this.musicEndTime;
    }

    public String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public UrlModel getMusicStarter() {
        return this.musicStarter;
    }

    public int getMusicTitleStyle() {
        return this.musicTitleStyle;
    }

    public String getMusicVolume() {
        return this.musicVolume;
    }

    public MutualStruct getMutualRelation() {
        return this.mutualRelation;
    }

    public String getNearbyHotLabel() {
        return this.nearbyHotLabel;
    }

    public NearbyInfo getNearbyInfo() {
        return this.nearbyInfo;
    }

    public int getNewLabel() {
        return this.newLabel;
    }

    public List<RelationLabelNew> getNewRelationLabel() {
        return this.mNewRelationLabel;
    }

    public String getNewSourceId() {
        return this.newSourceId;
    }

    public String getNewSourceType() {
        return this.newSourceType;
    }

    public List<Position> getNicknamePosition() {
        return this.nicknamePosition;
    }

    public List<OperatorBoost> getOperatorBoosts() {
        return this.operatorBoosts;
    }

    public UrlModel getOriginAuthor() {
        return this.originAuthor;
    }

    public List<String> getOriginCommentIds() {
        return this.originCommentIds;
    }

    public String getOriginVolume() {
        return this.originVolume;
    }

    public ClientText getOriginalClientText() {
        return this.originalClientText;
    }

    public int getOriginalPos() {
        return this.originalPos;
    }

    public float getParameterizedSpeed() {
        return this.parameterizedSpeed;
    }

    public String getParentHotSpot() {
        return this.parentHotSpot;
    }

    public String getPartN() {
        return this.partN;
    }

    public String getPhotoContentType() {
        return this.photoContentType;
    }

    public PhotoModeImageInfo getPhotoModeImageInfo() {
        return this.photoModeImageInfo;
    }

    public CharSequence getPhotoModeTitleLine() {
        return this.photoModeTitleLine;
    }

    public boolean getPlaylistBlocked() {
        return this.playlistBlocked;
    }

    public PlayListInfo getPlaylist_info() {
        return this.playlist_info;
    }

    public PodcastInfo getPodcastInfo() {
        return this.podcastInfo;
    }

    public PoiDataStruct getPoiDataStruct() {
        return this.poiDataStruct;
    }

    public int getPoiReTagSignal() {
        return this.poiReTagSignal;
    }

    public String getPoiReTagText() {
        return this.poiReTagText;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public Preload getPreload() {
        return this.preload;
    }

    public PublishPreviewInfo getPreviewData() {
        return this.previewData;
    }

    public int getProductsCount() {
        return this.productsCount;
    }

    public List<Product> getProductsInfo() {
        return this.productsInfo;
    }

    public PromoteModel getPromoteModel() {
        return this.promoteModel;
    }

    public String getPromoteToast() {
        return this.promoteToast;
    }

    public String getPromoteToastKey() {
        return this.promoteToastKey;
    }

    public PromotionOtherInfo getPromotionOtherInfo() {
        return this.promotionOtherInfo;
    }

    public int getRank() {
        return this.mRank;
    }

    public int getRate() {
        return this.rate;
    }

    public String getRateScore() {
        return this.rateScore;
    }

    public String getReactFrom() {
        return this.reactFrom;
    }

    public String getReactOrigin() {
        return this.reactOrigin;
    }

    public int getReactSetting() {
        return this.reactSetting;
    }

    public String getReactView() {
        return this.reactView;
    }

    public RecReasonsStruct getRecReasonsStruct() {
        return this.recReasonsStruct;
    }

    public int getRecommendCardType() {
        return this.recommendCardType;
    }

    public String getRegion() {
        return this.region;
    }

    public RelatedLiveTagStruct getRelatedLiveTag() {
        return this.relatedLiveTagStruct;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public AwemeRelationRecommendModel getRelationRecommendInfo() {
        return this.relationRecommendInfo;
    }

    public boolean getReplaceRecTagByRepost() {
        return this.replaceRecTagByRepost;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    public int getRetryType() {
        return this.retryType;
    }

    public String getRid() {
        return this.rid;
    }

    public RoomStruct getRoom() {
        return this.room;
    }

    public RoomFeedCellStruct getRoomFeedCellStruct() {
        return this.mRoomFeedCellStruct;
    }

    public int getScenario() {
        return this.scenario;
    }

    public String getScheduleId() {
        return this.scheduleId;
    }

    public long getScheduleTime() {
        return this.scheduleTime;
    }

    public String getSearchDesc() {
        return this.searchDesc;
    }

    public String getSearchDocOriginLanguage() {
        return this.searchDocOriginLanguage;
    }

    public String getSearchDocTranslate() {
        return this.searchDocTranslate;
    }

    public Map<String, String> getSearchExtraParams() {
        return this.searchExtraParams;
    }

    public SearchExtraStruct getSearchExtraStruct() {
        return this.searchExtraStruct;
    }

    public String getSearchFeedType() {
        return this.searchFeedType;
    }

    public String getSearchTabName() {
        return this.searchTabName;
    }

    public Integer getSearchTabRank() {
        return this.SearchTabRank;
    }

    public ShareToStoryStruct getShare2StoryStruct() {
        return this.share2StoryStruct;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public User getSharer() {
        return this.sharer;
    }

    public String getShootTabName() {
        return this.shootTabName;
    }

    public ShopAdStruct getShopAdStruct() {
        return this.shopAdStruct;
    }

    public int getSoundExemption() {
        return this.soundExemption;
    }

    public SpecialSticker getSpecialSticker() {
        return this.specialSticker;
    }

    public long getStarAtlasOrderId() {
        return this.starAtlasOrderId;
    }

    public AwemeStatistics getStatistics() {
        return this.statistics;
    }

    public NewFaceStickerBean getStickerEntranceInfo() {
        return this.stickerEntranceInfo;
    }

    public String getStickerIDs() {
        return this.stickerIDs;
    }

    public int getStitchSetting() {
        return this.stitchSetting;
    }

    public Story getStory() {
        return this.story;
    }

    public StoryVideo getStoryModel() {
        return this.storyModel;
    }

    public int getStoryType() {
        return this.storyType;
    }

    public StreamUrlModel getStreamUrlModel() {
        return this.streamUrlModel;
    }

    public Aweme getSubAweme() {
        return this.subAweme;
    }

    public UrlModel getSubAwemeCover() {
        return this.subAwemeCover;
    }

    public com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo getSurveyInfo() {
        return this.surveyInfo;
    }

    public List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> getSurveyInfos() {
        return this.surveyInfos;
    }

    public String getTakeDownDesc() {
        return this.takeDownDesc;
    }

    public int getTakeDownReason() {
        return this.takeDownReason;
    }

    public TCMInfo getTcmInfo() {
        return this.tcmInfo;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public String getTextStickerMajorityLang() {
        return this.textStickerMajorityLang;
    }

    public List<AwemeTextLabelModel> getTextTopLabels() {
        return this.textTopLabels;
    }

    public List<AwemeTextLabelModel> getTextVideoLabels() {
        return this.textVideoLabels;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTotalProductAnchors() {
        return this.totalProductAnchors;
    }

    public String getTransParams() {
        return this.transParams;
    }

    public AwemeTrendingBar getTrendingBar() {
        return this.trendingBar;
    }

    public AwemeTrendingBar getTrendingBarFYP() {
        return this.trendingBarFYP;
    }

    public String getTrendingId() {
        return this.trendingId;
    }

    public String getTrendingName() {
        return this.trendingName;
    }

    public TTMInfo getTtmInfo() {
        return this.ttmInfo;
    }

    public List<String> getTtsVoiceIDs() {
        return this.ttsVoiceIDs;
    }

    public List<String> getTtsVoiceRefIDs() {
        return this.ttsVoiceRefIDs;
    }

    public List<Position> getUniqidPosition() {
        return this.uniqidPosition;
    }

    public UpvotePreloadStruct getUpvotePreload() {
        return this.upvotePreload;
    }

    public UpvoteReason getUpvoteReason() {
        return this.upvoteReason;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    public UserProfileInitInfo getUserProfileInitInfo() {
        return this.userProfileInitInfo;
    }

    public UserStory getUserStory() {
        return this.userStory;
    }

    public List<String> getVcVoiceIDs() {
        return this.vcVoiceIDs;
    }

    public List<String> getVcVoiceRefIDs() {
        return this.vcVoiceRefIDs;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public String getVideoFeedTag() {
        return this.videoFeedTag;
    }

    public List<AwemeLabelModel> getVideoLabels() {
        return this.videoLabels;
    }

    public VideoMaskInfo getVideoMaskInfo() {
        return this.videoMaskInfo;
    }

    public VideoReplyStruct getVideoReplyStruct() {
        return this.videoReplyStruct;
    }

    public boolean getVideoSkipEnableSkipButton() {
        return this.isEnableVideoSkip;
    }

    public List<Float> getVideoSkipRelevantTime() {
        return this.relevantTime;
    }

    public boolean hasCreationIntention() {
        return this.hasCreationIntention;
    }

    public boolean hasSeeMoreBeenShow() {
        return this.hasSeeMoreBeenShown;
    }

    public boolean hasVisionSearchEntry() {
        return this.hasVisionSearchEntry;
    }

    public boolean isAdDescHandle() {
        return this.adDescHandle;
    }

    public boolean isAttrUpdated() {
        return this.isAttrUpdated;
    }

    public boolean isCanPlay() {
        return this.canPlay;
    }

    public boolean isClientCache() {
        return this.isClientCache;
    }

    public boolean isCmtSwt() {
        return this.cmtSwt;
    }

    public boolean isCommentClicked() {
        return this.isCommentClicked;
    }

    public boolean isDescTranslatable() {
        return this.isDescTranslatable;
    }

    public boolean isDisableSearchTrendingBar() {
        return this.disableSearchTrendingBar;
    }

    public boolean isEffectDesigner() {
        return this.isEffectDesigner;
    }

    public boolean isFakeResponse() {
        return this.isFakeResponse;
    }

    public boolean isFamiliar() {
        return this.isFamiliar;
    }

    public boolean isFantasy() {
        return this.isFantasy;
    }

    public boolean isFilterStrangerComments() {
        return this.filterStrangerComments;
    }

    public boolean isFilterUnfriendlyUserComments() {
        return this.filterUnfriendlyUserComments;
    }

    public boolean isFirstInSpot() {
        return this.isFirstInSpot;
    }

    public boolean isForMusicDetailLoading() {
        return this.isForMusicDetailLoading;
    }

    public boolean isForwardClicked() {
        return this.isForwardClicked;
    }

    public boolean isFriendsTabFakeAweme() {
        return this.isFriendsTabFakeAweme;
    }

    public boolean isFriendsVideoUnread() {
        return this.isFriendsVideoUnread;
    }

    public boolean isFromSplitData() {
        return this.isFromSplitData;
    }

    public String isFromTrendingCard() {
        return this.isFromTrendingCard;
    }

    public boolean isHasDanmaku() {
        return this.hasDanmaku;
    }

    public boolean isHaveDashboard() {
        return this.haveDashboard;
    }

    public boolean isHighlighted() {
        return this.isHighlighted;
    }

    public boolean isLastInSpot() {
        return this.isLastInSpot;
    }

    public boolean isLawCriticalCountry() {
        return this.lawCriticalCountry;
    }

    public boolean isLivePreviewLongPressDisabled() {
        return this.livePreviewLongPressDisabled;
    }

    public boolean isLiveReplay() {
        return this.isLiveReplay;
    }

    public boolean isNrNff() {
        return this.isNrNff;
    }

    public boolean isPgcShow() {
        return this.isPgcShow;
    }

    public boolean isPinnedByArtist() {
        return this.isPinnedByArtist;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRecBigCardFakeAweme() {
        return this.isRecBigCardFakeAweme;
    }

    public boolean isReferralFakeAweme() {
        return this.isReferralFakeAweme;
    }

    public boolean isRelieve() {
        return this.isRelieve;
    }

    public boolean isReversionForwardAweme() {
        return this.isReversionForwardAweme;
    }

    public boolean isStoryFakeAweme() {
        return this.isStoryFakeAweme;
    }

    public boolean isStoryPacked() {
        return this.isStoryPacked;
    }

    public boolean isSubOnlyVideo() {
        return this.isSubOnlyVideo;
    }

    public boolean isSupportDanmaku() {
        return this.isSupportDanmaku;
    }

    public boolean isTextStickerTranslatable() {
        return this.isTextStickerTranslatable;
    }

    public boolean isVr() {
        return this.isVr;
    }

    public boolean isWithPromotionalMusic() {
        return this.withPromotionalMusic;
    }

    public boolean isWithSearchSurvey() {
        return this.withSearchSurvey;
    }

    public boolean needTTSWatermarkWhenDownload() {
        return this.needTTSWatermarkWhenDownload;
    }

    public boolean needVisionSearchEntry() {
        return this.needVisionSearchEntry;
    }

    /* loaded from: classes10.dex */
    public enum VideoTag {
        DEFAULT(-1),
        FEATURED_VIDEO(1),
        FRIENDS_VIDEO(2),
        FOLLOWERS_VIDEO(3),
        EFFECT(4);

        public final int videoTag;

        public static VideoTag getTag(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return DEFAULT;
                        }
                        return EFFECT;
                    }
                    return FOLLOWERS_VIDEO;
                }
                return FRIENDS_VIDEO;
            }
            return FEATURED_VIDEO;
        }

        public static VideoTag valueOf(String str) {
            return (VideoTag) V0N.LJJJ(VideoTag.class, str);
        }

        VideoTag(int i) {
            this.videoTag = i;
        }
    }

    /* loaded from: classes9.dex */
    public enum VideoType {
        FEATURE_VIDEO_CLIENT_SELECTED,
        FEATURE_VIDEO_TIKTOK_SELECTED,
        NO_FEATURE_VIDEO_SELECTED,
        DEFAULT;

        public static VideoType valueOf(String str) {
            return (VideoType) V0N.LJJJ(VideoType.class, str);
        }
    }

    public static Aweme newDateSection(long j) {
        Aweme aweme = new Aweme();
        aweme.setAid("");
        aweme.setDate(j);
        return aweme;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aweme)) {
            return false;
        }
        Aweme aweme = (Aweme) obj;
        if (!canUseUniqueId() ? TextUtils.equals(this.aid, aweme.aid) : TextUtils.equals(getUniqueId(), aweme.getUniqueId())) {
            if (this.userDigg == aweme.userDigg && C70657RoD.LJII(this.status, aweme.status) && C70657RoD.LJII(this.statistics, aweme.statistics) && C70657RoD.LJII(this.userStory, aweme.userStory) && C70657RoD.LJII(this.productsInfo, aweme.productsInfo) && C70657RoD.LJII(Integer.valueOf(this.productsCount), Integer.valueOf(aweme.productsCount)) && C70657RoD.LJII(this.mediaSafetyModel, aweme.mediaSafetyModel) && C70657RoD.LJII(Boolean.valueOf(this.isTikTokStory), Boolean.valueOf(aweme.isTikTokStory)) && C70657RoD.LJII(Boolean.valueOf(this.isStoryToNormal), Boolean.valueOf(aweme.isStoryToNormal))) {
                return true;
            }
        }
        return false;
    }

    public List<String> getRawAdPlayNodeTrackUrlList(int i) {
        if (getAwemeRawAd() == null) {
            return null;
        }
        List<AdNodeTrackUrl> adNodeTrackUrlList = getAwemeRawAd().getAdNodeTrackUrlList();
        if (C78540Us4.LJIILLIIL(adNodeTrackUrlList)) {
            return null;
        }
        for (AdNodeTrackUrl adNodeTrackUrl : adNodeTrackUrlList) {
            if (adNodeTrackUrl.percent == i) {
                return adNodeTrackUrl.urlList;
            }
        }
        return null;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setAd(boolean z) {
        this.isAd = z;
    }

    public void setAdAwemeSource(int i) {
        this.adAwemeSource = i;
    }

    public void setAdDescHandle(boolean z) {
        this.adDescHandle = z;
    }

    public void setAdDescMaxLines(int i) {
        this.adDescMaxLines = i;
    }

    public void setAdSchedule(String str) {
        this.adSchedule = str;
    }

    public void setAddYoursRecommendation(AddYoursRecommendation addYoursRecommendation) {
        this.addYoursRecommendation = addYoursRecommendation;
    }

    public void setAddedSoundMusicInfo(Music music) {
        this.addedSoundMusicInfo = music;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public void setAllowReuseOriginalSound(boolean z) {
        this.allowReuseOriginalSound = Boolean.valueOf(z);
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setAnchorCustomData(AnchorCustomData anchorCustomData) {
        this.anchorCustomData = anchorCustomData;
    }

    public void setAnchorInfo(AnchorInfo anchorInfo) {
        this.anchorInfo = anchorInfo;
    }

    public void setAnchorType(int i) {
        this.anchorType = i;
    }

    public void setAnchorWikiOfflineText(String str) {
        this.anchorWikiOfflineText = str;
    }

    public void setAnchors(List<AnchorCommonStruct> list) {
        this.anchors = list;
    }

    public void setAnchorsExtras(String str) {
        this.anchorsExtras = str;
    }

    public void setAttrUpdated(boolean z) {
        this.isAttrUpdated = z;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAwemeACLShareInfo(AwemeACLShare awemeACLShare) {
        this.awemeACLShareInfo = awemeACLShare;
    }

    public void setAwemeControl(AwemeControl awemeControl) {
        this.awemeControl = awemeControl;
    }

    public void setAwemePosition(int i) {
        this.awemePosition = i;
    }

    public void setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.awemeRawAd = awemeRawAd;
    }

    public void setAwemeRiskModel(AwemeRiskModel awemeRiskModel) {
        this.awemeRiskModel = awemeRiskModel;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setBannerTip(BannerTip bannerTip) {
        this.bannerTip = bannerTip;
    }

    public void setBatchId(String str) {
        this.batchId = str;
    }

    public void setBatchIndex(int i) {
        this.batchIndex = i;
    }

    public void setBehindTheSongMusicIds(List<String> list) {
        this.behindTheSongMusicIds = list;
    }

    public void setBoost(Boost boost) {
        this.boost = boost;
    }

    public void setBottomBarModel(BottomBarModel bottomBarModel) {
        this.bottomBarModel = bottomBarModel;
    }

    public void setBubbleInfo(AwemeBubbleInfo awemeBubbleInfo) {
        this.bubbleInfo = awemeBubbleInfo;
    }

    public void setCanCache(boolean z) {
        this.isCanCache = z;
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public void setCaptionLength(int i) {
        this.captionLength = i;
    }

    public void setCaptionReturnCount(int i) {
        this.captionReturnCount = i;
    }

    public void setCardInsertInfo(CardInsertInfo cardInsertInfo) {
        this.cardInsertInfo = cardInsertInfo;
    }

    public void setCcTemplateInfo(CCTemplateInfo cCTemplateInfo) {
        this.ccTemplateInfo = cCTemplateInfo;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setClientCache(boolean z) {
        this.isClientCache = z;
    }

    public void setCmtSwt(boolean z) {
        this.cmtSwt = z;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommentClicked(boolean z) {
        this.isCommentClicked = z;
    }

    public void setCommentConfig(AwemeCommentConfig awemeCommentConfig) {
        this.commentConfig = awemeCommentConfig;
    }

    public void setCommentSetting(int i) {
        this.commentSetting = i;
    }

    public void setCommerceConfigDataList(List<CommerceConfigData> list) {
        this.commerceConfigDataList = list;
    }

    public void setCommerceStickerInfo(CommerceStickerInfo commerceStickerInfo) {
        this.commerceStickerInfo = commerceStickerInfo;
    }

    public void setCommerceVideoAuthInfo(AwemeCommerceStruct awemeCommerceStruct) {
        this.mCommerceVideoAuthInfo = awemeCommerceStruct;
    }

    public void setCommercialVideoInfo(String str) {
        this.commercialVideoInfo = str;
    }

    public void setConcatAndUploadState(int i) {
        this.mConcatAndUploadState = i;
    }

    public void setContentClassificationMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.contentClassificationMaskInfo = videoMaskInfo;
    }

    public void setContentDesc(String str) {
        this.contentDesc = str;
    }

    public void setContentDescExtra(List<TextExtraStruct> list) {
        this.contentDescExtra = list;
    }

    public void setContentOriginalType(int i) {
        this.contentOriginalType = i;
    }

    public void setContentSizeType(int i) {
        this.contentSizeType = i;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDMMediaSafetyModel(MediaSafetyModel mediaSafetyModel) {
        this.mediaSafetyModel = mediaSafetyModel;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setDeduplicationType(int i) {
        this.deduplicationType = i;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDescLanguage(String str) {
        this.descLanguage = str;
    }

    public void setDescendantsModel(DescendantsModel descendantsModel) {
        this.descendantsModel = descendantsModel;
    }

    public void setDetailPageVideoTag(VideoTag videoTag) {
        VideoTag videoTag2 = VideoTag.FEATURED_VIDEO;
        if (videoTag == videoTag2) {
            this.detailPageVideoTag = videoTag2.videoTag;
            return;
        }
        VideoTag videoTag3 = VideoTag.FRIENDS_VIDEO;
        if (videoTag == videoTag3) {
            this.detailPageVideoTag = videoTag3.videoTag;
            return;
        }
        VideoTag videoTag4 = VideoTag.FOLLOWERS_VIDEO;
        if (videoTag == videoTag4) {
            this.detailPageVideoTag = videoTag4.videoTag;
            return;
        }
        VideoTag videoTag5 = VideoTag.EFFECT;
        if (videoTag == videoTag5) {
            this.detailPageVideoTag = videoTag5.videoTag;
        } else {
            this.detailPageVideoTag = VideoTag.DEFAULT.videoTag;
        }
    }

    public void setDisableSearchTrendingBar(boolean z) {
        this.disableSearchTrendingBar = z;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setDistributeType(int i) {
        this.distributeType = i;
    }

    public void setDouDiscountLabel(String str) {
        this.douDiscountLabel = str;
    }

    public void setDouDiscountMixInfo(HotSearchInfo hotSearchInfo) {
        this.douDiscountMixInfo = hotSearchInfo;
    }

    public void setDuetSetting(int i) {
        this.duetSetting = i;
    }

    public void setEditPostPermission(EditPostPermission editPostPermission) {
        this.editPostPermission = editPostPermission;
    }

    public void setEffectDesigner(boolean z) {
        this.isEffectDesigner = z;
    }

    public void setEllipsizeDesc(CharSequence charSequence) {
        if (charSequence == null) {
            this.ellipsizeDesc = null;
        } else {
            this.ellipsizeDesc = new WeakReference<>(charSequence);
        }
    }

    public void setExploreClientExtra(ExploreClientExtra exploreClientExtra) {
        this.exploreClientExtra = exploreClientExtra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFakeAid(String str) {
        this.fakeAid = str;
    }

    public void setFakeResponse(boolean z) {
        this.isFakeResponse = z;
    }

    public void setFamiliar(boolean z) {
        this.isFamiliar = z;
    }

    public void setFamiliarRecommendUser(List<User> list) {
        this.familiarRecommendUser = list;
    }

    public Aweme setFantasy(boolean z) {
        this.isFantasy = z;
        return this;
    }

    public void setFeatureVideo(VideoType videoType) {
        this.isFeatureVideo = videoType;
    }

    public void setFeedCount(long j) {
        this.feedCount = j;
    }

    public void setFeedRelationLabel(RelationLabelNew relationLabelNew) {
        this.feedRelationLabel = relationLabelNew;
    }

    public void setFeedSource(int i) {
        this.feedSource = i;
    }

    public void setFilterDuplicateTime(long j) {
        this.filterDuplicateTime = j;
    }

    public void setFilterStrangerComments(boolean z) {
        this.filterStrangerComments = z;
    }

    public void setFilterUnfriendlyUserComments(boolean z) {
        this.filterUnfriendlyUserComments = z;
    }

    public void setFirstInSpot(boolean z) {
        this.isFirstInSpot = z;
    }

    public void setFloatingCardInfo(FloatingCardInfo floatingCardInfo) {
        this.floatingCardInfo = floatingCardInfo;
    }

    public void setFoldedHashTagDesc(CharSequence charSequence) {
        this.foldedHashTagDesc = charSequence;
    }

    public void setFoldedTextExtra(List<TextExtraStruct> list) {
        this.foldedTextExtra = list;
    }

    public void setForMusicDetailLoading(boolean z) {
        this.isForMusicDetailLoading = z;
    }

    public void setForwardClicked(boolean z) {
        this.isForwardClicked = z;
    }

    public void setForwardCommentId(String str) {
        this.forwardCommentId = str;
    }

    public void setForwardItem(Aweme aweme) {
        this.forwardItem = aweme;
    }

    public void setForwardItemId(String str) {
        this.forwardItemId = str;
    }

    public void setFriendsTabFakeAweme(boolean z) {
        this.isFriendsTabFakeAweme = z;
    }

    public void setFriendsVideoUnread(boolean z) {
        this.isFriendsVideoUnread = z;
    }

    public void setFromRawChallenge(Challenge challenge) {
        this.fromRawChallenge = challenge;
    }

    public void setFromSplitData(boolean z) {
        this.isFromSplitData = z;
    }

    public void setFromTrendingCard(String str) {
        this.isFromTrendingCard = str;
    }

    public void setGameInfo(GameInfo gameInfo) {
        this.gameInfo = gameInfo;
    }

    public void setGeneralMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.generalMaskInfo = videoMaskInfo;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setGroupIdList(GroupIdListStruct groupIdListStruct) {
        this.groupIdList = groupIdListStruct;
    }

    public void setHasAd(int i) {
        this.hasAd = i;
    }

    public void setHasCreationIntention(boolean z) {
        this.hasCreationIntention = z;
    }

    public void setHasDanmaku(boolean z) {
        this.hasDanmaku = z;
    }

    public void setHasPromoteEntry(int i) {
        this.hasPromoteEntry = i;
    }

    public void setHasSeeMoreBeenShowed(boolean z) {
        this.hasSeeMoreBeenShown = z;
    }

    public void setHasVisionSearchEntry(boolean z) {
        this.hasVisionSearchEntry = z;
    }

    public void setHashTag(int i) {
        this.isHashTag = i;
    }

    public void setHaveDashboard(boolean z) {
        this.haveDashboard = z;
    }

    public void setHighlightInfoList(List<HighlightInfo> list) {
        this.mHighlightInfoList = list;
    }

    public void setHighlighted(boolean z) {
        this.isHighlighted = z;
    }

    public Aweme setHotListStruct(HotListStruct hotListStruct) {
        this.hotListStruct = hotListStruct;
        return this;
    }

    public void setHotSearchInfo(HotSearchInfo hotSearchInfo) {
        this.hotSearchInfo = hotSearchInfo;
    }

    public Aweme setHotSearchInfoStruct(HotSearchInfoStruct hotSearchInfoStruct) {
        this.hotSearchInfoStruct = hotSearchInfoStruct;
        return this;
    }

    public Aweme setHotSpot(String str) {
        this.hotSpot = str;
        return this;
    }

    public void setHybridLabels(List<AwemeHybridLabelModel> list) {
        this.hybridLabels = list;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setImItemId(String str) {
        this.imItemId = str;
    }

    public void setImageInfos(List<ImageInfo> list) {
        this.imageInfos = list;
    }

    public void setInteractPermission(InteractPermission interactPermission) {
        this.interactPermission = interactPermission;
    }

    public void setInteractStickerStructs(List<InteractStickerStruct> list) {
        this.interactStickerStructs = list;
    }

    public void setInteractionBubbleState(InteractionBubbleCacheState interactionBubbleCacheState) {
        InteractionBubbles interactionBubbles = this.interactionBubbles;
        if (interactionBubbles != null) {
            InteractionBubbles.Builder copy = interactionBubbles.copy();
            copy.cacheState(interactionBubbleCacheState);
            this.interactionBubbles = copy.build();
        }
    }

    public void setInteractionTagInfo(InteractionTagInfo interactionTagInfo) {
        this.interactionTagInfo = interactionTagInfo;
    }

    public void setIsBehindTheSongVideoType(Boolean bool) {
        this.isBehindTheSongVideoType = bool;
    }

    public void setIsFeatureVideoItem(Boolean bool) {
        this.isFeatureVideoItem = bool;
    }

    public void setIsFeatureVideoSelected(Boolean bool) {
        this.isFeatureVideoSelected = bool;
    }

    public void setIsFromDouPlusGuideAnimate(boolean z) {
        this.isFromDouPlusGuideAnimate = z;
    }

    public void setIsLiveHasProduct(boolean z) {
        this.isLiveHasProduct = z;
    }

    public void setIsPreloadScroll(boolean z) {
        this.isPreloadScroll = z;
    }

    public void setIsStoryToNormal(boolean z) {
        this.isStoryToNormal = z;
    }

    public void setIsSubAweme(boolean z) {
        this.isSubAweme = z;
    }

    public void setIsTikTokStory(boolean z) {
        this.isTikTokStory = z;
    }

    public void setIsTop(int i) {
        this.isTop = i;
    }

    public void setItemDistributeSource(String str) {
        this.mItemDistributeSource = str;
    }

    public void setItemSourceCategory(int i) {
        this.mItemSourceCategory = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelMusicStarterText(String str) {
        this.mLabelMusicStarterText = str;
    }

    public void setLabelOriginAuthorText(String str) {
        this.mLabelOriginAuthorText = str;
    }

    public void setLabelPrivate(UrlModel urlModel) {
        this.labelPrivate = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLabelTop(UrlModel urlModel) {
        this.labelTop = urlModel;
    }

    public void setLandingPage(String str) {
        this.landingPage = str;
    }

    public void setLastInSpot(boolean z) {
        this.isLastInSpot = z;
    }

    public void setLawCriticalCountry(boolean z) {
        this.lawCriticalCountry = z;
    }

    public void setLike(boolean z) {
        this.userDigg = z ? 1 : 0;
    }

    public void setLinkAdData(LinkData linkData) {
        this.linkAdData = linkData;
    }

    public void setLinkMatch(LinkMatch linkMatch) {
        this.linkMatch = linkMatch;
    }

    public void setLiveAwesomeSplashInfo(LiveAwesomeSplashInfo liveAwesomeSplashInfo) {
        this.mLiveAwesomeSplashInfo = liveAwesomeSplashInfo;
    }

    public void setLiveId(long j) {
        this.liveId = j;
    }

    public void setLivePreviewLongPressDisabled(boolean z) {
        this.livePreviewLongPressDisabled = z;
    }

    public void setLivePreviewSize(Integer[] numArr) {
        this.livePreviewSize = numArr;
    }

    public void setLiveReaSon(String str) {
        this.liveReaSon = str;
    }

    public void setLiveReplay(boolean z) {
        this.isLiveReplay = z;
    }

    public void setLiveType(String str) {
        this.liveType = str;
    }

    public void setLiveWindowShowTime(long j) {
        this.liveWindowShowTime = j;
    }

    public void setLogPbBean(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setLongVideos(List<LongVideo> list) {
        this.longVideos = list;
    }

    public void setMatchText(String str) {
        this.matchText = str;
    }

    public void setMatchType(int i) {
        this.matchType = i;
    }

    public void setMicroAppInfo(MicroAppInfo microAppInfo) {
        this.microAppInfo = microAppInfo;
    }

    public void setMixInfo(MixStruct mixStruct) {
        this.mixInfo = mixStruct;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicBeginTime(int i) {
        this.musicBeginTime = i;
    }

    public void setMusicEndTime(int i) {
        this.musicEndTime = i;
    }

    public void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public void setMusicStarter(UrlModel urlModel) {
        this.musicStarter = urlModel;
    }

    public void setMusicTitleStyle(int i) {
        this.musicTitleStyle = i;
    }

    public void setMusicVolume(String str) {
        this.musicVolume = str;
    }

    public void setMutualRelation(MutualStruct mutualStruct) {
        this.mutualRelation = mutualStruct;
    }

    public void setNearbyHotLabel(String str) {
        this.nearbyHotLabel = str;
    }

    public void setNearbyInfo(NearbyInfo nearbyInfo) {
        this.nearbyInfo = nearbyInfo;
    }

    public void setNeedVisionSearchEntry(boolean z) {
        this.needVisionSearchEntry = z;
    }

    public void setNewLiveRoomDataStr(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.newLiveRoomData = (NewLiveRoomStruct) GsonProtectorUtils.fromJson(C69432nz.LIZ(), str, NewLiveRoomStruct.class);
        }
    }

    public void setNewRelationLabel(List<RelationLabelNew> list) {
        this.mNewRelationLabel = list;
    }

    public void setNewSourceId(String str) {
        this.newSourceId = str;
    }

    public void setNewSourceType(String str) {
        this.newSourceType = str;
    }

    public void setNicknamePosition(List<Position> list) {
        this.nicknamePosition = list;
    }

    public void setNrNff(boolean z) {
        this.isNrNff = z;
    }

    public void setOperatorBoosts(List<OperatorBoost> list) {
        this.operatorBoosts = list;
    }

    public void setOriginAuthor(UrlModel urlModel) {
        this.originAuthor = urlModel;
    }

    public void setOriginCommentIds(List<String> list) {
        this.originCommentIds = list;
    }

    public void setOriginVolume(String str) {
        this.originVolume = str;
    }

    public void setOriginalClientText(ClientText clientText) {
        this.originalClientText = clientText;
    }

    public void setOriginalPos(int i) {
        this.originalPos = i;
    }

    public void setParameterizedSpeed(float f) {
        this.parameterizedSpeed = f;
    }

    public void setParentHotSpot(String str) {
        this.parentHotSpot = str;
    }

    public void setPartN(String str) {
        this.partN = str;
    }

    public void setPgcShow(boolean z) {
        this.isPgcShow = z;
    }

    public void setPhotoContentType(String str) {
        this.photoContentType = str;
    }

    public void setPhotoModeImageInfo(PhotoModeImageInfo photoModeImageInfo) {
        this.photoModeImageInfo = photoModeImageInfo;
    }

    public void setPhotoModeTitleLine(CharSequence charSequence) {
        this.photoModeTitleLine = charSequence;
    }

    public void setPhotosensitiveMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.photosensitiveMaskInfo = videoMaskInfo;
    }

    public void setPinnedByArtist(boolean z) {
        this.isPinnedByArtist = z;
    }

    public void setPlaylistBlocked(boolean z) {
        this.playlistBlocked = z;
    }

    public void setPlaylist_info(PlayListInfo playListInfo) {
        this.playlist_info = playListInfo;
    }

    public void setPodcastInfo(PodcastInfo podcastInfo) {
        this.podcastInfo = podcastInfo;
    }

    public void setPoiDataStruct(PoiDataStruct poiDataStruct) {
        this.poiDataStruct = poiDataStruct;
    }

    public void setPoiReTagSignal(int i) {
        this.poiReTagSignal = i;
    }

    public void setPoiReTagText(String str) {
        this.poiReTagText = str;
    }

    public void setPosition(List<Position> list) {
        this.position = list;
    }

    public void setPreload(Preload preload) {
        this.preload = preload;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewData(PublishPreviewInfo publishPreviewInfo) {
        this.previewData = publishPreviewInfo;
    }

    public void setProcessedDesc(CharSequence charSequence) {
        if (charSequence == null) {
            this.processedDesc = null;
        } else {
            this.processedDesc = new WeakReference<>(charSequence);
        }
    }

    public void setProductsCount(int i) {
        this.productsCount = i;
    }

    public void setProductsInfo(List<Product> list) {
        this.productsInfo = list;
    }

    public void setPromoteToast(String str) {
        this.promoteToast = str;
    }

    public void setPromoteToastKey(String str) {
        this.promoteToastKey = str;
    }

    public void setPromotionOtherInfo(PromotionOtherInfo promotionOtherInfo) {
        this.promotionOtherInfo = promotionOtherInfo;
    }

    public void setRank(int i) {
        this.mRank = i;
    }

    public void setRate(int i) {
        this.rate = i;
    }

    public void setRateScore(String str) {
        this.rateScore = str;
    }

    public void setReactFrom(String str) {
        this.reactFrom = str;
    }

    public void setReactOrigin(String str) {
        this.reactOrigin = str;
    }

    public void setReactSetting(int i) {
        this.reactSetting = i;
    }

    public void setReactView(String str) {
        this.reactView = str;
    }

    public void setRecBigCardFakeAweme(boolean z) {
        this.isRecBigCardFakeAweme = z;
    }

    public void setRecReasonsEntry(List<RecReasonEntry> list) {
        RecReasonsStruct recReasonsStruct = this.recReasonsStruct;
        if (recReasonsStruct == null) {
            this.recReasonsStruct = new RecReasonsStruct(list, null, null, null, null, null, null, null);
        } else {
            recReasonsStruct.setReasons(list);
        }
    }

    public void setRecommendCardType(int i) {
        this.recommendCardType = i;
    }

    public void setReferralFakeAweme(boolean z) {
        this.isReferralFakeAweme = z;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRelatedLiveTag(RelatedLiveTagStruct relatedLiveTagStruct) {
        this.relatedLiveTagStruct = relatedLiveTagStruct;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setRelationRecommendInfo(AwemeRelationRecommendModel awemeRelationRecommendModel) {
        this.relationRecommendInfo = awemeRelationRecommendModel;
    }

    public void setRelieve(boolean z) {
        this.isRelieve = z;
    }

    public void setReplaceRecTagByRepost(boolean z) {
        this.replaceRecTagByRepost = z;
    }

    public void setReportMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.reportMaskInfo = videoMaskInfo;
    }

    public void setRepostFromGroupId(String str) {
        this.repostFromGroupId = str;
    }

    public void setRepostFromUserId(String str) {
        this.repostFromUserId = str;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        Aweme aweme;
        this.requestId = str;
        buildUniqueId();
        if (isForwardAweme() && (aweme = this.forwardItem) != null) {
            aweme.setRequestId(str);
        }
        User user = this.author;
        if (user != null) {
            user.setRequestId(str);
        }
    }

    public void setReversionForwardAweme(boolean z) {
        this.isReversionForwardAweme = z;
    }

    public void setRid(String str) {
        this.rid = str;
    }

    public void setRoom(RoomStruct roomStruct) {
        this.room = roomStruct;
    }

    public void setRoomFeedCellStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.mRoomFeedCellStruct = roomFeedCellStruct;
    }

    public void setScenario(int i) {
        this.scenario = i;
    }

    public void setScheduleId(String str) {
        this.scheduleId = str;
    }

    public void setSearchDocOriginLanguage(String str) {
        this.searchDocOriginLanguage = str;
    }

    public void setSearchDocTranslate(String str) {
        this.searchDocTranslate = str;
    }

    public void setSearchExtraStruct(SearchExtraStruct searchExtraStruct) {
        this.searchExtraStruct = searchExtraStruct;
    }

    public void setSearchFeedType(String str) {
        this.searchFeedType = str;
    }

    public void setSearchTabName(String str) {
        this.searchTabName = str;
    }

    public void setSearchTabRank(Integer num) {
        this.SearchTabRank = num;
    }

    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void setShareToStoryInfo(ShareToStoryStruct shareToStoryStruct) {
        this.share2StoryStruct = shareToStoryStruct;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSharer(User user) {
        this.sharer = user;
    }

    public void setShootTabName(String str) {
        this.shootTabName = str;
    }

    public void setShopAdStruct(ShopAdStruct shopAdStruct) {
        this.shopAdStruct = shopAdStruct;
    }

    public void setSpecialSticker(SpecialSticker specialSticker) {
        this.specialSticker = specialSticker;
    }

    public void setStarAtlasOrderId(long j) {
        this.starAtlasOrderId = j;
    }

    public void setStatistics(AwemeStatistics awemeStatistics) {
        this.statistics = awemeStatistics;
    }

    public void setStatus(AwemeStatus awemeStatus) {
        this.status = awemeStatus;
    }

    public void setStickerEntranceInfo(NewFaceStickerBean newFaceStickerBean) {
        this.stickerEntranceInfo = newFaceStickerBean;
    }

    public void setStickerIDs(String str) {
        this.stickerIDs = str;
    }

    public void setStitchSetting(int i) {
        this.stitchSetting = i;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public void setStoryFakeAweme(boolean z) {
        this.isStoryFakeAweme = z;
    }

    public void setStoryModel(StoryVideo storyVideo) {
        this.storyModel = storyVideo;
    }

    public void setStoryPacked(boolean z) {
        this.isStoryPacked = z;
    }

    public void setStoryType(int i) {
        this.storyType = i;
    }

    public void setStreamUrlModel(StreamUrlModel streamUrlModel) {
        this.streamUrlModel = streamUrlModel;
    }

    public void setSubAweme(Aweme aweme) {
        this.subAweme = aweme;
    }

    public void setSubAwemeCover(UrlModel urlModel) {
        this.subAwemeCover = urlModel;
    }

    public void setSubOnlyVideo(boolean z) {
        this.isSubOnlyVideo = z;
    }

    public void setSupportDanmaku(boolean z) {
        this.isSupportDanmaku = z;
    }

    public void setSurveyInfo(com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo surveyInfo) {
        if (surveyInfo == null) {
            return;
        }
        this.surveyInfo = surveyInfo;
        if (this.surveyInfos == null) {
            this.surveyInfos = new ArrayList();
        }
        if (this.surveyInfos.size() > 0) {
            ListProtector.set(this.surveyInfos, 0, surveyInfo);
        } else {
            this.surveyInfos.add(surveyInfo);
        }
    }

    public void setSurveyInfos(List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> list) {
        this.surveyInfos = list;
    }

    public void setTakeDownDesc(String str) {
        this.takeDownDesc = str;
    }

    public void setTakeDownReason(int i) {
        this.takeDownReason = i;
    }

    public void setTcmInfo(TCMInfo tCMInfo) {
        this.tcmInfo = tCMInfo;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTextTopLabels(List<AwemeTextLabelModel> list) {
        this.textTopLabels = list;
    }

    public void setTextVideoLabels(List<AwemeTextLabelModel> list) {
        this.textVideoLabels = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTotalProductAnchors(int i) {
        this.totalProductAnchors = i;
    }

    public void setTransParams(String str) {
        this.transParams = str;
    }

    public void setTrendingBar(AwemeTrendingBar awemeTrendingBar) {
        this.trendingBar = awemeTrendingBar;
    }

    public void setTrendingBarFYP(AwemeTrendingBar awemeTrendingBar) {
        this.trendingBarFYP = awemeTrendingBar;
    }

    public void setTrendingId(String str) {
        this.trendingId = str;
    }

    public void setTrendingName(String str) {
        this.trendingName = str;
    }

    public void setTtsVoiceIDs(List<String> list) {
        this.ttsVoiceIDs = list;
    }

    public void setTtsVoiceRefIDs(List<String> list) {
        this.ttsVoiceRefIDs = list;
    }

    public void setUniqidPosition(List<Position> list) {
        this.uniqidPosition = list;
    }

    public void setUniqueIdForCache(String str) {
        this.uniqueId = str;
        this.forceUseUniqueId = Boolean.TRUE;
    }

    public void setUpvotePreload(UpvotePreloadStruct upvotePreloadStruct) {
        this.upvotePreload = upvotePreloadStruct;
    }

    public void setUpvoteReason(UpvoteReason upvoteReason) {
        this.upvoteReason = upvoteReason;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setUserProfileInitInfo(UserProfileInitInfo userProfileInitInfo) {
        this.userProfileInitInfo = userProfileInitInfo;
    }

    public void setUserStory(UserStory userStory) {
        this.userStory = userStory;
    }

    public void setVcVoiceIDs(List<String> list) {
        this.vcVoiceIDs = list;
    }

    public void setVcVoiceRefIDs(List<String> list) {
        this.vcVoiceRefIDs = list;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVideoControl(VideoControl videoControl) {
        this.videoControl = videoControl;
    }

    public void setVideoFeedTag(String str) {
        this.videoFeedTag = str;
    }

    public void setVideoLabels(List<AwemeLabelModel> list) {
        this.videoLabels = list;
    }

    public void setVideoMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.videoMaskInfo = videoMaskInfo;
    }

    public void setVideoMaskInfos(List<VideoMaskInfo> list) {
        this.videoMaskInfos = list;
    }

    public void setVideoReplyStruct(VideoReplyStruct videoReplyStruct) {
        this.videoReplyStruct = videoReplyStruct;
    }

    public void setVideoSkipEnableSkipButton(boolean z) {
        this.isEnableVideoSkip = z;
    }

    public void setVideoSkipRelevantTime(List<Float> list) {
        this.relevantTime = list;
    }

    public void setVr(boolean z) {
        this.isVr = z;
        Video video = this.video;
        if (video != null) {
            setVr(video.getPlayAddrH264(), z);
            setVr(this.video.getPlayAddrBytevc1(), z);
        }
    }

    public void setWithPromotionalMusic(boolean z) {
        this.withPromotionalMusic = z;
    }

    public void setWithSearchSurvey(boolean z) {
        this.withSearchSurvey = z;
    }

    public void update(Aweme aweme) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        User user;
        User user2;
        if (aweme == null) {
            return;
        }
        if (TextUtils.isEmpty(aweme.aid)) {
            str = this.aid;
        } else {
            str = aweme.aid;
        }
        this.aid = str;
        String str7 = aweme.desc;
        if (str7 == null) {
            str7 = this.desc;
        }
        this.desc = str7;
        OriginalAudioStruct originalAudioStruct = aweme.originalAudio;
        if (originalAudioStruct == null) {
            originalAudioStruct = this.originalAudio;
        }
        this.originalAudio = originalAudioStruct;
        AnchorInfo anchorInfo = aweme.anchorInfo;
        if (anchorInfo == null) {
            anchorInfo = this.anchorInfo;
        }
        this.anchorInfo = anchorInfo;
        long j = aweme.createTime;
        if (j == 0) {
            j = this.createTime;
        }
        this.createTime = j;
        if (aweme.photoModeImageInfo != null && !PhotoModeImageInfoKt.hasLocalImagePath(this.photoModeImageInfo)) {
            this.photoModeImageInfo = aweme.photoModeImageInfo;
        }
        this.commentSuggestWordList = aweme.getCommentSuggestWordList();
        this.anchorsExtras = aweme.getAnchorsExtras();
        User user3 = this.author;
        FakeLandscapeInfo fakeLandscapeInfo = null;
        if (user3 != null) {
            i = user3.getFollowerCount();
            str2 = this.author.getSocialInfo();
        } else {
            str2 = null;
            i = 0;
        }
        try {
            User user4 = aweme.author;
            if (user4 != null && ((user4.getMatchedFriendStruct() == null || TextUtils.isEmpty(aweme.author.getMatchedFriendStruct().getRecType())) && (user2 = this.author) != null && user2.getMatchedFriendStruct() != null && !TextUtils.isEmpty(this.author.getMatchedFriendStruct().getRecType()))) {
                aweme.author.setMatchedFriendStruct(this.author.getMatchedFriendStruct());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        User user5 = aweme.author;
        if (user5 != null && user5.getStoryStatus() < 0 && (user = this.author) != null) {
            aweme.author.setStoryStatus(user.getStoryStatus());
        }
        User user6 = aweme.author;
        if (user6 == null) {
            user6 = this.author;
        }
        this.author = user6;
        if (user6 != null && user6.getFollowerCount() == 0 && i > 0) {
            this.author.setFollowerCount(i);
        }
        User user7 = this.author;
        if (user7 != null && TextUtils.isEmpty(user7.getSocialInfo()) && !TextUtils.isEmpty(str2)) {
            this.author.setSocialInfo(str2);
        }
        List<CommerceConfigData> list = aweme.commerceConfigDataList;
        if (list != null && !list.isEmpty()) {
            this.commerceConfigDataList = aweme.commerceConfigDataList;
        }
        if (TextUtils.isEmpty(aweme.shareUrl)) {
            str3 = this.shareUrl;
        } else {
            str3 = aweme.shareUrl;
        }
        this.shareUrl = str3;
        this.userDigg = aweme.userDigg;
        this.statistics = aweme.statistics;
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus == null) {
            awemeStatus = this.status;
        }
        this.status = awemeStatus;
        this.isSubOnlyVideo = aweme.isSubOnlyVideo;
        this.filterStrangerComments = aweme.filterStrangerComments;
        this.filterUnfriendlyUserComments = aweme.filterUnfriendlyUserComments;
        List<Challenge> list2 = aweme.challengeList;
        if (list2 == null) {
            list2 = this.challengeList;
        }
        this.challengeList = list2;
        List<GreenScreenMaterial> list3 = aweme.greenScreenMaterialList;
        if (list3 == null) {
            list3 = this.greenScreenMaterialList;
        }
        this.greenScreenMaterialList = list3;
        String str8 = aweme.musicVolume;
        if (str8 == null) {
            str8 = this.musicVolume;
        }
        this.musicVolume = str8;
        String str9 = aweme.originVolume;
        if (str9 == null) {
            str9 = this.originVolume;
        }
        this.originVolume = str9;
        Music music = this.music;
        Music music2 = this.addedSoundMusicInfo;
        Music music3 = aweme.music;
        if (music3 == null) {
            music3 = music;
        }
        this.music = music3;
        Music music4 = aweme.addedSoundMusicInfo;
        if (music4 == null) {
            music4 = music2;
        }
        this.addedSoundMusicInfo = music4;
        Video video = this.video;
        if (video != null) {
            fakeLandscapeInfo = video.getFakeLandscapeInfo();
        }
        Video video2 = aweme.video;
        if (video2 == null) {
            video2 = this.video;
        }
        this.video = video2;
        if (video2 != null && video2.getFakeLandscapeInfo() == null) {
            this.video.setFakeLandscapeInfo(fakeLandscapeInfo);
        }
        Audio audio = aweme.audio;
        if (audio == null) {
            audio = this.audio;
        }
        this.audio = audio;
        updateMusic(music, this.music);
        updateMusic(music2, this.addedSoundMusicInfo);
        ExploreClientExtra exploreClientExtra = this.exploreClientExtra;
        if (exploreClientExtra != null) {
            exploreClientExtra.update(aweme.getExploreClientExtra());
        } else {
            this.exploreClientExtra = aweme.getExploreClientExtra();
        }
        if (TextUtils.isEmpty(aweme.extra)) {
            str4 = this.extra;
        } else {
            str4 = aweme.extra;
        }
        this.extra = str4;
        if (TextUtils.isEmpty(aweme.douDiscountLabel)) {
            str5 = this.douDiscountLabel;
        } else {
            str5 = aweme.douDiscountLabel;
        }
        this.douDiscountLabel = str5;
        HotSearchInfo hotSearchInfo = aweme.douDiscountMixInfo;
        if (hotSearchInfo == null) {
            hotSearchInfo = this.douDiscountMixInfo;
        }
        this.douDiscountMixInfo = hotSearchInfo;
        List<TextExtraStruct> list4 = aweme.textExtra;
        if (list4 == null) {
            list4 = this.textExtra;
        }
        this.textExtra = list4;
        this.rate = aweme.rate;
        this.starAtlasOrderId = aweme.starAtlasOrderId;
        this.tcmInfo = aweme.tcmInfo;
        this.isFantasy = aweme.isFantasy;
        this.labelTop = aweme.labelTop;
        this.labelLarge = aweme.labelLarge;
        this.labelThumb = aweme.labelThumb;
        this.shareInfo = aweme.shareInfo;
        this.originAuthor = aweme.originAuthor;
        this.musicStarter = aweme.musicStarter;
        this.mLabelMusicStarterText = aweme.mLabelMusicStarterText;
        this.mLabelOriginAuthorText = aweme.mLabelOriginAuthorText;
        this.isHashTag = aweme.isHashTag;
        this.videoLabels = aweme.videoLabels;
        this.isAd = aweme.isAd;
        this.awemeType = aweme.awemeType;
        this.collectStatus = aweme.collectStatus;
        this.awemeRawAd = aweme.awemeRawAd;
        this.specialSticker = aweme.specialSticker;
        this.mLiveAwesomeSplashInfo = aweme.mLiveAwesomeSplashInfo;
        this.videoLabels = aweme.videoLabels;
        this.textVideoLabels = aweme.textVideoLabels;
        this.textTopLabels = aweme.textTopLabels;
        this.imageInfos = aweme.imageInfos;
        this.awemeRiskModel = aweme.awemeRiskModel;
        this.bottomBarModel = aweme.bottomBarModel;
        this.cmtSwt = aweme.cmtSwt;
        this.canPlay = aweme.canPlay;
        this.scenario = aweme.scenario;
        this.position = aweme.position;
        this.lawCriticalCountry = aweme.lawCriticalCountry;
        this.room = aweme.room;
        this.adSchedule = aweme.adSchedule;
        this.feedCount = aweme.feedCount;
        this.preventDownload = aweme.preventDownload;
        this.forwardItem = aweme.forwardItem;
        this.forwardItemId = aweme.forwardItemId;
        this.groupId = aweme.groupId;
        this.forwardCommentId = aweme.forwardCommentId;
        this.preForwardId = aweme.preForwardId;
        this.withPromotionalMusic = aweme.withPromotionalMusic;
        this.linkAdData = aweme.linkAdData;
        this.activityPendant = aweme.activityPendant;
        this.interactPermission = aweme.interactPermission;
        MicroAppInfo microAppInfo = aweme.microAppInfo;
        if (microAppInfo == null) {
            microAppInfo = this.microAppInfo;
        }
        this.microAppInfo = microAppInfo;
        this.isReversionForwardAweme = aweme.isReversionForwardAweme;
        this.isFriendsVideoUnread = aweme.isFriendsVideoUnread;
        NewFaceStickerBean newFaceStickerBean = aweme.stickerEntranceInfo;
        if (newFaceStickerBean == null) {
            newFaceStickerBean = this.stickerEntranceInfo;
        }
        this.stickerEntranceInfo = newFaceStickerBean;
        List<AnchorCommonStruct> list5 = this.anchors;
        if (list5 != null) {
            Iterator<AnchorCommonStruct> it = list5.iterator();
            while (it.hasNext()) {
                if (it.next().getType() == 63) {
                    break;
                }
            }
        }
        this.anchors = aweme.anchors;
        this.anchorInfo = aweme.anchorInfo;
        if (TextUtils.isEmpty(aweme.stickerIDs)) {
            str6 = this.stickerIDs;
        } else {
            str6 = aweme.stickerIDs;
        }
        this.stickerIDs = str6;
        HotListStruct hotListStruct = this.hotListStruct;
        if (hotListStruct == null || hotListStruct.getType() != 9) {
            this.hotListStruct = aweme.hotListStruct;
        }
        List<LongVideo> list6 = aweme.longVideos;
        if (list6 == null) {
            list6 = this.longVideos;
        }
        this.longVideos = list6;
        this.takeDownReason = aweme.takeDownReason;
        this.takeDownDesc = aweme.takeDownDesc;
        this.downloadWithoutWatermark = aweme.downloadWithoutWatermark;
        if (!C78540Us4.LJIILLIIL(aweme.interactStickerStructs)) {
            this.interactStickerStructs = aweme.interactStickerStructs;
        }
        this.originCommentIds = aweme.originCommentIds;
        this.duetSetting = aweme.duetSetting;
        this.reactSetting = aweme.reactSetting;
        this.stitchSetting = aweme.stitchSetting;
        this.isEffectDesigner = aweme.isEffectDesigner;
        this.commentSetting = aweme.commentSetting;
        this.commentConfig = aweme.commentConfig;
        VideoControl videoControl = aweme.videoControl;
        if (videoControl == null) {
            videoControl = this.videoControl;
        }
        this.videoControl = videoControl;
        this.distributeType = aweme.distributeType;
        this.insightsEligibilityStatus = aweme.insightsEligibilityStatus;
        this.mixInfo = aweme.mixInfo;
        if (aweme.getMobParams() != null) {
            this.mMobParams = aweme.getMobParams();
        }
        if (!TextUtils.isEmpty(aweme.getRateScore())) {
            this.rateScore = aweme.getRateScore();
        }
        if (aweme.getCommerceVideoAuthInfo() != null) {
            this.mCommerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
        }
        String str10 = aweme.uploadMiscInfoStructStr;
        this.uploadMiscInfoStructStr = str10;
        this.cacheAvUploadMiscInfoStruct = AVUploadMiscInfoStruct.createStruct(str10);
        this.feedRelationLabel = aweme.feedRelationLabel;
        this.videoMaskInfo = aweme.videoMaskInfo;
        this.videoMaskInfos = aweme.videoMaskInfos;
        this.generalMaskInfo = aweme.generalMaskInfo;
        this.reportMaskInfo = aweme.reportMaskInfo;
        this.photosensitiveMaskInfo = aweme.photosensitiveMaskInfo;
        this.contentClassificationMaskInfo = aweme.contentClassificationMaskInfo;
        StreamUrlModel streamUrlModel = aweme.streamUrlModel;
        if (streamUrlModel == null) {
            streamUrlModel = this.streamUrlModel;
        }
        this.streamUrlModel = streamUrlModel;
        String str11 = aweme.title;
        if (str11 == null) {
            str11 = this.title;
        }
        this.title = str11;
        String str12 = aweme.videoFeedTag;
        if (str12 == null) {
            str12 = this.videoFeedTag;
        }
        this.videoFeedTag = str12;
        String str13 = aweme.liveReaSon;
        if (str13 == null) {
            str13 = this.liveReaSon;
        }
        this.liveReaSon = str13;
        RoomFeedCellStruct roomFeedCellStruct = aweme.mRoomFeedCellStruct;
        if (roomFeedCellStruct == null) {
            roomFeedCellStruct = this.mRoomFeedCellStruct;
        }
        this.mRoomFeedCellStruct = roomFeedCellStruct;
        VideoReplyStruct videoReplyStruct = aweme.videoReplyStruct;
        if (videoReplyStruct == null) {
            videoReplyStruct = this.videoReplyStruct;
        }
        this.videoReplyStruct = videoReplyStruct;
        this.liveWindowShowTime = aweme.liveWindowShowTime;
        LinkMatch linkMatch = aweme.linkMatch;
        if (linkMatch == null) {
            linkMatch = this.linkMatch;
        }
        this.linkMatch = linkMatch;
        NewLiveRoomStruct newLiveRoomStruct = aweme.newLiveRoomData;
        if (newLiveRoomStruct == null) {
            newLiveRoomStruct = this.newLiveRoomData;
        }
        this.newLiveRoomData = newLiveRoomStruct;
        List<AwemeHybridLabelModel> list7 = aweme.hybridLabels;
        if (list7 != null) {
            this.hybridLabels = list7;
        }
        String str14 = aweme.distance;
        if (str14 == null) {
            str14 = this.distance;
        }
        this.distance = str14;
        this.withSurvey = aweme.withSurvey;
        UserProfileInitInfo userProfileInitInfo = aweme.userProfileInitInfo;
        if (userProfileInitInfo == null) {
            userProfileInitInfo = this.userProfileInitInfo;
        }
        this.userProfileInitInfo = userProfileInitInfo;
        this.recommendCardType = aweme.recommendCardType;
        this.isLiveReplay = aweme.isLiveReplay;
        this.haveDashboard = aweme.haveDashboard;
        List<String> list8 = aweme.geofencingRegions;
        if (list8 != null && !list8.isEmpty()) {
            this.geofencingRegions = aweme.geofencingRegions;
        }
        this.isFamiliar = aweme.isFamiliar;
        this.mNewRelationLabel = aweme.mNewRelationLabel;
        this.feedRelationLabel = aweme.feedRelationLabel;
        this.bubbleInfo = aweme.bubbleInfo;
        this.allowReuseOriginalSound = aweme.allowReuseOriginalSound;
        this.hasPromoteEntry = aweme.getHasPromoteEntry();
        this.promoteToastKey = aweme.getPromoteToastKey();
        this.promoteToast = aweme.getPromoteToast();
        this.awemeACLShareInfo = aweme.getAwemeACLShareInfo();
        this.anchorWikiOfflineText = aweme.anchorWikiOfflineText;
        this.scheduleTime = aweme.scheduleTime;
        this.playlist_info = aweme.playlist_info;
        this.allowGift = aweme.getAllowGift();
        this.isOnThisDay = aweme.isOnThisDay;
        this.story = aweme.story;
        this.isStoryPacked = aweme.isStoryPacked;
        this.isDescTranslatable = aweme.isDescTranslatable;
        this.textStickerMajorityLang = aweme.textStickerMajorityLang;
        this.isTextStickerTranslatable = aweme.isTextStickerTranslatable;
        this.contentDesc = aweme.contentDesc;
        this.contentDescExtra = aweme.contentDescExtra;
        this.followUpPublishFromId = aweme.followUpPublishFromId;
        this.followUpFirstItemId = aweme.followUpFirstItemId;
        this.followUpItemIdGroups = aweme.followUpItemIdGroups;
        this.foldedTextExtra = aweme.foldedTextExtra;
        this.foldedHashTagDesc = aweme.foldedHashTagDesc;
        this.nearbyInfo = aweme.nearbyInfo;
        this.share2StoryStruct = aweme.share2StoryStruct;
        this.interactionTagInfo = aweme.interactionTagInfo;
        this.nowPostInfo = aweme.nowPostInfo;
        this.userNowPost = aweme.userNowPost;
        this.needTTSWatermarkWhenDownload = aweme.needTTSWatermarkWhenDownload;
        this.editPostPermission = aweme.editPostPermission;
        this.originalClientText = aweme.originalClientText;
        this.storyType = aweme.storyType;
        this.poiReTagSignal = aweme.poiReTagSignal;
        this.poiReTagText = aweme.poiReTagText;
        this.poiDataStruct = aweme.poiDataStruct;
        this.ccTemplateInfo = aweme.ccTemplateInfo;
        this.musicSelectedFrom = aweme.musicSelectedFrom;
        this.musicTitleStyle = aweme.musicTitleStyle;
        this.ttsVoiceIDs = aweme.ttsVoiceIDs;
        this.ttsVoiceRefIDs = aweme.ttsVoiceRefIDs;
        this.vcVoiceIDs = aweme.vcVoiceIDs;
        this.vcVoiceRefIDs = aweme.vcVoiceRefIDs;
        this.isPinnedByArtist = aweme.isPinnedByArtist;
        this.surveyInfo = aweme.surveyInfo;
        this.surveyInfos = aweme.surveyInfos;
        this.mainArchCommon = aweme.mainArchCommon;
        this.behindTheSongMusicIds = aweme.behindTheSongMusicIds;
        this.detailPageVideoTag = aweme.detailPageVideoTag;
        this.isTikTokStory = aweme.isTikTokStory;
        this.isStoryToNormal = aweme.isStoryToNormal;
        this.aigcInfo = aweme.aigcInfo;
        this.addYoursRecommendation = aweme.addYoursRecommendation;
        this.batchId = aweme.batchId;
        this.batchIndex = aweme.batchIndex;
    }

    public void updateSameAweme(Aweme aweme) {
        if (aweme != null) {
            String str = aweme.aid;
            String s2 = this.aid;
            o.LJIIIZ(s2, "s2");
            if ((C78540Us4.LJIILL(str) && C78540Us4.LJIILL(s2)) || (str != null && o.LJ(str, s2))) {
                update(aweme);
            }
        }
    }

    private void setVr(VideoUrlModel videoUrlModel, boolean z) {
        if (videoUrlModel != null) {
            videoUrlModel.setVr(z);
        }
    }

    private void updateMusic(Music music, Music music2) {
        if (music2 != null && music != null) {
            TTMMusicInfo ttmInfo = music.getTtmInfo();
            MusicReleaseInfo musicReleaseInfo = music.getMusicReleaseInfo();
            String logExtra = music.getLogExtra();
            MatchedPGCSoundInfo matchedPGCSoundInfo = music.getMatchedPGCSoundInfo();
            List<TT2DSPSongInfo> tT2DSPSongInfos = music.getTT2DSPSongInfos();
            if (ttmInfo != null) {
                music2.setTtmInfo(ttmInfo);
            }
            if (musicReleaseInfo != null) {
                music2.setMusicReleaseInfo(musicReleaseInfo);
            }
            if (logExtra != null) {
                music2.setLogExtra(logExtra);
            }
            if (matchedPGCSoundInfo != null) {
                music2.setMatchedPGCSoundInfo(matchedPGCSoundInfo);
            }
            if (tT2DSPSongInfos != null) {
                music2.setTT2DSPSongInfos(tT2DSPSongInfos);
            }
        }
    }

    public void appendExtraParamUseInSearch(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        if (this.searchExtraParams == null) {
            this.searchExtraParams = new HashMap();
        }
        this.searchExtraParams.put(str, str2);
    }

    public void appendMobParam(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.mMobParams == null) {
            this.mMobParams = new HashMap<>();
        }
        this.mMobParams.put(str, str2);
    }

    public void handleInteractionBubbleLike(Boolean bool, User user) {
        InteractionBubbles interactionBubbles = this.interactionBubbles;
        if (interactionBubbles != null) {
            InteractionBubbles.Builder copy = interactionBubbles.copy();
            copy.handleLike(bool.booleanValue(), user);
            this.interactionBubbles = copy.build();
        }
    }

    public void setInteractionBubbleComments(List<Comment> list, Long l) {
        InteractionBubbles interactionBubbles = this.interactionBubbles;
        if (interactionBubbles != null) {
            InteractionBubbles.Builder copy = interactionBubbles.copy();
            copy.commentData(list, l.longValue());
            this.interactionBubbles = copy.build();
        }
    }

    public void setInteractionBubbleLikes(List<User> list, Boolean bool, Long l, Long l2) {
        InteractionBubbles interactionBubbles = this.interactionBubbles;
        if (interactionBubbles != null) {
            InteractionBubbles.Builder copy = interactionBubbles.copy();
            copy.likeData(list, bool.booleanValue(), l.longValue(), l2.longValue());
            this.interactionBubbles = copy.build();
        }
    }
}
