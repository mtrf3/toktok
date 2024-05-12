package com.ss.android.ugc.aweme.relation.ffp.vm;

import X.C221018lt;
import X.C227438wF;
import X.C65776Prg;
import X.X1D;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public final class FFPMainFragmentVM extends AssemViewModel<C227438wF> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C227438wF defaultState() {
        return new C227438wF(0);
    }

    public final void gv0(C65776Prg c65776Prg) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show ");
        LIZ.append(c65776Prg.LJFF());
        LIZ.append('!');
        C221018lt.LJFF("[ffp]_main", X1D.LIZIZ(LIZ));
        setStateImmediate(new AqS169S0100000_3(c65776Prg, 687));
    }
}
