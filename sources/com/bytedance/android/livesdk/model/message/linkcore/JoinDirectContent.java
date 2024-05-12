package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class JoinDirectContent extends F9E {

    @InterfaceC65349Pkn("all_users")
    public AllListUser allUsers;

    @InterfaceC65349Pkn("joiner")
    public LinkLayerListUser joiner;

    /* JADX WARN: Multi-variable type inference failed */
    public JoinDirectContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.joiner, this.allUsers};
    }

    public JoinDirectContent(LinkLayerListUser linkLayerListUser, AllListUser allListUser) {
        this.joiner = linkLayerListUser;
        this.allUsers = allListUser;
    }

    public /* synthetic */ JoinDirectContent(LinkLayerListUser linkLayerListUser, AllListUser allListUser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkLayerListUser, (i & 2) != 0 ? null : allListUser);
    }
}
