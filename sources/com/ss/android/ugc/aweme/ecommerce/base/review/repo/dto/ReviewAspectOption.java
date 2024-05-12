package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C69704RXg;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReviewAspectOption implements Parcelable {
    public static final Parcelable.Creator<ReviewAspectOption> CREATOR = new C69704RXg();

    @InterfaceC65349Pkn("option")
    public final String option;

    @InterfaceC65349Pkn("option_id")
    public final String optionId;

    @InterfaceC65349Pkn("option_text")
    public final String optionText;

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewAspectOption() {
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
        if (!(obj instanceof ReviewAspectOption)) {
            return false;
        }
        ReviewAspectOption reviewAspectOption = (ReviewAspectOption) obj;
        return o.LJ(this.option, reviewAspectOption.option) && o.LJ(this.optionId, reviewAspectOption.optionId) && o.LJ(this.optionText, reviewAspectOption.optionText);
    }

    public final int hashCode() {
        String str = this.option;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.optionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.optionText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.option);
        out.writeString(this.optionId);
        out.writeString(this.optionText);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewAspectOption(option=");
        LIZ.append(this.option);
        LIZ.append(", optionId=");
        LIZ.append(this.optionId);
        LIZ.append(", optionText=");
        return q.LIZIZ(LIZ, this.optionText, ')', LIZ);
    }

    public ReviewAspectOption(String str, String str2, String str3) {
        this.option = str;
        this.optionId = str2;
        this.optionText = str3;
    }

    public /* synthetic */ ReviewAspectOption(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
