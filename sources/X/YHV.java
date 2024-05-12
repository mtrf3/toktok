package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.FeedActionData;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHV implements Serializable {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public FeedActionData LJLJI;
    public final RankData LJLJJI;

    public final FeedActionData getFeedActionData() {
        return this.LJLJI;
    }

    public final int getFeedStatus() {
        return this.LJLILLLLZI;
    }

    public final String getId() {
        return this.LJLIL;
    }

    public final RankData getRankData() {
        return this.LJLJJI;
    }

    public final void setFeedActionData(FeedActionData feedActionData) {
        o.LJIIIZ(feedActionData, "<set-?>");
        this.LJLJI = feedActionData;
    }

    public YHV(String id, int i, FeedActionData feedActionData, RankData rankData) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(feedActionData, "feedActionData");
        o.LJIIIZ(rankData, "rankData");
        this.LJLIL = id;
        this.LJLILLLLZI = i;
        this.LJLJI = feedActionData;
        this.LJLJJI = rankData;
    }

    public /* synthetic */ YHV(String str, int i, FeedActionData feedActionData, RankData rankData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? new FeedActionData(0L, 1, null) : feedActionData, rankData);
    }
}
