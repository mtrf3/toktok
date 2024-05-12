package com.bytedance.realx.video;

import com.bytedance.realx.base.RefCounted;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class VideoStream implements RefCounted {
    public final Buffer buffer;
    public final int height;
    public final int width;

    /* loaded from: classes33.dex */
    public interface Buffer extends RefCounted {
        ByteBuffer getData();

        int getDataSize();

        @Override // com.bytedance.realx.base.RefCounted
        void release();

        @Override // com.bytedance.realx.base.RefCounted
        void retain();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public VideoStream(Buffer buffer, int i, int i2) {
        this.buffer = buffer;
        this.width = i;
        this.height = i2;
    }
}
