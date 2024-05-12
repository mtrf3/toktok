package com.bytedance.im.core.client;

import X.C08380Uo;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RecentLinkConfig implements Serializable {
    public static int FALLBACK_CLEAR = 1;
    public static int FALLBACK_NORMAL;

    @InterfaceC65349Pkn("enable")
    public int enable;

    @InterfaceC65349Pkn("index_v2_base")
    public long baseIndexV2 = 1;

    @InterfaceC65349Pkn("fallback_strategy")
    public int fallbackStrategy = FALLBACK_NORMAL;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecentLinkConfig{enable=");
        LIZ.append(this.enable);
        LIZ.append(", baseIndexV2=");
        LIZ.append(this.baseIndexV2);
        LIZ.append(", fallbackStrategy=");
        return C08380Uo.LIZ(LIZ, this.fallbackStrategy, "}", LIZ);
    }
}
