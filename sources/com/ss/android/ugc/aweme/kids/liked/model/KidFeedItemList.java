package com.ss.android.ugc.aweme.kids.liked.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes7.dex */
public class KidFeedItemList {

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("aweme_list")
    public List<? extends Aweme> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn(alternate = {"max_time"}, value = "max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn(alternate = {"min_time"}, value = "min_cursor")
    public long minCursor;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    @InterfaceC65349Pkn("status_code")
    public int status_code;

    public final int getHasMore() {
        return this.hasMore;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setItems(List<? extends Aweme> list) {
        this.items = list;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public final void setMinCursor(long j) {
        this.minCursor = j;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }
}
