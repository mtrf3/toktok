package com.bytedance.im.core.client;

import X.C08380Uo;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class OptimizeConvListPullConfig implements Serializable {

    @InterfaceC65349Pkn("batch_query_enable")
    public int batchQueryEnable;

    @InterfaceC65349Pkn("full_info_optimize_enable")
    public int fullInfoOptimizeEnable;

    @InterfaceC65349Pkn("init_conv_list_pull_async_enable")
    public int initConvListPullAsyncEnable;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OptimizeConvListPullConfig{init_conv_list_pull_async_enable:");
        LIZ.append(this.initConvListPullAsyncEnable);
        LIZ.append(", full_info_optimize_enable:");
        LIZ.append(this.fullInfoOptimizeEnable);
        LIZ.append(", batch_query_enable_and_query_limit:");
        return C08380Uo.LIZ(LIZ, this.batchQueryEnable, "}", LIZ);
    }
}
