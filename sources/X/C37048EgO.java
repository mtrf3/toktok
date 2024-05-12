package X;

import android.webkit.WebResourceRequest;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.EgO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37048EgO implements WebResourceRequest {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZJ;

    @Override // android.webkit.WebResourceRequest
    public final String getMethod() {
        return "GET";
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean hasGesture() {
        return false;
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean isForMainFrame() {
        return false;
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean isRedirect() {
        return false;
    }

    @Override // android.webkit.WebResourceRequest
    public final java.util.Map<String, String> getRequestHeaders() {
        this.LIZIZ.put("Referer", this.LIZ);
        this.LIZIZ.putAll(this.LIZJ);
        this.LIZIZ.put("x-tt-dataflow-id", "CommercializePrefetch");
        return this.LIZIZ;
    }

    @Override // android.webkit.WebResourceRequest
    public final android.net.Uri getUrl() {
        return UriProtector.parse(this.LIZ);
    }

    public C37048EgO(String str, java.util.Map<String, String> map, java.util.Map<String, String> map2) {
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = map2;
    }
}
