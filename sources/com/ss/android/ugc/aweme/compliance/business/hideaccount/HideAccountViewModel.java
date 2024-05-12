package com.ss.android.ugc.aweme.compliance.business.hideaccount;

import X.C221108m2;
import X.C248269ok;
import X.C248289om;
import X.C248319op;
import X.C25559A1j;
import X.C62822Ol8;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes5.dex */
public final class HideAccountViewModel extends AssemViewModel<C248269ok> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C248319op.LJLIL);
    public String LJLILLLLZI = "";
    public boolean LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C248269ok defaultState() {
        return new C248269ok(0);
    }

    public final void gv0() {
        this.LJLILLLLZI = "";
        setState(C248289om.LJLIL);
        C25559A1j c25559A1j = HideAccountApi.LIZ;
        String str = this.LJLILLLLZI;
        c25559A1j.getClass();
        C25559A1j.LIZ(str).LJJJLIIL(new AfS56S0100000_4(this, 5), new AfS56S0100000_4(this, 6));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        gv0();
    }
}
