package com.ss.android.ugc.aweme.bnpl.biz.entry;

import X.C78613UtF;
import X.C91826a0s;
import X.C92279a8B;
import X.C92956aJ6;
import X.C92957aJ7;
import X.C93138aM2;
import X.XKX;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes20.dex */
public final class BNPLEntryViewModel extends AssemViewModel<C92279a8B> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C92279a8B defaultState() {
        return new C92279a8B(0);
    }

    public final void gv0() {
        if (TextUtils.isEmpty(C91826a0s.LIZJ)) {
            setState(C92956aJ6.LJLIL);
        } else {
            setState(C92957aJ7.LJLIL);
            XKX.LIZLLL(getAssemVMScope(), C78613UtF.LIZJ, null, new C93138aM2(this, null), 2);
        }
    }
}
