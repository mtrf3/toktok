package com.bytedance.ugc.glue.monitor;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public final class UGCMonitor {
    public static void debug(int i, Object... objArr) {
        UGCMonitorService.monitor("ugc_debugger", null, i, objArr);
    }

    public static void event(String str, Bundle bundle) {
        UGCMonitorService.event(str, bundle);
    }

    public static void event(String str, JSONObject jSONObject) {
        UGCMonitorService.event(str, jSONObject);
    }

    public static void metric(String str, int i, JSONObject jSONObject) {
        metric(str, (String) null, i, jSONObject);
    }

    public static void monitor(String str, int i, JSONObject jSONObject) {
        monitor(str, (String) null, i, jSONObject);
    }

    public static void metric(String str, int i, Object... objArr) {
        UGCMonitorService.metric(str, null, i, objArr);
    }

    public static void monitor(String str, int i, Object... objArr) {
        UGCMonitorService.monitor(str, null, i, objArr);
    }

    public static void metric(String str, String str2, int i, JSONObject jSONObject) {
        UGCMonitorService.metric(str, str2, i, jSONObject);
    }

    public static void monitor(String str, String str2, int i, JSONObject jSONObject) {
        UGCMonitorService.monitor(str, str2, i, jSONObject);
    }

    public static void send(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        UGCMonitorService.send(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void metric(String str, String str2, int i, Object... objArr) {
        UGCMonitorService.metric(str, str2, i, objArr);
    }

    public static void monitor(String str, String str2, int i, Object... objArr) {
        UGCMonitorService.monitor(str, str2, i, objArr);
    }
}
