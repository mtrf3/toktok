package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.9ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244459ib {
    public final ST9 LIZ;
    public final int LIZIZ;
    public final C72121SSf LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C244459ib)) {
            return false;
        }
        C244459ib c244459ib = (C244459ib) obj;
        return this.LIZ == c244459ib.LIZ && this.LIZIZ == c244459ib.LIZIZ && o.LJ(this.LIZJ, c244459ib.LIZJ) && this.LIZLLL == c244459ib.LIZLLL;
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        C72121SSf c72121SSf = this.LIZJ;
        return ((hashCode + (c72121SSf == null ? 0 : c72121SSf.hashCode())) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AigcAvatarGenerationInfo(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", percentage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", avatarResult=");
        LIZ.append(this.LIZJ);
        LIZ.append(", waitTime=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C244459ib(ST9 status, int i, C72121SSf c72121SSf, int i2) {
        o.LJIIIZ(status, "status");
        this.LIZ = status;
        this.LIZIZ = i;
        this.LIZJ = c72121SSf;
        this.LIZLLL = i2;
    }
}
