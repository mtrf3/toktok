package com.google.ar.core;

import X.V0N;
import android.util.Range;
import android.util.Size;
import com.google.ar.core.exceptions.FatalException;
import java.util.EnumSet;

/* loaded from: classes34.dex */
public class CameraConfig {
    public long nativeHandle;
    public final long nativeSymbolTableHandle;
    public final Session session;

    public CameraConfig() {
    }

    public static native void nativeDestroyCameraConfig(long j, long j2);

    private native String nativeGetCameraId(long j, long j2);

    private native int nativeGetDepthSensorUsage(long j, long j2);

    private native int nativeGetFacingDirection(long j, long j2);

    private native void nativeGetFpsRange(long j, long j2, int[] iArr);

    private native void nativeGetImageDimensions(long j, long j2, int[] iArr);

    private native int nativeGetStereoCameraUsage(long j, long j2);

    private native void nativeGetTextureDimensions(long j, long j2, int[] iArr);

    public Range<Integer> getFpsRange() {
        int[] iArr = new int[2];
        nativeGetFpsRange(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Range<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public Size getImageSize() {
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    public Size getTextureSize() {
        int[] iArr = new int[2];
        nativeGetTextureDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyCameraConfig(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public String getCameraId() {
        return nativeGetCameraId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public DepthSensorUsage getDepthSensorUsage() {
        return DepthSensorUsage.forNumber(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FacingDirection getFacingDirection() {
        return FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public StereoCameraUsage getStereoCameraUsage() {
        return StereoCameraUsage.forNumber(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    /* loaded from: classes34.dex */
    public enum DepthSensorUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);

        public final int nativeCode;

        public static EnumSet<DepthSensorUsage> forBitFlags(int i) {
            EnumSet<DepthSensorUsage> noneOf = EnumSet.noneOf(DepthSensorUsage.class);
            for (DepthSensorUsage depthSensorUsage : values()) {
                if ((depthSensorUsage.nativeCode & i) != 0) {
                    noneOf.add(depthSensorUsage);
                }
            }
            return noneOf;
        }

        public static DepthSensorUsage forNumber(int i) {
            for (DepthSensorUsage depthSensorUsage : values()) {
                if (depthSensorUsage.nativeCode == i) {
                    return depthSensorUsage;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native DepthSensorUsage, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static DepthSensorUsage valueOf(String str) {
            return (DepthSensorUsage) V0N.LJJJ(DepthSensorUsage.class, str);
        }

        DepthSensorUsage(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum FacingDirection {
        BACK(0),
        FRONT(1);

        public final int nativeCode;

        public static FacingDirection forNumber(int i) {
            for (FacingDirection facingDirection : values()) {
                if (facingDirection.nativeCode == i) {
                    return facingDirection;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native FacingDirection, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static FacingDirection valueOf(String str) {
            return (FacingDirection) V0N.LJJJ(FacingDirection.class, str);
        }

        FacingDirection(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum StereoCameraUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);

        public final int nativeCode;

        public static EnumSet<StereoCameraUsage> forBitFlags(int i) {
            EnumSet<StereoCameraUsage> noneOf = EnumSet.noneOf(StereoCameraUsage.class);
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if ((stereoCameraUsage.nativeCode & i) != 0) {
                    noneOf.add(stereoCameraUsage);
                }
            }
            return noneOf;
        }

        public static StereoCameraUsage forNumber(int i) {
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if (stereoCameraUsage.nativeCode == i) {
                    return stereoCameraUsage;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native StereoCameraUsage, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static StereoCameraUsage valueOf(String str) {
            return (StereoCameraUsage) V0N.LJJJ(StereoCameraUsage.class, str);
        }

        StereoCameraUsage(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum TargetFps {
        TARGET_FPS_30(1),
        TARGET_FPS_60(2);

        public final int nativeCode;

        public static EnumSet<TargetFps> forBitFlags(int i) {
            EnumSet<TargetFps> noneOf = EnumSet.noneOf(TargetFps.class);
            for (TargetFps targetFps : values()) {
                if ((targetFps.nativeCode & i) != 0) {
                    noneOf.add(targetFps);
                }
            }
            return noneOf;
        }

        public static TargetFps valueOf(String str) {
            return (TargetFps) V0N.LJJJ(TargetFps.class, str);
        }

        TargetFps(int i) {
            this.nativeCode = i;
        }
    }

    public CameraConfig(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
