package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C64474PSc;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class StoreLabel implements Parcelable {
    public static final Parcelable.Creator<StoreLabel> CREATOR = new C64474PSc();

    @InterfaceC65349Pkn("bought_tag")
    public final StoreFreqBoughtTag bought_Tag;

    @InterfaceC65349Pkn("official_label")
    public final StoreOfficialLabel officialLabel;

    @InterfaceC65349Pkn("review_tag")
    public final StoreGoodReviewTag review_tag;

    @InterfaceC65349Pkn("visitor_tag")
    public final StoreRegVisitorTag visitor_tag;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreLabel)) {
            return false;
        }
        StoreLabel storeLabel = (StoreLabel) obj;
        return o.LJ(this.officialLabel, storeLabel.officialLabel) && o.LJ(this.visitor_tag, storeLabel.visitor_tag) && o.LJ(this.review_tag, storeLabel.review_tag) && o.LJ(this.bought_Tag, storeLabel.bought_Tag);
    }

    public final int hashCode() {
        StoreOfficialLabel storeOfficialLabel = this.officialLabel;
        int hashCode = (storeOfficialLabel == null ? 0 : storeOfficialLabel.hashCode()) * 31;
        StoreRegVisitorTag storeRegVisitorTag = this.visitor_tag;
        int hashCode2 = (hashCode + (storeRegVisitorTag == null ? 0 : storeRegVisitorTag.hashCode())) * 31;
        StoreGoodReviewTag storeGoodReviewTag = this.review_tag;
        int hashCode3 = (hashCode2 + (storeGoodReviewTag == null ? 0 : storeGoodReviewTag.hashCode())) * 31;
        StoreFreqBoughtTag storeFreqBoughtTag = this.bought_Tag;
        return hashCode3 + (storeFreqBoughtTag != null ? storeFreqBoughtTag.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreLabel(officialLabel=");
        LIZ.append(this.officialLabel);
        LIZ.append(", visitor_tag=");
        LIZ.append(this.visitor_tag);
        LIZ.append(", review_tag=");
        LIZ.append(this.review_tag);
        LIZ.append(", bought_Tag=");
        LIZ.append(this.bought_Tag);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        StoreOfficialLabel storeOfficialLabel = this.officialLabel;
        if (storeOfficialLabel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            storeOfficialLabel.writeToParcel(out, i);
        }
        StoreRegVisitorTag storeRegVisitorTag = this.visitor_tag;
        if (storeRegVisitorTag == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            storeRegVisitorTag.writeToParcel(out, i);
        }
        StoreGoodReviewTag storeGoodReviewTag = this.review_tag;
        if (storeGoodReviewTag == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            storeGoodReviewTag.writeToParcel(out, i);
        }
        StoreFreqBoughtTag storeFreqBoughtTag = this.bought_Tag;
        if (storeFreqBoughtTag == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            storeFreqBoughtTag.writeToParcel(out, i);
        }
    }

    public StoreLabel(StoreOfficialLabel storeOfficialLabel, StoreRegVisitorTag storeRegVisitorTag, StoreGoodReviewTag storeGoodReviewTag, StoreFreqBoughtTag storeFreqBoughtTag) {
        this.officialLabel = storeOfficialLabel;
        this.visitor_tag = storeRegVisitorTag;
        this.review_tag = storeGoodReviewTag;
        this.bought_Tag = storeFreqBoughtTag;
    }
}
