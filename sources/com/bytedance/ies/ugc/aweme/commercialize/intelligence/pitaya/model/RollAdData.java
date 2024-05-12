package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RollAdData implements Serializable {

    @InterfaceC65349Pkn("feed_action_data")
    public FeedActionData feedActionData;

    @InterfaceC65349Pkn("feed_status")
    public final int feedStatus;

    @InterfaceC65349Pkn("feed_data")
    public final RankData rankData;

    public final FeedActionData getFeedActionData() {
        return this.feedActionData;
    }

    public final int getFeedStatus() {
        return this.feedStatus;
    }

    public final RankData getRankData() {
        return this.rankData;
    }

    public final void setFeedActionData(FeedActionData feedActionData) {
        o.LJIIIZ(feedActionData, "<set-?>");
        this.feedActionData = feedActionData;
    }

    public RollAdData(int i, FeedActionData feedActionData, RankData rankData) {
        o.LJIIIZ(feedActionData, "feedActionData");
        o.LJIIIZ(rankData, "rankData");
        this.feedStatus = i;
        this.feedActionData = feedActionData;
        this.rankData = rankData;
    }

    public /* synthetic */ RollAdData(int i, FeedActionData feedActionData, RankData rankData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? new FeedActionData(0L, 1, null) : feedActionData, rankData);
    }
}
