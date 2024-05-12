package com.google.ar.core;

import X.V0N;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

/* loaded from: classes34.dex */
public class InstantPlacementPoint extends TrackableBase {
    private native Pose nativeGetPose(long j, long j2);

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

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    /* loaded from: classes34.dex */
    public enum TrackingMethod {
        NOT_TRACKING(0),
        SCREENSPACE_WITH_APPROXIMATE_DISTANCE(1),
        FULL_TRACKING(2);

        public final int nativeCode;

        public static TrackingMethod fromNumber(int i) {
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i) {
                    return trackingMethod;
                }
            }
            StringBuilder sb = new StringBuilder(88);
            sb.append("Unexpected value for native InstantPlacementPoint TrackingMethod Mode, value=");
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

    public InstantPlacementPoint(long j, Session session) {
        super(j, session);
    }
}
