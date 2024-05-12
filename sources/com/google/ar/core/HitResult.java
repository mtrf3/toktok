package com.google.ar.core;

/* loaded from: classes34.dex */
public class HitResult {
    public long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;

    public HitResult() {
    }

    private native long nativeCreateAnchor(long j, long j2);

    public static native void nativeDestroyHitResult(long j, long j2);

    private native float nativeGetDistance(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    public native long nativeAcquireTrackable(long j, long j2);

    public Anchor createAnchor() {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyHitResult(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public float getDistance() {
        return nativeGetDistance(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getHitPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Trackable getTrackable() {
        return this.session.createTrackable(nativeAcquireTrackable(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HitResult) || ((HitResult) obj).nativeHandle != this.nativeHandle) {
            return false;
        }
        return true;
    }

    public HitResult(long j, Session session) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
