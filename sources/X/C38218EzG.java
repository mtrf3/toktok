package X;

import org.json.JSONObject;

/* renamed from: X.EzG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38218EzG implements InterfaceC79582VLe {
    @Override // X.InterfaceC79582VLe
    public final void LIZ(JSONObject jSONObject) {
        try {
            C09900aA.LJI("bd_hybrid_monitor_service_all_in_one", null, null, jSONObject);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("apm upload: ");
            LIZ.append("bd_hybrid_monitor_service_all_in_one");
            X1D.LIZIZ(LIZ);
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }
}
