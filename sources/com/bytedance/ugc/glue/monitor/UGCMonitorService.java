package com.bytedance.ugc.glue.monitor;

import org.json.JSONObject;

/* loaded from: classes17.dex */
public class UGCMonitorService {
    public static UGCMonitorService instance = new UGCMonitorService();

    public void eventImpl(String str, Object obj) {
    }

    public void metricImpl(String str, String str2, int i, Object... objArr) {
    }

    public void monitorImpl(String str, String str2, int i, Object... objArr) {
    }

    public void sendImpl(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
    }

    public static UGCMonitorService getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    public static void event(String str, Object obj) {
        getInstance().eventImpl(str, obj);
    }

    public static void metric(String str, String str2, int i, Object... objArr) {
        getInstance().metricImpl(str, str2, i, objArr);
    }

    public static void monitor(String str, String str2, int i, Object... objArr) {
        getInstance().monitorImpl(str, str2, i, objArr);
    }

    public static void send(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        getInstance().sendImpl(str, jSONObject, jSONObject2, jSONObject3);
    }
}
