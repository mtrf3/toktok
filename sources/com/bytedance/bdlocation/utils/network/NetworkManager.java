package com.bytedance.bdlocation.utils.network;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.bytedance.bdlocation.log.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class NetworkManager {
    public static String TAG = "NetworkManager";
    public ConnectivityManager mConnMgr;
    public volatile boolean mIsRegister;
    public List<WifiChangeListener> mListeners;
    public NetworkCallbackImpl mNetworkCallback;
    public NetworkChangeReceiver mReceiver;

    /* loaded from: classes9.dex */
    public static class SingletonHolder {
        public static NetworkManager instance = new NetworkManager();
    }

    public NetworkManager() {
        this.mListeners = new ArrayList();
        this.mReceiver = new NetworkChangeReceiver();
    }

    public static NetworkManager getInstance() {
        return SingletonHolder.instance;
    }

    public List<WifiChangeListener> getListener() {
        return this.mListeners;
    }

    public void notifyWifiChangedTwo(NetworkInfo networkInfo) {
        try {
            List<WifiChangeListener> list = this.mListeners;
            if (list != null && list.size() > 0) {
                Iterator<WifiChangeListener> it = this.mListeners.iterator();
                while (it.hasNext()) {
                    it.next().notifyWifiChangedTwo(networkInfo);
                }
            }
        } catch (Exception e) {
            Logger.e("notifyWifiChangedTwo error", e);
        }
    }

    public void registerObserver(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WifiCollect:register network mIsRegister is:");
        LIZ.append(this.mIsRegister);
        Logger.i(X1D.LIZIZ(LIZ));
        if (this.mIsRegister) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C16880lQ.LJJLIIIJILLIZJL(this.mReceiver, context, intentFilter);
            this.mIsRegister = true;
        } catch (Throwable th) {
            Logger.e("WifiCollect register network change error", th);
        }
    }

    public void setListener(WifiChangeListener wifiChangeListener) {
        this.mListeners.add(wifiChangeListener);
    }

    public void unRegisterObserver(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WifiCollect:unregister network mIsRegister is:");
        LIZ.append(this.mIsRegister);
        Logger.i(X1D.LIZIZ(LIZ));
        if (this.mIsRegister && context != null) {
            try {
                NetworkChangeReceiver networkChangeReceiver = this.mReceiver;
                if (networkChangeReceiver != null) {
                    C16880lQ.LJJLIIIJL(context, networkChangeReceiver);
                    this.mIsRegister = false;
                }
            } catch (Exception e) {
                Logger.e("WifiCollect:unregister network change error", e);
            }
        }
    }

    public void notifyWifiChanged(Network network, NetworkCapabilities networkCapabilities) {
        try {
            List<WifiChangeListener> list = this.mListeners;
            if (list != null && list.size() > 0) {
                Iterator<WifiChangeListener> it = this.mListeners.iterator();
                while (it.hasNext()) {
                    it.next().notifyWifiChanged(network, networkCapabilities);
                }
            }
        } catch (Exception e) {
            Logger.e("notifyWifiChanged error", e);
        }
    }
}
