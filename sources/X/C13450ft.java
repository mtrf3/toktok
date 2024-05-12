package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13450ft {
    public final AbstractC13490fx LIZ;
    public final C13640gC LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Object LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13450ft)) {
            return false;
        }
        C13450ft c13450ft = (C13450ft) obj;
        return o.LJ(this.LIZ, c13450ft.LIZ) && o.LJ(this.LIZIZ, c13450ft.LIZIZ) && this.LIZJ == c13450ft.LIZJ && this.LIZLLL == c13450ft.LIZLLL && o.LJ(this.LJ, c13450ft.LJ);
    }

    public final int hashCode() {
        int hashCode;
        AbstractC13490fx abstractC13490fx = this.LIZ;
        int i = 0;
        if (abstractC13490fx == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC13490fx.hashCode();
        }
        int i2 = ((((((hashCode * 31) + this.LIZIZ.LJLIL) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        Object obj = this.LJ;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TypefaceRequest(fontFamily=");
        LIZ.append(this.LIZ);
        LIZ.append(", fontWeight=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fontStyle=");
        LIZ.append((Object) C13570g5.LIZ(this.LIZJ));
        LIZ.append(", fontSynthesis=");
        LIZ.append((Object) C13590g7.LIZ(this.LIZLLL));
        LIZ.append(", resourceLoaderCacheKey=");
        return U26.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C13450ft(AbstractC13490fx abstractC13490fx, C13640gC c13640gC, int i, int i2, Object obj) {
        this.LIZ = abstractC13490fx;
        this.LIZIZ = c13640gC;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = obj;
    }
}
