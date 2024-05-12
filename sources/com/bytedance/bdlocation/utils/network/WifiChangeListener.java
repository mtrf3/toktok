package com.bytedance.bdlocation.utils.network;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes9.dex */
public interface WifiChangeListener {
    void notifyWifiChanged(Network network, NetworkCapabilities networkCapabilities);

    void notifyWifiChangedTwo(NetworkInfo networkInfo);
}
