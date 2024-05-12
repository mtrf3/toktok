package X;

import Y.ACallableS33S1100000_6;
import Y.ACallableS7S2200000_6;
import Y.AgS123S0100000_6;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ec4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36780Ec4 implements InterfaceC36604EYe {
    public static final C36780Ec4 LJLIL = new C36780Ec4();
    public static final CommonApi LJLILLLLZI;

    static {
        Object obj;
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(CommonApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        LJLILLLLZI = (CommonApi) obj;
    }

    public static String LIZLLL(String str) {
        C38281F0r c38281F0r = new C38281F0r(str);
        List list = (List) c38281F0r.LIZIZ;
        if (list != null && (!list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (ujb.o.LJJJJIZL("request_tag_from", ((C66619QCp) it.next()).LJLIL, true)) {
                    break;
                }
            }
        }
        c38281F0r.LIZLLL("request_tag_from", "h5");
        String LJ = c38281F0r.LJ();
        o.LJIIIIZZ(LJ, "urlBuilder.build()");
        return LJ;
    }

    @Override // X.InterfaceC36604EYe
    public final void LJ(String url, java.util.Map<String, String> map, InterfaceC36606EYg callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(callback, "callback");
        C10K.LIZJ(new ACallableS33S1100000_6(map, url, 4)).LJ(new AgS123S0100000_6(callback, 11), C10K.LJIIIIZZ, null);
    }

    public static void LJFF(JSONObject jSONObject, int i, String str, String str2) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errCode", i);
                jSONObject2.put("prompts", str2);
                if (str != null) {
                    jSONObject2.put("message", str);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            jSONObject.put("response", jSONObject2);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    @Override // X.InterfaceC36604EYe
    public final void LIZ(String str, java.util.Map<String, String> map, boolean z, java.util.Map<String, String> map2, InterfaceC36606EYg interfaceC36606EYg) {
        C36603EYd.LIZ(this, str, map, interfaceC36606EYg);
    }

    @Override // X.InterfaceC36604EYe
    public final void LIZIZ(String url, java.util.Map<String, String> map, String str, JSONObject jSONObject, InterfaceC36606EYg callback) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(callback, "callback");
        C10K.LIZJ(new ACallableS7S2200000_6(url, str, map, jSONObject, 0)).LJ(new AgS123S0100000_6(callback, 12), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC36604EYe
    public final void LIZJ(String str, java.util.Map<String, String> map, String str2, JSONObject jSONObject, boolean z, java.util.Map<String, String> map2, InterfaceC36606EYg interfaceC36606EYg) {
        C36603EYd.LIZIZ(this, str, map, str2, jSONObject, interfaceC36606EYg);
    }
}
