package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.CloudProxyInfo;

/* loaded from: classes33.dex */
public class InternalCloudProxyInfo {
    public String cloudProxyIp;
    public int cloudProxyPort;

    public String getCloudProxyIp() {
        String str = this.cloudProxyIp;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int getCloudProxyPort() {
        return this.cloudProxyPort;
    }

    public InternalCloudProxyInfo(CloudProxyInfo cloudProxyInfo) {
        this.cloudProxyIp = cloudProxyInfo.cloudProxyIp;
        this.cloudProxyPort = cloudProxyInfo.cloudProxyPort;
    }

    public InternalCloudProxyInfo(String str, int i) {
        this.cloudProxyIp = str;
        this.cloudProxyPort = i;
    }
}
