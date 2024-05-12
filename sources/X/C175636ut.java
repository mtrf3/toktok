package X;

import defpackage.b0;

/* renamed from: X.6ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175636ut extends AbstractC175526ui {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175636ut)) {
            return false;
        }
        C175636ut c175636ut = (C175636ut) obj;
        return this.LIZ == c175636ut.LIZ && this.LIZIZ == c175636ut.LIZIZ && this.LIZJ == c175636ut.LIZJ;
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
        LIZ.append(", limit=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C175636ut(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
