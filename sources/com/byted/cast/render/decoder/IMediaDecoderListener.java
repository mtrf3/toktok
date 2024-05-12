package com.byted.cast.render.decoder;

/* loaded from: classes29.dex */
public interface IMediaDecoderListener {
    void OnAVFrameAvailable(byte[] bArr, long j);

    void OnAVFrameRendered(byte[] bArr, long j);

    void OnError(int i, String str);

    void OnVideoSizeChanged(int i, int i2, int i3, int i4, int i5);
}
