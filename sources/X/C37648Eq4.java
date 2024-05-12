package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.Eq4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37648Eq4 implements InterfaceC37464En6 {
    public final /* synthetic */ WebResourceResponse LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ EnumC37644Eq0 LIZJ;

    @Override // X.InterfaceC37464En6
    public final java.util.Map<String, String> LJFF() {
        java.util.Map<String, String> responseHeaders = this.LIZ.getResponseHeaders();
        o.LJFF(responseHeaders, "this@toPiaResponse.responseHeaders");
        return C113554cx.LJJLIIIJILLIZJL(responseHeaders, C51029K0z.LJJIIZI(new OSZ("pia_forest_from", this.LIZIZ)));
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
        return this.LIZ.getReasonPhrase();
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
        return this.LIZJ;
    }

    public C37648Eq4(WebResourceResponse webResourceResponse, EnumC37644Eq0 enumC37644Eq0, String str) {
        this.LIZ = webResourceResponse;
        this.LIZIZ = str;
        this.LIZJ = enumC37644Eq0;
    }
}
