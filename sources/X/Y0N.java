package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0N extends Y1Y {
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final X65 LJ;
    public final C84540XFw LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0N)) {
            return false;
        }
        Y0N y0n = (Y0N) obj;
        return o.LJ(this.LIZIZ, y0n.LIZIZ) && this.LIZJ == y0n.LIZJ && this.LIZLLL == y0n.LIZLLL && o.LJ(this.LJ, y0n.LJ) && o.LJ(this.LJFF, y0n.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZIZ.hashCode() * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        X65 x65 = this.LJ;
        int hashCode2 = (i2 + (x65 == null ? 0 : x65.hashCode())) * 31;
        C84540XFw c84540XFw = this.LJFF;
        return hashCode2 + (c84540XFw != null ? c84540XFw.hashCode() : 0);
    }

    @Override // X.Y1Y
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Translated(translationLang=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", autoTranslate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", descriptionTranslated=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", stickerData=");
        LIZ.append(this.LJ);
        LIZ.append(", captionData=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LIZ() {
        if (this.LIZLLL) {
            return true;
        }
        X65 x65 = this.LJ;
        if (x65 != null && x65.LIZ != null && x65.LIZIZ) {
            return true;
        }
        C84540XFw c84540XFw = this.LJFF;
        if (c84540XFw != null && c84540XFw.LIZIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0N(String translationLang, boolean z, boolean z2, X65 x65, C84540XFw c84540XFw) {
        super(IQE.TRANSLATED);
        o.LJIIIZ(translationLang, "translationLang");
        this.LIZIZ = translationLang;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = x65;
        this.LJFF = c84540XFw;
    }
}
