package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.0J0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0J0 {
    public final int LIZ;
    public final C48459J0d<Boolean> LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public C0J0() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0J0)) {
            return false;
        }
        C0J0 c0j0 = (C0J0) obj;
        return this.LIZ == c0j0.LIZ && o.LJ(this.LIZIZ, c0j0.LIZIZ) && o.LJ(this.LIZJ, c0j0.LIZJ) && o.LJ(this.LIZLLL, c0j0.LIZLLL) && this.LJ == c0j0.LJ && o.LJ(this.LJFF, c0j0.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, (this.LIZIZ.hashCode() + (this.LIZ * 31)) * 31, 31);
        Integer num = this.LIZLLL;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        boolean z = this.LJ;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str = this.LJFF;
        if (str != null) {
            i = str.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageType(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", key=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", keyStatistics=");
        LIZ.append(this.LIZJ);
        LIZ.append(", describe=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", needLine=");
        LIZ.append(this.LJ);
        LIZ.append(", tabName=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C0J0(int i, C48459J0d c48459J0d, String str, Integer num, boolean z, String str2, int i2) {
        num = (i2 & 8) != 0 ? null : num;
        z = (i2 & 16) != 0 ? false : z;
        str2 = (i2 & 32) != 0 ? null : str2;
        this.LIZ = i;
        this.LIZIZ = c48459J0d;
        this.LIZJ = str;
        this.LIZLLL = num;
        this.LJ = z;
        this.LJFF = str2;
    }
}
