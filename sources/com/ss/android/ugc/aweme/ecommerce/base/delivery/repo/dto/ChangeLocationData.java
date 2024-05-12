package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C1FJ;
import X.C26734AeQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ChangeLocationData implements Parcelable {
    public static final Parcelable.Creator<ChangeLocationData> CREATOR = new C26734AeQ();

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("zipcode_keyboard_type")
    public final Integer zipcodeKeyboardType;

    @InterfaceC65349Pkn("zipcode_max_length")
    public final Integer zipcodeMaxLength;

    @InterfaceC65349Pkn("zipcode_place_holder_hint")
    public final String zipcodePlaceHolderHint;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeLocationData)) {
            return false;
        }
        ChangeLocationData changeLocationData = (ChangeLocationData) obj;
        return o.LJ(this.description, changeLocationData.description) && o.LJ(this.zipcodePlaceHolderHint, changeLocationData.zipcodePlaceHolderHint) && o.LJ(this.zipcodeMaxLength, changeLocationData.zipcodeMaxLength) && o.LJ(this.zipcodeKeyboardType, changeLocationData.zipcodeKeyboardType);
    }

    public final int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.zipcodePlaceHolderHint;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.zipcodeMaxLength;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.zipcodeKeyboardType;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeLocationData(description=");
        LIZ.append(this.description);
        LIZ.append(", zipcodePlaceHolderHint=");
        LIZ.append(this.zipcodePlaceHolderHint);
        LIZ.append(", zipcodeMaxLength=");
        LIZ.append(this.zipcodeMaxLength);
        LIZ.append(", zipcodeKeyboardType=");
        return s0.LIZJ(LIZ, this.zipcodeKeyboardType, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.description);
        out.writeString(this.zipcodePlaceHolderHint);
        Integer num = this.zipcodeMaxLength;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.zipcodeKeyboardType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
    }

    public ChangeLocationData(String str, String str2, Integer num, Integer num2) {
        this.description = str;
        this.zipcodePlaceHolderHint = str2;
        this.zipcodeMaxLength = num;
        this.zipcodeKeyboardType = num2;
    }
}
