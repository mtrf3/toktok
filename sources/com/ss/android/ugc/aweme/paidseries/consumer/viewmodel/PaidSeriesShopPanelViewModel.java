package com.ss.android.ugc.aweme.paidseries.consumer.viewmodel;

import X.A5A;
import X.A5X;
import X.C221108m2;
import X.C25651A4x;
import X.C62822Ol8;
import X.C73969T1h;
import X.T16;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;
import kotlin.jvm.internal.AqS16S0000100_4;

/* loaded from: classes5.dex */
public final class PaidSeriesShopPanelViewModel extends AssemViewModel<C25651A4x> implements A5A {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(A5X.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C25651A4x defaultState() {
        return new C25651A4x(0);
    }

    @Override // X.A5A
    public final void DJ(long j) {
        setState(new AqS16S0000100_4(j, 10));
    }

    @Override // X.A5A
    public final void Qo0(long j) {
        setState(new AqS16S0000100_4(j, 11));
    }

    @Override // X.A5A
    public final void bb(long j) {
        setState(new AqS16S0000100_4(j, 12));
    }

    public final void gv0(long j) {
        disposeOnClear(((PaidSeriesLiveApiService) this.LJLIL.getValue()).LIZLLL().getLivePaidSeriesList(j).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS56S0100000_4(this, 51), new AfS56S0100000_4(this, 52)));
    }
}
