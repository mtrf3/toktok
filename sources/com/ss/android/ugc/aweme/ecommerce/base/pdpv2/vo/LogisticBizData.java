package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C1FJ;
import X.C1FL;
import X.C27125Akj;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticBizData implements Parcelable {
    public static final Parcelable.Creator<LogisticBizData> CREATOR = new C27125Akj();

    @InterfaceC65349Pkn("delivery_max_days")
    public final Integer deliveryMaxDays;

    @InterfaceC65349Pkn("delivery_min_days")
    public final Integer deliveryMinDays;

    @InterfaceC65349Pkn("delivery_name")
    public final String deliveryName;

    @InterfaceC65349Pkn("delivery_option")
    public final String deliveryOption;

    @InterfaceC65349Pkn("free_shipping")
    public final Boolean freeShipping;

    @InterfaceC65349Pkn("has_native_page")
    public final Boolean hasNativePage;

    @InterfaceC65349Pkn("is_default")
    public final Boolean isDefault;

    @InterfaceC65349Pkn("logistic_link_info")
    public final CheckoutLink linkInfo;

    @InterfaceC65349Pkn("logistics_service_id")
    public final String logisticServiceId;

    @InterfaceC65349Pkn("original_shipping_fee")
    public final String originalShippingFee;

    @InterfaceC65349Pkn("reachable")
    public final Boolean reachable;

    @InterfaceC65349Pkn("shipping_fee")
    public final Price shippingFee;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticBizData)) {
            return false;
        }
        LogisticBizData logisticBizData = (LogisticBizData) obj;
        return o.LJ(this.deliveryOption, logisticBizData.deliveryOption) && o.LJ(this.deliveryName, logisticBizData.deliveryName) && o.LJ(this.isDefault, logisticBizData.isDefault) && o.LJ(this.reachable, logisticBizData.reachable) && o.LJ(this.shippingFee, logisticBizData.shippingFee) && o.LJ(this.originalShippingFee, logisticBizData.originalShippingFee) && o.LJ(this.logisticServiceId, logisticBizData.logisticServiceId) && o.LJ(this.deliveryMinDays, logisticBizData.deliveryMinDays) && o.LJ(this.deliveryMaxDays, logisticBizData.deliveryMaxDays) && o.LJ(this.linkInfo, logisticBizData.linkInfo) && o.LJ(this.freeShipping, logisticBizData.freeShipping) && o.LJ(this.hasNativePage, logisticBizData.hasNativePage);
    }

    public final int hashCode() {
        String str = this.deliveryOption;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deliveryName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isDefault;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.reachable;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Price price = this.shippingFee;
        int hashCode5 = (hashCode4 + (price == null ? 0 : price.hashCode())) * 31;
        String str3 = this.originalShippingFee;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logisticServiceId;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.deliveryMinDays;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.deliveryMaxDays;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CheckoutLink checkoutLink = this.linkInfo;
        int hashCode10 = (hashCode9 + (checkoutLink == null ? 0 : checkoutLink.hashCode())) * 31;
        Boolean bool3 = this.freeShipping;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasNativePage;
        return hashCode11 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "LogisticBizData(deliveryOption=" + this.deliveryOption + ", deliveryName=" + this.deliveryName + ", isDefault=" + this.isDefault + ", reachable=" + this.reachable + ", shippingFee=" + this.shippingFee + ", originalShippingFee=" + this.originalShippingFee + ", logisticServiceId=" + this.logisticServiceId + ", deliveryMinDays=" + this.deliveryMinDays + ", deliveryMaxDays=" + this.deliveryMaxDays + ", linkInfo=" + this.linkInfo + ", freeShipping=" + this.freeShipping + ", hasNativePage=" + this.hasNativePage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.deliveryOption);
        out.writeString(this.deliveryName);
        Boolean bool = this.isDefault;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.reachable;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        Price price = this.shippingFee;
        if (price == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            price.writeToParcel(out, i);
        }
        out.writeString(this.originalShippingFee);
        out.writeString(this.logisticServiceId);
        Integer num = this.deliveryMinDays;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.deliveryMaxDays;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        CheckoutLink checkoutLink = this.linkInfo;
        if (checkoutLink == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            checkoutLink.writeToParcel(out, i);
        }
        Boolean bool3 = this.freeShipping;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        Boolean bool4 = this.hasNativePage;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool4);
        }
    }

    public LogisticBizData(String str, String str2, Boolean bool, Boolean bool2, Price price, String str3, String str4, Integer num, Integer num2, CheckoutLink checkoutLink, Boolean bool3, Boolean bool4) {
        this.deliveryOption = str;
        this.deliveryName = str2;
        this.isDefault = bool;
        this.reachable = bool2;
        this.shippingFee = price;
        this.originalShippingFee = str3;
        this.logisticServiceId = str4;
        this.deliveryMinDays = num;
        this.deliveryMaxDays = num2;
        this.linkInfo = checkoutLink;
        this.freeShipping = bool3;
        this.hasNativePage = bool4;
    }
}
