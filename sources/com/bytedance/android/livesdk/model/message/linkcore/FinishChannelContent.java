package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class FinishChannelContent extends F9E {

    @InterfaceC65349Pkn("finish_reason")
    public long finishReason;

    @InterfaceC65349Pkn("owner")
    public Player owner;

    /* JADX WARN: Multi-variable type inference failed */
    public FinishChannelContent() {
        this(null, 0L, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.owner, Long.valueOf(this.finishReason)};
    }

    public FinishChannelContent(Player player, long j) {
        this.owner = player;
        this.finishReason = j;
    }

    public /* synthetic */ FinishChannelContent(Player player, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : player, (i & 2) != 0 ? 0L : j);
    }
}
