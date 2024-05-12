package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GroupIdListStruct implements Serializable {

    @InterfaceC65349Pkn("GroupdIdList0")
    public List<Long> groupIdList0;

    @InterfaceC65349Pkn("GroupdIdList1")
    public List<Long> groupIdList1;

    /* JADX WARN: Multi-variable type inference failed */
    public GroupIdListStruct() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupIdListStruct copy$default(GroupIdListStruct groupIdListStruct, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = groupIdListStruct.groupIdList0;
        }
        if ((i & 2) != 0) {
            list2 = groupIdListStruct.groupIdList1;
        }
        return groupIdListStruct.copy(list, list2);
    }

    public final GroupIdListStruct copy(List<Long> list, List<Long> list2) {
        return new GroupIdListStruct(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupIdListStruct)) {
            return false;
        }
        GroupIdListStruct groupIdListStruct = (GroupIdListStruct) obj;
        return o.LJ(this.groupIdList0, groupIdListStruct.groupIdList0) && o.LJ(this.groupIdList1, groupIdListStruct.groupIdList1);
    }

    public int hashCode() {
        List<Long> list = this.groupIdList0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Long> list2 = this.groupIdList1;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean isEmpty0() {
        List<Long> list = this.groupIdList0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty1() {
        List<Long> list = this.groupIdList1;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupIdListStruct(groupIdList0=");
        LIZ.append(this.groupIdList0);
        LIZ.append(", groupIdList1=");
        return C1NE.LIZIZ(LIZ, this.groupIdList1, ')', LIZ);
    }

    public final List<Long> getGroupIdList0() {
        return this.groupIdList0;
    }

    public final List<Long> getGroupIdList1() {
        return this.groupIdList1;
    }

    public GroupIdListStruct(List<Long> list, List<Long> list2) {
        this.groupIdList0 = list;
        this.groupIdList1 = list2;
    }

    public /* synthetic */ GroupIdListStruct(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
