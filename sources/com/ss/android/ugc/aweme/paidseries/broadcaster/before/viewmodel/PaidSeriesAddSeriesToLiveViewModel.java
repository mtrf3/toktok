package com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel;

import X.A5A;
import X.C221108m2;
import X.C25656A5c;
import X.C25671A5r;
import X.C25673A5t;
import X.C25675A5v;
import X.C62822Ol8;
import X.C73969T1h;
import X.T16;
import Y.AfS3S0100100_4;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidSeriesAddSeriesToLiveViewModel extends AssemViewModel<C25656A5c> implements A5A {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C25673A5t.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C25675A5v.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C25671A5r.LJLIL);

    @Override // X.A5A
    public final void Qo0(long j) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C25656A5c defaultState() {
        return new C25656A5c(0);
    }

    public final void gv0() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-paidContentService>(...)");
        disposeOnClear(((IPaidContentService) value).LJII(Long.valueOf(getState().LJLIL), ((Number) this.LJLJI.getValue()).longValue(), 6).LJIL(new AfS56S0100000_4(this, 38)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 39), new AfS56S0100000_4(this, 40)));
    }

    @Override // X.A5A
    public final void DJ(long j) {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-paidSeriesLiveService>(...)");
        disposeOnClear(((IPaidSeriesLiveApiService) value).addSeriesToLive(j, getState().LJLIL).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS3S0100100_4(j, this, 0)).LJJII(new AfS3S0100100_4(j, this, 1), new AfS56S0100000_4(this, 41)));
    }

    @Override // X.A5A
    public final void bb(long j) {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-paidSeriesLiveService>(...)");
        disposeOnClear(((IPaidSeriesLiveApiService) value).LIZIZ(j, getState().LJLIL).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS3S0100100_4(j, this, 2)).LJJII(new AfS3S0100100_4(j, this, 3), new AfS56S0100000_4(this, 42)));
    }
}
