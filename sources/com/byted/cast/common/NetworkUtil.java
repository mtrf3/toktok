package com.byted.cast.common;

import android.text.TextUtils;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.IHostAddressAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* loaded from: classes29.dex */
public class NetworkUtil {
    public static List<String> getLocalIpAddr(ContextManager.CastContext castContext) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        IHostAddressAdapter hostAddressAdapter = ContextManager.getConfigManager(castContext).getInitConfig().getHostAddressAdapter();
                        if (hostAddressAdapter != null) {
                            String hostAddress = hostAddressAdapter.getHostAddress(nextElement);
                            hostAddress.toString();
                            arrayList.add(hostAddress);
                        } else {
                            String hostAddress2 = nextElement.getHostAddress();
                            hostAddress2.toString();
                            arrayList.add(hostAddress2);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public static String filterIp(List<String> list, String str) {
        if (list == null || list.size() == 0) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            return (String) ListProtector.get(list, 0);
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        int conversionIpToInt = Utils.conversionIpToInt(str);
        String str2 = (String) ListProtector.get(list, 0);
        int i = Integer.MAX_VALUE;
        for (String str3 : list) {
            int abs = Math.abs(Utils.conversionIpToInt(str3) ^ conversionIpToInt);
            if (abs < i) {
                str2 = str3;
                i = abs;
            }
        }
        return str2;
    }
}
