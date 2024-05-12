package X;

import org.json.JSONObject;

/* renamed from: X.UzX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79003UzX implements InterfaceC06380Mw {
    public static final C79003UzX LJLIL = new C79003UzX();

    @Override // X.InterfaceC06380Mw
    public final void onEventV3(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.put("app_region", C85990Xow.LIZIZ());
        }
        if (str == null) {
            str = "";
        }
        C48658J7u.LIZIZ(str, jSONObject);
    }
}
