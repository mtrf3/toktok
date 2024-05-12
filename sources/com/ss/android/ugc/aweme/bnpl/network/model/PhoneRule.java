package com.ss.android.ugc.aweme.bnpl.network.model;

import X.C91822a0o;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PhoneRule implements Parcelable {
    public static final int $stable = 0;
    public static final C91822a0o CREATOR = new C91822a0o();

    @InterfaceC65349Pkn("error_code")
    public final String errorCode;

    @InterfaceC65349Pkn("error_msg")
    public final String errorMsg;

    @InterfaceC65349Pkn("priority")
    public final String priority;

    @InterfaceC65349Pkn("regex")
    public final String regex;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneRule)) {
            return false;
        }
        PhoneRule phoneRule = (PhoneRule) obj;
        return o.LJ(this.priority, phoneRule.priority) && o.LJ(this.regex, phoneRule.regex) && o.LJ(this.errorCode, phoneRule.errorCode) && o.LJ(this.errorMsg, phoneRule.errorMsg);
    }

    public final int hashCode() {
        String str = this.priority;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.regex;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMsg;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhoneRule(priority=");
        LIZ.append(this.priority);
        LIZ.append(", regex=");
        LIZ.append(this.regex);
        LIZ.append(", errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", errorMsg=");
        LIZ.append(this.errorMsg);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneRule(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        o.LJIIIZ(parcel, "parcel");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.priority);
        parcel.writeString(this.regex);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMsg);
    }

    public PhoneRule(String str, String str2, String str3, String str4) {
        this.priority = str;
        this.regex = str2;
        this.errorCode = str3;
        this.errorMsg = str4;
    }
}
