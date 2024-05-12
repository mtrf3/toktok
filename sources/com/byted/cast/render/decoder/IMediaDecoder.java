package com.byted.cast.render.decoder;

import com.byted.cast.mediacommon.render.MediaRenderState;

/* loaded from: classes29.dex */
public interface IMediaDecoder {
    MediaRenderState getState();

    boolean sendPacket(byte[] bArr, long j);

    void setMediaDecoderListener(IMediaDecoderListener iMediaDecoderListener);

    boolean start();

    boolean stop();
}
