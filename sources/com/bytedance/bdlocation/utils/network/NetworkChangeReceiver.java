package com.bytedance.bdlocation.utils.network;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.bdlocation.log.Logger;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class NetworkChangeReceiver extends BroadcastReceiver {
    public NetworkInfo sLastNetWork;
    public long sLastNetWorkTime;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_bytedance_bdlocation_utils_network_NetworkChangeReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    private void notify(NetworkInfo networkInfo) {
        NetworkManager.getInstance().notifyWifiChangedTwo(networkInfo);
        this.sLastNetWork = networkInfo;
        this.sLastNetWorkTime = System.currentTimeMillis();
    }

    public void com_bytedance_bdlocation_utils_network_NetworkChangeReceiver__onReceive$___twin___(Context context, Intent intent) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(NetworkManager.TAG);
            LIZ.append(":NetworkChangeReceiver notify network change action:");
            LIZ.append(intent.getAction());
            Logger.d(X1D.LIZIZ(LIZ));
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(NetworkManager.TAG);
                LIZ2.append(":NetworkChangeReceiver  networkInfo:");
                LIZ2.append(LJJLI.toString());
                Logger.d(X1D.LIZIZ(LIZ2));
                NetworkInfo networkInfo = this.sLastNetWork;
                if (networkInfo != null && networkInfo.getType() == LJJLI.getType() && System.currentTimeMillis() - this.sLastNetWorkTime < 1000) {
                    return;
                }
            } else if (System.currentTimeMillis() - this.sLastNetWorkTime < 1000) {
                return;
            }
            notify(LJJLI);
        } catch (Exception unused) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(NetworkManager.TAG);
            LIZ3.append(":NetworkChangeReceiver get active network info error");
            Logger.d(X1D.LIZIZ(LIZ3));
        }
    }

    public static void com_bytedance_bdlocation_utils_network_NetworkChangeReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(NetworkChangeReceiver networkChangeReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            networkChangeReceiver.com_bytedance_bdlocation_utils_network_NetworkChangeReceiver__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            networkChangeReceiver.com_bytedance_bdlocation_utils_network_NetworkChangeReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_bytedance_bdlocation_utils_network_NetworkChangeReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(NetworkChangeReceiver networkChangeReceiver, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_bytedance_bdlocation_utils_network_NetworkChangeReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(networkChangeReceiver, context, intent);
    }
}
