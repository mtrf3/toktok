package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.9x3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253419x3 extends AbstractC253439x5 {
    @Override // X.AbstractC253439x5
    public final void LIZ(android.net.Uri uri) {
        String queryParameter = UriProtector.getQueryParameter(uri, "enter_from");
        if (queryParameter != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("event_type", "logout");
            c188727au.LJIIIZ("enter_from", queryParameter);
            FMX.LJIIL("hydrogen_event", c188727au.LIZ);
            InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(queryParameter);
            LIZ.append("_hydrogen");
            LJIIIIZZ.logout(X1D.LIZIZ(LIZ), "user_logout");
            return;
        }
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ2 != null) {
            C31811Ce7.LIZIZ(LJIIIIZZ2, "Logout url parameter is invalid. Please add enter_from.");
        }
    }
}
