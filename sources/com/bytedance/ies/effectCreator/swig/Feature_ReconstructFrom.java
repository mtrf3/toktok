package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum Feature_ReconstructFrom {
    DraftUpgrade;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static Feature_ReconstructFrom swigToEnum(int i) {
        Feature_ReconstructFrom[] feature_ReconstructFromArr = (Feature_ReconstructFrom[]) Feature_ReconstructFrom.class.getEnumConstants();
        if (i < feature_ReconstructFromArr.length && i >= 0) {
            Feature_ReconstructFrom feature_ReconstructFrom = feature_ReconstructFromArr[i];
            if (feature_ReconstructFrom.swigValue == i) {
                return feature_ReconstructFrom;
            }
        }
        for (Feature_ReconstructFrom feature_ReconstructFrom2 : feature_ReconstructFromArr) {
            if (feature_ReconstructFrom2.swigValue == i) {
                return feature_ReconstructFrom2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(Feature_ReconstructFrom.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static Feature_ReconstructFrom valueOf(String str) {
        return (Feature_ReconstructFrom) V0N.LJJJ(Feature_ReconstructFrom.class, str);
    }

    Feature_ReconstructFrom() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    Feature_ReconstructFrom(Feature_ReconstructFrom feature_ReconstructFrom) {
        int i = feature_ReconstructFrom.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    Feature_ReconstructFrom(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
