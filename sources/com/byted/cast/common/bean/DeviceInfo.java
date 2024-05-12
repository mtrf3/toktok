package com.byted.cast.common.bean;

import X.X1D;

/* loaded from: classes29.dex */
public class DeviceInfo {
    public String appId;
    public String appName;
    public String appVersion;
    public int bdlinkCmdVersion;
    public String connectId = "";
    public String data;
    public String deviceBrand;
    public String deviceId;
    public String deviceModel;
    public String name;
    public String osVersion;
    public int ping;
    public String platform;
    public String privateChannel;
    public String sessionId;
    public boolean supportGetDeviceInfo;
    public String userId;
    public String version;

    public boolean supportPing() {
        if (this.ping == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeviceInfo{name='");
        LIZ.append(this.name);
        LIZ.append('\'');
        LIZ.append(", privateChannel='");
        LIZ.append(this.privateChannel);
        LIZ.append('\'');
        LIZ.append(", version='");
        LIZ.append(this.version);
        LIZ.append('\'');
        LIZ.append(", data='");
        LIZ.append(this.data);
        LIZ.append('\'');
        LIZ.append(", platform='");
        LIZ.append(this.platform);
        LIZ.append('\'');
        LIZ.append(", ping=");
        LIZ.append(this.ping);
        LIZ.append(", supportGetDeviceInfo=");
        LIZ.append(this.supportGetDeviceInfo);
        LIZ.append(", appName='");
        LIZ.append(this.appName);
        LIZ.append('\'');
        LIZ.append(", deviceModel='");
        LIZ.append(this.deviceModel);
        LIZ.append('\'');
        LIZ.append(", deviceBrand='");
        LIZ.append(this.deviceBrand);
        LIZ.append('\'');
        LIZ.append(", appId='");
        LIZ.append(this.appId);
        LIZ.append('\'');
        LIZ.append(", userId='");
        LIZ.append(this.userId);
        LIZ.append('\'');
        LIZ.append(", deviceId='");
        LIZ.append(this.deviceId);
        LIZ.append('\'');
        LIZ.append(", sessionId='");
        LIZ.append(this.sessionId);
        LIZ.append('\'');
        LIZ.append(", connectId='");
        LIZ.append(this.connectId);
        LIZ.append('\'');
        LIZ.append(", osVersion='");
        LIZ.append(this.osVersion);
        LIZ.append('\'');
        LIZ.append(", appVersion='");
        LIZ.append(this.appVersion);
        LIZ.append('\'');
        LIZ.append(", bdlinkCmdVersion=");
        LIZ.append(this.bdlinkCmdVersion);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
