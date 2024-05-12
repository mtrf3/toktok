package X;

import com.bytedance.mt.protector.impl.UriProtector;
import ujb.o;

/* loaded from: classes9.dex */
public final class JWK {
    public static String LIZ(String str) {
        boolean z;
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "bundle");
            kotlin.jvm.internal.o.LJI(queryParameter);
            return o.LJJJJZ(queryParameter, "/template.js", "", false);
        } catch (Exception unused) {
            return "";
        }
    }
}
