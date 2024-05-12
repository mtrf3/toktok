package com.google.ar.core;

/* loaded from: classes34.dex */
public class RecordingConfig {
    public long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;

    public RecordingConfig() {
    }

    private native void nativeAddExternalDataTrack(long j, long j2, long j3);

    public static native long nativeCreateRecordingConfig(long j);

    public static native void nativeDestroyRecordingConfig(long j, long j2);

    private native boolean nativeGetAutoStopOnPause(long j, long j2);

    private native String nativeGetMp4DatasetFilePath(long j, long j2);

    private native int nativeGetRecordingRotation(long j, long j2);

    private native void nativeSetAutoStopOnPause(long j, long j2, boolean z);

    private native void nativeSetMp4DatasetFilePath(long j, long j2, String str);

    private native void nativeSetRecordingRotation(long j, long j2, int i);

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyRecordingConfig(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public boolean getAutoStopOnPause() {
        return nativeGetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public String getMp4DatasetFilePath() {
        return nativeGetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public int getRecordingRotation() {
        return nativeGetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public RecordingConfig(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreateRecordingConfig(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public RecordingConfig addExternalDataTrack(ExternalDataTrack externalDataTrack) {
        nativeAddExternalDataTrack(this.session.nativeWrapperHandle, this.nativeHandle, externalDataTrack.nativeHandle);
        return this;
    }

    public RecordingConfig setAutoStopOnPause(boolean z) {
        nativeSetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle, z);
        return this;
    }

    public RecordingConfig setMp4DatasetFilePath(String str) {
        nativeSetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle, str);
        return this;
    }

    public RecordingConfig setRecordingRotation(int i) {
        nativeSetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle, i);
        return this;
    }
}
