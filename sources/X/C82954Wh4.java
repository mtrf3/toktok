package X;

import com.ss.android.ugc.aweme.ecommerce.core.jsb.GetInfoByOCRMethod;
import org.json.JSONObject;

/* renamed from: X.Wh4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82954Wh4 {
    public static void LIZ(InterfaceC37146Ehy interfaceC37146Ehy, InterfaceC36488ETs interfaceC36488ETs, JSONObject jSONObject) {
        String str;
        C36746EbW.LIZ(4, "ocr: GetInfoByOCRMethod enter");
        if (jSONObject != null) {
            C22780uw.LIZ.getClass();
            if (!C276216o.LJIIL.LJIIJJI) {
                C36746EbW.LIZ(4, "ocr: GetInfoByOCRMethod  init false");
                C82954Wh4 c82954Wh4 = GetInfoByOCRMethod.LJLJI;
                C82955Wh5 c82955Wh5 = new C82955Wh5(interfaceC37146Ehy, interfaceC36488ETs, jSONObject);
                c82954Wh4.getClass();
                if (!C85990Xow.LJIIIZ()) {
                    str = "https://f-p-va.isnssdk.com";
                } else {
                    str = "https://f-p.sgsnssdk.com";
                }
                C275916l c275916l = new C275916l(FKM.LIZ());
                c275916l.LJIJ = jSONObject.optString("merchant_user_id");
                c275916l.LJIILJJIL = jSONObject.optString("nonce");
                c275916l.LIZIZ = str;
                c275916l.LJIJI = c82955Wh5;
                C82950Wh0.LIZJ(c275916l);
                return;
            }
            C36746EbW.LIZ(4, "ocr: GetInfoByOCRMethod  init true");
            GetInfoByOCRMethod.LJLJI.getClass();
            new C533927r().LIZJ(new C78528Urs(jSONObject), new C36491ETv(interfaceC36488ETs, interfaceC37146Ehy), EnumC37847EtH.ALL);
            return;
        }
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZ(-1, "params is empty");
        }
        if (interfaceC37146Ehy == null) {
            return;
        }
        interfaceC37146Ehy.LIZ(-1, "params is empty");
    }
}
