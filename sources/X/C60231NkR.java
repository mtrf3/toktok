package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NkR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60231NkR {
    public final android.net.Uri LIZ;
    public final F0S LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60231NkR)) {
            return false;
        }
        C60231NkR c60231NkR = (C60231NkR) obj;
        return o.LJ(this.LIZ, c60231NkR.LIZ) && o.LJ(this.LIZIZ, c60231NkR.LIZIZ);
    }

    public final int hashCode() {
        android.net.Uri uri = this.LIZ;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        F0S f0s = this.LIZIZ;
        return hashCode + (f0s != null ? f0s.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SchemaInfo(realHostUri=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C60231NkR(android.net.Uri uri, F0S type) {
        o.LJIIJ(type, "type");
        this.LIZ = uri;
        this.LIZIZ = type;
    }
}
