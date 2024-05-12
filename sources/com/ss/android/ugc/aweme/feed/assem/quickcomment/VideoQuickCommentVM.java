package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.C33Q;
import X.C79146V4k;
import X.C7AV;
import X.C84673XKz;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes4.dex */
public final class VideoQuickCommentVM extends FeedBaseViewModel<C7AV> {
    public JobSupport LJLJLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C7AV(null, null);
    }

    public VideoQuickCommentVM() {
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        LJIILIIL.LIZIZ(null);
        this.LJLJLLL = LJIILIIL;
    }
}
