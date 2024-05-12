package com.byted.cast.sink.api;

/* loaded from: classes29.dex */
public interface IServerListener {
    void onCast(int i, CastInfo castInfo);

    void onConnect(int i, ClientInfo clientInfo);

    void onDisconnect(int i, ClientInfo clientInfo);

    void onError(int i, int i2, int i3, String str);

    void onFirstVideoFrame(String str);

    void onMonitorEvent(String str, String str2);

    void onRecvMetaData(int i, ClientInfo clientInfo, String str);

    void onSinkLatencyStat(int i, String str, String str2);

    void onSinkStuckStat(int i, String str, String str2);

    void onStart(int i, ServerInfo serverInfo);

    void onStop(int i);
}
