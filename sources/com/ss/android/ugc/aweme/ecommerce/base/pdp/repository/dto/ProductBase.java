package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.C69666RVu;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductBase implements Parcelable {
    public static final Parcelable.Creator<ProductBase> CREATOR = new C69666RVu();

    @InterfaceC65349Pkn("category_name")
    public final String categoryName;

    @InterfaceC65349Pkn("combined_sales_volume")
    public final CombinedSalesVolume combinedSalesVolume;

    @InterfaceC65349Pkn("desc_detail")
    public final String details;

    @InterfaceC65349Pkn("dynamic_selling_points_base")
    public final DynamicSellingPointsBase dynamicSellingPointsBase;

    @InterfaceC65349Pkn("global_shipping_tag")
    public final LinkRichText globalShippingTag;

    @InterfaceC65349Pkn("has_size_chart")
    public final Boolean hasSizeChart;

    @InterfaceC65349Pkn("images")
    public List<Image> images;

    @InterfaceC65349Pkn("is_gift")
    public final Boolean isGift;

    @InterfaceC65349Pkn("min_price")
    public final ProductPrice minPrice;

    @InterfaceC65349Pkn("pre_order_type")
    public final Integer preOrderType;

    @InterfaceC65349Pkn("price")
    public final ProductPrice priceInfo;

    @InterfaceC65349Pkn("purchase_notice")
    public final PurchaseNotice purchaseNotice;

    @InterfaceC65349Pkn("sold_count")
    public final String sales;

    @InterfaceC65349Pkn("show_free_shipping_tag")
    public final Boolean showFreeShippingTag;

    @InterfaceC65349Pkn("size_guide")
    public final SizeGuide sizeGuide;

    @InterfaceC65349Pkn("specifications")
    public final List<Specification> specs;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("desc_video")
    public final Video video;

    @InterfaceC65349Pkn("voucher_reminder")
    public final DeductibleVoucherReminder voucherReminder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBase)) {
            return false;
        }
        ProductBase productBase = (ProductBase) obj;
        return o.LJ(this.title, productBase.title) && o.LJ(this.details, productBase.details) && o.LJ(this.hasSizeChart, productBase.hasSizeChart) && o.LJ(this.video, productBase.video) && o.LJ(this.images, productBase.images) && o.LJ(this.specs, productBase.specs) && o.LJ(this.sales, productBase.sales) && o.LJ(this.combinedSalesVolume, productBase.combinedSalesVolume) && o.LJ(this.priceInfo, productBase.priceInfo) && o.LJ(this.purchaseNotice, productBase.purchaseNotice) && o.LJ(this.categoryName, productBase.categoryName) && o.LJ(this.sizeGuide, productBase.sizeGuide) && o.LJ(this.voucherReminder, productBase.voucherReminder) && o.LJ(this.preOrderType, productBase.preOrderType) && o.LJ(this.isGift, productBase.isGift) && o.LJ(this.dynamicSellingPointsBase, productBase.dynamicSellingPointsBase) && o.LJ(this.showFreeShippingTag, productBase.showFreeShippingTag) && o.LJ(this.minPrice, productBase.minPrice) && o.LJ(this.globalShippingTag, productBase.globalShippingTag);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.details;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasSizeChart;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Video video = this.video;
        int hashCode4 = (hashCode3 + (video == null ? 0 : video.hashCode())) * 31;
        List<Image> list = this.images;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<Specification> list2 = this.specs;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.sales;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CombinedSalesVolume combinedSalesVolume = this.combinedSalesVolume;
        int hashCode8 = (hashCode7 + (combinedSalesVolume == null ? 0 : combinedSalesVolume.hashCode())) * 31;
        ProductPrice productPrice = this.priceInfo;
        int hashCode9 = (hashCode8 + (productPrice == null ? 0 : productPrice.hashCode())) * 31;
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        int hashCode10 = (hashCode9 + (purchaseNotice == null ? 0 : purchaseNotice.hashCode())) * 31;
        String str4 = this.categoryName;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SizeGuide sizeGuide = this.sizeGuide;
        int hashCode12 = (hashCode11 + (sizeGuide == null ? 0 : sizeGuide.hashCode())) * 31;
        DeductibleVoucherReminder deductibleVoucherReminder = this.voucherReminder;
        int hashCode13 = (hashCode12 + (deductibleVoucherReminder == null ? 0 : deductibleVoucherReminder.hashCode())) * 31;
        Integer num = this.preOrderType;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.isGift;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DynamicSellingPointsBase dynamicSellingPointsBase = this.dynamicSellingPointsBase;
        int hashCode16 = (hashCode15 + (dynamicSellingPointsBase == null ? 0 : dynamicSellingPointsBase.hashCode())) * 31;
        Boolean bool3 = this.showFreeShippingTag;
        int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ProductPrice productPrice2 = this.minPrice;
        int hashCode18 = (hashCode17 + (productPrice2 == null ? 0 : productPrice2.hashCode())) * 31;
        LinkRichText linkRichText = this.globalShippingTag;
        return hashCode18 + (linkRichText != null ? linkRichText.hashCode() : 0);
    }

    public final String toString() {
        return "ProductBase(title=" + this.title + ", details=" + this.details + ", hasSizeChart=" + this.hasSizeChart + ", video=" + this.video + ", images=" + this.images + ", specs=" + this.specs + ", sales=" + this.sales + ", combinedSalesVolume=" + this.combinedSalesVolume + ", priceInfo=" + this.priceInfo + ", purchaseNotice=" + this.purchaseNotice + ", categoryName=" + this.categoryName + ", sizeGuide=" + this.sizeGuide + ", voucherReminder=" + this.voucherReminder + ", preOrderType=" + this.preOrderType + ", isGift=" + this.isGift + ", dynamicSellingPointsBase=" + this.dynamicSellingPointsBase + ", showFreeShippingTag=" + this.showFreeShippingTag + ", minPrice=" + this.minPrice + ", globalShippingTag=" + this.globalShippingTag + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.details);
        Boolean bool = this.hasSizeChart;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Video video = this.video;
        if (video == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            video.writeToParcel(out, i);
        }
        List<Image> list = this.images;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeParcelable((Parcelable) LIZIZ.next(), i);
            }
        }
        List<Specification> list2 = this.specs;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((Specification) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.sales);
        CombinedSalesVolume combinedSalesVolume = this.combinedSalesVolume;
        if (combinedSalesVolume == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            combinedSalesVolume.writeToParcel(out, i);
        }
        ProductPrice productPrice = this.priceInfo;
        if (productPrice == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productPrice.writeToParcel(out, i);
        }
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        if (purchaseNotice == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            purchaseNotice.writeToParcel(out, i);
        }
        out.writeString(this.categoryName);
        SizeGuide sizeGuide = this.sizeGuide;
        if (sizeGuide == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sizeGuide.writeToParcel(out, i);
        }
        DeductibleVoucherReminder deductibleVoucherReminder = this.voucherReminder;
        if (deductibleVoucherReminder == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            deductibleVoucherReminder.writeToParcel(out, i);
        }
        Integer num = this.preOrderType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool2 = this.isGift;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        DynamicSellingPointsBase dynamicSellingPointsBase = this.dynamicSellingPointsBase;
        if (dynamicSellingPointsBase == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dynamicSellingPointsBase.writeToParcel(out, i);
        }
        Boolean bool3 = this.showFreeShippingTag;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        ProductPrice productPrice2 = this.minPrice;
        if (productPrice2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productPrice2.writeToParcel(out, i);
        }
        LinkRichText linkRichText = this.globalShippingTag;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
    }

    public ProductBase(String str, String str2, Boolean bool, Video video, List<Image> list, List<Specification> list2, String str3, CombinedSalesVolume combinedSalesVolume, ProductPrice productPrice, PurchaseNotice purchaseNotice, String str4, SizeGuide sizeGuide, DeductibleVoucherReminder deductibleVoucherReminder, Integer num, Boolean bool2, DynamicSellingPointsBase dynamicSellingPointsBase, Boolean bool3, ProductPrice productPrice2, LinkRichText linkRichText) {
        this.title = str;
        this.details = str2;
        this.hasSizeChart = bool;
        this.video = video;
        this.images = list;
        this.specs = list2;
        this.sales = str3;
        this.combinedSalesVolume = combinedSalesVolume;
        this.priceInfo = productPrice;
        this.purchaseNotice = purchaseNotice;
        this.categoryName = str4;
        this.sizeGuide = sizeGuide;
        this.voucherReminder = deductibleVoucherReminder;
        this.preOrderType = num;
        this.isGift = bool2;
        this.dynamicSellingPointsBase = dynamicSellingPointsBase;
        this.showFreeShippingTag = bool3;
        this.minPrice = productPrice2;
        this.globalShippingTag = linkRichText;
    }

    public /* synthetic */ ProductBase(String str, String str2, Boolean bool, Video video, List list, List list2, String str3, CombinedSalesVolume combinedSalesVolume, ProductPrice productPrice, PurchaseNotice purchaseNotice, String str4, SizeGuide sizeGuide, DeductibleVoucherReminder deductibleVoucherReminder, Integer num, Boolean bool2, DynamicSellingPointsBase dynamicSellingPointsBase, Boolean bool3, ProductPrice productPrice2, LinkRichText linkRichText, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, video, list, list2, str3, combinedSalesVolume, productPrice, purchaseNotice, str4, (i & 2048) != 0 ? null : sizeGuide, (i & 4096) != 0 ? null : deductibleVoucherReminder, (i & FileUtils.BUFFER_SIZE) != 0 ? null : num, (i & 16384) != 0 ? null : bool2, (32768 & i) != 0 ? null : dynamicSellingPointsBase, (i & 65536) == 0 ? bool3 : null, productPrice2, linkRichText);
    }
}
