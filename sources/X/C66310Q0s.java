package X;

import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Q0s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66310Q0s implements IEventMonitor {
    public static IEventMonitor LIZ;
    public static final C66310Q0s LIZIZ = new C66310Q0s();

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorCommonLog(String logType, JSONObject jSONObject) {
        o.LJIIIZ(logType, "logType");
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorDuration(String serviceName, JSONObject jSONObject, JSONObject jSONObject2) {
        o.LJIIIZ(serviceName, "serviceName");
        IEventMonitor iEventMonitor = LIZ;
        if (iEventMonitor != null) {
            iEventMonitor.monitorDuration(serviceName, jSONObject, jSONObject2);
        }
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorStatusRate(String serviceName, int i, JSONObject jSONObject) {
        o.LJIIIZ(serviceName, "serviceName");
        IEventMonitor iEventMonitor = LIZ;
        if (iEventMonitor != null) {
            iEventMonitor.monitorStatusRate(serviceName, i, jSONObject);
        }
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorEvent(String serviceName, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        o.LJIIIZ(serviceName, "serviceName");
        IEventMonitor iEventMonitor = LIZ;
        if (iEventMonitor != null) {
            iEventMonitor.monitorEvent(serviceName, jSONObject, jSONObject2, jSONObject3);
        }
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorStatusAndDuration(String serviceName, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        o.LJIIIZ(serviceName, "serviceName");
        IEventMonitor iEventMonitor = LIZ;
        if (iEventMonitor != null) {
            iEventMonitor.monitorStatusAndDuration(serviceName, i, jSONObject, jSONObject2);
        }
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IEventMonitor
    public final void monitorStatusAndEvent(String serviceName, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        o.LJIIIZ(serviceName, "serviceName");
        IEventMonitor iEventMonitor = LIZ;
        if (iEventMonitor != null) {
            iEventMonitor.monitorStatusAndEvent(serviceName, i, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
