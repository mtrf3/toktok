package com.kakao.sdk.auth.model;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CertTokenInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<CertTokenInfo> CREATOR = new Creator();
    public final OAuthToken token;
    public final String txId;

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<CertTokenInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CertTokenInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new CertTokenInfo(OAuthToken.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CertTokenInfo[] newArray(int i) {
            return new CertTokenInfo[i];
        }
    }

    public static /* synthetic */ CertTokenInfo copy$default(CertTokenInfo certTokenInfo, OAuthToken oAuthToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            oAuthToken = certTokenInfo.token;
        }
        if ((i & 2) != 0) {
            str = certTokenInfo.txId;
        }
        return certTokenInfo.copy(oAuthToken, str);
    }

    public final CertTokenInfo copy(OAuthToken token, String txId) {
        o.LJIIIZ(token, "token");
        o.LJIIIZ(txId, "txId");
        return new CertTokenInfo(token, txId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.token, this.txId};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.token.writeToParcel(out, i);
        out.writeString(this.txId);
    }

    public final OAuthToken getToken() {
        return this.token;
    }

    public final String getTxId() {
        return this.txId;
    }

    public CertTokenInfo(OAuthToken token, String txId) {
        o.LJIIIZ(token, "token");
        o.LJIIIZ(txId, "txId");
        this.token = token;
        this.txId = txId;
    }
}
