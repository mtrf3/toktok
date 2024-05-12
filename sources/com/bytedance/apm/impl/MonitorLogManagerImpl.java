package com.bytedance.apm.impl;

import X.C64086PDe;
import X.InterfaceC64087PDf;
import com.bytedance.services.apm.api.IMonitorLogManager;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class MonitorLogManagerImpl implements IMonitorLogManager {
    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void deleteLegacyLogByIds(String str, String str2) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void getLegacyLog(long j, long j2, String str, InterfaceC64087PDf interfaceC64087PDf) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public List<JSONObject> getRecentUiActionRecords() {
        if (C64086PDe.LIZIZ == null) {
            synchronized (C64086PDe.class) {
                if (C64086PDe.LIZIZ == null) {
                    C64086PDe.LIZIZ = new C64086PDe();
                }
            }
        }
        return C64086PDe.LIZIZ.LIZ.LIZ;
    }
}
