package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SearchJitBlockConfig extends F9E {

    @InterfaceC65349Pkn("enable_launch_jit")
    public final boolean enableLaunchJit;

    @InterfaceC65349Pkn("enable_request_jit")
    public final boolean enableRequestJit;

    @InterfaceC65349Pkn("enable_scroll_jit")
    public final boolean enableScrollJit;

    @InterfaceC65349Pkn("launch_duration")
    public final long launchDuration;

    @InterfaceC65349Pkn("request_duration")
    public final long requestDuration;

    @InterfaceC65349Pkn("scroll_duration")
    public final long scrollDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchJitBlockConfig() {
        /*
            r12 = this;
            r1 = 0
            r7 = 0
            r10 = 63
            r11 = 0
            r0 = r12
            r3 = r1
            r5 = r1
            r8 = r7
            r9 = r7
            r0.<init>(r1, r3, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.core.config.SearchJitBlockConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.requestDuration), Long.valueOf(this.scrollDuration), Long.valueOf(this.launchDuration), Boolean.valueOf(this.enableRequestJit), Boolean.valueOf(this.enableScrollJit), Boolean.valueOf(this.enableLaunchJit)};
    }

    public SearchJitBlockConfig(long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        this.requestDuration = j;
        this.scrollDuration = j2;
        this.launchDuration = j3;
        this.enableRequestJit = z;
        this.enableScrollJit = z2;
        this.enableLaunchJit = z3;
    }

    public /* synthetic */ SearchJitBlockConfig(long j, long j2, long j3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) == 0 ? j3 : 0L, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? z3 : false);
    }
}
