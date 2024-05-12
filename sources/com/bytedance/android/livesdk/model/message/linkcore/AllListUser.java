package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class AllListUser extends F9E {

    @InterfaceC65349Pkn("applied_list")
    public List<LinkLayerListUser> appliedList;

    @InterfaceC65349Pkn("invited_list")
    public List<LinkLayerListUser> invitedList;

    @InterfaceC65349Pkn("linked_list")
    public List<LinkLayerListUser> linkedList;

    @InterfaceC65349Pkn("ready_list")
    public List<LinkLayerListUser> readyList;

    /* JADX WARN: Multi-variable type inference failed */
    public AllListUser() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.linkedList, this.appliedList, this.invitedList, this.readyList};
    }

    public AllListUser(List<LinkLayerListUser> list, List<LinkLayerListUser> list2, List<LinkLayerListUser> list3, List<LinkLayerListUser> list4) {
        this.linkedList = list;
        this.appliedList = list2;
        this.invitedList = list3;
        this.readyList = list4;
    }

    public /* synthetic */ AllListUser(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
