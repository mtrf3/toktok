package com.twitter.sdk.android.core.internal.oauth;

import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import com.twitter.sdk.android.core.TwitterAuthToken;

/* loaded from: classes12.dex */
public class OAuthResponse implements Parcelable {
    public static final Parcelable.Creator<OAuthResponse> CREATOR = new IDCreatorS54S0000000_11(72);
    public final TwitterAuthToken authToken;
    public final long userId;
    public final String userName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("authToken=");
        LIZ.append(this.authToken);
        LIZ.append(",userName=");
        LIZ.append(this.userName);
        LIZ.append(",userId=");
        LIZ.append(this.userId);
        return X1D.LIZIZ(LIZ);
    }

    public OAuthResponse(Parcel parcel) {
        this.authToken = (TwitterAuthToken) parcel.readParcelable(TwitterAuthToken.class.getClassLoader());
        this.userName = parcel.readString();
        this.userId = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.authToken, i);
        parcel.writeString(this.userName);
        parcel.writeLong(this.userId);
    }

    public OAuthResponse(TwitterAuthToken twitterAuthToken, long j, String str) {
        this.authToken = twitterAuthToken;
        this.userName = str;
        this.userId = j;
    }
}
