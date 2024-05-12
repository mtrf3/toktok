package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C1FJ;
import X.C27637Asz;
import X.C27638At0;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReviewFilterStruct implements Parcelable {

    @InterfaceC65349Pkn("count")
    public final Integer count;

    @InterfaceC65349Pkn("count_str")
    public final String countStr;

    @InterfaceC65349Pkn("filter_id")
    public final String filterId;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("name_en")
    public final String nameEng;

    @InterfaceC65349Pkn("name_mapping")
    public final String nameMapping;

    @InterfaceC65349Pkn("type")
    public final Integer type;
    public static final C27638At0 Companion = new C27638At0();
    public static final Parcelable.Creator<ReviewFilterStruct> CREATOR = new C27637Asz();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFilterStruct)) {
            return false;
        }
        ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) obj;
        return o.LJ(this.filterId, reviewFilterStruct.filterId) && o.LJ(this.name, reviewFilterStruct.name) && o.LJ(this.countStr, reviewFilterStruct.countStr) && o.LJ(this.type, reviewFilterStruct.type) && o.LJ(this.nameEng, reviewFilterStruct.nameEng) && o.LJ(this.count, reviewFilterStruct.count) && o.LJ(this.nameMapping, reviewFilterStruct.nameMapping);
    }

    public final int hashCode() {
        String str = this.filterId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countStr;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.nameEng;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.count;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.nameMapping;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewFilterStruct(filterId=");
        LIZ.append(this.filterId);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", countStr=");
        LIZ.append(this.countStr);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", nameEng=");
        LIZ.append(this.nameEng);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", nameMapping=");
        return q.LIZIZ(LIZ, this.nameMapping, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.filterId);
        out.writeString(this.name);
        out.writeString(this.countStr);
        Integer num = this.type;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.nameEng);
        Integer num2 = this.count;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.nameMapping);
    }

    public ReviewFilterStruct(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5) {
        this.filterId = str;
        this.name = str2;
        this.countStr = str3;
        this.type = num;
        this.nameEng = str4;
        this.count = num2;
        this.nameMapping = str5;
    }

    public /* synthetic */ ReviewFilterStruct(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, str4, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? str5 : null);
    }
}
