package com.ss.android.ugc.aweme.services.external.ability.camera;

import X.V0N;

/* loaded from: classes2.dex */
public interface IAVESCameraInterface {
    public static final int[] CameraHWLevelVE2Android = {2, 0, 1, 3};
    public static final int[] CameraHWLevelAndroid2VE = {1, 2, 0, 3};

    /* loaded from: classes2.dex */
    public static class CameraErrorCode {
    }

    /* loaded from: classes2.dex */
    public enum CameraRatio {
        RATIO_18x9,
        RATIO_16x9,
        RATIO_4x3;

        public static CameraRatio valueOf(String str) {
            return (CameraRatio) V0N.LJJJ(CameraRatio.class, str);
        }
    }
}
