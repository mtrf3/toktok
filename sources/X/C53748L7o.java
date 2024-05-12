package X;

import kotlin.jvm.internal.o;

/* renamed from: X.L7o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53748L7o {
    public final C191427fG LIZ;
    public final Boolean LIZIZ;

    public C53748L7o() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53748L7o)) {
            return false;
        }
        C53748L7o c53748L7o = (C53748L7o) obj;
        return o.LJ(this.LIZ, c53748L7o.LIZ) && o.LJ(this.LIZIZ, c53748L7o.LIZIZ);
    }

    public final int hashCode() {
        C191427fG c191427fG = this.LIZ;
        int hashCode = (c191427fG == null ? 0 : c191427fG.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GPSInfo(gps=");
        LIZ.append(this.LIZ);
        LIZ.append(", isCache=");
        return C78920UyC.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C53748L7o(C191427fG c191427fG, Boolean bool) {
        this.LIZ = c191427fG;
        this.LIZIZ = bool;
    }
}
