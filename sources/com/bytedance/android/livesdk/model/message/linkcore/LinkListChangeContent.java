package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class LinkListChangeContent extends F9E {

    @InterfaceC65349Pkn("type")
    public int listChangeType;

    @InterfaceC65349Pkn("list")
    public AllListUser userList;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkListChangeContent() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.listChangeType), this.userList};
    }

    public LinkListChangeContent(int i, AllListUser allListUser) {
        this.listChangeType = i;
        this.userList = allListUser;
    }

    public /* synthetic */ LinkListChangeContent(int i, AllListUser allListUser, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : allListUser);
    }
}
