package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0E2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0E2 {
    public static volatile C0E2 LIZLLL = new C0E2();
    public boolean LIZ;
    public final java.util.Set<Network> LIZIZ = new HashSet();
    public Context LIZJ;

    public final void LIZ() {
        NetworkInfo LJJLI;
        int type;
        C39281gS c39281gS = C35191Zr.LIZIZ().LIZJ;
        if (c39281gS == null || !c39281gS.LIZJ) {
            if (!LIZIZ()) {
                return;
            }
        } else if (((HashSet) this.LIZIZ).isEmpty()) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(this.LIZJ, "connectivity");
        if (connectivityManager != null && (LJJLI = C16880lQ.LJJLI(connectivityManager)) != null && LJJLI.isConnected() && (type = LJJLI.getType()) != 1 && type == 0) {
            switch (LJJLI.getSubtype()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                case 12:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                case 14:
                case 15:
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                case 17:
                case 18:
                case 20:
                    return;
                case 19:
                default:
                    String subtypeName = LJJLI.getSubtypeName();
                    if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA")) {
                        return;
                    }
                    subtypeName.equalsIgnoreCase("CDMA2000");
                    return;
            }
        }
    }

    public final boolean LIZIZ() {
        NetworkInfo LJJLI;
        C39281gS c39281gS = C35191Zr.LIZIZ().LIZJ;
        if (c39281gS != null && c39281gS.LIZJ) {
            return !((HashSet) this.LIZIZ).isEmpty();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(this.LIZJ, "connectivity");
            if (connectivityManager == null || (LJJLI = C16880lQ.LJJLI(connectivityManager)) == null) {
                return false;
            }
            if (!LJJLI.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public final void LIZJ(Network network) {
        String str;
        boolean z = !((HashSet) this.LIZIZ).isEmpty();
        Iterator it = ((HashSet) this.LIZIZ).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Network network2 = (Network) it.next();
            if (network2.equals(network)) {
                ((HashSet) this.LIZIZ).remove(network2);
                break;
            }
        }
        boolean isEmpty = ((HashSet) this.LIZIZ).isEmpty();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNetworkUnavailable: ");
        LIZ.append(network.toString());
        if (z && isEmpty) {
            str = ". network become lost!!!";
        } else {
            str = "";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }
}
