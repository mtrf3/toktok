package com.twitter.sdk.android.core;

import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class TwitterAuthConfig implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthConfig> CREATOR = new IDCreatorS54S0000000_11(69);
    public final String consumerKey;
    public final String consumerSecret;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TwitterAuthConfig(Parcel parcel) {
        this.consumerKey = parcel.readString();
        this.consumerSecret = parcel.readString();
    }

    public TwitterAuthConfig(String str, String str2) {
        if (str != null && str2 != null) {
            this.consumerKey = str.trim();
            this.consumerSecret = str2.trim();
            return;
        }
        throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.consumerKey);
        parcel.writeString(this.consumerSecret);
    }
}
