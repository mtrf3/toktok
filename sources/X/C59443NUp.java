package X;

import android.webkit.WebView;

/* renamed from: X.NUp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59443NUp<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ C59161NJt LIZIZ;

    public C59443NUp(int i) {
        C59161NJt c59161NJt = C59161NJt.LIZ;
        this.LIZ = i;
        this.LIZIZ = c59161NJt;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        if (this.LIZ == C59161NJt.LIZIZ.get()) {
            this.LIZIZ.getClass();
            WebView webView = C59161NJt.LIZJ;
            if (webView != null) {
                C59434NUg c59434NUg = C59161NJt.LIZLLL;
                if (c59434NUg != null) {
                    c59434NUg.LIZ = null;
                }
                C59161NJt.LIZLLL = null;
                C59161NJt.LIZJ = null;
                webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                webView.clearFormData();
                webView.clearHistory();
                webView.destroy();
            }
        }
        return C76800UCe.LIZ;
    }
}
