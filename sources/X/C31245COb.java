package X;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.COb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31245COb implements InterfaceC31244COa {
    public volatile String LIZ;
    public volatile String LIZIZ;
    public volatile String LIZJ;
    public volatile String LIZLLL;

    public final boolean LIZIZ(File file) {
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        if (context != null) {
            try {
                if (this.LIZIZ == null || this.LIZIZ.isEmpty()) {
                    this.LIZIZ = C16880lQ.LLIIIL(context).getCanonicalPath();
                }
                if (this.LIZ == null || this.LIZ.isEmpty()) {
                    this.LIZ = C16880lQ.LLIIJLIL(context).getCanonicalPath();
                }
                if (this.LIZLLL == null || this.LIZLLL.isEmpty()) {
                    this.LIZLLL = C16880lQ.LLIIIZ(context).getCanonicalPath();
                }
                if (this.LIZJ == null || this.LIZJ.isEmpty()) {
                    this.LIZJ = C16880lQ.LLIIJI(context, null).getCanonicalPath();
                }
                String canonicalPath = file.getCanonicalPath();
                if (this.LIZIZ != null && canonicalPath.startsWith(this.LIZIZ)) {
                    return true;
                }
                if (this.LIZIZ != null && canonicalPath.startsWith(this.LIZ)) {
                    return true;
                }
                if (this.LIZJ != null && canonicalPath.startsWith(this.LIZJ)) {
                    return true;
                }
                if (this.LIZLLL != null) {
                    if (canonicalPath.startsWith(this.LIZLLL)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // X.InterfaceC31244COa
    public final WebResourceResponse LIZ(android.net.Uri uri, WebView webView) {
        if (TextUtils.equals(uri.getScheme(), "liveresource") && TextUtils.equals(uri.getHost(), "file")) {
            String queryParameter = UriProtector.getQueryParameter(uri, "path");
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            File file = new File(queryParameter);
            if (!file.exists()) {
                return null;
            }
            try {
                if (LIZIZ(file)) {
                    return new WebResourceResponse("", "", new FileInputStream(file));
                }
            } catch (IOException | NullPointerException unused) {
            }
        }
        return null;
    }
}
