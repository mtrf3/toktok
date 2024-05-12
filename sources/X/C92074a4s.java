package X;

import com.ss.android.ugc.aweme.bnpl.network.model.AlertMsg;
import com.ss.android.ugc.aweme.bnpl.network.model.StatusReason;
import kotlin.jvm.internal.o;

/* renamed from: X.a4s, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92074a4s {
    public final EnumC92075a4t LIZ;
    public final StatusReason LIZIZ;
    public final AlertMsg LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92074a4s)) {
            return false;
        }
        C92074a4s c92074a4s = (C92074a4s) obj;
        return this.LIZ == c92074a4s.LIZ && o.LJ(this.LIZIZ, c92074a4s.LIZIZ) && o.LJ(this.LIZJ, c92074a4s.LIZJ) && o.LJ(this.LIZLLL, c92074a4s.LIZLLL) && o.LJ(this.LJ, c92074a4s.LJ) && this.LJFF == c92074a4s.LJFF;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        StatusReason statusReason = this.LIZIZ;
        int hashCode2 = (hashCode + (statusReason == null ? 0 : statusReason.hashCode())) * 31;
        AlertMsg alertMsg = this.LIZJ;
        int hashCode3 = (hashCode2 + (alertMsg == null ? 0 : alertMsg.hashCode())) * 31;
        String str = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinVerifyResult(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", reason=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", alertMsg=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nextVerifyInfo=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJ);
        LIZ.append(", verifyTime=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C92074a4s(EnumC92075a4t status, StatusReason statusReason, AlertMsg alertMsg, String str, String str2, int i) {
        o.LJIIIZ(status, "status");
        this.LIZ = status;
        this.LIZIZ = statusReason;
        this.LIZJ = alertMsg;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = i;
    }
}
