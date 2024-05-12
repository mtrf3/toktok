package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LzH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56055LzH implements InterfaceC03360Bg {
    public final /* synthetic */ ShopMainContentAssem LJLIL;

    public C56055LzH(ShopMainContentAssem shopMainContentAssem) {
        this.LJLIL = shopMainContentAssem;
    }

    @Override // X.InterfaceC03360Bg
    public final void LJ() {
        this.LJLIL.getClass();
        FCG fcg = FCH.LIZIZ;
        EnumC56057LzJ refreshType = EnumC56057LzJ.START;
        o.LJIIIZ(refreshType, "refreshType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eventType", refreshType.getValue());
        fcg.getClass();
        FCG.LIZ("ec_mall_refresh", jSONObject);
        ShopMainContentAssem shopMainContentAssem = this.LJLIL;
        shopMainContentAssem.x3().mv0(false, true);
        shopMainContentAssem.x3().nv0(false, true);
    }
}
