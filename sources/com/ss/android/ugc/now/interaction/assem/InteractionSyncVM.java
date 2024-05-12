package com.ss.android.ugc.now.interaction.assem;

import X.AnonymousClass760;
import X.InterfaceC1805076o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import kotlin.jvm.internal.AqS0S1010000_3;
import kotlin.jvm.internal.AqS1S1000100_3;

/* loaded from: classes4.dex */
public final class InteractionSyncVM extends AssemViewModel<InteractionSyncViewModelState> implements InterfaceC1805076o {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InteractionSyncViewModelState defaultState() {
        return new InteractionSyncViewModelState(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // X.InterfaceC1805076o
    public final void d6(long j, String str) {
        setState(new AqS1S1000100_3(j, str, 0));
    }

    @Override // X.InterfaceC1805076o
    public final void jd(String str, boolean z) {
        setState(new AqS0S1010000_3(z, str, 1));
    }

    @Override // X.InterfaceC1805076o
    public final void yl0(long j, String str) {
        setState(new AqS1S1000100_3(j, str, 1));
    }

    @Override // X.InterfaceC1805076o
    public final void Ss0(long j, boolean z, boolean z2, String str) {
        setState(new AnonymousClass760(j, z, z2, str));
    }
}
