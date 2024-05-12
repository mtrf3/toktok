package com.bytedance.apm.impl;

import X.C09900aA;
import X.C09970aH;
import X.C38459F7n;
import X.C64236PIy;
import X.F9U;
import X.PAP;
import Y.IDRunnableS4S1100000;
import android.content.Context;
import com.bytedance.services.apm.api.IApmAgent;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ApmAgentServiceImpl implements IApmAgent {
    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(PAP pap) {
        C38459F7n.LIZ();
        throw null;
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        C09900aA.LJ(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorExceptionLog(String str, JSONObject jSONObject) {
        JSONObject LJIILL;
        if (C09900aA.LIZLLL) {
            LJIILL = C09900aA.LJIILJJIL(jSONObject);
        } else {
            LJIILL = C09900aA.LJIILL(jSONObject);
        }
        F9U.LIZ.LIZJ(new IDRunnableS4S1100000(LJIILL, str, 4));
        if (C09970aH.LIZJ) {
            C64236PIy.LIZ().LIZIZ(new IDRunnableS4S1100000(LJIILL, str, 5));
        }
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorLog(String str, JSONObject jSONObject) {
        C09900aA.LJ(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C09900aA.LJFF(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C09900aA.LJIIJJI(str, i, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C09900aA.LJI(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C09900aA.LJIIIZ(str, i, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void reportLegacyMonitorLog(Context context, long j, long j2, boolean z) {
    }
}
