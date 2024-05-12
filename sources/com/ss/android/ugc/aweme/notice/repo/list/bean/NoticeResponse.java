package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes2.dex */
public class NoticeResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("notice_list")
    public List<BaseNotice> items;

    @InterfaceC65349Pkn("last_read_time")
    public long lastReadTime;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPbBean;

    @InterfaceC65349Pkn("max_time")
    public long maxTime;

    @InterfaceC65349Pkn("min_time")
    public long minTime;

    @InterfaceC65349Pkn("total")
    public int total;

    @InterfaceC65349Pkn("vcd_merge_total")
    public int vcdMergeTotal;

    @InterfaceC65349Pkn("vcd_toast_text")
    public String vcdToastText;

    public List<BaseNotice> getItems() {
        return this.items;
    }

    public long getLastReadTime() {
        return this.lastReadTime;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public int getTotal() {
        return this.total;
    }

    public int getVcdMergeTotal() {
        return this.vcdMergeTotal;
    }

    public String getVcdToastText() {
        return this.vcdToastText;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setItems(List<BaseNotice> list) {
        this.items = list;
    }

    public void setLastReadTime(long j) {
        this.lastReadTime = j;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setStatusCode(int i) {
        this.status_code = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public void setVcdMergeTotal(int i) {
        this.vcdMergeTotal = i;
    }

    public void setVcdToastText(String str) {
        this.vcdToastText = str;
    }
}
