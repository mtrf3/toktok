package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class CreateChannelContent extends F9E {

    @InterfaceC65349Pkn("owner")
    public Player owner;

    @InterfaceC65349Pkn("owner_link_mic_id")
    public String ownerLinkMicId;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateChannelContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.owner, this.ownerLinkMicId};
    }

    public CreateChannelContent(Player player, String str) {
        this.owner = player;
        this.ownerLinkMicId = str;
    }

    public /* synthetic */ CreateChannelContent(Player player, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : player, (i & 2) != 0 ? null : str);
    }
}
