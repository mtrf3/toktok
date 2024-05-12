package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C1NE;
import X.C279017q;
import X.C69636RUq;
import X.C69637RUr;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PromotionDiscount implements Parcelable {
    public static final int DEFAULT = 0;

    @InterfaceC65349Pkn("default_voucher_type_ids")
    public final List<String> defaultVoucherTypeIds;

    @InterfaceC65349Pkn("discount_price")
    public final String discountPrice;

    @InterfaceC65349Pkn("discounts")
    public List<Voucher> discounts;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final Integer scene;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("pdp_coupon_module_claim_style")
    public final Integer style;

    @InterfaceC65349Pkn("title")
    public final String title;
    public static final C69637RUr DiscountScene = new C69637RUr();
    public static final Parcelable.Creator<PromotionDiscount> CREATOR = new C69636RUq();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionDiscount)) {
            return false;
        }
        PromotionDiscount promotionDiscount = (PromotionDiscount) obj;
        return o.LJ(this.title, promotionDiscount.title) && o.LJ(this.schema, promotionDiscount.schema) && o.LJ(this.discountPrice, promotionDiscount.discountPrice) && o.LJ(this.discounts, promotionDiscount.discounts) && o.LJ(this.scene, promotionDiscount.scene) && o.LJ(this.style, promotionDiscount.style) && o.LJ(this.defaultVoucherTypeIds, promotionDiscount.defaultVoucherTypeIds);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountPrice;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Voucher> list = this.discounts;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.scene;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.style;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list2 = this.defaultVoucherTypeIds;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotionDiscount(title=");
        LIZ.append(this.title);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", discountPrice=");
        LIZ.append(this.discountPrice);
        LIZ.append(", discounts=");
        LIZ.append(this.discounts);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", defaultVoucherTypeIds=");
        return C1NE.LIZIZ(LIZ, this.defaultVoucherTypeIds, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.schema);
        out.writeString(this.discountPrice);
        List<Voucher> list = this.discounts;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((Voucher) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Integer num = this.scene;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.style;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeStringList(this.defaultVoucherTypeIds);
    }

    public PromotionDiscount(String str, String str2, String str3, List<Voucher> list, Integer num, Integer num2, List<String> list2) {
        this.title = str;
        this.schema = str2;
        this.discountPrice = str3;
        this.discounts = list;
        this.scene = num;
        this.style = num2;
        this.defaultVoucherTypeIds = list2;
    }
}
