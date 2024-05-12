package X;

import android.webkit.WebSettings;
import androidx.webkit.internal.WebViewFeatureInternal;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: X.0Qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07440Qy {
    public static C07950Sx LIZ(WebSettings webSettings) {
        C0T2 c0t2 = C07960Sy.LIZ;
        c0t2.getClass();
        return new C07950Sx((WebSettingsBoundaryInterface) EMD.LIZ(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) c0t2.LIZ).convertSettings(webSettings)));
    }

    public static void LIZIZ(WebSettings webSettings, int i) {
        if (WebViewFeatureInternal.FORCE_DARK_STRATEGY.LIZLLL()) {
            ((WebSettingsBoundaryInterface) LIZ(webSettings).LJLIL).setForceDarkBehavior(i);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
