package X;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Handler;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.thread.ThreadLooperManager;
import com.bytedance.bdlocation.utils.network.NetworkManager;
import com.bytedance.bdlocation.utils.network.WifiChangeListener;

/* renamed from: X.ZoL, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91049ZoL implements WifiChangeListener {
    public static volatile C91049ZoL LJ;
    public static long LJFF;
    public volatile boolean LIZ;
    public RunnableC91034Zo6 LIZIZ;
    public final Handler LIZJ = new Handler(ThreadLooperManager.getPollUploadWorker());
    public long LIZLLL;

    public final synchronized void LIZJ() {
        if (!this.LIZ) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new RunnableC91034Zo6(this);
            }
            this.LIZJ.post(this.LIZIZ);
            this.LIZ = true;
        }
    }

    public static C91049ZoL LIZ() {
        if (LJ == null) {
            synchronized (C91049ZoL.class) {
                if (LJ == null) {
                    LJ = new C91049ZoL();
                }
            }
        }
        return LJ;
    }

    public final long LIZIZ() {
        if (this.LIZLLL == 0) {
            this.LIZLLL = BDLocationConfig.getUploadInterval();
        }
        if (this.LIZLLL < 60000) {
            this.LIZLLL = 60000L;
        }
        return this.LIZLLL;
    }

    public C91049ZoL() {
        NetworkManager.getInstance().setListener(this);
    }

    public final void LJ() {
        if (LIZIZ() == BDLocationConfig.getNetworkStatusChangeUploadInterval() || !this.LIZ) {
            return;
        }
        this.LIZLLL = BDLocationConfig.getUploadInterval();
        long currentTimeMillis = System.currentTimeMillis() - LJFF;
        if (currentTimeMillis >= BDLocationConfig.getNetworkStatusChangeUploadInterval()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDLocation_UploadScheduleController_pollupload resetPollUploadScheduleNetWorkChange:onStart");
            LIZ.append(LIZIZ());
            Logger.d(X1D.LIZIZ(LIZ));
            LIZLLL(100L);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BDLocation_UploadScheduleController_pollupload resetPollUploadScheduleNetWorkChange:resetControllerIntervalMs");
        LIZ2.append(LIZIZ());
        Logger.d(X1D.LIZIZ(LIZ2));
        LIZLLL(BDLocationConfig.getNetworkStatusChangeUploadInterval() - currentTimeMillis);
    }

    public final void LIZLLL(long j) {
        RunnableC91034Zo6 runnableC91034Zo6 = this.LIZIZ;
        if (runnableC91034Zo6 != null) {
            runnableC91034Zo6.LJLJI = j;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDLocation_LocationScheduler_pollupload resetIntervalMs intervalMs：");
            LIZ.append(j);
            Logger.d(X1D.LIZIZ(LIZ));
            runnableC91034Zo6.LJLJJI.LIZJ.removeCallbacksAndMessages(null);
            runnableC91034Zo6.LJLJJI.LIZJ.postDelayed(runnableC91034Zo6, j);
        }
    }

    @Override // com.bytedance.bdlocation.utils.network.WifiChangeListener
    public final void notifyWifiChangedTwo(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isAvailable()) {
            Logger.d("UploadScheduleController notifyWifiChanged two");
            LJ();
        }
    }

    @Override // com.bytedance.bdlocation.utils.network.WifiChangeListener
    public final void notifyWifiChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasCapability(16)) {
            Logger.d("UploadScheduleController notifyWifiChanged");
            LJ();
        }
    }
}
