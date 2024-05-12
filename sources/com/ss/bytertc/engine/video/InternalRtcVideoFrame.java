package com.ss.bytertc.engine.video;

import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.mediaio.RTCVideoFrame;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class InternalRtcVideoFrame extends RTCVideoFrame {
    public final VideoFrame.Buffer buffer;
    public int colorSpace;
    public final ByteBuffer extendedData;
    public boolean isFlip;
    public final int rotation;
    public final long timestampNs;

    public InternalRtcVideoFrame(VideoFrame.Buffer buffer, ByteBuffer byteBuffer, int i, int i2, long j, boolean z) {
        super(null, byteBuffer, null, buffer.getWidth(), buffer.getHeight(), i, j, null);
        this.isFlip = false;
        this.colorSpace = 0;
        if (i % 90 == 0) {
            this.buffer_type = 2;
            this.buffer = buffer;
            this.rotation = i;
            this.colorSpace = i2;
            this.timestampNs = j;
            this.extendedData = byteBuffer;
            this.isFlip = z;
            return;
        }
        throw new IllegalArgumentException("rotation must be a multiple of 90");
    }
}
