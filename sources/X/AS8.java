package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AS8 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AS8)) {
            return false;
        }
        AS8 as8 = (AS8) obj;
        return o.LJ(this.LIZ, as8.LIZ) && o.LJ(this.LIZIZ, as8.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DislikeReasonVO(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", reason=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public AS8(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
