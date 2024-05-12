package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EwM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38038EwM implements InterfaceC37120EhY {
    public final /* synthetic */ C37948Euu LIZ;

    public C38038EwM(C37945Eur c37945Eur) {
        this.LIZ = c37945Eur;
    }

    @Override // X.InterfaceC37120EhY
    public final void LIZ(JSONObject data) {
        o.LJIIIZ(data, "data");
        this.LIZ.LIZ(1, "success", data);
    }

    @Override // X.InterfaceC37120EhY
    public final void onError(int i, String str) {
        this.LIZ.LIZ(i, str, null);
    }

    @Override // X.InterfaceC37120EhY
    public final void LIZIZ(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", i);
        jSONObject2.put("msg", str);
        jSONObject2.put("data", jSONObject);
        this.LIZ.LIZ(i, str, jSONObject2);
    }
}
