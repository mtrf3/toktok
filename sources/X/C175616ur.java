package X;

import defpackage.b0;

/* renamed from: X.6ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175616ur extends AbstractC175546uk {
    public final int LIZ = 10001;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175616ur)) {
            return false;
        }
        C175616ur c175616ur = (C175616ur) obj;
        return this.LIZ == c175616ur.LIZ && this.LIZIZ == c175616ur.LIZIZ && this.LIZJ == c175616ur.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ValidateError(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", selectCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", limitCount=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C175616ur(int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
