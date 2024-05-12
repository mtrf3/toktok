package X;

import com.bytedance.helios.api.consumer.ApmEvent;
import java.util.Map;

/* renamed from: X.PPc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64396PPc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, float f) {
        ApmEvent apmEvent = new ApmEvent("rule_engine_execute_result");
        apmEvent.LIZ(Boolean.TRUE, "ttm");
        apmEvent.LIZ(str, "engine");
        apmEvent.LIZ(str2, "source");
        apmEvent.mMetrics.put(str3, Float.valueOf(f));
        C66059PwF.LIZIZ(apmEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(String str, String str2, String str3, java.util.Map map) {
        ApmEvent apmEvent = new ApmEvent("rule_engine_execute_result");
        apmEvent.LIZ(Boolean.TRUE, "ttm");
        apmEvent.LIZ(str, "engine");
        apmEvent.LIZ(str2, "source");
        if (str3 != null) {
            apmEvent.LIZ(str3, "signature");
        }
        for (Map.Entry entry : map.entrySet()) {
            apmEvent.mMetrics.put(entry.getKey(), Float.valueOf(((Number) entry.getValue()).floatValue()));
        }
        C66059PwF.LIZIZ(apmEvent);
    }
}
