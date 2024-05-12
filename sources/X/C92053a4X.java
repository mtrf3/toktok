package X;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.a4X, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92053a4X {
    public final Context LIZ;
    public final WebChromeClient LIZIZ = new C92052a4W();

    public C92053a4X(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    public final void LIZ(String sessionID) {
        o.LJIIIZ(sessionID, "sessionID");
        try {
            WebView webView = new WebView(this.LIZ);
            webView.getSettings().setJavaScriptEnabled(true);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("<head>\n    <script type=\"text/javascript\"\n            src=\"https://h.online-metrix.net/fp/tags.js?org_id=");
            LIZ.append("k8vif92e");
            LIZ.append("&session_id=");
            LIZ.append("bytedance");
            LIZ.append(sessionID);
            LIZ.append("\"></script>\n</head>");
            String LIZIZ = X1D.LIZIZ(LIZ);
            webView.setWebChromeClient(this.LIZIZ);
            webView.loadData(LIZIZ, "text/html", "UTF-8");
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
