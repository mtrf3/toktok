package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.tiktok.security.csrf.BlockRuleBean;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.EiE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37162EiE extends C59862NeU {
    public final ExecutorService LJLJLJ;

    public C37162EiE(ExecutorService executorService) {
        super(7);
        this.LJLJLJ = executorService;
    }

    public static C37164EiG LIZLLL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\n                <html>\n                <body>\n                <font size=\"10\" face=\"arial\" color=\"red\">");
        LIZ.append(str);
        LIZ.append("</font>\n                </body>\n                <html>\n        ");
        byte[] bytes = C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ)).getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        return new C37164EiG(str, new ByteArrayInputStream(bytes));
    }

    public static boolean LJ(String str) {
        Object obj;
        if (str == null) {
            return false;
        }
        Iterator it = ((ArrayList) C64734Pas.LJIIIZ(EF7.LIZIZ()).LJIIJ()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (ujb.o.LJJJJ(str, (String) obj, false)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return C78685UuP.LJJJZ((String) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(X.C37163EiF r9) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37162EiE.LIZJ(X.EiF):boolean");
    }

    public static boolean LJI(String str, List list) {
        Object obj;
        if (str == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (ujb.o.LJJJLIIL(str, (String) obj, false)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return C78685UuP.LJJJZ((String) obj);
    }

    public static boolean LJII(String str, List list) {
        if (str == null) {
            return false;
        }
        for (Object obj : list) {
            BlockRuleBean blockRuleBean = (BlockRuleBean) obj;
            if (ujb.o.LJJJLIIL(str, blockRuleBean.prefix, false) && ujb.o.LJJJJ(str, blockRuleBean.suffix, false)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        android.net.Uri uri;
        Object LIZ;
        Objects.toString(webView);
        String str = null;
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        Objects.toString(uri);
        try {
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (webView != null && webResourceRequest != null) {
            String method = webResourceRequest.getMethod();
            o.LJIIIIZZ(method, "request.method");
            android.net.Uri url = webResourceRequest.getUrl();
            if (url != null) {
                str = url.toString();
            }
            java.util.Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            o.LJIIIIZZ(requestHeaders, "request.requestHeaders");
            if (LIZJ(new C37163EiF(requestHeaders, method, 0, str))) {
                C37164EiG LIZLLL = LIZLLL("found crossite request, cause it may reveal cookie, so block it! ".concat(""));
                return new WebResourceResponse(LIZLLL.LIZ, LIZLLL.LIZIZ, LIZLLL.LIZJ, LIZLLL.LIZLLL, LIZLLL.LJ, LIZLLL.LJFF);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                m10exceptionOrNullimpl.toString();
                C39016FSy.LIZ(30, m10exceptionOrNullimpl);
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public static boolean LJFF(String str, String str2, String str3) {
        Object LIZ;
        String host;
        String host2;
        if (str == null || !LJII(str, C37165EiH.LIZ().postApiBlockList)) {
            return false;
        }
        try {
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (str2 != null) {
            android.net.Uri parse = UriProtector.parse(str2);
            if (LJ(parse.getHost()) || (host2 = parse.getHost()) == null || ujb.o.LJJJJ(str, host2, false)) {
                return false;
            }
            return true;
        }
        if (str3 != null) {
            android.net.Uri parse2 = UriProtector.parse(str2);
            if (LJ(parse2.getHost()) || (host = parse2.getHost()) == null || ujb.o.LJJJJ(str, host, false)) {
                return false;
            }
            return true;
        }
        LIZ = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isCrossSiteRequest: ");
            LIZ2.append(C39016FSy.LIZ(30, m10exceptionOrNullimpl));
            X1D.LIZIZ(LIZ2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    @Override // X.C59862NeU, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageStarted(android.webkit.WebView r4, java.lang.String r5, android.graphics.Bitmap r6) {
        /*
            r3 = this;
            r1 = 0
            if (r4 == 0) goto L16
            X.EgF r0 = X.C78540Us4.LJIIIIZZ(r4)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto La
            goto L16
        La:
            X.EgG r1 = r0.LJLIL     // Catch: java.lang.Throwable -> L32
            X.EgG r0 = X.EnumC37040EgG.THIRD     // Catch: java.lang.Throwable -> L32
            if (r1 != r0) goto L13
            X.C37166EiI.LIZIZ()     // Catch: java.lang.Throwable -> L32
        L13:
            X.UCe r1 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L32
            goto L2e
        L16:
            if (r5 == 0) goto L2e
            boolean r0 = X.C37201Eir.LIZIZ(r5)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2c
            X.C37166EiI.LIZIZ()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L2c
            Y.IDCListenerS244S0100000_6 r1 = new Y.IDCListenerS244S0100000_6     // Catch: java.lang.Throwable -> L32
            r0 = 0
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L32
            r4.addOnAttachStateChangeListener(r1)     // Catch: java.lang.Throwable -> L32
        L2c:
            X.UCe r1 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L32
        L2e:
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L32
            goto L3a
        L32:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L3a:
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r1)
            if (r2 == 0) goto L5d
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onPageStarted: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", stack: "
            r1.append(r0)
            r0 = 30
            java.lang.String r0 = X.C39016FSy.LIZ(r0, r2)
            r1.append(r0)
            X.X1D.LIZIZ(r1)
        L5d:
            super.onPageStarted(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37162EiE.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }
}
