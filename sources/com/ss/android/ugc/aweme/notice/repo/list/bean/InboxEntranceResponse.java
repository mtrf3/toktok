package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxEntranceResponse extends BaseResponse {

    @InterfaceC65349Pkn("additional_notice_lists")
    public final List<NoticeItems> additionalNotices;

    @InterfaceC65349Pkn("notice_count_before_mark_read")
    public final List<NoticeCount> beforeMarkNoticeCounts;

    @InterfaceC65349Pkn("entrance_cells")
    public final List<InboxEntranceCell> entranceCells;

    @InterfaceC65349Pkn("groups_in_filters")
    public final List<NoticeInboxFilterGroups> groups;

    @InterfaceC65349Pkn("latest_notice_time")
    public final Long latestNoticeTime;

    @InterfaceC65349Pkn("notice_count")
    public final List<NoticeCount> noticeCounts;

    /* JADX WARN: Multi-variable type inference failed */
    public InboxEntranceResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InboxEntranceResponse copy$default(InboxEntranceResponse inboxEntranceResponse, List list, List list2, List list3, List list4, Long l, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = inboxEntranceResponse.entranceCells;
        }
        if ((i & 2) != 0) {
            list2 = inboxEntranceResponse.noticeCounts;
        }
        if ((i & 4) != 0) {
            list3 = inboxEntranceResponse.groups;
        }
        if ((i & 8) != 0) {
            list4 = inboxEntranceResponse.additionalNotices;
        }
        if ((i & 16) != 0) {
            l = inboxEntranceResponse.latestNoticeTime;
        }
        if ((i & 32) != 0) {
            list5 = inboxEntranceResponse.beforeMarkNoticeCounts;
        }
        return inboxEntranceResponse.copy(list, list2, list3, list4, l, list5);
    }

    public final InboxEntranceResponse copy(List<InboxEntranceCell> list, List<NoticeCount> list2, List<NoticeInboxFilterGroups> list3, List<NoticeItems> list4, Long l, List<NoticeCount> list5) {
        return new InboxEntranceResponse(list, list2, list3, list4, l, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxEntranceResponse)) {
            return false;
        }
        InboxEntranceResponse inboxEntranceResponse = (InboxEntranceResponse) obj;
        return o.LJ(this.entranceCells, inboxEntranceResponse.entranceCells) && o.LJ(this.noticeCounts, inboxEntranceResponse.noticeCounts) && o.LJ(this.groups, inboxEntranceResponse.groups) && o.LJ(this.additionalNotices, inboxEntranceResponse.additionalNotices) && o.LJ(this.latestNoticeTime, inboxEntranceResponse.latestNoticeTime) && o.LJ(this.beforeMarkNoticeCounts, inboxEntranceResponse.beforeMarkNoticeCounts);
    }

    public int hashCode() {
        List<InboxEntranceCell> list = this.entranceCells;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NoticeCount> list2 = this.noticeCounts;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NoticeInboxFilterGroups> list3 = this.groups;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<NoticeItems> list4 = this.additionalNotices;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Long l = this.latestNoticeTime;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        List<NoticeCount> list5 = this.beforeMarkNoticeCounts;
        return hashCode5 + (list5 != null ? list5.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InboxEntranceResponse(entranceCells=");
        LIZ.append(this.entranceCells);
        LIZ.append(", noticeCounts=");
        LIZ.append(this.noticeCounts);
        LIZ.append(", groups=");
        LIZ.append(this.groups);
        LIZ.append(", additionalNotices=");
        LIZ.append(this.additionalNotices);
        LIZ.append(", latestNoticeTime=");
        LIZ.append(this.latestNoticeTime);
        LIZ.append(", beforeMarkNoticeCounts=");
        return C1NE.LIZIZ(LIZ, this.beforeMarkNoticeCounts, ')', LIZ);
    }

    public final List<NoticeItems> getAdditionalNotices() {
        return this.additionalNotices;
    }

    public final List<NoticeCount> getBeforeMarkNoticeCounts() {
        return this.beforeMarkNoticeCounts;
    }

    public final List<InboxEntranceCell> getEntranceCells() {
        return this.entranceCells;
    }

    public final List<NoticeInboxFilterGroups> getGroups() {
        return this.groups;
    }

    public final Long getLatestNoticeTime() {
        return this.latestNoticeTime;
    }

    public final List<NoticeCount> getNoticeCounts() {
        return this.noticeCounts;
    }

    public InboxEntranceResponse(List<InboxEntranceCell> list, List<NoticeCount> list2, List<NoticeInboxFilterGroups> list3, List<NoticeItems> list4, Long l, List<NoticeCount> list5) {
        this.entranceCells = list;
        this.noticeCounts = list2;
        this.groups = list3;
        this.additionalNotices = list4;
        this.latestNoticeTime = l;
        this.beforeMarkNoticeCounts = list5;
    }

    public /* synthetic */ InboxEntranceResponse(List list, List list2, List list3, List list4, Long l, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? 0L : l, (i & 32) == 0 ? list5 : null);
    }
}
