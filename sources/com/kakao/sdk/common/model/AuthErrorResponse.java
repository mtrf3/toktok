package com.kakao.sdk.common.model;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AuthErrorResponse implements Parcelable {
    public static final Parcelable.Creator<AuthErrorResponse> CREATOR = new Creator();
    public final String error;
    public final String errorDescription;

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<AuthErrorResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthErrorResponse createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new AuthErrorResponse(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthErrorResponse[] newArray(int i) {
            return new AuthErrorResponse[i];
        }
    }

    public static /* synthetic */ AuthErrorResponse copy$default(AuthErrorResponse authErrorResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authErrorResponse.error;
        }
        if ((i & 2) != 0) {
            str2 = authErrorResponse.errorDescription;
        }
        return authErrorResponse.copy(str, str2);
    }

    public final AuthErrorResponse copy(String error, String str) {
        o.LJIIIZ(error, "error");
        return new AuthErrorResponse(error, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthErrorResponse)) {
            return false;
        }
        AuthErrorResponse authErrorResponse = (AuthErrorResponse) obj;
        return o.LJ(this.error, authErrorResponse.error) && o.LJ(this.errorDescription, authErrorResponse.errorDescription);
    }

    public int hashCode() {
        int hashCode = this.error.hashCode() * 31;
        String str = this.errorDescription;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthErrorResponse(error=");
        LIZ.append(this.error);
        LIZ.append(", errorDescription=");
        LIZ.append((Object) this.errorDescription);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.error);
        out.writeString(this.errorDescription);
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public AuthErrorResponse(String error, String str) {
        o.LJIIIZ(error, "error");
        this.error = error;
        this.errorDescription = str;
    }
}
