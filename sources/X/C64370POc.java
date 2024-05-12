package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.POc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64370POc extends C64371POd {
    public final String LIZLLL;

    @Override // X.PIQ
    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", this.LIZ);
        jSONObject.put("status", this.LIZIZ);
        jSONObject.put("duration", this.LIZJ);
        jSONObject.put("x-tt-logid", this.LIZLLL);
        return jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64370POc(String logId, String str, int i, long j) {
        super(str, i, j);
        o.LJIIIZ(logId, "logId");
        this.LIZLLL = logId;
    }
}
