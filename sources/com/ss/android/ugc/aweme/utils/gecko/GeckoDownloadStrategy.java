package com.ss.android.ugc.aweme.utils.gecko;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes2.dex */
public final class GeckoDownloadStrategy {

    @InterfaceC65349Pkn("availableStorageFull")
    public final int availableStorageFull = 200;

    @InterfaceC65349Pkn("availableStoragePatch")
    public final int availableStoragePatch = 200;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GeckoDownloadStrategy(availableStorageFull=");
        LIZ.append(this.availableStorageFull);
        LIZ.append(", availableStoragePatch=");
        return b0.LIZJ(LIZ, this.availableStoragePatch, ')', LIZ);
    }

    public final int getAvailableStorageFull() {
        return this.availableStorageFull;
    }

    public final int getAvailableStoragePatch() {
        return this.availableStoragePatch;
    }
}
