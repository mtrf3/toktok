package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.C12800eq;
import X.C16880lQ;
import X.CN1;
import X.InterfaceC30950CCs;
import android.app.Application;
import com.bytedance.android.livesdk.livesetting.other.LiveChainMonitorExcludeErrorCodesSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableTimeCostSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.monitor.HybridMonitor;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class MonitorInitTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "monitor_init_task";
    }

    private void initHybridMonitor() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext == null || iHostAppContext.context() == null || C16880lQ.LLLLL(iHostAppContext.context()) == null || !(C16880lQ.LLLLL(iHostAppContext.context()) instanceof Application)) {
            return;
        }
        HybridMonitor.getInstance().init((Application) C16880lQ.LLLLL(iHostAppContext.context()));
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        try {
            if (LiveMonitorSampleSetting.INSTANCE.isDolphinExperiment()) {
                C12800eq.LIZ = LiveEnableTimeCostSetting.INSTANCE.enable();
            }
            EnterRoomLinkSession.LJIIIIZZ(LiveChainMonitorExcludeErrorCodesSetting.INSTANCE.getValue());
            initHybridMonitor();
        } catch (Throwable unused) {
        }
    }
}
