package com.google.ar.core;

/* loaded from: classes34.dex */
public class Segmentation {
    public final long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;

    private native long nativeAcquirePersonMask(long j, long j2);

    private native void nativeReleaseSegmentation(long j, long j2);

    public ArImage acquirePersonMask() {
        return new ArImage(this.session, nativeAcquirePersonMask(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseSegmentation(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public Segmentation(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
