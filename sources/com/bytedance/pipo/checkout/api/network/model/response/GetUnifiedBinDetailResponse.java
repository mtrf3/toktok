package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.InterfaceC92088a56;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class GetUnifiedBinDetailResponse implements InterfaceC92088a56 {

    @InterfaceC65349Pkn("card_brand")
    public String cardBrand;

    @InterfaceC65349Pkn("card_brand_length")
    public ArrayList<Integer> cardBrandLength;

    @InterfaceC65349Pkn("card_type")
    public String cardType;

    @InterfaceC65349Pkn("currency_code")
    public String currencyCode;

    @InterfaceC65349Pkn("cvv_length")
    public ArrayList<Integer> cvvLength;

    @InterfaceC65349Pkn("error_code")
    public String errorCode;

    @InterfaceC65349Pkn("error_message")
    public String errorMessage;

    @InterfaceC65349Pkn("is_gift")
    public Boolean isGift;

    @InterfaceC65349Pkn("is_personal_use")
    public Boolean isPersonalUse;

    @InterfaceC65349Pkn("is_prepaid")
    public Boolean isPrepaid;

    @InterfaceC65349Pkn("is_virtual_card")
    public Boolean isVirtualCard;

    @InterfaceC65349Pkn("issuer_address")
    public String issuerAddress;

    @InterfaceC65349Pkn("issuer_city")
    public String issuerCity;

    @InterfaceC65349Pkn("issuer_country_code")
    public String issuerCountryCode;

    @InterfaceC65349Pkn("issuer_country_name")
    public String issuerCountryName;

    @InterfaceC65349Pkn("issuer_name")
    public String issuerName;

    @InterfaceC65349Pkn("issuer_phone")
    public String issuerPhone;

    @InterfaceC65349Pkn("issuer_website")
    public String issuerWebsite;

    @InterfaceC65349Pkn("issuer_zip_code")
    public String issuerZipCode;

    @InterfaceC65349Pkn("payment_method")
    public String paymentMethod;

    @InterfaceC65349Pkn("result_code")
    public String resultCode;

    @InterfaceC65349Pkn("validate_message")
    public String validateMessage;

    @InterfaceC65349Pkn("validate_succ")
    public Boolean validateSucc;

    public static /* synthetic */ GetUnifiedBinDetailResponse copy$default(GetUnifiedBinDetailResponse getUnifiedBinDetailResponse, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, Boolean bool, String str6, String str7, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, Object obj) {
        String str17 = str3;
        String str18 = str;
        String str19 = str2;
        String str20 = str4;
        Boolean bool6 = bool5;
        Boolean bool7 = bool4;
        Boolean bool8 = bool3;
        Boolean bool9 = bool2;
        ArrayList arrayList3 = arrayList;
        String str21 = str5;
        ArrayList arrayList4 = arrayList2;
        Boolean bool10 = bool;
        String str22 = str6;
        String str23 = str7;
        String str24 = str16;
        String str25 = str14;
        String str26 = str9;
        String str27 = str15;
        String str28 = str8;
        String str29 = str10;
        String str30 = str11;
        String str31 = str12;
        String str32 = str13;
        if ((i & 1) != 0) {
            str18 = getUnifiedBinDetailResponse.getErrorCode();
        }
        if ((i & 2) != 0) {
            str19 = getUnifiedBinDetailResponse.getErrorMessage();
        }
        if ((i & 4) != 0) {
            str17 = getUnifiedBinDetailResponse.getResultCode();
        }
        if ((i & 8) != 0) {
            str20 = getUnifiedBinDetailResponse.cardBrand;
        }
        if ((i & 16) != 0) {
            str21 = getUnifiedBinDetailResponse.cardType;
        }
        if ((i & 32) != 0) {
            arrayList3 = getUnifiedBinDetailResponse.cardBrandLength;
        }
        if ((i & 64) != 0) {
            arrayList4 = getUnifiedBinDetailResponse.cvvLength;
        }
        if ((i & 128) != 0) {
            bool10 = getUnifiedBinDetailResponse.validateSucc;
        }
        if ((i & 256) != 0) {
            str22 = getUnifiedBinDetailResponse.validateMessage;
        }
        if ((i & 512) != 0) {
            str23 = getUnifiedBinDetailResponse.currencyCode;
        }
        if ((i & 1024) != 0) {
            bool9 = getUnifiedBinDetailResponse.isPersonalUse;
        }
        if ((i & 2048) != 0) {
            bool8 = getUnifiedBinDetailResponse.isPrepaid;
        }
        if ((i & 4096) != 0) {
            bool7 = getUnifiedBinDetailResponse.isGift;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            bool6 = getUnifiedBinDetailResponse.isVirtualCard;
        }
        if ((i & 16384) != 0) {
            str28 = getUnifiedBinDetailResponse.issuerName;
        }
        if ((32768 & i) != 0) {
            str26 = getUnifiedBinDetailResponse.issuerCountryCode;
        }
        if ((65536 & i) != 0) {
            str29 = getUnifiedBinDetailResponse.issuerCountryName;
        }
        if ((131072 & i) != 0) {
            str30 = getUnifiedBinDetailResponse.issuerWebsite;
        }
        if ((262144 & i) != 0) {
            str31 = getUnifiedBinDetailResponse.issuerPhone;
        }
        if ((524288 & i) != 0) {
            str32 = getUnifiedBinDetailResponse.issuerAddress;
        }
        if ((1048576 & i) != 0) {
            str25 = getUnifiedBinDetailResponse.issuerCity;
        }
        if ((2097152 & i) != 0) {
            str27 = getUnifiedBinDetailResponse.issuerZipCode;
        }
        if ((i & 4194304) != 0) {
            str24 = getUnifiedBinDetailResponse.paymentMethod;
        }
        String str33 = str23;
        return getUnifiedBinDetailResponse.copy(str18, str19, str17, str20, str21, arrayList3, arrayList4, bool10, str22, str33, bool9, bool8, bool7, bool6, str28, str26, str29, str30, str31, str32, str25, str27, str24);
    }

    public final String component1() {
        return getErrorCode();
    }

    public final String component2() {
        return getErrorMessage();
    }

    public final String component3() {
        return getResultCode();
    }

    public final GetUnifiedBinDetailResponse copy(String str, String str2, String str3, String str4, String str5, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, Boolean bool, String str6, String str7, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        return new GetUnifiedBinDetailResponse(str, str2, str3, str4, str5, arrayList, arrayList2, bool, str6, str7, bool2, bool3, bool4, bool5, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUnifiedBinDetailResponse)) {
            return false;
        }
        GetUnifiedBinDetailResponse getUnifiedBinDetailResponse = (GetUnifiedBinDetailResponse) obj;
        return o.LJ(getErrorCode(), getUnifiedBinDetailResponse.getErrorCode()) && o.LJ(getErrorMessage(), getUnifiedBinDetailResponse.getErrorMessage()) && o.LJ(getResultCode(), getUnifiedBinDetailResponse.getResultCode()) && o.LJ(this.cardBrand, getUnifiedBinDetailResponse.cardBrand) && o.LJ(this.cardType, getUnifiedBinDetailResponse.cardType) && o.LJ(this.cardBrandLength, getUnifiedBinDetailResponse.cardBrandLength) && o.LJ(this.cvvLength, getUnifiedBinDetailResponse.cvvLength) && o.LJ(this.validateSucc, getUnifiedBinDetailResponse.validateSucc) && o.LJ(this.validateMessage, getUnifiedBinDetailResponse.validateMessage) && o.LJ(this.currencyCode, getUnifiedBinDetailResponse.currencyCode) && o.LJ(this.isPersonalUse, getUnifiedBinDetailResponse.isPersonalUse) && o.LJ(this.isPrepaid, getUnifiedBinDetailResponse.isPrepaid) && o.LJ(this.isGift, getUnifiedBinDetailResponse.isGift) && o.LJ(this.isVirtualCard, getUnifiedBinDetailResponse.isVirtualCard) && o.LJ(this.issuerName, getUnifiedBinDetailResponse.issuerName) && o.LJ(this.issuerCountryCode, getUnifiedBinDetailResponse.issuerCountryCode) && o.LJ(this.issuerCountryName, getUnifiedBinDetailResponse.issuerCountryName) && o.LJ(this.issuerWebsite, getUnifiedBinDetailResponse.issuerWebsite) && o.LJ(this.issuerPhone, getUnifiedBinDetailResponse.issuerPhone) && o.LJ(this.issuerAddress, getUnifiedBinDetailResponse.issuerAddress) && o.LJ(this.issuerCity, getUnifiedBinDetailResponse.issuerCity) && o.LJ(this.issuerZipCode, getUnifiedBinDetailResponse.issuerZipCode) && o.LJ(this.paymentMethod, getUnifiedBinDetailResponse.paymentMethod);
    }

    public int hashCode() {
        int hashCode = (((((getErrorCode() == null ? 0 : getErrorCode().hashCode()) * 31) + (getErrorMessage() == null ? 0 : getErrorMessage().hashCode())) * 31) + (getResultCode() == null ? 0 : getResultCode().hashCode())) * 31;
        String str = this.cardBrand;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.cardBrandLength;
        int hashCode4 = (hashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<Integer> arrayList2 = this.cvvLength;
        int hashCode5 = (hashCode4 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        Boolean bool = this.validateSucc;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.validateMessage;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyCode;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isPersonalUse;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isPrepaid;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isGift;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isVirtualCard;
        int hashCode12 = (hashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str5 = this.issuerName;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.issuerCountryCode;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.issuerCountryName;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.issuerWebsite;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.issuerPhone;
        int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.issuerAddress;
        int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.issuerCity;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.issuerZipCode;
        int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.paymentMethod;
        return hashCode20 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "GetUnifiedBinDetailResponse(errorCode=" + ((Object) getErrorCode()) + ", errorMessage=" + ((Object) getErrorMessage()) + ", resultCode=" + ((Object) getResultCode()) + ", cardBrand=" + ((Object) this.cardBrand) + ", cardType=" + ((Object) this.cardType) + ", cardBrandLength=" + this.cardBrandLength + ", cvvLength=" + this.cvvLength + ", validateSucc=" + this.validateSucc + ", validateMessage=" + ((Object) this.validateMessage) + ", currencyCode=" + ((Object) this.currencyCode) + ", isPersonalUse=" + this.isPersonalUse + ", isPrepaid=" + this.isPrepaid + ", isGift=" + this.isGift + ", isVirtualCard=" + this.isVirtualCard + ", issuerName=" + ((Object) this.issuerName) + ", issuerCountryCode=" + ((Object) this.issuerCountryCode) + ", issuerCountryName=" + ((Object) this.issuerCountryName) + ", issuerWebsite=" + ((Object) this.issuerWebsite) + ", issuerPhone=" + ((Object) this.issuerPhone) + ", issuerAddress=" + ((Object) this.issuerAddress) + ", issuerCity=" + ((Object) this.issuerCity) + ", issuerZipCode=" + ((Object) this.issuerZipCode) + ", paymentMethod=" + ((Object) this.paymentMethod) + ')';
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final ArrayList<Integer> getCardBrandLength() {
        return this.cardBrandLength;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final ArrayList<Integer> getCvvLength() {
        return this.cvvLength;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getIssuerAddress() {
        return this.issuerAddress;
    }

    public final String getIssuerCity() {
        return this.issuerCity;
    }

    public final String getIssuerCountryCode() {
        return this.issuerCountryCode;
    }

    public final String getIssuerCountryName() {
        return this.issuerCountryName;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public final String getIssuerPhone() {
        return this.issuerPhone;
    }

    public final String getIssuerWebsite() {
        return this.issuerWebsite;
    }

    public final String getIssuerZipCode() {
        return this.issuerZipCode;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public final String getValidateMessage() {
        return this.validateMessage;
    }

    public final Boolean getValidateSucc() {
        return this.validateSucc;
    }

    public final Boolean isGift() {
        return this.isGift;
    }

    public final Boolean isPersonalUse() {
        return this.isPersonalUse;
    }

    public final Boolean isPrepaid() {
        return this.isPrepaid;
    }

    public final Boolean isVirtualCard() {
        return this.isVirtualCard;
    }

    public final void setCardBrand(String str) {
        this.cardBrand = str;
    }

    public final void setCardBrandLength(ArrayList<Integer> arrayList) {
        this.cardBrandLength = arrayList;
    }

    public final void setCardType(String str) {
        this.cardType = str;
    }

    public final void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public final void setCvvLength(ArrayList<Integer> arrayList) {
        this.cvvLength = arrayList;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setGift(Boolean bool) {
        this.isGift = bool;
    }

    public final void setIssuerAddress(String str) {
        this.issuerAddress = str;
    }

    public final void setIssuerCity(String str) {
        this.issuerCity = str;
    }

    public final void setIssuerCountryCode(String str) {
        this.issuerCountryCode = str;
    }

    public final void setIssuerCountryName(String str) {
        this.issuerCountryName = str;
    }

    public final void setIssuerName(String str) {
        this.issuerName = str;
    }

    public final void setIssuerPhone(String str) {
        this.issuerPhone = str;
    }

    public final void setIssuerWebsite(String str) {
        this.issuerWebsite = str;
    }

    public final void setIssuerZipCode(String str) {
        this.issuerZipCode = str;
    }

    public final void setPaymentMethod(String str) {
        this.paymentMethod = str;
    }

    public final void setPersonalUse(Boolean bool) {
        this.isPersonalUse = bool;
    }

    public final void setPrepaid(Boolean bool) {
        this.isPrepaid = bool;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public final void setValidateMessage(String str) {
        this.validateMessage = str;
    }

    public final void setValidateSucc(Boolean bool) {
        this.validateSucc = bool;
    }

    public final void setVirtualCard(Boolean bool) {
        this.isVirtualCard = bool;
    }

    public GetUnifiedBinDetailResponse(String str, String str2, String str3, String str4, String str5, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, Boolean bool, String str6, String str7, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.resultCode = str3;
        this.cardBrand = str4;
        this.cardType = str5;
        this.cardBrandLength = arrayList;
        this.cvvLength = arrayList2;
        this.validateSucc = bool;
        this.validateMessage = str6;
        this.currencyCode = str7;
        this.isPersonalUse = bool2;
        this.isPrepaid = bool3;
        this.isGift = bool4;
        this.isVirtualCard = bool5;
        this.issuerName = str8;
        this.issuerCountryCode = str9;
        this.issuerCountryName = str10;
        this.issuerWebsite = str11;
        this.issuerPhone = str12;
        this.issuerAddress = str13;
        this.issuerCity = str14;
        this.issuerZipCode = str15;
        this.paymentMethod = str16;
    }

    public /* synthetic */ GetUnifiedBinDetailResponse(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, Boolean bool, String str6, String str7, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : arrayList, (i & 64) != 0 ? null : arrayList2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : bool4, (i & FileUtils.BUFFER_SIZE) != 0 ? null : bool5, (i & 16384) != 0 ? null : str8, (32768 & i) != 0 ? null : str9, (65536 & i) != 0 ? null : str10, (131072 & i) != 0 ? null : str11, (262144 & i) != 0 ? null : str12, (524288 & i) != 0 ? null : str13, (1048576 & i) != 0 ? null : str14, (2097152 & i) != 0 ? null : str15, (i & 4194304) == 0 ? str16 : null);
    }
}
