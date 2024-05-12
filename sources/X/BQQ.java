package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BQQ {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BQQ)) {
            return false;
        }
        BQQ bqq = (BQQ) obj;
        return this.LIZ == bqq.LIZ && this.LIZIZ == bqq.LIZIZ && o.LJ(this.LIZJ, bqq.LIZJ) && o.LJ(this.LIZLLL, bqq.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + C79062V1e.LJ(this.LIZJ, ((this.LIZ * 31) + this.LIZIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorTechItemData(titleKey=");
        LIZ.append(this.LIZ);
        LIZ.append(", subTitleKey=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fileName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", eventTracker=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public BQQ(int i, int i2, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
