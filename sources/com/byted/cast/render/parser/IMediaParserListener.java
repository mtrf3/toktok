package com.byted.cast.render.parser;

/* loaded from: classes29.dex */
public interface IMediaParserListener {
    void OnAudioPacketAvalibale(byte[] bArr, long j);

    void OnError(String str);

    void OnVideoPacketAvalibale(byte[] bArr, long j);

    void OnVideoParamtersChanged(int i, int i2);
}
