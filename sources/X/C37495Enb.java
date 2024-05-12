package X;

import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: X.Enb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37495Enb implements InterfaceC37474EnG {
    public static final C37495Enb LIZ = new C37495Enb();

    @Override // X.InterfaceC37474EnG
    public final void LIZ(String str, WebView webView, java.util.Map<String, Object> map, java.util.Map<String, Object> map2) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = new JSONObject();
        }
        if (map2 != null) {
            jSONObject2 = new JSONObject(map2);
        } else {
            jSONObject2 = new JSONObject();
        }
        VMI.LJ.LJIJI(webView, str, jSONObject, jSONObject2);
    }
}
