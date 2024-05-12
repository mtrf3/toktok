package com.ss.android.ugc.aweme.kids.recommendfeed.model;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes13.dex */
public class KFeedItemList implements InterfaceC65316PkG {

    @InterfaceC65349Pkn("block_code")
    public int blockCode;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("aweme_list")
    public List<Aweme> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn(alternate = {"max_time"}, value = "max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn(alternate = {"min_time"}, value = "min_cursor")
    public long minCursor;

    @InterfaceC65349Pkn("refresh_clear")
    public int refreshClear;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public String statusMsg;

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public KFeedItemList m137clone() {
        KFeedItemList kFeedItemList = new KFeedItemList();
        kFeedItemList.minCursor = this.minCursor;
        kFeedItemList.maxCursor = this.maxCursor;
        kFeedItemList.hasMore = this.hasMore;
        kFeedItemList.items = this.items;
        kFeedItemList.requestId = this.requestId;
        kFeedItemList.refreshClear = this.refreshClear;
        kFeedItemList.statusCode = this.statusCode;
        kFeedItemList.statusMsg = this.statusMsg;
        kFeedItemList.blockCode = this.blockCode;
        kFeedItemList.logPb = this.logPb;
        return kFeedItemList;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean isRefreshClear() {
        if (this.refreshClear == 1) {
            return true;
        }
        return false;
    }

    public int getBlockCode() {
        return this.blockCode;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public List<Aweme> getItems() {
        return this.items;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public void setBlockCode(int i) {
        this.blockCode = i;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setItems(List<Aweme> list) {
        this.items = list;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setRefreshClear(int i) {
        this.refreshClear = i;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
