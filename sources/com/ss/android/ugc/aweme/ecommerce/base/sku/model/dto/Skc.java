package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C279017q;
import X.C69630RUk;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Skc implements Parcelable {
    public static final Parcelable.Creator<Skc> CREATOR = new C69630RUk();

    @InterfaceC65349Pkn("pdp_button_area_id")
    public final String bottomAreaId;

    @InterfaceC65349Pkn("color_block_image")
    public final Image colorBlockImage;

    @InterfaceC65349Pkn("out_of_stock_warning")
    public final String outOfStockWarning;

    @InterfaceC65349Pkn("price")
    public final ProductPrice price;

    @InterfaceC65349Pkn("skc_id")
    public final String skcId;

    @InterfaceC65349Pkn("skc_images")
    public final List<Image> skcImages;

    @InterfaceC65349Pkn("skc_name")
    public final String skcName;

    @InterfaceC65349Pkn("skc_stock")
    public final int skcStock;

    @InterfaceC65349Pkn("sku_ids")
    public final List<String> skuIds;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Skc)) {
            return false;
        }
        Skc skc = (Skc) obj;
        return o.LJ(this.skcId, skc.skcId) && o.LJ(this.skcName, skc.skcName) && o.LJ(this.colorBlockImage, skc.colorBlockImage) && o.LJ(this.skcImages, skc.skcImages) && o.LJ(this.skuIds, skc.skuIds) && this.skcStock == skc.skcStock && o.LJ(this.outOfStockWarning, skc.outOfStockWarning) && o.LJ(this.price, skc.price) && o.LJ(this.bottomAreaId, skc.bottomAreaId);
    }

    public final int hashCode() {
        String str = this.skcId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skcName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.colorBlockImage;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        List<Image> list = this.skcImages;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.skuIds;
        int hashCode5 = (((hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.skcStock) * 31;
        String str3 = this.outOfStockWarning;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ProductPrice productPrice = this.price;
        int hashCode7 = (hashCode6 + (productPrice == null ? 0 : productPrice.hashCode())) * 31;
        String str4 = this.bottomAreaId;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Skc(skcId=");
        LIZ.append(this.skcId);
        LIZ.append(", skcName=");
        LIZ.append(this.skcName);
        LIZ.append(", colorBlockImage=");
        LIZ.append(this.colorBlockImage);
        LIZ.append(", skcImages=");
        LIZ.append(this.skcImages);
        LIZ.append(", skuIds=");
        LIZ.append(this.skuIds);
        LIZ.append(", skcStock=");
        LIZ.append(this.skcStock);
        LIZ.append(", outOfStockWarning=");
        LIZ.append(this.outOfStockWarning);
        LIZ.append(", price=");
        LIZ.append(this.price);
        LIZ.append(", bottomAreaId=");
        return q.LIZIZ(LIZ, this.bottomAreaId, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.skcId);
        out.writeString(this.skcName);
        out.writeParcelable(this.colorBlockImage, i);
        List<Image> list = this.skcImages;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeParcelable((Parcelable) LIZIZ.next(), i);
            }
        }
        out.writeStringList(this.skuIds);
        out.writeInt(this.skcStock);
        out.writeString(this.outOfStockWarning);
        ProductPrice productPrice = this.price;
        if (productPrice == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productPrice.writeToParcel(out, i);
        }
        out.writeString(this.bottomAreaId);
    }

    public Skc(String str, String str2, Image image, List<Image> list, List<String> list2, int i, String str3, ProductPrice productPrice, String str4) {
        this.skcId = str;
        this.skcName = str2;
        this.colorBlockImage = image;
        this.skcImages = list;
        this.skuIds = list2;
        this.skcStock = i;
        this.outOfStockWarning = str3;
        this.price = productPrice;
        this.bottomAreaId = str4;
    }
}
