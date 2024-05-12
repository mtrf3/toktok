package com.bytedance.android.live.base.service;

import X.InterfaceC06390Mx;
import X.InterfaceC28211B5j;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface IHostMonitorAndLog extends InterfaceC06390Mx {
    void Xc0(String str);

    InterfaceC28211B5j Xd0();

    void a3(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void ensureNotReachHere(Throwable th, String str);

    void ensureNotReachHere(Throwable th, String str, Map<String, String> map);

    void j20();

    void m2(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorDirectOnTimer(String str, String str2, float f);

    void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);

    void qa0(JSONObject jSONObject);

    void xe0(String str, Map<String, String> map);

    void zC(String str);
}
