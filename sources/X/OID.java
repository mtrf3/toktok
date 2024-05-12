package X;

import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class OID {
    public final OIC LIZ;
    public final List<OIJ> LIZIZ = new ArrayList();
    public final Handler LIZJ;

    public OID(OIC oic) {
        String lowerCase;
        this.LIZ = oic;
        this.LIZJ = new Handler(oic.LIZ.getMainLooper());
        for (android.net.Uri uri : oic.LIZLLL) {
            String scheme = uri.getScheme();
            if (scheme == null) {
                lowerCase = "";
            } else {
                lowerCase = scheme.toLowerCase();
            }
            if ("".equals(lowerCase) || "file".equals(lowerCase)) {
                ((ArrayList) this.LIZIZ).add(new O5N(oic.LIZ, oic.LIZIZ, new File(uri.getPath())));
            } else if ("asset".equals(lowerCase)) {
                String path = uri.getPath();
                ((ArrayList) this.LIZIZ).add(new C59166NJy(oic.LIZ, new File(path.startsWith("/") ? path.substring(1) : path)));
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unknown scheme:");
                LIZ.append(uri);
                OC6.LIZLLL("WebOffline-falcon", X1D.LIZIZ(LIZ));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LIZ(android.webkit.WebView r18, java.lang.String r19, com.bytedance.falconx.statistic.InterceptorModel r20) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OID.LIZ(android.webkit.WebView, java.lang.String, com.bytedance.falconx.statistic.InterceptorModel):android.webkit.WebResourceResponse");
    }
}
