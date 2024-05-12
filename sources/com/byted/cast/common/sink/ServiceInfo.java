package com.byted.cast.common.sink;

import X.X1D;

/* loaded from: classes29.dex */
public class ServiceInfo {
    public boolean enableVideoNativeDecode;
    public int features;
    public int fps;
    public int height;
    public String name;
    public int port;
    public int portMirror;
    public int width;
    public String ip = "";
    public String data = "";
    public String deviceID = "";
    public String bytelinkVersion = "";
    public String bdlinkVersion = "";
    public String types = "";
    public String protocols = "";

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ServiceInfo{name='");
        LIZ.append(this.name);
        LIZ.append('\'');
        LIZ.append(", ip='");
        LIZ.append("xxx.xxx.xxx.xxx");
        LIZ.append('\'');
        LIZ.append(", port=");
        LIZ.append(this.port);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(", enableVideoNativeDecode=");
        LIZ.append(this.enableVideoNativeDecode);
        LIZ.append(", portMirror=");
        LIZ.append(this.portMirror);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", fps=");
        LIZ.append(this.fps);
        LIZ.append(", features=");
        LIZ.append(this.features);
        LIZ.append(", deviceID=");
        LIZ.append(this.deviceID);
        LIZ.append(", bytelinkVersion=");
        LIZ.append(this.bytelinkVersion);
        LIZ.append(", bdlinkVersion=");
        LIZ.append(this.bdlinkVersion);
        LIZ.append(", types='");
        LIZ.append(this.types);
        LIZ.append('\'');
        LIZ.append(", protocols=");
        LIZ.append(this.protocols);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
