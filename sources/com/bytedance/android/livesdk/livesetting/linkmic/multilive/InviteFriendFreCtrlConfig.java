package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class InviteFriendFreCtrlConfig {

    @InterfaceC65349Pkn("room_window")
    public RoomWindow roomWindow;

    @InterfaceC65349Pkn("friend_window")
    public long singleUserTimeWindow;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteFriendFreCtrlConfig() {
        this(null, 0L, 3, 0 == true ? 1 : 0);
    }

    public InviteFriendFreCtrlConfig(RoomWindow roomWindow, long j) {
        o.LJIIIZ(roomWindow, "roomWindow");
        this.roomWindow = roomWindow;
        this.singleUserTimeWindow = j;
    }

    public /* synthetic */ InviteFriendFreCtrlConfig(RoomWindow roomWindow, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new RoomWindow(0L, 0L, 3, null) : roomWindow, (i & 2) != 0 ? 180L : j);
    }
}
