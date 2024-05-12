package com.google.ar.core;

import X.V0N;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes34.dex */
public class Camera {
    public long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;

    public Camera() {
    }

    public static native long nativeAcquireCamera(long j, long j2);

    private native long nativeCreateCameraIntrinsics(long j);

    private native Pose nativeDisplayOrientedPose(long j, long j2);

    public static native int nativeGetEarthLocalizationState(long j, long j2);

    private native void nativeGetImageIntrinsics(long j, long j2, long j3);

    private native Pose nativeGetPose(long j, long j2);

    private native void nativeGetProjectionMatrix(long j, long j2, float[] fArr, int i, float f, float f2);

    private native void nativeGetTextureIntrinsics(long j, long j2, long j3);

    private native int nativeGetTrackingFailureReason(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeGetViewMatrix(long j, long j2, float[] fArr, int i);

    public static native void nativeReleaseCamera(long j, long j2);

    public CameraIntrinsics getImageIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetImageIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    public CameraIntrinsics getTextureIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetTextureIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseCamera(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public Pose getDisplayOrientedPose() {
        return nativeDisplayOrientedPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public EarthLocalizationState getEarthLocalizationState() {
        return EarthLocalizationState.forNumber(nativeGetEarthLocalizationState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingFailureReason getTrackingFailureReason() {
        return TrackingFailureReason.forNumber(nativeGetTrackingFailureReason(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    /* loaded from: classes34.dex */
    public enum EarthLocalizationState {
        NOT_LOCALIZED(0),
        LOCALIZED(1),
        UNAVAILABLE(2);

        public final int nativeCode;

        public static EarthLocalizationState forNumber(int i) {
            for (EarthLocalizationState earthLocalizationState : values()) {
                if (earthLocalizationState.nativeCode == i) {
                    return earthLocalizationState;
                }
            }
            StringBuilder sb = new StringBuilder(71);
            sb.append("Unexpected value for native ArEarthLocalizationState, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static EarthLocalizationState valueOf(String str) {
            return (EarthLocalizationState) V0N.LJJJ(EarthLocalizationState.class, str);
        }

        EarthLocalizationState(int i) {
            this.nativeCode = i;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Camera) || ((Camera) obj).nativeHandle != this.nativeHandle) {
            return false;
        }
        return true;
    }

    public Camera(Session session, Frame frame) {
        this.session = session;
        this.nativeHandle = nativeAcquireCamera(session.nativeWrapperHandle, frame.nativeHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public void getViewMatrix(float[] fArr, int i) {
        nativeGetViewMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
    }

    public void getProjectionMatrix(float[] fArr, int i, float f, float f2) {
        nativeGetProjectionMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i, f, f2);
    }
}
