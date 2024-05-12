package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class JoinChannelResult {
    public final BizJoinChannelResponse multiGuestRespExtra;

    public static /* synthetic */ JoinChannelResult copy$default(JoinChannelResult joinChannelResult, BizJoinChannelResponse bizJoinChannelResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            bizJoinChannelResponse = joinChannelResult.multiGuestRespExtra;
        }
        return joinChannelResult.copy(bizJoinChannelResponse);
    }

    public final BizJoinChannelResponse component1() {
        return this.multiGuestRespExtra;
    }

    public final JoinChannelResult copy(BizJoinChannelResponse bizJoinChannelResponse) {
        return new JoinChannelResult(bizJoinChannelResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JoinChannelResult) && o.LJ(this.multiGuestRespExtra, ((JoinChannelResult) obj).multiGuestRespExtra);
    }

    public int hashCode() {
        BizJoinChannelResponse bizJoinChannelResponse = this.multiGuestRespExtra;
        if (bizJoinChannelResponse == null) {
            return 0;
        }
        return bizJoinChannelResponse.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JoinChannelResult(multiGuestRespExtra=");
        LIZ.append(this.multiGuestRespExtra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public JoinChannelResult(BizJoinChannelResponse bizJoinChannelResponse) {
        this.multiGuestRespExtra = bizJoinChannelResponse;
    }
}
