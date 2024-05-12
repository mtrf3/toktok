package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RUZ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SellerPromotion implements Parcelable {
    public static final Parcelable.Creator<SellerPromotion> CREATOR = new RUZ();

    @InterfaceC65349Pkn("default_id_list")
    public final List<String> defaultSellerPromotionIds;

    @InterfaceC65349Pkn("seller_promotion_item_list")
    public final List<SellerPromotionItem> itemList;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerPromotion)) {
            return false;
        }
        SellerPromotion sellerPromotion = (SellerPromotion) obj;
        return o.LJ(this.title, sellerPromotion.title) && o.LJ(this.schema, sellerPromotion.schema) && o.LJ(this.itemList, sellerPromotion.itemList) && o.LJ(this.defaultSellerPromotionIds, sellerPromotion.defaultSellerPromotionIds);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SellerPromotionItem> list = this.itemList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.defaultSellerPromotionIds;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellerPromotion(title=");
        LIZ.append(this.title);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", itemList=");
        LIZ.append(this.itemList);
        LIZ.append(", defaultSellerPromotionIds=");
        return C1NE.LIZIZ(LIZ, this.defaultSellerPromotionIds, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.schema);
        List<SellerPromotionItem> list = this.itemList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((SellerPromotionItem) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeStringList(this.defaultSellerPromotionIds);
    }

    public SellerPromotion(String str, String str2, List<SellerPromotionItem> list, List<String> list2) {
        this.title = str;
        this.schema = str2;
        this.itemList = list;
        this.defaultSellerPromotionIds = list2;
    }
}
