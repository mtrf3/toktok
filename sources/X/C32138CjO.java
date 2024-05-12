package X;

import com.bytedance.android.livesdk.gift.model.RiskCtl;
import kotlin.jvm.internal.o;

/* renamed from: X.CjO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32138CjO {
    public final long LIZ;
    public final RiskCtl LIZIZ;

    public C32138CjO() {
        this(0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32138CjO)) {
            return false;
        }
        C32138CjO c32138CjO = (C32138CjO) obj;
        return this.LIZ == c32138CjO.LIZ && o.LJ(this.LIZIZ, c32138CjO.LIZIZ);
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        RiskCtl riskCtl = this.LIZIZ;
        return LLJIJIL + (riskCtl == null ? 0 : riskCtl.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RiskCtlUpdateEvent(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", riskCtl=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C32138CjO(long j, RiskCtl riskCtl) {
        this.LIZ = j;
        this.LIZIZ = riskCtl;
    }
}
