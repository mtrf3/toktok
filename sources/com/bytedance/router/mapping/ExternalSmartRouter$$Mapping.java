package com.bytedance.router.mapping;

import com.bytedance.router.IMappingInitializer;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class ExternalSmartRouter$$Mapping implements IMappingInitializer {
    @Override // com.bytedance.router.IMappingInitializer
    public int getMapSize() {
        return 44;
    }

    @Override // com.bytedance.router.IMappingInitializer
    public void init(Map<String, String> map) {
        map.put("//aivatar", "com.ss.android.ugc.aweme.deeplink.actions.AIGCProfileAction");
        map.put("//assmusic/category", "com.ss.android.ugc.aweme.deeplink.actions.PlaylistAction");
        map.put("//aweme/detail/", "com.ss.android.ugc.aweme.deeplink.actions.DetailAction");
        map.put("//chatting/message", "com.ss.android.ugc.aweme.deeplink.actions.OpenChatPageAction");
        map.put("//collection/detail", "com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetailAction");
        map.put("//detail", "com.ss.android.ugc.aweme.deeplink.actions.DetailHostAction");
        map.put("//dual_device", "com.ss.android.ugc.aweme.deeplink.actions.GameDualDeviceAction");
        map.put("//ec/bnpl/middle", "com.ss.android.ugc.aweme.deeplink.actions.EcBnplMiddleAction");
        map.put("//ec/lynxview", "com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router.EcUgDeeplinkAction");
        map.put("//ec/webview", "com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router.EcUgDeeplinkAction");
        map.put("//favorite/videos/collections/content", "com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetailAction");
        map.put("//feed", "com.ss.android.ugc.aweme.deeplink.actions.FeedAction");
        map.put("//friends_tab", "com.ss.android.ugc.aweme.deeplink.actions.OpenFriendsFeedAction");
        map.put("//growth_activity_dialog/IT_Referral", "com.ss.android.ugc.aweme.deeplink.actions.MoneyGrowthAction");
        map.put("//inapp.tiktokv.com/alliance/creator/tool/create-account-sg-singpass", "com.ss.android.ugc.aweme.deeplink.actions.RedirectUriReceiverAction");
        map.put("//inapp.tiktokv.com/alliance/creator/tool/create-account-sg-singpass-test", "com.ss.android.ugc.aweme.deeplink.actions.RedirectUriReceiverAction");
        map.put("//item", "com.ss.android.ugc.aweme.deeplink.actions.ItemAction");
        map.put("//live/subonlylive", "com.ss.android.ugc.aweme.deeplink.actions.SubscriptionOnlyAction");
        map.put("//messages/group", "com.ss.android.ugc.aweme.deeplink.actions.OpenChatInviteAction");
        map.put("//mix/detail", "com.ss.android.ugc.aweme.deeplink.actions.MixVideosAction");
        map.put("//music/auth", "com.ss.android.ugc.aweme.auth.MusicAuthorizationAction");
        map.put("//musical", "com.ss.android.ugc.aweme.deeplink.actions.ItemAction");
        map.put("//now/daily/push", "com.ss.android.ugc.aweme.deeplink.actions.DailyPushNowExperimentAction");
        map.put("//now/detail", "com.ss.android.ugc.aweme.deeplink.actions.OpenNowDetailAction");
        map.put("//now/feed", "com.ss.android.ugc.aweme.deeplink.actions.OpenSocialNowTabAction");
        map.put("//now/invite", "com.ss.android.ugc.aweme.deeplink.actions.NowInviteAction");
        map.put("//openVideoEdit", "com.ss.android.ugc.aweme.deeplink.actions.OpenVideoEditAction");
        map.put("//pipopay/payin_checkout", "com.ss.android.ugc.aweme.bnpl.biz.checkout.CheckoutAction");
        map.put("//poi/detail", "com.ss.android.ugc.aweme.deeplink.actions.PoiDetailAction");
        map.put("//profile", "com.ss.android.ugc.aweme.deeplink.actions.UserProfileAction");
        map.put("//profile/followerlist", "com.ss.android.ugc.aweme.deeplink.actions.ProfileFollowerListAction");
        map.put("//profile/viewer", "com.ss.android.ugc.aweme.deeplink.actions.ProfileViewerAction");
        map.put("//qna/detail/", "com.ss.android.ugc.aweme.deeplink.actions.QnAAction");
        map.put("//revenue/subscription/invitation", "com.ss.android.ugc.aweme.deeplink.actions.OpenSubscribeInviteAction");
        map.put("//share/ttn_content", "com.ss.android.ugc.aweme.deeplink.actions.TTNContentShareLinkAction");
        map.put("//shortcut/proxy", "com.ss.android.ugc.aweme.deeplink.actions.ShortcutLinkAction");
        map.put("//story/detail/", "com.ss.android.ugc.aweme.deeplink.actions.DetailAction");
        map.put("//studio/tiktoknow", "com.ss.android.ugc.aweme.deeplink.actions.OpenNowsCameraAction");
        map.put("//third-party-oauth-redirect/music/amazon", "com.ss.android.ugc.aweme.deeplink.actions.music.AmazonMusicAuthAction");
        map.put("//trending/billboard", "com.ss.android.ugc.aweme.trending.TrendingBillboardAction");
        map.put("//trending/detail", "com.ss.android.ugc.aweme.trending.TrendingDetailAction");
        map.put("//tuwen/detail/", "com.ss.android.ugc.aweme.deeplink.actions.DetailAction");
        map.put("//user/imfans", "com.ss.android.ugc.aweme.deeplink.actions.ImFansAction");
        map.put("//v2/authorize", "com.ss.android.ugc.aweme.deeplink.actions.AuthorizationAction");
    }

    @Override // com.bytedance.router.IMappingInitializer
    public void initInterceptorMap(Map<String, List<String>> map) {
    }
}
