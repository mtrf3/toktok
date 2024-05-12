package com.bytedance.realx.video;

import X.C90012ZUi;
import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.video.RGBABuffer;
import com.bytedance.realx.video.VideoFrame;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class RGBABuffer implements VideoFrame.Buffer {
    public final ByteBuffer buffer_;
    public final int height_;
    public final RefCountDelegate refCountDelegate = new RefCountDelegate(new Runnable() { // from class: X.ZUY
        @Override // java.lang.Runnable
        public final void run() {
            RGBABuffer.this.lambda$new$0();
        }
    });
    public final int stride_;
    public final int width_;

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getBufferType() {
        return -1;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return null;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return C90012ZUi.LIZ(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        JniCommon.nativeFreeByteBuffer(this.buffer_);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    public ByteBuffer getBuffer() {
        return this.buffer_;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height_;
    }

    public int getStride() {
        return this.stride_;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width_;
    }

    public RGBABuffer(int i, int i2, int i3, ByteBuffer byteBuffer) {
        this.width_ = i;
        this.height_ = i2;
        this.stride_ = i3;
        this.buffer_ = byteBuffer;
    }
}
