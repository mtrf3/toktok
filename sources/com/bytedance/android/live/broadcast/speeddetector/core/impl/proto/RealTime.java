package com.bytedance.android.live.broadcast.speeddetector.core.impl.proto;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;

/* loaded from: classes.dex */
public final class RealTime {

    @InterfaceC65349Pkn("download_speed")
    public Long downloadSpeed;

    @InterfaceC65349Pkn("upload_speed")
    public Long uploadSpeed;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RealTime(uploadSpeed=");
        LIZ.append(this.uploadSpeed);
        LIZ.append(", downloadSpeed=");
        return JBR.LJ(LIZ, this.downloadSpeed, ')', LIZ);
    }
}