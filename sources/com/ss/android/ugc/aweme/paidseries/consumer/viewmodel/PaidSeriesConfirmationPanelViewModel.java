package com.ss.android.ugc.aweme.paidseries.consumer.viewmodel;

import X.A5A;
import X.C221108m2;
import X.C25666A5m;
import X.C25674A5u;
import X.C62822Ol8;
import X.C73969T1h;
import X.T16;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import kotlin.jvm.internal.AqS16S0000100_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidSeriesConfirmationPanelViewModel extends AssemViewModel<C25666A5m> implements A5A {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C25674A5u.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C25666A5m defaultState() {
        return new C25666A5m(0);
    }

    @Override // X.A5A
    public final void DJ(long j) {
        setState(new AqS16S0000100_4(j, 7));
    }

    @Override // X.A5A
    public final void Qo0(long j) {
        setState(new AqS16S0000100_4(j, 8));
    }

    @Override // X.A5A
    public final void bb(long j) {
        setState(new AqS16S0000100_4(j, 9));
    }

    public final void gv0(long j, long j2) {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-paidSeriesService>(...)");
        disposeOnClear(((IPaidContentService) value).LJII(Long.valueOf(j2), j, 2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 105), new AfS56S0100000_4(this, 106)));
    }
}
