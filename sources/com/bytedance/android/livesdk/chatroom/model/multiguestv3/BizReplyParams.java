package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizReplyParams extends F9E {

    @InterfaceC65349Pkn("is_turn_off_invitation")
    public int isTurnOffInvitation;

    @InterfaceC65349Pkn("link_type")
    public long linkType;

    public BizReplyParams() {
        this(0L, 0, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.linkType), Integer.valueOf(this.isTurnOffInvitation)};
    }

    public BizReplyParams(long j, int i) {
        this.linkType = j;
        this.isTurnOffInvitation = i;
    }

    public /* synthetic */ BizReplyParams(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i);
    }
}
