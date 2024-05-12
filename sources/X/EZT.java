package X;

import android.text.TextUtils;
import defpackage.b1;
import defpackage.i0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes7.dex */
public final class EZT {
    public static String LIZIZ(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String LIZ(String str, java.util.Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                str = i0.LJFF(str, "?");
            }
            if (str.endsWith("?")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(LIZIZ("sdk_version"));
                LIZ.append("=");
                LIZ.append(LIZIZ(String.valueOf(1)));
                str = X1D.LIZIZ(LIZ);
            } else {
                StringBuilder LIZJ = b1.LIZJ(str, "&");
                LIZJ.append(LIZIZ("sdk_version"));
                LIZJ.append("=");
                LIZJ.append(LIZIZ(String.valueOf(1)));
                str = X1D.LIZIZ(LIZJ);
            }
            if (map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        if (str.endsWith("?")) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str);
                            LIZ2.append(LIZIZ(entry.getKey().toString()));
                            LIZ2.append("=");
                            String str2 = map.get(entry.getKey());
                            str2.toString();
                            LIZ2.append(LIZIZ(str2));
                            str = X1D.LIZIZ(LIZ2);
                        } else {
                            StringBuilder LIZJ2 = b1.LIZJ(str, "&");
                            LIZJ2.append(LIZIZ(entry.getKey().toString()));
                            LIZJ2.append("=");
                            String str3 = map.get(entry.getKey());
                            str3.toString();
                            LIZJ2.append(LIZIZ(str3));
                            str = X1D.LIZIZ(LIZJ2);
                        }
                    }
                }
            }
        }
        return str;
    }
}
