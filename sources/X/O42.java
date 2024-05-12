package X;

import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import ujb.o;

/* loaded from: classes11.dex */
public final class O42 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (o.LJJJJ(str, ".js", false)) {
            return "application/x-javascript";
        }
        if (o.LJJJJ(str, ".json", false)) {
            return "application/json";
        }
        if (o.LJJJJ(str, ".css", false)) {
            return "text/css";
        }
        if (o.LJJJJ(str, ".html", false)) {
            return "text/html";
        }
        if (o.LJJJJ(str, ".ico", false)) {
            return "image/x-icon";
        }
        if (o.LJJJJ(str, ".jpeg", false) || o.LJJJJ(str, ".jpg", false)) {
            return "image/jpeg";
        }
        if (o.LJJJJ(str, ".png", false)) {
            return "image/png";
        }
        if (o.LJJJJ(str, ".gif", false)) {
            return "image/gif";
        }
        if (o.LJJJJ(str, ".woff", false)) {
            return "font/woff";
        }
        if (o.LJJJJ(str, ".svg", false)) {
            return "image/svg+xml";
        }
        if (o.LJJJJ(str, ".ttf", false)) {
            return "font/ttf";
        }
        return "";
    }

    public static WebResourceResponse LIZIZ(String str) {
        boolean z;
        if (str != null) {
            try {
                File file = new File(str);
                if (file.exists() && !file.isDirectory()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    file = null;
                }
                if (file != null) {
                    return LIZJ(new FileInputStream(file), LIZ(str));
                }
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(null);
        return null;
    }

    public static WebResourceResponse LIZJ(InputStream inputStream, String str) {
        if (inputStream != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (kotlin.jvm.internal.o.LJ("font/ttf", str)) {
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
