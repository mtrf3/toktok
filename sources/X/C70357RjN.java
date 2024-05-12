package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RjN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70357RjN {
    public final String LIZ;
    public final Float LIZIZ;
    public final Float LIZJ;

    public C70357RjN() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70357RjN)) {
            return false;
        }
        C70357RjN c70357RjN = (C70357RjN) obj;
        return o.LJ(this.LIZ, c70357RjN.LIZ) && o.LJ(this.LIZIZ, c70357RjN.LIZIZ) && o.LJ(this.LIZJ, c70357RjN.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.LIZIZ;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LIZJ;
        return hashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogisticInfoVO(deliveryInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", shippingPrice=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shippingPriceAfterCoupon=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C70357RjN(Float f, Float f2, String str) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = f2;
    }
}
