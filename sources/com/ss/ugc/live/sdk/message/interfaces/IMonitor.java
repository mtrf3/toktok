package com.ss.ugc.live.sdk.message.interfaces;

import org.json.JSONObject;

/* loaded from: classes16.dex */
public interface IMonitor {
    void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorLatency(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorStatus(String str, int i, JSONObject jSONObject);
}
