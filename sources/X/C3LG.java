package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3LG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LG {
    public final int LIZ;
    public final int LIZIZ;
    public final C63120Opw LIZJ;
    public final int LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3LG)) {
            return false;
        }
        C3LG c3lg = (C3LG) obj;
        return this.LIZ == c3lg.LIZ && this.LIZIZ == c3lg.LIZIZ && o.LJ(this.LIZJ, c3lg.LIZJ) && this.LIZLLL == c3lg.LIZLLL && this.LJ == c3lg.LJ;
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        C63120Opw c63120Opw = this.LIZJ;
        return C16880lQ.LLJIJIL(this.LJ) + ((((i + (c63120Opw == null ? 0 : c63120Opw.hashCode())) * 31) + this.LIZLLL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageRequestCountBox(unreadMessageRequestCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", unreadFilteredRequestCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", latestConvo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", totalMessageRequestCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", updateTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C3LG(int i, int i2, C63120Opw c63120Opw, int i3, long j) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c63120Opw;
        this.LIZLLL = i3;
        this.LJ = j;
    }
}
