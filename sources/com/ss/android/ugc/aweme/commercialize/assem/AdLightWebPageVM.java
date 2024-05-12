package com.ss.android.ugc.aweme.commercialize.assem;

import X.C33Q;
import X.C59533NYb;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdLightWebPageVM extends FeedBaseViewModel<C59533NYb> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C59533NYb(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel, X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final VideoItemParams jv0(C59533NYb state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }
}
