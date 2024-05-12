package X;

import android.webkit.WebResourceRequest;
import com.bytedance.forest.model.Request;

/* loaded from: classes11.dex */
public final class O4K implements InterfaceC37454Emw {
    public final /* synthetic */ Request LIZ;

    @Override // X.InterfaceC37454Emw
    public final /* synthetic */ java.util.Map getRequestHeaders() {
        return null;
    }

    @Override // X.InterfaceC37454Emw
    public final android.net.Uri getUrl() {
        return this.LIZ.getUri();
    }

    @Override // X.InterfaceC37454Emw
    public final boolean isForMainFrame() {
        Object webResourceRequest = this.LIZ.getWebResourceRequest();
        if (!(webResourceRequest instanceof WebResourceRequest)) {
            webResourceRequest = null;
        }
        WebResourceRequest webResourceRequest2 = (WebResourceRequest) webResourceRequest;
        if (webResourceRequest2 != null) {
            return webResourceRequest2.isForMainFrame();
        }
        return false;
    }

    public O4K(Request request) {
        this.LIZ = request;
    }
}
