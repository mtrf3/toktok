package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum FeatureType {
    FeatureType_Unknown(0),
    FeatureType_Body,
    FeatureType_Foreground2D,
    FeatureType_Background2D,
    FeatureType_FaceInset,
    FeatureType_Filter,
    FeatureType_FaceDistortion,
    FeatureType_FaceLiquify,
    FeatureType_HairColor,
    FeatureType_Makeup,
    FeatureType_Gan,
    FeatureType_PostProcess,
    FeatureType_LegacyFeature,
    FeatureType_Face3DSticker;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static FeatureType swigToEnum(int i) {
        FeatureType[] featureTypeArr = (FeatureType[]) FeatureType.class.getEnumConstants();
        if (i < featureTypeArr.length && i >= 0) {
            FeatureType featureType = featureTypeArr[i];
            if (featureType.swigValue == i) {
                return featureType;
            }
        }
        for (FeatureType featureType2 : featureTypeArr) {
            if (featureType2.swigValue == i) {
                return featureType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(FeatureType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static FeatureType valueOf(String str) {
        return (FeatureType) V0N.LJJJ(FeatureType.class, str);
    }

    FeatureType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    FeatureType(FeatureType featureType) {
        int i = featureType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    FeatureType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
