package com.ss.android.ugc.aweme.video.simcommon;

import X.C09900aA;
import X.C78983UzD;
import X.C8HX;
import X.FUA;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SimMonitor implements IMonitor {
    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void ensureNotReachHere(Throwable th) {
        C78983UzD.LJIIZILJ(th);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void ensureNotReachHere(Throwable th, String str) {
        C78983UzD.LJIJ(th, str);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        FUA.LIZJ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
        C8HX.LIZIZ(str, str2, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C09900aA.LJIIJJI(str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C09900aA.LJI(str, jSONObject, jSONObject2, jSONObject3);
    }
}
