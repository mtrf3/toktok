package com.ss.android.ugc.aweme.feed.assem.progressbar;

import X.C2U8;
import X.C33Q;
import X.C55392Loa;
import X.C81277Vv7;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VideoProgressBarViewModel extends FeedBaseViewModel<C81277Vv7> {
    public long LJLJLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C81277Vv7(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C81277Vv7 iv0(C81277Vv7 state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        if (this.LJLJLJ != null) {
            super.iv0(state, item);
            return state;
        }
        return new C81277Vv7(0);
    }

    public final void kv0(int i, boolean z) {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        C55392Loa c55392Loa = new C55392Loa(aweme, this.LJLJI);
        c55392Loa.LJLJI = z;
        C2U8.LIZ(c55392Loa);
    }
}
