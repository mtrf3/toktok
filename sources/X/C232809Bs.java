package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9Bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232809Bs {
    public final EnumC86689Y0n LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C232809Bs)) {
            return false;
        }
        C232809Bs c232809Bs = (C232809Bs) obj;
        return this.LIZ == c232809Bs.LIZ && o.LJ(this.LIZIZ, c232809Bs.LIZIZ) && o.LJ(this.LIZJ, c232809Bs.LIZJ) && this.LIZLLL == c232809Bs.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        Integer num = this.LIZJ;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i = (LJ + hashCode) * 31;
        boolean z = this.LIZLLL;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionContext(state=");
        LIZ.append(this.LIZ);
        LIZ.append(", captionText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", captionSubId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isLangOriginal=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C232809Bs(EnumC86689Y0n enumC86689Y0n, String captionText, Integer num, boolean z) {
        o.LJIIIZ(captionText, "captionText");
        this.LIZ = enumC86689Y0n;
        this.LIZIZ = captionText;
        this.LIZJ = num;
        this.LIZLLL = z;
    }
}
