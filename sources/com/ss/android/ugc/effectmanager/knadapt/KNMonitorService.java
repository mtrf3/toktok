package com.ss.android.ugc.effectmanager.knadapt;

import X.InterfaceC58749N3x;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class KNMonitorService implements InterfaceC58749N3x {
    public final IMonitorService iMonitorService;

    public KNMonitorService(IMonitorService iMonitorService) {
        o.LJIIJ(iMonitorService, "iMonitorService");
        this.iMonitorService = iMonitorService;
    }

    @Override // X.InterfaceC58749N3x
    public void monitorStatusRate(String serviceName, int i, Map<String, ? extends Object> logExtraMap) {
        o.LJIIJ(serviceName, "serviceName");
        o.LJIIJ(logExtraMap, "logExtraMap");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : logExtraMap.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        this.iMonitorService.monitorStatusRate(serviceName, i, jSONObject);
    }
}
