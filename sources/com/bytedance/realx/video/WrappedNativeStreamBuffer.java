package com.bytedance.realx.video;

import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.video.VideoStream;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class WrappedNativeStreamBuffer implements VideoStream.Buffer {
    public final ByteBuffer data;
    public final long nativeBuffer;
    public final int size;

    @Override // com.bytedance.realx.video.VideoStream.Buffer
    public ByteBuffer getData() {
        return this.data.slice();
    }

    @Override // com.bytedance.realx.video.VideoStream.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // com.bytedance.realx.video.VideoStream.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }

    @Override // com.bytedance.realx.video.VideoStream.Buffer
    public int getDataSize() {
        return this.size;
    }

    public WrappedNativeStreamBuffer(int i, ByteBuffer byteBuffer, long j) {
        this.size = i;
        this.data = byteBuffer;
        this.nativeBuffer = j;
        retain();
    }
}
