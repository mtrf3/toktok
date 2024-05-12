package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C279017q;
import X.C69642RUw;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PlatformPromotion implements Parcelable {
    public static final Parcelable.Creator<PlatformPromotion> CREATOR = new C69642RUw();

    @InterfaceC65349Pkn("default_id")
    public final String defaultPlatformPromotionId;

    @InterfaceC65349Pkn("platform_image")
    public final Image image;

    @InterfaceC65349Pkn("platform_promotion_item_list")
    public final List<PlatformPromotionItem> itemList;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformPromotion)) {
            return false;
        }
        PlatformPromotion platformPromotion = (PlatformPromotion) obj;
        return o.LJ(this.image, platformPromotion.image) && o.LJ(this.schema, platformPromotion.schema) && o.LJ(this.itemList, platformPromotion.itemList) && o.LJ(this.defaultPlatformPromotionId, platformPromotion.defaultPlatformPromotionId);
    }

    public final int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.schema;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PlatformPromotionItem> list = this.itemList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.defaultPlatformPromotionId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlatformPromotion(image=");
        LIZ.append(this.image);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", itemList=");
        LIZ.append(this.itemList);
        LIZ.append(", defaultPlatformPromotionId=");
        return q.LIZIZ(LIZ, this.defaultPlatformPromotionId, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.image, i);
        out.writeString(this.schema);
        List<PlatformPromotionItem> list = this.itemList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((PlatformPromotionItem) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.defaultPlatformPromotionId);
    }

    public PlatformPromotion(Image image, String str, List<PlatformPromotionItem> list, String str2) {
        this.image = image;
        this.schema = str;
        this.itemList = list;
        this.defaultPlatformPromotionId = str2;
    }
}
