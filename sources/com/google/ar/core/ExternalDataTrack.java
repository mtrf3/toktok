package com.google.ar.core;

import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes34.dex */
public class ExternalDataTrack {
    public long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;

    public ExternalDataTrack() {
    }

    public static native long nativeCreateExternalDataTrack(long j);

    public static native void nativeDestroyExternalDataTrack(long j, long j2);

    private native void nativeSetMimeType(long j, long j2, String str);

    private native void nativeSetTrackId(long j, long j2, byte[] bArr);

    private native void nativeSetTrackMetadata(long j, long j2, byte[] bArr);

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyExternalDataTrack(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public ExternalDataTrack setMimeType(String str) {
        nativeSetMimeType(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    public ExternalDataTrack setTrackMetadata(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        nativeSetTrackMetadata(this.session.nativeWrapperHandle, this.nativeHandle, bArr);
        return this;
    }

    public ExternalDataTrack(Session session, UUID uuid) {
        this.session = session;
        this.nativeHandle = nativeCreateExternalDataTrack(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        nativeSetTrackId(session.nativeWrapperHandle, this.nativeHandle, wrap.array());
    }
}
