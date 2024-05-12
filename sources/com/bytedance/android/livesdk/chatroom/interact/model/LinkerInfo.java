package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkerInfo extends F9E {

    @InterfaceC65349Pkn("linked_users")
    public List<UserInfo> linkedUsers;

    public LinkerInfo() {
        this(null, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.linkedUsers};
    }

    public LinkerInfo(List<UserInfo> linkedUsers) {
        o.LJIIIZ(linkedUsers, "linkedUsers");
        this.linkedUsers = linkedUsers;
    }

    public LinkerInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
