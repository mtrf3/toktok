package com.byted.cast.common.sink;

import X.X1D;
import java.util.Map;

/* loaded from: classes29.dex */
public class ServerInfo {
    public String aliasName;
    public int cloudPreemptModel;
    public String deviceName;
    public int displayMode;
    public int forceResetMirrorPlayer;
    public int language;
    public int localPreemptModel;
    public int maxFps;
    public String networkName;
    public int playerType;
    public int remotePort;
    public String resolution;
    public int serverPort;
    public int serviceStatus;
    public boolean showFps;
    public int surfaceType;
    public int remotePortMirror = -1;
    public int remotePortBDLINK = -1;
    public String protocols = "";
    public String portInfo = "";
    public long netDelay = -1;
    public String rtmpUrl = "";
    public String flvUrl = "";
    public String httpUrl = "";
    public String httpPlayUrl = "";

    public ServerInfo() {
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ServiceInfo{serviceStatus='");
        LIZ.append(this.serviceStatus);
        LIZ.append('\'');
        LIZ.append(", deviceName='");
        LIZ.append(this.deviceName);
        LIZ.append('\'');
        LIZ.append(", aliasName=");
        LIZ.append(this.aliasName);
        LIZ.append(", networkName=");
        LIZ.append(this.networkName);
        LIZ.append(", remotePort='");
        LIZ.append(this.remotePort);
        LIZ.append('\'');
        LIZ.append(", remotePortMirror='");
        LIZ.append(this.remotePortMirror);
        LIZ.append('\'');
        LIZ.append(", remotePortBDLINK='");
        LIZ.append(this.remotePortBDLINK);
        LIZ.append('\'');
        LIZ.append(", protocols=");
        LIZ.append(this.protocols);
        LIZ.append(", serverPort=");
        LIZ.append(this.serverPort);
        LIZ.append(", resolution=");
        LIZ.append(this.resolution);
        LIZ.append(", portInfo='");
        LIZ.append(this.portInfo);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public void appendPortInfo(Map<String, CallbackServerInfo> map) {
        for (Map.Entry<String, CallbackServerInfo> entry : map.entrySet()) {
            if (entry.getKey().equals("ByteLink")) {
                this.protocols = this.protocols.concat("ByteLink,");
                this.remotePortMirror = entry.getValue().serverInfo.serverPort;
            }
            if (entry.getKey().equals("BDLink")) {
                this.protocols = this.protocols.concat("BDLink,");
                this.remotePortBDLINK = entry.getValue().serverInfo.serverPort;
            }
        }
    }

    public ServerInfo(String str, String str2, int i) {
        this.deviceName = str;
        this.aliasName = str2;
        this.serverPort = i;
    }
}
