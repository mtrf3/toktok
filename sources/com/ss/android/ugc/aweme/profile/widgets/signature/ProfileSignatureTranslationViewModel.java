package com.ss.android.ugc.aweme.profile.widgets.signature;

import X.C73411SrX;
import X.C9X8;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS29S1000000_4;

/* loaded from: classes5.dex */
public final class ProfileSignatureTranslationViewModel extends AssemViewModel<C9X8> {
    public C73411SrX LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C9X8 defaultState() {
        return new C9X8(0);
    }

    public final void gv0(String str) {
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        setState(new AqS29S1000000_4(str, 19));
    }
}
