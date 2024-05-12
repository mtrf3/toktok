package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import kotlin.jvm.internal.o;

/* renamed from: X.TsE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76002TsE {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final BizCancelApplyParams LIZLLL;
    public final java.util.Map<String, Object> LJ;

    public C76002TsE() {
        this(0L, 0L, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76002TsE)) {
            return false;
        }
        C76002TsE c76002TsE = (C76002TsE) obj;
        return this.LIZ == c76002TsE.LIZ && this.LIZIZ == c76002TsE.LIZIZ && o.LJ(this.LIZJ, c76002TsE.LIZJ) && o.LJ(this.LIZLLL, c76002TsE.LIZLLL) && o.LJ(this.LJ, c76002TsE.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        BizCancelApplyParams bizCancelApplyParams = this.LIZLLL;
        if (bizCancelApplyParams == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bizCancelApplyParams.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        java.util.Map<String, Object> map = this.LJ;
        if (map != null) {
            i = map.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelApplyParam(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", userId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", reason=");
        LIZ.append(this.LIZJ);
        LIZ.append(", bizCancelApplyParams=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", custom=");
        return C15890jp.LIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C76002TsE(long j, long j2, BizCancelApplyParams bizCancelApplyParams, int i) {
        j = (i & 1) != 0 ? -1L : j;
        j2 = (i & 2) != 0 ? -1L : j2;
        bizCancelApplyParams = (i & 8) != 0 ? null : bizCancelApplyParams;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = null;
        this.LIZLLL = bizCancelApplyParams;
        this.LJ = null;
    }
}
