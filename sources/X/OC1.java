package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.router.Strategy;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OC1 {
    public InterfaceC65784Pro<? extends Strategy> LIZ;
    public InterfaceC65784Pro<? extends Strategy> LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0093, code lost:
    
        if ("bullet".equals(r3.getAuthority()) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.router.Strategy LIZ(android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OC1.LIZ(android.net.Uri):com.ss.android.ugc.aweme.ecommerce.router.Strategy");
    }

    public static Uri.Builder LIZIZ(android.net.Uri uri, List list) {
        boolean z;
        Uri.Builder builder = new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Iterator LIZ = C47117IeP.LIZ(uri, "uri.queryParameterNames");
            while (LIZ.hasNext()) {
                String str = (String) LIZ.next();
                builder.appendQueryParameter(str, UriProtector.getQueryParameter(uri, str));
            }
        } else {
            Iterator LIZ2 = C47117IeP.LIZ(uri, "uri.queryParameterNames");
            while (LIZ2.hasNext()) {
                String str2 = (String) LIZ2.next();
                if (!list.contains(str2)) {
                    builder.appendQueryParameter(str2, UriProtector.getQueryParameter(uri, str2));
                }
            }
        }
        o.LJIIIIZZ(builder, "builder");
        return builder;
    }
}
