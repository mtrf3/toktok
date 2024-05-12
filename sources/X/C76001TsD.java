package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TsD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76001TsD {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final java.util.Map<String, Object> LJ;
    public final long LJFF;

    public C76001TsD() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76001TsD)) {
            return false;
        }
        C76001TsD c76001TsD = (C76001TsD) obj;
        return this.LIZ == c76001TsD.LIZ && this.LIZIZ == c76001TsD.LIZIZ && o.LJ(this.LIZJ, c76001TsD.LIZJ) && o.LJ(this.LIZLLL, c76001TsD.LIZLLL) && o.LJ(this.LJ, c76001TsD.LJ) && this.LJFF == c76001TsD.LJFF;
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31);
        String str = this.LIZLLL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        java.util.Map<String, Object> map = this.LJ;
        if (map != null) {
            i = map.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJFF) + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelInviteParam(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", userId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", linkMicId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", reason=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", custom=");
        LIZ.append(this.LJ);
        LIZ.append(", timeOutInterval=");
        return C47135Ieh.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C76001TsD(long j, long j2, long j3, int i) {
        String linkMicId;
        if ((i & 4) != 0) {
            linkMicId = "";
        } else {
            linkMicId = null;
        }
        j3 = (i & 32) != 0 ? -1L : j3;
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = linkMicId;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = j3;
    }
}
