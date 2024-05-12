package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.MallShopCartAssem;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.LvP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55815LvP extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ MallShopCartAssem LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55815LvP(MallShopCartAssem mallShopCartAssem, Context context, String str, String str2) {
        super(0);
        this.LJLIL = mallShopCartAssem;
        this.LJLILLLLZI = context;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.getClass();
        C54741Le5 c54741Le5 = ShopMainFragment.LJZ;
        c54741Le5.getClass();
        String str = null;
        if (C54741Le5.LIZIZ()) {
            View shopping_cart = this.LJLIL._$_findCachedViewById(R.id.jys);
            o.LJIIIIZZ(shopping_cart, "shopping_cart");
            C39468FeK.LJFF(shopping_cart, EnumC46489IMj.TOP_MALL_RIGHT_SHOP_CAR.getCCode(), EnumC55816LvQ.DEFAULT_D_CODE.getDCode(), C0JU.LIZ("origin_is_mall_tab", "homepage_mall"), null);
        }
        Context context = this.LJLILLLLZI;
        MallShopCartAssem mallShopCartAssem = this.LJLIL;
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI;
        mallShopCartAssem.getClass();
        if (!TextUtils.isEmpty(str2)) {
            try {
                android.net.Uri parse = UriProtector.parse(str2);
                String queryParameter = UriProtector.getQueryParameter(parse, "trackParams");
                if (queryParameter != null) {
                    JSONObject jSONObject = new JSONObject(queryParameter);
                    c54741Le5.getClass();
                    if (C54741Le5.LIZIZ()) {
                        if (jSONObject.has("enter_from")) {
                            C56092Lzs.LIZ.getClass();
                            jSONObject.put("enter_from", C56092Lzs.LIZJ());
                        }
                        if (str3 != null) {
                            jSONObject.put("enter_method", str3);
                        }
                    }
                    if (!jSONObject.has("traffic_source_list")) {
                        jSONObject.putOpt("traffic_source_list", new JSONArray(new int[]{6}));
                    }
                    String uri = parse.toString();
                    o.LJIIIIZZ(uri, "targetUri.toString()");
                    OJD ojd = new OJD("(trackParams=[^&]*)");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("trackParams=");
                    LIZ.append(URLEncoder.encode(jSONObject.toString(), "UTF-8"));
                    str2 = ojd.replace(uri, X1D.LIZIZ(LIZ));
                    str = queryParameter;
                }
                C3C5.m7constructorimpl(str);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            C36746EbW.LIZ(3, str2);
        }
        C26867AgZ.LIZIZ(context, str2, new LinkedHashMap(), false).open();
        return C76800UCe.LIZ;
    }
}
