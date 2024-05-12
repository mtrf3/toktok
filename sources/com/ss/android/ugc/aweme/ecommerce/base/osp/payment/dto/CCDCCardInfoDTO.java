package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CCDCCardInfoDTO {

    @InterfaceC65349Pkn("payment_method_details")
    public final PaymentMethodDetails paymentMethodDetails;

    @InterfaceC65349Pkn("result_code")
    public final String resultCode;

    /* JADX WARN: Multi-variable type inference failed */
    public CCDCCardInfoDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CCDCCardInfoDTO copy$default(CCDCCardInfoDTO cCDCCardInfoDTO, PaymentMethodDetails paymentMethodDetails, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentMethodDetails = cCDCCardInfoDTO.paymentMethodDetails;
        }
        if ((i & 2) != 0) {
            str = cCDCCardInfoDTO.resultCode;
        }
        return cCDCCardInfoDTO.copy(paymentMethodDetails, str);
    }

    public final CCDCCardInfoDTO copy(PaymentMethodDetails paymentMethodDetails, String str) {
        return new CCDCCardInfoDTO(paymentMethodDetails, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CCDCCardInfoDTO)) {
            return false;
        }
        CCDCCardInfoDTO cCDCCardInfoDTO = (CCDCCardInfoDTO) obj;
        return o.LJ(this.paymentMethodDetails, cCDCCardInfoDTO.paymentMethodDetails) && o.LJ(this.resultCode, cCDCCardInfoDTO.resultCode);
    }

    public int hashCode() {
        PaymentMethodDetails paymentMethodDetails = this.paymentMethodDetails;
        int hashCode = (paymentMethodDetails == null ? 0 : paymentMethodDetails.hashCode()) * 31;
        String str = this.resultCode;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CCDCCardInfoDTO(paymentMethodDetails=");
        LIZ.append(this.paymentMethodDetails);
        LIZ.append(", resultCode=");
        return q.LIZIZ(LIZ, this.resultCode, ')', LIZ);
    }

    public final PaymentMethodDetails getPaymentMethodDetails() {
        return this.paymentMethodDetails;
    }

    public final String getResultCode() {
        return this.resultCode;
    }

    public CCDCCardInfoDTO(PaymentMethodDetails paymentMethodDetails, String str) {
        this.paymentMethodDetails = paymentMethodDetails;
        this.resultCode = str;
    }

    public /* synthetic */ CCDCCardInfoDTO(PaymentMethodDetails paymentMethodDetails, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentMethodDetails, (i & 2) != 0 ? null : str);
    }
}
