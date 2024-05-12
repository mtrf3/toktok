package com.ss.android.ugc.aweme.commercialize.feed.assem.playfun;

import X.C227878wx;
import X.C33Q;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AdPlayFunVM extends FeedBaseViewModel<C227878wx> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C227878wx(null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel, X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final VideoItemParams jv0(C227878wx state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }
}
