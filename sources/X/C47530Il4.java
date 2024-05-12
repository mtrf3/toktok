package X;

import org.json.JSONObject;

/* renamed from: X.Il4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47530Il4 implements InterfaceC47535Il9 {
    public final /* synthetic */ C47529Il3 LIZ;

    public C47530Il4(C47529Il3 c47529Il3) {
        this.LIZ = c47529Il3;
    }

    @Override // X.InterfaceC47535Il9
    public final void LIZ(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
        } catch (Exception unused) {
        }
        this.LIZ.LJ().businessEvent(31214, jSONObject.toString());
    }
}
