package com.ss.android.ugc.aweme.commercialize.feed.assem;

import X.C2309894s;
import X.C33Q;
import X.C59498NWs;
import X.C89O;
import X.NO8;
import X.NOJ;
import X.QD3;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class FeedAdEventViewModel extends FeedBaseHolderViewModel<C2309894s> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C2309894s(0);
    }

    public FeedAdEventViewModel() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onClickFromButtonEvent(C59498NWs event) {
        o.LJIIIZ(event, "event");
        setState(new AqS176S0100000_10(event, 29));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onShowAdLightPageEvent(C89O event) {
        o.LJIIIZ(event, "event");
        setState(new AqS176S0100000_10(event, 30));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onShowPopUpWebPageInFeedEvent(NO8 event) {
        o.LJIIIZ(event, "event");
        NOJ noj = event.LJLIL;
        if (noj != null) {
            setState(new AqS176S0100000_10(noj, 31));
        }
    }
}
