package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.CN1;
import X.InterfaceC30950CCs;
import com.bytedance.android.live.wallet.IWalletService;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class PipoInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "pipo_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        if (CN1.LIZ(IWalletService.class) != null) {
            ((IWalletService) CN1.LIZ(IWalletService.class)).getPayManager().init();
        }
    }
}
