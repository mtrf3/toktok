package com.ss.android.ugc.aweme.requesttask.idle.experment;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes7.dex */
public final class LowStorageGeckoUnloadSettings {
    public static final LowStorageGeckoUnloadModel LIZ = new LowStorageGeckoUnloadModel(5000000000L, true);

    /* loaded from: classes7.dex */
    public static class LowStorageGeckoUnloadModel {

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("low_storage_size")
        public long lowStorageSize;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LowStorageGeckoUnloadModel{lowStorageSize=");
            LIZ.append(this.lowStorageSize);
            LIZ.append(", enable=");
            return C48339Iy7.LIZJ(LIZ, this.enable, '}', LIZ);
        }

        public LowStorageGeckoUnloadModel(long j, boolean z) {
            this.lowStorageSize = j;
            this.enable = z;
        }
    }
}
