package com.bytedance.bdlocation.network.model;

import X.InterfaceC65349Pkn;
import com.google.gson.g;

/* loaded from: classes15.dex */
public class DeviceLocation {

    @InterfaceC65349Pkn("base_station")
    public BaseStation baseLocation;

    @InterfaceC65349Pkn("sys_location")
    public LocationInfo sysLocation;

    @InterfaceC65349Pkn("wifi_info_list")
    public g wifiInfo;
}
