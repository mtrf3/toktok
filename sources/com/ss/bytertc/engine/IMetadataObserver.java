package com.ss.bytertc.engine;

/* loaded from: classes33.dex */
public interface IMetadataObserver {
    void onMetadataReceived(byte[] bArr, String str, long j);

    byte[] onReadyToSendMetadata(long j);
}
