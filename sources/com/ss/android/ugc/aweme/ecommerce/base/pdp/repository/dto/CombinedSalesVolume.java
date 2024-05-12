package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69671RVz;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CombinedSalesVolume implements Parcelable {
    public static final Parcelable.Creator<CombinedSalesVolume> CREATOR = new C69671RVz();

    @InterfaceC65349Pkn("sales_text")
    public final LogisticLinkRichText salesText;

    @InterfaceC65349Pkn("sales_specification_schema")
    public final String sales_specification_schema;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedSalesVolume)) {
            return false;
        }
        CombinedSalesVolume combinedSalesVolume = (CombinedSalesVolume) obj;
        return o.LJ(this.salesText, combinedSalesVolume.salesText) && o.LJ(this.sales_specification_schema, combinedSalesVolume.sales_specification_schema);
    }

    public final int hashCode() {
        LogisticLinkRichText logisticLinkRichText = this.salesText;
        int hashCode = (logisticLinkRichText == null ? 0 : logisticLinkRichText.hashCode()) * 31;
        String str = this.sales_specification_schema;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        LogisticLinkRichText logisticLinkRichText = this.salesText;
        if (logisticLinkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticLinkRichText.writeToParcel(out, i);
        }
        out.writeString(this.sales_specification_schema);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CombinedSalesVolume(salesText=");
        LIZ.append(this.salesText);
        LIZ.append(", sales_specification_schema=");
        return q.LIZIZ(LIZ, this.sales_specification_schema, ')', LIZ);
    }

    public CombinedSalesVolume(LogisticLinkRichText logisticLinkRichText, String str) {
        this.salesText = logisticLinkRichText;
        this.sales_specification_schema = str;
    }
}
