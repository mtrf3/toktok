package com.ss.android.ugc.aweme.discover.model;

import X.C61878OQg;
import X.C64668PZo;
import X.InterfaceC65243Pj5;
import X.InterfaceC65349Pkn;
import X.K4J;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TrendingTopicList extends BaseResponse implements K4J, InterfaceC65243Pj5, LazyParseTask<TrendingTopicList> {

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("device_type")
    public final int deviceType;

    @InterfaceC65349Pkn("has_more")
    public final int hasMore;

    @InterfaceC65349Pkn("category_list")
    public List<TrendingTopic> items;
    public transient String jsonRawData;
    public transient Callable<TrendingTopicList> lazyParseCallable;
    public C64668PZo<?> requestInfo;

    public TrendingTopicList() {
        this(0, null, 0, 0, null, 31, null);
    }

    @Override // X.K4J
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }

    public final boolean doesHaveMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyParseTask
    public Callable<TrendingTopicList> getLazyParseCallable() {
        return this.lazyParseCallable;
    }

    @Override // X.K4J
    public C64668PZo<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final void setItems(List<TrendingTopic> list) {
        o.LJIIIZ(list, "<set-?>");
        this.items = list;
    }

    @Override // X.InterfaceC65243Pj5
    public void setJsonData(String str) {
        this.jsonRawData = str;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyParseTask
    public void setLazyParseCallable(Callable<TrendingTopicList> callable) {
        this.lazyParseCallable = callable;
    }

    @Override // X.K4J
    public void setRequestInfo(C64668PZo<?> c64668PZo) {
        if (c64668PZo != null) {
            this.requestInfo = c64668PZo;
        }
    }

    public TrendingTopicList(int i, List<TrendingTopic> items, int i2, int i3, C64668PZo<?> c64668PZo) {
        o.LJIIIZ(items, "items");
        this.deviceType = i;
        this.items = items;
        this.hasMore = i2;
        this.cursor = i3;
        this.requestInfo = c64668PZo;
    }

    public TrendingTopicList(int i, List list, int i2, int i3, C64668PZo c64668PZo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? C61878OQg.INSTANCE : list, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? null : c64668PZo);
    }
}
