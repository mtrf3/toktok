package com.google.ar.core;

import X.V0N;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

/* loaded from: classes34.dex */
public class Point extends TrackableBase {
    private native int nativeGetOrientationMode(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native Pose nativeGetPoseFromDistanceGuess(long j, long j2);

    private native Pose nativeGetPoseFromRealDepth(long j, long j2);

    private native int nativeGetTrackingMethod(long j, long j2);

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public Point() {
        super(0L, null);
    }

    public OrientationMode getOrientationMode() {
        return OrientationMode.fromNumber(nativeGetOrientationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getPoseFromDistanceGuess() {
        return nativeGetPoseFromDistanceGuess(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getPoseFromRealDepth() {
        return nativeGetPoseFromRealDepth(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    /* loaded from: classes34.dex */
    public enum OrientationMode {
        INITIALIZED_TO_IDENTITY(0),
        ESTIMATED_SURFACE_NORMAL(1);

        public final int nativeCode;

        public static OrientationMode fromNumber(int i) {
            for (OrientationMode orientationMode : values()) {
                if (orientationMode.nativeCode == i) {
                    return orientationMode;
                }
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Unexpected value for native Point Orientation Mode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static OrientationMode valueOf(String str) {
            return (OrientationMode) V0N.LJJJ(OrientationMode.class, str);
        }

        OrientationMode(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum TrackingMethod {
        DISTANCE_GUESS(1),
        REAL_DEPTH(2),
        DISTANCE_GUESS_AND_REAL_DEPTH(3);

        public final int nativeCode;

        public static TrackingMethod fromNumber(int i) {
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i) {
                    return trackingMethod;
                }
            }
            StringBuilder sb = new StringBuilder(72);
            sb.append("Unexpected value for native Point TrackingMethod Mode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static TrackingMethod valueOf(String str) {
            return (TrackingMethod) V0N.LJJJ(TrackingMethod.class, str);
        }

        TrackingMethod(int i) {
            this.nativeCode = i;
        }
    }

    public Point(long j, Session session) {
        super(j, session);
    }
}
