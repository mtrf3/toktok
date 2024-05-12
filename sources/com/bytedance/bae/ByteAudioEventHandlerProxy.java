package com.bytedance.bae;

/* loaded from: classes17.dex */
public class ByteAudioEventHandlerProxy {
    public ByteAudioEventHandler handler;
    public long nativeHandlerPtr;

    public ByteAudioEventHandlerProxy(ByteAudioEventHandler byteAudioEventHandler) {
        this.handler = byteAudioEventHandler;
    }

    public void onByteAudioLogMessage(String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioLogMessage(str);
        }
    }

    public void setNativeHandler(long j) {
        this.nativeHandlerPtr = j;
    }

    public void onByteAudioDefaultDeviceChange(int i, String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioDefaultDeviceChange(i, str);
        }
    }

    public void onByteAudioEvent(int i, int i2, String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioEvent(i, i2, str);
        }
    }

    public void onByteAudioDeviceStateChange(String str, int i, int i2, String str2) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioDeviceStateChange(str, i, i2, str2);
        }
    }

    public void onByteAudioVolumeChanged(int i, int i2, boolean z, boolean z2, String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioVolumeChanged(i, i2, z, z2, str);
        }
    }
}
