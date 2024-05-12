package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.hybrid.web.extension.ttnet.TtnetRetrofitApi;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.ErO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37730ErO extends AbstractC60423NnX {
    public final /* synthetic */ C60532NpI LJLIL;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    public C37730ErO(C60532NpI c60532NpI) {
        this.LJLIL = c60532NpI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebResourceResponse LJJ(X.C64797Pbt r9, java.io.InputStream r10) {
        /*
            X.EeA r0 = r9.LIZ
            java.util.List<X.EJ6> r2 = r0.LIZLLL
            r3 = 0
            if (r2 == 0) goto L57
            r0 = 10
            int r0 = X.C32I.LJJL(r2, r0)
            int r1 = X.C51029K0z.LJJIIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L17
            r1 = 16
        L17:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r1)
            java.util.Iterator r4 = r2.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r4.next()
            X.EJ6 r0 = (X.EJ6) r0
            X.OSZ r2 = new X.OSZ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = r0.LIZIZ
            r2.<init>(r1, r0)
            java.lang.Object r1 = r2.getFirst()
            java.lang.Object r0 = r2.getSecond()
            r8.put(r1, r0)
            goto L20
        L41:
            java.lang.String r0 = "Content-Type"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4c
            goto L5a
        L4c:
            java.lang.String r0 = "content-type"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L58
            goto L5a
        L57:
            r8 = r3
        L58:
            java.lang.String r0 = "text/html; charset=UTF-8"
        L5a:
            X.Fin r2 = X.C39745Fin.LIZJ(r0)
            if (r2 != 0) goto L9a
            java.lang.String r4 = "text/html"
        L62:
            if (r2 == 0) goto L97
            java.nio.charset.Charset r0 = r2.LIZ(r3)
            if (r0 == 0) goto L97
            java.lang.String r5 = r0.toString()
            if (r5 == 0) goto L97
        L70:
            X.EeA r0 = r9.LIZ
            java.lang.String r1 = "raw()"
            kotlin.jvm.internal.o.LJFF(r0, r1)
            int r6 = r0.LIZIZ
            X.EeA r0 = r9.LIZ
            kotlin.jvm.internal.o.LJFF(r0, r1)
            java.lang.String r0 = r0.LIZJ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L8f
            java.lang.String r7 = "OK"
        L88:
            android.webkit.WebResourceResponse r3 = new android.webkit.WebResourceResponse
            r9 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L8f:
            X.EeA r0 = r9.LIZ
            kotlin.jvm.internal.o.LJFF(r0, r1)
            java.lang.String r7 = r0.LIZJ
            goto L88
        L97:
            java.lang.String r5 = "utf-8"
            goto L70
        L9a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r2.LIZIZ
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = r2.LIZJ
            r1.append(r0)
            java.lang.String r4 = X.X1D.LIZIZ(r1)
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37730ErO.LJJ(X.Pbt, java.io.InputStream):android.webkit.WebResourceResponse");
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJ(WebView webView, WebResourceRequest webResourceRequest) {
        android.net.Uri url;
        String str;
        ArrayList arrayList;
        InputStream inputStream;
        WebResourceResponse LJIJ = super.LJIJ(webView, webResourceRequest);
        if (LJIJ != null) {
            return LJIJ;
        }
        WebResourceResponse webResourceResponse = null;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return null;
        }
        if (url.getHost() != null && url.getScheme() != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(url.getScheme());
            LIZ.append("://");
            LIZ.append(url.getHost());
            LIZ.append("/");
            str = X1D.LIZIZ(LIZ);
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        java.util.Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders != null) {
            arrayList = new ArrayList(requestHeaders.size());
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                arrayList.add(new EJ6(entry.getKey(), entry.getValue()));
            }
        } else {
            arrayList = null;
        }
        String uri = url.toString();
        o.LJFF(uri, "requestUri.toString()");
        InterfaceC37276Ek4<TypedInput> streamRequest = ((TtnetRetrofitApi) C65083PgV.LJIIIIZZ(TtnetRetrofitApi.class, str)).streamRequest(uri, arrayList);
        C60625Nqn.LIZJ();
        C78949Uyf.LJIJJ("TtnetInterceptExtension");
        try {
            C64797Pbt<TypedInput> execute = streamRequest.execute();
            if (execute == null) {
                return null;
            }
            TypedInput typedInput = execute.LIZIZ;
            if (typedInput != null) {
                inputStream = typedInput.in();
            } else {
                inputStream = null;
            }
            if (inputStream == null) {
                streamRequest.cancel();
            }
            C78949Uyf.LJIJJ("TtnetInterceptExtension");
            webResourceResponse = LJJ(execute, inputStream);
            return webResourceResponse;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ttnetRequest ");
            LIZ2.append(e);
            X1D.LIZIZ(LIZ2);
            C78949Uyf.LJIJJ("TtnetInterceptExtension");
            streamRequest.cancel();
            return webResourceResponse;
        }
    }
}
