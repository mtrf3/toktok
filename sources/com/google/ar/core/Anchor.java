package com.google.ar.core;

import X.V0N;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes34.dex */
public class Anchor {
    public long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;

    public Anchor() {
    }

    private native void nativeDetach(long j, long j2);

    private native String nativeGetCloudAnchorId(long j, long j2);

    private native int nativeGetCloudAnchorState(long j, long j2);

    private native int nativeGetCloudLocalizationState(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    public static native void nativeReleaseAnchor(long j, long j2);

    public void detach() {
        nativeDetach(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseAnchor(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public String getCloudAnchorId() {
        return nativeGetCloudAnchorId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public CloudAnchorState getCloudAnchorState() {
        return CloudAnchorState.forNumber(nativeGetCloudAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CloudLocalizationState getCloudLocalizationState() {
        return CloudLocalizationState.forNumber(nativeGetCloudLocalizationState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    /* loaded from: classes34.dex */
    public enum CloudAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_SERVICE_UNAVAILABLE(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_HOSTING_DATASET_PROCESSING_FAILED(-5),
        ERROR_CLOUD_ID_NOT_FOUND(-6),
        ERROR_RESOLVING_LOCALIZATION_NO_MATCH(-7),
        ERROR_RESOLVING_SDK_VERSION_TOO_OLD(-8),
        ERROR_RESOLVING_SDK_VERSION_TOO_NEW(-9),
        ERROR_HOSTING_SERVICE_UNAVAILABLE(-10),
        ERROR_RESOLVING_LOCALIZED_TOO_FAR_AWAY(-11);

        public final int nativeCode;

        public boolean isError() {
            return this.nativeCode < 0;
        }

        public static CloudAnchorState forNumber(int i) {
            for (CloudAnchorState cloudAnchorState : values()) {
                if (cloudAnchorState.nativeCode == i) {
                    return cloudAnchorState;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native CloudAnchorState, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static CloudAnchorState valueOf(String str) {
            return (CloudAnchorState) V0N.LJJJ(CloudAnchorState.class, str);
        }

        CloudAnchorState(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum CloudLocalizationState {
        NONE(0),
        EARTH(1),
        LOCAL_MAP(2),
        LOCAL_MAP_AND_EARTH(3);

        public final int nativeCode;

        public static CloudLocalizationState forNumber(int i) {
            for (CloudLocalizationState cloudLocalizationState : values()) {
                if (cloudLocalizationState.nativeCode == i) {
                    return cloudLocalizationState;
                }
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Unexpected value for native CloudLocalizationState, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static CloudLocalizationState valueOf(String str) {
            return (CloudLocalizationState) V0N.LJJJ(CloudLocalizationState.class, str);
        }

        CloudLocalizationState(int i) {
            this.nativeCode = i;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Anchor) || ((Anchor) obj).nativeHandle != this.nativeHandle) {
            return false;
        }
        return true;
    }

    public Anchor(long j, Session session) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
