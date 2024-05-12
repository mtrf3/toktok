package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVL {
    public final BnplInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RVL) && o.LJ(this.LIZ, ((RVL) obj).LIZ);
    }

    public final int hashCode() {
        BnplInfo bnplInfo = this.LIZ;
        if (bnplInfo == null) {
            return 0;
        }
        return bnplInfo.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentModuleVO(bnplInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RVL(BnplInfo bnplInfo) {
        this.LIZ = bnplInfo;
    }
}
