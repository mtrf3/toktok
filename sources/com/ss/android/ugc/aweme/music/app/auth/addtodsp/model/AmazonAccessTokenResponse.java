package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class AmazonAccessTokenResponse extends BaseResponse {

    @InterfaceC65349Pkn("access_token")
    public String accessToken;

    @InterfaceC65349Pkn("expires_in")
    public String expiresIn;

    @InterfaceC65349Pkn("refresh_token")
    public String refreshToken;

    @InterfaceC65349Pkn("token_type")
    public String tokenType;

    /* JADX WARN: Multi-variable type inference failed */
    public AmazonAccessTokenResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmazonAccessTokenResponse)) {
            return false;
        }
        AmazonAccessTokenResponse amazonAccessTokenResponse = (AmazonAccessTokenResponse) obj;
        return o.LJ(this.accessToken, amazonAccessTokenResponse.accessToken) && o.LJ(this.tokenType, amazonAccessTokenResponse.tokenType) && o.LJ(this.expiresIn, amazonAccessTokenResponse.expiresIn) && o.LJ(this.refreshToken, amazonAccessTokenResponse.refreshToken);
    }

    public final int hashCode() {
        String str = this.accessToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tokenType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiresIn;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.refreshToken;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AmazonAccessTokenResponse(accessToken=");
        LIZ.append(this.accessToken);
        LIZ.append(", tokenType=");
        LIZ.append(this.tokenType);
        LIZ.append(", expiresIn=");
        LIZ.append(this.expiresIn);
        LIZ.append(", refreshToken=");
        LIZ.append(this.refreshToken);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AmazonAccessTokenResponse(String str, String str2, String str3, String str4) {
        this.accessToken = str;
        this.tokenType = str2;
        this.expiresIn = str3;
        this.refreshToken = str4;
    }

    public /* synthetic */ AmazonAccessTokenResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
