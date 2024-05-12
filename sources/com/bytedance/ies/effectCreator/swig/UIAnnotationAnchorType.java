package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum UIAnnotationAnchorType {
    UIAnnotationAnchorType_None(0),
    UIAnnotationAnchorType_HumanFace,
    UIAnnotationAnchorType_HumanHand,
    UIAnnotationAnchorType_HumanSkeleton,
    UIAnnotationAnchorType_CatFace,
    UIAnnotationAnchorType_DogFace;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationAnchorType swigToEnum(int i) {
        UIAnnotationAnchorType[] uIAnnotationAnchorTypeArr = (UIAnnotationAnchorType[]) UIAnnotationAnchorType.class.getEnumConstants();
        if (i < uIAnnotationAnchorTypeArr.length && i >= 0) {
            UIAnnotationAnchorType uIAnnotationAnchorType = uIAnnotationAnchorTypeArr[i];
            if (uIAnnotationAnchorType.swigValue == i) {
                return uIAnnotationAnchorType;
            }
        }
        for (UIAnnotationAnchorType uIAnnotationAnchorType2 : uIAnnotationAnchorTypeArr) {
            if (uIAnnotationAnchorType2.swigValue == i) {
                return uIAnnotationAnchorType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(UIAnnotationAnchorType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static UIAnnotationAnchorType valueOf(String str) {
        return (UIAnnotationAnchorType) V0N.LJJJ(UIAnnotationAnchorType.class, str);
    }

    UIAnnotationAnchorType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationAnchorType(UIAnnotationAnchorType uIAnnotationAnchorType) {
        int i = uIAnnotationAnchorType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationAnchorType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
