package com.ss.avframework.livestreamv2.core.interact.audio;

import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public interface AudioSink {
    void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    void setRenderAble(boolean z);
}
