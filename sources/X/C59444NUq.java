package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.jvm.internal.o;

/* renamed from: X.NUq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59444NUq<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ NJM LIZLLL;

    public C59444NUq(int i, long j, String str, NJV njv) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = njv;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        String str;
        Object LIZ;
        if (C59161NJt.LIZIZ.get() == this.LIZ && (str = (String) c10k.LJIIJJI()) != null && str.length() != 0) {
            long j = this.LIZIZ;
            String str2 = this.LIZJ;
            NJM njm = this.LIZLLL;
            if (C59161NJt.LIZJ == null) {
                WebView webView = new WebView(EF7.LIZIZ());
                webView.setNetworkAvailable(false);
                IESSettingsProxy iESSettingsProxy = C2YJ.LIZIZ.LIZ;
                o.LJIIIIZZ(iESSettingsProxy, "get()");
                webView.getSettings().setJavaScriptEnabled(iESSettingsProxy.getAdLandingPageConfig().isPrememCacheJsEnable());
                webView.getSettings().setCacheMode(3);
                webView.getSettings().setDatabaseEnabled(false);
                webView.getSettings().setAllowContentAccess(false);
                webView.getSettings().setAllowFileAccess(false);
                webView.getSettings().setGeolocationEnabled(false);
                webView.getSettings().setSaveFormData(false);
                webView.getSettings().setSavePassword(false);
                C59161NJt.LIZJ = webView;
                C59434NUg c59434NUg = new C59434NUg();
                WebView webView2 = C59161NJt.LIZJ;
                if (webView2 != null) {
                    C16880lQ.LLZLI(webView2, c59434NUg);
                }
                C59161NJt.LIZLLL = c59434NUg;
            }
            if (C59161NJt.LIZJ != null) {
                C59161NJt.LJ = j;
                C59434NUg c59434NUg2 = C59161NJt.LIZLLL;
                if (c59434NUg2 != null) {
                    c59434NUg2.LIZ = njm;
                }
                try {
                    android.net.Uri parse = UriProtector.parse(str2);
                    LIZ = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).build().toString();
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = null;
                }
                String str3 = (String) LIZ;
                WebView webView3 = C59161NJt.LIZJ;
                if (webView3 != null) {
                    webView3.loadDataWithBaseURL(str3, str, "text/html", "utf-8", str2);
                }
                C10K.LJII(60000L).LJ(new C59443NUp(C59161NJt.LIZIZ.incrementAndGet()), C10K.LJIIIIZZ, null);
            }
        }
        return C76800UCe.LIZ;
    }
}
