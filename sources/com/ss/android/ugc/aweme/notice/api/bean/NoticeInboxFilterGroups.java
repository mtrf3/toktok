package com.ss.android.ugc.aweme.notice.api.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeInboxFilterGroups {
    public int LIZ;

    @InterfaceC65349Pkn("filter_type")
    public int filterType;

    @InterfaceC65349Pkn("groups")
    public List<Integer> groups;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeInboxFilterGroups)) {
            return false;
        }
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) obj;
        return o.LJ(this.groups, noticeInboxFilterGroups.groups) && this.filterType == noticeInboxFilterGroups.filterType && this.LIZ == noticeInboxFilterGroups.LIZ;
    }

    public final int hashCode() {
        List<Integer> list = this.groups;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.filterType) * 31) + this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeInboxFilterGroups(groups=");
        LIZ.append(this.groups);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", innerFilterType=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public NoticeInboxFilterGroups(List<Integer> list, int i, int i2) {
        this.groups = list;
        this.filterType = i;
        this.LIZ = i2;
    }
}
