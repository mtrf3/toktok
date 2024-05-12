package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RW1;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DynamicSellingPoint implements Parcelable {
    public static final Parcelable.Creator<DynamicSellingPoint> CREATOR = new RW1();

    @InterfaceC65349Pkn("background_color")
    public final com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor backgroundColor;

    @InterfaceC65349Pkn("bubble_text_type")
    public final String bubbleTextType;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("num_in_selling_point")
    public final Integer numInSellingPoint;

    @InterfaceC65349Pkn("rich_text")
    public final LinkRichText richText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSellingPoint)) {
            return false;
        }
        DynamicSellingPoint dynamicSellingPoint = (DynamicSellingPoint) obj;
        return o.LJ(this.richText, dynamicSellingPoint.richText) && o.LJ(this.backgroundColor, dynamicSellingPoint.backgroundColor) && o.LJ(this.description, dynamicSellingPoint.description) && o.LJ(this.bubbleTextType, dynamicSellingPoint.bubbleTextType) && o.LJ(this.numInSellingPoint, dynamicSellingPoint.numInSellingPoint);
    }

    public final int hashCode() {
        LinkRichText linkRichText = this.richText;
        int hashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor = this.backgroundColor;
        int hashCode2 = (hashCode + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        String str = this.description;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bubbleTextType;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.numInSellingPoint;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicSellingPoint(richText=");
        LIZ.append(this.richText);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", bubbleTextType=");
        LIZ.append(this.bubbleTextType);
        LIZ.append(", numInSellingPoint=");
        return s0.LIZJ(LIZ, this.numInSellingPoint, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        LinkRichText linkRichText = this.richText;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
        com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            commonColor.writeToParcel(out, i);
        }
        out.writeString(this.description);
        out.writeString(this.bubbleTextType);
        Integer num = this.numInSellingPoint;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
    }

    public DynamicSellingPoint(LinkRichText linkRichText, com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor commonColor, String str, String str2, Integer num) {
        this.richText = linkRichText;
        this.backgroundColor = commonColor;
        this.description = str;
        this.bubbleTextType = str2;
        this.numInSellingPoint = num;
    }
}
