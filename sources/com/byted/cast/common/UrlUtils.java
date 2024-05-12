package com.byted.cast.common;

import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes29.dex */
public class UrlUtils {
    public static ArrayList<String> defaultMonitorConfigUrls = null;
    public static ArrayList<String> defaultMonitorReportUrls = null;
    public static String grayConfigDomain = null;
    public static String overseasTokenDomain = "https://bytecast.tiktokv.com/bytecast/app_auth";

    public static String getLicenseDataDomain() {
        return "https://open-ap-singapore-1.bytevcloudapi.com";
    }

    public static String getLicenseTokenDomain() {
        return "https://bytecast.tiktokv.com";
    }

    public static String getMonitorDomain() {
        return "https://mon.isnssdk.com";
    }

    public static String getQRDataDomain(boolean z) {
        return "https://open-ap-singapore-1.bytevcloudapi.com";
    }

    public static List<String> getDefaultMonitorConfigUrl() {
        ArrayList<String> arrayList = defaultMonitorConfigUrls;
        if (arrayList != null) {
            return arrayList;
        }
        return Arrays.asList("https://mon.isnssdk.com/monitor/appmonitor/v2/settings", "https://i.isnssdk.com/monitor/appmonitor/v2/settings");
    }

    public static List<String> getDefaultMonitorReportUrl() {
        ArrayList<String> arrayList = defaultMonitorReportUrls;
        if (arrayList != null) {
            return arrayList;
        }
        return Arrays.asList("https://mon.isnssdk.com/monitor/collect/", "https://i.isnssdk.com/monitor/collect/");
    }

    public static String getGrayConfigDomain() {
        String str = grayConfigDomain;
        if (str != null && !"".equals(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://");
            LIZ.append(grayConfigDomain);
            return X1D.LIZIZ(LIZ);
        }
        return "https://bytecast.tiktokv.com";
    }

    public static String getQRTokenDomain(boolean z) {
        return overseasTokenDomain;
    }

    public static void modifyOverseasTokenDomain(String str) {
        overseasTokenDomain = str;
    }

    public static void setDefaultMonitorConfigUrl(ArrayList<String> arrayList) {
        Object obj;
        Object obj2;
        ArrayList<String> arrayList2 = new ArrayList<>();
        defaultMonitorConfigUrls = arrayList2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append((String) ListProtector.get(arrayList, 0));
        LIZ.append("/monitor/appmonitor/v2/settings");
        arrayList2.add(X1D.LIZIZ(LIZ));
        ArrayList<String> arrayList3 = defaultMonitorConfigUrls;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        if (arrayList.size() > 1) {
            obj = ListProtector.get(arrayList, 1);
        } else {
            obj = ListProtector.get(arrayList, 0);
        }
        LIZ2.append((String) obj);
        LIZ2.append("/monitor/appmonitor/v2/settings");
        arrayList3.add(X1D.LIZIZ(LIZ2));
        ArrayList<String> arrayList4 = new ArrayList<>();
        defaultMonitorReportUrls = arrayList4;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("https://");
        LIZ3.append((String) ListProtector.get(arrayList, 0));
        LIZ3.append("/monitor/collect/");
        arrayList4.add(X1D.LIZIZ(LIZ3));
        ArrayList<String> arrayList5 = defaultMonitorReportUrls;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("https://");
        if (arrayList.size() > 1) {
            obj2 = ListProtector.get(arrayList, 1);
        } else {
            obj2 = ListProtector.get(arrayList, 0);
        }
        LIZ4.append((String) obj2);
        LIZ4.append("/monitor/collect/");
        arrayList5.add(X1D.LIZIZ(LIZ4));
    }

    public static void setGrayConfigDomain(String str) {
        grayConfigDomain = str;
    }

    public static void setMapParams(Map<String, String> map) {
        map.put("oversea", "1");
    }
}
