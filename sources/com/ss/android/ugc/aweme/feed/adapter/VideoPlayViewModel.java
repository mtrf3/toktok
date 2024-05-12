package com.ss.android.ugc.aweme.feed.adapter;

import X.C212208Um;
import X.C33Q;
import X.IWF;
import X.InterfaceC212318Ux;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import kotlin.jvm.internal.AqS8S0010000_3;

/* loaded from: classes4.dex */
public final class VideoPlayViewModel extends FeedBaseHolderViewModel<C212208Um> {
    public static final /* synthetic */ int LJLJJL = 0;
    public final boolean LJLJI = true;
    public InterfaceC212318Ux LJLJJI;

    public final void LJJJJL() {
        InterfaceC212318Ux interfaceC212318Ux = this.LJLJJI;
        if (interfaceC212318Ux != null) {
            interfaceC212318Ux.pausePlayer();
        } else {
            IWF.LJJLIIIIJ().LJIILJJIL();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C212208Um(0);
    }

    public final void hv0() {
        InterfaceC212318Ux interfaceC212318Ux = this.LJLJJI;
        if (interfaceC212318Ux != null) {
            interfaceC212318Ux.LJJJJLI();
        } else {
            IWF.LJJLIIIIJ().LIZIZ();
        }
    }

    public final void jv0() {
        setState(new AqS8S0010000_3(46));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean isHolderVM() {
        return this.LJLJI;
    }

    public final void iv0(boolean z) {
        if (z || IWF.LJJLIIIIJ().isPlaying()) {
            setState(new AqS8S0010000_3(45));
        }
    }
}
