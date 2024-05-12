package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.9x6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253449x6 extends AbstractC253439x5 {
    @Override // X.AbstractC253439x5
    public final void LIZ(android.net.Uri uri) {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        String queryParameter = UriProtector.getQueryParameter(uri, "message");
        if (LJIIIIZZ != null && queryParameter != null) {
            C31811Ce7.LIZIZ(LJIIIIZZ, queryParameter);
        }
    }
}
