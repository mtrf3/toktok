package com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel;

import X.C221108m2;
import X.C49555Jcd;
import X.C49558Jcg;
import X.C49559Jch;
import X.C62822Ol8;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS32S0001000_8;

/* loaded from: classes9.dex */
public final class SearchTakoCardUIVM extends AssemViewModel<C49559Jch> {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C49558Jcg.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C49559Jch defaultState() {
        return new C49559Jch(0);
    }

    public final C49555Jcd gv0() {
        return (C49555Jcd) this.LJLIL.getValue();
    }

    public final void hv0(int i) {
        setState(new AqS32S0001000_8(i, 0));
    }
}
