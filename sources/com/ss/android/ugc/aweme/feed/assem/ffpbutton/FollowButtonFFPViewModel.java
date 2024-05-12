package com.ss.android.ugc.aweme.feed.assem.ffpbutton;

import X.C226008tw;
import X.C33Q;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FollowButtonFFPViewModel extends FeedBaseViewModel<C226008tw> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C226008tw(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C226008tw iv0(C226008tw state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C226008tw(true);
    }
}
