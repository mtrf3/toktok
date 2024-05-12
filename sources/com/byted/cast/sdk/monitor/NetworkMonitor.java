package com.byted.cast.sdk.monitor;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.V0N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public class NetworkMonitor {
    public ContextManager.CastContext mCastContext;
    public Context mContext;
    public CastLogger mLogger;
    public BroadcastReceiver mNetworkChangeReceiver;
    public OnNetworkChangeListener mNetworkChangedListener;
    public NetworkType mOldNetworkType = NetworkType.UNKNOWN;

    /* loaded from: classes29.dex */
    public interface OnNetworkChangeListener {
        void onNetworkChanged(NetworkType networkType, NetworkType networkType2);
    }

    /* renamed from: com.byted.cast.sdk.monitor.NetworkMonitor$2, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$sdk$monitor$NetworkMonitor$NetworkType;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $SwitchMap$com$byted$cast$sdk$monitor$NetworkMonitor$NetworkType = iArr;
            try {
                iArr[NetworkType.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$monitor$NetworkMonitor$NetworkType[NetworkType.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$byted$cast$sdk$monitor$NetworkMonitor$NetworkType[NetworkType.HOTSPOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NetworkType getCurrentNetworkType() {
        NetworkType networkType = NetworkType.NONE;
        NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(this.mContext, "connectivity"));
        if (LJJLI == null || !LJJLI.isConnected()) {
            return networkType;
        }
        if (LJJLI.getType() == 1) {
            return NetworkType.WIFI;
        }
        return NetworkType.MOBILE;
    }

    public void stop() {
        C16880lQ.LJJLIIIJL(this.mContext, this.mNetworkChangeReceiver);
        this.mNetworkChangeReceiver = null;
        this.mOldNetworkType = NetworkType.UNKNOWN;
    }

    /* loaded from: classes29.dex */
    public enum NetworkType {
        UNKNOWN,
        NONE,
        WIFI,
        MOBILE,
        WIRED,
        HOTSPOT;

        public static NetworkType valueOf(String str) {
            return (NetworkType) V0N.LJJJ(NetworkType.class, str);
        }
    }

    public NetworkMonitor(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    public void setOnNetworkChangeListener(OnNetworkChangeListener onNetworkChangeListener) {
        this.mNetworkChangedListener = onNetworkChangeListener;
    }

    public void start(Context context, NetworkType networkType) {
        this.mLogger.w("NetworkMonitor", "network monitor started!");
        if (this.mNetworkChangeReceiver != null) {
            this.mLogger.w("NetworkMonitor", "network monitor already started!");
            return;
        }
        this.mContext = context;
        this.mNetworkChangeReceiver = new BroadcastReceiver() { // from class: com.byted.cast.sdk.monitor.NetworkMonitor.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                com_byted_cast_sdk_monitor_NetworkMonitor$1_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context2, intent);
            }

            public void com_byted_cast_sdk_monitor_NetworkMonitor$1__onReceive$___twin___(Context context2, Intent intent) {
                NetworkType networkType2;
                NetworkType networkType3;
                String action = intent.getAction();
                NetworkMonitor.this.mLogger.w("NetworkMonitor", action);
                if (action.equals("android.net.wifi.WIFI_AP_STATE_CHANGED")) {
                    NetworkType networkType4 = NetworkMonitor.this.mOldNetworkType;
                    int intExtra = intent.getIntExtra("wifi_state", 0);
                    if (intExtra == 10) {
                        networkType4 = NetworkType.NONE;
                        NetworkMonitor.this.mLogger.w("NetworkMonitor", "Hotspot state：Closing");
                    } else if (intExtra == 11) {
                        NetworkMonitor.this.mLogger.w("NetworkMonitor", "Hotspot state：Closed");
                    } else if (intExtra == 12) {
                        NetworkMonitor.this.mLogger.w("NetworkMonitor", "Hotspot state：Opening");
                    } else if (intExtra == 13) {
                        networkType4 = NetworkType.HOTSPOT;
                        NetworkMonitor.this.mLogger.w("NetworkMonitor", "Hotspot state：Opened");
                    }
                    NetworkMonitor networkMonitor = NetworkMonitor.this;
                    OnNetworkChangeListener onNetworkChangeListener = networkMonitor.mNetworkChangedListener;
                    if (onNetworkChangeListener != null && (networkType3 = networkMonitor.mOldNetworkType) != networkType4) {
                        onNetworkChangeListener.onNetworkChanged(networkType3, networkType4);
                    }
                    NetworkMonitor.this.mOldNetworkType = networkType4;
                    return;
                }
                NetworkType currentNetworkType = NetworkMonitor.this.getCurrentNetworkType();
                NetworkMonitor networkMonitor2 = NetworkMonitor.this;
                OnNetworkChangeListener onNetworkChangeListener2 = networkMonitor2.mNetworkChangedListener;
                if (onNetworkChangeListener2 != null && (networkType2 = networkMonitor2.mOldNetworkType) != currentNetworkType) {
                    onNetworkChangeListener2.onNetworkChanged(networkType2, currentNetworkType);
                }
                NetworkMonitor.this.mOldNetworkType = currentNetworkType;
            }

            public static void com_byted_cast_sdk_monitor_NetworkMonitor$1_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AnonymousClass1 anonymousClass1, Context context2, Intent intent) {
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    anonymousClass1.com_byted_cast_sdk_monitor_NetworkMonitor$1__onReceive$___twin___(context2, intent);
                } else {
                    C38523F9z.LIZ();
                    anonymousClass1.com_byted_cast_sdk_monitor_NetworkMonitor$1__onReceive$___twin___(context2, intent);
                }
            }

            public static void com_byted_cast_sdk_monitor_NetworkMonitor$1_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AnonymousClass1 anonymousClass1, Context context2, Intent intent) {
                if (!C84763XOl.LJIIJJI && intent != null) {
                    if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                        C35532Dx2.LIZIZ();
                    }
                }
                com_byted_cast_sdk_monitor_NetworkMonitor$1_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(anonymousClass1, context2, intent);
            }
        };
        if (AnonymousClass2.$SwitchMap$com$byted$cast$sdk$monitor$NetworkMonitor$NetworkType[networkType.ordinal()] != 3) {
            C16880lQ.LJJLIIIJILLIZJL(this.mNetworkChangeReceiver, this.mContext, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } else {
            C16880lQ.LJJLIIIJILLIZJL(this.mNetworkChangeReceiver, this.mContext, new IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED"));
        }
    }
}
