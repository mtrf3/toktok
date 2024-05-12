package com.byted.cast.render.parser;

import com.byted.cast.mediacommon.render.parameters.CodecId;

/* loaded from: classes29.dex */
public class AVParser {
    public CodecId codecId;
    public IMediaParserListener listener;
    public int width = 1920;
    public int height = 1080;

    public boolean release() {
        return true;
    }

    public void sendStream(byte[] bArr) {
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setMediaParserListener(IMediaParserListener iMediaParserListener) {
        this.listener = iMediaParserListener;
    }

    public void setVideoCodecId(CodecId codecId) {
        this.codecId = codecId;
    }

    public void sendAudioPacket(byte[] bArr, long j) {
        this.listener.OnAudioPacketAvalibale(bArr, j);
    }

    public void sendVideoPacket(byte[] bArr, long j) {
        NAL nal = new NAL(bArr, bArr.length, this.codecId);
        NAL.detectNALType(nal);
        if (nal.type == 7) {
            j = 0;
        }
        this.listener.OnVideoPacketAvalibale(bArr, j);
    }
}
