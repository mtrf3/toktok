package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class LeaveContent extends F9E {

    @InterfaceC65349Pkn("leave_reason")
    public long leaveReason;

    @InterfaceC65349Pkn("leaver")
    public Player leftUser;

    /* JADX WARN: Multi-variable type inference failed */
    public LeaveContent() {
        this(null, 0L, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.leftUser, Long.valueOf(this.leaveReason)};
    }

    public LeaveContent(Player player, long j) {
        this.leftUser = player;
        this.leaveReason = j;
    }

    public /* synthetic */ LeaveContent(Player player, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : player, (i & 2) != 0 ? 0L : j);
    }
}
