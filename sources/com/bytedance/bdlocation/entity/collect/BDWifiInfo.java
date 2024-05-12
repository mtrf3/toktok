package com.bytedance.bdlocation.entity.collect;

import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes2.dex */
public class BDWifiInfo {

    @InterfaceC65349Pkn("BSSID")
    public String bssid;

    @InterfaceC65349Pkn("channel")
    public int channel;

    @InterfaceC65349Pkn("isCurrent")
    public boolean isCurrent;

    @InterfaceC65349Pkn("RSSI")
    public int rssi;

    @InterfaceC65349Pkn("SSID")
    public String ssid;

    @InterfaceC65349Pkn("Timestamp")
    public long timeStamp;

    public int hashCode() {
        String str = this.bssid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WifiInfo{bssid='");
        Q89.LIZIZ(LIZ, this.bssid, '\'', ", channel='");
        LIZ.append(this.channel);
        LIZ.append('\'');
        LIZ.append(", isCurrent=");
        LIZ.append(this.isCurrent);
        LIZ.append(", rssi=");
        LIZ.append(this.rssi);
        LIZ.append(", ssid='");
        Q89.LIZIZ(LIZ, this.ssid, '\'', ", timeStamp='");
        LIZ.append(this.timeStamp);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getBssid() {
        return this.bssid;
    }

    public int getChannel() {
        return this.channel;
    }

    public int getRssi() {
        return this.rssi;
    }

    public String getSsid() {
        return this.ssid;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public boolean isCurrent() {
        return this.isCurrent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.bssid;
        String str2 = ((BDWifiInfo) obj).bssid;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public BDWifiInfo setBssid(String str) {
        this.bssid = str;
        return this;
    }

    public BDWifiInfo setChannel(int i) {
        this.channel = i;
        return this;
    }

    public BDWifiInfo setCurrent(boolean z) {
        this.isCurrent = z;
        return this;
    }

    public BDWifiInfo setRssi(int i) {
        this.rssi = i;
        return this;
    }

    public BDWifiInfo setSsid(String str) {
        this.ssid = str;
        return this;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}
