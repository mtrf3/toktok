package com.kakao.sdk.auth.model;

import X.C1NE;
import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class OAuthToken implements Parcelable {
    public final String accessToken;
    public final Date accessTokenExpiresAt;
    public final String idToken;
    public final String refreshToken;
    public final Date refreshTokenExpiresAt;
    public final List<String> scopes;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<OAuthToken> CREATOR = new Creator();

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<OAuthToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OAuthToken createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new OAuthToken(parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OAuthToken[] newArray(int i) {
            return new OAuthToken[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OAuthToken copy$default(OAuthToken oAuthToken, String str, Date date, String str2, Date date2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oAuthToken.accessToken;
        }
        if ((i & 2) != 0) {
            date = oAuthToken.accessTokenExpiresAt;
        }
        if ((i & 4) != 0) {
            str2 = oAuthToken.refreshToken;
        }
        if ((i & 8) != 0) {
            date2 = oAuthToken.refreshTokenExpiresAt;
        }
        if ((i & 16) != 0) {
            str3 = oAuthToken.idToken;
        }
        if ((i & 32) != 0) {
            list = oAuthToken.scopes;
        }
        return oAuthToken.copy(str, date, str2, date2, str3, list);
    }

    public final OAuthToken copy(String accessToken, Date accessTokenExpiresAt, String refreshToken, Date refreshTokenExpiresAt, String str, List<String> list) {
        o.LJIIIZ(accessToken, "accessToken");
        o.LJIIIZ(accessTokenExpiresAt, "accessTokenExpiresAt");
        o.LJIIIZ(refreshToken, "refreshToken");
        o.LJIIIZ(refreshTokenExpiresAt, "refreshTokenExpiresAt");
        return new OAuthToken(accessToken, accessTokenExpiresAt, refreshToken, refreshTokenExpiresAt, str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthToken)) {
            return false;
        }
        OAuthToken oAuthToken = (OAuthToken) obj;
        return o.LJ(this.accessToken, oAuthToken.accessToken) && o.LJ(this.accessTokenExpiresAt, oAuthToken.accessTokenExpiresAt) && o.LJ(this.refreshToken, oAuthToken.refreshToken) && o.LJ(this.refreshTokenExpiresAt, oAuthToken.refreshTokenExpiresAt) && o.LJ(this.idToken, oAuthToken.idToken) && o.LJ(this.scopes, oAuthToken.scopes);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.accessToken);
        out.writeSerializable(this.accessTokenExpiresAt);
        out.writeString(this.refreshToken);
        out.writeSerializable(this.refreshTokenExpiresAt);
        out.writeString(this.idToken);
        out.writeStringList(this.scopes);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.refreshTokenExpiresAt.hashCode() + C79062V1e.LJ(this.refreshToken, (this.accessTokenExpiresAt.hashCode() + (this.accessToken.hashCode() * 31)) * 31, 31)) * 31;
        String str = this.idToken;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        List<String> list = this.scopes;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OAuthToken(accessToken=");
        LIZ.append(this.accessToken);
        LIZ.append(", accessTokenExpiresAt=");
        LIZ.append(this.accessTokenExpiresAt);
        LIZ.append(", refreshToken=");
        LIZ.append(this.refreshToken);
        LIZ.append(", refreshTokenExpiresAt=");
        LIZ.append(this.refreshTokenExpiresAt);
        LIZ.append(", idToken=");
        LIZ.append((Object) this.idToken);
        LIZ.append(", scopes=");
        return C1NE.LIZIZ(LIZ, this.scopes, ')', LIZ);
    }

    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final OAuthToken fromResponse(AccessTokenResponse response, OAuthToken oAuthToken) {
            Date refreshTokenExpiresAt;
            List<String> LJLJJL;
            o.LJIIIZ(response, "response");
            String accessToken = response.getAccessToken();
            Date date = new Date((response.getAccessTokenExpiresIn() * 1000) + new Date().getTime());
            String refreshToken = response.getRefreshToken();
            if (refreshToken == null) {
                if (oAuthToken != null) {
                    refreshToken = oAuthToken.getRefreshToken();
                } else {
                    throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found in the response.");
                }
            }
            List<String> list = null;
            if (response.getRefreshToken() != null) {
                Long refreshTokenExpiresIn = response.getRefreshTokenExpiresIn();
                if (refreshTokenExpiresIn == null) {
                    refreshTokenExpiresAt = new Date();
                } else {
                    refreshTokenExpiresAt = new Date((refreshTokenExpiresIn.longValue() * 1000) + new Date().getTime());
                }
            } else {
                if (oAuthToken == null) {
                    refreshTokenExpiresAt = null;
                } else {
                    refreshTokenExpiresAt = oAuthToken.getRefreshTokenExpiresAt();
                }
                o.LJI(refreshTokenExpiresAt);
            }
            String scope = response.getScope();
            if (scope == null || (LJLJJL = s.LJLJJL(scope, new String[]{" "}, 0, 6)) == null) {
                if (oAuthToken != null) {
                    list = oAuthToken.getScopes();
                }
            } else {
                list = LJLJJL;
            }
            return new OAuthToken(accessToken, date, refreshToken, refreshTokenExpiresAt, response.getIdToken(), list);
        }

        public static /* synthetic */ OAuthToken fromResponse$default(Companion companion, AccessTokenResponse accessTokenResponse, OAuthToken oAuthToken, int i, Object obj) {
            if ((i & 2) != 0) {
                oAuthToken = null;
            }
            return companion.fromResponse(accessTokenResponse, oAuthToken);
        }
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Date getAccessTokenExpiresAt() {
        return this.accessTokenExpiresAt;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final Date getRefreshTokenExpiresAt() {
        return this.refreshTokenExpiresAt;
    }

    public final List<String> getScopes() {
        return this.scopes;
    }

    public OAuthToken(String accessToken, Date accessTokenExpiresAt, String refreshToken, Date refreshTokenExpiresAt, String str, List<String> list) {
        o.LJIIIZ(accessToken, "accessToken");
        o.LJIIIZ(accessTokenExpiresAt, "accessTokenExpiresAt");
        o.LJIIIZ(refreshToken, "refreshToken");
        o.LJIIIZ(refreshTokenExpiresAt, "refreshTokenExpiresAt");
        this.accessToken = accessToken;
        this.accessTokenExpiresAt = accessTokenExpiresAt;
        this.refreshToken = refreshToken;
        this.refreshTokenExpiresAt = refreshTokenExpiresAt;
        this.idToken = str;
        this.scopes = list;
    }

    public /* synthetic */ OAuthToken(String str, Date date, String str2, Date date2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, date2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? list : null);
    }
}
