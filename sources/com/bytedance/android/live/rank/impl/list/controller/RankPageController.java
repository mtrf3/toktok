package com.bytedance.android.live.rank.impl.list.controller;

import X.C221108m2;
import X.C62822Ol8;
import X.C77934UiI;
import X.C77935UiJ;
import X.C77977Uiz;
import X.CountDownTimerC77998UjK;
import X.InterfaceC77978Uj0;
import X.OSZ;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RankPageController extends IChildController {
    public final RankTypeV2 LJLJI;
    public final Fragment LJLJJI;
    public final RankRootController LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public InterfaceC77978Uj0 LJLJL;
    public CountDownTimerC77998UjK LJLJLJ;
    public final C77977Uiz LJLJLLL;

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController, com.bytedance.android.live.rank.impl.list.controller.base.IBaseController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$liverank_impl_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$liverank_impl_release();
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LJFF() {
        Iterator it = ((HashMap) this.LJLIL).values().iterator();
        while (it.hasNext()) {
            ((IChildController) it.next()).LJFF();
        }
    }

    public final RankListViewModel LJII() {
        IChildController iChildController = (IChildController) ((HashMap) this.LJLIL).get(new OSZ(Integer.valueOf(LJIIJ().LJLLL.type), Integer.valueOf(LJIIJ().LJLLL.rankPhase)));
        if (iChildController instanceof RankListController) {
            return ((RankListController) iChildController).LJII();
        }
        return null;
    }

    public final RankListV2Response.RankView LJIIIIZZ() {
        IChildController iChildController = (IChildController) ((HashMap) this.LJLIL).get(new OSZ(Integer.valueOf(LJIIJ().LJLLL.type), Integer.valueOf(LJIIJ().LJLLL.rankPhase)));
        if (iChildController != null && (iChildController instanceof RankListController)) {
            return ((RankListController) iChildController).LJII().LJLILLLLZI;
        }
        return null;
    }

    public final C77934UiI LJIIIZ() {
        return ((RankRootController) this.LJLILLLLZI).LJLJI;
    }

    public final RankPageViewModel LJIIJ() {
        return (RankPageViewModel) this.LJLJJLL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$liverank_impl_release() {
        RankTypeV2 rankTypeV2 = this.LJLJI;
        LJ(rankTypeV2.type, rankTypeV2.rankPhase, this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$liverank_impl_release() {
        CountDownTimerC77998UjK countDownTimerC77998UjK = this.LJLJLJ;
        if (countDownTimerC77998UjK != null) {
            countDownTimerC77998UjK.cancel();
        }
        CountDownTimerC77998UjK countDownTimerC77998UjK2 = this.LJLJLJ;
        if (countDownTimerC77998UjK2 != null) {
            countDownTimerC77998UjK2.LIZ = null;
        }
        this.LJLJLJ = null;
        RankTypeV2 rankTypeV2 = this.LJLJI;
        LJI(rankTypeV2.type, rankTypeV2.rankPhase, this);
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final RankPageViewModel LIZIZ() {
        return LJIIJ();
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LIZLLL(long j) {
        InterfaceC77978Uj0 interfaceC77978Uj0 = this.LJLJL;
        if (interfaceC77978Uj0 != null) {
            interfaceC77978Uj0.gg(j);
        }
        Iterator it = ((HashMap) this.LJLIL).values().iterator();
        while (it.hasNext()) {
            ((IChildController) it.next()).LIZLLL(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankPageController(RankTypeV2 rankPageType, Fragment fragment, RankRootController rankRootController) {
        super(rankRootController);
        o.LJIIIZ(rankPageType, "rankPageType");
        o.LJIIIZ(fragment, "fragment");
        this.LJLJI = rankPageType;
        this.LJLJJI = fragment;
        this.LJLJJL = rankRootController;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 177));
        this.LJLJLLL = new C77977Uiz(this);
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LIZJ(RankListV2Response.RankInfo rank, C77935UiJ c77935UiJ, long[] jArr) {
        o.LJIIIZ(rank, "rank");
        IChildController iChildController = (IChildController) ((HashMap) this.LJLIL).get(new OSZ(Integer.valueOf(c77935UiJ.LIZ.LIZIZ.type), Integer.valueOf(c77935UiJ.LIZ.LIZIZ.rankPhase)));
        if (iChildController != null) {
            iChildController.LIZJ(rank, c77935UiJ, jArr);
            return;
        }
        IChildController iChildController2 = (IChildController) ((HashMap) this.LJLIL).get(new OSZ(Integer.valueOf(c77935UiJ.LIZ.LIZLLL.type), Integer.valueOf(c77935UiJ.LIZ.LIZLLL.rankPhase)));
        if (iChildController2 == null) {
            return;
        }
        iChildController2.LIZJ(rank, c77935UiJ, jArr);
    }
}
