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
public class NUR extends C60413NnN {
    public final NVO LJLILLLLZI;
    public final NUT LJLJI;

    public void LJJ(JSONObject jSONObject, boolean z) {
    }

    public NUR(NVO container) {
        o.LJIIIZ(container, "container");
        this.LJLILLLLZI = container;
        this.LJLJI = container.LJLIL;
    }

    @Override // X.AbstractC60423NnX
    public void LJ(WebView webView, String str) {
        super.LJ(webView, str);
        LJJI("", 0, true, str);
        NVO nvo = this.LJLILLLLZI;
        nvo.getClass();
        new NUU(nvo).onPageFinished(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJI(WebView webView, String str) {
        return super.LJIJI(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public boolean LJIL(WebView webView, String str) {
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            FX8.LIZIZ(str);
        }
        return super.LJIL(webView, str);
    }

    public static final void LJJIFFI(JSONObject jSONObject, String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }

    @Override // X.AbstractC60423NnX
    public void LJFF(WebView webView, String str, Bitmap bitmap) {
        super.LJFF(webView, str, bitmap);
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            NTF.LJIILJJIL(this, str);
        }
        NVO nvo = this.LJLILLLLZI;
        nvo.getClass();
        new NUU(nvo).onPageStarted(webView, str, bitmap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (ujb.o.LJJJJ(r0, "favicon.ico", false) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    @Override // X.AbstractC60423NnX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIIIZZ(android.webkit.WebView r8, android.webkit.WebResourceRequest r9, android.webkit.WebResourceError r10) {
        /*
            r7 = this;
            r3 = 1
            r5 = 0
            if (r9 == 0) goto Lae
            boolean r0 = r9.isForMainFrame()
            if (r0 != r3) goto Lae
            r0 = 1
        Lb:
            java.lang.String r4 = "favicon.ico"
            r6 = 0
            if (r0 != 0) goto L24
            if (r9 == 0) goto L66
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L4e
            boolean r0 = ujb.o.LJJJJ(r0, r4, r5)
            if (r0 != 0) goto L4e
        L24:
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto L2d
            r0.toString()
        L2d:
            if (r10 == 0) goto Lab
            int r0 = r10.getErrorCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r0 = r10.getDescription()
            if (r0 == 0) goto Lac
            java.lang.String r1 = r0.toString()
        L41:
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto La9
            java.lang.String r0 = r0.toString()
        L4b:
            r7.LJJI(r1, r2, r5, r0)
        L4e:
            boolean r0 = r9.isForMainFrame()
            if (r0 != 0) goto L66
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto L67
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L67
            boolean r0 = ujb.o.LJJJJ(r0, r4, r5)
            if (r0 != r3) goto L67
        L66:
            return
        L67:
            if (r10 == 0) goto L66
            int r4 = r10.getErrorCode()
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto La7
            java.lang.String r3 = r0.getHost()
        L77:
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto La5
            java.lang.String r1 = r0.getPath()
        L81:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "host"
            LJJIFFI(r2, r0, r3)
            java.lang.String r0 = "path"
            LJJIFFI(r2, r0, r1)
            java.lang.String r0 = "statusCode"
            LJJIFFI(r2, r0, r6)
            java.lang.String r1 = "errorCode"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            LJJIFFI(r2, r1, r0)
            java.lang.String r0 = "aweme_webview_assets_error"
            X.C09900aA.LJIIJJI(r0, r5, r2)
            goto L66
        La5:
            r1 = r6
            goto L81
        La7:
            r3 = r6
            goto L77
        La9:
            r0 = r6
            goto L4b
        Lab:
            r2 = r6
        Lac:
            r1 = r6
            goto L41
        Lae:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUR.LJIIIIZZ(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    @Override // X.AbstractC60423NnX
    public void LJII(WebView webView, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 23) {
            LJJI(str, Integer.valueOf(i), false, str2);
        }
    }

    public final void LJJI(String str, Integer num, boolean z, String str2) {
        int i;
        JSONObject jSONObject = new JSONObject();
        LJJIFFI(jSONObject, "errorCode", num);
        if (!TextUtils.isEmpty(str)) {
            LJJIFFI(jSONObject, "errorDesc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            android.net.Uri parse = UriProtector.parse(str2);
            LJJIFFI(jSONObject, "url", str2);
            LJJIFFI(jSONObject, "host", parse.getHost());
            LJJIFFI(jSONObject, "path", parse.getPath());
        }
        LJJIFFI(jSONObject, "container_type", "bullet");
        LJJ(jSONObject, z);
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C09900aA.LJIIJJI("aweme_webview_open_error_rate", i, jSONObject);
    }
}
