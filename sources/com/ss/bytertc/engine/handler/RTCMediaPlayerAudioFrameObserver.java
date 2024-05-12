package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.IMediaPlayerAudioFrameObserver;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.utils.AudioFrameImpl;
import com.ss.bytertc.engine.utils.IAudioFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes33.dex */
public class RTCMediaPlayerAudioFrameObserver {
    public IMediaPlayerAudioFrameObserver mAudioFrameObserver;

    public void setAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver) {
        this.mAudioFrameObserver = iMediaPlayerAudioFrameObserver;
    }

    public void onFrame(int i, IAudioFrame iAudioFrame) {
        IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver = this.mAudioFrameObserver;
        if (iMediaPlayerAudioFrameObserver != null) {
            iMediaPlayerAudioFrameObserver.onFrame(i, iAudioFrame);
        }
    }

    public static IAudioFrame createAudioFrameImpl(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byteBuffer.order(ByteOrder.nativeOrder());
        return new AudioFrameImpl(byteBuffer, i, AudioSampleRate.fromId(i2), AudioChannel.fromId(i3));
    }
}
