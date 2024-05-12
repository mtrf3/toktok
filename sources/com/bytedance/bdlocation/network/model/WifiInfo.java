package com.bytedance.bdlocation.network.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes15.dex */
public class WifiInfo implements Comparable<WifiInfo> {

    @InterfaceC65349Pkn("is_current")
    public int isCurrent;

    @InterfaceC65349Pkn("rssi")
    public long rssi;

    @InterfaceC65349Pkn("Timestamp")
    public long timeStamp;

    @InterfaceC65349Pkn("wifi_mac")
    public String wifiMac;

    @InterfaceC65349Pkn("wifi_name")
    public String wifiName;

    @Override // java.lang.Comparable
    public int compareTo(WifiInfo wifiInfo) {
        return Long.compare(wifiInfo.rssi, this.rssi);
    }
}
