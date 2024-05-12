package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.AnonymousClass636;
import X.C26864AgW;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StoreOfficialLabel implements Parcelable {
    public static final Parcelable.Creator<StoreOfficialLabel> CREATOR = new C26864AgW();

    @InterfaceC65349Pkn("label_image_dark")
    public final Image darkImage;

    @InterfaceC65349Pkn("label_type")
    public final Integer labelType;

    @InterfaceC65349Pkn("label_type_str")
    public final String labelTypeStr;

    @InterfaceC65349Pkn("label_image_light")
    public final Image lightImage;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreOfficialLabel)) {
            return false;
        }
        StoreOfficialLabel storeOfficialLabel = (StoreOfficialLabel) obj;
        return o.LJ(this.lightImage, storeOfficialLabel.lightImage) && o.LJ(this.darkImage, storeOfficialLabel.darkImage) && o.LJ(this.labelType, storeOfficialLabel.labelType) && o.LJ(this.labelTypeStr, storeOfficialLabel.labelTypeStr);
    }

    public final int hashCode() {
        Image image = this.lightImage;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.darkImage;
        int hashCode2 = (hashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.labelType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.labelTypeStr;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.lightImage, i);
        out.writeParcelable(this.darkImage, i);
        Integer num = this.labelType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.labelTypeStr);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreOfficialLabel(lightImage=");
        LIZ.append(this.lightImage);
        LIZ.append(", darkImage=");
        LIZ.append(this.darkImage);
        LIZ.append(", labelType=");
        LIZ.append(this.labelType);
        LIZ.append(", labelTypeStr=");
        return q.LIZIZ(LIZ, this.labelTypeStr, ')', LIZ);
    }

    public final Image LIZ(Context context) {
        Image image;
        if (AnonymousClass636.LJIILJJIL(context) && (image = this.darkImage) != null) {
            return image;
        }
        return this.lightImage;
    }

    public StoreOfficialLabel(Image image, Image image2, Integer num, String str) {
        this.lightImage = image;
        this.darkImage = image2;
        this.labelType = num;
        this.labelTypeStr = str;
    }
}
