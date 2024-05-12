package com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead;

import X.C214078ah;
import X.C33Q;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AdInteractiveVM extends FeedBaseViewModel<C214078ah> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C214078ah(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel, X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final VideoItemParams jv0(C214078ah state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }
}
