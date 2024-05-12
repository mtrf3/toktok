package com.ss.android.ugc.feed.platform.panel.forcevideo;

import X.C221108m2;
import X.C33Q;
import X.C48279Ix9;
import X.C61878OQg;
import X.C62822Ol8;
import X.C73318Sq2;
import X.JAI;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;

/* loaded from: classes9.dex */
public final class InstantFeedVm extends FeedBaseViewModel<C48279Ix9> {
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(JAI.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C48279Ix9(C61878OQg.INSTANCE);
    }

    public final C73318Sq2 getDisposables() {
        return (C73318Sq2) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        getDisposables().LIZLLL();
    }
}
