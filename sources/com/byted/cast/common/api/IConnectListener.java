package com.byted.cast.common.api;

import com.byted.cast.common.source.ServiceInfo;

/* loaded from: classes29.dex */
public interface IConnectListener {
    void onConnect(ServiceInfo serviceInfo, int i);

    void onDisconnect(ServiceInfo serviceInfo, int i, int i2);
}
