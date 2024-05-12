package com.bytedance.ies.powerpage.interceptor;

import X.C16880lQ;
import X.C61210O0o;
import X.C62712d9;
import X.C79061V1d;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.HashMap;

/* loaded from: classes17.dex */
public class PowerPageInterceptor implements IInterceptor {
    public final HashMap<String, String> LJLIL;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    public PowerPageInterceptor() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.LJLIL = hashMap;
        hashMap.put("//about_activity", "com.ss.android.ugc.aweme.setting.page.about.AboutPage");
        hashMap.put("//add_yours/hub", "com.ss.android.ugc.tiktok.addyours.hub.AddYoursHubFragment");
        hashMap.put("//addyours/settings", "com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.qa.QASettingFragment");
        hashMap.put("//ads/preview", "com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment");
        hashMap.put("//aigc/style", "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseStyleFragment");
        hashMap.put("//aivatar/avatar", "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment");
        hashMap.put("//aivatar/intro/v2", "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragmentV2");
        hashMap.put("//aivatar/progress", "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcProgressFragment");
        hashMap.put("//anchor/link", "com.ss.android.ugc.aweme.anchor.AddAnchorFragment");
        hashMap.put("//anti_bullying_protection/common", "com.ss.android.ugc.aweme.compliance.business.antibullying.common.AntiBullyingCommonFragment");
        hashMap.put("//anti_bullying_protection/extreme", "com.ss.android.ugc.aweme.compliance.business.antibullying.extremely.AntiBullyingExtremelyFragment");
        hashMap.put("//authmanagement", "com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage");
        hashMap.put("//bnpl/bill/detail", "com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailsFragment");
        hashMap.put("//bnpl/bill/homepage", "com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeFragment");
        hashMap.put("//bnpl/bill/list", "com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsTabFragment");
        hashMap.put("//bnpl/bill/repayment", "com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentFragment");
        hashMap.put("//bnpl/bill/result", "com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentRetFragment");
        hashMap.put("//bnpl/entry", "com.ss.android.ugc.aweme.bnpl.biz.entry.BNPLEntryFragment");
        hashMap.put("//bnpl/onboarding/intro", "com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingFragment");
        hashMap.put("//bnpl/onboarding/step", "com.ss.android.ugc.aweme.bnpl.biz.credit.landing.ProgressFragment");
        hashMap.put("//bnpl/onboarding/tel", "com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberFragment");
        hashMap.put("//change_account_region/kr_terms_conditions", "com.ss.android.ugc.aweme.compliance.consent.termsconditions.changeregion.ChangeAccountRegionTermsConditionsPage");
        hashMap.put("//chat/center2", "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2");
        hashMap.put("//chatcontrol/setting/keywords", "com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment");
        hashMap.put("//collection/detail", "com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment");
        hashMap.put("//compliance/privacy_highlights_for_teens_feed", "com.ss.android.ugc.aweme.compliance.business.phl.feed.PhlFeedFragment");
        hashMap.put("//content_preferences/personalized_feeds", "com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedfeed.PersonalizedFeedsPage");
        hashMap.put("//content_preferences/personalized_search", "com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedsearch.PersonalizedSearchPage");
        hashMap.put("//contentpreference", "com.ss.android.ugc.aweme.compliance.business.contentpreferences.ContentPreferencesPage");
        hashMap.put("//creatorcenter", "com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment");
        hashMap.put("//creatorcenter/settings", "com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterSettingsFragment");
        hashMap.put("//display/caption/setting", "com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage");
        hashMap.put("//display/setting", "com.ss.android.ugc.trill.setting.DisplaySettingPage");
        hashMap.put("//do_not_translate/language/setting", "com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage");
        hashMap.put("//effect/featurevideo/awemelist", "com.ss.android.ugc.aweme.prop.fragment.featureeffectvideo.ui.FeatureVideoAwemeListFragment");
        hashMap.put("//favorite", "com.ss.android.ugc.aweme.favorites.business.FavoritesFragment");
        hashMap.put("//favorite/videos/collections/content", "com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment");
        hashMap.put("//filtercomments/dislike", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.CommentFilterDislikeFragment");
        hashMap.put("//friend/find", "com.ss.android.ugc.aweme.relation.fp.FacebookFriendsPage");
        hashMap.put("//friends/contact", "com.ss.android.ugc.aweme.relation.fp.ContactFriendsPage");
        hashMap.put("//friends/contacts", "com.ss.android.ugc.aweme.relation.fp.ContactFriendsPage");
        hashMap.put("//friends/facebook", "com.ss.android.ugc.aweme.relation.fp.FacebookFriendsPage");
        hashMap.put("//friends/invite", "com.ss.android.ugc.aweme.relation.fp.InviteFriendsPage");
        hashMap.put("//friends/invite_new", "com.ss.android.ugc.aweme.relation.fp.InviteFriendsPage");
        hashMap.put("//helper_center", "com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementPage");
        hashMap.put("//highlight/select", "com.ss.android.ugc.aweme.music.highlight.HighlightSelectFragment");
        hashMap.put("//im/chat/room", "com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment");
        hashMap.put("//im/group/list", "com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.fragment.GroupListFragment");
        hashMap.put("//im/notice/sticker_creators", "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.fragment.VideoStickerNotificationFragment");
        hashMap.put("//im/search/", "com.ss.android.ugc.aweme.im.sdk.search.ui.IMSearchFragment");
        hashMap.put("//im/select/chat/msg", "com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.SelectChatMsgFragment");
        hashMap.put("//inner_push_setting_manager", "com.ss.android.ugc.aweme.setting.serverpush.ui.InnerPushSettingsFragment");
        hashMap.put("//live/follow", "com.ss.android.ugc.aweme.feed.ui.LiveFollowFragment");
        hashMap.put("//music/artist/awemelist", "com.ss.android.ugc.aweme.music.artist.ui.ArtistMusicAwemeListFragment");
        hashMap.put("//music/recommended/list", "com.ss.android.ugc.aweme.favorites.business.music.LynxRecommendedSoundsFragment");
        hashMap.put("//music/settings", "com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicSettingPage");
        hashMap.put("//music/settings/auth", "com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage");
        hashMap.put("//nearby/discovery/map", "com.ss.android.ugc.aweme.placediscovery2.ui.PoiDiscoveryMapFragment");
        hashMap.put("//notice/detail_fragment", "com.ss.android.ugc.aweme.notification.MusNotificationDetailFragment");
        hashMap.put("//notice/like_list_fragment", "com.ss.android.ugc.aweme.notification.LikeListDetailFragment");
        hashMap.put("//now/detail", "com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsDetailFragment");
        hashMap.put("//now/error", "com.ss.android.ugc.aweme.nows.feed.ui.NowsErrorPageFragment");
        hashMap.put("//now/invite", "com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsInviteFragment");
        hashMap.put("//poi/map", "com.ss.android.ugc.aweme.poi.map.PoiLocationDetailFragment");
        hashMap.put("//poi/review_list", "com.ss.android.ugc.aweme.poi.reviews.PoiReviewListFragment");
        hashMap.put("//poi/search", "com.ss.android.ugc.aweme.poi.search.PoiSearchFragment");
        hashMap.put("//preferred/language/setting", "com.ss.android.ugc.trill.setting.PreferredLanguageSettingPage");
        hashMap.put("//privacy/setting/page/general", "com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment");
        hashMap.put("//privacy/setting/page/general/sug", "com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragmentSug");
        hashMap.put("//privacy/setting/page/main", "com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragmentMain");
        hashMap.put("//profile/viewer", "com.ss.android.ugc.aweme.profile.viewer.ui.ProfileViewerFragment");
        hashMap.put("//push-setting", "com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerPage");
        hashMap.put("//push_setting_sub_manager", "com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingsCommonSubFragment");
        hashMap.put("//qna/settings", "com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.qa.QASettingFragment");
        hashMap.put("//qrcodev2", "com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
        hashMap.put("//rss/feed", "com.ss.android.ugc.aweme.rss.feed.ui.RssFeedFragment");
        hashMap.put("//rss/link", "com.ss.android.ugc.aweme.rss.link.ui.RssLinkFragment");
        hashMap.put("//sdp/reviews", "com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment");
        hashMap.put("//setting/about", "com.ss.android.ugc.aweme.setting.page.AboutPage");
        hashMap.put("//setting/accessibility", "com.ss.android.ugc.aweme.setting.page.accessibility.AccessibilitySettingPage");
        hashMap.put("//setting/account/third_party_binding", "com.ss.android.ugc.aweme.setting.page.account.ThirdPartyBindingPage");
        hashMap.put("//setting/background_audio", "com.ss.android.ugc.aweme.setting.page.backgroundaudio.BackgroundAudioPage");
        hashMap.put("//setting/beta_explain", "com.ss.android.ugc.aweme.setting.ui.beta.BetaExplainPage");
        hashMap.put("//setting/beta_info", "com.ss.android.ugc.aweme.setting.ui.beta.BetaTesterInfoPage");
        hashMap.put("//setting/beta_register_internal", "com.ss.android.ugc.aweme.setting.ui.beta.BetaEmailRegisterPage");
        hashMap.put("//setting/blocklist", "com.ss.android.ugc.aweme.setting.page.privacy.BlackListPage");
        hashMap.put("//setting/datasaver", "com.ss.android.ugc.aweme.setting.page.datasave.DataSaverSettingPage");
        hashMap.put("//setting/diskmanager", "com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage");
        hashMap.put("//setting/findcontact", "com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage");
        hashMap.put("//setting/live", "com.ss.android.ugc.aweme.setting.page.LivePage");
        hashMap.put("//setting/playback", "com.ss.android.ugc.aweme.setting.page.playback.PlaybackSettingPage");
        hashMap.put("//setting/security", "com.ss.android.ugc.aweme.setting.page.security.SecurityPage");
        hashMap.put("//setting/support", "com.ss.android.ugc.aweme.setting.page.SupportPage");
        hashMap.put("//social/mention/publish", "com.ss.android.ugc.aweme.mention.ui.page.VideoCaptionMentionPanel");
        hashMap.put("//social/nows/archive", "com.ss.android.ugc.aweme.nows.archive.ui.NowArchiveCalendarFragment");
        hashMap.put("//social/nows/archive/feed", "com.ss.android.ugc.aweme.nows.archive.ui.NowArchiveFeedFragment");
        hashMap.put("//social/nows/distribution/detail", "com.ss.android.ugc.aweme.nows.feed.ui.NowDistributionFeedListFragment");
        hashMap.put("//social/taglist", "com.ss.android.ugc.aweme.tag.VideoTagPage");
        hashMap.put("//story/archive", "com.ss.android.ugc.aweme.story.archive.StoryArchiveFragment");
        hashMap.put("//tns/hidden_accounts", "com.ss.android.ugc.aweme.compliance.business.hideaccount.HideAccountPage");
        hashMap.put("//topic/book", "com.ss.android.ugc.aweme.topic.book.detail.BookDetailPage");
        hashMap.put("//topic/book/info", "com.ss.android.ugc.aweme.topic.book.info.BookInfoPage");
        hashMap.put("//topic/book/search", "com.ss.android.ugc.aweme.topic.book.creator.BookSearchPage");
        hashMap.put("//topic/movie", "com.ss.android.ugc.aweme.topic.movie.detail.MovieDetailPage");
        hashMap.put("//topic/movie/info", "com.ss.android.ugc.aweme.topic.movie.info.MovieInfoPage");
        hashMap.put("//topic/movie/search", "com.ss.android.ugc.aweme.topic.movie.creator.MovieSearchPage");
        hashMap.put("//topic/recommend", "com.ss.android.ugc.aweme.topic.recommend.ui.TopicRecommendSearchPage");
        hashMap.put("//translation/language/setting", "com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage");
        hashMap.put("//trending/billboard", "com.ss.android.ugc.aweme.trending.ui.billboardpage.TrendingFullBillboardPage");
        hashMap.put("//trending/reveal", "com.ss.android.ugc.aweme.trending.ui.list.TrendingRevealPage");
        hashMap.put("//trends/video", "com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicFragment");
        hashMap.put("//user/ask", "com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment");
        hashMap.put("//user/ask/", "com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment");
        hashMap.put("//user/ask_with_categories_and_hints", "com.ss.android.ugc.aweme.qna.fragment.QnaAskWithCategoriesFragment");
        hashMap.put("//user/ask_with_categories_and_hints/", "com.ss.android.ugc.aweme.qna.fragment.QnaAskWithCategoriesFragment");
        hashMap.put("//user/profile", "com.ss.android.ugc.aweme.profile.ui.UserProfileFragment");
        hashMap.put("//user/qna/profile", "com.ss.android.ugc.aweme.qna.QnaProfile");
        hashMap.put("//user/qna_unavailable", "com.ss.android.ugc.aweme.qna.fragment.QuestionUnavailableFragment");
        hashMap.put("//verify_center/change_pin", "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeFragment");
        hashMap.put("//verify_center/confirm_pin", "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinConfirmFragment");
        hashMap.put("//verify_center/forget_pin", "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot.PinForgotFragment");
        hashMap.put("//verify_center/set_pin", "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetFragment");
        hashMap.put("//verify_center/verify_otp", "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment");
        hashMap.put("//verify_center/verify_pin", "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyFragment");
        hashMap.put("//video/creation/tail", "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment");
        hashMap.put("//video/sticker", "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.fragment.VideoSelectionTabFragment");
        hashMap.put("aweme://ec/shop_message_fragment", "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment");
        hashMap.put("aweme://favorite/videos/allfavorites/content", "com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteFragment");
        hashMap.put("aweme://favorite/videos/collections/add/video", "com.ss.android.ugc.aweme.favorites.business.collection.AddVideosFragment");
        hashMap.put("aweme://inbox/activity", "com.ss.android.ugc.aweme.notification.creator.NotificationContainerFragment");
        hashMap.put("aweme://inbox/chat_request", "com.ss.android.ugc.aweme.im.sdk.chat.feature.remindusers.ui.ChatRequestFragment");
        hashMap.put("aweme://inbox/followers", "com.ss.android.ugc.aweme.inbox.newfollowerpage.InboxNewFollowerTabFragment");
        hashMap.put("aweme://inbox/system_notice", "com.ss.android.ugc.aweme.notification.NoticeCardFragment");
        hashMap.put("aweme://inbox/system_notice/unsubscribe_setting", "com.ss.android.ugc.aweme.notification.SystemNotificationUnsubscribeSettingFragment");
        hashMap.put("aweme://location_services/setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesFragment");
        hashMap.put("aweme://music/artist/awemelist", "com.ss.android.ugc.aweme.music.artist.ui.ArtistMusicAwemeListFragment");
        hashMap.put("aweme://music/recommended/list", "com.ss.android.ugc.aweme.favorites.business.music.LynxRecommendedSoundsFragment");
        hashMap.put("aweme://paidcontent/anchor_collections_selection", "com.ss.android.ugc.aweme.paidcontent.activity.PaidContentCollectionFragment");
        hashMap.put("aweme://paidcontent/collections", "com.ss.android.ugc.aweme.paidcontent.activity.PaidContentCollectionFragment");
        hashMap.put("aweme://paidcontent/collections/detail", "com.ss.android.ugc.aweme.paidcontent.activity.PaidContentCollectionDetailFragment");
        hashMap.put("aweme://paidcontent/manage", "com.ss.android.ugc.aweme.paidcontent.manageseries.fragment.ManageSeriesFragment");
        hashMap.put("aweme://paidcontent/promote", "com.ss.android.ugc.aweme.paidcontent.activity.PaidContentPromoteFragment");
        hashMap.put("aweme://paidcontent/series/post", "com.ss.android.ugc.aweme.paidcontent.SeriesPostFragment");
        hashMap.put("aweme://paidcontent/series/upload/intro", "com.ss.android.ugc.aweme.paidcontent.manageseries.fragment.SeriesCreationIntroFragment");
        hashMap.put("aweme://poi/detail", "com.ss.android.ugc.aweme.poi.detail.container.PoiDetailFragment");
        hashMap.put("aweme://push_setting_manager", "com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerPage");
        hashMap.put("aweme://trending/billboard", "com.ss.android.ugc.aweme.trending.ui.billboardpage.TrendingFullBillboardPage");
        hashMap.put("aweme://user/ask", "com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment");
        hashMap.put("aweme://user/ask/", "com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment");
        hashMap.put("aweme://user/ask_with_categories_and_hints", "com.ss.android.ugc.aweme.qna.fragment.QnaAskWithCategoriesFragment");
        hashMap.put("aweme://user/ask_with_categories_and_hints/", "com.ss.android.ugc.aweme.qna.fragment.QnaAskWithCategoriesFragment");
        hashMap.put("aweme://user/inbox/follower", "com.ss.android.ugc.aweme.inbox.newfollowerpage.InboxNewFollowerTabFragment");
        hashMap.put("aweme://user/notification", "com.ss.android.ugc.aweme.notification.creator.NotificationContainerFragment");
        hashMap.put("aweme://user/notification_old", "com.ss.android.ugc.aweme.notification.MusNewNotificationFragment");
    }

    public final String LIZ(RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (routeIntent == null) {
            return null;
        }
        String url = routeIntent.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        Uri parse = UriProtector.parse(url);
        if (parse.isHierarchical()) {
            if (!TextUtils.isEmpty(parse.getScheme())) {
                str = "//" + parse.getAuthority() + parse.getPath();
            } else {
                str = url;
            }
        } else {
            str = null;
        }
        String str3 = this.LJLIL.get(str);
        if (TextUtils.isEmpty(str3) && str.endsWith("/") && str.length() > 1) {
            str = C79061V1d.LJ(str, 1, 0);
            str3 = this.LJLIL.get(str);
        }
        if (TextUtils.isEmpty(str3)) {
            Uri parse2 = UriProtector.parse(url);
            if (parse2.isHierarchical()) {
                if (!TextUtils.isEmpty(parse2.getScheme())) {
                    str2 = parse2.getScheme() + "://" + parse2.getAuthority() + parse2.getPath();
                } else {
                    str2 = "//" + parse2.getAuthority() + parse2.getPath();
                }
            }
            str3 = this.LJLIL.get(str2);
            str = str2;
        }
        if (TextUtils.isEmpty(str3) && str.endsWith("/") && str.length() > 1) {
            return this.LJLIL.get(C79061V1d.LJ(str, 1, 0));
        }
        return str3;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        try {
            return !TextUtils.isEmpty(LIZ(routeIntent));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String LIZ;
        Bundle bundle;
        Uri uri;
        int i;
        if (context == null || routeIntent == null) {
            return false;
        }
        Intent intent = null;
        try {
            try {
                LIZ = LIZ(routeIntent);
            } catch (ClassNotFoundException e) {
                C16880lQ.LLLLIIL(e);
            } catch (Throwable unused) {
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        if (TextUtils.isEmpty(LIZ)) {
            return false;
        }
        Class<?> cls = Class.forName(LIZ);
        if (cls != null && Fragment.class.isAssignableFrom(cls)) {
            if (routeIntent.getExtra() != null) {
                intent = routeIntent.getExtra();
                bundle = C16880lQ.LLJJIJI(intent);
                uri = intent.getData();
                i = intent.getFlags();
            } else {
                bundle = null;
                uri = null;
                i = 0;
            }
            Intent LIZJ = C61210O0o.LIZ.LIZJ(context, cls, bundle, routeIntent.getRequestCode(), routeIntent.getOnActivityResultCallback(), uri, Integer.valueOf(i));
            if (LIZJ != null && intent != null) {
                intent.setComponent(LIZJ.getComponent());
                intent.putExtra("power_page_fragment_class_name", C16880lQ.LJLLILLLL(cls));
                return true;
            }
            return true;
        }
        return false;
    }
}
