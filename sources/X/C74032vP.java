package X;

import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.2vP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74032vP {
    public static String LIZ(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return UriProtector.parse(str).buildUpon().clearQuery().build().toString();
                }
                return "unknown";
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("clearUrlQuery failed, error: ");
                LIZ.append(e.toString());
                C77125UOr.LJIILJJIL("AnimaXMonitor", X1D.LIZIZ(LIZ));
                return "unknown";
            }
        }
        return "unknown";
    }
}
