package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum AnimationType {
    AnimationType_Unknown(0),
    AnimationType_Scale,
    AnimationType_Alpha,
    AnimationType_Position,
    AnimationType_Euler;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static AnimationType swigToEnum(int i) {
        AnimationType[] animationTypeArr = (AnimationType[]) AnimationType.class.getEnumConstants();
        if (i < animationTypeArr.length && i >= 0) {
            AnimationType animationType = animationTypeArr[i];
            if (animationType.swigValue == i) {
                return animationType;
            }
        }
        for (AnimationType animationType2 : animationTypeArr) {
            if (animationType2.swigValue == i) {
                return animationType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(AnimationType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static AnimationType valueOf(String str) {
        return (AnimationType) V0N.LJJJ(AnimationType.class, str);
    }

    AnimationType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    AnimationType(AnimationType animationType) {
        int i = animationType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AnimationType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
