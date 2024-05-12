package com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel;

import X.A5F;
import X.A5M;
import X.A5R;
import X.A60;
import X.A67;
import X.C221108m2;
import X.C62822Ol8;
import X.C73969T1h;
import X.T16;
import Y.AfS3S0100100_4;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;

/* loaded from: classes5.dex */
public final class PaidSeriesAddedSeriesViewModel extends AssemViewModel<A5R> implements A5F {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(A67.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final A5R defaultState() {
        return new A5R(0);
    }

    public final PaidSeriesLiveApiService gv0() {
        return (PaidSeriesLiveApiService) this.LJLIL.getValue();
    }

    @Override // X.A5F
    public final void Jp0(long j, long j2) {
        disposeOnClear(gv0().LIZLLL().introduceSeries(j, j2, false, new A60(System.currentTimeMillis())).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS56S0100000_4(this, 43)).LJJII(new AfS3S0100100_4(j, this, 4), new AfS56S0100000_4(this, 44)));
    }

    @Override // X.A5F
    public final void gX(long j, long j2) {
        disposeOnClear(gv0().LIZLLL().moveSeriesToTop(j, j2).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS56S0100000_4(this, 47)).LJJII(new AfS3S0100100_4(j, this, 5), new AfS56S0100000_4(this, 48)));
    }

    @Override // X.A5F
    public final void sB(long j, long j2) {
        disposeOnClear(gv0().LIZLLL().introduceSeries(j, j2, true, new A60(System.currentTimeMillis())).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS56S0100000_4(this, 49)).LJJII(new AfS3S0100100_4(j, this, 6), new AfS56S0100000_4(this, 50)));
    }

    @Override // X.A5F
    public final void NO(long j, long j2, boolean z) {
        disposeOnClear(gv0().LIZLLL().deleteSeries(j, j2, 0).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS56S0100000_4(this, 45)).LJJII(new A5M(this, j, z), new AfS56S0100000_4(this, 46)));
    }
}
