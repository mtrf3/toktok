package com.google.ar.core;

import java.util.Collection;

/* loaded from: classes34.dex */
public class TrackableBase implements Trackable {
    public long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;

    public TrackableBase(long j, Session session) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session == null ? 0L : session.nativeSymbolTableHandle;
    }

    private native long nativeCreateAnchor(long j, long j2, Pose pose);

    private native long[] nativeGetAnchors(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    public static native int nativeGetType(long j, long j2);

    public static native void nativeReleaseTrackable(long j, long j2);

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseTrackable(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.Trackable
    public Collection<Anchor> getAnchors() {
        Session session = this.session;
        return session.convertNativeAnchorsToCollection(nativeGetAnchors(session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.Trackable
    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    @Override // com.google.ar.core.Trackable
    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TrackableBase) || ((TrackableBase) obj).nativeHandle != this.nativeHandle) {
            return false;
        }
        return true;
    }

    public static int internalGetType(long j, long j2) {
        return nativeGetType(j, j2);
    }

    public static void internalReleaseNativeHandle(long j, long j2) {
        nativeReleaseTrackable(j, j2);
    }
}
