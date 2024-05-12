package com.twitter.sdk.android.core;

import X.InterfaceC65349Pkn;
import com.twitter.sdk.android.core.AuthToken;

/* loaded from: classes12.dex */
public class Session<T extends AuthToken> {

    @InterfaceC65349Pkn("auth_token")
    public final T authToken;

    @InterfaceC65349Pkn("id")
    public final long id;

    public int hashCode() {
        int i;
        T t = this.authToken;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        long j = this.id;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Session session = (Session) obj;
        if (this.id != session.id) {
            return false;
        }
        T t = this.authToken;
        T t2 = session.authToken;
        if (t != null) {
            return t.equals(t2);
        }
        if (t2 == null) {
            return true;
        }
        return false;
    }

    public Session(T t, long j) {
        if (t != null) {
            this.authToken = t;
            this.id = j;
            return;
        }
        throw new IllegalArgumentException("AuthToken must not be null.");
    }
}
