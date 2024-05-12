package com.ss.android.ugc.aweme.feed.assem.caution;

import X.C212138Uf;
import X.C33Q;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoTopCautionVM extends FeedBaseViewModel<C212138Uf> {
    public boolean LJLJLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C212138Uf(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C212138Uf iv0(C212138Uf state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C212138Uf(0);
    }
}
