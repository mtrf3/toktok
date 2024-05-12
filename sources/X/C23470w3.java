package X;

import defpackage.b0;

/* renamed from: X.0w3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23470w3 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23470w3)) {
            return false;
        }
        C23470w3 c23470w3 = (C23470w3) obj;
        return this.LIZ == c23470w3.LIZ && this.LIZIZ == c23470w3.LIZIZ && this.LIZJ == c23470w3.LIZJ && this.LIZLLL == c23470w3.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IntRect.fromLTRB(");
        LIZ.append(this.LIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZJ);
        LIZ.append(", ");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C23470w3(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
