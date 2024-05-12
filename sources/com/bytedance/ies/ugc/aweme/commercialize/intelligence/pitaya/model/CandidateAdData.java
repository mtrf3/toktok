package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class CandidateAdData implements Serializable {

    @InterfaceC65349Pkn("feed_action_data")
    public FeedActionData feedActionData;

    @InterfaceC65349Pkn("feed_status")
    public int feedStatus;

    @InterfaceC65349Pkn("feed_data")
    public final RankData rankData;

    @InterfaceC65349Pkn("source")
    public int source;

    public final FeedActionData getFeedActionData() {
        return this.feedActionData;
    }

    public final int getFeedStatus() {
        return this.feedStatus;
    }

    public final RankData getRankData() {
        return this.rankData;
    }

    public final int getSource() {
        return this.source;
    }

    public final void setFeedActionData(FeedActionData feedActionData) {
        o.LJIIIZ(feedActionData, "<set-?>");
        this.feedActionData = feedActionData;
    }

    public final void setFeedStatus(int i) {
        this.feedStatus = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public CandidateAdData(int i, int i2, FeedActionData feedActionData, RankData rankData) {
        o.LJIIIZ(feedActionData, "feedActionData");
        o.LJIIIZ(rankData, "rankData");
        this.feedStatus = i;
        this.source = i2;
        this.feedActionData = feedActionData;
        this.rankData = rankData;
    }

    public /* synthetic */ CandidateAdData(int i, int i2, FeedActionData feedActionData, RankData rankData, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new FeedActionData(0L, 1, null) : feedActionData, rankData);
    }
}
