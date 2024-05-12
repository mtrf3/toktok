package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OfferInfo implements Serializable {

    @InterfaceC65349Pkn("label_text")
    public final String labelText;

    @InterfaceC65349Pkn("offer_description")
    public final String offerDescription;

    @InterfaceC65349Pkn("offer_name")
    public final String offerName;

    @InterfaceC65349Pkn("period_name")
    public final String periodName;

    @InterfaceC65349Pkn("product_info")
    public final ProductInfo productInfo;

    @InterfaceC65349Pkn("selected_button_desc")
    public final String selectButtonDesc;

    @InterfaceC65349Pkn("selected_button_text")
    public final String selectButtonText;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public OfferInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OfferInfo copy$default(OfferInfo offerInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, ProductInfo productInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerInfo.labelText;
        }
        if ((i & 2) != 0) {
            str2 = offerInfo.offerName;
        }
        if ((i & 4) != 0) {
            str3 = offerInfo.title;
        }
        if ((i & 8) != 0) {
            str4 = offerInfo.offerDescription;
        }
        if ((i & 16) != 0) {
            str5 = offerInfo.periodName;
        }
        if ((i & 32) != 0) {
            str6 = offerInfo.selectButtonText;
        }
        if ((i & 64) != 0) {
            str7 = offerInfo.selectButtonDesc;
        }
        if ((i & 128) != 0) {
            productInfo = offerInfo.productInfo;
        }
        return offerInfo.copy(str, str2, str3, str4, str5, str6, str7, productInfo);
    }

    public final OfferInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, ProductInfo productInfo) {
        return new OfferInfo(str, str2, str3, str4, str5, str6, str7, productInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferInfo)) {
            return false;
        }
        OfferInfo offerInfo = (OfferInfo) obj;
        return o.LJ(this.labelText, offerInfo.labelText) && o.LJ(this.offerName, offerInfo.offerName) && o.LJ(this.title, offerInfo.title) && o.LJ(this.offerDescription, offerInfo.offerDescription) && o.LJ(this.periodName, offerInfo.periodName) && o.LJ(this.selectButtonText, offerInfo.selectButtonText) && o.LJ(this.selectButtonDesc, offerInfo.selectButtonDesc) && o.LJ(this.productInfo, offerInfo.productInfo);
    }

    public int hashCode() {
        String str = this.labelText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.offerName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offerDescription;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.periodName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.selectButtonText;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.selectButtonDesc;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ProductInfo productInfo = this.productInfo;
        return hashCode7 + (productInfo != null ? productInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OfferInfo(labelText=");
        LIZ.append(this.labelText);
        LIZ.append(", offerName=");
        LIZ.append(this.offerName);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", offerDescription=");
        LIZ.append(this.offerDescription);
        LIZ.append(", periodName=");
        LIZ.append(this.periodName);
        LIZ.append(", selectButtonText=");
        LIZ.append(this.selectButtonText);
        LIZ.append(", selectButtonDesc=");
        LIZ.append(this.selectButtonDesc);
        LIZ.append(", productInfo=");
        LIZ.append(this.productInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public final String getOfferDescription() {
        return this.offerDescription;
    }

    public final String getOfferName() {
        return this.offerName;
    }

    public final String getPeriodName() {
        return this.periodName;
    }

    public final ProductInfo getProductInfo() {
        return this.productInfo;
    }

    public final String getSelectButtonDesc() {
        return this.selectButtonDesc;
    }

    public final String getSelectButtonText() {
        return this.selectButtonText;
    }

    public final String getTitle() {
        return this.title;
    }

    public OfferInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, ProductInfo productInfo) {
        this.labelText = str;
        this.offerName = str2;
        this.title = str3;
        this.offerDescription = str4;
        this.periodName = str5;
        this.selectButtonText = str6;
        this.selectButtonDesc = str7;
        this.productInfo = productInfo;
    }

    public /* synthetic */ OfferInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, ProductInfo productInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : productInfo);
    }
}
