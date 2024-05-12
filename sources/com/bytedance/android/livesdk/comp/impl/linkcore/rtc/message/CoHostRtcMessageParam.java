package com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CoHostRtcMessageParam extends F9E {

    @InterfaceC65349Pkn("invitee_linkmic_id")
    public final String inviteeLinkmicId;

    @InterfaceC65349Pkn("inviter_linkmic_id")
    public final String inviterLinkmicId;

    @InterfaceC65349Pkn("status")
    public final int status;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.status), this.inviterLinkmicId, this.inviteeLinkmicId};
    }

    public CoHostRtcMessageParam(int i, String inviterLinkmicId, String inviteeLinkmicId) {
        o.LJIIIZ(inviterLinkmicId, "inviterLinkmicId");
        o.LJIIIZ(inviteeLinkmicId, "inviteeLinkmicId");
        this.status = i;
        this.inviterLinkmicId = inviterLinkmicId;
        this.inviteeLinkmicId = inviteeLinkmicId;
    }
}
