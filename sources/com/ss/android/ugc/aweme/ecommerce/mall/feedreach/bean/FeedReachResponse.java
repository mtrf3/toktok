package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FeedReachResponse {

    @InterfaceC65349Pkn("reach_cfg_list")
    public final List<ReachCfg> reachConfigList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedReachResponse copy$default(FeedReachResponse feedReachResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feedReachResponse.reachConfigList;
        }
        return feedReachResponse.copy(list);
    }

    public final FeedReachResponse copy(List<ReachCfg> list) {
        return new FeedReachResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedReachResponse) && o.LJ(this.reachConfigList, ((FeedReachResponse) obj).reachConfigList);
    }

    public int hashCode() {
        List<ReachCfg> list = this.reachConfigList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedReachResponse(reachConfigList=");
        return C1NE.LIZIZ(LIZ, this.reachConfigList, ')', LIZ);
    }

    public final List<ReachCfg> getReachConfigList() {
        return this.reachConfigList;
    }

    public FeedReachResponse(List<ReachCfg> list) {
        this.reachConfigList = list;
    }
}
