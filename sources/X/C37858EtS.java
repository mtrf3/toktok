package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EtS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37858EtS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC37673EqT callback) {
        o.LJIIJ(callback, "callback");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", -2);
        jSONObject.put("data", new JSONObject());
        jSONObject.put("msg", "The JSBridge method is not found, please register");
        callback.LIZ(jSONObject);
    }
}
