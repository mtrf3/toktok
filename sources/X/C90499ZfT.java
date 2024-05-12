package X;

import android.content.Context;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.wifidirect.IWiFiP2PListener;
import com.byted.cast.wifidirect.WiFiP2PHelper;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ZfT, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90499ZfT {
    public final WiFiP2PHelper LIZ = WiFiP2PHelper.getInstance();
    public boolean LIZIZ;
    public final ContextManager.CastContext LIZJ;
    public final CastLogger LIZLLL;

    public final void LIZ() {
        WiFiP2PHelper wiFiP2PHelper = this.LIZ;
        if (wiFiP2PHelper != null) {
            wiFiP2PHelper.deInit();
            this.LIZLLL.i("WifiP2PManager", "wifi-p2p manager deInit");
        }
    }

    public final boolean LIZJ() {
        if (!this.LIZIZ) {
            return false;
        }
        this.LIZ.discoverPeers();
        this.LIZLLL.i("WifiP2PManager", "start wifi-p2p browse");
        return true;
    }

    public final boolean LIZLLL() {
        if (!this.LIZIZ) {
            return false;
        }
        this.LIZ.stopDiscover();
        this.LIZLLL.i("WifiP2PManager", "stop wifi-p2p browse");
        return true;
    }

    public C90499ZfT(ContextManager.CastContext castContext) {
        this.LIZJ = castContext;
        this.LIZLLL = ContextManager.getLogger(castContext);
    }

    public final void LIZIZ(Context context, C90445Zeb c90445Zeb, IWiFiP2PListener iWiFiP2PListener) {
        List<C90815ZkZ> list;
        if (this.LIZ != null && ContextManager.getConfigManager(this.LIZJ).getInitConfig().isEnableWifiP2PSearch()) {
            this.LIZ.init(context, iWiFiP2PListener);
            CastLogger castLogger = this.LIZLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("wifi-p2p isWifiDirectSupported:");
            LIZ.append(this.LIZ.isWifiDirectSupported());
            LIZ.append(",isWifiDirectEnabled:");
            LIZ.append(this.LIZ.isWifiDirectEnabled());
            castLogger.d("WifiP2PManager", X1D.LIZIZ(LIZ));
            if (this.LIZ.isWifiDirectSupported()) {
                this.LIZIZ = true;
                this.LIZLLL.d("WifiP2PManager", "allow wifi-p2p browse");
                return;
            }
            return;
        }
        this.LIZIZ = false;
        if (c90445Zeb == null || (list = c90445Zeb.LIZLLL) == null) {
            return;
        }
        ((CopyOnWriteArrayList) list).clear();
    }
}
