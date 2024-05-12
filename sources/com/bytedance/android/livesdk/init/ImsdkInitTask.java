package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.CN1;
import X.InterfaceC30950CCs;
import com.bytedance.android.message.IMessageService;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class ImsdkInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "imsdk_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        ((IMessageService) CN1.LIZ(IMessageService.class)).initZstdCompressResourceWhenSDKStart();
    }
}
