package X;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: X.0TF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TF {
    public final Context LIZ;
    public final C0TE LIZIZ = new WebChromeClient() { // from class: X.0TE
        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            UC7.LIZLLL("risk js execute progress is: ", i);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0TE] */
    public C0TF(Context context) {
        this.LIZ = context;
    }

    public final String LIZ(String str) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("executeRiskJsCode with orgId:");
            LIZ.append("k8vif92e");
            LIZ.append(" merchantId:");
            LIZ.append("bytedance");
            LIZ.append(" merchantIdTTP:");
            LIZ.append("pipo_us");
            LIZ.append(" sessionID:");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            WebView webView = new WebView(this.LIZ);
            webView.getSettings().setJavaScriptEnabled(true);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("<head>\n    <script type=\"text/javascript\"\n            src=\"https://h.online-metrix.net/fp/tags.js?org_id=");
            LIZ2.append("k8vif92e");
            LIZ2.append("&session_id=");
            LIZ2.append("bytedance");
            LIZ2.append(str);
            LIZ2.append("\"></script>\n    <script type=\"text/javascript\"\n            src=\"https://h.online-metrix.net/fp/tags.js?org_id=");
            LIZ2.append("k8vif92e");
            LIZ2.append("&session_id=");
            LIZ2.append("pipo_us");
            LIZ2.append(str);
            LIZ2.append("\"></script>\n</head>");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            webView.setWebChromeClient(this.LIZIZ);
            webView.loadData(LIZIZ, "text/html", "UTF-8");
            return "success";
        } catch (Throwable th) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("exception in executeRiskJsCode :");
            LIZ3.append(th.getLocalizedMessage());
            X1D.LIZIZ(LIZ3);
            return th.getMessage();
        }
    }
}
