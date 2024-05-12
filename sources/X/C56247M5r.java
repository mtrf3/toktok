package X;

import com.bytedance.mt.protector.impl.UriProtector;
import ujb.o;

/* renamed from: X.M5r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56247M5r extends AbstractC56238M5i {
    @Override // X.AbstractC56238M5i
    public final void LIZ(android.net.Uri uri) {
        if (C56251M5v.LIZJ) {
            C56251M5v.LJ = "post.push";
            return;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "utm_source");
        if (queryParameter != null && o.LJJJLIIL(queryParameter, "edm_", false)) {
            C56251M5v.LJ = "post.email";
            return;
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "utm_source");
        if (queryParameter2 != null && o.LJJJJ(queryParameter2, "_msg", false)) {
            C56251M5v.LJ = "post.sms";
        } else {
            C56251M5v.LJ = "post.unknown";
        }
    }
}
