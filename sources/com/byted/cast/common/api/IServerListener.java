package com.byted.cast.common.api;

import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.ServerInfo;
import com.byted.cast.common.sink.Statistics;

/* loaded from: classes29.dex */
public interface IServerListener {
    void onAudioFrame(byte[] bArr, int i, int i2, int i3, int i4, long j);

    void onAuthSDK(int i, int i2);

    void onCast(int i, CastInfo castInfo);

    void onConnect(int i, ClientInfo clientInfo);

    void onDisconnect(int i, ClientInfo clientInfo);

    void onError(int i, int i2, int i3);

    void onSinkLatencyStat(int i, String str, String str2);

    void onSinkStuckStat(int i, String str, String str2);

    void onStart(int i);

    void onStart(int i, ServerInfo serverInfo);

    boolean onStartMirrorAuthorization();

    void onStartRecorder(int i);

    void onStatistics(Statistics statistics);

    void onStop(int i);

    void onStopRecorder(int i);
}
