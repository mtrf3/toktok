package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HG9 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HG9)) {
            return false;
        }
        HG9 hg9 = (HG9) obj;
        return o.LJ(this.LIZ, hg9.LIZ) && this.LIZIZ == hg9.LIZIZ && this.LIZJ == hg9.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtractVideo(path=");
        LIZ.append(this.LIZ);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", endTime=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public HG9(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
