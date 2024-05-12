package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class KickOutContent extends F9E {

    @InterfaceC65349Pkn("kickout_reason")
    public int kickOutReason;

    @InterfaceC65349Pkn("offliner")
    public Player leftUser;

    /* JADX WARN: Multi-variable type inference failed */
    public KickOutContent() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.leftUser, Integer.valueOf(this.kickOutReason)};
    }

    public KickOutContent(Player player, int i) {
        this.leftUser = player;
        this.kickOutReason = i;
    }

    public /* synthetic */ KickOutContent(Player player, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : player, (i2 & 2) != 0 ? 0 : i);
    }
}
