package com.ss.android.ugc.aweme.ecommerce.base.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PaymentData {

    @InterfaceC65349Pkn("address")
    public AddressForPay address;

    @InterfaceC65349Pkn("cashier")
    public final m cashier;

    @InterfaceC65349Pkn("token_info")
    public final PipoTokenInfo pipoTokenInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentData)) {
            return false;
        }
        PaymentData paymentData = (PaymentData) obj;
        return o.LJ(this.cashier, paymentData.cashier) && o.LJ(this.pipoTokenInfo, paymentData.pipoTokenInfo) && o.LJ(this.address, paymentData.address);
    }

    public final int hashCode() {
        m mVar = this.cashier;
        int hashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        PipoTokenInfo pipoTokenInfo = this.pipoTokenInfo;
        int hashCode2 = (hashCode + (pipoTokenInfo == null ? 0 : pipoTokenInfo.hashCode())) * 31;
        AddressForPay addressForPay = this.address;
        return hashCode2 + (addressForPay != null ? addressForPay.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentData(cashier=");
        LIZ.append(this.cashier);
        LIZ.append(", pipoTokenInfo=");
        LIZ.append(this.pipoTokenInfo);
        LIZ.append(", address=");
        LIZ.append(this.address);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PaymentData(m mVar, PipoTokenInfo pipoTokenInfo, AddressForPay addressForPay) {
        this.cashier = mVar;
        this.pipoTokenInfo = pipoTokenInfo;
        this.address = addressForPay;
    }
}
