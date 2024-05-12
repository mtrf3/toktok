package com.kakao.sdk.auth.model;

import X.C05040Hs;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AccessTokenResponse implements Parcelable {
    public static final Parcelable.Creator<AccessTokenResponse> CREATOR = new Creator();
    public final String accessToken;

    @InterfaceC65349Pkn("expires_in")
    public final long accessTokenExpiresIn;
    public final String idToken;
    public final String refreshToken;
    public final Long refreshTokenExpiresIn;
    public final String scope;
    public final String scopes;
    public final String tokenType;
    public final String txId;

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<AccessTokenResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenResponse createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new AccessTokenResponse(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenResponse[] newArray(int i) {
            return new AccessTokenResponse[i];
        }
    }

    public static /* synthetic */ AccessTokenResponse copy$default(AccessTokenResponse accessTokenResponse, String str, String str2, long j, Long l, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accessTokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = accessTokenResponse.refreshToken;
        }
        if ((i & 4) != 0) {
            j = accessTokenResponse.accessTokenExpiresIn;
        }
        if ((i & 8) != 0) {
            l = accessTokenResponse.refreshTokenExpiresIn;
        }
        if ((i & 16) != 0) {
            str3 = accessTokenResponse.idToken;
        }
        if ((i & 32) != 0) {
            str4 = accessTokenResponse.tokenType;
        }
        if ((i & 64) != 0) {
            str5 = accessTokenResponse.scope;
        }
        if ((i & 128) != 0) {
            str6 = accessTokenResponse.scopes;
        }
        if ((i & 256) != 0) {
            str7 = accessTokenResponse.txId;
        }
        return accessTokenResponse.copy(str, str2, j, l, str3, str4, str5, str6, str7);
    }

    public static /* synthetic */ void getScopes$annotations() {
    }

    public final AccessTokenResponse copy(String accessToken, String str, long j, Long l, String str2, String tokenType, String str3, String str4, String str5) {
        o.LJIIIZ(accessToken, "accessToken");
        o.LJIIIZ(tokenType, "tokenType");
        return new AccessTokenResponse(accessToken, str, j, l, str2, tokenType, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessTokenResponse)) {
            return false;
        }
        AccessTokenResponse accessTokenResponse = (AccessTokenResponse) obj;
        return o.LJ(this.accessToken, accessTokenResponse.accessToken) && o.LJ(this.refreshToken, accessTokenResponse.refreshToken) && this.accessTokenExpiresIn == accessTokenResponse.accessTokenExpiresIn && o.LJ(this.refreshTokenExpiresIn, accessTokenResponse.refreshTokenExpiresIn) && o.LJ(this.idToken, accessTokenResponse.idToken) && o.LJ(this.tokenType, accessTokenResponse.tokenType) && o.LJ(this.scope, accessTokenResponse.scope) && o.LJ(this.scopes, accessTokenResponse.scopes) && o.LJ(this.txId, accessTokenResponse.txId);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AccessTokenResponse(accessToken=");
        LIZ.append(this.accessToken);
        LIZ.append(", refreshToken=");
        LIZ.append((Object) this.refreshToken);
        LIZ.append(", accessTokenExpiresIn=");
        LIZ.append(this.accessTokenExpiresIn);
        LIZ.append(", refreshTokenExpiresIn=");
        LIZ.append(this.refreshTokenExpiresIn);
        LIZ.append(", idToken=");
        LIZ.append((Object) this.idToken);
        LIZ.append(", tokenType=");
        LIZ.append(this.tokenType);
        LIZ.append(", scope=");
        LIZ.append((Object) this.scope);
        LIZ.append(", scopes=");
        LIZ.append((Object) this.scopes);
        LIZ.append(", txId=");
        LIZ.append((Object) this.txId);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.accessToken.hashCode() * 31;
        String str = this.refreshToken;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.accessTokenExpiresIn, (hashCode6 + hashCode) * 31, 31);
        Long l = this.refreshTokenExpiresIn;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        String str2 = this.idToken;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.tokenType, (i2 + hashCode3) * 31, 31);
        String str3 = this.scope;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i3 = (LJ + hashCode4) * 31;
        String str4 = this.scopes;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        String str5 = this.txId;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i4 + i;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getAccessTokenExpiresIn() {
        return this.accessTokenExpiresIn;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final Long getRefreshTokenExpiresIn() {
        return this.refreshTokenExpiresIn;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getScopes() {
        return this.scopes;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final String getTxId() {
        return this.txId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.accessToken);
        out.writeString(this.refreshToken);
        out.writeLong(this.accessTokenExpiresIn);
        Long l = this.refreshTokenExpiresIn;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.idToken);
        out.writeString(this.tokenType);
        out.writeString(this.scope);
        out.writeString(this.scopes);
        out.writeString(this.txId);
    }

    public AccessTokenResponse(String accessToken, String str, long j, Long l, String str2, String tokenType, String str3, String str4, String str5) {
        o.LJIIIZ(accessToken, "accessToken");
        o.LJIIIZ(tokenType, "tokenType");
        this.accessToken = accessToken;
        this.refreshToken = str;
        this.accessTokenExpiresIn = j;
        this.refreshTokenExpiresIn = l;
        this.idToken = str2;
        this.tokenType = tokenType;
        this.scope = str3;
        this.scopes = str4;
        this.txId = str5;
    }

    public /* synthetic */ AccessTokenResponse(String str, String str2, long j, Long l, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, j, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3, str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) == 0 ? str7 : null);
    }
}
