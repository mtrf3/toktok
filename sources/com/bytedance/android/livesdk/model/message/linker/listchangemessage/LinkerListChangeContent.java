package com.bytedance.android.livesdk.model.message.linker.listchangemessage;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class LinkerListChangeContent {

    @InterfaceC65349Pkn("linked_users")
    public List<LinkListUser> onLineUsers = new ArrayList();

    @InterfaceC65349Pkn("applied_users")
    public List<LinkListUser> waitingUsers = new ArrayList();

    @InterfaceC65349Pkn("connecting_users")
    public List<LinkListUser> connectingUsers = new ArrayList();
}
