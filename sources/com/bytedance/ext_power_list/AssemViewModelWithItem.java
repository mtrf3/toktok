package com.bytedance.ext_power_list;

import X.C33Q;
import X.C8XE;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes4.dex */
public abstract class AssemViewModelWithItem<S extends C33Q, ITEM> extends AssemViewModel<S> {
    public C8XE LJLIL;

    public final ITEM gv0() {
        ITEM item;
        C8XE c8xe = this.LJLIL;
        if (c8xe == null || (item = (ITEM) c8xe.LJLIL) == null) {
            return null;
        }
        return item;
    }
}
