package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0Y extends Y1Y {
    public final String LIZIZ;
    public final C84540XFw LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0Y)) {
            return false;
        }
        Y0Y y0y = (Y0Y) obj;
        return o.LJ(this.LIZIZ, y0y.LIZIZ) && o.LJ(this.LIZJ, y0y.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZIZ.hashCode() * 31;
        C84540XFw c84540XFw = this.LIZJ;
        return hashCode + (c84540XFw == null ? 0 : c84540XFw.hashCode());
    }

    @Override // X.Y1Y
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Original(translationLang=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", captionData=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0Y(String translationLang, C84540XFw c84540XFw) {
        super(IQE.ORIGINAL);
        o.LJIIIZ(translationLang, "translationLang");
        this.LIZIZ = translationLang;
        this.LIZJ = c84540XFw;
    }
}
