package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C1NE;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RUY;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpPromotion implements Parcelable {
    public static final Parcelable.Creator<PdpPromotion> CREATOR = new RUY();

    @InterfaceC65349Pkn("promotion_items")
    public final List<PromotionItem> promotionItems;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpPromotion() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PdpPromotion) && o.LJ(this.promotionItems, ((PdpPromotion) obj).promotionItems);
    }

    public final int hashCode() {
        List<PromotionItem> list = this.promotionItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpPromotion(promotionItems=");
        return C1NE.LIZIZ(LIZ, this.promotionItems, ')', LIZ);
    }

    public PdpPromotion(List<PromotionItem> list) {
        this.promotionItems = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<PromotionItem> list = this.promotionItems;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            out.writeParcelable((Parcelable) LIZIZ.next(), i);
        }
    }

    public /* synthetic */ PdpPromotion(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
