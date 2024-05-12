package com.ss.android.ugc.aweme.input;

import X.AnonymousClass724;
import X.C214928c4;
import X.InterfaceC55235Lm3;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.AqS93S0101000_3;

/* loaded from: classes4.dex */
public final class DanmakuInputVM extends AssemViewModel<AnonymousClass724> {
    public C214928c4 LJLIL;
    public DanmakuViewModel LJLILLLLZI;
    public InterfaceC55235Lm3 LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final AnonymousClass724 defaultState() {
        return new AnonymousClass724(0);
    }

    public final void gv0(int i, boolean z) {
        if (z) {
            setState(new AqS28S0001000_3(i, 18));
        } else {
            withState(new AqS93S0101000_3(this, i, 13));
        }
    }
}
