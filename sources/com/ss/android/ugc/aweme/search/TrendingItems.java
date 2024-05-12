package com.ss.android.ugc.aweme.search;

import X.C64668PZo;
import X.InterfaceC65349Pkn;
import X.K4J;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingItems extends BaseResponse implements K4J {
    public C64668PZo<?> LJLIL;

    @InterfaceC65349Pkn("hotspot_items")
    public List<? extends Aweme> awemeList;

    @InterfaceC65349Pkn("billboard_info")
    public List<TrendingEventModel> billboardInfo;

    @InterfaceC65349Pkn("billboard_type")
    public int billboardType;

    @InterfaceC65349Pkn("offset")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("item_list")
    public List<String> itemList;

    @InterfaceC65349Pkn("total")
    public int total;

    @InterfaceC65349Pkn("item_related_event_id")
    public String trendingId;

    @Override // X.K4J
    public final /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }

    @Override // X.K4J
    public final C64668PZo<?> getRequestInfo() {
        return this.LJLIL;
    }

    @Override // X.K4J
    public final void setRequestInfo(C64668PZo<?> c64668PZo) {
        if (c64668PZo != null) {
            this.LJLIL = c64668PZo;
        }
    }

    public TrendingItems(List<? extends Aweme> list, List<TrendingEventModel> list2, String trendingId, int i, int i2, int i3, int i4, List<String> list3, C64668PZo<?> c64668PZo) {
        o.LJIIIZ(trendingId, "trendingId");
        this.awemeList = list;
        this.billboardInfo = list2;
        this.trendingId = trendingId;
        this.billboardType = i;
        this.hasMore = i2;
        this.cursor = i3;
        this.total = i4;
        this.itemList = list3;
        this.LJLIL = c64668PZo;
    }

    public /* synthetic */ TrendingItems(List list, List list2, String str, int i, int i2, int i3, int i4, List list3, C64668PZo c64668PZo, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0 : i4, list3, (i5 & 256) != 0 ? null : c64668PZo);
    }
}
