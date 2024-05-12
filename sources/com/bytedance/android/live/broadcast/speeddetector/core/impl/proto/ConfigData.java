package com.bytedance.android.live.broadcast.speeddetector.core.impl.proto;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.b0;

/* loaded from: classes.dex */
public final class ConfigData {

    @InterfaceC65349Pkn("ack_id")
    public int ackId;

    @InterfaceC65349Pkn("close_wait")
    public long closeWait;

    @InterfaceC65349Pkn("max_common_byte")
    public int maxCommonByte;

    @InterfaceC65349Pkn("max_package")
    public long maxPackage;

    @InterfaceC65349Pkn("send_byte")
    public int sendByte;

    @InterfaceC65349Pkn("send_duration")
    public long sendDuration;

    @InterfaceC65349Pkn("status")
    public long status;

    @InterfaceC65349Pkn("wait_duration")
    public long waitDuration;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene = "";

    @InterfaceC65349Pkn("session_id")
    public String sessionId = "";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConfigData(ackId=");
        LIZ.append(this.ackId);
        LIZ.append(", scene='");
        LIZ.append(this.scene);
        LIZ.append("', maxPackage=");
        LIZ.append(this.maxPackage);
        LIZ.append(", sendByte=");
        LIZ.append(this.sendByte);
        LIZ.append(", sendDuration=");
        LIZ.append(this.sendDuration);
        LIZ.append(", waitDuration=");
        LIZ.append(this.waitDuration);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", sessionId='");
        LIZ.append(this.sessionId);
        LIZ.append("', closeWait=");
        LIZ.append(this.closeWait);
        LIZ.append(", maxCommonByte=");
        return b0.LIZJ(LIZ, this.maxCommonByte, ')', LIZ);
    }
}
