package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VLR {
    public static final void LIZ(int i, View view, String str, String str2, int i2, int i3, String str3, int i4, String str4, int i5) {
        WebView webView;
        VNS vns;
        if (i != 0) {
            if (i != 1 || !(view instanceof VNS) || (vns = (VNS) view) == null) {
                return;
            }
            VLQ vlq = new VLQ();
            vlq.LJLILLLLZI = str;
            vlq.LJLJI = str2;
            vlq.LJLJJI = i2;
            vlq.LJLJJL = i3;
            vlq.LJLJJLL = str3;
            vlq.LJLJLLL = i4;
            vlq.LJLJLJ = str4;
            vlq.LJLJL = i5;
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.reportJsbFetchError(vns, vlq);
            return;
        }
        if (!(view instanceof WebView) || (webView = (WebView) view) == null) {
            return;
        }
        VLP vlp = new VLP();
        vlp.LIZ = str;
        vlp.LIZIZ = str2;
        vlp.LIZJ = i2;
        vlp.LIZLLL = i3;
        vlp.LJ = str3;
        vlp.LJI = i4;
        vlp.LJFF = str4;
        vlp.LJII = i5;
        VMI vmi = VMI.LJ;
        vmi.getClass();
        VM4 vm4 = new VM4("fetchError");
        vm4.LIZIZ();
        try {
            if (!vmi.LJIL()) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            } else if (!vmi.LIZJ.LJFF(webView)) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            } else if (!VMS.webFetch.isEnabled()) {
                vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            } else {
                JSONObject jSONObject = new JSONObject();
                vlp.LIZ(jSONObject);
                vmi.LIZJ.LIZLLL(webView, vm4, jSONObject);
            }
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
    }
}
