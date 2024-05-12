package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaymentGuaranteeInfo {

    @InterfaceC65349Pkn("payment_guarantees")
    public final List<PaymentGuarantee> paymentGuarantee;

    @InterfaceC65349Pkn("save_display_popup_text")
    public final SaveDisplayInfo saveInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentGuaranteeInfo)) {
            return false;
        }
        PaymentGuaranteeInfo paymentGuaranteeInfo = (PaymentGuaranteeInfo) obj;
        return o.LJ(this.saveInfo, paymentGuaranteeInfo.saveInfo) && o.LJ(this.paymentGuarantee, paymentGuaranteeInfo.paymentGuarantee);
    }

    public final int hashCode() {
        SaveDisplayInfo saveDisplayInfo = this.saveInfo;
        int hashCode = (saveDisplayInfo == null ? 0 : saveDisplayInfo.hashCode()) * 31;
        List<PaymentGuarantee> list = this.paymentGuarantee;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentGuaranteeInfo(saveInfo=");
        LIZ.append(this.saveInfo);
        LIZ.append(", paymentGuarantee=");
        return C1NE.LIZIZ(LIZ, this.paymentGuarantee, ')', LIZ);
    }

    public PaymentGuaranteeInfo(SaveDisplayInfo saveDisplayInfo, List<PaymentGuarantee> list) {
        this.saveInfo = saveDisplayInfo;
        this.paymentGuarantee = list;
    }
}
