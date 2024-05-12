package X;

import Y.ARunnableS11S1100000_10;
import android.os.Handler;
import android.webkit.WebView;

/* loaded from: classes11.dex */
public final class OCP {
    public WebView LIZ;
    public Handler LIZIZ;

    public final void LIZ(String str) {
        Handler handler;
        if (str == null || this.LIZ == null || (handler = this.LIZIZ) == null) {
            return;
        }
        handler.post(new ARunnableS11S1100000_10(this, str, 11));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("callJsCode ====== ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    public OCP(OCS ocs, O5V o5v) {
        this.LIZ = o5v;
        if (o5v == null) {
            return;
        }
        o5v.getSettings().setJavaScriptEnabled(true);
        this.LIZ.addJavascriptInterface(new OCQ(this, ocs), "androidJsBridge");
        this.LIZIZ = new Handler(C16880lQ.LLJJJJ());
    }
}
