package com.ss.android.ugc.aweme.mix.createmix.viewmodel;

import X.C228718yJ;
import X.C228798yR;
import X.C78404Ups;
import X.InterfaceC228388xm;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class MixCreateViewModel extends AssemViewModel<C228798yR> implements InterfaceC228388xm {
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public Aweme LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC228388xm
    public final String TV() {
        return "create_playlist";
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C228798yR defaultState() {
        return new C228798yR(0);
    }

    public MixCreateViewModel() {
        C78404Ups.LIZJ(this, C228718yJ.LJLIL);
    }

    @Override // X.InterfaceC228388xm
    public final String Uq() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC228388xm
    public final void Ne0(int i, int i2) {
        List<Aweme> list;
        if (i != i2 && (list = getVmDispatcher().getState().LJLJI) != null) {
            Collections.swap(list, i, i2);
        }
    }
}
