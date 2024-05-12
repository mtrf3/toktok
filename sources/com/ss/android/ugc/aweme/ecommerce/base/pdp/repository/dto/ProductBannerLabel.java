package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C26865AgX;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductBannerLabel implements Parcelable {
    public static final Parcelable.Creator<ProductBannerLabel> CREATOR = new C26865AgX();

    @InterfaceC65349Pkn("event_tracking_name")
    public final String eventTrackingName;

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("left_retract")
    public final Integer leftRetract;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBannerLabel)) {
            return false;
        }
        ProductBannerLabel productBannerLabel = (ProductBannerLabel) obj;
        return o.LJ(this.eventTrackingName, productBannerLabel.eventTrackingName) && o.LJ(this.leftRetract, productBannerLabel.leftRetract) && o.LJ(this.image, productBannerLabel.image);
    }

    public final int hashCode() {
        String str = this.eventTrackingName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.leftRetract;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Image image = this.image;
        return hashCode2 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductBannerLabel(eventTrackingName=");
        LIZ.append(this.eventTrackingName);
        LIZ.append(", leftRetract=");
        LIZ.append(this.leftRetract);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeString(this.eventTrackingName);
        Integer num = this.leftRetract;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeParcelable(this.image, i);
    }

    public ProductBannerLabel(String str, Integer num, Image image) {
        this.eventTrackingName = str;
        this.leftRetract = num;
        this.image = image;
    }
}
