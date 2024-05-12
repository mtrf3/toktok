package X;

import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MJi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56602MJi extends AbstractC03160Am<DiscoverSectionItem> {
    @Override // X.AbstractC03160Am
    public final boolean LIZ(DiscoverSectionItem discoverSectionItem, DiscoverSectionItem discoverSectionItem2) {
        DiscoverSectionItem.TrendingTopicOrAdSection trendingTopicOrAdSection;
        DiscoverSectionItem.BannerSection bannerSection;
        DiscoverSectionItem discoverSectionItem3 = discoverSectionItem;
        DiscoverSectionItem discoverSectionItem4 = discoverSectionItem2;
        Object obj = null;
        if (discoverSectionItem3 instanceof DiscoverSectionItem.BannerSection) {
            List<Banner> list = ((DiscoverSectionItem.BannerSection) discoverSectionItem3).bannerList;
            if ((discoverSectionItem4 instanceof DiscoverSectionItem.BannerSection) && (bannerSection = (DiscoverSectionItem.BannerSection) discoverSectionItem4) != null) {
                obj = bannerSection.bannerList;
            }
            return o.LJ(list, obj);
        }
        if (discoverSectionItem3 instanceof DiscoverSectionItem.TrendingTopicOrAdSection) {
            TrendingTopicOrAd trendingTopicOrAd = ((DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem3).trendingTopicOrAd;
            if ((discoverSectionItem4 instanceof DiscoverSectionItem.TrendingTopicOrAdSection) && (trendingTopicOrAdSection = (DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem4) != null) {
                obj = trendingTopicOrAdSection.trendingTopicOrAd;
            }
            return o.LJ(trendingTopicOrAd, obj);
        }
        throw new C162476Zf();
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(DiscoverSectionItem discoverSectionItem, DiscoverSectionItem discoverSectionItem2) {
        return o.LJ(discoverSectionItem, discoverSectionItem2);
    }
}
