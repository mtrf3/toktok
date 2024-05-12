package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.O4i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61308O4i implements InterfaceC61323O4x {
    public final WebResourceResponse LJLIL;

    public C61308O4i(WebResourceResponse webResourceResponse) {
        this.LJLIL = webResourceResponse;
    }

    @Override // X.InterfaceC61323O4x
    public final O48 request(String path) {
        o.LJIIJ(path, "path");
        InputStream data = this.LJLIL.getData();
        o.LJFF(data, "superResponse.data");
        java.util.Map<String, String> responseHeaders = this.LJLIL.getResponseHeaders();
        o.LJFF(responseHeaders, "superResponse.responseHeaders");
        return new O48(data, responseHeaders, true);
    }
}
