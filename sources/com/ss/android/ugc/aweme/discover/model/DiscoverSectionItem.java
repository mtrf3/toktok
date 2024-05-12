package com.ss.android.ugc.aweme.discover.model;

import X.C1NE;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class DiscoverSectionItem {
    public /* synthetic */ DiscoverSectionItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* loaded from: classes10.dex */
    public static final class BannerSection extends DiscoverSectionItem {
        public final List<Banner> bannerList;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BannerSection copy$default(BannerSection bannerSection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bannerSection.bannerList;
            }
            return bannerSection.copy(list);
        }

        public final BannerSection copy(List<? extends Banner> bannerList) {
            o.LJIIIZ(bannerList, "bannerList");
            return new BannerSection(bannerList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerSection) && o.LJ(this.bannerList, ((BannerSection) obj).bannerList);
        }

        public int hashCode() {
            return this.bannerList.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BannerSection(bannerList=");
            return C1NE.LIZIZ(LIZ, this.bannerList, ')', LIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BannerSection(List<? extends Banner> bannerList) {
            o.LJIIIZ(bannerList, "bannerList");
            this.bannerList = bannerList;
        }
    }

    public DiscoverSectionItem() {
    }

    /* loaded from: classes10.dex */
    public static final class TrendingTopicOrAdSection extends DiscoverSectionItem {
        public final TrendingTopicOrAd trendingTopicOrAd;

        public static /* synthetic */ TrendingTopicOrAdSection copy$default(TrendingTopicOrAdSection trendingTopicOrAdSection, TrendingTopicOrAd trendingTopicOrAd, int i, Object obj) {
            if ((i & 1) != 0) {
                trendingTopicOrAd = trendingTopicOrAdSection.trendingTopicOrAd;
            }
            return trendingTopicOrAdSection.copy(trendingTopicOrAd);
        }

        public final TrendingTopicOrAdSection copy(TrendingTopicOrAd trendingTopicOrAd) {
            o.LJIIIZ(trendingTopicOrAd, "trendingTopicOrAd");
            return new TrendingTopicOrAdSection(trendingTopicOrAd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrendingTopicOrAdSection) && o.LJ(this.trendingTopicOrAd, ((TrendingTopicOrAdSection) obj).trendingTopicOrAd);
        }

        public int hashCode() {
            return this.trendingTopicOrAd.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TrendingTopicOrAdSection(trendingTopicOrAd=");
            LIZ.append(this.trendingTopicOrAd);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public TrendingTopicOrAdSection(TrendingTopicOrAd trendingTopicOrAd) {
            o.LJIIIZ(trendingTopicOrAd, "trendingTopicOrAd");
            this.trendingTopicOrAd = trendingTopicOrAd;
        }
    }
}
