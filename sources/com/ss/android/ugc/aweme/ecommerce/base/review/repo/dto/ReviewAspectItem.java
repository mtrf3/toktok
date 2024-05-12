package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C69703RXf;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReviewAspectItem implements Parcelable {
    public static final Parcelable.Creator<ReviewAspectItem> CREATOR = new C69703RXf();

    @InterfaceC65349Pkn("answer")
    public final ReviewAspectOption answer;

    @InterfaceC65349Pkn("aspect_name")
    public final String aspectName;

    @InterfaceC65349Pkn("aspect_name_text")
    public final String aspectNameText;

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewAspectItem() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewAspectItem)) {
            return false;
        }
        ReviewAspectItem reviewAspectItem = (ReviewAspectItem) obj;
        return o.LJ(this.aspectName, reviewAspectItem.aspectName) && o.LJ(this.aspectNameText, reviewAspectItem.aspectNameText) && o.LJ(this.answer, reviewAspectItem.answer);
    }

    public final int hashCode() {
        String str = this.aspectName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aspectNameText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewAspectOption reviewAspectOption = this.answer;
        return hashCode2 + (reviewAspectOption != null ? reviewAspectOption.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewAspectItem(aspectName=");
        LIZ.append(this.aspectName);
        LIZ.append(", aspectNameText=");
        LIZ.append(this.aspectNameText);
        LIZ.append(", answer=");
        LIZ.append(this.answer);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.aspectName);
        out.writeString(this.aspectNameText);
        ReviewAspectOption reviewAspectOption = this.answer;
        if (reviewAspectOption == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            reviewAspectOption.writeToParcel(out, i);
        }
    }

    public ReviewAspectItem(String str, String str2, ReviewAspectOption reviewAspectOption) {
        this.aspectName = str;
        this.aspectNameText = str2;
        this.answer = reviewAspectOption;
    }

    public /* synthetic */ ReviewAspectItem(String str, String str2, ReviewAspectOption reviewAspectOption, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : reviewAspectOption);
    }
}
