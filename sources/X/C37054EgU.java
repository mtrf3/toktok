package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.URLEncoder;

/* renamed from: X.EgU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37054EgU {
    public static boolean LIZLLL(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (LIZJ(str, "http") || LIZJ(str, "https")) {
                if (!LJ(str)) {
                    return true;
                }
            } else if (TextUtils.isEmpty(UriProtector.parse(str).getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(String str) {
        if (!LIZJ(str, "https://")) {
            return false;
        }
        String host = UriProtector.parse(C73040SlY.LJLJJI.LIZJ).getHost();
        String host2 = UriProtector.parse(str).getHost();
        if (host2 == null) {
            return false;
        }
        return host2.equalsIgnoreCase(host);
    }

    public static boolean LIZIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (str2.equals(str)) {
                return true;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("/");
            if (str2.equals(X1D.LIZIZ(LIZ))) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return str.toLowerCase().startsWith(str2.toLowerCase());
        }
        return false;
    }

    public static String LIZ(int i, String str, String str2) {
        C37050EgQ c37050EgQ = C73040SlY.LJLJJI;
        if (c37050EgQ == null) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (LJ(str)) {
            return str;
        }
        if (LIZLLL(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C73040SlY.LJLJJI.LIZJ);
            if (i > 0) {
                sb.append("/middle-page");
            }
            sb.append("?aid=");
            sb.append(c37050EgQ.LIZ);
            sb.append("&lang=");
            YE1.LIZLLL(sb, c37050EgQ.LIZIZ, "&scene=", str2, "&jumper_version=1&target=");
            sb.append(URLEncoder.encode(str));
            if (i > 0) {
                sb.append("&type=");
                sb.append(i);
            }
            return sb.toString();
        }
        return str;
    }
}
