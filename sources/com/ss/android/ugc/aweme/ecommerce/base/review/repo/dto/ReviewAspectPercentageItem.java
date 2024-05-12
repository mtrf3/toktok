package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C1FJ;
import X.C27636Asy;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReviewAspectPercentageItem implements Parcelable {
    public static final Parcelable.Creator<ReviewAspectPercentageItem> CREATOR = new C27636Asy();

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("count_str")
    public final String countStr;

    @InterfaceC65349Pkn("option")
    public final String option;

    @InterfaceC65349Pkn("option_name")
    public final String optionName;

    @InterfaceC65349Pkn("aspect_type")
    public final Integer optionType;

    @InterfaceC65349Pkn("percentage")
    public final String percentage;

    @InterfaceC65349Pkn("review_filter")
    public final ReviewFilterStruct review_filter;

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewAspectPercentageItem() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewAspectPercentageItem)) {
            return false;
        }
        ReviewAspectPercentageItem reviewAspectPercentageItem = (ReviewAspectPercentageItem) obj;
        return o.LJ(this.option, reviewAspectPercentageItem.option) && o.LJ(this.percentage, reviewAspectPercentageItem.percentage) && o.LJ(this.review_filter, reviewAspectPercentageItem.review_filter) && o.LJ(this.optionType, reviewAspectPercentageItem.optionType) && o.LJ(this.countStr, reviewAspectPercentageItem.countStr) && this.count == reviewAspectPercentageItem.count && o.LJ(this.optionName, reviewAspectPercentageItem.optionName);
    }

    public final int hashCode() {
        String str = this.option;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.percentage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewFilterStruct reviewFilterStruct = this.review_filter;
        int hashCode3 = (hashCode2 + (reviewFilterStruct == null ? 0 : reviewFilterStruct.hashCode())) * 31;
        Integer num = this.optionType;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.countStr;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.count) * 31;
        String str4 = this.optionName;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewAspectPercentageItem(option=");
        LIZ.append(this.option);
        LIZ.append(", percentage=");
        LIZ.append(this.percentage);
        LIZ.append(", review_filter=");
        LIZ.append(this.review_filter);
        LIZ.append(", optionType=");
        LIZ.append(this.optionType);
        LIZ.append(", countStr=");
        LIZ.append(this.countStr);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", optionName=");
        return q.LIZIZ(LIZ, this.optionName, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.option);
        out.writeString(this.percentage);
        ReviewFilterStruct reviewFilterStruct = this.review_filter;
        if (reviewFilterStruct == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            reviewFilterStruct.writeToParcel(out, i);
        }
        Integer num = this.optionType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.countStr);
        out.writeInt(this.count);
        out.writeString(this.optionName);
    }

    public ReviewAspectPercentageItem(String str, String str2, ReviewFilterStruct reviewFilterStruct, Integer num, String str3, int i, String str4) {
        this.option = str;
        this.percentage = str2;
        this.review_filter = reviewFilterStruct;
        this.optionType = num;
        this.countStr = str3;
        this.count = i;
        this.optionName = str4;
    }

    public /* synthetic */ ReviewAspectPercentageItem(String str, String str2, ReviewFilterStruct reviewFilterStruct, Integer num, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : reviewFilterStruct, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? CardStruct.IStatusCode.DEFAULT : str3, (i2 & 32) != 0 ? 0 : i, (i2 & 64) == 0 ? str4 : null);
    }
}
