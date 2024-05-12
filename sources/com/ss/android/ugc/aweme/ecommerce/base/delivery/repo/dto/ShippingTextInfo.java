package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C27132Akq;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShippingTextInfo implements Parcelable {
    public static final Parcelable.Creator<ShippingTextInfo> CREATOR = new C27132Akq();

    @InterfaceC65349Pkn("logistics_panel_shipping_display_text")
    public final String logisticsPanelShippingDisplayText;

    @InterfaceC65349Pkn("shipping_dialog")
    public final ShippingDialogDto shippingDialogDto;

    @InterfaceC65349Pkn("shipping_display_text")
    public final String shippingDisplayText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingTextInfo)) {
            return false;
        }
        ShippingTextInfo shippingTextInfo = (ShippingTextInfo) obj;
        return o.LJ(this.shippingDisplayText, shippingTextInfo.shippingDisplayText) && o.LJ(this.logisticsPanelShippingDisplayText, shippingTextInfo.logisticsPanelShippingDisplayText) && o.LJ(this.shippingDialogDto, shippingTextInfo.shippingDialogDto);
    }

    public final int hashCode() {
        String str = this.shippingDisplayText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logisticsPanelShippingDisplayText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShippingDialogDto shippingDialogDto = this.shippingDialogDto;
        return hashCode2 + (shippingDialogDto != null ? shippingDialogDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShippingTextInfo(shippingDisplayText=");
        LIZ.append(this.shippingDisplayText);
        LIZ.append(", logisticsPanelShippingDisplayText=");
        LIZ.append(this.logisticsPanelShippingDisplayText);
        LIZ.append(", shippingDialogDto=");
        LIZ.append(this.shippingDialogDto);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.shippingDisplayText);
        out.writeString(this.logisticsPanelShippingDisplayText);
        ShippingDialogDto shippingDialogDto = this.shippingDialogDto;
        if (shippingDialogDto == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingDialogDto.writeToParcel(out, i);
        }
    }

    public ShippingTextInfo(String str, String str2, ShippingDialogDto shippingDialogDto) {
        this.shippingDisplayText = str;
        this.logisticsPanelShippingDisplayText = str2;
        this.shippingDialogDto = shippingDialogDto;
    }
}
