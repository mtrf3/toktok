package com.bytedance.realx.base;

import X.C16880lQ;
import X.X1D;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.ParcelFileDescriptor;

/* loaded from: classes9.dex */
public class NetworkMonitor {
    public String cellularIfName;
    public Network cellularNetwork;
    public Boolean cellularNetworkRequested;
    public long cellularRequestCallback;
    public ConnectivityManager connectivityManager;
    public NetworkMonitoCallback networkMonitorCallback;
    public Boolean shouldEmitAvailable;

    /* loaded from: classes9.dex */
    public class NetworkMonitoCallback extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            synchronized (NetworkMonitor.this) {
                RXLogging.w("NetworkMonitor", "on unavailable");
                long j = NetworkMonitor.this.cellularRequestCallback;
                if (j != 0) {
                    NativeNetworkFunctions.nativeOnNetworkUnavailable(j);
                }
            }
        }

        public NetworkMonitoCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            synchronized (NetworkMonitor.this) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("on available, network: ");
                LIZ.append(network.toString());
                RXLogging.w("NetworkMonitor", X1D.LIZIZ(LIZ));
                NetworkMonitor networkMonitor = NetworkMonitor.this;
                if (networkMonitor.cellularNetwork == null) {
                    networkMonitor.cellularNetwork = network;
                    networkMonitor.shouldEmitAvailable = Boolean.TRUE;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            synchronized (NetworkMonitor.this) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("on lost, network: ");
                LIZ.append(network.toString());
                RXLogging.w("NetworkMonitor", X1D.LIZIZ(LIZ));
                if (network.equals(NetworkMonitor.this.cellularNetwork)) {
                    NetworkMonitor networkMonitor = NetworkMonitor.this;
                    networkMonitor.cellularNetwork = null;
                    long j = networkMonitor.cellularRequestCallback;
                    if (j != 0 && (str = networkMonitor.cellularIfName) != null) {
                        NativeNetworkFunctions.nativeOnNetworkLost(str, j);
                    }
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            String str;
            synchronized (NetworkMonitor.this) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("on network block status changed, network: ");
                LIZ.append(network.toString());
                LIZ.append(", blocked: ");
                LIZ.append(z);
                RXLogging.w("NetworkMonitor", X1D.LIZIZ(LIZ));
                if (network.equals(NetworkMonitor.this.cellularNetwork)) {
                    NetworkMonitor networkMonitor = NetworkMonitor.this;
                    long j = networkMonitor.cellularRequestCallback;
                    if (j != 0 && (str = networkMonitor.cellularIfName) != null) {
                        NativeNetworkFunctions.nativeOnBlockedStatusChanged(str, z, j);
                    }
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            synchronized (NetworkMonitor.this) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("on capabilities changed, network: ");
                LIZ.append(network.toString());
                LIZ.append(", capabilities: ");
                LIZ.append(networkCapabilities.toString());
                RXLogging.w("NetworkMonitor", X1D.LIZIZ(LIZ));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            NetworkMonitor networkMonitor;
            String str;
            synchronized (NetworkMonitor.this) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("on link properties changed, network: ");
                LIZ.append(network.toString());
                LIZ.append(", capabilities: ");
                LIZ.append(linkProperties.toString());
                RXLogging.w("NetworkMonitor", X1D.LIZIZ(LIZ));
                if (network.equals(NetworkMonitor.this.cellularNetwork)) {
                    NetworkMonitor.this.cellularIfName = linkProperties.getInterfaceName();
                    NetworkMonitor networkMonitor2 = NetworkMonitor.this;
                    if (networkMonitor2.cellularRequestCallback != 0 && networkMonitor2.shouldEmitAvailable.booleanValue() && (str = (networkMonitor = NetworkMonitor.this).cellularIfName) != null) {
                        NativeNetworkFunctions.nativeOnNetworkAvailable(str, networkMonitor.cellularRequestCallback);
                        NetworkMonitor.this.shouldEmitAvailable = Boolean.FALSE;
                    }
                }
            }
        }
    }

    public void cancelRequestCellularNetwork() {
        synchronized (this) {
            if (this.cellularNetworkRequested.booleanValue()) {
                try {
                    this.connectivityManager.unregisterNetworkCallback(this.networkMonitorCallback);
                    this.cellularNetwork = null;
                    this.cellularRequestCallback = 0L;
                    this.cellularNetworkRequested = Boolean.FALSE;
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Cancel request cellular network exception: ");
                    LIZ.append(e.toString());
                    RXLogging.w("NetworkMonitor", X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public static NetworkMonitor create() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return new NetworkMonitor();
    }

    public NetworkMonitor() {
        Boolean bool = Boolean.FALSE;
        this.cellularNetworkRequested = bool;
        this.shouldEmitAvailable = bool;
        this.networkMonitorCallback = null;
        this.connectivityManager = (ConnectivityManager) C16880lQ.LLILL(ContextUtils.getApplicationContext(), "connectivity");
    }

    public int bindSocketToCellularNetwork(int i) {
        int i2;
        synchronized (this) {
            if (this.cellularNetwork != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("bind socket to network, fd: ");
                LIZ.append(i);
                RXLogging.w("NetworkMonitor", X1D.LIZIZ(LIZ));
                try {
                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(i);
                    this.cellularNetwork.bindSocket(fromFd.getFileDescriptor());
                    fromFd.detachFd();
                    fromFd.close();
                    i2 = 0;
                } catch (Exception e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("bind socket to network exception: ");
                    LIZ2.append(e.toString());
                    RXLogging.w("NetworkMonitor", X1D.LIZIZ(LIZ2));
                    C16880lQ.LLLLIIL(e);
                }
            }
            i2 = -1;
        }
        return i2;
    }

    public void requestCellularNetwork(long j) {
        synchronized (this) {
            if (!this.cellularNetworkRequested.booleanValue()) {
                try {
                    this.cellularRequestCallback = j;
                    NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
                    NetworkMonitoCallback networkMonitoCallback = new NetworkMonitoCallback();
                    this.networkMonitorCallback = networkMonitoCallback;
                    this.connectivityManager.requestNetwork(build, networkMonitoCallback);
                    this.cellularNetworkRequested = Boolean.TRUE;
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Request cellular network exception: ");
                    LIZ.append(e.toString());
                    RXLogging.w("NetworkMonitor", X1D.LIZIZ(LIZ));
                }
            }
        }
    }
}
