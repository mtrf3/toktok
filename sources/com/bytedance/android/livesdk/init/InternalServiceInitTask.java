package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.InterfaceC30950CCs;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchScrollFpsOptSetting;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class InternalServiceInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "internal_service_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        LiveWatchScrollFpsOptSetting liveWatchScrollFpsOptSetting = LiveWatchScrollFpsOptSetting.INSTANCE;
        if (liveWatchScrollFpsOptSetting.enable("fluency")) {
        }
        if (liveWatchScrollFpsOptSetting.enable("rank")) {
        }
    }
}
