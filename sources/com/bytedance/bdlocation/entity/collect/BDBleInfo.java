package com.bytedance.bdlocation.entity.collect;

import X.InterfaceC65349Pkn;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class BDBleInfo implements Comparable<BDBleInfo> {

    @InterfaceC65349Pkn("beacon_uuid")
    public String beaconUuid;

    @InterfaceC65349Pkn("ble_mac")
    public String bleMac;

    @InterfaceC65349Pkn("ble_name")
    public String bleName;

    @InterfaceC65349Pkn("is_beacon")
    public boolean isBeacon;

    @InterfaceC65349Pkn("major")
    public int major;

    @InterfaceC65349Pkn("minor")
    public int minor;

    @InterfaceC65349Pkn("rssi")
    public int rssi;

    @InterfaceC65349Pkn("timestamp")
    public long timeStamp;

    public int hashCode() {
        return Arrays.hashCode(new String[]{this.bleMac});
    }

    @Override // java.lang.Comparable
    public int compareTo(BDBleInfo bDBleInfo) {
        return Long.compare(bDBleInfo.rssi, this.rssi);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.bleMac;
        String str2 = ((BDBleInfo) obj).bleMac;
        if (str == str2) {
            return true;
        }
        if (str != null && str.equals(str2)) {
            return true;
        }
        return false;
    }
}
