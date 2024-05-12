package com.ss.android.ugc.aweme.nows.interaction.viewmodel;

import X.AnonymousClass799;
import X.C181777Bl;
import X.C33Q;
import X.C50420Jqa;
import X.QD3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class NowEventDispatcherViewModel extends NowInteractionBaseHolderViewModel<C181777Bl> {
    public final boolean LJLILLLLZI = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C181777Bl(null, null);
    }

    public NowEventDispatcherViewModel() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowInteractionBaseHolderViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean isHolderVM() {
        return this.LJLILLLLZI;
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onSyncLikeStateEvent(AnonymousClass799 event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 353));
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onVideoEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        setState(new AqS169S0100000_3(event, 354));
    }
}
