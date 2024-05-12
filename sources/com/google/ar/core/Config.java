package com.google.ar.core;

import X.V0N;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes34.dex */
public class Config {
    public long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;

    public Config() {
    }

    public static native long nativeCreate(long j);

    public static native void nativeDestroy(long j, long j2);

    private native int nativeGetAugmentedFaceMode(long j, long j2);

    private native long nativeGetAugmentedImageDatabase(long j, long j2);

    private native int nativeGetCloudAnchorMode(long j, long j2);

    private native int nativeGetDepthMode(long j, long j2);

    private native int nativeGetDepthModePrivate(long j, long j2);

    private native int nativeGetFocusMode(long j, long j2);

    private native int nativeGetInstantPlacementMode(long j, long j2);

    private native int nativeGetInstantPlacementModePrivate(long j, long j2);

    private native int nativeGetLightEstimationMode(long j, long j2);

    private native int nativeGetPlaneFindingMode(long j, long j2);

    private native int nativeGetSegmentationMode(long j, long j2);

    private native int nativeGetUpdateMode(long j, long j2);

    private native void nativeSetAugmentedFaceMode(long j, long j2, int i);

    private native void nativeSetAugmentedImageDatabase(long j, long j2, long j3);

    private native void nativeSetCloudAnchorMode(long j, long j2, int i);

    private native void nativeSetDepthMode(long j, long j2, int i);

    private native void nativeSetDepthModePrivate(long j, long j2, int i);

    private native void nativeSetFocusMode(long j, long j2, int i);

    private native void nativeSetInstantPlacementMode(long j, long j2, int i);

    private native void nativeSetInstantPlacementModePrivate(long j, long j2, int i);

    private native void nativeSetLightEstimationMode(long j, long j2, int i);

    private native void nativeSetPlaneFindingMode(long j, long j2, int i);

    private native void nativeSetSegmentationMode(long j, long j2, int i);

