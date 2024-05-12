package com.byted.cast.sink.api;

import X.X1D;

/* loaded from: classes29.dex */
public class ClientInfo {
    public String clientID;
    public String icon;
    public String ip;
    public int mirrorSourceType = 101;
    public String name;
    public int sourceType;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClientInfo{clientID='");
        LIZ.append(this.clientID);
        LIZ.append('\'');
        LIZ.append(", name='");
        LIZ.append(this.name);
        LIZ.append('\'');
        LIZ.append(", ip=");
        LIZ.append(this.ip);
        LIZ.append('\'');
        LIZ.append(", icon='");
        LIZ.append(this.icon);
        LIZ.append('\'');
        LIZ.append(", sourceType=");
        LIZ.append(this.sourceType);
        LIZ.append(", mirrorSourceType=");
        LIZ.append(this.mirrorSourceType);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
