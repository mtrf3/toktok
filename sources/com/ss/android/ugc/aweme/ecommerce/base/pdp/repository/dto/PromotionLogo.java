package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27741Auf;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromotionLogo implements Parcelable {
    public static final Parcelable.Creator<PromotionLogo> CREATOR = new C27741Auf();

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("promotion_id")
    public final String promotionId;

    @InterfaceC65349Pkn("promotionLogoType")
    public final Integer promotionLogoType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionLogo)) {
            return false;
        }
        PromotionLogo promotionLogo = (PromotionLogo) obj;
        return o.LJ(this.image, promotionLogo.image) && o.LJ(this.promotionId, promotionLogo.promotionId) && o.LJ(this.promotionLogoType, promotionLogo.promotionLogoType);
    }

    public final int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.promotionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.promotionLogoType;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.image, i);
        out.writeString(this.promotionId);
        Integer num = this.promotionLogoType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotionLogo(image=");
        LIZ.append(this.image);
        LIZ.append(", promotionId=");
        LIZ.append(this.promotionId);
        LIZ.append(", promotionLogoType=");
        return s0.LIZJ(LIZ, this.promotionLogoType, ')', LIZ);
    }

    public PromotionLogo(Image image, String str, Integer num) {
        this.image = image;
        this.promotionId = str;
        this.promotionLogoType = num;
    }
}
