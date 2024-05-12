package com.bytedance.android.live.rank.impl.list.controller.base;

import X.C0NB;
import X.C77935UiJ;
import X.OSZ;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class IChildController extends IBaseController {
    public final IBaseController LJLILLLLZI;

    public abstract RankPageViewModel LIZIZ();

    public abstract void LIZJ(RankListV2Response.RankInfo rankInfo, C77935UiJ c77935UiJ, long[] jArr);

    public abstract void LIZLLL(long j);

    public abstract void LJFF();

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final RankRootViewModel LIZ() {
        return this.LJLILLLLZI.LIZ();
    }

    public IChildController(IBaseController iBaseController) {
        this.LJLILLLLZI = iBaseController;
    }

    public final void LJ(int i, int i2, IChildController childController) {
        o.LJIIIZ(childController, "childController");
        if (((HashMap) this.LJLILLLLZI.LJLIL).put(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)), childController) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("registerToParentC ");
            LIZ.append(i);
            LIZ.append(" error");
            C0NB.LJ("IChildController", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJI(int i, int i2, IChildController childController) {
        o.LJIIIZ(childController, "childController");
        if (((HashMap) this.LJLILLLLZI.LJLIL).remove(new OSZ(Integer.valueOf(i), Integer.valueOf(i2))) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unregisterFromParentC ");
            LIZ.append(i);
            LIZ.append(" error");
            C0NB.LJ("IChildController", X1D.LIZIZ(LIZ));
        }
    }
}
