package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes10.dex */
public final class M02 {
    public static void LIZ(Intent intent, InterfaceC88472Yns interfaceC88472Yns) {
        C76800UCe c76800UCe;
        String str;
        String str2;
        JSONObject jSONObject;
        String LLJJIJIIJIL;
        if (intent == null) {
            c76800UCe = null;
        } else {
            try {
                try {
                    String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "extra_route_schema");
                    if (LLJJIJIIJIL2 == null || o.LJJJJJL(LLJJIJIIJIL2)) {
                        c76800UCe = C76800UCe.LIZ;
                    } else {
                        intent.removeExtra("extra_route_schema");
                        ShopMainFragment.LJZ.getClass();
                        if (ShopMainFragment.LLFZ) {
                            ShopMainFragment.LLFZ = false;
                            interfaceC88472Yns.invoke(new M03(LLJJIJIIJIL2, true, 64));
                            return;
                        }
                        android.net.Uri parse = UriProtector.parse(LLJJIJIIJIL2);
                        if (parse.isHierarchical()) {
                            String queryParameter = UriProtector.getQueryParameter(parse, "mall_extra_info");
                            str = UriProtector.getQueryParameter(parse, "previous_page");
                            str2 = UriProtector.getQueryParameter(parse, "enter_method");
                            if (queryParameter != null) {
                                try {
                                } catch (Exception unused) {
                                    jSONObject = null;
                                }
                                if (!o.LJJJJJL(queryParameter)) {
                                    jSONObject = new JSONObject(queryParameter);
                                    String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "diversion_params");
                                    String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "extra_product_id");
                                    intent.removeExtra("extra_product_id");
                                    LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_non_click_open_from");
                                    if (LLJJIJIIJIL != null || o.LJJJJJL(LLJJIJIIJIL)) {
                                        LLJJIJIIJIL = null;
                                    }
                                    interfaceC88472Yns.invoke(new M03(str, jSONObject, LLJJIJIIJIL3, LLJJIJIIJIL2, LLJJIJIIJIL, LLJJIJIIJIL4, str2, false));
                                    return;
                                }
                            }
                        } else {
                            str = null;
                            str2 = null;
                        }
                        jSONObject = new JSONObject();
                        String LLJJIJIIJIL32 = C16880lQ.LLJJIJIIJIL(intent, "diversion_params");
                        String LLJJIJIIJIL42 = C16880lQ.LLJJIJIIJIL(intent, "extra_product_id");
                        intent.removeExtra("extra_product_id");
                        LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_non_click_open_from");
                        if (LLJJIJIIJIL != null) {
                        }
                        LLJJIJIIJIL = null;
                        interfaceC88472Yns.invoke(new M03(str, jSONObject, LLJJIJIIJIL32, LLJJIJIIJIL2, LLJJIJIIJIL, LLJJIJIIJIL42, str2, false));
                        return;
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
        interfaceC88472Yns.invoke(null);
    }
}
