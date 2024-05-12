package X;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class EZR {
    public final java.util.Map<String, String> LIZ = new LinkedHashMap();
    public final String LIZIZ;

    public final String toString() {
        String encode;
        if (this.LIZ.isEmpty()) {
            return this.LIZIZ;
        }
        java.util.Map<String, String> map = this.LIZ;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            try {
                String encode2 = URLEncoder.encode((String) entry.getKey(), "UTF-8");
                String str = (String) entry.getValue();
                if (str != null) {
                    try {
                        encode = URLEncoder.encode(str, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    encode = "";
                }
                if (!TextUtils.isEmpty(encode)) {
                    encode = encode.replace("+", "%20");
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                C1DI.LIZIZ(sb, encode2, "=", encode);
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        String sb2 = sb.toString();
        String str2 = this.LIZIZ;
        if (str2 == null || str2.length() == 0) {
            return sb2;
        }
        if (this.LIZIZ.indexOf(63) >= 0) {
            StringBuilder LIZ = X1D.LIZ();
            return C025908h.LIZIZ(LIZ, this.LIZIZ, "&", sb2, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C025908h.LIZIZ(LIZ2, this.LIZIZ, "?", sb2, LIZ2);
    }

    public EZR(String str) {
        this.LIZIZ = str;
    }
}
