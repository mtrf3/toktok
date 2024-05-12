package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class APQ {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APQ)) {
            return false;
        }
        APQ apq = (APQ) obj;
        return o.LJ(this.LIZ, apq.LIZ) && o.LJ(this.LIZIZ, apq.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AccessString(contentDescription=");
        LIZ.append(this.LIZ);
        LIZ.append(", actionDescription=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public APQ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
