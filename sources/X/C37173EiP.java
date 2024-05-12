package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import defpackage.i0;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.EiP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37173EiP extends C59862NeU {
    public static final ConcurrentHashMap<C37176EiS, InterfaceC37175EiR> LJLJLJ = new ConcurrentHashMap<>();

    public C37173EiP() {
        super(6);
    }

    public static String LIZJ(android.net.Uri uri) {
        String host;
        String path;
        if (uri == null || (host = uri.getHost()) == null || (path = uri.getPath()) == null) {
            return null;
        }
        return i0.LJFF(host, path);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:21|(2:75|(6:77|(1:111)|79|(5:102|(3:105|(1:107)(1:108)|103)|109|110|(2:83|(4:85|86|87|88)(11:91|(1:93)|94|(4:96|(1:101)|98|(1:100))|27|(3:29|(1:73)(1:37)|(4:39|40|41|42)(2:45|(6:47|48|49|50|51|52)(1:72)))(1:74)|54|(2:56|(2:59|57))(1:65)|60|61|62)))(0)|81|(0)))(1:25)|26|27|(0)(0)|54|(0)(0)|60|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x023e, code lost:
    
        if (r0 == null) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    @Override // X.C59862NeU, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r22, android.webkit.WebResourceRequest r23) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37173EiP.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    public static void LJ(WebView webView, android.net.Uri uri, EnumC37174EiQ enumC37174EiQ) {
        Iterator<Map.Entry<C37176EiS, InterfaceC37175EiR>> it = LJLJLJ.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().LIZ();
        }
    }

    public static void LIZLLL(WebView webView, WebResourceRequest webResourceRequest, JSONObject jSONObject, JSONObject jSONObject2) {
        VMI vmi = VMI.LJ;
        C79605VMb c79605VMb = new C79605VMb("hybrid_web_inline_js_inject_ext");
        c79605VMb.LIZIZ = "web_inline_js_ext";
        c79605VMb.LIZIZ(2);
        c79605VMb.LIZ = webResourceRequest.getUrl().toString();
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LJ = jSONObject2;
        vmi.LJIILL(webView, c79605VMb.LIZ());
    }
}
