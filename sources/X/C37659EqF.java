package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;

/* renamed from: X.EqF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37659EqF implements F4I {
    public final /* synthetic */ WebResourceResponse LIZ;
    public final /* synthetic */ Integer LIZIZ;
    public final /* synthetic */ EnumC37658EqE LIZJ;

    @Override // X.F4I
    public final java.util.Map<String, String> LJFF() {
        return this.LIZ.getResponseHeaders();
    }

    @Override // X.F4I
    public final String LJI() {
        String encoding = this.LIZ.getEncoding();
        if (encoding == null) {
            return "UTF-8";
        }
        return encoding;
    }

    @Override // X.F4I
    public final int LJII() {
        Integer num = this.LIZIZ;
        if (num != null) {
            return num.intValue();
        }
        return this.LIZ.getStatusCode();
    }

    @Override // X.F4I
    public final String LJIIIIZZ() {
        String reasonPhrase = this.LIZ.getReasonPhrase();
        if (reasonPhrase == null) {
            return "OK";
        }
        return reasonPhrase;
    }

    @Override // X.F4I
    public final InputStream getData() {
        return this.LIZ.getData();
    }

    @Override // X.F4I
    public final String getMimeType() {
        String mimeType = this.LIZ.getMimeType();
        if (mimeType == null) {
            return "text/html";
        }
        return mimeType;
    }

    @Override // X.F4I
    public final EnumC37658EqE LJIIIZ() {
        return this.LIZJ;
    }

    public C37659EqF(WebResourceResponse webResourceResponse, EnumC37658EqE enumC37658EqE, Integer num) {
        this.LIZ = webResourceResponse;
        this.LIZIZ = num;
        this.LIZJ = enumC37658EqE;
    }
}
