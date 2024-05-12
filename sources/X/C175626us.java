package X;

import defpackage.b0;

/* renamed from: X.6us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175626us extends AbstractC175586uo {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175626us)) {
            return false;
        }
        C175626us c175626us = (C175626us) obj;
        return this.LIZ == c175626us.LIZ && this.LIZIZ == c175626us.LIZIZ && this.LIZJ == c175626us.LIZJ;
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

    public C175626us(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
