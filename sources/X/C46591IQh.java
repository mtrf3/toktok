package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IQh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46591IQh {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public C46591IQh LJ;

    public C46591IQh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46591IQh)) {
            return false;
        }
        C46591IQh c46591IQh = (C46591IQh) obj;
        return o.LJ(this.LIZ, c46591IQh.LIZ) && o.LJ(this.LIZIZ, c46591IQh.LIZIZ) && this.LIZJ == c46591IQh.LIZJ && this.LIZLLL == c46591IQh.LIZLLL && o.LJ(this.LJ, c46591IQh.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdInfoData(shownAdId=");
        LIZ.append(this.LIZ);
        LIZ.append(", shownAdCreativeId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shownAdIndex=");
        LIZ.append(this.LIZJ);
        LIZ.append(", shownAdTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", preAdInfo=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZLLL, (C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31, 31);
        C46591IQh c46591IQh = this.LJ;
        if (c46591IQh == null) {
            hashCode = 0;
        } else {
            hashCode = c46591IQh.hashCode();
        }
        return LIZJ + hashCode;
    }

    public C46591IQh(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = -1;
        this.LIZLLL = -1L;
        this.LJ = null;
    }
}
