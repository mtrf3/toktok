package X;

import com.ss.ugc.live.sdk.message.interfaces.ILogger;
import com.ss.ugc.live.sdk.message.interfaces.IMonitor;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YMB implements ILogger, IMonitor {
    public final ILogger LJLIL;
    public final IMonitor LJLILLLLZI;
    public final double LJLJI;

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public final void log(String str, String str2) {
        this.LJLIL.log(str, str2);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LJLILLLLZI.monitor(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorLatency(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LJLILLLLZI.monitorLatency(str, j, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorStatus(String str, int i, JSONObject jSONObject) {
        this.LJLILLLLZI.monitorStatus(str, i, jSONObject);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.ILogger
    public final boolean supportDebugInfo() {
        return this.LJLIL.supportDebugInfo();
    }

    public YMB(ILogger logger, IMonitor monitor, double d) {
        o.LJIIIZ(logger, "logger");
        o.LJIIIZ(monitor, "monitor");
        this.LJLIL = logger;
        this.LJLILLLLZI = monitor;
        this.LJLJI = d;
    }
}
