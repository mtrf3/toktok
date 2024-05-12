package X;

import java.net.URISyntaxException;
import kotlin.jvm.internal.o;

/* renamed from: X.EeJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36919EeJ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String urlString) {
        o.LJIIIZ(urlString, "urlString");
        try {
            java.net.URI uri = new java.net.URI(urlString);
            if (uri.getHost() == null) {
                return false;
            }
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                return false;
            }
            return true;
        } catch (URISyntaxException unused) {
            return false;
        }
    }
}
