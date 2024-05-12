package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeItems {

    @InterfaceC65349Pkn("common_last_read_time")
    public final long commonLastReadTime;

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("notice_list")
    public List<? extends MusNotice> items;

    @InterfaceC65349Pkn("last_read_time")
    public final long lastReadTime;

    @InterfaceC65349Pkn("list_type")
    public final int listType;

    @InterfaceC65349Pkn("max_time")
    public final long maxTime;

    @InterfaceC65349Pkn("min_time")
    public final long minTime;

    @InterfaceC65349Pkn("total")
    public final int total;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NoticeItems() {
        /*
            r16 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r14 = 511(0x1ff, float:7.16E-43)
            r0 = r16
            r3 = r2
            r6 = r4
            r8 = r4
            r10 = r2
            r11 = r2
            r12 = r4
            r15 = r1
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11, r12, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeItems copy$default(NoticeItems noticeItems, List list, boolean z, int i, long j, long j2, long j3, int i2, int i3, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = noticeItems.items;
        }
        if ((i4 & 2) != 0) {
            z = noticeItems.hasMore;
        }
        if ((i4 & 4) != 0) {
            i = noticeItems.total;
        }
        if ((i4 & 8) != 0) {
            j = noticeItems.maxTime;
        }
        if ((i4 & 16) != 0) {
            j2 = noticeItems.minTime;
        }
        if ((i4 & 32) != 0) {
            j3 = noticeItems.lastReadTime;
        }
        if ((i4 & 64) != 0) {
            i2 = noticeItems.group;
        }
        if ((i4 & 128) != 0) {
            i3 = noticeItems.listType;
        }
        if ((i4 & 256) != 0) {
            j4 = noticeItems.commonLastReadTime;
        }
        return noticeItems.copy(list, z, i, j, j2, j3, i2, i3, j4);
    }

    public final NoticeItems copy(List<? extends MusNotice> list, boolean z, int i, long j, long j2, long j3, int i2, int i3, long j4) {
        return new NoticeItems(list, z, i, j, j2, j3, i2, i3, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeItems)) {
            return false;
        }
        NoticeItems noticeItems = (NoticeItems) obj;
        return o.LJ(this.items, noticeItems.items) && this.hasMore == noticeItems.hasMore && this.total == noticeItems.total && this.maxTime == noticeItems.maxTime && this.minTime == noticeItems.minTime && this.lastReadTime == noticeItems.lastReadTime && this.group == noticeItems.group && this.listType == noticeItems.listType && this.commonLastReadTime == noticeItems.commonLastReadTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        List<? extends MusNotice> list = this.items;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.hasMore;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return C16880lQ.LLJIJIL(this.commonLastReadTime) + ((((JBR.LIZJ(this.lastReadTime, JBR.LIZJ(this.minTime, JBR.LIZJ(this.maxTime, (((i + i2) * 31) + this.total) * 31, 31), 31), 31) + this.group) * 31) + this.listType) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeItems(items=");
        LIZ.append(this.items);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", total=");
        LIZ.append(this.total);
        LIZ.append(", maxTime=");
        LIZ.append(this.maxTime);
        LIZ.append(", minTime=");
        LIZ.append(this.minTime);
        LIZ.append(", lastReadTime=");
        LIZ.append(this.lastReadTime);
        LIZ.append(", group=");
        LIZ.append(this.group);
        LIZ.append(", listType=");
        LIZ.append(this.listType);
        LIZ.append(", commonLastReadTime=");
        return C47135Ieh.LIZIZ(LIZ, this.commonLastReadTime, ')', LIZ);
    }

    public final long getCommonLastReadTime() {
        return this.commonLastReadTime;
    }

    public final int getGroup() {
        return this.group;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<MusNotice> getItems() {
        return this.items;
    }

    public final long getLastReadTime() {
        return this.lastReadTime;
    }

    public final int getListType() {
        return this.listType;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final long getMinTime() {
        return this.minTime;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setItems(List<? extends MusNotice> list) {
        this.items = list;
    }

    public NoticeItems(List<? extends MusNotice> list, boolean z, int i, long j, long j2, long j3, int i2, int i3, long j4) {
        this.items = list;
        this.hasMore = z;
        this.total = i;
        this.maxTime = j;
        this.minTime = j2;
        this.lastReadTime = j3;
        this.group = i2;
        this.listType = i3;
        this.commonLastReadTime = j4;
    }

    public /* synthetic */ NoticeItems(List list, boolean z, int i, long j, long j2, long j3, int i2, int i3, long j4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : list, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? 0L : j2, (i4 & 32) != 0 ? 0L : j3, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) == 0 ? i3 : 0, (i4 & 256) == 0 ? j4 : 0L);
    }
}
