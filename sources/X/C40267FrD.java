package X;

import org.json.JSONObject;

/* renamed from: X.FrD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40267FrD implements InterfaceC38012Evw {
    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str = "h5";
        if (c38048EwW != null && (jSONObject2 = c38048EwW.LIZLLL) != null) {
            str = jSONObject2.optString("logout_from", "h5");
        }
        HG3.LJIIIIZZ().logout(str, "user_logout");
    }
}
