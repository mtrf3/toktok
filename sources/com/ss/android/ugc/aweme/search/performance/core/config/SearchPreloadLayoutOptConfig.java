package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SearchPreloadLayoutOptConfig extends F9E {

    @InterfaceC65349Pkn("enable_async_create")
    public final boolean enableAsyncCreate;

    @InterfaceC65349Pkn("enable_create_delay")
    public final boolean enableCreateDelay;

    @InterfaceC65349Pkn("enable_preload")
    public final boolean enablePreload;

    @InterfaceC65349Pkn("enable_view_stub_preload")
    public final boolean enableViewStubPreload;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchPreloadLayoutOptConfig() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.core.config.SearchPreloadLayoutOptConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enablePreload), Boolean.valueOf(this.enableAsyncCreate), Boolean.valueOf(this.enableCreateDelay), Boolean.valueOf(this.enableViewStubPreload)};
    }

    public SearchPreloadLayoutOptConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enablePreload = z;
        this.enableAsyncCreate = z2;
        this.enableCreateDelay = z3;
        this.enableViewStubPreload = z4;
    }

    public /* synthetic */ SearchPreloadLayoutOptConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
