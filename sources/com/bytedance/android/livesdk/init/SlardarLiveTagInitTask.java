package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.CN1;
import X.InterfaceC30950CCs;
import com.bytedance.android.livesdkapi.host.IHostConfig;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class SlardarLiveTagInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "slardar_live_tag_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        ((IHostConfig) CN1.LIZ(IHostConfig.class)).Wt();
    }
}
