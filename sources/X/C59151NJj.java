package X;

import android.webkit.WebResourceRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.NJj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59151NJj {
    public final /* synthetic */ WebResourceRequest LIZ;

    public final java.util.Map<String, String> LIZ() {
        java.util.Map<String, String> requestHeaders = this.LIZ.getRequestHeaders();
        if (requestHeaders != null) {
            return requestHeaders;
        }
        return C113554cx.LJJJLIIL();
    }

    public final android.net.Uri LIZIZ() {
        android.net.Uri url = this.LIZ.getUrl();
        o.LJFF(url, "getUrl()");
        return url;
    }

    public final boolean LIZJ() {
        return this.LIZ.isForMainFrame();
    }

    public C59151NJj(WebResourceRequest webResourceRequest) {
        this.LIZ = webResourceRequest;
    }
}
