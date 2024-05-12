package X;

import kotlin.jvm.internal.o;

/* renamed from: X.508, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass508 {
    public final long LIZ;
    public final int LIZIZ;
    public final Long LIZJ;
    public final EnumC127814zx LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass508)) {
            return false;
        }
        AnonymousClass508 anonymousClass508 = (AnonymousClass508) obj;
        return this.LIZ == anonymousClass508.LIZ && this.LIZIZ == anonymousClass508.LIZIZ && o.LJ(this.LIZJ, anonymousClass508.LIZJ) && this.LIZLLL == anonymousClass508.LIZLLL && this.LJ == anonymousClass508.LJ && this.LJFF == anonymousClass508.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = ((C16880lQ.LLJIJIL(this.LIZ) * 31) + this.LIZIZ) * 31;
        Long l = this.LIZJ;
        int hashCode = (LLJIJIL + (l == null ? 0 : l.hashCode())) * 31;
        EnumC127814zx enumC127814zx = this.LIZLLL;
        int hashCode2 = (hashCode + (enumC127814zx != null ? enumC127814zx.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IntentFilterData(maxSize=");
        LIZ.append(this.LIZ);
        LIZ.append(", selectCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", minVideoTimeThreshold=");
        LIZ.append(this.LIZJ);
        LIZ.append(", pickerTypeAlbum=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", shouldExcludeGif=");
        LIZ.append(this.LJ);
        LIZ.append(", isPip=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public AnonymousClass508(long j, int i, Long l, EnumC127814zx enumC127814zx, boolean z, int i2) {
        l = (i2 & 4) != 0 ? null : l;
        enumC127814zx = (i2 & 8) != 0 ? null : enumC127814zx;
        z = (i2 & 32) != 0 ? false : z;
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = l;
        this.LIZLLL = enumC127814zx;
        this.LJ = false;
        this.LJFF = z;
    }
}
