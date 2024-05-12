package X;

import android.webkit.WebResourceRequest;

/* renamed from: X.Elm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37382Elm implements InterfaceC37454Emw {
    public final /* synthetic */ WebResourceRequest LIZ;

    @Override // X.InterfaceC37454Emw
    public final java.util.Map<String, String> getRequestHeaders() {
        return this.LIZ.getRequestHeaders();
    }

    @Override // X.InterfaceC37454Emw
    public final android.net.Uri getUrl() {
        return this.LIZ.getUrl();
    }

    @Override // X.InterfaceC37454Emw
    public final boolean isForMainFrame() {
        return this.LIZ.isForMainFrame();
    }

    public C37382Elm(WebResourceRequest webResourceRequest) {
        this.LIZ = webResourceRequest;
    }
}
