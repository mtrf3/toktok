package com.ss.android.ugc.aweme.qna.vm;

import X.C214188as;
import X.C47704Ins;
import X.C72214SVu;
import X.C73969T1h;
import X.C78404Ups;
import X.E86;
import X.ECH;
import X.ECV;
import X.T16;
import Y.AfS58S0100000_6;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes7.dex */
public final class QnaBannerViewModel extends AssemViewModel<E86> {
    public final C214188as LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final E86 defaultState() {
        return new E86(0);
    }

    public QnaBannerViewModel() {
        C47704Ins.LIZLLL(this, C72214SVu.class, null);
        this.LJLIL = C78404Ups.LIZJ(this, ECV.LJLIL);
    }

    public final void gv0(Long l, String str) {
        disposeOnClear(((ECH) this.LJLIL.getValue().getOperator()).LJJIII(l, str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS58S0100000_6(this, 17), new AfS58S0100000_6(this, 18)));
    }
}
