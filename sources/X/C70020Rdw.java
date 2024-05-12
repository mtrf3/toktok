package X;

import org.json.JSONObject;

/* renamed from: X.Rdw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70020Rdw<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;

    public C70020Rdw(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        JSONObject jSONObject = new JSONObject();
        String str = this.LJLIL;
        jSONObject.put(WM7.SCENE_SERVICE, "tt_anchor_prefetch");
        jSONObject.put("step", "response");
        if (str == null) {
            str = "";
        }
        jSONObject.put("source_page_type", str);
        jSONObject.put("is_success", 0);
        C48658J7u.LIZIZ("rd_ec_pdp_prefetch", jSONObject);
    }
}
