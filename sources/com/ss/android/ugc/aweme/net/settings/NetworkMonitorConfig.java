package com.ss.android.ugc.aweme.net.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class NetworkMonitorConfig extends F9E {

    @InterfaceC65349Pkn("enableHttpClientMonitor")
    public boolean enableHttpClientMonitor;

    @InterfaceC65349Pkn("enableNetworkMonitor")
    public boolean enableNetworkMonitor;

    @InterfaceC65349Pkn("enableOkHttpMonitor")
    public boolean enableOkHttpMonitor;

    @InterfaceC65349Pkn("enableTTNetMonitor")
    public boolean enableTTNetMonitor;

    @InterfaceC65349Pkn("enableUrlConnectionMonitor")
    public boolean enableUrlConnectionMonitor;

    @InterfaceC65349Pkn("enableWebMonitor")
    public boolean enableWebMonitor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NetworkMonitorConfig() {
        /*
            r9 = this;
            r1 = 0
            r7 = 63
            r8 = 0
            r0 = r9
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableNetworkMonitor), Boolean.valueOf(this.enableTTNetMonitor), Boolean.valueOf(this.enableOkHttpMonitor), Boolean.valueOf(this.enableUrlConnectionMonitor), Boolean.valueOf(this.enableHttpClientMonitor), Boolean.valueOf(this.enableWebMonitor)};
    }

    public NetworkMonitorConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enableNetworkMonitor = z;
        this.enableTTNetMonitor = z2;
        this.enableOkHttpMonitor = z3;
        this.enableUrlConnectionMonitor = z4;
        this.enableHttpClientMonitor = z5;
        this.enableWebMonitor = z6;
    }

    public /* synthetic */ NetworkMonitorConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6);
    }
}
