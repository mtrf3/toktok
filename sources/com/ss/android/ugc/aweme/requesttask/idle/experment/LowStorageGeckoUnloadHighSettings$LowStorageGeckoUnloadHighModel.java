package com.ss.android.ugc.aweme.requesttask.idle.experment;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes7.dex */
public class LowStorageGeckoUnloadHighSettings$LowStorageGeckoUnloadHighModel {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("low_storage_size")
    public long lowStorageSize;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LowStorageGeckoUnloadHighModel{lowStorageSize=");
        LIZ.append(this.lowStorageSize);
        LIZ.append(", enable=");
        return C48339Iy7.LIZJ(LIZ, this.enable, '}', LIZ);
    }
}
