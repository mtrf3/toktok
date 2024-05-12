package com.bytedance.realx.base;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.realx.base.NetworkTypeUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class NetworkChangeReceiver extends BroadcastReceiver {
    public static Object threadLock = new Object();
    public boolean firstChanged;
    public Context mContext;
    public final long nativeNetworkReceiver;
    public Intent networkChangeIntent;
    public NetworkTypeThread networkTypeThread;
    public NetworkTypeUtils.NetworkType sNetworkType = NetworkTypeUtils.NetworkType.NONE;

    /* loaded from: classes9.dex */
    public class NetworkTypeThread extends PthreadThread {
        public boolean keepAlive;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com_bytedance_realx_base_NetworkChangeReceiver$NetworkTypeThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_realx_base_NetworkChangeReceiver$NetworkTypeThread__run$___twin___() {
            while (true) {
                synchronized (NetworkChangeReceiver.threadLock) {
                    if (NetworkChangeReceiver.this.firstChanged) {
                        try {
                            NetworkChangeReceiver.threadLock.wait();
                        } catch (InterruptedException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    if (this.keepAlive) {
                        NetworkChangeReceiver.this.getNetworkTypeInternal();
                    } else {
                        return;
                    }
                }
            }
        }

        public void stopThread() {
            synchronized (NetworkChangeReceiver.threadLock) {
                RXLogging.i("NetworkChangeReceiver", "stopThread");
                this.keepAlive = false;
                NetworkChangeReceiver.threadLock.notify();
            }
        }

        public static void com_bytedance_realx_base_NetworkChangeReceiver$NetworkTypeThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NetworkTypeThread networkTypeThread) {
            boolean LIZ;
            try {
                networkTypeThread.com_bytedance_realx_base_NetworkChangeReceiver$NetworkTypeThread__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public NetworkTypeThread(String str) {
            super(str);
            this.keepAlive = true;
        }
    }

    private native void nativeSetNetworkType(int i, String str, long j);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_bytedance_realx_base_NetworkChangeReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    /* renamed from: com.bytedance.realx.base.NetworkChangeReceiver$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType;

        static {
            int[] iArr = new int[NetworkTypeUtils.NetworkType.values().length];
            $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType = iArr;
            try {
                iArr[NetworkTypeUtils.NetworkType.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.MOBILE_2G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.MOBILE_3G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.MOBILE_4G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public void StartDetect() {
        if (this.networkTypeThread == null) {
            NetworkTypeThread networkTypeThread = new NetworkTypeThread("NetworkTypeThread");
            this.networkTypeThread = networkTypeThread;
            networkTypeThread.start();
        }
    }

    public void StopDetect() {
        NetworkTypeThread networkTypeThread = this.networkTypeThread;
        if (networkTypeThread != null) {
            networkTypeThread.stopThread();
            this.networkTypeThread.interrupt();
            this.networkTypeThread = null;
            NetworkTypeUtils.unregisterReceiver(this.mContext, this);
        }
    }

    public void getNetworkTypeInternal() {
        NetworkTypeUtils.NetworkType networkType = NetworkTypeUtils.getNetworkType(this.mContext, this.networkChangeIntent);
        this.networkChangeIntent = null;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetNetworkType, networkType： ");
        LIZ.append(networkType);
        RXLogging.i("NetworkChangeReceiver", X1D.LIZIZ(LIZ));
        if (!this.firstChanged || this.sNetworkType != networkType) {
            this.firstChanged = true;
            nativeSetNetworkType(getConstantNetworkType(networkType), NetworkTypeUtils.getDebugInfo(), this.nativeNetworkReceiver);
            this.sNetworkType = networkType;
        }
    }

    public NetworkChangeReceiver(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init, nativeNetworkReceiver: ");
        LIZ.append(j);
        RXLogging.i("NetworkChangeReceiver", X1D.LIZIZ(LIZ));
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        this.nativeNetworkReceiver = j;
        NetworkTypeUtils.registerReceiver(applicationContext, this);
    }

    private int getConstantNetworkType(NetworkTypeUtils.NetworkType networkType) {
        if (!networkType.isAvailable()) {
            return 0;
        }
        return getType(networkType);
    }

    private int getType(NetworkTypeUtils.NetworkType networkType) {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[networkType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return -1;
        }
    }

    public void com_bytedance_realx_base_NetworkChangeReceiver__onReceive$___twin___(Context context, Intent intent) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceive, action: ");
        LIZ.append(intent.getAction());
        RXLogging.i("NetworkChangeReceiver", X1D.LIZIZ(LIZ));
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            synchronized (threadLock) {
                this.networkChangeIntent = intent;
                threadLock.notify();
            }
        }
    }

    public static void com_bytedance_realx_base_NetworkChangeReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(NetworkChangeReceiver networkChangeReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            networkChangeReceiver.com_bytedance_realx_base_NetworkChangeReceiver__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            networkChangeReceiver.com_bytedance_realx_base_NetworkChangeReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_bytedance_realx_base_NetworkChangeReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(NetworkChangeReceiver networkChangeReceiver, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_bytedance_realx_base_NetworkChangeReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(networkChangeReceiver, context, intent);
    }
}
