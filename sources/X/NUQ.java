package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class NUQ extends C59458NVe {
    public final NUT LIZIZ;

    public void LJIIIIZZ(JSONObject jSONObject, boolean z) {
    }

    public static C59614NaU LJI(NUX nux) {
        WebView view;
        C59614NaU c59614NaU = null;
        if (nux == null) {
            view = null;
        } else {
            try {
                view = nux.getView();
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
                return c59614NaU;
            }
        }
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.ies.bullet.kit.web.SSWebView");
        c59614NaU = (C59614NaU) view;
        return c59614NaU;
    }

    public NUQ(F3T f3t, NUT nut) {
        this.LIZIZ = nut;
    }

    public static final boolean LJII(NUX nux, String str) {
        C38182Eyg c0;
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            FX8.LIZIZ(str);
        }
        if (nux != null && (c0 = nux.c0()) != null && c0.LIZIZ(str)) {
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        LJIIIZ("", 0, true, str);
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        super.shouldInterceptRequest(webView, str);
        throw null;
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (LJII(this.LIZ, str)) {
            return true;
        }
        super.shouldOverrideUrlLoading(webView, str);
        throw null;
    }

    public static void LJIIJ(JSONObject jSONObject, String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (ujb.o.LJJJJ(r0, "favicon.ico", false) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // X.NVZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ(android.webkit.WebView r8, X.C59151NJj r9, X.NUZ r10) {
        /*
            r7 = this;
            r3 = 1
            r5 = 0
            if (r9 == 0) goto L9c
            boolean r0 = r9.LIZJ()
            if (r0 != r3) goto L9c
            r0 = 1
        Lb:
            java.lang.String r4 = "favicon.ico"
            r6 = 0
            if (r0 != 0) goto L22
            if (r9 == 0) goto L5e
            android.net.Uri r0 = r9.LIZIZ()
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L48
            boolean r0 = ujb.o.LJJJJ(r0, r4, r5)
            if (r0 != 0) goto L48
        L22:
            android.net.Uri r0 = r9.LIZIZ()
            r0.toString()
            if (r10 == 0) goto L99
            int r0 = r10.LIZIZ()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r0 = r10.LIZ()
            if (r0 == 0) goto L9a
            java.lang.String r1 = r0.toString()
        L3d:
            android.net.Uri r0 = r9.LIZIZ()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.LJIIIZ(r1, r2, r5, r0)
        L48:
            boolean r0 = r9.LIZJ()
            if (r0 != 0) goto L5e
            android.net.Uri r0 = r9.LIZIZ()
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L5f
            boolean r0 = ujb.o.LJJJJ(r0, r4, r5)
            if (r0 != r3) goto L5f
        L5e:
            return
        L5f:
            if (r10 == 0) goto L5e
            int r4 = r10.LIZIZ()
            android.net.Uri r0 = r9.LIZIZ()
            java.lang.String r3 = r0.getHost()
            android.net.Uri r0 = r9.LIZIZ()
            java.lang.String r1 = r0.getPath()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "host"
            LJIIJ(r2, r0, r3)
            java.lang.String r0 = "path"
            LJIIJ(r2, r0, r1)
            java.lang.String r0 = "statusCode"
            LJIIJ(r2, r0, r6)
            java.lang.String r1 = "errorCode"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            LJIIJ(r2, r1, r0)
            java.lang.String r0 = "aweme_webview_assets_error"
            X.C09900aA.LJIIJJI(r0, r5, r2)
            goto L5e
        L99:
            r2 = r6
        L9a:
            r1 = r6
            goto L3d
        L9c:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUQ.LIZ(android.webkit.WebView, X.NJj, X.NUZ):void");
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NTF.LJIILJJIL(this, str);
        }
    }

    public final void LJIIIZ(String str, Integer num, boolean z, String str2) {
        JSONObject jSONObject = new JSONObject();
        LJIIJ(jSONObject, "errorCode", num);
        if (!TextUtils.isEmpty(str)) {
            LJIIJ(jSONObject, "errorDesc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            android.net.Uri parse = UriProtector.parse(str2);
            LJIIJ(jSONObject, "url", str2);
            LJIIJ(jSONObject, "host", parse.getHost());
            LJIIJ(jSONObject, "path", parse.getPath());
        }
        LJIIJ(jSONObject, "container_type", "bullet");
        LJIIIIZZ(jSONObject, z);
        C09900aA.LJIIJJI("aweme_webview_open_error_rate", !z ? 1 : 0, jSONObject);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 23) {
            LJIIIZ(str, Integer.valueOf(i), false, str2);
        }
    }
}
