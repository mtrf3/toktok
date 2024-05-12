package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import kotlin.jvm.internal.o;

/* renamed from: X.Akl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27127Akl implements InterfaceC26837Ag5 {
    public final C27124Aki LJLIL;
    public final boolean LJLILLLLZI;
    public final PdpShipping LJLJI;
    public final PDPLogisticModule LJLJJI;

    @Override // X.InterfaceC26837Ag5
    public final String LJJLIL() {
        return "logistics";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27127Akl)) {
            return false;
        }
        C27127Akl c27127Akl = (C27127Akl) obj;
        return o.LJ(this.LJLIL, c27127Akl.LJLIL) && this.LJLILLLLZI == c27127Akl.LJLILLLLZI && o.LJ(this.LJLJI, c27127Akl.LJLJI) && o.LJ(this.LJLJJI, c27127Akl.LJLJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C27124Aki c27124Aki = this.LJLIL;
        int hashCode = (c27124Aki == null ? 0 : c27124Aki.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        PdpShipping pdpShipping = this.LJLJI;
        int hashCode2 = (i2 + (pdpShipping == null ? 0 : pdpShipping.hashCode())) * 31;
        PDPLogisticModule pDPLogisticModule = this.LJLJJI;
        return hashCode2 + (pDPLogisticModule != null ? pDPLogisticModule.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductSelectShippingVO(deliveryInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(", divider=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", pdpShipping=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pdpLogisticModule=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C27127Akl(C27124Aki c27124Aki, PdpShipping pdpShipping, int i) {
        this(c27124Aki, false, (i & 4) != 0 ? null : pdpShipping, null);
    }

    public C27127Akl(C27124Aki c27124Aki, boolean z, PdpShipping pdpShipping, PDPLogisticModule pDPLogisticModule) {
        this.LJLIL = c27124Aki;
        this.LJLILLLLZI = z;
        this.LJLJI = pdpShipping;
        this.LJLJJI = pDPLogisticModule;
    }
}
