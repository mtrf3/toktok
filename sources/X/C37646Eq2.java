package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;

/* renamed from: X.Eq2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37646Eq2 implements InterfaceC37464En6 {
    public final /* synthetic */ WebResourceResponse LIZ;
    public final /* synthetic */ EnumC37644Eq0 LIZIZ;

    @Override // X.InterfaceC37464En6
    public final java.util.Map<String, String> LJFF() {
        return this.LIZ.getResponseHeaders();
    }

    @Override // X.InterfaceC37464En6
    public final String LJI() {
        return this.LIZ.getEncoding();
    }

    @Override // X.InterfaceC37464En6
    public final int LJII() {
        return this.LIZ.getStatusCode();
    }

    @Override // X.InterfaceC37464En6
    public final String LJIIIIZZ() {
        String reasonPhrase = this.LIZ.getReasonPhrase();
        if (reasonPhrase != null) {
            return reasonPhrase;
        }
        return "";
    }

    @Override // X.InterfaceC37464En6
    public final InputStream getData() {
        return this.LIZ.getData();
    }

    @Override // X.InterfaceC37464En6
    public final String getMimeType() {
        return this.LIZ.getMimeType();
    }

    @Override // X.InterfaceC37464En6
    public final EnumC37644Eq0 LJIIIZ() {
        return this.LIZIZ;
    }

    public C37646Eq2(WebResourceResponse webResourceResponse, EnumC37644Eq0 enumC37644Eq0) {
        this.LIZ = webResourceResponse;
        this.LIZIZ = enumC37644Eq0;
    }
}
