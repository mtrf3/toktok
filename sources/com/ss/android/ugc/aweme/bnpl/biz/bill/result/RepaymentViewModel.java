package com.ss.android.ugc.aweme.bnpl.biz.bill.result;

import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C78404Ups;
import X.C92250a7i;
import X.C92252a7k;
import X.C92253a7l;
import X.EV6;
import X.EnumC91995a3b;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;

/* loaded from: classes20.dex */
public final class RepaymentViewModel extends AssemViewModel<C92253a7l> {
    public final List<Long> LJLIL = C47261Igj.LJJIJIIJI(500L, 800L, 1000L, 1000L, 1000L);
    public final EV6 LJLILLLLZI = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C92250a7i.class));
    public final C55749LuL LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C92252a7k.class, "REPAYMENT_RESULT_KEY"), true);
    public int LJLJJI;
    public long LJLJJL;
    public EnumC91995a3b LJLJJLL;
    public boolean LJLJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C92253a7l defaultState() {
        return new C92253a7l(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLJL = true;
    }
}
