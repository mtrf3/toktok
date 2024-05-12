package com.byted.cast.common.network;

import X.C16880lQ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import com.byted.cast.common.Logger;
import com.byted.cast.common.network.NetworkChangeReceiver2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes29.dex */
public final class NetworkChangeReceiver2 {
    public static final Companion Companion = new Companion();
    public final Context context;
    public boolean isConnected;
    public boolean isRegistered;
    public ConnectivityManager mConnectivityManager;
    public ConnectivityManager.NetworkCallback mNetWorkCallback;
    public BroadcastReceiver mReceiver;
    public final NetworkChangeListener networkListener;

    /* loaded from: classes29.dex */
    public interface NetworkChangeListener {
        void onAvailable(Network network);

        void onLost(Network network);
    }

    public final void register() {
        ConnectivityManager connectivityManager;
        ConnectivityManager connectivityManager2;
        if (this.mConnectivityManager == null) {
            this.mConnectivityManager = (ConnectivityManager) C16880lQ.LLILL(C16880lQ.LLLLL(this.context), "connectivity");
        }
        Logger.i("NetworkChangeReceiver", "api level >= 21");
        if (this.mNetWorkCallback == null) {
            this.mNetWorkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.byted.cast.common.network.NetworkChangeReceiver2$register$1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    o.LJIIJ(network, "network");
                    Logger.i("NetworkChangeReceiver", "onAvailable");
                    NetworkChangeReceiver2.NetworkChangeListener networkListener = NetworkChangeReceiver2.this.getNetworkListener();
                    if (networkListener != null) {
                        networkListener.onAvailable(network);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    o.LJIIJ(network, "network");
                    Logger.i("NetworkChangeReceiver", "onLost");
                    NetworkChangeReceiver2.NetworkChangeListener networkListener = NetworkChangeReceiver2.this.getNetworkListener();
                    if (networkListener != null) {
                        networkListener.onLost(network);
                    }
                }
            };
        }
        if (this.isRegistered) {
            Logger.w("NetworkChangeReceiver", "already registered");
            return;
        }
        Logger.i("NetworkChangeReceiver", "register network callback");
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager.NetworkCallback networkCallback = this.mNetWorkCallback;
            if (networkCallback != null && (connectivityManager2 = this.mConnectivityManager) != null) {
                connectivityManager2.registerDefaultNetworkCallback(networkCallback);
            }
        } else {
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            ConnectivityManager.NetworkCallback networkCallback2 = this.mNetWorkCallback;
            if (networkCallback2 != null && (connectivityManager = this.mConnectivityManager) != null) {
                connectivityManager.registerNetworkCallback(build, networkCallback2);
            }
        }
        this.isRegistered = true;
    }

    public final void unregister() {
        ConnectivityManager connectivityManager;
        if (!this.isRegistered) {
            Logger.w("NetworkChangeReceiver", "no need unregister network callback");
            return;
        }
        Logger.i("NetworkChangeReceiver", "unregister network callback");
        this.isRegistered = false;
        ConnectivityManager.NetworkCallback networkCallback = this.mNetWorkCallback;
        if (networkCallback != null && (connectivityManager = this.mConnectivityManager) != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        }
        this.mNetWorkCallback = null;
        this.mConnectivityManager = null;
    }

    /* loaded from: classes29.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final NetworkChangeListener getNetworkListener() {
        return this.networkListener;
    }

    public NetworkChangeReceiver2(Context context, NetworkChangeListener networkChangeListener) {
        o.LJIIJ(context, "context");
        this.context = context;
        this.networkListener = networkChangeListener;
    }
}
