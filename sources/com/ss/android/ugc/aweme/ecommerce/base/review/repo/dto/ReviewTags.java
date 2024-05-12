package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C26793AfN;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReviewTags implements Parcelable {
    public static final Parcelable.Creator<ReviewTags> CREATOR = new C26793AfN();

    @InterfaceC65349Pkn("tag_text")
    public final String text;

    @InterfaceC65349Pkn("tag_type")
    public final Integer type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewTags)) {
            return false;
        }
        ReviewTags reviewTags = (ReviewTags) obj;
        return o.LJ(this.text, reviewTags.text) && o.LJ(this.type, reviewTags.type);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeString(this.text);
        Integer num = this.type;
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
        LIZ.append("ReviewTags(text=");
        LIZ.append(this.text);
        LIZ.append(", type=");
        return s0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public ReviewTags(String str, Integer num) {
        this.text = str;
        this.type = num;
    }
}
