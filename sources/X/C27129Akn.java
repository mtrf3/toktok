package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Akn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27129Akn implements InterfaceC26837Ag5 {
    public final C27124Aki LJLIL;
    public final PdpShipping LJLILLLLZI;
    public final PreOrderInfo LJLJI;
    public final PDPLogisticModule LJLJJI;

    @Override // X.InterfaceC26837Ag5
    public final String LJJLIL() {
        return "logistics";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27129Akn)) {
            return false;
        }
        C27129Akn c27129Akn = (C27129Akn) obj;
        return o.LJ(this.LJLIL, c27129Akn.LJLIL) && o.LJ(this.LJLILLLLZI, c27129Akn.LJLILLLLZI) && o.LJ(this.LJLJI, c27129Akn.LJLJI) && o.LJ(this.LJLJJI, c27129Akn.LJLJJI);
    }

    public final int hashCode() {
        C27124Aki c27124Aki = this.LJLIL;
        int hashCode = (c27124Aki == null ? 0 : c27124Aki.hashCode()) * 31;
        PdpShipping pdpShipping = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (pdpShipping == null ? 0 : pdpShipping.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.LJLJI;
        int hashCode3 = (hashCode2 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31;
        PDPLogisticModule pDPLogisticModule = this.LJLJJI;
        return hashCode3 + (pDPLogisticModule != null ? pDPLogisticModule.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalShippingVO(deliveryInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pdpShipping=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", preOrderInfo=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pdpLogisticModule=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C27129Akn(C27124Aki c27124Aki, PdpShipping pdpShipping, PreOrderInfo preOrderInfo, PDPLogisticModule pDPLogisticModule) {
        this.LJLIL = c27124Aki;
        this.LJLILLLLZI = pdpShipping;
        this.LJLJI = preOrderInfo;
        this.LJLJJI = pDPLogisticModule;
    }
}
