package com.bytedance.android.live.programmedlive.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class FollowCardCloseRequest extends F9E {

    @InterfaceC65349Pkn("card_anchor_id")
    public final long anchorId;

    @InterfaceC65349Pkn("card_id")
    public final long cardId;

    @InterfaceC65349Pkn("user_close")
    public final boolean isUserClose;

    @InterfaceC65349Pkn("room_id")
    public final long roodId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.roodId), Long.valueOf(this.cardId), Long.valueOf(this.anchorId), Boolean.valueOf(this.isUserClose)};
    }

    public FollowCardCloseRequest(long j, long j2, long j3, boolean z) {
        this.roodId = j;
        this.cardId = j2;
        this.anchorId = j3;
        this.isUserClose = z;
    }
}
