package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingServiceModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import kotlin.jvm.internal.o;

/* renamed from: X.AfG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26786AfG implements InterfaceC26837Ag5 {
    public final boolean LJLIL = false;
    public final PdpShipping LJLILLLLZI;
    public final PDPShippingServiceModule LJLJI;

    @Override // X.InterfaceC26837Ag5
    public final String LJJLIL() {
        return "logistics";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26786AfG)) {
            return false;
        }
        C26786AfG c26786AfG = (C26786AfG) obj;
        return this.LJLIL == c26786AfG.LJLIL && o.LJ(this.LJLILLLLZI, c26786AfG.LJLILLLLZI) && o.LJ(this.LJLJI, c26786AfG.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        PdpShipping pdpShipping = this.LJLILLLLZI;
        int hashCode = (i + (pdpShipping == null ? 0 : pdpShipping.hashCode())) * 31;
        PDPShippingServiceModule pDPShippingServiceModule = this.LJLJI;
        return hashCode + (pDPShippingServiceModule != null ? pDPShippingServiceModule.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductShippingServiceVO(divider=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pdpShipping=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", pdpShippingServiceModule=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C26786AfG(PdpShipping pdpShipping, PDPShippingServiceModule pDPShippingServiceModule) {
        this.LJLILLLLZI = pdpShipping;
        this.LJLJI = pDPShippingServiceModule;
    }
}
