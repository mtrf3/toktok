package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFV {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HFV)) {
            return false;
        }
        HFV hfv = (HFV) obj;
        return this.LIZ == hfv.LIZ && this.LIZIZ == hfv.LIZIZ && o.LJ(this.LIZJ, hfv.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordUploadVideoInfo(startTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", endTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", path=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public HFV(long j, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
    }
}
