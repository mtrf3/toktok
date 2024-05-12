package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BfF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29333BfF implements EX0 {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LIZ;
    public final /* synthetic */ C31894CfS LIZIZ;

    @Override // X.EX0
    public final void LIZ(java.util.Map<String, ? extends Object> invokeParam) {
        Object obj;
        o.LJIIIZ(invokeParam, "invokeParam");
        java.util.Map LJJLIL = C113554cx.LJJLIL(invokeParam);
        if (!this.LIZ.invoke().booleanValue() && (obj = ((LinkedHashMap) LJJLIL).get("data")) != null && (obj instanceof java.util.Map)) {
            LJJLIL.remove("data");
            LJJLIL.putAll((java.util.Map) obj);
        }
        this.LIZIZ.finishWithRawResult(new JSONObject(LJJLIL));
    }

    public C29333BfF(InterfaceC65784Pro<Boolean> interfaceC65784Pro, C31894CfS c31894CfS) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = c31894CfS;
    }
}
