package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import X.JBR;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class InboxEntranceCell {

    @InterfaceC65349Pkn("ui_info_before_mark_read")
    public final InboxEntranceCellUIInfo beforeMarkUiInfo;

    @InterfaceC65349Pkn("unread_count_before_mark_read")
    public final int beforeMarkUnreadCount;

    @InterfaceC65349Pkn("can_hide")
    public final boolean canHide;

    @InterfaceC65349Pkn("can_pin")
    public final boolean canPin;

    @InterfaceC65349Pkn("entrance_id")
    public final int cellId;

    @InterfaceC65349Pkn("event_tracking_fields")
    public final List<KeyValueHolder> eventTrackingExtra;

    @InterfaceC65349Pkn("preview_window")
    public final InboxEntranceExposedInfo exposedInfo;

    @InterfaceC65349Pkn("filter_type")
    public final int filterType;

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("last_notice_create_time")
    public final long lastNoticeCreateTime;

    @InterfaceC65349Pkn("notice_preload_for_second_page")
    public final NoticeItems noticePreloadItem;

    @InterfaceC65349Pkn("sorting_priority")
    public final int priority;

    @InterfaceC65349Pkn("list_type")
    public final int systemNoticeType;

    @InterfaceC65349Pkn("ui_info")
    public final InboxEntranceCellUIInfo uiInfo;

    @InterfaceC65349Pkn("unread_count")
    public final int unreadCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InboxEntranceCell() {
        /*
            r19 = this;
            r1 = 0
            r4 = 0
            r5 = 0
            r17 = 32767(0x7fff, float:4.5916E-41)
            r0 = r19
            r2 = r1
            r3 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r4
            r13 = r4
            r14 = r1
            r15 = r4
            r16 = r4
            r18 = r4
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell.<init>():void");
    }

    public static /* synthetic */ InboxEntranceCell copy$default(InboxEntranceCell inboxEntranceCell, int i, int i2, int i3, InboxEntranceCellUIInfo inboxEntranceCellUIInfo, long j, boolean z, boolean z2, int i4, int i5, int i6, InboxEntranceExposedInfo inboxEntranceExposedInfo, List list, int i7, InboxEntranceCellUIInfo inboxEntranceCellUIInfo2, NoticeItems noticeItems, int i8, Object obj) {
        int i9 = i3;
        int i10 = i;
        int i11 = i2;
        long j2 = j;
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo3 = inboxEntranceCellUIInfo;
        boolean z3 = z2;
        boolean z4 = z;
        int i12 = i6;
        int i13 = i4;
        int i14 = i5;
        int i15 = i7;
        InboxEntranceExposedInfo inboxEntranceExposedInfo2 = inboxEntranceExposedInfo;
        List list2 = list;
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo4 = inboxEntranceCellUIInfo2;
        NoticeItems noticeItems2 = noticeItems;
        if ((i8 & 1) != 0) {
            i10 = inboxEntranceCell.cellId;
        }
        if ((i8 & 2) != 0) {
            i11 = inboxEntranceCell.priority;
        }
        if ((i8 & 4) != 0) {
            i9 = inboxEntranceCell.unreadCount;
        }
        if ((i8 & 8) != 0) {
            inboxEntranceCellUIInfo3 = inboxEntranceCell.uiInfo;
        }
        if ((i8 & 16) != 0) {
            j2 = inboxEntranceCell.lastNoticeCreateTime;
        }
        if ((i8 & 32) != 0) {
            z4 = inboxEntranceCell.canHide;
        }
        if ((i8 & 64) != 0) {
            z3 = inboxEntranceCell.canPin;
        }
        if ((i8 & 128) != 0) {
            i13 = inboxEntranceCell.filterType;
        }
        if ((i8 & 256) != 0) {
            i14 = inboxEntranceCell.group;
        }
        if ((i8 & 512) != 0) {
            i12 = inboxEntranceCell.systemNoticeType;
        }
        if ((i8 & 1024) != 0) {
            inboxEntranceExposedInfo2 = inboxEntranceCell.exposedInfo;
        }
        if ((i8 & 2048) != 0) {
            list2 = inboxEntranceCell.eventTrackingExtra;
        }
        if ((i8 & 4096) != 0) {
            i15 = inboxEntranceCell.beforeMarkUnreadCount;
        }
        if ((i8 & FileUtils.BUFFER_SIZE) != 0) {
            inboxEntranceCellUIInfo4 = inboxEntranceCell.beforeMarkUiInfo;
        }
        if ((i8 & 16384) != 0) {
            noticeItems2 = inboxEntranceCell.noticePreloadItem;
        }
        return inboxEntranceCell.copy(i10, i11, i9, inboxEntranceCellUIInfo3, j2, z4, z3, i13, i14, i12, inboxEntranceExposedInfo2, list2, i15, inboxEntranceCellUIInfo4, noticeItems2);
    }

    public final InboxEntranceCell copy(int i, int i2, int i3, InboxEntranceCellUIInfo inboxEntranceCellUIInfo, long j, boolean z, boolean z2, int i4, int i5, int i6, InboxEntranceExposedInfo inboxEntranceExposedInfo, List<KeyValueHolder> list, int i7, InboxEntranceCellUIInfo inboxEntranceCellUIInfo2, NoticeItems noticeItems) {
        return new InboxEntranceCell(i, i2, i3, inboxEntranceCellUIInfo, j, z, z2, i4, i5, i6, inboxEntranceExposedInfo, list, i7, inboxEntranceCellUIInfo2, noticeItems);
    }

    public String toString() {
        return "InboxEntranceCell(cellId=" + this.cellId + ", priority=" + this.priority + ", unreadCount=" + this.unreadCount + ", uiInfo=" + this.uiInfo + ", lastNoticeCreateTime=" + this.lastNoticeCreateTime + ", canHide=" + this.canHide + ", canPin=" + this.canPin + ", filterType=" + this.filterType + ", group=" + this.group + ", systemNoticeType=" + this.systemNoticeType + ", exposedInfo=" + this.exposedInfo + ", eventTrackingExtra=" + this.eventTrackingExtra + ", beforeMarkUnreadCount=" + this.beforeMarkUnreadCount + ", beforeMarkUiInfo=" + this.beforeMarkUiInfo + ", noticePreloadItem=" + this.noticePreloadItem + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = ((((this.cellId * 31) + this.priority) * 31) + this.unreadCount) * 31;
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo = this.uiInfo;
        int i2 = 0;
        if (inboxEntranceCellUIInfo == null) {
            hashCode = 0;
        } else {
            hashCode = inboxEntranceCellUIInfo.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.lastNoticeCreateTime, (i + hashCode) * 31, 31);
        boolean z = this.canHide;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (LIZJ + i4) * 31;
        if (!this.canPin) {
            i3 = 0;
        }
        int i6 = (((((((i5 + i3) * 31) + this.filterType) * 31) + this.group) * 31) + this.systemNoticeType) * 31;
        InboxEntranceExposedInfo inboxEntranceExposedInfo = this.exposedInfo;
        if (inboxEntranceExposedInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = inboxEntranceExposedInfo.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        List<KeyValueHolder> list = this.eventTrackingExtra;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i8 = (((i7 + hashCode3) * 31) + this.beforeMarkUnreadCount) * 31;
        InboxEntranceCellUIInfo inboxEntranceCellUIInfo2 = this.beforeMarkUiInfo;
        if (inboxEntranceCellUIInfo2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = inboxEntranceCellUIInfo2.hashCode();
        }
        int i9 = (i8 + hashCode4) * 31;
        NoticeItems noticeItems = this.noticePreloadItem;
        if (noticeItems != null) {
            i2 = noticeItems.hashCode();
        }
        return i9 + i2;
    }

    public final boolean isActivity() {
        if (this.cellId == 1) {
            return true;
        }
        return false;
    }

    public final boolean isFollower() {
        if (this.cellId == 2) {
            return true;
        }
        return false;
    }

    public final InboxEntranceCellUIInfo getBeforeMarkUiInfo() {
        return this.beforeMarkUiInfo;
    }

    public final int getBeforeMarkUnreadCount() {
        return this.beforeMarkUnreadCount;
    }

    public final boolean getCanHide() {
        return this.canHide;
    }

    public final boolean getCanPin() {
        return this.canPin;
    }

    public final int getCellId() {
        return this.cellId;
    }

    public final List<KeyValueHolder> getEventTrackingExtra() {
        return this.eventTrackingExtra;
    }

    public final InboxEntranceExposedInfo getExposedInfo() {
        return this.exposedInfo;
    }

    public final int getFilterType() {
        return this.filterType;
    }

    public final int getGroup() {
        return this.group;
    }

    public final long getLastNoticeCreateTime() {
        return this.lastNoticeCreateTime;
    }

    public final NoticeItems getNoticePreloadItem() {
        return this.noticePreloadItem;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getSystemNoticeType() {
        return this.systemNoticeType;
    }

    public final InboxEntranceCellUIInfo getUiInfo() {
        return this.uiInfo;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof InboxEntranceCell) && ((InboxEntranceCell) obj).cellId == this.cellId) {
            return true;
        }
        return false;
    }

    public InboxEntranceCell(int i, int i2, int i3, InboxEntranceCellUIInfo inboxEntranceCellUIInfo, long j, boolean z, boolean z2, int i4, int i5, int i6, InboxEntranceExposedInfo inboxEntranceExposedInfo, List<KeyValueHolder> list, int i7, InboxEntranceCellUIInfo inboxEntranceCellUIInfo2, NoticeItems noticeItems) {
        this.cellId = i;
        this.priority = i2;
        this.unreadCount = i3;
        this.uiInfo = inboxEntranceCellUIInfo;
        this.lastNoticeCreateTime = j;
        this.canHide = z;
        this.canPin = z2;
        this.filterType = i4;
        this.group = i5;
        this.systemNoticeType = i6;
        this.exposedInfo = inboxEntranceExposedInfo;
        this.eventTrackingExtra = list;
        this.beforeMarkUnreadCount = i7;
        this.beforeMarkUiInfo = inboxEntranceCellUIInfo2;
        this.noticePreloadItem = noticeItems;
    }

    public /* synthetic */ InboxEntranceCell(int i, int i2, int i3, InboxEntranceCellUIInfo inboxEntranceCellUIInfo, long j, boolean z, boolean z2, int i4, int i5, int i6, InboxEntranceExposedInfo inboxEntranceExposedInfo, List list, int i7, InboxEntranceCellUIInfo inboxEntranceCellUIInfo2, NoticeItems noticeItems, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? null : inboxEntranceCellUIInfo, (i8 & 16) != 0 ? 0L : j, (i8 & 32) != 0 ? false : z, (i8 & 64) != 0 ? false : z2, (i8 & 128) != 0 ? LiveLayoutPreloadThreadPriority.DEFAULT : i4, (i8 & 256) != 0 ? 0 : i5, (i8 & 512) != 0 ? 0 : i6, (i8 & 1024) != 0 ? null : inboxEntranceExposedInfo, (i8 & 2048) != 0 ? null : list, (i8 & 4096) != 0 ? 0 : i7, (i8 & FileUtils.BUFFER_SIZE) != 0 ? null : inboxEntranceCellUIInfo2, (i8 & 16384) != 0 ? null : noticeItems);
    }
}
