package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.NrC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60650NrC extends AbstractC60423NnX {
    public final /* synthetic */ C60533NpJ LJLIL;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr getExtension() {
        return this.LJLIL;
    }

    public C60650NrC(C60533NpJ c60533NpJ) {
        this.LJLIL = c60533NpJ;
    }

    public final void LJJ(C60652NrE c60652NrE) {
        if (c60652NrE == null || this.LJLIL.LJLJLJ.LJLJLJ == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = c60652NrE.LIZ;
        if (!TextUtils.isEmpty(str)) {
            android.net.Uri parse = UriProtector.parse(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(parse.getScheme());
            LIZ.append("://");
            LIZ.append(parse.getHost());
            LIZ.append(parse.getPath());
            str = X1D.LIZIZ(LIZ);
        }
        hashMap.put("url", str);
        hashMap.put("label", c60652NrE.LIZIZ);
        hashMap.put("scc_reason", c60652NrE.LIZLLL);
        hashMap.put("scc_passed_time", String.valueOf(c60652NrE.LJ));
        hashMap.put("scc_logid", c60652NrE.LIZJ);
        this.LJLIL.LJLJLJ.LJLJLJ.LIZ(hashMap);
    }

    public static C60652NrE LJJI(String str, JSONObject jSONObject) {
        C60652NrE c60652NrE = new C60652NrE();
        try {
            c60652NrE.LIZ = str;
            jSONObject.optInt("code", -1);
            jSONObject.optString("message", "");
            c60652NrE.LIZLLL = jSONObject.optString("scc_reason", "");
            c60652NrE.LJ = jSONObject.optInt("scc_passed_time", -1);
            c60652NrE.LIZJ = jSONObject.optString("scc_logid", "");
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
            jSONObject2.optInt("score", -1);
            c60652NrE.LIZIZ = jSONObject2.optString("label", "");
            return c60652NrE;
        } catch (Exception unused) {
            return new C60652NrE();
        }
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJ(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.LJLIL.LJLJLJ.LJLJLLL == null || this.LJLIL.LJLJLJ.LJLJLJ == null) {
            return super.LJIJ(webView, webResourceRequest);
        }
        String uri = webResourceRequest.getUrl().toString();
        JSONObject LIZIZ = this.LJLIL.LJLJLJ.LJLJLLL.LIZIZ(uri);
        if (LIZIZ == null) {
            return super.LJIJ(webView, webResourceRequest);
        }
        this.LJLIL.LJLJLJ.LJLL = LJJI(uri, LIZIZ);
        String str = this.LJLIL.LJLJLJ.LJLL.LIZIZ;
        if (TextUtils.equals(str, "notice")) {
            FP9 fp9 = this.LJLIL.LJLJLJ.LJLJLLL;
            fp9.getClass();
            String LJIJJLI = T2R.LJIJJLI(uri);
            synchronized (fp9) {
                fp9.LJ = LJIJJLI;
            }
            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        if (TextUtils.equals(str, "deny")) {
            this.LJLIL.LJLJLJ.LJLJLLL.LIZLLL(uri);
            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        WebResourceResponse LJIJ = super.LJIJ(webView, webResourceRequest);
        if (LJIJ == null) {
            return this.LJLIL.LJLJLJ.LJLJLLL.LJFF(uri);
        }
        return LJIJ;
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJI(WebView webView, String str) {
        if (this.LJLIL.LJLJLJ.LJLJLLL != null) {
            C60649NrB c60649NrB = this.LJLIL.LJLJLJ;
            if (c60649NrB.LJLJLJ != null) {
                JSONObject LIZIZ = c60649NrB.LJLJLLL.LIZIZ(str);
                if (LIZIZ == null) {
                    return super.LJIJI(webView, str);
                }
                this.LJLIL.LJLJLJ.LJLL = LJJI(str, LIZIZ);
                String str2 = this.LJLIL.LJLJLJ.LJLL.LIZIZ;
                if (TextUtils.equals(str2, "notice")) {
                    FP9 fp9 = this.LJLIL.LJLJLJ.LJLJLLL;
                    fp9.getClass();
                    String LJIJJLI = T2R.LJIJJLI(str);
                    synchronized (fp9) {
                        fp9.LJ = LJIJJLI;
                    }
                    return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                }
                if (TextUtils.equals(str2, "deny")) {
                    this.LJLIL.LJLJLJ.LJLJLLL.LIZLLL(str);
                    return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                }
                WebResourceResponse LJIJI = super.LJIJI(webView, str);
                if (LJIJI == null) {
                    return this.LJLIL.LJLJLJ.LJLJLLL.LJFF(str);
                }
                return LJIJI;
            }
        }
        return super.LJIJI(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIJJLI(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if (!this.LJLIL.LJLJLJ.LJI(uri)) {
            return super.LJIJJLI(webView, webResourceRequest);
        }
        this.LJLIL.LJLJLJ.LJLJLLL.LIZ(uri);
        return super.LJIJJLI(webView, webResourceRequest);
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIL(WebView webView, String str) {
        if (!this.LJLIL.LJLJLJ.LJI(str)) {
            return super.LJIL(webView, str);
        }
        this.LJLIL.LJLJLJ.LJLJLLL.LIZ(str);
        return super.LJIL(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        if (this.LJLIL.LJLJLJ.LJLJLLL != null) {
            C60649NrB c60649NrB = this.LJLIL.LJLJLJ;
            if (c60649NrB.LJLJLJ != null) {
                FP9 fp9 = c60649NrB.LJLJLLL;
                fp9.getClass();
                if (!TextUtils.isEmpty(str)) {
                    String LJIJJLI = T2R.LJIJJLI(str);
                    synchronized (fp9) {
                        if (TextUtils.equals(fp9.LJ, LJIJJLI)) {
                            fp9.LJ = null;
                            this.LJLIL.LJLJLJ.LJLJLJ.LIZIZ(webView, str);
                            LJJ(this.LJLIL.LJLJLJ.LJLL);
                        }
                    }
                    super.LJFF(webView, str, bitmap);
                    return;
                }
                if (this.LJLIL.LJLJLJ.LJLJLLL.LJ(str)) {
                    this.LJLIL.LJLJLJ.LJLJLJ.LIZJ(webView, str);
                    LJJ(this.LJLIL.LJLJLJ.LJLL);
                } else {
                    C60649NrB c60649NrB2 = this.LJLIL.LJLJLJ;
                    if (c60649NrB2.LJLL != null) {
                        c60649NrB2.LJLJLJ.LJ();
                        LJJ(this.LJLIL.LJLJLJ.LJLL);
                    }
                }
                super.LJFF(webView, str, bitmap);
                return;
            }
        }
        super.LJFF(webView, str, bitmap);
    }
}
