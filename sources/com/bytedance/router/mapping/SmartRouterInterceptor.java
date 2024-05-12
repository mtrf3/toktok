package com.bytedance.router.mapping;

import com.bytedance.router.IInterceptorInitializer;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionRouteInterceptor;
import com.ss.android.ugc.aweme.inteceptor.AnalyticsDetailInterceptor;
import com.ss.android.ugc.aweme.notification.DiggListRouterInterceptor;
import com.ss.android.ugc.aweme.openauthorize.DeeplinkAuthorizeParseInterceptor;
import com.ss.android.ugc.aweme.openauthorize.OpenAuthorizeParseInterceptor;
import com.ss.android.ugc.aweme.paidcontent.interceptor.PaidContentInterceptor;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailPageInterceptor;
import com.ss.android.ugc.aweme.poi.map.PoiMapPageInterceptor;
import com.ss.android.ugc.aweme.poi.search.PoiSearchPageInterceptor;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarInterceptor;
import com.ss.android.ugc.aweme.setting.experiment.InboxMsgInterceptor;
import com.ss.android.ugc.aweme.setting.experiment.MarketInterceptor;
import com.ss.android.ugc.aweme.story.route.StoryDetailInterceptor;
import com.ss.android.ugc.aweme.trending.service.TrendingInterceptor;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class SmartRouterInterceptor implements IInterceptorInitializer {
    @Override // com.bytedance.router.IInterceptorInitializer
    public void initAssignInterceptors(Map<String, IInterceptor> map) {
        map.put("AnalyticsDetailInterceptor", new AnalyticsDetailInterceptor());
        map.put("DeeplinkAuthorizeParseInterceptor", new DeeplinkAuthorizeParseInterceptor());
        map.put("DiggListRouter_Interceptor", new DiggListRouterInterceptor());
        map.put("InboxMsgInterceptor", new InboxMsgInterceptor());
        map.put("MarketInterceptor", new MarketInterceptor());
        map.put("MusicCollectPrivacyInterceptor", new MusicCollectionRouteInterceptor());
        map.put("OpenAuthorizeParseInterceptor", new OpenAuthorizeParseInterceptor());
        map.put("PaidContentInterceptor", new PaidContentInterceptor());
        map.put("PoiDetailPageInterceptor", new PoiDetailPageInterceptor());
        map.put("PoiMapPageInterceptor", new PoiMapPageInterceptor());
        map.put("PoiSearchPageInterceptor", new PoiSearchPageInterceptor());
        map.put("ProfileAigcAvatarInterceptor", new ProfileAigcAvatarInterceptor());
        map.put("TrendingInterceptor", new TrendingInterceptor());
    }

    @Override // com.bytedance.router.IInterceptorInitializer
    public void initInterceptors(List<IInterceptor> list) {
        list.add(new StoryDetailInterceptor());
    }

    public void initSafeInterceptors(List<IInterceptor> list) {
    }
}
