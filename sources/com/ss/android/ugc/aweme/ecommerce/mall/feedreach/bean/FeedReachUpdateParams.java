package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FeedReachUpdateParams {

    @InterfaceC65349Pkn("reach_cfg_list")
    public final List<ReachCfg> reachCfgList;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final int scene;

    @InterfaceC65349Pkn("update_props")
    public final int updateProps;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedReachUpdateParams copy$default(FeedReachUpdateParams feedReachUpdateParams, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = feedReachUpdateParams.updateProps;
        }
        if ((i3 & 2) != 0) {
            list = feedReachUpdateParams.reachCfgList;
        }
        if ((i3 & 4) != 0) {
            i2 = feedReachUpdateParams.scene;
        }
        return feedReachUpdateParams.copy(i, list, i2);
    }

    public final FeedReachUpdateParams copy(int i, List<ReachCfg> list, int i2) {
        return new FeedReachUpdateParams(i, list, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedReachUpdateParams)) {
            return false;
        }
        FeedReachUpdateParams feedReachUpdateParams = (FeedReachUpdateParams) obj;
        return this.updateProps == feedReachUpdateParams.updateProps && o.LJ(this.reachCfgList, feedReachUpdateParams.reachCfgList) && this.scene == feedReachUpdateParams.scene;
    }

    public int hashCode() {
        int i = this.updateProps * 31;
        List<ReachCfg> list = this.reachCfgList;
        return ((i + (list == null ? 0 : list.hashCode())) * 31) + this.scene;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedReachUpdateParams(updateProps=");
        LIZ.append(this.updateProps);
        LIZ.append(", reachCfgList=");
        LIZ.append(this.reachCfgList);
        LIZ.append(", scene=");
        return b0.LIZJ(LIZ, this.scene, ')', LIZ);
    }

    public final List<ReachCfg> getReachCfgList() {
        return this.reachCfgList;
    }

    public final int getScene() {
        return this.scene;
    }

    public final int getUpdateProps() {
        return this.updateProps;
    }

    public FeedReachUpdateParams(int i, List<ReachCfg> list, int i2) {
        this.updateProps = i;
        this.reachCfgList = list;
        this.scene = i2;
    }
}
