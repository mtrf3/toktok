package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C07670Rv;
import X.C27107AkR;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LeadMessage implements Parcelable {
    public static final Parcelable.Creator<LeadMessage> CREATOR = new C27107AkR();

    @InterfaceC65349Pkn("delivery_text")
    public final String deliveryText;

    @InterfaceC65349Pkn("delivery_text_prefix")
    public final String deliveryTextPrefix;

    @InterfaceC65349Pkn("destination")
    public final String destination;

    @InterfaceC65349Pkn("from_message")
    public final String fromMessage;

    @InterfaceC65349Pkn("from_overseas")
    public final String fromOverseas;

    @InterfaceC65349Pkn("from_overseas_v2")
    public final String fromOverseasV2;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("icon_from")
    public final Icon iconFrom;

    @InterfaceC65349Pkn("icon_to")
    public final Icon iconTo;

    @InterfaceC65349Pkn("shipping_coupon_text")
    public final String shippingCouponText;

    @InterfaceC65349Pkn("time_text")
    public final String timeText;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadMessage)) {
            return false;
        }
        LeadMessage leadMessage = (LeadMessage) obj;
        return o.LJ(this.icon, leadMessage.icon) && o.LJ(this.title, leadMessage.title) && o.LJ(this.deliveryText, leadMessage.deliveryText) && o.LJ(this.timeText, leadMessage.timeText) && o.LJ(this.iconFrom, leadMessage.iconFrom) && o.LJ(this.iconTo, leadMessage.iconTo) && o.LJ(this.fromOverseas, leadMessage.fromOverseas) && o.LJ(this.destination, leadMessage.destination) && o.LJ(this.fromMessage, leadMessage.fromMessage) && o.LJ(this.fromOverseasV2, leadMessage.fromOverseasV2) && o.LJ(this.deliveryTextPrefix, leadMessage.deliveryTextPrefix) && o.LJ(this.shippingCouponText, leadMessage.shippingCouponText);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timeText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Icon icon2 = this.iconFrom;
        int hashCode5 = (hashCode4 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        Icon icon3 = this.iconTo;
        int hashCode6 = (hashCode5 + (icon3 == null ? 0 : icon3.hashCode())) * 31;
        String str4 = this.fromOverseas;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.destination;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fromMessage;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fromOverseasV2;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deliveryTextPrefix;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.shippingCouponText;
        return hashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.title);
        out.writeString(this.deliveryText);
        out.writeString(this.timeText);
        Icon icon2 = this.iconFrom;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
        Icon icon3 = this.iconTo;
        if (icon3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon3.writeToParcel(out, i);
        }
        out.writeString(this.fromOverseas);
        out.writeString(this.destination);
        out.writeString(this.fromMessage);
        out.writeString(this.fromOverseasV2);
        out.writeString(this.deliveryTextPrefix);
        out.writeString(this.shippingCouponText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeadMessage(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", deliveryText=");
        sb.append(this.deliveryText);
        sb.append(", timeText=");
        sb.append(this.timeText);
        sb.append(", iconFrom=");
        sb.append(this.iconFrom);
        sb.append(", iconTo=");
        sb.append(this.iconTo);
        sb.append(", fromOverseas=");
        sb.append(this.fromOverseas);
        sb.append(", destination=");
        sb.append(this.destination);
        sb.append(", fromMessage=");
        sb.append(this.fromMessage);
        sb.append(", fromOverseasV2=");
        sb.append(this.fromOverseasV2);
        sb.append(", deliveryTextPrefix=");
        sb.append(this.deliveryTextPrefix);
        sb.append(", shippingCouponText=");
        return C07670Rv.LIZIZ(sb, this.shippingCouponText, ')');
    }

    public LeadMessage(Icon icon, String str, String str2, String str3, Icon icon2, Icon icon3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.icon = icon;
        this.title = str;
        this.deliveryText = str2;
        this.timeText = str3;
        this.iconFrom = icon2;
        this.iconTo = icon3;
        this.fromOverseas = str4;
        this.destination = str5;
        this.fromMessage = str6;
        this.fromOverseasV2 = str7;
        this.deliveryTextPrefix = str8;
        this.shippingCouponText = str9;
    }

    public /* synthetic */ LeadMessage(Icon icon, String str, String str2, String str3, Icon icon2, Icon icon3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : icon, str, str2, str3, (i & 16) != 0 ? null : icon2, (i & 32) == 0 ? icon3 : null, str4, str5, str6, str7, str8, str9);
    }
}
