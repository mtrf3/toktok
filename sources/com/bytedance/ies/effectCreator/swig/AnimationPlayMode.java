package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum AnimationPlayMode {
    AnimationPlayMode_Once(0),
    AnimationPlayMode_Loop;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static AnimationPlayMode swigToEnum(int i) {
        AnimationPlayMode[] animationPlayModeArr = (AnimationPlayMode[]) AnimationPlayMode.class.getEnumConstants();
        if (i < animationPlayModeArr.length && i >= 0) {
            AnimationPlayMode animationPlayMode = animationPlayModeArr[i];
            if (animationPlayMode.swigValue == i) {
                return animationPlayMode;
            }
        }
        for (AnimationPlayMode animationPlayMode2 : animationPlayModeArr) {
            if (animationPlayMode2.swigValue == i) {
                return animationPlayMode2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(AnimationPlayMode.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static AnimationPlayMode valueOf(String str) {
        return (AnimationPlayMode) V0N.LJJJ(AnimationPlayMode.class, str);
    }

    AnimationPlayMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    AnimationPlayMode(AnimationPlayMode animationPlayMode) {
        int i = animationPlayMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AnimationPlayMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
