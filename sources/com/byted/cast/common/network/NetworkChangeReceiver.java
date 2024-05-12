package com.byted.cast.common.network;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import com.byted.cast.common.Logger;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public class NetworkChangeReceiver {
    public boolean isRegistered;
    public Context mContext;
    public ConnectivityManager mManager;
    public ConnectivityManager.NetworkCallback mNetworkCallback;
    public BroadcastReceiver mNetworkChangeReceiver;
    public NetworkChangeListener mNetworkChangedListener;

    /* loaded from: classes29.dex */
    public interface NetworkChangeListener {
        void onAvailable(Network network);

        void onLost(Network network);

        void onReceive(Context context, Intent intent);
    }

    public void register() {
        Logger.i("NetWorkChange", "register");
        if (this.isRegistered) {
            Logger.w("NetWorkChange", "is registered");
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.mManager == null) {
                Logger.i("NetWorkChange", "mManager is null");
                return;
            }
            try {
                this.mManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(15).build(), this.mNetworkCallback);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("register failed, ");
                LIZ.append(th.getMessage());
                Logger.e("NetWorkChange", X1D.LIZIZ(LIZ));
                return;
            }
        } else {
            Context context = this.mContext;
            if (context == null) {
                Logger.i("NetWorkChange", "mContext is null");
                return;
            }
            try {
                C16880lQ.LJJLIIIJILLIZJL(this.mNetworkChangeReceiver, context, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Throwable th2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("register failed, ");
                LIZ2.append(th2.getMessage());
                Logger.e("NetWorkChange", X1D.LIZIZ(LIZ2));
                return;
            }
        }
        this.isRegistered = true;
    }

    public void unRegister() {
        Logger.i("NetWorkChange", "unRegister");
        this.isRegistered = false;
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager connectivityManager = this.mManager;
            if (connectivityManager == null) {
                Logger.i("NetWorkChange", "mManager is null");
                return;
            }
            try {
                connectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
                this.mNetworkCallback = null;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        Context context = this.mContext;
        if (context == null) {
            Logger.i("NetWorkChange", "mContext is null");
        } else {
            C16880lQ.LJJLIIIJL(context, this.mNetworkChangeReceiver);
            this.mNetworkChangeReceiver = null;
        }
    }

    public NetworkChangeReceiver(Context context, NetworkChangeListener networkChangeListener) {
        Logger.i("NetWorkChange", "init");
        this.mContext = context;
        this.mNetworkChangedListener = networkChangeListener;
        this.mManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            Logger.i("NetWorkChange", "api level >= 24");
            this.mNetworkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.byted.cast.common.network.NetworkChangeReceiver.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    Logger.i("NetWorkChange", "onAvailable");
                    NetworkChangeListener networkChangeListener2 = NetworkChangeReceiver.this.mNetworkChangedListener;
                    if (networkChangeListener2 != null) {
                        networkChangeListener2.onAvailable(network);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    Logger.i("NetWorkChange", "onLost");
                    NetworkChangeListener networkChangeListener2 = NetworkChangeReceiver.this.mNetworkChangedListener;
                    if (networkChangeListener2 != null) {
                        networkChangeListener2.onLost(network);
                    }
                }
            };
        } else {
            Logger.i("NetWorkChange", "api level < 24");
            this.mNetworkChangeReceiver = new BroadcastReceiver() { // from class: com.byted.cast.common.network.NetworkChangeReceiver.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    com_byted_cast_common_network_NetworkChangeReceiver$2_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context2, intent);
                }

                public void com_byted_cast_common_network_NetworkChangeReceiver$2__onReceive$___twin___(Context context2, Intent intent) {
                    Logger.d("NetWorkChange", "network changed");
                    NetworkChangeListener networkChangeListener2 = NetworkChangeReceiver.this.mNetworkChangedListener;
                    if (networkChangeListener2 != null) {
                        networkChangeListener2.onReceive(context2, intent);
                    }
                }

                public static void com_byted_cast_common_network_NetworkChangeReceiver$2_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AnonymousClass2 anonymousClass2, Context context2, Intent intent) {
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        anonymousClass2.com_byted_cast_common_network_NetworkChangeReceiver$2__onReceive$___twin___(context2, intent);
                    } else {
                        C38523F9z.LIZ();
                        anonymousClass2.com_byted_cast_common_network_NetworkChangeReceiver$2__onReceive$___twin___(context2, intent);
                    }
                }

                public static void com_byted_cast_common_network_NetworkChangeReceiver$2_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AnonymousClass2 anonymousClass2, Context context2, Intent intent) {
                    if (!C84763XOl.LJIIJJI && intent != null) {
                        if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                            C35532Dx2.LIZIZ();
                        }
                    }
                    com_byted_cast_common_network_NetworkChangeReceiver$2_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(anonymousClass2, context2, intent);
                }
            };
        }
    }
}
