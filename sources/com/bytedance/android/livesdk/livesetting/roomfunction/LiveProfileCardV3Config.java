package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveProfileCardV3Config {

    @InterfaceC65349Pkn("author_prefetch")
    public boolean enableAuthorPrefetch;

    @InterfaceC65349Pkn("fast_follow")
    public boolean enableFastFollow;

    @InterfaceC65349Pkn("fetch_then_show")
    public boolean fetchThenShow;

    @InterfaceC65349Pkn("fetch_timeout_ms")
    public long fetchTimeoutMs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveProfileCardV3Config() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 15
            r7 = 0
            r0 = r8
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileCardV3Config.<init>():void");
    }

    public final boolean getEnableAuthorPrefetch() {
        return this.enableAuthorPrefetch;
    }

    public final boolean getEnableFastFollow() {
        return this.enableFastFollow;
    }

    public final boolean getFetchThenShow() {
        return this.fetchThenShow;
    }

    public final long getFetchTimeoutMs() {
        return this.fetchTimeoutMs;
    }

    public final void setEnableAuthorPrefetch(boolean z) {
        this.enableAuthorPrefetch = z;
    }

    public final void setEnableFastFollow(boolean z) {
        this.enableFastFollow = z;
    }

    public final void setFetchThenShow(boolean z) {
        this.fetchThenShow = z;
    }

    public final void setFetchTimeoutMs(long j) {
        this.fetchTimeoutMs = j;
    }

    public LiveProfileCardV3Config(boolean z, long j, boolean z2, boolean z3) {
        this.fetchThenShow = z;
        this.fetchTimeoutMs = j;
        this.enableAuthorPrefetch = z2;
        this.enableFastFollow = z3;
    }

    public /* synthetic */ LiveProfileCardV3Config(boolean z, long j, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3);
    }
}
