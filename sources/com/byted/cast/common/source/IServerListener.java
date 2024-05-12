package com.byted.cast.common.source;

import com.byted.cast.common.sink.ServerInfo;

/* loaded from: classes29.dex */
public interface IServerListener {
    void onConnect(int i, ServiceInfo serviceInfo, int i2);

    void onDisconnect(int i, ServiceInfo serviceInfo, int i2, int i3);

    void onError(int i, int i2, int i3);

    void onStart(int i, ServerInfo serverInfo);

    void onStop(int i);
}
