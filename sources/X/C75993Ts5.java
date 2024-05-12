package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Ts5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75993Ts5 {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final BizPermitParams LJFF;
    public final java.util.Map<String, Object> LJI;

    public C75993Ts5() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75993Ts5)) {
            return false;
        }
        C75993Ts5 c75993Ts5 = (C75993Ts5) obj;
        return this.LIZ == c75993Ts5.LIZ && this.LIZIZ == c75993Ts5.LIZIZ && o.LJ(this.LIZJ, c75993Ts5.LIZJ) && o.LJ(this.LIZLLL, c75993Ts5.LIZLLL) && this.LJ == c75993Ts5.LJ && o.LJ(this.LJFF, c75993Ts5.LJFF) && o.LJ(this.LJI, c75993Ts5.LJI);
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
        int LJ = (C79062V1e.LJ(this.LIZLLL, (LIZJ + hashCode) * 31, 31) + this.LJ) * 31;
        BizPermitParams bizPermitParams = this.LJFF;
        if (bizPermitParams == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bizPermitParams.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        java.util.Map<String, Object> map = this.LJI;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermitApplyParam(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", userId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", layoutId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", linkMicId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", permitStatus=");
        LIZ.append(this.LJ);
        LIZ.append(", bizPermitParams=");
        LIZ.append(this.LJFF);
        LIZ.append(", custom=");
        return C15890jp.LIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C75993Ts5(long j, long j2, String str, String linkMicId, int i, BizPermitParams bizPermitParams, int i2) {
        str = (i2 & 4) != 0 ? null : str;
        linkMicId = (i2 & 8) != 0 ? "" : linkMicId;
        bizPermitParams = (i2 & 32) != 0 ? null : bizPermitParams;
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = linkMicId;
        this.LJ = i;
        this.LJFF = bizPermitParams;
        this.LJI = null;
    }
}