    private native void nativeSetUpdateMode(long j, long j2, int i);

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public AugmentedFaceMode getAugmentedFaceMode() {
        return AugmentedFaceMode.forNumber(nativeGetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedImageDatabase getAugmentedImageDatabase() {
        return new AugmentedImageDatabase(this.session, nativeGetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CloudAnchorMode getCloudAnchorMode() {
        return CloudAnchorMode.forNumber(nativeGetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public DepthMode getDepthMode() {
        return DepthMode.forNumber(nativeGetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public DepthMode getDepthModePrivate() {
        return DepthMode.forNumber(nativeGetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FocusMode getFocusMode() {
        return FocusMode.forNumber(nativeGetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public InstantPlacementMode getInstantPlacementMode() {
        return InstantPlacementMode.forNumber(nativeGetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public InstantPlacementMode getInstantPlacementModePrivate() {
        return InstantPlacementMode.forNumber(nativeGetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public LightEstimationMode getLightEstimationMode() {
        return LightEstimationMode.forNumber(nativeGetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public PlaneFindingMode getPlaneFindingMode() {
        return PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public SegmentationMode getSegmentationMode() {
        return SegmentationMode.forNumber(nativeGetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public UpdateMode getUpdateMode() {
        return UpdateMode.forNumber(nativeGetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    /* loaded from: classes34.dex */
    public enum AugmentedFaceMode {
        DISABLED(0),
        MESH3D(2),
        MESH3D_IMPROVED_LIP_EYE(401),
        MESH3D_IMPROVED_EYE(405),
        MESH3D_FRONT_OR_BACK_PARTNER(418);

        public final int nativeCode;

        public static AugmentedFaceMode forNumber(int i) {
            for (AugmentedFaceMode augmentedFaceMode : values()) {
                if (augmentedFaceMode.nativeCode == i) {
                    return augmentedFaceMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AugmentedFaceMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static AugmentedFaceMode valueOf(String str) {
            return (AugmentedFaceMode) V0N.LJJJ(AugmentedFaceMode.class, str);
        }

        AugmentedFaceMode(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum CloudAnchorMode {
        DISABLED(0),
        ENABLED(1),
        ENABLED_WITH_EARTH_LOCALIZATION(2);

        public final int nativeCode;

        public static CloudAnchorMode forNumber(int i) {
            for (CloudAnchorMode cloudAnchorMode : values()) {
                if (cloudAnchorMode.nativeCode == i) {
                    return cloudAnchorMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AnchorHostingMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static CloudAnchorMode valueOf(String str) {
            return (CloudAnchorMode) V0N.LJJJ(CloudAnchorMode.class, str);
        }

        CloudAnchorMode(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum DepthMode {
        DISABLED(0),
        AUTOMATIC(1),
        ALWAYS_ENABLED(4),
        RAW_DEPTH_ONLY(3);

        public final int nativeCode;

        public static DepthMode forNumber(int i) {
            for (DepthMode depthMode : values()) {
                if (depthMode.nativeCode == i) {
                    return depthMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native DepthMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static DepthMode valueOf(String str) {
            return (DepthMode) V0N.LJJJ(DepthMode.class, str);
        }

        DepthMode(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum FocusMode {
        FIXED(0),
        AUTO(1);

        public final int nativeCode;

        public static FocusMode forNumber(int i) {
            for (FocusMode focusMode : values()) {
                if (focusMode.nativeCode == i) {
                    return focusMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native FocusMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static FocusMode valueOf(String str) {
            return (FocusMode) V0N.LJJJ(FocusMode.class, str);
        }

        FocusMode(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum InstantPlacementMode {
        DISABLED(0),
        ENABLED(1),
        LOCAL_Y_UP(2);

        public final int nativeCode;

        public static InstantPlacementMode forNumber(int i) {
            for (InstantPlacementMode instantPlacementMode : values()) {
                if (instantPlacementMode.nativeCode == i) {
                    return instantPlacementMode;
                }
            }
            StringBuilder sb = new StringBuilder(67);
            sb.append("Unexpected value for native InstantPlacementMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static InstantPlacementMode valueOf(String str) {
            return (InstantPlacementMode) V0N.LJJJ(InstantPlacementMode.class, str);
        }

        InstantPlacementMode(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum LightEstimationMode {
        DISABLED(0),
        AMBIENT_INTENSITY(1),
        ENVIRONMENTAL_HDR(2);

        public final int nativeCode;

        public static LightEstimationMode forNumber(int i) {
            for (LightEstimationMode lightEstimationMode : values()) {
                if (lightEstimationMode.nativeCode == i) {
                    return lightEstimationMode;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native LightEstimationMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static LightEstimationMode valueOf(String str) {
            return (LightEstimationMode) V0N.LJJJ(LightEstimationMode.class, str);
        }

        LightEstimationMode(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum PlaneFindingMode {
        DISABLED(0),
        HORIZONTAL(1),
        VERTICAL(2),
        HORIZONTAL_AND_VERTICAL(3),
        HORIZONTAL_AND_VERTICAL_LOW_FEATURE_GROWTH(4);

        public final int nativeCode;

        public static PlaneFindingMode forNumber(int i) {
            for (PlaneFindingMode planeFindingMode : values()) {
                if (planeFindingMode.nativeCode == i) {
                    return planeFindingMode;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native PlaneFindingMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static PlaneFindingMode valueOf(String str) {
            return (PlaneFindingMode) V0N.LJJJ(PlaneFindingMode.class, str);
        }

        PlaneFindingMode(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum SegmentationMode {
        DISABLED(0),
        PEOPLE(6);

        public final int nativeCode;

        public static SegmentationMode forNumber(int i) {
            for (SegmentationMode segmentationMode : values()) {
                if (segmentationMode.nativeCode == i) {
                    return segmentationMode;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native SegmentationMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static SegmentationMode valueOf(String str) {
            return (SegmentationMode) V0N.LJJJ(SegmentationMode.class, str);
        }

        SegmentationMode(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum UpdateMode {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);

        public final int nativeCode;

        public static UpdateMode forNumber(int i) {
            for (UpdateMode updateMode : values()) {
                if (updateMode.nativeCode == i) {
                    return updateMode;
                }
            }
            StringBuilder sb = new StringBuilder(57);
            sb.append("Unexpected value for native UpdateMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static UpdateMode valueOf(String str) {
            return (UpdateMode) V0N.LJJJ(UpdateMode.class, str);
        }

        UpdateMode(int i) {
            this.nativeCode = i;
        }
    }

    public Config(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreate(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public Config setAugmentedFaceMode(AugmentedFaceMode augmentedFaceMode) {
        nativeSetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedFaceMode.nativeCode);
        return this;
    }

    public Config setAugmentedImageDatabase(AugmentedImageDatabase augmentedImageDatabase) {
        long j;
        long j2 = this.session.nativeWrapperHandle;
        long j3 = this.nativeHandle;
        if (augmentedImageDatabase == null) {
            j = 0;
        } else {
            j = augmentedImageDatabase.nativeHandle;
        }
        nativeSetAugmentedImageDatabase(j2, j3, j);
        return this;
    }

    public Config setCloudAnchorMode(CloudAnchorMode cloudAnchorMode) {
        nativeSetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle, cloudAnchorMode.nativeCode);
        return this;
    }

    public Config setDepthMode(DepthMode depthMode) {
        nativeSetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        return this;
    }

    public Config setDepthModePrivate(DepthMode depthMode) {
        nativeSetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        return this;
    }

    public Config setFocusMode(FocusMode focusMode) {
        nativeSetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle, focusMode.nativeCode);
        return this;
    }

    public Config setInstantPlacementMode(InstantPlacementMode instantPlacementMode) {
        nativeSetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        return this;
    }

    public Config setInstantPlacementModePrivate(InstantPlacementMode instantPlacementMode) {
        nativeSetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        return this;
    }

    public Config setLightEstimationMode(LightEstimationMode lightEstimationMode) {
        nativeSetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle, lightEstimationMode.nativeCode);
        return this;
    }

    public Config setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        nativeSetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle, planeFindingMode.nativeCode);
        return this;
    }

    public Config setSegmentationMode(SegmentationMode segmentationMode) {
        nativeSetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle, segmentationMode.nativeCode);
        return this;
    }

    public Config setUpdateMode(UpdateMode updateMode) {
        nativeSetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, updateMode.nativeCode);
        return this;
    }

    public Config(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
