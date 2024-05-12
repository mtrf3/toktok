package com.byted.cast.sdk.core.rtc;

/* loaded from: classes29.dex */
public interface IRemoteMirrorCallback {
    void onAudioFrame(byte[] bArr, long j);

    void onJoinRoomResult(String str, String str2, int i);

    void onRequestKeyFrame();

    void onStreamAdd(String str);

    void onUserJoined(String str);

    void onUserLeave(String str, int i);

    void onVideoFrame(byte[] bArr, long j);
}
