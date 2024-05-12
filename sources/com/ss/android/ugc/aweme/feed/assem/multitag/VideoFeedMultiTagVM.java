package com.ss.android.ugc.aweme.feed.assem.multitag;

import X.C33Q;
import X.C43I;
import X.C8IY;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoFeedMultiTagVM extends FeedBaseViewModel<C8IY> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C8IY((C43I) null, 3);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C8IY iv0(C8IY state, VideoItemParams item) {
        String str;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        return new C8IY(new C43I(str), 2);
    }
}
