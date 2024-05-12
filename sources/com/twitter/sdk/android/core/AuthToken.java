package com.twitter.sdk.android.core;

import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public abstract class AuthToken {

    @InterfaceC65349Pkn("created_at")
    public final long createdAt;

    public AuthToken() {
        this(System.currentTimeMillis());
    }

    public AuthToken(long j) {
        this.createdAt = j;
    }
}
