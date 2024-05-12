package X;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.common.util.NetworkUtils;

/* renamed from: X.Irq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47950Irq {
    public static C47950Irq LIZLLL;
    public int LIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final TelephonyManager LIZIZ;
    public C47999Isd LIZJ;

    static {
        C16880lQ.LJLLJ(C47950Irq.class);
        LIZLLL = null;
    }

    public C47950Irq(Context context) {
        if (context == null) {
            return;
        }
        this.LIZIZ = (TelephonyManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "phone");
    }

    public static synchronized C47950Irq LIZ(Context context) {
        C47950Irq c47950Irq;
        synchronized (C47950Irq.class) {
            if (LIZLLL == null) {
                LIZLLL = new C47950Irq(context);
            }
            c47950Irq = LIZLLL;
        }
        return c47950Irq;
    }

    public final int LIZIZ(Context context) {
        Integer LIZIZ;
        try {
            if (NetworkUtils.getNetworkType(context) == EnumC48210Iw2.WIFI && (LIZIZ = C47975IsF.LIZIZ((WifiManager) C16880lQ.LLILL(context, "wifi"))) != null) {
                this.LIZ = LIZIZ.intValue();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return this.LIZ;
    }
}
