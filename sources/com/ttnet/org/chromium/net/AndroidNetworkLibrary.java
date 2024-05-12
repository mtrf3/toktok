package com.ttnet.org.chromium.net;

import J.N;
import X.C03880Dg;
import X.C16880lQ;
import X.C36598EXy;
import X.C36911EeB;
import X.C39248Fam;
import X.C39519Ff9;
import X.C48465J0j;
import X.C48467J0l;
import X.C48469J0n;
import X.C65300Pk0;
import X.C66653QDx;
import X.EXJ;
import X.O6T;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.RouteInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class AndroidNetworkLibrary {
    public static Boolean LIZ;
    public static Boolean LIZIZ;
    public static Boolean LIZJ;

    public static String LIZ(TelephonyManager telephonyManager) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(100919, "android/telephony/TelephonyManager", "getNetworkOperator", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "4791183199255182524"));
        return LIZJ2.LIZ ? (String) LIZJ2.LIZIZ : telephonyManager.getNetworkOperator();
    }

    public static String LIZIZ(TelephonyManager telephonyManager) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(100917, "android/telephony/TelephonyManager", "getSimOperator", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "4791183199255182524"));
        return LIZJ2.LIZ ? (String) LIZJ2.LIZIZ : telephonyManager.getSimOperator();
    }

    public static DnsStatus getCurrentDnsStatus() {
        return LIZLLL(null);
    }

    public static String getWifiSSID() {
        return "";
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean LJI() {
        if (LIZIZ == null) {
            LIZIZ = Boolean.valueOf(LJFF(O6T.LIZ, "android.permission.ACCESS_WIFI_STATE"));
        }
        return LIZIZ.booleanValue();
    }

    public static boolean alwayUpCellular() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new C48465J0j(connectivityManager));
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean checkIsVpnOn() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity");
        if (connectivityManager == null) {
            return false;
        }
        Network[] allNetworks = connectivityManager.getAllNetworks();
        for (int i = 0; i < allNetworks.length; i++) {
            if (C16880lQ.LLLZL(connectivityManager, allNetworks[i]).isConnected() && connectivityManager.getNetworkCapabilities(allNetworks[i]).hasTransport(4)) {
                return true;
            }
        }
        return false;
    }

    public static int[] getAllAccessPointChannels() {
        List<ScanResult> scanResults;
        boolean z;
        if (LIZJ == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                LIZJ = Boolean.valueOf(LJFF(O6T.LIZ, "android.permission.ACCESS_FINE_LOCATION"));
            } else {
                if (LJFF(O6T.LIZ, "android.permission.ACCESS_COARSE_LOCATION") || LJFF(O6T.LIZ, "android.permission.ACCESS_FINE_LOCATION")) {
                    z = true;
                } else {
                    z = false;
                }
                LIZJ = Boolean.valueOf(z);
            }
        }
        if (!LIZJ.booleanValue() || !LJI()) {
            return new int[0];
        }
        WifiManager wifiManager = (WifiManager) C16880lQ.LLILL(O6T.LIZ, "wifi");
        if (wifiManager == null) {
            return new int[0];
        }
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(102300, "android/net/wifi/WifiManager", "getScanResults", wifiManager, new Object[0], "java.util.List", new C65300Pk0(false, "()Ljava/util/List;", "4791183199255182524"));
        if (LIZJ2.LIZ) {
            scanResults = (List) LIZJ2.LIZIZ;
        } else {
            scanResults = wifiManager.getScanResults();
        }
        if (scanResults == null || scanResults.isEmpty()) {
            return new int[0];
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ScanResult> it = scanResults.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(LIZJ(it.next().frequency)));
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) ListProtector.get(arrayList, i)).intValue();
        }
        return iArr;
    }

    public static String[][] getAllRouteInfo() {
        if (LIZ == null) {
            LIZ = Boolean.valueOf(LJFF(O6T.LIZ, "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (!LIZ.booleanValue()) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity");
            if (connectivityManager == null) {
                return null;
            }
            Network[] allNetworks = connectivityManager.getAllNetworks();
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                if (linkProperties != null) {
                    for (RouteInfo routeInfo : linkProperties.getRoutes()) {
                        String[] strArr = new String[4];
                        if (routeInfo.getDestination() != null) {
                            strArr[0] = routeInfo.getDestination().getAddress().getHostAddress();
                            strArr[1] = Integer.toString(routeInfo.getDestination().getPrefixLength());
                        }
                        if (routeInfo.getGateway() != null) {
                            strArr[2] = routeInfo.getGateway().getHostAddress();
                        }
                        strArr[3] = routeInfo.getInterface();
                        arrayList.add(strArr);
                    }
                }
            }
            return (String[][]) arrayList.toArray((String[][]) Array.newInstance((Class<?>) String.class, 0, 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean getIsCaptivePortal() {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT < 23 || (connectivityManager = (ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity")) == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    public static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < 23 || (connectivityManager = (ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity")) == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    public static WifiInfo LJ() {
        WifiInfo connectionInfo;
        TransportInfo transportInfo;
        if (LJI()) {
            if (Build.VERSION.SDK_INT >= 31) {
                ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity");
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (transportInfo = networkCapabilities.getTransportInfo()) != null && (transportInfo instanceof WifiInfo)) {
                        return (WifiInfo) transportInfo;
                    }
                }
                return null;
            }
            WifiManager wifiManager = (WifiManager) C16880lQ.LLILL(O6T.LIZ, "wifi");
            if (!C39248Fam.LJIIIZ || C39248Fam.LIZ() || C39248Fam.LJIIJ == null) {
                C03880Dg c03880Dg = new C03880Dg(2);
                Object[] objArr = new Object[0];
                C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Landroid/net/wifi/WifiInfo;", "4791183199255182524");
                C39519Ff9 LIZJ2 = c03880Dg.LIZJ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", wifiManager, objArr, "android.net.wifi.WifiInfo", c65300Pk0);
                if (LIZJ2.LIZ) {
                    c03880Dg.LIZIZ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", null, objArr, wifiManager, c65300Pk0, false);
                    connectionInfo = (WifiInfo) LIZJ2.LIZIZ;
                } else {
                    connectionInfo = wifiManager.getConnectionInfo();
                    c03880Dg.LIZIZ(102301, "android/net/wifi/WifiManager", "getConnectionInfo", connectionInfo, objArr, wifiManager, c65300Pk0, true);
                }
                C39248Fam.LJIIJ = connectionInfo;
                return C39248Fam.LJIIJ;
            }
            return C39248Fam.LJIIJ;
        }
        Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, O6T.LIZ, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (LJJLIIIJILLIZJL == null) {
            return null;
        }
        return (WifiInfo) LJJLIIIJILLIZJL.getParcelableExtra("wifiInfo");
    }

    public static void clearTestRootCertificates() {
        f0.LIZJ();
        synchronized (f0.LJIIIZ) {
            try {
                f0.LJ.load(null);
                f0.LIZLLL = f0.LIZIZ(f0.LJ);
            } catch (IOException unused) {
            }
        }
    }

    public static int getCurrentAccessPointChannel() {
        Object obj;
        int intValue;
        C48469J0n.LIZ().getClass();
        if (N.Mhd7DRFo()) {
            if (C48469J0n.LIZ().LIZ != null) {
                C66653QDx LIZIZ2 = C66653QDx.LIZIZ();
                LIZIZ2.getClass();
                try {
                    obj = LIZIZ2.LIZ;
                } catch (Throwable unused) {
                }
                if (obj != null) {
                    intValue = ((Integer) new C36598EXy(obj).LIZIZ("getWifiFrequency").LIZ).intValue();
                    return LIZJ(intValue);
                }
            }
            intValue = 0;
            return LIZJ(intValue);
        }
        WifiInfo LJ = LJ();
        if (LJ == null) {
            return -1;
        }
        return LIZJ(LJ.getFrequency());
    }

    public static int[] getDhcpInfo() {
        DhcpInfo dhcpInfo;
        C48469J0n.LIZ().getClass();
        if (N.MaSRwBiO()) {
            return new int[0];
        }
        try {
            WifiManager wifiManager = (WifiManager) C16880lQ.LLILL(O6T.LIZ, "wifi");
            if (wifiManager != null && (dhcpInfo = wifiManager.getDhcpInfo()) != null) {
                return new int[]{dhcpInfo.ipAddress, dhcpInfo.gateway};
            }
        } catch (Throwable unused) {
        }
        return new int[0];
    }

    public static String getNetworkOperator() {
        C48469J0n.LIZ().getClass();
        String str = "";
        if (N.Mhd7DRFo()) {
            if (C48469J0n.LIZ().LIZ == null) {
                return "";
            }
            C66653QDx LIZIZ2 = C66653QDx.LIZIZ();
            LIZIZ2.getClass();
            try {
                Object obj = LIZIZ2.LIZ;
                if (obj == null) {
                    return "";
                }
                str = (String) new C36598EXy(obj).LIZIZ("getNetworkOperator").LIZ;
                return str;
            } catch (Throwable unused) {
                return str;
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(O6T.LIZ, "phone");
            if (telephonyManager == null) {
                return "";
            }
            return LIZ(telephonyManager);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String getSimOperator() {
        C48469J0n.LIZ().getClass();
        String str = "";
        if (N.Mhd7DRFo()) {
            if (C48469J0n.LIZ().LIZ == null) {
                return "";
            }
            C66653QDx LIZIZ2 = C66653QDx.LIZIZ();
            LIZIZ2.getClass();
            try {
                Object obj = LIZIZ2.LIZ;
                if (obj == null) {
                    return "";
                }
                str = (String) new C36598EXy(obj).LIZIZ("getSimOperator").LIZ;
                return str;
            } catch (Throwable unused) {
                return str;
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(O6T.LIZ, "phone");
            if (telephonyManager == null) {
                return "";
            }
            return LIZIZ(telephonyManager);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static int LIZJ(int i) {
        if (i == 2484) {
            return 14;
        }
        if (i < 2484) {
            return (i - 2407) / 5;
        }
        if (i >= 4910) {
            if (i <= 4980) {
                return (i - 4000) / 5;
            }
            if (i >= 5925) {
                if (i == 5935) {
                    return 2;
                }
                if (i <= 45000) {
                    return (i - 5950) / 5;
                }
                if (i >= 58320 && i <= 70200) {
                    return (i - 56160) / 2160;
                }
                return -1;
            }
        }
        return (i - 5000) / 5;
    }

    public static DnsStatus LIZLLL(Network network) {
        ConnectivityManager connectivityManager;
        if (LIZ == null) {
            LIZ = Boolean.valueOf(LJFF(O6T.LIZ, "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (!LIZ.booleanValue() || (connectivityManager = (ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity")) == null) {
            return null;
        }
        if (network == null && (network = connectivityManager.getActiveNetwork()) == null) {
            return null;
        }
        try {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            List<InetAddress> dnsServers = linkProperties.getDnsServers();
            String domains = linkProperties.getDomains();
            if (Build.VERSION.SDK_INT >= 28) {
                return new DnsStatus(linkProperties.getPrivateDnsServerName(), domains, dnsServers, linkProperties.isPrivateDnsActive());
            }
            return new DnsStatus("", domains, dnsServers, false);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        f0.LIZJ();
        X509Certificate LIZ2 = f0.LIZ(bArr);
        synchronized (f0.LJIIIZ) {
            KeyStore keyStore = f0.LJ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("root_cert_");
            LIZ3.append(Integer.toString(f0.LJ.size()));
            keyStore.setCertificateEntry(X1D.LIZIZ(LIZ3), LIZ2);
            f0.LIZLLL = f0.LIZIZ(f0.LJ);
        }
    }

    public static DnsStatus getDnsStatusForNetwork(long j) {
        try {
            return LIZLLL(Network.fromNetworkHandle(j));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String getMimeTypeFromExtension(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("foo.");
        LIZ2.append(str);
        return URLConnection.guessContentTypeFromName(X1D.LIZIZ(LIZ2));
    }

    public static int getWifiSignalLevel(int i) {
        int intExtra;
        int calculateSignalLevel;
        Context context = O6T.LIZ;
        if (context == null || context.getContentResolver() == null) {
            return -1;
        }
        C48469J0n.LIZ().getClass();
        if (N.Mhd7DRFo()) {
            if (C48469J0n.LIZ().LIZ != null) {
                C66653QDx LIZIZ2 = C66653QDx.LIZIZ();
                LIZIZ2.getClass();
                try {
                    Object obj = LIZIZ2.LIZ;
                    if (obj != null) {
                        intExtra = ((Integer) new C36598EXy(obj).LIZIZ("getWifiRssi").LIZ).intValue();
                    }
                } catch (Throwable unused) {
                }
            }
            intExtra = 0;
            calculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i);
            if (calculateSignalLevel >= 0 || calculateSignalLevel >= i) {
                return -1;
            }
            return calculateSignalLevel;
        }
        if (LJI()) {
            WifiInfo LJ = LJ();
            if (LJ == null) {
                return -1;
            }
            intExtra = LJ.getRssi();
        } else {
            try {
                Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, O6T.LIZ, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (LJJLIIIJILLIZJL == null) {
                    return -1;
                }
                intExtra = LJJLIIIJILLIZJL.getIntExtra("newRssi", LiveLayoutPreloadThreadPriority.DEFAULT);
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (intExtra == Integer.MIN_VALUE) {
            return -1;
        }
        calculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i);
        if (calculateSignalLevel >= 0) {
        }
        return -1;
    }

    public static boolean isCleartextPermitted(String str) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
            }
            if (i < 23) {
                return true;
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        } catch (IllegalArgumentException unused) {
            if (Build.VERSION.SDK_INT < 23) {
                return true;
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
    }

    public static void setWifiEnabled(boolean z) {
        ((WifiManager) C16880lQ.LLILL(O6T.LIZ, "wifi")).setWifiEnabled(z);
    }

    public static boolean LJFF(Context context, String str) {
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                return true;
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }

    public static void tagSocket(int i, int i2, int i3) {
        ParcelFileDescriptor adoptFd;
        FileDescriptor fileDescriptor;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            EXJ.LIZJ(i2);
        }
        if (Build.VERSION.SDK_INT < 23) {
            try {
                fileDescriptor = new FileDescriptor();
                C36911EeB.LIZ(fileDescriptor, C36911EeB.LIZ, new Object[]{Integer.valueOf(i)});
                adoptFd = null;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e2);
            }
        } else {
            adoptFd = ParcelFileDescriptor.adoptFd(i);
            fileDescriptor = adoptFd.getFileDescriptor();
        }
        C48467J0l c48467J0l = new C48467J0l(fileDescriptor);
        TrafficStats.tagSocket(c48467J0l);
        c48467J0l.close();
        if (adoptFd != null) {
            adoptFd.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            EXJ.LIZ();
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return f0.LJII(bArr, str, str2);
        } catch (IllegalArgumentException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (KeyStoreException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
