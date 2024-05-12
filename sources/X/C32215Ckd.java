package X;

import org.json.JSONObject;

/* renamed from: X.Ckd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32215Ckd implements InterfaceC32251ClD {
    @Override // X.InterfaceC32251ClD
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC32251ClD
    public final void ensureNotReachHere(Throwable th, String str) {
        C0K2.LIZ(str, th);
    }

    @Override // X.InterfaceC32251ClD
    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.monitorStatusAndDuration(str, 0, jSONObject, jSONObject2);
    }

    @Override // X.InterfaceC32251ClD
    public final void monitorStatus(String str, int i, JSONObject jSONObject) {
        C0K2.LJIIIIZZ(str, i, jSONObject);
    }

    @Override // X.InterfaceC32251ClD
    public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C0K2.LJI(str, jSONObject, jSONObject2, jSONObject3);
    }
}
