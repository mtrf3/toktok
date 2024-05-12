package com.bytedance.bae;

/* loaded from: classes17.dex */
public interface ByteAudioEventHandler {
    void onByteAudioDefaultDeviceChange(int i, String str);

    void onByteAudioDeviceStateChange(String str, int i, int i2, String str2);

    void onByteAudioEvent(int i, int i2, String str);

    void onByteAudioLogMessage(String str);

    void onByteAudioVolumeChanged(int i, int i2, boolean z, boolean z2, String str);
}
