package X;

import com.lynx.tasm.base.TraceEvent;
import org.json.JSONObject;

/* renamed from: X.VEc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79398VEc extends AbstractC50748Jvs implements InterfaceC79400VEe {
    @Override // X.AbstractC50748Jvs
    public final String LJIIIIZZ() {
        return "com.bytedance.lynx.service.applog.LynxApplogService";
    }

    @Override // X.InterfaceC79400VEe
    public final String getDeviceID() {
        String str;
        TraceEvent.LIZIZ("LynxApplogServiceProxy.getDeviceID");
        if (LJII()) {
            str = ((InterfaceC79400VEe) this.LIZIZ).getDeviceID();
        } else {
            str = "";
        }
        TraceEvent.LJ("LynxApplogServiceProxy.getDeviceID");
        return str;
    }

    @Override // X.InterfaceC79400VEe
    public final void onTimingSetup(java.util.Map<String, Object> map, JSONObject jSONObject) {
        TraceEvent.LIZIZ("LynxApplogServiceProxy.onTimingSetup");
        if (LJII()) {
            ((InterfaceC79400VEe) this.LIZIZ).onTimingSetup(map, jSONObject);
        }
        TraceEvent.LJ("LynxApplogServiceProxy.onTimingSetup");
    }

    @Override // X.InterfaceC79400VEe
    public final void onReportEvent(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        TraceEvent.LIZIZ("LynxApplogServiceProxy.onReportEvent");
        if (LJII()) {
            ((InterfaceC79400VEe) this.LIZIZ).onReportEvent(str, jSONObject, jSONObject2);
        }
        TraceEvent.LJ("LynxApplogServiceProxy.onReportEvent");
    }

    @Override // X.InterfaceC79400VEe
    public final void onTimingUpdate(java.util.Map<String, Object> map, java.util.Map<String, Long> map2, JSONObject jSONObject) {
        TraceEvent.LIZIZ("LynxApplogServiceProxy.onTimingUpdate");
        if (LJII()) {
            ((InterfaceC79400VEe) this.LIZIZ).onTimingUpdate(map, map2, jSONObject);
        }
        TraceEvent.LJ("LynxApplogServiceProxy.onTimingUpdate");
    }
}
