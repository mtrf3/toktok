package com.ss.android.ugc.aweme.discover.model;

import X.Q8U;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingTopicOrAd implements Serializable {
    public static final Companion Companion = new Companion();
    public static final long serialVersionUID = 42;
    public final TrendingTopicsAdInfo ad;
    public final TrendingTopic topic;

    public final boolean isAd() {
        if (this.ad != null) {
            return true;
        }
        return false;
    }

    public final boolean isTopic() {
        if (this.topic != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        Long l;
        if (isAd()) {
            Object[] objArr = new Object[1];
            TrendingTopicsAdInfo trendingTopicsAdInfo = this.ad;
            if (trendingTopicsAdInfo != null) {
                l = Long.valueOf(trendingTopicsAdInfo.getAdId());
            } else {
                l = null;
            }
            objArr[0] = l;
            return Q8U.LIZIZ(objArr, 1, "TrendingTopicOrAd[Ad %d]", "format(format, *args)");
        }
        TrendingTopic trendingTopic = this.topic;
        o.LJI(trendingTopic);
        if (trendingTopic.getChallenge() != null) {
            Challenge challenge = this.topic.getChallenge();
            o.LJI(challenge);
            return Q8U.LIZIZ(new Object[]{challenge.getDesc()}, 1, "TrendingTopicOrAd[Category.challenge %s]", "format(format, *args)");
        }
        if (this.topic.getMusic() != null) {
            return Q8U.LIZIZ(new Object[]{this.topic.getMusic().getAlbum()}, 1, "TrendingTopicOrAd[Category.music %s]", "format(format, *args)");
        }
        if (this.topic.getItems() != null) {
            return Q8U.LIZIZ(new Object[]{Integer.valueOf(this.topic.getItems().size())}, 1, "TrendingTopicOrAd[Category.items %d]", "format(format, *args)");
        }
        return "TrendingTopicOrAd[Category.unknown]";
    }

    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final TrendingTopicsAdInfo getAd() {
        return this.ad;
    }

    public TrendingTopicOrAd(TrendingTopic trendingTopic) {
        this.topic = trendingTopic;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TrendingTopicOrAd)) {
            return false;
        }
        if (isTopic()) {
            TrendingTopicOrAd trendingTopicOrAd = (TrendingTopicOrAd) obj;
            if (trendingTopicOrAd.isTopic()) {
                TrendingTopic trendingTopic = this.topic;
                o.LJI(trendingTopic);
                if (trendingTopic.getChallenge() != null) {
                    TrendingTopic trendingTopic2 = trendingTopicOrAd.topic;
                    o.LJI(trendingTopic2);
                    if (trendingTopic2.getChallenge() != null) {
                        Challenge challenge = this.topic.getChallenge();
                        o.LJI(challenge);
                        String cid = challenge.getCid();
                        Challenge challenge2 = trendingTopicOrAd.topic.getChallenge();
                        o.LJI(challenge2);
                        return o.LJ(cid, challenge2.getCid());
                    }
                }
                if (this.topic.getMusic() != null) {
                    TrendingTopic trendingTopic3 = trendingTopicOrAd.topic;
                    o.LJI(trendingTopic3);
                    if (trendingTopic3.getMusic() != null) {
                        return o.LJ(this.topic.getMusic(), trendingTopicOrAd.topic.getMusic());
                    }
                }
                return false;
            }
        }
        if (isAd()) {
            TrendingTopicOrAd trendingTopicOrAd2 = (TrendingTopicOrAd) obj;
            if (trendingTopicOrAd2.isAd()) {
                return equals(this.ad, trendingTopicOrAd2.ad);
            }
        }
        return false;
    }

    public TrendingTopicOrAd(TrendingTopicsAdInfo trendingTopicsAdInfo) {
        this.ad = trendingTopicsAdInfo;
    }

    private final boolean equals(TrendingTopicsAdInfo trendingTopicsAdInfo, TrendingTopicsAdInfo trendingTopicsAdInfo2) {
        if (trendingTopicsAdInfo == trendingTopicsAdInfo2) {
            return true;
        }
        if (trendingTopicsAdInfo == null || trendingTopicsAdInfo2 == null) {
            return false;
        }
        return equals(Long.valueOf(trendingTopicsAdInfo.getAdId()), Long.valueOf(trendingTopicsAdInfo2.getAdId()));
    }

    private final boolean equals(Long l, Long l2) {
        if (l == null) {
            if (l2 == null) {
                return true;
            }
            return false;
        }
        return o.LJ(l, l2);
    }
}
