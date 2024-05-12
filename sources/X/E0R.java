package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E0R implements InterfaceC35522Dws {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0R)) {
            return false;
        }
        E0R e0r = (E0R) obj;
        return o.LJ(this.LIZ, e0r.LIZ) && this.LIZIZ == e0r.LIZIZ && this.LIZJ == e0r.LIZJ && o.LJ(this.LIZLLL, e0r.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        String str2 = this.LIZLLL;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FaultedState(url=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", ext=");
        LIZ.append(this.LIZJ);
        LIZ.append(", msg=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public E0R(String str, int i, int i2, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str2;
    }
}
