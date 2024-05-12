package X;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JDZ implements InterfaceC35766E1y {
    @Override // X.InterfaceC35766E1y
    public void onEvent(String str) {
        if (str != null) {
            JDX.LIZIZ(null, str);
        }
    }

    @Override // X.InterfaceC35766E1y
    public final void onEvent(String str, java.util.Map<String, String> map) {
        if (str != null) {
            JDX.LIZIZ(map, str);
        }
    }

    @Override // X.InterfaceC35766E1y
    public final void onEvent(String str, JSONObject jSONObject) {
        if (str != null) {
            JDX.LIZIZ(jSONObject, str);
        }
    }
}
