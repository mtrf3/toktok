package com.bytedance.bdlocation.utils.network;

import X.X1D;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.bytedance.bdlocation.log.Logger;

/* loaded from: classes9.dex */
public class NetworkCallbackImpl extends ConnectivityManager.NetworkCallback {
    public Network lastNetWork;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        super.onAvailable(network);
        Logger.d("NetworkCallback:onAvailable: network connected");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        super.onLost(network);
        Logger.d("NetworkCallback:onLost: network disconnected");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (network == null || networkCapabilities == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(NetworkManager.TAG);
        LIZ.append(":NetworkCallback:onCapabilitiesChanged network：");
        LIZ.append(network.toString());
        Logger.d(X1D.LIZIZ(LIZ));
        if (this.lastNetWork != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(NetworkManager.TAG);
            LIZ2.append(":NetworkCallback:onCapabilitiesChanged lastNetWork：");
            LIZ2.append(this.lastNetWork.toString());
            Logger.d(X1D.LIZIZ(LIZ2));
        }
        if (network.equals(this.lastNetWork)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(NetworkManager.TAG);
            LIZ3.append(":NetworkCallback:onCapabilitiesChanged: same network");
            Logger.d(X1D.LIZIZ(LIZ3));
            return;
        }
        try {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(NetworkManager.TAG);
            LIZ4.append(":NetworkCallback:resetPollUploadScheduleNetWorkChange");
            Logger.d(X1D.LIZIZ(LIZ4));
            NetworkManager.getInstance().notifyWifiChanged(network, networkCapabilities);
            this.lastNetWork = network;
        } catch (Exception e) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(NetworkManager.TAG);
            LIZ5.append(":NetworkCallback:onCapabilitiesChanged error");
            Logger.e(X1D.LIZIZ(LIZ5), e);
        }
    }
}
