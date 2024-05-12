package Y;

import X.C38099ExL;
import X.C38101ExN;
import X.C38163EyN;
import X.C76800UCe;
import X.C77117UOj;
import X.EnumC65355Pkt;
import X.InterfaceC65784Pro;
import X.VM4;
import X.VMI;
import X.VMS;
import android.webkit.WebView;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class AObjectS84S0300000_14 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS84S0300000_14 aObjectS84S0300000_14) {
        VM4 vm4 = new VM4("jsbError");
        vm4.LIZIZ();
        try {
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
        if (!((VMI) aObjectS84S0300000_14.l2).LJIL() || !((VMI) aObjectS84S0300000_14.l2).LIZJ.LJFF((WebView) aObjectS84S0300000_14.l0) || !VMS.webJSB.isEnabled()) {
            vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            return C76800UCe.LIZ;
        }
        WebView webView = (WebView) aObjectS84S0300000_14.l0;
        if (webView == null) {
            vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            return C76800UCe.LIZ;
        }
        ((VMI) aObjectS84S0300000_14.l2).LIZJ.LIZLLL(webView, vm4, C38163EyN.LIZIZ((C38101ExN) aObjectS84S0300000_14.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS84S0300000_14 aObjectS84S0300000_14) {
        VM4 vm4 = new VM4("jsbPerf");
        vm4.LIZIZ();
        try {
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
        if (!((VMI) aObjectS84S0300000_14.l2).LJIL() || !((VMI) aObjectS84S0300000_14.l2).LIZJ.LJFF((WebView) aObjectS84S0300000_14.l0) || !VMS.webJSB.isEnabled()) {
            vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            return C76800UCe.LIZ;
        }
        if (((WebView) aObjectS84S0300000_14.l0) == null) {
            vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            return C76800UCe.LIZ;
        }
        ((VMI) aObjectS84S0300000_14.l2).LIZJ.LIZLLL((WebView) aObjectS84S0300000_14.l0, vm4, C38163EyN.LIZ((C38099ExL) aObjectS84S0300000_14.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS84S0300000_14 aObjectS84S0300000_14) {
        VM4 vm4 = new VM4("jsbPerfV2");
        try {
            vm4.LIZIZ();
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
        if (!((VMI) aObjectS84S0300000_14.l2).LJIL() || !((VMI) aObjectS84S0300000_14.l2).LIZJ.LJFF((WebView) aObjectS84S0300000_14.l0) || !VMS.webJSB.isEnabled()) {
            vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            return C76800UCe.LIZ;
        }
        WebView webView = (WebView) aObjectS84S0300000_14.l0;
        if (webView == null) {
            vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            return C76800UCe.LIZ;
        }
        ((VMI) aObjectS84S0300000_14.l2).LIZJ.LIZLLL(webView, vm4, new JSONObject((Map) aObjectS84S0300000_14.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS84S0300000_14 aObjectS84S0300000_14) {
        VM4 vm4 = new VM4("jsbPv");
        try {
            vm4.LIZIZ();
        } catch (Throwable th) {
            vm4.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
        if (!((VMI) aObjectS84S0300000_14.l2).LJIL() || !((VMI) aObjectS84S0300000_14.l2).LIZJ.LJFF((WebView) aObjectS84S0300000_14.l0) || !VMS.webJSB.isEnabled()) {
            vm4.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            return C76800UCe.LIZ;
        }
        WebView webView = (WebView) aObjectS84S0300000_14.l0;
        if (webView == null) {
            vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            return C76800UCe.LIZ;
        }
        ((VMI) aObjectS84S0300000_14.l2).LIZJ.LIZLLL(webView, vm4, new JSONObject((Map) aObjectS84S0300000_14.l1));
        return C76800UCe.LIZ;
    }

    public AObjectS84S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
    }
}
