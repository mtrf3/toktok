package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class F2B {
    public static WebResourceResponse LIZ(InputStream inputStream, String str) {
        if (inputStream != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                hashMap.put("Content-Type", str);
                if ("font/ttf".equals(str)) {
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
