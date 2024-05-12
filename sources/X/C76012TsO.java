package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.TsO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76012TsO {
    public final String LIZ;
    public final long LIZIZ;
    public final BizLeaveParams LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76012TsO)) {
            return false;
        }
        C76012TsO c76012TsO = (C76012TsO) obj;
        return o.LJ(this.LIZ, c76012TsO.LIZ) && this.LIZIZ == c76012TsO.LIZIZ && o.LJ(this.LIZJ, c76012TsO.LIZJ) && this.LIZLLL == c76012TsO.LIZLLL;
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        BizLeaveParams bizLeaveParams = this.LIZJ;
        if (bizLeaveParams == null) {
            hashCode = 0;
        } else {
            hashCode = bizLeaveParams.hashCode();
        }
        return ((LIZJ + hashCode) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LeaveChannelParam(leaveSource=");
        LIZ.append(this.LIZ);
        LIZ.append(", notSuggestToUid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bizLeaveParams=");
        LIZ.append(this.LIZJ);
        LIZ.append(", leaveReason=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C76012TsO(String leaveSource, long j, BizLeaveParams bizLeaveParams, int i, int i2) {
        j = (i2 & 2) != 0 ? 0L : j;
        bizLeaveParams = (i2 & 4) != 0 ? null : bizLeaveParams;
        i = (i2 & 8) != 0 ? 0 : i;
        o.LJIIIZ(leaveSource, "leaveSource");
        this.LIZ = leaveSource;
        this.LIZIZ = j;
        this.LIZJ = bizLeaveParams;
        this.LIZLLL = i;
    }
}
