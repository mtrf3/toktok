package com.ss.android.ugc.aweme.download.component_api.depend;

import X.C78983UzD;
import X.InterfaceC84194X2o;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class DownloadMonitorDepend implements InterfaceC84194X2o {
    public String eventName;
    public String eventPage;
    public Map<String, String> extraInfo;
    public IMonitorLogSendDepend logDepend;

    @Override // X.InterfaceC84194X2o
    public String getEventPage() {
        return this.eventPage;
    }

    @Override // X.InterfaceC84194X2o
    public void monitorLogSend(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Map<String, String> map = this.extraInfo;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (jSONObject.get(key) == null) {
                        jSONObject.put(key, entry.getValue());
                    }
                }
            }
            IMonitorLogSendDepend iMonitorLogSendDepend = this.logDepend;
            if (iMonitorLogSendDepend != null) {
                iMonitorLogSendDepend.sendMonitorLog(this.eventName, jSONObject);
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }

    public DownloadMonitorDepend(IMonitorLogSendDepend iMonitorLogSendDepend, Map<String, String> map, String str, String str2) {
        this.logDepend = iMonitorLogSendDepend;
        this.extraInfo = map;
        this.eventPage = str;
        this.eventName = str2;
    }
}
