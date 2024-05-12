package com.ss.android.ugc.aweme.feed.assem.generalmask;

import X.C206898Ab;
import X.C209138Ir;
import X.C220858ld;
import X.C33Q;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GeneralVideoMaskVM extends FeedBaseViewModel<C209138Ir> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C209138Ir(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C209138Ir iv0(C209138Ir state, VideoItemParams item) {
        VideoMaskInfo videoMaskInfo;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            videoMaskInfo = aweme.getGeneralMaskInfo();
        } else {
            videoMaskInfo = null;
        }
        return new C209138Ir(new C206898Ab(C220858ld.LJIIIZ(item.getAweme())), videoMaskInfo);
    }
}
