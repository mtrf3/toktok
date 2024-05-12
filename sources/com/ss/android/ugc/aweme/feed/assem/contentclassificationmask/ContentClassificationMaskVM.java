package com.ss.android.ugc.aweme.feed.assem.contentclassificationmask;

import X.C206898Ab;
import X.C209218Iz;
import X.C33Q;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ContentClassificationMaskVM extends FeedBaseViewModel<C209218Iz> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C209218Iz(0);
    }

    public final boolean kv0() {
        String str;
        VideoItemParams gv0;
        VideoItemParams gv02;
        VideoItemParams gv03 = gv0();
        if (gv03 != null) {
            str = gv03.mEventType;
        } else {
            str = null;
        }
        if (!o.LJ("homepage_hot", str) || (gv0 = gv0()) == null || gv0.mPageType != 0 || (gv02 = gv0()) == null || gv02.mAwemeFromPage != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C209218Iz iv0(C209218Iz state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C209218Iz(new C206898Ab(o.LJ(item.getAweme().getContentClassificationMaskInfo().getShowMask(), Boolean.TRUE)), item.getAweme().getContentClassificationMaskInfo());
    }
}
