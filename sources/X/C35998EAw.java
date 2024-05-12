package X;

import Y.ARunnableS1S1110000_6;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EAw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35998EAw {
    public static final String LIZ(String url) {
        o.LJIIIZ(url, "url");
        if (ujb.o.LJJJJJL(url)) {
            return url;
        }
        int LJJLIIIJJIZ = s.LJJLIIIJJIZ(url, '?', 0, false, 6);
        if (LJJLIIIJJIZ == -1) {
            return url;
        }
        String substring = url.substring(0, LJJLIIIJJIZ);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String LIZIZ(String url) {
        o.LJIIIZ(url, "url");
        try {
            android.net.Uri parse = UriProtector.parse(url);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(parse.getScheme());
            LIZ.append("://");
            LIZ.append(parse.getHost());
            return X1D.LIZIZ(LIZ);
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "get host failed on network optimization");
            return null;
        }
    }

    public static final void LIZJ(WebView webView, String url, int i, int i2, boolean z) {
        o.LJIIIZ(url, "url");
        if (i == 2 && i2 == 2) {
            C35999EAx.LIZ.getClass();
            if (((Boolean) C35999EAx.LIZIZ.getValue()).booleanValue()) {
                return;
            }
            C38995FSd.LIZLLL().execute(new ARunnableS1S1110000_6(webView, url, z, 4));
        }
    }
}
