package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V6F {
    public final C08370Un LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C08370Un LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6F)) {
            return false;
        }
        V6F v6f = (V6F) obj;
        return o.LJ(this.LIZ, v6f.LIZ) && C11850dJ.LIZJ(this.LIZIZ, v6f.LIZIZ) && C11850dJ.LIZJ(this.LIZJ, v6f.LIZJ) && o.LJ(this.LIZLLL, v6f.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + C06540Nm.LIZ(this.LIZJ, C06540Nm.LIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TuxStatusConfig(titleFont=");
        LIZ.append(this.LIZ);
        LIZ.append(", titleColor=");
        C78920UyC.LJ(this.LIZIZ, LIZ, ", messageColor=");
        C78920UyC.LJ(this.LIZJ, LIZ, ", messageFont=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public V6F(C08370Un c08370Un, long j, long j2, C08370Un c08370Un2) {
        this.LIZ = c08370Un;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = c08370Un2;
    }
}
