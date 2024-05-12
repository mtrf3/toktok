package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PYK implements InterfaceC48121Iub {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        java.net.URI LIZIZ;
        java.util.Set<String> LJFF;
        java.util.Map<String, List<String>> map;
        java.util.Set<String> LJFF2;
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        try {
            LIZIZ = request.url().LJIJJ();
        } catch (Exception unused) {
            LIZIZ = EZY.LIZIZ(request.url().LJIIIIZZ);
        }
        C64618PXq newBuilder = request.newBuilder();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        C64606PXe headers = request.headers();
        String str = null;
        if (LIZIZ != null) {
            String uri = LIZIZ.toString();
            if (C36951Eep.LIZJ && C36951Eep.LIZLLL && uri != null && uri.contains(C36951Eep.LIZ)) {
                String scheme = UriProtector.parse(uri).getScheme();
                if ("http".equals(scheme)) {
                    uri = uri.replaceFirst("http", "https");
                } else if ("ws".equals(scheme)) {
                    uri = uri.replaceFirst("ws", "wss");
                }
                str = uri.replaceFirst(C36951Eep.LIZ, "");
            }
        }
        try {
            HashMap hashMap = new HashMap();
            if (headers != null && (LJFF2 = headers.LJFF()) != null && !LJFF2.isEmpty()) {
                for (String str2 : LJFF2) {
                    hashMap.put(str2, headers.LJIIJJI(str2));
                }
            }
            if (cookieHandler != null) {
                try {
                    if (str != null) {
                        map = cookieHandler.get(new java.net.URI(str), hashMap);
                    } else {
                        map = cookieHandler.get(LIZIZ, hashMap);
                    }
                    if (map != null && map.size() > 0) {
                        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                            String key = entry.getKey();
                            StringBuilder sb = new StringBuilder();
                            if ("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                                if (!entry.getValue().isEmpty()) {
                                    int i = 0;
                                    for (String str3 : entry.getValue()) {
                                        if (i > 0) {
                                            sb.append("; ");
                                        }
                                        sb.append(str3);
                                        i++;
                                    }
                                    newBuilder.LIZ(key, sb.toString());
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            request = newBuilder.LIZIZ();
        } catch (Throwable unused3) {
        }
        C64598PWw LIZ = pw8.LIZ(request);
        HashMap hashMap2 = new HashMap();
        C64606PXe c64606PXe = LIZ.LJLJJLL;
        if (c64606PXe != null && (LJFF = c64606PXe.LJFF()) != null && !LJFF.isEmpty()) {
            for (String str4 : LJFF) {
                hashMap2.put(str4, c64606PXe.LJIIJJI(str4));
            }
        }
        if (cookieHandler != null) {
            try {
                if (str != null) {
                    cookieHandler.put(new java.net.URI(str), hashMap2);
                } else {
                    cookieHandler.put(LIZIZ, hashMap2);
                }
            } catch (Throwable unused4) {
            }
        }
        return LIZ;
    }
}
