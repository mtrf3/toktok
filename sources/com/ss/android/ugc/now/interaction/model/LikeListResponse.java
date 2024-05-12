package com.ss.android.ugc.now.interaction.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes4.dex */
public final class LikeListResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("is_downgrade")
    public boolean isDowngrade;

    @InterfaceC65349Pkn("has_more")
    public final boolean isHasMore;

    @InterfaceC65349Pkn("like_list")
    public final List<User> likeList;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPd;

    @InterfaceC65349Pkn("offset")
    public final long offset;

    @InterfaceC65349Pkn("total_count")
    public long total;

    public final long getCursor() {
        return this.cursor;
    }

    public final List<User> getLikeList() {
        return this.likeList;
    }

    public final LogPbBean getLogPd() {
        return this.logPd;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getTotal() {
        return this.total;
    }

    public final boolean isDowngrade() {
        return this.isDowngrade;
    }

    public final boolean isHasMore() {
        return this.isHasMore;
    }

    public final void setDowngrade(boolean z) {
        this.isDowngrade = z;
    }

    public final void setLogPd(LogPbBean logPbBean) {
        this.logPd = logPbBean;
    }

    public final void setTotal(long j) {
        this.total = j;
    }
}
