package com.byted.cast.common.sink;

/* loaded from: classes29.dex */
public interface IServerListener {
    void onConnect(int i, ClientInfo clientInfo);

    void onDisconnect(int i, ClientInfo clientInfo);

    void onError(int i, int i2, String str);

    void onStart(int i, ServerInfo serverInfo);

    void onStop(int i);
}
