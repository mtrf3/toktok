package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentListResponseData {

    @InterfaceC65349Pkn("default_summary")
    public final Summary defaultSummary;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("payment_methods")
    public final PaymentMethodsData paymentMethodsData;

    @InterfaceC65349Pkn("payment_price")
    public final List<PaymentPrice> paymentPrice;

    @InterfaceC65349Pkn("pre_risk_param")
    public final m preRiskParam;

    @InterfaceC65349Pkn("address")
    public final Address shippingAddress;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentListResponseData copy$default(PaymentListResponseData paymentListResponseData, Address address, PaymentMethodsData paymentMethodsData, List list, ExceptionUX exceptionUX, m mVar, Summary summary, int i, Object obj) {
        if ((i & 1) != 0) {
            address = paymentListResponseData.shippingAddress;
        }
        if ((i & 2) != 0) {
            paymentMethodsData = paymentListResponseData.paymentMethodsData;
        }
        if ((i & 4) != 0) {
            list = paymentListResponseData.paymentPrice;
        }
        if ((i & 8) != 0) {
            exceptionUX = paymentListResponseData.exceptionUX;
        }
        if ((i & 16) != 0) {
            mVar = paymentListResponseData.preRiskParam;
        }
        if ((i & 32) != 0) {
            summary = paymentListResponseData.defaultSummary;
        }
        return paymentListResponseData.copy(address, paymentMethodsData, list, exceptionUX, mVar, summary);
    }

    public final PaymentListResponseData copy(Address address, PaymentMethodsData paymentMethodsData, List<PaymentPrice> list, ExceptionUX exceptionUX, m mVar, Summary summary) {
        return new PaymentListResponseData(address, paymentMethodsData, list, exceptionUX, mVar, summary);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentListResponseData)) {
            return false;
        }
        PaymentListResponseData paymentListResponseData = (PaymentListResponseData) obj;
        return o.LJ(this.shippingAddress, paymentListResponseData.shippingAddress) && o.LJ(this.paymentMethodsData, paymentListResponseData.paymentMethodsData) && o.LJ(this.paymentPrice, paymentListResponseData.paymentPrice) && o.LJ(this.exceptionUX, paymentListResponseData.exceptionUX) && o.LJ(this.preRiskParam, paymentListResponseData.preRiskParam) && o.LJ(this.defaultSummary, paymentListResponseData.defaultSummary);
    }

    public int hashCode() {
        Address address = this.shippingAddress;
        int hashCode = (address == null ? 0 : address.hashCode()) * 31;
        PaymentMethodsData paymentMethodsData = this.paymentMethodsData;
        int hashCode2 = (hashCode + (paymentMethodsData == null ? 0 : paymentMethodsData.hashCode())) * 31;
        List<PaymentPrice> list = this.paymentPrice;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int hashCode4 = (hashCode3 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        m mVar = this.preRiskParam;
        int hashCode5 = (hashCode4 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Summary summary = this.defaultSummary;
        return hashCode5 + (summary != null ? summary.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentListResponseData(shippingAddress=");
        LIZ.append(this.shippingAddress);
        LIZ.append(", paymentMethodsData=");
        LIZ.append(this.paymentMethodsData);
        LIZ.append(", paymentPrice=");
        LIZ.append(this.paymentPrice);
        LIZ.append(", exceptionUX=");
        LIZ.append(this.exceptionUX);
        LIZ.append(", preRiskParam=");
        LIZ.append(this.preRiskParam);
        LIZ.append(", defaultSummary=");
        LIZ.append(this.defaultSummary);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Summary getDefaultSummary() {
        return this.defaultSummary;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final PaymentMethodsData getPaymentMethodsData() {
        return this.paymentMethodsData;
    }

    public final List<PaymentPrice> getPaymentPrice() {
        return this.paymentPrice;
    }

    public final m getPreRiskParam() {
        return this.preRiskParam;
    }

    public final Address getShippingAddress() {
        return this.shippingAddress;
    }

    public PaymentListResponseData(Address address, PaymentMethodsData paymentMethodsData, List<PaymentPrice> list, ExceptionUX exceptionUX, m mVar, Summary summary) {
        this.shippingAddress = address;
        this.paymentMethodsData = paymentMethodsData;
        this.paymentPrice = list;
        this.exceptionUX = exceptionUX;
        this.preRiskParam = mVar;
        this.defaultSummary = summary;
    }
}
