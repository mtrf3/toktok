package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxNoticePreviewWindowResponse extends BaseResponse {

    @InterfaceC65349Pkn("additional_notice_lists")
    public final List<NoticeItems> additionalNotices;

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("groups_in_filters")
    public final List<NoticeInboxFilterGroups> groups;

    @InterfaceC65349Pkn("next_unread_notice")
    public final MusNotice nextUnreadNotice;

    @InterfaceC65349Pkn("next_unread_notice_priority_enum")
    public final int nextUnreadNoticePriority;

    @InterfaceC65349Pkn("notice_count")
    public final List<NoticeCount> noticeCounts;

    @InterfaceC65349Pkn("notice_list")
    public final NoticeItems notices;

    /* JADX WARN: Multi-variable type inference failed */
    public InboxNoticePreviewWindowResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0L, 127, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InboxNoticePreviewWindowResponse copy$default(InboxNoticePreviewWindowResponse inboxNoticePreviewWindowResponse, NoticeItems noticeItems, MusNotice musNotice, List list, List list2, int i, List list3, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            noticeItems = inboxNoticePreviewWindowResponse.notices;
        }
        if ((i2 & 2) != 0) {
            musNotice = inboxNoticePreviewWindowResponse.nextUnreadNotice;
        }
        if ((i2 & 4) != 0) {
            list = inboxNoticePreviewWindowResponse.noticeCounts;
        }
        if ((i2 & 8) != 0) {
            list2 = inboxNoticePreviewWindowResponse.groups;
        }
        if ((i2 & 16) != 0) {
            i = inboxNoticePreviewWindowResponse.nextUnreadNoticePriority;
        }
        if ((i2 & 32) != 0) {
            list3 = inboxNoticePreviewWindowResponse.additionalNotices;
        }
        if ((i2 & 64) != 0) {
            j = inboxNoticePreviewWindowResponse.createTime;
        }
        return inboxNoticePreviewWindowResponse.copy(noticeItems, musNotice, list, list2, i, list3, j);
    }

    public final InboxNoticePreviewWindowResponse copy(NoticeItems noticeItems, MusNotice musNotice, List<NoticeCount> list, List<NoticeInboxFilterGroups> list2, int i, List<NoticeItems> list3, long j) {
        return new InboxNoticePreviewWindowResponse(noticeItems, musNotice, list, list2, i, list3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxNoticePreviewWindowResponse)) {
            return false;
        }
        InboxNoticePreviewWindowResponse inboxNoticePreviewWindowResponse = (InboxNoticePreviewWindowResponse) obj;
        return o.LJ(this.notices, inboxNoticePreviewWindowResponse.notices) && o.LJ(this.nextUnreadNotice, inboxNoticePreviewWindowResponse.nextUnreadNotice) && o.LJ(this.noticeCounts, inboxNoticePreviewWindowResponse.noticeCounts) && o.LJ(this.groups, inboxNoticePreviewWindowResponse.groups) && this.nextUnreadNoticePriority == inboxNoticePreviewWindowResponse.nextUnreadNoticePriority && o.LJ(this.additionalNotices, inboxNoticePreviewWindowResponse.additionalNotices) && this.createTime == inboxNoticePreviewWindowResponse.createTime;
    }

    public int hashCode() {
        NoticeItems noticeItems = this.notices;
        int hashCode = (noticeItems == null ? 0 : noticeItems.hashCode()) * 31;
        MusNotice musNotice = this.nextUnreadNotice;
        int hashCode2 = (hashCode + (musNotice == null ? 0 : musNotice.hashCode())) * 31;
        List<NoticeCount> list = this.noticeCounts;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<NoticeInboxFilterGroups> list2 = this.groups;
        int hashCode4 = (((hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.nextUnreadNoticePriority) * 31;
        List<NoticeItems> list3 = this.additionalNotices;
        return C16880lQ.LLJIJIL(this.createTime) + ((hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InboxNoticePreviewWindowResponse(notices=");
        LIZ.append(this.notices);
        LIZ.append(", nextUnreadNotice=");
        LIZ.append(this.nextUnreadNotice);
        LIZ.append(", noticeCounts=");
        LIZ.append(this.noticeCounts);
        LIZ.append(", groups=");
        LIZ.append(this.groups);
        LIZ.append(", nextUnreadNoticePriority=");
        LIZ.append(this.nextUnreadNoticePriority);
        LIZ.append(", additionalNotices=");
        LIZ.append(this.additionalNotices);
        LIZ.append(", createTime=");
        return C47135Ieh.LIZIZ(LIZ, this.createTime, ')', LIZ);
    }

    public final List<NoticeItems> getAdditionalNotices() {
        return this.additionalNotices;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<NoticeInboxFilterGroups> getGroups() {
        return this.groups;
    }

    public final MusNotice getNextUnreadNotice() {
        return this.nextUnreadNotice;
    }

    public final int getNextUnreadNoticePriority() {
        return this.nextUnreadNoticePriority;
    }

    public final List<NoticeCount> getNoticeCounts() {
        return this.noticeCounts;
    }

    public final NoticeItems getNotices() {
        return this.notices;
    }

    public InboxNoticePreviewWindowResponse(NoticeItems noticeItems, MusNotice musNotice, List<NoticeCount> list, List<NoticeInboxFilterGroups> list2, int i, List<NoticeItems> list3, long j) {
        this.notices = noticeItems;
        this.nextUnreadNotice = musNotice;
        this.noticeCounts = list;
        this.groups = list2;
        this.nextUnreadNoticePriority = i;
        this.additionalNotices = list3;
        this.createTime = j;
    }

    public /* synthetic */ InboxNoticePreviewWindowResponse(NoticeItems noticeItems, MusNotice musNotice, List list, List list2, int i, List list3, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : noticeItems, (i2 & 2) != 0 ? null : musNotice, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? list3 : null, (i2 & 64) != 0 ? System.currentTimeMillis() : j);
    }
}
