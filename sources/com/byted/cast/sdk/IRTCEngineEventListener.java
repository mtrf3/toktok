package com.byted.cast.sdk;

import com.byted.cast.sdk.RTCEngine;

/* loaded from: classes29.dex */
public interface IRTCEngineEventListener {
    void OnVideoSizeChanged(String str, int i, int i2, int i3);

    void onAudioSetVolume(String str, float f, float f2);

    void onCancelRequest(String str);

    void onCancelSuccess();

    void onCastControl(int i, int i2);

    boolean onCastRequest(String str, String str2);

    void onCastSuccess();

    void onConnect(String str, String str2);

    void onConnectStateChanged(RTCEngine.ConnectState connectState);

    void onConnectSuccess(int i, int i2, int i3);

    void onDisconnect(RTCEngine.ExitReason exitReason, String str);

    void onDisconnect(String str, RTCEngine.ExitReason exitReason, String str2);

    void onError(int i, String str);

    void onFirstVideoFrame(String str);

    void onIntoBackground(String str);

    void onIntoForeground(String str);

    void onKilled();

    void onLogMonitor(String str, String[][] strArr);

    void onMonitorEvent(String str, String str2);

    void onPaused();

    void onRecvMetaData(String str);

    void onRecvMetaData(String str, String str2);

    void onResumed();

    void onSinkLatencyStat(String str, String str2);

    void onSinkStuckStat(String str, String str2);

    void onStat(String str);

    void onStopped();

    void onStuckStat(String str);
}
