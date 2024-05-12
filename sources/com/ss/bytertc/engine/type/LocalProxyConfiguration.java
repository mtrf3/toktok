package com.ss.bytertc.engine.type;

/* loaded from: classes33.dex */
public class LocalProxyConfiguration {
    public String localProxyIp;
    public String localProxyPassword;
    public int localProxyPort;
    public LocalProxyType localProxyType;
    public String localProxyUsername;

    public LocalProxyConfiguration(LocalProxyType localProxyType, String str, int i, String str2, String str3) {
        this.localProxyType = localProxyType;
        this.localProxyIp = str;
        this.localProxyPort = i;
        this.localProxyUsername = str2;
        this.localProxyPassword = str3;
    }
}
