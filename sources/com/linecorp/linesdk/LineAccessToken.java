package com.linecorp.linesdk;

import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class LineAccessToken implements Parcelable {
    public static final Parcelable.Creator<LineAccessToken> CREATOR = new IDCreatorS54S0000000_11(47);
    public final String accessToken;
    public final long expiresInMillis;
    public final long issuedClientTimeMillis;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        long j = this.expiresInMillis;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.issuedClientTimeMillis;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "LineAccessToken{accessToken='#####', expiresInMillis=" + this.expiresInMillis + ", issuedClientTimeMillis=" + this.issuedClientTimeMillis + '}';
    }

    public LineAccessToken(Parcel parcel) {
        this.accessToken = parcel.readString();
        this.expiresInMillis = parcel.readLong();
        this.issuedClientTimeMillis = parcel.readLong();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAccessToken lineAccessToken = (LineAccessToken) obj;
        if (this.expiresInMillis != lineAccessToken.expiresInMillis || this.issuedClientTimeMillis != lineAccessToken.issuedClientTimeMillis) {
            return false;
        }
        return this.accessToken.equals(lineAccessToken.accessToken);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accessToken);
        parcel.writeLong(this.expiresInMillis);
        parcel.writeLong(this.issuedClientTimeMillis);
    }

    public LineAccessToken(String str, long j, long j2) {
        this.accessToken = str;
        this.expiresInMillis = j;
        this.issuedClientTimeMillis = j2;
    }
}
