package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C09900aA;
import X.C09970aH;
import X.C29245Bdp;
import X.C36704Eaq;
import X.C56272M6q;
import X.C64236PIy;
import X.C78688UuS;
import X.EB7;
import X.FMX;
import X.FUA;
import X.InterfaceC28211B5j;
import X.PCE;
import X.PEH;
import X.PN9;
import Y.IDRunnableS0S1300000;
import android.text.TextUtils;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.chatroom.utils.LastLiveActionInfo;
import com.bytedance.android.livesdk.livesetting.other.EnableLiveEcRecordsSetting;
import com.bytedance.apm6.cpu.ApmCpuManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveHostMonitorAndLog implements IHostMonitorAndLog {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final InterfaceC28211B5j Xd0() {
        return C56272M6q.LIZIZ;
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void j20() {
        C36704Eaq.LIZIZ();
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void Xc0(String str) {
        if (!TextUtils.isEmpty(str)) {
            ApmCpuManager.getInstance().startScene(str);
        }
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void qa0(JSONObject jSONObject) {
        try {
            long optLong = jSONObject.optLong("download_size_delta", -1L);
            String optString = jSONObject.optString("live_stream_session_id", "");
            if (optLong > 0 && !TextUtils.isEmpty(optString)) {
                C09900aA.LJIIZILJ(optLong, optString, "live", "");
                if (EB7.LIZ()) {
                    PN9.LJJIJ += optLong;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void zC(String str) {
        if (!TextUtils.isEmpty(str)) {
            ApmCpuManager.getInstance().stopScene(str);
        }
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void ensureNotReachHere(Throwable th, String str) {
        PEH.LIZLLL(th, str);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
        FUA.LIZJ(str, jSONObject);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void xe0(String str, Map<String, String> map) {
        LastLiveActionInfo LIZIZ;
        if ("livesdk_live_show".equals(str)) {
            C78688UuS.LJJJJZ(map);
            return;
        }
        if ("livesdk_live_duration".equals(str)) {
            FMX.LJIIL("livesdk_live_duration", map);
            C29245Bdp c29245Bdp = (C29245Bdp) LiveOuterService.LJJJLL().LJJIZ().LJJIJIL().T7();
            c29245Bdp.getClass();
            if (!EnableLiveEcRecordsSetting.INSTANCE.getValue() || (LIZIZ = C29245Bdp.LIZIZ(map)) == null) {
                return;
            }
            c29245Bdp.LIZ(LIZIZ, c29245Bdp.LIZJ, c29245Bdp.LIZLLL);
            return;
        }
        FMX.LJIIL(str, map);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        PEH.LJ(th, str, map);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorDirectOnTimer(String str, String str2, float f) {
        FUA.LJFF(str, str2, f);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C09900aA.LJFF(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C09900aA.LJIIJJI(str, i, jSONObject);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void a3(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C09900aA.LJI(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void m2(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (PCE.LJI(Boolean.TRUE, str, jSONObject3)) {
            return;
        }
        JSONObject LJIILL = C09900aA.LJIILL(jSONObject3);
        C09900aA.LIZIZ(LJIILL);
        PCE.LJ(str, 0, jSONObject, jSONObject2, LJIILL);
        if (!C09970aH.LIZJ) {
            return;
        }
        JSONObject LJIIL = C09900aA.LJIIL(jSONObject, true);
        JSONObject LJIIL2 = C09900aA.LJIIL(jSONObject2, true);
        C64236PIy.LIZ().LIZIZ(new IDRunnableS0S1300000(C09900aA.LJIIL(LJIILL, true), LJIIL, str, LJIIL2, 3));
    }

    @Override // com.bytedance.android.live.base.service.IHostMonitorAndLog
    public final void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C09900aA.LJIIIZ(str, i, jSONObject, jSONObject2);
    }
}
