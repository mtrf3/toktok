package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxEntranceExposedInfo {

    @InterfaceC65349Pkn("next_unread_notice")
    public final MusNotice nextUnreadNotice;

    @InterfaceC65349Pkn("next_unread_priority")
    public final int nextUnreadNoticePriority;

    @InterfaceC65349Pkn("notice_list")
    public final NoticeItems notices;

    public InboxEntranceExposedInfo() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ InboxEntranceExposedInfo copy$default(InboxEntranceExposedInfo inboxEntranceExposedInfo, NoticeItems noticeItems, MusNotice musNotice, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            noticeItems = inboxEntranceExposedInfo.notices;
        }
        if ((i2 & 2) != 0) {
            musNotice = inboxEntranceExposedInfo.nextUnreadNotice;
        }
        if ((i2 & 4) != 0) {
            i = inboxEntranceExposedInfo.nextUnreadNoticePriority;
        }
        return inboxEntranceExposedInfo.copy(noticeItems, musNotice, i);
    }

    public final InboxEntranceExposedInfo copy(NoticeItems noticeItems, MusNotice musNotice, int i) {
        return new InboxEntranceExposedInfo(noticeItems, musNotice, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxEntranceExposedInfo)) {
            return false;
        }
        InboxEntranceExposedInfo inboxEntranceExposedInfo = (InboxEntranceExposedInfo) obj;
        return o.LJ(this.notices, inboxEntranceExposedInfo.notices) && o.LJ(this.nextUnreadNotice, inboxEntranceExposedInfo.nextUnreadNotice) && this.nextUnreadNoticePriority == inboxEntranceExposedInfo.nextUnreadNoticePriority;
    }

    public int hashCode() {
        NoticeItems noticeItems = this.notices;
        int hashCode = (noticeItems == null ? 0 : noticeItems.hashCode()) * 31;
        MusNotice musNotice = this.nextUnreadNotice;
        return ((hashCode + (musNotice != null ? musNotice.hashCode() : 0)) * 31) + this.nextUnreadNoticePriority;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InboxEntranceExposedInfo(notices=");
        LIZ.append(this.notices);
        LIZ.append(", nextUnreadNotice=");
        LIZ.append(this.nextUnreadNotice);
        LIZ.append(", nextUnreadNoticePriority=");
        return b0.LIZJ(LIZ, this.nextUnreadNoticePriority, ')', LIZ);
    }

    public final MusNotice getNextUnreadNotice() {
        return this.nextUnreadNotice;
    }

    public final int getNextUnreadNoticePriority() {
        return this.nextUnreadNoticePriority;
    }

    public final NoticeItems getNotices() {
        return this.notices;
    }

    public InboxEntranceExposedInfo(NoticeItems noticeItems, MusNotice musNotice, int i) {
        this.notices = noticeItems;
        this.nextUnreadNotice = musNotice;
        this.nextUnreadNoticePriority = i;
    }

    public /* synthetic */ InboxEntranceExposedInfo(NoticeItems noticeItems, MusNotice musNotice, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : noticeItems, (i2 & 2) != 0 ? null : musNotice, (i2 & 4) != 0 ? 0 : i);
    }
}
