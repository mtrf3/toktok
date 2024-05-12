package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C64475PSd;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class StoreGoodReviewTag implements Parcelable {
    public static final Parcelable.Creator<StoreGoodReviewTag> CREATOR = new C64475PSd();

    @InterfaceC65349Pkn("fmt_review_count")
    public final String fmt_review_count;

    @InterfaceC65349Pkn("review_count")
    public final Integer review_count;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGoodReviewTag)) {
            return false;
        }
        StoreGoodReviewTag storeGoodReviewTag = (StoreGoodReviewTag) obj;
        return o.LJ(this.review_count, storeGoodReviewTag.review_count) && o.LJ(this.fmt_review_count, storeGoodReviewTag.fmt_review_count);
    }

    public final int hashCode() {
        Integer num = this.review_count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fmt_review_count;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.review_count;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.fmt_review_count);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreGoodReviewTag(review_count=");
        LIZ.append(this.review_count);
        LIZ.append(", fmt_review_count=");
        return q.LIZIZ(LIZ, this.fmt_review_count, ')', LIZ);
    }

    public StoreGoodReviewTag(Integer num, String str) {
        this.review_count = num;
        this.fmt_review_count = str;
    }
}
