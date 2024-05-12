package com.bytedance.android.live.broadcast.speeddetector.core.impl.proto;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.q;

/* loaded from: classes.dex */
public final class InitData {

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene = "";

    @InterfaceC65349Pkn("user_id")
    public String userId = "";

    @InterfaceC65349Pkn("device_id")
    public String deviceId = "";

    @InterfaceC65349Pkn("os_version")
    public String osVersion = "";

    @InterfaceC65349Pkn("device_type")
    public String deviceType = "";

    @InterfaceC65349Pkn("network")
    public String network = "";

    @InterfaceC65349Pkn("sign")
    public String sign = "";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InitData(scene='");
        LIZ.append(this.scene);
        LIZ.append("', userId=");
        LIZ.append(this.userId);
        LIZ.append(", deviceId=");
        LIZ.append(this.deviceId);
        LIZ.append(", osVersion=");
        LIZ.append(this.osVersion);
        LIZ.append(", deviceType=");
        LIZ.append(this.deviceType);
        LIZ.append(", network=");
        LIZ.append(this.network);
        LIZ.append(", sign=");
        return q.LIZIZ(LIZ, this.sign, ')', LIZ);
    }
}
