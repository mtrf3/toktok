package com.ss.android.ugc.aweme.notice.api.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class NoticeList extends BaseResponse {

    @InterfaceC65349Pkn("direct_message_count")
    public long dmCount;

    @InterfaceC65349Pkn("follow_tab_channel_count")
    public List<Object> followTabChannelCounts;

    @InterfaceC65349Pkn("groups_in_filters")
    public List<NoticeInboxFilterGroups> groups;

    @InterfaceC65349Pkn("notice_count")
    public List<NoticeCount> items;

    @InterfaceC65349Pkn("latest_notice_time")
    public Long latestNoticeTime;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeList() {
        this(null, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final long getDmCount() {
        return this.dmCount;
    }

    public final List<Object> getFollowTabChannelCounts() {
        return this.followTabChannelCounts;
    }

    public final List<NoticeInboxFilterGroups> getGroups() {
        return this.groups;
    }

    public final List<NoticeCount> getItems() {
        return this.items;
    }

    public final Long getLatestNoticeTime() {
        return this.latestNoticeTime;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final void setDmCount(long j) {
        this.dmCount = j;
    }

    public final void setFollowTabChannelCounts(List<Object> list) {
        this.followTabChannelCounts = list;
    }

    public final void setGroups(List<NoticeInboxFilterGroups> list) {
        this.groups = list;
    }

    public final void setItems(List<NoticeCount> list) {
        this.items = list;
    }

    public final void setLatestNoticeTime(Long l) {
        this.latestNoticeTime = l;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUserId(Long l) {
        this.userId = l;
    }

    public NoticeList(Long l, List<NoticeCount> list, long j, LogPbBean logPbBean, List<NoticeInboxFilterGroups> list2, List<Object> list3, Long l2) {
        this.userId = l;
        this.items = list;
        this.dmCount = j;
        this.logPb = logPbBean;
        this.groups = list2;
        this.followTabChannelCounts = list3;
        this.latestNoticeTime = l2;
    }

    public /* synthetic */ NoticeList(Long l, List list, long j, LogPbBean logPbBean, List list2, List list3, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : list, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : logPbBean, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) == 0 ? l2 : null);
    }
}
