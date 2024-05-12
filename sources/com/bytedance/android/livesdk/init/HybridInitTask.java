package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.CN1;
import X.InterfaceC30950CCs;
import com.bytedance.android.live.browser.IHybridPBService;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDisableLynxKitInitAndroidSetting;
import com.bytedance.android.livesdk.lynx.ILiveLynxService;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class HybridInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "hybrid_init_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        if (!LiveDisableLynxKitInitAndroidSetting.getValue()) {
            ((ILiveLynxService) CN1.LIZ(ILiveLynxService.class)).Mn();
        }
        ((ILiveSparkService) CN1.LIZ(ILiveSparkService.class)).tS();
        ((IHybridPerformanceService) CN1.LIZ(IHybridPerformanceService.class)).Pt();
        ((IHybridPerformanceService) CN1.LIZ(IHybridPerformanceService.class)).LIZJ();
        ((IHybridPBService) CN1.LIZ(IHybridPBService.class)).ss();
    }
}
