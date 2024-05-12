package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;

/* renamed from: X.Eh2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37088Eh2 {
    public static void LIZ(View view, C79604VMa c79604VMa) {
        if (view instanceof WebView) {
            VMI.LJ.LJIILL((WebView) view, c79604VMa);
        } else if (view instanceof VNS) {
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.reportCustom((VNS) view, c79604VMa);
        } else {
            HybridMultiMonitor.getInstance().customReport(c79604VMa);
        }
    }
}
