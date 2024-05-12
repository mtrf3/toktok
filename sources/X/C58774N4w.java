package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.N4w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58774N4w {
    public static final String LIZ;
    public static volatile C58773N4v LIZIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(NNG.LIZIZ.LIZJ());
        LIZ2.append("://adx");
        LIZ = X1D.LIZIZ(LIZ2);
    }

    public static final String LIZ(String str, String str2) {
        if (str != null && s.LJJJLZIJ(str, "__back_url__", false)) {
            if (str2 != null && str2.length() > 0) {
                str = UriProtector.parse(str).buildUpon().appendQueryParameter("tag", str2).build().toString();
            }
            if (str != null) {
                String encode = android.net.Uri.encode(LIZ);
                o.LJIIIIZZ(encode, "encode(ADX_DEEP_LINK)");
                return ujb.o.LJJJJZ(str, "__back_url__", encode, false);
            }
            return null;
        }
        return str;
    }
}
