package X;

import android.webkit.WebResourceRequest;

/* renamed from: X.EsV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37799EsV implements WebResourceRequest {
    public final /* synthetic */ C68322mC<android.net.Uri> LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ java.util.Map<String, String> LIZLLL;

    @Override // android.webkit.WebResourceRequest
    public final boolean hasGesture() {
        return false;
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean isRedirect() {
        return true;
    }

    @Override // android.webkit.WebResourceRequest
    public final android.net.Uri getUrl() {
        return this.LIZ.element;
    }

    @Override // android.webkit.WebResourceRequest
    public final String getMethod() {
        return this.LIZJ;
    }

    @Override // android.webkit.WebResourceRequest
    public final java.util.Map<String, String> getRequestHeaders() {
        return this.LIZLLL;
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean isForMainFrame() {
        return this.LIZIZ;
    }

    public C37799EsV(C68322mC<android.net.Uri> c68322mC, boolean z, String str, java.util.Map<String, String> map) {
        this.LIZ = c68322mC;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = map;
    }
}
