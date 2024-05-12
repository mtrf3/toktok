package com.byted.cast.common.network;

import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.byted.cast.common.Logger;
import com.byted.cast.common.network.NetworkChangeReceiver2;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public final class NetworkChangeReceiver2$register$2 extends BroadcastReceiver {
    public final /* synthetic */ NetworkChangeReceiver2 this$0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_byted_cast_common_network_NetworkChangeReceiver2$register$2_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public NetworkChangeReceiver2$register$2(NetworkChangeReceiver2 networkChangeReceiver2) {
        this.this$0 = networkChangeReceiver2;
    }

    public void com_byted_cast_common_network_NetworkChangeReceiver2$register$2__onReceive$___twin___(Context context, Intent intent) {
        String str;
        Integer num;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(str)) {
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("wifi_state", 0));
            } else {
                num = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onReceive, network changed, wifiState:");
            LIZ.append(num);
            Logger.i("NetworkChangeReceiver", X1D.LIZIZ(LIZ));
            if (num == null) {
                return;
            }
            if (num.intValue() == 1 || num.intValue() == 0 || num.intValue() == 4) {
                NetworkChangeReceiver2 networkChangeReceiver2 = this.this$0;
                if (networkChangeReceiver2.isConnected) {
                    networkChangeReceiver2.isConnected = false;
                    Logger.i("NetworkChangeReceiver", "onReceive, wifiState network lost");
                    NetworkChangeReceiver2.NetworkChangeListener networkListener = this.this$0.getNetworkListener();
                    if (networkListener != null) {
                        networkListener.onLost(null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (num.intValue() != 3) {
                return;
            }
            NetworkChangeReceiver2 networkChangeReceiver22 = this.this$0;
            if (networkChangeReceiver22.isConnected) {
                return;
            }
            networkChangeReceiver22.isConnected = true;
            Logger.i("NetworkChangeReceiver", "onReceive, wifiState network available");
            NetworkChangeReceiver2.NetworkChangeListener networkListener2 = this.this$0.getNetworkListener();
            if (networkListener2 == null) {
                return;
            }
            networkListener2.onAvailable(null);
        }
    }

    public static void com_byted_cast_common_network_NetworkChangeReceiver2$register$2_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(NetworkChangeReceiver2$register$2 networkChangeReceiver2$register$2, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            networkChangeReceiver2$register$2.com_byted_cast_common_network_NetworkChangeReceiver2$register$2__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            networkChangeReceiver2$register$2.com_byted_cast_common_network_NetworkChangeReceiver2$register$2__onReceive$___twin___(context, intent);
        }
    }

    public static void com_byted_cast_common_network_NetworkChangeReceiver2$register$2_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(NetworkChangeReceiver2$register$2 networkChangeReceiver2$register$2, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_byted_cast_common_network_NetworkChangeReceiver2$register$2_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(networkChangeReceiver2$register$2, context, intent);
    }
}
