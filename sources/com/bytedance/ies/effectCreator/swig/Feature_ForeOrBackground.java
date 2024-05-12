package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum Feature_ForeOrBackground {
    Unsupport_ForeOrBackground,
    Feature_Foreground,
    Feature_Background;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static Feature_ForeOrBackground swigToEnum(int i) {
        Feature_ForeOrBackground[] feature_ForeOrBackgroundArr = (Feature_ForeOrBackground[]) Feature_ForeOrBackground.class.getEnumConstants();
        if (i < feature_ForeOrBackgroundArr.length && i >= 0) {
            Feature_ForeOrBackground feature_ForeOrBackground = feature_ForeOrBackgroundArr[i];
            if (feature_ForeOrBackground.swigValue == i) {
                return feature_ForeOrBackground;
            }
        }
        for (Feature_ForeOrBackground feature_ForeOrBackground2 : feature_ForeOrBackgroundArr) {
            if (feature_ForeOrBackground2.swigValue == i) {
                return feature_ForeOrBackground2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(Feature_ForeOrBackground.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static Feature_ForeOrBackground valueOf(String str) {
        return (Feature_ForeOrBackground) V0N.LJJJ(Feature_ForeOrBackground.class, str);
    }

    Feature_ForeOrBackground() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    Feature_ForeOrBackground(Feature_ForeOrBackground feature_ForeOrBackground) {
        int i = feature_ForeOrBackground.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    Feature_ForeOrBackground(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
