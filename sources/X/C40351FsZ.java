package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.FsZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40351FsZ {
    public static int LIZ(String url) {
        o.LJIIJ(url, "url");
        try {
            android.net.Uri uri = UriProtector.parse(url);
            o.LJFF(uri, "uri");
            String host = uri.getHost();
            if (host != null && ujb.o.LJJJJ(host, "_page", false)) {
                return 1;
            }
            String host2 = uri.getHost();
            if (host2 != null && ujb.o.LJJJJ(host2, "_popup", false)) {
                return 2;
            }
            String host3 = uri.getHost();
            if (host3 == null || !ujb.o.LJJJJ(host3, "_card", false)) {
                String host4 = uri.getHost();
                if (host4 == null) {
                    return 1;
                }
                if (!ujb.o.LJJJJ(host4, "_xr", false)) {
                    return 1;
                }
                return 4;
            }
            return 3;
        } catch (Exception unused) {
            return 1;
        }
    }
}
