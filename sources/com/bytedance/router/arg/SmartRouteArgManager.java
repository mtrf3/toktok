package com.bytedance.router.arg;

import X.C58314Muc;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.annotation.IRouteArg;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class SmartRouteArgManager {
    public static final SmartRouteArgManager INSTANCE;
    public static final Map<String, String> clazzToArgClsMap;
    public static final Map<String, String> urlToArgClsMap;

    private final void addClazzToArgClsPair(Map<String, String> map) {
        map.put("com.ss.android.ugc.aweme.anchor.AddAnchorFragment", "com.ss.android.ugc.aweme.anchor.AddAnchorParam");
        map.put("com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentFragment", "com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg");
        map.put("com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberFragment", "com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneRouteArg");
        map.put("com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment", "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpRouteArg");
        map.put("com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetFragment", "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinSetRouteArg");
        map.put("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs");
        map.put("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "com.ss.android.ugc.aweme.following.ui.FollowRelationTabArgs");
        map.put("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivityArgs");
        map.put("com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2", "com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg");
        map.put("com.ss.android.ugc.aweme.library.LibraryDetailActivity", "com.ss.android.ugc.aweme.model.library.LibraryDetailParam");
        map.put("com.ss.android.ugc.aweme.library.LibraryDetailFragment", "com.ss.android.ugc.aweme.model.library.LibraryDetailParam");
        map.put("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivityArgs");
        map.put("com.ss.android.ugc.aweme.music.OriginMusicListNewFragment", "com.ss.android.ugc.aweme.music.OriginMusicArg");
        map.put("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg");
        map.put("com.ss.android.ugc.aweme.notification.MusNotificationDetailFragment", "com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg");
        map.put("com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragmentV2", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("com.ss.android.ugc.aweme.profile.aigc.ProfileAigcMainActivity", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("com.ss.android.ugc.aweme.profile.ui.UserProfileFragment", "com.ss.android.ugc.aweme.profile.arg.UserProfileArg");
        map.put("com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
        map.put("com.ss.android.ugc.aweme.qna.fragment.QnaAskWithCategoriesFragment", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
        map.put("com.ss.android.ugc.aweme.question.QuestionDetailActivity", "com.ss.android.ugc.aweme.question.model.QuestionDetailParam");
        map.put("com.ss.android.ugc.aweme.question.QuestionDetailFragment", "com.ss.android.ugc.aweme.question.model.QuestionDetailParam");
        map.put("com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity", "com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg");
        map.put("com.ss.android.ugc.aweme.rss.feed.ui.RssFeedFragment", "com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam");
        map.put("com.ss.android.ugc.aweme.rss.link.ui.RssLinkFragment", "com.ss.android.ugc.aweme.rss.link.models.RssLinkParam");
        map.put("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment", "com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs");
        map.put("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs");
    }

    private final void addUrlToArgClsPair(Map<String, String> map) {
        map.put("//aivatar", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("//aivatar/avatar", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("//aivatar/intro/v2", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("//anchor/link", "com.ss.android.ugc.aweme.anchor.AddAnchorParam");
        map.put("//aweme/challenge/detail", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("//bnpl/bill/repayment", "com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg");
        map.put("//bnpl/onboarding/tel", "com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneRouteArg");
        map.put("//challenge/detail", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("//challenge/detail_fragment", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("//chat/center2", "com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg");
        map.put("//dual_device", "com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivityArgs");
        map.put("//friends/ffp", "com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg");
        map.put("//friends/find", "com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg");
        map.put("//library/detail", "com.ss.android.ugc.aweme.model.library.LibraryDetailParam");
        map.put("//library/detail/", "com.ss.android.ugc.aweme.model.library.LibraryDetailParam");
        map.put("//library/detail_fragment", "com.ss.android.ugc.aweme.model.library.LibraryDetailParam");
        map.put("//main/update_tips", "com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs");
        map.put("//notice/detail", "com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg");
        map.put("//notice/detail_fragment", "com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg");
        map.put("//origin/music_list", "com.ss.android.ugc.aweme.music.OriginMusicArg");
        map.put("//profile/avatar_cut", "com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivityArgs");
        map.put("//profile/follow_relation", "com.ss.android.ugc.aweme.following.ui.FollowRelationTabArgs");
        map.put("//profile/followerlist", "com.ss.android.ugc.aweme.following.ui.FollowRelationTabArgs");
        map.put("//qna/detail", "com.ss.android.ugc.aweme.question.model.QuestionDetailParam");
        map.put("//qna/detail/", "com.ss.android.ugc.aweme.question.model.QuestionDetailParam");
        map.put("//qna/detail_fragment", "com.ss.android.ugc.aweme.question.model.QuestionDetailParam");
        map.put("//rss/feed", "com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam");
        map.put("//rss/link", "com.ss.android.ugc.aweme.rss.link.models.RssLinkParam");
        map.put("//setting", "com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs");
        map.put("//setting_fragment", "com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs");
        map.put("//user/ask", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
        map.put("//user/ask/", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
        map.put("//user/ask_with_categories_and_hints", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
        map.put("//user/ask_with_categories_and_hints/", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
        map.put("//user/profile", "com.ss.android.ugc.aweme.profile.arg.UserProfileArg");
        map.put("//verify_center/set_pin", "com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinSetRouteArg");
        map.put("//verify_center/verify_otp", "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpRouteArg");
        map.put("aweme://library/detail", "com.ss.android.ugc.aweme.model.library.LibraryDetailParam");
        map.put("aweme://library/detail/", "com.ss.android.ugc.aweme.model.library.LibraryDetailParam");
        map.put("aweme://qna/detail", "com.ss.android.ugc.aweme.question.model.QuestionDetailParam");
        map.put("aweme://qna/detail/", "com.ss.android.ugc.aweme.question.model.QuestionDetailParam");
        map.put("aweme://user/ask", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
        map.put("aweme://user/ask/", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
        map.put("aweme://user/ask_with_categories_and_hints", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
        map.put("aweme://user/ask_with_categories_and_hints/", "com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
    }

    static {
        SmartRouteArgManager smartRouteArgManager = new SmartRouteArgManager();
        INSTANCE = smartRouteArgManager;
        HashMap hashMap = new HashMap();
        clazzToArgClsMap = hashMap;
        HashMap hashMap2 = new HashMap();
        urlToArgClsMap = hashMap2;
        smartRouteArgManager.addUrlToArgClsPair(hashMap2);
        smartRouteArgManager.addClazzToArgClsPair(hashMap);
    }

    private final String getRealRouteUrl(String str) {
        Uri uri = UriProtector.parse(str);
        o.LJIIIIZZ(uri, "uri");
        if (uri.isHierarchical()) {
            if (!TextUtils.isEmpty(uri.getScheme())) {
                return "//" + uri.getAuthority() + uri.getPath();
            }
            return str;
        }
        return null;
    }

    private final String getRouteUrl(String str) {
        Uri uri = UriProtector.parse(str);
        o.LJIIIIZZ(uri, "uri");
        if (uri.isHierarchical()) {
            if (!TextUtils.isEmpty(uri.getScheme())) {
                return uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
            }
            return "//" + uri.getAuthority() + uri.getPath();
        }
        return null;
    }

    public final Class<? extends IRouteArg> getArgClassByClazz(Class<?> cls) {
        o.LJIIIZ(cls, "cls");
        try {
            String str = clazzToArgClsMap.get(cls.getName());
            if (str != null) {
                return Class.forName(str);
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    public final Class<? extends IRouteArg> getArgClassByUrl(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String realRouteUrl = getRealRouteUrl(str);
        Map<String, String> map = urlToArgClsMap;
        String str2 = map.get(realRouteUrl);
        if (str2 == null && realRouteUrl != null && ujb.o.LJJJJ(realRouteUrl, "/", false) && realRouteUrl.length() > 1) {
            realRouteUrl = C58314Muc.LIZIZ(realRouteUrl, 1, 0, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            str2 = map.get(realRouteUrl);
        }
        if (str2 == null) {
            realRouteUrl = getRouteUrl(str);
            str2 = map.get(realRouteUrl);
        }
        if (str2 == null && realRouteUrl != null && ujb.o.LJJJJ(realRouteUrl, "/", false) && realRouteUrl.length() > 1) {
            String substring = realRouteUrl.substring(0, realRouteUrl.length() - 1);
            o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            str2 = map.get(substring);
        }
        if (str2 != null) {
            try {
                return Class.forName(str2);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }
}
