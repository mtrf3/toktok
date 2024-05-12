package com.ss.android.socialbase.downloader.model;

import X.C77800Ug8;
import X.Q89;
import X.X1D;
import Y.IDCreatorS52S0000000_8;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes9.dex */
public class HttpHeader implements Parcelable, Comparable {
    public static final Parcelable.Creator<HttpHeader> CREATOR = new IDCreatorS52S0000000_8(0);
    public final String name;
    public final String value;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HttpHeader{name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", value='");
        return C77800Ug8.LIZJ(LIZ, this.value, '\'', '}', LIZ);
    }

    public HttpHeader(Parcel parcel) {
        this.name = parcel.readString();
        this.value = parcel.readString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (!(obj instanceof HttpHeader)) {
            return 1;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (TextUtils.equals(this.name, httpHeader.name)) {
            return 0;
        }
        String str = this.name;
        if (str == null) {
            return -1;
        }
        int compareTo = str.compareTo(httpHeader.name);
        if (compareTo > 0) {
            return 1;
        }
        if (compareTo >= 0) {
            return 0;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (TextUtils.equals(this.name, httpHeader.name) && TextUtils.equals(this.value, httpHeader.value)) {
            return true;
        }
        return false;
    }

    public HttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
    }
}
