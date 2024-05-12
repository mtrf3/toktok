package com.byted.cast.common;

import X.C03880Dg;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C39248Fam;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C84763XOl;
import X.V0N;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.byted.cast.common.NetworkMonitor;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public class NetworkMonitor {
    public static long sLastUpdateMillis;
    public Context mContext;
    public BroadcastReceiver mNetworkChangeReceiver;
    public OnNetworkChangeListener mNetworkChangedListener;
    public NetworkType mOldNetworkType = NetworkType.UNKNOWN;
    public static final Object sUpdateLock = new Object();
    public static volatile boolean sFlagIsOnUpdate = false;
    public static String sWifiBandWidth = "-1";
    public static String sWifiRTT = "-1";
    public static String sWifiLossRate = "-1";
    public static String connectionIpAdd = "";

    /* renamed from: com.byted.cast.common.NetworkMonitor$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public class AnonymousClass1 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_byted_cast_common_NetworkMonitor$1_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0() {
            NetworkType networkType;
            NetworkType currentNetworkType = NetworkMonitor.this.getCurrentNetworkType();
            NetworkMonitor networkMonitor = NetworkMonitor.this;
            OnNetworkChangeListener onNetworkChangeListener = networkMonitor.mNetworkChangedListener;
            if (onNetworkChangeListener != null && (networkType = networkMonitor.mOldNetworkType) != currentNetworkType) {
                onNetworkChangeListener.onNetworkChanged(networkType, currentNetworkType);
            }
            NetworkMonitor.this.mOldNetworkType = currentNetworkType;
        }

        public AnonymousClass1() {
        }

        public void com_byted_cast_common_NetworkMonitor$1__onReceive$___twin___(Context context, Intent intent) {
            Logger.d("NetworkMonitor", "network changed");
            Dispatcher.getInstance().enqueue(new Runnable() { // from class: X.ZZj
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkMonitor.AnonymousClass1.this.lambda$onReceive$0();
                }
            });
        }

        public static void com_byted_cast_common_NetworkMonitor$1_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AnonymousClass1 anonymousClass1, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                anonymousClass1.com_byted_cast_common_NetworkMonitor$1__onReceive$___twin___(context, intent);
            } else {
                C38523F9z.LIZ();
                anonymousClass1.com_byted_cast_common_NetworkMonitor$1__onReceive$___twin___(context, intent);
            }
        }

        public static void com_byted_cast_common_NetworkMonitor$1_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AnonymousClass1 anonymousClass1, Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            com_byted_cast_common_NetworkMonitor$1_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(anonymousClass1, context, intent);
        }
    }

    /* loaded from: classes29.dex */
    public interface OnNetworkChangeListener {
        void onNetworkChanged(NetworkType networkType, NetworkType networkType2);
    }

    public static WifiInfo com_byted_cast_common_NetworkMonitor_android_net_wifi_WifiManager_getConnectionInfo(WifiManager wifiManager) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Landroid/net/wifi/WifiInfo;", "5913867080522899873");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", wifiManager, objArr, "android.net.wifi.WifiInfo", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", null, objArr, wifiManager, c65300Pk0, false);
            return (WifiInfo) LIZJ.LIZIZ;
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        c03880Dg.LIZIZ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", connectionInfo, objArr, wifiManager, c65300Pk0, true);
        return connectionInfo;
    }

    public static boolean isVpnInUse() {
        return false;
    }

    public static boolean isWifiProxy() {
        return false;
    }

    public static void updateVpnStatus() {
    }

    public static void updateWifiProxyStatus() {
    }

    public static /* synthetic */ void lambda$updateWifiLinkStatus$0() {
        synchronized (sUpdateLock) {
            if (TextUtils.isEmpty(connectionIpAdd)) {
                sWifiBandWidth = "-1";
                sWifiRTT = "-1";
                sWifiLossRate = "-1";
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - sLastUpdateMillis >= 600000 && !sFlagIsOnUpdate) {
                sFlagIsOnUpdate = true;
                updateWifiLinkSpeed();
                updateWifiRTTAndLossRate();
                sLastUpdateMillis = currentTimeMillis;
                sFlagIsOnUpdate = false;
            }
        }
    }

    public static void updateWifiLinkSpeed() {
        try {
            sWifiBandWidth = String.valueOf(INVOKEVIRTUAL_com_byted_cast_common_NetworkMonitor_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getConnectionInfo((WifiManager) C16880lQ.LLILL(Constants.sAppContext, "wifi")).getLinkSpeed());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        if (r4 == null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void updateWifiRTTAndLossRate() {
        /*
            java.lang.String r10 = "-1"
            java.lang.String r7 = "/"
            r8 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Ld8
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = "ping -c 10 "
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = com.byted.cast.common.NetworkMonitor.connectionIpAdd     // Catch: java.lang.Throwable -> Ld8
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Ld8
            java.lang.Process r9 = r2.exec(r0)     // Catch: java.lang.Throwable -> Ld8
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Ld3
            java.io.InputStream r0 = r9.getInputStream()     // Catch: java.lang.Throwable -> Ld3
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Ld3
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lc0
            java.io.InputStream r0 = r9.getErrorStream()     // Catch: java.lang.Throwable -> Lc0
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lc0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lc1
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lc1
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Laa
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Laa
        L3b:
            java.lang.String r8 = r6.readLine()     // Catch: java.lang.Throwable -> Lab
            if (r8 == 0) goto L78
            java.lang.String r0 = "avg"
            boolean r0 = r8.contains(r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L5b
            r0 = 20
            int r0 = r8.indexOf(r7, r0)     // Catch: java.lang.Throwable -> Lab
            int r1 = r0 + 1
            int r0 = r8.indexOf(r7, r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r8.substring(r1, r0)     // Catch: java.lang.Throwable -> Lab
            com.byted.cast.common.NetworkMonitor.sWifiRTT = r0     // Catch: java.lang.Throwable -> Lab
        L5b:
            java.lang.String r0 = "packet loss"
            boolean r0 = r8.contains(r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L3b
            java.lang.String r0 = "received"
            int r2 = r8.indexOf(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "%"
            int r1 = r8.indexOf(r0)     // Catch: java.lang.Throwable -> Lab
            int r0 = r2 + 10
            java.lang.String r0 = r8.substring(r0, r1)     // Catch: java.lang.Throwable -> Lab
            com.byted.cast.common.NetworkMonitor.sWifiLossRate = r0     // Catch: java.lang.Throwable -> Lab
            goto L3b
        L78:
            java.lang.String r0 = r5.readLine()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L89
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto L78
            com.byted.cast.common.NetworkMonitor.sWifiLossRate = r10     // Catch: java.lang.Throwable -> Lab
            com.byted.cast.common.NetworkMonitor.sWifiRTT = r10     // Catch: java.lang.Throwable -> Lab
            goto L78
        L89:
            r6.close()     // Catch: java.io.IOException -> L8d
            goto L91
        L8d:
            r0 = move-exception
            r0.printStackTrace()
        L91:
            r5.close()     // Catch: java.io.IOException -> L95
            goto L99
        L95:
            r0 = move-exception
            r0.printStackTrace()
        L99:
            r4.close()     // Catch: java.io.IOException -> L9d
            goto La1
        L9d:
            r0 = move-exception
            r0.printStackTrace()
        La1:
            r3.close()     // Catch: java.io.IOException -> La5
            goto Ld5
        La5:
            r0 = move-exception
            r0.printStackTrace()
            goto Ld5
        Laa:
            r5 = r8
        Lab:
            r6.close()     // Catch: java.io.IOException -> Laf
            goto Lb3
        Laf:
            r0 = move-exception
            r0.printStackTrace()
        Lb3:
            if (r5 == 0) goto Lbd
            r5.close()     // Catch: java.io.IOException -> Lb9
            goto Lbd
        Lb9:
            r0 = move-exception
            r0.printStackTrace()
        Lbd:
            if (r4 == 0) goto Lc9
            goto Lc1
        Lc0:
            r3 = r8
        Lc1:
            r4.close()     // Catch: java.io.IOException -> Lc5
            goto Lc9
        Lc5:
            r0 = move-exception
            r0.printStackTrace()
        Lc9:
            if (r3 == 0) goto Ld3
            r3.close()     // Catch: java.io.IOException -> Lcf
            goto Ld3
        Lcf:
            r0 = move-exception
            r0.printStackTrace()
        Ld3:
            if (r9 == 0) goto Ld8
        Ld5:
            r9.destroy()     // Catch: java.lang.Throwable -> Ld8
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.common.NetworkMonitor.updateWifiRTTAndLossRate():void");
    }

    public NetworkType getCurrentNetworkType() {
        NetworkType networkType = NetworkType.NONE;
        Context context = this.mContext;
        if (context == null) {
            return networkType;
        }
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI != null && LJJLI.isConnected()) {
                if (LJJLI.getType() == 1) {
                    networkType = NetworkType.WIFI;
                } else {
                    networkType = NetworkType.MOBILE;
                }
            }
        } catch (Throwable th) {
            Logger.e("NetworkMonitor", th.getMessage());
        }
        return networkType;
    }

    public void stop() {
        Context context = this.mContext;
        if (context != null) {
            C16880lQ.LJJLIIIJL(context, this.mNetworkChangeReceiver);
        }
        this.mNetworkChangeReceiver = null;
        this.mOldNetworkType = NetworkType.UNKNOWN;
    }

    public static String getWifiBandWidth() {
        updateWifiLinkStatus();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(sWifiBandWidth);
        LIZ.append("Mbps");
        return X1D.LIZIZ(LIZ);
    }

    public static String getWifiLossRate() {
        updateWifiLinkStatus();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(sWifiLossRate);
        LIZ.append("%");
        return X1D.LIZIZ(LIZ);
    }

    public static String getWifiRTT() {
        updateWifiLinkStatus();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(sWifiRTT);
        LIZ.append("ms");
        return X1D.LIZIZ(LIZ);
    }

    public static void updateWifiLinkStatus() {
        if (System.currentTimeMillis() - sLastUpdateMillis >= 600000 && !sFlagIsOnUpdate) {
            if (getCurrentNetworkType(Constants.sAppContext) != NetworkType.WIFI) {
                sWifiBandWidth = "-1";
                sWifiRTT = "-1";
                sWifiLossRate = "-1";
                return;
            }
            Dispatcher.getInstance().enqueue(new Runnable() { // from class: X.ZZN
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkMonitor.lambda$updateWifiLinkStatus$0();
                }
            });
        }
    }

    public static String getConnectionIpAdd() {
        return connectionIpAdd;
    }

    /* loaded from: classes29.dex */
    public enum NetworkType {
        UNKNOWN,
        NONE,
        WIFI,
        MOBILE;

        public static NetworkType valueOf(String str) {
            return (NetworkType) V0N.LJJJ(NetworkType.class, str);
        }
    }

    public static WifiInfo INVOKEVIRTUAL_com_byted_cast_common_NetworkMonitor_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getConnectionInfo(WifiManager wifiManager) {
        if (!C39248Fam.LJIIIZ || C39248Fam.LIZ() || C39248Fam.LJIIJ == null) {
            C39248Fam.LJIIJ = com_byted_cast_common_NetworkMonitor_android_net_wifi_WifiManager_getConnectionInfo(wifiManager);
            return C39248Fam.LJIIJ;
        }
        return C39248Fam.LJIIJ;
    }

    public static NetworkType getCurrentNetworkType(Context context) {
        if (context == null) {
            return NetworkType.UNKNOWN;
        }
        NetworkType networkType = NetworkType.NONE;
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"));
            if (LJJLI != null && LJJLI.isConnected()) {
                networkType = LJJLI.getType() == 1 ? NetworkType.WIFI : NetworkType.MOBILE;
            }
        } catch (Throwable th) {
            Logger.e("NetworkMonitor", th.getMessage());
        }
        return networkType;
    }

    public static boolean isWifiConnect(Context context) {
        NetworkType currentNetworkType = getCurrentNetworkType(context);
        if (currentNetworkType == null || currentNetworkType != NetworkType.WIFI) {
            return false;
        }
        return true;
    }

    public static void setConnectionIpAdd(String str) {
        connectionIpAdd = str;
    }

    public void setOnNetworkChangeListener(OnNetworkChangeListener onNetworkChangeListener) {
        this.mNetworkChangedListener = onNetworkChangeListener;
    }

    public void start(Context context) {
        if (this.mNetworkChangeReceiver != null) {
            Logger.w("NetworkMonitor", "network monitor already started!");
            return;
        }
        this.mContext = context;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.mNetworkChangeReceiver = anonymousClass1;
        C16880lQ.LJJLIIIJILLIZJL(anonymousClass1, this.mContext, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
