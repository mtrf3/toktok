package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.M4f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56209M4f {
    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String host = UriProtector.parse(str).getHost();
        if (TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame")) {
            return true;
        }
        return false;
    }
}
