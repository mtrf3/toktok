package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C69620RUa;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VoucherLabel implements Parcelable, Serializable {
    public static final Parcelable.Creator<VoucherLabel> CREATOR = new C69620RUa();

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("style")
    public final Integer style;

    @InterfaceC65349Pkn("text")
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public VoucherLabel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VoucherLabel copy$default(VoucherLabel voucherLabel, Integer num, String str, Image image, int i, Object obj) {
        if ((i & 1) != 0) {
            num = voucherLabel.style;
        }
        if ((i & 2) != 0) {
            str = voucherLabel.text;
        }
        if ((i & 4) != 0) {
            image = voucherLabel.image;
        }
        return voucherLabel.copy(num, str, image);
    }

    public final VoucherLabel copy(Integer num, String str, Image image) {
        return new VoucherLabel(num, str, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherLabel)) {
            return false;
        }
        VoucherLabel voucherLabel = (VoucherLabel) obj;
        return o.LJ(this.style, voucherLabel.style) && o.LJ(this.text, voucherLabel.text) && o.LJ(this.image, voucherLabel.image);
    }

    public int hashCode() {
        Integer num = this.style;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.image;
        return hashCode2 + (image != null ? image.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoucherLabel(style=");
        LIZ.append(this.style);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.style;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.text);
        out.writeParcelable(this.image, i);
    }

    public final Image getImage() {
        return this.image;
    }

    public final Integer getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public VoucherLabel(Integer num, String str, Image image) {
        this.style = num;
        this.text = str;
        this.image = image;
    }

    public /* synthetic */ VoucherLabel(Integer num, String str, Image image, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : image);
    }
}
