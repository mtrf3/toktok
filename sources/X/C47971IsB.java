package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.IsB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47971IsB {
    public static volatile C47969Is9 LIZ;

    public static String LIZ(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 24) {
            return C16880lQ.LLJJ(context);
        }
        if (LIZ == null) {
            LIZ = new C47969Is9(context, new C47970IsA(context));
        }
        C47966Is6 c47966Is6 = LIZ.LIZ;
        synchronized (c47966Is6.LJIIJ) {
            str = c47966Is6.LIZLLL;
        }
        boolean z = true;
        if ("WIFI".equals(str)) {
            int LIZIZ = LIZ.LIZIZ();
            if (LIZIZ <= 4900 || LIZIZ >= 5900) {
                z = false;
            }
            if (z) {
                return "wifi5g";
            }
            return "wifi";
        }
        if ("MOBILE".equals(str)) {
            C47966Is6 c47966Is62 = LIZ.LIZ;
            if (!c47966Is62.LJII && !"NR".equals(c47966Is62.LIZJ)) {
                z = false;
            }
            if (z) {
                return "5g";
            }
            switch (LIZ.LIZ.LIZ) {
                case 1:
                    return "gprs";
                case 2:
                    return "edge";
                case 3:
                    return "umts";
                case 4:
                    return "cdma";
                case 5:
                    return "evdo_0";
                case 6:
                    return "evdo_a";
                case 7:
                    return "1xrtt";
                case 8:
                    return "hsdpa";
                case 9:
                    return "hsupa";
                case 10:
                    return "hspa";
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    return "iden";
                case 12:
                    return "evdo_b";
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    return "lte";
                case 14:
                    return "ehrpd";
                case 15:
                    return "hspap";
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    return "gsm";
                case 17:
                    return "td_scdma";
                case 18:
                default:
                    return LIZ.LIZ();
                case 19:
                    return "lte_ca";
                case 20:
                    return "nr";
            }
        }
        return "unknown";
    }
}
