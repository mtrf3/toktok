package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class POJ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Object LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POJ)) {
            return false;
        }
        POJ poj = (POJ) obj;
        return o.LJ(this.LIZ, poj.LIZ) && o.LJ(this.LIZIZ, poj.LIZIZ) && o.LJ(this.LIZJ, poj.LIZJ) && o.LJ(this.LIZLLL, poj.LIZLLL) && this.LJ == poj.LJ;
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        Object obj = this.LIZLLL;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJ) + ((LJ + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TraceLogModel(traceId=");
        LIZ.append(this.LIZ);
        LIZ.append(", service=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", traceType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", realTraceObjRef=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", createTs=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public POJ(long j, PIF pif, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = pif;
        this.LJ = j;
    }
}
