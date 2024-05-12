package X;

import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NdQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59796NdQ implements IMonitorDepend {
    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void monitorCommonLog(String logType, JSONObject jSONObject) {
        o.LJIIIZ(logType, "logType");
        FUA.LIZJ(logType, jSONObject);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void ensureNotReachHere(Throwable e, String str, java.util.Map<String, String> map) {
        o.LJIIIZ(e, "e");
        PEH.LJ(e, str, map);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void monitorStatusRate(String serviceName, int i, JSONObject jSONObject) {
        o.LJIIIZ(serviceName, "serviceName");
        C09900aA.LJIIJJI(serviceName, i, jSONObject);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void monitorStatusAndDuration(String serviceName, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        o.LJIIIZ(serviceName, "serviceName");
        C09900aA.LJIIIZ(serviceName, i, jSONObject, jSONObject2);
    }
}
