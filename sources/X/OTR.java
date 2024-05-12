package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTR {
    public final int LIZ;
    public final OTS LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTR)) {
            return false;
        }
        OTR otr = (OTR) obj;
        return this.LIZ == otr.LIZ && this.LIZIZ == otr.LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthErrorTuple(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", authError=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public OTR(int i, OTS authError) {
        o.LJIIIZ(authError, "authError");
        this.LIZ = i;
        this.LIZIZ = authError;
    }
}
