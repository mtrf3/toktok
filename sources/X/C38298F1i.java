package X;

import Y.ACallableS109S0100000_6;
import Y.ACallableS78S0101000_6;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.F1i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38298F1i implements F1L {
    public final C38048EwW LIZ;
    public final Handler LIZIZ;
    public final C38049EwX LIZJ;
    public final F1M LIZLLL;
    public final F1G LJ;
    public C38891fp LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public JSONObject LJIIIZ;
    public JSONObject LJIIJ;
    public List<EJ6> LJIIJJI;
    public String LJIIL;
    public Exception LJIILIIL;
    public final ACallableS109S0100000_6 LJIILJJIL = new ACallableS109S0100000_6(this, 39);
    public final ACallableS78S0101000_6 LJIILL = new ACallableS78S0101000_6(1, this, 8);
    public final ACallableS109S0100000_6 LJIILLIIL = new ACallableS109S0100000_6(this, 40);
    public final ACallableS109S0100000_6 LJIIZILJ = new ACallableS109S0100000_6(this, 41);
    public final CommonApi LJIJ = (CommonApi) C46104I7o.LJIIZILJ(com.ss.android.ugc.aweme.app.api.Api.LIZ, CommonApi.class);

    static {
        C16880lQ.LJLLJ(C38298F1i.class);
    }

    @Override // X.F1L
    public final void execute() {
        WebView webView;
        C38048EwW c38048EwW = this.LIZ;
        this.LJI = c38048EwW.LIZIZ;
        JSONObject jSONObject = c38048EwW.LIZLLL;
        this.LJII = jSONObject.optString("url", "");
        this.LJIIIIZZ = jSONObject.optString("method", "get");
        this.LJIIIZ = jSONObject.optJSONObject("params");
        this.LJIIJ = jSONObject.optJSONObject("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            this.LJIIJJI = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(optString)) {
                    ((ArrayList) this.LJIIJJI).add(new EJ6(next, optString));
                    if ("content-type".equalsIgnoreCase(next)) {
                        this.LJIIL = optString;
                    }
                }
            }
        }
        C38049EwX c38049EwX = this.LIZJ;
        if (c38049EwX != null && (webView = c38049EwX.LIZ) != null) {
            List<EJ6> LJIJ = a.LJFF().LJIJ(webView, "Web/JSB/fetch");
            if (!LJIJ.isEmpty()) {
                if (this.LJIIJJI == null) {
                    this.LJIIJJI = new ArrayList();
                }
                ((ArrayList) this.LJIIJJI).addAll(LJIJ);
            }
        }
        this.LJFF = new C38891fp();
        if ("get".equalsIgnoreCase(this.LJIIIIZZ)) {
            FGR.LIZIZ().LIZ(this.LIZIZ, this.LJIILJJIL, 25);
            return;
        }
        if ("post".equalsIgnoreCase(this.LJIIIIZZ)) {
            FGR.LIZIZ().LIZ(this.LIZIZ, this.LJIILL, 32);
        } else if ("put".equalsIgnoreCase(this.LJIIIIZZ)) {
            FGR.LIZIZ().LIZ(this.LIZIZ, this.LJIILLIIL, 33);
        } else {
            if (!"delete".equalsIgnoreCase(this.LJIIIIZZ)) {
                return;
            }
            FGR.LIZIZ().LIZ(this.LIZIZ, this.LJIIZILJ, 34);
        }
    }

    public final String LIZIZ(String str) {
        boolean z;
        EF7.LIZIZ();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            return (String) com.ss.android.ugc.aweme.app.api.Api.LJII(this.LJIJ.doDelete(str, this.LJIIJJI).execute().LIZIZ, C38300F1k.LIZ, null, str);
        }
        throw new IOException();
    }

    public final String LIZJ(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EJ6 ej6 = (EJ6) it.next();
            if ("x-tt-logid".equals(ej6.LIZ.toLowerCase())) {
                return ej6.LIZIZ;
            }
        }
        return "";
    }

    public final String LIZ(String str, JSONObject jSONObject) {
        C38281F0r c38281F0r = new C38281F0r(str);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                c38281F0r.LIZLLL(next, jSONObject.optString(next, ""));
            }
        }
        if (this.LJFF != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        c38281F0r.LIZLLL(str2, str3);
                    }
                }
            }
        }
        List list = (List) c38281F0r.LIZIZ;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if ("request_tag_from".equalsIgnoreCase(((C66619QCp) it.next()).LJLIL)) {
                    break;
                }
            }
        }
        c38281F0r.LIZLLL("request_tag_from", "h5");
        return c38281F0r.LJ();
    }

    public final void LIZLLL(JSONObject jSONObject, int i, String str, String str2) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errCode", i);
                jSONObject2.put("message", str);
                jSONObject2.put("prompts", str2);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            jSONObject.put("response", jSONObject2);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public C38298F1i(final C38048EwW c38048EwW, JSONObject jSONObject, C38049EwX c38049EwX, F1M f1m, F1G f1g) {
        this.LIZ = c38048EwW;
        this.LIZJ = c38049EwX;
        this.LIZLLL = f1m;
        this.LJ = f1g;
        this.LIZIZ = new Handler(C16880lQ.LLJJJJ(), new Handler.Callback() { // from class: X.F1g
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                JSONObject jSONObject2;
                C38298F1i c38298F1i = C38298F1i.this;
                C38048EwW c38048EwW2 = c38048EwW;
                c38298F1i.getClass();
                int i = message.what;
                if (i == 25 || i == 32 || i == 33 || i == 34) {
                    Object obj = message.obj;
                    if (obj == null) {
                        return true;
                    }
                    try {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        if (c38298F1i.LJ != null) {
                            F1F f1f = new F1F(c38298F1i.LJIIIIZZ, c38298F1i.LIZ(c38298F1i.LJII, c38298F1i.LJIIIZ), c38298F1i.LJIIJ);
                            if (jSONObject3.has("response")) {
                                jSONObject2 = jSONObject3.optJSONObject("response");
                            } else {
                                jSONObject2 = null;
                            }
                            c38298F1i.LJ.LIZ(f1f, new F1E(c38298F1i.LJIILIIL, jSONObject2));
                        }
                        if (c38298F1i.LIZJ != null && !TextUtils.isEmpty(c38298F1i.LJI) && !c38048EwW2.LJII.booleanValue()) {
                            c38298F1i.LIZJ.LIZLLL(c38298F1i.LJI, jSONObject3);
                        } else {
                            F1M f1m2 = c38298F1i.LIZLLL;
                            if (f1m2 != null) {
                                f1m2.LIZ(jSONObject3);
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                return false;
            }
        });
    }
}