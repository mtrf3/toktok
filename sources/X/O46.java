package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O46 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String url) {
        o.LJIIJ(url, "url");
        if (ujb.o.LJJJJ(url, ".js", false)) {
            return "application/x-javascript";
        }
        if (ujb.o.LJJJJ(url, ".json", false)) {
            return "application/json";
        }
        if (ujb.o.LJJJJ(url, ".css", false)) {
            return "text/css";
        }
        if (ujb.o.LJJJJ(url, ".html", false)) {
            return "text/html";
        }
        if (ujb.o.LJJJJ(url, ".ico", false)) {
            return "image/x-icon";
        }
        if (ujb.o.LJJJJ(url, ".jpeg", false) || ujb.o.LJJJJ(url, ".jpg", false)) {
            return "image/jpeg";
        }
        if (ujb.o.LJJJJ(url, ".png", false)) {
            return "image/png";
        }
        if (ujb.o.LJJJJ(url, ".gif", false)) {
            return "image/gif";
        }
        if (ujb.o.LJJJJ(url, ".woff", false)) {
            return "font/woff";
        }
        if (ujb.o.LJJJJ(url, ".svg", false)) {
            return "image/svg+xml";
        }
        if (ujb.o.LJJJJ(url, ".ttf", false)) {
            return "font/ttf";
        }
        return "";
    }

    public static WebResourceResponse LIZIZ(InputStream inputStream, String str) {
        if (inputStream != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (o.LJ("font/ttf", str)) {
                    return new WebResourceResponse(str, "", 200, "OK", hashMap, inputStream);
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(str, "", inputStream);
                webResourceResponse.setResponseHeaders(hashMap);
                return webResourceResponse;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return null;
    }
}
