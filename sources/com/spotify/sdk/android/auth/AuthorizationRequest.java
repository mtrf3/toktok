package com.spotify.sdk.android.auth;

import X.EnumC93552aSi;
import Y.IDCreatorS58S0000000_42;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes34.dex */
public class AuthorizationRequest implements Parcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new IDCreatorS58S0000000_42(1);
    public final String mCampaign;
    public final String mClientId;
    public final Map<String, String> mCustomParams;
    public final String mRedirectUri;
    public final String mResponseType;
    public final String[] mScopes;
    public final boolean mShowDialog;
    public final String mState;

    public AuthorizationRequest() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AuthorizationRequest(Parcel parcel) {
        this.mClientId = parcel.readString();
        this.mResponseType = parcel.readString();
        this.mRedirectUri = parcel.readString();
        this.mState = parcel.readString();
        this.mScopes = parcel.createStringArray();
        this.mShowDialog = parcel.readByte() == 1;
        this.mCustomParams = new HashMap();
        this.mCampaign = parcel.readString();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        for (String str : readBundle.keySet()) {
            this.mCustomParams.put(str, readBundle.getString(str));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mClientId);
        parcel.writeString(this.mResponseType);
        parcel.writeString(this.mRedirectUri);
        parcel.writeString(this.mState);
        parcel.writeStringArray(this.mScopes);
        parcel.writeByte(this.mShowDialog ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mCampaign);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : this.mCustomParams.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        parcel.writeBundle(bundle);
    }

    public AuthorizationRequest(String str, EnumC93552aSi enumC93552aSi, String str2, String[] strArr, Map map) {
        this.mClientId = str;
        this.mResponseType = enumC93552aSi.toString();
        this.mRedirectUri = str2;
        this.mState = null;
        this.mScopes = strArr;
        this.mShowDialog = false;
        this.mCustomParams = map;
        this.mCampaign = null;
    }
}
