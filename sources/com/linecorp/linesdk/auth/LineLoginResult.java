package com.linecorp.linesdk.auth;

import X.EnumC65312PkC;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;

/* loaded from: classes12.dex */
public class LineLoginResult implements Parcelable {
    public static final LineLoginResult CANCEL = new LineLoginResult(EnumC65312PkC.CANCEL, null, null, LineApiError.DEFAULT);
    public static final Parcelable.Creator<LineLoginResult> CREATOR = new IDCreatorS54S0000000_11(52);
    public final LineApiError errorData;
    public final LineCredential lineCredential;
    public final LineProfile lineProfile;
    public final EnumC65312PkC responseCode;

    public LineLoginResult() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.responseCode.hashCode() * 31;
        LineProfile lineProfile = this.lineProfile;
        int i2 = 0;
        if (lineProfile != null) {
            i = lineProfile.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        LineCredential lineCredential = this.lineCredential;
        if (lineCredential != null) {
            i2 = lineCredential.hashCode();
        }
        return this.errorData.hashCode() + ((i3 + i2) * 31);
    }

    public final String toString() {
        return "LineLoginResult{errorData=" + this.errorData + ", responseCode=" + this.responseCode + ", lineProfile=" + this.lineProfile + ", lineCredential=" + this.lineCredential + '}';
    }

    public LineLoginResult(Parcel parcel) {
        this.responseCode = (EnumC65312PkC) parcel.readSerializable();
        this.lineProfile = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.lineCredential = (LineCredential) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        this.errorData = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        if (this.responseCode != lineLoginResult.responseCode) {
            return false;
        }
        LineProfile lineProfile = this.lineProfile;
        if (lineProfile == null ? lineLoginResult.lineProfile != null : !lineProfile.equals(lineLoginResult.lineProfile)) {
            return false;
        }
        LineCredential lineCredential = this.lineCredential;
        if (lineCredential == null ? lineLoginResult.lineCredential != null : !lineCredential.equals(lineLoginResult.lineCredential)) {
            return false;
        }
        return this.errorData.equals(lineLoginResult.errorData);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.responseCode);
        parcel.writeParcelable(this.lineProfile, i);
        parcel.writeParcelable(this.lineCredential, i);
        parcel.writeParcelable(this.errorData, i);
    }

    public LineLoginResult(EnumC65312PkC enumC65312PkC, LineProfile lineProfile, LineCredential lineCredential, LineApiError lineApiError) {
        this.responseCode = enumC65312PkC;
        this.lineProfile = lineProfile;
        this.lineCredential = lineCredential;
        this.errorData = lineApiError;
    }
}
