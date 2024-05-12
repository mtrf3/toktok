package com.bytedance.android.live.liveinteract.multihost.biz.viewmodel;

import X.C47704Ins;
import X.C55749LuL;
import X.C74039T3z;
import X.C76401Tyf;
import X.C76402Tyg;
import X.C76403Tyh;
import X.InterfaceC76404Tyi;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS32S0210000_13;

/* loaded from: classes14.dex */
public final class InteractionTitleViewModel extends AssemViewModel<C76401Tyf> {
    public static final /* synthetic */ int LJLJI = 0;
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C74039T3z.class, null), true);
    public DataChannel LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C76401Tyf defaultState() {
        return new C76401Tyf(null, null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LJLILLLLZI = ((C74039T3z) this.LJLIL.getValue()).LJLILLLLZI;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.mv0(MultiCoHostStateChannel.class, this, new AqS179S0100000_13(this, 200));
            dataChannel.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 201));
            dataChannel.mv0(BattleTimeLeftChannel.class, this, C76403Tyh.LJLIL);
            dataChannel.mv0(BattleBonusTaskStateChannel.class, this, new AqS179S0100000_13(this, 202));
        }
    }

    public static void gv0(InteractionTitleViewModel interactionTitleViewModel, InterfaceC76404Tyi interfaceC76404Tyi, C76402Tyg c76402Tyg) {
        interactionTitleViewModel.getClass();
        interactionTitleViewModel.withState(new AqS32S0210000_13(interfaceC76404Tyi, false, interactionTitleViewModel, 0));
    }
}
