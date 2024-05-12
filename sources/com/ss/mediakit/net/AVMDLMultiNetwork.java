package com.ss.mediakit.net;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.Locale;

/* loaded from: classes9.dex */
public class AVMDLMultiNetwork {
    public static Runnable loopRefreshRunnable = new Runnable() { // from class: com.ss.mediakit.net.AVMDLMultiNetwork.1
        @Override // java.lang.Runnable
        public void run() {
            com_ss_mediakit_net_AVMDLMultiNetwork$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_mediakit_net_AVMDLMultiNetwork$1__run$___twin___() {
            AVMDLMultiNetwork.refreshIpReachable();
            AVMDLMultiNetwork.mHandler.postDelayed(this, 60000L);
        }

        public static void com_ss_mediakit_net_AVMDLMultiNetwork$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_ss_mediakit_net_AVMDLMultiNetwork$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public static Network mCellularNetwork = null;
    public static ConnectivityManager mCm = null;
    public static long mCurNetId = 0;
    public static Network mCurNetwork = null;
    public static Handler mHandler = null;
    public static boolean mIsIPv4Reachable = true;
    public static boolean mIsIPv6Reachable = true;
    public static HandlerThread mThread;

    public static void refreshIpReachable() {
    }

    public static Network getCellularNetwork() {
        Network network;
        synchronized (AVMDLMultiNetwork.class) {
            network = mCellularNetwork;
        }
        return network;
    }

    public static Network getCurNetwork() {
        Network network;
        synchronized (AVMDLMultiNetwork.class) {
            network = mCurNetwork;
        }
        return network;
    }

    public static boolean isIPv4Reachable() {
        boolean z;
        synchronized (AVMDLMultiNetwork.class) {
            z = mIsIPv4Reachable;
        }
        return z;
    }

    public static boolean isIPv6Reachable() {
        boolean z;
        synchronized (AVMDLMultiNetwork.class) {
            z = mIsIPv6Reachable;
        }
        return z;
    }

    public static void switchToCellularNetwork() {
        if (mHandler != null) {
            Message message = new Message();
            message.what = 1;
            mHandler.sendMessage(message);
            AVMDLLog.d("AVMDLMultiNetwork", "send msg of switch to cellular network");
        }
    }

    public static void switchToDefaultNetwork() {
        if (mHandler != null) {
            Message message = new Message();
            message.what = 2;
            mHandler.sendMessage(message);
            AVMDLLog.d("AVMDLMultiNetwork", "send msg of switch to default network");
        }
    }

    public static void switchToDefaultNetworkInternal() {
        AVMDLLog.d("AVMDLMultiNetwork", "try switch to default network");
        if (mCurNetId != 0) {
            AVMDLLog.d("AVMDLMultiNetwork", "do switch");
            IPCache.getInstance().clear();
            AVMDLDataLoader.getInstance().onCellularAlwaysUp(0L);
            mCurNetId = 0L;
            setCurNetwork(null);
        }
        AVMDLLog.d("AVMDLMultiNetwork", "end try switch to default network");
    }

    public static void switchToCellularNetworkInternal() {
        int i;
        Network cellularNetwork = getCellularNetwork();
        if (cellularNetwork == null) {
            return;
        }
        long netId = getNetId(cellularNetwork);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try switch to cellular curNetId: ");
        LIZ.append(mCurNetId);
        LIZ.append(" netId:");
        LIZ.append(netId);
        AVMDLLog.d("AVMDLMultiNetwork", X1D.LIZIZ(LIZ));
        if (mCurNetId != netId) {
            AVMDLLog.d("AVMDLMultiNetwork", "do switch");
            IPCache.getInstance().clear();
            i = AVMDLDataLoader.getInstance().onCellularAlwaysUp(NetUtils.getNetId(cellularNetwork));
            mCurNetId = netId;
            setCurNetwork(cellularNetwork);
        } else {
            AVMDLLog.d("AVMDLMultiNetwork", "cur is cellular, not need switch");
            i = 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("end switch to cellular, ret:");
        LIZ2.append(i);
        AVMDLLog.d("AVMDLMultiNetwork", X1D.LIZIZ(LIZ2));
    }

    public static boolean alwayUpCellular(Context context) {
        initHandler(context);
        if (mCm == null) {
            AVMDLLog.d("AVMDLMultiNetwork", "cm is null");
            return false;
        }
        try {
            mCm.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new ConnectivityManager.NetworkCallback() { // from class: com.ss.mediakit.net.AVMDLMultiNetwork.3
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    Message message = new Message();
                    message.obj = network;
                    message.what = 0;
                    AVMDLMultiNetwork.mHandler.sendMessage(message);
                    AVMDLLog.d("AVMDLMultiNetwork", "send msg of onavailable ");
                }
            });
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static long getNetId(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return CastIntegerProtector.parseInt(network.toString());
    }

    public static void initHandler(Context context) {
        synchronized (AVMDLMultiNetwork.class) {
            if (mThread == null) {
                HandlerThread handlerThread = new HandlerThread("AVMDLMultiNetwork");
                mThread = handlerThread;
                handlerThread.start();
                mHandler = new Handler(mThread.getLooper()) { // from class: com.ss.mediakit.net.AVMDLMultiNetwork.4
                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        Network network;
                        Object obj = message.obj;
                        if (obj != null) {
                            network = (Network) obj;
                        } else {
                            network = null;
                        }
                        Locale locale = Locale.US;
                        AVMDLLog.d("AVMDLMultiNetwork", C16880lQ.LLLZI(locale, "----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), network}));
                        int i = message.what;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        AVMDLMultiNetwork.refreshIpReachable();
                                    }
                                } else {
                                    AVMDLMultiNetwork.switchToDefaultNetworkInternal();
                                }
                            } else {
                                AVMDLMultiNetwork.switchToCellularNetworkInternal();
                            }
                        } else {
                            AVMDLMultiNetwork.onAvailableInternal(network);
                        }
                        AVMDLLog.d("AVMDLMultiNetwork", C16880lQ.LLLZI(locale, "****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), network}));
                    }
                };
            }
            if (context != null && mCm == null) {
                mCm = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
            }
        }
    }

    public static void onAvailableInternal(Network network) {
        ConnectivityManager connectivityManager;
        if (network == null || (connectivityManager = mCm) == null) {
            return;
        }
        NetworkInfo LLLZL = C16880lQ.LLLZL(connectivityManager, network);
        AVMDLLog.d("AVMDLMultiNetwork", "start on available");
        if (LLLZL != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("network name: ");
            LIZ.append(LLLZL.getTypeName());
            LIZ.append("[");
            LIZ.append(LLLZL.getSubtypeName());
            LIZ.append("], state: ");
            LIZ.append(LLLZL.getDetailedState());
            LIZ.append(" netid:");
            LIZ.append(getNetId(network));
            AVMDLLog.d("AVMDLMultiNetwork", X1D.LIZIZ(LIZ));
        }
        NetworkCapabilities networkCapabilities = mCm.getNetworkCapabilities(network);
        if (networkCapabilities != null && networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(12)) {
            onCellularNetwork(network);
            AVMDLDataLoader.getInstance().onInitMultiNetworkEnv();
        } else {
            AVMDLDataLoader.getInstance().onCellularAlwaysUp(0L);
        }
        AVMDLLog.d("AVMDLMultiNetwork", "end on available");
    }

    public static void onCellularNetwork(Network network) {
        synchronized (AVMDLMultiNetwork.class) {
            mCellularNetwork = network;
        }
    }

    public static boolean registerNetworkChangeCallback(Context context) {
        initHandler(context);
        if (mCm == null) {
            AVMDLLog.d("AVMDLMultiNetwork", "cm is null");
            return false;
        }
        NetworkRequest build = new NetworkRequest.Builder().build();
        try {
            if (AVMDLDataLoader.getInstance().getConfig().mEnableNetworkChangeNotify == 1) {
                mCm.registerNetworkCallback(build, new ConnectivityManager.NetworkCallback() { // from class: com.ss.mediakit.net.AVMDLMultiNetwork.2
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLost(Network network) {
                        AVMDLLog.d("AVMDLMultiNetwork", "send msg of onLost ");
                        if (network == null || AVMDLMultiNetwork.mCm == null) {
                            return;
                        }
                        Message message = new Message();
                        message.obj = network;
                        message.what = 3;
                        AVMDLMultiNetwork.mHandler.sendMessageDelayed(message, 200L);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                        AVMDLLog.d("AVMDLMultiNetwork", "send msg of onLinkPropertiesChanged");
                        if (network == null || AVMDLMultiNetwork.mCm == null) {
                            return;
                        }
                        Message message = new Message();
                        message.obj = network;
                        message.what = 3;
                        AVMDLMultiNetwork.mHandler.sendMessage(message);
                    }
                });
            }
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static void setCurNetwork(Network network) {
        synchronized (AVMDLMultiNetwork.class) {
            mCurNetwork = network;
        }
    }

    public static void setIPv4Reachable(boolean z) {
        synchronized (AVMDLMultiNetwork.class) {
            mIsIPv4Reachable = z;
        }
    }

    public static void setIPv6Reachable(boolean z) {
        synchronized (AVMDLMultiNetwork.class) {
            mIsIPv6Reachable = z;
        }
    }
}
