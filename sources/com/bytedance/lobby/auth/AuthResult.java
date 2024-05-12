package com.bytedance.lobby.auth;

import X.C66504Q8e;
import X.Q8M;
import Y.IDCreatorS54S0000000_11;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public final class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new IDCreatorS54S0000000_11(10);
    public int mActionType;
    public Bundle mBundle;
    public C66504Q8e mErrorCause;
    public long mExpiryDateInMillis;
    public transient boolean mIsCancelled;
    public boolean mIsSuccessful;
    public String mNonce;
    public String mProviderId;
    public String mToken;
    public String mTokenForBusiness;
    public String mTokenSecret;
    public String mUid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return super.toString();
    }

    public AuthResult(Q8M q8m) {
        this.mProviderId = "";
        this.mUid = "";
        this.mToken = "";
        this.mTokenSecret = "";
        this.mTokenForBusiness = "";
        boolean z = q8m.LIZ;
        this.mIsSuccessful = z;
        boolean z2 = true;
        if (!z) {
            C66504Q8e c66504Q8e = q8m.LIZIZ;
            if (c66504Q8e == null) {
                this.mErrorCause = new C66504Q8e(1, "Auth is unsuccessful with no Error Cause");
            } else {
                this.mErrorCause = c66504Q8e;
            }
        }
        C66504Q8e c66504Q8e2 = this.mErrorCause;
        if (c66504Q8e2 == null || (!c66504Q8e2.isCancelled() && this.mErrorCause.getErrorCode() != 4)) {
            z2 = false;
        }
        this.mIsCancelled = z2;
        this.mProviderId = q8m.LIZJ;
        this.mUid = q8m.LIZLLL;
        this.mToken = q8m.LJ;
        this.mTokenSecret = q8m.LJFF;
        this.mTokenForBusiness = q8m.LJI;
        this.mExpiryDateInMillis = q8m.LJII;
        this.mActionType = q8m.LJIIIIZZ;
        this.mNonce = q8m.LJIIIZ;
        Bundle bundle = q8m.LJIIJ;
        this.mBundle = bundle == null ? new Bundle() : bundle;
    }

    public AuthResult(Parcel parcel) {
        this.mProviderId = "";
        this.mUid = "";
        this.mToken = "";
        this.mTokenSecret = "";
        this.mTokenForBusiness = "";
        boolean z = parcel.readInt() == 1;
        C66504Q8e c66504Q8e = (C66504Q8e) parcel.readSerializable();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        Bundle readBundle = parcel.readBundle(AuthResult.class.getClassLoader());
        Q8M q8m = new Q8M(readString, readInt);
        q8m.LIZ = z;
        q8m.LIZIZ = c66504Q8e;
        q8m.LIZLLL = readString2;
        q8m.LJ = readString3;
        q8m.LJFF = readString4;
        q8m.LJII = readLong;
        q8m.LJIIJ = readBundle;
        q8m.LIZ();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mIsSuccessful ? 1 : 0);
        parcel.writeSerializable(this.mErrorCause);
        parcel.writeString(this.mProviderId);
        parcel.writeString(this.mTokenSecret);
        parcel.writeString(this.mUid);
        parcel.writeString(this.mToken);
        parcel.writeLong(this.mExpiryDateInMillis);
        parcel.writeInt(this.mActionType);
        parcel.writeBundle(this.mBundle);
    }
}
