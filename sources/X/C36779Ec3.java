package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ec3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36779Ec3 {
    public final F1F LIZ;
    public final F1E LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36779Ec3)) {
            return false;
        }
        C36779Ec3 c36779Ec3 = (C36779Ec3) obj;
        return o.LJ(this.LIZ, c36779Ec3.LIZ) && o.LJ(this.LIZIZ, c36779Ec3.LIZIZ);
    }

    public final int hashCode() {
        F1F f1f = this.LIZ;
        int hashCode = (f1f == null ? 0 : f1f.hashCode()) * 31;
        F1E f1e = this.LIZIZ;
        return hashCode + (f1e != null ? f1e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JsRequestAndResponse(jsRequest=");
        LIZ.append(this.LIZ);
        LIZ.append(", jsResponse=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C36779Ec3(F1F f1f, F1E f1e) {
        this.LIZ = f1f;
        this.LIZIZ = f1e;
    }
}
