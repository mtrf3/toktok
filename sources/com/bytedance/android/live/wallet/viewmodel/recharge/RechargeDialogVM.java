package com.bytedance.android.live.wallet.viewmodel.recharge;

import X.C221108m2;
import X.C5H3;
import X.C73454SsE;
import X.C73933Szx;
import X.C77591Ucl;
import X.C77607Ud1;
import X.C78996UzQ;
import X.InterfaceC29856Bng;
import X.InterfaceC32361Cmz;
import X.InterfaceC77611Ud5;
import X.InterfaceC77660Uds;
import Y.AfS65S0100000_13;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RechargeDialogVM extends ViewModel {
    public final C77591Ucl LJLIL;
    public final InterfaceC77611Ud5 LJLILLLLZI;
    public final DataChannel LJLJI;
    public final InterfaceC77660Uds LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;

    public RechargeDialogVM(InterfaceC77611Ud5 interfaceC77611Ud5, C77591Ucl rechargeDialogConfig, DataChannel dataChannel) {
        LifecycleOwner lifecycleOwner;
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        this.LJLIL = rechargeDialogConfig;
        this.LJLILLLLZI = interfaceC77611Ud5;
        this.LJLJI = dataChannel;
        this.LJLJJI = C77607Ud1.LIZJ();
        C221108m2.LIZIZ(new AqS163S0100000_13(this, 494));
        this.LJLJJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 495));
        this.LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 493));
        C73454SsE LIZ = ((InterfaceC32361Cmz) C77607Ud1.LJ.getValue()).LIZ();
        if (interfaceC77611Ud5 != null) {
            lifecycleOwner = interfaceC77611Ud5.getLifeCycleOwner();
        } else {
            lifecycleOwner = null;
        }
        ((InterfaceC29856Bng) LIZ.LIZJ(C73933Szx.LJ(lifecycleOwner))).LIZIZ(new AfS65S0100000_13(this, 201));
    }
}
