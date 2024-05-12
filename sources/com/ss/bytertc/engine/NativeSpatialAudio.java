package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.ISpatialAudio;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Orientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.PositionInfo;
import com.ss.bytertc.engine.utils.LogUtil;

/* loaded from: classes33.dex */
public class NativeSpatialAudio implements ISpatialAudio {
    public long mNaiveInstance;

    public static native void nativeDisableRemoteOrientation(long j);

    public static native void nativeEnableSpatialAudio(long j, boolean z);

    public static native int nativeRemoveAllRemotePosition(long j);

    public static native int nativeRemoveRemotePosition(long j, String str);

    public static native int nativeUpdateListenerOrientation(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9);

    public static native int nativeUpdateListenerPosition(long j, float f, float f2, float f3);

    public static native int nativeUpdatePosition(long j, float f, float f2, float f3);

    public static native int nativeUpdateRemotePosition(long j, String str, PositionInfo positionInfo);

    public static native int nativeUpdateSelfOrientation(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9);

    public static native int nativeUpdateSelfPosition(long j, PositionInfo positionInfo);

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public void disableRemoteOrientation() {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, disableRemoteOrientation failed.");
        } else {
            nativeDisableRemoteOrientation(j);
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int removeAllRemotePosition() {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, updatePosition failed.");
            return -1;
        }
        return nativeRemoveAllRemotePosition(j);
    }

    public NativeSpatialAudio(long j) {
        this.mNaiveInstance = j;
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public void enableSpatialAudio(boolean z) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, enableSpatialAudio failed.");
        } else {
            nativeEnableSpatialAudio(j, z);
        }
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int removeRemotePosition(String str) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, updatePosition failed.");
            return -1;
        }
        return nativeRemoveRemotePosition(j, str);
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateListenerOrientation(HumanOrientation humanOrientation) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, updateListenerOrientation failed.");
            return -1;
        }
        Orientation orientation = humanOrientation.forward;
        float f = orientation.x;
        float f2 = orientation.y;
        float f3 = orientation.z;
        Orientation orientation2 = humanOrientation.right;
        float f4 = orientation2.x;
        float f5 = orientation2.y;
        float f6 = orientation2.z;
        Orientation orientation3 = humanOrientation.up;
        return nativeUpdateListenerOrientation(j, f, f2, f3, f4, f5, f6, orientation3.x, orientation3.y, orientation3.z);
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateListenerPosition(Position position) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, updateListenerPosition failed.");
            return -1;
        }
        return nativeUpdateListenerPosition(j, position.x, position.y, position.z);
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updatePosition(Position position) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, updatePosition failed.");
            return -1;
        }
        return nativeUpdatePosition(j, position.x, position.y, position.z);
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateSelfOrientation(HumanOrientation humanOrientation) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, updateSelfOrientation failed.");
            return -1;
        }
        Orientation orientation = humanOrientation.forward;
        float f = orientation.x;
        float f2 = orientation.y;
        float f3 = orientation.z;
        Orientation orientation2 = humanOrientation.right;
        float f4 = orientation2.x;
        float f5 = orientation2.y;
        float f6 = orientation2.z;
        Orientation orientation3 = humanOrientation.up;
        return nativeUpdateSelfOrientation(j, f, f2, f3, f4, f5, f6, orientation3.x, orientation3.y, orientation3.z);
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateSelfPosition(PositionInfo positionInfo) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, updatePosition failed.");
            return -1;
        }
        return nativeUpdateSelfPosition(j, positionInfo);
    }

    @Override // com.ss.bytertc.engine.audio.ISpatialAudio
    public int updateRemotePosition(String str, PositionInfo positionInfo) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeSpatialAudio", "native SpatialAudio is invalid, updatePosition failed.");
            return -1;
        }
        return nativeUpdateRemotePosition(j, str, positionInfo);
    }
}
