package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes7.dex */
public final class ThreadConvergenceConfig {

    /* renamed from: switch, reason: not valid java name */
    @InterfaceC65349Pkn("switch")
    public int f26switch;

    @InterfaceC65349Pkn("corePoolSize")
    public int corePoolSize = 64;

    @InterfaceC65349Pkn("maxPoolSize")
    public int maxPoolSize = 96;

    @InterfaceC65349Pkn("dredgeInterval")
    public int dredgeInterval = 10;

    @InterfaceC65349Pkn("idleWorkerKeepAliveNs")
    public long idleWorkerKeepAliveNs = 1000000;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switch: ");
        LIZ.append(Integer.toBinaryString(this.f26switch));
        LIZ.append(", corePoolSize: ");
        LIZ.append(this.corePoolSize);
        LIZ.append(", maxPoolSize: ");
        LIZ.append(this.maxPoolSize);
        LIZ.append(", dredgeInterval: ");
        LIZ.append(this.dredgeInterval);
        LIZ.append(", idleWorkerKeepAliveNs: ");
        LIZ.append(this.idleWorkerKeepAliveNs);
        return X1D.LIZIZ(LIZ);
    }
}
