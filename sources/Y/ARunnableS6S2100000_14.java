package Y;

import X.C77117UOj;
import X.C77123UOp;
import X.VMK;
import X.VML;
import com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ARunnableS6S2100000_14 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        VML vml;
        try {
            C77123UOp.LJJJJLI("url", C77123UOp.LJJJLL(this.s0));
            VMK vmk = ((WebViewMonitorJsBridge) this.l2).webViewDataManager;
            String json = this.s0;
            String eventType = this.s1;
            vmk.getClass();
            o.LJIIJ(json, "json");
            o.LJIIJ(eventType, "eventType");
            if (eventType.hashCode() == 3437289 && eventType.equals("perf") && (vml = vmk.LJII) != null) {
                vml.LIZ(json);
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    public static final void run$0(ARunnableS6S2100000_14 aRunnableS6S2100000_14) {
        boolean LIZ;
        try {
            aRunnableS6S2100000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S2100000_14 aRunnableS6S2100000_14) {
        boolean LIZ;
        try {
            VML navigationManager = ((WebViewMonitorJsBridge) aRunnableS6S2100000_14.l2).getNavigationManager();
            if (navigationManager != null) {
                navigationManager.LJFF(aRunnableS6S2100000_14.s0, aRunnableS6S2100000_14.s1);
            }
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public ARunnableS6S2100000_14(WebViewMonitorJsBridge webViewMonitorJsBridge, String str, String str2, int i) {
        this.$t = i;
        this.l2 = webViewMonitorJsBridge;
        this.s0 = str;
        this.s1 = str2;
    }
}
