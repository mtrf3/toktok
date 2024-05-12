package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F6L extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "ec_lynxview");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        String query = uri.getQuery();
        if (query != null) {
            HashMap LIZIZ = C37093Eh7.LIZIZ(query);
            String[] strArr = C35792E2y.LIZIZ;
            if (strArr != null) {
                boolean z2 = false;
                for (String str : strArr) {
                    if (LIZIZ.containsKey(str)) {
                        LIZIZ.remove(str);
                        z2 = true;
                    }
                }
                if (z2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(uri.getScheme());
                    LIZ.append("://");
                    LIZ.append(uri.getAuthority());
                    LIZ.append('?');
                    LIZ.append(C37093Eh7.LIZ(LIZIZ));
                    uri = UriProtector.parse(X1D.LIZIZ(LIZ));
                    o.LJIIIIZZ(uri, "parse(safeUriString)");
                }
            }
        }
        SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").authority("lynxview").build().toString()).open();
    }
}
