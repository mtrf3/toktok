package com.byted.cast.common.network;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.Logger;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.NetworkUtil;
import com.byted.cast.common.network.NetworkBehavior;
import com.byted.cast.common.network.NetworkChangeReceiver;

/* loaded from: classes29.dex */
public class NetworkBehavior {
    public NetworkBehaviorListener behaviorListener;
    public ContextManager.CastContext castContext;
    public ConnectivityManager connectivityManager;
    public boolean isRegisterd;
    public String mCurrentIp = "";
    public NetworkChangeReceiver netWorkChangeReceiver;
    public NetworkBehaviorData networkBehaviorData;
    public NetworkChangeReceiver.NetworkChangeListener networkChangeListener;

    /* renamed from: com.byted.cast.common.network.NetworkBehavior$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass1 implements NetworkChangeReceiver.NetworkChangeListener {
        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAvailable$2() {
            Logger.i("NetworkChangeBehavior", "onAvailable");
            NetworkBehavior.this.doAfterNetworkChange(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLost$1() {
            Logger.i("NetworkChangeBehavior", "onLost");
            NetworkBehavior.this.doAfterNetworkChange(false);
        }

        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(Context context) {
            boolean z;
            Logger.i("NetworkChangeBehavior", "onReceive");
            NetworkBehavior.this.connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            NetworkInfo LJJLI = C16880lQ.LJJLI(NetworkBehavior.this.connectivityManager);
            if (LJJLI != null && LJJLI.isAvailable()) {
                z = true;
            } else {
                z = false;
            }
            NetworkBehavior.this.doAfterNetworkChange(z);
        }

        @Override // com.byted.cast.common.network.NetworkChangeReceiver.NetworkChangeListener
        public void onAvailable(Network network) {
            Dispatcher.getInstance().runOnByteCastThread(new Runnable() { // from class: X.ZZw
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkBehavior.AnonymousClass1.this.lambda$onAvailable$2();
                }
            });
        }

        @Override // com.byted.cast.common.network.NetworkChangeReceiver.NetworkChangeListener
        public void onLost(Network network) {
            Dispatcher.getInstance().runOnByteCastThread(new Runnable() { // from class: X.ZZu
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkBehavior.AnonymousClass1.this.lambda$onLost$1();
                }
            });
        }

        @Override // com.byted.cast.common.network.NetworkChangeReceiver.NetworkChangeListener
        public void onReceive(final Context context, Intent intent) {
            Dispatcher.getInstance().runOnByteCastThread(new Runnable() { // from class: X.ZZv
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkBehavior.AnonymousClass1.this.lambda$onReceive$0(context);
                }
            });
        }
    }

    /* loaded from: classes29.dex */
    public interface NetworkBehaviorListener {
        void onReady(NetworkBehaviorData networkBehaviorData);
    }

    public synchronized void unRegisterNetworkChangeReceiver() {
        if (!this.isRegisterd) {
            Logger.w("NetworkChangeBehavior", "no need unRegisterNetworkChangeReceiver");
            return;
        }
        Logger.i("NetworkChangeBehavior", "unRegisterNetworkChangeReceiver");
        NetworkChangeReceiver networkChangeReceiver = this.netWorkChangeReceiver;
        if (networkChangeReceiver != null) {
            networkChangeReceiver.unRegister();
            this.netWorkChangeReceiver = null;
            this.networkChangeListener = null;
            this.mCurrentIp = "";
            this.isRegisterd = false;
        }
    }

    public void doAfterNetworkChange(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isNetworkAvailable:");
        LIZ.append(z);
        Logger.i("NetworkChangeBehavior", X1D.LIZIZ(LIZ));
        if (z) {
            String str = this.mCurrentIp;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(NetworkUtil.getLocalIpAddr(this.castContext));
            LIZ2.append("");
            if (TextUtils.equals(str, X1D.LIZIZ(LIZ2))) {
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(NetworkUtil.getLocalIpAddr(this.castContext));
            LIZ3.append("");
            this.mCurrentIp = X1D.LIZIZ(LIZ3);
            Logger.i("NetworkChangeBehavior", "network open");
            this.behaviorListener.onReady(this.networkBehaviorData);
            return;
        }
        this.mCurrentIp = "";
        if (this.networkBehaviorData.getCastContext() == null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("aid:");
            LIZ4.append(this.networkBehaviorData.getAppId());
            LIZ4.append(",did:");
            LIZ4.append(this.networkBehaviorData.getDeviceId());
            Monitor.sendSinkEvent("bytecast_sink_network_lost", X1D.LIZIZ(LIZ4));
            return;
        }
        CastMonitor monitor = ContextManager.getMonitor(this.networkBehaviorData.getCastContext());
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("aid:");
        LIZ5.append(this.networkBehaviorData.getAppId());
        LIZ5.append(",did:");
        LIZ5.append(this.networkBehaviorData.getDeviceId());
        monitor.sendSinkEvent("bytecast_sink_network_lost", X1D.LIZIZ(LIZ5));
    }

    public synchronized void initNetworkChangeReceiver(NetworkBehaviorData networkBehaviorData) {
        Logger.i("NetworkChangeBehavior", "initNetworkChangeReceiver");
        if (this.isRegisterd) {
            Logger.w("NetworkChangeBehavior", "is registered");
            return;
        }
        if (networkBehaviorData == null || networkBehaviorData.getContext() == null) {
            Logger.i("NetworkChangeBehavior", "networkBehaviorData or context is null");
            return;
        }
        this.networkBehaviorData = networkBehaviorData;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mCurrentIp);
        LIZ.append(NetworkUtil.getLocalIpAddr(this.castContext));
        this.mCurrentIp = X1D.LIZIZ(LIZ);
        this.connectivityManager = (ConnectivityManager) C16880lQ.LLILL(networkBehaviorData.getContext(), "connectivity");
        this.networkChangeListener = new AnonymousClass1();
        NetworkChangeReceiver networkChangeReceiver = new NetworkChangeReceiver(C16880lQ.LLLLL(networkBehaviorData.getContext()), this.networkChangeListener);
        this.netWorkChangeReceiver = networkChangeReceiver;
        networkChangeReceiver.register();
        this.isRegisterd = true;
    }

    public NetworkBehavior(NetworkBehaviorListener networkBehaviorListener, ContextManager.CastContext castContext) {
        this.behaviorListener = networkBehaviorListener;
        this.castContext = castContext;
    }
}
