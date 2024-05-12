package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C1NE;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RWD;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HeaderBizData implements Parcelable {
    public static final Parcelable.Creator<HeaderBizData> CREATOR = new RWD();

    @InterfaceC65349Pkn("items")
    public final List<HeaderItem> items;

    @InterfaceC65349Pkn("product_banner_labels")
    public final List<ProductBannerLabel> productBannerLabel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderBizData)) {
            return false;
        }
        HeaderBizData headerBizData = (HeaderBizData) obj;
        return o.LJ(this.items, headerBizData.items) && o.LJ(this.productBannerLabel, headerBizData.productBannerLabel);
    }

    public final int hashCode() {
        List<HeaderItem> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ProductBannerLabel> list2 = this.productBannerLabel;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeaderBizData(items=");
        LIZ.append(this.items);
        LIZ.append(", productBannerLabel=");
        return C1NE.LIZIZ(LIZ, this.productBannerLabel, ')', LIZ);
    }

    public HeaderBizData(List<HeaderItem> list, List<ProductBannerLabel> list2) {
        this.items = list;
        this.productBannerLabel = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<HeaderItem> list = this.items;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((HeaderItem) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        List<ProductBannerLabel> list2 = this.productBannerLabel;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
        while (LIZIZ2.hasNext()) {
            ((ProductBannerLabel) LIZIZ2.next()).writeToParcel(out, i);
        }
    }
}
