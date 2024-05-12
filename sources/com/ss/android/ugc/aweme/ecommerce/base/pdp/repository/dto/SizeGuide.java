package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C1FL;
import X.C69654RVi;
import X.C69658RVm;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SizeGuide implements Parcelable {

    @InterfaceC65349Pkn("is_out_standing")
    public final Boolean isOutstanding;

    @InterfaceC65349Pkn("origin_size_guide_image")
    public final Image originSizeGuideImage;

    @InterfaceC65349Pkn("pdp_size_guide_button")
    public final String pdpSizeGuideButtonText;

    @InterfaceC65349Pkn("show_sale_prop_id")
    public final String showSalePropId;

    @InterfaceC65349Pkn("size_guide_image")
    public final Image sizeGuideImage;

    @InterfaceC65349Pkn("sku_size_guide_button_icon")
    public final Icon skuSizeGuideButtonIcon;

    @InterfaceC65349Pkn("sku_size_guide_button")
    public final String skuSizeGuideButtonText;

    @InterfaceC65349Pkn("sku_size_guide_location")
    public final Integer skuSizeGuideLoc;

    @InterfaceC65349Pkn("sku_size_page_schema")
    public final String skuSizeGuideSchema;

    @InterfaceC65349Pkn("sku_size_guide_title")
    public final String skuSizeGuideTitle;
    public static final C69658RVm Companion = new C69658RVm();
    public static final Parcelable.Creator<SizeGuide> CREATOR = new C69654RVi();
    public static final int SIZE_GUIDE_LOC_TOP = 1;
    public static final int SIZE_GUIDE_LOC_SIZE = 2;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeGuide() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeGuide)) {
            return false;
        }
        SizeGuide sizeGuide = (SizeGuide) obj;
        return o.LJ(this.sizeGuideImage, sizeGuide.sizeGuideImage) && o.LJ(this.originSizeGuideImage, sizeGuide.originSizeGuideImage) && o.LJ(this.isOutstanding, sizeGuide.isOutstanding) && o.LJ(this.pdpSizeGuideButtonText, sizeGuide.pdpSizeGuideButtonText) && o.LJ(this.skuSizeGuideButtonText, sizeGuide.skuSizeGuideButtonText) && o.LJ(this.skuSizeGuideTitle, sizeGuide.skuSizeGuideTitle) && o.LJ(this.skuSizeGuideButtonIcon, sizeGuide.skuSizeGuideButtonIcon) && o.LJ(this.skuSizeGuideLoc, sizeGuide.skuSizeGuideLoc) && o.LJ(this.skuSizeGuideSchema, sizeGuide.skuSizeGuideSchema) && o.LJ(this.showSalePropId, sizeGuide.showSalePropId);
    }

    public final int hashCode() {
        Image image = this.sizeGuideImage;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.originSizeGuideImage;
        int hashCode2 = (hashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        Boolean bool = this.isOutstanding;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.pdpSizeGuideButtonText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.skuSizeGuideButtonText;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.skuSizeGuideTitle;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Icon icon = this.skuSizeGuideButtonIcon;
        int hashCode7 = (hashCode6 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.skuSizeGuideLoc;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.skuSizeGuideSchema;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.showSalePropId;
        return hashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SizeGuide(sizeGuideImage=");
        LIZ.append(this.sizeGuideImage);
        LIZ.append(", originSizeGuideImage=");
        LIZ.append(this.originSizeGuideImage);
        LIZ.append(", isOutstanding=");
        LIZ.append(this.isOutstanding);
        LIZ.append(", pdpSizeGuideButtonText=");
        LIZ.append(this.pdpSizeGuideButtonText);
        LIZ.append(", skuSizeGuideButtonText=");
        LIZ.append(this.skuSizeGuideButtonText);
        LIZ.append(", skuSizeGuideTitle=");
        LIZ.append(this.skuSizeGuideTitle);
        LIZ.append(", skuSizeGuideButtonIcon=");
        LIZ.append(this.skuSizeGuideButtonIcon);
        LIZ.append(", skuSizeGuideLoc=");
        LIZ.append(this.skuSizeGuideLoc);
        LIZ.append(", skuSizeGuideSchema=");
        LIZ.append(this.skuSizeGuideSchema);
        LIZ.append(", showSalePropId=");
        return q.LIZIZ(LIZ, this.showSalePropId, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.sizeGuideImage, i);
        out.writeParcelable(this.originSizeGuideImage, i);
        Boolean bool = this.isOutstanding;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.pdpSizeGuideButtonText);
        out.writeString(this.skuSizeGuideButtonText);
        out.writeString(this.skuSizeGuideTitle);
        Icon icon = this.skuSizeGuideButtonIcon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        Integer num = this.skuSizeGuideLoc;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.skuSizeGuideSchema);
        out.writeString(this.showSalePropId);
    }

    public SizeGuide(Image image, Image image2, Boolean bool, String str, String str2, String str3, Icon icon, Integer num, String str4, String str5) {
        this.sizeGuideImage = image;
        this.originSizeGuideImage = image2;
        this.isOutstanding = bool;
        this.pdpSizeGuideButtonText = str;
        this.skuSizeGuideButtonText = str2;
        this.skuSizeGuideTitle = str3;
        this.skuSizeGuideButtonIcon = icon;
        this.skuSizeGuideLoc = num;
        this.skuSizeGuideSchema = str4;
        this.showSalePropId = str5;
    }

    public /* synthetic */ SizeGuide(Image image, Image image2, Boolean bool, String str, String str2, String str3, Icon icon, Integer num, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : image2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : icon, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str4, (i & 512) == 0 ? str5 : null);
    }
}
