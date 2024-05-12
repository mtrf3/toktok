package com.ss.android.ugc.aweme.ecommerce.base.review;

import X.C48339Iy7;
import X.C70835Rr5;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class OptionV1 implements Parcelable {
    public static final Parcelable.Creator<OptionV1> CREATOR = new C70835Rr5();
    public final ReviewFilterStruct filter;
    public boolean isDefaultSelected;
    public final boolean isEnabled;
    public boolean isSelected;
    public final int optionType;
    public final String subText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionV1)) {
            return false;
        }
        OptionV1 optionV1 = (OptionV1) obj;
        return o.LJ(this.filter, optionV1.filter) && this.optionType == optionV1.optionType && o.LJ(this.subText, optionV1.subText) && this.isEnabled == optionV1.isEnabled && this.isSelected == optionV1.isSelected && this.isDefaultSelected == optionV1.isDefaultSelected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((this.filter.hashCode() * 31) + this.optionType) * 31;
        String str = this.subText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isEnabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.isSelected;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return ((i2 + i3) * 31) + (this.isDefaultSelected ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.filter.writeToParcel(out, i);
        out.writeInt(this.optionType);
        out.writeString(this.subText);
        out.writeInt(this.isEnabled ? 1 : 0);
        out.writeInt(this.isSelected ? 1 : 0);
        out.writeInt(this.isDefaultSelected ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OptionV1(filter=");
        LIZ.append(this.filter);
        LIZ.append(", optionType=");
        LIZ.append(this.optionType);
        LIZ.append(", subText=");
        LIZ.append(this.subText);
        LIZ.append(", isEnabled=");
        LIZ.append(this.isEnabled);
        LIZ.append(", isSelected=");
        LIZ.append(this.isSelected);
        LIZ.append(", isDefaultSelected=");
        return C48339Iy7.LIZJ(LIZ, this.isDefaultSelected, ')', LIZ);
    }

    public /* synthetic */ OptionV1(ReviewFilterStruct reviewFilterStruct, int i, String str, boolean z, int i2) {
        this(reviewFilterStruct, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? true : z, false, false);
    }

    public OptionV1(ReviewFilterStruct filter, int i, String str, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(filter, "filter");
        this.filter = filter;
        this.optionType = i;
        this.subText = str;
        this.isEnabled = z;
        this.isSelected = z2;
        this.isDefaultSelected = z3;
    }
}
