package X;

import com.lynx.tasm.base.TraceEvent;
import org.json.JSONObject;

/* renamed from: X.VEd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79399VEd extends AbstractC50748Jvs implements InterfaceC79401VEf {
    @Override // X.AbstractC50748Jvs
    public final String LJIIIIZZ() {
        return "com.bytedance.lynx.service.monitor.LynxMonitorService";
    }

    @Override // X.InterfaceC79401VEf
    public final void reportCrashGlobalContextTag(String str, String str2) {
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.reportCrashGlobalContextTag");
        if (LJII()) {
            ((InterfaceC79401VEf) this.LIZIZ).reportCrashGlobalContextTag(str, str2);
        }
        TraceEvent.LJ("LynxMonitorServiceProxy.reportCrashGlobalContextTag");
    }

    @Override // X.InterfaceC79401VEf
    public final void reportImageStatus(String str, JSONObject jSONObject) {
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.reportImageStatus");
        if (LJII()) {
            ((InterfaceC79401VEf) this.LIZIZ).reportImageStatus("lynx_image_status", jSONObject);
        }
        TraceEvent.LJ("LynxMonitorServiceProxy.reportImageStatus");
    }

    @Override // X.InterfaceC79401VEf
    public final void reportTrailEvent(String str, JSONObject jSONObject) {
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.reportTrailEvent");
        if (LJII()) {
            ((InterfaceC79401VEf) this.LIZIZ).reportTrailEvent("lynx_inspector", jSONObject);
        }
        TraceEvent.LJ("LynxMonitorServiceProxy.reportTrailEvent");
    }

    @Override // X.InterfaceC79401VEf
    public final void reportResourceStatus(VNS vns, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.reportResourceStatus");
        if (LJII()) {
            ((InterfaceC79401VEf) this.LIZIZ).reportResourceStatus(vns, "res_loader_perf", jSONObject, null);
        }
        TraceEvent.LJ("LynxMonitorServiceProxy.reportResourceStatus");
    }

    @Override // X.InterfaceC79401VEf
    public final void formatEventReporter(VNS vns, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        TraceEvent.LIZIZ("LynxMonitorServiceProxy.formatEventReporter");
        if (LJII()) {
            ((InterfaceC79401VEf) this.LIZIZ).formatEventReporter(vns, "animax_performance", jSONObject, jSONObject2, jSONObject3);
        }
        TraceEvent.LJ("LynxMonitorServiceProxy.formatEventReporter");
    }
}
