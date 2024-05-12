package X;

import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.Ngz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60017Ngz extends AbstractC60015Ngx {
    public WebView LJFF;
    public Long LJI;
    public final java.util.Map<String, NSD> LJII;
    public final String LJIIIIZZ;

    public C60017Ngz(java.util.Map<String, NSD> map, String str) {
        this.LJII = map;
        this.LJIIIIZZ = str;
    }

    @Override // X.AbstractC60015Ngx
    public final void LIZ() {
        WebView webView = new WebView(C59999Ngh.LIZIZ.LIZ);
        this.LJFF = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.LIZ = new C60022Nh4(this.LJFF);
        C37137Ehp.LIZ(this.LJFF, this.LJIIIIZZ);
        for (String str : this.LJII.keySet()) {
            String externalForm = this.LJII.get(str).LIZIZ.toExternalForm();
            WebView webView2 = this.LJFF;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                C37137Ehp.LIZ(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.LJI = Long.valueOf(System.nanoTime());
    }

    @Override // X.AbstractC60015Ngx
    public final void LJ() {
        long convert;
        super.LJ();
        if (this.LJI == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.LJI.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new ARunnableS46S0100000_10(this, 185), Math.max(4000 - convert, 2000L));
        this.LJFF = null;
    }

    @Override // X.AbstractC60015Ngx
    public final void LIZJ(C60014Ngw c60014Ngw, NR8 nr8) {
        JSONObject jSONObject = new JSONObject();
        java.util.Map unmodifiableMap = Collections.unmodifiableMap(nr8.LIZLLL);
        for (String str : unmodifiableMap.keySet()) {
            C60031NhD.LIZJ(jSONObject, str, unmodifiableMap.get(str));
        }
        LIZLLL(c60014Ngw, nr8, jSONObject);
    }
}
