package com.bytedance.pumbaa.common.impl.event.monitor;

import X.C09900aA;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class EventMonitorImpl implements IEventMonitor {
    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorCommonLog(String logType, JSONObject jSONObject) {
        o.LJIIIZ(logType, "logType");
        C09900aA.LJ(logType, jSONObject);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorDuration(String serviceName, JSONObject jSONObject, JSONObject jSONObject2) {
        o.LJIIIZ(serviceName, "serviceName");
        C09900aA.LJFF(serviceName, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorStatusRate(String serviceName, int i, JSONObject jSONObject) {
        o.LJIIIZ(serviceName, "serviceName");
        C09900aA.LJIIJJI(serviceName, i, jSONObject);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorEvent(String serviceName, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        o.LJIIIZ(serviceName, "serviceName");
        C09900aA.LJI(serviceName, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorStatusAndDuration(String serviceName, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        o.LJIIIZ(serviceName, "serviceName");
        C09900aA.LJIIIZ(serviceName, i, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorStatusAndEvent(String serviceName, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        o.LJIIIZ(serviceName, "serviceName");
        C09900aA.LJIIJ(serviceName, i, jSONObject, jSONObject2, jSONObject3);
    }
}
