package com.byted.cast.sdk.core.rtc;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes29.dex */
public interface IRemoteMirrorConnector {
    void init(Context context, int i, int i2, int i3, int i4);

    void leaveRoom();

    void requestRemoteVideoKeyFrame();

    int sendAudioFrame(byte[] bArr, int i, int i2, int i3, int i4, long j);

    boolean sendVideoFrame(byte[] bArr, byte[] bArr2, int i, int i2, int i3, long j, int i4, int i5);

    boolean sendVideoImage(Bitmap bitmap);

    void setRTCCallback(IRemoteMirrorCallback iRemoteMirrorCallback);

    int sinkInitAndJoinRoom(String str, String str2, String str3, String str4);

    int sourceInitAndJoinRoom(String str, String str2, String str3, String str4);
}
