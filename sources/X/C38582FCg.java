package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FCg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38582FCg extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC60761Nsz, String, Object, C76800UCe> {
    public static final C38582FCg LJLIL = new C38582FCg();

    public C38582FCg() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC60761Nsz interfaceC60761Nsz, String eventName, Object obj) {
        o.LJIIIZ(interfaceC60761Nsz, "<anonymous parameter 0>");
        o.LJIIIZ(eventName, "eventName");
        if (obj != null && o.LJ("onVariableHeightStateChanged", eventName)) {
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                String optString = jSONObject.optString("url");
                if (optString != null && !ujb.o.LJJJJJL(optString)) {
                    android.net.Uri parse = UriProtector.parse(optString);
                    String LJ = ED3.LJ(parse, "url");
                    String LJ2 = ED3.LJ(parse, "previous_page");
                    String LJ3 = ED3.LJ(parse, "enter_from");
                    String LJ4 = ED3.LJ(parse, "deeplink_type");
                    String optString2 = jSONObject.optString("state");
                    if (o.LJ(optString2, "onEnterNormalState")) {
                        optString2 = "seven_tenths_screen";
                    } else if (o.LJ(optString2, "onEnterExpandState")) {
                        optString2 = "full_screen";
                    }
                    String LJ5 = ED3.LJ(parse, "top_product_ids");
                    if (ujb.o.LJJJJJL(LJ5)) {
                        LJ5 = ED3.LJ(parse, "product_id_list");
                    }
                    C76542zS.LIZJ("tiktokec_enter_screen_type", new C38581FCf(LJ, LJ2, LJ3, LJ4, optString2, optString, LJ5, ED3.LJ(parse, "creative_id"), ED3.LJ(parse, "campaign_id")));
                }
            } catch (Throwable unused) {
            }
        }
        return C76800UCe.LIZ;
    }
}
