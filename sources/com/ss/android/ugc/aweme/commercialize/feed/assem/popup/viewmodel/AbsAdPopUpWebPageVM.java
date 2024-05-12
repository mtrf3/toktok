package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel;

import X.C33Q;
import X.C59532NYa;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class AbsAdPopUpWebPageVM extends FeedBaseViewModel<C59532NYa> {
    public String LJLJLLL;
    public long LJLL;
    public int LJLLI = -1;
    public boolean LJLLILLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C59532NYa(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel, X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final VideoItemParams jv0(C59532NYa state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }
}
