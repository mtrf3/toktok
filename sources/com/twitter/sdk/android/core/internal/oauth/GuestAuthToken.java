package com.twitter.sdk.android.core.internal.oauth;

import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public class GuestAuthToken extends OAuth2Token {

    @InterfaceC65349Pkn("guest_token")
    public final String guestToken;

    public final boolean LIZ() {
        if (System.currentTimeMillis() >= this.createdAt + 10800000) {
            return true;
        }
        return false;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.guestToken;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.guestToken;
        String str2 = ((GuestAuthToken) obj).guestToken;
        if (str == null ? str2 == null : str.equals(str2)) {
            return true;
        }
        return false;
    }

    public GuestAuthToken(String str, String str2, String str3) {
        super(str, str2);
        this.guestToken = str3;
    }

    public GuestAuthToken(String str, String str2, String str3, long j) {
        super(str, str2, j);
        this.guestToken = str3;
    }
}
