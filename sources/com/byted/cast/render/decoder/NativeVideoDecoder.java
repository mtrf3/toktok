package com.byted.cast.render.decoder;

import X.C16880lQ;
import com.byted.cast.mediacommon.render.MediaRenderState;
import com.byted.cast.mediacommon.render.parameters.CodecId;

/* loaded from: classes29.dex */
public class NativeVideoDecoder implements IMediaDecoder {
    public final CodecId codecId;
    public long ffmpegDecoder;
    public boolean isRunning;
    public IMediaDecoderListener listener;
    public MediaRenderState state = MediaRenderState.STATE_UNINITIALIZED;
    public final String userId;

    private native void nativeSendPacket(long j, byte[] bArr, int i, long j2);

    private native long nativeStart();

    private native boolean nativeStop(long j);

    @Override // com.byted.cast.render.decoder.IMediaDecoder
    public boolean stop() {
        this.isRunning = false;
        if (!nativeStop(this.ffmpegDecoder)) {
            return false;
        }
        this.state = MediaRenderState.STATE_UNINITIALIZED;
        this.ffmpegDecoder = 0L;
        return true;
    }

    @Override // com.byted.cast.render.decoder.IMediaDecoder
    public boolean start() {
        try {
            C16880lQ.LLJJJIL("MediaRenderJni");
            this.ffmpegDecoder = nativeStart();
            this.state = MediaRenderState.STATE_EXECUTING;
            this.isRunning = true;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.byted.cast.render.decoder.IMediaDecoder
    public MediaRenderState getState() {
        return this.state;
    }

    @Override // com.byted.cast.render.decoder.IMediaDecoder
    public void setMediaDecoderListener(IMediaDecoderListener iMediaDecoderListener) {
        this.listener = iMediaDecoderListener;
    }

    public NativeVideoDecoder(String str, CodecId codecId) {
        this.userId = str;
        this.codecId = codecId;
    }

    public void OnAVFrameAvailable(byte[] bArr, long j) {
        IMediaDecoderListener iMediaDecoderListener = this.listener;
        if (iMediaDecoderListener != null) {
            iMediaDecoderListener.OnAVFrameAvailable(bArr, j);
        }
    }

    @Override // com.byted.cast.render.decoder.IMediaDecoder
    public boolean sendPacket(byte[] bArr, long j) {
        if (!this.isRunning) {
            return false;
        }
        long j2 = this.ffmpegDecoder;
        if (j2 != 0) {
            nativeSendPacket(j2, bArr, bArr.length, j);
            return true;
        }
        return true;
    }

    public void OnVideoSizeChanged(int i, int i2, int i3, int i4) {
        IMediaDecoderListener iMediaDecoderListener = this.listener;
        if (iMediaDecoderListener != null) {
            iMediaDecoderListener.OnVideoSizeChanged(i, i2, i3, i2, i4);
        }
    }
}
