package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Lzf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56079Lzf extends O6R {
    public final /* synthetic */ C56075Lzb LJLJJI;

    public C56079Lzf(C56075Lzb c56075Lzb) {
        this.LJLJJI = c56075Lzb;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        C56085Lzl LJIIZILJ;
        o.LJIIIZ(bridgeName, "bridgeName");
        JSONObject jSONObject = new JSONObject();
        InterfaceC56083Lzj shopContentAction = this.LJLJJI.getShopContentAction();
        if (shopContentAction != null && (LJIIZILJ = shopContentAction.LJIIZILJ()) != null) {
            boolean z = LJIIZILJ.LJLILLLLZI;
            int i = LJIIZILJ.LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ec_mall_scroll, isFull=");
            LIZ.append(z);
            LIZ.append(", recommendShowHeight = ");
            LIZ.append(i);
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
            jSONObject.put("recommend_is_full", z);
            jSONObject.put("recommend_h_px", i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("code", 1);
            c37945Eur.LIZ(1, "success", jSONObject2);
        }
    }
}
