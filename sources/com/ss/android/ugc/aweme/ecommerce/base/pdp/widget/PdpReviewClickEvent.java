package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget;

import X.C70783RqF;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpReviewClickEvent implements Parcelable {
    public static final Parcelable.Creator<PdpReviewClickEvent> CREATOR = new C70783RqF();

    @InterfaceC65349Pkn("clicked_filter_count")
    public final Integer clickedFilterCount;

    @InterfaceC65349Pkn("clicked_filter_id")
    public final String clickedFilterId;

    @InterfaceC65349Pkn("clicked_filter_name")
    public final String clickedFilterName;

    @InterfaceC65349Pkn("clicked_filter_type")
    public final String clickedFilterType;

    @InterfaceC65349Pkn("clicked_review_id")
    public final String clickedReviewId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpReviewClickEvent)) {
            return false;
        }
        PdpReviewClickEvent pdpReviewClickEvent = (PdpReviewClickEvent) obj;
        return o.LJ(this.clickedReviewId, pdpReviewClickEvent.clickedReviewId) && o.LJ(this.clickedFilterId, pdpReviewClickEvent.clickedFilterId) && o.LJ(this.clickedFilterName, pdpReviewClickEvent.clickedFilterName) && o.LJ(this.clickedFilterType, pdpReviewClickEvent.clickedFilterType) && o.LJ(this.clickedFilterCount, pdpReviewClickEvent.clickedFilterCount);
    }

    public final int hashCode() {
        String str = this.clickedReviewId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clickedFilterId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clickedFilterName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clickedFilterType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.clickedFilterCount;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeString(this.clickedReviewId);
        out.writeString(this.clickedFilterId);
        out.writeString(this.clickedFilterName);
        out.writeString(this.clickedFilterType);
        Integer num = this.clickedFilterCount;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpReviewClickEvent(clickedReviewId=");
        LIZ.append(this.clickedReviewId);
        LIZ.append(", clickedFilterId=");
        LIZ.append(this.clickedFilterId);
        LIZ.append(", clickedFilterName=");
        LIZ.append(this.clickedFilterName);
        LIZ.append(", clickedFilterType=");
        LIZ.append(this.clickedFilterType);
        LIZ.append(", clickedFilterCount=");
        return s0.LIZJ(LIZ, this.clickedFilterCount, ')', LIZ);
    }

    public PdpReviewClickEvent(String str, String str2, String str3, String str4, Integer num) {
        this.clickedReviewId = str;
        this.clickedFilterId = str2;
        this.clickedFilterName = str3;
        this.clickedFilterType = str4;
        this.clickedFilterCount = num;
    }
}
