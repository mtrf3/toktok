package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tikcast.linkmic.controller.AnchorMessage;

/* loaded from: classes14.dex */
public final class AnchorClientList extends F9E {

    @InterfaceC65349Pkn("anchor_message")
    public AnchorMessage anchorMessage;

    @InterfaceC65349Pkn("apply_users")
    public List<WaitUser> applyUsers;

    @InterfaceC65349Pkn("invite_users")
    public List<WaitUser> inviteUsers;

    @InterfaceC65349Pkn("link_users")
    public List<LinkedUser> linkUsers;

    @InterfaceC65349Pkn("ready_users")
    public List<WaitUser> readyUsers;

    @InterfaceC65349Pkn("rtc_users")
    public List<WaitUser> rtcUsers;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorClientList() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.rtcUsers, this.applyUsers, this.inviteUsers, this.readyUsers, this.linkUsers, this.anchorMessage};
    }

    public AnchorClientList(List<WaitUser> list, List<WaitUser> list2, List<WaitUser> list3, List<WaitUser> list4, List<LinkedUser> list5, AnchorMessage anchorMessage) {
        this.rtcUsers = list;
        this.applyUsers = list2;
        this.inviteUsers = list3;
        this.readyUsers = list4;
        this.linkUsers = list5;
        this.anchorMessage = anchorMessage;
    }

    public /* synthetic */ AnchorClientList(List list, List list2, List list3, List list4, List list5, AnchorMessage anchorMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) == 0 ? anchorMessage : null);
    }
}
