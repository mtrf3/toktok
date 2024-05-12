package X;

import kotlin.jvm.internal.o;

/* renamed from: X.N2p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58715N2p {
    public final String LIZ;
    public final C60601NqP LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58715N2p)) {
            return false;
        }
        C58715N2p c58715N2p = (C58715N2p) obj;
        return o.LJ(this.LIZ, c58715N2p.LIZ) && o.LJ(this.LIZIZ, c58715N2p.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C60601NqP c60601NqP = this.LIZIZ;
        return hashCode + (c60601NqP != null ? c60601NqP.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConfigObj(source=");
        LIZ.append(this.LIZ);
        LIZ.append(", config=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C58715N2p(String str, C60601NqP c60601NqP) {
        this.LIZ = str;
        this.LIZIZ = c60601NqP;
    }
}
