package com.ss.android.ugc.aweme.base.vm;

import X.C54616Lc4;
import X.C54617Lc5;
import X.LXS;
import X.LXU;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedSkylightContainerViewModel extends AssemViewModel<C54617Lc5> {
    public String LJLIL = "auto";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C54617Lc5 defaultState() {
        return new C54617Lc5(0);
    }

    public final boolean gv0() {
        if (getState().LJLILLLLZI && getState().LJLJJI.LIZ.LJLIL) {
            return true;
        }
        return false;
    }

    public final boolean hv0() {
        if (getState().LJLILLLLZI && getState().LJLJI.LIZ.LJLIL) {
            return true;
        }
        return false;
    }

    public final void jv0(boolean z) {
        setState(new AqS14S0010000_9(z, 0));
    }

    public static void iv0(FeedSkylightContainerViewModel feedSkylightContainerViewModel, boolean z, String enterMethod, boolean z2, int i) {
        boolean z3;
        if ((i & 2) != 0) {
            enterMethod = "auto";
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        feedSkylightContainerViewModel.getClass();
        o.LJIIIZ(enterMethod, "enterMethod");
        feedSkylightContainerViewModel.setState(new C54616Lc4(z, z3, enterMethod, z2));
        LXS LIZ = LXU.LIZ();
        if (LIZ == null) {
            return;
        }
        LIZ.LIZLLL(z);
    }
}
