package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.C0NB;
import X.InterfaceC30950CCs;
import com.bytedance.android.livesdk.livesetting.performance.LiveLazyInitPBDecoderSetting;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class PBInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "pb_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        if (!LiveLazyInitPBDecoderSetting.INSTANCE.getValue()) {
            C0NB.LIZIZ(getTaskName(), "disable lazy init pb decoder class.");
            AbstractC31208CMq.invokeMethod("com.bytedance.android.live.base.model.proto.ProtocolBuffersCollector", "init");
        } else {
            C0NB.LIZIZ(getTaskName(), "enable lazy init pb decoder class.");
        }
    }
}
