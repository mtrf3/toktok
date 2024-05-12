package com.ss.android.ugc.aweme.gsonopt;

import X.C47062IdW;
import X.C47181IfR;
import X.C47186IfW;
import X.C47401Iiz;
import X.C51026K0w;
import X.C51027K0x;
import X.C51028K0y;
import X.C65385PlN;
import X.C65427Pm3;
import X.C69860RbM;
import X.C69861RbN;
import X.C69862RbO;
import X.C69863RbP;
import X.C69864RbQ;
import X.C69865RbR;
import X.C69866RbS;
import X.C69867RbT;
import X.C69868RbU;
import X.C69869RbV;
import X.C69870RbW;
import X.C69871RbX;
import X.C69872RbY;
import X.C69873RbZ;
import X.C69874Rba;
import X.C69875Rbb;
import X.C69877Rbd;
import X.C69878Rbe;
import X.C69879Rbf;
import X.C69882Rbi;
import X.C72070SQg;
import X.C72071SQh;
import X.C72072SQi;
import X.C72073SQj;
import X.C72109SRt;
import X.C72110SRu;
import X.C72112SRw;
import X.C79479VHf;
import X.C79480VHg;
import X.C79481VHh;
import X.C79482VHi;
import X.KP1;
import X.KSG;
import X.OG0;
import X.OG1;
import X.OG2;
import X.OG3;
import X.OG4;
import X.OG5;
import X.OG6;
import X.OG7;
import X.SS1;
import X.SS2;
import X.VIR;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbles;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.commerce.EnterpriseUserInfo;
import com.ss.android.ugc.aweme.commerce.PotentialBizAccountInfo;
import com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.ss.android.ugc.aweme.commerce.model.MissionItemStatus;
import com.ss.android.ugc.aweme.commerce.model.PromotionOtherInfo;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
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
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.commercialize.model.AdQuestionnaire;
import com.ss.android.ugc.aweme.commercialize.model.AdSlideBackInfoModel;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.commercialize.model.CommerceStickerInfo;
import com.ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import com.ss.android.ugc.aweme.commercialize.model.DouplusToastStructV3;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.model.FollowButtonData;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.model.NativeCardInfo;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.discover.model.BackGroundGradient;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.ss.android.ugc.aweme.discover.model.ChallengeBillboard;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.ss.android.ugc.aweme.discover.model.ChallengeExtraAttrStruct;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.discover.model.InquiryStruct;
import com.ss.android.ugc.aweme.discover.model.RelatedMediaSourceStruct;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.AdLive;
import com.ss.android.ugc.aweme.feed.model.AggregationSdk;
import com.ss.android.ugc.aweme.feed.model.Anchor;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.ss.android.ugc.aweme.feed.model.AnimatedBtnStruct;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeActivity;
import com.ss.android.ugc.aweme.feed.model.AwemeBubbleInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeLinkLabel;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.ss.android.ugc.aweme.feed.model.BannerTip;
import com.ss.android.ugc.aweme.feed.model.Boost;
import com.ss.android.ugc.aweme.feed.model.BottomBarModel;
import com.ss.android.ugc.aweme.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.CallToActionBarInfo;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.DescendantsModel;
import com.ss.android.ugc.aweme.feed.model.DuetInfo;
import com.ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import com.ss.android.ugc.aweme.feed.model.GameInfo;
import com.ss.android.ugc.aweme.feed.model.GroupIdListStruct;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfoStruct;
import com.ss.android.ugc.aweme.feed.model.IndicatorData;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.MainArchCommon;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.ss.android.ugc.aweme.feed.model.MixStruct;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.feed.model.OriginalAudioStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import com.ss.android.ugc.aweme.feed.model.Preload;
import com.ss.android.ugc.aweme.feed.model.PromotePageModel;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.model.RelationLabelNew;
import com.ss.android.ugc.aweme.feed.model.RoomStruct;
import com.ss.android.ugc.aweme.feed.model.ShareToStoryStruct;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.ss.android.ugc.aweme.feed.model.StoryVideo;
import com.ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.ss.android.ugc.aweme.feed.model.TCMInfo;
import com.ss.android.ugc.aweme.feed.model.UpvotePreloadStruct;
import com.ss.android.ugc.aweme.feed.model.UserProfileInitInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageNetworkOptimization;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceRerankInfo;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveAuthenticationInfo;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SearchExtraStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.im.service.model.MediaSafetyModel;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.ss.android.ugc.aweme.music.OriginalMusician;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.TTMInfo;
import com.ss.android.ugc.aweme.music.model.TTMMusicInfo;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.profile.model.AGSWarning;
import com.ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.ss.android.ugc.aweme.profile.model.AdvancedFeatureInfo;
import com.ss.android.ugc.aweme.profile.model.AgeGateInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AwemeUnreadInfo;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.CreatorFundBannerSetting;
import com.ss.android.ugc.aweme.profile.model.DspProfile;
import com.ss.android.ugc.aweme.profile.model.EffectArtistDetail;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.FriendsTabRelatedUserInfo;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.HonorStruct;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import com.ss.android.ugc.aweme.profile.model.LiveAnchorInfo;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.NudgeGuideInfo;
import com.ss.android.ugc.aweme.profile.model.PaidContentAwareBannerSetting;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerSetting;
import com.ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.ss.android.ugc.aweme.profile.model.PrivacySetting;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileUserExperiments;
import com.ss.android.ugc.aweme.profile.model.QuickShopInfo;
import com.ss.android.ugc.aweme.profile.model.ShopEntranceInfo;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.UnReadVideoInfo;
import com.ss.android.ugc.aweme.profile.model.UrgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAwemeCover;
import com.ss.android.ugc.aweme.profile.model.UserBioPermission;
import com.ss.android.ugc.aweme.profile.model.UserHonor;
import com.ss.android.ugc.aweme.profile.model.UserNowInfo;
import com.ss.android.ugc.aweme.profile.model.UserNowPackStruct;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo;
import com.ss.android.ugc.aweme.profile.model.VideoCover;
import com.ss.android.ugc.aweme.profile.model.ViewerEntranceInfo;
import com.ss.android.ugc.aweme.search.caption.LinkMatch;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import com.ss.android.ugc.aweme.utils.ReplaceLineEndAdapter;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class GsonOptTypeAdapterFactory extends BaseAdapterFactory {
    public GsonOptTypeAdapterFactory(C65427Pm3 c65427Pm3) {
        super(c65427Pm3);
    }

    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapterFactory
    public final BaseAdapter LIZ(String str) {
        switch (str.hashCode()) {
            case -821953100:
                if (!str.equals("com/ss/android/ugc/aweme/feed/model/AwemeRawAd")) {
                    return null;
                }
                final C65427Pm3 c65427Pm3 = this.LJLIL;
                return new BaseAdapter(c65427Pm3) { // from class: com.ss.android.ugc.aweme.gsonopt.OptJsonAdapterFor$com$ss$android$ugc$aweme$feed$model$AwemeRawAd
                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final Object LIZIZ() {
                        return new AwemeRawAd();
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final boolean LIZJ(String str2, Object obj, C65385PlN c65385PlN) {
                        switch (str2.hashCode()) {
                            case -2103164702:
                                if (str2.equals("landing_page_survey")) {
                                    ((AwemeRawAd) obj).landingPageSurvey = (LandingPageSurveyModel) this.LIZ.LIZIZ(LandingPageSurveyModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -2099514477:
                                if (str2.equals("follower_label")) {
                                    ((AwemeRawAd) obj).followerLabel = (AwemeTextLabelModel) this.LIZ.LIZIZ(AwemeTextLabelModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -2074874455:
                                if (str2.equals("mask_form_style")) {
                                    Object read = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read != null) {
                                        ((AwemeRawAd) obj).maskFormStyle = ((Integer) read).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -2069707304:
                                if (str2.equals("js_actlog_url")) {
                                    ((AwemeRawAd) obj).jsActLogUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -2062088447:
                                if (str2.equals("hide_if_exists")) {
                                    Object read2 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read2 != null) {
                                        ((AwemeRawAd) obj).hideIfExists = ((Integer) read2).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -2057863131:
                                if (str2.equals("enable_title_click")) {
                                    Object read3 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read3 != null) {
                                        ((AwemeRawAd) obj).enableDescClick = ((Integer) read3).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -2054860933:
                                if (str2.equals("disable_auto_track_click")) {
                                    Object read4 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read4 != null) {
                                        ((AwemeRawAd) obj).disableAutoTrackClick = ((Boolean) read4).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -2031493780:
                                if (str2.equals("sticker_data")) {
                                    ((AwemeRawAd) obj).stickerData = (AdStickerData) this.LIZ.LIZIZ(AdStickerData.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -2012801195:
                                if (str2.equals("log_extra")) {
                                    ((CommonAdData) obj).logExtra = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1974180962:
                                if (str2.equals("author_supports_auto_message")) {
                                    Object read5 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read5 != null) {
                                        ((AwemeRawAd) obj).authorSupportsAutoMessage = ((Boolean) read5).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1972730302:
                                if (str2.equals("show_mask_recycle")) {
                                    Object read6 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read6 != null) {
                                        ((AwemeRawAd) obj).showMaskRecycle = ((Boolean) read6).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1918247809:
                                if (str2.equals("lynx_entry_data")) {
                                    ((AwemeRawAd) obj).lynxEntryData = (AdLynxEntryData) this.LIZ.LIZIZ(AdLynxEntryData.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1917731104:
                                if (str2.equals("disable_authorpage_button")) {
                                    Object read7 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read7 != null) {
                                        ((AwemeRawAd) obj).disableUserprofileAdLabel = ((Boolean) read7).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1903312068:
                                if (str2.equals("show_type")) {
                                    Object read8 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read8 != null) {
                                        ((AwemeRawAd) obj).showType = ((Integer) read8).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1893627187:
                                if (str2.equals("recommend_extra")) {
                                    ((AwemeRawAd) obj).recommendExtra = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1880221419:
                                if (str2.equals("recommend_title")) {
                                    ((AwemeRawAd) obj).recommendTitle = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1872736490:
                                if (str2.equals("button_icon_url")) {
                                    ((AwemeRawAd) obj).buttonIcon = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1864766803:
                                if (str2.equals("call_to_action_bar")) {
                                    ((AwemeRawAd) obj).callToActionBarInfo = (CallToActionBarInfo) this.LIZ.LIZIZ(CallToActionBarInfo.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1861601297:
                                if (str2.equals("preload_extra_web")) {
                                    Object read9 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read9 != null) {
                                        ((AwemeRawAd) obj).preloadExtraWeb = ((Integer) read9).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1858055097:
                                if (str2.equals("outflow_button_style")) {
                                    Object read10 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read10 != null) {
                                        ((AwemeRawAd) obj).outFlowButtonStyle = ((Integer) read10).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1847781961:
                                if (str2.equals("frontend_data")) {
                                    ((AwemeRawAd) obj).frontendData = this.LIZ.LIZIZ(Object.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1809924752:
                                if (str2.equals("homepage_bottom_textual")) {
                                    ((AwemeRawAd) obj).homepageBottomTextual = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1782722217:
                                if (str2.equals("landingpage_network_optimization")) {
                                    ((AwemeRawAd) obj).landingPageNetworkOptimization = (LandingPageNetworkOptimization) this.LIZ.LIZIZ(LandingPageNetworkOptimization.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1776744766:
                                if (str2.equals("ad_source_type")) {
                                    Object read11 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read11 != null) {
                                        ((AwemeRawAd) obj).adSourceType = ((Integer) read11).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1759410662:
                                if (str2.equals("button_text")) {
                                    ((AwemeRawAd) obj).buttonText = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1759391705:
                                if (str2.equals("button_type")) {
                                    Object read12 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read12 != null) {
                                        ((AwemeRawAd) obj).buttonType = ((Integer) read12).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1724546052:
                                if (str2.equals("description")) {
                                    ((AwemeRawAd) obj).description = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1671956515:
                                if (str2.equals("high_light_color")) {
                                    ((AwemeRawAd) obj).highLightColor = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1624775473:
                                if (str2.equals("link_data")) {
                                    ((AwemeRawAd) obj).douPlusLinkData = (DouPlusLinkData) this.LIZ.LIZIZ(DouPlusLinkData.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1570137046:
                                if (str2.equals("enable_web_google_login")) {
                                    Object read13 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read13 != null) {
                                        ((AwemeRawAd) obj).enableWebGoogleLogin = ((Boolean) read13).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1560930660:
                                if (str2.equals("live_icon_url")) {
                                    ((AwemeRawAd) obj).bottomIcon = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1558028449:
                                if (str2.equals("expire_seconds")) {
                                    ((AwemeRawAd) obj).expireSeconds = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1550230566:
                                if (str2.equals("indicator_data")) {
                                    ((AwemeRawAd) obj).indicatorData = (IndicatorData) this.LIZ.LIZIZ(IndicatorData.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1501013829:
                                if (str2.equals("author_url")) {
                                    ((AwemeRawAd) obj).authorUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1497174197:
                                if (str2.equals("disable_show_ad_link")) {
                                    Object read14 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read14 != null) {
                                        ((AwemeRawAd) obj).disableAdLink = ((Boolean) read14).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1447117035:
                                if (str2.equals("animation_type")) {
                                    Object read15 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read15 != null) {
                                        ((AwemeRawAd) obj).animationType = ((Integer) read15).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1443012350:
                                if (str2.equals("image_list")) {
                                    ((AwemeRawAd) obj).imageList = (List) this.LIZ.LIZ(new OG1()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1432771452:
                                if (str2.equals("slide_action")) {
                                    Object read16 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read16 != null) {
                                        ((AwemeRawAd) obj).slideAction = ((Integer) read16).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1407777281:
                                if (str2.equals("quick_app_url")) {
                                    ((AwemeRawAd) obj).quickAppUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1323815114:
                                if (str2.equals("preload_h5_type")) {
                                    Object read17 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read17 != null) {
                                        ((AwemeRawAd) obj).preloadH5Type = ((Integer) read17).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1321694675:
                                if (str2.equals("gecko_channel")) {
                                    ((AwemeRawAd) obj).geckoChannel = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1319381325:
                                if (str2.equals("native_author")) {
                                    ((AwemeRawAd) obj).nativeAuthor = (NativeAuthorInfo) this.LIZ.LIZIZ(NativeAuthorInfo.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1317337725:
                                if (str2.equals("live_ad_type")) {
                                    Object read18 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read18 != null) {
                                        ((AwemeRawAd) obj).liveAdType = ((Integer) read18).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1308001150:
                                if (str2.equals("vsa_for_tt_mall")) {
                                    ((AwemeRawAd) obj).ecUgVSAData = (EcUgVSAData) this.LIZ.LIZIZ(EcUgVSAData.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1260122280:
                                if (str2.equals("show_outflow_mask_times")) {
                                    Object read19 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read19 != null) {
                                        ((AwemeRawAd) obj).showOutflowMaskTimes = ((Integer) read19).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1246945077:
                                if (str2.equals("searchAdExtraParams")) {
                                    ((AwemeRawAd) obj).searchAdExtraParams = (Map) this.LIZ.LIZ(new OG2()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1239538021:
                                if (str2.equals("interesting_play")) {
                                    ((AwemeRawAd) obj).interestingPlay = (AwemePlayFunModel) this.LIZ.LIZIZ(AwemePlayFunModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1198725003:
                                if (str2.equals("video_transpose")) {
                                    ((AwemeRawAd) obj).videoTranspose = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1194969119:
                                if (str2.equals("tips_type")) {
                                    Object read20 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read20 != null) {
                                        ((AwemeRawAd) obj).tipsType = ((Integer) read20).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1191516438:
                                if (str2.equals("enable_icon_under_avatar")) {
                                    Object read21 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read21 != null) {
                                        ((AwemeRawAd) obj).enableIconUnderAvatar = ((Boolean) read21).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1184860398:
                                if (str2.equals("native_site_config")) {
                                    ((AwemeRawAd) obj).nativeSiteConfig = (NativeSiteConfig) this.LIZ.LIZIZ(NativeSiteConfig.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1179771604:
                                if (str2.equals("is_dsp")) {
                                    Object read22 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read22 != null) {
                                        ((AwemeRawAd) obj).isDsp = ((Boolean) read22).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1177039765:
                                if (str2.equals("feature_label")) {
                                    ((AwemeRawAd) obj).featureLabel = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1159287398:
                                if (str2.equals("hide_web_button")) {
                                    Object read23 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read23 != null) {
                                        ((AwemeRawAd) obj).hideWebButton = ((Boolean) read23).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1152230954:
                                if (str2.equals("ad_type")) {
                                    Object read24 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read24 != null) {
                                        ((AwemeRawAd) obj).adType = ((Integer) read24).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1143190802:
                                if (str2.equals("report_enable")) {
                                    Object read25 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read25 != null) {
                                        ((AwemeRawAd) obj).reportEnable = ((Boolean) read25).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1120199303:
                                if (str2.equals("click_track_url_list")) {
                                    ((AwemeRawAd) obj).clickTrackUrlList = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1118870992:
                                if (str2.equals("comment_extra")) {
                                    ((AwemeRawAd) obj).commentExtra = (String) LIZ(new JsonToStringAdapter(), String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1110807133:
                                if (str2.equals("card_interaction_seconds")) {
                                    Object read26 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read26 != null) {
                                        ((AwemeRawAd) obj).cardInteractionSeconds = ((Integer) read26).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1075733120:
                                if (str2.equals("get_ad_time")) {
                                    Object read27 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read27 != null) {
                                        ((AwemeRawAd) obj).getAdTime = ((Integer) read27).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1071511466:
                                if (str2.equals("profile_with_webview")) {
                                    Object read28 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read28 != null) {
                                        ((AwemeRawAd) obj).profileWithWebview = ((Integer) read28).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1068009261:
                                if (str2.equals("mp_url")) {
                                    ((AwemeRawAd) obj).microAppUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1049611313:
                                if (str2.equals("brand_safety_type")) {
                                    Object read29 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read29 != null) {
                                        ((AwemeRawAd) obj).brandSafetyType = ((Integer) read29).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1028676594:
                                if (str2.equals("phone_key")) {
                                    ((AwemeRawAd) obj).phoneKey = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1025754250:
                                if (str2.equals("show_lynx_card")) {
                                    Object read30 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read30 != null) {
                                        ((AwemeRawAd) obj).showLynxCard = ((Integer) read30).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -1010673047:
                                if (str2.equals("schema_name")) {
                                    ((AwemeRawAd) obj).schemaName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -996420819:
                                if (str2.equals("use_default_color")) {
                                    Object read31 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read31 != null) {
                                        ((AwemeRawAd) obj).useDefaultColor = ((Boolean) read31).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -975637462:
                                if (str2.equals("template_url")) {
                                    ((AwemeRawAd) obj).lynxButtonUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -966111352:
                                if (str2.equals("dislike_info")) {
                                    ((AwemeRawAd) obj).dislikeInfo = (AdDislikeInfo) this.LIZ.LIZIZ(AdDislikeInfo.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -958619280:
                                if (str2.equals("e_ad_info")) {
                                    ((AwemeRawAd) obj).eAdInfo = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -906336856:
                                if (str2.equals("search")) {
                                    ((AwemeRawAd) obj).searchAdInfo = (AwemeSearchAdModel) this.LIZ.LIZIZ(AwemeSearchAdModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -896505829:
                                if (str2.equals("source")) {
                                    ((AwemeRawAd) obj).source = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -877823861:
                                if (str2.equals("image_url")) {
                                    ((AwemeRawAd) obj).imageUrl = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -873719140:
                                if (str2.equals("consult_url")) {
                                    ((AwemeRawAd) obj).consultUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -863325816:
                                if (str2.equals("disable_download_dialog")) {
                                    Object read32 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read32 != null) {
                                        ((AwemeRawAd) obj).disableDownloadDialog = ((Integer) read32).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -833897558:
                                if (str2.equals("left_slide_click_time")) {
                                    Object read33 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read33 != null) {
                                        ((AwemeRawAd) obj).leftSlideClickDuration = ((Integer) read33).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -833882089:
                                if (str2.equals("left_slide_click_type")) {
                                    Object read34 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read34 != null) {
                                        ((AwemeRawAd) obj).leftSlideClickType = ((Integer) read34).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -807062458:
                                if (str2.equals("package")) {
                                    ((AwemeRawAd) obj).packageName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -803548981:
                                if (str2.equals("page_id")) {
                                    ((AwemeRawAd) obj).pageId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -797343315:
                                if (str2.equals("web_title")) {
                                    ((AwemeRawAd) obj).webTitle = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -772881159:
                                if (str2.equals("playover_track_url_list")) {
                                    ((AwemeRawAd) obj).playOverTrackUrlList = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -769077394:
                                if (str2.equals("lynx_button_position")) {
                                    Object read35 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read35 != null) {
                                        ((AwemeRawAd) obj).lynxButtonPosition = ((Integer) read35).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -718442171:
                                if (str2.equals("web_type")) {
                                    Object read36 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read36 != null) {
                                        ((AwemeRawAd) obj).webType = ((Integer) read36).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -675011448:
                                if (str2.equals("icon_image_list")) {
                                    ((AwemeRawAd) obj).iconImageList = (List) this.LIZ.LIZ(new OG1()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -654746366:
                                if (str2.equals("form_height")) {
                                    Object read37 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read37 != null) {
                                        ((AwemeRawAd) obj).formHeight = ((Integer) read37).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -641123298:
                                if (str2.equals("preload_web")) {
                                    Object read38 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read38 != null) {
                                        ((AwemeRawAd) obj).preloadWeb = ((Integer) read38).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -621813301:
                                if (str2.equals("report_ad_type")) {
                                    Object read39 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read39 != null) {
                                        ((AwemeRawAd) obj).reportAdType = ((Integer) read39).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -612351174:
                                if (str2.equals("phone_number")) {
                                    ((AwemeRawAd) obj).phoneNumber = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -560826095:
                                if (str2.equals("piv_opt")) {
                                    Object read40 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read40 != null) {
                                        ((AwemeRawAd) obj).pivOpt = ((Integer) read40).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -532076619:
                                if (str2.equals("effective_play_track_url_list")) {
                                    ((AwemeRawAd) obj).effectivePlayTrackUrlList = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -529345849:
                                if (str2.equals("adWebUrlDataFromJsb")) {
                                    ((AwemeRawAd) obj).adWebUrlDataFromJsb = (AdWebUrlDataFromJsb) this.LIZ.LIZIZ(AdWebUrlDataFromJsb.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -518782315:
                                if (str2.equals("ace_layer")) {
                                    ((AwemeRawAd) obj).commerceAceSurveyInfo = (CommerceAceSurveyInfo) this.LIZ.LIZIZ(CommerceAceSurveyInfo.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -512277040:
                                if (str2.equals("ace_scene")) {
                                    Object read41 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read41 != null) {
                                        ((AwemeRawAd) obj).aceSceneType = ((Integer) read41).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -506403270:
                                if (str2.equals("top_icon_list")) {
                                    ((AwemeRawAd) obj).adTopIcon = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -504306182:
                                if (str2.equals("open_url")) {
                                    ((AwemeRawAd) obj).openUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -497960823:
                                if (str2.equals("lynx_raw_data")) {
                                    ((AwemeRawAd) obj).lynxRawData = (String) LIZ(new JsonToStringAdapter(), String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -494945913:
                                if (str2.equals("webview_progress_bar")) {
                                    Object read42 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read42 != null) {
                                        ((AwemeRawAd) obj).webviewProgressBar = ((Integer) read42).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -492938677:
                                if (str2.equals("disable_like_type")) {
                                    Object read43 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read43 != null) {
                                        ((AwemeRawAd) obj).disableLikeType = ((Boolean) read43).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -394586550:
                                if (str2.equals("pop_ups")) {
                                    Object read44 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read44 != null) {
                                        ((AwemeRawAd) obj).popUps = ((Boolean) read44).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -384465047:
                                if (str2.equals("insert_ad")) {
                                    Object read45 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read45 != null) {
                                        ((AwemeRawAd) obj).insertAd = ((Boolean) read45).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -377882789:
                                if (str2.equals("anchor_click_type")) {
                                    Object read46 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read46 != null) {
                                        ((AwemeRawAd) obj).anchorClickType = ((Integer) read46).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -358273109:
                                if (str2.equals("creative_id")) {
                                    ((CommonAdData) obj).creativeId = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -327906840:
                                if (str2.equals("native_site_custom_data")) {
                                    ((AwemeRawAd) obj).nativeSiteCustomData = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -267490702:
                                if (str2.equals("show_label_seconds")) {
                                    Object read47 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read47 != null) {
                                        ((AwemeRawAd) obj).showLabelSeconds = ((Integer) read47).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -243246117:
                                if (str2.equals("light_web_url")) {
                                    ((AwemeRawAd) obj).lightWebUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -237877965:
                                if (str2.equals("white_high_light_color")) {
                                    ((AwemeRawAd) obj).whiteHighLightColor = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -211907819:
                                if (str2.equals("show_ad_after_interaction")) {
                                    Object read48 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read48 != null) {
                                        ((AwemeRawAd) obj).showAdAfterInteraction = ((Boolean) read48).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -203868702:
                                if (str2.equals("track_url_list")) {
                                    ((AwemeRawAd) obj).trackUrlList = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -180456683:
                                if (str2.equals("disable_ad_show_filter")) {
                                    Object read49 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read49 != null) {
                                        ((AwemeRawAd) obj).disableAdShowFilter = ((Boolean) read49).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -179653254:
                                if (str2.equals("native_site_ad_info")) {
                                    ((AwemeRawAd) obj).nativeSiteAdInfo = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -152614564:
                                if (str2.equals("app_category")) {
                                    ((AwemeRawAd) obj).appCategory = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -127926097:
                                if (str2.equals("advertiser_id")) {
                                    ((AwemeRawAd) obj).advId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -56975674:
                                if (str2.equals("show_label_rows")) {
                                    Object read50 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read50 != null) {
                                        ((AwemeRawAd) obj).showLabelRows = ((Integer) read50).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -13485387:
                                if (str2.equals("show_mask_times")) {
                                    Object read51 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read51 != null) {
                                        ((AwemeRawAd) obj).showMaskTimes = ((Integer) read51).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case -5813865:
                                if (str2.equals("playback_seconds_track_url")) {
                                    ((AwemeRawAd) obj).playbackSecondsTrackList = (List) this.LIZ.LIZ(new OG4()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -1290419:
                                if (str2.equals("ecommerce_info")) {
                                    ((AwemeRawAd) obj).ecommerceInfo = (EcommerceInfo) this.LIZ.LIZIZ(EcommerceInfo.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case -428200:
                                if (str2.equals("show_button_color_seconds")) {
                                    Object read52 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read52 != null) {
                                        ((AwemeRawAd) obj).showButtonColorSeconds = ((Integer) read52).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 3322092:
                                if (str2.equals("live")) {
                                    ((AwemeRawAd) obj).adLive = (AdLive) this.LIZ.LIZIZ(AdLive.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 3575610:
                                if (str2.equals("type")) {
                                    ((AwemeRawAd) obj).type = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 3612236:
                                if (str2.equals("vast")) {
                                    ((AwemeRawAd) obj).omVast = (OmVast) this.LIZ.LIZIZ(OmVast.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 31670010:
                                if (str2.equals("download_mode")) {
                                    Object read53 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read53 != null) {
                                        ((AwemeRawAd) obj).mDownloadMode = ((Integer) read53).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 56157693:
                                if (str2.equals("shop_ad_data")) {
                                    ((AwemeRawAd) obj).shopAdData = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 92613716:
                                if (str2.equals("ad4ad")) {
                                    ((AwemeRawAd) obj).ad4adModel = (Ad4adModel) this.LIZ.LIZIZ(Ad4adModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 92655287:
                                if (str2.equals("ad_id")) {
                                    ((AwemeRawAd) obj).adId = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 102727412:
                                if (str2.equals("label")) {
                                    ((AwemeRawAd) obj).label = (AwemeTextLabelModel) this.LIZ.LIZIZ(AwemeTextLabelModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 102752352:
                                if (str2.equals("effective_play_time")) {
                                    ((AwemeRawAd) obj).effectivePlayTime = (Float) this.LIZ.LIZIZ(Float.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 104263205:
                                if (str2.equals("music")) {
                                    ((AwemeRawAd) obj).music = (Music) this.LIZ.LIZIZ(Music.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 106934601:
                                if (str2.equals("price")) {
                                    ((AwemeRawAd) obj).price = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 107582719:
                                if (str2.equals("is_ad4ad")) {
                                    Object read54 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read54 != null) {
                                        ((AwemeRawAd) obj).isAd4ad = ((Boolean) read54).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 109399814:
                                if (str2.equals("shake")) {
                                    ((AwemeRawAd) obj).shakeModel = (ShakeModel) this.LIZ.LIZIZ(ShakeModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 110371416:
                                if (str2.equals("title")) {
                                    ((AwemeRawAd) obj).title = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 112202875:
                                if (str2.equals("video")) {
                                    ((AwemeRawAd) obj).videoList = (List) this.LIZ.LIZ(new C47401Iiz()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 118436590:
                                if (str2.equals("top_title")) {
                                    ((AwemeRawAd) obj).topTitle = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 130770517:
                                if (str2.equals("native_card_info")) {
                                    ((AwemeRawAd) obj).nativeCardInfo = (NativeCardInfo) this.LIZ.LIZIZ(NativeCardInfo.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 131109089:
                                if (str2.equals("native_card_type")) {
                                    Object read55 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read55 != null) {
                                        ((AwemeRawAd) obj).nativeCardType = ((Integer) read55).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 132570329:
                                if (str2.equals("preload_web_second_page")) {
                                    Object read56 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read56 != null) {
                                        ((AwemeRawAd) obj).preloadWebSecondPage = ((Integer) read56).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 139836073:
                                if (str2.equals("skip_ad_time")) {
                                    Object read57 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read57 != null) {
                                        ((AwemeRawAd) obj).skipAdTime = ((Integer) read57).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 143194169:
                                if (str2.equals("browser_config")) {
                                    ((AwemeRawAd) obj).browserConfig = (BrowserConfig) this.LIZ.LIZIZ(BrowserConfig.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 176968109:
                                if (str2.equals("enable_video_resume")) {
                                    Object read58 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read58 != null) {
                                        ((AwemeRawAd) obj).enableVideoResume = ((Boolean) read58).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 235098461:
                                if (str2.equals("aggregation_sdk")) {
                                    ((AwemeRawAd) obj).aggregationSdk = (AggregationSdk) this.LIZ.LIZIZ(AggregationSdk.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 251024856:
                                if (str2.equals("learn_more_bg_color")) {
                                    ((AwemeRawAd) obj).learnMoreBgColor = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 269941387:
                                if (str2.equals("form_width")) {
                                    Object read59 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read59 != null) {
                                        ((AwemeRawAd) obj).formWidth = ((Integer) read59).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 296530048:
                                if (str2.equals("support_multiple")) {
                                    Object read60 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read60 != null) {
                                        ((AwemeRawAd) obj).mSupportMultiple = ((Integer) read60).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 299258182:
                                if (str2.equals("comment_area_switch")) {
                                    Object read61 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read61 != null) {
                                        ((AwemeRawAd) obj).commentAreaSwitch = ((Boolean) read61).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 341080690:
                                if (str2.equals("context_track_url_list")) {
                                    ((AwemeRawAd) obj).contextTrack = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 344168536:
                                if (str2.equals("promotion_label")) {
                                    ((AwemeRawAd) obj).promotionLabel = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 350685686:
                                if (str2.equals("instance_phone_id")) {
                                    Object read62 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                    if (read62 != null) {
                                        ((AwemeRawAd) obj).instancePhoneId = ((Long) read62).longValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 353154888:
                                if (str2.equals("style_template")) {
                                    ((AwemeRawAd) obj).anoleModel = (AnoleModel) this.LIZ.LIZIZ(AnoleModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 359939986:
                                if (str2.equals("non_native_click")) {
                                    Object read63 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read63 != null) {
                                        ((AwemeRawAd) obj).nonNativeClick = ((Integer) read63).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 396960671:
                                if (str2.equals("avatar_icon")) {
                                    ((AwemeRawAd) obj).avatarIcon = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 432371099:
                                if (str2.equals("disclaimer")) {
                                    ((AwemeRawAd) obj).disclaimer = (AdDisclaimer) this.LIZ.LIZIZ(AdDisclaimer.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 474021748:
                                if (str2.equals("form_url")) {
                                    ((AwemeRawAd) obj).formUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 480171519:
                                if (str2.equals("preload_web_new")) {
                                    Object read64 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read64 != null) {
                                        ((AwemeRawAd) obj).preloadWebNew = ((Integer) read64).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 506361563:
                                if (str2.equals("group_id")) {
                                    ((CommonAdData) obj).groupId = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 519306949:
                                if (str2.equals("ad_more_textual")) {
                                    ((AwemeRawAd) obj).adMoreTextual = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 536448444:
                                if (str2.equals("roll_type")) {
                                    Object read65 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read65 != null) {
                                        ((AwemeRawAd) obj).rollType = ((Integer) read65).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 542936960:
                                if (str2.equals("follow_button")) {
                                    ((AwemeRawAd) obj).followButton = (FollowButtonData) this.LIZ.LIZIZ(FollowButtonData.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 581615888:
                                if (str2.equals("webview_pannel_style")) {
                                    Object read66 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read66 != null) {
                                        ((AwemeRawAd) obj).webviewPannelStyle = ((Integer) read66).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 620842421:
                                if (str2.equals("fake_author")) {
                                    ((AwemeRawAd) obj).fakeAuthor = (FakeAuthor) this.LIZ.LIZIZ(FakeAuthor.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 622123547:
                                if (str2.equals("about_this_ad_info")) {
                                    ((AwemeRawAd) obj).aboutThisAdInfo = (AboutAdInfo) this.LIZ.LIZIZ(AboutAdInfo.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 628615443:
                                if (str2.equals("show_special_avatar_style")) {
                                    Object read67 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read67 != null) {
                                        ((AwemeRawAd) obj).adAvatarLinkTagStyle = ((Integer) read67).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 643783558:
                                if (str2.equals("splash_info")) {
                                    ((AwemeRawAd) obj).splashInfo = (AwemeSplashInfo) this.LIZ.LIZIZ(AwemeSplashInfo.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 648639111:
                                if (str2.equals("ad_questionnaire")) {
                                    ((AwemeRawAd) obj).adQuestionnaire = (AdQuestionnaire) this.LIZ.LIZIZ(AdQuestionnaire.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 661737697:
                                if (str2.equals("is_ack_action")) {
                                    Object read68 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read68 != null) {
                                        ((AwemeRawAd) obj).isAckAction = ((Integer) read68).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 681341066:
                                if (str2.equals("liveAdCardModel")) {
                                    ((AwemeRawAd) obj).liveAdCardModel = (LiveAdCardModel) this.LIZ.LIZIZ(LiveAdCardModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 704091517:
                                if (str2.equals("app_install")) {
                                    ((AwemeRawAd) obj).appInstall = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 709237653:
                                if (str2.equals("is_open_url_support_pull_up")) {
                                    Object read69 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read69 != null) {
                                        ((AwemeRawAd) obj).isOpenUrlSupportPullUp = ((Boolean) read69).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 729819414:
                                if (str2.equals("notification_config")) {
                                    Object read70 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read70 != null) {
                                        ((AwemeRawAd) obj).notificationConfig = ((Integer) read70).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 734056946:
                                if (str2.equals("enable_left_slide_guide")) {
                                    Object read71 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read71 != null) {
                                        ((AwemeRawAd) obj).enableLeftSlideGuide = ((Boolean) read71).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 739272394:
                                if (str2.equals("ad_tag_position")) {
                                    Object read72 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read72 != null) {
                                        ((AwemeRawAd) obj).adTagPosition = ((Integer) read72).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 747804969:
                                if (str2.equals("position")) {
                                    Object read73 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read73 != null) {
                                        ((AwemeRawAd) obj).position = ((Integer) read73).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 748407841:
                                if (str2.equals("web_apply_camera")) {
                                    Object read74 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read74 != null) {
                                        ((AwemeRawAd) obj).webApplyCamera = ((Boolean) read74).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 759981115:
                                if (str2.equals("disable_follow_to_click")) {
                                    Object read75 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read75 != null) {
                                        ((AwemeRawAd) obj).disableFollowToClick = ((Integer) read75).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 767596767:
                                if (str2.equals("recommendation_tags")) {
                                    ((AwemeRawAd) obj).adTags = (List) this.LIZ.LIZ(new OG3()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 795065965:
                                if (str2.equals("comment_area")) {
                                    ((AwemeRawAd) obj).commentArea = (CommentStruct) this.LIZ.LIZIZ(CommentStruct.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 827301880:
                                if (str2.equals("slide_back_info")) {
                                    ((AwemeRawAd) obj).slideBackInfoModel = (AdSlideBackInfoModel) this.LIZ.LIZIZ(AdSlideBackInfoModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 848456827:
                                if (str2.equals("dynamic_video")) {
                                    ((AwemeRawAd) obj).dynamicVideo = (DynamicVideo) this.LIZ.LIZIZ(DynamicVideo.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 855918191:
                                if (str2.equals("high_light_position")) {
                                    ((AwemeRawAd) obj).highLightPosition = (List) this.LIZ.LIZ(new OG6()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 859049689:
                                if (str2.equals("pageFrom")) {
                                    ((AwemeRawAd) obj).pageFrom = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 906452786:
                                if (str2.equals("click_id")) {
                                    ((AwemeRawAd) obj).clickId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 933554400:
                                if (str2.equals("photo_carousel_info")) {
                                    ((AwemeRawAd) obj).photoCarouselInfo = (PhotoCarouselInfoStruct) this.LIZ.LIZIZ(PhotoCarouselInfoStruct.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 983663510:
                                if (str2.equals("card_infos")) {
                                    ((AwemeRawAd) obj).cardInfos = (Map) this.LIZ.LIZ(new OG0()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1008942158:
                                if (str2.equals("live_room")) {
                                    Object read76 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read76 != null) {
                                        ((AwemeRawAd) obj).liveRoom = ((Integer) read76).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1014561790:
                                if (str2.equals("product_tile")) {
                                    ((AwemeRawAd) obj).productTile = (AdProductTile) this.LIZ.LIZIZ(AdProductTile.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1020969014:
                                if (str2.equals("landing_page_info")) {
                                    ((AwemeRawAd) obj).landingPageInfo = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1021818341:
                                if (str2.equals("charge_type")) {
                                    Object read77 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read77 != null) {
                                        ((CommonAdData) obj).chargeType = ((Integer) read77).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1030826049:
                                if (str2.equals("red_mp_url")) {
                                    ((AwemeRawAd) obj).redMpUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1083047105:
                                if (str2.equals("red_url")) {
                                    ((AwemeRawAd) obj).redUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1099478179:
                                if (str2.equals("is_promote_page")) {
                                    Object read78 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read78 != null) {
                                        ((AwemeRawAd) obj).isPromotePage = ((Boolean) read78).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1109408056:
                                if (str2.equals("download_url")) {
                                    ((AwemeRawAd) obj).downloadUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1120410705:
                                if (str2.equals("allow_dsp_autojump")) {
                                    Object read79 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read79 != null) {
                                        ((AwemeRawAd) obj).allowDspAutoJump = ((Boolean) read79).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1124927314:
                                if (str2.equals("web_channel_name")) {
                                    ((AwemeRawAd) obj).channelName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1167350536:
                                if (str2.equals("app_data")) {
                                    ((AwemeRawAd) obj).appData = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1167596277:
                                if (str2.equals("app_like")) {
                                    ((AwemeRawAd) obj).appLike = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1167648233:
                                if (str2.equals("app_name")) {
                                    ((AwemeRawAd) obj).appName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1178267677:
                                if (str2.equals("descriptive_cta")) {
                                    ((AwemeRawAd) obj).adDescriptiveCTA = (AdDescriptiveCTAStruct) this.LIZ.LIZIZ(AdDescriptiveCTAStruct.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1178938991:
                                if (str2.equals("link_label")) {
                                    ((AwemeRawAd) obj).linkLabel = (AwemeLinkLabel) this.LIZ.LIZIZ(AwemeLinkLabel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1182062285:
                                if (str2.equals("enable_filter_same_video")) {
                                    Object read80 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read80 != null) {
                                        ((AwemeRawAd) obj).enableFilterSameVideo = ((Boolean) read80).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1182125491:
                                if (str2.equals("is_preview")) {
                                    Object read81 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read81 != null) {
                                        ((AwemeRawAd) obj).isPreview = ((Boolean) read81).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1223751172:
                                if (str2.equals("web_url")) {
                                    ((AwemeRawAd) obj).webUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1288780261:
                                if (str2.equals("get_ad_status")) {
                                    Object read82 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read82 != null) {
                                        ((AwemeRawAd) obj).getAdStatus = ((Integer) read82).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1292368484:
                                if (str2.equals("button_style")) {
                                    Object read83 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read83 != null) {
                                        ((AwemeRawAd) obj).buttonStyle = ((Integer) read83).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1337020202:
                                if (str2.equals("enter_from_merge")) {
                                    ((AwemeRawAd) obj).enterFromMerge = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1345117846:
                                if (str2.equals("card_interaction_type")) {
                                    Object read84 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read84 != null) {
                                        ((AwemeRawAd) obj).cardInteractionType = ((Integer) read84).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1345180064:
                                if (str2.equals("disable_left_slide_follow")) {
                                    Object read85 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read85 != null) {
                                        ((AwemeRawAd) obj).disableLeftSlideFollow = ((Boolean) read85).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1370341692:
                                if (str2.equals("component_type")) {
                                    Object read86 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read86 != null) {
                                        ((AwemeRawAd) obj).componentType = ((Integer) read86).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1439261618:
                                if (str2.equals("autofill")) {
                                    ((AwemeRawAd) obj).autofillModel = (AutofillModel) this.LIZ.LIZIZ(AutofillModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1567737442:
                                if (str2.equals("hint_data")) {
                                    ((AwemeRawAd) obj).adHintData = (AdHintData) this.LIZ.LIZIZ(AdHintData.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1590089143:
                                if (str2.equals("interaction_data")) {
                                    ((AwemeRawAd) obj).adInteractionData = (AdInteractionData) this.LIZ.LIZIZ(AdInteractionData.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1590162129:
                                if (str2.equals("interaction_form")) {
                                    ((AwemeRawAd) obj).adFeInteractionModel = (AdFeInteractionModel) this.LIZ.LIZIZ(AdFeInteractionModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1599445024:
                                if (str2.equals("preload_data")) {
                                    ((AwemeRawAd) obj).preloadData = (PreloadData) this.LIZ.LIZIZ(PreloadData.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1615288471:
                                if (str2.equals("display_type")) {
                                    ((AwemeRawAd) obj).displayType = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1655360077:
                                if (str2.equals("play_track_url_list")) {
                                    ((AwemeRawAd) obj).playTrackUrlList = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1661155034:
                                if (str2.equals("auto_open")) {
                                    Object read87 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read87 != null) {
                                        ((AwemeRawAd) obj).mLinkMode = ((Integer) read87).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1671642405:
                                if (str2.equals("dislike")) {
                                    ((AwemeRawAd) obj).adDislikeModel = (AdDislikeModel) this.LIZ.LIZIZ(AdDislikeModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1678347602:
                                if (str2.equals("interaction_seconds")) {
                                    Object read88 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read88 != null) {
                                        ((AwemeRawAd) obj).interactionSeconds = ((Integer) read88).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1728745659:
                                if (str2.equals("enable_web_report")) {
                                    Object read89 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read89 != null) {
                                        ((AwemeRawAd) obj).enableWebReport = ((Boolean) read89).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1759560240:
                                if (str2.equals("similar_animation")) {
                                    Object read90 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read90 != null) {
                                        ((AwemeRawAd) obj).similarAnimation = ((Integer) read90).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1789376087:
                                str2.equals("cardOnceClick");
                                return false;
                            case 1801355674:
                                if (str2.equals("disable_show_link_label")) {
                                    Object read91 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read91 != null) {
                                        ((AwemeRawAd) obj).disableShowLinkLabel = ((Boolean) read91).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1807278732:
                                if (str2.equals("hide_music_disc")) {
                                    Object read92 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read92 != null) {
                                        ((AwemeRawAd) obj).isHideMusicDisk = ((Boolean) read92).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1817667119:
                                if (str2.equals("use_ordinary_web")) {
                                    ((AwemeRawAd) obj).useOrdinaryWeb = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1833509806:
                                if (str2.equals("promote_page")) {
                                    ((AwemeRawAd) obj).promotePageModel = (PromotePageModel) this.LIZ.LIZIZ(PromotePageModel.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1835961206:
                                if (str2.equals("button_icon_animation_repeat_times")) {
                                    Object read93 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read93 != null) {
                                        ((AwemeRawAd) obj).buttonIconAnimationRepeatTimes = ((Integer) read93).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1837987015:
                                if (str2.equals("action_extra")) {
                                    ((AwemeRawAd) obj).actionExtra = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1904096515:
                                if (str2.equals("carousel_left_guide")) {
                                    Object read94 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read94 != null) {
                                        ((AwemeRawAd) obj).photoModeSlideHint = ((Integer) read94).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 1946971043:
                                if (str2.equals("featured_label")) {
                                    ((AwemeRawAd) obj).featuredLabel = (List) this.LIZ.LIZ(new OG7()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1964126410:
                                if (str2.equals("iab_auto_jump_allow_list")) {
                                    ((AwemeRawAd) obj).iabAutoJumpAllowList = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 1973160257:
                                if (str2.equals("enable_soft_ad_anchor_click")) {
                                    ((AwemeRawAd) obj).enableSoftAdAnchorClick = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 2015993792:
                                if (str2.equals("webview_type")) {
                                    Object read95 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read95 != null) {
                                        ((AwemeRawAd) obj).webviewType = ((Integer) read95).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 2035509993:
                                if (str2.equals("play_node_track_url")) {
                                    ((AwemeRawAd) obj).adNodeTrackUrlList = (List) this.LIZ.LIZ(new OG5()).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 2036780306:
                                if (str2.equals("background_color")) {
                                    ((AwemeRawAd) obj).backgroundColor = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 2064135990:
                                if (str2.equals("system_origin")) {
                                    Object read96 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read96 != null) {
                                        ((CommonAdData) obj).systemOrigin = ((Integer) read96).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 2071678893:
                                if (str2.equals("open_system_browser")) {
                                    Object read97 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                    if (read97 != null) {
                                        ((AwemeRawAd) obj).openSystemBrowser = ((Boolean) read97).booleanValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 2077581300:
                                if (str2.equals("show_button_seconds")) {
                                    Object read98 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read98 != null) {
                                        ((AwemeRawAd) obj).showButtonSeconds = ((Integer) read98).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 2085310192:
                                if (str2.equals("origin_price")) {
                                    ((AwemeRawAd) obj).originPrice = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            case 2094644621:
                                if (str2.equals("skip_time")) {
                                    Object read99 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read99 != null) {
                                        ((AwemeRawAd) obj).skipTime = ((Integer) read99).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 2126928922:
                                if (str2.equals("extra_effective_play_action")) {
                                    Object read100 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                    if (read100 != null) {
                                        ((AwemeRawAd) obj).extraEffectivePlayAction = ((Integer) read100).intValue();
                                    }
                                    return true;
                                }
                                return false;
                            case 2136764904:
                                if (str2.equals("red_open_url")) {
                                    ((AwemeRawAd) obj).redOpenUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                    return true;
                                }
                                return false;
                            default:
                                return false;
                        }
                    }
                };
            case 881581038:
                if (!str.equals("com/ss/android/ugc/aweme/music/model/Music")) {
                    return null;
                }
                final C65427Pm3 c65427Pm32 = this.LJLIL;
                return new BaseAdapter(c65427Pm32) { // from class: com.ss.android.ugc.aweme.gsonopt.OptJsonAdapterFor$com$ss$android$ugc$aweme$music$model$Music
                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final Object LIZIZ() {
                        return new Music();
                    }

                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final boolean LIZJ(String str2, Object obj, C65385PlN c65385PlN) {
                        switch (str2.hashCode()) {
                            case -2130891340:
                                if (!str2.equals("shoot_duration")) {
                                    return false;
                                }
                                Object read = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read != null) {
                                    ((Music) obj).shootDuration = ((Integer) read).intValue();
                                }
                                return true;
                            case -2012801195:
                                if (!str2.equals("log_extra")) {
                                    return false;
                                }
                                ((Music) obj).logExtra = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -2000946467:
                                if (!str2.equals("search_highlight")) {
                                    return false;
                                }
                                ((Music) obj).mHighlightInfoList = (List) this.LIZ.LIZ(new C72070SQg()).read(c65385PlN);
                                return true;
                            case -1992055476:
                                if (!str2.equals("preview_page_show_mode")) {
                                    return false;
                                }
                                Object read2 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read2 != null) {
                                    ((Music) obj).previewPageShowMode = ((Integer) read2).intValue();
                                }
                                return true;
                            case -1992012396:
                                if (!str2.equals("duration")) {
                                    return false;
                                }
                                Object read3 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read3 != null) {
                                    ((Music) obj).duration = ((Integer) read3).intValue();
                                }
                                return true;
                            case -1988200095:
                                if (!str2.equals("preview_start_time")) {
                                    return false;
                                }
                                Object read4 = this.LIZ.LIZIZ(Float.class).read(c65385PlN);
                                if (read4 != null) {
                                    ((Music) obj).previewStartTime = ((Float) read4).floatValue();
                                }
                                return true;
                            case -1888392668:
                                if (!str2.equals("external_song_info")) {
                                    return false;
                                }
                                ((Music) obj).mExternalMusicInfos = (List) this.LIZ.LIZ(new C69877Rbd()).read(c65385PlN);
                                return true;
                            case -1823219859:
                                if (!str2.equals("offline_desc")) {
                                    return false;
                                }
                                ((Music) obj).offlineDesc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1801196649:
                                if (!str2.equals("beat_info")) {
                                    return false;
                                }
                                ((Music) obj).beatInfo = (MusicBeat) this.LIZ.LIZIZ(MusicBeat.class).read(c65385PlN);
                                return true;
                            case -1788288754:
                                if (!str2.equals("share_info")) {
                                    return false;
                                }
                                ((Music) obj).shareInfo = (ShareInfo) this.LIZ.LIZIZ(ShareInfo.class).read(c65385PlN);
                                return true;
                            case -1650681548:
                                if (!str2.equals("owner_handle")) {
                                    return false;
                                }
                                ((Music) obj).ownerHandle = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1595547064:
                                if (!str2.equals("preview_end_time")) {
                                    return false;
                                }
                                Object read5 = this.LIZ.LIZIZ(Float.class).read(c65385PlN);
                                if (read5 != null) {
                                    ((Music) obj).previewEndTime = ((Float) read5).floatValue();
                                }
                                return true;
                            case -1468959157:
                                if (!str2.equals("recommend_source_from")) {
                                    return false;
                                }
                                ((Music) obj).recommendSourceFrom = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1406328437:
                                if (!str2.equals("author")) {
                                    return false;
                                }
                                ((Music) obj).authorName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1393409926:
                                if (!str2.equals("owner_nickname")) {
                                    return false;
                                }
                                ((Music) obj).ownerNickName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1274620340:
                                if (!str2.equals("music_end_time_in_ms")) {
                                    return false;
                                }
                                Object read6 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read6 != null) {
                                    ((Music) obj).musicEndTime = ((Integer) read6).intValue();
                                }
                                return true;
                            case -1236133050:
                                if (!str2.equals("audition_duration")) {
                                    return false;
                                }
                                Object read7 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read7 != null) {
                                    ((Music) obj).auditionDuration = ((Integer) read7).intValue();
                                }
                                return true;
                            case -1197692098:
                                if (!str2.equals("music_begin_time_in_ms")) {
                                    return false;
                                }
                                Object read8 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read8 != null) {
                                    ((Music) obj).musicBeginTime = ((Integer) read8).intValue();
                                }
                                return true;
                            case -1193609971:
                                if (!str2.equals("id_str")) {
                                    return false;
                                }
                                ((Music) obj).idStr = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1179760457:
                                if (!str2.equals("is_pgc")) {
                                    return false;
                                }
                                Object read9 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read9 != null) {
                                    ((Music) obj).isPgc = ((Boolean) read9).booleanValue();
                                }
                                return true;
                            case -1141620329:
                                if (!str2.equals("recommend_tag")) {
                                    return false;
                                }
                                ((Music) obj).recommendTag = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1080468136:
                                if (!str2.equals("reuse_audio_play_url")) {
                                    return false;
                                }
                                ((Music) obj).reuseAudioPlayUrl = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -1050433906:
                                if (!str2.equals("external_song_subtitle")) {
                                    return false;
                                }
                                ((Music) obj).exclusiveSubTitle = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1038649303:
                                if (!str2.equals("mSoundsListType")) {
                                    return false;
                                }
                                Object read10 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read10 != null) {
                                    ((Music) obj).mSoundsListType = ((Integer) read10).intValue();
                                }
                                return true;
                            case -1027048148:
                                if (!str2.equals("billboard_rank")) {
                                    return false;
                                }
                                Object read11 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read11 != null) {
                                    ((Music) obj).billboardRank = ((Integer) read11).intValue();
                                }
                                return true;
                            case -992130022:
                                if (!str2.equals("ttm_music_info")) {
                                    return false;
                                }
                                ((Music) obj).ttmInfo = (TTMMusicInfo) this.LIZ.LIZIZ(TTMMusicInfo.class).read(c65385PlN);
                                return true;
                            case -966162662:
                                if (!str2.equals("lyric_type")) {
                                    return false;
                                }
                                Object read12 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read12 != null) {
                                    ((Music) obj).lrcType = ((Integer) read12).intValue();
                                }
                                return true;
                            case -930676846:
                                if (!str2.equals("commercial_right_type")) {
                                    return false;
                                }
                                Object read13 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read13 != null) {
                                    ((Music) obj).commercialRightType = ((Integer) read13).intValue();
                                }
                                return true;
                            case -892481550:
                                if (!str2.equals("status")) {
                                    return false;
                                }
                                Object read14 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read14 != null) {
                                    ((Music) obj).musicStatus = ((Integer) read14).intValue();
                                }
                                return true;
                            case -835520848:
                                if (!str2.equals("enter_position")) {
                                    return false;
                                }
                                ((Music) obj).enterPosition = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -812763377:
                                if (!str2.equals("prevent_download")) {
                                    return false;
                                }
                                Object read15 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read15 != null) {
                                    ((Music) obj).preventDownload = ((Boolean) read15).booleanValue();
                                }
                                return true;
                            case -764061149:
                                if (!str2.equals("tag_list")) {
                                    return false;
                                }
                                ((Music) obj).musicTags = (List) this.LIZ.LIZ(new C72110SRu()).read(c65385PlN);
                                return true;
                            case -732362228:
                                if (!str2.equals("artists")) {
                                    return false;
                                }
                                ((Music) obj).mMusicOwnerInfos = (List) this.LIZ.LIZ(new C69874Rba()).read(c65385PlN);
                                return true;
                            case -624659954:
                                if (!str2.equals("strong_beat_url")) {
                                    return false;
                                }
                                ((Music) obj).strongBeatUrl = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -568807568:
                                if (!str2.equals("avatar_thumb")) {
                                    return false;
                                }
                                ((Music) obj).avatarThumb = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -519230587:
                                if (!str2.equals("vid_volume_info")) {
                                    return false;
                                }
                                ((Music) obj).musicVolumeInfo = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -308260465:
                                if (!str2.equals("lyric_url")) {
                                    return false;
                                }
                                ((Music) obj).lrcUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -163878656:
                                if (!str2.equals("isFollowerTagVisible")) {
                                    return false;
                                }
                                Object read16 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read16 != null) {
                                    ((Music) obj).isFollowerTagVisible = ((Boolean) read16).booleanValue();
                                }
                                return true;
                            case -69279088:
                                if (!str2.equals("logExtraMap")) {
                                    return false;
                                }
                                ((Music) obj).logExtraMap = (HashMap) this.LIZ.LIZ(new C72073SQj()).read(c65385PlN);
                                return true;
                            case 3355:
                                if (!str2.equals("id")) {
                                    return false;
                                }
                                Object read17 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read17 != null) {
                                    ((Music) obj).id = ((Long) read17).longValue();
                                }
                                return true;
                            case 3433509:
                                if (!str2.equals("path")) {
                                    return false;
                                }
                                ((Music) obj).path = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 54538604:
                                if (!str2.equals("lyric_short_position")) {
                                    return false;
                                }
                                ((Music) obj).lyricShortPosition = (List) this.LIZ.LIZ(new OG6()).read(c65385PlN);
                                return true;
                            case 92896879:
                                if (!str2.equals("album")) {
                                    return false;
                                }
                                ((Music) obj).album = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 96965648:
                                if (!str2.equals("extra")) {
                                    return false;
                                }
                                ((Music) obj).extra = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 110371416:
                                if (!str2.equals("title")) {
                                    return false;
                                }
                                ((Music) obj).musicName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 112298140:
                                if (!str2.equals("lyric_short")) {
                                    return false;
                                }
                                ((Music) obj).lyricShort = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 174951603:
                                if (!str2.equals("cover_large")) {
                                    return false;
                                }
                                ((Music) obj).coverLarge = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 182551374:
                                if (!str2.equals("cover_thumb")) {
                                    return false;
                                }
                                ((Music) obj).coverThumb = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 403538722:
                                if (!str2.equals("is_shooting_allow")) {
                                    return false;
                                }
                                ((Music) obj).isShootingAllowed = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                return true;
                            case 404394800:
                                if (!str2.equals("highlightMusicOwnerInfo")) {
                                    return false;
                                }
                                ((Music) obj).highlightMusicOwnerInfo = (List) this.LIZ.LIZ(new C69874Rba()).read(c65385PlN);
                                return true;
                            case 495075035:
                                if (!str2.equals("dmv_auto_show")) {
                                    return false;
                                }
                                Object read18 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read18 != null) {
                                    ((Music) obj).dmvAutoShow = ((Boolean) read18).booleanValue();
                                }
                                return true;
                            case 512131271:
                                if (!str2.equals("effects_data")) {
                                    return false;
                                }
                                ((Music) obj).effectsData = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 545110383:
                                if (!str2.equals("is_audio_url_with_cookie")) {
                                    return false;
                                }
                                Object read19 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read19 != null) {
                                    ((Music) obj).needSetCookie = ((Boolean) read19).booleanValue();
                                }
                                return true;
                            case 602995943:
                                if (!str2.equals("challenge_name")) {
                                    return false;
                                }
                                ((Music) obj).challengeName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 629096896:
                                if (!str2.equals("music_release_info")) {
                                    return false;
                                }
                                ((Music) obj).musicReleaseInfo = (MusicReleaseInfo) this.LIZ.LIZIZ(MusicReleaseInfo.class).read(c65385PlN);
                                return true;
                            case 644013382:
                                if (!str2.equals("is_original")) {
                                    return false;
                                }
                                Object read20 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read20 != null) {
                                    ((Music) obj).isOriginMusic = ((Boolean) read20).booleanValue();
                                }
                                return true;
                            case 644122150:
                                if (!str2.equals("is_author_artist")) {
                                    return false;
                                }
                                Object read21 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read21 != null) {
                                    ((Music) obj).isArtistMusic = ((Boolean) read21).booleanValue();
                                }
                                return true;
                            case 693933066:
                                if (!str2.equals("requestId")) {
                                    return false;
                                }
                                ((Music) obj).requestId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 695238745:
                                if (!str2.equals("can_not_reuse")) {
                                    return false;
                                }
                                Object read22 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read22 != null) {
                                    ((Music) obj).canNotReuse = ((Boolean) read22).booleanValue();
                                }
                                return true;
                            case 706299096:
                                if (!str2.equals("video_duration")) {
                                    return false;
                                }
                                Object read23 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read23 != null) {
                                    ((Music) obj).videoDuration = ((Integer) read23).intValue();
                                }
                                return true;
                            case 747804969:
                                if (!str2.equals("position")) {
                                    return false;
                                }
                                ((Music) obj).positions = (List) this.LIZ.LIZ(new OG6()).read(c65385PlN);
                                return true;
                            case 899841238:
                                if (!str2.equals("is_original_sound")) {
                                    return false;
                                }
                                Object read24 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read24 != null) {
                                    ((Music) obj).isOriginalSound = ((Boolean) read24).booleanValue();
                                }
                                return true;
                            case 943007151:
                                if (!str2.equals("similarTag")) {
                                    return false;
                                }
                                Object read25 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read25 != null) {
                                    ((Music) obj).similarTag = ((Integer) read25).intValue();
                                }
                                return true;
                            case 1155679910:
                                if (!str2.equals("search_result_id")) {
                                    return false;
                                }
                                ((Music) obj).searchResultId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1160441085:
                                if (!str2.equals("cover_medium")) {
                                    return false;
                                }
                                ((Music) obj).coverMedium = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 1198625574:
                                if (!str2.equals("list_item_id")) {
                                    return false;
                                }
                                ((Music) obj).listItemId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1227474034:
                                if (!str2.equals("multi_bit_rate_play_info")) {
                                    return false;
                                }
                                ((Music) obj).multiBitRatePlayInfo = (List) this.LIZ.LIZ(new C47062IdW()).read(c65385PlN);
                                return true;
                            case 1257385826:
                                if (!str2.equals("search_music_desc")) {
                                    return false;
                                }
                                ((Music) obj).mSearchMusicDesc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1257679708:
                                if (!str2.equals("search_music_name")) {
                                    return false;
                                }
                                ((Music) obj).mSearchMusicName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1290244982:
                                if (!str2.equals("is_commerce_music")) {
                                    return false;
                                }
                                Object read26 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read26 != null) {
                                    ((Music) obj).isCommercialMusic = ((Boolean) read26).booleanValue();
                                }
                                return true;
                            case 1402633315:
                                if (!str2.equals("challenge")) {
                                    return false;
                                }
                                ((Music) obj).challenge = (Challenge) this.LIZ.LIZIZ(Challenge.class).read(c65385PlN);
                                return true;
                            case 1485621306:
                                if (!str2.equals("binded_challenge_id")) {
                                    return false;
                                }
                                ((Music) obj).bindChallengeId = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                return true;
                            case 1600720841:
                                if (!str2.equals("local_music_id")) {
                                    return false;
                                }
                                Object read27 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read27 != null) {
                                    ((Music) obj).localMusicId = ((Integer) read27).intValue();
                                }
                                return true;
                            case 1611353657:
                                if (!str2.equals("mute_share")) {
                                    return false;
                                }
                                Object read28 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read28 != null) {
                                    ((Music) obj).muteShare = ((Boolean) read28).booleanValue();
                                }
                                return true;
                            case 1626966089:
                                if (!str2.equals("collect_stat")) {
                                    return false;
                                }
                                Object read29 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read29 != null) {
                                    ((Music) obj).collectStatus = ((Integer) read29).intValue();
                                }
                                return true;
                            case 1629363517:
                                if (!str2.equals("pinned_video_status")) {
                                    return false;
                                }
                                Object read30 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read30 != null) {
                                    ((Music) obj).pinnedVideoStatus = ((Integer) read30).intValue();
                                }
                                return true;
                            case 1663147559:
                                if (!str2.equals("owner_id")) {
                                    return false;
                                }
                                ((Music) obj).ownerId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1673223680:
                                if (!str2.equals("isFriendTagVisible")) {
                                    return false;
                                }
                                Object read31 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read31 != null) {
                                    ((Music) obj).isFriendTagVisible = ((Boolean) read31).booleanValue();
                                }
                                return true;
                            case 1686803806:
                                if (!str2.equals("tt_to_dsp_song_infos")) {
                                    return false;
                                }
                                ((Music) obj).tt2DSPSongInfos = (List) this.LIZ.LIZ(new C69872RbY()).read(c65385PlN);
                                return true;
                            case 1726552833:
                                if (!str2.equals("matched_pgc_sound")) {
                                    return false;
                                }
                                ((Music) obj).matchedPGCSoundInfo = (MatchedPGCSoundInfo) this.LIZ.LIZIZ(MatchedPGCSoundInfo.class).read(c65385PlN);
                                return true;
                            case 1730981932:
                                if (!str2.equals("duration_high_precision")) {
                                    return false;
                                }
                                ((Music) obj).durationHighPrecision = (MusicHighPrecisionDuration) this.LIZ.LIZIZ(MusicHighPrecisionDuration.class).read(c65385PlN);
                                return true;
                            case 1778207506:
                                if (!str2.equals("search_id")) {
                                    return false;
                                }
                                ((Music) obj).searchId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1805532517:
                                if (!str2.equals("author_deleted")) {
                                    return false;
                                }
                                Object read32 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read32 != null) {
                                    ((Music) obj).isAuthorDeleted = ((Boolean) read32).booleanValue();
                                }
                                return true;
                            case 1823650005:
                                if (!str2.equals("recommend_status")) {
                                    return false;
                                }
                                Object read33 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read33 != null) {
                                    ((Music) obj).musicRecommendStatus = ((Long) read33).longValue();
                                }
                                return true;
                            case 1877315785:
                                if (!str2.equals("mExtraParamFromPretreatment")) {
                                    return false;
                                }
                                ((Music) obj).mExtraParamFromPretreatment = (C72112SRw) this.LIZ.LIZIZ(C72112SRw.class).read(c65385PlN);
                                return true;
                            case 1879098852:
                                if (!str2.equals("play_url")) {
                                    return false;
                                }
                                ((Music) obj).playUrl = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 1908676596:
                                if (!str2.equals("owner_ban_show_info")) {
                                    return false;
                                }
                                ((Music) obj).mOwnerBanShowInfo = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1919900571:
                                if (!str2.equals("user_count")) {
                                    return false;
                                }
                                Object read34 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read34 != null) {
                                    ((Music) obj).userCount = ((Integer) read34).intValue();
                                }
                                return true;
                            case 1969626978:
                                if (!str2.equals("sec_uid")) {
                                    return false;
                                }
                                ((Music) obj).secUid = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 2038839903:
                                if (!str2.equals("is_matched_metadata")) {
                                    return false;
                                }
                                Object read35 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read35 != null) {
                                    ((Music) obj).isMatchMetadata = ((Boolean) read35).booleanValue();
                                }
                                return true;
                            case 2070821712:
                                if (!str2.equals("matched_song")) {
                                    return false;
                                }
                                ((Music) obj).mMatchedSongInfo = (MatchedSoundInfo) this.LIZ.LIZIZ(MatchedSoundInfo.class).read(c65385PlN);
                                return true;
                            case 2120368514:
                                if (!str2.equals("related_musics")) {
                                    return false;
                                }
                                ((Music) obj).relatedMusics = (List) this.LIZ.LIZ(new C72109SRt()).read(c65385PlN);
                                return true;
                            default:
                                return false;
                        }
                    }
                };
            case 1053207287:
                if (!str.equals("com/ss/android/ugc/aweme/feed/model/Aweme")) {
                    return null;
                }
                final C65427Pm3 c65427Pm33 = this.LJLIL;
                return new BaseAdapter(c65427Pm33) { // from class: com.ss.android.ugc.aweme.gsonopt.OptJsonAdapterFor$com$ss$android$ugc$aweme$feed$model$Aweme
                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final Object LIZIZ() {
                        return new Aweme();
                    }

                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final boolean LIZJ(String str2, Object obj, C65385PlN c65385PlN) {
                        switch (str2.hashCode()) {
                            case -2141623636:
                                if (!str2.equals("item_duet")) {
                                    return false;
                                }
                                Object read = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read != null) {
                                    ((Aweme) obj).duetSetting = ((Integer) read).intValue();
                                }
                                return true;
                            case -2123672642:
                                if (!str2.equals("upvote_reason")) {
                                    return false;
                                }
                                ((Aweme) obj).upvoteReason = (UpvoteReason) this.LIZ.LIZIZ(UpvoteReason.class).read(c65385PlN);
                                return true;
                            case -2113214850:
                                if (!str2.equals("text_extra")) {
                                    return false;
                                }
                                ((Aweme) obj).textExtra = (List) this.LIZ.LIZ(new C69861RbN()).read(c65385PlN);
                                return true;
                            case -2107194777:
                                if (!str2.equals("subAweme")) {
                                    return false;
                                }
                                ((Aweme) obj).subAweme = (Aweme) this.LIZ.LIZIZ(Aweme.class).read(c65385PlN);
                                return true;
                            case -2027740422:
                                if (!str2.equals("is_nff_or_nr")) {
                                    return false;
                                }
                                Object read2 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read2 != null) {
                                    ((Aweme) obj).isNrNff = ((Boolean) read2).booleanValue();
                                }
                                return true;
                            case -2027700362:
                                if (!str2.equals("item_source_category")) {
                                    return false;
                                }
                                Object read3 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read3 != null) {
                                    ((Aweme) obj).mItemSourceCategory = ((Integer) read3).intValue();
                                }
                                return true;
                            case -2000946467:
                                if (!str2.equals("search_highlight")) {
                                    return false;
                                }
                                ((Aweme) obj).mHighlightInfoList = (List) this.LIZ.LIZ(new C72070SQg()).read(c65385PlN);
                                return true;
                            case -2000521471:
                                if (!str2.equals("link_ad_data")) {
                                    return false;
                                }
                                ((Aweme) obj).linkAdData = (LinkData) LIZ(new StringJsonAdapterFactory(), LinkData.class).read(c65385PlN);
                                return true;
                            case -1996818970:
                                if (!str2.equals("react_origin")) {
                                    return false;
                                }
                                ((Aweme) obj).reactOrigin = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1992316296:
                                if (!str2.equals("hotsearch_info")) {
                                    return false;
                                }
                                ((Aweme) obj).hotSearchInfoStruct = (HotSearchInfoStruct) this.LIZ.LIZIZ(HotSearchInfoStruct.class).read(c65385PlN);
                                return true;
                            case -1983883158:
                                if (!str2.equals("has_danmaku")) {
                                    return false;
                                }
                                Object read4 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read4 != null) {
                                    ((Aweme) obj).hasDanmaku = ((Boolean) read4).booleanValue();
                                }
                                return true;
                            case -1983160333:
                                if (!str2.equals("law_critical_country")) {
                                    return false;
                                }
                                Object read5 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read5 != null) {
                                    ((Aweme) obj).lawCriticalCountry = ((Boolean) read5).booleanValue();
                                }
                                return true;
                            case -1976384368:
                                if (!str2.equals("is_text_sticker_translatable")) {
                                    return false;
                                }
                                Object read6 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read6 != null) {
                                    ((Aweme) obj).isTextStickerTranslatable = ((Boolean) read6).booleanValue();
                                }
                                return true;
                            case -1974345316:
                                if (!str2.equals("share_to_story_info")) {
                                    return false;
                                }
                                ((Aweme) obj).share2StoryStruct = (ShareToStoryStruct) this.LIZ.LIZIZ(ShareToStoryStruct.class).read(c65385PlN);
                                return true;
                            case -1958067178:
                                if (!str2.equals("add_yours_recommendation")) {
                                    return false;
                                }
                                ((Aweme) obj).addYoursRecommendation = (AddYoursRecommendation) this.LIZ.LIZIZ(AddYoursRecommendation.class).read(c65385PlN);
                                return true;
                            case -1953374893:
                                if (!str2.equals("item_react")) {
                                    return false;
                                }
                                Object read7 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read7 != null) {
                                    ((Aweme) obj).reactSetting = ((Integer) read7).intValue();
                                }
                                return true;
                            case -1948287684:
                                if (!str2.equals("is_sub_only_video")) {
                                    return false;
                                }
                                Object read8 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read8 != null) {
                                    ((Aweme) obj).isSubOnlyVideo = ((Boolean) read8).booleanValue();
                                }
                                return true;
                            case -1939423417:
                                if (!str2.equals("paid_content_info")) {
                                    return false;
                                }
                                ((Aweme) obj).mPaidContentInfo = (PaidContentInfo) this.LIZ.LIZIZ(PaidContentInfo.class).read(c65385PlN);
                                return true;
                            case -1935258947:
                                if (!str2.equals("video_insight_status")) {
                                    return false;
                                }
                                Object read9 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read9 != null) {
                                    ((Aweme) obj).insightsEligibilityStatus = ((Integer) read9).intValue();
                                }
                                return true;
                            case -1909275241:
                                if (!str2.equals("hasSeeMoreBeenShown")) {
                                    return false;
                                }
                                Object read10 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read10 != null) {
                                    ((Aweme) obj).hasSeeMoreBeenShown = ((Boolean) read10).booleanValue();
                                }
                                return true;
                            case -1905567232:
                                if (!str2.equals("isAttrUpdated")) {
                                    return false;
                                }
                                Object read11 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read11 != null) {
                                    ((Aweme) obj).isAttrUpdated = ((Boolean) read11).booleanValue();
                                }
                                return true;
                            case -1893206215:
                                if (!str2.equals("story_metadata")) {
                                    return false;
                                }
                                ((Aweme) obj).story = (Story) this.LIZ.LIZIZ(Story.class).read(c65385PlN);
                                return true;
                            case -1865314860:
                                if (!str2.equals("detail_page_video_tag")) {
                                    return false;
                                }
                                Object read12 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read12 != null) {
                                    ((Aweme) obj).detailPageVideoTag = ((Integer) read12).intValue();
                                }
                                return true;
                            case -1839312125:
                                if (!str2.equals("is_client_cache")) {
                                    return false;
                                }
                                Object read13 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read13 != null) {
                                    ((Aweme) obj).isClientCache = ((Boolean) read13).booleanValue();
                                }
                                return true;
                            case -1788288754:
                                if (!str2.equals("share_info")) {
                                    return false;
                                }
                                ((Aweme) obj).shareInfo = (ShareInfo) this.LIZ.LIZIZ(ShareInfo.class).read(c65385PlN);
                                return true;
                            case -1788228419:
                                if (!str2.equals("video_feed_tag")) {
                                    return false;
                                }
                                ((Aweme) obj).videoFeedTag = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1786344031:
                                if (!str2.equals("image_infos")) {
                                    return false;
                                }
                                ((Aweme) obj).imageInfos = (List) this.LIZ.LIZ(new C69867RbT()).read(c65385PlN);
                                return true;
                            case -1777116675:
                                if (!str2.equals("geofencing_regions")) {
                                    return false;
                                }
                                ((Aweme) obj).geofencingRegions = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case -1755408457:
                                if (!str2.equals("landing_page")) {
                                    return false;
                                }
                                ((Aweme) obj).landingPage = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1727615591:
                                if (!str2.equals("promotion_other_info")) {
                                    return false;
                                }
                                ((Aweme) obj).promotionOtherInfo = (PromotionOtherInfo) this.LIZ.LIZIZ(PromotionOtherInfo.class).read(c65385PlN);
                                return true;
                            case -1724126094:
                                if (!str2.equals("content_size_type")) {
                                    return false;
                                }
                                Object read14 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read14 != null) {
                                    ((Aweme) obj).contentSizeType = ((Integer) read14).intValue();
                                }
                                return true;
                            case -1706253195:
                                if (!str2.equals("has_vs_entry")) {
                                    return false;
                                }
                                Object read15 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read15 != null) {
                                    ((Aweme) obj).hasVisionSearchEntry = ((Boolean) read15).booleanValue();
                                }
                                return true;
                            case -1703939377:
                                if (!str2.equals("is_relieve")) {
                                    return false;
                                }
                                Object read16 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read16 != null) {
                                    ((Aweme) obj).isRelieve = ((Boolean) read16).booleanValue();
                                }
                                return true;
                            case -1694132160:
                                if (!str2.equals("batch_id")) {
                                    return false;
                                }
                                ((Aweme) obj).batchId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1692017399:
                                if (!str2.equals("podcast_info")) {
                                    return false;
                                }
                                ((Aweme) obj).podcastInfo = (PodcastInfo) this.LIZ.LIZIZ(PodcastInfo.class).read(c65385PlN);
                                return true;
                            case -1687371549:
                                if (!str2.equals("duetted_count")) {
                                    return false;
                                }
                                Object read17 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read17 != null) {
                                    ((Aweme) obj).duettedCount = ((Long) read17).longValue();
                                }
                                return true;
                            case -1685664283:
                                if (!str2.equals("fromRawChallenge")) {
                                    return false;
                                }
                                ((Aweme) obj).fromRawChallenge = (Challenge) this.LIZ.LIZIZ(Challenge.class).read(c65385PlN);
                                return true;
                            case -1682229249:
                                if (!str2.equals("bottom_bar")) {
                                    return false;
                                }
                                ((Aweme) obj).bottomBarModel = (BottomBarModel) this.LIZ.LIZIZ(BottomBarModel.class).read(c65385PlN);
                                return true;
                            case -1669955747:
                                if (!str2.equals("livePreviewSize")) {
                                    return false;
                                }
                                ((Aweme) obj).livePreviewSize = (Integer[]) this.LIZ.LIZIZ(Integer[].class).read(c65385PlN);
                                return true;
                            case -1669771759:
                                if (!str2.equals("feedCount")) {
                                    return false;
                                }
                                Object read18 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read18 != null) {
                                    ((Aweme) obj).feedCount = ((Long) read18).longValue();
                                }
                                return true;
                            case -1667379004:
                                if (!str2.equals("is_effect_designer")) {
                                    return false;
                                }
                                Object read19 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read19 != null) {
                                    ((Aweme) obj).isEffectDesigner = ((Boolean) read19).booleanValue();
                                }
                                return true;
                            case -1655966961:
                                if (!str2.equals("activity")) {
                                    return false;
                                }
                                ((Aweme) obj).activity = (AwemeActivity) this.LIZ.LIZIZ(AwemeActivity.class).read(c65385PlN);
                                return true;
                            case -1646309735:
                                if (!str2.equals("edit_post_permission")) {
                                    return false;
                                }
                                ((Aweme) obj).editPostPermission = (EditPostPermission) this.LIZ.LIZIZ(EditPostPermission.class).read(c65385PlN);
                                return true;
                            case -1632402649:
                                if (!str2.equals("video_reply_info")) {
                                    return false;
                                }
                                ((Aweme) obj).videoReplyStruct = (VideoReplyStruct) this.LIZ.LIZIZ(VideoReplyStruct.class).read(c65385PlN);
                                return true;
                            case -1617854863:
                                if (!str2.equals("video_text")) {
                                    return false;
                                }
                                ((Aweme) obj).textVideoLabels = (List) this.LIZ.LIZ(new OG7()).read(c65385PlN);
                                return true;
                            case -1616070030:
                                if (!str2.equals("mask_infos")) {
                                    return false;
                                }
                                ((Aweme) obj).videoMaskInfos = (List) this.LIZ.LIZ(new C69868RbU()).read(c65385PlN);
                                return true;
                            case -1612536542:
                                if (!str2.equals("isFeatureVideoItem")) {
                                    return false;
                                }
                                ((Aweme) obj).isFeatureVideoItem = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                return true;
                            case -1604133491:
                                if (!str2.equals("ttt_product_recall_type")) {
                                    return false;
                                }
                                Object read20 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read20 != null) {
                                    ((Aweme) obj).productRecallType = ((Integer) read20).intValue();
                                }
                                return true;
                            case -1581695729:
                                if (!str2.equals("share_url")) {
                                    return false;
                                }
                                ((Aweme) obj).shareUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1570596266:
                                if (!str2.equals("take_down_desc")) {
                                    return false;
                                }
                                ((Aweme) obj).takeDownDesc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1558667094:
                                if (!str2.equals("commerce_rerank_info")) {
                                    return false;
                                }
                                ((Aweme) obj).commerceRerankInfo = (CommerceRerankInfo) this.LIZ.LIZIZ(CommerceRerankInfo.class).read(c65385PlN);
                                return true;
                            case -1552258882:
                                if (!str2.equals("searchDocTranslate")) {
                                    return false;
                                }
                                ((Aweme) obj).searchDocTranslate = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1550154929:
                                if (!str2.equals("boost_tag_info")) {
                                    return false;
                                }
                                ((Aweme) obj).boost = (Boost) this.LIZ.LIZIZ(Boost.class).read(c65385PlN);
                                return true;
                            case -1544567816:
                                if (!str2.equals("anchor_info")) {
                                    return false;
                                }
                                ((Aweme) obj).anchorInfo = (AnchorInfo) this.LIZ.LIZIZ(AnchorInfo.class).read(c65385PlN);
                                return true;
                            case -1527498194:
                                if (!str2.equals("suggest_words")) {
                                    return false;
                                }
                                ((Aweme) obj).commentSuggestWordList = (CommentSuggestWordList) this.LIZ.LIZIZ(CommentSuggestWordList.class).read(c65385PlN);
                                return true;
                            case -1512022125:
                                if (!str2.equals("aweme_id")) {
                                    return false;
                                }
                                ((Aweme) obj).aid = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1488400626:
                                if (!str2.equals("reportMaskInfo")) {
                                    return false;
                                }
                                ((Aweme) obj).reportMaskInfo = (VideoMaskInfo) this.LIZ.LIZIZ(VideoMaskInfo.class).read(c65385PlN);
                                return true;
                            case -1486079410:
                                if (!str2.equals("has_promote_entry")) {
                                    return false;
                                }
                                Object read21 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read21 != null) {
                                    ((Aweme) obj).hasPromoteEntry = ((Integer) read21).intValue();
                                }
                                return true;
                            case -1440786201:
                                if (!str2.equals("livePreviewLongPressDisabled")) {
                                    return false;
                                }
                                Object read22 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read22 != null) {
                                    ((Aweme) obj).livePreviewLongPressDisabled = ((Boolean) read22).booleanValue();
                                }
                                return true;
                            case -1426062379:
                                if (!str2.equals("isFromDouPlusGuideAnimate")) {
                                    return false;
                                }
                                Object read23 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read23 != null) {
                                    ((Aweme) obj).isFromDouPlusGuideAnimate = ((Boolean) read23).booleanValue();
                                }
                                return true;
                            case -1424371608:
                                if (!str2.equals("content_desc_extra")) {
                                    return false;
                                }
                                ((Aweme) obj).contentDescExtra = (List) this.LIZ.LIZ(new C69861RbN()).read(c65385PlN);
                                return true;
                            case -1420084888:
                                if (!str2.equals("shop_ad_struct")) {
                                    return false;
                                }
                                ((Aweme) obj).shopAdStruct = (ShopAdStruct) this.LIZ.LIZIZ(ShopAdStruct.class).read(c65385PlN);
                                return true;
                            case -1413299531:
                                if (!str2.equals("anchor")) {
                                    return false;
                                }
                                ((Aweme) obj).anchor = (Anchor) this.LIZ.LIZIZ(Anchor.class).read(c65385PlN);
                                return true;
                            case -1409199927:
                                if (!str2.equals("take_down_reason")) {
                                    return false;
                                }
                                Object read24 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read24 != null) {
                                    ((Aweme) obj).takeDownReason = ((Integer) read24).intValue();
                                }
                                return true;
                            case -1406328437:
                                if (!str2.equals("author")) {
                                    return false;
                                }
                                ((Aweme) obj).author = (User) this.LIZ.LIZIZ(User.class).read(c65385PlN);
                                return true;
                            case -1367746325:
                                if (!str2.equals("reference_tts_voice_ids")) {
                                    return false;
                                }
                                ((Aweme) obj).ttsVoiceRefIDs = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case -1365393667:
                                if (!str2.equals("is_pinned_by_artist")) {
                                    return false;
                                }
                                Object read25 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read25 != null) {
                                    ((Aweme) obj).isPinnedByArtist = ((Boolean) read25).booleanValue();
                                }
                                return true;
                            case -1353964622:
                                if (!str2.equals("aweme_type")) {
                                    return false;
                                }
                                Object read26 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read26 != null) {
                                    ((Aweme) obj).awemeType = ((Integer) read26).intValue();
                                }
                                return true;
                            case -1353884083:
                                if (!str2.equals("forward_item_id")) {
                                    return false;
                                }
                                ((Aweme) obj).forwardItemId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1342102426:
                                if (!str2.equals("allow_gift")) {
                                    return false;
                                }
                                Object read27 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read27 != null) {
                                    ((Aweme) obj).allowGift = ((Boolean) read27).booleanValue();
                                }
                                return true;
                            case -1326313229:
                                if (!str2.equals("is_prohibited")) {
                                    return false;
                                }
                                Object read28 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read28 != null) {
                                    ((Aweme) obj).isProhibited = ((Boolean) read28).booleanValue();
                                }
                                return true;
                            case -1322651010:
                                if (!str2.equals("photosensitiveMaskInfo")) {
                                    return false;
                                }
                                ((Aweme) obj).photosensitiveMaskInfo = (VideoMaskInfo) this.LIZ.LIZIZ(VideoMaskInfo.class).read(c65385PlN);
                                return true;
                            case -1319036801:
                                if (!str2.equals("playlist_blocked")) {
                                    return false;
                                }
                                Object read29 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read29 != null) {
                                    ((Aweme) obj).playlistBlocked = ((Boolean) read29).booleanValue();
                                }
                                return true;
                            case -1316719207:
                                if (!str2.equals("video_control")) {
                                    return false;
                                }
                                ((Aweme) obj).videoControl = (VideoControl) this.LIZ.LIZIZ(VideoControl.class).read(c65385PlN);
                                return true;
                            case -1309660263:
                                if (!str2.equals("contentClassificationMaskInfo")) {
                                    return false;
                                }
                                ((Aweme) obj).contentClassificationMaskInfo = (VideoMaskInfo) this.LIZ.LIZIZ(VideoMaskInfo.class).read(c65385PlN);
                                return true;
                            case -1297063025:
                                if (!str2.equals("anchorType")) {
                                    return false;
                                }
                                Object read30 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read30 != null) {
                                    ((Aweme) obj).anchorType = ((Integer) read30).intValue();
                                }
                                return true;
                            case -1291705454:
                                if (!str2.equals("previewData")) {
                                    return false;
                                }
                                ((Aweme) obj).previewData = (PublishPreviewInfo) this.LIZ.LIZIZ(PublishPreviewInfo.class).read(c65385PlN);
                                return true;
                            case -1289507021:
                                if (!str2.equals("ad_schedule")) {
                                    return false;
                                }
                                ((Aweme) obj).adSchedule = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1274620340:
                                if (!str2.equals("music_end_time_in_ms")) {
                                    return false;
                                }
                                Object read31 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read31 != null) {
                                    ((Aweme) obj).musicEndTime = ((Integer) read31).intValue();
                                }
                                return true;
                            case -1270039078:
                                if (!str2.equals("nickname_position")) {
                                    return false;
                                }
                                ((Aweme) obj).nicknamePosition = (List) this.LIZ.LIZ(new OG6()).read(c65385PlN);
                                return true;
                            case -1227681445:
                                if (!str2.equals("sp_sticker")) {
                                    return false;
                                }
                                ((Aweme) obj).specialSticker = (SpecialSticker) this.LIZ.LIZIZ(SpecialSticker.class).read(c65385PlN);
                                return true;
                            case -1218435648:
                                if (!str2.equals("interaction_tag_info")) {
                                    return false;
                                }
                                ((Aweme) obj).interactionTagInfo = (InteractionTagInfo) this.LIZ.LIZIZ(InteractionTagInfo.class).read(c65385PlN);
                                return true;
                            case -1205911393:
                                if (!str2.equals("support_danmaku")) {
                                    return false;
                                }
                                Object read32 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read32 != null) {
                                    ((Aweme) obj).isSupportDanmaku = ((Boolean) read32).booleanValue();
                                }
                                return true;
                            case -1204552337:
                                if (!str2.equals("adDescMaxLines")) {
                                    return false;
                                }
                                Object read33 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read33 != null) {
                                    ((Aweme) obj).adDescMaxLines = ((Integer) read33).intValue();
                                }
                                return true;
                            case -1197692098:
                                if (!str2.equals("music_begin_time_in_ms")) {
                                    return false;
                                }
                                Object read34 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read34 != null) {
                                    ((Aweme) obj).musicBeginTime = ((Integer) read34).intValue();
                                }
                                return true;
                            case -1194425296:
                                if (!str2.equals("stream_url")) {
                                    return false;
                                }
                                ((Aweme) obj).streamUrlModel = (StreamUrlModel) this.LIZ.LIZIZ(StreamUrlModel.class).read(c65385PlN);
                                return true;
                            case -1179774949:
                                if (!str2.equals("is_ads")) {
                                    return false;
                                }
                                Object read35 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read35 != null) {
                                    ((Aweme) obj).isAd = ((Boolean) read35).booleanValue();
                                }
                                return true;
                            case -1179756352:
                                if (!str2.equals("is_top")) {
                                    return false;
                                }
                                Object read36 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read36 != null) {
                                    ((Aweme) obj).isTop = ((Integer) read36).intValue();
                                }
                                return true;
                            case -1161222649:
                                if (!str2.equals("commercial_video_info")) {
                                    return false;
                                }
                                ((Aweme) obj).commercialVideoInfo = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1159180065:
                                if (!str2.equals("cny_info")) {
                                    return false;
                                }
                                ((Aweme) obj).mLiveAwesomeSplashInfo = (LiveAwesomeSplashInfo) this.LIZ.LIZIZ(LiveAwesomeSplashInfo.class).read(c65385PlN);
                                return true;
                            case -1153726650:
                                if (!str2.equals("recommend_card_type")) {
                                    return false;
                                }
                                Object read37 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read37 != null) {
                                    ((Aweme) obj).recommendCardType = ((Integer) read37).intValue();
                                }
                                return true;
                            case -1153384925:
                                if (!str2.equals("behind_the_song_video_music_ids")) {
                                    return false;
                                }
                                ((Aweme) obj).behindTheSongMusicIds = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case -1137799567:
                                if (!str2.equals("retry_type")) {
                                    return false;
                                }
                                Object read38 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read38 != null) {
                                    ((Aweme) obj).retryType = ((Integer) read38).intValue();
                                }
                                return true;
                            case -1134772752:
                                if (!str2.equals("music_title_style")) {
                                    return false;
                                }
                                Object read39 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read39 != null) {
                                    ((Aweme) obj).musicTitleStyle = ((Integer) read39).intValue();
                                }
                                return true;
                            case -1125949984:
                                if (!str2.equals("filterDuplicateTime")) {
                                    return false;
                                }
                                Object read40 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read40 != null) {
                                    ((Aweme) obj).filterDuplicateTime = ((Long) read40).longValue();
                                }
                                return true;
                            case -1117112674:
                                if (!str2.equals("voice_filter_ids")) {
                                    return false;
                                }
                                ((Aweme) obj).vcVoiceIDs = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case -1109684908:
                                if (!str2.equals("commerce_sticker_info")) {
                                    return false;
                                }
                                ((Aweme) obj).commerceStickerInfo = (CommerceStickerInfo) this.LIZ.LIZIZ(CommerceStickerInfo.class).read(c65385PlN);
                                return true;
                            case -1084985945:
                                if (!str2.equals("fakeAid")) {
                                    return false;
                                }
                                ((Aweme) obj).fakeAid = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1082126159:
                                if (!str2.equals("mix_info")) {
                                    return false;
                                }
                                ((Aweme) obj).mixInfo = (MixStruct) this.LIZ.LIZIZ(MixStruct.class).read(c65385PlN);
                                return true;
                            case -1078838025:
                                if (!str2.equals("live_reason")) {
                                    return false;
                                }
                                ((Aweme) obj).liveReaSon = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1069076215:
                                if (!str2.equals("aigc_info")) {
                                    return false;
                                }
                                ((Aweme) obj).aigcInfo = (AIGCInfo) this.LIZ.LIZIZ(AIGCInfo.class).read(c65385PlN);
                                return true;
                            case -1046034155:
                                if (!str2.equals("shoot_tab_name")) {
                                    return false;
                                }
                                ((Aweme) obj).shootTabName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1043283020:
                                if (!str2.equals("cc_template_info")) {
                                    return false;
                                }
                                ((Aweme) obj).ccTemplateInfo = (CCTemplateInfo) this.LIZ.LIZIZ(CCTemplateInfo.class).read(c65385PlN);
                                return true;
                            case -1031341816:
                                if (!str2.equals("banner_tip")) {
                                    return false;
                                }
                                ((Aweme) obj).bannerTip = (BannerTip) this.LIZ.LIZIZ(BannerTip.class).read(c65385PlN);
                                return true;
                            case -1030574761:
                                if (!str2.equals("question_list")) {
                                    return false;
                                }
                                ((Aweme) obj).questionInfo = (List) this.LIZ.LIZ(new C69869RbV()).read(c65385PlN);
                                return true;
                            case -1011462324:
                                if (!str2.equals("is_story_to_normal")) {
                                    return false;
                                }
                                Object read41 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read41 != null) {
                                    ((Aweme) obj).isStoryToNormal = ((Boolean) read41).booleanValue();
                                }
                                return true;
                            case -1004421264:
                                if (!str2.equals("new_relation_label")) {
                                    return false;
                                }
                                ((Aweme) obj).mNewRelationLabel = (List) this.LIZ.LIZ(new C72072SQi()).read(c65385PlN);
                                return true;
                            case -995410142:
                                if (!str2.equals("part_n")) {
                                    return false;
                                }
                                ((Aweme) obj).partN = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -986143016:
                                if (!str2.equals("distribute_type")) {
                                    return false;
                                }
                                Object read42 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read42 != null) {
                                    ((Aweme) obj).distributeType = ((Integer) read42).intValue();
                                }
                                return true;
                            case -977634846:
                                if (!str2.equals("label_music_starter_text")) {
                                    return false;
                                }
                                ((Aweme) obj).mLabelMusicStarterText = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -966787989:
                                if (!str2.equals("anchorWikiOfflineText")) {
                                    return false;
                                }
                                ((Aweme) obj).anchorWikiOfflineText = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -956843851:
                                if (!str2.equals("forward_comment_id")) {
                                    return false;
                                }
                                ((Aweme) obj).forwardCommentId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -946124580:
                                if (!str2.equals("isCanCache")) {
                                    return false;
                                }
                                Object read43 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read43 != null) {
                                    ((Aweme) obj).isCanCache = ((Boolean) read43).booleanValue();
                                }
                                return true;
                            case -934795532:
                                if (!str2.equals("region")) {
                                    return false;
                                }
                                ((Aweme) obj).region = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -917278645:
                                if (!str2.equals("activity_id")) {
                                    return false;
                                }
                                ((Aweme) obj).activityId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -916006491:
                                if (!str2.equals("branded_content_accounts")) {
                                    return false;
                                }
                                ((Aweme) obj).brandContentAccounts = (List) this.LIZ.LIZ(new TypeToken<List<BrandedContentAccount>>() { // from class: X.7F2
                                }).read(c65385PlN);
                                return true;
                            case -909670464:
                                if (!str2.equals("ttm_info")) {
                                    return false;
                                }
                                ((Aweme) obj).ttmInfo = (TTMInfo) this.LIZ.LIZIZ(TTMInfo.class).read(c65385PlN);
                                return true;
                            case -903566221:
                                if (!str2.equals("sharer")) {
                                    return false;
                                }
                                ((Aweme) obj).sharer = (User) this.LIZ.LIZIZ(User.class).read(c65385PlN);
                                return true;
                            case -892481550:
                                if (!str2.equals("status")) {
                                    return false;
                                }
                                ((Aweme) obj).status = (AwemeStatus) this.LIZ.LIZIZ(AwemeStatus.class).read(c65385PlN);
                                return true;
                            case -887559431:
                                if (!str2.equals("should_add_creator_tts_watermark_when_downloading")) {
                                    return false;
                                }
                                Object read44 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read44 != null) {
                                    ((Aweme) obj).needTTSWatermarkWhenDownload = ((Boolean) read44).booleanValue();
                                }
                                return true;
                            case -874432885:
                                if (!str2.equals("newTranslateY")) {
                                    return false;
                                }
                                Object read45 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read45 != null) {
                                    ((Aweme) obj).newTranslateY = ((Integer) read45).intValue();
                                }
                                return true;
                            case -870548159:
                                if (!str2.equals("parameterized_speed")) {
                                    return false;
                                }
                                Object read46 = this.LIZ.LIZIZ(Float.class).read(c65385PlN);
                                if (read46 != null) {
                                    ((Aweme) obj).parameterizedSpeed = ((Float) read46).floatValue();
                                }
                                return true;
                            case -867217735:
                                if (!str2.equals("label_origin_author")) {
                                    return false;
                                }
                                ((Aweme) obj).originAuthor = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -862612386:
                                if (!str2.equals("anchors")) {
                                    return false;
                                }
                                ((Aweme) obj).anchors = (List) this.LIZ.LIZ(new C69879Rbf()).read(c65385PlN);
                                return true;
                            case -852883056:
                                if (!str2.equals("subAwemeCover")) {
                                    return false;
                                }
                                ((Aweme) obj).subAwemeCover = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -812763377:
                                if (!str2.equals("prevent_download")) {
                                    return false;
                                }
                                Object read47 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read47 != null) {
                                    ((Aweme) obj).preventDownload = ((Boolean) read47).booleanValue();
                                }
                                return true;
                            case -788289672:
                                if (!str2.equals("interact_permission")) {
                                    return false;
                                }
                                ((Aweme) obj).interactPermission = (InteractPermission) this.LIZ.LIZIZ(InteractPermission.class).read(c65385PlN);
                                return true;
                            case -775588976:
                                if (!str2.equals("scenario")) {
                                    return false;
                                }
                                Object read48 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read48 != null) {
                                    ((Aweme) obj).scenario = ((Integer) read48).intValue();
                                }
                                return true;
                            case -765757166:
                                if (!str2.equals("reference_voice_filter_ids")) {
                                    return false;
                                }
                                ((Aweme) obj).vcVoiceRefIDs = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case -749062070:
                                if (!str2.equals("follow_up_publish_from_id")) {
                                    return false;
                                }
                                Object read49 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read49 != null) {
                                    ((Aweme) obj).followUpPublishFromId = ((Long) read49).longValue();
                                }
                                return true;
                            case -742671667:
                                if (!str2.equals("ttec_suggest_words")) {
                                    return false;
                                }
                                ((Aweme) obj).ecFeedSuggestWordList = (EcFeedSuggestWordList) this.LIZ.LIZIZ(EcFeedSuggestWordList.class).read(c65385PlN);
                                return true;
                            case -738710225:
                                if (!str2.equals("ad_aweme_source")) {
                                    return false;
                                }
                                Object read50 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read50 != null) {
                                    ((Aweme) obj).adAwemeSource = ((Integer) read50).intValue();
                                }
                                return true;
                            case -727186307:
                                if (!str2.equals("have_dashboard")) {
                                    return false;
                                }
                                Object read51 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read51 != null) {
                                    ((Aweme) obj).haveDashboard = ((Boolean) read51).booleanValue();
                                }
                                return true;
                            case -718231406:
                                if (!str2.equals("isCommentClicked")) {
                                    return false;
                                }
                                Object read52 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read52 != null) {
                                    ((Aweme) obj).isCommentClicked = ((Boolean) read52).booleanValue();
                                }
                                return true;
                            case -689112866:
                                if (!str2.equals("challengeId")) {
                                    return false;
                                }
                                ((Aweme) obj).challengeId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -687058414:
                                if (!str2.equals("scheduleId")) {
                                    return false;
                                }
                                ((Aweme) obj).scheduleId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -682484480:
                                if (!str2.equals("isFakeResponse")) {
                                    return false;
                                }
                                Object read53 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read53 != null) {
                                    ((Aweme) obj).isFakeResponse = ((Boolean) read53).booleanValue();
                                }
                                return true;
                            case -673630214:
                                if (!str2.equals("survey_key")) {
                                    return false;
                                }
                                ((Aweme) obj).surveyKey = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -607398518:
                                if (!str2.equals("label_top")) {
                                    return false;
                                }
                                ((Aweme) obj).labelTop = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -589960584:
                                if (!str2.equals("user_digged")) {
                                    return false;
                                }
                                Object read54 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read54 != null) {
                                    ((Aweme) obj).userDigg = ((Integer) read54).intValue();
                                }
                                return true;
                            case -586494882:
                                if (!str2.equals("is_hash_tag")) {
                                    return false;
                                }
                                Object read55 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read55 != null) {
                                    ((Aweme) obj).isHashTag = ((Integer) read55).intValue();
                                }
                                return true;
                            case -584915233:
                                if (!str2.equals("tts_voice_ids")) {
                                    return false;
                                }
                                ((Aweme) obj).ttsVoiceIDs = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case -578939693:
                                if (!str2.equals("rec_reason")) {
                                    return false;
                                }
                                ((Aweme) obj).recReasonsStruct = (RecReasonsStruct) this.LIZ.LIZIZ(RecReasonsStruct.class).read(c65385PlN);
                                return true;
                            case -545543570:
                                if (!str2.equals("nearby_info")) {
                                    return false;
                                }
                                ((Aweme) obj).nearbyInfo = (NearbyInfo) this.LIZ.LIZIZ(NearbyInfo.class).read(c65385PlN);
                                return true;
                            case -541079121:
                                if (!str2.equals("item_comment_settings")) {
                                    return false;
                                }
                                Object read56 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read56 != null) {
                                    ((Aweme) obj).commentSetting = ((Integer) read56).intValue();
                                }
                                return true;
                            case -539714872:
                                if (!str2.equals("search_desc")) {
                                    return false;
                                }
                                ((Aweme) obj).searchDesc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -493574096:
                                if (!str2.equals("create_time")) {
                                    return false;
                                }
                                Object read57 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read57 != null) {
                                    ((Aweme) obj).createTime = ((Long) read57).longValue();
                                }
                                return true;
                            case -479476846:
                                if (!str2.equals("commerce_info")) {
                                    return false;
                                }
                                ((Aweme) obj).mCommerceVideoAuthInfo = (AwemeCommerceStruct) this.LIZ.LIZIZ(AwemeCommerceStruct.class).read(c65385PlN);
                                return true;
                            case -476704057:
                                if (!str2.equals("isLastInSpot")) {
                                    return false;
                                }
                                Object read58 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read58 != null) {
                                    ((Aweme) obj).isLastInSpot = ((Boolean) read58).booleanValue();
                                }
                                return true;
                            case -462680470:
                                if (!str2.equals("react_from")) {
                                    return false;
                                }
                                ((Aweme) obj).reactFrom = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -462212763:
                                if (!str2.equals("react_view")) {
                                    return false;
                                }
                                ((Aweme) obj).reactView = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -418998673:
                                if (!str2.equals("is_intext_occlude_desc")) {
                                    return false;
                                }
                                ((Aweme) obj).isIntextOccludeDesc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -415312146:
                                if (!str2.equals("searchExtraParams")) {
                                    return false;
                                }
                                ((Aweme) obj).searchExtraParams = (Map) this.LIZ.LIZ(new OG2()).read(c65385PlN);
                                return true;
                            case -413397259:
                                if (!str2.equals("interactionBubbles")) {
                                    return false;
                                }
                                ((Aweme) obj).interactionBubbles = (InteractionBubbles) this.LIZ.LIZIZ(InteractionBubbles.class).read(c65385PlN);
                                return true;
                            case -399312141:
                                if (!str2.equals("label_origin_author_text")) {
                                    return false;
                                }
                                ((Aweme) obj).mLabelOriginAuthorText = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -392091312:
                                if (!str2.equals("trendingName")) {
                                    return false;
                                }
                                ((Aweme) obj).trendingName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -391584263:
                                if (!str2.equals("trending_bar")) {
                                    return false;
                                }
                                ((Aweme) obj).trendingBar = (AwemeTrendingBar) this.LIZ.LIZIZ(AwemeTrendingBar.class).read(c65385PlN);
                                return true;
                            case -391022302:
                                if (!str2.equals("comment_config")) {
                                    return false;
                                }
                                ((Aweme) obj).commentConfig = (AwemeCommentConfig) this.LIZ.LIZIZ(AwemeCommentConfig.class).read(c65385PlN);
                                return true;
                            case -382343331:
                                if (!str2.equals("item_stitch")) {
                                    return false;
                                }
                                Object read59 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read59 != null) {
                                    ((Aweme) obj).stitchSetting = ((Integer) read59).intValue();
                                }
                                return true;
                            case -321425160:
                                if (!str2.equals("long_video")) {
                                    return false;
                                }
                                ((Aweme) obj).longVideos = (List) this.LIZ.LIZ(new C69864RbQ()).read(c65385PlN);
                                return true;
                            case -318476791:
                                if (!str2.equals("preload")) {
                                    return false;
                                }
                                ((Aweme) obj).preload = (Preload) this.LIZ.LIZIZ(Preload.class).read(c65385PlN);
                                return true;
                            case -309211200:
                                if (!str2.equals("promote")) {
                                    return false;
                                }
                                ((Aweme) obj).promoteModel = (PromoteModel) this.LIZ.LIZIZ(PromoteModel.class).read(c65385PlN);
                                return true;
                            case -294460212:
                                if (!str2.equals("uniqueId")) {
                                    return false;
                                }
                                ((Aweme) obj).uniqueId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -290705056:
                                if (!str2.equals("hot_info")) {
                                    return false;
                                }
                                ((Aweme) obj).hotSearchInfo = (HotSearchInfo) this.LIZ.LIZIZ(HotSearchInfo.class).read(c65385PlN);
                                return true;
                            case -290620080:
                                if (!str2.equals("hot_list")) {
                                    return false;
                                }
                                ((Aweme) obj).hotListStruct = (HotListStruct) this.LIZ.LIZIZ(HotListStruct.class).read(c65385PlN);
                                return true;
                            case -279014323:
                                if (!str2.equals("forward_item")) {
                                    return false;
                                }
                                ((Aweme) obj).forwardItem = (Aweme) this.LIZ.LIZIZ(Aweme.class).read(c65385PlN);
                                return true;
                            case -260058219:
                                if (!str2.equals("new_label")) {
                                    return false;
                                }
                                Object read60 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read60 != null) {
                                    ((Aweme) obj).newLabel = ((Integer) read60).intValue();
                                }
                                return true;
                            case -255060168:
                                if (!str2.equals("label_private")) {
                                    return false;
                                }
                                ((Aweme) obj).labelPrivate = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -245689578:
                                if (!str2.equals("descendants")) {
                                    return false;
                                }
                                ((Aweme) obj).descendantsModel = (DescendantsModel) this.LIZ.LIZIZ(DescendantsModel.class).read(c65385PlN);
                                return true;
                            case -237313800:
                                if (!str2.equals("searchTabName")) {
                                    return false;
                                }
                                ((Aweme) obj).searchTabName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -213755837:
                                if (!str2.equals("video_labels")) {
                                    return false;
                                }
                                ((Aweme) obj).videoLabels = (List) this.LIZ.LIZ(new C69866RbS()).read(c65385PlN);
                                return true;
                            case -158322821:
                                if (!str2.equals("with_promotional_music")) {
                                    return false;
                                }
                                Object read61 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read61 != null) {
                                    ((Aweme) obj).withPromotionalMusic = ((Boolean) read61).booleanValue();
                                }
                                return true;
                            case -152732374:
                                if (!str2.equals("isFeatureVideoSelected")) {
                                    return false;
                                }
                                ((Aweme) obj).isFeatureVideoSelected = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                return true;
                            case -133393149:
                                if (!str2.equals("mixFlowParam")) {
                                    return false;
                                }
                                ((Aweme) obj).mixFlowParam = (MixFlowParam) this.LIZ.LIZIZ(MixFlowParam.class).read(c65385PlN);
                                return true;
                            case -132371156:
                                if (!str2.equals("isPreloadScroll")) {
                                    return false;
                                }
                                Object read62 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read62 != null) {
                                    ((Aweme) obj).isPreloadScroll = ((Boolean) read62).booleanValue();
                                }
                                return true;
                            case -127871247:
                                if (!str2.equals("hybrid_label")) {
                                    return false;
                                }
                                ((Aweme) obj).hybridLabels = (List) this.LIZ.LIZ(new C69875Rbb()).read(c65385PlN);
                                return true;
                            case -126540221:
                                if (!str2.equals("can_play")) {
                                    return false;
                                }
                                Object read63 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read63 != null) {
                                    ((Aweme) obj).canPlay = ((Boolean) read63).booleanValue();
                                }
                                return true;
                            case -117449243:
                                if (!str2.equals("aweme_control")) {
                                    return false;
                                }
                                ((Aweme) obj).awemeControl = (AwemeControl) this.LIZ.LIZIZ(AwemeControl.class).read(c65385PlN);
                                return true;
                            case -106715187:
                                if (!str2.equals("isEnableVideoSkip")) {
                                    return false;
                                }
                                Object read64 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read64 != null) {
                                    ((Aweme) obj).isEnableVideoSkip = ((Boolean) read64).booleanValue();
                                }
                                return true;
                            case -94588637:
                                if (!str2.equals("statistics")) {
                                    return false;
                                }
                                ((Aweme) obj).statistics = (AwemeStatistics) this.LIZ.LIZIZ(AwemeStatistics.class).read(c65385PlN);
                                return true;
                            case -91453607:
                                if (!str2.equals("disable_search_trending_bar")) {
                                    return false;
                                }
                                Object read65 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read65 != null) {
                                    ((Aweme) obj).disableSearchTrendingBar = ((Boolean) read65).booleanValue();
                                }
                                return true;
                            case -52131295:
                                if (!str2.equals("mask_info")) {
                                    return false;
                                }
                                ((Aweme) obj).videoMaskInfo = (VideoMaskInfo) this.LIZ.LIZIZ(VideoMaskInfo.class).read(c65385PlN);
                                return true;
                            case -48749591:
                                if (!str2.equals("isFromTrendingCard")) {
                                    return false;
                                }
                                ((Aweme) obj).isFromTrendingCard = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -40894793:
                                if (!str2.equals("trending_bar_fyp")) {
                                    return false;
                                }
                                ((Aweme) obj).trendingBarFYP = (AwemeTrendingBar) this.LIZ.LIZIZ(AwemeTrendingBar.class).read(c65385PlN);
                                return true;
                            case -38310944:
                                if (!str2.equals("new_source_id")) {
                                    return false;
                                }
                                ((Aweme) obj).newSourceId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -22478649:
                                if (!str2.equals("isStoryFakeAweme")) {
                                    return false;
                                }
                                Object read66 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read66 != null) {
                                    ((Aweme) obj).isStoryFakeAweme = ((Boolean) read66).booleanValue();
                                }
                                return true;
                            case -13625849:
                                if (!str2.equals("is_live_has_products")) {
                                    return false;
                                }
                                Object read67 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read67 != null) {
                                    ((Aweme) obj).isLiveHasProduct = ((Boolean) read67).booleanValue();
                                }
                                return true;
                            case -7696086:
                                if (!str2.equals("now_posts")) {
                                    return false;
                                }
                                ((Aweme) obj).nowPostInfo = (NowPostInfo) this.LIZ.LIZIZ(NowPostInfo.class).read(c65385PlN);
                                return true;
                            case -3472536:
                                if (!str2.equals("replaceRecTagByRepost")) {
                                    return false;
                                }
                                Object read68 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read68 != null) {
                                    ((Aweme) obj).replaceRecTagByRepost = ((Boolean) read68).booleanValue();
                                }
                                return true;
                            case -136588:
                                if (!str2.equals("products_count")) {
                                    return false;
                                }
                                Object read69 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read69 != null) {
                                    ((Aweme) obj).productsCount = ((Integer) read69).intValue();
                                }
                                return true;
                            case 112909:
                                if (!str2.equals("rid")) {
                                    return false;
                                }
                                ((Aweme) obj).rid = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 3046160:
                                if (!str2.equals("card")) {
                                    return false;
                                }
                                ((Aweme) obj).cardInsertInfo = (CardInsertInfo) this.LIZ.LIZIZ(CardInsertInfo.class).read(c65385PlN);
                                return true;
                            case 3076014:
                                if (!str2.equals("date")) {
                                    return false;
                                }
                                Object read70 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read70 != null) {
                                    ((Aweme) obj).date = ((Long) read70).longValue();
                                }
                                return true;
                            case 3079825:
                                if (!str2.equals("desc")) {
                                    return false;
                                }
                                ((Aweme) obj).desc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 3226745:
                                if (!str2.equals("icon")) {
                                    return false;
                                }
                                ((Aweme) obj).icon = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 3493088:
                                if (!str2.equals("rate")) {
                                    return false;
                                }
                                Object read71 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read71 != null) {
                                    ((Aweme) obj).rate = ((Integer) read71).intValue();
                                }
                                return true;
                            case 3506395:
                                if (!str2.equals("room")) {
                                    return false;
                                }
                                ((Aweme) obj).room = (RoomStruct) this.LIZ.LIZIZ(RoomStruct.class).read(c65385PlN);
                                return true;
                            case 34319404:
                                if (!str2.equals("deduplication_type")) {
                                    return false;
                                }
                                Object read72 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read72 != null) {
                                    ((Aweme) obj).deduplicationType = ((Integer) read72).intValue();
                                }
                                return true;
                            case 46770681:
                                if (!str2.equals("need_vs_entry")) {
                                    return false;
                                }
                                Object read73 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read73 != null) {
                                    ((Aweme) obj).needVisionSearchEntry = ((Boolean) read73).booleanValue();
                                }
                                return true;
                            case 52377082:
                                if (!str2.equals("is_familiar")) {
                                    return false;
                                }
                                Object read74 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read74 != null) {
                                    ((Aweme) obj).isFamiliar = ((Boolean) read74).booleanValue();
                                }
                                return true;
                            case 67952372:
                                if (!str2.equals("relation_recommend_info")) {
                                    return false;
                                }
                                ((Aweme) obj).relationRecommendInfo = (AwemeRelationRecommendModel) this.LIZ.LIZIZ(AwemeRelationRecommendModel.class).read(c65385PlN);
                                return true;
                            case 76293896:
                                if (!str2.equals("withSearchSurvey")) {
                                    return false;
                                }
                                Object read75 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read75 != null) {
                                    ((Aweme) obj).withSearchSurvey = ((Boolean) read75).booleanValue();
                                }
                                return true;
                            case 93166550:
                                if (!str2.equals("audio")) {
                                    return false;
                                }
                                ((Aweme) obj).audio = (Audio) this.LIZ.LIZIZ(Audio.class).read(c65385PlN);
                                return true;
                            case 96965648:
                                if (!str2.equals("extra")) {
                                    return false;
                                }
                                ((Aweme) obj).extra = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 99048541:
                                if (!str2.equals("hasAd")) {
                                    return false;
                                }
                                Object read76 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read76 != null) {
                                    ((Aweme) obj).hasAd = ((Integer) read76).intValue();
                                }
                                return true;
                            case 100490737:
                                if (!str2.equals("is_vr")) {
                                    return false;
                                }
                                Object read77 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read77 != null) {
                                    ((Aweme) obj).isVr = ((Boolean) read77).booleanValue();
                                }
                                return true;
                            case 103148630:
                                if (!str2.equals("logPb")) {
                                    return false;
                                }
                                ((Aweme) obj).logPb = (LogPbBean) this.LIZ.LIZIZ(LogPbBean.class).read(c65385PlN);
                                return true;
                            case 103203385:
                                if (!str2.equals("mRank")) {
                                    return false;
                                }
                                Object read78 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read78 != null) {
                                    ((Aweme) obj).mRank = ((Integer) read78).intValue();
                                }
                                return true;
                            case 104263205:
                                if (!str2.equals("music")) {
                                    return false;
                                }
                                ((Aweme) obj).music = (Music) this.LIZ.LIZIZ(Music.class).read(c65385PlN);
                                return true;
                            case 110371416:
                                if (!str2.equals("title")) {
                                    return false;
                                }
                                ((Aweme) obj).title = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 112202875:
                                if (!str2.equals("video")) {
                                    return false;
                                }
                                ((Aweme) obj).video = (Video) this.LIZ.LIZIZ(Video.class).read(c65385PlN);
                                return true;
                            case 121595925:
                                if (!str2.equals("risk_infos")) {
                                    return false;
                                }
                                ((Aweme) obj).awemeRiskModel = (AwemeRiskModel) this.LIZ.LIZIZ(AwemeRiskModel.class).read(c65385PlN);
                                return true;
                            case 137439148:
                                if (!str2.equals("uniqid_position")) {
                                    return false;
                                }
                                ((Aweme) obj).uniqidPosition = (List) this.LIZ.LIZ(new OG6()).read(c65385PlN);
                                return true;
                            case 154120320:
                                if (!str2.equals("related_live")) {
                                    return false;
                                }
                                ((Aweme) obj).relatedLiveTagStruct = (RelatedLiveTagStruct) this.LIZ.LIZIZ(RelatedLiveTagStruct.class).read(c65385PlN);
                                return true;
                            case 160706627:
                                if (!str2.equals("repostFromUserId")) {
                                    return false;
                                }
                                ((Aweme) obj).repostFromUserId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 184289614:
                                if (!str2.equals("live_id")) {
                                    return false;
                                }
                                Object read79 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read79 != null) {
                                    ((Aweme) obj).liveId = ((Long) read79).longValue();
                                }
                                return true;
                            case 205000082:
                                if (!str2.equals("rateScore")) {
                                    return false;
                                }
                                ((Aweme) obj).rateScore = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 234752857:
                                if (!str2.equals("feedSource")) {
                                    return false;
                                }
                                Object read80 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read80 != null) {
                                    ((Aweme) obj).feedSource = ((Integer) read80).intValue();
                                }
                                return true;
                            case 249070733:
                                if (!str2.equals("duet_info")) {
                                    return false;
                                }
                                ((Aweme) obj).duettedInfo = (DuetInfo) this.LIZ.LIZIZ(DuetInfo.class).read(c65385PlN);
                                return true;
                            case 250498896:
                                if (!str2.equals("anchorCustomData")) {
                                    return false;
                                }
                                ((Aweme) obj).anchorCustomData = (AnchorCustomData) this.LIZ.LIZIZ(AnchorCustomData.class).read(c65385PlN);
                                return true;
                            case 252725170:
                                if (!str2.equals("feed_relation_label")) {
                                    return false;
                                }
                                ((Aweme) obj).feedRelationLabel = (RelationLabelNew) this.LIZ.LIZIZ(RelationLabelNew.class).read(c65385PlN);
                                return true;
                            case 255316066:
                                if (!str2.equals("follow_up_item_id_groups")) {
                                    return false;
                                }
                                ((Aweme) obj).followUpItemIdGroups = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 269913997:
                                if (!str2.equals("batch_index")) {
                                    return false;
                                }
                                Object read81 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read81 != null) {
                                    ((Aweme) obj).batchIndex = ((Integer) read81).intValue();
                                }
                                return true;
                            case 288459765:
                                if (!str2.equals("distance")) {
                                    return false;
                                }
                                ((Aweme) obj).distance = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 290316852:
                                if (!str2.equals("music_selected_from")) {
                                    return false;
                                }
                                ((Aweme) obj).musicSelectedFrom = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 290812207:
                                if (!str2.equals("raw_ad_data")) {
                                    return false;
                                }
                                ((Aweme) obj).awemeRawAd = (AwemeRawAd) this.LIZ.LIZIZ(AwemeRawAd.class).read(c65385PlN);
                                return true;
                            case 328794146:
                                if (!str2.equals("familiarRecommendUser")) {
                                    return false;
                                }
                                ((Aweme) obj).familiarRecommendUser = (List) this.LIZ.LIZ(new TypeToken<List<User>>() { // from class: X.2Z9
                                }).read(c65385PlN);
                                return true;
                            case 364822684:
                                if (!str2.equals("adDescHandle")) {
                                    return false;
                                }
                                Object read82 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read82 != null) {
                                    ((Aweme) obj).adDescHandle = ((Boolean) read82).booleanValue();
                                }
                                return true;
                            case 366548834:
                                if (!str2.equals("follow_up_first_item_id")) {
                                    return false;
                                }
                                ((Aweme) obj).followUpFirstItemId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 371946770:
                                if (!str2.equals("aweme_acl")) {
                                    return false;
                                }
                                ((Aweme) obj).awemeACLShareInfo = (AwemeACLShare) this.LIZ.LIZIZ(AwemeACLShare.class).read(c65385PlN);
                                return true;
                            case 389217875:
                                if (!str2.equals("origin_volume")) {
                                    return false;
                                }
                                ((Aweme) obj).originVolume = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 397776432:
                                if (!str2.equals("label_large")) {
                                    return false;
                                }
                                ((Aweme) obj).labelLarge = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 405376203:
                                if (!str2.equals("label_thumb")) {
                                    return false;
                                }
                                ((Aweme) obj).labelThumb = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 411222096:
                                if (!str2.equals("isFromSplitData")) {
                                    return false;
                                }
                                Object read83 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read83 != null) {
                                    ((Aweme) obj).isFromSplitData = ((Boolean) read83).booleanValue();
                                }
                                return true;
                            case 418572561:
                                if (!str2.equals("is_fantasy")) {
                                    return false;
                                }
                                Object read84 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read84 != null) {
                                    ((Aweme) obj).isFantasy = ((Boolean) read84).booleanValue();
                                }
                                return true;
                            case 420428114:
                                if (!str2.equals("real_survey_info")) {
                                    return false;
                                }
                                ((Aweme) obj).surveyInfo = (SurveyInfo) this.LIZ.LIZIZ(SurveyInfo.class).read(c65385PlN);
                                return true;
                            case 426065004:
                                if (!str2.equals("captionLength")) {
                                    return false;
                                }
                                Object read85 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read85 != null) {
                                    ((Aweme) obj).captionLength = ((Integer) read85).intValue();
                                }
                                return true;
                            case 450199225:
                                if (!str2.equals("search_extra")) {
                                    return false;
                                }
                                ((Aweme) obj).searchExtraStruct = (SearchExtraStruct) this.LIZ.LIZIZ(SearchExtraStruct.class).read(c65385PlN);
                                return true;
                            case 451794047:
                                if (!str2.equals("poi_data")) {
                                    return false;
                                }
                                ((Aweme) obj).poiDataStruct = (PoiDataStruct) this.LIZ.LIZIZ(PoiDataStruct.class).read(c65385PlN);
                                return true;
                            case 457565512:
                                if (!str2.equals("text_sticker_major_lang")) {
                                    return false;
                                }
                                ((Aweme) obj).textStickerMajorityLang = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 462403363:
                                if (!str2.equals("commerce_config_data")) {
                                    return false;
                                }
                                ((Aweme) obj).commerceConfigDataList = (List) this.LIZ.LIZ(new C69860RbM()).read(c65385PlN);
                                return true;
                            case 472031987:
                                if (!str2.equals("isBehindTheSongVideoType")) {
                                    return false;
                                }
                                ((Aweme) obj).isBehindTheSongVideoType = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                return true;
                            case 506361563:
                                if (!str2.equals("group_id")) {
                                    return false;
                                }
                                ((Aweme) obj).groupId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 522496288:
                                if (!str2.equals("trendingId")) {
                                    return false;
                                }
                                ((Aweme) obj).trendingId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 534001405:
                                if (!str2.equals("trans_params")) {
                                    return false;
                                }
                                ((Aweme) obj).transParams = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 538703373:
                                if (!str2.equals("item_distribute_source")) {
                                    return false;
                                }
                                ((Aweme) obj).mItemDistributeSource = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 543948910:
                                if (!str2.equals("main_arch_common")) {
                                    return false;
                                }
                                ((Aweme) obj).mainArchCommon = (MainArchCommon) LIZ(new StringJsonAdapterFactory(), MainArchCommon.class).read(c65385PlN);
                                return true;
                            case 561767033:
                                if (!str2.equals("SearchTabRank")) {
                                    return false;
                                }
                                ((Aweme) obj).SearchTabRank = (Integer) this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                return true;
                            case 571099976:
                                if (!str2.equals("isFollowerVideoPresent")) {
                                    return false;
                                }
                                Object read86 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read86 != null) {
                                    ((Aweme) obj).isFollowerVideoPresent = ((Boolean) read86).booleanValue();
                                }
                                return true;
                            case 592248435:
                                if (!str2.equals("survey_info")) {
                                    return false;
                                }
                                ((Aweme) obj).surveyInfos = (List) this.LIZ.LIZ(new C69870RbW()).read(c65385PlN);
                                return true;
                            case 665813235:
                                if (!str2.equals("mediaSafetyModel")) {
                                    return false;
                                }
                                ((Aweme) obj).mediaSafetyModel = (MediaSafetyModel) this.LIZ.LIZIZ(MediaSafetyModel.class).read(c65385PlN);
                                return true;
                            case 692207603:
                                if (!str2.equals("user_profile_init_info")) {
                                    return false;
                                }
                                ((Aweme) obj).userProfileInitInfo = (UserProfileInitInfo) this.LIZ.LIZIZ(UserProfileInitInfo.class).read(c65385PlN);
                                return true;
                            case 693933066:
                                if (!str2.equals("requestId")) {
                                    return false;
                                }
                                ((Aweme) obj).requestId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 730564204:
                                if (!str2.equals("activity_pendant")) {
                                    return false;
                                }
                                ((Aweme) obj).activityPendant = (CommerceActivityStruct) this.LIZ.LIZIZ(CommerceActivityStruct.class).read(c65385PlN);
                                return true;
                            case 747804969:
                                if (!str2.equals("position")) {
                                    return false;
                                }
                                ((Aweme) obj).position = (List) this.LIZ.LIZ(new OG6()).read(c65385PlN);
                                return true;
                            case 776416289:
                                if (!str2.equals("misc_info")) {
                                    return false;
                                }
                                ((Aweme) obj).uploadMiscInfoStructStr = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 778657921:
                                if (!str2.equals("bubble_info")) {
                                    return false;
                                }
                                ((Aweme) obj).bubbleInfo = (AwemeBubbleInfo) this.LIZ.LIZIZ(AwemeBubbleInfo.class).read(c65385PlN);
                                return true;
                            case 794399341:
                                if (!str2.equals("star_atlas_order_id")) {
                                    return false;
                                }
                                Object read87 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read87 != null) {
                                    ((Aweme) obj).starAtlasOrderId = ((Long) read87).longValue();
                                }
                                return true;
                            case 794886216:
                                if (!str2.equals("isFriendVideoPresent")) {
                                    return false;
                                }
                                Object read88 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read88 != null) {
                                    ((Aweme) obj).isFriendVideoPresent = ((Boolean) read88).booleanValue();
                                }
                                return true;
                            case 816312059:
                                if (!str2.equals("playlist_info")) {
                                    return false;
                                }
                                ((Aweme) obj).playlist_info = (PlayListInfo) this.LIZ.LIZIZ(PlayListInfo.class).read(c65385PlN);
                                return true;
                            case 831350423:
                                if (!str2.equals("content_desc")) {
                                    return false;
                                }
                                ((Aweme) obj).contentDesc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 831846208:
                                if (!str2.equals("content_type")) {
                                    return false;
                                }
                                ((Aweme) obj).contentType = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 865267764:
                                if (!str2.equals("is_pgcshow")) {
                                    return false;
                                }
                                Object read89 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read89 != null) {
                                    ((Aweme) obj).isPgcShow = ((Boolean) read89).booleanValue();
                                }
                                return true;
                            case 876547778:
                                if (!str2.equals("label_top_text")) {
                                    return false;
                                }
                                ((Aweme) obj).textTopLabels = (List) this.LIZ.LIZ(new OG7()).read(c65385PlN);
                                return true;
                            case 882874694:
                                if (!str2.equals("desc_language")) {
                                    return false;
                                }
                                ((Aweme) obj).descLanguage = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 891496342:
                                if (!str2.equals("is_intext_out")) {
                                    return false;
                                }
                                ((Aweme) obj).isIntextOut = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 899201563:
                                if (!str2.equals("cmt_swt")) {
                                    return false;
                                }
                                Object read90 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read90 != null) {
                                    ((Aweme) obj).cmtSwt = ((Boolean) read90).booleanValue();
                                }
                                return true;
                            case 913560328:
                                if (!str2.equals("isFriendsTabFakeAweme")) {
                                    return false;
                                }
                                Object read91 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read91 != null) {
                                    ((Aweme) obj).isFriendsTabFakeAweme = ((Boolean) read91).booleanValue();
                                }
                                return true;
                            case 926853363:
                                if (!str2.equals("with_survey")) {
                                    return false;
                                }
                                Object read92 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read92 != null) {
                                    ((Aweme) obj).withSurvey = ((Boolean) read92).booleanValue();
                                }
                                return true;
                            case 927977262:
                                if (!str2.equals("searchDocOriginLanguage")) {
                                    return false;
                                }
                                ((Aweme) obj).searchDocOriginLanguage = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 935762089:
                                if (!str2.equals("is_description_translatable")) {
                                    return false;
                                }
                                Object read93 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read93 != null) {
                                    ((Aweme) obj).isDescTranslatable = ((Boolean) read93).booleanValue();
                                }
                                return true;
                            case 936206155:
                                if (!str2.equals("isReferralFakeAweme")) {
                                    return false;
                                }
                                Object read94 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read94 != null) {
                                    ((Aweme) obj).isReferralFakeAweme = ((Boolean) read94).booleanValue();
                                }
                                return true;
                            case 986207186:
                                if (!str2.equals("rawdata")) {
                                    return false;
                                }
                                ((Aweme) obj).newLiveRoomData = (NewLiveRoomStruct) LIZ(new StringJsonAdapterFactory(), NewLiveRoomStruct.class).read(c65385PlN);
                                return true;
                            case 995103368:
                                if (!str2.equals("promote_toast_key")) {
                                    return false;
                                }
                                ((Aweme) obj).promoteToastKey = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1000831195:
                                if (!str2.equals("game_info")) {
                                    return false;
                                }
                                ((Aweme) obj).gameInfo = (GameInfo) this.LIZ.LIZIZ(GameInfo.class).read(c65385PlN);
                                return true;
                            case 1008335080:
                                if (!str2.equals("promote_toast")) {
                                    return false;
                                }
                                ((Aweme) obj).promoteToast = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1009011373:
                                if (!str2.equals("live_type")) {
                                    return false;
                                }
                                ((Aweme) obj).liveType = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1019743755:
                                if (!str2.equals("dou_discount_label")) {
                                    return false;
                                }
                                ((Aweme) obj).douDiscountLabel = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1028393113:
                                if (!str2.equals("sound_exemption")) {
                                    return false;
                                }
                                Object read95 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read95 != null) {
                                    ((Aweme) obj).soundExemption = ((Integer) read95).intValue();
                                }
                                return true;
                            case 1043219171:
                                if (!str2.equals("nearby_fresh_label")) {
                                    return false;
                                }
                                ((Aweme) obj).nearbyHotLabel = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1048792512:
                                if (!str2.equals("animated_btn")) {
                                    return false;
                                }
                                ((Aweme) obj).animatedBtnStruct = (AnimatedBtnStruct) this.LIZ.LIZIZ(AnimatedBtnStruct.class).read(c65385PlN);
                                return true;
                            case 1052868053:
                                if (!str2.equals("green_screen_materials")) {
                                    return false;
                                }
                                ((Aweme) obj).greenScreenMaterialList = (List) this.LIZ.LIZ(new C69862RbO()).read(c65385PlN);
                                return true;
                            case 1060595635:
                                if (!str2.equals("original_client_text")) {
                                    return false;
                                }
                                ((Aweme) obj).originalClientText = (ClientText) this.LIZ.LIZIZ(ClientText.class).read(c65385PlN);
                                return true;
                            case 1071975062:
                                if (!str2.equals("filter_stranger_comments")) {
                                    return false;
                                }
                                Object read96 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read96 != null) {
                                    ((Aweme) obj).filterStrangerComments = ((Boolean) read96).booleanValue();
                                }
                                return true;
                            case 1076484297:
                                if (!str2.equals("isHighlighted")) {
                                    return false;
                                }
                                Object read97 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read97 != null) {
                                    ((Aweme) obj).isHighlighted = ((Boolean) read97).booleanValue();
                                }
                                return true;
                            case 1077425763:
                                if (!str2.equals("interaction_stickers")) {
                                    return false;
                                }
                                ((Aweme) obj).interactStickerStructs = (List) this.LIZ.LIZ(new C69878Rbe()).read(c65385PlN);
                                return true;
                            case 1080229825:
                                if (!str2.equals("insert_aweme")) {
                                    return false;
                                }
                                ((Aweme) obj).insertAweme = (Aweme) this.LIZ.LIZIZ(Aweme.class).read(c65385PlN);
                                return true;
                            case 1098650351:
                                if (!str2.equals("hotSpot")) {
                                    return false;
                                }
                                ((Aweme) obj).hotSpot = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1127520669:
                                if (!str2.equals("repostFromGroupId")) {
                                    return false;
                                }
                                ((Aweme) obj).repostFromGroupId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1141144659:
                                if (!str2.equals("hasCreationIntention")) {
                                    return false;
                                }
                                Object read98 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read98 != null) {
                                    ((Aweme) obj).hasCreationIntention = ((Boolean) read98).booleanValue();
                                }
                                return true;
                            case 1179879744:
                                if (!str2.equals("link_match")) {
                                    return false;
                                }
                                ((Aweme) obj).linkMatch = (LinkMatch) this.LIZ.LIZIZ(LinkMatch.class).read(c65385PlN);
                                return true;
                            case 1182125491:
                                if (!str2.equals("is_preview")) {
                                    return false;
                                }
                                Object read99 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read99 != null) {
                                    ((Aweme) obj).isPreview = ((Integer) read99).intValue();
                                }
                                return true;
                            case 1182636143:
                                if (!str2.equals("tcm_info")) {
                                    return false;
                                }
                                ((Aweme) obj).tcmInfo = (TCMInfo) this.LIZ.LIZIZ(TCMInfo.class).read(c65385PlN);
                                return true;
                            case 1194553073:
                                if (!str2.equals("relation_label")) {
                                    return false;
                                }
                                ((Aweme) obj).relationLabel = (RelationDynamicLabel) this.LIZ.LIZIZ(RelationDynamicLabel.class).read(c65385PlN);
                                return true;
                            case 1206947522:
                                if (!str2.equals("generalMaskInfo")) {
                                    return false;
                                }
                                ((Aweme) obj).generalMaskInfo = (VideoMaskInfo) this.LIZ.LIZIZ(VideoMaskInfo.class).read(c65385PlN);
                                return true;
                            case 1265981491:
                                if (!str2.equals("live_window_show_time")) {
                                    return false;
                                }
                                Object read100 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read100 != null) {
                                    ((Aweme) obj).liveWindowShowTime = ((Long) read100).longValue();
                                }
                                return true;
                            case 1268314431:
                                if (!str2.equals("origin_comment_ids")) {
                                    return false;
                                }
                                ((Aweme) obj).originCommentIds = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case 1302619462:
                                if (!str2.equals("music_dsp_info")) {
                                    return false;
                                }
                                ((Aweme) obj).dsp = (Dsp) this.LIZ.LIZIZ(Dsp.class).read(c65385PlN);
                                return true;
                            case 1325482888:
                                if (!str2.equals("forceUseUniqueId")) {
                                    return false;
                                }
                                ((Aweme) obj).forceUseUniqueId = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                return true;
                            case 1343288706:
                                if (!str2.equals("allow_reuse_original_sound")) {
                                    return false;
                                }
                                ((Aweme) obj).allowReuseOriginalSound = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                return true;
                            case 1358265623:
                                if (!str2.equals("added_sound_music_info")) {
                                    return false;
                                }
                                ((Aweme) obj).addedSoundMusicInfo = (Music) this.LIZ.LIZIZ(Music.class).read(c65385PlN);
                                return true;
                            case 1394502065:
                                if (!str2.equals("isSubAweme")) {
                                    return false;
                                }
                                Object read101 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read101 != null) {
                                    ((Aweme) obj).isSubAweme = ((Boolean) read101).booleanValue();
                                }
                                return true;
                            case 1398825443:
                                if (!str2.equals("floating_card_content")) {
                                    return false;
                                }
                                ((Aweme) obj).floatingCardInfo = (FloatingCardInfo) this.LIZ.LIZIZ(FloatingCardInfo.class).read(c65385PlN);
                                return true;
                            case 1418717793:
                                if (!str2.equals("cha_list")) {
                                    return false;
                                }
                                ((Aweme) obj).challengeList = (List) this.LIZ.LIZ(new C69882Rbi()).read(c65385PlN);
                                return true;
                            case 1464854085:
                                if (!str2.equals("operator_boost_info")) {
                                    return false;
                                }
                                ((Aweme) obj).operatorBoosts = (List) this.LIZ.LIZ(new C69871RbX()).read(c65385PlN);
                                return true;
                            case 1486281679:
                                if (!str2.equals("upvote_preload")) {
                                    return false;
                                }
                                ((Aweme) obj).upvotePreload = (UpvotePreloadStruct) this.LIZ.LIZIZ(UpvotePreloadStruct.class).read(c65385PlN);
                                return true;
                            case 1494523972:
                                if (!str2.equals("story_type")) {
                                    return false;
                                }
                                Object read102 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read102 != null) {
                                    ((Aweme) obj).storyType = ((Integer) read102).intValue();
                                }
                                return true;
                            case 1510519799:
                                if (!str2.equals("is_intext_occlude_tab")) {
                                    return false;
                                }
                                ((Aweme) obj).isIntextOccludeTab = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1511390019:
                                if (!str2.equals("ad_link_type")) {
                                    return false;
                                }
                                Object read103 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read103 != null) {
                                    ((Aweme) obj).adLinkType = ((Integer) read103).intValue();
                                }
                                return true;
                            case 1516515348:
                                if (!str2.equals("filter_unfriendly_user_comments")) {
                                    return false;
                                }
                                Object read104 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read104 != null) {
                                    ((Aweme) obj).filterUnfriendlyUserComments = ((Boolean) read104).booleanValue();
                                }
                                return true;
                            case 1522893379:
                                if (!str2.equals("isStoryPacked")) {
                                    return false;
                                }
                                Object read105 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read105 != null) {
                                    ((Aweme) obj).isStoryPacked = ((Boolean) read105).booleanValue();
                                }
                                return true;
                            case 1523154431:
                                if (!str2.equals("isFriendsVideoUnread")) {
                                    return false;
                                }
                                Object read106 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read106 != null) {
                                    ((Aweme) obj).isFriendsVideoUnread = ((Boolean) read106).booleanValue();
                                }
                                return true;
                            case 1531715286:
                                if (!str2.equals("stickers")) {
                                    return false;
                                }
                                ((Aweme) obj).stickerIDs = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1533400841:
                                if (!str2.equals("image_post_info")) {
                                    return false;
                                }
                                ((Aweme) obj).photoModeImageInfo = (PhotoModeImageInfo) this.LIZ.LIZIZ(PhotoModeImageInfo.class).read(c65385PlN);
                                return true;
                            case 1537081156:
                                if (!str2.equals("poi_re_tag_signal")) {
                                    return false;
                                }
                                Object read107 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read107 != null) {
                                    ((Aweme) obj).poiReTagSignal = ((Integer) read107).intValue();
                                }
                                return true;
                            case 1559099149:
                                if (!str2.equals("isFirstInSpot")) {
                                    return false;
                                }
                                Object read108 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read108 != null) {
                                    ((Aweme) obj).isFirstInSpot = ((Boolean) read108).booleanValue();
                                }
                                return true;
                            case 1576026228:
                                if (!str2.equals("is_intext_occlude_interaction")) {
                                    return false;
                                }
                                ((Aweme) obj).isIntextOccludeInteraction = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1587048165:
                                if (!str2.equals("parentHotSpot")) {
                                    return false;
                                }
                                ((Aweme) obj).parentHotSpot = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1590280997:
                                if (!str2.equals("isForMusicDetailLoading")) {
                                    return false;
                                }
                                Object read109 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read109 != null) {
                                    ((Aweme) obj).isForMusicDetailLoading = ((Boolean) read109).booleanValue();
                                }
                                return true;
                            case 1626966089:
                                if (!str2.equals("collect_stat")) {
                                    return false;
                                }
                                Object read110 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read110 != null) {
                                    ((Aweme) obj).collectStatus = ((Integer) read110).intValue();
                                }
                                return true;
                            case 1630158232:
                                if (!str2.equals("cell_room")) {
                                    return false;
                                }
                                ((Aweme) obj).mRoomFeedCellStruct = (RoomFeedCellStruct) this.LIZ.LIZIZ(RoomFeedCellStruct.class).read(c65385PlN);
                                return true;
                            case 1650975737:
                                if (!str2.equals("captionReturnCount")) {
                                    return false;
                                }
                                Object read111 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read111 != null) {
                                    ((Aweme) obj).captionReturnCount = ((Integer) read111).intValue();
                                }
                                return true;
                            case 1668869893:
                                if (!str2.equals("is_live_replay")) {
                                    return false;
                                }
                                Object read112 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read112 != null) {
                                    ((Aweme) obj).isLiveReplay = ((Boolean) read112).booleanValue();
                                }
                                return true;
                            case 1669836674:
                                if (!str2.equals("simplePromotions")) {
                                    return false;
                                }
                                ((Aweme) obj).simplePromotions = (List) this.LIZ.LIZ(new C72071SQh()).read(c65385PlN);
                                return true;
                            case 1677819765:
                                if (!str2.equals("schedule_time")) {
                                    return false;
                                }
                                Object read113 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read113 != null) {
                                    ((Aweme) obj).scheduleTime = ((Long) read113).longValue();
                                }
                                return true;
                            case 1680199440:
                                if (!str2.equals("awemePosition")) {
                                    return false;
                                }
                                Object read114 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read114 != null) {
                                    ((Aweme) obj).awemePosition = ((Integer) read114).intValue();
                                }
                                return true;
                            case 1680407922:
                                if (!str2.equals("external_video_type")) {
                                    return false;
                                }
                                Object read115 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read115 != null) {
                                    ((Aweme) obj).externalType = ((Integer) read115).intValue();
                                }
                                return true;
                            case 1689809557:
                                if (!str2.equals("ad_story_video")) {
                                    return false;
                                }
                                ((Aweme) obj).storyModel = (StoryVideo) this.LIZ.LIZIZ(StoryVideo.class).read(c65385PlN);
                                return true;
                            case 1712871005:
                                if (!str2.equals("user_now_post")) {
                                    return false;
                                }
                                ((Aweme) obj).userNowPost = (UserNowPost) this.LIZ.LIZIZ(UserNowPost.class).read(c65385PlN);
                                return true;
                            case 1731531459:
                                if (!str2.equals("originalPos")) {
                                    return false;
                                }
                                Object read116 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read116 != null) {
                                    ((Aweme) obj).originalPos = ((Integer) read116).intValue();
                                }
                                return true;
                            case 1754813194:
                                if (!str2.equals("relevantTime")) {
                                    return false;
                                }
                                ((Aweme) obj).relevantTime = (List) this.LIZ.LIZ(new TypeToken<List<Float>>() { // from class: X.2Z8
                                }).read(c65385PlN);
                                return true;
                            case 1759745594:
                                if (!str2.equals("dou_discount_mix_info")) {
                                    return false;
                                }
                                ((Aweme) obj).douDiscountMixInfo = (HotSearchInfo) this.LIZ.LIZIZ(HotSearchInfo.class).read(c65385PlN);
                                return true;
                            case 1838239935:
                                if (!str2.equals("new_source_type")) {
                                    return false;
                                }
                                ((Aweme) obj).newSourceType = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1847259037:
                                if (!str2.equals("is_feature_video")) {
                                    return false;
                                }
                                ((Aweme) obj).isFeatureVideo = (Aweme.VideoType) this.LIZ.LIZIZ(Aweme.VideoType.class).read(c65385PlN);
                                return true;
                            case 1865250663:
                                if (!str2.equals("match_text")) {
                                    return false;
                                }
                                ((Aweme) obj).matchText = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1865269620:
                                if (!str2.equals("match_type")) {
                                    return false;
                                }
                                Object read117 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read117 != null) {
                                    ((Aweme) obj).matchType = ((Integer) read117).intValue();
                                }
                                return true;
                            case 1902245482:
                                if (!str2.equals("label_music_starter")) {
                                    return false;
                                }
                                ((Aweme) obj).musicStarter = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 1913137128:
                                if (!str2.equals("original_audio")) {
                                    return false;
                                }
                                ((Aweme) obj).originalAudio = (OriginalAudioStruct) this.LIZ.LIZIZ(OriginalAudioStruct.class).read(c65385PlN);
                                return true;
                            case 1918208455:
                                if (!str2.equals("mutual_relation")) {
                                    return false;
                                }
                                ((Aweme) obj).mutualRelation = (MutualStruct) this.LIZ.LIZIZ(MutualStruct.class).read(c65385PlN);
                                return true;
                            case 1934820225:
                                if (!str2.equals("user_story")) {
                                    return false;
                                }
                                ((Aweme) obj).userStory = (UserStory) this.LIZ.LIZIZ(UserStory.class).read(c65385PlN);
                                return true;
                            case 1939835561:
                                if (!str2.equals("products_info")) {
                                    return false;
                                }
                                ((Aweme) obj).productsInfo = (List) this.LIZ.LIZ(new KSG()).read(c65385PlN);
                                return true;
                            case 1946838380:
                                if (!str2.equals("isForwardClicked")) {
                                    return false;
                                }
                                Object read118 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read118 != null) {
                                    ((Aweme) obj).isForwardClicked = ((Boolean) read118).booleanValue();
                                }
                                return true;
                            case 1948294547:
                                if (!str2.equals("sticker_detail")) {
                                    return false;
                                }
                                ((Aweme) obj).stickerEntranceInfo = (NewFaceStickerBean) this.LIZ.LIZIZ(NewFaceStickerBean.class).read(c65385PlN);
                                return true;
                            case 1954696393:
                                if (!str2.equals("poi_re_tag_text")) {
                                    return false;
                                }
                                ((Aweme) obj).poiReTagText = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1957664441:
                                if (!str2.equals("mMobParams")) {
                                    return false;
                                }
                                ((Aweme) obj).mMobParams = (HashMap) this.LIZ.LIZ(new C72073SQj()).read(c65385PlN);
                                return true;
                            case 1964542912:
                                if (!str2.equals("searchFeedType")) {
                                    return false;
                                }
                                ((Aweme) obj).searchFeedType = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1972100081:
                                if (!str2.equals("pre_forward_id")) {
                                    return false;
                                }
                                ((Aweme) obj).preForwardId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1998616482:
                                if (!str2.equals("content_original_type")) {
                                    return false;
                                }
                                Object read119 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read119 != null) {
                                    ((Aweme) obj).contentOriginalType = ((Integer) read119).intValue();
                                }
                                return true;
                            case 2030391652:
                                if (!str2.equals("anchors_extras")) {
                                    return false;
                                }
                                ((Aweme) obj).anchorsExtras = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 2031865158:
                                if (!str2.equals("is_on_this_day")) {
                                    return false;
                                }
                                Object read120 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read120 != null) {
                                    ((Aweme) obj).isOnThisDay = ((Integer) read120).intValue();
                                }
                                return true;
                            case 2057952506:
                                if (!str2.equals("mConcatAndUploadState")) {
                                    return false;
                                }
                                Object read121 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read121 != null) {
                                    ((Aweme) obj).mConcatAndUploadState = ((Integer) read121).intValue();
                                }
                                return true;
                            case 2076506725:
                                if (!str2.equals("is_tiktok_story")) {
                                    return false;
                                }
                                Object read122 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read122 != null) {
                                    ((Aweme) obj).isTikTokStory = ((Boolean) read122).booleanValue();
                                }
                                return true;
                            case 2103947892:
                                if (!str2.equals("music_volume")) {
                                    return false;
                                }
                                ((Aweme) obj).musicVolume = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 2106269479:
                                if (!str2.equals("micro_app_info")) {
                                    return false;
                                }
                                ((Aweme) obj).microAppInfo = (MicroAppInfo) this.LIZ.LIZIZ(MicroAppInfo.class).read(c65385PlN);
                                return true;
                            case 2121927085:
                                if (!str2.equals("without_watermark")) {
                                    return false;
                                }
                                Object read123 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read123 != null) {
                                    ((Aweme) obj).downloadWithoutWatermark = ((Boolean) read123).booleanValue();
                                }
                                return true;
                            case 2124979096:
                                if (!str2.equals("GroupIdList")) {
                                    return false;
                                }
                                ((Aweme) obj).groupIdList = (GroupIdListStruct) this.LIZ.LIZIZ(GroupIdListStruct.class).read(c65385PlN);
                                return true;
                            case 2126594811:
                                if (!str2.equals("is_paid_content")) {
                                    return false;
                                }
                                Object read124 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read124 != null) {
                                    ((Aweme) obj).isPaidContent = ((Boolean) read124).booleanValue();
                                }
                                return true;
                            case 2141363016:
                                if (!str2.equals("isRecBigCardFakeAweme")) {
                                    return false;
                                }
                                Object read125 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read125 != null) {
                                    ((Aweme) obj).isRecBigCardFakeAweme = ((Boolean) read125).booleanValue();
                                }
                                return true;
                            default:
                                return false;
                        }
                    }
                };
            case 1072182955:
                if (!str.equals("com/ss/android/ugc/aweme/feed/model/Video")) {
                    return null;
                }
                final C65427Pm3 c65427Pm34 = this.LJLIL;
                return new BaseAdapter(c65427Pm34) { // from class: com.ss.android.ugc.aweme.gsonopt.OptJsonAdapterFor$com$ss$android$ugc$aweme$feed$model$Video
                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final Object LIZIZ() {
                        return new Video();
                    }

                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final boolean LIZJ(String str2, Object obj, C65385PlN c65385PlN) {
                        switch (str2.hashCode()) {
                            case -1992012396:
                                if (!str2.equals("duration")) {
                                    return false;
                                }
                                Object read = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read != null) {
                                    ((Video) obj).videoLength = ((Integer) read).intValue();
                                }
                                return true;
                            case -1927648900:
                                if (!str2.equals("big_thumbs")) {
                                    return false;
                                }
                                ((Video) obj).bigThumbs = (List) this.LIZ.LIZ(new C51028K0y()).read(c65385PlN);
                                return true;
                            case -1878087140:
                                if (!str2.equals("play_addr")) {
                                    return false;
                                }
                                ((Video) obj).playAddr = (VideoUrlModel) this.LIZ.LIZIZ(VideoUrlModel.class).read(c65385PlN);
                                return true;
                            case -1782707893:
                                if (!str2.equals("play_addr_h264")) {
                                    return false;
                                }
                                ((Video) obj).h264PlayAddr = (VideoUrlModel) this.LIZ.LIZIZ(VideoUrlModel.class).read(c65385PlN);
                                return true;
                            case -1775838883:
                                if (!str2.equals("ai_static_cover")) {
                                    return false;
                                }
                                ((Video) obj).aiCover = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -1758707159:
                                if (!str2.equals("bit_rate_audio")) {
                                    return false;
                                }
                                ((Video) obj).bitRateAudio = (List) this.LIZ.LIZ(new C47181IfR()).read(c65385PlN);
                                return true;
                            case -1646054212:
                                if (!str2.equals("videoAdTag")) {
                                    return false;
                                }
                                ((Video) obj).videoAdTag = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1552717584:
                                if (!str2.equals("is_drm_source")) {
                                    return false;
                                }
                                Object read2 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read2 != null) {
                                    ((Video) obj).enableIntertrustDrm = ((Boolean) read2).booleanValue();
                                }
                                return true;
                            case -1426925029:
                                if (!str2.equals("animated_cover")) {
                                    return false;
                                }
                                ((Video) obj).animatedCover = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -1268779017:
                                if (!str2.equals("format")) {
                                    return false;
                                }
                                ((Video) obj).format = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1221029593:
                                if (!str2.equals("height")) {
                                    return false;
                                }
                                Object read3 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read3 != null) {
                                    ((Video) obj).height = ((Integer) read3).intValue();
                                }
                                return true;
                            case -907250758:
                                if (!str2.equals("is_callback")) {
                                    return false;
                                }
                                Object read4 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read4 != null) {
                                    ((Video) obj).isCallback = ((Boolean) read4).booleanValue();
                                }
                                return true;
                            case -900538579:
                                if (!str2.equals("ai_dynamic_cover_bak")) {
                                    return false;
                                }
                                ((Video) obj).aiDynamicCoverBak = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -562549631:
                                if (!str2.equals("hasDashBitrate")) {
                                    return false;
                                }
                                ((Video) obj).hasDashBitrate = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                return true;
                            case -318775815:
                                if (!str2.equals("play_addr_bytevc1")) {
                                    return false;
                                }
                                ((Video) obj).playAddrBytevc1 = (VideoUrlModel) this.LIZ.LIZIZ(VideoUrlModel.class).read(c65385PlN);
                                return true;
                            case -287389029:
                                if (!str2.equals("pillar_box_video_info")) {
                                    return false;
                                }
                                ((Video) obj).pillarBoxVideoInfo = (PillarBoxVideoInfo) this.LIZ.LIZIZ(PillarBoxVideoInfo.class).read(c65385PlN);
                                return true;
                            case -287135046:
                                if (!str2.equals("CoverTsp")) {
                                    return false;
                                }
                                Object read5 = this.LIZ.LIZIZ(Double.class).read(c65385PlN);
                                if (read5 != null) {
                                    ((Video) obj).coverTsp = ((Double) read5).doubleValue();
                                }
                                return true;
                            case -229296317:
                                if (!str2.equals("cdn_url_expired")) {
                                    return false;
                                }
                                Object read6 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read6 != null) {
                                    ((Video) obj).cdnUrlExpired = ((Long) read6).longValue();
                                }
                                return true;
                            case 114586:
                                if (!str2.equals("tag")) {
                                    return false;
                                }
                                ((Video) obj).videoTag = (VideoTag) this.LIZ.LIZIZ(VideoTag.class).read(c65385PlN);
                                return true;
                            case 3347973:
                                if (!str2.equals("meta")) {
                                    return false;
                                }
                                ((Video) obj).meta = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 3552281:
                                if (!str2.equals("tags")) {
                                    return false;
                                }
                                ((Video) obj).videoTags = (List) this.LIZ.LIZ(new C51027K0x()).read(c65385PlN);
                                return true;
                            case 31301960:
                                if (!str2.equals("download_addr")) {
                                    return false;
                                }
                                ((Video) obj).downloadAddr = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 58507951:
                                if (!str2.equals("caption_download_addr")) {
                                    return false;
                                }
                                ((Video) obj).captionDownloadAddr = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 94852023:
                                if (!str2.equals("cover")) {
                                    return false;
                                }
                                ((Video) obj).cover = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 100937774:
                                if (!str2.equals("token_auth")) {
                                    return false;
                                }
                                ((Video) obj).drmTokenAuth = (PlayTokenAuth) this.LIZ.LIZIZ(PlayTokenAuth.class).read(c65385PlN);
                                return true;
                            case 108285963:
                                if (!str2.equals("ratio")) {
                                    return false;
                                }
                                ((Video) obj).ratio = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 113126854:
                                if (!str2.equals("width")) {
                                    return false;
                                }
                                Object read7 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read7 != null) {
                                    ((Video) obj).width = ((Integer) read7).intValue();
                                }
                                return true;
                            case 151435231:
                                if (!str2.equals("cachedOuterCoverSize")) {
                                    return false;
                                }
                                ((Video) obj).cachedOuterCoverSize = (int[]) this.LIZ.LIZIZ(int[].class).read(c65385PlN);
                                return true;
                            case 442770070:
                                if (!str2.equals("ui_alike_download_addr")) {
                                    return false;
                                }
                                ((Video) obj).uiAlikeAddr = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 673680245:
                                if (!str2.equals("cla_info")) {
                                    return false;
                                }
                                ((Video) obj).captionModel = (CaptionModel) this.LIZ.LIZIZ(CaptionModel.class).read(c65385PlN);
                                return true;
                            case 831105975:
                                if (!str2.equals("dynamic_cover")) {
                                    return false;
                                }
                                ((Video) obj).dynamicCover = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 944097139:
                                if (!str2.equals("need_set_token")) {
                                    return false;
                                }
                                Object read8 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read8 != null) {
                                    ((Video) obj).needSetCookie = ((Boolean) read8).booleanValue();
                                }
                                return true;
                            case 995875806:
                                if (!str2.equals("misc_download_addrs")) {
                                    return false;
                                }
                                ((Video) obj).miscDownloadAddrs = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1068745961:
                                if (!str2.equals("new_download_addr")) {
                                    return false;
                                }
                                ((Video) obj).newDownloadAddr = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 1092174483:
                                if (!str2.equals("aspectRatio")) {
                                    return false;
                                }
                                Object read9 = this.LIZ.LIZIZ(Float.class).read(c65385PlN);
                                if (read9 != null) {
                                    ((Video) obj).aspectRatio = ((Float) read9).floatValue();
                                }
                                return true;
                            case 1107536082:
                                if (!str2.equals("bit_rate")) {
                                    return false;
                                }
                                ((Video) obj).bitRate = (List) this.LIZ.LIZ(new C47186IfW()).read(c65385PlN);
                                return true;
                            case 1203509013:
                                if (!str2.equals("real_duration")) {
                                    return false;
                                }
                                Object read10 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read10 != null) {
                                    ((Video) obj).pilotLength = ((Integer) read10).intValue();
                                }
                                return true;
                            case 1379920485:
                                if (!str2.equals("video_model")) {
                                    return false;
                                }
                                ((Video) obj).dVideoModel = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1444619232:
                                if (!str2.equals("ai_dynamic_cover")) {
                                    return false;
                                }
                                ((Video) obj).aiDynamicCover = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 1758956958:
                                if (!str2.equals("cover_is_custom")) {
                                    return false;
                                }
                                Object read11 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read11 != null) {
                                    ((Video) obj).isCustomCover = ((Boolean) read11).booleanValue();
                                }
                                return true;
                            case 1944549841:
                                if (!str2.equals("cachedOuterCoverUrl")) {
                                    return false;
                                }
                                ((Video) obj).cachedOuterCoverUrl = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 1966352544:
                                if (!str2.equals("fake_landscape_video_info")) {
                                    return false;
                                }
                                ((Video) obj).fakeLandscapeInfo = (FakeLandscapeInfo) this.LIZ.LIZIZ(FakeLandscapeInfo.class).read(c65385PlN);
                                return true;
                            case 1983953709:
                                if (!str2.equals("is_long_video")) {
                                    return false;
                                }
                                Object read12 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read12 != null) {
                                    ((Video) obj).isLongVideo = ((Integer) read12).intValue();
                                }
                                return true;
                            case 2073227614:
                                if (!str2.equals("origin_cover")) {
                                    return false;
                                }
                                ((Video) obj).originCover = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            default:
                                return false;
                        }
                    }
                };
            case 1076141834:
                if (!str.equals("com/ss/android/ugc/aweme/commerce/AwemeCommerceStruct")) {
                    return null;
                }
                final C65427Pm3 c65427Pm35 = this.LJLIL;
                return new BaseAdapter(c65427Pm35) { // from class: com.ss.android.ugc.aweme.gsonopt.OptJsonAdapterFor$com$ss$android$ugc$aweme$commerce$AwemeCommerceStruct
                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final Object LIZIZ() {
                        return new AwemeCommerceStruct();
                    }

                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final boolean LIZJ(String str2, Object obj, C65385PlN c65385PlN) {
                        switch (str2.hashCode()) {
                            case -2094363978:
                                if (!str2.equals("entrance")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).adFeedBackEntrance = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1789944101:
                                if (!str2.equals("with_comment_filter_words")) {
                                    return false;
                                }
                                Object read = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read != null) {
                                    ((AwemeCommerceStruct) obj).withCommentFilterWords = ((Boolean) read).booleanValue();
                                }
                                return true;
                            case -1730935277:
                                if (!str2.equals("is_personal_page_forbidden")) {
                                    return false;
                                }
                                Object read2 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read2 != null) {
                                    ((AwemeCommerceStruct) obj).isPersonalPageForbidden = ((Boolean) read2).booleanValue();
                                }
                                return true;
                            case -1524035550:
                                if (!str2.equals("prevent_privacy_reason")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).preventPrivacyReason = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1497247920:
                                if (!str2.equals("enable_mid_roll")) {
                                    return false;
                                }
                                Object read3 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read3 != null) {
                                    ((AwemeCommerceStruct) obj).enableMidRoll = ((Boolean) read3).booleanValue();
                                }
                                return true;
                            case -1395114230:
                                if (!str2.equals("avoid_global_pendant")) {
                                    return false;
                                }
                                Object read4 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read4 != null) {
                                    ((AwemeCommerceStruct) obj).avoid_global_pendant = ((Boolean) read4).booleanValue();
                                }
                                return true;
                            case -1369098394:
                                if (!str2.equals("disable_mid_roll_status_code")) {
                                    return false;
                                }
                                Object read5 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read5 != null) {
                                    ((AwemeCommerceStruct) obj).disableMidRollStatusCode = ((Integer) read5).intValue();
                                }
                                return true;
                            case -1295180387:
                                if (!str2.equals("send_notice_time")) {
                                    return false;
                                }
                                Object read6 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read6 != null) {
                                    ((AwemeCommerceStruct) obj).sendNoticeTime = ((Integer) read6).intValue();
                                }
                                return true;
                            case -1048206489:
                                if (!str2.equals("prevent_self_see")) {
                                    return false;
                                }
                                Object read7 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read7 != null) {
                                    ((AwemeCommerceStruct) obj).preventSelfSee = ((Boolean) read7).booleanValue();
                                }
                                return true;
                            case -935902421:
                                if (!str2.equals("adv_promotable")) {
                                    return false;
                                }
                                Object read8 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read8 != null) {
                                    ((AwemeCommerceStruct) obj).adv_promotable = ((Boolean) read8).booleanValue();
                                }
                                return true;
                            case -859098005:
                                if (!str2.equals("mission_item_status")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).missionItemStatus = (MissionItemStatus) this.LIZ.LIZIZ(MissionItemStatus.class).read(c65385PlN);
                                return true;
                            case -594228389:
                                if (!str2.equals("ad_event_type")) {
                                    return false;
                                }
                                Object read9 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read9 != null) {
                                    ((AwemeCommerceStruct) obj).adEventType = ((Integer) read9).intValue();
                                }
                                return true;
                            case -551323202:
                                if (!str2.equals("last_view_time")) {
                                    return false;
                                }
                                Object read10 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read10 != null) {
                                    ((AwemeCommerceStruct) obj).lastViewTime = ((Long) read10).longValue();
                                }
                                return true;
                            case -524002292:
                                if (!str2.equals("douplus_toast")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).douplus_toast = (DouplusToastStructV3) this.LIZ.LIZIZ(DouplusToastStructV3.class).read(c65385PlN);
                                return true;
                            case -516372808:
                                if (!str2.equals("prevent_share")) {
                                    return false;
                                }
                                Object read11 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read11 != null) {
                                    ((AwemeCommerceStruct) obj).preventShare = ((Boolean) read11).booleanValue();
                                }
                                return true;
                            case -444963719:
                                if (!str2.equals("branded_content_type")) {
                                    return false;
                                }
                                Object read12 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read12 != null) {
                                    ((AwemeCommerceStruct) obj).brandedContentType = ((Long) read12).longValue();
                                }
                                return true;
                            case -433895057:
                                if (!str2.equals("is_pseudo_ad")) {
                                    return false;
                                }
                                Object read13 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read13 != null) {
                                    ((AwemeCommerceStruct) obj).isPseudoAd = ((Boolean) read13).booleanValue();
                                }
                                return true;
                            case -358273109:
                                if (!str2.equals("creative_id")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).creativeId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -195635492:
                                if (!str2.equals("show_share_link")) {
                                    return false;
                                }
                                Object read14 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read14 != null) {
                                    ((AwemeCommerceStruct) obj).show_share_link = ((Boolean) read14).booleanValue();
                                }
                                return true;
                            case -127926097:
                                if (!str2.equals("advertiser_id")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).advId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -93915986:
                                if (!str2.equals("mission_id")) {
                                    return false;
                                }
                                Object read15 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read15 != null) {
                                    ((AwemeCommerceStruct) obj).missionId = ((Long) read15).longValue();
                                }
                                return true;
                            case 20696391:
                                if (!str2.equals("is_music_not_clickable")) {
                                    return false;
                                }
                                Object read16 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read16 != null) {
                                    ((AwemeCommerceStruct) obj).isMusicNotClickable = ((Boolean) read16).booleanValue();
                                }
                                return true;
                            case 88501441:
                                if (!str2.equals("feedback_submitted")) {
                                    return false;
                                }
                                Object read17 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read17 != null) {
                                    ((AwemeCommerceStruct) obj).hasUserSubmittedFeedback = ((Boolean) read17).booleanValue();
                                }
                                return true;
                            case 92655287:
                                if (!str2.equals("ad_id")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).adId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 162972869:
                                if (!str2.equals("pseudo_ad_data")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).pseudoAdData = (AwemeRawAd) this.LIZ.LIZIZ(AwemeRawAd.class).read(c65385PlN);
                                return true;
                            case 548137729:
                                if (!str2.equals("biz_account")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).bizAccountInfo = (BizAccountInfo) this.LIZ.LIZIZ(BizAccountInfo.class).read(c65385PlN);
                                return true;
                            case 740420082:
                                if (!str2.equals("prevent_delete")) {
                                    return false;
                                }
                                Object read18 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read18 != null) {
                                    ((AwemeCommerceStruct) obj).preventDelete = ((Boolean) read18).booleanValue();
                                }
                                return true;
                            case 753458481:
                                if (!str2.equals("bc_label_test_text")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).bcHashtagText = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 769915831:
                                if (!str2.equals("ad_source")) {
                                    return false;
                                }
                                Object read19 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read19 != null) {
                                    ((AwemeCommerceStruct) obj).ad_source = ((Integer) read19).intValue();
                                }
                                return true;
                            case 827577283:
                                if (!str2.equals("mid_roll_replace_time")) {
                                    return false;
                                }
                                Object read20 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read20 != null) {
                                    ((AwemeCommerceStruct) obj).insertAdTime = ((Long) read20).longValue();
                                }
                                return true;
                            case 983663510:
                                if (!str2.equals("card_infos")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).cardStruct = (CardStruct) this.LIZ.LIZIZ(CardStruct.class).read(c65385PlN);
                                return true;
                            case 1117937657:
                                if (!str2.equals("prevent_friend_see")) {
                                    return false;
                                }
                                Object read21 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read21 != null) {
                                    ((AwemeCommerceStruct) obj).preventFriendSee = ((Boolean) read21).booleanValue();
                                }
                                return true;
                            case 1355748644:
                                if (!str2.equals("digg_show_scene")) {
                                    return false;
                                }
                                Object read22 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read22 != null) {
                                    ((AwemeCommerceStruct) obj).diggShowScene = ((Integer) read22).intValue();
                                }
                                return true;
                            case 1669743816:
                                if (!str2.equals("mid_roll_request_time")) {
                                    return false;
                                }
                                Object read23 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read23 != null) {
                                    ((AwemeCommerceStruct) obj).requestMidAdTime = ((Long) read23).longValue();
                                }
                                return true;
                            case 1705742811:
                                if (!str2.equals("auction_ad_invited")) {
                                    return false;
                                }
                                Object read24 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read24 != null) {
                                    ((AwemeCommerceStruct) obj).auction_ad_invited = ((Boolean) read24).booleanValue();
                                }
                                return true;
                            case 1876599633:
                                if (!str2.equals("study_id")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).studyId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1916708177:
                                if (!str2.equals("dark_post_source")) {
                                    return false;
                                }
                                Object read25 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read25 != null) {
                                    ((AwemeCommerceStruct) obj).darkPostSource = ((Integer) read25).intValue();
                                }
                                return true;
                            case 1920732456:
                                if (!str2.equals("dark_post_status")) {
                                    return false;
                                }
                                Object read26 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read26 != null) {
                                    ((AwemeCommerceStruct) obj).darkPostStatus = ((Integer) read26).intValue();
                                }
                                return true;
                            case 2048331853:
                                if (!str2.equals("ad_auth_status")) {
                                    return false;
                                }
                                Object read27 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read27 != null) {
                                    ((AwemeCommerceStruct) obj).ad_auth_status = ((Integer) read27).intValue();
                                }
                                return true;
                            case 2116204999:
                                if (!str2.equals("item_id")) {
                                    return false;
                                }
                                ((AwemeCommerceStruct) obj).itemId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            default:
                                return false;
                        }
                    }
                };
            case 1246108958:
                if (!str.equals("com/ss/android/ugc/aweme/profile/model/User")) {
                    return null;
                }
                final C65427Pm3 c65427Pm36 = this.LJLIL;
                return new BaseAdapter(c65427Pm36) { // from class: com.ss.android.ugc.aweme.gsonopt.OptJsonAdapterFor$com$ss$android$ugc$aweme$profile$model$User
                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final Object LIZIZ() {
                        return new User();
                    }

                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final boolean LIZJ(String str2, Object obj, C65385PlN c65385PlN) {
                        switch (str2.hashCode()) {
                            case -2141396406:
                                if (!str2.equals("item_list")) {
                                    return false;
                                }
                                ((User) obj).recommendAwemeItems = (List) this.LIZ.LIZ(new C69865RbR()).read(c65385PlN);
                                return true;
                            case -2140023879:
                                if (!str2.equals("vcd_schema_url")) {
                                    return false;
                                }
                                ((User) obj).vcdSchemaUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -2134504147:
                                if (!str2.equals("potential_biz_account_info")) {
                                    return false;
                                }
                                ((User) obj).potentialBizAccountInfo = (PotentialBizAccountInfo) this.LIZ.LIZIZ(PotentialBizAccountInfo.class).read(c65385PlN);
                                return true;
                            case -2120173952:
                                if (!str2.equals("r_fans_group_info")) {
                                    return false;
                                }
                                ((User) obj).rFansGroupInfo = (RocketFansGroupInfo) this.LIZ.LIZIZ(RocketFansGroupInfo.class).read(c65385PlN);
                                return true;
                            case -2107390546:
                                if (!str2.equals("follower_count")) {
                                    return false;
                                }
                                Object read = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read != null) {
                                    ((User) obj).followerCount = ((Integer) read).intValue();
                                }
                                return true;
                            case -2095871955:
                                if (!str2.equals("friend_type_str")) {
                                    return false;
                                }
                                ((User) obj).friendTypeStr = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -2084946265:
                                if (!str2.equals("school_visible")) {
                                    return false;
                                }
                                Object read2 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read2 != null) {
                                    ((User) obj).schoolInfoShowRange = ((Integer) read2).intValue();
                                }
                                return true;
                            case -2084080173:
                                if (!str2.equals("constellation")) {
                                    return false;
                                }
                                Object read3 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read3 != null) {
                                    ((User) obj).constellation = ((Integer) read3).intValue();
                                }
                                return true;
                            case -2000946467:
                                if (!str2.equals("search_highlight")) {
                                    return false;
                                }
                                ((User) obj).mHighlightInfoList = (List) this.LIZ.LIZ(new C72070SQg()).read(c65385PlN);
                                return true;
                            case -1990709956:
                                if (!str2.equals("social_data")) {
                                    return false;
                                }
                                ((User) obj).socialData = (SocialDataStruct) this.LIZ.LIZIZ(SocialDataStruct.class).read(c65385PlN);
                                return true;
                            case -1990548928:
                                if (!str2.equals("social_info")) {
                                    return false;
                                }
                                ((User) obj).socialInfo = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1980537409:
                                if (!str2.equals("creator_fund_info_struct")) {
                                    return false;
                                }
                                ((User) obj).bannerSetting = (CreatorFundBannerSetting) this.LIZ.LIZIZ(CreatorFundBannerSetting.class).read(c65385PlN);
                                return true;
                            case -1958725841:
                                if (!str2.equals("hide_shoot_button")) {
                                    return false;
                                }
                                Object read4 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read4 != null) {
                                    ((User) obj).hideShootButton = ((Boolean) read4).booleanValue();
                                }
                                return true;
                            case -1953654686:
                                if (!str2.equals("age_gate_info")) {
                                    return false;
                                }
                                ((User) obj).ageGateInfo = (AgeGateInfo) this.LIZ.LIZIZ(AgeGateInfo.class).read(c65385PlN);
                                return true;
                            case -1953331583:
                                if (!str2.equals("age_gate_time")) {
                                    return false;
                                }
                                Object read5 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read5 != null) {
                                    ((User) obj).ageGateTime = ((Long) read5).longValue();
                                }
                                return true;
                            case -1948583756:
                                if (!str2.equals("verify_info")) {
                                    return false;
                                }
                                ((User) obj).verifyInfo = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1935004580:
                                if (!str2.equals("shield_digg_notice")) {
                                    return false;
                                }
                                Object read6 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read6 != null) {
                                    ((User) obj).shieldDiggNotice = ((Integer) read6).intValue();
                                }
                                return true;
                            case -1885024190:
                                if (!str2.equals("avatar_update_reminder")) {
                                    return false;
                                }
                                Object read7 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read7 != null) {
                                    ((User) obj).avatarUpdateReminder = ((Boolean) read7).booleanValue();
                                }
                                return true;
                            case -1881328305:
                                if (!str2.equals("recommend_score")) {
                                    return false;
                                }
                                Object read8 = this.LIZ.LIZIZ(Double.class).read(c65385PlN);
                                if (read8 != null) {
                                    ((User) obj).recommendScore = ((Double) read8).doubleValue();
                                }
                                return true;
                            case -1809107271:
                                if (!str2.equals("star_billboard_rank")) {
                                    return false;
                                }
                                Object read9 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read9 != null) {
                                    ((User) obj).starBillboardRank = ((Integer) read9).intValue();
                                }
                                return true;
                            case -1801198654:
                                if (!str2.equals("mutual_relation_avatars")) {
                                    return false;
                                }
                                ((User) obj).mutualRelationAvatars = (List) this.LIZ.LIZ(new OG1()).read(c65385PlN);
                                return true;
                            case -1789714431:
                                if (!str2.equals("pronouns_info")) {
                                    return false;
                                }
                                ((User) obj).mPronounsInfo = (UserPronounsInfo) this.LIZ.LIZIZ(UserPronounsInfo.class).read(c65385PlN);
                                return true;
                            case -1788288754:
                                if (!str2.equals("share_info")) {
                                    return false;
                                }
                                ((User) obj).shareInfo = (ShareInfo) this.LIZ.LIZIZ(ShareInfo.class).read(c65385PlN);
                                return true;
                            case -1739027736:
                                if (!str2.equals("advance_feature_item_order")) {
                                    return false;
                                }
                                ((User) obj).userAdvancedFeaturesOrder = (List) this.LIZ.LIZ(new TypeToken<List<Integer>>() { // from class: X.2Z7
                                }).read(c65385PlN);
                                return true;
                            case -1729386817:
                                if (!str2.equals("effect_detail")) {
                                    return false;
                                }
                                ((User) obj).effectArtistDetail = (EffectArtistDetail) this.LIZ.LIZIZ(EffectArtistDetail.class).read(c65385PlN);
                                return true;
                            case -1724546052:
                                if (!str2.equals("description")) {
                                    return false;
                                }
                                ((User) obj).adAuthorDesc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1700983166:
                                if (!str2.equals("is_phone_binded")) {
                                    return false;
                                }
                                Object read10 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read10 != null) {
                                    ((User) obj).isPhoneBinded = ((Boolean) read10).booleanValue();
                                }
                                return true;
                            case -1687280775:
                                if (!str2.equals("youtube_refresh_token")) {
                                    return false;
                                }
                                ((User) obj).youTubeRefreshToken = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1674581204:
                                if (!str2.equals("biz_account_info")) {
                                    return false;
                                }
                                ((User) obj).bizAccountInfo = (BizAccountInfo) this.LIZ.LIZIZ(BizAccountInfo.class).read(c65385PlN);
                                return true;
                            case -1621888634:
                                if (!str2.equals("general_permission")) {
                                    return false;
                                }
                                ((User) obj).mGeneralPermission = (GeneralPermission) this.LIZ.LIZIZ(GeneralPermission.class).read(c65385PlN);
                                return true;
                            case -1620520662:
                                if (!str2.equals("viewer_entrance_info")) {
                                    return false;
                                }
                                ((User) obj).viewerEntranceInfo = (ViewerEntranceInfo) this.LIZ.LIZIZ(ViewerEntranceInfo.class).read(c65385PlN);
                                return true;
                            case -1618184771:
                                if (!str2.equals("video_icon")) {
                                    return false;
                                }
                                ((User) obj).avatarVideoUri = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -1613589672:
                                if (!str2.equals("language")) {
                                    return false;
                                }
                                ((User) obj).language = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1604804401:
                                if (!str2.equals("anchor_schedule_guide_txt")) {
                                    return false;
                                }
                                ((User) obj).anchorScheduleGuideTxt = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1596658159:
                                if (!str2.equals("duet_setting")) {
                                    return false;
                                }
                                Object read11 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read11 != null) {
                                    ((User) obj).duetSetting = ((Integer) read11).intValue();
                                }
                                return true;
                            case -1571613217:
                                if (!str2.equals("cancel_type")) {
                                    return false;
                                }
                                Object read12 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read12 != null) {
                                    ((User) obj).cancelType = ((Integer) read12).intValue();
                                }
                                return true;
                            case -1554168724:
                                if (!str2.equals("enterprise_verify_reason")) {
                                    return false;
                                }
                                ((User) obj).enterpriseVerifyReason = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1544567816:
                                if (!str2.equals("anchor_info")) {
                                    return false;
                                }
                                ((User) obj).liveAnchorInfo = (LiveAnchorInfo) this.LIZ.LIZIZ(LiveAnchorInfo.class).read(c65385PlN);
                                return true;
                            case -1540093218:
                                if (!str2.equals("verification_type")) {
                                    return false;
                                }
                                Object read13 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read13 != null) {
                                    ((User) obj).verificationType = ((Integer) read13).intValue();
                                }
                                return true;
                            case -1519533451:
                                if (!str2.equals("taggedIsBA")) {
                                    return false;
                                }
                                Object read14 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read14 != null) {
                                    ((User) obj).taggedIsBA = ((Boolean) read14).booleanValue();
                                }
                                return true;
                            case -1515073182:
                                if (!str2.equals("watch_status")) {
                                    return false;
                                }
                                Object read15 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read15 != null) {
                                    ((User) obj).watchStatus = ((Integer) read15).intValue();
                                }
                                return true;
                            case -1515021930:
                                if (!str2.equals("pro_account_tcm_red_dot")) {
                                    return false;
                                }
                                Object read16 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read16 != null) {
                                    ((User) obj).proAccountTcmRedDot = ((Boolean) read16).booleanValue();
                                }
                                return true;
                            case -1509539404:
                                if (!str2.equals("ad_cover_title")) {
                                    return false;
                                }
                                ((User) obj).adCoverTitle = (AdCoverTitle) this.LIZ.LIZIZ(AdCoverTitle.class).read(c65385PlN);
                                return true;
                            case -1503898297:
                                if (!str2.equals("video_view_is_auth")) {
                                    return false;
                                }
                                Object read17 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read17 != null) {
                                    ((User) obj).videoViewIsAuth = ((Boolean) read17).booleanValue();
                                }
                                return true;
                            case -1487939668:
                                if (!str2.equals("xmas_unlock_count")) {
                                    return false;
                                }
                                Object read18 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read18 != null) {
                                    ((User) obj).xmasUnlockCount = ((Integer) read18).intValue();
                                }
                                return true;
                            case -1481385228:
                                if (!str2.equals("hide_following_follower_list")) {
                                    return false;
                                }
                                Object read19 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read19 != null) {
                                    ((User) obj).hideFollowingFollowerList = ((Integer) read19).intValue();
                                }
                                return true;
                            case -1455607391:
                                if (!str2.equals("display_qna_on_profile")) {
                                    return false;
                                }
                                ((User) obj).displayQnaOnProfile = (Integer) this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                return true;
                            case -1446027042:
                                if (!str2.equals("paid_content_awareness_banner_info")) {
                                    return false;
                                }
                                ((User) obj).paidContentAwareBannerSetting = (PaidContentAwareBannerSetting) this.LIZ.LIZIZ(PaidContentAwareBannerSetting.class).read(c65385PlN);
                                return true;
                            case -1425754930:
                                if (!str2.equals("live_commerce")) {
                                    return false;
                                }
                                Object read20 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read20 != null) {
                                    ((User) obj).liveCommerce = ((Boolean) read20).booleanValue();
                                }
                                return true;
                            case -1425607570:
                                if (!str2.equals("notify_minor_private_policy")) {
                                    return false;
                                }
                                Object read21 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read21 != null) {
                                    ((User) obj).notifyPrivatePolicy = ((Boolean) read21).booleanValue();
                                }
                                return true;
                            case -1401557392:
                                if (!str2.equals("iso_country_code")) {
                                    return false;
                                }
                                ((User) obj).isoCountryCode = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1390325818:
                                if (!str2.equals("register_from")) {
                                    return false;
                                }
                                ((User) obj).registerFrom = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1389917463:
                                if (!str2.equals("register_time")) {
                                    return false;
                                }
                                Object read22 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read22 != null) {
                                    ((User) obj).registerTime = ((Long) read22).longValue();
                                }
                                return true;
                            case -1385872638:
                                if (!str2.equals("with_shop_entry")) {
                                    return false;
                                }
                                Object read23 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read23 != null) {
                                    ((User) obj).withShopEntry = ((Boolean) read23).booleanValue();
                                }
                                return true;
                            case -1360830533:
                                if (!str2.equals("followers_detail")) {
                                    return false;
                                }
                                ((User) obj).followerDetailList = (List) this.LIZ.LIZ(new C69873RbZ()).read(c65385PlN);
                                return true;
                            case -1315374323:
                                if (!str2.equals("total_favorited")) {
                                    return false;
                                }
                                Object read24 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read24 != null) {
                                    ((User) obj).totalFavorited = ((Long) read24).longValue();
                                }
                                return true;
                            case -1310057834:
                                if (!str2.equals("post_default_download_setting")) {
                                    return false;
                                }
                                Object read25 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read25 != null) {
                                    ((User) obj).postDefaultDownloadSetting = ((Boolean) read25).booleanValue();
                                }
                                return true;
                            case -1299743763:
                                if (!str2.equals("enable_direct_message")) {
                                    return false;
                                }
                                Object read26 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read26 != null) {
                                    ((User) obj).enableDirectMessage = ((Boolean) read26).booleanValue();
                                }
                                return true;
                            case -1294599087:
                                if (!str2.equals("white_cover_url")) {
                                    return false;
                                }
                                ((User) obj).whiteCoverUrl = (List) this.LIZ.LIZ(new OG1()).read(c65385PlN);
                                return true;
                            case -1291329255:
                                if (!str2.equals("events")) {
                                    return false;
                                }
                                ((User) obj).mLiveEventStructList = (List) this.LIZ.LIZ(new TypeToken<List<LiveEventStruct>>() { // from class: X.9kd
                                }).read(c65385PlN);
                                return true;
                            case -1282616764:
                                if (!str2.equals("can_message_follow_status_list")) {
                                    return false;
                                }
                                ((User) obj).canMessageFollowStatusList = (List) this.LIZ.LIZ(new TypeToken<List<Integer>>() { // from class: X.2Z7
                                }).read(c65385PlN);
                                return true;
                            case -1264538886:
                                if (!str2.equals("verification_badge_type")) {
                                    return false;
                                }
                                Object read27 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read27 != null) {
                                    ((User) obj).verificationBadgeType = ((Integer) read27).intValue();
                                }
                                return true;
                            case -1244083643:
                                if (!str2.equals("isFeatureVideoChanged")) {
                                    return false;
                                }
                                Object read28 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read28 != null) {
                                    ((User) obj).isFeatureVideoChanged = ((Boolean) read28).booleanValue();
                                }
                                return true;
                            case -1226790745:
                                if (!str2.equals("special_account")) {
                                    return false;
                                }
                                ((User) obj).specialAccount = (SpecialAccount) this.LIZ.LIZIZ(SpecialAccount.class).read(c65385PlN);
                                return true;
                            case -1225133476:
                                if (!str2.equals("is_private_account")) {
                                    return false;
                                }
                                Object read29 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read29 != null) {
                                    ((User) obj).isPrivateAccount = ((Boolean) read29).booleanValue();
                                }
                                return true;
                            case -1217793590:
                                if (!str2.equals("latest_unread_video_info")) {
                                    return false;
                                }
                                ((User) obj).latestUnreadVideoInfo = (LatestUnreadVideoInfo) this.LIZ.LIZIZ(LatestUnreadVideoInfo.class).read(c65385PlN);
                                return true;
                            case -1211434241:
                                if (!str2.equals("playlist_status")) {
                                    return false;
                                }
                                Object read30 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read30 != null) {
                                    ((User) obj).mixListStatus = ((Integer) read30).intValue();
                                }
                                return true;
                            case -1183798516:
                                if (!str2.equals("ins_id")) {
                                    return false;
                                }
                                ((User) obj).insId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1178642247:
                                if (!str2.equals("comment_filter_status")) {
                                    return false;
                                }
                                Object read31 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read31 != null) {
                                    ((User) obj).commentFilterStatus = ((Integer) read31).intValue();
                                }
                                return true;
                            case -1152760974:
                                if (!str2.equals("user_profile_guide")) {
                                    return false;
                                }
                                ((User) obj).userProfileGuide = (List) this.LIZ.LIZ(new C79482VHi()).read(c65385PlN);
                                return true;
                            case -1145581832:
                                if (!str2.equals("is_acquaintance")) {
                                    return false;
                                }
                                Object read32 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read32 != null) {
                                    ((User) obj).isAcquaintance = ((Boolean) read32).booleanValue();
                                }
                                return true;
                            case -1136538083:
                                if (!str2.equals("force_private_account")) {
                                    return false;
                                }
                                Object read33 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read33 != null) {
                                    ((User) obj).forcePrivateAccount = ((Boolean) read33).booleanValue();
                                }
                                return true;
                            case -1118564934:
                                if (!str2.equals("collect_count")) {
                                    return false;
                                }
                                Object read34 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read34 != null) {
                                    ((User) obj).collectCount = ((Integer) read34).intValue();
                                }
                                return true;
                            case -1118396397:
                                if (!str2.equals("shoutouts_status")) {
                                    return false;
                                }
                                Object read35 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read35 != null) {
                                    ((User) obj).shoutoutsStatus = ((Integer) read35).intValue();
                                }
                                return true;
                            case -1113131005:
                                if (!str2.equals("message_chat_entry")) {
                                    return false;
                                }
                                Object read36 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read36 != null) {
                                    ((User) obj).showMessageButton = ((Boolean) read36).booleanValue();
                                }
                                return true;
                            case -1102635940:
                                if (!str2.equals("profile_pv")) {
                                    return false;
                                }
                                Object read37 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read37 != null) {
                                    ((User) obj).profilePv = ((Long) read37).longValue();
                                }
                                return true;
                            case -1087070801:
                                if (!str2.equals("type_label")) {
                                    return false;
                                }
                                ((User) obj).typeLabels = (long[]) this.LIZ.LIZIZ(long[].class).read(c65385PlN);
                                return true;
                            case -1073723392:
                                if (!str2.equals("life_story_block")) {
                                    return false;
                                }
                                ((User) obj).storyBlockInfo = (StoryBlockInfo) this.LIZ.LIZIZ(StoryBlockInfo.class).read(c65385PlN);
                                return true;
                            case -1067878258:
                                if (!str2.equals("room_data")) {
                                    return false;
                                }
                                ((User) obj).roomData = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1065708602:
                                if (!str2.equals("aweme_unread_info")) {
                                    return false;
                                }
                                ((User) obj).awemeUnreadInfo = (AwemeUnreadInfo) this.LIZ.LIZIZ(AwemeUnreadInfo.class).read(c65385PlN);
                                return true;
                            case -1065227554:
                                if (!str2.equals("douplus_old_user")) {
                                    return false;
                                }
                                Object read38 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read38 != null) {
                                    ((User) obj).isOldDouplusUser = ((Boolean) read38).booleanValue();
                                }
                                return true;
                            case -1055767415:
                                if (!str2.equals("can_set_geofencing")) {
                                    return false;
                                }
                                Object read39 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read39 != null) {
                                    ((User) obj).canSetGeoFencing = ((Boolean) read39).booleanValue();
                                }
                                return true;
                            case -1054604988:
                                if (!str2.equals("enterprise_user_info")) {
                                    return false;
                                }
                                ((User) obj).enterpriseUserInfo = (EnterpriseUserInfo) LIZ(new StringJsonAdapterFactory(), EnterpriseUserInfo.class).read(c65385PlN);
                                return true;
                            case -1028675226:
                                if (!str2.equals("bio_permission")) {
                                    return false;
                                }
                                ((User) obj).bioPermission = (UserBioPermission) this.LIZ.LIZIZ(UserBioPermission.class).read(c65385PlN);
                                return true;
                            case -987485392:
                                if (!str2.equals("province")) {
                                    return false;
                                }
                                ((User) obj).province = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -980688722:
                                if (!str2.equals("search_user_desc")) {
                                    return false;
                                }
                                ((User) obj).searchUserDesc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -980394840:
                                if (!str2.equals("search_user_name")) {
                                    return false;
                                }
                                ((User) obj).searchUserName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -970201715:
                                if (!str2.equals("tab_settings")) {
                                    return false;
                                }
                                ((User) obj).tabSetting = (TabSetting) this.LIZ.LIZIZ(TabSetting.class).read(c65385PlN);
                                return true;
                            case -955713949:
                                if (!str2.equals("third_name")) {
                                    return false;
                                }
                                ((User) obj).thirdName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -941873117:
                                if (!str2.equals("matched_friend_available")) {
                                    return false;
                                }
                                Object read40 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read40 != null) {
                                    ((User) obj).matchedFriendAvailable = ((Boolean) read40).booleanValue();
                                }
                                return true;
                            case -935743551:
                                if (!str2.equals("with_item_commerce_entry")) {
                                    return false;
                                }
                                Object read41 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read41 != null) {
                                    ((User) obj).withItemCommerceEntry = ((Boolean) read41).booleanValue();
                                }
                                return true;
                            case -934795532:
                                if (!str2.equals("region")) {
                                    return false;
                                }
                                ((User) obj).region = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -906277200:
                                if (!str2.equals("secret")) {
                                    return false;
                                }
                                Object read42 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read42 != null) {
                                    ((User) obj).secret = ((Boolean) read42).booleanValue();
                                }
                                return true;
                            case -898399019:
                                if (!str2.equals("urge_detail")) {
                                    return false;
                                }
                                ((User) obj).urgeDetail = (UrgeStruct) this.LIZ.LIZIZ(UrgeStruct.class).read(c65385PlN);
                                return true;
                            case -880202922:
                                if (!str2.equals("avatar_decoration")) {
                                    return false;
                                }
                                ((User) obj).avatarDecoration = (AvatarDecoration) this.LIZ.LIZIZ(AvatarDecoration.class).read(c65385PlN);
                                return true;
                            case -877946734:
                                if (!str2.equals("should_write_impr")) {
                                    return false;
                                }
                                Object read43 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read43 != null) {
                                    ((User) obj).shouldWriteImpr = ((Boolean) read43).booleanValue();
                                }
                                return true;
                            case -874569851:
                                if (!str2.equals("has_facebook_token")) {
                                    return false;
                                }
                                Object read44 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read44 != null) {
                                    ((User) obj).hasFacebookToken = ((Boolean) read44).booleanValue();
                                }
                                return true;
                            case -859563817:
                                if (!str2.equals("twitter_name")) {
                                    return false;
                                }
                                ((User) obj).twitterName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -813930103:
                                if (!str2.equals("rec_type")) {
                                    return false;
                                }
                                ((User) obj).recType = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -812763377:
                                if (!str2.equals("prevent_download")) {
                                    return false;
                                }
                                Object read45 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read45 != null) {
                                    ((User) obj).preventDownload = ((Boolean) read45).booleanValue();
                                }
                                return true;
                            case -801606716:
                                if (!str2.equals("homepage_bottom_toast")) {
                                    return false;
                                }
                                ((User) obj).homepageBottomToast = (List) this.LIZ.LIZ(new C79481VHh()).read(c65385PlN);
                                return true;
                            case -800221974:
                                if (!str2.equals("age_gate_action")) {
                                    return false;
                                }
                                Object read46 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read46 != null) {
                                    ((User) obj).ageGateAction = ((Integer) read46).intValue();
                                }
                                return true;
                            case -751091740:
                                if (!str2.equals("content_language_already_popup")) {
                                    return false;
                                }
                                Object read47 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read47 != null) {
                                    ((User) obj).isContentLanguageDialogShown = ((Boolean) read47).booleanValue();
                                }
                                return true;
                            case -745704582:
                                if (!str2.equals("profile_tab_type")) {
                                    return false;
                                }
                                Object read48 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read48 != null) {
                                    ((User) obj).tabType = ((Integer) read48).intValue();
                                }
                                return true;
                            case -720364372:
                                if (!str2.equals("need_points")) {
                                    return false;
                                }
                                ((User) obj).needPoints = (List) this.LIZ.LIZ(new C79480VHg()).read(c65385PlN);
                                return true;
                            case -712365810:
                                if (!str2.equals("mutual_relation_num")) {
                                    return false;
                                }
                                Object read49 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read49 != null) {
                                    ((User) obj).mutualRelationNumber = ((Integer) read49).intValue();
                                }
                                return true;
                            case -712360670:
                                if (!str2.equals("mutual_relation_tag")) {
                                    return false;
                                }
                                ((User) obj).mutualRelationTag = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -690358626:
                                if (!str2.equals("youtube_last_refresh_time")) {
                                    return false;
                                }
                                Object read50 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read50 != null) {
                                    ((User) obj).youTubeLastRefreshTime = ((Long) read50).longValue();
                                }
                                return true;
                            case -688758211:
                                if (!str2.equals("avatar_larger")) {
                                    return false;
                                }
                                ((User) obj).avatarLarger = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -656849637:
                                if (!str2.equals("avatar_medium")) {
                                    return false;
                                }
                                ((User) obj).avatarMedium = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -652446311:
                                if (!str2.equals("download_setting")) {
                                    return false;
                                }
                                Object read51 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read51 != null) {
                                    ((User) obj).downloadSetting = ((Integer) read51).intValue();
                                }
                                return true;
                            case -624934883:
                                if (!str2.equals("video_gift_status")) {
                                    return false;
                                }
                                Object read52 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read52 != null) {
                                    ((User) obj).videoGiftStatus = ((Integer) read52).intValue();
                                }
                                return true;
                            case -616752907:
                                if (!str2.equals("show_messaging_entrance_on_profile")) {
                                    return false;
                                }
                                Object read53 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read53 != null) {
                                    ((User) obj).isShowMessageEntrance = ((Boolean) read53).booleanValue();
                                }
                                return true;
                            case -604050733:
                                if (!str2.equals("is_geo_blocked_profile")) {
                                    return false;
                                }
                                Object read54 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read54 != null) {
                                    ((User) obj).isGeoBlocked = ((Boolean) read54).booleanValue();
                                }
                                return true;
                            case -601407516:
                                if (!str2.equals("block_status")) {
                                    return false;
                                }
                                Object read55 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read55 != null) {
                                    ((User) obj).blockStatus = ((Integer) read55).intValue();
                                }
                                return true;
                            case -571048290:
                                if (!str2.equals("with_douplus_entry")) {
                                    return false;
                                }
                                Object read56 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read56 != null) {
                                    ((User) obj).withDouplusEntry = ((Boolean) read56).booleanValue();
                                }
                                return true;
                            case -568807568:
                                if (!str2.equals("avatar_thumb")) {
                                    return false;
                                }
                                ((User) obj).avatarThumb = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -538310583:
                                if (!str2.equals("unique_id")) {
                                    return false;
                                }
                                ((User) obj).uniqueId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -526326590:
                                if (!str2.equals("stitch_setting")) {
                                    return false;
                                }
                                Object read57 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read57 != null) {
                                    ((User) obj).stitchSetting = ((Integer) read57).intValue();
                                }
                                return true;
                            case -515940741:
                                if (!str2.equals("notify_private_account")) {
                                    return false;
                                }
                                Object read58 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read58 != null) {
                                    ((User) obj).notifyPrivateAccount = ((Integer) read58).intValue();
                                }
                                return true;
                            case -508975030:
                                if (!str2.equals("show_effect_list")) {
                                    return false;
                                }
                                Object read59 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read59 != null) {
                                    ((User) obj).showEffectList = ((Boolean) read59).booleanValue();
                                }
                                return true;
                            case -502553757:
                                if (!str2.equals("honor_info")) {
                                    return false;
                                }
                                ((User) obj).honorStruct = (HonorStruct) this.LIZ.LIZIZ(HonorStruct.class).read(c65385PlN);
                                return true;
                            case -493574096:
                                if (!str2.equals("create_time")) {
                                    return false;
                                }
                                ((User) obj).createTime = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                return true;
                            case -485378688:
                                if (!str2.equals("pay_grade")) {
                                    return false;
                                }
                                ((User) obj).userHonor = (UserHonor) this.LIZ.LIZIZ(UserHonor.class).read(c65385PlN);
                                return true;
                            case -481549195:
                                if (!str2.equals("registerStatus")) {
                                    return false;
                                }
                                Object read60 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read60 != null) {
                                    ((User) obj).registerStatus = ((Integer) read60).intValue();
                                }
                                return true;
                            case -479476846:
                                if (!str2.equals("commerce_info")) {
                                    return false;
                                }
                                ((User) obj).commerceInfo = (CommerceInfo) this.LIZ.LIZIZ(CommerceInfo.class).read(c65385PlN);
                                return true;
                            case -442503373:
                                if (!str2.equals("follower_status")) {
                                    return false;
                                }
                                Object read61 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read61 != null) {
                                    ((User) obj).followerStatus = ((Integer) read61).intValue();
                                }
                                return true;
                            case -431762092:
                                if (!str2.equals("advanced_feature_info")) {
                                    return false;
                                }
                                ((User) obj).advancedFeatureInfo = (AdvancedFeatureInfo[]) this.LIZ.LIZIZ(AdvancedFeatureInfo[].class).read(c65385PlN);
                                return true;
                            case -417519034:
                                if (!str2.equals("name_field")) {
                                    return false;
                                }
                                ((User) obj).nameField = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -409569971:
                                if (!str2.equals("sprint_support_user_info")) {
                                    return false;
                                }
                                ((User) obj).sprintSupportUserInfo = (HotSearchSprintStruct) this.LIZ.LIZIZ(HotSearchSprintStruct.class).read(c65385PlN);
                                return true;
                            case -342504514:
                                if (!str2.equals("short_id")) {
                                    return false;
                                }
                                ((User) obj).shortId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -290756696:
                                if (!str2.equals("education")) {
                                    return false;
                                }
                                Object read62 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read62 != null) {
                                    ((User) obj).education = ((Integer) read62).intValue();
                                }
                                return true;
                            case -290620080:
                                if (!str2.equals("hot_list")) {
                                    return false;
                                }
                                ((User) obj).mHotListStruct = (HotListStruct) this.LIZ.LIZIZ(HotListStruct.class).read(c65385PlN);
                                return true;
                            case -271209848:
                                if (!str2.equals("show_artist_playlist")) {
                                    return false;
                                }
                                Object read63 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read63 != null) {
                                    ((User) obj).showArtistPlaylist = ((Integer) read63).intValue();
                                }
                                return true;
                            case -255577734:
                                if (!str2.equals("video_unread_info")) {
                                    return false;
                                }
                                ((User) obj).unReadVideoInfo = (UnReadVideoInfo) this.LIZ.LIZIZ(UnReadVideoInfo.class).read(c65385PlN);
                                return true;
                            case -249774923:
                                if (!str2.equals("user_period")) {
                                    return false;
                                }
                                Object read64 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read64 != null) {
                                    ((User) obj).userPeriod = ((Integer) read64).intValue();
                                }
                                return true;
                            case -241577870:
                                if (!str2.equals("complete_profile_guide_strategy")) {
                                    return false;
                                }
                                Object read65 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read65 != null) {
                                    ((User) obj).completeProfileGuideStrategy = ((Integer) read65).intValue();
                                }
                                return true;
                            case -218847220:
                                if (!str2.equals("mixListNum")) {
                                    return false;
                                }
                                Object read66 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read66 != null) {
                                    ((User) obj).mixListNum = ((Integer) read66).intValue();
                                }
                                return true;
                            case -200000462:
                                if (!str2.equals("profile_completion")) {
                                    return false;
                                }
                                Object read67 = this.LIZ.LIZIZ(Float.class).read(c65385PlN);
                                if (read67 != null) {
                                    ((User) obj).profileCompletion = ((Float) read67).floatValue();
                                }
                                return true;
                            case -180337243:
                                if (!str2.equals("bio_email")) {
                                    return false;
                                }
                                ((User) obj).bioEmail = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -170313865:
                                if (!str2.equals("bio_phone")) {
                                    return false;
                                }
                                ((User) obj).bioPhone = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -107434568:
                                if (!str2.equals("bio_url")) {
                                    return false;
                                }
                                ((User) obj).bioUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -89527382:
                                if (!str2.equals("with_star_atlas_entry")) {
                                    return false;
                                }
                                Object read68 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read68 != null) {
                                    ((User) obj).withStarAtlasEntry = ((Boolean) read68).booleanValue();
                                }
                                return true;
                            case -79766337:
                                if (!str2.equals("original_musician")) {
                                    return false;
                                }
                                ((User) obj).originalMusician = (OriginalMusician) this.LIZ.LIZIZ(OriginalMusician.class).read(c65385PlN);
                                return true;
                            case -75701030:
                                if (!str2.equals("mAtType")) {
                                    return false;
                                }
                                Object read69 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read69 != null) {
                                    ((User) obj).mAtType = ((Integer) read69).intValue();
                                }
                                return true;
                            case -74098991:
                                if (!str2.equals("youtube_expire_time")) {
                                    return false;
                                }
                                Object read70 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read70 != null) {
                                    ((User) obj).youtubeExpireTime = ((Long) read70).longValue();
                                }
                                return true;
                            case -73191438:
                                if (!str2.equals("music_tab_info")) {
                                    return false;
                                }
                                ((User) obj).musicTabInfo = (MusicTabInfo) this.LIZ.LIZIZ(MusicTabInfo.class).read(c65385PlN);
                                return true;
                            case -72622451:
                                if (!str2.equals("user_canceled")) {
                                    return false;
                                }
                                Object read71 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read71 != null) {
                                    ((User) obj).userCancelled = ((Boolean) read71).booleanValue();
                                }
                                return true;
                            case -72255446:
                                if (!str2.equals("contacts_sync_status")) {
                                    return false;
                                }
                                Object read72 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read72 != null) {
                                    ((User) obj).contactsSyncStatus = ((Boolean) read72).booleanValue();
                                }
                                return true;
                            case -68630535:
                                if (!str2.equals("room_type_tag")) {
                                    return false;
                                }
                                ((User) obj).roomTypeTag = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -65183979:
                                if (!str2.equals("forward_count")) {
                                    return false;
                                }
                                Object read73 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read73 != null) {
                                    ((User) obj).repostCount = ((Integer) read73).intValue();
                                }
                                return true;
                            case -58995097:
                                if (!str2.equals("twitter_id")) {
                                    return false;
                                }
                                ((User) obj).twitterId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -18487744:
                                if (!str2.equals("avatar_pendant_larger")) {
                                    return false;
                                }
                                ((User) obj).avatarPendantLarger = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case -11397587:
                                if (!str2.equals("new_follower_count")) {
                                    return false;
                                }
                                Object read74 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read74 != null) {
                                    ((User) obj).newFollowerCount = ((Integer) read74).intValue();
                                }
                                return true;
                            case 112909:
                                if (!str2.equals("rid")) {
                                    return false;
                                }
                                ((User) obj).requestId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 115792:
                                if (!str2.equals("uid")) {
                                    return false;
                                }
                                ((User) obj).uid = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 3053931:
                                if (!str2.equals("city")) {
                                    return false;
                                }
                                ((User) obj).cityName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 6855211:
                                if (!str2.equals("signature_modify_time")) {
                                    return false;
                                }
                                Object read75 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read75 != null) {
                                    ((User) obj).signatureModifyTime = ((Integer) read75).intValue();
                                }
                                return true;
                            case 11461418:
                                if (!str2.equals("show_user_ban_dialog")) {
                                    return false;
                                }
                                Object read76 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read76 != null) {
                                    ((User) obj).showUserBanDialog = ((Boolean) read76).booleanValue();
                                }
                                return true;
                            case 13420830:
                                if (!str2.equals("avatar_pendant_medium")) {
                                    return false;
                                }
                                ((User) obj).avatarPendantMedium = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 13790513:
                                if (!str2.equals("normal_top_comment_permission")) {
                                    return false;
                                }
                                Object read77 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read77 != null) {
                                    ((User) obj).normalTopCommentPermission = ((Integer) read77).intValue();
                                }
                                return true;
                            case 17069893:
                                if (!str2.equals("hide_search")) {
                                    return false;
                                }
                                Object read78 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read78 != null) {
                                    ((User) obj).hideSearch = ((Boolean) read78).booleanValue();
                                }
                                return true;
                            case 29127543:
                                if (!str2.equals("user_now_pack_info")) {
                                    return false;
                                }
                                ((User) obj).userNowPackStruct = (UserNowPackStruct) this.LIZ.LIZIZ(UserNowPackStruct.class).read(c65385PlN);
                                return true;
                            case 34400533:
                                if (!str2.equals("with_commerce_enterprise_tab_entry")) {
                                    return false;
                                }
                                Object read79 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read79 != null) {
                                    ((User) obj).withCommerceEnterpriseTabEntry = ((Boolean) read79).booleanValue();
                                }
                                return true;
                            case 35174838:
                                if (!str2.equals("taggedBAInvitationStatus")) {
                                    return false;
                                }
                                Object read80 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read80 != null) {
                                    ((User) obj).taggedBAInvitationStatus = ((Integer) read80).intValue();
                                }
                                return true;
                            case 40914635:
                                if (!str2.equals("analytics_status")) {
                                    return false;
                                }
                                Object read81 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read81 != null) {
                                    ((User) obj).hasAnalyticsMetrics = ((Boolean) read81).booleanValue();
                                }
                                return true;
                            case 50511102:
                                if (!str2.equals("category")) {
                                    return false;
                                }
                                ((User) obj).category = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 57304503:
                                if (!str2.equals("has_email")) {
                                    return false;
                                }
                                Object read82 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read82 != null) {
                                    ((User) obj).hasEmail = ((Boolean) read82).booleanValue();
                                }
                                return true;
                            case 70438958:
                                if (!str2.equals("friend_count")) {
                                    return false;
                                }
                                Object read83 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read83 != null) {
                                    ((User) obj).friendCount = ((Integer) read83).intValue();
                                }
                                return true;
                            case 70690926:
                                if (!str2.equals("nickname")) {
                                    return false;
                                }
                                ((User) obj).nickname = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 75216479:
                                if (!str2.equals("user_inactive")) {
                                    return false;
                                }
                                Object read84 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read84 != null) {
                                    ((User) obj).userInactive = ((Boolean) read84).booleanValue();
                                }
                                return true;
                            case 89298338:
                                if (!str2.equals("user_experiments")) {
                                    return false;
                                }
                                ((User) obj).profileUserExperiments = (ProfileUserExperiments) this.LIZ.LIZIZ(ProfileUserExperiments.class).read(c65385PlN);
                                return true;
                            case 96619420:
                                if (!str2.equals("email")) {
                                    return false;
                                }
                                ((User) obj).email = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 98324972:
                                if (!str2.equals("display_addyours_on_profile")) {
                                    return false;
                                }
                                Object read85 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read85 != null) {
                                    ((User) obj).displayAddYoursOnProfile = ((Integer) read85).intValue();
                                }
                                return true;
                            case 106772540:
                                if (!str2.equals("unique_id_modify_time")) {
                                    return false;
                                }
                                Object read86 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read86 != null) {
                                    ((User) obj).uniqueIdModifyTime = ((Long) read86).longValue();
                                }
                                return true;
                            case 108801336:
                                if (!str2.equals("is_block")) {
                                    return false;
                                }
                                Object read87 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read87 != null) {
                                    ((User) obj).isBlock = ((Boolean) read87).booleanValue();
                                }
                                return true;
                            case 109542336:
                                if (!str2.equals("is_email_verified")) {
                                    return false;
                                }
                                Object read88 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read88 != null) {
                                    ((User) obj).isEmailVerified = ((Boolean) read88).booleanValue();
                                }
                                return true;
                            case 112524457:
                                if (!str2.equals("favoriting_count")) {
                                    return false;
                                }
                                Object read89 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read89 != null) {
                                    ((User) obj).favoritingCount = ((Integer) read89).intValue();
                                }
                                return true;
                            case 173749426:
                                if (!str2.equals("is_user_data_miss")) {
                                    return false;
                                }
                                Object read90 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read90 != null) {
                                    ((User) obj).isUserDataMiss = ((Boolean) read90).booleanValue();
                                }
                                return true;
                            case 211298865:
                                if (!str2.equals("tw_expire_time")) {
                                    return false;
                                }
                                Object read91 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read91 != null) {
                                    ((User) obj).twExpireTime = ((Long) read91).longValue();
                                }
                                return true;
                            case 240621757:
                                if (!str2.equals("user_rate_remind_info")) {
                                    return false;
                                }
                                ((User) obj).userRateRemindInfo = (UserRateRemindInfo) this.LIZ.LIZIZ(UserRateRemindInfo.class).read(c65385PlN);
                                return true;
                            case 286660723:
                                if (!str2.equals("youtube_channel_id")) {
                                    return false;
                                }
                                ((User) obj).youtubeChannelId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 288961422:
                                if (!str2.equals("district")) {
                                    return false;
                                }
                                ((User) obj).district = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 299444286:
                                if (!str2.equals("commerce_user_info")) {
                                    return false;
                                }
                                ((User) obj).commerceUserInfo = (CommerceUserInfo) this.LIZ.LIZIZ(CommerceUserInfo.class).read(c65385PlN);
                                return true;
                            case 326992348:
                                if (!str2.equals("friends_status")) {
                                    return false;
                                }
                                Object read92 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read92 != null) {
                                    ((User) obj).friendsStatus = ((Integer) read92).intValue();
                                }
                                return true;
                            case 339324311:
                                if (!str2.equals("user_mode")) {
                                    return false;
                                }
                                Object read93 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read93 != null) {
                                    ((User) obj).userMode = ((Integer) read93).intValue();
                                }
                                return true;
                            case 339460308:
                                if (!str2.equals("user_rate")) {
                                    return false;
                                }
                                Object read94 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read94 != null) {
                                    ((User) obj).userRate = ((Integer) read94).intValue();
                                }
                                return true;
                            case 346692344:
                                if (!str2.equals("predicted_age_group")) {
                                    return false;
                                }
                                ((User) obj).predictedAgeGroup = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 347638748:
                                if (!str2.equals("is_ad_fake")) {
                                    return false;
                                }
                                Object read95 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read95 != null) {
                                    ((User) obj).isAdFake = ((Boolean) read95).booleanValue();
                                }
                                return true;
                            case 353901720:
                                if (!str2.equals("tt_mall_tab_related_user_info")) {
                                    return false;
                                }
                                ((User) obj).mallTabUserInfo = (TTMallTabRelatedUserInfo) this.LIZ.LIZIZ(TTMallTabRelatedUserInfo.class).read(c65385PlN);
                                return true;
                            case 387319941:
                                if (!str2.equals("quick_shop_info")) {
                                    return false;
                                }
                                ((User) obj).quickShopInfo = (QuickShopInfo) this.LIZ.LIZIZ(QuickShopInfo.class).read(c65385PlN);
                                return true;
                            case 411489521:
                                if (!str2.equals("room_id_str")) {
                                    return false;
                                }
                                ((User) obj).roomIdStr = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 454391455:
                                if (!str2.equals("relation_ship")) {
                                    return false;
                                }
                                ((User) obj).relationShip = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 458536417:
                                if (!str2.equals("following_count")) {
                                    return false;
                                }
                                Object read96 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read96 != null) {
                                    ((User) obj).followingCount = ((Integer) read96).intValue();
                                }
                                return true;
                            case 464202942:
                                if (!str2.equals("add_yours_invited")) {
                                    return false;
                                }
                                ((User) obj).addYoursInvited = (Boolean) this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                return true;
                            case 470277584:
                                if (!str2.equals("video_view_type")) {
                                    return false;
                                }
                                Object read97 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read97 != null) {
                                    ((User) obj).viewerType = ((Integer) read97).intValue();
                                }
                                return true;
                            case 512193130:
                                if (!str2.equals("ags_warning")) {
                                    return false;
                                }
                                ((User) obj).agsWarning = (AGSWarning) this.LIZ.LIZIZ(AGSWarning.class).read(c65385PlN);
                                return true;
                            case 532303174:
                                if (!str2.equals("isNewRecommend")) {
                                    return false;
                                }
                                Object read98 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read98 != null) {
                                    ((User) obj).isNewRecommend = ((Boolean) read98).booleanValue();
                                }
                                return true;
                            case 546093690:
                                if (!str2.equals("message_config")) {
                                    return false;
                                }
                                Object read99 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read99 != null) {
                                    ((User) obj).messageConfig = ((Integer) read99).intValue();
                                }
                                return true;
                            case 546431750:
                                if (!str2.equals("is_pro_account")) {
                                    return false;
                                }
                                Object read100 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read100 != null) {
                                    ((User) obj).isProAccount = ((Boolean) read100).booleanValue();
                                }
                                return true;
                            case 555936345:
                                if (!str2.equals("enable_subscription")) {
                                    return false;
                                }
                                Object read101 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read101 != null) {
                                    ((User) obj).enableSubscription = ((Boolean) read101).booleanValue();
                                }
                                return true;
                            case 561192717:
                                if (!str2.equals("avatar_pendant_thumb")) {
                                    return false;
                                }
                                ((User) obj).avatarPendantThumb = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 565680874:
                                if (!str2.equals("fb_expire_time")) {
                                    return false;
                                }
                                Object read102 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read102 != null) {
                                    ((User) obj).fbExpireTime = ((Long) read102).longValue();
                                }
                                return true;
                            case 575448195:
                                if (!str2.equals("friend_tab_related_user_info")) {
                                    return false;
                                }
                                ((User) obj).friendsTabInfo = (FriendsTabRelatedUserInfo) this.LIZ.LIZIZ(FriendsTabRelatedUserInfo.class).read(c65385PlN);
                                return true;
                            case 583435343:
                                if (!str2.equals("is_translator")) {
                                    return false;
                                }
                                Object read103 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read103 != null) {
                                    ((User) obj).isTranslator = ((Boolean) read103).booleanValue();
                                }
                                return true;
                            case 585629423:
                                if (!str2.equals("ad_virtual")) {
                                    return false;
                                }
                                Object read104 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read104 != null) {
                                    ((User) obj).isAdVirtual = ((Boolean) read104).booleanValue();
                                }
                                return true;
                            case 594541646:
                                if (!str2.equals("shield_comment_notice")) {
                                    return false;
                                }
                                Object read105 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read105 != null) {
                                    ((User) obj).shieldCommentNotice = ((Integer) read105).intValue();
                                }
                                return true;
                            case 615770241:
                                if (!str2.equals("age_gate_post_action")) {
                                    return false;
                                }
                                Object read106 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read106 != null) {
                                    ((User) obj).ageGatePostAction = ((Integer) read106).intValue();
                                }
                                return true;
                            case 619619035:
                                if (!str2.equals("private_aweme_count")) {
                                    return false;
                                }
                                Object read107 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read107 != null) {
                                    ((User) obj).privateAwemeCount = ((Integer) read107).intValue();
                                }
                                return true;
                            case 642718792:
                                if (!str2.equals("ad_order_id")) {
                                    return false;
                                }
                                ((User) obj).adOrderId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 644483340:
                                if (!str2.equals("show_tip_entry")) {
                                    return false;
                                }
                                Object read108 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read108 != null) {
                                    ((User) obj).showTipEntry = ((Boolean) read108).booleanValue();
                                }
                                return true;
                            case 651327057:
                                if (!str2.equals("account_labels")) {
                                    return false;
                                }
                                ((User) obj).accountLabelInfos = (List) this.LIZ.LIZ(new C79479VHf()).read(c65385PlN);
                                return true;
                            case 695355892:
                                if (!str2.equals("commerce_user_level")) {
                                    return false;
                                }
                                Object read109 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read109 != null) {
                                    ((User) obj).commerceUserLevel = ((Integer) read109).intValue();
                                }
                                return true;
                            case 729260866:
                                if (!str2.equals("avatar_meta_info")) {
                                    return false;
                                }
                                ((User) obj).avatarMeta = (AvatarMetaInfo) this.LIZ.LIZIZ(AvatarMetaInfo.class).read(c65385PlN);
                                return true;
                            case 763686755:
                                if (!str2.equals("can_modify_school_info")) {
                                    return false;
                                }
                                Object read110 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read110 != null) {
                                    ((User) obj).canModifySchoolInfo = ((Boolean) read110).booleanValue();
                                }
                                return true;
                            case 780015372:
                                if (!str2.equals("has_open_favorite")) {
                                    return false;
                                }
                                Object read111 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read111 != null) {
                                    ((User) obj).hasOpenFavorite = ((Boolean) read111).booleanValue();
                                }
                                return true;
                            case 820775883:
                                if (!str2.equals("ad_cover_url")) {
                                    return false;
                                }
                                ((User) obj).adCoverUrl = (List) this.LIZ.LIZ(new OG1()).read(c65385PlN);
                                return true;
                            case 826948934:
                                if (!str2.equals("account_region")) {
                                    return false;
                                }
                                ((User) obj).accountRegion = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 866022340:
                                if (!str2.equals("mMentionEnabled")) {
                                    return false;
                                }
                                Object read112 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read112 != null) {
                                    ((User) obj).mMentionEnabled = ((Boolean) read112).booleanValue();
                                }
                                return true;
                            case 879732277:
                                if (!str2.equals("need_addr_card")) {
                                    return false;
                                }
                                Object read113 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read113 != null) {
                                    ((User) obj).needAddrCard = ((Boolean) read113).booleanValue();
                                }
                                return true;
                            case 932059910:
                                if (!str2.equals("platform_sync_info")) {
                                    return false;
                                }
                                ((User) obj).platformInfos = (PlatformInfo[]) this.LIZ.LIZIZ(PlatformInfo[].class).read(c65385PlN);
                                return true;
                            case 943699016:
                                if (!str2.equals("has_twitter_token")) {
                                    return false;
                                }
                                Object read114 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read114 != null) {
                                    ((User) obj).hasTwitterToken = ((Boolean) read114).booleanValue();
                                }
                                return true;
                            case 948119890:
                                if (!str2.equals("shield_edit_field_info")) {
                                    return false;
                                }
                                ((User) obj).shieldEditFieldInfoList = (List) this.LIZ.LIZ(new VIR()).read(c65385PlN);
                                return true;
                            case 955552738:
                                if (!str2.equals("maf_count")) {
                                    return false;
                                }
                                Object read115 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read115 != null) {
                                    ((User) obj).mafRedCount = ((Integer) read115).intValue();
                                }
                                return true;
                            case 957831062:
                                if (!str2.equals("country")) {
                                    return false;
                                }
                                ((User) obj).country = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 960777111:
                                if (!str2.equals("aweme_count")) {
                                    return false;
                                }
                                Object read116 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read116 != null) {
                                    ((User) obj).awemeCount = ((Integer) read116).intValue();
                                }
                                return true;
                            case 960777791:
                                if (!str2.equals("aweme_cover")) {
                                    return false;
                                }
                                ((User) obj).awemeCover = (UserAwemeCover) this.LIZ.LIZIZ(UserAwemeCover.class).read(c65385PlN);
                                return true;
                            case 985976065:
                                if (!str2.equals("qa_status")) {
                                    return false;
                                }
                                Object read117 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read117 != null) {
                                    ((User) obj).qnaStatus = ((Integer) read117).intValue();
                                }
                                return true;
                            case 990239621:
                                if (!str2.equals("accept_private_policy")) {
                                    return false;
                                }
                                Object read118 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read118 != null) {
                                    ((User) obj).acceptPrivatePolicy = ((Boolean) read118).booleanValue();
                                }
                                return true;
                            case 1000427603:
                                if (!str2.equals("need_recommend")) {
                                    return false;
                                }
                                Object read119 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read119 != null) {
                                    ((User) obj).needRecommend = ((Boolean) read119).booleanValue();
                                }
                                return true;
                            case 1012728987:
                                if (!str2.equals("allowStatus")) {
                                    return false;
                                }
                                Object read120 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read120 != null) {
                                    ((User) obj).allowStatus = ((Integer) read120).intValue();
                                }
                                return true;
                            case 1021433311:
                                if (!str2.equals("shop_entrance")) {
                                    return false;
                                }
                                ((User) obj).shopEntrance = (ShopEntranceInfo) this.LIZ.LIZIZ(ShopEntranceInfo.class).read(c65385PlN);
                                return true;
                            case 1028143168:
                                if (!str2.equals("follow_status")) {
                                    return false;
                                }
                                Object read121 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read121 != null) {
                                    ((User) obj).followStatus = ((Integer) read121).intValue();
                                }
                                return true;
                            case 1046635819:
                                if (!str2.equals("dsp_profile")) {
                                    return false;
                                }
                                ((User) obj).dspProfile = (DspProfile) this.LIZ.LIZIZ(DspProfile.class).read(c65385PlN);
                                return true;
                            case 1052233881:
                                if (!str2.equals("privacy_setting")) {
                                    return false;
                                }
                                ((User) obj).privacySetting = (PrivacySetting) this.LIZ.LIZIZ(PrivacySetting.class).read(c65385PlN);
                                return true;
                            case 1058644030:
                                if (!str2.equals("bio_secure_url")) {
                                    return false;
                                }
                                ((User) obj).bioSecureUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1069376125:
                                if (!str2.equals("birthday")) {
                                    return false;
                                }
                                ((User) obj).birthday = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1073584312:
                                if (!str2.equals("signature")) {
                                    return false;
                                }
                                ((User) obj).signature = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1080577994:
                                if (!str2.equals("badge_info")) {
                                    return false;
                                }
                                ((User) obj).mProfileBadgeStruct = (ProfileBadgeStruct) this.LIZ.LIZIZ(ProfileBadgeStruct.class).read(c65385PlN);
                                return true;
                            case 1091441164:
                                if (!str2.equals("account_type")) {
                                    return false;
                                }
                                Object read122 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read122 != null) {
                                    ((User) obj).accountType = ((Integer) read122).intValue();
                                }
                                return true;
                            case 1104050943:
                                if (!str2.equals("signature_language")) {
                                    return false;
                                }
                                ((User) obj).signatureLanguage = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1120251417:
                                if (!str2.equals("matched_friend")) {
                                    return false;
                                }
                                ((User) obj).matchedFriendStruct = (MatchedFriendStruct) this.LIZ.LIZIZ(MatchedFriendStruct.class).read(c65385PlN);
                                return true;
                            case 1120576213:
                                if (!str2.equals("relative_users")) {
                                    return false;
                                }
                                ((User) obj).relativeUserInfos = (List) this.LIZ.LIZ(new C69863RbP()).read(c65385PlN);
                                return true;
                            case 1120628639:
                                if (!str2.equals("show_favorite_list")) {
                                    return false;
                                }
                                Object read123 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read123 != null) {
                                    ((User) obj).showFavoriteList = ((Boolean) read123).booleanValue();
                                }
                                return true;
                            case 1133720929:
                                if (!str2.equals("display_wvalantine_activity_entry")) {
                                    return false;
                                }
                                Object read124 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read124 != null) {
                                    ((User) obj).displayWvalantineActivityEntry = ((Boolean) read124).booleanValue();
                                }
                                return true;
                            case 1194553073:
                                if (!str2.equals("relation_label")) {
                                    return false;
                                }
                                ((User) obj).relationLabel = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1211562848:
                                if (!str2.equals("is_effect_artist")) {
                                    return false;
                                }
                                Object read125 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read125 != null) {
                                    ((User) obj).isEffectArtist = ((Boolean) read125).booleanValue();
                                }
                                return true;
                            case 1221969527:
                                if (!str2.equals("live_agreement")) {
                                    return false;
                                }
                                Object read126 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read126 != null) {
                                    ((User) obj).liveAgreement = ((Integer) read126).intValue();
                                }
                                return true;
                            case 1230430956:
                                if (!str2.equals("bind_phone")) {
                                    return false;
                                }
                                ((User) obj).bindPhone = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1241278727:
                                if (!str2.equals("custom_verify")) {
                                    return false;
                                }
                                ((User) obj).customVerify = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1252885563:
                                if (!str2.equals("with_commerce_newbie_task")) {
                                    return false;
                                }
                                Object read127 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read127 != null) {
                                    ((User) obj).withCommerceNewbieTask = ((Boolean) read127).booleanValue();
                                }
                                return true;
                            case 1255008083:
                                if (!str2.equals("room_cover")) {
                                    return false;
                                }
                                ((User) obj).roomCover = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 1256845560:
                                if (!str2.equals("has_youtube_token")) {
                                    return false;
                                }
                                Object read128 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read128 != null) {
                                    ((User) obj).hasYoutubeToken = ((Boolean) read128).booleanValue();
                                }
                                return true;
                            case 1264119945:
                                if (!str2.equals("login_platform")) {
                                    return false;
                                }
                                Object read129 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read129 != null) {
                                    ((User) obj).loginPlatform = ((Integer) read129).intValue();
                                }
                                return true;
                            case 1270527476:
                                if (!str2.equals("room_title")) {
                                    return false;
                                }
                                ((User) obj).roomTitle = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1277731658:
                                if (!str2.equals("contact_name")) {
                                    return false;
                                }
                                ((User) obj).contactName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1283776167:
                                if (!str2.equals("with_commerce_entry")) {
                                    return false;
                                }
                                Object read130 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read130 != null) {
                                    ((User) obj).withCommerceEntry = ((Boolean) read130).booleanValue();
                                }
                                return true;
                            case 1288514147:
                                if (!str2.equals("music_compliance_account")) {
                                    return false;
                                }
                                Object read131 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read131 != null) {
                                    ((User) obj).musicComplianceAccount = ((Integer) read131).intValue();
                                }
                                return true;
                            case 1344734741:
                                if (!str2.equals("authentication_info")) {
                                    return false;
                                }
                                ((User) obj).authenticationInfo = (LiveAuthenticationInfo) this.LIZ.LIZIZ(LiveAuthenticationInfo.class).read(c65385PlN);
                                return true;
                            case 1358635291:
                                if (!str2.equals("external_recommend_reason")) {
                                    return false;
                                }
                                ((User) obj).externalRecommendReasonStruct = (ExternalRecommendReasonStruct) this.LIZ.LIZIZ(ExternalRecommendReasonStruct.class).read(c65385PlN);
                                return true;
                            case 1370702579:
                                if (!str2.equals("video_cover")) {
                                    return false;
                                }
                                ((User) obj).videoCover = (VideoCover) this.LIZ.LIZIZ(VideoCover.class).read(c65385PlN);
                                return true;
                            case 1374088806:
                                if (!str2.equals("brand_info")) {
                                    return false;
                                }
                                ((User) obj).brandInfo = (BlueVBrandInfo) this.LIZ.LIZIZ(BlueVBrandInfo.class).read(c65385PlN);
                                return true;
                            case 1374856302:
                                if (!str2.equals("authority_status")) {
                                    return false;
                                }
                                Object read132 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read132 != null) {
                                    ((User) obj).authorityStatus = ((Long) read132).longValue();
                                }
                                return true;
                            case 1379892991:
                                if (!str2.equals("room_id")) {
                                    return false;
                                }
                                Object read133 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read133 != null) {
                                    ((User) obj).roomId = ((Long) read133).longValue();
                                }
                                return true;
                            case 1418717793:
                                if (!str2.equals("cha_list")) {
                                    return false;
                                }
                                ((User) obj).challengeList = (List) this.LIZ.LIZ(new C69882Rbi()).read(c65385PlN);
                                return true;
                            case 1456751824:
                                if (!str2.equals("shield_follow_notice")) {
                                    return false;
                                }
                                Object read134 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read134 != null) {
                                    ((User) obj).shieldFollowNotice = ((Integer) read134).intValue();
                                }
                                return true;
                            case 1478872023:
                                if (!str2.equals("is_blocked")) {
                                    return false;
                                }
                                Object read135 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read135 != null) {
                                    ((User) obj).isBlocked = ((Boolean) read135).booleanValue();
                                }
                                return true;
                            case 1495639316:
                                if (!str2.equals("live_push_notification_status")) {
                                    return false;
                                }
                                Object read136 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read136 != null) {
                                    ((User) obj).livePushNotificationStatus = ((Integer) read136).intValue();
                                }
                                return true;
                            case 1525037056:
                                if (!str2.equals("youtube_channel_title")) {
                                    return false;
                                }
                                ((User) obj).youtubeChannelTitle = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1528032884:
                                if (!str2.equals("is_discipline_member")) {
                                    return false;
                                }
                                Object read137 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read137 != null) {
                                    ((User) obj).isDisciplineMember = ((Boolean) read137).booleanValue();
                                }
                                return true;
                            case 1536327183:
                                if (!str2.equals("proaccount_update_notification_status")) {
                                    return false;
                                }
                                Object read138 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read138 != null) {
                                    ((User) obj).proAccountUpdateNotificationStatus = ((Integer) read138).intValue();
                                }
                                return true;
                            case 1542438973:
                                if (!str2.equals("last_active_time")) {
                                    return false;
                                }
                                ((User) obj).lastActiveTime = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                return true;
                            case 1579076896:
                                if (!str2.equals("commerce_permissions")) {
                                    return false;
                                }
                                ((User) obj).commercePermission = (CommercePermissionStruct) this.LIZ.LIZIZ(CommercePermissionStruct.class).read(c65385PlN);
                                return true;
                            case 1596210040:
                                if (!str2.equals("follow_from")) {
                                    return false;
                                }
                                Object read139 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read139 != null) {
                                    ((User) obj).followFrom = ((Integer) read139).intValue();
                                }
                                return true;
                            case 1638814131:
                                if (!str2.equals("bold_fields")) {
                                    return false;
                                }
                                ((User) obj).boldFields = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case 1656674238:
                                if (!str2.equals("with_new_goods")) {
                                    return false;
                                }
                                Object read140 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read140 != null) {
                                    ((User) obj).withNewGoods = ((Boolean) read140).booleanValue();
                                }
                                return true;
                            case 1656908660:
                                if (!str2.equals("history_max_follower_count")) {
                                    return false;
                                }
                                Object read141 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read141 != null) {
                                    ((User) obj).historyMaxFollowerCount = ((Integer) read141).intValue();
                                }
                                return true;
                            case 1663729878:
                                if (!str2.equals("latest_order_time")) {
                                    return false;
                                }
                                ((User) obj).latestOrderTime = (Long) this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                return true;
                            case 1667862549:
                                if (!str2.equals("visible_videos_count")) {
                                    return false;
                                }
                                Object read142 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read142 != null) {
                                    ((User) obj).visibleVideosCount = ((Integer) read142).intValue();
                                }
                                return true;
                            case 1683831550:
                                if (!str2.equals("yt_raw_token")) {
                                    return false;
                                }
                                ((User) obj).youtubeRawRefreshToken = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1684784764:
                                if (!str2.equals("story_status")) {
                                    return false;
                                }
                                Object read143 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read143 != null) {
                                    ((User) obj).storyStatus = ((Integer) read143).intValue();
                                }
                                return true;
                            case 1712661099:
                                if (!str2.equals("user_now_info")) {
                                    return false;
                                }
                                ((User) obj).userNowInfo = (UserNowInfo) this.LIZ.LIZIZ(UserNowInfo.class).read(c65385PlN);
                                return true;
                            case 1713761778:
                                if (!str2.equals("show_image_bubble")) {
                                    return false;
                                }
                                Object read144 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read144 != null) {
                                    ((User) obj).showImageBubble = ((Boolean) read144).booleanValue();
                                }
                                return true;
                            case 1717271820:
                                if (!str2.equals("bio_location")) {
                                    return false;
                                }
                                ((User) obj).bioLocation = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1726606679:
                                if (!str2.equals("nickname_update_reminder")) {
                                    return false;
                                }
                                Object read145 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read145 != null) {
                                    ((User) obj).nicknameUpdateReminder = ((Boolean) read145).booleanValue();
                                }
                                return true;
                            case 1730382932:
                                if (!str2.equals("navi_id")) {
                                    return false;
                                }
                                ((User) obj).naviId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1781166887:
                                if (!str2.equals("recommend_reason")) {
                                    return false;
                                }
                                ((User) obj).recommendReason = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1798034544:
                                if (!str2.equals("comment_setting")) {
                                    return false;
                                }
                                Object read146 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read146 != null) {
                                    ((User) obj).commentSetting = ((Integer) read146).intValue();
                                }
                                return true;
                            case 1840522208:
                                if (!str2.equals("has_insights")) {
                                    return false;
                                }
                                Object read147 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read147 != null) {
                                    ((User) obj).isCreater = ((Boolean) read147).booleanValue();
                                }
                                return true;
                            case 1918208455:
                                if (!str2.equals("mutual_relation")) {
                                    return false;
                                }
                                ((User) obj).mMutualStruct = (MutualStruct) this.LIZ.LIZIZ(MutualStruct.class).read(c65385PlN);
                                return true;
                            case 1923062090:
                                if (!str2.equals("supporting_ngo")) {
                                    return false;
                                }
                                ((User) obj).mProfileNgoStruct = (ProfileNgoStruct) this.LIZ.LIZIZ(ProfileNgoStruct.class).read(c65385PlN);
                                return true;
                            case 1935054394:
                                if (!str2.equals("follow_from_msg")) {
                                    return false;
                                }
                                ((User) obj).followFromMsg = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1969626978:
                                if (!str2.equals("sec_uid")) {
                                    return false;
                                }
                                ((User) obj).secUid = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1974061281:
                                if (!str2.equals("nickname_modify_time")) {
                                    return false;
                                }
                                Object read148 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read148 != null) {
                                    ((User) obj).nickNameModifyTs = ((Integer) read148).intValue();
                                }
                                return true;
                            case 1978716326:
                                if (!str2.equals("is_activity_user")) {
                                    return false;
                                }
                                Object read149 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read149 != null) {
                                    ((User) obj).isActivityUser = ((Boolean) read149).booleanValue();
                                }
                                return true;
                            case 1980077287:
                                if (!str2.equals("cover_url")) {
                                    return false;
                                }
                                ((User) obj).coverUrls = (List) this.LIZ.LIZ(new OG1()).read(c65385PlN);
                                return true;
                            case 1988146694:
                                if (!str2.equals("mplatform_followers_count")) {
                                    return false;
                                }
                                Object read150 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read150 != null) {
                                    ((User) obj).fansCount = ((Integer) read150).intValue();
                                }
                                return true;
                            case 1993449450:
                                if (!str2.equals("remark_name")) {
                                    return false;
                                }
                                ((User) obj).remarkName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 2005598237:
                                if (!str2.equals("shop_micro_app")) {
                                    return false;
                                }
                                ((User) obj).shopMicroApp = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 2058585720:
                                if (!str2.equals("gift_bag_status")) {
                                    return false;
                                }
                                Object read151 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read151 != null) {
                                    ((User) obj).giftBagStatus = ((Integer) read151).intValue();
                                }
                                return true;
                            case 2067434538:
                                if (!str2.equals("has_orders")) {
                                    return false;
                                }
                                Object read152 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read152 != null) {
                                    ((User) obj).hasOrders = ((Boolean) read152).booleanValue();
                                }
                                return true;
                            case 2082233415:
                                if (!str2.equals("is_star")) {
                                    return false;
                                }
                                Object read153 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read153 != null) {
                                    ((User) obj).isStar = ((Boolean) read153).booleanValue();
                                }
                                return true;
                            case 2099722677:
                                if (!str2.equals("nudge_guide_info")) {
                                    return false;
                                }
                                ((User) obj).nudgeGuideInfo = (NudgeGuideInfo) this.LIZ.LIZIZ(NudgeGuideInfo.class).read(c65385PlN);
                                return true;
                            case 2104163020:
                                if (!str2.equals("paid_content_banner_info_struct")) {
                                    return false;
                                }
                                ((User) obj).paidContentBannerSetting = (PaidContentBannerSetting) this.LIZ.LIZIZ(PaidContentBannerSetting.class).read(c65385PlN);
                                return true;
                            case 2121290772:
                                if (!str2.equals("recommend_reason_relation")) {
                                    return false;
                                }
                                ((User) obj).recommendReasonRelation = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            default:
                                return false;
                        }
                    }
                };
            case 1919530295:
                if (!str.equals("com/ss/android/ugc/aweme/base/model/UrlModel")) {
                    return null;
                }
                final C65427Pm3 c65427Pm37 = this.LJLIL;
                return new BaseAdapter(c65427Pm37) { // from class: com.ss.android.ugc.aweme.gsonopt.OptJsonAdapterFor$com$ss$android$ugc$aweme$base$model$UrlModel
                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final Object LIZIZ() {
                        return new UrlModel();
                    }

                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final boolean LIZJ(String str2, Object obj, C65385PlN c65385PlN) {
                        switch (str2.hashCode()) {
                            case -1316646415:
                                if (!str2.equals("file_hash")) {
                                    return false;
                                }
                                ((UrlModel) obj).fileHash = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1221029593:
                                if (!str2.equals("height")) {
                                    return false;
                                }
                                Object read = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read != null) {
                                    ((UrlModel) obj).height = ((Integer) read).intValue();
                                }
                                return true;
                            case -982448862:
                                if (!str2.equals("player_access_key")) {
                                    return false;
                                }
                                ((UrlModel) obj).aK = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -970411666:
                                if (!str2.equals("url_list")) {
                                    return false;
                                }
                                ((UrlModel) obj).urlList = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case -363404426:
                                if (!str2.equals("data_size")) {
                                    return false;
                                }
                                Object read2 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read2 != null) {
                                    ((UrlModel) obj).size = ((Long) read2).longValue();
                                }
                                return true;
                            case -169852017:
                                if (!str2.equals("url_key")) {
                                    return false;
                                }
                                ((UrlModel) obj).urlKey = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 116076:
                                if (!str2.equals("uri")) {
                                    return false;
                                }
                                ((UrlModel) obj).uri = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 113126854:
                                if (!str2.equals("width")) {
                                    return false;
                                }
                                Object read3 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read3 != null) {
                                    ((UrlModel) obj).width = ((Integer) read3).intValue();
                                }
                                return true;
                            default:
                                return false;
                        }
                    }
                };
            case 2038576990:
                if (!str.equals("com/ss/android/ugc/aweme/discover/model/Challenge")) {
                    return null;
                }
                final C65427Pm3 c65427Pm38 = this.LJLIL;
                return new BaseAdapter(c65427Pm38) { // from class: com.ss.android.ugc.aweme.gsonopt.OptJsonAdapterFor$com$ss$android$ugc$aweme$discover$model$Challenge
                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final Object LIZIZ() {
                        return new Challenge();
                    }

                    @Override // com.ss.android.ugc.aweme.gsonopt.BaseAdapter
                    public final boolean LIZJ(String str2, Object obj, C65385PlN c65385PlN) {
                        switch (str2.hashCode()) {
                            case -2079559207:
                                if (!str2.equals("sub_type")) {
                                    return false;
                                }
                                Object read = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read != null) {
                                    ((Challenge) obj).subType = ((Integer) read).intValue();
                                }
                                return true;
                            case -2075172810:
                                if (!str2.equals("hashtag_profile")) {
                                    return false;
                                }
                                ((Challenge) obj).challengeProfileUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -2000946467:
                                if (!str2.equals("search_highlight")) {
                                    return false;
                                }
                                ((Challenge) obj).mHighlightInfoList = (List) this.LIZ.LIZ(new C72070SQg()).read(c65385PlN);
                                return true;
                            case -1980445085:
                                if (!str2.equals("challenge_billboard")) {
                                    return false;
                                }
                                ((Challenge) obj).challengeBillboard = (ChallengeBillboard) this.LIZ.LIZIZ(ChallengeBillboard.class).read(c65385PlN);
                                return true;
                            case -1907063343:
                                if (!str2.equals("banner_list")) {
                                    return false;
                                }
                                ((Challenge) obj).commerceChallengeBannerList = (List) this.LIZ.LIZ(new SS1()).read(c65385PlN);
                                return true;
                            case -1906436081:
                                if (!str2.equals("is_hot_search")) {
                                    return false;
                                }
                                Object read2 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read2 != null) {
                                    ((Challenge) obj).isHotSearch = ((Integer) read2).intValue();
                                }
                                return true;
                            case -1870019747:
                                if (!str2.equals("sponsor_ad_label")) {
                                    return false;
                                }
                                ((Challenge) obj).sponsorAdLabel = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1788288754:
                                if (!str2.equals("share_info")) {
                                    return false;
                                }
                                ((Challenge) obj).shareInfo = (ShareInfo) this.LIZ.LIZIZ(ShareInfo.class).read(c65385PlN);
                                return true;
                            case -1624294830:
                                if (!str2.equals("link_text")) {
                                    return false;
                                }
                                ((Challenge) obj).linkText = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1624275873:
                                if (!str2.equals("link_type")) {
                                    return false;
                                }
                                Object read3 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read3 != null) {
                                    ((Challenge) obj).linkType = ((Integer) read3).intValue();
                                }
                                return true;
                            case -1538390714:
                                if (!str2.equals("start_color")) {
                                    return false;
                                }
                                ((Challenge) obj).starColor = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1534353675:
                                if (!str2.equals("view_count")) {
                                    return false;
                                }
                                Object read4 = this.LIZ.LIZIZ(Long.class).read(c65385PlN);
                                if (read4 != null) {
                                    ((Challenge) obj).viewCount = ((Long) read4).longValue();
                                }
                                return true;
                            case -1406328437:
                                if (!str2.equals("author")) {
                                    return false;
                                }
                                ((Challenge) obj).author = (User) this.LIZ.LIZIZ(User.class).read(c65385PlN);
                                return true;
                            case -1377687758:
                                if (!str2.equals("button")) {
                                    return false;
                                }
                                ((Challenge) obj).transfrom = (ChallengeTransform) this.LIZ.LIZIZ(ChallengeTransform.class).read(c65385PlN);
                                return true;
                            case -1337442736:
                                if (!str2.equals("is_commerce")) {
                                    return false;
                                }
                                Object read5 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read5 != null) {
                                    ((Challenge) obj).isCommerceAndValid = ((Boolean) read5).booleanValue();
                                }
                                return true;
                            case -1195408547:
                                if (!str2.equals("sticker_id")) {
                                    return false;
                                }
                                ((Challenge) obj).stickerId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -1194801875:
                                if (!str2.equals("module_type")) {
                                    return false;
                                }
                                Object read6 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read6 != null) {
                                    ((Challenge) obj).moduleType = ((Integer) read6).intValue();
                                }
                                return true;
                            case -1036130710:
                                if (!str2.equals("activity_type")) {
                                    return false;
                                }
                                Object read7 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read7 != null) {
                                    ((Challenge) obj).activityType = ((Integer) read7).intValue();
                                }
                                return true;
                            case -907987551:
                                if (!str2.equals("schema")) {
                                    return false;
                                }
                                ((Challenge) obj).schema = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -867217735:
                                if (!str2.equals("label_origin_author")) {
                                    return false;
                                }
                                ((Challenge) obj).originAuthor = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -857290975:
                                if (!str2.equals("background_gradient")) {
                                    return false;
                                }
                                ((Challenge) obj).mBackGroundGradient = (BackGroundGradient) this.LIZ.LIZIZ(BackGroundGradient.class).read(c65385PlN);
                                return true;
                            case -801115504:
                                if (!str2.equals("connect_music")) {
                                    return false;
                                }
                                ((Challenge) obj).connectMusics = (List) this.LIZ.LIZ(new C72109SRt()).read(c65385PlN);
                                return true;
                            case -767515345:
                                if (!str2.equals("allow_upload_cover")) {
                                    return false;
                                }
                                Object read8 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read8 != null) {
                                    ((Challenge) obj).allowUploadCover = ((Integer) read8).intValue();
                                }
                                return true;
                            case -687960961:
                                if (!str2.equals("mission_module")) {
                                    return false;
                                }
                                ((Challenge) obj).htcMissionModule = (HTCMissionModule) this.LIZ.LIZIZ(HTCMissionModule.class).read(c65385PlN);
                                return true;
                            case -428442457:
                                if (!str2.equals("is_status")) {
                                    return false;
                                }
                                Object read9 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read9 != null) {
                                    ((Challenge) obj).mStatus = ((Integer) read9).intValue();
                                }
                                return true;
                            case -376552028:
                                if (!str2.equals("rule_detail_url")) {
                                    return false;
                                }
                                ((Challenge) obj).ruleDetailUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case -245103450:
                                if (!str2.equals("announcement_info")) {
                                    return false;
                                }
                                ((Challenge) obj).challengeAnnouncement = (ChallengeAnnouncement) this.LIZ.LIZIZ(ChallengeAnnouncement.class).read(c65385PlN);
                                return true;
                            case -168253766:
                                if (!str2.equals("background_image_url")) {
                                    return false;
                                }
                                ((Challenge) obj).backgroundImageUrl = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 98494:
                                if (!str2.equals("cid")) {
                                    return false;
                                }
                                ((Challenge) obj).cid = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 114586:
                                if (!str2.equals("tag")) {
                                    return false;
                                }
                                Object read10 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read10 != null) {
                                    ((Challenge) obj).tag = ((Integer) read10).intValue();
                                }
                                return true;
                            case 3079825:
                                if (!str2.equals("desc")) {
                                    return false;
                                }
                                ((Challenge) obj).desc = (String) LIZ(new ReplaceLineEndAdapter(), String.class).read(c65385PlN);
                                return true;
                            case 3575610:
                                if (!str2.equals("type")) {
                                    return false;
                                }
                                Object read11 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read11 != null) {
                                    ((Challenge) obj).type = ((Integer) read11).intValue();
                                }
                                return true;
                            case 91527054:
                                if (!str2.equals("is_challenge")) {
                                    return false;
                                }
                                Object read12 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read12 != null) {
                                    ((Challenge) obj).isChallenge = ((Integer) read12).intValue();
                                }
                                return true;
                            case 104273777:
                                if (!str2.equals("mv_id")) {
                                    return false;
                                }
                                ((Challenge) obj).mvId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 178027524:
                                if (!str2.equals("profile_tag")) {
                                    return false;
                                }
                                ((Challenge) obj).profileTagUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 178851754:
                                if (!str2.equals("cover_photo")) {
                                    return false;
                                }
                                ((Challenge) obj).challengeBgUrl = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 432371099:
                                if (!str2.equals("disclaimer")) {
                                    return false;
                                }
                                ((Challenge) obj).challengeDisclaimer = (ChallengeDisclaimer) this.LIZ.LIZIZ(ChallengeDisclaimer.class).read(c65385PlN);
                                return true;
                            case 581261470:
                                if (!str2.equals("dynamic_list")) {
                                    return false;
                                }
                                ((Challenge) obj).dynamicPatchList = (List) this.LIZ.LIZ(new KP1()).read(c65385PlN);
                                return true;
                            case 693933066:
                                if (!str2.equals("requestId")) {
                                    return false;
                                }
                                ((Challenge) obj).requestId = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 747309248:
                                if (!str2.equals("extra_attr")) {
                                    return false;
                                }
                                ((Challenge) obj).extraAttrStruct = (ChallengeExtraAttrStruct) this.LIZ.LIZIZ(ChallengeExtraAttrStruct.class).read(c65385PlN);
                                return true;
                            case 796567005:
                                if (!str2.equals("sponsor_label_text")) {
                                    return false;
                                }
                                ((Challenge) obj).sponsorLabelText = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 831846208:
                                if (!str2.equals("content_type")) {
                                    return false;
                                }
                                Object read13 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read13 != null) {
                                    ((Challenge) obj).contentType = ((Integer) read13).intValue();
                                }
                                return true;
                            case 865267764:
                                if (!str2.equals("is_pgcshow")) {
                                    return false;
                                }
                                Object read14 = this.LIZ.LIZIZ(Boolean.class).read(c65385PlN);
                                if (read14 != null) {
                                    ((Challenge) obj).pgcshow = ((Boolean) read14).booleanValue();
                                }
                                return true;
                            case 957364330:
                                if (!str2.equals("related_media_source")) {
                                    return false;
                                }
                                ((Challenge) obj).mediaSource = (RelatedMediaSourceStruct) this.LIZ.LIZIZ(RelatedMediaSourceStruct.class).read(c65385PlN);
                                return true;
                            case 1020748607:
                                if (!str2.equals("cha_attrs")) {
                                    return false;
                                }
                                ((Challenge) obj).attrs = (List) this.LIZ.LIZ(new C51026K0w()).read(c65385PlN);
                                return true;
                            case 1116550142:
                                if (!str2.equals("show_items")) {
                                    return false;
                                }
                                ((Challenge) obj).showItems = (List) this.LIZ.LIZ(new SS2()).read(c65385PlN);
                                return true;
                            case 1186582995:
                                if (!str2.equals("link_title")) {
                                    return false;
                                }
                                ((Challenge) obj).linkTitle = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1211270396:
                                if (!str2.equals("rule_detail_desc")) {
                                    return false;
                                }
                                ((Challenge) obj).ruleDetailDesc = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1252498075:
                                if (!str2.equals("cover_item")) {
                                    return false;
                                }
                                ((Challenge) obj).coverItem = (UrlModel) this.LIZ.LIZIZ(UrlModel.class).read(c65385PlN);
                                return true;
                            case 1418769486:
                                if (!str2.equals("cha_name")) {
                                    return false;
                                }
                                ((Challenge) obj).challengeName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1626966089:
                                if (!str2.equals("collect_stat")) {
                                    return false;
                                }
                                Object read15 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read15 != null) {
                                    ((Challenge) obj).collectStatus = ((Integer) read15).intValue();
                                }
                                return true;
                            case 1708200196:
                                if (!str2.equals("related_challenges")) {
                                    return false;
                                }
                                ((Challenge) obj).relatedChallenges = (List) this.LIZ.LIZ(new C69882Rbi()).read(c65385PlN);
                                return true;
                            case 1724173170:
                                if (!str2.equals("is_strong_music")) {
                                    return false;
                                }
                                Object read16 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read16 != null) {
                                    ((Challenge) obj).isStrongMusic = ((Integer) read16).intValue();
                                }
                                return true;
                            case 1874837019:
                                if (!str2.equals("link_action")) {
                                    return false;
                                }
                                ((Challenge) obj).linkAction = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1919900571:
                                if (!str2.equals("user_count")) {
                                    return false;
                                }
                                Object read17 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read17 != null) {
                                    ((Challenge) obj).userCount = ((Integer) read17).intValue();
                                }
                                return true;
                            case 1930386693:
                                if (!str2.equals("search_cha_name")) {
                                    return false;
                                }
                                ((Challenge) obj).mSearchChaName = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1936968447:
                                if (!str2.equals("end_color")) {
                                    return false;
                                }
                                ((Challenge) obj).endColor = (String) this.LIZ.LIZIZ(String.class).read(c65385PlN);
                                return true;
                            case 1937030845:
                                if (!str2.equals("commerce_sub_type")) {
                                    return false;
                                }
                                Object read18 = this.LIZ.LIZIZ(Integer.class).read(c65385PlN);
                                if (read18 != null) {
                                    ((Challenge) obj).commerceSubType = ((Integer) read18).intValue();
                                }
                                return true;
                            case 1948294547:
                                if (!str2.equals("sticker_detail")) {
                                    return false;
                                }
                                ((Challenge) obj).challengeStickerDetail = (String) LIZ(new JsonToStringAdapter(), String.class).read(c65385PlN);
                                return true;
                            case 1955760583:
                                if (!str2.equals("inquiry")) {
                                    return false;
                                }
                                ((Challenge) obj).inquiryStruct = (InquiryStruct) this.LIZ.LIZIZ(InquiryStruct.class).read(c65385PlN);
                                return true;
                            default:
                                return false;
                        }
                    }
                };
            default:
                return null;
        }
    }
}
