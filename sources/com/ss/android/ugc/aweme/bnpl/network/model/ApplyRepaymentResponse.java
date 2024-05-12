package com.ss.android.ugc.aweme.bnpl.network.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class ApplyRepaymentResponse {

    @InterfaceC65349Pkn("amount")
    public final String amount;

    @InterfaceC65349Pkn("cashier_domain")
    public final String cashierDomain;

    @InterfaceC65349Pkn("country_code")
    public final String countryCode;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("merchant_id")
    public final String merchantId;

    @InterfaceC65349Pkn("payment_reference")
    public final String paymentReference;

    @InterfaceC65349Pkn("repayment_detail_schema")
    public final String repaymentDetailSchema;

    @InterfaceC65349Pkn("repayment_id")
    public final String repaymentId;

    @InterfaceC65349Pkn("wallet_user_id")
    public final String walletUserId;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplyRepaymentResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyRepaymentResponse)) {
            return false;
        }
        ApplyRepaymentResponse applyRepaymentResponse = (ApplyRepaymentResponse) obj;
        return o.LJ(this.repaymentId, applyRepaymentResponse.repaymentId) && o.LJ(this.paymentReference, applyRepaymentResponse.paymentReference) && o.LJ(this.merchantId, applyRepaymentResponse.merchantId) && o.LJ(this.amount, applyRepaymentResponse.amount) && o.LJ(this.currency, applyRepaymentResponse.currency) && o.LJ(this.countryCode, applyRepaymentResponse.countryCode) && o.LJ(this.walletUserId, applyRepaymentResponse.walletUserId) && o.LJ(this.cashierDomain, applyRepaymentResponse.cashierDomain) && o.LJ(this.repaymentDetailSchema, applyRepaymentResponse.repaymentDetailSchema);
    }

    public final int hashCode() {
        String str = this.repaymentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentReference;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.amount;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.countryCode;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.walletUserId;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cashierDomain;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.repaymentDetailSchema;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplyRepaymentResponse(repaymentId=");
        LIZ.append(this.repaymentId);
        LIZ.append(", paymentReference=");
        LIZ.append(this.paymentReference);
        LIZ.append(", merchantId=");
        LIZ.append(this.merchantId);
        LIZ.append(", amount=");
        LIZ.append(this.amount);
        LIZ.append(", currency=");
        LIZ.append(this.currency);
        LIZ.append(", countryCode=");
        LIZ.append(this.countryCode);
        LIZ.append(", walletUserId=");
        LIZ.append(this.walletUserId);
        LIZ.append(", cashierDomain=");
        LIZ.append(this.cashierDomain);
        LIZ.append(", repaymentDetailSchema=");
        LIZ.append(this.repaymentDetailSchema);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ApplyRepaymentResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.repaymentId = str;
        this.paymentReference = str2;
        this.merchantId = str3;
        this.amount = str4;
        this.currency = str5;
        this.countryCode = str6;
        this.walletUserId = str7;
        this.cashierDomain = str8;
        this.repaymentDetailSchema = str9;
    }

    public /* synthetic */ ApplyRepaymentResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }
}
