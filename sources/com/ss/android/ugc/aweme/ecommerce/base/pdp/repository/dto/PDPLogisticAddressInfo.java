package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27131Akp;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PDPLogisticAddressInfo implements Parcelable {
    public static final Parcelable.Creator<PDPLogisticAddressInfo> CREATOR = new C27131Akp();

    @InterfaceC65349Pkn("delivery_time")
    public final LinkRichText deliveryTime;

    @InterfaceC65349Pkn("from_address")
    public final String fromAddress;

    @InterfaceC65349Pkn("from_icon")
    public final Icon fromIcon;

    @InterfaceC65349Pkn("to_address")
    public final String toAddress;

    @InterfaceC65349Pkn("to_icon")
    public final Icon toIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public PDPLogisticAddressInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPLogisticAddressInfo)) {
            return false;
        }
        PDPLogisticAddressInfo pDPLogisticAddressInfo = (PDPLogisticAddressInfo) obj;
        return o.LJ(this.fromIcon, pDPLogisticAddressInfo.fromIcon) && o.LJ(this.fromAddress, pDPLogisticAddressInfo.fromAddress) && o.LJ(this.toIcon, pDPLogisticAddressInfo.toIcon) && o.LJ(this.toAddress, pDPLogisticAddressInfo.toAddress) && o.LJ(this.deliveryTime, pDPLogisticAddressInfo.deliveryTime);
    }

    public final int hashCode() {
        Icon icon = this.fromIcon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.fromAddress;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon2 = this.toIcon;
        int hashCode3 = (hashCode2 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        String str2 = this.toAddress;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkRichText linkRichText = this.deliveryTime;
        return hashCode4 + (linkRichText != null ? linkRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PDPLogisticAddressInfo(fromIcon=");
        LIZ.append(this.fromIcon);
        LIZ.append(", fromAddress=");
        LIZ.append(this.fromAddress);
        LIZ.append(", toIcon=");
        LIZ.append(this.toIcon);
        LIZ.append(", toAddress=");
        LIZ.append(this.toAddress);
        LIZ.append(", deliveryTime=");
        LIZ.append(this.deliveryTime);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Icon icon = this.fromIcon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.fromAddress);
        Icon icon2 = this.toIcon;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
        out.writeString(this.toAddress);
        LinkRichText linkRichText = this.deliveryTime;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
    }

    public PDPLogisticAddressInfo(Icon icon, String str, Icon icon2, String str2, LinkRichText linkRichText) {
        this.fromIcon = icon;
        this.fromAddress = str;
        this.toIcon = icon2;
        this.toAddress = str2;
        this.deliveryTime = linkRichText;
    }

    public /* synthetic */ PDPLogisticAddressInfo(Icon icon, String str, Icon icon2, String str2, LinkRichText linkRichText, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : icon2, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? linkRichText : null);
    }
}
