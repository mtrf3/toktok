package X;

import Y.IDRunnableS31S0200000_28;
import Y.IDRunnableS3S0300000_28;
import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.entity.NetworkUploadInfo;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.store.LocationCache;
import com.bytedance.bdlocation.thread.ThreadLooperManager;
import com.bytedance.bdlocation.utils.network.NetworkManager;
import com.bytedance.bdlocation.utils.network.WifiChangeListener;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ZoK, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91048ZoK implements WifiChangeListener {
    public static C91048ZoK LJII;
    public List<NetworkUploadInfo> LIZ;
    public int LIZIZ;
    public final Handler LJ;
    public final RunnableC91033Zo5 LJI;
    public long LIZJ = 600000;
    public volatile boolean LIZLLL = false;
    public final Context LJFF = BDLocationConfig.getContext();

    public static C91048ZoK LIZIZ() {
        if (LJII == null) {
            synchronized (C91048ZoK.class) {
                if (LJII == null) {
                    LJII = new C91048ZoK();
                }
            }
        }
        return LJII;
    }

    public final void LIZ() {
        List<NetworkUploadInfo> list = this.LIZ;
        if (list != null && list.size() > 0) {
            try {
                Logger.d("NetworkStatusCollectManagers cacheNetworkStatus");
                LocationCache.getInstance().setStringValue("network_status_cache", new Gson().LJIILL(this.LIZ));
            } catch (Exception unused) {
            }
        }
    }

    public final void LJ() {
        Logger.d("NetworkStatusCollectManagers stop");
        Logger.d("NetworkStatusCollectManagers cancel");
        RunnableC91033Zo5 runnableC91033Zo5 = this.LJI;
        if (runnableC91033Zo5 != null) {
            Logger.d("NetworkStatusCollectManagers NetworkCollectTask stop");
            Handler handler = runnableC91033Zo5.LJLJJI.LJ;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                runnableC91033Zo5.LJLIL = false;
            }
        }
        Handler handler2 = this.LJ;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.LIZLLL = false;
        }
    }

    public C91048ZoK() {
        this.LIZ = new ArrayList();
        if (!((Boolean) C34014DWo.LIZ.getValue()).booleanValue()) {
            try {
                String stringValue = LocationCache.getInstance().getStringValue("network_status_cache");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("NetworkStatusCollectManagers getCacheNetworkStatus:");
                LIZ.append(stringValue);
                Logger.d(X1D.LIZIZ(LIZ));
                if (!TextUtils.isEmpty(stringValue)) {
                    this.LIZ = (List) new Gson().LJII(stringValue, new C91047ZoJ().getType());
                }
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("NetworkStatusCollectManagers getCacheNetworkStatus error:");
                LIZ2.append(e);
                Logger.d(X1D.LIZIZ(LIZ2));
            }
        }
        NetworkManager.getInstance().setListener(this);
        this.LJ = new Handler(ThreadLooperManager.getNetworkCollectWorker());
        this.LJI = new RunnableC91033Zo5(this);
    }

    public static int LIZJ(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable()) {
            return 100;
        }
        int type = networkInfo.getType();
        if (type == 1) {
            return 102;
        }
        if (type == 0 || type == 2 || type == 4 || type == 5 || type == 3) {
            return 101;
        }
        if (type == 7) {
            return 103;
        }
        if (type == 9) {
            return 104;
        }
        if (type != 17) {
            return 100;
        }
        return 105;
    }

    @Override // com.bytedance.bdlocation.utils.network.WifiChangeListener
    public final void notifyWifiChangedTwo(NetworkInfo networkInfo) {
        Logger.d("NetworkStatusCollectManagers notifyWifiChanged two");
        Handler handler = this.LJ;
        if (handler != null) {
            handler.post(new IDRunnableS31S0200000_28(networkInfo, this, 0));
        }
    }

    public final synchronized void LIZLLL(int i, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkStatusCollectManagers setNetworkStatus:ischange-");
        LIZ.append(z);
        LIZ.append("-status-");
        LIZ.append(i);
        LIZ.append("-mLastNetWorkType-");
        LIZ.append(this.LIZIZ);
        LIZ.append("--thread:");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        Logger.d(X1D.LIZIZ(LIZ));
        try {
            NetworkUploadInfo networkUploadInfo = new NetworkUploadInfo();
            networkUploadInfo.timestamp = System.currentTimeMillis() / 1000;
            networkUploadInfo.currentStatus = i;
            if (z) {
                networkUploadInfo.previousStatus = this.LIZIZ;
            }
            this.LIZ.add(networkUploadInfo);
            LIZ();
            this.LIZIZ = i;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NetworkStatusCollectManagers setNetworkStatus exception:");
            LIZ2.append(e.toString());
            Logger.i(X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.bytedance.bdlocation.utils.network.WifiChangeListener
    public final void notifyWifiChanged(Network network, NetworkCapabilities networkCapabilities) {
        Handler handler = this.LJ;
        if (handler != null) {
            handler.post(new IDRunnableS3S0300000_28(this, network, networkCapabilities, 0));
        }
    }
}
