package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PayResponseData {

    @InterfaceC65349Pkn("cashier")
    public final m cashier;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("new_pay_info")
    public final NewPayInfo newPayInfo;

    @InterfaceC65349Pkn("payment_methods")
    public final PaymentMethodsData paymentMethodsData;

    @InterfaceC65349Pkn("payment_price")
    public final List<PaymentPrice> paymentPrice;

    @InterfaceC65349Pkn("jump_schema_url")
    public final String schema;

    @InterfaceC65349Pkn("address")
    public final Address shippingAddress;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayResponseData)) {
            return false;
        }
        PayResponseData payResponseData = (PayResponseData) obj;
        return o.LJ(this.cashier, payResponseData.cashier) && o.LJ(this.schema, payResponseData.schema) && o.LJ(this.newPayInfo, payResponseData.newPayInfo) && o.LJ(this.shippingAddress, payResponseData.shippingAddress) && o.LJ(this.paymentMethodsData, payResponseData.paymentMethodsData) && o.LJ(this.paymentPrice, payResponseData.paymentPrice) && o.LJ(this.exceptionUX, payResponseData.exceptionUX);
    }

    public final int hashCode() {
        m mVar = this.cashier;
        int hashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        String str = this.schema;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NewPayInfo newPayInfo = this.newPayInfo;
        int hashCode3 = (hashCode2 + (newPayInfo == null ? 0 : newPayInfo.hashCode())) * 31;
        Address address = this.shippingAddress;
        int hashCode4 = (hashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        PaymentMethodsData paymentMethodsData = this.paymentMethodsData;
        int hashCode5 = (hashCode4 + (paymentMethodsData == null ? 0 : paymentMethodsData.hashCode())) * 31;
        List<PaymentPrice> list = this.paymentPrice;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        return hashCode6 + (exceptionUX != null ? exceptionUX.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayResponseData(cashier=");
        LIZ.append(this.cashier);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", newPayInfo=");
        LIZ.append(this.newPayInfo);
        LIZ.append(", shippingAddress=");
        LIZ.append(this.shippingAddress);
        LIZ.append(", paymentMethodsData=");
        LIZ.append(this.paymentMethodsData);
        LIZ.append(", paymentPrice=");
        LIZ.append(this.paymentPrice);
        LIZ.append(", exceptionUX=");
        LIZ.append(this.exceptionUX);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PayResponseData(m mVar, String str, NewPayInfo newPayInfo, Address address, PaymentMethodsData paymentMethodsData, List<PaymentPrice> list, ExceptionUX exceptionUX) {
        this.cashier = mVar;
        this.schema = str;
        this.newPayInfo = newPayInfo;
        this.shippingAddress = address;
        this.paymentMethodsData = paymentMethodsData;
        this.paymentPrice = list;
        this.exceptionUX = exceptionUX;
    }
}
