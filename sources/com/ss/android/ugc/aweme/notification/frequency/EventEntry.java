package com.ss.android.ugc.aweme.notification.frequency;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EventEntry {
    public String LIZ;

    @InterfaceC65349Pkn("notice_list")
    public List<ReportNotice> noticeList;

    /* JADX WARN: Multi-variable type inference failed */
    public EventEntry() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventEntry)) {
            return false;
        }
        EventEntry eventEntry = (EventEntry) obj;
        return o.LJ(this.LIZ, eventEntry.LIZ) && o.LJ(this.noticeList, eventEntry.noticeList);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return this.noticeList.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventEntry(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", noticeList=");
        return C1NE.LIZIZ(LIZ, this.noticeList, ')', LIZ);
    }

    public EventEntry(String str, List<ReportNotice> noticeList) {
        o.LJIIIZ(noticeList, "noticeList");
        this.LIZ = str;
        this.noticeList = noticeList;
    }

    public /* synthetic */ EventEntry(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
