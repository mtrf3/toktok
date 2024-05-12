package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C169696lJ;
import X.U66;
import X.X1D;
import com.bytedance.android.livesdk.model.message.linkcore.JoinChannelResp;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class JoinChannelMessage {
    public final JoinChannelResp joinChannelResponse;
    public final boolean joinChannelSucceed;
    public final U66 linker;
    public final Throwable throwable;

    public static /* synthetic */ JoinChannelMessage copy$default(JoinChannelMessage joinChannelMessage, U66 u66, boolean z, JoinChannelResp joinChannelResp, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            u66 = joinChannelMessage.linker;
        }
        if ((i & 2) != 0) {
            z = joinChannelMessage.joinChannelSucceed;
        }
        if ((i & 4) != 0) {
            joinChannelResp = joinChannelMessage.joinChannelResponse;
        }
        if ((i & 8) != 0) {
            th = joinChannelMessage.throwable;
        }
        return joinChannelMessage.copy(u66, z, joinChannelResp, th);
    }

    public final JoinChannelMessage copy(U66 linker, boolean z, JoinChannelResp joinChannelResp, Throwable th) {
        o.LJIIIZ(linker, "linker");
        return new JoinChannelMessage(linker, z, joinChannelResp, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinChannelMessage)) {
            return false;
        }
        JoinChannelMessage joinChannelMessage = (JoinChannelMessage) obj;
        return o.LJ(this.linker, joinChannelMessage.linker) && this.joinChannelSucceed == joinChannelMessage.joinChannelSucceed && o.LJ(this.joinChannelResponse, joinChannelMessage.joinChannelResponse) && o.LJ(this.throwable, joinChannelMessage.throwable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.linker.hashCode() * 31;
        boolean z = this.joinChannelSucceed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        JoinChannelResp joinChannelResp = this.joinChannelResponse;
        int hashCode2 = (i2 + (joinChannelResp == null ? 0 : joinChannelResp.hashCode())) * 31;
        Throwable th = this.throwable;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JoinChannelMessage(linker=");
        LIZ.append(this.linker);
        LIZ.append(", joinChannelSucceed=");
        LIZ.append(this.joinChannelSucceed);
        LIZ.append(", joinChannelResponse=");
        LIZ.append(this.joinChannelResponse);
        LIZ.append(", throwable=");
        return C169696lJ.LIZLLL(LIZ, this.throwable, ')', LIZ);
    }

    public final JoinChannelResp getJoinChannelResponse() {
        return this.joinChannelResponse;
    }

    public final boolean getJoinChannelSucceed() {
        return this.joinChannelSucceed;
    }

    public final U66 getLinker() {
        return this.linker;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public JoinChannelMessage(U66 linker, boolean z, JoinChannelResp joinChannelResp, Throwable th) {
        o.LJIIIZ(linker, "linker");
        this.linker = linker;
        this.joinChannelSucceed = z;
        this.joinChannelResponse = joinChannelResp;
        this.throwable = th;
    }
}
