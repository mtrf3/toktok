package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class GetUnifiedBinDetail {

    @InterfaceC65349Pkn("card_number")
    public String cardNumber;

    @InterfaceC65349Pkn("country_or_region")
    public String countryOrRegion;

    @InterfaceC65349Pkn("merchant_user_id")
    public String merchantUserId;

    @InterfaceC65349Pkn("nonce")
    public String nonce;

    /* JADX WARN: Multi-variable type inference failed */
    public GetUnifiedBinDetail() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GetUnifiedBinDetail copy$default(GetUnifiedBinDetail getUnifiedBinDetail, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUnifiedBinDetail.cardNumber;
        }
        if ((i & 2) != 0) {
            str2 = getUnifiedBinDetail.countryOrRegion;
        }
        if ((i & 4) != 0) {
            str3 = getUnifiedBinDetail.merchantUserId;
        }
        if ((i & 8) != 0) {
            str4 = getUnifiedBinDetail.nonce;
        }
        return getUnifiedBinDetail.copy(str, str2, str3, str4);
    }

    public final GetUnifiedBinDetail copy(String str, String str2, String str3, String str4) {
        return new GetUnifiedBinDetail(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUnifiedBinDetail)) {
            return false;
        }
        GetUnifiedBinDetail getUnifiedBinDetail = (GetUnifiedBinDetail) obj;
        return o.LJ(this.cardNumber, getUnifiedBinDetail.cardNumber) && o.LJ(this.countryOrRegion, getUnifiedBinDetail.countryOrRegion) && o.LJ(this.merchantUserId, getUnifiedBinDetail.merchantUserId) && o.LJ(this.nonce, getUnifiedBinDetail.nonce);
    }

    public int hashCode() {
        String str = this.cardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryOrRegion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantUserId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nonce;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetUnifiedBinDetail(cardNumber=");
        LIZ.append((Object) this.cardNumber);
        LIZ.append(", countryOrRegion=");
        LIZ.append((Object) this.countryOrRegion);
        LIZ.append(", merchantUserId=");
        LIZ.append((Object) this.merchantUserId);
        LIZ.append(", nonce=");
        LIZ.append((Object) this.nonce);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCountryOrRegion() {
        return this.countryOrRegion;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public final void setCountryOrRegion(String str) {
        this.countryOrRegion = str;
    }

    public final void setMerchantUserId(String str) {
        this.merchantUserId = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public GetUnifiedBinDetail(String str, String str2, String str3, String str4) {
        this.cardNumber = str;
        this.countryOrRegion = str2;
        this.merchantUserId = str3;
        this.nonce = str4;
    }

    public /* synthetic */ GetUnifiedBinDetail(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
