package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Lzc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56076Lzc extends O6R {
    public final /* synthetic */ C56075Lzb LJLJJI;

    public C56076Lzc(C56075Lzb c56075Lzb) {
        this.LJLJJI = c56075Lzb;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        o.LJIIIZ(bridgeName, "bridgeName");
        if (str.length() > 0) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("recommend_tab_id");
            if (optString == null) {
                optString = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.optInt("recommend_tab_index");
            InterfaceC56083Lzj shopContentAction = this.LJLJJI.getShopContentAction();
            if (shopContentAction != null) {
                shopContentAction.LJIILL(optString);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String optString2 = jSONObject.optString("personal_tab_pool_id");
            o.LJIIIIZZ(optString2, "json.optString(PERSONAL_TAB_POOL_ID)");
            linkedHashMap.put("personal_tab_pool_id", optString2);
            String optString3 = jSONObject.optString("recommend_tab_channel_tag");
            o.LJIIIIZZ(optString3, "json.optString(RECOMMEND_TAB_CHANNEL_TAG)");
            linkedHashMap.put("recommend_tab_channel_tag", optString3);
            InterfaceC56083Lzj shopContentAction2 = this.LJLJJI.getShopContentAction();
            if (shopContentAction2 != null) {
                shopContentAction2.LJIILLIIL(linkedHashMap);
            }
        }
    }
}
