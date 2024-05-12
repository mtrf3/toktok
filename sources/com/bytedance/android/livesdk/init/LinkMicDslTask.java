package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.CN1;
import X.InterfaceC30950CCs;
import X.InterfaceC75011TcF;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class LinkMicDslTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "link_mic_dsl_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        InterfaceC75011TcF JR = ((ILinkMicService) CN1.LIZ(ILinkMicService.class)).JR();
        if (JR != null) {
            JR.init();
        }
    }
}
