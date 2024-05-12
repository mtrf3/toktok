package com.spotify.sdk.android.auth;

import X.EnumC93552aSi;
import Y.IDCreatorS58S0000000_42;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes34.dex */
public class AuthorizationResponse implements Parcelable {
    public static final Parcelable.Creator<AuthorizationResponse> CREATOR = new IDCreatorS58S0000000_42(2);
    public final String mAccessToken;
    public final String mCode;
    public final String mError;
    public final int mExpiresIn;
    public final String mState;
    public final EnumC93552aSi mType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AuthorizationResponse(Parcel parcel) {
        this.mExpiresIn = parcel.readInt();
        this.mError = parcel.readString();
        this.mState = parcel.readString();
        this.mAccessToken = parcel.readString();
        this.mCode = parcel.readString();
        this.mType = EnumC93552aSi.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mExpiresIn);
        parcel.writeString(this.mError);
        parcel.writeString(this.mState);
        parcel.writeString(this.mAccessToken);
        parcel.writeString(this.mCode);
        parcel.writeInt(this.mType.ordinal());
    }

    public AuthorizationResponse(EnumC93552aSi enumC93552aSi, String str, String str2, String str3, String str4, int i) {
        this.mType = enumC93552aSi == null ? EnumC93552aSi.UNKNOWN : enumC93552aSi;
        this.mCode = str;
        this.mAccessToken = str2;
        this.mState = str3;
        this.mError = str4;
        this.mExpiresIn = i;
    }
}
