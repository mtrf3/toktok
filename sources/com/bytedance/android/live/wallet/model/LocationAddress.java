package com.bytedance.android.live.wallet.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LocationAddress extends F9E {

    @InterfaceC65349Pkn("city")
    public LocationObject city;

    @InterfaceC65349Pkn("county")
    public LocationObject county;

    @InterfaceC65349Pkn("province")
    public LocationObject province;

    @InterfaceC65349Pkn("region")
    public LocationObject region;

    @InterfaceC65349Pkn("state")
    public LocationObject state;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.region, this.state, this.county, this.city, this.province};
    }

    public final String L() {
        String str;
        LocationObject locationObject = this.region;
        if (locationObject == null || (str = locationObject.code) == null) {
            return "";
        }
        return str;
    }

    public LocationAddress(Map<String, LocationObject> obj) {
        o.LJIIIZ(obj, "obj");
        if (obj.containsKey("region")) {
            this.region = obj.get("region");
        }
        if (obj.containsKey("state")) {
            this.state = obj.get("state");
        }
        if (obj.containsKey("county")) {
            this.county = obj.get("county");
        }
        if (obj.containsKey("city")) {
            this.city = obj.get("city");
        }
        if (obj.containsKey("province")) {
            this.province = obj.get("province");
        }
    }
}
