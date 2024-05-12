package com.twitter.sdk.android.core;

import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public class TwitterSession extends Session<TwitterAuthToken> {

    @InterfaceC65349Pkn("user_name")
    public final String userName;

    @Override // com.twitter.sdk.android.core.Session
    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.userName;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // com.twitter.sdk.android.core.Session
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.userName;
        String str2 = ((TwitterSession) obj).userName;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public TwitterSession(TwitterAuthToken twitterAuthToken, long j, String str) {
        super(twitterAuthToken, j);
        this.userName = str;
    }
}
