package X;

import Y.IDHandlerS19S0100000_6;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EwX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38049EwX implements InterfaceC38050EwY {
    public WebView LIZ;
    public String LIZIZ;
    public List<String> LIZJ;
    public List<String> LIZLLL;
    public List<String> LJ;
    public InterfaceC38047EwV LJI;
    public boolean LJII;
    public InterfaceC38051EwZ LJIIIIZZ;
    public InterfaceC38051EwZ LJIIIZ;
    public java.util.Map<String, InterfaceC38012Evw> LJFF = new HashMap();
    public final IDHandlerS19S0100000_6 LJIIJ = new IDHandlerS19S0100000_6(this, C16880lQ.LLJJJJ(), 0);

    public C38049EwX(WebView webView) {
        this.LIZ = webView;
        if (webView != null) {
            if ((webView instanceof C59617NaX) && !((C59617NaX) webView).LJLIL) {
                webView.setWebChromeClient(new WebChromeClient());
            }
            try {
                this.LIZ.getSettings().setJavaScriptEnabled(true);
            } catch (Exception unused) {
            }
        }
    }

    public final boolean LIZIZ(String str) {
        if (str == null || !str.startsWith(this.LIZIZ)) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ, this.LIZIZ, "://dispatch_message/", LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        String LJFF2 = JBR.LJFF(LIZ2, this.LIZIZ, "://private/setresult/", LIZ2);
        if (str.equals(LJFF)) {
            WebView webView = this.LIZ;
            if (webView != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("javascript:ToutiaoJSBridge");
                LIZ3.append(".");
                LIZ3.append("_fetchQueue");
                LIZ3.append("()");
                webView.evaluateJavascript(X1D.LIZIZ(LIZ3), new C38046EwU(this));
            }
            return true;
        }
        if (!str.startsWith(LJFF2)) {
            return false;
        }
        return true;
    }

    public final boolean LIZJ(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.LIZIZ)) {
            return false;
        }
        if (!this.LIZIZ.equals(UriProtector.parse(str).getScheme().toLowerCase()) || !LIZIZ(str)) {
            return false;
        }
        return true;
    }

    public final boolean LJFF(String str) {
        String host;
        List<String> list;
        if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT < 27) {
                int indexOf = str.indexOf(92);
                if (indexOf == -1) {
                    host = UriProtector.parse(str).getHost();
                } else {
                    host = UriProtector.parse(str.substring(0, indexOf)).getHost();
                }
            } else {
                host = UriProtector.parse(str).getHost();
            }
            if (host != null && (list = this.LIZJ) != null && !list.isEmpty()) {
                for (int i = 0; i < this.LIZJ.size(); i++) {
                    String str2 = (String) ListProtector.get(this.LIZJ, i);
                    if (!host.equals(str2)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append('.');
                        LIZ.append(str2);
                        if (!host.endsWith(X1D.LIZIZ(LIZ))) {
                        }
                    }
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void LJIIIZ(JSONObject jSONObject) {
        WebView webView = this.LIZ;
        if (webView != null) {
            StringBuilder LIZLLL = C1FL.LIZLLL("javascript:ToutiaoJSBridge", ".", "_handleMessageFromToutiao", "(");
            LIZLLL.append(jSONObject.toString());
            LIZLLL.append(")");
            C38053Ewb.LIZ(webView, X1D.LIZIZ(LIZLLL));
        }
    }

    public final void LJIIJ(WebViewClient webViewClient) {
        WebView webView = this.LIZ;
        if (webView == null) {
            return;
        }
        if (webViewClient instanceof C59589Na5) {
            ((C59589Na5) webViewClient).LJLIL = this;
        }
        C16880lQ.LLZLI(webView, webViewClient);
    }

    public final void LIZLLL(String str, JSONObject jSONObject) {
        InterfaceC38051EwZ interfaceC38051EwZ = this.LJIIIZ;
        if (interfaceC38051EwZ != null && interfaceC38051EwZ.LIZ(1, str, jSONObject) != null) {
            return;
        }
        InterfaceC38051EwZ interfaceC38051EwZ2 = this.LJIIIIZZ;
        if (interfaceC38051EwZ2 != null && interfaceC38051EwZ2.LIZ(1, str, jSONObject) != null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            LJIIIZ(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public final void LJI(String str, InterfaceC38012Evw interfaceC38012Evw) {
        if (TextUtils.isEmpty(str) || interfaceC38012Evw == null) {
            return;
        }
        ((HashMap) this.LJFF).put(str, interfaceC38012Evw);
    }

    public final void LJII(C38048EwW c38048EwW, JSONObject jSONObject) {
        C37969EvF c37969EvF = new C37969EvF("bridge", "call", c38048EwW.LIZJ, 1, "IESJSBridge", this.LIZ);
        String str = c38048EwW.LIZIZ;
        if (str != null && str.contains("SANDBOX_PREFIX")) {
            c37969EvF.LJIILL = 1;
        }
        try {
            c37969EvF.LJIILJJIL = Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "code"));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c37969EvF.LIZIZ();
    }

    public final void LJIIIIZZ(String str, JSONObject jSONObject) {
        InterfaceC38051EwZ interfaceC38051EwZ = this.LJIIIZ;
        if (interfaceC38051EwZ != null && interfaceC38051EwZ.LIZ(2, str, jSONObject) != null) {
            return;
        }
        InterfaceC38051EwZ interfaceC38051EwZ2 = this.LJIIIIZZ;
        if (interfaceC38051EwZ2 != null && interfaceC38051EwZ2.LIZ(2, str, jSONObject) != null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            LJIIIZ(jSONObject2);
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC38050EwY
    public final void LIZ(List<String> list, C38048EwW c38048EwW, JSONObject jSONObject) {
        this.LJ = list;
        if (!TextUtils.isEmpty(c38048EwW.LJI)) {
            LJ(c38048EwW.LJI, c38048EwW.LIZIZ, jSONObject);
        } else {
            LIZLLL(c38048EwW.LIZIZ, jSONObject);
        }
    }

    public final void LJ(String str, String str2, JSONObject jSONObject) {
        InterfaceC38051EwZ interfaceC38051EwZ = this.LJIIIZ;
        if (interfaceC38051EwZ != null && interfaceC38051EwZ.LIZ(1, str2, jSONObject) != null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str2);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            WebView webView = this.LIZ;
            if (webView != null) {
                C38053Ewb.LIZ(webView, C16880lQ.LLLZ("javascript:(function(){   const iframe = document.querySelector('iframe[src=\"%s\"');   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, '%s');   }})()", new Object[]{str, jSONObject2.toString(), str}));
            }
        } catch (Exception unused) {
        }
    }
}
