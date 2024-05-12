package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public final class O48 {
    public final InputStream LIZ;
    public final java.util.Map<String, String> LIZIZ;
    public final boolean LIZJ;

    public final WebResourceResponse LIZ() {
        String LIZIZ;
        String str;
        Charset LIZ;
        C39745Fin LIZ2 = C61300O4a.LIZ(this.LIZIZ);
        if (LIZ2 == null) {
            LIZIZ = "text/html";
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZ2.LIZIZ);
            LIZ3.append("/");
            LIZ3.append(LIZ2.LIZJ);
            LIZIZ = X1D.LIZIZ(LIZ3);
        }
        if (LIZ2 == null || (LIZ = LIZ2.LIZ(null)) == null || (str = LIZ.toString()) == null) {
            str = "utf-8";
        }
        return new WebResourceResponse(LIZIZ, str, 200, "success", this.LIZIZ, this.LIZ);
    }

    public O48(InputStream inputStream, java.util.Map<String, String> map, boolean z) {
        this.LIZ = inputStream;
        this.LIZIZ = map;
        this.LIZJ = z;
    }
}
