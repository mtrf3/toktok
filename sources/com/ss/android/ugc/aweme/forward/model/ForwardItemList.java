package com.ss.android.ugc.aweme.forward.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes2.dex */
public class ForwardItemList {

    @InterfaceC65349Pkn("error_code")
    public int error_code;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("forward_list")
    public List<Aweme> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn(alternate = {"max_time"}, value = "max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn(alternate = {"min_time"}, value = "min_cursor")
    public long minCursor;

    @InterfaceC65349Pkn("status_code")
    public int status_code;

    @InterfaceC65349Pkn("status_msg")
    public String status_msg;

    public int getError_code() {
        return this.error_code;
    }

    public Extra getExtra() {
        return this.extra;
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

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public void setError_code(int i) {
        this.error_code = i;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
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

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}
