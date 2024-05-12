package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class SubOrderDetail {

    @InterfaceC65349Pkn("amount")
    public String amount;

    @InterfaceC65349Pkn("merchant_sub_order_id")
    public String merchantSubOrderId;

    @InterfaceC65349Pkn("order_reference")
    public String orderReference;

    @InterfaceC65349Pkn("profit_sharing")
    public String profitSharing;

    @InterfaceC65349Pkn("purchase_time")
    public String purchaseTime;

    @InterfaceC65349Pkn("sub_merchant_id")
    public String subMerchantId;

    @InterfaceC65349Pkn("subsidy_details")
    public SubsidyDetails subsidyDetails;

    /* JADX WARN: Multi-variable type inference failed */
    public SubOrderDetail() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SubOrderDetail copy$default(SubOrderDetail subOrderDetail, String str, String str2, String str3, String str4, String str5, String str6, SubsidyDetails subsidyDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subOrderDetail.merchantSubOrderId;
        }
        if ((i & 2) != 0) {
            str2 = subOrderDetail.orderReference;
        }
        if ((i & 4) != 0) {
            str3 = subOrderDetail.subMerchantId;
        }
        if ((i & 8) != 0) {
            str4 = subOrderDetail.amount;
        }
        if ((i & 16) != 0) {
            str5 = subOrderDetail.profitSharing;
        }
        if ((i & 32) != 0) {
            str6 = subOrderDetail.purchaseTime;
        }
        if ((i & 64) != 0) {
            subsidyDetails = subOrderDetail.subsidyDetails;
        }
        return subOrderDetail.copy(str, str2, str3, str4, str5, str6, subsidyDetails);
    }

    public final SubOrderDetail copy(String str, String str2, String str3, String str4, String str5, String str6, SubsidyDetails subsidyDetails) {
        return new SubOrderDetail(str, str2, str3, str4, str5, str6, subsidyDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubOrderDetail)) {
            return false;
        }
        SubOrderDetail subOrderDetail = (SubOrderDetail) obj;
        return o.LJ(this.merchantSubOrderId, subOrderDetail.merchantSubOrderId) && o.LJ(this.orderReference, subOrderDetail.orderReference) && o.LJ(this.subMerchantId, subOrderDetail.subMerchantId) && o.LJ(this.amount, subOrderDetail.amount) && o.LJ(this.profitSharing, subOrderDetail.profitSharing) && o.LJ(this.purchaseTime, subOrderDetail.purchaseTime) && o.LJ(this.subsidyDetails, subOrderDetail.subsidyDetails);
    }

    public int hashCode() {
        String str = this.merchantSubOrderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderReference;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subMerchantId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.amount;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profitSharing;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.purchaseTime;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SubsidyDetails subsidyDetails = this.subsidyDetails;
        return hashCode6 + (subsidyDetails != null ? subsidyDetails.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubOrderDetail(merchantSubOrderId=");
        LIZ.append((Object) this.merchantSubOrderId);
        LIZ.append(", orderReference=");
        LIZ.append((Object) this.orderReference);
        LIZ.append(", subMerchantId=");
        LIZ.append((Object) this.subMerchantId);
        LIZ.append(", amount=");
        LIZ.append((Object) this.amount);
        LIZ.append(", profitSharing=");
        LIZ.append((Object) this.profitSharing);
        LIZ.append(", purchaseTime=");
        LIZ.append((Object) this.purchaseTime);
        LIZ.append(", subsidyDetails=");
        LIZ.append(this.subsidyDetails);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getMerchantSubOrderId() {
        return this.merchantSubOrderId;
    }

    public final String getOrderReference() {
        return this.orderReference;
    }

    public final String getProfitSharing() {
        return this.profitSharing;
    }

    public final String getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getSubMerchantId() {
        return this.subMerchantId;
    }

    public final SubsidyDetails getSubsidyDetails() {
        return this.subsidyDetails;
    }

    public final void setAmount(String str) {
        this.amount = str;
    }

    public final void setMerchantSubOrderId(String str) {
        this.merchantSubOrderId = str;
    }

    public final void setOrderReference(String str) {
        this.orderReference = str;
    }

    public final void setProfitSharing(String str) {
        this.profitSharing = str;
    }

    public final void setPurchaseTime(String str) {
        this.purchaseTime = str;
    }

    public final void setSubMerchantId(String str) {
        this.subMerchantId = str;
    }

    public final void setSubsidyDetails(SubsidyDetails subsidyDetails) {
        this.subsidyDetails = subsidyDetails;
    }

    public SubOrderDetail(String str, String str2, String str3, String str4, String str5, String str6, SubsidyDetails subsidyDetails) {
        this.merchantSubOrderId = str;
        this.orderReference = str2;
        this.subMerchantId = str3;
        this.amount = str4;
        this.profitSharing = str5;
        this.purchaseTime = str6;
        this.subsidyDetails = subsidyDetails;
    }

    public /* synthetic */ SubOrderDetail(String str, String str2, String str3, String str4, String str5, String str6, SubsidyDetails subsidyDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? subsidyDetails : null);
    }
}
