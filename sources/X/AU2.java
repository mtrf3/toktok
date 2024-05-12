package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AU2 {
    public final boolean LIZ;
    public final AU7 LIZIZ;
    public APV LIZJ;
    public Integer LIZLLL;
    public final Integer LJ;

    public AU2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AU2)) {
            return false;
        }
        AU2 au2 = (AU2) obj;
        return this.LIZ == au2.LIZ && this.LIZIZ == au2.LIZIZ && o.LJ(this.LIZJ, au2.LIZJ) && o.LJ(this.LIZLLL, au2.LIZLLL) && o.LJ(this.LJ, au2.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        AU7 au7 = this.LIZIZ;
        int hashCode = (i + (au7 == null ? 0 : au7.hashCode())) * 31;
        APV apv = this.LIZJ;
        int hashCode2 = (hashCode + (apv == null ? 0 : apv.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJ;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarBaseConfig(autoBindAvatarImage=");
        LIZ.append(this.LIZ);
        LIZ.append(", autoBindImageSizeStrategy=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", autoBindImageTypeStrategy=");
        LIZ.append(this.LIZJ);
        LIZ.append(", avatarSizeDp=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", containerSizeDp=");
        return s0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public AU2(int i) {
        this.LIZ = true;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
    }
}
