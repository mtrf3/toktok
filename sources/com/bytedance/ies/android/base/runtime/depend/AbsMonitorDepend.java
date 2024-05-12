package com.bytedance.ies.android.base.runtime.depend;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class AbsMonitorDepend implements IMonitorDepend {
    public void monitorEvent(String serviceName, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        o.LJIIJ(serviceName, "serviceName");
    }
}
