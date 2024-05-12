package X;

import com.ss.android.ugc.aweme.model.PriceInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A2Z {
    public final long LIZ;
    public final PriceInfo LIZIZ;
    public final PriceInfo LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A2Z)) {
            return false;
        }
        A2Z a2z = (A2Z) obj;
        return this.LIZ == a2z.LIZ && o.LJ(this.LIZIZ, a2z.LIZIZ) && o.LJ(this.LIZJ, a2z.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31)) * 31;
        PriceInfo priceInfo = this.LIZJ;
        return hashCode + (priceInfo == null ? 0 : priceInfo.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SeriesPriceInfo(collectionId=");
        LIZ.append(this.LIZ);
        LIZ.append(", regularPriceInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", discountedPriceInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public A2Z(long j, PriceInfo priceInfo, PriceInfo priceInfo2) {
        this.LIZ = j;
        this.LIZIZ = priceInfo;
        this.LIZJ = priceInfo2;
    }
}
