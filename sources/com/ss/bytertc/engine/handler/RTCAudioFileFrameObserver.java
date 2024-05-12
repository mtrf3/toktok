package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.IAudioFileFrameObserver;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.utils.AudioFrameImpl;
import com.ss.bytertc.engine.utils.IAudioFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes33.dex */
public class RTCAudioFileFrameObserver {
    public IAudioFileFrameObserver mAudioFileFrameObserver;

    public void setAudioFileFrameObserver(IAudioFileFrameObserver iAudioFileFrameObserver) {
        this.mAudioFileFrameObserver = iAudioFileFrameObserver;
    }

    public void onAudioFileFrame(int i, IAudioFrame iAudioFrame) {
        IAudioFileFrameObserver iAudioFileFrameObserver = this.mAudioFileFrameObserver;
        if (iAudioFileFrameObserver != null) {
            iAudioFileFrameObserver.onAudioFileFrame(i, iAudioFrame);
        }
    }

    public static IAudioFrame createAudioFrameImpl(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byteBuffer.order(ByteOrder.nativeOrder());
        return new AudioFrameImpl(byteBuffer, i, AudioSampleRate.fromId(i2), AudioChannel.fromId(i3));
    }
}
