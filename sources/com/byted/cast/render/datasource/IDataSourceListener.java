package com.byted.cast.render.datasource;

/* loaded from: classes29.dex */
public interface IDataSourceListener {
    void onAudioPacketAvailable(byte[] bArr, long j);

    void onVideoPacketAvailable(byte[] bArr, long j);
}
