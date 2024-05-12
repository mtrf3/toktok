package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Lzg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56080Lzg extends O6R {
    public final /* synthetic */ C56075Lzb LJLJJI;

    public C56080Lzg(C56075Lzb c56075Lzb) {
        this.LJLJJI = c56075Lzb;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        String str2;
        o.LJIIIZ(bridgeName, "bridgeName");
        JSONObject jSONObject = new JSONObject();
        InterfaceC56083Lzj shopContentAction = this.LJLJJI.getShopContentAction();
        if (shopContentAction == null || (str2 = shopContentAction.LJIJI()) == null) {
            str2 = "";
        }
        jSONObject.put("previous_page", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", jSONObject);
        jSONObject2.put("code", 1);
        c37945Eur.LIZ(1, "success", jSONObject2);
    }
}
