package com.byted.cast.common.utils;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.Logger;
import com.byted.cast.common.source.ServiceInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes29.dex */
public class ServiceInfoUtils {
    public static String getDeviceName(List<ServiceInfo> list) {
        String str;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (ServiceInfo serviceInfo : list) {
            if (serviceInfo != null && (str = serviceInfo.name) != null) {
                sb.append(str);
                sb.append(",");
            }
        }
        return removeLastSeparator(sb.toString());
    }

    public static String getManufacture(List<ServiceInfo> list) {
        String str;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (ServiceInfo serviceInfo : list) {
            if (serviceInfo != null && (str = serviceInfo.manufacture) != null) {
                sb.append(str);
                sb.append(",");
            }
        }
        return removeLastSeparator(sb.toString());
    }

    public static boolean hasBdLinkServiceInfo(List<ServiceInfo> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<ServiceInfo> it = list.iterator();
            while (it.hasNext()) {
                if (isSupportBdLink(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasByteLinkServiceInfo(List<ServiceInfo> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<ServiceInfo> it = list.iterator();
            while (it.hasNext()) {
                if (isSupportByteLink(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSupportBdLink(ServiceInfo serviceInfo) {
        if (serviceInfo == null) {
            return false;
        }
        Map<String, String> map = serviceInfo.deviceParams;
        if (map == null || map.isEmpty()) {
            Logger.w("ServiceInfoUtils", "isSupportBdLink , deviceParams is empty");
            return false;
        }
        String str = map.get("source_bdlink_has_device_info");
        if (TextUtils.isEmpty(str)) {
            Logger.w("ServiceInfoUtils", "isSupportBdLink , hasDeviceInfo is empty");
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isSupportBdLink return :");
        LIZ.append(Boolean.parseBoolean(str));
        Logger.d("ServiceInfoUtils", X1D.LIZIZ(LIZ));
        return Boolean.parseBoolean(str);
    }

    public static boolean isSupportByteLink(ServiceInfo serviceInfo) {
        if (serviceInfo != null && serviceInfo.portMirror > 0) {
            return true;
        }
        return false;
    }

    public static String removeLastSeparator(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(",");
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }
}
