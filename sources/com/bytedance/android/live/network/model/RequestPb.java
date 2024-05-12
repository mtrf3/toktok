package com.bytedance.android.live.network.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class RequestPb {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("pass_through_api")
    public String passThroughApi;

    @InterfaceC65349Pkn("switches")
    public String switches;

    public static RequestPb defaultInstance() {
        RequestPb requestPb = new RequestPb();
        requestPb.enable = false;
        requestPb.switches = "{}";
        requestPb.passThroughApi = "";
        return requestPb;
    }

    public String getPassThroughApi() {
        return this.passThroughApi;
    }

    public String getSwitches() {
        return this.switches;
    }

    public boolean isEnable() {
        return this.enable;
    }
}
